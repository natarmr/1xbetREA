package com.google.android.recaptcha.internal;

import a.a8z;
import a.maz;
import a.wp20;
import a.yje;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp implements zzy {
    private final zzek zza;
    private final a8z zzb;
    private boolean zzc;

    public zzp(zzek zzekVar) {
        this.zza = zzekVar;
        int i = zzav.zza;
        this.zzb = maz.b(zzo.zza);
        this.zzc = true;
    }

    private final zzbf zzg() {
        return (zzbf) this.zzb.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, yje yjeVar) {
        zzen zzenVarZzb = zzz.zzb(this, str);
        String strZza = zzg().zza();
        zzenVarZzb.zza();
        zztf zztfVarZzf = zzti.zzf();
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzw(strZza);
        zztfVarZzf.zze(a.c(zztgVarZzf.zzk()));
        return zzz.zza(this, (zzti) zztfVarZzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzd(zzse zzseVar, yje yjeVar) {
        zzen zzenVarZzc = zzz.zzc(this);
        if (zzseVar.zzl().length() == 0) {
            this.zzc = false;
            zzenVarZzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
            return Unit.f46060a;
        }
        zzg().zzb(wp20.b(new Pair("_GRECAPTCHA_KC", zzseVar.zzl())));
        zzenVarZzc.zza();
        return Unit.f46060a;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzc;
    }
}
