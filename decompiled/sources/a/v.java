package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36558a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ v(int i, String str) {
        this.f36558a = (byte) 9;
        this.c = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long secondary;
        byte b = this.f36558a;
        jm40 jm40Var = jm40.b;
        String str = this.b;
        int i = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ay3.t(i, x8x.L(1), (fet) obj, str);
                break;
            case 1:
                ((Integer) obj2).intValue();
                kc5.g0(str, (fet) obj, x8x.L(i | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                vdb.L(str, (fet) obj, x8x.L(i | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                xf0.o(i, x8x.L(1), (fet) obj, str);
                break;
            case 4:
                ((Integer) obj2).getClass();
                xkb.E(str, (fet) obj, x8x.L(i | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                n6m.f(str, (fet) obj, x8x.L(i | 1));
                break;
            case 6:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str2 = this.b;
                    if (str2.length() > 0) {
                        fetVar.e0(1356265041);
                        v8q0.a(str2, mrv.k0(jm40Var, q8k0.f28305a), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, this.c, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 48, 384, 109560);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1356633414);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
            case 7:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    v8q0.a(this.b, o2e.e0(mrv.k0(jm40Var, p8k0.f26559a), "EVENT_CARD_INFO_LABEL"), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, this.c, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, 48, 384, 109560);
                } else {
                    fetVar2.X();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                b34.j(i, x8x.L(1), (fet) obj, str);
                break;
            case 9:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mm40 mm40VarU = yyw.U(jm40Var, 0.3f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE0 = o2e.e0(s5x0.N(mm40VarU, 12.0f, 0.0f, 12.0f, 0.0f, 10), "TRANSACTION_CELL_AMOUNT");
                    y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
                    if (i == 2) {
                        fetVar3.e0(-675796228);
                        secondary = ((StaticColors) fetVar3.k(m8m0.f21378a)).m98getGreen0d7_KjU();
                    } else {
                        fetVar3.e0(-675795296);
                        secondary = ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary();
                    }
                    fetVar3.r(false);
                    v8q0.a(this.b, mm40VarE0, secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar3, 0, 0, 131064);
                } else {
                    fetVar3.X();
                }
                break;
            case 10:
                ((Integer) obj2).intValue();
                oja0.t(str, (fet) obj, x8x.L(i | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                jiq0.u(str, (fet) obj, x8x.L(i | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                wb.C(str, (fet) obj, x8x.L(i | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                qsm0.k(str, (fet) obj, x8x.L(i | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                atm0.d(str, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                q8a.r(i, x8x.L(1), (fet) obj, str);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ v(int i, int i2, String str) {
        this.f36558a = (byte) 0;
        this.c = i;
        this.b = str;
    }

    public /* synthetic */ v(byte b, int i, String str) {
        this.f36558a = b;
        this.b = str;
        this.c = i;
    }

    public /* synthetic */ v(String str, int i, int i2, byte b) {
        this.f36558a = b;
        this.b = str;
        this.c = i;
    }
}
