package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v2h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36681a;

    public v2h(int i) {
        ldm ldmVar = ldm.f19857a;
        this.f36681a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2h)) {
            return false;
        }
        ldm ldmVar = ldm.f19857a;
        return this.f36681a == ((v2h) obj).f36681a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36681a) + (ldm.b.hashCode() * 31);
    }

    public final String toString() {
        return "CyberLoaderConfig(colorType=" + ldm.b + ", lottie=" + this.f36681a + Separators.RPAREN;
    }
}
