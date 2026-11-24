package a;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class id40 implements o5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14565a;
    public final o5d0 b;
    public final o5d0 c;

    public /* synthetic */ id40(o5d0 o5d0Var, o5d0 o5d0Var2, byte b) {
        this.f14565a = b;
        this.b = o5d0Var;
        this.c = o5d0Var2;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f14565a;
        o5d0 o5d0Var = this.b;
        switch (b) {
            case 0:
                return new hd40((Context) ((ubf) o5d0Var).b, (cu) ((ubf) this.c).get());
            default:
                return new wpg0(new uxs0((byte) 10), new bzs0((byte) 3), r35.f, (v2h0) o5d0Var.get(), this.c);
        }
    }
}
