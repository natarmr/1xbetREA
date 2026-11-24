package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class pxw {
    public static final oxw Companion = new oxw();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27776a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new kdw((byte) 18)), maz.a(wezVar, new kdw((byte) 19))};
    }

    public /* synthetic */ pxw(int i, List list, List list2) {
        if (1 != (i & 1)) {
            m2x.I(i, 1, nxw.f24302a.getDescriptor());
            throw null;
        }
        this.f27776a = list;
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
        if (!(obj instanceof pxw)) {
            return false;
        }
        pxw pxwVar = (pxw) obj;
        return Intrinsics.d(this.f27776a, pxwVar.f27776a) && Intrinsics.d(this.b, pxwVar.b);
    }

    public final int hashCode() {
        List list = this.f27776a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("Identities(loginList=", ", emailList=", this.f27776a, Separators.RPAREN, this.b);
    }
}
