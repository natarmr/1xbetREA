package androidx.credentials.playservices;

import a.a1d;
import a.a4e;
import a.aqc;
import a.bsr0;
import a.c0u;
import a.d0u;
import a.dcf;
import a.duj0;
import a.e9d0;
import a.ea3;
import a.enm;
import a.euo0;
import a.f0u;
import a.faf;
import a.gaf;
import a.icf;
import a.ikt0;
import a.j9w0;
import a.kcf;
import a.kk0;
import a.lcf;
import a.mav;
import a.mie0;
import a.mmx;
import a.ncf;
import a.oav;
import a.oaw0;
import a.ocf;
import a.prd;
import a.qa3;
import a.qxw;
import a.r3d;
import a.s9w0;
import a.sav;
import a.utb0;
import a.utu;
import a.viq;
import a.x4d0;
import a.ybf;
import a.z9f;
import a.zbf;
import a.zlt0;
import a.zpc;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 32\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\fH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ?\u0010 \u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\u00150\fH\u0016¢\u0006\u0004\b \u0010!J3\u0010$\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020#0\fH\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010'J?\u0010(\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\u00150\fH\u0002¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R(\u0010+\u001a\u00020*8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b1\u00102\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00065"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "La/zbf;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "La/f0u;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "La/ybf;", "La/g0u;", "La/e0u;", "callback", "", "onGetCredential", "(Landroid/content/Context;La/f0u;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;La/ybf;)V", "La/gaf;", "", "La/ypc;", "onCreateCredential", "(Landroid/content/Context;La/gaf;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;La/ybf;)V", "", "isAvailableOnDevice", "()Z", "", "minApkVersion", "(I)Z", "La/aqc;", "Ljava/lang/Void;", "onClearCredential", "(La/aqc;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;La/ybf;)V", "La/duj0;", "La/c44;", "onSignalCredentialState", "(La/duj0;Ljava/util/concurrent/Executor;La/ybf;)V", "isGooglePlayServicesAvailable", "(Landroid/content/Context;I)I", "runFallbackClearCredFlow", "Landroid/content/Context;", "La/oav;", "googleApiAvailability", "La/oav;", "getGoogleApiAvailability", "()La/oav;", "setGoogleApiAvailability", "(La/oav;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "a/ocf", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CredentialProviderPlayServicesImpl implements zbf {
    public static final ocf Companion = new ocf();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int MIN_GMS_APK_VERSION_SIGNAL_API = 254625000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private oav googleApiAvailability;

    public CredentialProviderPlayServicesImpl(Context context) {
        context.getClass();
        this.context = context;
        this.googleApiAvailability = oav.e;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context, int minApkVersion) {
        return this.googleApiAvailability.c(context, minApkVersion);
    }

    private static final Unit onClearCredential$lambda$0(Executor executor, ybf ybfVar) {
        executor.execute(new kcf(ybfVar, (byte) 0));
        return Unit.f46060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0$0(ybf ybfVar) {
        ((a1d) ybfVar).j(new zpc("androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 0));
    }

    private static final Unit onClearCredential$lambda$1(CancellationSignal cancellationSignal, Executor executor, ybf ybfVar, Boolean bool) {
        ocf ocfVar = Companion;
        lcf lcfVar = new lcf(executor, ybfVar, (byte) 2);
        ocfVar.getClass();
        ocf.b(cancellationSignal, lcfVar);
        return Unit.f46060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$1$0(Executor executor, ybf ybfVar) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new kcf(ybfVar, (byte) 3));
        return Unit.f46060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$1$0$0(ybf ybfVar) {
        ((a1d) ybfVar).k(null);
    }

    private static final void onClearCredential$lambda$3(CancellationSignal cancellationSignal, Executor executor, ybf ybfVar, Exception exc) {
        exc.getClass();
        Log.w(TAG, "Clearing restore credential failed", exc);
        mie0 mie0Var = new mie0();
        mie0Var.f21842a = new zpc("Clear restore credential failed for unknown reason.");
        if ((exc instanceof qa3) && ((qa3) exc).getStatusCode() == 40201) {
            mie0Var.f21842a = new zpc("The restore credential internal service had a failure.");
        }
        ocf ocfVar = Companion;
        kk0 kk0Var = new kk0(executor, ybfVar, mie0Var, (byte) 21);
        ocfVar.getClass();
        ocf.b(cancellationSignal, kk0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$3$0(Executor executor, ybf ybfVar, mie0 mie0Var) {
        executor.execute(new a4e(ybfVar, mie0Var, (byte) 13));
        return Unit.f46060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$3$0$0(ybf ybfVar, mie0 mie0Var) {
        ((a1d) ybfVar).j(mie0Var.f21842a);
    }

    private static final Unit onClearCredential$lambda$4(CancellationSignal cancellationSignal, Executor executor, ybf ybfVar, ClearCredentialStateResponse clearCredentialStateResponse) {
        ocf ocfVar = Companion;
        lcf lcfVar = new lcf(executor, ybfVar, (byte) 0);
        ocfVar.getClass();
        ocf.b(cancellationSignal, lcfVar);
        return Unit.f46060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$4$0(Executor executor, ybf ybfVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new kcf(ybfVar, (byte) 1));
        return Unit.f46060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$4$0$0(ybf ybfVar) {
        ((a1d) ybfVar).k(null);
    }

    private static final void onClearCredential$lambda$6(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, aqc aqcVar, CancellationSignal cancellationSignal, Executor executor, ybf ybfVar, Exception exc) {
        exc.getClass();
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(aqcVar, cancellationSignal, executor, ybfVar);
    }

    private static final Unit onCreateCredential$lambda$0(Executor executor, ybf ybfVar) {
        executor.execute(new kcf(ybfVar, (byte) 2));
        return Unit.f46060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$0$0(ybf ybfVar) {
        ((a1d) ybfVar).j(new faf("androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 1));
    }

    private static final Unit onGetCredential$lambda$0(Executor executor, ybf ybfVar) {
        executor.execute(new kcf(ybfVar, (byte) 6));
        return Unit.f46060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$0$0(ybf ybfVar) {
        ((a1d) ybfVar).j(new d0u("this device requires a Google Play Services update for the given feature to be supported", (byte) 2));
    }

    private static final Unit onGetCredential$lambda$1(Executor executor, ybf ybfVar) {
        executor.execute(new kcf(ybfVar, (byte) 5));
        return Unit.f46060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$0(ybf ybfVar) {
        ((a1d) ybfVar).j(new d0u("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 2));
    }

    private final void runFallbackClearCredFlow(aqc request, final CancellationSignal cancellationSignal, final Executor executor, final ybf callback) {
        oaw0 oaw0VarF = qxw.F(this.context);
        oaw0VarF.f23210a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = j9w0.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((j9w0) it.next()).getClass();
            e9d0.b();
            return;
        }
        sav.a();
        euo0 euo0VarA = s9w0.a();
        euo0VarA.d = new Feature[]{x4d0.p};
        euo0VarA.f8431a = new ikt0(oaw0VarF);
        euo0VarA.c = true;
        euo0VarA.b = false;
        euo0VarA.e = (char) 1554;
        oaw0VarF.b(1, euo0VarA.a()).addOnSuccessListener(new z9f(new Function1() { // from class: a.mcf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0(cancellationSignal, executor, callback, (Void) obj);
            }
        }, (byte) 4)).addOnFailureListener(new ncf(this, cancellationSignal, executor, callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$0(CancellationSignal cancellationSignal, Executor executor, ybf ybfVar, Void r5) {
        ocf ocfVar = Companion;
        lcf lcfVar = new lcf(executor, ybfVar, (byte) 1);
        ocfVar.getClass();
        ocf.b(cancellationSignal, lcfVar);
        return Unit.f46060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$0$0(Executor executor, ybf ybfVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new kcf(ybfVar, (byte) 4));
        return Unit.f46060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$0$0$0(ybf ybfVar) {
        ((a1d) ybfVar).k(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, ybf ybfVar, Exception exc) {
        exc.getClass();
        ocf ocfVar = Companion;
        kk0 kk0Var = new kk0(exc, executor, ybfVar, (byte) 22);
        ocfVar.getClass();
        ocf.b(cancellationSignal, kk0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$2$0$0(Exception exc, Executor executor, ybf ybfVar) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new a4e(ybfVar, exc, (byte) 14));
        return Unit.f46060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2$0$0$0(ybf ybfVar, Exception exc) {
        ((a1d) ybfVar).j(new zpc(exc.getMessage()));
    }

    public final oav getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int minApkVersion) {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, minApkVersion);
        boolean z = iIsGooglePlayServicesAvailable == 0;
        if (!z) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ConnectionResult(iIsGooglePlayServicesAvailable, null, null));
        }
        return z;
    }

    public void onClearCredential(aqc request, CancellationSignal cancellationSignal, Executor executor, ybf callback) {
        throw null;
    }

    public void onCreateCredential(Context context, gaf request, CancellationSignal cancellationSignal, Executor executor, ybf callback) {
        context.getClass();
        throw null;
    }

    @Override // a.zbf
    public void onGetCredential(Context context, f0u request, CancellationSignal cancellationSignal, Executor executor, ybf callback) {
        context.getClass();
        request.getClass();
        List<utu> list = request.f8733a;
        executor.getClass();
        callback.getClass();
        Companion.getClass();
        if (ocf.a(cancellationSignal)) {
            return;
        }
        for (utu utuVar : list) {
        }
        Companion.getClass();
        for (utu utuVar2 : list) {
        }
        if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            Companion.getClass();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((utu) it.next()) instanceof utu) {
                    new icf(context).f(request, cancellationSignal, executor, callback);
                    return;
                }
            }
            new dcf(context).f(request, cancellationSignal, executor, callback);
            return;
        }
        c0u c0uVar = new c0u(context);
        c0uVar.g = cancellationSignal;
        c0uVar.e = callback;
        c0uVar.f = executor;
        Companion.getClass();
        if (ocf.a(cancellationSignal)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (utu utuVar3 : list) {
            utuVar3.getClass();
            arrayList.add(new CredentialOption("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", utuVar3.f36273a, utuVar3.b, "", "", ""));
        }
        GetCredentialRequest getCredentialRequest = new GetCredentialRequest(arrayList, bundle, null, new ResultReceiver(null));
        Context context2 = c0uVar.d;
        context2.getClass();
        mmx mmxVar = new mmx(context2, mmx.l, ea3.D, mav.c);
        euo0 euo0VarA = s9w0.a();
        euo0VarA.d = new Feature[]{bsr0.f};
        euo0VarA.f8431a = new zlt0((Object) getCredentialRequest, (byte) 14);
        euo0VarA.e = (char) 32701;
        Task taskB = mmxVar.b(0, euo0VarA.a());
        taskB.getClass();
        taskB.addOnSuccessListener(new viq(new enm((Object) cancellationSignal, (Object) c0uVar, (Object) executor, (Object) callback, (byte) 8), (byte) 3)).addOnFailureListener(new prd(request, c0uVar, callback, executor, cancellationSignal));
    }

    public void onPrepareCredential(f0u f0uVar, CancellationSignal cancellationSignal, Executor executor, ybf ybfVar) {
        f0uVar.getClass();
        executor.getClass();
        ybfVar.getClass();
    }

    public void onSignalCredentialState(duj0 request, Executor executor, ybf callback) {
        throw null;
    }

    public final void setGoogleApiAvailability(oav oavVar) {
        oavVar.getClass();
        this.googleApiAvailability = oavVar;
    }

    @Override // a.zbf
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onGetCredential(Context context, utb0 utb0Var, CancellationSignal cancellationSignal, Executor executor, ybf ybfVar) {
        context.getClass();
        throw null;
    }
}
