package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q7p0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28263a;
    public final j0g b;

    public q7p0(String str, j0g j0gVar) {
        this.f28263a = str;
        this.b = j0gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7p0)) {
            return false;
        }
        q7p0 q7p0Var = (q7p0) obj;
        return this.f28263a.equals(q7p0Var.f28263a) && this.b.equals(q7p0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f28263a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28263a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamDetailsAchievementUiModel(key=" + this.f28263a + ", dsAchievement=" + this.b + Separators.RPAREN;
    }
}
