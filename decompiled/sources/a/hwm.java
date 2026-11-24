package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hwm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13773a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ hwm(byte b, l7m0 l7m0Var, boolean z) {
        this.f13773a = b;
        this.b = l7m0Var;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f13773a;
        boolean z = this.c;
        l7m0 l7m0Var = this.b;
        byte b2 = 2;
        byte b3 = 1;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    jwb.p(jm40.b, new qw3(2.0f, true, new gne(gqw0.m, (byte) 12)), new qw3(2.0f, true, new jf4((byte) 14)), null, 0, 0, u1c.M(1702733157, new zvm(b3, l7m0Var, z), fetVar), fetVar, 1572864, 56);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    jwb.p(jm40.b, new qw3(2.0f, true, new gne(gqw0.m, (byte) 12)), new qw3(2.0f, true, new jf4((byte) 14)), null, 0, 0, u1c.M(1702762948, new zvm(b2, l7m0Var, z), fetVar2), fetVar2, 1572864, 56);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    jwb.p(jm40.b, new qw3(2.0f, true, new gne(gqw0.m, (byte) 12)), new qw3(2.0f, true, new jf4((byte) 14)), null, 3, 0, u1c.M(1702792739, new zvm((byte) 3, l7m0Var, z), fetVar3), fetVar3, 1597440, 40);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
