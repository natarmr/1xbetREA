package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kie implements sie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18332a;

    public kie(String str) {
        this.f18332a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kie) && this.f18332a.equals(((kie) obj).f18332a);
    }

    public final int hashCode() {
        return this.f18332a.hashCode();
    }

    public final String toString() {
        return kng0.l("ContentTitleUiModel(title=", this.f18332a, Separators.RPAREN);
    }
}
