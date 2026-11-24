package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p02 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26126a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    public /* synthetic */ p02(mm40 mm40Var, float f, float f2, float f3) {
        this.b = mm40Var;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26126a) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarQ = i120.Q(o7k0.s(o7k0.e(this.b, 146.0f), 88.0f), ijg.e1, jd8.n);
                    tj30 tj30VarC = zq8.c(gqw0.b, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
                    j0x.b(a8k0.F(R.drawable.valorant_aim, 0, fetVar), null, null, null, null, 0.0f, null, fetVar, 56, 124);
                    j0x.b(a8k0.F(R.drawable.valorant_aim_head, 0, fetVar), null, null, null, null, this.c, null, fetVar, 56, 92);
                    j0x.b(a8k0.F(R.drawable.valorant_aim_body, 0, fetVar), null, null, null, null, this.d, null, fetVar, 56, 92);
                    j0x.b(a8k0.F(R.drawable.valorant_aim_leg, 0, fetVar), null, null, null, null, this.e, null, fetVar, 56, 92);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                oja0.b(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ p02(mm40 mm40Var, float f, float f2, float f3, int i) {
        this.b = mm40Var;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }
}
