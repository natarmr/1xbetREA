package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kck implements fw20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hck f18063a;

    public kck(hck hckVar) {
        this.f18063a = hckVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kck) && this.f18063a == ((kck) obj).f18063a;
    }

    public final int hashCode() {
        return this.f18063a.hashCode();
    }

    public final String toString() {
        return "DescriptionUiModel(descriptionType=" + this.f18063a + Separators.RPAREN;
    }
}
