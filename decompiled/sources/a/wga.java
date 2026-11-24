package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39104a;
    public final u3i b;
    public final u3i c;
    public final u3i d;

    public wga(u3i u3iVar, u3i u3iVar2, u3i u3iVar3, String str) {
        str.getClass();
        this.f39104a = str;
        this.b = u3iVar;
        this.c = u3iVar2;
        this.d = u3iVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wga)) {
            return false;
        }
        wga wgaVar = (wga) obj;
        return Intrinsics.d(this.f39104a, wgaVar.f39104a) && this.b.equals(wgaVar.b) && this.c.equals(wgaVar.c) && this.d.equals(wgaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + vqd.c(this.c, (this.b.hashCode() + (this.f39104a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(tagLive=" + this.f39104a + ", broadcastButton=" + this.b + ", notificationButton=" + this.c + ", favoriteButton=" + this.d + Separators.RPAREN;
    }
}
