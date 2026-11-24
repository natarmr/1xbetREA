package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gf40 implements tf40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ozh f11190a;

    public gf40(ozh ozhVar) {
        this.f11190a = ozhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gf40) && this.f11190a.equals(((gf40) obj).f11190a);
    }

    @Override // a.tf40
    public final String getKey() {
        String strJ = sre0.f32672a.b(gf40.class).J();
        return strJ == null ? "" : strJ;
    }

    public final int hashCode() {
        return this.f11190a.hashCode();
    }

    public final String toString() {
        return "DailyTasksActivity(model=" + this.f11190a + Separators.RPAREN;
    }
}
