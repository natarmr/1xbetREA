package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class qqz implements tqz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m85 f29184a;

    public qqz(m85 m85Var) {
        this.f29184a = m85Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qqz) && this.f29184a.equals(((qqz) obj).f29184a);
    }

    public final int hashCode() {
        return this.f29184a.hashCode();
    }

    public final String toString() {
        return "OnReasonSelected(availableValueUiModel=" + this.f29184a + Separators.RPAREN;
    }
}
