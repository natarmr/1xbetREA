package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n2m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22808a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ v6n c;

    public /* synthetic */ n2m(int i, v6n v6nVar) {
        this.b = i;
        this.c = v6nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22808a;
        v6n v6nVar = this.c;
        int i = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                vdb.h(v6nVar, fetVar, x8x.L(i | 1));
                break;
            default:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    float fB = pkd.b(12.0f, fetVar) - (i * 2);
                    pz40 pz40Var = s6t0.f31722a;
                    long background = s6t0.b().f33626a.getBackground();
                    ugg0 ugg0Var = vgg0.f37379a;
                    qed0 qed0Var = new qed0(fB);
                    ugg0 ugg0Var2 = new ugg0(qed0Var, qed0Var, qed0Var, qed0Var);
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarQ = i120.Q(jm40Var, background, ugg0Var2);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
                    mm40 mm40VarJ = s5x0.J(jm40Var, 2.0f);
                    boolean zG = fetVar.g(v6nVar);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new m2m(v6nVar, (byte) 3);
                        fetVar.o0(objP);
                    }
                    kkb.p(0, fetVar, mm40VarJ, (Function0) objP);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ n2m(v6n v6nVar, int i) {
        this.c = v6nVar;
        this.b = i;
    }
}
