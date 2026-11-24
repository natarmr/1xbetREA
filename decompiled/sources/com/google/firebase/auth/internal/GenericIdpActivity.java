package com.google.firebase.auth.internal;

import a.ajw0;
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
import a.okt0;
import a.p5d0;
import a.qim0;
import a.s0x;
import a.vmw0;
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
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.zzajg;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class GenericIdpActivity extends kxq implements kfw0 {
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
        String string;
        String str3;
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler");
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String strJoin = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(Separators.COMMA, stringArrayListExtra);
        Bundle bundleExtra = intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            string = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str4 : bundleExtra.keySet()) {
                    String string2 = bundleExtra.getString(str4);
                    if (!TextUtils.isEmpty(string2)) {
                        jSONObject.put(str4, string2);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            string = jSONObject.toString();
        }
        String string3 = UUID.randomUUID().toString();
        try {
            str3 = new String(MessageDigest.getInstance("SHA-256").digest(UUID.randomUUID().toString().getBytes()));
            int length = str3.length();
            int i = 0;
            while (i < length) {
                char cCharAt = str3.charAt(i);
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    char[] charArray = str3.toCharArray();
                    while (i < length) {
                        char c = charArray[i];
                        if (c >= 'A' && c <= 'Z') {
                            charArray[i] = (char) (c ^ ' ');
                        }
                        i++;
                    }
                    str3 = String.valueOf(charArray);
                    break;
                }
                i++;
            }
        } catch (NoSuchAlgorithmException unused2) {
            kfw0.U0.k("Failed to get SHA-256 MessageDigest", new Object[0]);
            str3 = null;
        }
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        hfk0 hfk0Var = hfk0.j;
        Context applicationContext = getApplicationContext();
        String str5 = string;
        String str6 = strJoin;
        synchronized (hfk0Var) {
            s0x.E(str);
            s0x.E(string3);
            s0x.E(str3);
            s0x.E(stringExtra4);
            SharedPreferences sharedPreferencesN = hfk0.n(applicationContext, str);
            hfk0.o(sharedPreferencesN);
            SharedPreferences.Editor editorEdit = sharedPreferencesN.edit();
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".SESSION_ID", str3);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".OPERATION", action);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".PROVIDER_ID", stringExtra2);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".FIREBASE_APP_NAME", stringExtra4);
            editorEdit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
            editorEdit.apply();
        }
        String strV = fck0.n(getApplicationContext(), nfq.e(stringExtra4).f()).v();
        if (TextUtils.isEmpty(strV)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            t(msm0.v("Failed to generate/retrieve public encryption key for Generic IDP flow."));
        } else if (str3 != null) {
            builderAppendPath.appendQueryParameter("eid", "p").appendQueryParameter("v", TokenNames.X + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", str3).appendQueryParameter("eventId", string3).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strV);
            if (!TextUtils.isEmpty(str6)) {
                builderAppendPath.appendQueryParameter("scopes", str6);
            }
            if (!TextUtils.isEmpty(str5)) {
                builderAppendPath.appendQueryParameter("customParameters", str5);
            }
            if (TextUtils.isEmpty(stringExtra3)) {
                return builderAppendPath;
            }
            builderAppendPath.appendQueryParameter("tid", stringExtra3);
            return builderAppendPath;
        }
        return null;
    }

    @Override // a.kfw0
    public final HttpURLConnection d(URL url) {
        try {
            synchronized (nnw0.class) {
            }
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
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
        okt0 okt0Var = new okt0();
        okt0Var.f25422a = this;
        okt0Var.b = str;
        taskForResult.addOnCompleteListener(okt0Var);
    }

    @Override // a.kxq, a.agd, a.zfd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !CommonConstant.ACTION.HWID_SCHEME_URL.equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            u();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - B < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        B = jCurrentTimeMillis;
        if (bundle != null) {
            this.A = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // a.agd, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // a.kxq, android.app.Activity
    public final void onResume() {
        ajw0 ajw0Var;
        super.onResume();
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
            String stringExtra2 = intent.getStringExtra("eventId");
            String packageName = getPackageName();
            boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
            synchronized (hfk0.j) {
                s0x.E(packageName);
                s0x.E(stringExtra2);
                SharedPreferences sharedPreferencesN = hfk0.n(this, packageName);
                String str = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".SESSION_ID";
                String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
                String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".PROVIDER_ID";
                String str4 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
                String string = sharedPreferencesN.getString(str, null);
                String string2 = sharedPreferencesN.getString(str2, null);
                String string3 = sharedPreferencesN.getString(str3, null);
                String string4 = sharedPreferencesN.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
                String string5 = sharedPreferencesN.getString(str4, null);
                SharedPreferences.Editor editorEdit = sharedPreferencesN.edit();
                editorEdit.remove(str);
                editorEdit.remove(str2);
                editorEdit.remove(str3);
                editorEdit.remove(str4);
                editorEdit.apply();
                if (string == null || string2 == null || string3 == null) {
                    ajw0Var = null;
                } else {
                    ajw0Var = new ajw0();
                    ajw0Var.f998a = string;
                    ajw0Var.b = string2;
                    ajw0Var.c = string3;
                    ajw0Var.d = string4;
                    ajw0Var.e = string5;
                }
            }
            if (ajw0Var == null) {
                u();
            }
            if (booleanExtra) {
                stringExtra = fck0.n(getApplicationContext(), nfq.e(ajw0Var.e).f()).w(stringExtra);
            }
            zzajg zzajgVar = new zzajg();
            s0x.H(ajw0Var);
            String str5 = ajw0Var.f998a;
            s0x.E(str5);
            zzajgVar.l = str5;
            s0x.E(stringExtra);
            zzajgVar.m = stringExtra;
            String str6 = ajw0Var.c;
            s0x.E(str6);
            zzajgVar.e = str6;
            zzajgVar.i = true;
            zzajgVar.g = "providerId=".concat(str6);
            String str7 = ajw0Var.d;
            String str8 = ajw0Var.b;
            zzajgVar.n = str7;
            if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str8) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str8) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str8)) {
                Log.e("GenericIdpActivity", "unsupported operation: ".concat(str8));
                u();
                return;
            }
            B = 0L;
            this.A = false;
            Intent intent2 = new Intent();
            Parcel parcelObtain = Parcel.obtain();
            zzajgVar.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", bArrMarshall);
            intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str8);
            intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
            if (gr00.t(this).E(intent2)) {
                Y.a(this);
            } else {
                SharedPreferences.Editor editorEdit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                Parcel parcelObtain2 = Parcel.obtain();
                zzajgVar.writeToParcel(parcelObtain2, 0);
                byte[] bArrMarshall2 = parcelObtain2.marshall();
                parcelObtain2.recycle();
                editorEdit2.putString("verifyAssertionRequest", bArrMarshall2 != null ? Base64.encodeToString(bArrMarshall2, 10) : null);
                editorEdit2.putString("operation", str8);
                editorEdit2.putString("tenantId", str7);
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
        String packageName2 = getPackageName();
        try {
            String lowerCase = nnw0.C(o050.N(this, packageName2)).toLowerCase(Locale.US);
            nfq nfqVarE = nfq.e(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(nfqVarE);
            gx3 gx3Var = xgw0.f40860a;
            nfqVarE.a();
            if (gx3Var.containsKey(nfqVarE.c.f21755a)) {
                nfqVarE.a();
                xgw0.a(nfqVarE.c.f21755a);
                throw null;
            }
            new hfw0(packageName2, lowerCase, getIntent(), nfqVarE, this).executeOnExecutor(firebaseAuth.r, new Void[0]);
            this.A = true;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("GenericIdpActivity", "Could not get package signature: " + packageName2 + Separators.SP + String.valueOf(e));
            u();
        }
    }

    @Override // a.agd, a.zfd, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.A);
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
        if (gr00.t(this).E(intent)) {
            Y.a(this);
        } else {
            vmw0.a(getApplicationContext(), status);
        }
        finish();
    }

    public final void u() {
        B = 0L;
        this.A = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (gr00.t(this).E(intent)) {
            Y.a(this);
        } else {
            vmw0.a(this, msm0.v("WEB_CONTEXT_CANCELED"));
        }
        finish();
    }

    @Override // a.kfw0
    public final String zza(String str) {
        String strW = qim0.w("firebear.identityToolkit");
        if (TextUtils.isEmpty(strW)) {
            xgw0.b(str);
            return "https://www.googleapis.com/identitytoolkit/v3/relyingparty";
        }
        f140.r("Found hermetic configuration for identityToolkit URL: ", strW, "GenericIdpActivity");
        return strW;
    }
}
