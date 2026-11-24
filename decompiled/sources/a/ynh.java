package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ynh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42940a;
    public final n0x b;

    public ynh(n0x n0xVar, String str) {
        this.f42940a = str;
        this.b = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynh)) {
            return false;
        }
        ynh ynhVar = (ynh) obj;
        return this.f42940a.equals(ynhVar.f42940a) && this.b.equals(ynhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42940a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberTransferInfoCellUiModel(nickname=" + this.f42940a + ", image=" + this.b + Separators.RPAREN;
    }
}
