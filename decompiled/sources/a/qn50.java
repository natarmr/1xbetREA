package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class qn50 extends px40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pn50 f29016a;
    public final bt5 b;
    public final ArrayList c;

    public qn50(pn50 pn50Var, bt5 bt5Var, ArrayList arrayList) {
        this.f29016a = pn50Var;
        this.b = bt5Var;
        this.c = arrayList;
    }

    @Override // a.px40
    public final int a() {
        int iOrdinal = this.f29016a.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return R.layout.item_catalog_top_layout;
        }
        if (iOrdinal == 2) {
            return R.layout.item_catalog_other_layout;
        }
        t9f.b();
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn50)) {
            return false;
        }
        qn50 qn50Var = (qn50) obj;
        return this.f29016a == qn50Var.f29016a && this.b.equals(qn50Var.b) && this.c.equals(qn50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f29016a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsAdapterItem(holderType=");
        sb.append(this.f29016a);
        sb.append(", bannerType=");
        sb.append(this.b);
        sb.append(", bannerUiModels=");
        return rz4.n(sb, this.c, Separators.RPAREN);
    }
}
