package com.google.android.recaptcha.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfz {
    private final zzjj zza;

    public zzfz(int i) {
        this.zza = zzjj.zza(i);
    }

    public final List zwk() {
        return zza();
    }

    public final List zza() {
        return CollectionsKt.L0(this.zza);
    }

    public final boolean zzb(List list) {
        this.zza.add(list);
        return true;
    }

    public zzfz() {
        this(1);
    }
}
