package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mkd0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21938a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ jjl c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ mkd0(Function0 function0, jjl jjlVar, long j, long j2, byte b) {
        this.f21938a = b;
        this.b = function0;
        this.c = jjlVar;
        this.d = j;
        this.e = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21938a;
        pcy pcyVar = e7z.u1;
        jjl jjlVar = this.c;
        byte b2 = 2;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarW = y860.W(new x7z(1.0f, true), null, null, false, null, this.b, 28);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar, thg0VarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar, numValueOf, shdVar3);
                    jpm0.n(fetVar);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC0, shdVar4);
                    zcl zclVar = qmk.f28987a;
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarH = dw9.h(1.0f, o7k0.e(s5x0.L(jm40Var, 8.0f, 0.0f, 2), 32.0f), true);
                    zx7 zx7Var = gqw0.d;
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarH);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, shdVar);
                    jpm0.o(fetVar, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar4);
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(-160957807, new aiq(jjlVar, this.d, b2), fetVar), fetVar, 56);
                    fetVar.r(true);
                    mm40 mm40VarP = o7k0.p(jm40Var, 24.0f, 32.0f);
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarP);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC2, shdVar);
                    jpm0.o(fetVar, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC2, shdVar4);
                    dww.b(jpm0.t(R.drawable.ic_glyph_chevron_down_small, 6, fetVar), null, o7k0.n(jm40Var, 16.0f), this.e, fetVar, 48, 0);
                    fetVar.r(true);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarH2 = dw9.h(1.0f, s5x0.N(o7k0.e(jm40Var2, 36.0f), 8.0f, 0.0f, 0.0f, 0.0f, 14), true);
                    Object objP = fetVar2.P();
                    if (objP == ukd.f35823a) {
                        objP = dw9.j(fetVar2);
                    }
                    mm40 mm40VarW2 = y860.W(mm40VarH2, (gy40) objP, null, false, null, this.b, 28);
                    x5d x5dVarA = w5d.a(uc9.g, gqw0.m, fetVar2, 54);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarW2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    shd shdVar5 = gqw0.x;
                    jpm0.o(fetVar2, x5dVarA, shdVar5);
                    shd shdVar6 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM4, shdVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    shd shdVar7 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf2, shdVar7);
                    jpm0.n(fetVar2);
                    shd shdVar8 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC3, shdVar8);
                    mm40 mm40VarN = s5x0.N(jm40Var2, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 54);
                    int iHashCode5 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM5 = fetVar2.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarN);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA2, shdVar5);
                    jpm0.o(fetVar2, bh90VarM5, shdVar6);
                    vqd.u(iHashCode5, fetVar2, shdVar7, fetVar2);
                    mm40 mm40VarE0 = o2e.e0(s5x0.N(ohs0.i(fetVar2, mm40VarC4, shdVar8, 1.0f, false), 0.0f, 0.0f, 2.0f, 0.0f, 11), "DS_ACCOUNT_SELECTION_TITLE");
                    String str = jjlVar.d;
                    if (str == null) {
                        str = "";
                    }
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    y9q0 y9q0VarD = g1t0.d();
                    long j = this.d;
                    v8q0.a(str, mm40VarE0, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar2, 0, 24960, 110584);
                    dww.b(jpm0.t(R.drawable.ic_glyph_chevron_down_small, 6, fetVar2), null, o7k0.n(jm40Var2, 12.0f), j, fetVar2, 48, 0);
                    fetVar2.r(true);
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(-2110961655, new aiq(jjlVar, this.e, (byte) 3), fetVar2), fetVar2, 56);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
