package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class cha implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4350a;
    public final boolean b;

    public cha(int i, boolean z) {
        this.f4350a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cha)) {
            return false;
        }
        cha chaVar = (cha) obj;
        return this.f4350a == chaVar.f4350a && this.b == chaVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f4350a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f4350a, "CardFootballAttackCardUiModel(cardPicture=", ", cardStatusWin=", Separators.RPAREN, this.b);
    }
}
