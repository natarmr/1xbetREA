package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c2v0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3643a;
    public final i7a b;
    public final String c;
    public final String d;
    public final String e;

    public c2v0(String str, i7a i7aVar, String str2, String str3, String str4) {
        i7aVar.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f3643a = str;
        this.b = i7aVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2v0)) {
            return false;
        }
        c2v0 c2v0Var = (c2v0) obj;
        return this.f3643a.equals(c2v0Var.f3643a) && Intrinsics.d(this.b, c2v0Var.b) && Intrinsics.d(this.c, c2v0Var.c) && Intrinsics.d(this.d, c2v0Var.d) && Intrinsics.d(this.e, c2v0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b((this.b.hashCode() + (this.f3643a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebCaptchaDialogDesignSystemParams(requestKey=");
        sb.append(this.f3643a);
        sb.append(", captureTask=");
        sb.append(this.b);
        sb.append(", phone=");
        f140.v(sb, this.c, ", title=", this.d, ", captchaToken=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
