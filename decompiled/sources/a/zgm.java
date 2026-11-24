package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zgm implements ahm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hgm f44351a;
    public final hgm b;

    public zgm(hgm hgmVar, hgm hgmVar2) {
        hgmVar.getClass();
        hgmVar2.getClass();
        this.f44351a = hgmVar;
        this.b = hgmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgm)) {
            return false;
        }
        zgm zgmVar = (zgm) obj;
        return this.f44351a == zgmVar.f44351a && this.b == zgmVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44351a.hashCode() * 31);
    }

    public final String toString() {
        return "VerticalSplit(topColorType=" + this.f44351a + ", bottomColorType=" + this.b + Separators.RPAREN;
    }
}
