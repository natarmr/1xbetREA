package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class js0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17026a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public js0(long j, String str, String str2, String str3, long j2, long j3, boolean z, boolean z2, boolean z3) {
        v2s0[] v2s0VarArr = v2s0.f36702a;
        brm0.B(str, str2, str3);
        this.f17026a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j2;
        this.f = j3;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        js0 js0Var = obj instanceof js0 ? (js0) obj : null;
        return js0Var != null && js0Var.f17026a == this.f17026a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17026a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public js0(long j, long j2, long j3, boolean z, boolean z2, boolean z3, String str, String str2, String str3) {
        this(j, str2, str, str3, j2, j3, z, z2, z3);
        brm0.B(str, str2, str3);
        v2s0[] v2s0VarArr = v2s0.f36702a;
    }
}
