package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wnn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rnn0 f39458a;
    public final rqm b;

    public wnn0(rnn0 rnn0Var, rqm rqmVar) {
        this.f39458a = rnn0Var;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnn0)) {
            return false;
        }
        wnn0 wnn0Var = (wnn0) obj;
        return this.f39458a.equals(wnn0Var.f39458a) && this.b.equals(wnn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39458a.hashCode() * 31);
    }

    public final String toString() {
        return "SwapPlayersTeamUiModel(action=" + this.f39458a + ", dsSettingCellStyle=" + this.b + Separators.RPAREN;
    }
}
