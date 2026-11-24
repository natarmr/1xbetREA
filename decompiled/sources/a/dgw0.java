package a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dgw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f6063a;
    public final zlt0 b = new zlt0((Object) this, (byte) 11);
    public nfq c;
    public FirebaseUser d;
    public lyw0 e;
    public amw0 f;
    public trm0 g;
    public zzaia h;
    public biw0 i;
    public AuthCredential j;
    public cmt0 k;
    public jiw0 l;
    public boolean m;

    /* JADX WARN: Multi-variable type inference failed */
    public dgw0(int i) {
        new ArrayList();
        this.f6063a = i;
    }

    public abstract String a();

    public final void b(nfq nfqVar) {
        s0x.I(nfqVar, "firebaseApp cannot be null");
        this.c = nfqVar;
    }

    public final void c(Status status) {
        this.m = true;
        this.g.s(null, status);
    }

    public abstract void d(TaskCompletionSource taskCompletionSource, ffw0 ffw0Var);

    public abstract void e();

    public final void f(Object obj) {
        this.m = true;
        this.g.s(obj, null);
    }
}
