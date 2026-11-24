package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fsj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10067a;
    public final String b;
    public final jup c;
    public final jup d;

    public fsj0(long j, String str, jup jupVar, jup jupVar2) {
        str.getClass();
        this.f10067a = j;
        this.b = str;
        this.c = jupVar;
        this.d = jupVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsj0)) {
            return false;
        }
        fsj0 fsj0Var = (fsj0) obj;
        return this.f10067a == fsj0Var.f10067a && Intrinsics.d(this.b, fsj0Var.b) && this.c.equals(fsj0Var.c) && this.d.equals(fsj0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ua80.b(Long.hashCode(this.f10067a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f10067a, "ShotMapTab(id=", ", title=", this.b);
        sbO.append(", first=");
        sbO.append(this.c);
        sbO.append(", second=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
