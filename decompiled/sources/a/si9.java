package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes5.dex */
public final class si9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32250a;
    public final String b;
    public final Protocol c;
    public final int d;
    public final String e;
    public final Headers f;
    public final long g;
    public final long h;

    public si9(String str, String str2, Protocol protocol, int i, String str3, Headers headers, long j, long j2) {
        str2.getClass();
        protocol.getClass();
        str3.getClass();
        this.f32250a = str;
        this.b = str2;
        this.c = protocol;
        this.d = i;
        this.e = str3;
        this.f = headers;
        this.g = j;
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si9)) {
            return false;
        }
        si9 si9Var = (si9) obj;
        return this.f32250a.equals(si9Var.f32250a) && Intrinsics.d(this.b, si9Var.b) && this.c == si9Var.c && this.d == si9Var.d && Intrinsics.d(this.e, si9Var.e) && this.f.equals(si9Var.f) && this.g == si9Var.g && this.h == si9Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + rw2.b((ua80.b(twn.a(this.d, (this.c.hashCode() + ua80.b(this.f32250a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e) + Arrays.hashCode(this.f.f46098a)) * 31, 31, this.g);
    }

    public final String toString() {
        return this.f32250a + '\n' + this.b + '\n' + this.c.f46107a + '\n' + this.d + '\n' + this.e + '\n' + this.g + '\n' + this.h + '\n' + CollectionsKt.b0(this.f, Separators.RETURN, null, null, new d69((byte) 4), 30);
    }
}
