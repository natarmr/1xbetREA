package com.google.android.recaptcha.internal;

import a.b1j;
import a.rw2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String strA0 = StringsKt.a0(10, String.valueOf(this.zzb / ((long) this.zza)));
        String strA1 = StringsKt.a0(10, String.valueOf(this.zzc));
        return rw2.o(b1j.n("avgExecutionTime: ", strA0, " us| maxExecutionTime: ", strA1, " us| totalTime: "), StringsKt.a0(10, String.valueOf(this.zzb)), " us| #Usages: ", StringsKt.a0(5, String.valueOf(this.zza)));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbj zzbjVar) {
        return Long.valueOf(this.zzb).compareTo(Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i) {
        this.zza = i;
    }
}
