package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class u26 implements v26 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f34931a;
    public final boolean b;

    public u26(ArrayList arrayList, boolean z) {
        this.f34931a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u26)) {
            return false;
        }
        u26 u26Var = (u26) obj;
        return this.f34931a.equals(u26Var.f34931a) && this.b == u26Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f34931a.hashCode() * 31);
    }

    public final String toString() {
        return "Update(data=" + this.f34931a + ", rtlSupport=" + this.b + Separators.RPAREN;
    }
}
