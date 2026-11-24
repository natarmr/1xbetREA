package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xhq implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40907a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ jjl c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public /* synthetic */ xhq(long j, Function0 function0, jjl jjlVar, long j2, long j3) {
        this.d = j;
        this.b = function0;
        this.c = jjlVar;
        this.e = j2;
        this.f = j3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40907a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        long j = this.e;
        long j2 = this.d;
        jjl jjlVar = this.c;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x7z x7zVar = new x7z(1.0f, true);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarW = y860.W(i120.Q(lgb.J(s5x0.N(x7zVar, 0.0f, 8.0f, 8.0f, 8.0f, 1), vgg0.a(10.0f)), j2, jd8.n), null, null, false, null, this.b, 28);
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
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(-665888299, new aiq(jjlVar, j, (byte) 0), fetVar), fetVar, 56);
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
                    dww.b(jpm0.t(R.drawable.ic_glyph_chevron_down_small, 6, fetVar), null, o7k0.n(jm40Var, 16.0f), this.f, fetVar, 48, 0);
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
                    mm40 mm40VarW2 = y860.W(new x7z(1.0f, true), null, null, false, null, this.b, 28);
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
                    jpm0.o(fetVar2, thg0VarA2, shdVar5);
                    shd shdVar6 = gqw0.w;
                    jpm0.o(fetVar2, bh90VarM4, shdVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    shd shdVar7 = gqw0.y;
                    jpm0.o(fetVar2, numValueOf2, shdVar7);
                    jpm0.n(fetVar2);
                    shd shdVar8 = gqw0.v;
                    jpm0.o(fetVar2, mm40VarC3, shdVar8);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarH2 = dw9.h(1.0f, o7k0.e(s5x0.L(jm40Var, 8.0f, 0.0f, 2), 40.0f), true);
                    x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 54);
                    int iHashCode5 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM5 = fetVar2.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarH2);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, shdVar5);
                    jpm0.o(fetVar2, bh90VarM5, shdVar6);
                    vqd.u(iHashCode5, fetVar2, shdVar7, fetVar2);
                    jpm0.o(fetVar2, mm40VarC4, shdVar8);
                    zfn zfnVar = bmd.n;
                    k6z k6zVar = k6z.f17794a;
                    obc.d(zfnVar.a(k6zVar), u1c.M(1750630913, new aiq(jjlVar, j2, (byte) 4), fetVar2), fetVar2, 56);
                    obc.d(zfnVar.a(k6zVar), u1c.M(-599357896, new aiq(jjlVar, j, (byte) 5), fetVar2), fetVar2, 56);
                    fetVar2.r(true);
                    mm40 mm40VarP2 = o7k0.p(jm40Var, 24.0f, 40.0f);
                    tj30 tj30VarC3 = zq8.c(gqw0.d, false);
                    int iHashCode6 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM6 = fetVar2.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar2, mm40VarP2);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC3, shdVar5);
                    jpm0.o(fetVar2, bh90VarM6, shdVar6);
                    vqd.u(iHashCode6, fetVar2, shdVar7, fetVar2);
                    jpm0.o(fetVar2, mm40VarC5, shdVar8);
                    dww.b(jpm0.t(R.drawable.ic_glyph_chevron_down_small, 6, fetVar2), null, o7k0.n(jm40Var, 16.0f), this.f, fetVar2, 48, 0);
                    fetVar2.r(true);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ xhq(Function0 function0, jjl jjlVar, long j, long j2, long j3) {
        this.b = function0;
        this.c = jjlVar;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }
}
