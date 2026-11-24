package a;

/* JADX INFO: loaded from: classes.dex */
public final class evh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hvh0 f8467a;
    public final hvh0 b;

    public evh0(hvh0 hvh0Var, hvh0 hvh0Var2) {
        this.f8467a = hvh0Var;
        this.b = hvh0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || evh0.class != obj.getClass()) {
            return false;
        }
        evh0 evh0Var = (evh0) obj;
        return this.f8467a.equals(evh0Var.f8467a) && this.b.equals(evh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8467a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        hvh0 hvh0Var = this.f8467a;
        sb.append(hvh0Var);
        hvh0 hvh0Var2 = this.b;
        if (hvh0Var.equals(hvh0Var2)) {
            str = "";
        } else {
            str = ", " + hvh0Var2;
        }
        return axq.n(sb, str, "]");
    }
}
