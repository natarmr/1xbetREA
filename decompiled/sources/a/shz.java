package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class shz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f32238a;
    public final hyl b;

    public shz(imm immVar, hyl hylVar) {
        this.f32238a = immVar;
        this.b = hylVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shz)) {
            return false;
        }
        shz shzVar = (shz) obj;
        return this.f32238a.equals(shzVar.f32238a) && this.b.equals(shzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32238a.hashCode() * 31);
    }

    public final String toString() {
        return "LeaderboardToolbarUiModel(model=" + this.f32238a + ", chips=" + this.b + Separators.RPAREN;
    }
}
