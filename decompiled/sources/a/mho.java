package a;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class mho implements o5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21804a;
    public final o5d0 b;

    public /* synthetic */ mho(o5d0 o5d0Var, byte b) {
        this.f21804a = b;
        this.b = o5d0Var;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f21804a;
        o5d0 o5d0Var = this.b;
        switch (b) {
            case 0:
                String packageName = ((Context) o5d0Var.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                hny.u("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new v2h0((Context) o5d0Var.get(), "com.google.android.datatransport.events", ((Integer) kc5.j.get()).intValue());
        }
    }
}
