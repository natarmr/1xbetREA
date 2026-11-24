package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f863a;
    public final u3i b;
    public final u3i c;

    public aha(u3i u3iVar, u3i u3iVar2, String str) {
        str.getClass();
        this.f863a = str;
        this.b = u3iVar;
        this.c = u3iVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aha)) {
            return false;
        }
        aha ahaVar = (aha) obj;
        return Intrinsics.d(this.f863a, ahaVar.f863a) && this.b.equals(ahaVar.b) && this.c.equals(ahaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + vqd.c(this.b, this.f863a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(tagLive=" + this.f863a + ", notificationButton=" + this.b + ", favoriteButton=" + this.c + Separators.RPAREN;
    }
}
