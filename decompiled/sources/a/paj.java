package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public class paj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26657a;
    public final int b;

    public paj(int i, int i2) {
        this.f26657a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof paj)) {
            return false;
        }
        paj pajVar = (paj) obj;
        return this.f26657a == pajVar.f26657a && this.b == pajVar.b;
    }

    public final int hashCode() {
        return this.b ^ this.f26657a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26657a);
        sb.append(Separators.LPAREN);
        return brm0.n(sb, this.b, ')');
    }
}
