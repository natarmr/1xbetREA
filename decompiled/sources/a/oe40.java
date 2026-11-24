package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class oe40 implements ef40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vbj f25107a;

    public oe40(vbj vbjVar) {
        this.f25107a = vbjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oe40) && this.f25107a.equals(((oe40) obj).f25107a);
    }

    @Override // a.ef40
    public final vbj getState() {
        return this.f25107a;
    }

    public final int hashCode() {
        return this.f25107a.hashCode();
    }

    public final String toString() {
        return "DailyTask(state=" + this.f25107a + Separators.RPAREN;
    }
}
