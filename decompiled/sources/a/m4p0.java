package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m4p0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21183a;
    public final /* synthetic */ q4p0 b;

    public /* synthetic */ m4p0(q4p0 q4p0Var, byte b) {
        this.f21183a = b;
        this.b = q4p0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = this.f21183a;
        q4p0 q4p0Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                if (q4p0Var.u.c()) {
                    q4p0Var.G(new i4p0(q4p0Var.o.b.a(iIntValue, Arrays.copyOf(new Object[0], 0))));
                } else {
                    p7m0 p7m0Var = q4p0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        q4p0Var.f.getClass();
                    } while (!p7m0Var.m(value, h4p0.a((h4p0) value, false, true, null, 25)));
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                th.getClass();
                p7m0 p7m0Var2 = q4p0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    q4p0Var.f.getClass();
                } while (!p7m0Var2.m(value2, h4p0.a((h4p0) value2, false, true, iun.f15405a, 16)));
                th.printStackTrace();
                break;
        }
        return Unit.f46060a;
    }
}
