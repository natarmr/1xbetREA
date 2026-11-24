package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ctk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f4942a;
    public final List b;
    public final int c;

    public ctk0(btk0 btk0Var, List list, int i) {
        list.getClass();
        this.f4942a = btk0Var;
        this.b = list;
        this.c = i;
    }

    public static ctk0 a(ctk0 ctk0Var, btk0 btk0Var, List list, int i, int i2) {
        if ((i2 & 1) != 0) {
            btk0Var = ctk0Var.f4942a;
        }
        if ((i2 & 2) != 0) {
            list = ctk0Var.b;
        }
        if ((i2 & 4) != 0) {
            i = ctk0Var.c;
        }
        list.getClass();
        return new ctk0(btk0Var, list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctk0)) {
            return false;
        }
        ctk0 ctk0Var = (ctk0) obj;
        return this.f4942a.equals(ctk0Var.f4942a) && Intrinsics.d(this.b, ctk0Var.b) && this.c == ctk0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + dw9.a(this.f4942a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialEventTabCyberGroupsTeamsStateModel(contentStatus=");
        sb.append(this.f4942a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", currentPageIndex=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
