package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bg00 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2531a;
    public final /* synthetic */ tdm0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ bg00(tdm0 tdm0Var, boolean z, int i) {
        this.f2531a = (byte) 1;
        this.b = tdm0Var;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        shd shdVar;
        shd shdVar2;
        int i;
        byte b = this.f2531a;
        pcy pcyVar = e7z.u1;
        boolean z = this.c;
        tdm0 tdm0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = tdm0Var.f33776a;
                    znp0 znp0Var = tdm0Var.d;
                    p5h0 p5h0Var = tdm0Var.b;
                    znp0 znp0Var2 = tdm0Var.c;
                    yyw.h(str, fetVar, 0);
                    zcl zclVar = qmk.f28987a;
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar3 = gqw0.x;
                    jpm0.o(fetVar, thg0VarA, shdVar3);
                    shd shdVar4 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM, shdVar4);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar5 = gqw0.y;
                    jpm0.o(fetVar, numValueOf, shdVar5);
                    jpm0.n(fetVar);
                    shd shdVar6 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC0, shdVar6);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    zx7 zx7Var = gqw0.e;
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, x7zVar);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, shdVar3);
                    jpm0.o(fetVar, bh90VarM2, shdVar4);
                    vqd.u(iHashCode2, fetVar, shdVar5, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar6);
                    if (z) {
                        fetVar.e0(1145898680);
                        yyw.p(znp0Var2, fetVar, 0);
                        fetVar.r(false);
                        shdVar = shdVar6;
                        shdVar2 = shdVar5;
                    } else {
                        fetVar.e0(1146016480);
                        shdVar = shdVar6;
                        shdVar2 = shdVar5;
                        yyw.y(znp0Var2.d, znp0Var2.b, tdm0Var.e, gqw0.i, 2, fetVar, 27648);
                        fetVar = fetVar;
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                    if (p5h0Var instanceof n5h0) {
                        fetVar.e0(-2094282809);
                        bdx.E((n5h0) p5h0Var, s5x0.N(jm40Var, 10.0f, 0.0f, 10.0f, 0.0f, 10), fetVar, 0);
                        fetVar.r(false);
                    } else {
                        if (!(p5h0Var instanceof o5h0)) {
                            throw b1j.f(1040818438, fetVar, false);
                        }
                        fetVar.e0(-2093982667);
                        mm40 mm40VarW = o7k0.w(o7k0.s(jm40Var, 100.0f), null, false, 3);
                        String strW = rsm0.w(R.string.vs, 0, fetVar);
                        long j = qmk.u;
                        v8q0.a(strW, mm40VarW, 0L, null, j, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, j, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar), fetVar, 0, 24960, 109548);
                        fetVar.r(false);
                    }
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, x7zVar2);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC2, shdVar3);
                    jpm0.o(fetVar, bh90VarM3, shdVar4);
                    vqd.u(iHashCode3, fetVar, shdVar2, fetVar);
                    jpm0.o(fetVar, mm40VarC2, shdVar);
                    if (z) {
                        fetVar.e0(294466017);
                        yyw.p(znp0Var, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(294583879);
                        yyw.y(znp0Var.d, znp0Var.b, tdm0Var.f, gqw0.g, 2, fetVar, 27648);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                ucx.F(tdm0Var, z, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str2 = tdm0Var.f33776a;
                    znp0 znp0Var3 = tdm0Var.d;
                    znp0 znp0Var4 = tdm0Var.c;
                    hfm0.c(str2, fetVar2, 0);
                    zcl zclVar2 = qmk.f28987a;
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarN2 = s5x0.N(jm40Var2, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarN2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    shd shdVar7 = gqw0.x;
                    jpm0.o(fetVar2, thg0VarA2, shdVar7);
                    shd shdVar8 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM4, shdVar8);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    shd shdVar9 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf2, shdVar9);
                    jpm0.n(fetVar2);
                    shd shdVar10 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC3, shdVar10);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar3 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    zx7 zx7Var2 = gqw0.e;
                    tj30 tj30VarC3 = zq8.c(zx7Var2, false);
                    int iHashCode5 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM5 = fetVar2.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar2, x7zVar3);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC3, shdVar7);
                    jpm0.o(fetVar2, bh90VarM5, shdVar8);
                    vqd.u(iHashCode5, fetVar2, shdVar9, fetVar2);
                    jpm0.o(fetVar2, mm40VarC4, shdVar10);
                    if (z) {
                        fetVar2.e0(-464940648);
                        i = 0;
                        hfm0.d(znp0Var4, fetVar2, 0);
                        fetVar2.r(false);
                    } else {
                        i = 0;
                        fetVar2.e0(-464822848);
                        hfm0.l(znp0Var4.d, znp0Var4.b, tdm0Var.e, gqw0.i, 2, fetVar2, 27648);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                    n4c.l(s5x0.N(jm40Var2, 8.0f, 0.0f, 8.0f, 0.0f, 10), jeb.X(tdm0Var.b), true, fetVar2, i);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar4 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    tj30 tj30VarC4 = zq8.c(zx7Var2, false);
                    int iHashCode6 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM6 = fetVar2.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar2, x7zVar4);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC4, shdVar7);
                    jpm0.o(fetVar2, bh90VarM6, shdVar8);
                    vqd.u(iHashCode6, fetVar2, shdVar9, fetVar2);
                    jpm0.o(fetVar2, mm40VarC5, shdVar10);
                    if (z) {
                        fetVar2.e0(-1316373311);
                        hfm0.d(znp0Var3, fetVar2, 0);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1316255449);
                        hfm0.l(znp0Var3.d, znp0Var3.b, tdm0Var.f, gqw0.g, 2, fetVar2, 27648);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ bg00(tdm0 tdm0Var, boolean z, byte b) {
        this.f2531a = b;
        this.b = tdm0Var;
        this.c = z;
    }
}
