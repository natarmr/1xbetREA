package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jjo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f16627a;
    public static final ArrayList b;
    public static final ArrayList c;
    public static final List d;

    static {
        List listJ = q3d.j(md80.S_1_0, md80.S_2_0, md80.S_2_1, md80.S_3_0, md80.S_3_1, md80.S_3_2, md80.S_4_0, md80.S_4_1, md80.S_4_2, md80.S_4_3, md80.S_5_0, md80.S_5_1, md80.S_5_2, md80.S_5_3, md80.S_5_4);
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((md80) it.next()).f21584a));
        }
        f16627a = arrayList;
        List listJ2 = q3d.j(md80.S_0_1, md80.S_0_2, md80.S_1_2, md80.S_0_3, md80.S_1_3, md80.S_2_3, md80.S_0_4, md80.S_1_4, md80.S_2_4, md80.S_3_4, md80.S_0_5, md80.S_1_5, md80.S_2_5, md80.S_3_5, md80.S_4_5);
        ArrayList arrayList2 = new ArrayList(r3d.q(listJ2, 10));
        Iterator it2 = listJ2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((md80) it2.next()).f21584a));
        }
        b = arrayList2;
        List listJ3 = q3d.j(md80.S_0_0, md80.S_1_1, md80.S_2_2, md80.S_3_3, md80.S_4_4, md80.S_5_5, md80.LD);
        ArrayList arrayList3 = new ArrayList(r3d.q(listJ3, 10));
        Iterator it3 = listJ3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Integer.valueOf(((md80) it3.next()).f21584a));
        }
        c = arrayList3;
        d = q3d.j(ulr0.TOTO_BASKETBALL, ulr0.TOTO_CYBER_SPORT, ulr0.CRICKET);
    }

    public static final String a(int i, ctf0 ctf0Var) {
        Object next;
        c0o c0oVar = md80.v1;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((md80) next).f21584a != i);
        md80 md80Var = (md80) next;
        if (md80Var == null) {
            md80Var = md80.LD;
        }
        return ctf0Var.b.a(qxw.C(md80Var), Arrays.copyOf(new Object[0], 0));
    }

    public static final String b(String str) {
        if (StringsKt.W(str)) {
            str = null;
        }
        return str == null ? "-" : str;
    }
}
