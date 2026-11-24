package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class wcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f38917a;
    public final Map b;
    public final String c;

    public wcb(String str, Map map, Map map2) {
        this.f38917a = map;
        this.b = map2;
        this.c = str;
    }

    public final String a(long j, long j2) {
        if (j == 40) {
            String str = this.c;
            if (j2 <= 0) {
                return String.format(str, Arrays.copyOf(new Object[]{String.valueOf(j)}, 1));
            }
            Object obj = this.f38917a.get(new vcb(j2));
            if (obj == null) {
                obj = String.format(str, Arrays.copyOf(new Object[]{String.valueOf(j)}, 1));
            }
            return (String) obj;
        }
        ucb ucbVar = (ucb) this.b.get(new tcb(j));
        if (ucbVar != null && ucbVar.b) {
            return ucbVar.f35420a;
        }
        if (j == 0) {
            return "";
        }
        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
        rz4.s(j, ".svg", bzuVarD);
        return ((StringBuilder) bzuVarD.b).toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcb)) {
            return false;
        }
        wcb wcbVar = (wcb) obj;
        return this.f38917a.equals(wcbVar.f38917a) && this.b.equals(wcbVar.b) && this.c.equals(wcbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ohs0.f(this.b, this.f38917a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampImagesHolder(cyberImagesMap=");
        sb.append(this.f38917a);
        sb.append(", sportImagesMap=");
        sb.append(this.b);
        sb.append(", defaultChampImage=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
