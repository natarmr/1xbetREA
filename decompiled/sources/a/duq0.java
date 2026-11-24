package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class duq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6709a;

    public duq0(boolean z) {
        this.f6709a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof duq0) && this.f6709a == ((duq0) obj).f6709a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6709a);
    }

    public final String toString() {
        return defpackage.c.d("HighlightDesignSystemModel(enable=", Separators.RPAREN, this.f6709a);
    }
}
