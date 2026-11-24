package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class d9y implements uto {
    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.uto
    public final int a(kp9 kp9Var, kp9 kp9Var2, wm40 wm40Var) {
        boolean z;
        mer merVar;
        kp9Var.getClass();
        kp9Var2.getClass();
        if ((kp9Var instanceof mp9) && (kp9Var2 instanceof mer) && !ary.A(kp9Var2)) {
            int i = kd9.l;
            mer merVar2 = (mer) kp9Var2;
            wjj wjjVar = (wjj) merVar2;
            g950 name = wjjVar.getName();
            name.getClass();
            if (jxk0.e.contains(name)) {
                mp9 mp9VarT = x0x.T((mp9) kp9Var);
                z = kp9Var instanceof mer;
                if (z) {
                    merVar = (mer) kp9Var;
                } else {
                    merVar = null;
                }
                if (merVar == null) {
                    if (wm40Var instanceof l9z) {
                        if (tfx.x(kp9Var, kp9Var2)) {
                            return 3;
                        }
                    } else if (tfx.x(kp9Var, kp9Var2)) {
                        return 3;
                    }
                } else if (wm40Var instanceof l9z) {
                    if (tfx.x(kp9Var, kp9Var2)) {
                        return 3;
                    }
                } else if (tfx.x(kp9Var, kp9Var2)) {
                    return 3;
                }
            } else {
                ArrayList arrayList = jxk0.f17310a;
                g950 name2 = wjjVar.getName();
                name2.getClass();
                if (jxk0.j.contains(name2)) {
                    mp9 mp9VarT2 = x0x.T((mp9) kp9Var);
                    z = kp9Var instanceof mer;
                    if (z) {
                        merVar = (mer) kp9Var;
                    } else {
                        merVar = null;
                    }
                    if ((merVar == null && merVar2.b0() == merVar.b0()) || (mp9VarT2 != null && merVar2.b0())) {
                        if ((wm40Var instanceof l9z) || merVar2.T() != null || mp9VarT2 == null || x0x.W(wm40Var, mp9VarT2)) {
                            if (tfx.x(kp9Var, kp9Var2)) {
                                return 3;
                            }
                        } else if ((mp9VarT2 instanceof mer) && z && kd9.a((mer) mp9VarT2) != null) {
                            String strW = m7x.w(merVar2, 2);
                            mer merVarO1 = ((mer) kp9Var).o1();
                            merVarO1.getClass();
                            if (strW.equals(m7x.w(merVarO1, 2))) {
                                if (tfx.x(kp9Var, kp9Var2)) {
                                    return 3;
                                }
                            }
                        }
                    }
                } else if (tfx.x(kp9Var, kp9Var2)) {
                    return 3;
                }
            }
        } else if (tfx.x(kp9Var, kp9Var2)) {
            return 3;
        }
        return 2;
    }

    @Override // a.uto
    public final int b() {
        return 1;
    }
}
