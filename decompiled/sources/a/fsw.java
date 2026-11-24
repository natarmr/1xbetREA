package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fsw implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10085a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ long d;

    public /* synthetic */ fsw(mm40 mm40Var, pz40 pz40Var, long j, byte b) {
        this.f10085a = b;
        this.b = mm40Var;
        this.c = pz40Var;
        this.d = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f10085a;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    kr00.a(u1c.M(-867271887, new fsw(this.b, this.c, this.d, (byte) 1), fetVar), fetVar, 6);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    qw3 qw3Var = new qw3(2.0f, true, new jf4((byte) 14));
                    mm40 mm40VarN = s5x0.N(hp4.B(this.b), 0.0f, 2.0f, 0.0f, 0.0f, 13);
                    x5d x5dVarA = w5d.a(qw3Var, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    fetVar.e0(-789476365);
                    pz40 pz40Var = this.c;
                    int i = 0;
                    for (Object obj3 : (Iterable) pz40Var.getValue()) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        elo0 elo0Var = (elo0) obj3;
                        boolean zE = fetVar.e(i) | fetVar.g(pz40Var);
                        long j = this.d;
                        boolean zF = zE | fetVar.f(j);
                        Object objP = fetVar.P();
                        cl5 cl5Var = ukd.f35823a;
                        if (zF || objP == cl5Var) {
                            mu7 mu7Var = new mu7((byte) 4, i, j, pz40Var);
                            fetVar.o0(mu7Var);
                            objP = mu7Var;
                        }
                        mm40 mm40VarK = rq8.K(jm40.b, (Function1) objP);
                        Object objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = new h7w((byte) 13);
                            fetVar.o0(objP2);
                        }
                        vko0.a(mm40VarK, elo0Var, (Function1) objP2, fetVar, 384);
                        i = i2;
                    }
                    fetVar.r(false);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
        }
    }
}
