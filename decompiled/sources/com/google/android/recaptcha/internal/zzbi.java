package com.google.android.recaptcha.internal;

import a.cko;
import a.d5c;
import a.dvj;
import a.qjj;
import a.sje;
import a.vne;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbi {
    private final vne zza = d5c.s();
    private final vne zzb;
    private final vne zzc;
    private final vne zzd;

    public zzbi() {
        sje sjeVarA = d5c.a(new cko(Executors.newSingleThreadExecutor()));
        qjj.W(sjeVarA, null, null, new zzbh(null), 3);
        this.zzb = sjeVarA;
        this.zzc = d5c.a(dvj.c);
        sje sjeVarA2 = d5c.a(new cko(Executors.newSingleThreadExecutor()));
        qjj.W(sjeVarA2, null, null, new zzbg(null), 3);
        this.zzd = sjeVarA2;
    }

    public final vne zza() {
        return this.zzc;
    }

    public final vne zzb() {
        return this.zza;
    }

    public final vne zzc() {
        return this.zzd;
    }

    public final vne zzd() {
        return this.zzb;
    }
}
