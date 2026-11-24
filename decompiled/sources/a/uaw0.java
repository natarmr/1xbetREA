package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class uaw0 implements ea3 {
    public static final uaw0 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35353a;
    public final String b;

    static {
        fck0 fck0Var = new fck0((byte) 21, false);
        fck0Var.b = Boolean.FALSE;
        c = new uaw0(fck0Var);
    }

    public uaw0(fck0 fck0Var) {
        this.f35353a = ((Boolean) fck0Var.b).booleanValue();
        this.b = (String) fck0Var.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uaw0)) {
            return false;
        }
        uaw0 uaw0Var = (uaw0) obj;
        return l8x.Z(null, null) && this.f35353a == uaw0Var.f35353a && l8x.Z(this.b, uaw0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f35353a), this.b});
    }
}
