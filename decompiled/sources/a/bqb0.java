package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class bqb0 implements dqb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3020a;
    public final int b;
    public final int c;

    public bqb0(String str, int i, int i2) {
        this.f3020a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqb0)) {
            return false;
        }
        bqb0 bqb0Var = (bqb0) obj;
        return this.f3020a.equals(bqb0Var.f3020a) && this.b == bqb0Var.b && this.c == bqb0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_power_of_power_player_placeholder) + twn.a(this.c, twn.a(this.b, this.f3020a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return w6x.o(this.c, R.drawable.ic_power_of_power_player_placeholder, ", placeholderRes=", Separators.RPAREN, kng0.p(this.b, "Image(image=", this.f3020a, ", paddingRes=", ", borderColorRes="));
    }
}
