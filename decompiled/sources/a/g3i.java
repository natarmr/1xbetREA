package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g3i implements h3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10613a;
    public final u3i b;
    public final u3i c;
    public final u3i d;

    public g3i(u3i u3iVar, u3i u3iVar2, u3i u3iVar3, String str) {
        this.f10613a = str;
        this.b = u3iVar;
        this.c = u3iVar2;
        this.d = u3iVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3i)) {
            return false;
        }
        g3i g3iVar = (g3i) obj;
        return Intrinsics.d(this.f10613a, g3iVar.f10613a) && this.b.equals(g3iVar.b) && this.c.equals(g3iVar.c) && this.d.equals(g3iVar.d);
    }

    public final int hashCode() {
        String str = this.f10613a;
        return this.d.hashCode() + vqd.c(this.c, (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31);
    }

    public final String toString() {
        return "V4(tagLive=" + this.f10613a + ", broadcastButton=" + this.b + ", notificationButton=" + this.c + ", favoriteButton=" + this.d + Separators.RPAREN;
    }
}
