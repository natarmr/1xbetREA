package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class mr20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9d f22248a;
    public final v9d b;
    public final List c;

    public mr20(v9d v9dVar, v9d v9dVar2, List list) {
        v9dVar.getClass();
        v9dVar2.getClass();
        list.getClass();
        this.f22248a = v9dVar;
        this.b = v9dVar2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        mr20 mr20Var = obj instanceof mr20 ? (mr20) obj : null;
        return mr20Var != null && Intrinsics.d(this.f22248a, mr20Var.f22248a) && Intrinsics.d(this.b, mr20Var.b) && Intrinsics.d(this.c, mr20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f22248a.hashCode() * 37)) * 37);
    }
}
