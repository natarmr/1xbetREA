package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lb30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19738a;
    public final String b;
    public final String c;

    public lb30(List list, String str, String str2) {
        list.getClass();
        this.f19738a = list;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb30)) {
            return false;
        }
        lb30 lb30Var = (lb30) obj;
        return Intrinsics.d(this.f19738a, lb30Var.f19738a) && this.b.equals(lb30Var.b) && this.c.equals(lb30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f19738a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(ua80.o("MatchModel(games=", ", image=", this.b, this.f19738a, ", title="), this.c, Separators.RPAREN);
    }
}
