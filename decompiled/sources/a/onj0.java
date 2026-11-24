package a;

import android.gov.nist.core.Separators;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class onj0 implements qnj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f25549a;
    public final String b;
    public final String c;

    public onj0(Uri uri, String str, String str2) {
        uri.getClass();
        str.getClass();
        str2.getClass();
        this.f25549a = uri;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onj0)) {
            return false;
        }
        onj0 onj0Var = (onj0) obj;
        return Intrinsics.d(this.f25549a, onj0Var.f25549a) && Intrinsics.d(this.b, onj0Var.b) && Intrinsics.d(this.c, onj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f25549a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowDownloadCompleted(fileUri=");
        sb.append(this.f25549a);
        sb.append(", fileName=");
        sb.append(this.b);
        sb.append(", channelId=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
