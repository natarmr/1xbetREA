package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class c980 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3951a;
    public final String b;

    public c980(String str, String str2) {
        this.f3951a = str;
        this.b = str2;
    }

    public static c980 a(c980 c980Var, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str = c980Var.f3951a;
        }
        if ((i & 4) != 0) {
            str2 = c980Var.b;
        }
        str2.getClass();
        return new c980(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c980)) {
            return false;
        }
        c980 c980Var = (c980) obj;
        return this.f3951a.equals(c980Var.f3951a) && this.b.equals(c980Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ua80.b(Boolean.hashCode(true) * 31, 31, this.f3951a);
    }

    public final String toString() {
        return b1j.k("PhoneFieldStateModel(phoneCodeEnabled=true, phoneBody=", this.f3951a, ", phoneError=", this.b, Separators.RPAREN);
    }
}
