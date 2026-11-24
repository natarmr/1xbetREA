package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n020 implements r020 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m020 f22681a;

    public n020(m020 m020Var) {
        this.f22681a = m020Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n020) && this.f22681a.equals(((n020) obj).f22681a);
    }

    public final int hashCode() {
        return this.f22681a.hashCode();
    }

    public final String toString() {
        return "Content(mainStatistic=" + this.f22681a + Separators.RPAREN;
    }
}
