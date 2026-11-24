package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class g950 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10896a;
    public final boolean b;

    public g950(String str, boolean z) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.f10896a = str;
        this.b = z;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static g950 d(String str) {
        if (str != null) {
            return str.startsWith(Separators.LESS_THAN) ? i(str) : e(str);
        }
        a(9);
        throw null;
    }

    public static g950 e(String str) {
        if (str != null) {
            return new g950(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean f(String str) {
        if (str == null) {
            a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith(Separators.LESS_THAN)) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == ';' || cCharAt == '[' || cCharAt == '/') {
                return false;
            }
        }
        return true;
    }

    public static g950 i(String str) {
        if (str == null) {
            a(8);
            throw null;
        }
        if (str.startsWith(Separators.LESS_THAN)) {
            return new g950(str, true);
        }
        jf4.o("special name must start with '<': ".concat(str));
        return null;
    }

    public final String b() {
        String str = this.f10896a;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public final String c() {
        if (this.b) {
            e9d0.v(this, "not identifier: ");
            return null;
        }
        String strB = b();
        if (strB != null) {
            return strB;
        }
        a(2);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f10896a.compareTo(((g950) obj).f10896a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g950)) {
            return false;
        }
        g950 g950Var = (g950) obj;
        return this.b == g950Var.b && this.f10896a.equals(g950Var.f10896a);
    }

    public final int hashCode() {
        return (this.f10896a.hashCode() * 31) + (this.b ? 1 : 0);
    }

    public final String toString() {
        return this.f10896a;
    }
}
