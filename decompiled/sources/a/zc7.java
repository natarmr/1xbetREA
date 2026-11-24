package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zc7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44153a;
    public final /* synthetic */ kd7 b;

    public /* synthetic */ zc7(kd7 kd7Var, byte b) {
        this.f44153a = b;
        this.b = kd7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        byte b = this.f44153a;
        kd7 kd7Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj2;
                ((Throwable) obj).getClass();
                str.getClass();
                kd7Var.G(new kc7(new xdk0(rek0.b, str, "", null, null, null, 120)));
                break;
            case 1:
                String str2 = (String) obj2;
                ((Throwable) obj).getClass();
                str2.getClass();
                kd7Var.G(new kc7(new xdk0(rek0.b, str2, "", null, null, null, 120)));
                break;
            case 2:
                Throwable th = (Throwable) obj;
                String str3 = (String) obj2;
                th.getClass();
                str3.getClass();
                if (th instanceof zhi0) {
                    kd7Var.G(new kc7(new xdk0(rek0.b, str3, "", null, null, null, 120)));
                }
                break;
            case 3:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                kd7Var.G(ec7.f7550a);
                break;
            case 4:
                String str4 = (String) obj2;
                ((Throwable) obj).getClass();
                str4.getClass();
                kd7Var.G(new kc7(new xdk0(rek0.b, str4, "", null, null, null, 120)));
                break;
            case 5:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var = kd7Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    kd7Var.f.getClass();
                } while (!p7m0Var.m(value, rc7.a((rc7) value, p9x.f26629a, false, null, null, null, null, null, null, null, false, false, false, 0L, 0L, 268435454)));
                break;
            default:
                kc7 kc7Var = new kc7(new xdk0(rek0.b, (String) obj2, "", null, null, null, 120));
                List list = kd7.m0;
                kd7Var.G(kc7Var);
                break;
        }
        return Unit.f46060a;
    }
}
