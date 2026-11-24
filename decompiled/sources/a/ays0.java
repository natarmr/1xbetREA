package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ays0 implements Iterable, khy {
    public static final fck0 b = new fck0((byte) 11);
    public static final ays0 c = new ays0(iun.f15405a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fx3 f1685a;

    public ays0(List list) {
        this.f1685a = utn.f36264a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j93 j93Var = (j93) it.next();
            j93Var.getClass();
            String strV = sre0.f32672a.b(j93.class).v();
            strV.getClass();
            int iD = b.d(strV);
            int iB = this.f1685a.b();
            if (iB != 0) {
                if (iB == 1) {
                    fx3 fx3Var = this.f1685a;
                    try {
                        fx3Var.getClass();
                        ll60 ll60Var = (ll60) fx3Var;
                        int i = ll60Var.b;
                        if (i == iD) {
                            this.f1685a = new ll60(iD, j93Var);
                        } else {
                            ix3 ix3Var = new ix3();
                            ix3Var.f15521a = new Object[20];
                            ix3Var.b = 0;
                            ix3Var.c(i, ll60Var.f20232a);
                            this.f1685a = ix3Var;
                        }
                    } catch (ClassCastException e) {
                        hny.q(b(fx3Var, 1, "OneElementArrayMap"), e);
                        throw null;
                    }
                }
                this.f1685a.c(iD, j93Var);
            } else {
                fx3 fx3Var2 = this.f1685a;
                if (!(fx3Var2 instanceof utn)) {
                    jf4.n(b(fx3Var2, 0, "EmptyArrayMap"));
                    throw null;
                }
                this.f1685a = new ll60(iD, j93Var);
            }
        }
    }

    public static String b(fx3 fx3Var, int i, String str) {
        StringBuilder sb = new StringBuilder("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(fx3Var.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) b.b;
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(r3d.q(fx3Var, 10));
        int i2 = 0;
        for (Object obj : fx3Var) {
            int i3 = i2 + 1;
            Object obj2 = null;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            for (Object obj3 : concurrentHashMap.entrySet()) {
                if (((Number) ((Map.Entry) obj3).getValue()).intValue() == i2) {
                    obj2 = obj3;
                    break;
                }
            }
            sb3.append("  " + ((Map.Entry) obj2) + '[' + i2 + "]: " + obj);
            sb3.append('\n');
            arrayList.add(sb3);
            i2 = i3;
        }
        sb3.append("]");
        sb3.append('\n');
        sb.append("Content: ".concat(sb3.toString()));
        sb.append('\n');
        return sb.toString();
    }

    public final boolean isEmpty() {
        return this.f1685a.b() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f1685a.iterator();
    }
}
