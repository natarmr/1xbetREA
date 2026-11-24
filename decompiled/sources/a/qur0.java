package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class qur0 extends w8b {
    public final String d;
    public final ctf0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qur0(ctf0 ctf0Var, String str) {
        super(new h9b(str), Integer.valueOf(ctf0Var.d(R.dimen.size_144)), Integer.valueOf(ctf0Var.d(R.dimen.size_16)), 6);
        str.getClass();
        ctf0Var.getClass();
        this.d = str;
        this.e = ctf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qur0)) {
            return false;
        }
        qur0 qur0Var = (qur0) obj;
        return Intrinsics.d(this.d, qur0Var.d) && Intrinsics.d(this.e, qur0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "TotoTableCellUiModel(value=" + this.d + ", resourceManager=" + this.e + Separators.RPAREN;
    }
}
