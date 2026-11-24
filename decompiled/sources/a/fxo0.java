package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fxo0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10320a;
    public final /* synthetic */ String b;
    public final /* synthetic */ xdr c;

    public /* synthetic */ fxo0(String str, xdr xdrVar, byte b) {
        this.f10320a = b;
        this.b = str;
        this.c = xdrVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f10320a;
        xdr xdrVar = this.c;
        switch (b) {
            case 0:
                bpq bpqVar = (bpq) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                bpqVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(bpqVar) ? 4 : 2;
                }
                int i = iIntValue;
                if (fetVar.U(i & 1, (i & 19) != 18)) {
                    zcl zclVar = qmk.f28987a;
                    v8q0.a(this.b, s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar), fetVar, 0, 0, 130044);
                    if (xdrVar == null) {
                        fetVar.e0(-587900950);
                    } else {
                        fetVar.e0(1920698103);
                        xdrVar.F(bpqVar, fetVar, Integer.valueOf(i & 14));
                    }
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                break;
            default:
                bpq bpqVar2 = (bpq) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                bpqVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(bpqVar2) ? 4 : 2;
                }
                int i2 = iIntValue2;
                if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
                    zcl zclVar2 = qmk.f28987a;
                    v8q0.a(this.b, s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, 0, 0, 130044);
                    if (xdrVar == null) {
                        fetVar2.e0(-139921213);
                    } else {
                        fetVar2.e0(1658054398);
                        xdrVar.F(bpqVar2, fetVar2, Integer.valueOf(i2 & 14));
                    }
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
