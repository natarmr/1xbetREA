package a;

import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class p72 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26484a;
    public final /* synthetic */ s72 b;

    public /* synthetic */ p72(s72 s72Var, byte b) {
        this.f26484a = b;
        this.b = s72Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00cf  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        Date date;
        Object value2;
        byte b = this.f26484a;
        s72 s72Var = this.b;
        switch (b) {
            case 0:
                s72 s72Var2 = s72Var;
                List list = (List) obj;
                int i = s72.I;
                p7m0 p7m0Var = s72Var2.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var.getValue();
                    value3.getClass();
                    s72Var2.f.getClass();
                    s72 s72Var3 = s72Var2;
                    if (!p7m0Var.m(value3, g72.a((g72) value3, null, null, false, null, false, false, false, false, false, null, list, null, 393215))) {
                        s72Var2 = s72Var3;
                    }
                    break;
                }
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    int i2 = s72.I;
                    p7m0 p7m0Var2 = s72Var.i.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        s72Var.f.getClass();
                    } while (!p7m0Var2.m(value, g72.a((g72) value, null, null, false, null, false, false, false, false, true, null, null, null, 491519)));
                }
                break;
            case 2:
                Date date2 = (Date) obj;
                Date date3 = ((g72) s72Var.D()).b;
                if ((date2 != null && date3 != null && !ntb.V(date2, date3)) || ((date2 == null && date3 != null) || (date2 != null && date3 == null))) {
                    s72Var.H(new o00(date2, (byte) 27));
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                oyg0 oyg0Var = s72Var.f;
                int i3 = s72.I;
                ocj ocjVar = s72Var.i;
                p7m0 p7m0Var3 = ocjVar.f25029a;
                while (true) {
                    Object value4 = p7m0Var3.getValue();
                    value4.getClass();
                    ocj ocjVar2 = ocjVar;
                    oyg0Var.getClass();
                    p7m0 p7m0Var4 = p7m0Var3;
                    oyg0 oyg0Var2 = oyg0Var;
                    s72 s72Var4 = s72Var;
                    if (!p7m0Var4.m(value4, g72.a((g72) value4, null, null, zBooleanValue, null, false, false, false, false, false, null, null, null, 524283))) {
                        oyg0Var = oyg0Var2;
                        p7m0Var3 = p7m0Var4;
                        s72Var = s72Var4;
                        ocjVar = ocjVar2;
                    } else if (!zBooleanValue && (((g72) s72Var4.D()).d instanceof e72)) {
                        p7m0 p7m0Var5 = ocjVar2.f25029a;
                        do {
                            value2 = p7m0Var5.getValue();
                            value2.getClass();
                            oyg0Var2.getClass();
                        } while (!p7m0Var5.m(value2, g72.a((g72) value2, null, null, false, new c72(new UnknownHostException()), false, false, false, false, false, null, null, null, 524271)));
                    } else if (zBooleanValue) {
                        if (((g72) s72Var4.D()).d instanceof d72) {
                            f72 f72Var = ((g72) s72Var4.D()).d;
                            d72 d72Var = f72Var instanceof d72 ? (d72) f72Var : null;
                            if (d72Var != null && (date = d72Var.b) != null) {
                                Date date4 = ((g72) s72Var4.D()).b;
                                if (date4 == null) {
                                    date4 = new Date();
                                }
                                if (!ntb.V(date, date4)) {
                                    s72Var4.M(false);
                                }
                            }
                        } else {
                            s72Var4.M(false);
                        }
                    }
                    break;
                }
                break;
        }
        return Unit.f46060a;
    }
}
