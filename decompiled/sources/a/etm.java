package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class etm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8382a;
    public final /* synthetic */ float b;
    public final /* synthetic */ xx7 c;
    public final /* synthetic */ a4x d;

    public /* synthetic */ etm(float f, xx7 xx7Var, a4x a4xVar, byte b) {
        this.f8382a = b;
        this.b = f;
        this.c = xx7Var;
        this.d = a4xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8382a;
        a4x a4xVar = this.d;
        xx7 xx7Var = this.c;
        float f = this.b;
        byte b2 = 2;
        byte b3 = 1;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qw3 qw3Var = new qw3(f, true, new gne(xx7Var, (byte) 12));
                    zcl zclVar = qmk.f28987a;
                    jwb.p(null, qw3Var, new qw3(2.0f, true, new jf4((byte) 14)), null, 0, 2, u1c.M(-1325308367, new yoh(a4xVar, b3), fetVar), fetVar, 1769472, 25);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    thg0 thg0VarA = shg0.a(new qw3(f, true, new gne(xx7Var, (byte) 12)), gqw0.j, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, x7zVar);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    Iterator itO = h97.o(fetVar2, mm40VarC0, gqw0.v, -1753613926, a4xVar);
                    while (itO.hasNext()) {
                        pm80 pm80VarF = a8k0.F(((Number) itO.next()).intValue(), 0, fetVar2);
                        zcl zclVar2 = qmk.f28987a;
                        j0x.b(pm80VarF, null, o7k0.p(jm40.b, 24.0f, 32.0f), null, null, 0.0f, null, fetVar2, 56, 120);
                    }
                    fetVar2.r(false);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qw3 qw3Var2 = new qw3(f, true, new gne(xx7Var, (byte) 12));
                    zcl zclVar3 = qmk.f28987a;
                    jwb.p(null, qw3Var2, new qw3(2.0f, true, new jf4((byte) 14)), null, 0, 0, u1c.M(-2090433728, new yoh(a4xVar, b2), fetVar3), fetVar3, 1572864, 57);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qw3 qw3Var3 = new qw3(f, true, new gne(xx7Var, (byte) 12));
                    zcl zclVar4 = qmk.f28987a;
                    jwb.p(null, qw3Var3, new qw3(2.0f, true, new jf4((byte) 14)), null, 0, 0, u1c.M(-2090403937, new yoh(a4xVar, (byte) 3), fetVar4), fetVar4, 1572864, 57);
                } else {
                    fetVar4.X();
                }
                break;
            default:
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qw3 qw3Var4 = new qw3(f, true, new gne(xx7Var, (byte) 12));
                    zcl zclVar5 = qmk.f28987a;
                    jwb.p(null, qw3Var4, new qw3(2.0f, true, new jf4((byte) 14)), null, 0, 0, u1c.M(-2090374146, new yoh(a4xVar, (byte) 4), fetVar5), fetVar5, 1572864, 57);
                } else {
                    fetVar5.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
