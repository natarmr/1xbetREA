package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bet_constructor.impl.makebet.domain.model.StepInputConfigModel;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cw6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5066a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cw6(hdz hdzVar, kie0 kie0Var, pk5 pk5Var, boolean z, Function1 function1) {
        this.f5066a = (byte) 6;
        this.b = hdzVar;
        this.f = kie0Var;
        this.d = pk5Var;
        this.c = z;
        this.e = function1;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:144:0x05af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x055a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0566  */
    /* JADX WARN: Code duplicated, block: B:87:0x057b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0592  */
    /* JADX WARN: Code duplicated, block: B:90:0x0595  */
    /* JADX WARN: Code duplicated, block: B:93:0x059a  */
    /* JADX WARN: Code duplicated, block: B:96:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:97:0x05aa  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mdm mdmVar;
        mdm mdmVarB;
        ArrayList arrayList;
        Iterator it;
        a4x a4xVarO0;
        y3n0 y3n0Var;
        String str;
        String str2;
        y3n0 y3n0Var2;
        String str3;
        Pair pair;
        byte b = this.f5066a;
        byte b2 = 2;
        byte b3 = 3;
        boolean z = this.c;
        byte b4 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                a8q0 a8q0Var = (a8q0) obj5;
                Function0 function0 = (Function0) obj4;
                pz40 pz40Var = (pz40) obj3;
                pz40 pz40Var2 = (pz40) obj2;
                iqq iqqVar = (iqq) obj;
                iqqVar.getClass();
                if (iqqVar.b() && a8q0Var.f440a.b.length() > 0 && !((Boolean) pz40Var.getValue()).booleanValue() && z) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                pz40Var2.setValue(Boolean.valueOf(iqqVar.b()));
                if (iqqVar.b() && function0 != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 1:
                a8q0 a8q0Var2 = (a8q0) obj5;
                pz40 pz40Var3 = (pz40) obj3;
                pz40 pz40Var4 = (pz40) obj2;
                pz40 pz40Var5 = (pz40) obj4;
                iqq iqqVar2 = (iqq) obj;
                iqqVar2.getClass();
                if (iqqVar2.b() && a8q0Var2.f440a.b.length() > 0 && !((Boolean) pz40Var3.getValue()).booleanValue() && ((Boolean) pz40Var4.getValue()).booleanValue() && z) {
                    pz40Var4.setValue(Boolean.FALSE);
                    pz40Var3.setValue(Boolean.TRUE);
                }
                pz40Var5.setValue(Boolean.valueOf(iqqVar2.b()));
                return Unit.f46060a;
            case 2:
                aq7 aq7Var = (aq7) obj5;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                List list = aq7Var.f;
                hczVar.f(list.size(), null, new b8(list, (byte) 26), new ugd(802480018, true, new vp7(list, aq7Var, (Context) obj4, this.c, (mm40) obj3, (Function1) obj2)));
                return Unit.f46060a;
            case 3:
                r9u r9uVar = (r9u) obj4;
                ocl oclVar = (ocl) obj3;
                ctf0 ctf0Var = (ctf0) obj2;
                cfd cfdVar = (cfd) obj;
                cfdVar.getClass();
                v5l0 v5l0VarE = ((vjp) obj5).e();
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                boolean zD = j1q0Var.f15748a.d(ygpVar);
                ctf0Var.getClass();
                if (!cfdVar.d) {
                    if (cfdVar.c) {
                        mdmVarB = ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                    } else {
                        mdmVar = null;
                    }
                    if (cfdVar.b) {
                        wdd wddVar = wdd.f38967a;
                        a4xVarO0 = dyb.g0(wddVar, wddVar, wddVar, wddVar);
                    } else {
                        List list2 = cfdVar.e;
                        arrayList = new ArrayList(r3d.q(list2, 10));
                        for (it = list2.iterator(); it.hasNext(); it = it) {
                            jed jedVar = (jed) it.next();
                            jedVar.getClass();
                            cys0 cys0Var = jedVar.l;
                            List list3 = jedVar.m;
                            List list4 = jedVar.n;
                            y3n0Var = (y3n0) CollectionsKt.f0(list3);
                            if (y3n0Var != null) {
                                str = y3n0Var.b;
                            } else {
                                str = null;
                            }
                            str2 = "";
                            if (str == null) {
                                str = "";
                            }
                            String strT = vsm0.t(str);
                            y3n0Var2 = (y3n0) CollectionsKt.f0(list4);
                            if (y3n0Var2 != null) {
                                str3 = y3n0Var2.b;
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                str2 = str3;
                            }
                            String strT2 = vsm0.t(str2);
                            String strW = a8k0.w(jedVar.f, list3, cys0Var);
                            String strW2 = a8k0.w(jedVar.g, list4, cys0Var);
                            String str4 = jedVar.d;
                            String str5 = jedVar.e;
                            String str6 = jedVar.h;
                            String str7 = jedVar.i;
                            arrayList.add(new vdd(wwb.S(jedVar.b, cys0Var, new kbo(str4, strW, str5, strW2, strT, strT2, str6, str7, jedVar.o, "", "", jedVar.j, jedVar.k, this.c, kotlin.collections.a.c(new Pair(str6, str7))), v5l0VarE, ctf0Var, oim0.f25320a), jedVar));
                        }
                        a4xVarO0 = dyb.o0(arrayList);
                    }
                    return new dfd(mdmVar, a4xVarO0, zD);
                }
                mdmVarB = ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990);
                mdmVar = mdmVarB;
                if (cfdVar.b) {
                    wdd wddVar2 = wdd.f38967a;
                    a4xVarO0 = dyb.g0(wddVar2, wddVar2, wddVar2, wddVar2);
                } else {
                    List list5 = cfdVar.e;
                    arrayList = new ArrayList(r3d.q(list5, 10));
                    while (it.hasNext()) {
                        jed jedVar2 = (jed) it.next();
                        jedVar2.getClass();
                        cys0 cys0Var2 = jedVar2.l;
                        List list6 = jedVar2.m;
                        List list7 = jedVar2.n;
                        y3n0Var = (y3n0) CollectionsKt.f0(list6);
                        if (y3n0Var != null) {
                            str = y3n0Var.b;
                        } else {
                            str = null;
                        }
                        str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        String strT3 = vsm0.t(str);
                        y3n0Var2 = (y3n0) CollectionsKt.f0(list7);
                        if (y3n0Var2 != null) {
                            str3 = y3n0Var2.b;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str2 = str3;
                        }
                        String strT4 = vsm0.t(str2);
                        String strW3 = a8k0.w(jedVar2.f, list6, cys0Var2);
                        String strW4 = a8k0.w(jedVar2.g, list7, cys0Var2);
                        String str8 = jedVar2.d;
                        String str9 = jedVar2.e;
                        String str10 = jedVar2.h;
                        String str11 = jedVar2.i;
                        arrayList.add(new vdd(wwb.S(jedVar2.b, cys0Var2, new kbo(str8, strW3, str9, strW4, strT3, strT4, str10, str11, jedVar2.o, "", "", jedVar2.j, jedVar2.k, this.c, kotlin.collections.a.c(new Pair(str10, str11))), v5l0VarE, ctf0Var, oim0.f25320a), jedVar2));
                    }
                    a4xVarO0 = dyb.o0(arrayList);
                }
                return new dfd(mdmVar, a4xVarO0, zD);
            case 4:
                ehm0 ehm0Var = (ehm0) obj5;
                Function1 function1 = (Function1) obj4;
                ehm0 ehm0Var2 = (ehm0) obj3;
                ehm0 ehm0Var3 = (ehm0) obj2;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                if (ehm0Var.b) {
                    hcz.e(hczVar2, null, null, new ugd(-1269151495, true, new kfe(ehm0Var, z, function1, (byte) 7)), 3);
                    hcz.e(hczVar2, null, null, new ugd(425656432, true, new kfe(ehm0Var2, z, function1, (byte) 9)), 3);
                    hcz.e(hczVar2, null, null, new ugd(-1278974415, true, new kfe(ehm0Var3, z, function1, (byte) 11)), 3);
                }
                return Unit.f46060a;
            case 5:
                final liq liqVar = (liq) obj5;
                hiq hiqVar = (hiq) obj4;
                g9q0 g9q0Var = (g9q0) obj3;
                final x03 x03Var = (x03) obj2;
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                zcl zclVar = qmk.f28987a;
                float density = pi9Var.getDensity() * 6.0f;
                float density2 = pi9Var.getDensity() * 46.0f;
                float density3 = pi9Var.getDensity() * 22.0f;
                int i = 1;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32)) - density2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L)) - density3;
                float f = 0.0f;
                jge0 jge0Var = new jge0(0.0f, density, fIntBitsToFloat, fIntBitsToFloat2);
                float f2 = fIntBitsToFloat - 0.0f;
                float fI = f2 / q3d.i(liqVar.b);
                float f3 = (fIntBitsToFloat2 - density) / (hiqVar.d * 2);
                a4x a4xVar = liqVar.b;
                ArrayList arrayList2 = new ArrayList(r3d.q(a4xVar, 10));
                int i2 = 0;
                for (Object obj6 : a4xVar) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    miq miqVar = (miq) obj6;
                    arrayList2.add(new ne60((((long) Float.floatToRawIntBits(((-miqVar.f21856a) * f3) + Float.intBitsToFloat((int) (jge0Var.e() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(i2 * fI)) << 32)));
                    hiqVar = hiqVar;
                    i2 = i3;
                    f = f;
                }
                float f4 = f;
                hiq hiqVar2 = hiqVar;
                ArrayList arrayList3 = new ArrayList(arrayList2);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jge0Var.e() & 4294967295L));
                final w03 w03VarA = z03.a();
                if (!arrayList3.isEmpty()) {
                    arrayList3.add(0, new ne60((((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L) | (((long) Float.floatToRawIntBits(f4)) << 32)));
                    w03VarA.f(f4, fIntBitsToFloat3);
                    arrayList3.add(new ne60((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (((ne60) dw9.l(2, arrayList3)).f23370a >> 32)) - Float.intBitsToFloat((int) (((ne60) CollectionsKt.d0(arrayList3)).f23370a >> 32))) + Float.intBitsToFloat((int) (((ne60) CollectionsKt.d0(arrayList3)).f23370a >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (((ne60) dw9.l(2, arrayList3)).f23370a & 4294967295L)))) & 4294967295L)));
                    int size = arrayList3.size() - 1;
                    int i4 = 1;
                    while (i4 < size) {
                        long j = i4 == i ? ((ne60) arrayList3.get(0)).f23370a : ((ne60) arrayList3.get(i4 - 2)).f23370a;
                        long j2 = ((ne60) arrayList3.get(i4 - 1)).f23370a;
                        int i5 = size;
                        long j3 = ((ne60) arrayList3.get(i4)).f23370a;
                        int i6 = i4 + 1;
                        jge0 jge0Var2 = jge0Var;
                        ArrayList arrayList4 = arrayList3;
                        long j4 = ((ne60) arrayList3.get(i6)).f23370a;
                        int i7 = 1;
                        while (i7 < 11) {
                            float f5 = i7 / 10.0f;
                            long j5 = j3;
                            long j6 = j2;
                            w03VarA.e(kpb.l0(f5, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j4 >> 32))), kpb.l0(f5, Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j6 & 4294967295L)), Float.intBitsToFloat((int) (j5 & 4294967295L)), Float.intBitsToFloat((int) (j4 & 4294967295L))));
                            i7++;
                            f2 = f2;
                            j3 = j5;
                            i6 = i6;
                            j2 = j6;
                            j = j;
                        }
                        size = i5;
                        arrayList3 = arrayList4;
                        jge0Var = jge0Var2;
                        i4 = i6;
                        i = 1;
                    }
                }
                final jge0 jge0Var3 = jge0Var;
                float f6 = f2;
                w03 w03VarA2 = z03.a();
                w03.a(w03VarA2, w03VarA);
                w03VarA2.e(fIntBitsToFloat, Float.intBitsToFloat((int) (jge0Var3.e() & 4294967295L)));
                w03VarA2.e(0.0f, Float.intBitsToFloat((int) (jge0Var3.e() & 4294967295L)));
                w03VarA2.c();
                zcl zclVar2 = qmk.f28987a;
                int density4 = (int) (pi9Var.getDensity() * 12.0f);
                long jO = lgb.O(0, (int) (pi9Var.getDensity() * 38.0f), density4, density4);
                final hiq hiqVar3 = hiqVar2;
                long j7 = hiqVar3.c;
                float density5 = 64.0f * pi9Var.getDensity();
                if (j7 < 600) {
                    pair = new Pair(2, Long.valueOf(j7));
                } else {
                    int i8 = (int) (j7 / 300);
                    long j8 = 300;
                    while (i8 > ((int) (f6 / density5))) {
                        j8 += 300;
                        i8 = (int) (j7 / j8);
                    }
                    pair = new Pair(Integer.valueOf(i8), Long.valueOf(j8));
                }
                int iIntValue = ((Number) pair.f46059a).intValue();
                final long jLongValue = ((Number) pair.b).longValue();
                int i9 = iIntValue + 1;
                final ArrayList arrayList5 = new ArrayList(i9);
                int i10 = 0;
                while (i10 < i9) {
                    long j9 = ((long) i10) * jLongValue;
                    arrayList5.add(ahy.e0(g9q0Var, String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j9 / 60), Long.valueOf(j9 % 60)}, 2)), jO));
                    i10++;
                    w03VarA2 = w03VarA2;
                    hiqVar3 = hiqVar3;
                }
                final w03 w03Var = w03VarA2;
                int i11 = hiqVar3.b;
                final ArrayList arrayList6 = new ArrayList(i11);
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = i11;
                    int iAbs = Math.abs((hiqVar3.f13127a * i12) - hiqVar3.d);
                    arrayList6.add(ahy.e0(g9q0Var, liqVar.e == wev.b ? f140.i(iAbs + 50, Separators.PERCENT) : String.valueOf(iAbs), jO));
                    i12++;
                    i11 = i13;
                }
                final boolean z2 = this.c;
                return pi9Var.a(new Function1() { // from class: a.jiq
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v2, types: [float] */
                    /* JADX WARN: Type inference failed for: r11v3 */
                    /* JADX WARN: Type inference failed for: r11v4 */
                    /* JADX WARN: Type inference failed for: r1v11 */
                    /* JADX WARN: Type inference failed for: r1v3 */
                    /* JADX WARN: Type inference failed for: r1v4, types: [long] */
                    /* JADX WARN: Type inference failed for: r1v5 */
                    /* JADX WARN: Type inference failed for: r1v6 */
                    /* JADX WARN: Type inference failed for: r1v9 */
                    /* JADX WARN: Type inference failed for: r35v0, types: [float] */
                    /* JADX WARN: Type inference failed for: r41v0, types: [float] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) throws Throwable {
                        nr nrVar;
                        ?? r1;
                        long j10;
                        nr nrVar2;
                        long j11;
                        float f7;
                        wev wevVar;
                        nr nrVar3;
                        long j12;
                        int i14;
                        float f8;
                        float f9;
                        jiq jiqVar = this;
                        x03 x03Var2 = x03Var;
                        w03 w03Var2 = w03VarA;
                        w03 w03Var3 = w03Var;
                        fhl fhlVar = (fhl) obj7;
                        fhlVar.getClass();
                        hiq hiqVar4 = hiqVar3;
                        int i15 = hiqVar4.b;
                        liq liqVar2 = liqVar;
                        wev wevVar2 = liqVar2.e;
                        zcl zclVar3 = qmk.f28987a;
                        float fW0 = fhlVar.w0(1.0f);
                        float fW1 = fhlVar.w0(14.0f);
                        jge0 jge0Var4 = jge0Var3;
                        float f10 = jge0Var4.d;
                        float f11 = jge0Var4.c;
                        float f12 = jge0Var4.b;
                        float f13 = (f10 - f12) / (i15 - 1);
                        int i16 = i15 / 2;
                        Iterator it2 = arrayList6.iterator();
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            boolean zHasNext = it2.hasNext();
                            float f14 = f12;
                            boolean z3 = z2;
                            if (zHasNext) {
                                Object next = it2.next();
                                int i19 = i18 + 1;
                                if (i18 < 0) {
                                    q3d.p();
                                    throw null;
                                }
                                a9q0 a9q0Var = (a9q0) next;
                                fhl fhlVar2 = fhlVar;
                                if (i18 == i16 && wevVar2 == wev.f39038a) {
                                    i14 = i16;
                                    wevVar = wevVar2;
                                    fhlVar = fhlVar2;
                                    f8 = f10;
                                    f9 = f11;
                                } else {
                                    float f15 = (i18 * f13) + f14;
                                    float f16 = z3 ? -1.0f : 1.0f;
                                    int i20 = i16;
                                    wev wevVar3 = wevVar2;
                                    long jE0 = fhlVar2.E0();
                                    nr nrVarA0 = fhlVar2.A0();
                                    long jP = nrVarA0.p();
                                    nrVarA0.i().l();
                                    wevVar = wevVar3;
                                    try {
                                        ((fvt0) nrVarA0.b).z(f16, 1.0f, jE0);
                                        i14 = i20;
                                        f8 = f10;
                                        j12 = jP;
                                        f9 = f11;
                                        fhlVar = fhlVar2;
                                        try {
                                            fhl.Q(fhlVar, StaticColors.INSTANCE.m125getWhite100d7_KjU(), (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (((long) Float.floatToRawIntBits(f11)) << 32), fW0, 0, x03Var2, 464);
                                            nrVarA0.i().i();
                                            nrVarA0.H(j12);
                                            ahy.X(fhlVar, a9q0Var, f9 + fW1, f15 - (((int) (a9q0Var.c & 4294967295L)) / 2), z3);
                                        } catch (Throwable th) {
                                            th = th;
                                            nrVar3 = nrVarA0;
                                            defpackage.c.g(nrVar3, j12);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        nrVar3 = nrVarA0;
                                        j12 = jP;
                                    }
                                }
                                jiqVar = this;
                                f10 = f8;
                                i16 = i14;
                                wevVar2 = wevVar;
                                i18 = i19;
                                f11 = f9;
                                f12 = f14;
                                w03Var3 = w03Var3;
                                w03Var2 = w03Var2;
                                hiqVar4 = hiqVar4;
                                jge0Var4 = jge0Var4;
                            } else {
                                jge0 jge0Var5 = jge0Var4;
                                float f17 = f11;
                                w03 w03Var4 = w03Var2;
                                w03 w03Var5 = w03Var3;
                                hiq hiqVar5 = hiqVar4;
                                float f18 = f10;
                                long j13 = liqVar2.c.c;
                                long j14 = liqVar2.d.c;
                                zcl zclVar4 = qmk.f28987a;
                                ?? W0 = fhlVar.w0(1.0f);
                                float f19 = z3 ? -1.0f : 1.0f;
                                long jE1 = fhlVar.E0();
                                nr nrVarA1 = fhlVar.A0();
                                long jP2 = nrVarA1.p();
                                nrVarA1.i().l();
                                try {
                                    ((fvt0) nrVarA1.b).z(f19, 1.0f, jE1);
                                    float f20 = jge0Var5.f16474a;
                                    ?? r35 = f14 + W0;
                                    float f21 = jge0Var5.c;
                                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jge0Var5.e() & 4294967295L));
                                    nr nrVarA2 = fhlVar.A0();
                                    long jP3 = nrVarA2.p();
                                    nrVarA2.i().l();
                                    fhl fhlVar3 = fhlVar;
                                    try {
                                        ((fvt0) nrVarA2.b).k(f20, r35, f21, fIntBitsToFloat4, 1);
                                        try {
                                            nrVar = nrVarA1;
                                            nrVar2 = nrVarA2;
                                            j10 = jP3;
                                            try {
                                                fhl.C0(fhlVar3, w03Var4, j13, 0.0f, new vtm0(W0, 0.0f, 0, 0, null, 30), 52);
                                                fhl.C0(fhlVar3, w03Var5, y3d.c(0.5f, j13), 0.0f, null, 60);
                                                try {
                                                    try {
                                                        nrVar2.i().i();
                                                        nrVar2.H(j10);
                                                        float f22 = jge0Var5.f16474a;
                                                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jge0Var5.e() & 4294967295L));
                                                        float f23 = jge0Var5.c;
                                                        ?? r41 = f18 + W0;
                                                        nr nrVarA3 = fhlVar3.A0();
                                                        long jP4 = nrVarA3.p();
                                                        nrVarA3.i().l();
                                                        try {
                                                            ((fvt0) nrVarA3.b).k(f22, fIntBitsToFloat5, f23, r41, 1);
                                                            try {
                                                                j11 = jP4;
                                                                try {
                                                                    fhl.C0(fhlVar3, w03Var4, j14, 0.0f, new vtm0(W0, 0.0f, 0, 0, null, 30), 52);
                                                                    fhl.C0(fhlVar3, w03Var5, y3d.c(0.5f, j14), 0.0f, null, 60);
                                                                    nrVarA3.i().i();
                                                                    nrVarA3.H(j11);
                                                                    defpackage.c.g(nrVar, jP2);
                                                                    long j15 = hiqVar5.c;
                                                                    Iterator it3 = arrayList5.iterator();
                                                                    while (true) {
                                                                        int i21 = i17;
                                                                        if (!it3.hasNext()) {
                                                                            return Unit.f46060a;
                                                                        }
                                                                        Object next2 = it3.next();
                                                                        i17 = i21 + 1;
                                                                        if (i21 < 0) {
                                                                            q3d.p();
                                                                            throw null;
                                                                        }
                                                                        a9q0 a9q0Var2 = (a9q0) next2;
                                                                        long j16 = ((long) i21) * jLongValue;
                                                                        if (i21 == 0) {
                                                                            f7 = 0.0f;
                                                                        } else {
                                                                            f7 = ((f17 - jge0Var5.f16474a) * (j16 / j15)) - (((int) (a9q0Var2.c >> 32)) / 2);
                                                                        }
                                                                        ahy.X(fhlVar3, a9q0Var2, f7, Float.intBitsToFloat((int) (fhlVar3.d() & 4294967295L)) - ((int) (a9q0Var2.c & 4294967295L)), z3);
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    nrVarA3.i().i();
                                                                    nrVarA3.H(j11);
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                j11 = jP4;
                                                                nrVarA3.i().i();
                                                                nrVarA3.H(j11);
                                                                throw th;
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        r1 = W0;
                                                        defpackage.c.g(nrVar, r1);
                                                        throw th;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    W0 = jP2;
                                                    r1 = W0;
                                                    defpackage.c.g(nrVar, r1);
                                                    throw th;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                r1 = jP2;
                                                try {
                                                    nrVar2.i().i();
                                                    nrVar2.H(j10);
                                                    throw th;
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    defpackage.c.g(nrVar, r1);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            nrVar2 = nrVarA2;
                                            nrVar = nrVarA1;
                                            j10 = jP3;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        r1 = jP2;
                                        j10 = jP3;
                                        nrVar2 = nrVarA2;
                                        nrVar = nrVarA1;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    nrVar = nrVarA1;
                                    r1 = jP2;
                                }
                            }
                        }
                    }
                });
            case 6:
                hdz hdzVar = (hdz) obj5;
                Function1 function2 = (Function1) obj2;
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hcz.g(hczVar3, hdzVar.c(), null, null, new ugd(-1853715246, true, new z2w(hdzVar, (kie0) obj4, (pk5) obj3, this.c, function2)), 6);
                return Unit.f46060a;
            case 7:
                hxu hxuVar = (hxu) obj4;
                StepInputConfigModel stepInputConfigModel = (StepInputConfigModel) obj3;
                jg7 jg7Var = (jg7) obj2;
                bnk0 bnk0Var = (bnk0) obj;
                bnk0Var.getClass();
                pzw.E(bnk0Var, w6x.r(new Object[0], 0, ((rg20) obj5).g.b, z ? R.string.summary_possible_win : R.string.history_possible_win, Separators.SP), 0, 0, 0, 0, 62);
                int i14 = cy7.f5159a;
                pn40 pn40Var = pn40.f27267a;
                pzw.E(bnk0Var, cy7.e(pn40.p(stepInputConfigModel.g, !Intrinsics.d(hxuVar, hxu.h) ? hxuVar.f.b : stepInputConfigModel.f46382a * jg7Var.f16467a)), 0, R.color.static_green, 1, 0, 38);
                return Unit.f46060a;
            case 8:
                ehm0 ehm0Var4 = (ehm0) obj5;
                ehm0 ehm0Var5 = (ehm0) obj4;
                a4x a4xVar2 = (a4x) obj3;
                Function1 function3 = (Function1) obj2;
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                if (ehm0Var4.b) {
                    hcz.e(hczVar4, null, sre0.f32672a.b(rrb0.class), new ugd(1623034565, true, new kfe(function3, ehm0Var4, z, (byte) 14)), 1);
                }
                if (ehm0Var5.b) {
                    hcz.e(hczVar4, null, sre0.f32672a.b(m5h0.class), new ugd(2146840252, true, new ymo(ehm0Var5, b4)), 1);
                }
                hcz.e(hczVar4, null, null, nia0.c, 3);
                hczVar4.f(a4xVar2.size(), new zu90(b2, new so90((byte) 15), a4xVar2), new a580(a4xVar2, (byte) 19), new ugd(2039820996, true, new gic(a4xVar2, a4xVar2, function3, b3)));
                return Unit.f46060a;
            default:
                ArrayList arrayList7 = (ArrayList) obj5;
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                hczVar5.f(arrayList7.size(), new zcn0(new shq0((byte) 22), arrayList7, (byte) 25), new t9l0(arrayList7, (byte) 11), new ugd(2039820996, true, new jdr0(arrayList7, (mm40) obj4, (skb0) obj3, (Function1) obj2, this.c)));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ cw6(a8q0 a8q0Var, boolean z, pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3) {
        this.f5066a = (byte) 1;
        this.b = a8q0Var;
        this.c = z;
        this.d = pz40Var;
        this.e = pz40Var2;
        this.f = pz40Var3;
    }

    public /* synthetic */ cw6(Object obj, Object obj2, Object obj3, Object obj4, boolean z, byte b) {
        this.f5066a = b;
        this.b = obj;
        this.f = obj2;
        this.d = obj3;
        this.e = obj4;
        this.c = z;
    }

    public /* synthetic */ cw6(Object obj, Object obj2, boolean z, Object obj3, Object obj4, byte b) {
        this.f5066a = b;
        this.b = obj;
        this.f = obj2;
        this.c = z;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ cw6(Object obj, boolean z, Object obj2, Object obj3, Object obj4, byte b) {
        this.f5066a = b;
        this.b = obj;
        this.c = z;
        this.f = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
