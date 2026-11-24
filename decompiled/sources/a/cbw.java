package a;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class cbw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4080a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final ArrayList h;
    public final boolean i;
    public final long j;
    public final long k;
    public final b4x l;
    public final b4x m;
    public final rcf0 n;
    public final boolean o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final String t;

    public cbw(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3, long j7, long j8, String str4) {
        x0x.A((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f4080a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = arrayList;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = b4x.o(arrayList2);
        this.m = b4x.o(arrayList3);
        this.n = b4x.F(new l13((byte) 17), arrayList4);
        this.o = z2;
        this.p = str2;
        this.q = str3;
        this.r = j7;
        this.s = j8;
        this.t = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbw)) {
            return false;
        }
        cbw cbwVar = (cbw) obj;
        return this.d == cbwVar.d && this.e == cbwVar.e && this.f == cbwVar.f && this.g == cbwVar.g && this.i == cbwVar.i && this.j == cbwVar.j && this.k == cbwVar.k && this.o == cbwVar.o && this.r == cbwVar.r && this.s == cbwVar.s && this.f4080a.equals(cbwVar.f4080a) && Objects.equals(this.b, cbwVar.b) && Objects.equals(this.c, cbwVar.c) && this.h.equals(cbwVar.h) && Objects.equals(this.l, cbwVar.l) && Objects.equals(this.m, cbwVar.m) && Objects.equals(this.n, cbwVar.n) && Objects.equals(this.p, cbwVar.p) && Objects.equals(this.q, cbwVar.q) && Objects.equals(this.t, cbwVar.t);
    }

    public final int hashCode() {
        return Objects.hash(this.f4080a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q, Long.valueOf(this.r), Long.valueOf(this.s), this.t);
    }
}
