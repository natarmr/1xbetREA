package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jck implements ew20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gck f16281a;

    public jck(gck gckVar) {
        this.f16281a = gckVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jck) && this.f16281a == ((jck) obj).f16281a;
    }

    public final int hashCode() {
        return this.f16281a.hashCode();
    }

    public final String toString() {
        return "DescriptionUiModel(descriptionType=" + this.f16281a + Separators.RPAREN;
    }
}
