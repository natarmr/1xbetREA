package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class c8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7n f3922a;
    public final w7n b;

    public c8n(r7n r7nVar, w7n w7nVar) {
        r7nVar.getClass();
        this.f3922a = r7nVar;
        this.b = w7nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8n)) {
            return false;
        }
        c8n c8nVar = (c8n) obj;
        return this.f3922a == c8nVar.f3922a && this.b.equals(c8nVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3922a.hashCode() * 31);
    }

    public final String toString() {
        return "DsTimerUiModel(timerDirection=" + this.f3922a + ", timer=" + this.b + Separators.RPAREN;
    }
}
