package a;

import android.gov.nist.core.Separators;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class zzd implements a0e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpannableStringBuilder f45248a;

    public zzd(SpannableStringBuilder spannableStringBuilder) {
        this.f45248a = spannableStringBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzd) && this.f45248a.equals(((zzd) obj).f45248a);
    }

    public final int hashCode() {
        return this.f45248a.hashCode();
    }

    public final String toString() {
        return "Running(text=" + ((Object) this.f45248a) + Separators.RPAREN;
    }
}
