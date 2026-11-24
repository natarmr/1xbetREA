package a;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ujo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35794a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final byte f;
    public final int g;

    /* JADX WARN: Multi-variable type inference failed */
    public ujo0(int i, int i2, String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.f35794a = str;
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
            if (obj instanceof ujo0) {
                boolean z = this.d > 0;
                ujo0 ujo0Var = (ujo0) obj;
                byte b = ujo0Var.f;
                if (z == (ujo0Var.d > 0) && Intrinsics.d(this.f35794a, ujo0Var.f35794a) && this.c == ujo0Var.c) {
                    String str = ujo0Var.e;
                    byte b2 = this.f;
                    String str2 = this.e;
                    if ((b2 != 1 || b != 2 || str2 == null || j5n0.z(str2, str)) && ((b2 != 2 || b != 1 || str == null || j5n0.z(str, str2)) && ((b2 == 0 || b2 != b || (str2 == null ? str == null : j5n0.z(str2, str))) && this.g == ujo0Var.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f35794a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.f35794a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return ntm0.b(ntm0.d(sb.toString()));
    }
}
