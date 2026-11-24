package a;

import android.gov.nist.core.Separators;
import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28133a;
    public final byte[] b;
    public final mwb0 c;

    public q55(String str, byte[] bArr, mwb0 mwb0Var) {
        this.f28133a = str;
        this.b = bArr;
        this.c = mwb0Var;
    }

    public static cu a() {
        cu cuVar = new cu((byte) 5, false);
        cuVar.d = mwb0.f22496a;
        return cuVar;
    }

    public final q55 b(mwb0 mwb0Var) {
        cu cuVarA = a();
        cuVarA.p(this.f28133a);
        if (mwb0Var == null) {
            hny.u("Null priority");
            return null;
        }
        cuVarA.d = mwb0Var;
        cuVarA.c = this.b;
        return cuVarA.c();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q55) {
            q55 q55Var = (q55) obj;
            if (this.f28133a.equals(q55Var.f28133a) && Arrays.equals(this.b, q55Var.b) && this.c.equals(q55Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.f28133a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f28133a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return axq.n(sb, strEncodeToString, Separators.RPAREN);
    }
}
