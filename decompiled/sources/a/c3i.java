package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c3i implements h3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u3i f3675a;
    public final u3i b;
    public final u3i c;
    public final String d;

    public c3i(u3i u3iVar, u3i u3iVar2, u3i u3iVar3, String str) {
        this.f3675a = u3iVar;
        this.b = u3iVar2;
        this.c = u3iVar3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3i)) {
            return false;
        }
        c3i c3iVar = (c3i) obj;
        return this.f3675a.equals(c3iVar.f3675a) && this.b.equals(c3iVar.b) && this.c.equals(c3iVar.c) && Intrinsics.d(this.d, c3iVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + vqd.c(this.b, this.f3675a.hashCode() * 31, 31)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Default(broadcastButton=" + this.f3675a + ", notificationButton=" + this.b + ", favoriteButton=" + this.c + ", tagText=" + this.d + Separators.RPAREN;
    }
}
