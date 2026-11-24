package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k5h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17719a = 1;
    public final /* synthetic */ m0x b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;

    public /* synthetic */ k5h(int i, long j, m0x m0xVar, String str) {
        this.b = m0xVar;
        this.c = str;
        this.d = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17719a) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
                    mm40 mm40VarN = o7k0.n(jm40Var, 14.0f);
                    mm40 mm40VarN2 = o7k0.n(jm40Var, 14.0f);
                    Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_cyber_gamepad);
                    long j = this.d;
                    uc9.c(mm40VarN, mm40VarN2, this.b, numValueOf, new y3d(j), new y3d(j), null, gqw0.A, null, fetVar, 12582912, 320);
                    f2q0 f2q0Var = new f2q0(3);
                    ((g1t0) fetVar.k(j1t0.e)).getClass();
                    v8q0.a(this.c, null, j, null, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 109562);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                knx.L(this.b, this.c, this.d, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ k5h(long j, m0x m0xVar, String str) {
        this.b = m0xVar;
        this.d = j;
        this.c = str;
    }
}
