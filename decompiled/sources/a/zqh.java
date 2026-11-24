package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4i f44806a;
    public final String b;

    public zqh(i4i i4iVar, String str) {
        str.getClass();
        this.f44806a = i4iVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqh)) {
            return false;
        }
        zqh zqhVar = (zqh) obj;
        return this.f44806a.equals(zqhVar.f44806a) && Intrinsics.d(this.b, zqhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44806a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberUfcCardTopBlock(model=" + this.f44806a + ", broadcastSoonTag=" + this.b + Separators.RPAREN;
    }
}
