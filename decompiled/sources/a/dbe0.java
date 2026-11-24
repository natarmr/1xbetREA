package a;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dbe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5800a;
    public final l1x b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final ngd f;

    public dbe0(Context context, l1x l1xVar, n0o0 n0o0Var, n0o0 n0o0Var2, n0o0 n0o0Var3, ngd ngdVar) {
        this.f5800a = context;
        this.b = l1xVar;
        this.c = n0o0Var;
        this.d = n0o0Var2;
        this.e = n0o0Var3;
        this.f = ngdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dbe0) {
            dbe0 dbe0Var = (dbe0) obj;
            return Intrinsics.d(this.f5800a, dbe0Var.f5800a) && this.b.equals(dbe0Var.b) && this.c == dbe0Var.c && this.d == dbe0Var.d && this.e == dbe0Var.e && this.f == dbe0Var.f;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f.hashCode() + ((jf4.c.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f5800a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.f5800a + ", defaults=" + this.b + ", mainCoroutineContextLazy=" + this.c + ", memoryCacheLazy=" + this.d + ", diskCacheLazy=" + this.e + ", eventListenerFactory=" + jf4.c + ", componentRegistry=" + this.f + ", logger=null)";
    }
}
