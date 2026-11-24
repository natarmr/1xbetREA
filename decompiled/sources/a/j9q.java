package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j9q implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16150a;
    public final /* synthetic */ qy6 b;

    public /* synthetic */ j9q(qy6 qy6Var, byte b) {
        this.f16150a = b;
        this.b = qy6Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f16150a;
        qy6 qy6Var = this.b;
        byte b2 = 1;
        y5d y5dVar = (y5d) obj;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    q8x.i(s5x0.L(jm40.b, 12.0f, 0.0f, 2), qy6Var.f29520a.b, null, u1c.M(1730745342, new j9q(qy6Var, b2), fetVar), fetVar, 3456);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    qcc.r(null, (igs) qy6Var.f29520a.f37314a, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
