package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pvx implements owl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27683a;
    public final String b;

    public pvx(int i, String str) {
        str.getClass();
        this.f27683a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvx)) {
            return false;
        }
        pvx pvxVar = (pvx) obj;
        return this.f27683a == pvxVar.f27683a && Intrinsics.d(this.b, pvxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f27683a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f27683a, "ItemInfo(nameStringRes=", ", text=", this.b, Separators.RPAREN);
    }
}
