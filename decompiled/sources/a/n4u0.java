package a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class n4u0 extends e4u0 {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;
    public l4u0 b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] g;
    public final Matrix h;
    public final Rect i;

    public n4u0() {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        l4u0 l4u0Var = new l4u0();
        l4u0Var.c = null;
        l4u0Var.d = j;
        l4u0Var.b = new k4u0();
        this.b = l4u0Var;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f7201a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        Matrix matrix = this.h;
        canvas.getMatrix(matrix);
        float[] fArr = this.g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        l4u0 l4u0Var = this.b;
        Bitmap bitmap = l4u0Var.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != l4u0Var.f.getHeight()) {
            l4u0Var.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            l4u0Var.k = true;
        }
        boolean z = this.f;
        l4u0 l4u0Var2 = this.b;
        if (!z) {
            l4u0Var2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(l4u0Var2.f);
            k4u0 k4u0Var = l4u0Var2.b;
            k4u0Var.a(k4u0Var.g, k4u0.p, canvas2, iMin, iMin2);
        } else if (l4u0Var2.k || l4u0Var2.g != l4u0Var2.c || l4u0Var2.h != l4u0Var2.d || l4u0Var2.j != l4u0Var2.e || l4u0Var2.i != l4u0Var2.b.getRootAlpha()) {
            l4u0 l4u0Var3 = this.b;
            l4u0Var3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(l4u0Var3.f);
            k4u0 k4u0Var2 = l4u0Var3.b;
            k4u0Var2.a(k4u0Var2.g, k4u0.p, canvas3, iMin, iMin2);
            l4u0 l4u0Var4 = this.b;
            l4u0Var4.g = l4u0Var4.c;
            l4u0Var4.h = l4u0Var4.d;
            l4u0Var4.i = l4u0Var4.b.getRootAlpha();
            l4u0Var4.j = l4u0Var4.e;
            l4u0Var4.k = false;
        }
        l4u0 l4u0Var5 = this.b;
        if (l4u0Var5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (l4u0Var5.l == null) {
                Paint paint2 = new Paint();
                l4u0Var5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            l4u0Var5.l.setAlpha(l4u0Var5.b.getRootAlpha());
            l4u0Var5.l.setColorFilter(colorFilter);
            paint = l4u0Var5.l;
        }
        canvas.drawBitmap(l4u0Var5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f7201a;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f7201a;
        return drawable != null ? drawable.getColorFilter() : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f7201a != null) {
            return new m4u0(this.f7201a.getConstantState());
        }
        this.b.f19427a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f7201a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f7201a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        l4u0 l4u0Var = this.b;
        l4u0Var.b = new k4u0();
        TypedArray typedArrayS = zsm0.s(resources, theme, attributeSet, cfx0.f4286a);
        l4u0 l4u0Var2 = this.b;
        k4u0 k4u0Var = l4u0Var2.b;
        int iP = zsm0.p(typedArrayS, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i5 = 3;
        if (iP == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iP != 5) {
            if (iP != 9) {
                switch (iP) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        l4u0Var2.d = mode;
        ColorStateList colorStateListN = zsm0.n(typedArrayS, xmlPullParser, theme);
        if (colorStateListN != null) {
            l4u0Var2.c = colorStateListN;
        }
        boolean z = l4u0Var2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayS.getBoolean(5, z);
        }
        l4u0Var2.e = z;
        float f = k4u0Var.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayS.getFloat(7, f);
        }
        k4u0Var.j = f;
        float f2 = k4u0Var.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayS.getFloat(8, f2);
        }
        k4u0Var.k = f2;
        if (k4u0Var.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayS.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayS.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        k4u0Var.h = typedArrayS.getDimension(3, k4u0Var.h);
        int i6 = 2;
        float dimension = typedArrayS.getDimension(2, k4u0Var.i);
        k4u0Var.i = dimension;
        if (k4u0Var.h <= 0.0f) {
            throw new XmlPullParserException(typedArrayS.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayS.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = k4u0Var.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayS.getFloat(4, alpha);
        }
        k4u0Var.setAlpha(alpha);
        String string = typedArrayS.getString(0);
        if (string != null) {
            k4u0Var.m = string;
            k4u0Var.o.put(string, k4u0Var);
        }
        typedArrayS.recycle();
        l4u0Var.f19427a = getChangingConfigurations();
        int i7 = 1;
        l4u0Var.k = true;
        l4u0 l4u0Var3 = this.b;
        k4u0 k4u0Var2 = l4u0Var3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        h4u0 h4u0Var = k4u0Var2.g;
        gx3 gx3Var = k4u0Var2.o;
        arrayDeque.push(h4u0Var);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i7 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
            if (eventType == i6) {
                String name = xmlPullParser.getName();
                h4u0 h4u0Var2 = (h4u0) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    g4u0 g4u0Var = new g4u0();
                    g4u0Var.e = 0.0f;
                    g4u0Var.g = 1.0f;
                    g4u0Var.h = 1.0f;
                    g4u0Var.i = 0.0f;
                    g4u0Var.j = 1.0f;
                    g4u0Var.k = 0.0f;
                    Paint.Cap cap2 = Paint.Cap.BUTT;
                    g4u0Var.l = cap2;
                    Paint.Join join2 = Paint.Join.MITER;
                    g4u0Var.m = join2;
                    g4u0Var.n = 4.0f;
                    TypedArray typedArrayS2 = zsm0.s(resources, theme, attributeSet, cfx0.c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayS2.getString(0);
                        if (string2 != null) {
                            g4u0Var.b = string2;
                        }
                        String string3 = typedArrayS2.getString(2);
                        if (string3 != null) {
                            g4u0Var.f15902a = gfx.D(string3);
                        }
                        g4u0Var.f = zsm0.o(typedArrayS2, xmlPullParser, theme, "fillColor", 1);
                        float f3 = g4u0Var.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = typedArrayS2.getFloat(12, f3);
                        }
                        g4u0Var.h = f3;
                        int i8 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayS2.getInt(8, -1) : -1;
                        Paint.Cap cap3 = g4u0Var.l;
                        if (i8 == 0) {
                            cap = cap2;
                        } else if (i8 != 1) {
                            cap = i8 != 2 ? cap3 : Paint.Cap.SQUARE;
                        } else {
                            cap = Paint.Cap.ROUND;
                        }
                        g4u0Var.l = cap;
                        int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayS2.getInt(9, -1) : -1;
                        Paint.Join join3 = g4u0Var.m;
                        if (i9 == 0) {
                            join = join2;
                        } else if (i9 != 1) {
                            join = i9 != 2 ? join3 : Paint.Join.BEVEL;
                        } else {
                            join = Paint.Join.ROUND;
                        }
                        g4u0Var.m = join;
                        float f4 = g4u0Var.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = typedArrayS2.getFloat(10, f4);
                        }
                        g4u0Var.n = f4;
                        g4u0Var.d = zsm0.o(typedArrayS2, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = g4u0Var.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = typedArrayS2.getFloat(11, f5);
                        }
                        g4u0Var.g = f5;
                        float f6 = g4u0Var.e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = typedArrayS2.getFloat(4, f6);
                        }
                        g4u0Var.e = f6;
                        float f7 = g4u0Var.j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = typedArrayS2.getFloat(6, f7);
                        }
                        g4u0Var.j = f7;
                        float f8 = g4u0Var.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = typedArrayS2.getFloat(7, f8);
                        }
                        g4u0Var.k = f8;
                        float f9 = g4u0Var.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = typedArrayS2.getFloat(5, f9);
                        }
                        g4u0Var.i = f9;
                        int i10 = g4u0Var.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i10 = typedArrayS2.getInt(13, i10);
                        }
                        g4u0Var.c = i10;
                    }
                    typedArrayS2.recycle();
                    h4u0Var2.b.add(g4u0Var);
                    if (g4u0Var.getPathName() != null) {
                        gx3Var.put(g4u0Var.getPathName(), g4u0Var);
                    }
                    l4u0Var3.f19427a = l4u0Var3.f19427a;
                    i4 = 1;
                    z2 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        f4u0 f4u0Var = new f4u0();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray typedArrayS3 = zsm0.s(resources, theme, attributeSet, cfx0.d);
                            String string4 = typedArrayS3.getString(0);
                            if (string4 != null) {
                                f4u0Var.b = string4;
                            }
                            String string5 = typedArrayS3.getString(1);
                            if (string5 != null) {
                                f4u0Var.f15902a = gfx.D(string5);
                            }
                            f4u0Var.c = !zsm0.r(xmlPullParser, "fillType") ? 0 : typedArrayS3.getInt(2, 0);
                            typedArrayS3.recycle();
                        }
                        h4u0Var2.b.add(f4u0Var);
                        if (f4u0Var.getPathName() != null) {
                            gx3Var.put(f4u0Var.getPathName(), f4u0Var);
                        }
                        l4u0Var3.f19427a = l4u0Var3.f19427a;
                    } else if ("group".equals(name)) {
                        h4u0 h4u0Var3 = new h4u0();
                        TypedArray typedArrayS4 = zsm0.s(resources, theme, attributeSet, cfx0.b);
                        float f10 = h4u0Var3.c;
                        if (zsm0.r(xmlPullParser, "rotation")) {
                            f10 = typedArrayS4.getFloat(5, f10);
                        }
                        h4u0Var3.c = f10;
                        i4 = 1;
                        h4u0Var3.d = typedArrayS4.getFloat(1, h4u0Var3.d);
                        h4u0Var3.e = typedArrayS4.getFloat(2, h4u0Var3.e);
                        float f11 = h4u0Var3.f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = typedArrayS4.getFloat(3, f11);
                        }
                        h4u0Var3.f = f11;
                        float f12 = h4u0Var3.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = typedArrayS4.getFloat(4, f12);
                        }
                        h4u0Var3.g = f12;
                        float f13 = h4u0Var3.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = typedArrayS4.getFloat(6, f13);
                        }
                        h4u0Var3.h = f13;
                        float f14 = h4u0Var3.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = typedArrayS4.getFloat(7, f14);
                        }
                        h4u0Var3.i = f14;
                        String string6 = typedArrayS4.getString(0);
                        if (string6 != null) {
                            h4u0Var3.k = string6;
                        }
                        h4u0Var3.c();
                        typedArrayS4.recycle();
                        h4u0Var2.b.add(h4u0Var3);
                        arrayDeque.push(h4u0Var3);
                        if (h4u0Var3.getGroupName() != null) {
                            gx3Var.put(h4u0Var3.getGroupName(), h4u0Var3);
                        }
                        l4u0Var3.f19427a = l4u0Var3.f19427a;
                    }
                    i4 = 1;
                }
                i3 = i4;
                i2 = 3;
            } else {
                i = depth;
                i2 = i5;
                i3 = 1;
                if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i5 = i2;
            i7 = i3;
            depth = i;
            i6 = 2;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.c = a(l4u0Var.c, l4u0Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f7201a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        l4u0 l4u0Var = this.b;
        if (l4u0Var == null) {
            return false;
        }
        k4u0 k4u0Var = l4u0Var.b;
        Boolean boolValueOf = k4u0Var.n;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(k4u0Var.g.a());
            k4u0Var.n = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            l4u0 l4u0Var = this.b;
            l4u0 l4u0Var2 = new l4u0();
            l4u0Var2.c = null;
            l4u0Var2.d = j;
            if (l4u0Var != null) {
                l4u0Var2.f19427a = l4u0Var.f19427a;
                k4u0 k4u0Var = new k4u0(l4u0Var.b);
                l4u0Var2.b = k4u0Var;
                if (l4u0Var.b.e != null) {
                    k4u0Var.e = new Paint(l4u0Var.b.e);
                }
                if (l4u0Var.b.d != null) {
                    l4u0Var2.b.d = new Paint(l4u0Var.b.d);
                }
                l4u0Var2.c = l4u0Var.c;
                l4u0Var2.d = l4u0Var.d;
                l4u0Var2.e = l4u0Var.e;
            }
            this.b = l4u0Var2;
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        l4u0 l4u0Var = this.b;
        ColorStateList colorStateList = l4u0Var.c;
        if (colorStateList == null || (mode = l4u0Var.d) == null) {
            z = false;
        } else {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        k4u0 k4u0Var = l4u0Var.b;
        Boolean boolValueOf = k4u0Var.n;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(k4u0Var.g.a());
            k4u0Var.n = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            boolean zB = l4u0Var.b.g.b(iArr);
            l4u0Var.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        l4u0 l4u0Var = this.b;
        if (l4u0Var.c != colorStateList) {
            l4u0Var.c = colorStateList;
            this.c = a(colorStateList, l4u0Var.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        l4u0 l4u0Var = this.b;
        if (l4u0Var.d != mode) {
            l4u0Var.d = mode;
            this.c = a(l4u0Var.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f7201a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public n4u0(l4u0 l4u0Var) {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.b = l4u0Var;
        this.c = a(l4u0Var.c, l4u0Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f7201a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
