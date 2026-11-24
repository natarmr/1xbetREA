package androidx.credentials.playservices;

import a.jcf;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jcf f45361a = new jcf();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.f45361a;
    }
}
