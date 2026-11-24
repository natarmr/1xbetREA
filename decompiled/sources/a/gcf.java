package a;

import android.content.Context;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gcf implements zbf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CredentialManager f11058a;

    public gcf(Context context) {
        this.f11058a = b03.g(context.getSystemService("credential"));
    }

    @Override // a.zbf
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.f11058a != null;
    }

    @Override // a.zbf
    public final void onGetCredential(Context context, f0u f0uVar, CancellationSignal cancellationSignal, Executor executor, ybf ybfVar) {
        a1d a1dVar = (a1d) ybfVar;
        CredentialManager credentialManager = this.f11058a;
        if (credentialManager == null) {
            a1dVar.j(new h0u("Your device doesn't support credential manager"));
            return;
        }
        fcf fcfVar = new fcf(a1dVar, this);
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (utu utuVar : f0uVar.f8733a) {
            utuVar.getClass();
            builder.addCredentialOption(new CredentialOption.Builder("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", utuVar.f36273a, utuVar.b).setIsSystemProviderRequired(true).setAllowedProviders(utuVar.c).build());
        }
        GetCredentialRequest getCredentialRequestBuild = builder.build();
        getCredentialRequestBuild.getClass();
        credentialManager.getCredential(context, getCredentialRequestBuild, cancellationSignal, executor, fcfVar);
    }
}
