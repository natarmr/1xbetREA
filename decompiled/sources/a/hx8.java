package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class hx8 extends guy implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz40 f13803a;
    public final /* synthetic */ lwf b;
    public final /* synthetic */ nie0 c;
    public final /* synthetic */ imm d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ l7m0 g;
    public final /* synthetic */ imm h;
    public final /* synthetic */ ugd i;
    public final /* synthetic */ vu8 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx8(pz40 pz40Var, lwf lwfVar, nie0 nie0Var, imm immVar, Function1 function1, String str, l7m0 l7m0Var, imm immVar2, ugd ugdVar, vu8 vu8Var) {
        super(3);
        this.f13803a = pz40Var;
        this.b = lwfVar;
        this.c = nie0Var;
        this.d = immVar;
        this.e = function1;
        this.f = str;
        this.g = l7m0Var;
        this.h = immVar2;
        this.i = ugdVar;
        this.j = vu8Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        boolean z;
        fet fetVar = (fet) obj2;
        ((Number) obj3).intValue();
        Unit unit = Unit.f46060a;
        this.f13803a.setValue(unit);
        this.b.getClass();
        nie0 nie0Var = this.c;
        if (nie0Var.f23583a == cmd.f4598a) {
            nie0Var.f23583a = cmd.b;
        }
        fetVar.e0(79061753);
        jm40 jm40Var = jm40.b;
        mm40 mm40VarK0 = mrv.k0(yyw.X(jm40Var, null, fetVar, 1), "NAV_BAR_END_ID");
        Function1 function1 = this.e;
        boolean zG = fetVar.g(function1);
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (zG || objP == cl5Var) {
            objP = new rr0(function1, (byte) 13);
            fetVar.o0(objP);
        }
        Function0 function0 = (Function0) objP;
        boolean zG2 = fetVar.g(function1);
        Object objP2 = fetVar.P();
        if (zG2 || objP2 == cl5Var) {
            objP2 = new qr0(function1, (byte) 18);
            fetVar.o0(objP2);
        }
        Function1 function2 = (Function1) objP2;
        boolean zG3 = fetVar.g(function1);
        Object objP3 = fetVar.P();
        if (zG3 || objP3 == cl5Var) {
            objP3 = new qr0(function1, (byte) 19);
            fetVar.o0(objP3);
        }
        hlm.c(mm40VarK0, this.d, null, function0, null, function2, (Function1) objP3, null, null, null, null, null, fetVar, 0, 0, 3988);
        mz3 mz3VarX = l7x.X(Integer.valueOf(R.drawable.ic_tournament_banner), null, null, fetVar, 0, 30);
        n0q n0qVar = o7k0.c;
        Object objP4 = fetVar.P();
        if (objP4 == cl5Var) {
            objP4 = i13.f;
            fetVar.o0(objP4);
        }
        k7x.b(this.f, null, mrv.k0(rq8.M(n0qVar, (Function1) objP4), "CONTENT_ID"), mz3VarX, mz3VarX, null, null, null, null, gqw0.b, gqw0.A, null, fetVar, 805306416, 6, 31200);
        mm40 mm40VarK1 = mrv.k0(o7k0.d(jm40Var, 1.0f), "TITLE_ID");
        zx7 zx7Var = gqw0.f11754a;
        tj30 tj30VarC = zq8.c(zx7Var, false);
        int iHashCode = Long.hashCode(fetVar.T);
        bh90 bh90VarM = fetVar.m();
        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK1);
        mkd.c0.getClass();
        fetVar.i0();
        boolean z2 = fetVar.S;
        pcy pcyVar = e7z.u1;
        if (z2) {
            fetVar.l(pcyVar);
        } else {
            fetVar.r0();
        }
        shd shdVar = gqw0.x;
        jpm0.o(fetVar, tj30VarC, shdVar);
        shd shdVar2 = gqw0.w;
        jpm0.o(fetVar, bh90VarM, shdVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        shd shdVar3 = gqw0.y;
        jpm0.o(fetVar, numValueOf, shdVar3);
        jpm0.n(fetVar);
        shd shdVar4 = gqw0.v;
        jpm0.o(fetVar, mm40VarC0, shdVar4);
        twn.v(0, this.i, fetVar, true);
        if (((Boolean) this.g.getValue()).booleanValue()) {
            fetVar.e0(81027958);
            mm40 mm40VarK2 = mrv.k0(yyw.X(jm40Var, null, fetVar, 1), "NAV_BAR_START_ID");
            boolean zG4 = fetVar.g(function1);
            Object objP5 = fetVar.P();
            if (zG4 || objP5 == cl5Var) {
                objP5 = new rr0(function1, (byte) 14);
                fetVar.o0(objP5);
            }
            Function0 function3 = (Function0) objP5;
            boolean zG5 = fetVar.g(function1);
            Object objP6 = fetVar.P();
            if (zG5 || objP6 == cl5Var) {
                objP6 = new qr0(function1, (byte) 20);
                fetVar.o0(objP6);
            }
            Function1 function4 = (Function1) objP6;
            boolean zG6 = fetVar.g(function1);
            Object objP7 = fetVar.P();
            if (zG6 || objP7 == cl5Var) {
                objP7 = new rr0(function1, (byte) 15);
                fetVar.o0(objP7);
            }
            hlm.c(mm40VarK2, this.h, null, function3, null, function4, null, null, (Function0) objP7, null, null, null, fetVar, 0, 0, 3796);
            mm40 mm40VarK3 = mrv.k0(o7k0.d(jm40Var, 1.0f), "AUTH_BUTTONS_ID");
            z = false;
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarK3);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            vu8 vu8Var = this.j;
            if (vu8Var != null) {
                if (vu8Var instanceof tu8) {
                    fetVar.e0(-320161172);
                    tu8 tu8Var = (tu8) vu8Var;
                    ijl ijlVar = tu8Var.b;
                    jjl jjlVar = tu8Var.f34538a;
                    gjl gjlVar = gjl.b;
                    boolean zG7 = fetVar.g(function1);
                    Object objP8 = fetVar.P();
                    if (zG7 || objP8 == cl5Var) {
                        objP8 = new rr0(function1, (byte) 16);
                        fetVar.o0(objP8);
                    }
                    Function0 function5 = (Function0) objP8;
                    boolean zG8 = fetVar.g(function1);
                    Object objP9 = fetVar.P();
                    if (zG8 || objP9 == cl5Var) {
                        objP9 = new rr0(function1, (byte) 17);
                        fetVar.o0(objP9);
                    }
                    Function0 function6 = (Function0) objP9;
                    boolean zG9 = fetVar.g(function1);
                    Object objP10 = fetVar.P();
                    if (zG9 || objP10 == cl5Var) {
                        objP10 = new rr0(function1, (byte) 18);
                        fetVar.o0(objP10);
                    }
                    feb.k(ijlVar, jjlVar, gjlVar, function5, function6, (Function0) objP10, fetVar, 384, 0);
                    fetVar.r(false);
                } else if (vu8Var instanceof uu8) {
                    fetVar.e0(-319257398);
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 8.0f);
                    uu8 uu8Var = (uu8) vu8Var;
                    String str = uu8Var.f36287a;
                    String str2 = uu8Var.b;
                    boolean zG10 = fetVar.g(function1);
                    Object objP11 = fetVar.P();
                    if (zG10 || objP11 == cl5Var) {
                        objP11 = new rr0(function1, (byte) 19);
                        fetVar.o0(objP11);
                    }
                    Function0 function7 = (Function0) objP11;
                    boolean zG11 = fetVar.g(function1);
                    Object objP12 = fetVar.P();
                    if (zG11 || objP12 == cl5Var) {
                        objP12 = new rr0(function1, (byte) 20);
                        fetVar.o0(objP12);
                    }
                    pzb.g(mm40VarK, str, str2, function7, (Function0) objP12, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(true);
                fetVar.r(false);
            }
            throw b1j.f(1929332019, fetVar, false);
        }
        z = false;
        fetVar.e0(84068562);
        fetVar.r(false);
        fetVar.r(z);
        return unit;
    }
}
