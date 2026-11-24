package a;

import android.content.Context;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class jhq implements m5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16540a = 0;
    public final m5d0 b;
    public final m5d0 c;
    public final m5d0 d;

    public jhq(m5d0 m5d0Var, m5d0 m5d0Var2, m5d0 m5d0Var3) {
        this.b = m5d0Var;
        this.c = m5d0Var2;
        this.d = m5d0Var3;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f16540a;
        m5d0 m5d0Var = this.d;
        m5d0 m5d0Var2 = this.c;
        m5d0 m5d0Var3 = this.b;
        switch (b) {
            case 0:
                Context context = (Context) ((lji0) m5d0Var).b;
                CoroutineContext coroutineContext = (CoroutineContext) m5d0Var3.get();
                kji0 kji0Var = (kji0) m5d0Var2.get();
                context.getClass();
                coroutineContext.getClass();
                kji0Var.getClass();
                return m2a.k(kji0Var, new ugf0(new g7p(kji0Var, (byte) 8)), d5c.a(coroutineContext), new i7q(context, (byte) 2));
            default:
                return new wzi0((CoroutineContext) m5d0Var3.get(), (olq0) m5d0Var2.get(), (wbj) m5d0Var.get());
        }
    }

    public jhq(lji0 lji0Var, m5d0 m5d0Var, m5d0 m5d0Var2) {
        this.d = lji0Var;
        this.b = m5d0Var;
        this.c = m5d0Var2;
    }
}
