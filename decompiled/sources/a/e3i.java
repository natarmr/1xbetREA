package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e3i implements h3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7136a;
    public final b4i b;
    public final u3i c;
    public final u3i d;
    public final u3i e;

    public e3i(u3i u3iVar, u3i u3iVar2, u3i u3iVar3, b4i b4iVar, String str) {
        str.getClass();
        this.f7136a = str;
        this.b = b4iVar;
        this.c = u3iVar;
        this.d = u3iVar2;
        this.e = u3iVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3i)) {
            return false;
        }
        e3i e3iVar = (e3i) obj;
        return Intrinsics.d(this.f7136a, e3iVar.f7136a) && this.b.equals(e3iVar.b) && this.c.equals(e3iVar.c) && this.d.equals(e3iVar.d) && this.e.equals(e3iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + vqd.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f7136a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "V2(tagLiveText=" + this.f7136a + ", infoLabelModel=" + this.b + ", broadcastButton=" + this.c + ", notificationButton=" + this.d + ", favoriteButton=" + this.e + Separators.RPAREN;
    }
}
