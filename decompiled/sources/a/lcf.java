package a;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lcf implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19796a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ ybf c;

    public /* synthetic */ lcf(Executor executor, ybf ybfVar, byte b) {
        this.f19796a = b;
        this.b = executor;
        this.c = ybfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19796a) {
            case 0:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$4$0(this.b, this.c);
            case 1:
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0$0(this.b, this.c);
            default:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$1$0(this.b, this.c);
        }
    }
}
