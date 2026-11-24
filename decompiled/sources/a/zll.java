package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zll implements bml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pt0 f44585a;
    public final yll b;
    public final List c;

    public zll(pt0 pt0Var, yll yllVar, List list) {
        pt0Var.getClass();
        list.getClass();
        this.f44585a = pt0Var;
        this.b = yllVar;
        this.c = list;
    }

    public static zll b(zll zllVar, ArrayList arrayList) {
        pt0 pt0Var = zllVar.f44585a;
        yll yllVar = zllVar.b;
        pt0Var.getClass();
        return new zll(pt0Var, yllVar, arrayList);
    }

    @Override // a.bml
    public final yll a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zll)) {
            return false;
        }
        zll zllVar = (zll) obj;
        return this.f44585a == zllVar.f44585a && this.b.equals(zllVar.b) && Intrinsics.d(this.c, zllVar.c);
    }

    @Override // a.bml
    public final pt0 getType() {
        return this.f44585a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f44585a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(type=");
        sb.append(this.f44585a);
        sb.append(", orientationType=");
        sb.append(this.b);
        sb.append(", items=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
