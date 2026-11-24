package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class pm90 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27220a;
    public final String b;
    public final String c;

    public pm90(String str, String str2, String str3) {
        this.f27220a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm90)) {
            return false;
        }
        pm90 pm90Var = (pm90) obj;
        return this.f27220a.equals(pm90Var.f27220a) && this.b.equals(pm90Var.b) && this.c.equals(pm90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f27220a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("ExtraDataContainer(filePath=", this.f27220a, ", photoIntentKey=", this.b, ", fileIntentKey="), this.c, Separators.RPAREN);
    }
}
