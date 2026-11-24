package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class aji0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f978a;
    public final List b;
    public final ArrayList c;
    public final Executor d;
    public final ey9 e;
    public final int f;
    public final Map g;

    public aji0(int i, ArrayList arrayList, ArrayList arrayList2, Executor executor, r9a r9aVar, int i2, Map map) {
        executor.getClass();
        r9aVar.getClass();
        this.f978a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = executor;
        this.e = r9aVar;
        this.f = i2;
        this.g = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aji0)) {
            return false;
        }
        aji0 aji0Var = (aji0) obj;
        return this.f978a == aji0Var.f978a && Intrinsics.d(this.b, aji0Var.b) && this.c.equals(aji0Var.c) && Intrinsics.d(this.d, aji0Var.d) && Intrinsics.d(this.e, aji0Var.e) && this.f == aji0Var.f && this.g.equals(aji0Var.g);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f978a) * 31;
        List list = this.b;
        return ohs0.f(this.g, twn.a(this.f, (this.e.hashCode() + ((this.d.hashCode() + twn.g(this.c, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "SessionConfigData(sessionType=" + this.f978a + ", inputConfiguration=" + this.b + ", outputConfigurations=" + this.c + ", executor=" + this.d + ", stateCallback=" + this.e + ", sessionTemplateId=" + this.f + ", sessionParameters=" + this.g + ", sessionColorSpace=null)";
    }
}
