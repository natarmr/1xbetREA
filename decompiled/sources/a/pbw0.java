package a;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/* JADX INFO: loaded from: classes2.dex */
public final class pbw0 extends zsm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26731a;
    public final /* synthetic */ FirebaseUser b;
    public final /* synthetic */ EmailAuthCredential c;
    public final /* synthetic */ FirebaseAuth d;

    public pbw0(FirebaseAuth firebaseAuth, boolean z, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.f26731a = z;
        this.b = firebaseUser;
        this.c = emailAuthCredential;
        this.d = firebaseAuth;
    }

    @Override // a.zsm0
    public final Task N(String str) {
        FirebaseAuth firebaseAuth = this.d;
        nfq nfqVar = firebaseAuth.f45644a;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        fck0 fck0Var = firebaseAuth.e;
        EmailAuthCredential emailAuthCredential = this.c;
        if (!this.f26731a) {
            pfq pfqVar = new pfq(firebaseAuth);
            fck0Var.getClass();
            kew0 kew0Var = new kew0(emailAuthCredential, str, (byte) 1);
            kew0Var.b(nfqVar);
            kew0Var.e = pfqVar;
            return fck0Var.s(kew0Var);
        }
        FirebaseUser firebaseUser = this.b;
        s0x.H(firebaseUser);
        ofq ofqVar = new ofq(firebaseAuth, (byte) 0);
        fck0Var.getClass();
        kew0 kew0Var2 = new kew0(emailAuthCredential, str, (byte) 0);
        kew0Var2.b(nfqVar);
        kew0Var2.d = firebaseUser;
        kew0Var2.e = ofqVar;
        kew0Var2.f = ofqVar;
        return fck0Var.s(kew0Var2);
    }
}
