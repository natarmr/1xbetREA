package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hn90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13340a;
    public final rqm b;

    public hn90(long j, rqm rqmVar) {
        this.f13340a = j;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn90)) {
            return false;
        }
        hn90 hn90Var = (hn90) obj;
        return this.f13340a == hn90Var.f13340a && this.b.equals(hn90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f13340a) * 31);
    }

    public final String toString() {
        return "PickDuelSubGameUiModel(subGameId=" + this.f13340a + ", dsSettingCellStyle=" + this.b + Separators.RPAREN;
    }
}
