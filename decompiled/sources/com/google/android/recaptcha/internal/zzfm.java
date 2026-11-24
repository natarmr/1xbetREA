package com.google.android.recaptcha.internal;

import a.a8z;
import a.maz;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfm {
    private final a8z zza;

    public zzfm() {
        int i = zzav.zza;
        this.zza = maz.b(zzfl.zza);
    }

    public final HttpURLConnection zza(String str) throws zzbd {
        if (!((zzfk) this.zza.getValue()).zzb(str)) {
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
        uRLConnection.getClass();
        return (HttpURLConnection) uRLConnection;
    }
}
