package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gbk0 implements hbk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iy3 f11019a;
    public final String b;
    public final String c;

    public gbk0(iy3 iy3Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f11019a = iy3Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbk0)) {
            return false;
        }
        gbk0 gbk0Var = (gbk0) obj;
        return this.f11019a.equals(gbk0Var.f11019a) && Intrinsics.d(this.b, gbk0Var.b) && Intrinsics.d(this.c, gbk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f11019a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Video(aspectRatio=");
        sb.append(this.f11019a);
        sb.append(", videoUri=");
        sb.append(this.b);
        sb.append(", imageIri=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
