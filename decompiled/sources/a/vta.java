package a;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vta implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37996a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ vta(pz40 pz40Var, omv omvVar, float f, pz40 pz40Var2, pz40 pz40Var3, pz40 pz40Var4) {
        this.c = pz40Var;
        this.g = omvVar;
        this.b = f;
        this.d = pz40Var2;
        this.e = pz40Var3;
        this.f = pz40Var4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        long j;
        long j2;
        byte b = this.f37996a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                pz40 pz40Var = (pz40) obj6;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = (a4x) pz40Var.getValue();
                hczVar.f(a4xVar.size(), new at7(new im8((byte) 29), a4xVar, (byte) 12), new wl0(a4xVar, (byte) 11), new ugd(2039820996, true, new yta(a4xVar, (omv) obj2, this.b, (pz40) obj5, (pz40) obj4, (pz40) obj3, pz40Var)));
                return Unit.f46060a;
            default:
                mch0 mch0Var = (mch0) obj6;
                w03 w03Var = (w03) obj5;
                w03 w03Var2 = (w03) obj4;
                w03 w03Var3 = (w03) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar.w0(4.0f);
                float fW1 = fhlVar.w0(1.0f);
                float fW2 = fhlVar.w0(28.0f) - fW1;
                int i = 0;
                int i2 = 0;
                while (i2 < 9) {
                    if (i2 != 4) {
                        float f = (i2 * fW2) + fW0;
                        fhl.Q(fhlVar, StaticColors.INSTANCE.m125getWhite100d7_KjU(), (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), fW1, 0, qjj.K(0.0f, new float[]{14.0f, 8.0f}), 464);
                    }
                    i2++;
                    arrayList = arrayList;
                    fW0 = fW0;
                }
                ArrayList arrayList2 = arrayList;
                long j3 = mch0Var.c.c;
                long j4 = mch0Var.d.c;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) / 2.0f;
                nr nrVarA0 = fhlVar.A0();
                long jP = nrVarA0.p();
                nrVarA0.i().l();
                try {
                    ((fvt0) nrVarA0.b).k(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                    zcl zclVar2 = qmk.f28987a;
                    fhl.C0(fhlVar, w03Var, j3, 0.0f, new vtm0(fhlVar.w0(1.0f), 0.0f, 0, 0, null, 30), 52);
                    j = jP;
                    try {
                        fhl.C0(fhlVar, w03Var2, y3d.c(0.5f, j3), 0.0f, null, 60);
                        nrVarA0.i().i();
                        nrVarA0.H(j);
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) / 2.0f;
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L));
                        nr nrVarA1 = fhlVar.A0();
                        long jP2 = nrVarA1.p();
                        nrVarA1.i().l();
                        try {
                            ((fvt0) nrVarA1.b).k(0.0f, fIntBitsToFloat3, fIntBitsToFloat4, fIntBitsToFloat5, 1);
                            j2 = jP2;
                            try {
                                fhl.C0(fhlVar, w03Var, j4, 0.0f, new vtm0(fhlVar.w0(1.0f), 0.0f, 0, 0, null, 30), 52);
                                fhl.C0(fhlVar, w03Var3, y3d.c(0.5f, j4), 0.0f, null, 60);
                                nrVarA1.i().i();
                                nrVarA1.H(j2);
                                float fW3 = fhlVar.w0(6.0f);
                                Iterator it = arrayList2.iterator();
                                while (true) {
                                    int i3 = i;
                                    if (!it.hasNext()) {
                                        return Unit.f46060a;
                                    }
                                    Object next = it.next();
                                    i = i3 + 1;
                                    if (i3 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    a9q0 a9q0Var = (a9q0) next;
                                    float fW4 = (fhlVar.w0(this.b) * i3) - (((int) (a9q0Var.c >> 32)) / 2);
                                    v2n0.o(fhlVar, a9q0Var, StaticColors.INSTANCE.m130getWhite600d7_KjU(), (((long) Float.floatToRawIntBits(fW4)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) + fW3)) & 4294967295L), 248);
                                }
                            } catch (Throwable th) {
                                th = th;
                                defpackage.c.g(nrVarA1, j2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j2 = jP2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        defpackage.c.g(nrVarA0, j);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    j = jP;
                }
                break;
        }
    }

    public /* synthetic */ vta(mch0 mch0Var, w03 w03Var, w03 w03Var2, w03 w03Var3, ArrayList arrayList, float f) {
        this.c = mch0Var;
        this.d = w03Var;
        this.e = w03Var2;
        this.f = w03Var3;
        this.g = arrayList;
        this.b = f;
    }
}
