package a;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/* JADX INFO: loaded from: classes2.dex */
public final class mcw0 extends zsm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f21569a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ FirebaseUser c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ FirebaseAuth f;

    public mcw0(FirebaseAuth firebaseAuth, String str, boolean z, FirebaseUser firebaseUser, String str2, String str3) {
        this.f21569a = str;
        this.b = z;
        this.c = firebaseUser;
        this.d = str2;
        this.e = str3;
        this.f = firebaseAuth;
    }

    @Override // a.zsm0
    public final Task N(String str) {
        FirebaseAuth firebaseAuth = this.f;
        nfq nfqVar = firebaseAuth.f45644a;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String str2 = this.f21569a;
        if (zIsEmpty) {
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + str2);
        }
        fck0 fck0Var = firebaseAuth.e;
        String str3 = this.e;
        String str4 = this.d;
        if (!this.b) {
            pfq pfqVar = new pfq(firebaseAuth);
            fck0Var.getClass();
            lew0 lew0Var = new lew0(str2, str4, str3, str, (byte) 1);
            lew0Var.b(nfqVar);
            lew0Var.e = pfqVar;
            return fck0Var.s(lew0Var);
        }
        FirebaseUser firebaseUser = this.c;
        s0x.H(firebaseUser);
        ofq ofqVar = new ofq(firebaseAuth, (byte) 0);
        fck0Var.getClass();
        lew0 lew0Var2 = new lew0(str2, str4, str3, str, (byte) 0);
        lew0Var2.b(nfqVar);
        lew0Var2.d = firebaseUser;
        lew0Var2.e = ofqVar;
        lew0Var2.f = ofqVar;
        return fck0Var.s(lew0Var2);
    }
}
