package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l4i implements m4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19406a;
    public final c4i b;
    public final b4i c;
    public final u3i d;
    public final u3i e;
    public final u3i f;
    public final u3i g;

    public l4i(String str, c4i c4iVar, b4i b4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, u3i u3iVar4) {
        str.getClass();
        c4iVar.getClass();
        b4iVar.getClass();
        u3iVar.getClass();
        u3iVar2.getClass();
        u3iVar3.getClass();
        u3iVar4.getClass();
        this.f19406a = str;
        this.b = c4iVar;
        this.c = b4iVar;
        this.d = u3iVar;
        this.e = u3iVar2;
        this.f = u3iVar3;
        this.g = u3iVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4i)) {
            return false;
        }
        l4i l4iVar = (l4i) obj;
        return Intrinsics.d(this.f19406a, l4iVar.f19406a) && Intrinsics.d(this.b, l4iVar.b) && Intrinsics.d(this.c, l4iVar.c) && Intrinsics.d(this.d, l4iVar.d) && Intrinsics.d(this.e, l4iVar.e) && Intrinsics.d(this.f, l4iVar.f) && Intrinsics.d(this.g, l4iVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + vqd.c(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f19406a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "V3(liveTag=" + this.f19406a + ", labelModel=" + this.b + ", infoLabelModel=" + this.c + ", broadcastButton=" + this.d + ", notificationButton=" + this.e + ", favoriteButton=" + this.f + ", accordionButton=" + this.g + Separators.RPAREN;
    }

    public /* synthetic */ l4i(String str, c4i c4iVar, b4i b4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, u3i u3iVar4, int i) {
        this(str, c4iVar, b4iVar, (i & 8) != 0 ? w3i.f38503a : u3iVar, (i & 16) != 0 ? a4i.f224a : u3iVar2, u3iVar3, (i & 64) != 0 ? t3i.f33268a : u3iVar4);
    }
}
