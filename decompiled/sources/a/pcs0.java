package a;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pcs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ccs0 f26775a;
    public final b4x b;

    static {
        vtt0.H(0);
        vtt0.H(1);
    }

    public pcs0(ccs0 ccs0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= ccs0Var.f4128a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f26775a = ccs0Var;
        this.b = b4x.o(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pcs0.class == obj.getClass()) {
            pcs0 pcs0Var = (pcs0) obj;
            if (this.f26775a.equals(pcs0Var.f26775a) && this.b.equals(pcs0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.f26775a.hashCode();
    }
}
