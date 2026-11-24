package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fxk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10315a;
    public final g950 b;
    public final String c;
    public final String d;
    public final String e;

    public fxk0(String str, g950 g950Var, String str2, String str3) {
        g950Var.getClass();
        str2.getClass();
        str3.getClass();
        this.f10315a = str;
        this.b = g950Var;
        this.c = str2;
        this.d = str3;
        this.e = str + '.' + (g950Var + '(' + str2 + ')' + str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxk0)) {
            return false;
        }
        fxk0 fxk0Var = (fxk0) obj;
        return this.f10315a.equals(fxk0Var.f10315a) && Intrinsics.d(this.b, fxk0Var.b) && Intrinsics.d(this.c, fxk0Var.c) && Intrinsics.d(this.d, fxk0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b((this.b.hashCode() + (this.f10315a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.f10315a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", parameters=");
        sb.append(this.c);
        sb.append(", returnType=");
        return axq.m(sb, this.d, ')');
    }
}
