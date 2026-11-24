package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class wko0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dlo0 f39317a;
    public final ArrayList b;

    public wko0(dlo0 dlo0Var, ArrayList arrayList) {
        this.f39317a = dlo0Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wko0)) {
            return false;
        }
        wko0 wko0Var = (wko0) obj;
        return this.f39317a.equals(wko0Var.f39317a) && this.b.equals(wko0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39317a.hashCode() * 31);
    }

    public final String toString() {
        return "TableRowModel(title=" + this.f39317a + ", cells=" + this.b + Separators.RPAREN;
    }
}
