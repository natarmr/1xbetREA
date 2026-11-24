package a;

import android.gov.nist.core.Separators;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class xgd0 implements ygd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpannableStringBuilder f40833a;

    public xgd0(SpannableStringBuilder spannableStringBuilder) {
        this.f40833a = spannableStringBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xgd0) && this.f40833a.equals(((xgd0) obj).f40833a);
    }

    public final int hashCode() {
        return this.f40833a.hashCode();
    }

    public final String toString() {
        return "Enable(text=" + ((Object) this.f40833a) + Separators.RPAREN;
    }
}
