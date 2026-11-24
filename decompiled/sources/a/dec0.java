package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dec0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5944a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dec0(float f, float f2, Object obj, byte b) {
        this.f5944a = b;
        this.b = f;
        this.c = f2;
        this.d = obj;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f5944a;
        Object obj4 = this.d;
        float f = this.c;
        float f2 = this.b;
        switch (b) {
            case 0:
                hjm hjmVar = (hjm) obj4;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    float f3 = f2 + f;
                    zcl zclVar = qmk.f28987a;
                    nkb.h(s5x0.N(jm40.b, f3, 48.0f, f3, 0.0f, 8), hjmVar, kjm.b, null, null, null, fetVar, 384, 56);
                } else {
                    fetVar.X();
                }
                break;
            default:
                owk0 owk0Var = (owk0) obj4;
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarN = epv0.N(yhg0Var.a(1.0f, jm40Var, true), f2);
                    Object objP = fetVar2.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = new ejk0((byte) 8);
                        fetVar2.o0(objP);
                    }
                    mm40 mm40VarT = i4w0.T(mm40VarN, (Function1) objP);
                    boolean zD = fetVar2.d(f);
                    Object objP2 = fetVar2.P();
                    if (zD || objP2 == cl5Var) {
                        objP2 = new f54(f, (byte) 29);
                        fetVar2.o0(objP2);
                    }
                    mm40 mm40VarM = rq8.M(mm40VarT, (Function1) objP2);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    String str = owk0Var.f25970a;
                    pz40 pz40Var = s6t0.f31722a;
                    v8q0.a(str, mm40VarD, s6t0.b().f33626a.getSecondary(), new n05(qmk.r, qmk.u, idm0.t(2)), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, r8x.c0(g1t0.u()), fetVar2, 48, 24960, 109552);
                    fet fetVar3 = fetVar2;
                    String str2 = owk0Var.b;
                    if (str2 == null) {
                        fetVar3.e0(348393480);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(348393481);
                        v8q0.a(str2, o7k0.d(jm40Var, 1.0f), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar3, 48, 24960, 109560);
                        fetVar3 = fetVar3;
                        fetVar3.r(false);
                    }
                    fetVar3.r(true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
