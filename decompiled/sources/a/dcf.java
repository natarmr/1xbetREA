package a;

import a.a4e;
import a.acf;
import a.b0u;
import a.bcf;
import a.d0u;
import a.dcf;
import a.e0u;
import a.ecf;
import a.ejd;
import a.g0u;
import a.hkb;
import a.mhc;
import a.mie0;
import a.oaw0;
import a.ocf;
import a.qa3;
import a.qxw;
import a.yw9;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class dcf extends ecf {
    public final Context d;
    public ybf e;
    public Executor f;
    public CancellationSignal g;
    public final CredentialProviderBeginSignInController$resultReceiver$1 h;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1] */
    public dcf(Context context) {
        context.getClass();
        this.d = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.h = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle) {
                boolean z;
                bundle.getClass();
                mhc mhcVar = new mhc(2, ecf.f7564a, acf.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 15);
                dcf dcfVar = this.f45363a;
                if (ecf.b(bundle, mhcVar, dcfVar.e(), dcfVar.d(), dcfVar.g)) {
                    return;
                }
                int i2 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) bundle.getParcelable("RESULT_DATA");
                boolean z2 = ecf.c;
                if (i2 != z2) {
                    Log.w("BeginSignIn", "Returned request code " + (z2 ? 1 : 0) + " which  does not match what was given " + i2);
                    return;
                }
                ejd ejdVar = new ejd(dcfVar, (byte) 21);
                CancellationSignal cancellationSignal = dcfVar.g;
                if (i != -1) {
                    mie0 mie0Var = new mie0();
                    mie0Var.f21842a = new d0u(hkb.C(i), (byte) 3);
                    if (i == 0) {
                        mie0Var.f21842a = new b0u("activity is cancelled by the user.");
                    }
                    yw9 yw9Var = new yw9(ejdVar, mie0Var, (byte) 29);
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!ocf.a(cancellationSignal)) {
                        yw9Var.invoke();
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
                try {
                    qxw.F(dcfVar.d);
                    g0u g0uVarC = dcfVar.c(oaw0.c(intent));
                    CancellationSignal cancellationSignal2 = dcfVar.g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (ocf.a(cancellationSignal2)) {
                        return;
                    }
                    dcfVar.e().execute(new a4e(dcfVar, g0uVarC, (byte) 5));
                } catch (e0u e) {
                    CancellationSignal cancellationSignal3 = dcfVar.g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (ocf.a(cancellationSignal3)) {
                        return;
                    }
                    dcfVar.e().execute(new bcf(dcfVar, e, (byte) 2));
                } catch (qa3 e2) {
                    mie0 mie0Var2 = new mie0();
                    mie0Var2.f21842a = new d0u(e2.getMessage(), (byte) 3);
                    if (e2.getStatusCode() == 16) {
                        mie0Var2.f21842a = new b0u(e2.getMessage());
                    } else if (ecf.b.contains(Integer.valueOf(e2.getStatusCode()))) {
                        mie0Var2.f21842a = new d0u(e2.getMessage(), (byte) 1);
                    }
                    CancellationSignal cancellationSignal4 = dcfVar.g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (ocf.a(cancellationSignal4)) {
                        return;
                    }
                    dcfVar.e().execute(new a4e(dcfVar, mie0Var2, (byte) 6));
                } catch (Throwable th) {
                    d0u d0uVar = new d0u(th.getMessage(), (byte) 3);
                    CancellationSignal cancellationSignal5 = dcfVar.g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (ocf.a(cancellationSignal5)) {
                        return;
                    }
                    dcfVar.e().execute(new a4e(dcfVar, d0uVar, (byte) 7));
                }
            }
        };
    }

    public final g0u c(SignInCredential signInCredential) throws d0u, b0u, rpu {
        c2 omkVar;
        Object obj;
        String string;
        String str = signInCredential.f;
        PublicKeyCredential publicKeyCredential = signInCredential.i;
        String str2 = signInCredential.g;
        String str3 = signInCredential.f45471a;
        boolean z = true;
        if (str != null) {
            str3.getClass();
            str.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str3);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str);
            omkVar = new omk(str, bundle, (byte) 1);
        } else {
            JSONObject jSONObject = null;
            if (str2 != null) {
                str3.getClass();
                String str4 = signInCredential.b;
                String str5 = str4 != null ? str4 : null;
                String str6 = signInCredential.c;
                String str7 = str6 != null ? str6 : null;
                String str8 = signInCredential.d;
                String str9 = str8 != null ? str8 : null;
                String str10 = signInCredential.h;
                String str11 = str10 != null ? str10 : null;
                Uri uri = signInCredential.e;
                omkVar = new tav(str3, str2, str5, str9, str7, uri != null ? uri : null, str11);
            } else if (publicKeyCredential != null) {
                AuthenticatorErrorResponse authenticatorErrorResponse = publicKeyCredential.f;
                AuthenticatorAssertionResponse authenticatorAssertionResponse = publicKeyCredential.e;
                AuthenticatorAttestationResponse authenticatorAttestationResponse = publicKeyCredential.d;
                LinkedHashMap linkedHashMap = o7d0.f24782a;
                JSONObject jSONObject2 = new JSONObject();
                if (authenticatorAttestationResponse != null) {
                    obj = authenticatorAttestationResponse;
                } else if (authenticatorAssertionResponse != null) {
                    obj = authenticatorAssertionResponse;
                } else {
                    if (authenticatorErrorResponse == null) {
                        jf4.n("No response set.");
                        return null;
                    }
                    obj = authenticatorErrorResponse;
                }
                if (obj instanceof AuthenticatorErrorResponse) {
                    AuthenticatorErrorResponse authenticatorErrorResponse2 = (AuthenticatorErrorResponse) obj;
                    ErrorCode errorCode = authenticatorErrorResponse2.f45504a;
                    errorCode.getClass();
                    String str12 = authenticatorErrorResponse2.b;
                    s sVar = (s) o7d0.f24782a.get(errorCode);
                    if (sVar == null) {
                        throw new rpu(new s((byte) 26), kng0.k("unknown fido gms exception - ", str12));
                    }
                    if (errorCode == ErrorCode.NOT_ALLOWED_ERR && str12 != null && StringsKt.O(str12, "Unable to get sync account", false)) {
                        throw new b0u("Passkey retrieval was cancelled by the user.");
                    }
                    throw new rpu(sVar, str12);
                }
                if (obj instanceof AuthenticatorAssertionResponse) {
                    try {
                        vuw0 vuw0Var = publicKeyCredential.c;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            if (vuw0Var != null && vuw0Var.l().length > 0) {
                                jSONObject3.put("rawId", y0x0.G(vuw0Var.l()));
                            }
                            String str13 = publicKeyCredential.h;
                            if (str13 != null) {
                                jSONObject3.put("authenticatorAttachment", str13);
                            }
                            String str14 = publicKeyCredential.b;
                            if (str14 != null && authenticatorErrorResponse == null) {
                                jSONObject3.put(Payload.TYPE, str14);
                            }
                            String str15 = publicKeyCredential.f45506a;
                            if (str15 != null) {
                                jSONObject3.put(ParameterNames.ID, str15);
                            }
                            String str16 = "response";
                            if (authenticatorAssertionResponse != null) {
                                jSONObject = authenticatorAssertionResponse.m();
                            } else if (authenticatorAttestationResponse != null) {
                                jSONObject = authenticatorAttestationResponse.m();
                            } else {
                                if (authenticatorErrorResponse != null) {
                                    try {
                                        jSONObject = new JSONObject();
                                        jSONObject.put("code", (int) authenticatorErrorResponse.f45504a.f45505a);
                                        String str17 = authenticatorErrorResponse.b;
                                        if (str17 != null) {
                                            jSONObject.put(CrashHianalyticsData.MESSAGE, str17);
                                        }
                                        str16 = "error";
                                    } catch (JSONException e) {
                                        throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                                    }
                                }
                                z = false;
                            }
                            if (jSONObject != null) {
                                jSONObject3.put(str16, jSONObject);
                            }
                            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = publicKeyCredential.g;
                            if (authenticationExtensionsClientOutputs != null) {
                                jSONObject3.put("clientExtensionResults", authenticationExtensionsClientOutputs.m());
                            } else if (z) {
                                jSONObject3.put("clientExtensionResults", new JSONObject());
                            }
                            string = jSONObject3.toString();
                            string.getClass();
                        } catch (JSONException e2) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
                        }
                    } catch (Throwable th) {
                        throw new d0u("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage(), (byte) 3);
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(obj.getClass().getName()));
                    string = jSONObject2.toString();
                    string.getClass();
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", string);
                omkVar = new omk(string, bundle2, (byte) 2);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
                omkVar = null;
            }
        }
        if (omkVar != null) {
            return new g0u(omkVar);
        }
        throw new d0u("When attempting to convert get response, null credential found", (byte) 3);
    }

    public final ybf d() {
        ybf ybfVar = this.e;
        if (ybfVar != null) {
            return ybfVar;
        }
        Intrinsics.h("callback");
        throw null;
    }

    public final Executor e() {
        Executor executor = this.f;
        if (executor != null) {
            return executor;
        }
        Intrinsics.h("executor");
        throw null;
    }

    public final void f(f0u f0uVar, CancellationSignal cancellationSignal, Executor executor, ybf ybfVar) {
        f0uVar.getClass();
        ybfVar.getClass();
        executor.getClass();
        this.g = cancellationSignal;
        this.e = ybfVar;
        this.f = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (ocf.a(cancellationSignal)) {
            return;
        }
        Context context = this.d;
        context.getClass();
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = new BeginSignInRequest.PasswordRequestOptions(false);
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = new BeginSignInRequest.GoogleIdTokenRequestOptions(false, null, null, true, null, null, false);
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = new BeginSignInRequest.PasskeysRequestOptions(false, null, null);
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = new BeginSignInRequest.PasskeyJsonRequestOptions(null, false);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        int i = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        for (utu utuVar : f0uVar.f8733a) {
        }
        BeginSignInRequest beginSignInRequest = new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, null, false, 0, passkeysRequestOptions, passkeyJsonRequestOptions, false);
        oaw0 oaw0VarF = qxw.F(context);
        new BeginSignInRequest.GoogleIdTokenRequestOptions(false, null, null, true, null, null, false);
        new BeginSignInRequest.PasskeysRequestOptions(false, null, null);
        new BeginSignInRequest.PasskeyJsonRequestOptions(null, false);
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions2 = beginSignInRequest.b;
        s0x.H(googleIdTokenRequestOptions2);
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions2 = beginSignInRequest.f45464a;
        s0x.H(passwordRequestOptions2);
        BeginSignInRequest beginSignInRequest2 = new BeginSignInRequest(passwordRequestOptions2, googleIdTokenRequestOptions2, oaw0VarF.l, beginSignInRequest.d, beginSignInRequest.e, beginSignInRequest.f, beginSignInRequest.g, beginSignInRequest.h);
        euo0 euo0VarA = s9w0.a();
        euo0VarA.d = new Feature[]{new Feature("auth_api_credentials_begin_sign_in", 8L)};
        euo0VarA.f8431a = new owp0(oaw0VarF, beginSignInRequest2);
        euo0VarA.c = true;
        euo0VarA.b = false;
        euo0VarA.e = (char) 1553;
        oaw0VarF.b(0, euo0VarA.a()).addOnSuccessListener(new z9f(new v4f(cancellationSignal, this, (byte) 1), (byte) 2)).addOnFailureListener(new uq((Object) this, (Object) cancellationSignal, (byte) 9));
    }
}
