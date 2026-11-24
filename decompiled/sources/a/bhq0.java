package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class bhq0 implements chq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f2621a;
    public final String b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public bhq0(String str, int i, boolean z) {
        str.getClass();
        this.f2621a = i;
        this.b = str;
        this.c = z;
    }

    @Override // a.chq0
    public final boolean a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhq0)) {
            return false;
        }
        bhq0 bhq0Var = (bhq0) obj;
        return this.f2621a == bhq0Var.f2621a && Intrinsics.d(this.b, bhq0Var.b) && this.c == bhq0Var.c;
    }

    @Override // a.chq0
    public final int getId() {
        return this.f2621a;
    }

    @Override // a.chq0
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_glyph_chevron_down_small) + brm0.e(ua80.b(Integer.hashCode(this.f2621a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f2621a, "TimeFilterPeriodChipUiModel(id=", ", title=", this.b, ", selected=");
        sbR.append(this.c);
        sbR.append(", actionIcon=");
        sbR.append(R.drawable.ic_glyph_chevron_down_small);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
