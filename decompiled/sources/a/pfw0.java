package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class pfw0 implements jlw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26925a;

    public pfw0(Boolean bool) {
        this.f26925a = bool == null ? false : bool.booleanValue();
    }

    @Override // a.jlw0
    public final jlw0 c(String str, h0q0 h0q0Var, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.f26925a;
        if (zEquals) {
            return new slw0(Boolean.toString(z));
        }
        jf4.o(kng0.m(Boolean.toString(z), Separators.DOT, str, " is not a function."));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pfw0) && this.f26925a == ((pfw0) obj).f26925a;
    }

    @Override // a.jlw0
    public final jlw0 h() {
        return new pfw0(Boolean.valueOf(this.f26925a));
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f26925a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f26925a);
    }

    @Override // a.jlw0
    public final String zzc() {
        return Boolean.toString(this.f26925a);
    }

    @Override // a.jlw0
    public final Double zzd() {
        return Double.valueOf(true != this.f26925a ? 0.0d : 1.0d);
    }

    @Override // a.jlw0
    public final Boolean zze() {
        return Boolean.valueOf(this.f26925a);
    }

    @Override // a.jlw0
    public final Iterator zzf() {
        return null;
    }
}
