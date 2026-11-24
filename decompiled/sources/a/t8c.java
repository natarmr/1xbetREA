package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class t8c {
    public static final s8c Companion = new s8c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33506a;
    public final String b;

    public /* synthetic */ t8c(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f33506a = null;
        } else {
            this.f33506a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8c)) {
            return false;
        }
        t8c t8cVar = (t8c) obj;
        return Intrinsics.d(this.f33506a, t8cVar.f33506a) && Intrinsics.d(this.b, t8cVar.b);
    }

    public final int hashCode() {
        String str = this.f33506a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("Auth(guid=", this.f33506a, ", token=", this.b, Separators.RPAREN);
    }

    public t8c(String str, String str2) {
        this.f33506a = str;
        this.b = str2;
    }
}
