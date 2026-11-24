package a;

import android.gov.nist.core.Separators;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class t6c implements u6c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpannableStringBuilder f33411a;

    public t6c(SpannableStringBuilder spannableStringBuilder) {
        this.f33411a = spannableStringBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t6c) && this.f33411a.equals(((t6c) obj).f33411a);
    }

    public final int hashCode() {
        return this.f33411a.hashCode();
    }

    public final String toString() {
        return "Enable(text=" + ((Object) this.f33411a) + Separators.RPAREN;
    }
}
