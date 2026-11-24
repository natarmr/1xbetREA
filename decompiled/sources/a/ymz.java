package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class ymz {
    public static final vmz Companion = new vmz();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42913a;
    public final int b;

    public /* synthetic */ ymz(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, smz.f32469a.getDescriptor());
            throw null;
        }
        this.f42913a = i2;
        this.b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymz)) {
            return false;
        }
        ymz ymzVar = (ymz) obj;
        return this.f42913a == ymzVar.f42913a && this.b == ymzVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f42913a) * 31);
    }

    public final String toString() {
        return ohs0.m("LimitActionRequest(limitGroup=", this.f42913a, ", action=", Separators.RPAREN, this.b);
    }

    public ymz(int i, int i2) {
        this.f42913a = i;
        this.b = i2;
    }
}
