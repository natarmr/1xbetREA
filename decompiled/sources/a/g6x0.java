package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class g6x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mxw0 f10788a;
    public ArrayList b;
    public ArrayList c;
    public long d;
    public final /* synthetic */ m6x0 e;

    public /* synthetic */ g6x0(m6x0 m6x0Var) {
        this.e = m6x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1 A[RETURN] */
    public final boolean a(long j, sww0 sww0Var) {
        mxw0 mxw0Var;
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (this.c.isEmpty() || ((((sww0) this.c.get(0)).y() / 1000) / 60) / 60 == ((sww0Var.y() / 1000) / 60) / 60) {
            long jK = this.d + ((long) sww0Var.k());
            m6x0 m6x0Var = this.e;
            if (!m6x0Var.e0().x1(null, btw0.Y0)) {
                m6x0Var.e0();
                if (jK < Math.max(0, ((Integer) btw0.j.a(null)).intValue())) {
                    this.d = jK;
                    this.c.add(sww0Var);
                    this.b.add(Long.valueOf(j));
                    mxw0Var = this.f10788a;
                    if (this.c.size() < Math.max(1, m6x0Var.e0().v1(mxw0Var != null ? mxw0Var.r() : null, btw0.k))) {
                        return true;
                    }
                }
            } else if (this.c.isEmpty()) {
                this.d = jK;
                this.c.add(sww0Var);
                this.b.add(Long.valueOf(j));
                mxw0Var = this.f10788a;
                if (this.c.size() < Math.max(1, m6x0Var.e0().v1(mxw0Var != null ? mxw0Var.r() : null, btw0.k))) {
                    return true;
                }
            } else {
                m6x0Var.e0();
                if (jK < Math.max(0, ((Integer) btw0.j.a(null)).intValue())) {
                    this.d = jK;
                    this.c.add(sww0Var);
                    this.b.add(Long.valueOf(j));
                    mxw0Var = this.f10788a;
                    if (this.c.size() < Math.max(1, m6x0Var.e0().v1(mxw0Var != null ? mxw0Var.r() : null, btw0.k))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
