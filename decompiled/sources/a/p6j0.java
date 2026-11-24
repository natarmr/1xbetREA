package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p6j0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26458a;
    public final /* synthetic */ r6j0 b;

    public /* synthetic */ p6j0(r6j0 r6j0Var, byte b) {
        this.f26458a = b;
        this.b = r6j0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26458a;
        r6j0 r6j0Var = this.b;
        switch (b) {
            case 0:
                gle0 gle0Var = r6j0.N1;
                r6j0Var.G0().x(j6j0.f15991a);
                return Unit.f46060a;
            case 1:
                gle0 gle0Var2 = r6j0.N1;
                ComponentCallbacks2 application = r6j0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(cu90.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof cu90)) {
                        ze3Var = null;
                    }
                    cu90 cu90Var = (cu90) ze3Var;
                    if (cu90Var != null) {
                        return cu90Var.a(a4n0.f(r6j0Var), r6j0.class.getSimpleName());
                    }
                }
                jf4.n(b1j.i(cu90.class, "Cannot create dependency "));
                return null;
            case 2:
                return new q0h0((wni) ((zni) r6j0Var.L1.getValue()).m.get());
            case 3:
                gle0 gle0Var3 = r6j0.N1;
                r6j0Var.G0().x(f6j0.f9014a);
                return Unit.f46060a;
            default:
                gle0 gle0Var4 = r6j0.N1;
                r6j0Var.G0().x(g6j0.f10769a);
                return Unit.f46060a;
        }
    }
}
