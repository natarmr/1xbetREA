package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class eja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dja f7899a;
    public final rqm b;

    public eja(dja djaVar, rqm rqmVar) {
        djaVar.getClass();
        this.f7899a = djaVar;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eja)) {
            return false;
        }
        eja ejaVar = (eja) obj;
        return this.f7899a == ejaVar.f7899a && this.b.equals(ejaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7899a.hashCode() * 31);
    }

    public final String toString() {
        return "CardInfoUiModel(cardInfoType=" + this.f7899a + ", dsSettingCellStyle=" + this.b + Separators.RPAREN;
    }
}
