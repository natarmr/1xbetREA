package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ly2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20844a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ly2(long j, mm40 mm40Var) {
        this.f20844a = (byte) 0;
        this.c = j;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20844a;
        mm40 mm40Var = this.b;
        long j = this.c;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40Var2 = this.b;
                    if (j != 9205357640488583168L) {
                        fetVar.e0(-1244013944);
                        mm40 mm40VarK = o7k0.k(mm40Var2, bdl.b(j), bdl.a(j), 0.0f, 0.0f, 12);
                        tj30 tj30VarC = zq8.c(gqw0.b, false);
                        int iHashCode = Long.hashCode(fetVar.T);
                        bh90 bh90VarM = fetVar.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30VarC, gqw0.x);
                        jpm0.o(fetVar, bh90VarM, gqw0.w);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC0, gqw0.v);
                        oy2.b(0, 1, fetVar, null);
                        fetVar.r(true);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1243644858);
                        oy2.b(0, 0, fetVar, mm40Var2);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                num.getClass();
                y9a.j(x8x.L(1), j, fetVar, mm40Var);
                break;
            case 2:
                num.getClass();
                kbc.e(x8x.L(1), j, fetVar, mm40Var);
                break;
            case 3:
                num.getClass();
                jiq0.G(x8x.L(7), j, fetVar, mm40Var);
                break;
            case 4:
                num.getClass();
                kkb.j(x8x.L(1), j, fetVar, mm40Var);
                break;
            case 5:
                num.getClass();
                jeb.y(x8x.L(7), j, fetVar, mm40Var);
                break;
            case 6:
                num.getClass();
                sj3.m(x8x.L(1), j, fetVar, mm40Var);
                break;
            case 7:
                num.getClass();
                nia0.I(x8x.L(1), j, fetVar, mm40Var);
                break;
            case 8:
                num.getClass();
                nia0.r(x8x.L(1), j, fetVar, mm40Var);
                break;
            case 9:
                num.getClass();
                rcb.q(x8x.L(1), j, fetVar, mm40Var);
                break;
            case 10:
                num.getClass();
                gkb.q(x8x.L(1), j, fetVar, mm40Var);
                break;
            case 11:
                num.getClass();
                gkb.g(x8x.L(1), j, fetVar, mm40Var);
                break;
            case 12:
                num.getClass();
                gkb.r(x8x.L(1), j, fetVar, mm40Var);
                break;
            default:
                num.getClass();
                u4n0.b(x8x.L(1), j, fetVar, mm40Var);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ly2(mm40 mm40Var, long j, int i, byte b) {
        this.f20844a = b;
        this.b = mm40Var;
        this.c = j;
    }
}
