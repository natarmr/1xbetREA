package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m4m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21178a = 2;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m4m(j4m j4mVar, float f, boolean z, float f2, x03 x03Var) {
        this.e = j4mVar;
        this.b = f;
        this.d = z;
        this.c = f2;
        this.f = x03Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        float f;
        long j;
        float f2;
        long jFloatToRawIntBits;
        nr nrVar;
        byte b = this.f21178a;
        long j2 = 4294967295L;
        float f3 = 0.0f;
        float f4 = this.b;
        boolean z = this.d;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                float f5 = this.c;
                x03 x03Var = (x03) obj2;
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                Iterator it = ((j4m) obj3).d.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    r4m r4mVar = (r4m) next;
                    float f6 = (i * f4) + (((int) (r4mVar.c.c & j2)) / 2.0f);
                    if (r4mVar.f29842a) {
                        float f7 = z ? -1.0f : 1.0f;
                        long jE0 = fhlVar.E0();
                        nr nrVarA0 = fhlVar.A0();
                        j = j2;
                        long jP = nrVarA0.p();
                        nrVarA0.i().l();
                        f2 = f3;
                        try {
                            ((fvt0) nrVarA0.b).z(f7, 1.0f, jE0);
                            f = f5;
                            nrVar = nrVarA0;
                            try {
                                fhl.Q(fhlVar, StaticColors.INSTANCE.m125getWhite100d7_KjU(), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f6)) & j), (((long) Float.floatToRawIntBits(f6)) & j) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - fhlVar.w0(q4m.f28104a))) << 32), f, 0, x03Var, 464);
                                defpackage.c.g(nrVar, jP);
                            } catch (Throwable th) {
                                th = th;
                                defpackage.c.g(nrVar, jP);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            nrVar = nrVarA0;
                        }
                    } else {
                        f = f5;
                        j = j2;
                        f2 = f3;
                    }
                    if (r4mVar.b) {
                        a9q0 a9q0Var = r4mVar.c;
                        float f8 = f6 - (((int) (a9q0Var.c & j)) / 2.0f);
                        if (z) {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(-a9q0Var.g(0))) << 32) | (((long) Float.floatToRawIntBits(f8)) & j);
                        } else {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - a9q0Var.h(0))) << 32) | (((long) Float.floatToRawIntBits(f8)) & j);
                        }
                        v2n0.o(fhlVar, a9q0Var, StaticColors.INSTANCE.m129getWhite400d7_KjU(), jFloatToRawIntBits, 248);
                    }
                    it = it;
                    f5 = f;
                    i = i2;
                    j2 = j;
                    f3 = f2;
                }
                return Unit.f46060a;
            case 1:
                prm prmVar = (prm) obj2;
                prmVar.getClass();
                ((Function1) obj3).invoke(Float.valueOf(qcc.N(((ne60) obj).f23370a, this.b, this.c, prmVar.d, this.d)));
                return Unit.f46060a;
            default:
                d9d0 d9d0Var = (d9d0) obj3;
                yjj0 yjj0Var = (yjj0) obj2;
                uag0 uag0Var = (uag0) obj;
                boolean z2 = ((Number) d9d0Var.f5695a.d()).floatValue() > 0.0f || z;
                uag0Var.I((((Number) d9d0Var.f5695a.d()).floatValue() * uag0Var.T(f4)) - Float.intBitsToFloat((int) (4294967295L & uag0Var.r)));
                uag0Var.C(z2 ? uag0Var.t.getDensity() * this.c : 0.0f);
                uag0Var.D(yjj0Var);
                uag0Var.g(true);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ m4m(d9d0 d9d0Var, boolean z, float f, float f2, yjj0 yjj0Var) {
        this.e = d9d0Var;
        this.d = z;
        this.b = f;
        this.c = f2;
        this.f = yjj0Var;
    }

    public /* synthetic */ m4m(Function1 function1, prm prmVar, float f, float f2, boolean z) {
        this.e = function1;
        this.f = prmVar;
        this.b = f;
        this.c = f2;
        this.d = z;
    }
}
