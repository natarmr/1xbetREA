package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qnh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ynh f29028a;
    public final aoh b;

    public qnh(ynh ynhVar, aoh aohVar) {
        this.f29028a = ynhVar;
        this.b = aohVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnh)) {
            return false;
        }
        qnh qnhVar = (qnh) obj;
        return this.f29028a.equals(qnhVar.f29028a) && this.b.equals(qnhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29028a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberTransferCellItemUiModel(transferInfo=" + this.f29028a + ", transferStatus=" + this.b + Separators.RPAREN;
    }
}
