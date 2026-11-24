package a;

import android.content.Context;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class ihq implements m5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14792a;
    public final lji0 b;
    public final m5d0 c;

    public ihq(m5d0 m5d0Var, lji0 lji0Var) {
        this.f14792a = (byte) 2;
        this.c = m5d0Var;
        this.b = lji0Var;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f14792a;
        lji0 lji0Var = this.b;
        m5d0 m5d0Var = this.c;
        switch (b) {
            case 0:
                Context context = (Context) lji0Var.b;
                CoroutineContext coroutineContext = (CoroutineContext) m5d0Var.get();
                context.getClass();
                coroutineContext.getClass();
                return m2a.k(lwf.A, new ugf0(new rnp((byte) 6)), d5c.a(coroutineContext), new i7q(context, (byte) 1));
            case 1:
                return new qyb0((Context) lji0Var.b, (out0) m5d0Var.get());
            default:
                return new xgf0((bs3) m5d0Var.get(), (CoroutineContext) lji0Var.b);
        }
    }

    public /* synthetic */ ihq(lji0 lji0Var, m5d0 m5d0Var, byte b) {
        this.f14792a = b;
        this.b = lji0Var;
        this.c = m5d0Var;
    }
}
