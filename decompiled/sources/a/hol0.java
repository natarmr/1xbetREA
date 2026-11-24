package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hol0 implements kol0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13399a;
    public final c4i b;
    public final b4i c;
    public final u3i d;
    public final u3i e;
    public final u3i f;

    public hol0(String str, c4i c4iVar, b4i b4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3) {
        str.getClass();
        this.f13399a = str;
        this.b = c4iVar;
        this.c = b4iVar;
        this.d = u3iVar;
        this.e = u3iVar2;
        this.f = u3iVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hol0)) {
            return false;
        }
        hol0 hol0Var = (hol0) obj;
        return Intrinsics.d(this.f13399a, hol0Var.f13399a) && this.b.equals(hol0Var.b) && this.c.equals(hol0Var.c) && this.d.equals(hol0Var.d) && this.e.equals(hol0Var.e) && this.f.equals(hol0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + vqd.c(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f13399a.hashCode() * 31)) * 31)) * 961)) * 31, 31);
    }

    public final String toString() {
        return "LargeCardWatermark(liveTag=" + this.f13399a + ", labelModel=" + this.b + ", infoLabelModel=" + this.c + ", infoLabel=, favoriteButton=" + this.d + ", notificationButton=" + this.e + ", broadcastButton=" + this.f + Separators.RPAREN;
    }
}
