package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24415a;
    public final /* synthetic */ f1b0 b;

    public /* synthetic */ o0b0(f1b0 f1b0Var, byte b) {
        this.f24415a = b;
        this.b = f1b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        d0b0 d0b0Var;
        byte b = this.f24415a;
        f1b0 f1b0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                f1b0Var.p.b(th, new jfa0((byte) 14));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                p7m0 p7m0Var = f1b0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    d0b0Var = (d0b0) value;
                    f1b0Var.f.getClass();
                } while (!p7m0Var.m(value, h8x.B(d0b0Var, false, true, d0b0Var.b.c)));
                f1b0Var.Q(th2);
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                f1b0Var.H(new jfa0((byte) 15));
                f1b0Var.Q(th3);
                break;
            case 3:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(f1b0Var.z.q(new fr1(null, null, 3)));
                break;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                f1b0Var.H(new jfa0((byte) 17));
                f1b0Var.Q(th4);
                break;
            case 5:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                f1b0Var.H(new jfa0((byte) 16));
                f1b0Var.Q(th5);
                break;
            default:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                f1b0Var.H(new jfa0((byte) 18));
                f1b0Var.Q(th6);
                break;
        }
        return Unit.f46060a;
    }
}
