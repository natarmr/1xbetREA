package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d15 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5293a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d15(int i, long j, long j2, String str, String str2, String str3, String str4) {
        this.f5293a = (byte) 2;
        this.e = str;
        this.f = str2;
        this.b = str3;
        this.c = j;
        this.g = str4;
        this.d = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5293a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        Object obj3 = this.g;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj4;
                pz40 pz40Var = (pz40) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarE0 = o2e.e0(mm40Var, "CURRENCY_ROW");
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 54);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    mm40 mm40VarI = hne.i(1.0f, false, "BalanceValueTestTag");
                    long j = this.c;
                    boolean zF = fetVar.f(j);
                    Object objP = fetVar.P();
                    if (zF || objP == cl5Var) {
                        objP = new f15((byte) 0, j);
                        fetVar.o0(objP);
                    }
                    n4d n4dVar = (n4d) objP;
                    y9q0 y9q0VarT = ibm0.t(g1t0.w(), fetVar);
                    n05 n05Var = new n05(qmk.r, this.d, qmk.n);
                    Object objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = new we(pz40Var, (byte) 21);
                        fetVar.o0(objP2);
                    }
                    aad.e(this.e, mm40VarI, y9q0VarT, (Function1) objP2, 2, false, 1, 0, n4dVar, n05Var, fetVar, 27648, 160);
                    jm40 jm40Var = jm40.b;
                    v8q0.a(this.f, o2e.e0(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), "CurrencyValueTestTag"), j, null, ((daq0) pz40Var.getValue()).f5764a, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.j(), fetVar, 0, 24576, 114664);
                    dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small_16_secondary, 0, fetVar), null, o2e.e0(s5x0.N(o7k0.n(jm40Var, 24.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14), "ChevronIconTestTag"), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar, 56, 0);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                mm40 mm40Var2 = (mm40) obj4;
                pz40 pz40Var2 = (pz40) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    thg0 thg0VarA2 = shg0.a(uc9.b, gqw0.k, fetVar2, 54);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40Var2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarN = o7k0.n(jm40Var2, 24.0f);
                    zcl zclVar = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small_16_secondary, 0, fetVar2), null, s5x0.N(mm40VarN, 0.0f, 0.0f, 4.0f, 0.0f, 11), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), fetVar2, 56, 0);
                    x7z x7zVar = new x7z(1.0f, false);
                    long j2 = this.c;
                    boolean zF2 = fetVar2.f(j2);
                    Object objP3 = fetVar2.P();
                    if (zF2 || objP3 == cl5Var) {
                        objP3 = new f15((byte) 1, j2);
                        fetVar2.o0(objP3);
                    }
                    n4d n4dVar2 = (n4d) objP3;
                    y9q0 y9q0VarT2 = ibm0.t(g1t0.w(), fetVar2);
                    n05 n05Var2 = new n05(qmk.r, this.d, qmk.n);
                    Object objP4 = fetVar2.P();
                    if (objP4 == cl5Var) {
                        objP4 = new we(pz40Var2, (byte) 22);
                        fetVar2.o0(objP4);
                    }
                    aad.e(this.e, x7zVar, y9q0VarT2, (Function1) objP4, 2, false, 1, 0, n4dVar2, n05Var2, fetVar2, 27648, 160);
                    v8q0.a(this.f, s5x0.N(jm40Var2, 4.0f, 0.0f, 0.0f, 0.0f, 14), j2, null, ((daq0) pz40Var2.getValue()).f5764a, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.j(), fetVar2, 0, 24576, 114664);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ucx.r(this.e, this.f, (String) obj4, this.c, (String) obj3, this.d, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ d15(mm40 mm40Var, long j, long j2, String str, String str2, pz40 pz40Var, byte b) {
        this.f5293a = b;
        this.b = mm40Var;
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = str2;
        this.g = pz40Var;
    }
}
