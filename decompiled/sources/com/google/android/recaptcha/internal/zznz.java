package com.google.android.recaptcha.internal;

import a.v4i0;

/* JADX INFO: loaded from: classes2.dex */
final class zznz implements zzog {
    private final zzog[] zza;

    public zznz(zzog... zzogVarArr) {
        this.zza = zzogVarArr;
    }

    @Override // com.google.android.recaptcha.internal.zzog
    public final zzof zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzog zzogVar = this.zza[i];
            if (zzogVar.zzc(cls)) {
                return zzogVar.zzb(cls);
            }
        }
        v4i0.p("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzog
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
