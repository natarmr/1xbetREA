package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class u9b implements x9b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35275a;
    public final e9b b;

    public u9b(int i, e9b e9bVar) {
        this.f35275a = i;
        this.b = e9bVar;
    }

    @Override // a.x9b
    public final int a() {
        return R.color.static_black_40;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9b)) {
            return false;
        }
        u9b u9bVar = (u9b) obj;
        return this.f35275a == u9bVar.f35275a && this.b.equals(u9bVar.b);
    }

    @Override // a.x9b
    public final e9b getType() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(R.color.static_black_40) + ((this.b.hashCode() + twn.a(R.dimen.size_14, twn.a(R.dimen.size_14, Integer.hashCode(this.f35275a) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("ImageRes(imageRes=", this.f35275a, ", imageWidth=", ", imageHeight=", R.dimen.size_14);
        sbT.append(R.dimen.size_14);
        sbT.append(", type=");
        sbT.append(this.b);
        sbT.append(", backgroundColor=");
        return rz4.j(R.color.static_black_40, Separators.RPAREN, sbT);
    }
}
