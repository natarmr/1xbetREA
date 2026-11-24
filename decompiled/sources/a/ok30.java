package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ok30 extends sk30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f25387a;
    public final boolean b;
    public final boolean c;

    public ok30(ArrayList arrayList, boolean z, boolean z2) {
        this.f25387a = arrayList;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok30)) {
            return false;
        }
        ok30 ok30Var = (ok30) obj;
        return this.f25387a.equals(ok30Var.f25387a) && this.b == ok30Var.b && this.c == ok30Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f25387a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(items=");
        sb.append(this.f25387a);
        sb.append(", filterApplied=");
        sb.append(this.b);
        sb.append(", disableToolbarMenu=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
