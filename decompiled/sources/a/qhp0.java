package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qhp0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28751a;
    public final /* synthetic */ rhp0 b;

    public /* synthetic */ qhp0(rhp0 rhp0Var, byte b) {
        this.f28751a = b;
        this.b = rhp0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.f28751a;
        rhp0 rhp0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((String) obj2).getClass();
                if (th instanceof ff5) {
                    p7m0 p7m0Var = rhp0Var.i.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        rhp0Var.f.getClass();
                    } while (!p7m0Var.m(value2, new ghp0(((ghp0) value2).f11312a, false, false, true)));
                } else {
                    p7m0 p7m0Var2 = rhp0Var.i.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        rhp0Var.f.getClass();
                    } while (!p7m0Var2.m(value, new ghp0(((ghp0) value).f11312a, false, true, false)));
                }
                break;
            default:
                oyg0 oyg0Var = rhp0Var.f;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((String) obj2).getClass();
                boolean z = th2 instanceof ff5;
                ocj ocjVar = rhp0Var.i;
                if (z) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var3.getValue();
                        value4.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value4, new ghp0(((ghp0) value4).f11312a, false, false, true)));
                } else {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var4.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var4.m(value3, new ghp0(((ghp0) value3).f11312a, false, true, false)));
                }
                break;
        }
        return Unit.f46060a;
    }
}
