package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t4x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f33342a;
    public final Object b;
    public final Object c;
    public final vd40 d;
    public final String e;

    public t4x(Object obj, Object obj2, vd40 vd40Var, vd40 vd40Var2, String str) {
        this.f33342a = obj;
        this.b = obj2;
        this.c = vd40Var;
        this.d = vd40Var2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4x)) {
            return false;
        }
        t4x t4xVar = (t4x) obj;
        return this.f33342a.equals(t4xVar.f33342a) && Intrinsics.d(this.b, t4xVar.b) && Intrinsics.d(this.c, t4xVar.c) && this.d.equals(t4xVar.d) && this.e.equals(t4xVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f33342a.hashCode() * 31;
        Object obj = this.b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.f33342a);
        sb.append(", compilerVersion=");
        sb.append(this.b);
        sb.append(", languageVersion=");
        sb.append(this.c);
        sb.append(", expectedVersion=");
        sb.append(this.d);
        sb.append(", filePath=");
        return axq.m(sb, this.e, ')');
    }
}
