package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class pzf0 {
    public static final ozf0 Companion = new ozf0();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f27842a;
    public final ywp0 b;
    public final List c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{null, null, maz.a(wezVar, new b4f0((byte) 26)), maz.a(wezVar, new b4f0((byte) 27))};
    }

    public /* synthetic */ pzf0(int i, Boolean bool, ywp0 ywp0Var, List list, List list2) {
        if ((i & 1) == 0) {
            this.f27842a = null;
        } else {
            this.f27842a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ywp0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzf0)) {
            return false;
        }
        pzf0 pzf0Var = (pzf0) obj;
        return Intrinsics.d(this.f27842a, pzf0Var.f27842a) && Intrinsics.d(this.b, pzf0Var.b) && Intrinsics.d(this.c, pzf0Var.c) && Intrinsics.d(this.d, pzf0Var.d);
    }

    public final int hashCode() {
        Boolean bool = this.f27842a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ywp0 ywp0Var = this.b;
        int iHashCode2 = (iHashCode + (ywp0Var == null ? 0 : ywp0Var.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RestorePasswordResponse(authenticatorEnabled=");
        sb.append(this.f27842a);
        sb.append(", auth=");
        sb.append(this.b);
        sb.append(", codeTypes=");
        return kng0.n(", codeTypesRepeat=", Separators.RPAREN, sb, this.c, this.d);
    }
}
