package a;

import a.a4e;
import a.acf;
import a.b0u;
import a.d0u;
import a.e0u;
import a.ecf;
import a.ejd;
import a.g0u;
import a.hcf;
import a.hkb;
import a.icf;
import a.mhc;
import a.mie0;
import a.oaw0;
import a.ocf;
import a.qa3;
import a.qxw;
import a.yw9;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class icf extends ecf {
    public final Context d;
    public ybf e;
    public Executor f;
    public CancellationSignal g;
    public final CredentialProviderGetSignInIntentController$resultReceiver$1 h;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1] */
    public icf(Context context) {
        context.getClass();
        this.d = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.h = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle) {
                boolean z;
                bundle.getClass();
                mhc mhcVar = new mhc(2, ecf.f7564a, acf.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 16);
                icf icfVar = this.f45364a;
                if (ecf.b(bundle, mhcVar, icfVar.e(), icfVar.d(), icfVar.g)) {
                    return;
                }
                int i2 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) bundle.getParcelable("RESULT_DATA");
                boolean z2 = ecf.c;
                if (i2 != z2) {
                    Log.w("GetSignInIntent", "Returned request code " + (z2 ? 1 : 0) + " which  does not match what was given " + i2);
                    return;
                }
                ejd ejdVar = new ejd(icfVar, (byte) 22);
                CancellationSignal cancellationSignal = icfVar.g;
                byte b = 1;
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
                    qxw.F(icfVar.d);
                    g0u g0uVarC = icfVar.c(oaw0.c(intent));
                    CancellationSignal cancellationSignal2 = icfVar.g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (ocf.a(cancellationSignal2)) {
                        return;
                    }
                    icfVar.e().execute(new a4e(icfVar, g0uVarC, (byte) 10));
                } catch (e0u e) {
                    CancellationSignal cancellationSignal3 = icfVar.g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (ocf.a(cancellationSignal3)) {
                        return;
                    }
                    icfVar.e().execute(new hcf(icfVar, e, b));
                } catch (qa3 e2) {
                    mie0 mie0Var2 = new mie0();
                    mie0Var2.f21842a = new d0u(e2.getMessage(), (byte) 3);
                    if (e2.getStatusCode() == 16) {
                        mie0Var2.f21842a = new b0u(e2.getMessage());
                    } else if (ecf.b.contains(Integer.valueOf(e2.getStatusCode()))) {
                        mie0Var2.f21842a = new d0u(e2.getMessage(), (byte) 1);
                    }
                    CancellationSignal cancellationSignal4 = icfVar.g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (ocf.a(cancellationSignal4)) {
                        return;
                    }
                    icfVar.e().execute(new a4e(icfVar, mie0Var2, (byte) 9));
                } catch (Throwable th) {
                    d0u d0uVar = new d0u(th.getMessage(), (byte) 3);
                    CancellationSignal cancellationSignal5 = icfVar.g;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (ocf.a(cancellationSignal5)) {
                        return;
                    }
                    icfVar.e().execute(new a4e(icfVar, d0uVar, (byte) 12));
                }
            }
        };
    }

    public final g0u c(SignInCredential signInCredential) throws d0u {
        String str = signInCredential.g;
        tav tavVar = null;
        if (str != null) {
            String str2 = signInCredential.f45471a;
            str2.getClass();
            try {
                str.getClass();
                String str3 = signInCredential.b;
                if (str3 == null) {
                    str3 = null;
                }
                String str4 = signInCredential.c;
                String str5 = str4 != null ? str4 : null;
                String str6 = signInCredential.d;
                if (str6 == null) {
                    str6 = null;
                }
                String str7 = signInCredential.h;
                String str8 = str7 != null ? str7 : null;
                Uri uri = signInCredential.e;
                tavVar = new tav(str2, str, str3, str6, str5, uri != null ? uri : null, str8);
            } catch (Exception unused) {
                throw new d0u("When attempting to convert get response, null Google ID Token found", (byte) 3);
            }
        } else {
            Log.w("GetSignInIntent", "Credential returned but no google Id found");
        }
        if (tavVar != null) {
            return new g0u(tavVar);
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
        try {
            List list = f0uVar.f8733a;
            if (list.size() != 1) {
                throw new h0u("GetSignInWithGoogleOption cannot be combined with other options.");
            }
            Object obj = list.get(0);
            obj.getClass();
            GetSignInIntentRequest getSignInIntentRequest = new GetSignInIntentRequest(0, ((utu) obj).d, null, null, null, false);
            oaw0 oaw0VarF = qxw.F(this.d);
            String str = getSignInIntentRequest.f45470a;
            s0x.H(str);
            GetSignInIntentRequest getSignInIntentRequest2 = new GetSignInIntentRequest(getSignInIntentRequest.f, str, getSignInIntentRequest.b, oaw0VarF.l, getSignInIntentRequest.d, getSignInIntentRequest.e);
            euo0 euo0VarA = s9w0.a();
            euo0VarA.d = new Feature[]{x4d0.q};
            euo0VarA.f8431a = new w4p0(oaw0VarF, getSignInIntentRequest2);
            euo0VarA.e = (char) 1555;
            oaw0VarF.b(0, euo0VarA.a()).addOnSuccessListener(new z9f(new v4f(cancellationSignal, this, (byte) 2), (byte) 3)).addOnFailureListener(new uq((Object) this, (Object) cancellationSignal, (byte) 10));
        } catch (h0u e) {
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (ocf.a(cancellationSignal)) {
                return;
            }
            e().execute(new a4e(this, e, (byte) 11));
        }
    }
}
