package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pp2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27355a;
    public final /* synthetic */ f3w b;
    public final /* synthetic */ long c;

    public /* synthetic */ pp2(f3w f3wVar, long j, byte b) {
        this.f27355a = b;
        this.b = f3wVar;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27355a;
        jm40 jm40Var = jm40.b;
        f3w f3wVar = this.b;
        byte b2 = 2;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    y9a.h(mrv.k0(jm40Var, "DESCRIPTION_TEXT"), f3wVar.c, f3wVar.d, this.c, 0L, 0L, null, fetVar, 3078, 224);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(-906609983, new pp2(f3wVar, this.c, b2), fetVar2), fetVar2, 56);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mm40 mm40VarK0 = mrv.k0(jm40Var, "DESCRIPTION_TEXT");
                    zcl zclVar = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar3, 0);
                    int iHashCode = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM = fetVar3.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarK0);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(e7z.u1);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, thg0VarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar3);
                    mm40 mm40VarE0 = o2e.e0(ohs0.i(fetVar3, mm40VarC0, gqw0.v, 1.0f, false), "SUM_VALUE_TEST_TAG");
                    String str = f3wVar.c;
                    y9q0 y9q0VarD = g1t0.d();
                    long j = this.c;
                    v8q0.a(str, mm40VarE0, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar3, 384, 24960, 110584);
                    v8q0.a(f3wVar.d, o2e.e0(jm40Var, "CURRENCY_VALUE_TEST_TAG"), j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar3, 432, 24960, 110584);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
