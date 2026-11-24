package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jq90 implements nq90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16940a;
    public final String b;

    public jq90(int i, String str) {
        this.f16940a = i;
        this.b = str;
    }

    @Override // a.nq90
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq90)) {
            return false;
        }
        jq90 jq90Var = (jq90) obj;
        return this.f16940a == jq90Var.f16940a && this.b.equals(jq90Var.b);
    }

    @Override // a.nq90
    public final int getId() {
        return this.f16940a;
    }

    @Override // a.nq90
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + brm0.e(Integer.hashCode(this.f16940a) * 31, 31, false);
    }

    public final String toString() {
        return defpackage.c.b(this.f16940a, "Language(id=", ", isRecommend=false, title=", this.b, Separators.RPAREN);
    }
}
