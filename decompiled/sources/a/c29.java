package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c29 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3614a;
    public final /* synthetic */ s29 b;

    public /* synthetic */ c29(s29 s29Var, byte b) {
        this.f3614a = b;
        this.b = s29Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f3614a;
        s29 s29Var = this.b;
        switch (b) {
            case 0:
                pb0 pb0Var = (pb0) obj;
                pb0Var.getClass();
                p7m0 p7m0Var = s29Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    s29Var.f.getClass();
                } while (!p7m0Var.m(value, x19.a((x19) value, null, null, null, false, pb0Var.f26680a, null, 495)));
                break;
            default:
                s29Var.r.b((Throwable) obj, new im8((byte) 7));
                break;
        }
        return Unit.f46060a;
    }
}
