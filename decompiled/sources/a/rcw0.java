package a;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rcw0 {
    public static final jzt0 b = new jzt0(9);
    public static final rcw0 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qcw0 f30261a;

    static {
        List list = Collections.EMPTY_LIST;
        c = new rcw0(new qcw0());
    }

    public rcw0(qcw0 qcw0Var) {
        this.f30261a = qcw0Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rcw0) && ((rcw0) obj).f30261a.equals(this.f30261a);
    }

    public final int hashCode() {
        return ~this.f30261a.hashCode();
    }

    public final String toString() {
        return this.f30261a.toString();
    }
}
