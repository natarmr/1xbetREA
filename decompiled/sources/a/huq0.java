package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class huq0 extends pym0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13694a;

    public huq0(boolean z) {
        this.f13694a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof huq0) && this.f13694a == ((huq0) obj).f13694a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13694a);
    }

    public final String toString() {
        return defpackage.c.d("MultiplyStringsEnableModel(enable=", Separators.RPAREN, this.f13694a);
    }
}
