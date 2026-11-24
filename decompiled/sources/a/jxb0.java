package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jxb0 implements lxb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17298a;
    public final zb b;

    public jxb0(zb zbVar, boolean z) {
        this.f17298a = z;
        this.b = zbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxb0)) {
            return false;
        }
        jxb0 jxb0Var = (jxb0) obj;
        return this.f17298a == jxb0Var.f17298a && this.b.equals(jxb0Var.b);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return jxb0.class;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f17298a) * 31);
    }

    public final String toString() {
        return "FullStatisticUiModel(isExpanded=" + this.f17298a + ", accordionStyle=" + this.b + Separators.RPAREN;
    }
}
