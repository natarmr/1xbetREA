package a;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class tjo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34058a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final byte f;
    public final int g;

    /* JADX WARN: Multi-variable type inference failed */
    public tjo0(int i, int i2, String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.f34058a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.g = StringsKt.O(upperCase, "INT", false) ? 3 : (StringsKt.O(upperCase, "CHAR", false) || StringsKt.O(upperCase, "CLOB", false) || StringsKt.O(upperCase, "TEXT", false)) ? 2 : StringsKt.O(upperCase, "BLOB", false) ? 5 : (StringsKt.O(upperCase, "REAL", false) || StringsKt.O(upperCase, "FLOA", false) || StringsKt.O(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tjo0) {
                boolean z = this.d > 0;
                tjo0 tjo0Var = (tjo0) obj;
                byte b = tjo0Var.f;
                if (z == (tjo0Var.d > 0) && Intrinsics.d(this.f34058a, tjo0Var.f34058a) && this.c == tjo0Var.c) {
                    String str = tjo0Var.e;
                    byte b2 = this.f;
                    String str2 = this.e;
                    if ((b2 != 1 || b != 2 || str2 == null || u4n0.l(str2, str)) && ((b2 != 2 || b != 1 || str == null || u4n0.l(str, str2)) && ((b2 == 0 || b2 != b || (str2 == null ? str == null : u4n0.l(str2, str))) && this.g == tjo0Var.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f34058a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        StringBuilder sbN = b1j.n("\n                |Column {\n                |   name = '", this.f34058a, "',\n                |   type = '", this.b, "',\n                |   affinity = '");
        brm0.w(this.g, "',\n                |   notNull = '", "',\n                |   primaryKeyPosition = '", sbN, this.c);
        sbN.append(this.d);
        sbN.append("',\n                |   defaultValue = '");
        sbN.append(str);
        sbN.append("'\n                |}\n            ");
        return ntm0.b(ntm0.d(sbN.toString()));
    }
}
