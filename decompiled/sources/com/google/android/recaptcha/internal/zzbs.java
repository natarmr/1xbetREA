package com.google.android.recaptcha.internal;

import a.pav;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbs {
    private final pav zza;

    public zzbs() {
        this.zza = pav.b;
    }

    public final int zza(Context context) {
        int iB = this.zza.b(context);
        return (iB == 1 || iB == 3 || iB == 9) ? 4 : 3;
    }

    public zzbs(pav pavVar) {
        this.zza = pavVar;
    }
}
