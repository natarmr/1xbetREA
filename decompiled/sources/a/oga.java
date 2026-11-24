package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25208a;
    public final u3i b;
    public final u3i c;

    public oga(u3i u3iVar, u3i u3iVar2, String str) {
        str.getClass();
        this.f25208a = str;
        this.b = u3iVar;
        this.c = u3iVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oga)) {
            return false;
        }
        oga ogaVar = (oga) obj;
        return Intrinsics.d(this.f25208a, ogaVar.f25208a) && this.b.equals(ogaVar.b) && this.c.equals(ogaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + vqd.c(this.b, this.f25208a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "LargeCardWatermark(infoLabel=" + this.f25208a + ", notificationButton=" + this.b + ", favoriteButton=" + this.c + Separators.RPAREN;
    }
}
