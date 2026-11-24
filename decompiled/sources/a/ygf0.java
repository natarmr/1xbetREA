package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class ygf0 implements m5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42581a = 1;
    public final m5d0 b;
    public final m5d0 c;
    public final m5d0 d;
    public final m5d0 e;
    public final m5d0 f;

    public ygf0(m5d0 m5d0Var, m5d0 m5d0Var2, m5d0 m5d0Var3, m5d0 m5d0Var4, m5d0 m5d0Var5) {
        this.b = m5d0Var;
        this.c = m5d0Var2;
        this.d = m5d0Var3;
        this.e = m5d0Var4;
        this.f = m5d0Var5;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f42581a;
        m5d0 m5d0Var = this.e;
        m5d0 m5d0Var2 = this.d;
        m5d0 m5d0Var3 = this.c;
        m5d0 m5d0Var4 = this.b;
        m5d0 m5d0Var5 = this.f;
        switch (b) {
            case 0:
                return new wgf0((olq0) m5d0Var4.get(), (dgq) m5d0Var3.get(), (bs3) m5d0Var2.get(), (xgf0) m5d0Var.get(), (wzi0) m5d0Var5.get());
            default:
                return new uji0((nfq) ((lji0) m5d0Var5).b, (dgq) m5d0Var4.get(), (xmi0) m5d0Var3.get(), (oco) m5d0Var2.get(), (CoroutineContext) m5d0Var.get());
        }
    }

    public ygf0(lji0 lji0Var, m5d0 m5d0Var, m5d0 m5d0Var2, m5d0 m5d0Var3, m5d0 m5d0Var4) {
        this.f = lji0Var;
        this.b = m5d0Var;
        this.c = m5d0Var2;
        this.d = m5d0Var3;
        this.e = m5d0Var4;
    }
}
