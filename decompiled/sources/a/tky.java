package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tky {
    public static final tky c = new tky("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34119a;
    public uky b;

    public tky(tky tkyVar) {
        this.f34119a = new ArrayList(tkyVar.f34119a);
        this.b = tkyVar.b;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[RETURN] */
    public final boolean a(int i, String str) {
        List list = this.f34119a;
        if (i < list.size()) {
            boolean z = i == list.size() - 1;
            String str2 = (String) list.get(i);
            if (!str2.equals("**")) {
                boolean z2 = str2.equals(str) || str2.equals(Separators.STAR);
                if ((z || (i == list.size() - 2 && ((String) list.get(list.size() - 1)).equals("**"))) && z2) {
                    return true;
                }
            } else {
                if (z || !((String) list.get(i + 1)).equals(str)) {
                    if (!z) {
                        int i2 = i + 1;
                        if (i2 >= list.size() - 1) {
                            return ((String) list.get(i2)).equals(str);
                        }
                    }
                    return true;
                }
                if (i == list.size() - 2 || (i == list.size() - 3 && ((String) list.get(list.size() - 1)).equals("**"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f34119a;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() - 1 && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f34119a;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals(Separators.STAR);
    }

    public final boolean d(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f34119a;
        return i < list.size() - 1 || ((String) list.get(i)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tky.class == obj.getClass()) {
            tky tkyVar = (tky) obj;
            if (!this.f34119a.equals(tkyVar.f34119a)) {
                return false;
            }
            uky ukyVar = this.b;
            uky ukyVar2 = tkyVar.b;
            if (ukyVar != null) {
                return ukyVar.equals(ukyVar2);
            }
            if (ukyVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f34119a.hashCode() * 31;
        uky ukyVar = this.b;
        return iHashCode + (ukyVar != null ? ukyVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f34119a);
        sb.append(",resolved=");
        return brm0.o(sb, this.b != null, '}');
    }

    public tky(String... strArr) {
        this.f34119a = Arrays.asList(strArr);
    }
}
