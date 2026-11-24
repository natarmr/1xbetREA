package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iu60 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15382a;
    public final /* synthetic */ bxa b;
    public final /* synthetic */ pz40 c;

    public /* synthetic */ iu60(bxa bxaVar, pz40 pz40Var, byte b) {
        this.f15382a = b;
        this.b = bxaVar;
        this.c = pz40Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        long textPrimary;
        byte b = this.f15382a;
        jm40 jm40Var = jm40.b;
        pz40 pz40Var = this.c;
        bxa bxaVar = this.b;
        byte b2 = 4;
        byte b3 = 1;
        switch (b) {
            case 0:
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    jiq0.x(u1c.M(800509619, new iu60(bxaVar, pz40Var, b3), fetVar), fetVar, 6);
                    String str = bxaVar.d;
                    boolean z = bxaVar.e;
                    String str2 = bxaVar.f;
                    if (bxaVar.g) {
                        pz40 pz40Var2 = s6t0.f31722a;
                        textPrimary = s6t0.b().f33626a.getSecondary60();
                    } else {
                        pz40 pz40Var3 = s6t0.f31722a;
                        textPrimary = s6t0.b().f33626a.getTextPrimary();
                    }
                    long j = textPrimary;
                    mm40 mm40VarA = yhg0Var.a(1.0f, jm40Var, true);
                    zcl zclVar = qmk.f28987a;
                    jiq0.m(s5x0.N(mm40VarA, 12.0f, 0.0f, 0.0f, 0.0f, 14), str, z, str2, j, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ir8 ir8Var = (ir8) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir8Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(ir8Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    n0x n0xVar = bxaVar.b;
                    n0x n0xVar2 = bxaVar.c;
                    m0x m0xVar = new m0x(R.drawable.ic_games_square, null, 6);
                    Object objP = fetVar2.P();
                    if (objP == ukd.f35823a) {
                        objP = new y9v(pz40Var, (byte) 22);
                        fetVar2.o0(objP);
                    }
                    y9a.f(n0xVar, n0xVar2, m0xVar, (Function1) objP, u1c.M(-487482250, new csw(ir8Var, b2), fetVar2), fetVar2, 27648, 0);
                    if (bxaVar.g) {
                        fetVar2.e0(-1970589445);
                        mm40 mm40VarA2 = ir8Var.a(jm40Var);
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarJ = lgb.J(mm40VarA2, vgg0.a(10.0f));
                        pz40 pz40Var4 = s6t0.f31722a;
                        mm40 mm40VarQ = i120.Q(mm40VarJ, s6t0.b().f33626a.getBackgroundLight60(), jd8.n);
                        tj30 tj30VarC = zq8.c(gqw0.e, false);
                        int iHashCode = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM = fetVar2.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(e7z.u1);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC, gqw0.x);
                        jpm0.o(fetVar2, bh90VarM, gqw0.w);
                        jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar2);
                        jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                        j0x.b(a8k0.F(R.drawable.ic_technical_works, 0, fetVar2), null, null, null, null, 0.0f, null, fetVar2, 56, 124);
                        fetVar2.r(true);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1970047441);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
