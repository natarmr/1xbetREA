package a;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class wlw0 implements jlw0 {
    @Override // a.jlw0
    public final jlw0 c(String str, h0q0 h0q0Var, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof wlw0;
    }

    @Override // a.jlw0
    public final jlw0 h() {
        return jlw0.V0;
    }

    @Override // a.jlw0
    public final String zzc() {
        return "undefined";
    }

    @Override // a.jlw0
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // a.jlw0
    public final Boolean zze() {
        return Boolean.FALSE;
    }

    @Override // a.jlw0
    public final Iterator zzf() {
        return null;
    }
}
