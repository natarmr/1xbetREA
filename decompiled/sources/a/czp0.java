package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class czp0 implements ezp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pic f5234a;
    public final String b;
    public final ArrayList c;

    public czp0(pic picVar, String str, ArrayList arrayList) {
        str.getClass();
        this.f5234a = picVar;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czp0)) {
            return false;
        }
        czp0 czp0Var = (czp0) obj;
        return this.f5234a == czp0Var.f5234a && Intrinsics.d(this.b, czp0Var.b) && this.c.equals(czp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f5234a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowChoseFilterDialog(filterType=");
        sb.append(this.f5234a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", filters=");
        return rz4.n(sb, this.c, Separators.RPAREN);
    }
}
