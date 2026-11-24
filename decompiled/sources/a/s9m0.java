package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1;
import org.xplatform.support.api.navigation.SupportMenuScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class s9m0 implements jfn0, gk50 {
    public static uaq0 d(int i) {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = (uaq0) uaq0.n.get(i);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Object obj = uaq0.b;
        if (g0g0Var instanceof g0g0) {
            g0g0Var = obj;
        }
        return (uaq0) g0g0Var;
    }

    public static wuo0 e(Integer num) {
        if (num == null) {
            return wuo0.b;
        }
        if (num.intValue() == 1) {
            return wuo0.c;
        }
        if (num.intValue() == 2) {
            return wuo0.d;
        }
        if (num.intValue() == 4) {
            return wuo0.e;
        }
        if (num.intValue() == 9) {
            return wuo0.g;
        }
        if (num.intValue() == 10) {
            return wuo0.h;
        }
        return num.intValue() == 7 ? wuo0.f : wuo0.i;
    }

    public static FragmentScreen$Companion$invoke$1 f(SupportMenuScreenParams supportMenuScreenParams) {
        return new FragmentScreen$Companion$invoke$1(null, new b0l0(supportMenuScreenParams, (byte) 10), true);
    }

    public static aoo0 g(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != -1391221606) {
            if (iHashCode != -502670543) {
                if (iHashCode == 538304054 && str.equals("colorSelectionText")) {
                    return aoo0.d;
                }
            } else if (str.equals("colorSelectionIcons")) {
                return aoo0.b;
            }
        } else if (str.equals("bubbleSelectionIcons")) {
            return aoo0.c;
        }
        return aoo0.b;
    }

    public static ngs0 h(int i) {
        if (i == 1) {
            return ngs0.UPWARD;
        }
        if (i == 2) {
            return ngs0.DOWNWARD;
        }
        if (i != 3) {
            return i != 4 ? ngs0.UNKNOWN : ngs0.PROVISIONAL;
        }
        return ngs0.CLOSED;
    }

    public static boolean i(uaq0 uaq0Var) {
        uaq0Var.getClass();
        return uaq0Var == uaq0.c || uaq0Var == uaq0.l || uaq0Var == uaq0.j || uaq0Var == uaq0.f || uaq0Var == uaq0.h;
    }

    public static boolean j(uaq0 uaq0Var) {
        uaq0Var.getClass();
        return uaq0Var == uaq0.b || uaq0Var == uaq0.g || uaq0Var == uaq0.k || uaq0Var == uaq0.i || uaq0Var == uaq0.e;
    }

    public static boolean k(uaq0 uaq0Var) {
        uaq0Var.getClass();
        return uaq0Var == uaq0.d;
    }

    public static boolean l(uaq0 uaq0Var) {
        uaq0Var.getClass();
        return !j(uaq0Var);
    }

    public static void m(androidx.fragment.app.e eVar) {
        jvp0 jvp0Var = jvp0.f17215a;
        eVar.getClass();
        ox70.n2.getClass();
        ox70 ox70Var = new ox70();
        ox70Var.m2.u(ox70Var, ox70.o2[0], jvp0Var);
        ox70Var.H0(eVar, "OpenTelegramBotBottomSheet");
    }

    @Override // a.jfn0
    public int a(androidx.media3.common.b bVar) {
        return 1;
    }

    @Override // a.jfn0
    public lfn0 b(androidx.media3.common.b bVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // a.jfn0
    public boolean c(androidx.media3.common.b bVar) {
        return false;
    }
}
