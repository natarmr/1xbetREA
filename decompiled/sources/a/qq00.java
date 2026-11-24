package a;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: loaded from: classes.dex */
public final class qq00 implements ee60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zlt0 f29144a;
    public boolean b = false;

    public qq00(saw0 saw0Var, zlt0 zlt0Var) {
        this.f29144a = zlt0Var;
    }

    @Override // a.ee60
    public final void a(Object obj) {
        this.b = true;
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.f29144a.b;
        signInHubActivity.setResult(signInHubActivity.Z, signInHubActivity.f1);
        signInHubActivity.finish();
    }

    public final String toString() {
        return this.f29144a.toString();
    }
}
