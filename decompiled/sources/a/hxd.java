package a;

import android.gov.nist.core.Separators;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class hxd implements ixd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpannableStringBuilder f13811a;

    public hxd(SpannableStringBuilder spannableStringBuilder) {
        this.f13811a = spannableStringBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hxd) && this.f13811a.equals(((hxd) obj).f13811a);
    }

    public final int hashCode() {
        return this.f13811a.hashCode();
    }

    public final String toString() {
        return "Running(text=" + ((Object) this.f13811a) + Separators.RPAREN;
    }
}
