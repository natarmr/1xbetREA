package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wbn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38887a;
    public final rqm b;

    public wbn(long j, rqm rqmVar) {
        this.f38887a = j;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbn)) {
            return false;
        }
        wbn wbnVar = (wbn) obj;
        return this.f38887a == wbnVar.f38887a && this.b.equals(wbnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f38887a) * 31);
    }

    public final String toString() {
        return "DuelBuilderPlayerUiModel(playerId=" + this.f38887a + ", dsSettingCellStyle=" + this.b + Separators.RPAREN;
    }
}
