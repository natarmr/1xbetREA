package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class tf70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33854a;
    public final int b;

    public tf70(boolean z, int i) {
        this.f33854a = z;
        this.b = i;
    }

    public static tf70 a(tf70 tf70Var, boolean z, int i) {
        if ((i & 1) != 0) {
            z = tf70Var.f33854a;
        }
        int i2 = (i & 2) != 0 ? tf70Var.b : R.string.increase_game_bet;
        tf70Var.getClass();
        return new tf70(z, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf70)) {
            return false;
        }
        tf70 tf70Var = (tf70) obj;
        return this.f33854a == tf70Var.f33854a && this.b == tf70Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.f33854a) * 31);
    }

    public final String toString() {
        return "ViewState(block=" + this.f33854a + ", textRes=" + this.b + Separators.RPAREN;
    }
}
