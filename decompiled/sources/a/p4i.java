package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4i f26354a;
    public final o4i b;
    public final String c;
    public final z1n d;
    public final boolean e;

    public p4i(o4i o4iVar, o4i o4iVar2, String str, z1n z1nVar, boolean z) {
        str.getClass();
        this.f26354a = o4iVar;
        this.b = o4iVar2;
        this.c = str;
        this.d = z1nVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4i)) {
            return false;
        }
        p4i p4iVar = (p4i) obj;
        return this.f26354a.equals(p4iVar.f26354a) && this.b.equals(p4iVar.b) && Intrinsics.d(this.c, p4iVar.c) && this.d.equals(p4iVar.d) && this.e == p4iVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ua80.b((this.b.hashCode() + (this.f26354a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DSSportEventCardTwoPairsUiModel(teamOne=");
        sb.append(this.f26354a);
        sb.append(", teamTwo=");
        sb.append(this.b);
        sb.append(", info=");
        sb.append(this.c);
        sb.append(", options=");
        sb.append(this.d);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
