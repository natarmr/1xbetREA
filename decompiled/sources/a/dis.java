package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6151a;
    public final boolean b;
    public final zhs c;

    public dis(String str, boolean z, zhs zhsVar) {
        str.getClass();
        this.f6151a = str;
        this.b = z;
        this.c = zhsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dis)) {
            return false;
        }
        dis disVar = (dis) obj;
        return Intrinsics.d(this.f6151a, disVar.f6151a) && this.b == disVar.b && this.c.equals(disVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f6151a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("GameItemsScreenUiState(headerTitle=", this.f6151a, ", isRefreshing=", this.b, ", contentUiState=");
        sbU.append(this.c);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
