package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lm90 implements vuu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20288a;
    public final String b;

    public lm90(String str, String str2) {
        str.getClass();
        this.f20288a = str;
        this.b = str2;
    }

    @Override // a.vuu0
    public final nls0 a(j83 j83Var) {
        j83Var.getClass();
        String str = j83Var.b;
        String strB = b(str);
        j83 j83Var2 = new j83(strB);
        String str2 = this.f20288a;
        brm0.B(str2, str, strB);
        n660 n660Var = new n660();
        n660Var.f22981a = this.b;
        n660Var.b = str2;
        n660Var.c = str;
        n660Var.d = strB;
        return new nls0(j83Var2, n660Var);
    }

    public final String b(String str) {
        str.getClass();
        if (str.length() == 0) {
            return str;
        }
        String str2 = this.f20288a;
        ArrayList arrayList = new ArrayList(str2.length());
        String string = "";
        int i = 0;
        for (int i2 = 0; i2 < str2.length(); i2++) {
            char cCharAt = str2.charAt(i2);
            Character chI = ttm0.I(i, str);
            if (Intrinsics.d(String.valueOf(cCharAt), this.b)) {
                if (chI == null) {
                    break;
                }
                i++;
                cCharAt = chI.charValue();
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) string);
            sb.append(cCharAt);
            string = sb.toString();
            arrayList.add(Unit.f46060a);
        }
        return ((Object) string) + str.substring(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lm90) {
            return Intrinsics.d(this.f20288a, ((lm90) obj).f20288a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20288a.hashCode();
    }
}
