package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class se40 implements ef40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vbj f32060a;

    public se40(vbj vbjVar) {
        this.f32060a = vbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof se40) && this.f32060a.equals(((se40) obj).f32060a);
    }

    @Override // a.ef40
    public final vbj getState() {
        return this.f32060a;
    }

    public final int hashCode() {
        return this.f32060a.hashCode();
    }

    public final String toString() {
        return "JackpotWidget(state=" + this.f32060a + Separators.RPAREN;
    }
}
