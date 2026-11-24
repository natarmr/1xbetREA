package com.google.android.recaptcha.internal;

import a.qjj;
import a.yje;
import android.app.Application;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j, yje yjeVar) {
        return zzcv.zzh(zza(application), str, j, null, null, null, yjeVar, 28, null);
    }

    public static final Task zzc(Application application, String str, long j) {
        return zzas.zza(qjj.M(zza(application).zzd().zza(), null, new zzco(application, str, j, null), 3));
    }

    public static final Object zzd(Application application, String str, yje yjeVar) {
        zzcv zzcvVarZza = zza(application);
        return zzcv.zzh(zzcvVarZza, str, 0L, null, zzcvVarZza.zzf, zzch.zzb, yjeVar, 2, null);
    }

    public static final Task zze(Application application, String str) {
        return zzas.zza(qjj.M(zza(application).zzd().zza(), null, new zzcp(application, str, null), 3));
    }
}
