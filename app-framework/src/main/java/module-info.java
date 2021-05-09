/**
 * @author blog.unclezs.com
 * @date 2021/04/03 17:27
 */
open module com.unclezs.novel.app.framework {
  // core
  requires novel.analyzer;
  // openjfx
  requires transitive javafx.graphics;
  requires transitive javafx.controls;
  requires transitive javafx.fxml;
  requires transitive com.jfoenix;
  // hutool
  requires hutool.cache;
  requires hutool.core;

  requires static lombok;

  requires jkeymaster;
  requires com.google.gson;
  requires transitive java.desktop;
  requires org.slf4j;

  exports com.unclezs.novel.app.framework.core;
  // components
  exports com.unclezs.novel.app.framework.components;
  exports com.unclezs.novel.app.framework.components.icon;
  exports com.unclezs.novel.app.framework.components.sidebar;

  exports com.unclezs.novel.app.framework.util;
  exports com.unclezs.novel.app.framework.executor;
  exports com.unclezs.novel.app.framework.appication;
  exports com.unclezs.novel.app.framework.annotation;
  exports com.unclezs.novel.app.framework.animation;
  exports com.unclezs.novel.app.framework.collection;
  exports com.unclezs.novel.app.framework.exception;
  exports com.unclezs.novel.app.framework.serialize;
  exports com.unclezs.novel.app.framework.support;
  exports com.unclezs.novel.app.framework.support.hotkey;
  exports com.unclezs.novel.app.framework.components.cell;
}