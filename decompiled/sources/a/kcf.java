package a;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kcf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18055a;
    public final /* synthetic */ ybf b;

    public /* synthetic */ kcf(ybf ybfVar, byte b) {
        this.f18055a = b;
        this.b = ybfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f18055a;
        ybf ybfVar = this.b;
        switch (b) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0$0(ybfVar);
                break;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$4$0$0(ybfVar);
                break;
            case 2:
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0$0(ybfVar);
                break;
            case 3:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$1$0$0(ybfVar);
                break;
            case 4:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0$0$0(ybfVar);
                break;
            case 5:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$0(ybfVar);
                break;
            case 6:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$0$0(ybfVar);
                break;
            case 7:
                ((a1d) ybfVar).j(new d0u("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 3));
                break;
            default:
                ((a1d) ybfVar).j(new d0u("No provider data returned.", (byte) 3));
                break;
        }
    }
}
