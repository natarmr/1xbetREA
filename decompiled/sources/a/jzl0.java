package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jzl0 implements wzl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk50 f17420a;

    public jzl0(mk50 mk50Var) {
        this.f17420a = mk50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jzl0) && this.f17420a.equals(((jzl0) obj).f17420a);
    }

    public final int hashCode() {
        return this.f17420a.hashCode();
    }

    public final String toString() {
        return "ClickGameItem(netCellModel=" + this.f17420a + Separators.RPAREN;
    }
}
