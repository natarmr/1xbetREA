package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sml0 implements zml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eum f32452a;

    public sml0(eum eumVar) {
        this.f32452a = eumVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sml0) && this.f32452a.equals(((sml0) obj).f32452a);
    }

    public final int hashCode() {
        return this.f32452a.hashCode();
    }

    public final String toString() {
        return "Cricket(model=" + this.f32452a + Separators.RPAREN;
    }
}
