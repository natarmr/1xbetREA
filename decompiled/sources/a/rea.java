package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rea implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30326a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ rea(mm40 mm40Var, long j, String str) {
        this.f30326a = (byte) 0;
        this.b = mm40Var;
        this.c = j;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30326a) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarE0 = o2e.e0(this.b, "CARD_CRICKET_GAME_PROGRESS_POINTS_CELL");
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarS = o7k0.s(s5x0.N(mm40VarE0, 0.0f, 6.0f, 0.0f, 0.0f, 13), 64.0f);
                    StaticColors staticColors = StaticColors.INSTANCE;
                    long jM126getWhite200d7_KjU = staticColors.m126getWhite200d7_KjU();
                    zcl zclVar2 = qmk.c;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarS, jM126getWhite200d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f);
                    thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarE1 = o2e.e0(jm40Var, "CARD_CRICKET_GAME_PROGRESS_POINTS_COLOR");
                    long j = this.c;
                    boolean zF = fetVar.f(j);
                    Object objP = fetVar.P();
                    if (zF || objP == ukd.f35823a) {
                        objP = new bx((byte) 22, j);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarN = o7k0.n(pai0.a(mm40VarE1, false, (Function1) objP), 8.0f);
                    zcl zclVar3 = qmk.b;
                    zq8.a(0, fetVar, i120.Q(mm40VarN, j, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)));
                    v8q0.a(this.d, s5x0.N(o2e.e0(jm40Var, "CARD_CRICKET_GAME_PROGRESS_POINTS_TEXT"), 4.0f, 0.0f, 0.0f, 0.0f, 14), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 0, 131064);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                feb.E(x8x.L(1), this.c, (fet) obj, this.b, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                wdx.F(x8x.L(1), this.c, (fet) obj, this.b, this.d);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ rea(byte b, int i, long j, mm40 mm40Var, String str) {
        this.f30326a = b;
        this.b = mm40Var;
        this.c = j;
        this.d = str;
    }
}
