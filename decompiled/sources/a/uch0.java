package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class uch0 {
    public static final uch0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4x f35429a;

    static {
        lef0 lef0Var = new lef0();
        lef0Var.f19899a = f4x.l(2, 1, 5);
        b = new uch0(lef0Var);
    }

    public uch0(lef0 lef0Var) {
        this.f35429a = (f4x) lef0Var.f19899a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof uch0) && this.f35429a.equals(((uch0) obj).f35429a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f35429a, null, null, bool, bool, bool, bool, bool);
    }
}
