package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dev0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5970a;

    public final boolean equals(Object obj) {
        if (obj instanceof dev0) {
            return this.f5970a.equals(((dev0) obj).f5970a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5970a.hashCode();
    }

    public final String toString() {
        return kng0.l("WidgetHeaderUiModel(title=", this.f5970a, Separators.RPAREN);
    }
}
