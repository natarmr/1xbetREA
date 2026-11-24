package a;

import android.gov.nist.core.Separators;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class sud implements tud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpannableStringBuilder f32813a;

    public sud(SpannableStringBuilder spannableStringBuilder) {
        this.f32813a = spannableStringBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sud) && this.f32813a.equals(((sud) obj).f32813a);
    }

    public final int hashCode() {
        return this.f32813a.hashCode();
    }

    public final String toString() {
        return "Running(text=" + ((Object) this.f32813a) + Separators.RPAREN;
    }
}
