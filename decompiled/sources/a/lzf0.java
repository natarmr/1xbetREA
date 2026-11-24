package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class lzf0<T> {
    public static final gzf0 Companion = new gzf0();
    public static final zna0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20902a;
    public final String b;
    public final String c;

    static {
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.restore.RestorePasswordRequest", null, 3);
        zna0Var.j("Data", false);
        zna0Var.j("CaptchaId", false);
        zna0Var.j("ImageText", false);
        d = zna0Var;
    }

    public /* synthetic */ lzf0(Object obj, String str, int i, String str2) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, d);
            throw null;
        }
        this.f20902a = obj;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzf0)) {
            return false;
        }
        lzf0 lzf0Var = (lzf0) obj;
        return Intrinsics.d(this.f20902a, lzf0Var.f20902a) && Intrinsics.d(this.b, lzf0Var.b) && Intrinsics.d(this.c, lzf0Var.c);
    }

    public final int hashCode() {
        Object obj = this.f20902a;
        return this.c.hashCode() + ua80.b((obj == null ? 0 : obj.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RestorePasswordRequest(data=");
        sb.append(this.f20902a);
        sb.append(", captchaId=");
        sb.append(this.b);
        sb.append(", captchaText=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }

    public lzf0(Object obj, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f20902a = obj;
        this.b = str;
        this.c = str2;
    }
}
