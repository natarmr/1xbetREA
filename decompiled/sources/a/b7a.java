package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class b7a {
    public static final a7a Companion = new a7a();
    public static final a8z[] c = {maz.a(wez.f39042a, new mn9(15)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2096a;
    public final String b;

    public b7a(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f2096a = null;
        } else {
            this.f2096a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7a)) {
            return false;
        }
        b7a b7aVar = (b7a) obj;
        return Intrinsics.d(this.f2096a, b7aVar.f2096a) && Intrinsics.d(this.b, b7aVar.b);
    }

    public final int hashCode() {
        List list = this.f2096a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CaptchaResponse(tasks=" + this.f2096a + ", id=" + this.b + Separators.RPAREN;
    }
}
