package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cm5 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4589a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ cm5(mm40 mm40Var, String str, String str2, String str3) {
        this.f4589a = (byte) 4;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4589a) {
            case 0:
                ((Integer) obj2).getClass();
                ohq0.j(x8x.L(1), (fet) obj, this.b, this.c, this.d, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ozb.G(x8x.L(1), (fet) obj, this.b, this.c, this.d, this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                p7x.d(x8x.L(1), (fet) obj, this.b, this.c, this.d, this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                azw.l(x8x.L(7), (fet) obj, this.b, this.c, this.d, this.e);
                break;
            case 4:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, this.b);
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
                    q0x.c(0, fetVar, null, rsm0.w(R.string.P1, 0, fetVar), this.c);
                    zcl zclVar = qmk.f28987a;
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarE = o7k0.e(s5x0.L(jm40Var, 2.0f, 0.0f, 2), 30.0f);
                    agi0 agi0Var = agi0.f827a;
                    mbc.o(agi0Var, mm40VarE, false, fetVar, 390, 0);
                    q0x.c(0, fetVar, null, rsm0.w(R.string.X, 0, fetVar), this.d);
                    mbc.o(agi0Var, o7k0.e(s5x0.L(jm40Var, 2.0f, 0.0f, 2), 30.0f), false, fetVar, 390, 0);
                    q0x.c(0, fetVar, null, rsm0.w(R.string.P2, 0, fetVar), this.e);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                q0x.b(x8x.L(3073), (fet) obj, this.b, this.c, this.d, this.e);
                break;
            case 6:
                ((Integer) obj2).getClass();
                ofm0.f(x8x.L(1), (fet) obj, this.b, this.c, this.d, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                k5n0.b(x8x.L(1), (fet) obj, this.b, this.c, this.d, this.e);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ cm5(mm40 mm40Var, String str, String str2, String str3, int i, byte b) {
        this.f4589a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public /* synthetic */ cm5(String str, String str2, String str3, mm40 mm40Var, int i, byte b) {
        this.f4589a = b;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.b = mm40Var;
    }
}
