package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zo50 implements cp50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f44703a;
    public final fqm b;
    public final ArrayList c;

    public zo50(fqm fqmVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f44703a = arrayList;
        this.b = fqmVar;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo50)) {
            return false;
        }
        zo50 zo50Var = (zo50) obj;
        return this.f44703a.equals(zo50Var.f44703a) && this.b.equals(zo50Var.b) && this.c.equals(zo50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f44703a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(topBanners=");
        sb.append(this.f44703a);
        sb.append(", topBannersSegmentUiModel=");
        sb.append(this.b);
        sb.append(", categories=");
        return rz4.n(sb, this.c, Separators.RPAREN);
    }
}
