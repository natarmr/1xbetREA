package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public class zzmz extends zzmx implements zzoj {
    public zzmz(zzna zznaVar) {
        super(zznaVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmx, com.google.android.recaptcha.internal.zzoh
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzna zzl() {
        boolean zZzL = ((zzna) this.zza).zzL();
        zznd zzndVar = this.zza;
        if (!zZzL) {
            return (zzna) zzndVar;
        }
        ((zzna) zzndVar).zzb.zzg();
        return (zzna) super.zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzmx
    public final void zzo() {
        super.zzo();
        if (((zzna) this.zza).zzb != zzmt.zzd()) {
            zzna zznaVar = (zzna) this.zza;
            zznaVar.zzb = zznaVar.zzb.clone();
        }
    }
}
