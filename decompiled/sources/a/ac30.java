package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ac30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f611a;
    public final String b;
    public final String c;
    public final List d;

    public ac30(int i, String str, String str2, List list) {
        list.getClass();
        this.f611a = i;
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac30)) {
            return false;
        }
        ac30 ac30Var = (ac30) obj;
        return this.f611a == ac30Var.f611a && this.b.equals(ac30Var.b) && this.c.equals(ac30Var.c) && Intrinsics.d(this.d, ac30Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(Integer.hashCode(this.f611a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return rw2.m(this.c, ", ballByBall=", Separators.RPAREN, vqd.r(this.f611a, "MatchProgressCricketModel(id=", ", title=", this.b, ", teamId="), this.d);
    }
}
