package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wvv implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39858a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;

    public /* synthetic */ wvv(List list, List list2, byte b) {
        this.f39858a = b;
        this.b = list;
        this.c = list2;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[LOOP:5: B:79:0x010e->B:108:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:78:0x010a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0114  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Iterator it;
        q010 q010Var;
        byte b = this.f39858a;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        List<r010> list = this.c;
        List<r010> list2 = this.b;
        switch (b) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                x510 x510Var = x510.STATISTIC;
                if (jLongValue == 1) {
                    if (!list2.isEmpty() && !list.isEmpty()) {
                        if (!list2.isEmpty()) {
                            for (r010 r010Var : list2) {
                                q010 q010Var2 = r010Var.j;
                                if (q010Var2.b == -1 || q010Var2.f27872a == -1 || q010Var2.c == -1 || q010Var2.d == -1 || r010Var.b == -1) {
                                }
                            }
                            if (list.isEmpty()) {
                                z = true;
                            } else {
                                for (r010 r010Var2 : list) {
                                    q010Var = r010Var2.j;
                                    if (q010Var.b != -1) {
                                    }
                                }
                                z = true;
                            }
                        } else if (list.isEmpty()) {
                            z = true;
                        } else {
                            while (r8.hasNext()) {
                                q010Var = r010Var2.j;
                                if (q010Var.b != -1 || q010Var.f27872a == -1 || q010Var.c == -1 || q010Var.d == -1 || r010Var2.b == -1) {
                                }
                            }
                            z = true;
                        }
                    }
                } else if (jLongValue == 2 && !list2.isEmpty() && !list.isEmpty()) {
                    if (!list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((r010) it2.next()).i.isEmpty()) {
                            }
                        }
                        if (list.isEmpty()) {
                            z = true;
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (((r010) it.next()).i.isEmpty()) {
                                }
                            }
                            z = true;
                        }
                    } else if (list.isEmpty()) {
                        z = true;
                    } else {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (((r010) it.next()).i.isEmpty()) {
                            }
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                ou90 ou90Var = (ou90) obj;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        Pair pair = (Pair) list2.get(i);
                        ou90.j(ou90Var, (pu90) pair.f46059a, ((ikx) pair.b).f14950a);
                    }
                }
                if (list != null) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Pair pair2 = (Pair) list.get(i2);
                        pu90 pu90Var = (pu90) pair2.f46059a;
                        Function0 function0 = (Function0) pair2.b;
                        ou90.j(ou90Var, pu90Var, function0 != null ? ((ikx) function0.invoke()).f14950a : 0L);
                    }
                }
                return Unit.f46060a;
        }
    }
}
