package a;

import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class fcf implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1d f9310a;

    public fcf(a1d a1dVar, gcf gcfVar) {
        this.f9310a = a1dVar;
    }

    public final void onError(Throwable th) {
        GetCredentialException getCredentialExceptionH = b03.h(th);
        getCredentialExceptionH.getClass();
        Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
        String type = getCredentialExceptionH.getType();
        type.getClass();
        this.f9310a.j(dub.v0(getCredentialExceptionH.getMessage(), type));
    }

    public final void onResult(Object obj) {
        GetCredentialResponse getCredentialResponseI = b03.i(obj);
        getCredentialResponseI.getClass();
        Log.i("CredManProvService", "GetCredentialResponse returned from framework");
        Credential credential = getCredentialResponseI.getCredential();
        credential.getClass();
        String type = credential.getType();
        type.getClass();
        Bundle data = credential.getData();
        data.getClass();
        this.f9310a.k(new g0u(gkb.S(data, type)));
    }
}
