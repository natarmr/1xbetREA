package org.xplatform.market_statistic.ui.statisticwidget;

import a.i7q;
import a.j500;
import a.j5d;
import a.jtz;
import a.kng0;
import a.kyz;
import a.lun;
import a.maz;
import a.n0o0;
import a.nwb;
import a.o700;
import a.q3d;
import a.r3d;
import a.rcz;
import a.t500;
import a.t9f;
import a.tx3;
import a.wp20;
import a.z8z;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class LineChartView extends View {
    public static final /* synthetic */ int k1 = 0;
    public Function1 A;
    public Function0 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46778a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final n0o0 f1;
    public final float g;
    public final float g1;
    public final float h;
    public final HashMap h1;
    public float i;
    public final n0o0 i1;
    public BitmapShader j;
    public final ArrayList j1;
    public BitmapShader k;
    public BitmapShader l;
    public final n0o0 m;
    public float n;
    public float o;
    public float p;
    public final Matrix q;
    public float r;
    public float s;
    public float t;
    public float u;
    public boolean v;
    public float w;
    public float x;
    public final LinkedHashMap y;
    public Function2 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public LineChartView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46778a = new ArrayList();
        this.b = 100.0f;
        this.c = 100.0f;
        this.d = TypedValue.applyDimension(2, 40.0f, context.getResources().getDisplayMetrics());
        this.e = TypedValue.applyDimension(2, 40.0f, context.getResources().getDisplayMetrics());
        this.f = TypedValue.applyDimension(2, 8.0f, context.getResources().getDisplayMetrics());
        float fApplyDimension = TypedValue.applyDimension(2, 20.0f, context.getResources().getDisplayMetrics());
        this.g = fApplyDimension;
        this.h = TypedValue.applyDimension(2, 10.0f, context.getResources().getDisplayMetrics());
        this.i = fApplyDimension;
        this.m = maz.b(new i7q(context, (byte) 16));
        this.q = new Matrix();
        this.r = Float.MIN_VALUE;
        this.s = Float.MIN_VALUE;
        this.t = Float.MAX_VALUE;
        this.u = Float.MAX_VALUE;
        this.x = -1.0f;
        this.y = new LinkedHashMap();
        this.z = new kyz((byte) 4);
        this.A = new z8z((byte) 24);
        this.B = new jtz((byte) 21);
        byte b = 17;
        this.f1 = maz.b(new i7q(context, b));
        this.g1 = TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics());
        this.h1 = new HashMap(2);
        this.i1 = maz.b(new rcz(this, b));
        setLayerType(1, null);
        this.j1 = new ArrayList();
    }

    public static final float a(LineChartView lineChartView) {
        return lineChartView.getMGrid().n.getTextSize();
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList(2);
        if (!StringsKt.P(str, '/') || str.length() < 5) {
            arrayList.add(str);
            return arrayList;
        }
        int i = 0;
        List listI0 = StringsKt.i0(str, new char[]{'/'}, 6);
        ArrayList arrayList2 = new ArrayList(r3d.q(listI0, 10));
        for (Object obj : listI0) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            String strK = (String) obj;
            if (i != 0) {
                strK = kng0.k(Separators.SLASH, strK);
            }
            arrayList2.add(strK);
            i = i2;
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private final float getBottomOffset() {
        return ((Number) this.i1.getValue()).floatValue();
    }

    private final nwb getMGrid() {
        return (nwb) this.m.getValue();
    }

    private final Paint getPaintVerticalLine() {
        return (Paint) this.f1.getValue();
    }

    private final float getVerticalColumnWidth() {
        ArrayList arrayList = this.j1;
        if (arrayList.size() <= 1) {
            return 0.0f;
        }
        float fFloatValue = ((Number) arrayList.get(1)).floatValue();
        Object obj = arrayList.get(0);
        obj.getClass();
        return fFloatValue - ((Number) obj).floatValue();
    }

    public final void b(float f, float f2) {
        LinkedHashMap linkedHashMap = this.y;
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(r3d.q(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(Math.abs(f - ((Number) it.next()).floatValue())));
        }
        int iIndexOf = arrayList.indexOf(CollectionsKt.k0(arrayList));
        if (iIndexOf != -1) {
            float fFloatValue = ((Number) CollectionsKt.Q(linkedHashMap.keySet(), iIndexOf)).floatValue();
            List list = (List) linkedHashMap.get(Float.valueOf(fFloatValue));
            if (list != null && fFloatValue != this.x) {
                c();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((o700) ((Pair) it2.next()).b).f = true;
                }
                this.A.invoke(list);
                this.w = fFloatValue;
                this.v = true;
                postInvalidate();
                this.x = fFloatValue;
            }
            this.z.invoke(Float.valueOf(f), Float.valueOf(f2));
        }
    }

    public final void c() {
        List list = (List) this.y.get(Float.valueOf(this.x));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((o700) ((Pair) it.next()).b).f = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v16, types: [a.lun, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.HashMap] */
    public final void d(int i, Canvas canvas) {
        float width;
        ?? B;
        int i2 = 2;
        Paint.Align align = ((i & 1) <= 0 && (i & 2) > 0) ? Paint.Align.RIGHT : Paint.Align.LEFT;
        getMGrid().getClass();
        getMGrid().m.setTextAlign(align);
        if (getMGrid().g) {
            if (this.l == null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ALPHA_8);
                bitmapCreateBitmap.getClass();
                Paint paint = new Paint();
                TypedValue typedValue = j5d.f15927a;
                Context context = getContext();
                context.getClass();
                paint.setColor(context.getColor(R.color.static_white));
                paint.setStyle(Paint.Style.FILL);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                getMGrid().getClass();
                canvas2.drawRect(0.0f, 0.0f, getWidth(), getMGrid().m.descent() + (getHeight() - getMGrid().q), paint);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.l = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
            }
            float f = 0.0f;
            int i3 = (((int) 0.0f) / getMGrid().b) * getMGrid().b;
            getMGrid().m.setShader(this.l);
            String[] strArr = getMGrid().v;
            if (strArr != null) {
                int length = strArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i5 < length) {
                    String str = strArr[i5];
                    int i6 = t500.f33346a[align.ordinal()];
                    if (i6 == 1) {
                        width = getMGrid().r;
                    } else if (i6 != i2) {
                        width = i6 != 3 ? getMGrid().r : ((getWidth() - getMGrid().r) - getMGrid().s) / 2.0f;
                    } else {
                        width = getWidth() - getMGrid().s;
                    }
                    float height = (((getHeight() - this.i) - ((i3 - f) * this.o)) - getMGrid().m.descent()) - getBottomOffset();
                    ArrayList<String> arrayListF = f(str);
                    int iA = wp20.a(r3d.q(arrayListF, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    for (Object obj : arrayListF) {
                        String str2 = (String) obj;
                        Paint paint2 = getMGrid().m;
                        Rect rect = new Rect();
                        paint2.getTextBounds(str2, i4, str2.length(), rect);
                        linkedHashMap.put(obj, Integer.valueOf(rect.height()));
                        align = align;
                    }
                    Paint.Align align2 = align;
                    if (arrayListF.isEmpty()) {
                        B = lun.f20680a;
                        B.getClass();
                    } else if (arrayListF.size() != 1) {
                        B = this.h1;
                        B.clear();
                        int size = arrayListF.size() - 1;
                        if (size >= 0) {
                            int i7 = i4;
                            float fIntValue = 0.0f;
                            while (true) {
                                String str3 = (String) arrayListF.get(i7);
                                if (i7 == 0) {
                                    fIntValue = height;
                                } else {
                                    Integer num = (Integer) linkedHashMap.get(str3);
                                    fIntValue = (num != null ? num.intValue() : i4) + this.g1 + fIntValue;
                                }
                                B.put(str3, Float.valueOf(fIntValue));
                                if (i7 == size) {
                                    break;
                                }
                                i7++;
                                i4 = 0;
                            }
                        }
                    } else {
                        B = wp20.b(new Pair(CollectionsKt.U(arrayListF), Float.valueOf(height)));
                    }
                    for (String str4 : arrayListF) {
                        Float f2 = (Float) B.get(str4);
                        canvas.drawText(str4, width, f2 != null ? f2.floatValue() : 0.0f, getMGrid().m);
                    }
                    i3 += getMGrid().b;
                    i5++;
                    align = align2;
                    i2 = 2;
                    f = 0.0f;
                    i4 = 0;
                }
            }
        }
    }

    public final float e(float f) {
        byte b = getMGrid().t;
        byte b2 = getMGrid().t;
        return ((getHeight() - 1) - getMGrid().o) - f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (isInEditMode()) {
            return;
        }
        BitmapShader bitmapShader = this.j;
        float f = this.f;
        float f2 = this.e;
        float f3 = this.d;
        if (bitmapShader == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ALPHA_8);
            bitmapCreateBitmap.getClass();
            Paint paint = new Paint();
            TypedValue typedValue = j5d.f15927a;
            Context context = getContext();
            context.getClass();
            paint.setColor(context.getColor(R.color.static_white));
            paint.setStyle(Paint.Style.FILL);
            new Canvas(bitmapCreateBitmap).drawRect(f3 - 1.0f, f - 1.0f, (getWidth() - f2) + 1.0f, (getHeight() - this.i) + 1.0f, paint);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.j = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
        }
        ArrayList arrayList = this.j1;
        arrayList.clear();
        float f4 = 0.0f;
        int i = (((int) 0.0f) / (getMGrid().f24227a - 1)) * getMGrid().f24227a;
        byte b = getMGrid().f24227a;
        getMGrid().getClass();
        getMGrid().j.setShader(this.j);
        getMGrid().l.setShader(this.j);
        getMGrid().n.setShader(this.k);
        if (getMGrid().e) {
            int i2 = i;
            while (true) {
                float f5 = i2;
                if (f5 >= (f2 / this.o) + this.b) {
                    break;
                }
                float f6 = ((f5 - 0.0f) * this.n) + f3;
                arrayList.add(Float.valueOf(f6));
                canvas.drawLine(f6, this.f, f6, (getHeight() - this.i) - getBottomOffset(), getMGrid().j);
                if (getMGrid().f) {
                    getMGrid().getClass();
                }
                i2 += getMGrid().f24227a;
            }
        }
        int i3 = (((int) 0.0f) / getMGrid().b) * getMGrid().b;
        byte b2 = getMGrid().b;
        getMGrid().getClass();
        getMGrid().i.setShader(this.j);
        getMGrid().k.setShader(this.j);
        getMGrid().m.setShader(this.l);
        boolean z = getMGrid().c;
        float f7 = this.c;
        if (z) {
            int i4 = i3;
            while (true) {
                float f8 = i4;
                if (f8 >= f7) {
                    break;
                }
                canvas.drawLine(this.d, ((getHeight() - this.i) - getBottomOffset()) - ((f8 - 0.0f) * this.o), getWidth() - f2, ((getHeight() - this.i) - getBottomOffset()) - ((f8 - 0.0f) * this.o), getMGrid().i);
                if (getMGrid().d) {
                    getMGrid().getClass();
                }
                i4 += getMGrid().b;
            }
        }
        Canvas canvas2 = canvas;
        ArrayList<j500> arrayList2 = this.f46778a;
        for (j500 j500Var : arrayList2) {
            Path path = j500Var.d;
            n0o0 n0o0Var = j500Var.c;
            Path path2 = new Path(path);
            Matrix matrix = this.q;
            matrix.reset();
            matrix.setScale(this.n, (-this.o) * this.p);
            path2.transform(matrix);
            matrix.reset();
            matrix.setTranslate(((-0.0f) * this.n) + f3, (this.o * f7) + f);
            path2.transform(matrix);
            ((Paint) n0o0Var.getValue()).setShader(this.j);
            canvas2.drawPath(path2, (Paint) n0o0Var.getValue());
        }
        if (this.v) {
            canvas2.drawLine(this.w, (getHeight() - this.i) - getBottomOffset(), this.w, this.f, getPaintVerticalLine());
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            for (o700 o700Var : ((j500) it.next()).b) {
                boolean z2 = o700Var.f;
                float f9 = o700Var.d;
                if (z2) {
                    float f10 = o700Var.f24761a;
                    float f11 = this.n;
                    float f12 = ((f10 * f11) - (f11 * f4)) + f3;
                    float f13 = o700Var.b * this.p;
                    float f14 = this.o;
                    float f15 = (f14 * f7) + (f13 * (-f14)) + f;
                    if (o700Var.b().getStrokeWidth() + f9 + f12 > f3 && f12 - (o700Var.b().getStrokeWidth() + f9) < getWidth() - f2 && o700Var.b().getStrokeWidth() + f9 + f15 > f && f15 - (o700Var.b().getStrokeWidth() + f9) < getHeight() - this.i) {
                        o700Var.a().setShader(this.j);
                        o700Var.b().setShader(this.j);
                        int iOrdinal = o700Var.e.ordinal();
                        if (iOrdinal == 0) {
                            canvas2.drawCircle(f12, f15, f9, o700Var.a());
                            canvas2.drawCircle(f12, f15, f9, o700Var.b());
                        } else if (iOrdinal == 1) {
                            float f16 = f12 - f9;
                            float f17 = f15 - f9;
                            float f18 = f12 + f9;
                            float f19 = f15 + f9;
                            canvas2.drawRect(f16, f17, f18, f19, o700Var.a());
                            canvas2 = canvas;
                            canvas2.drawRect(f16, f17, f18, f19, o700Var.b());
                        } else {
                            if (iOrdinal != 2) {
                                t9f.b();
                                return;
                            }
                            Path path3 = new Path();
                            path3.moveTo(f12, f15 - f9);
                            float f20 = 0.86f * f9;
                            float f21 = (f9 * 0.5f) + f15;
                            path3.lineTo(f12 - f20, f21);
                            path3.lineTo(f20 + f12, f21);
                            path3.close();
                            canvas2.drawPath(path3, o700Var.a());
                            canvas2.drawPath(path3, o700Var.b());
                        }
                    }
                }
                f4 = 0.0f;
            }
        }
        d(1, canvas2);
        d(2, canvas2);
        if (getMGrid().h) {
            if (this.k == null) {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ALPHA_8);
                bitmapCreateBitmap2.getClass();
                Paint paint2 = new Paint();
                TypedValue typedValue2 = j5d.f15927a;
                Context context2 = getContext();
                context2.getClass();
                paint2.setColor(context2.getColor(R.color.static_white));
                paint2.setStyle(Paint.Style.FILL);
                Canvas canvas3 = new Canvas(bitmapCreateBitmap2);
                getMGrid().getClass();
                getMGrid().getClass();
                canvas3.drawRect(0.0f, 0.0f, getWidth() - getMGrid().p, getMGrid().n.descent() + (getHeight() - getMGrid().o), paint2);
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                this.k = new BitmapShader(bitmapCreateBitmap2, tileMode2, tileMode2);
            }
            getMGrid().j.setShader(this.j);
            getMGrid().l.setShader(this.j);
            Paint paint3 = getMGrid().n;
            paint3.setShader(this.k);
            byte b3 = getMGrid().t;
            byte b4 = getMGrid().t;
            paint3.setTextAlign((getMGrid().t & 16) > 0 ? Paint.Align.CENTER : Paint.Align.LEFT);
            float verticalColumnWidth = getVerticalColumnWidth();
            String[] strArr = getMGrid().u;
            if (strArr != null) {
                int length = strArr.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    String str = strArr[i5];
                    int i7 = i6 + 1;
                    float f22 = (i6 * verticalColumnWidth) + f3;
                    if (getMGrid().n.measureText(str) > verticalColumnWidth) {
                        int i8 = 0;
                        for (Object obj : StringsKt__StringsKt.split$default(str, new String[]{Separators.SP}, false, 0, 6, null)) {
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                q3d.p();
                                throw null;
                            }
                            String str2 = (String) obj;
                            if (i8 == 0) {
                                canvas2.drawText(str2, f22, e(getBottomOffset()), getMGrid().n);
                            } else {
                                canvas2.drawText(str2, f22, e(0.0f), getMGrid().n);
                            }
                            i8 = i9;
                        }
                    } else {
                        canvas2.drawText(str, f22, e(getBottomOffset()), getMGrid().n);
                    }
                    i5++;
                    i6 = i7;
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.n = this.b - 0.0f == 0.0f ? 1.0f : ((getMeasuredWidth() - this.d) - this.e) / (this.b - 0.0f);
        this.o = this.c - 0.0f != 0.0f ? ((getMeasuredHeight() - this.f) - this.i) / (this.c - 0.0f) : 1.0f;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        Bundle bundle = (Bundle) parcelable;
        this.n = bundle.getFloat("SCALE_X", 0.0f);
        super.onRestoreInstanceState(bundle.getParcelable("SUPER_STATE"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER_STATE", super.onSaveInstanceState());
        bundle.putFloat("SCALE_X", this.n);
        return bundle;
    }

    public final void setHorValuesText(String[] strArr) {
        strArr.getClass();
        getMGrid().u = strArr;
    }

    public final void setVerValuesText(String[] strArr) {
        String str;
        strArr.getClass();
        getMGrid().v = strArr;
        String[] strArr2 = getMGrid().v;
        this.i = this.g + ((strArr2 == null || (str = (String) tx3.B(strArr2)) == null || f(str).size() <= 1) ? 0.0f : this.h);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LineChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LineChartView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
