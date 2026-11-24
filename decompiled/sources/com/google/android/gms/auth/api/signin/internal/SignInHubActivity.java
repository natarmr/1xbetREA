package com.google.android.gms.auth.api.signin.internal;

import a.bbw0;
import a.dzj;
import a.gnk0;
import a.h0q0;
import a.j2e;
import a.j9w0;
import a.jf4;
import a.kxq;
import a.ny9;
import a.piu0;
import a.pq00;
import a.qq00;
import a.rq00;
import a.saw0;
import a.sgy;
import a.sre0;
import a.vbf;
import a.xqm0;
import a.zlt0;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Modifier;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class SignInHubActivity extends kxq {
    public static boolean g1 = false;
    public boolean A = false;
    public SignInConfiguration B;
    public boolean Y;
    public int Z;
    public Intent f1;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // a.kxq, a.agd, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.A) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.b) != null) {
                bbw0 bbw0VarT = bbw0.t(this);
                GoogleSignInOptions googleSignInOptions = this.B.b;
                synchronized (bbw0VarT) {
                    ((xqm0) bbw0VarT.b).c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.Y = true;
                this.Z = i2;
                this.f1 = intent;
                t();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                u(intExtra);
                return;
            }
        }
        u(8);
    }

    @Override // a.kxq, a.agd, a.zfd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            u(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            u(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.B = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.Y = z;
            if (z) {
                this.Z = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.f1 = intent2;
                    t();
                    return;
                } else {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (g1) {
            setResult(0);
            u(12502);
            return;
        }
        g1 = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.B);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.A = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            u(17);
        }
    }

    @Override // a.kxq, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        g1 = false;
    }

    @Override // a.agd, a.zfd, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.Y);
        if (this.Y) {
            bundle.putInt("signInResultCode", this.Z);
            bundle.putParcelable("signInResultData", this.f1);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void t() {
        piu0 piu0VarG = g();
        dzj dzjVar = rq00.d;
        piu0VarG.getClass();
        vbf vbfVar = vbf.b;
        vbfVar.getClass();
        h0q0 h0q0Var = new h0q0(piu0VarG, dzjVar, vbfVar);
        sgy sgyVarB = sre0.f32672a.b(rq00.class);
        String strT = ny9.T(sgyVarB);
        if (strT == null) {
            jf4.o("Local and anonymous classes can not be ViewModels");
            return;
        }
        rq00 rq00Var = (rq00) h0q0Var.t(sgyVarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strT));
        zlt0 zlt0Var = new zlt0(this, (byte) 10);
        boolean z = rq00Var.c;
        gnk0 gnk0Var = rq00Var.b;
        if (z) {
            jf4.n("Called while creating a loader");
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            jf4.n("initLoader must be called on the main thread");
            return;
        }
        gnk0Var.getClass();
        pq00 pq00Var = (pq00) j2e.L(gnk0Var, 0);
        if (pq00Var == null) {
            try {
                rq00Var.c = true;
                Set set = j9w0.b;
                synchronized (set) {
                }
                saw0 saw0Var = new saw0(this, set);
                if (saw0.class.isMemberClass() && !Modifier.isStatic(saw0.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + saw0Var);
                }
                pq00 pq00Var2 = new pq00(saw0Var);
                gnk0Var.c(0, pq00Var2);
                rq00Var.c = false;
                qq00 qq00Var = new qq00(pq00Var2.l, zlt0Var);
                pq00Var2.e(this, qq00Var);
                qq00 qq00Var2 = pq00Var2.n;
                if (qq00Var2 != null) {
                    pq00Var2.j(qq00Var2);
                }
                pq00Var2.m = this;
                pq00Var2.n = qq00Var;
            } catch (Throwable th) {
                rq00Var.c = false;
                throw th;
            }
        } else {
            qq00 qq00Var3 = new qq00(pq00Var.l, zlt0Var);
            pq00Var.e(this, qq00Var3);
            qq00 qq00Var4 = pq00Var.n;
            if (qq00Var4 != null) {
                pq00Var.j(qq00Var4);
            }
            pq00Var.m = this;
            pq00Var.n = qq00Var3;
        }
        g1 = false;
    }

    public final void u(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        g1 = false;
    }
}
