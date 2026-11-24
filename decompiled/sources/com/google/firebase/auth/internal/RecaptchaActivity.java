package com.google.firebase.auth.internal;

import a.afm0;
import a.f140;
import a.fck0;
import a.gr00;
import a.gx3;
import a.hfk0;
import a.hfw0;
import a.hny;
import a.kfw0;
import a.kxq;
import a.low0;
import a.msm0;
import a.nfq;
import a.nnw0;
import a.now0;
import a.o050;
import a.p5d0;
import a.qim0;
import a.s0x;
import a.wgm0;
import a.xgw0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class RecaptchaActivity extends kxq implements kfw0 {
    public static long B;
    public static final low0 Y = low0.c;
    public boolean A = false;

    @Override // a.kfw0
    public final void a(Status status) {
        if (status == null) {
            u();
        } else {
            t(status);
        }
    }

    @Override // a.kfw0
    public final Uri.Builder c(Intent intent, String str, String str2) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler");
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String string = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        nfq nfqVarE = nfq.e(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(nfqVarE);
        hfk0 hfk0Var = hfk0.j;
        Context applicationContext = getApplicationContext();
        synchronized (hfk0Var) {
            s0x.E(str);
            s0x.E(string);
            SharedPreferences sharedPreferencesN = hfk0.n(applicationContext, str);
            hfk0.o(sharedPreferencesN);
            SharedPreferences.Editor editorEdit = sharedPreferencesN.edit();
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".FIREBASE_APP_NAME", stringExtra3);
            editorEdit.apply();
        }
        String strV = fck0.n(getApplicationContext(), nfqVarE.f()).v();
        String strZ = null;
        if (TextUtils.isEmpty(strV)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            t(msm0.v("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (firebaseAuth.g) {
        }
        if (TextUtils.isEmpty(null)) {
            strZ = wgm0.z();
        }
        builderAppendPath.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", strZ).appendQueryParameter("eventId", string).appendQueryParameter("v", TokenNames.X + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strV);
        return builderAppendPath;
    }

    @Override // a.kfw0
    public final HttpURLConnection d(URL url) {
        try {
            synchronized (nnw0.class) {
            }
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            kfw0.U0.k("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // a.kfw0
    public final void j(Uri uri, String str, p5d0 p5d0Var) {
        if (p5d0Var.get() != null) {
            hny.b();
            return;
        }
        Task taskForResult = Tasks.forResult(uri);
        afm0 afm0Var = new afm0((byte) 23);
        afm0Var.b = this;
        afm0Var.c = str;
        taskForResult.addOnCompleteListener(afm0Var);
    }

    @Override // a.kxq, a.agd, a.zfd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !CommonConstant.ACTION.HWID_SCHEME_URL.equals(action)) {
            Log.e("RecaptchaActivity", "Could not do operation - unknown action: " + action);
            u();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - B < 30000) {
            Log.e("RecaptchaActivity", "Could not start operation - already in progress");
            return;
        }
        B = jCurrentTimeMillis;
        if (bundle != null) {
            this.A = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // a.agd, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // a.kxq, android.app.Activity
    public final void onResume() {
        RecaptchaActivity recaptchaActivity;
        super.onResume();
        String str = null;
        if (CommonConstant.ACTION.HWID_SCHEME_URL.equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                t(now0.a(intent.getStringExtra("firebaseError")));
                return;
            }
            if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                u();
                return;
            }
            String stringExtra = intent.getStringExtra("link");
            hfk0 hfk0Var = hfk0.j;
            Context applicationContext = getApplicationContext();
            String packageName = getPackageName();
            String stringExtra2 = intent.getStringExtra("eventId");
            synchronized (hfk0Var) {
                s0x.E(packageName);
                s0x.E(stringExtra2);
                SharedPreferences sharedPreferencesN = hfk0.n(applicationContext, packageName);
                String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
                String string = sharedPreferencesN.getString(str2, null);
                String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
                String string2 = sharedPreferencesN.getString(str3, null);
                SharedPreferences.Editor editorEdit = sharedPreferencesN.edit();
                editorEdit.remove(str2);
                editorEdit.remove(str3);
                editorEdit.apply();
                if (!TextUtils.isEmpty(string)) {
                    str = string2;
                }
            }
            if (TextUtils.isEmpty(str)) {
                Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
                t(msm0.v("Failed to find registration for this reCAPTCHA event"));
            }
            if (intent.getBooleanExtra("encryptionEnabled", true)) {
                stringExtra = fck0.n(getApplicationContext(), nfq.e(str).f()).w(stringExtra);
            }
            String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
            B = 0L;
            this.A = false;
            Intent intent2 = new Intent();
            intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
            intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
            if (gr00.t(this).E(intent2)) {
                Y.a(this);
            } else {
                SharedPreferences.Editor editorEdit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                editorEdit2.putString("recaptchaToken", queryParameter);
                editorEdit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                editorEdit2.putLong("timestamp", System.currentTimeMillis());
                editorEdit2.commit();
            }
            finish();
            return;
        }
        if (this.A) {
            u();
            return;
        }
        Intent intent3 = getIntent();
        String packageName2 = getPackageName();
        try {
            String lowerCase = nnw0.C(o050.N(this, packageName2)).toLowerCase(Locale.US);
            nfq nfqVarE = nfq.e(intent3.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(nfqVarE);
            gx3 gx3Var = xgw0.f40860a;
            nfqVarE.a();
            if (gx3Var.containsKey(nfqVarE.c.f21755a)) {
                nfqVarE.a();
                xgw0.a(nfqVarE.c.f21755a);
                throw null;
            }
            recaptchaActivity = this;
            new hfw0(packageName2, lowerCase, intent3, nfqVarE, recaptchaActivity).executeOnExecutor(firebaseAuth.r, new Void[0]);
            recaptchaActivity.A = true;
        } catch (PackageManager.NameNotFoundException e) {
            recaptchaActivity = this;
            Log.e("RecaptchaActivity", "Could not get package signature: " + packageName2 + Separators.SP + String.valueOf(e));
            recaptchaActivity.u();
        }
    }

    @Override // a.agd, a.zfd, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.A);
    }

    public final void t(Status status) {
        B = 0L;
        this.A = false;
        Intent intent = new Intent();
        HashMap map = now0.f23886a;
        Parcel parcelObtain = Parcel.obtain();
        status.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", bArrMarshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        gr00.t(this).E(intent);
        Y.a(this);
        finish();
    }

    public final void u() {
        B = 0L;
        this.A = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        gr00.t(this).E(intent);
        Y.a(this);
        finish();
    }

    @Override // a.kfw0
    public final String zza(String str) {
        String strW = qim0.w("firebear.identityToolkit");
        if (TextUtils.isEmpty(strW)) {
            xgw0.b(str);
            return "https://www.googleapis.com/identitytoolkit/v3/relyingparty";
        }
        f140.r("Found hermetic configuration for identityToolkit URL: ", strW, "RecaptchaActivity");
        return strW;
    }
}
