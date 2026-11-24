package a;

import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class vrm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u15 f37906a;
    public static final jo20 b;
    public static final jo20 c;

    static {
        Class cls = Long.TYPE;
        cls.getClass();
        f37906a = new u15("camera2.streamSpec.streamUseCase", cls, null);
        jo20 jo20Var = new jo20();
        int i = Build.VERSION.SDK_INT;
        hpt0 hpt0Var = hpt0.d;
        hpt0 hpt0Var2 = hpt0.f13459a;
        hpt0 hpt0Var3 = hpt0.b;
        if (i >= 33) {
            hpt0 hpt0Var4 = hpt0.f;
            hpt0 hpt0Var5 = hpt0.c;
            jo20Var.put(4L, tx3.l0(new hpt0[]{hpt0Var3, hpt0Var4, hpt0Var5}));
            jo20Var.put(1L, tx3.l0(new hpt0[]{hpt0Var3, hpt0Var4, hpt0Var5}));
            jo20Var.put(2L, cui0.b(hpt0Var2));
            jo20Var.put(3L, cui0.b(hpt0Var));
        }
        b = jo20Var.b();
        jo20 jo20Var2 = new jo20();
        if (i >= 33) {
            jo20Var2.put(4L, tx3.l0(new hpt0[]{hpt0Var3, hpt0Var2, hpt0Var}));
            jo20Var2.put(3L, tx3.l0(new hpt0[]{hpt0Var3, hpt0Var}));
        }
        c = jo20Var2.b();
    }

    public static hx9 a(drd drdVar, Long l) {
        u15 u15Var = f37906a;
        if (drdVar.f(u15Var) && Intrinsics.d(drdVar.d(u15Var), l)) {
            return null;
        }
        wy40 wy40VarP = wy40.p(drdVar);
        wy40VarP.y(u15Var, l);
        return new hx9(wy40VarP, (byte) 20);
    }

    public static boolean b(hpt0 hpt0Var, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (hpt0Var != hpt0.e) {
            Long lValueOf = Long.valueOf(j);
            jo20 jo20Var = b;
            if (!jo20Var.containsKey(lValueOf)) {
                return false;
            }
            Object obj = jo20Var.get(Long.valueOf(j));
            obj.getClass();
            return ((Set) obj).contains(hpt0Var);
        }
        Long lValueOf2 = Long.valueOf(j);
        jo20 jo20Var2 = c;
        if (!jo20Var2.containsKey(lValueOf2)) {
            return false;
        }
        Object obj2 = jo20Var2.get(Long.valueOf(j));
        obj2.getClass();
        Set set = (Set) obj2;
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((hpt0) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(drd drdVar, hpt0 hpt0Var) {
        Object objE = drdVar.e(fpt0.L0, Boolean.FALSE);
        objE.getClass();
        if (((Boolean) objE).booleanValue()) {
            return false;
        }
        u15 u15Var = nzw.b;
        if (!drdVar.f(u15Var)) {
            return false;
        }
        Object objD = drdVar.d(u15Var);
        objD.getClass();
        return hpt0Var.ordinal() == 0 && ((Number) objD).intValue() == 2;
    }
}
