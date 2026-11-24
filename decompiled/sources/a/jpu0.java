package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jpu0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16919a;
    public final y3b b;

    public jpu0(String str, y3b y3bVar) {
        this.f16919a = str;
        this.b = y3bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpu0)) {
            return false;
        }
        jpu0 jpu0Var = (jpu0) obj;
        return this.f16919a.equals(jpu0Var.f16919a) && this.b.equals(jpu0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f16919a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16919a.hashCode() * 31);
    }

    public final String toString() {
        return "VirtualGameCategoryMainDisciplineUiModel(key=" + this.f16919a + ", value=" + this.b + Separators.RPAREN;
    }
}
