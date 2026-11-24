package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class p840 {
    public static final o840 Companion = new o840();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26537a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new gj30((byte) 23)), maz.a(wezVar, new gj30((byte) 24))};
    }

    public /* synthetic */ p840(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f26537a = null;
        } else {
            this.f26537a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p840)) {
            return false;
        }
        p840 p840Var = (p840) obj;
        return Intrinsics.d(this.f26537a, p840Var.f26537a) && Intrinsics.d(this.b, p840Var.b);
    }

    public final int hashCode() {
        List list = this.f26537a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("MessagesResponse(messages=", ", users=", this.f26537a, Separators.RPAREN, this.b);
    }
}
