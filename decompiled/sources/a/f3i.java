package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f3i implements h3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4i f8865a;
    public final u3i b;
    public final u3i c;
    public final u3i d;
    public final String e;

    public f3i(u3i u3iVar, u3i u3iVar2, u3i u3iVar3, b4i b4iVar, String str) {
        this.f8865a = b4iVar;
        this.b = u3iVar;
        this.c = u3iVar2;
        this.d = u3iVar3;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3i)) {
            return false;
        }
        f3i f3iVar = (f3i) obj;
        return this.f8865a.equals(f3iVar.f8865a) && this.b.equals(f3iVar.b) && this.c.equals(f3iVar.c) && this.d.equals(f3iVar.d) && Intrinsics.d(this.e, f3iVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + vqd.c(this.c, (this.b.hashCode() + (this.f8865a.hashCode() * 31)) * 31, 31)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V3(infoLabelModel=");
        sb.append(this.f8865a);
        sb.append(", broadcastButton=");
        sb.append(this.b);
        sb.append(", notificationButton=");
        sb.append(this.c);
        sb.append(", favoriteButton=");
        sb.append(this.d);
        sb.append(", tagText=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
