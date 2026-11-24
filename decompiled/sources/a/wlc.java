package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wlc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f7v0 f39347a;
    public final String b;
    public final fwp c;
    public final List d;

    public wlc(f7v0 f7v0Var, String str, fwp fwpVar, List list) {
        list.getClass();
        this.f39347a = f7v0Var;
        this.b = str;
        this.c = fwpVar;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlc)) {
            return false;
        }
        wlc wlcVar = (wlc) obj;
        return this.f39347a == wlcVar.f39347a && this.b.equals(wlcVar.b) && this.c.equals(wlcVar.c) && Intrinsics.d(this.d, wlcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f39347a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "ClassRankingModel(weightClass=" + this.f39347a + ", gender=" + this.b + ", champion=" + this.c + ", fighters=" + this.d + Separators.RPAREN;
    }
}
