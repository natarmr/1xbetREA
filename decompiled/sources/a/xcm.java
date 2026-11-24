package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xcm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ucm f40652a;
    public final ucm b;

    public xcm(ucm ucmVar, ucm ucmVar2) {
        this.f40652a = ucmVar;
        this.b = ucmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcm)) {
            return false;
        }
        xcm xcmVar = (xcm) obj;
        return this.f40652a.equals(xcmVar.f40652a) && this.b.equals(xcmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40652a.hashCode() * 31);
    }

    public final String toString() {
        return "DsCyberTransferCardTransferUiModel(teamFrom=" + this.f40652a + ", teamTo=" + this.b + Separators.RPAREN;
    }
}
