package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ek extends nk {
    public final String b;

    public ek(String str) {
        str.getClass();
        this.b = str;
    }

    @Override // a.nk
    public final String a() {
        return this.b;
    }

    @Override // a.nk
    public final int b() {
        return R.drawable.ic_action_market_changes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ek) && Intrinsics.d(this.b, ((ek) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(R.drawable.ic_action_market_changes) * 31);
    }

    public final String toString() {
        return defpackage.c.b(R.drawable.ic_action_market_changes, "MarketChangesUiModel(imageId=", ", actionName=", this.b, Separators.RPAREN);
    }
}
