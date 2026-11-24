package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ij40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f14855a = xp20.f(new Pair(nj40.f23617a, tx3.l0(new String[]{"explane", "explaner"})), new Pair(nj40.b, tx3.l0(new String[]{"jungler", "jungle"})), new Pair(nj40.c, tx3.l0(new String[]{"midlane", "midlaner"})), new Pair(nj40.d, tx3.l0(new String[]{"goldlane", "goldlaner"})), new Pair(nj40.e, tx3.l0(new String[]{"roam", "roamer"})));

    public static final hj40 a(List list) {
        list.getClass();
        uj40 uj40Var = (uj40) CollectionsKt.W(0, list);
        uj40 uj40Var2 = (uj40) CollectionsKt.W(1, list);
        String str = uj40Var != null ? uj40Var.f35760a : null;
        if (str == null) {
            str = "";
        }
        String strE = lmc.E(uj40Var != null ? uj40Var.b : null);
        List listB = b(0, uj40Var != null ? uj40Var.c : null);
        String str2 = uj40Var2 != null ? uj40Var2.f35760a : null;
        return new hj40(str, strE, listB, str2 != null ? str2 : "", lmc.E(uj40Var2 != null ? uj40Var2.b : null), b(1, uj40Var2 != null ? uj40Var2.c : null));
    }

    public static final List b(int i, List list) {
        Object next;
        nj40 nj40Var;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    q3d.p();
                    throw null;
                }
                mj40 mj40Var = (mj40) obj;
                String str = mj40Var.f21877a;
                if (str == null) {
                    str = "";
                }
                String str2 = str + i2 + i;
                String str3 = mj40Var.f21877a;
                if (str3 == null) {
                    str3 = "";
                }
                String strE = lmc.E(mj40Var.b);
                String strE2 = lmc.E(mj40Var.d);
                String str4 = mj40Var.c;
                String str5 = str4 != null ? str4 : "";
                StringBuilder sb = new StringBuilder();
                int length = str5.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char cCharAt = str5.charAt(i4);
                    if (Character.isLetterOrDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String lowerCase = sb.toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                Iterator it = f14855a.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((Set) ((Map.Entry) next).getValue()).contains(lowerCase));
                Map.Entry entry = (Map.Entry) next;
                if (entry == null || (nj40Var = (nj40) entry.getKey()) == null) {
                    nj40Var = nj40.f;
                }
                rj40 rj40Var = mj40Var.e;
                arrayList2.add(new jj40(str2, str3, strE, strE2, nj40Var, rj40Var != null ? new oj40(rj40Var.f30574a, rj40Var.b, rj40Var.c) : new oj40(null, null, null)));
                i2 = i3;
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }
}
