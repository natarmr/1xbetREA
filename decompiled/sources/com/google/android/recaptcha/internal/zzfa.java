package com.google.android.recaptcha.internal;

import a.a8z;
import a.maz;
import a.n8n0;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfa implements zzey {
    private final a8z zza;

    public zzfa() {
        int i = zzav.zza;
        this.zza = maz.b(zzez.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzey
    public final zzsc zza(String str, zzto zztoVar) throws zzbd {
        zzew zzewVarZza = null;
        try {
            try {
                try {
                    zzewVarZza = ((zzex) this.zza.getValue()).zza(str);
                    zzewVarZza.zzc();
                    zzewVarZza.zze(zztoVar.zzd());
                    zzsc zzscVar = (zzsc) zzewVarZza.zza(zzsc.zzi());
                    zzewVarZza.zzd();
                    return zzscVar;
                } catch (zzbd e) {
                    if (zzewVarZza == null || !Intrinsics.d(e.zza(), zzba.zzau)) {
                        throw e;
                    }
                    try {
                        throw zzbc.zza(zztu.zzg(zzewVarZza.zzb().getErrorStream()).zzi());
                    } catch (Exception e2) {
                        throw new zzbd(zzbb.zzc, zzba.zzG, e2.getMessage());
                    }
                }
            } catch (Exception e3) {
                throw new zzbd(zzbb.zzc, zzba.zzF, e3.getMessage());
            }
        } catch (Throwable th) {
            if (zzewVarZza != null) {
                zzewVarZza.zzd();
            }
            throw th;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzey
    public final String zzb(String str) throws zzbd {
        try {
            try {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
                uRLConnection.getClass();
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    throw new zzbd(zzbb.zzc, new zzba(httpURLConnection.getResponseCode()), null);
                }
                try {
                    return n8n0.k("gzip".equals(httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream()));
                } catch (Exception unused) {
                    throw new zzbd(zzbb.zzc, zzba.zzP, null);
                }
            } catch (Exception unused2) {
                throw new zzbd(zzbb.zzc, zzba.zzO, null);
            }
        } catch (Exception unused3) {
            throw new zzbd(zzbb.zzb, zzba.zzN, null);
        }
    }
}
