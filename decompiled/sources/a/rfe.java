package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rfe implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30384a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ rfe(t4m t4mVar, w03 w03Var, w03 w03Var2, boolean z, e900 e900Var, e900 e900Var2, jge0 jge0Var, j4m j4mVar) {
        this.c = t4mVar;
        this.d = w03Var;
        this.e = w03Var2;
        this.b = z;
        this.f = e900Var;
        this.g = e900Var2;
        this.h = jge0Var;
        this.i = j4mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [a.e900, a.t89] */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        byte b;
        boolean z;
        boolean z2;
        long j;
        byte b2 = this.f30384a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        boolean z3 = this.b;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (b2) {
            case 0:
                ehm0 ehm0Var = (ehm0) obj8;
                ehm0 ehm0Var2 = (ehm0) obj7;
                ehm0 ehm0Var3 = (ehm0) obj6;
                db00 db00Var = (db00) obj4;
                ehm0 ehm0Var4 = (ehm0) obj5;
                List list = (List) obj3;
                Function1 function1 = (Function1) obj2;
                xdz xdzVar = (xdz) obj;
                xdzVar.getClass();
                if (ehm0Var.b) {
                    z2 = z3;
                    b = 0;
                    z = true;
                    xdz.d(xdzVar, new ugd(-1884268389, true, new kfe(function1, ehm0Var, z2, b)));
                } else {
                    b = 0;
                    z = true;
                    z2 = z3;
                }
                if (ehm0Var2.b) {
                    xdz.d(xdzVar, new ugd(1983776260, z, new lfe(ehm0Var2, function1, b)));
                }
                if (ehm0Var3.b) {
                    xdz.d(xdzVar, new ugd(1891221987, z, new kfe(ehm0Var3, z2, function1, (byte) 2)));
                }
                if (db00Var.a()) {
                    xdz.d(xdzVar, new ugd(1798667714, z, new mfe(db00Var, z2, function1, (byte) 0)));
                }
                if (ehm0Var4.b) {
                    xdz.d(xdzVar, new ugd(1706113441, z, new kfe(ehm0Var4, z2, function1, (byte) 3)));
                }
                xdzVar.e(list.size(), new at7(new bqd((byte) 4), list, (byte) 27), new dx8(list, (byte) 21), null, new ugd(-1466459515, true, new vb(list, function1, (byte) 22)));
                return Unit.f46060a;
            default:
                t4m t4mVar = (t4m) obj8;
                w03 w03Var = (w03) obj7;
                w03 w03Var2 = (w03) obj6;
                long j2 = (e900) obj5;
                e900 e900Var = (e900) obj4;
                jge0 jge0Var = (jge0) obj3;
                j4m j4mVar = (j4m) obj2;
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar.w0(2.0f);
                jge0 jge0VarD = w03Var.d();
                float f = z3 ? -1.0f : 1.0f;
                long jE0 = fhlVar.E0();
                nr nrVarA0 = fhlVar.A0();
                long jP = nrVarA0.p();
                nrVarA0.i().l();
                try {
                    try {
                        ((fvt0) nrVarA0.b).z(f, 1.0f, jE0);
                        float f2 = jge0VarD.f16474a;
                        float f3 = jge0Var.b;
                        float f4 = jge0Var.d;
                        float f5 = f3 - fW0;
                        float f6 = jge0Var.c;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (jge0Var.e() & 4294967295L));
                        nr nrVarA1 = fhlVar.A0();
                        long jP2 = nrVarA1.p();
                        nrVarA1.i().l();
                        try {
                            ((fvt0) nrVarA1.b).k(f2, f5, f6, fIntBitsToFloat, 1);
                            try {
                                try {
                                    fhl.C0(fhlVar, w03Var, t4mVar.b.c, 0.0f, new vtm0(fW0, 0.0f, 0, 0, null, 30), 52);
                                    fhl.K0(fhlVar, w03Var2, j2, 0.0f, null, 60);
                                    nrVarA1.i().i();
                                    nrVarA1.H(jP2);
                                    float f7 = jge0VarD.f16474a;
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jge0Var.e() & 4294967295L));
                                    float f8 = jge0Var.c;
                                    float f9 = f4 + fW0;
                                    nr nrVarA2 = fhlVar.A0();
                                    long jP3 = nrVarA2.p();
                                    nrVarA2.i().l();
                                    try {
                                        ((fvt0) nrVarA2.b).k(f7, fIntBitsToFloat2, f8, f9, 1);
                                        j = jP3;
                                        try {
                                            fhl.C0(fhlVar, w03Var, t4mVar.c.c, 0.0f, new vtm0(fW0, 0.0f, 0, 0, null, 30), 52);
                                            fhl.K0(fhlVar, w03Var2, e900Var, 0.0f, null, 60);
                                            nrVarA2.i().i();
                                            nrVarA2.H(j);
                                            defpackage.c.g(nrVarA0, jP);
                                            List listT0 = j4mVar.c;
                                            if (z3) {
                                                listT0 = CollectionsKt.t0(listT0);
                                            }
                                            float f10 = j4mVar.e;
                                            float fW1 = fhlVar.w0(8.0f);
                                            float fW2 = fhlVar.w0(f10);
                                            int i = 0;
                                            for (Object obj9 : listT0) {
                                                int i2 = i + 1;
                                                if (i < 0) {
                                                    q3d.p();
                                                    throw null;
                                                }
                                                a9q0 a9q0Var = (a9q0) obj9;
                                                float f11 = i * fW2;
                                                float f12 = f11 - (((int) (a9q0Var.c >> 32)) / 2.0f);
                                                if (i == 0) {
                                                    f12 = 0.0f;
                                                } else if (i == listT0.size() - 1) {
                                                    float f13 = (int) (a9q0Var.c >> 32);
                                                    float f14 = (f13 / 2.0f) + f11;
                                                    float f15 = jge0Var.c;
                                                    if (f15 <= f14) {
                                                        f12 = f15 - f13;
                                                    }
                                                }
                                                v2n0.o(fhlVar, a9q0Var, StaticColors.INSTANCE.m129getWhite400d7_KjU(), (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f4 + fW1)) & 4294967295L), 248);
                                                i = i2;
                                            }
                                            return Unit.f46060a;
                                        } catch (Throwable th) {
                                            th = th;
                                            nrVarA2.i().i();
                                            nrVarA2.H(j);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        j = jP3;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    nrVarA1.i().i();
                                    nrVarA1.H(jP2);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        j2 = jP;
                        defpackage.c.g(nrVarA0, j2);
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    defpackage.c.g(nrVarA0, j2);
                    throw th;
                }
                break;
        }
    }

    public /* synthetic */ rfe(ehm0 ehm0Var, ehm0 ehm0Var2, ehm0 ehm0Var3, db00 db00Var, ehm0 ehm0Var4, List list, Function1 function1, boolean z) {
        this.c = ehm0Var;
        this.d = ehm0Var2;
        this.e = ehm0Var3;
        this.g = db00Var;
        this.f = ehm0Var4;
        this.h = list;
        this.i = function1;
        this.b = z;
    }
}
