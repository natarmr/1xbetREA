package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class la9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19695a;
    public final rqm b;

    public la9(long j, rqm rqmVar) {
        this.f19695a = j;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la9)) {
            return false;
        }
        la9 la9Var = (la9) obj;
        return this.f19695a == la9Var.f19695a && this.b.equals(la9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f19695a) * 31);
    }

    public final String toString() {
        return "BuildDuelPlayerUiModel(playerId=" + this.f19695a + ", dsSettingCellStyle=" + this.b + Separators.RPAREN;
    }
}
