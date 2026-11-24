package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class a4c {
    public static final z3c Companion = new z3c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215a;
    public final Long b;

    public /* synthetic */ a4c(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f215a = null;
        } else {
            this.f215a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4c)) {
            return false;
        }
        a4c a4cVar = (a4c) obj;
        return Intrinsics.d(this.f215a, a4cVar.f215a) && Intrinsics.d(this.b, a4cVar.b);
    }

    public final int hashCode() {
        String str = this.f215a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "Data(password=" + this.f215a + ", time=" + this.b + Separators.RPAREN;
    }

    public a4c(String str, Long l) {
        this.f215a = str;
        this.b = l;
    }
}
