package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39221a;
    public final bjm b;
    public final String c;

    public wim(int i, bjm bjmVar, String str) {
        this.f39221a = i;
        this.b = bjmVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wim)) {
            return false;
        }
        wim wimVar = (wim) obj;
        return this.f39221a == wimVar.f39221a && this.b.equals(wimVar.b) && Intrinsics.d(this.c, wimVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.f39221a) * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsGamesGameCollectionCardUiModel(id=");
        sb.append(this.f39221a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", label=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
