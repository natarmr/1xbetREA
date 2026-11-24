package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fk extends nk {
    public final String b;

    public fk(String str) {
        str.getClass();
        this.b = str;
    }

    @Override // a.nk
    public final String a() {
        return this.b;
    }

    @Override // a.nk
    public final int b() {
        return R.drawable.ic_glyph_brush;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fk) && Intrinsics.d(this.b, ((fk) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(R.drawable.ic_glyph_brush) * 31);
    }

    public final String toString() {
        return defpackage.c.b(R.drawable.ic_glyph_brush, "MarketDisplaySettingsUiModel(imageId=", ", actionName=", this.b, Separators.RPAREN);
    }
}
