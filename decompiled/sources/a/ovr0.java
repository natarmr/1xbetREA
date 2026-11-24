package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ovr0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25938a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ ovr0(mm40 mm40Var, String str, String str2) {
        this.f25938a = (byte) 2;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25938a;
        String str = this.d;
        String str2 = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                cem0.d(x8x.L(1), (fet) obj, mm40Var, str2, str);
                break;
            case 1:
                ((Integer) obj2).getClass();
                cem0.h(x8x.L(1), (fet) obj, mm40Var, str2, str);
                break;
            case 2:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
                    mm40 mm40VarE0 = o2e.e0(jm40Var, "TWENTY_ONE_NAME");
                    y9q0 y9q0VarE = g1t0.e();
                    StaticColors staticColors = StaticColors.INSTANCE;
                    v8q0.a(this.c, mm40VarE0, staticColors.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarE, fetVar, 48, 0, 131064);
                    zcl zclVar = qmk.f28987a;
                    v8q0.a(this.d, o2e.e0(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), "TWENTY_ONE_SCORE"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, 0, 0, 131064);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                mym0.b(x8x.L(1), (fet) obj, mm40Var, str2, str);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ovr0(mm40 mm40Var, String str, String str2, int i, byte b) {
        this.f25938a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
    }
}
