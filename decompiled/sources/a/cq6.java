package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cq6 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4776a;
    public final /* synthetic */ ny6 b;

    public /* synthetic */ cq6(ny6 ny6Var, byte b) {
        this.f4776a = b;
        this.b = ny6Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f4776a;
        ny6 ny6Var = this.b;
        byte b2 = 1;
        y5d y5dVar = (y5d) obj;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    uf40 uf40Var = ny6Var.f24315a;
                    m8x.n(null, uf40Var.c, uf40Var.d, null, u1c.M(-125159328, new cq6(ny6Var, b2), fetVar), u1c.M(-2127470657, new cq6(ny6Var, (byte) 2), fetVar), fetVar, 224256);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    r7x.c(6, fetVar2, o7k0.d(jm40.b, 1.0f), ((kgs) ny6Var.f24315a.f35562a).f18255a);
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
                    idx.h(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 2.0f, 7), (b480) ny6Var.f24315a.b, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
