package com.google.android.recaptcha.internal;

import a.iun;
import a.tx3;
import a.v4i0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhy {
    private List zza = iun.f15405a;

    public final long zza(long[] jArr) {
        Iterator it = CollectionsKt.q0(this.zza, tx3.f0(jArr)).iterator();
        if (!it.hasNext()) {
            v4i0.p("Empty collection can't be reduced.");
            return 0L;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) it.next()).longValue() ^ ((Number) next).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = tx3.f0(jArr);
    }
}
