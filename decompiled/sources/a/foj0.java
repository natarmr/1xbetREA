package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class foj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f9883a;
    public final String b;
    public final String c;

    public foj0(File file, String str, String str2) {
        str2.getClass();
        this.f9883a = file;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof foj0)) {
            return false;
        }
        foj0 foj0Var = (foj0) obj;
        return this.f9883a.equals(foj0Var.f9883a) && this.b.equals(foj0Var.b) && Intrinsics.d(this.c, foj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f9883a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CouponImageInfo(imageFile=");
        sb.append(this.f9883a);
        sb.append(", fileName=");
        sb.append(this.b);
        sb.append(", channelId=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
