package a;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class i35 extends tbf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14080a;
    public final quc b;
    public final quc c;
    public final String d;

    public i35(Context context, quc qucVar, quc qucVar2, String str) {
        if (context == null) {
            hny.u("Null applicationContext");
            throw null;
        }
        this.f14080a = context;
        if (qucVar == null) {
            hny.u("Null wallClock");
            throw null;
        }
        this.b = qucVar;
        if (qucVar2 == null) {
            hny.u("Null monotonicClock");
            throw null;
        }
        this.c = qucVar2;
        if (str != null) {
            this.d = str;
        } else {
            hny.u("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tbf) {
            i35 i35Var = (i35) ((tbf) obj);
            if (this.f14080a.equals(i35Var.f14080a) && this.b.equals(i35Var.b) && this.c.equals(i35Var.c) && this.d.equals(i35Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.f14080a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f14080a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return axq.n(sb, this.d, "}");
    }
}
