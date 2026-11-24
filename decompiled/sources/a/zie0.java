package a;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.xplatform.results.impl.presentation.dialogs.results.params.SelectDateScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class zie0 {
    public zie0(eu00 eu00Var, iun iunVar) {
        iunVar.getClass();
        String str = eu00.d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static g9i0 a(int i) {
        g9i0 g9i0Var = g9i0.DAY;
        if (i != 1) {
            g9i0 g9i0Var2 = g9i0.WEEK;
            if (i == 7) {
                return g9i0Var2;
            }
            g9i0 g9i0Var3 = g9i0.MONTH;
            if (i == 30) {
                return g9i0Var3;
            }
            g9i0 g9i0Var4 = g9i0.THREE_MONTH;
            if (i == 90) {
                return g9i0Var4;
            }
        }
        return g9i0Var;
    }

    public static obk0 b(String str) {
        Object next;
        str.getClass();
        c0o c0oVar = obk0.h;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (y2VarH.hasNext()) {
            next = y2VarH.next();
            if (((obk0) next).f24985a.equals(str)) {
                return (obk0) next;
            }
        }
        next = null;
        return (obk0) next;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
    public static boolean c(List list) {
        list.getClass();
        for (Object obj : list) {
            if (((obk0) obj) == obk0.FLASH_CALL) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
    public static boolean d(List list) {
        list.getClass();
        for (Object obj : list) {
            if (((obk0) obj) == obk0.SMS) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
    public static boolean e(List list) {
        list.getClass();
        for (Object obj : list) {
            if (((obk0) obj) == obk0.TELEGRAM) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
    public static boolean f(List list) {
        list.getClass();
        for (Object obj : list) {
            if (((obk0) obj) == obk0.VOICE_SMS) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    public static void g(androidx.fragment.app.e eVar, SelectDateScreenParams selectDateScreenParams) {
        eVar.getClass();
        String strK = kng0.k("SelectDateTimeBottomSheetDialog", selectDateScreenParams.b);
        if (eVar.J(strK) == null) {
            x1i0 x1i0Var = new x1i0();
            x1i0Var.k2.J(x1i0Var, x1i0.o2[0], selectDateScreenParams);
            x1i0Var.H0(eVar, strK);
        }
    }
}
