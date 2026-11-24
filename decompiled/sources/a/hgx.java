package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hgx implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13034a;
    public final /* synthetic */ xdr b;

    public /* synthetic */ hgx(xdr xdrVar, byte b) {
        this.f13034a = b;
        this.b = xdrVar;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        float f;
        int i2;
        ugg0 ugg0Var;
        int i3;
        int i4;
        byte b = this.f13034a;
        xdr xdrVar = this.b;
        ygx ygxVar = (ygx) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                mm40 mm40Var = (mm40) obj3;
                fet fetVar = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                ygxVar.getClass();
                mm40Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | ((iIntValue2 & 8) == 0 ? fetVar.g(ygxVar) : fetVar.i(ygxVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i |= fetVar.g(mm40Var) ? 256 : 128;
                }
                if (fetVar.U(i & 1, (i & 1171) != 1170)) {
                    if (iIntValue == 0) {
                        zcl zclVar = qmk.f28987a;
                        f = 8.0f;
                    } else {
                        zcl zclVar2 = qmk.f28987a;
                        f = 0.0f;
                    }
                    qxw.b(s5x0.N(jm40.b, 0.0f, f, 0.0f, 0.0f, 13).e(mm40Var), ygxVar, xdrVar, fetVar, (i << 3) & 112);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                num.getClass();
                mm40 mm40Var2 = (mm40) obj3;
                fet fetVar2 = (fet) obj4;
                int iIntValue3 = ((Integer) obj5).intValue();
                ygxVar.getClass();
                mm40Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    i2 = iIntValue3 | ((iIntValue3 & 8) == 0 ? fetVar2.g(ygxVar) : fetVar2.i(ygxVar) ? 4 : 2);
                } else {
                    i2 = iIntValue3;
                }
                if ((iIntValue3 & 384) == 0) {
                    i2 |= fetVar2.g(mm40Var2) ? 256 : 128;
                }
                if (fetVar2.U(i2 & 1, (i2 & 1155) != 1154)) {
                    if (ygxVar.e) {
                        zcl zclVar3 = qmk.i;
                        zcl zclVar4 = qmk.f28987a;
                        ugg0Var = new ugg0(zclVar3, zclVar3, zclVar4, zclVar4);
                    } else {
                        zcl zclVar5 = qmk.i;
                        ugg0 ugg0Var2 = vgg0.f37379a;
                        ugg0Var = new ugg0(zclVar5, zclVar5, zclVar5, zclVar5);
                    }
                    piz.e(lgb.J(mm40Var2, ugg0Var), ygxVar, xdrVar, fetVar2, (i2 << 3) & 112);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                num.getClass();
                mm40 mm40Var3 = (mm40) obj3;
                fet fetVar3 = (fet) obj4;
                int iIntValue4 = ((Integer) obj5).intValue();
                ygxVar.getClass();
                mm40Var3.getClass();
                if ((iIntValue4 & 6) == 0) {
                    i3 = iIntValue4 | ((iIntValue4 & 8) == 0 ? fetVar3.g(ygxVar) : fetVar3.i(ygxVar) ? 4 : 2);
                } else {
                    i3 = iIntValue4;
                }
                if ((iIntValue4 & 384) == 0) {
                    i3 |= fetVar3.g(mm40Var3) ? 256 : 128;
                }
                if (fetVar3.U(i3 & 1, (i3 & 1155) != 1154)) {
                    piz.e(mm40Var3, ygxVar, xdrVar, fetVar3, ((i3 >> 6) & 14) | ((i3 << 3) & 112));
                } else {
                    fetVar3.X();
                }
                break;
            default:
                num.getClass();
                mm40 mm40Var4 = (mm40) obj3;
                fet fetVar4 = (fet) obj4;
                int iIntValue5 = ((Integer) obj5).intValue();
                ygxVar.getClass();
                mm40Var4.getClass();
                if ((iIntValue5 & 6) == 0) {
                    i4 = iIntValue5 | ((iIntValue5 & 8) == 0 ? fetVar4.g(ygxVar) : fetVar4.i(ygxVar) ? 4 : 2);
                } else {
                    i4 = iIntValue5;
                }
                if ((iIntValue5 & 384) == 0) {
                    i4 |= fetVar4.g(mm40Var4) ? 256 : 128;
                }
                if (fetVar4.U(i4 & 1, (i4 & 1155) != 1154)) {
                    pzw.g(mm40Var4, ygxVar, xdrVar, fetVar4, ((i4 >> 6) & 14) | ((i4 << 3) & 112));
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
