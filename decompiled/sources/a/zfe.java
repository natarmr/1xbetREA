package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zfe implements jge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha8 f44298a;

    public zfe(ha8 ha8Var) {
        this.f44298a = ha8Var;
    }

    @Override // a.jge
    public final ha8 a() {
        return this.f44298a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zfe) && this.f44298a.equals(((zfe) obj).f44298a);
    }

    public final int hashCode() {
        return this.f44298a.hashCode();
    }

    public final String toString() {
        return "DailyTaskWidget(blockState=" + this.f44298a + Separators.RPAREN;
    }
}
