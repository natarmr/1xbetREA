package a;

import android.content.Context;
import android.graphics.Paint;
import android.text.format.DateFormat;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.market_statistic.ui.statisticwidget.LineChartView;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes5.dex */
public final class r730 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ s730 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r730(s730 s730Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = s730Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        s730 s730Var = this.k;
        switch (b) {
            case 0:
                r730 r730Var = new r730(s730Var, yjeVar, (byte) 0);
                r730Var.j = obj;
                return r730Var;
            default:
                r730 r730Var2 = new r730(s730Var, yjeVar, (byte) 1);
                r730Var2.j = obj;
                return r730Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((r730) create((hx20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((r730) create((ux20) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        byte b;
        Context context;
        Iterator it;
        String strF;
        switch (this.i) {
            case 0:
                hx20 hx20Var = (hx20) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (hx20Var instanceof fx20) {
                    this.k.P1.A(((fx20) hx20Var).f10289a);
                }
                return Unit.f46060a;
            default:
                ux20 ux20Var = (ux20) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (ux20Var != null) {
                    boolean z = ux20Var instanceof qx20;
                    int i = 8;
                    s730 s730Var = this.k;
                    if (z) {
                        qx20 qx20Var = (qx20) ux20Var;
                        atz atzVar = s730.Q1;
                        z1r z1rVarG0 = s730Var.G0();
                        z1rVarG0.d.setVisibility(0);
                        z1rVarG0.g.setVisibility(8);
                        LineChartView lineChartView = z1rVarG0.b;
                        lineChartView.setVisibility(0);
                        z1rVarG0.e.setVisibility(8);
                        lineChartView.f46778a.clear();
                        lineChartView.postInvalidate();
                        lineChartView.y.clear();
                        int i2 = qx20Var.c;
                        boolean z2 = qx20Var.d;
                        mx20 mx20Var = qx20Var.f29461a;
                        float f = mx20Var.f22534a;
                        long j = mx20Var.c;
                        float f2 = mx20Var.b;
                        double d = f;
                        double d2 = f2;
                        double d3 = (d2 - d) / 8.0d;
                        Double[] dArr = new Double[9];
                        for (int i3 = 0; i3 < 9; i3++) {
                            dArr[i3] = Double.valueOf(0.0d);
                        }
                        int i4 = 0;
                        while (i4 < 9) {
                            dArr[i4] = Double.valueOf(i4 == i ? d2 : (((double) i4) * d3) + d);
                            i4++;
                            dArr = dArr;
                            i = 8;
                        }
                        Double[] dArr2 = dArr;
                        String[] strArr = new String[9];
                        int i5 = 0;
                        while (true) {
                            String str = "";
                            if (i5 < 9) {
                                strArr[i5] = "";
                                i5++;
                            } else {
                                int i6 = 0;
                                int i7 = 0;
                                for (int i8 = 9; i6 < i8; i8 = 9) {
                                    double dDoubleValue = dArr2[i6].doubleValue();
                                    jvn.f17210a.getClass();
                                    strArr[i7] = ahb.C(pek.k(i2), dDoubleValue, p3u0.c);
                                    i6++;
                                    i7++;
                                    j = j;
                                }
                                long j2 = j;
                                long j3 = mx20Var.d;
                                long j4 = j3 - j2;
                                long j5 = j4 / 7;
                                int i9 = 8;
                                Long[] lArr = new Long[8];
                                for (int i10 = 0; i10 < 8; i10++) {
                                    lArr[i10] = 0L;
                                }
                                int i11 = 0;
                                while (i11 < i9) {
                                    lArr[i11] = Long.valueOf(i11 == 7 ? j3 : (((long) i11) * j5) + j2);
                                    i11++;
                                    z2 = z2;
                                    lArr = lArr;
                                    i9 = 8;
                                }
                                boolean z3 = z2;
                                int i12 = i9;
                                boolean z4 = z3;
                                Long[] lArr2 = lArr;
                                String[] strArr2 = new String[i12];
                                for (int i13 = 0; i13 < i12; i13++) {
                                    strArr2[i13] = "";
                                }
                                int i14 = 0;
                                int i15 = 0;
                                while (i14 < i12) {
                                    int i16 = i15 + 1;
                                    long j6 = j3;
                                    long jLongValue = lArr2[i14].longValue();
                                    if (z4) {
                                        rdj rdjVar = rdj.f30294a;
                                        strF = rdj.h(new ynq0(jLongValue), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(s730Var.o0())), null, 248);
                                    } else {
                                        rdj rdjVar2 = rdj.f30294a;
                                        strF = rdj.f(new ynq0(jLongValue), sdj.UNIQUE_2, null, 60);
                                    }
                                    strArr2[i15] = strF;
                                    i14++;
                                    z4 = z4;
                                    i15 = i16;
                                    j3 = j6;
                                    str = str;
                                    i12 = 8;
                                }
                                String str2 = str;
                                long j7 = j3;
                                Context contextO0 = s730Var.o0();
                                s730Var.G0().b.p = f2 / f2;
                                s730Var.G0().b.setVerValuesText(strArr);
                                s730Var.G0().b.setHorValuesText(strArr2);
                                Iterator it2 = qx20Var.b.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        lx20 lx20Var = (lx20) it2.next();
                                        ArrayList<jx20> arrayList = lx20Var.d;
                                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                                        for (jx20 jx20Var : arrayList) {
                                            float f3 = jx20Var.f17281a;
                                            float f4 = mx20Var.f22534a;
                                            arrayList2.add(new Pair(Float.valueOf((96.0f / (f2 - f4)) * (f3 - f4)), jx20Var.c));
                                        }
                                        b = 1;
                                        ArrayList arrayList3 = lx20Var.d;
                                        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                                        Iterator it3 = arrayList3.iterator();
                                        while (it3.hasNext()) {
                                            long j8 = ((jx20) it3.next()).b;
                                            float f5 = 98.0f;
                                            if (j2 != j7) {
                                                f5 = (98.0f / j4) * (j8 - j2);
                                            }
                                            arrayList4.add(Float.valueOf(f5 + 0.3f));
                                        }
                                        List list = s730.S1;
                                        int iIntValue = ((Number) list.get(lx20Var.c % list.size())).intValue();
                                        j500 j500Var = new j500(contextO0, lx20Var.b);
                                        Paint paint = (Paint) j500Var.c.getValue();
                                        TypedValue typedValue = j5d.f15927a;
                                        paint.setColor(contextO0.getColor(iIntValue));
                                        float fCeil = (int) Math.ceil(contextO0.getResources().getDisplayMetrics().density * 5.0f);
                                        Iterator it4 = arrayList4.iterator();
                                        int i17 = 0;
                                        while (true) {
                                            boolean zHasNext = it4.hasNext();
                                            ArrayList<o700> arrayList5 = j500Var.b;
                                            if (zHasNext) {
                                                Object next = it4.next();
                                                int i18 = i17 + 1;
                                                if (i17 < 0) {
                                                    q3d.p();
                                                    throw null;
                                                }
                                                float fFloatValue = ((Number) next).floatValue();
                                                if (i17 <= arrayList2.size() - 1) {
                                                    Pair pair = (Pair) CollectionsKt.W(i17, arrayList2);
                                                    float fFloatValue2 = pair != null ? ((Number) pair.f46059a).floatValue() + 2.2f : 0.0f;
                                                    Pair pair2 = (Pair) CollectionsKt.W(i17, arrayList2);
                                                    String str3 = pair2 != null ? (String) pair2.b : null;
                                                    float f6 = fCeil;
                                                    o700 o700Var = new o700(contextO0, fFloatValue, fFloatValue2, str3 == null ? str2 : str3, f6);
                                                    Paint paintA = o700Var.a();
                                                    TypedValue typedValue2 = j5d.f15927a;
                                                    paintA.setColor(contextO0.getColor(iIntValue));
                                                    o700Var.a().setStyle(Paint.Style.FILL);
                                                    o700Var.b().setColor(contextO0.getColor(R.color.static_transparent));
                                                    Iterator it5 = arrayList5.iterator();
                                                    int i19 = 0;
                                                    while (true) {
                                                        if (!it5.hasNext()) {
                                                            context = contextO0;
                                                            it = it2;
                                                            arrayList5.add(o700Var);
                                                            j500Var.a();
                                                        }
                                                        Object next2 = it5.next();
                                                        int i20 = i19 + 1;
                                                        if (i19 < 0) {
                                                            q3d.p();
                                                            throw null;
                                                        }
                                                        context = contextO0;
                                                        it = it2;
                                                        if (o700Var.f24761a < ((o700) next2).f24761a) {
                                                            arrayList5.add(i19, o700Var);
                                                            j500Var.a();
                                                        }
                                                        i19 = i20;
                                                        it2 = it;
                                                        contextO0 = context;
                                                        break;
                                                        break;
                                                    }
                                                    i17 = i18;
                                                    it2 = it;
                                                    contextO0 = context;
                                                    fCeil = f6;
                                                }
                                            } else {
                                                Context context2 = contextO0;
                                                Iterator it6 = it2;
                                                LineChartView lineChartView2 = s730Var.G0().b;
                                                lineChartView2.f46778a.add(j500Var);
                                                lineChartView2.postInvalidate();
                                                LinkedHashMap linkedHashMap = lineChartView2.y;
                                                for (o700 o700Var2 : arrayList5) {
                                                    float f7 = o700Var2.f24761a;
                                                    float f8 = lineChartView2.n;
                                                    float f9 = ((f7 * f8) - (f8 * 0.0f)) + lineChartView2.d;
                                                    Object obj3 = linkedHashMap.get(Float.valueOf(f9));
                                                    String str4 = j500Var.f15911a;
                                                    if (obj3 == null) {
                                                        linkedHashMap.put(Float.valueOf(f9), q3d.l(new Pair(str4, o700Var2)));
                                                    } else {
                                                        List list2 = (List) linkedHashMap.get(Float.valueOf(f9));
                                                        if (list2 != null) {
                                                            list2.add(new Pair(str4, o700Var2));
                                                        }
                                                    }
                                                }
                                                Iterator it7 = arrayList5.iterator();
                                                it7.getClass();
                                                while (it7.hasNext()) {
                                                    Object next3 = it7.next();
                                                    next3.getClass();
                                                    o700 o700Var3 = (o700) next3;
                                                    float f10 = o700Var3.f24761a;
                                                    float f11 = lineChartView2.r;
                                                    if (f10 > f11) {
                                                        f11 = f10;
                                                    }
                                                    lineChartView2.r = f11;
                                                    float f12 = o700Var3.b;
                                                    float f13 = lineChartView2.s;
                                                    if (f12 > f13) {
                                                        f13 = f12;
                                                    }
                                                    lineChartView2.s = f13;
                                                    float f14 = lineChartView2.t;
                                                    if (f10 >= f14) {
                                                        f10 = f14;
                                                    }
                                                    lineChartView2.t = f10;
                                                    float f15 = lineChartView2.u;
                                                    if (f12 >= f15) {
                                                        f12 = f15;
                                                    }
                                                    lineChartView2.u = f12;
                                                }
                                                it2 = it6;
                                                contextO0 = context2;
                                            }
                                        }
                                    } else {
                                        b = 1;
                                    }
                                }
                                long j9 = mx20Var.c;
                                long j10 = mx20Var.d;
                                LineChartView lineChartView3 = s730Var.G0().b;
                                byte b2 = b;
                                p730 p730Var = new p730(s730Var, b2);
                                qp7 qp7Var = new qp7((Object) s730Var, j9, j10, (byte) 4);
                                o730 o730Var = new o730(s730Var, b2);
                                lineChartView3.z = p730Var;
                                lineChartView3.A = qp7Var;
                                lineChartView3.B = o730Var;
                            }
                        }
                    } else {
                        obj2 = null;
                        if (ux20Var instanceof tx20) {
                            atz atzVar2 = s730.Q1;
                            s730Var.G0().g.setVisibility(0);
                        } else if (ux20Var instanceof rx20) {
                            atz atzVar3 = s730.Q1;
                            z1r z1rVarG1 = s730Var.G0();
                            z1rVarG1.d.setVisibility(8);
                            z1rVarG1.g.setVisibility(8);
                            z1rVarG1.b.setVisibility(8);
                            DSLottieEmptyContainer dSLottieEmptyContainer = z1rVarG1.e;
                            dSLottieEmptyContainer.setVisibility(0);
                            dSLottieEmptyContainer.a(((rx20) ux20Var).f31243a);
                        } else if (ux20Var instanceof sx20) {
                            atz atzVar4 = s730.Q1;
                            z1r z1rVarG2 = s730Var.G0();
                            RecyclerView recyclerView = z1rVarG2.d;
                            DSLottieEmptyContainer dSLottieEmptyContainer2 = z1rVarG2.e;
                            recyclerView.setVisibility(8);
                            z1rVarG2.g.setVisibility(8);
                            z1rVarG2.b.setVisibility(8);
                            dSLottieEmptyContainer2.setVisibility(0);
                            dSLottieEmptyContainer2.b(((sx20) ux20Var).f32953a, 10000L, new bmh((byte) 12));
                        }
                    }
                    return Unit.f46060a;
                }
                obj2 = null;
                t9f.b();
                return obj2;
        }
    }
}
