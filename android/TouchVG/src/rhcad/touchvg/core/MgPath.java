/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class MgPath {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MgPath(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MgPath obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_MgPath(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MgPath() {
    this(touchvgJNI.new_MgPath__SWIG_0(), true);
  }

  public MgPath(MgPath src) {
    this(touchvgJNI.new_MgPath__SWIG_1(MgPath.getCPtr(src), src), true);
  }

  public MgPath(int count, Point2d points, String types) {
    this(touchvgJNI.new_MgPath__SWIG_2(count, Point2d.getCPtr(points), points, types), true);
  }

  public MgPath(String svgd) {
    this(touchvgJNI.new_MgPath__SWIG_3(svgd), true);
  }

  public MgPath copy(MgPath src) {
    return new MgPath(touchvgJNI.MgPath_copy(swigCPtr, this, MgPath.getCPtr(src), src), false);
  }

  public MgPath append(MgPath src) {
    return new MgPath(touchvgJNI.MgPath_append(swigCPtr, this, MgPath.getCPtr(src), src), false);
  }

  public MgPath addSVGPath(String s) {
    return new MgPath(touchvgJNI.MgPath_addSVGPath(swigCPtr, this, s), false);
  }

  public MgPath reverse() {
    return new MgPath(touchvgJNI.MgPath_reverse(swigCPtr, this), false);
  }

  public boolean genericRoundLines(int count, Point2d points, float radius, boolean closed) {
    return touchvgJNI.MgPath_genericRoundLines__SWIG_0(swigCPtr, this, count, Point2d.getCPtr(points), points, radius, closed);
  }

  public boolean genericRoundLines(int count, Point2d points, float radius) {
    return touchvgJNI.MgPath_genericRoundLines__SWIG_1(swigCPtr, this, count, Point2d.getCPtr(points), points, radius);
  }

  public int getCount() {
    return touchvgJNI.MgPath_getCount(swigCPtr, this);
  }

  public int getSubPathCount() {
    return touchvgJNI.MgPath_getSubPathCount(swigCPtr, this);
  }

  public Point2d getStartPoint() {
    return new Point2d(touchvgJNI.MgPath_getStartPoint(swigCPtr, this), true);
  }

  public Vector2d getStartTangent() {
    return new Vector2d(touchvgJNI.MgPath_getStartTangent(swigCPtr, this), true);
  }

  public Point2d getEndPoint() {
    return new Point2d(touchvgJNI.MgPath_getEndPoint(swigCPtr, this), true);
  }

  public Vector2d getEndTangent() {
    return new Vector2d(touchvgJNI.MgPath_getEndTangent(swigCPtr, this), true);
  }

  public boolean isLine() {
    return touchvgJNI.MgPath_isLine(swigCPtr, this);
  }

  public boolean isLines() {
    return touchvgJNI.MgPath_isLines(swigCPtr, this);
  }

  public boolean isCurve() {
    return touchvgJNI.MgPath_isCurve(swigCPtr, this);
  }

  public boolean isClosed() {
    return touchvgJNI.MgPath_isClosed(swigCPtr, this);
  }

  public float getLength() {
    return touchvgJNI.MgPath_getLength(swigCPtr, this);
  }

  public int getNodeType(int index) {
    return touchvgJNI.MgPath_getNodeType(swigCPtr, this, index);
  }

  public Point2d getPoint(int index) {
    return new Point2d(touchvgJNI.MgPath_getPoint(swigCPtr, this, index), true);
  }

  public void setPoint(int index, Point2d pt) {
    touchvgJNI.MgPath_setPoint(swigCPtr, this, index, Point2d.getCPtr(pt), pt);
  }

  public void clear() {
    touchvgJNI.MgPath_clear(swigCPtr, this);
  }

  public void transform(Matrix2d mat) {
    touchvgJNI.MgPath_transform(swigCPtr, this, Matrix2d.getCPtr(mat), mat);
  }

  public void startFigure() {
    touchvgJNI.MgPath_startFigure(swigCPtr, this);
  }

  public boolean moveTo(Point2d point, boolean rel) {
    return touchvgJNI.MgPath_moveTo__SWIG_0(swigCPtr, this, Point2d.getCPtr(point), point, rel);
  }

  public boolean moveTo(Point2d point) {
    return touchvgJNI.MgPath_moveTo__SWIG_1(swigCPtr, this, Point2d.getCPtr(point), point);
  }

  public boolean lineTo(Point2d point, boolean rel) {
    return touchvgJNI.MgPath_lineTo__SWIG_0(swigCPtr, this, Point2d.getCPtr(point), point, rel);
  }

  public boolean lineTo(Point2d point) {
    return touchvgJNI.MgPath_lineTo__SWIG_1(swigCPtr, this, Point2d.getCPtr(point), point);
  }

  public boolean horzTo(float x, boolean rel) {
    return touchvgJNI.MgPath_horzTo__SWIG_0(swigCPtr, this, x, rel);
  }

  public boolean horzTo(float x) {
    return touchvgJNI.MgPath_horzTo__SWIG_1(swigCPtr, this, x);
  }

  public boolean vertTo(float y, boolean rel) {
    return touchvgJNI.MgPath_vertTo__SWIG_0(swigCPtr, this, y, rel);
  }

  public boolean vertTo(float y) {
    return touchvgJNI.MgPath_vertTo__SWIG_1(swigCPtr, this, y);
  }

  public boolean linesTo(int count, Point2d points, boolean rel) {
    return touchvgJNI.MgPath_linesTo__SWIG_0(swigCPtr, this, count, Point2d.getCPtr(points), points, rel);
  }

  public boolean linesTo(int count, Point2d points) {
    return touchvgJNI.MgPath_linesTo__SWIG_1(swigCPtr, this, count, Point2d.getCPtr(points), points);
  }

  public boolean beziersTo(int count, Point2d points, boolean reverse, boolean rel) {
    return touchvgJNI.MgPath_beziersTo__SWIG_0(swigCPtr, this, count, Point2d.getCPtr(points), points, reverse, rel);
  }

  public boolean beziersTo(int count, Point2d points, boolean reverse) {
    return touchvgJNI.MgPath_beziersTo__SWIG_1(swigCPtr, this, count, Point2d.getCPtr(points), points, reverse);
  }

  public boolean beziersTo(int count, Point2d points) {
    return touchvgJNI.MgPath_beziersTo__SWIG_2(swigCPtr, this, count, Point2d.getCPtr(points), points);
  }

  public boolean bezierTo(Point2d cp1, Point2d cp2, Point2d end, boolean rel) {
    return touchvgJNI.MgPath_bezierTo__SWIG_0(swigCPtr, this, Point2d.getCPtr(cp1), cp1, Point2d.getCPtr(cp2), cp2, Point2d.getCPtr(end), end, rel);
  }

  public boolean bezierTo(Point2d cp1, Point2d cp2, Point2d end) {
    return touchvgJNI.MgPath_bezierTo__SWIG_1(swigCPtr, this, Point2d.getCPtr(cp1), cp1, Point2d.getCPtr(cp2), cp2, Point2d.getCPtr(end), end);
  }

  public boolean smoothBezierTo(Point2d cp2, Point2d end, boolean rel) {
    return touchvgJNI.MgPath_smoothBezierTo__SWIG_0(swigCPtr, this, Point2d.getCPtr(cp2), cp2, Point2d.getCPtr(end), end, rel);
  }

  public boolean smoothBezierTo(Point2d cp2, Point2d end) {
    return touchvgJNI.MgPath_smoothBezierTo__SWIG_1(swigCPtr, this, Point2d.getCPtr(cp2), cp2, Point2d.getCPtr(end), end);
  }

  public boolean quadsTo(int count, Point2d points, boolean rel) {
    return touchvgJNI.MgPath_quadsTo__SWIG_0(swigCPtr, this, count, Point2d.getCPtr(points), points, rel);
  }

  public boolean quadsTo(int count, Point2d points) {
    return touchvgJNI.MgPath_quadsTo__SWIG_1(swigCPtr, this, count, Point2d.getCPtr(points), points);
  }

  public boolean quadTo(Point2d cp, Point2d end, boolean rel) {
    return touchvgJNI.MgPath_quadTo__SWIG_0(swigCPtr, this, Point2d.getCPtr(cp), cp, Point2d.getCPtr(end), end, rel);
  }

  public boolean quadTo(Point2d cp, Point2d end) {
    return touchvgJNI.MgPath_quadTo__SWIG_1(swigCPtr, this, Point2d.getCPtr(cp), cp, Point2d.getCPtr(end), end);
  }

  public boolean smoothQuadTo(Point2d end, boolean rel) {
    return touchvgJNI.MgPath_smoothQuadTo__SWIG_0(swigCPtr, this, Point2d.getCPtr(end), end, rel);
  }

  public boolean smoothQuadTo(Point2d end) {
    return touchvgJNI.MgPath_smoothQuadTo__SWIG_1(swigCPtr, this, Point2d.getCPtr(end), end);
  }

  public boolean arcTo(Point2d point, boolean rel) {
    return touchvgJNI.MgPath_arcTo__SWIG_0(swigCPtr, this, Point2d.getCPtr(point), point, rel);
  }

  public boolean arcTo(Point2d point) {
    return touchvgJNI.MgPath_arcTo__SWIG_1(swigCPtr, this, Point2d.getCPtr(point), point);
  }

  public boolean arcTo(Point2d point, Point2d end, boolean rel) {
    return touchvgJNI.MgPath_arcTo__SWIG_2(swigCPtr, this, Point2d.getCPtr(point), point, Point2d.getCPtr(end), end, rel);
  }

  public boolean arcTo(Point2d point, Point2d end) {
    return touchvgJNI.MgPath_arcTo__SWIG_3(swigCPtr, this, Point2d.getCPtr(point), point, Point2d.getCPtr(end), end);
  }

  public boolean closeFigure() {
    return touchvgJNI.MgPath_closeFigure(swigCPtr, this);
  }

  public boolean trimStart(Point2d pt, float dist) {
    return touchvgJNI.MgPath_trimStart(swigCPtr, this, Point2d.getCPtr(pt), pt, dist);
  }

  public boolean crossWithPath(MgPath path, Box2d box, Point2d ptCross) {
    return touchvgJNI.MgPath_crossWithPath(swigCPtr, this, MgPath.getCPtr(path), path, Box2d.getCPtr(box), box, Point2d.getCPtr(ptCross), ptCross);
  }

}