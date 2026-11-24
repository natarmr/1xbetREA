package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hkw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0t f13227a;
    public final ikw b;
    public final ArrayList c;

    public hkw(d0t d0tVar, ikw ikwVar, ArrayList arrayList) {
        d0tVar.getClass();
        this.f13227a = d0tVar;
        this.b = ikwVar;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkw)) {
            return false;
        }
        hkw hkwVar = (hkw) obj;
        return Intrinsics.d(this.f13227a, hkwVar.f13227a) && this.b == hkwVar.b && this.c.equals(hkwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f13227a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeTopGameModel(game=");
        sb.append(this.f13227a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", fighterImages=");
        return rz4.n(sb, this.c, Separators.RPAREN);
    }
}
