package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class v9b implements x9b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37026a;
    public final a9b b;

    public v9b(String str, a9b a9bVar) {
        str.getClass();
        this.f37026a = str;
        this.b = a9bVar;
    }

    @Override // a.x9b
    public final int a() {
        return R.color.static_black_40;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9b)) {
            return false;
        }
        v9b v9bVar = (v9b) obj;
        return Intrinsics.d(this.f37026a, v9bVar.f37026a) && this.b.equals(v9bVar.b);
    }

    @Override // a.x9b
    public final e9b getType() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(R.color.static_black_40) + ((this.b.hashCode() + twn.a(R.dimen.size_14, twn.a(R.dimen.size_14, twn.a(R.drawable.dota2_item_placeholder_with_background, this.f37026a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(R.drawable.dota2_item_placeholder_with_background, "ImageUrl(url=", this.f37026a, ", placeholderRes=", ", imageWidth=");
        axq.r(R.dimen.size_14, R.dimen.size_14, ", imageHeight=", ", type=", sbP);
        sbP.append(this.b);
        sbP.append(", backgroundColor=");
        sbP.append(R.color.static_black_40);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
