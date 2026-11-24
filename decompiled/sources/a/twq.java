package a;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class twq {
    public static final g950 e = g950.i("<root>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34663a;
    public transient swq b;
    public transient twq c;
    public transient g950 d;

    static {
        Pattern.compile("\\.").getClass();
    }

    public twq(swq swqVar, String str) {
        str.getClass();
        this.f34663a = str;
        this.b = swqVar;
    }

    public static final List f(twq twqVar) {
        if (twqVar.c()) {
            return new ArrayList();
        }
        List listF = f(twqVar.e());
        listF.add(twqVar.g());
        return listF;
    }

    public final twq a(g950 g950Var) {
        String strB;
        g950Var.getClass();
        if (c()) {
            strB = g950Var.b();
        } else {
            strB = this.f34663a + '.' + g950Var.b();
        }
        strB.getClass();
        return new twq(strB, this, g950Var);
    }

    public final void b() {
        String str = this.f34663a;
        int length = str.length() - 1;
        boolean z = false;
        while (true) {
            if (length >= 0) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' && !z) {
                    break;
                }
                if (cCharAt == '`') {
                    z = !z;
                }
                length--;
            } else {
                length = -1;
                break;
            }
        }
        if (length >= 0) {
            this.d = g950.d(str.substring(length + 1));
            this.c = new twq(str.substring(0, length));
        } else {
            this.d = g950.d(str);
            this.c = swq.c.f32934a;
        }
    }

    public final boolean c() {
        return this.f34663a.length() == 0;
    }

    public final boolean d() {
        return this.b != null || StringsKt.U('<', 0, 6, this.f34663a) < 0;
    }

    public final twq e() {
        twq twqVar = this.c;
        if (twqVar != null) {
            return twqVar;
        }
        if (c()) {
            jf4.n("root");
            return null;
        }
        b();
        twq twqVar2 = this.c;
        twqVar2.getClass();
        return twqVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof twq) {
            return Intrinsics.d(this.f34663a, ((twq) obj).f34663a);
        }
        return false;
    }

    public final g950 g() {
        g950 g950Var = this.d;
        if (g950Var != null) {
            return g950Var;
        }
        if (c()) {
            jf4.n("root");
            return null;
        }
        b();
        g950 g950Var2 = this.d;
        g950Var2.getClass();
        return g950Var2;
    }

    public final boolean h(g950 g950Var) {
        g950Var.getClass();
        if (!c()) {
            String str = this.f34663a;
            int iU = StringsKt.U('.', 0, 6, str);
            if (iU == -1) {
                iU = str.length();
            }
            int i = iU;
            String strB = g950Var.b();
            strB.getClass();
            if (i == strB.length() && kotlin.text.c.p(0, 0, i, this.f34663a, strB, false)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f34663a.hashCode();
    }

    public final swq i() {
        swq swqVar = this.b;
        if (swqVar != null) {
            return swqVar;
        }
        swq swqVar2 = new swq(this);
        this.b = swqVar2;
        return swqVar2;
    }

    public final String toString() {
        if (!c()) {
            return this.f34663a;
        }
        String strB = e.b();
        strB.getClass();
        return strB;
    }

    public twq(String str) {
        this.f34663a = str;
    }

    public twq(String str, twq twqVar, g950 g950Var) {
        this.f34663a = str;
        this.c = twqVar;
        this.d = g950Var;
    }
}
