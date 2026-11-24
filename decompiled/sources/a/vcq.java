package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vcq implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37198a;
    public final /* synthetic */ py6 b;

    public /* synthetic */ vcq(py6 py6Var, byte b) {
        this.f37198a = b;
        this.b = py6Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f37198a;
        py6 py6Var = this.b;
        byte b2 = 1;
        y5d y5dVar = (y5d) obj;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    uf40 uf40Var = py6Var.f27792a;
                    m8x.n(null, uf40Var.c, uf40Var.d, null, u1c.M(-522966048, new vcq(py6Var, b2), fetVar), u1c.M(1615873825, new vcq(py6Var, (byte) 2), fetVar), fetVar, 224256);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    pvm0.d((mgs) py6Var.f27792a.f35562a, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    wpm0.f(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 2.0f, 7), (c480) py6Var.f27792a.b, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
