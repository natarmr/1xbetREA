package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kom implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18637a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kom(float f, tht thtVar, Function1 function1) {
        this.f18637a = (byte) 1;
        this.b = f;
        this.c = thtVar;
        this.d = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f18637a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        float f = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                vj30 vj30Var = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                vj30Var.getClass();
                pj30Var.getClass();
                pu90 pu90VarS = pj30Var.S(((p4e) obj3).f26347a);
                return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new gom(pu90VarS, (wom) obj5, f, (yjj0) obj4));
            case 1:
                tht thtVar = (tht) obj5;
                Function1 function1 = (Function1) obj4;
                ir8 ir8Var = (ir8) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ir8Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(ir8Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    mm40 mm40VarN = s5x0.N(o7k0.d(ir8Var.b(jm40Var, gqw0.e), 1.0f), xfn.a(fetVar).d, 0.0f, xfn.a(fetVar).d, this.b, 2);
                    wul wulVar = thtVar.b;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new hcr(function1, (byte) 29);
                        fetVar.o0(objP);
                    }
                    qzb.n(mm40VarN, wulVar, (Function0) objP, fetVar, 0, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                t33 t33Var = (t33) obj5;
                ugd ugdVar = (ugd) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zI = fetVar2.i(t33Var) | fetVar2.d(f);
                    Object objP2 = fetVar2.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new ntf((byte) 2, f, t33Var);
                        fetVar2.o0(objP2);
                    }
                    mm40 mm40VarP = ffb0.P(jm40Var, (Function1) objP2);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarP);
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
                    twn.v(0, ugdVar, fetVar2, true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ kom(Object obj, float f, Object obj2, byte b) {
        this.f18637a = b;
        this.c = obj;
        this.b = f;
        this.d = obj2;
    }
}
