package a;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class upw0 implements d1x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wrw0 f36089a;

    public upw0(wrw0 wrw0Var) {
        this.f36089a = wrw0Var;
    }

    @Override // a.d1x0
    public final void a(Bundle bundle) {
        wrw0 wrw0Var = this.f36089a;
        wrw0Var.c(new jqw0(wrw0Var, bundle, (byte) 0));
    }

    @Override // a.d1x0
    public final void b(String str) {
        wrw0 wrw0Var = this.f36089a;
        wrw0Var.c(new nqw0(wrw0Var, str, (byte) 2));
    }

    @Override // a.d1x0
    public final void c(String str) {
        wrw0 wrw0Var = this.f36089a;
        wrw0Var.c(new nqw0(wrw0Var, str, (byte) 1));
    }

    @Override // a.d1x0
    public final int d(String str) {
        return this.f36089a.b(str);
    }

    @Override // a.d1x0
    public final void e(Bundle bundle, String str, String str2) {
        wrw0 wrw0Var = this.f36089a;
        wrw0Var.c(new hqw0(wrw0Var, str, str2, bundle, true));
    }

    @Override // a.d1x0
    public final Map f(String str, String str2, boolean z) {
        return this.f36089a.a(str, str2, z);
    }

    @Override // a.d1x0
    public final void g(Bundle bundle, String str, String str2) {
        wrw0 wrw0Var = this.f36089a;
        wrw0Var.c(new kqw0(wrw0Var, str, str2, bundle));
    }

    @Override // a.d1x0
    public final List h(String str, String str2) {
        return this.f36089a.f(str, str2);
    }

    @Override // a.d1x0
    public final String zzh() {
        pow0 pow0Var = new pow0();
        wrw0 wrw0Var = this.f36089a;
        wrw0Var.c(new xqw0(wrw0Var, pow0Var, (byte) 3, false));
        return (String) pow0.D(pow0Var.C(500L), String.class);
    }

    @Override // a.d1x0
    public final String zzi() {
        pow0 pow0Var = new pow0();
        wrw0 wrw0Var = this.f36089a;
        wrw0Var.c(new xqw0(wrw0Var, pow0Var, (byte) 4, false));
        return (String) pow0.D(pow0Var.C(500L), String.class);
    }

    @Override // a.d1x0
    public final String zzj() {
        pow0 pow0Var = new pow0();
        wrw0 wrw0Var = this.f36089a;
        wrw0Var.c(new xqw0(wrw0Var, pow0Var, (byte) 1));
        return (String) pow0.D(pow0Var.C(50L), String.class);
    }

    @Override // a.d1x0
    public final String zzk() {
        pow0 pow0Var = new pow0();
        wrw0 wrw0Var = this.f36089a;
        wrw0Var.c(new xqw0(wrw0Var, pow0Var, (byte) 0));
        return (String) pow0.D(pow0Var.C(500L), String.class);
    }

    @Override // a.d1x0
    public final long zzl() {
        return this.f36089a.g();
    }
}
