package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v0c0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36575a;
    public final /* synthetic */ a1c0 b;

    public /* synthetic */ v0c0(a1c0 a1c0Var, byte b) {
        this.f36575a = b;
        this.b = a1c0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f36575a;
        a1c0 a1c0Var = this.b;
        switch (b) {
            case 0:
                rl70 rl70Var = a1c0.O1;
                a1c0Var.H0().x(j0c0.f15677a);
                return Unit.f46060a;
            case 1:
                rl70 rl70Var2 = a1c0.O1;
                a1c0Var.H0().x(l0c0.f19194a);
                return Unit.f46060a;
            case 2:
                rl70 rl70Var3 = a1c0.O1;
                ComponentCallbacks2 application = a1c0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(yzb0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof yzb0)) {
                        ze3Var = null;
                    }
                    yzb0 yzb0Var = (yzb0) ze3Var;
                    if (yzb0Var != null) {
                        return yzb0Var.a(a4n0.f(a1c0Var), a1c0.class.getSimpleName());
                    }
                }
                jf4.n(b1j.i(yzb0.class, "Cannot create dependency "));
                return null;
            case 3:
                rl70 rl70Var4 = a1c0.O1;
                return new q0h0((lpi) a1c0Var.G0().A.get());
            case 4:
                rl70 rl70Var5 = a1c0.O1;
                a1c0Var.H0().x(n0c0.f22693a);
                return Unit.f46060a;
            default:
                rl70 rl70Var6 = a1c0.O1;
                a1c0Var.H0().x(o0c0.f24417a);
                return Unit.f46060a;
        }
    }
}
