package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class icp {
    public static final gcp Companion = new gcp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14545a;
    public final String b;

    public /* synthetic */ icp(int i, int i2, String str) {
        this.f14545a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final void a() {
        int i = this.f14545a;
        if (i != 0) {
            String str = this.b;
            if (str == null) {
                str = "";
            }
            throw new zhi0(str, i, (Integer) null, 12);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icp)) {
            return false;
        }
        icp icpVar = (icp) obj;
        return this.f14545a == icpVar.f14545a && Intrinsics.d(this.b, icpVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f14545a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return defpackage.c.b(this.f14545a, "FavoriteResponse(errorId=", ", errorMessage=", this.b, Separators.RPAREN);
    }
}
