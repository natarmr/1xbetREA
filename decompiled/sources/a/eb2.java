package a;

import java.net.UnknownHostException;
import java.util.Date;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class eb2 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7498a;
    public final /* synthetic */ hb2 b;

    public /* synthetic */ eb2(hb2 hb2Var, byte b) {
        this.f7498a = b;
        this.b = hb2Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        Object value2;
        Date date;
        Object value3;
        byte b = this.f7498a;
        hb2 hb2Var = this.b;
        switch (b) {
            case 0:
                k2g0 k2g0Var = (k2g0) obj;
                hb2Var.o.e("EXPANDED_IDS_KEY", k2g0Var.d);
                p7m0 p7m0Var = hb2Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    hb2Var.f.getClass();
                } while (!p7m0Var.m(value, ab2.a((ab2) value, null, null, false, null, false, false, false, null, null, k2g0Var.d, 57343)));
                break;
            case 1:
                Date date2 = (Date) obj;
                int i = hb2.E;
                p7m0 p7m0Var2 = hb2Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    hb2Var.f.getClass();
                } while (!p7m0Var2.m(value2, ab2.a((ab2) value2, null, date2, false, null, false, false, false, null, null, null, 65533)));
                hb2Var.o.e("KEY_CURRENT_DATE", date2);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                oyg0 oyg0Var = hb2Var.f;
                int i2 = hb2.E;
                ocj ocjVar = hb2Var.i;
                p7m0 p7m0Var3 = ocjVar.f25029a;
                while (true) {
                    Object value4 = p7m0Var3.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                    oyg0 oyg0Var2 = oyg0Var;
                    if (!p7m0Var3.m(value4, ab2.a((ab2) value4, null, null, zBooleanValue, null, false, false, false, null, null, null, 65531))) {
                        oyg0Var = oyg0Var2;
                    } else if (!zBooleanValue && (((ab2) hb2Var.D()).d instanceof ya2)) {
                        p7m0 p7m0Var4 = ocjVar.f25029a;
                        do {
                            value3 = p7m0Var4.getValue();
                            value3.getClass();
                            oyg0Var2.getClass();
                        } while (!p7m0Var4.m(value3, ab2.a((ab2) value3, null, null, false, new wa2(new UnknownHostException()), false, false, false, null, null, null, 65519)));
                    } else if (zBooleanValue) {
                        if (((ab2) hb2Var.D()).d instanceof xa2) {
                            za2 za2Var = ((ab2) hb2Var.D()).d;
                            xa2 xa2Var = za2Var instanceof xa2 ? (xa2) za2Var : null;
                            if (xa2Var != null && (date = xa2Var.f40533a) != null) {
                                Date date3 = ((ab2) hb2Var.D()).b;
                                if (date3 == null) {
                                    date3 = new Date();
                                }
                                if (!ntb.V(date, date3)) {
                                    hb2Var.M(false);
                                }
                            }
                        } else {
                            hb2Var.M(false);
                        }
                    }
                    break;
                }
                break;
        }
        return Unit.f46060a;
    }
}
