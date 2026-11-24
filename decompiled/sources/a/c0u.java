package a;

import a.acf;
import a.b0u;
import a.c0u;
import a.d0u;
import a.dub;
import a.e0u;
import a.ecf;
import a.ens;
import a.g0u;
import a.gkb;
import a.hkb;
import a.jf4;
import a.kcf;
import a.knx;
import a.mie0;
import a.ocf;
import a.oh60;
import a.r6;
import a.ybf;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c0u extends ecf {
    public final Context d;
    public ybf e;
    public Executor f;
    public CancellationSignal g;
    public final GetCredentialController$resultReceiver$1 h;

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1] */
    public c0u(Context context) {
        context.getClass();
        this.d = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.h = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle) {
                String string;
                Bundle bundle2;
                g0u g0uVar;
                bundle.getClass();
                ens ensVar = new ens(2, ecf.f7564a, acf.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, (byte) 4);
                c0u c0uVar = this.f45366a;
                Executor executor = c0uVar.f;
                final e0u e0uVarV0 = null;
                if (executor == null) {
                    Intrinsics.h("executor");
                    throw null;
                }
                ybf ybfVar = c0uVar.e;
                if (ybfVar == null) {
                    Intrinsics.h("callback");
                    throw null;
                }
                if (ecf.b(bundle, ensVar, executor, ybfVar, c0uVar.g)) {
                    return;
                }
                int i2 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) knx.P(bundle, "RESULT_DATA", Intent.class);
                Executor executor2 = c0uVar.f;
                if (executor2 == null) {
                    Intrinsics.h("executor");
                    throw null;
                }
                final ybf ybfVar2 = c0uVar.e;
                if (ybfVar2 == null) {
                    Intrinsics.h("callback");
                    throw null;
                }
                CancellationSignal cancellationSignal = c0uVar.g;
                boolean z = ecf.c;
                if (i2 != z) {
                    Log.w("GetCredentialController", "Returned request code " + (z ? 1 : 0) + " which  does not match what was given " + i2);
                    return;
                }
                if (i != -1) {
                    mie0 mie0Var = new mie0();
                    mie0Var.f21842a = new d0u(hkb.C(i), (byte) 3);
                    if (i == 0) {
                        mie0Var.f21842a = new b0u("activity is cancelled by the user.");
                    }
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (ocf.a(cancellationSignal)) {
                        return;
                    }
                    final e0u e0uVar = (e0u) mie0Var.f21842a;
                    e0uVar.getClass();
                    final byte b = 0;
                    executor2.execute(new Runnable() { // from class: a.stf0
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            Object d0uVar = e0uVar;
                            ybf ybfVar3 = ybfVar2;
                            switch (b2) {
                                case 0:
                                    ((a1d) ybfVar3).j(d0uVar);
                                    break;
                                default:
                                    if (d0uVar == null) {
                                        d0uVar = new d0u("No provider data returned", (byte) 3);
                                    }
                                    ((a1d) ybfVar3).j(d0uVar);
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (intent == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (ocf.a(cancellationSignal)) {
                        return;
                    }
                    executor2.execute(new kcf(ybfVar2, (byte) 8));
                    return;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 34) {
                    g0uVar = r6.c(intent);
                } else {
                    Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                    g0uVar = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle2 = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new g0u(gkb.S(bundle2, string));
                }
                if (g0uVar != null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (ocf.a(cancellationSignal)) {
                        return;
                    }
                    executor2.execute(new oh60(ybfVar2, g0uVar, (byte) 16));
                    return;
                }
                if (i3 >= 34) {
                    e0uVarV0 = r6.b(intent);
                } else {
                    int i4 = e0u.f7006a;
                    Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                    if (bundleExtra2 != null) {
                        String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string2 == null) {
                            jf4.o("Bundle was missing exception type.");
                            return;
                        }
                        e0uVarV0 = dub.v0(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                    }
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (ocf.a(cancellationSignal)) {
                    return;
                }
                final byte b2 = 1;
                executor2.execute(new Runnable() { // from class: a.stf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        Object d0uVar = e0uVarV0;
                        ybf ybfVar3 = ybfVar2;
                        switch (b3) {
                            case 0:
                                ((a1d) ybfVar3).j(d0uVar);
                                break;
                            default:
                                if (d0uVar == null) {
                                    d0uVar = new d0u("No provider data returned", (byte) 3);
                                }
                                ((a1d) ybfVar3).j(d0uVar);
                                break;
                        }
                    }
                });
            }
        };
    }
}
