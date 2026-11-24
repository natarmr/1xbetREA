package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h3k0 implements y1h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12389a;
    public final ob50 b;
    public final List c;
    public final List d;
    public final ugd e = new ugd(-322904035, true, new uph0(this, (byte) 26));

    public h3k0(Object obj, ob50 ob50Var, List list) {
        this.f12389a = obj;
        this.b = ob50Var;
        this.c = list;
        this.d = kotlin.collections.a.c(ob50Var);
    }

    @Override // a.y1h0
    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h3k0.class == obj.getClass()) {
            h3k0 h3k0Var = (h3k0) obj;
            if (Intrinsics.d(this.f12389a, h3k0Var.f12389a) && Intrinsics.d(this.b, h3k0Var.b) && Intrinsics.d(this.c, h3k0Var.c) && Intrinsics.d(this.d, h3k0Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // a.y1h0
    public final ugd getContent() {
        return this.e;
    }

    @Override // a.y1h0
    public final List getEntries() {
        return this.d;
    }

    @Override // a.y1h0
    public final Object getKey() {
        return this.f12389a;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.b.hashCode() * 31) + (this.f12389a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SinglePaneScene(key=");
        sb.append(this.f12389a);
        sb.append(", entry=");
        sb.append(this.b);
        sb.append(", previousEntries=");
        return kng0.n(", entries=", Separators.RPAREN, sb, this.c, this.d);
    }
}
