package a;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class r0x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29651a;
    public final lin0 b;

    public r0x0(Context context, lin0 lin0Var) {
        this.f29651a = context;
        this.b = lin0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0x0)) {
            return false;
        }
        r0x0 r0x0Var = (r0x0) obj;
        if (!this.f29651a.equals(r0x0Var.f29651a)) {
            return false;
        }
        lin0 lin0Var = r0x0Var.b;
        lin0 lin0Var2 = this.b;
        if (lin0Var2 == null) {
            return lin0Var == null;
        }
        return lin0Var2.equals(lin0Var);
    }

    public final int hashCode() {
        int iHashCode = this.f29651a.hashCode() ^ 1000003;
        lin0 lin0Var = this.b;
        return (lin0Var == null ? 0 : lin0Var.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.f29651a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        f140.v(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
