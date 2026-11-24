package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qnv implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29048a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;

    public /* synthetic */ qnv(mm40 mm40Var, String str, long j, String str2) {
        this.f29048a = (byte) 2;
        this.b = mm40Var;
        this.c = str;
        this.e = j;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29048a) {
            case 0:
                ((Integer) obj2).getClass();
                hkb.r(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                hkb.w(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(1));
                break;
            case 2:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yx7 yx7Var = gqw0.k;
                    xx7 xx7Var = gqw0.o;
                    zcl zclVar = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new gne(xx7Var, (byte) 12)), yx7Var, fetVar, 48);
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
                    y9q0 y9q0VarJ = g1t0.j();
                    String str = this.c;
                    long j = this.e;
                    v8q0.a(str, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarJ, fetVar, 0, 28032, 102394);
                    v8q0.a(this.d, null, j, null, 0L, null, null, null, 0L, null, 0L, 1, false, 1, 0, null, g1t0.j(), fetVar, 0, 28032, 102394);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                y9a.e(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                wdx.a(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ qnv(mm40 mm40Var, String str, String str2, long j, int i, byte b) {
        this.f29048a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = str2;
        this.e = j;
    }
}
