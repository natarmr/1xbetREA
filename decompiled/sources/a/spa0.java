package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class spa0 implements x0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32582a;
    public final fyl b;
    public final boolean c;

    public spa0(String str, fyl fylVar, boolean z) {
        u0f0 u0f0Var = u0f0.f34852a;
        this.f32582a = str;
        this.b = fylVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spa0)) {
            return false;
        }
        spa0 spa0Var = (spa0) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return this.f32582a.equals(spa0Var.f32582a) && this.b.equals(spa0Var.b) && this.c == spa0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + ua80.b(u0f0.Z.hashCode() * 31, 31, this.f32582a)) * 31);
    }

    @Override // a.x0f0
    public final u0f0 q() {
        return u0f0.Z;
    }

    public final String toString() {
        return "PoliticalExposedPersonFieldUiModel(registrationFieldType=" + u0f0.Z + ", description=" + this.f32582a + ", dsChipUiModel=" + this.b + ", isError=" + this.c + Separators.RPAREN;
    }
}
