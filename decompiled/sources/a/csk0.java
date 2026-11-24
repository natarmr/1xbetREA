package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class csk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f4894a;
    public final List b;
    public final Set c;

    public csk0(btk0 btk0Var, List list, Set set) {
        list.getClass();
        set.getClass();
        this.f4894a = btk0Var;
        this.b = list;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csk0)) {
            return false;
        }
        csk0 csk0Var = (csk0) obj;
        return this.f4894a.equals(csk0Var.f4894a) && Intrinsics.d(this.b, csk0Var.b) && Intrinsics.d(this.c, csk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f4894a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "History(status=" + this.f4894a + ", content=" + this.b + ", expandIds=" + this.c + Separators.RPAREN;
    }
}
