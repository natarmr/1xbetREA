package a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes5.dex */
public final class y3b0 extends fhe0 {
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Paint k;
    public final Function1 l;
    public final Function1 m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41943a = 0;
    public List h = iun.f15405a;
    public final Rect i = new Rect();
    public final Path j = new Path();

    public y3b0(int i, float f, int i2, int i3, int i4, int i5, int i6, kma0 kma0Var, kma0 kma0Var2) {
        this.b = f;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.l = kma0Var;
        this.m = kma0Var2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        this.k = paint;
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        zz3 zz3Var;
        byte b = this.f41943a;
        int i = this.e;
        Function1 function1 = this.l;
        int i2 = this.c;
        int i3 = this.d;
        switch (b) {
            case 0:
                kma0 kma0Var = (kma0) function1;
                rect.getClass();
                view.getClass();
                the0Var.getClass();
                yge0 adapter = recyclerView.getAdapter();
                zz3Var = adapter instanceof zz3 ? (zz3) adapter : null;
                if (zz3Var != null) {
                    List listZ = zz3Var.z();
                    listZ.getClass();
                    Object objW = CollectionsKt.W(RecyclerView.U(view), listZ);
                    if (objW != null) {
                        int iU = RecyclerView.U(view);
                        List listZ2 = zz3Var.z();
                        listZ2.getClass();
                        Object objW2 = CollectionsKt.W(iU + 1, listZ2);
                        boolean zBooleanValue = ((Boolean) kma0Var.invoke(objW)).booleanValue();
                        n0o0 n0o0VarB = maz.b(new qw80(this, objW, (byte) 25));
                        if (zBooleanValue) {
                            rect.left = i2;
                            rect.right = i2;
                            if (iU == 0) {
                                i = i3;
                            }
                            rect.top = i;
                        } else if (((Boolean) n0o0VarB.getValue()).booleanValue() && (objW2 == null || ((Boolean) kma0Var.invoke(objW2)).booleanValue())) {
                            rect.left = i2;
                            rect.right = i2;
                            rect.bottom = this.g;
                        } else if (((Boolean) n0o0VarB.getValue()).booleanValue()) {
                            rect.left = i2;
                            rect.right = i2;
                            rect.bottom = this.f;
                        }
                        break;
                    }
                }
                break;
            default:
                rect.getClass();
                view.getClass();
                the0Var.getClass();
                yge0 adapter2 = recyclerView.getAdapter();
                zz3Var = adapter2 instanceof zz3 ? (zz3) adapter2 : null;
                if (zz3Var != null) {
                    List listZ3 = zz3Var.z();
                    listZ3.getClass();
                    Object objW3 = CollectionsKt.W(RecyclerView.U(view), listZ3);
                    if (objW3 != null) {
                        int iU2 = RecyclerView.U(view);
                        if (((Boolean) ((wyb0) function1).invoke(objW3)).booleanValue()) {
                            int i4 = i2 + i3;
                            rect.left = i4;
                            rect.right = i4;
                            if (iU2 == 0) {
                                i = 0;
                            }
                            rect.top = i;
                        } else if (((Boolean) ((wyb0) this.m).invoke(objW3)).booleanValue()) {
                            int i5 = i2 + i3;
                            rect.left = i5;
                            rect.right = i5;
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // a.fhe0
    public final void g(Canvas canvas, RecyclerView recyclerView, the0 the0Var) {
        Iterator it;
        float f;
        byte b = this.f41943a;
        Rect rect = this.i;
        Paint paint = this.k;
        float f2 = this.b;
        float f3 = 2.0f;
        switch (b) {
            case 0:
                canvas.getClass();
                the0Var.getClass();
                Iterator it2 = new ihu0(recyclerView).iterator();
                while (true) {
                    jhu0 jhu0Var = (jhu0) it2;
                    if (jhu0Var.hasNext()) {
                        View view = (View) jhu0Var.next();
                        int iU = RecyclerView.U(view);
                        for (IntRange intRange : this.h) {
                            int i = intRange.f46068a;
                            int i2 = intRange.b;
                            if (iU == i && i == i2) {
                                i(view, x3b0.f40211a);
                                canvas.drawRoundRect(new RectF(rect), f2, f2, paint);
                                it = it2;
                            } else {
                                Path path = this.j;
                                if (iU == i) {
                                    i(view, x3b0.b);
                                    float f4 = f2 * 2.0f;
                                    RectF rectF = new RectF(rect);
                                    path.reset();
                                    path.moveTo(rectF.left, rectF.bottom);
                                    path.lineTo(rectF.left, rectF.top - f2);
                                    float f5 = rectF.left;
                                    float f6 = rectF.top;
                                    it = it2;
                                    path.arcTo(f5, f6, f5 + f4, f6 + f4, 180.0f, 90.0f, false);
                                    path.lineTo(rectF.right - f2, rectF.top);
                                    float f7 = rectF.right;
                                    float f8 = rectF.top;
                                    path.arcTo(f7 - f4, f8, f7, f8 + f4, -90.0f, 90.0f, false);
                                    path.lineTo(rectF.right, rectF.bottom);
                                    path.lineTo(rectF.left, rectF.bottom);
                                    path.close();
                                    canvas.drawPath(path, paint);
                                } else {
                                    it = it2;
                                    if (iU == i2) {
                                        i(view, x3b0.d);
                                        float f9 = f2 * 2.0f;
                                        RectF rectF2 = new RectF(rect);
                                        path.reset();
                                        path.moveTo(rectF2.left, rectF2.top);
                                        path.lineTo(rectF2.right, rectF2.top);
                                        path.lineTo(rectF2.right, rectF2.bottom - f2);
                                        float f10 = rectF2.right;
                                        float f11 = rectF2.bottom;
                                        path.arcTo(f10 - f9, f11 - f9, f10, f11, 0.0f, 90.0f, false);
                                        path.lineTo(rectF2.left + f2, rectF2.bottom);
                                        float f12 = rectF2.left;
                                        float f13 = rectF2.bottom;
                                        path.arcTo(f12, f13 - f9, f12 + f9, f13, 90.0f, 90.0f, false);
                                        path.lineTo(rectF2.left, rectF2.top);
                                        path.close();
                                        canvas.drawPath(path, paint);
                                    } else if (iU <= i2 && i <= iU) {
                                        i(view, x3b0.c);
                                        canvas.drawRect(rect, paint);
                                    }
                                }
                            }
                            it2 = it;
                        }
                    }
                    break;
                }
                break;
            default:
                canvas.getClass();
                the0Var.getClass();
                Iterator it3 = new ihu0(recyclerView).iterator();
                while (true) {
                    jhu0 jhu0Var2 = (jhu0) it3;
                    if (jhu0Var2.hasNext()) {
                        View view2 = (View) jhu0Var2.next();
                        int iU2 = RecyclerView.U(view2);
                        for (IntRange intRange2 : this.h) {
                            int i3 = intRange2.f46068a;
                            int i4 = intRange2.b;
                            int i5 = this.f;
                            if (iU2 == i3 && i3 == i4) {
                                j(view2, true);
                                rect.top -= i5;
                                canvas.drawRoundRect(new RectF(rect), f2, f2, paint);
                                f = f3;
                            } else {
                                Path path2 = this.j;
                                if (iU2 == i3) {
                                    j(view2, false);
                                    rect.top -= i5;
                                    float f14 = f2 * f3;
                                    RectF rectF3 = new RectF(rect);
                                    path2.reset();
                                    path2.moveTo(rectF3.left, rectF3.bottom);
                                    path2.lineTo(rectF3.left, rectF3.top - f2);
                                    float f15 = rectF3.left;
                                    float f16 = rectF3.top;
                                    f = f3;
                                    path2.arcTo(f15, f16, f15 + f14, f16 + f14, 180.0f, 90.0f, false);
                                    path2.lineTo(rectF3.right - f2, rectF3.top);
                                    float f17 = rectF3.right;
                                    float f18 = rectF3.top;
                                    path2.arcTo(f17 - f14, f18, f17, f18 + f14, -90.0f, 90.0f, false);
                                    path2.lineTo(rectF3.right, rectF3.bottom);
                                    path2.lineTo(rectF3.left, rectF3.bottom);
                                    path2.close();
                                    canvas.drawPath(path2, paint);
                                } else {
                                    f = f3;
                                    if (iU2 == i4) {
                                        j(view2, true);
                                        float f19 = f2 * f;
                                        RectF rectF4 = new RectF(rect);
                                        path2.reset();
                                        path2.moveTo(rectF4.left, rectF4.top);
                                        path2.lineTo(rectF4.right, rectF4.top);
                                        path2.lineTo(rectF4.right, rectF4.bottom - f2);
                                        float f20 = rectF4.right;
                                        float f21 = rectF4.bottom;
                                        path2.arcTo(f20 - f19, f21 - f19, f20, f21, 0.0f, 90.0f, false);
                                        path2.lineTo(rectF4.left + f2, rectF4.bottom);
                                        float f22 = rectF4.left;
                                        float f23 = rectF4.bottom;
                                        path2.arcTo(f22, f23 - f19, f22 + f19, f23, 90.0f, 90.0f, false);
                                        path2.lineTo(rectF4.left, rectF4.top);
                                        path2.close();
                                        canvas.drawPath(path2, paint);
                                    } else if (iU2 <= i4 && i3 <= iU2) {
                                        j(view2, true);
                                        canvas.drawRect(rect, paint);
                                    }
                                }
                            }
                            f3 = f;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public void i(View view, x3b0 x3b0Var) {
        Rect rect = this.i;
        view.getHitRect(rect);
        int iOrdinal = x3b0Var.ordinal();
        int i = this.c;
        if (iOrdinal == 0) {
            rect.left -= i;
            rect.right += i;
            return;
        }
        if (iOrdinal == 1) {
            rect.left -= i;
            rect.right += i;
            return;
        }
        if (iOrdinal == 2) {
            rect.left -= i;
            rect.right += i;
            rect.bottom += this.f;
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return;
            }
            rect.left -= i;
            rect.right += i;
            rect.bottom += this.g;
        }
    }

    public void j(View view, boolean z) {
        Rect rect = this.i;
        view.getHitRect(rect);
        if (z) {
            rect.bottom += this.g;
        }
        int i = rect.left;
        int i2 = this.c;
        rect.left = i - i2;
        rect.right += i2;
    }

    public y3b0(int i, float f, int i2, int i3, int i4, int i5, int i6, wyb0 wyb0Var, wyb0 wyb0Var2) {
        this.b = f;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.l = wyb0Var;
        this.m = wyb0Var2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        this.k = paint;
    }
}
