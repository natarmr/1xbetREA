package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ay implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1646a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ l7m0 d;

    public /* synthetic */ ay(l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3) {
        this.f1646a = (byte) 0;
        this.b = l7m0Var;
        this.c = l7m0Var2;
        this.d = l7m0Var3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        pcy pcyVar;
        byte b = this.f1646a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        l7m0 l7m0Var = this.d;
        l7m0 l7m0Var2 = this.c;
        l7m0 l7m0Var3 = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(jm40Var, 14.0f);
                    yx7 yx7Var = gqw0.k;
                    thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
                    mkd.c0.getClass();
                    fetVar.i0();
                    boolean z2 = fetVar.S;
                    pcy pcyVar2 = e7z.u1;
                    if (z2) {
                        fetVar.l(pcyVar2);
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
                    thg0 thg0VarA2 = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar2);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA2, shdVar);
                    jpm0.o(fetVar, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar4);
                    j0x.b(iom0.r(jpm0.t(R.drawable.ic_game_red_card, 6, fetVar), fetVar), null, o7k0.n(jm40Var, 12.0f), null, null, 0.0f, null, fetVar, 56, 120);
                    String strValueOf = String.valueOf(((Number) l7m0Var3.getValue()).intValue());
                    mm40 mm40VarA = o7k0.A(jm40Var, null, 3);
                    y9q0 y9q0VarG = g1t0.g();
                    pz40 pz40Var = s6t0.f31722a;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    v8q0.a(strValueOf, mm40VarA, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarG, fetVar, 48, 0, 131064);
                    fetVar.r(true);
                    thg0 thg0VarA3 = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, jm40Var);
                    fetVar.i0();
                    if (fetVar.S) {
                        pcyVar = pcyVar2;
                        fetVar.l(pcyVar);
                    } else {
                        pcyVar = pcyVar2;
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA3, shdVar);
                    jpm0.o(fetVar, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC2, shdVar4);
                    pcy pcyVar3 = pcyVar;
                    j0x.b(iom0.r(jpm0.t(R.drawable.ic_game_yellow_card, 6, fetVar), fetVar), null, o7k0.n(jm40Var, 12.0f), null, null, 0.0f, null, fetVar, 56, 120);
                    v8q0.a(String.valueOf(((Number) l7m0Var2.getValue()).intValue()), o7k0.A(jm40Var, null, 3), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 48, 0, 131064);
                    fetVar.r(true);
                    thg0 thg0VarA4 = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
                    int iHashCode4 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM4 = fetVar.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar, jm40Var);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar3);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA4, shdVar);
                    jpm0.o(fetVar, bh90VarM4, shdVar2);
                    vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC3, shdVar4);
                    j0x.b(iom0.r(jpm0.t(R.drawable.ic_game_cornerkick, 6, fetVar), fetVar), null, o7k0.n(jm40Var, 12.0f), null, null, 0.0f, null, fetVar, 56, 120);
                    v8q0.a(String.valueOf(((Number) l7m0Var.getValue()).intValue()), o7k0.A(jm40Var, null, 3), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 48, 0, 131064);
                    fetVar.r(true);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    Object objP = fetVar2.P();
                    if (objP == cl5Var) {
                        objP = new nk7(z ? (byte) 1 : (byte) 0);
                        fetVar2.o0(objP);
                    }
                    jeb.C(rq8.K(mm40VarD, (Function1) objP), (l7m0) l7m0Var3.getValue(), (l7m0) l7m0Var2.getValue(), ((Number) l7m0Var.getValue()).floatValue(), 0.0f, fetVar2, 0, 16);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    Object objP2 = fetVar3.P();
                    if (objP2 == cl5Var) {
                        objP2 = new h7w((byte) 22);
                        fetVar3.o0(objP2);
                    }
                    mm40 mm40VarK = rq8.K(mm40VarD2, (Function1) objP2);
                    l7m0 l7m0Var4 = (l7m0) l7m0Var3.getValue();
                    l7m0 l7m0Var5 = (l7m0) l7m0Var2.getValue();
                    zcl zclVar2 = qmk.f28987a;
                    jeb.C(mm40VarK, l7m0Var5, l7m0Var4, ((Number) l7m0Var.getValue()).floatValue(), 32.0f, fetVar3, 0, 0);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    fpb0 fpb0Var = (fpb0) ((l7m0) l7m0Var3.getValue()).getValue();
                    if (fpb0Var != null && ((fpb0Var instanceof epb0) || (fpb0Var instanceof dpb0))) {
                        fetVar4.e0(-980481166);
                        mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                        Object objP3 = fetVar4.P();
                        if (objP3 == cl5Var) {
                            objP3 = new peb0((byte) 27);
                            fetVar4.o0(objP3);
                        }
                        jeb.B(rq8.K(mm40VarD3, (Function1) objP3), (l7m0) l7m0Var2.getValue(), ((Number) l7m0Var.getValue()).floatValue(), 0.0f, fetVar4, 0);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(799670985);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                break;
            default:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    sgs0 sgs0Var = (sgs0) ((l7m0) l7m0Var3.getValue()).getValue();
                    if (Intrinsics.d(sgs0Var, qgs0.f28701a) || (sgs0Var instanceof rgs0)) {
                        fetVar5.e0(404890678);
                        mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                        Object objP4 = fetVar5.P();
                        if (objP4 == cl5Var) {
                            objP4 = new g4s0((byte) 20);
                            fetVar5.o0(objP4);
                        }
                        jeb.B(rq8.K(mm40VarD4, (Function1) objP4), (l7m0) l7m0Var2.getValue(), ((Number) l7m0Var.getValue()).floatValue(), 0.0f, fetVar5, 0);
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(-1649488975);
                        fetVar5.r(false);
                    }
                } else {
                    fetVar5.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ay(l7m0 l7m0Var, l7m0 l7m0Var2, l7m0 l7m0Var3, byte b) {
        this.f1646a = b;
        this.b = l7m0Var;
        this.c = l7m0Var2;
        this.d = l7m0Var3;
    }
}
