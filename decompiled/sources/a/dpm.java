package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dpm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6475a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ jpm c;
    public final /* synthetic */ kpm d;

    public /* synthetic */ dpm(mm40 mm40Var, jpm jpmVar, kpm kpmVar) {
        this.b = mm40Var;
        this.c = jpmVar;
        this.d = kpmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f6475a;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    jpm jpmVar = this.c;
                    mm40 mm40VarE = mm40Var.e(jpmVar.f16909a);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    kpm kpmVar = this.d;
                    rpm rpmVar = kpmVar.f18683a;
                    if (rpmVar.equals(npm.f23920a) || rpmVar.equals(opm.f25648a)) {
                        fetVar.e0(1718356978);
                        e3c.g(null, jpmVar, kpmVar, fetVar, 0);
                        fetVar.r(false);
                    } else if (rpmVar.equals(ppm.f27380a)) {
                        fetVar.e0(1718359991);
                        e3c.m(null, jpmVar, kpmVar, 40.0f, qmk.f, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        if (!rpmVar.equals(qpm.f29126a)) {
                            throw b1j.f(1718354244, fetVar, false);
                        }
                        fetVar.e0(1718368118);
                        e3c.m(null, jpmVar, kpmVar, 32.0f, qmk.e, fetVar, 0);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                e3c.g(mm40Var, this.c, this.d, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ dpm(mm40 mm40Var, jpm jpmVar, kpm kpmVar, int i) {
        this.b = mm40Var;
        this.c = jpmVar;
        this.d = kpmVar;
    }
}
