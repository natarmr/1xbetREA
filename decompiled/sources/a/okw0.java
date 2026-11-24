package a;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class okw0 implements jlw0 {
    @Override // a.jlw0
    public final jlw0 c(String str, h0q0 h0q0Var, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof okw0;
    }

    @Override // a.jlw0
    public final jlw0 h() {
        return jlw0.W0;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // a.jlw0
    public final String zzc() {
        return "null";
    }

    @Override // a.jlw0
    public final Double zzd() {
        return Double.valueOf(0.0d);
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
