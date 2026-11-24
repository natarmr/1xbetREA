package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bg1 implements gg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ozh f2532a;

    public bg1(ozh ozhVar) {
        this.f2532a = ozhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bg1) && this.f2532a.equals(((bg1) obj).f2532a);
    }

    public final int hashCode() {
        return this.f2532a.hashCode();
    }

    public final String toString() {
        return "DailyTasks(uiModel=" + this.f2532a + Separators.RPAREN;
    }
}
