package com.google.android.recaptcha.internal;

import a.qjj;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzan zzanVar = this.zza;
        qjj.W(zzanVar.zzb, null, null, new zzaj(zzanVar, null), 3);
    }
}
