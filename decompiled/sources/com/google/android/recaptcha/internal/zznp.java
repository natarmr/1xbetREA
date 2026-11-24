package com.google.android.recaptcha.internal;

import a.jf4;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zznp implements Map.Entry {
    private final Map.Entry zza;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzns) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzoi) {
            return ((zzns) this.zza.getValue()).zzc((zzoi) obj);
        }
        jf4.o("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        return null;
    }

    public final zzns zza() {
        return (zzns) this.zza.getValue();
    }
}
