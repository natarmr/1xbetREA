package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tvm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34606a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ uum c;
    public final /* synthetic */ uum d;
    public final /* synthetic */ a2m e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ tvm(mm40 mm40Var, uum uumVar, uum uumVar2, a2m a2mVar, boolean z) {
        this.b = mm40Var;
        this.c = uumVar;
        this.d = uumVar2;
        this.e = a2mVar;
        this.f = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34606a) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(this.b, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE0 = o2e.e0(s5x0.L(o7k0.e(mm40VarD, 80.0f), 12.0f, 0.0f, 2), "MIDDLE_ROW_V3");
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    mm40 mm40VarE1 = o2e.e0(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "FIRST_OPPONENT_CONTAINER_V3");
                    uum uumVar = this.c;
                    fxb.v(mm40VarE1, uumVar, fetVar, 0);
                    mm40 mm40VarE2 = o2e.e0(jm40.b, "CENTER_CONTAINER_V3");
                    uum uumVar2 = this.d;
                    fxb.a(mm40VarE2, uumVar, uumVar2, this.e, this.f, fetVar, 6);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    fxb.v(o2e.e0(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "SECOND_OPPONENT_CONTAINER_V3"), uumVar2, fetVar, 0);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                fxb.a(this.b, this.c, this.d, this.e, this.f, (fet) obj, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ tvm(mm40 mm40Var, uum uumVar, uum uumVar2, a2m a2mVar, boolean z, int i) {
        this.b = mm40Var;
        this.c = uumVar;
        this.d = uumVar2;
        this.e = a2mVar;
        this.f = z;
    }
}
