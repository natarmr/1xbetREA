package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ki40 implements li40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0x f18319a;

    public ki40(m0x m0xVar) {
        this.f18319a = m0xVar;
    }

    @Override // a.li40
    public final o0x b() {
        return this.f18319a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki40) && this.f18319a.equals(((ki40) obj).f18319a);
    }

    public final int hashCode() {
        return this.f18319a.hashCode();
    }

    public final String toString() {
        return "Empty(image=" + this.f18319a + Separators.RPAREN;
    }
}
