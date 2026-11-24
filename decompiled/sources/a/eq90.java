package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class eq90 implements nq90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8227a;
    public final String b;

    public eq90(int i, String str) {
        this.f8227a = i;
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
        if (!(obj instanceof eq90)) {
            return false;
        }
        eq90 eq90Var = (eq90) obj;
        return this.f8227a == eq90Var.f8227a && this.b.equals(eq90Var.b);
    }

    @Override // a.nq90
    public final int getId() {
        return this.f8227a;
    }

    @Override // a.nq90
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + brm0.e(Integer.hashCode(this.f8227a) * 31, 31, false);
    }

    public final String toString() {
        return defpackage.c.b(this.f8227a, "Citizenship(id=", ", isRecommend=false, title=", this.b, Separators.RPAREN);
    }
}
