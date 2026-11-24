package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uvi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum f36350a;
    public final rqm b;

    public uvi0(Enum r1, rqm rqmVar) {
        this.f36350a = r1;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvi0)) {
            return false;
        }
        uvi0 uvi0Var = (uvi0) obj;
        return this.f36350a.equals(uvi0Var.f36350a) && this.b.equals(uvi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36350a.hashCode() * 31);
    }

    public final String toString() {
        return "SettingCellUiModel(key=" + this.f36350a + ", style=" + this.b + Separators.RPAREN;
    }
}
