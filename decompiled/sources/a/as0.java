package a;

import android.text.Layout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsScreenParams;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class as0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1369a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ as0(long j, float[] fArr, kie0 kie0Var, jie0 jie0Var) {
        this.f1369a = (byte) 7;
        this.b = j;
        this.c = fArr;
        this.d = kie0Var;
        this.e = jie0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        boolean z;
        float fA;
        float fA2;
        float fA3;
        j700 j700Var;
        mim0 mim0VarC0;
        kbo kboVar;
        mim0 mim0VarJ0;
        byte b = this.f1369a;
        long j2 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((vzg0) obj).getClass();
                hl1 hl1Var = ((pru) obj4).a().b;
                return new ur0(this.b, u5q.f35108a, qlk0.f28938a, x5d0.f40311a, hl1Var.u, hl1Var.N, ((bzt) obj3).f3488a.a().r, ((wyu) obj2).a());
            case 1:
                jge0 jge0Var = (jge0) obj4;
                mie0 mie0Var = (mie0) obj3;
                long j3 = this.b;
                a4d a4dVar = (a4d) obj2;
                g7z g7zVar = (g7z) obj;
                g7zVar.a();
                float f = jge0Var.f16474a;
                float f2 = jge0Var.b;
                a6a a6aVar = g7zVar.f10839a;
                ((fvt0) a6aVar.b.b).A(f, f2);
                try {
                    fhl.b0(g7zVar, (vz2) mie0Var.f21842a, j3, 0L, 0.0f, a4dVar, 0, 890);
                    return Unit.f46060a;
                } finally {
                    ((fvt0) a6aVar.b.b).A(-f, -f2);
                }
            case 2:
                pu90 pu90Var = (pu90) obj4;
                pu90 pu90Var2 = (pu90) obj3;
                pu90 pu90Var3 = (pu90) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, (p4e.i(j2) - pu90Var.f27604a) / 2, p4e.h(j2) - pu90Var.b, 0.0f);
                }
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, (p4e.i(j2) - pu90Var2.f27604a) / 2, p4e.h(j2) - pu90Var2.b, 0.0f);
                }
                if (pu90Var3 != null) {
                    ou90Var.m(pu90Var3, 0, p4e.h(j2) - pu90Var3.b, 0.0f);
                }
                return Unit.f46060a;
            case 3:
                long j4 = this.b;
                w03 w03Var = (w03) obj2;
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                float fFloatValue = ((Number) ((Function0) obj4).invoke()).floatValue();
                float fMax = (Math.max(Math.min(1.0f, fFloatValue) - 0.4f, 0.0f) * 5.0f) / 3.0f;
                float fC = l1e0.c(Math.abs(fFloatValue) - 1.0f, 0.0f, 2.0f);
                float fPow = (((fMax * 0.4f) - 0.25f) + (fC - (((float) Math.pow(fC, 2.0d)) / 4.0f))) * 0.5f;
                float f3 = fPow * 360.0f;
                float f4 = ((fMax * 0.8f) + fPow) * 360.0f;
                isl islVar = new isl(fPow, f3, f4, Math.min(1.0f, fMax));
                float fFloatValue2 = ((Number) ((l7m0) obj3).getValue()).floatValue();
                long jE0 = fhlVar.E0();
                nr nrVarA0 = fhlVar.A0();
                long jP = nrVarA0.p();
                nrVarA0.i().l();
                try {
                    ((fvt0) nrVarA0.b).y(fPow, jE0);
                    float fW0 = fhlVar.w0(5.5f);
                    float f5 = mom.d;
                    jge0 jge0VarQ = k9x.q((fhlVar.w0(f5) / 2.0f) + fW0, p7x.u(fhlVar.d()));
                    fhl.V(fhlVar, j4, f3, f4 - f3, jge0VarQ.g(), jge0VarQ.f(), fFloatValue2, new vtm0(fhlVar.w0(f5), 0.0f, 0, 0, null, 26), 768);
                    mom.e(fhlVar, w03Var, jge0VarQ, j4, fFloatValue2, islVar, f5);
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVarA0, jP);
                }
            case 4:
                nnp nnpVar = (nnp) obj4;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                vjp vjpVar = nnpVar.B;
                FeedsChampsItemsScreenParams feedsChampsItemsScreenParams = nnpVar.T;
                k0w0Var.h(vjpVar.c(feedsChampsItemsScreenParams.d, feedsChampsItemsScreenParams.b, new p8h0(j2, (aj00) obj3, (String) obj2), xun.f41520a, -1L, ""));
                return Unit.f46060a;
            case 5:
                nnp nnpVar2 = (nnp) obj4;
                String str = (String) obj3;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                vjp vjpVar2 = nnpVar2.B;
                FeedsChampsItemsScreenParams feedsChampsItemsScreenParams2 = nnpVar2.T;
                k0w0Var2.h(vjpVar2.c(feedsChampsItemsScreenParams2.d, feedsChampsItemsScreenParams2.b, new m8h0(str, CollectionsKt.P0(feedsChampsItemsScreenParams2.c), feedsChampsItemsScreenParams2.e), (Set) obj2, this.b, str));
                return Unit.f46060a;
            case 6:
                ((ou90) obj).H(new mz0(obj3, this.b, obj2, (byte) 20));
                ((dez) obj4).f5975a.u.getValue();
                return Unit.f46060a;
            case 7:
                float[] fArr = (float[]) obj4;
                kie0 kie0Var = (kie0) obj3;
                jie0 jie0Var = (jie0) obj2;
                yn80 yn80Var = (yn80) obj;
                int i = yn80Var.b;
                s03 s03Var = yn80Var.f42927a;
                int iE = yn80Var.c;
                int iF = i > o9q0.f(j2) ? yn80Var.b : o9q0.f(j2);
                if (iE >= o9q0.e(j2)) {
                    iE = o9q0.e(j2);
                }
                long jE = s7n0.e(yn80Var.d(iF), yn80Var.d(iE));
                int i2 = kie0Var.f18333a;
                y8q0 y8q0Var = s03Var.d;
                int iF2 = o9q0.f(jE);
                int iE2 = o9q0.e(jE);
                Layout layout = y8q0Var.f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    ycx.a("startOffset must be > 0");
                }
                if (iF2 >= length) {
                    ycx.a("startOffset must be less than text length");
                }
                if (iE2 <= iF2) {
                    ycx.a("endOffset must be greater than startOffset");
                }
                if (iE2 > length) {
                    ycx.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i2 < (iE2 - iF2) * 4) {
                    ycx.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iF3 = y8q0Var.f(iF2);
                int iF4 = y8q0Var.f(iE2 - 1);
                tlw tlwVar = new tlw(y8q0Var);
                if (iF3 <= iF4) {
                    while (true) {
                        int lineStart = layout.getLineStart(iF3);
                        int iE3 = y8q0Var.e(iF3);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE2, iE3);
                        float fH = y8q0Var.h(iF3);
                        float fD = y8q0Var.d(iF3);
                        j = jE;
                        boolean z2 = layout.getParagraphDirection(iF3) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z2 || zIsRtlCharAt) {
                                z = z2;
                                if (z && zIsRtlCharAt) {
                                    fA3 = tlwVar.a(iMax, false, false, false);
                                    fA = tlwVar.a(iMax + 1, true, true, false);
                                } else {
                                    if (z || !zIsRtlCharAt) {
                                        fA = tlwVar.a(iMax, false, false, false);
                                        fA2 = tlwVar.a(iMax + 1, true, true, false);
                                    } else {
                                        fA2 = tlwVar.a(iMax, false, false, true);
                                        fA = tlwVar.a(iMax + 1, true, true, true);
                                    }
                                    fA3 = fA2;
                                }
                            } else {
                                z = z2;
                                fA = tlwVar.a(iMax, false, false, true);
                                fA3 = tlwVar.a(iMax + 1, true, true, true);
                            }
                            fArr[i2] = fA;
                            fArr[i2 + 1] = fH;
                            fArr[i2 + 2] = fA3;
                            fArr[i2 + 3] = fD;
                            i2 += 4;
                            iMax++;
                            z2 = z;
                        }
                        int i3 = i2;
                        if (iF3 != iF4) {
                            iF3++;
                            jE = j;
                            i2 = i3;
                        }
                    }
                } else {
                    j = jE;
                }
                int iD = (o9q0.d(j) * 4) + kie0Var.f18333a;
                for (int i4 = kie0Var.f18333a; i4 < iD; i4 += 4) {
                    int i5 = i4 + 1;
                    float f6 = fArr[i5];
                    float f7 = jie0Var.f16571a;
                    fArr[i5] = f6 + f7;
                    int i6 = i4 + 3;
                    fArr[i6] = fArr[i6] + f7;
                }
                kie0Var.f18333a = iD;
                jie0Var.f16571a += s03Var.f;
                return Unit.f46060a;
            case 8:
                String strConcat = (String) obj4;
                Map map = (Map) obj3;
                pz40 pz40Var = (pz40) obj2;
                FixedWebView fixedWebView = (FixedWebView) obj;
                fixedWebView.getClass();
                prs0 prs0Var = new prs0(strConcat, map, Long.valueOf(j2));
                if (!prs0Var.equals(pz40Var.getValue())) {
                    pz40Var.setValue(prs0Var);
                    if (!kotlin.text.c.x(strConcat, "http", false) && !kotlin.text.c.x(strConcat, "mailto", false) && !kotlin.text.c.x(strConcat, "tel", false)) {
                        strConcat = "http://".concat(strConcat);
                    }
                    fixedWebView.d(strConcat, map);
                }
                return Unit.f46060a;
            case 9:
                r4b0 r4b0Var = (r4b0) obj4;
                String str2 = (String) obj3;
                Set set = (Set) obj2;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                vjp vjpVar3 = r4b0Var.e;
                int iOrdinal = r4b0Var.l.ordinal();
                if (iOrdinal == 0) {
                    j700Var = j700.b;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    j700Var = j700.f16016a;
                }
                k0w0Var3.h(vjpVar3.b(j700Var, new m8h0(str2), set, this.b, str2));
                return Unit.f46060a;
            case 10:
                long j5 = this.b;
                w03 w03Var2 = (w03) obj2;
                fhl fhlVar2 = (fhl) obj;
                float fInvoke = ((ilq) obj4).invoke();
                float fMax2 = (Math.max(Math.min(1.0f, fInvoke) - 0.4f, 0.0f) * 5.0f) / 3.0f;
                float fC2 = l1e0.c(Math.abs(fInvoke) - 1.0f, 0.0f, 2.0f);
                float fPow2 = (((fMax2 * 0.4f) - 0.25f) + (fC2 - (((float) Math.pow(fC2, 2.0d)) / 4.0f))) * 0.5f;
                float f8 = fPow2 * 360.0f;
                float f9 = ((fMax2 * 0.8f) + fPow2) * 360.0f;
                float fMin = Math.min(1.0f, fMax2);
                yx3 yx3Var = new yx3();
                yx3Var.f43402a = f9;
                yx3Var.b = fMin;
                float fFloatValue3 = ((Number) ((l7m0) obj3).getValue()).floatValue();
                long jE1 = fhlVar2.E0();
                nr nrVarA1 = fhlVar2.A0();
                long jP2 = nrVarA1.p();
                nrVarA1.i().l();
                try {
                    ((fvt0) nrVarA1.b).y(fPow2, jE1);
                    jge0 jge0VarQ2 = k9x.q((fhlVar2.w0(2.5f) / 2.0f) + fhlVar2.w0(5.5f), p7x.u(fhlVar2.d()));
                    fhl.V(fhlVar2, j5, f8, f9 - f8, jge0VarQ2.g(), jge0VarQ2.f(), fFloatValue3, new vtm0(fhlVar2.w0(2.5f), 0.0f, 0, 0, null, 26), 768);
                    idx.u(fhlVar2, w03Var2, jge0VarQ2, j5, fFloatValue3, yx3Var);
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVarA1, jP2);
                }
            case 11:
                ctf0 ctf0Var = (ctf0) obj4;
                r9u r9uVar = (r9u) obj2;
                a5g0 a5g0Var = (a5g0) obj;
                a5g0Var.getClass();
                v5l0 v5l0VarE = ((vjp) obj3).e();
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                boolean zD = j1q0Var.f15748a.d(ygpVar);
                ctf0Var.getClass();
                ArrayList arrayList = a5g0Var.f270a;
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e8g0 e8g0Var = (e8g0) it.next();
                    e8g0Var.getClass();
                    lho lhoVar = e8g0Var.e;
                    String str3 = e8g0Var.g;
                    String str4 = e8g0Var.f;
                    ufp0 ufp0Var = e8g0Var.b;
                    ufp0 ufp0Var2 = e8g0Var.c;
                    cys0 cys0VarV = wvb.V(j2, q3d.j(ufp0Var, ufp0Var2));
                    String strT = vsm0.t(ufp0Var.d);
                    String strT2 = vsm0.t(ufp0Var2.d);
                    String str5 = ufp0Var.b;
                    String str6 = ufp0Var2.b;
                    boolean z3 = str4.length() == 0 || str3.length() == 0;
                    long j6 = e8g0Var.i;
                    Iterator it2 = it;
                    int iOrdinal2 = e8g0Var.h.ordinal();
                    kbo kboVar2 = new kbo(str5, strT, str6, strT2, "", "", str4, str3, z3, "", "", j6, iOrdinal2 != 1 ? iOrdinal2 != 2 ? 0 : 2 : 1, ctf0Var.h(), kotlin.collections.a.c(new Pair(str4, str3)));
                    int iOrdinal3 = lhoVar.ordinal();
                    long j7 = e8g0Var.d;
                    nim0 nim0Var = nim0.f23597a;
                    if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            kboVar = kboVar2;
                            mim0VarJ0 = wwb.S(j7, cys0VarV, kboVar, v5l0VarE, ctf0Var, nim0Var);
                        } else {
                            kboVar = kboVar2;
                            mim0VarJ0 = vtb.j0(j7, cys0VarV, kboVar, v5l0VarE, ctf0Var, nim0Var);
                        }
                        mim0VarC0 = mim0VarJ0;
                    } else {
                        ufp0Var = ufp0Var;
                        ufp0Var2 = ufp0Var2;
                        mim0VarC0 = ntb.c0(j7, cys0VarV, kboVar2, v5l0VarE, nim0Var);
                        kboVar = kboVar2;
                    }
                    arrayList2.add(new dyl0(e8g0Var.d, e8g0Var.f7370a, lhoVar, mim0VarC0, kboVar, ufp0Var.e, ufp0Var2.e));
                    it = it2;
                }
                return new b5g0(dyb.r0(arrayList2), zD);
            case 12:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                c8d c8dVar = (c8d) k0w0Var4.b(new b1w0(new i4s0((k4s0) obj4, this.b, (z1s0) obj3, (String) obj2, null, (byte) 0))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 13:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                c8d c8dVar2 = (c8d) k0w0Var5.b(new b1w0(new i4s0((n6s0) obj4, this.b, (z1s0) obj3, (String) obj2, null, (byte) 1))).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                return Unit.f46060a;
            default:
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                c8d c8dVar3 = (c8d) k0w0Var6.b(new b1w0(new i4s0((l7s0) obj4, this.b, (z1s0) obj3, (String) obj2, null, (byte) 2))).f14945a;
                bjk bjkVar3 = cfx0.o;
                c8dVar3.f3908a = new v7d(true, bjkVar3, bjkVar3);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ as0(i3t0 i3t0Var, long j, Serializable serializable, String str, byte b) {
        this.f1369a = b;
        this.c = i3t0Var;
        this.b = j;
        this.d = serializable;
        this.e = str;
    }

    public /* synthetic */ as0(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.f1369a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }

    public /* synthetic */ as0(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.f1369a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }
}
