package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yl8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42827a;
    public final /* synthetic */ km8 b;

    public /* synthetic */ yl8(km8 km8Var, byte b) {
        this.f42827a = b;
        this.b = km8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.f42827a;
        km8 km8Var = this.b;
        switch (b) {
            case 0:
                oyg0 oyg0Var = km8Var.f;
                Throwable th = (Throwable) obj;
                th.getClass();
                ocj ocjVar = km8Var.i;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value, nl8.a((nl8) value, null, 0, false, false, null, 61)));
                km8Var.G(new gl8(km8Var.p.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0))));
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value2, nl8.a((nl8) value2, null, 0, false, false, null, 35)));
                km8Var.v.b(th, new i87((byte) 29));
                break;
            case 1:
                oyg0 oyg0Var2 = km8Var.f;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ocj ocjVar2 = km8Var.i;
                p7m0 p7m0Var3 = ocjVar2.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    oyg0Var2.getClass();
                } while (!p7m0Var3.m(value3, nl8.a((nl8) value3, null, 0, false, false, null, 61)));
                km8Var.G(cl8.f4543a);
                p7m0 p7m0Var4 = ocjVar2.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    oyg0Var2.getClass();
                } while (!p7m0Var4.m(value4, nl8.a((nl8) value4, null, 0, false, false, null, 35)));
                km8Var.v.b(th2, new i87((byte) 29));
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                km8Var.O(th3);
                break;
            default:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                km8Var.O(th4);
                break;
        }
        return Unit.f46060a;
    }
}
