package androidx.fragment.app;

import a.h6r;
import a.kng0;
import a.s1r;
import a.zb5;
import android.gov.nist.core.Separators;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements s1r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45378a;
    public final /* synthetic */ e b;

    public d(e eVar, String str) {
        this.b = eVar;
        this.f45378a = str;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    @Override // a.s1r
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) throws Throwable {
        Throwable th;
        int i;
        int i2;
        e eVar = this.b;
        String str = this.f45378a;
        int iG = eVar.G(str, -1, true);
        if (iG < 0) {
            return false;
        }
        int i3 = iG;
        while (true) {
            Throwable th2 = null;
            if (i3 >= eVar.d.size()) {
                HashSet hashSet = new HashSet();
                int i4 = iG;
                while (i4 < eVar.d.size()) {
                    zb5 zb5Var = (zb5) eVar.d.get(i4);
                    HashSet hashSet2 = new HashSet();
                    HashSet hashSet3 = new HashSet();
                    for (h6r h6rVar : zb5Var.f44098a) {
                        Fragment fragment = h6rVar.b;
                        if (fragment != null) {
                            if (!h6rVar.c || (i2 = h6rVar.f12542a) == 1 || i2 == 2) {
                                th = th2;
                            } else {
                                th = th2;
                                if (i2 == 8) {
                                }
                                i = h6rVar.f12542a;
                                if (i != 1 || i == 2) {
                                    hashSet3.add(fragment);
                                }
                                th2 = th;
                            }
                            hashSet.add(fragment);
                            hashSet2.add(fragment);
                            i = h6rVar.f12542a;
                            if (i != 1) {
                                hashSet3.add(fragment);
                            } else {
                                hashSet3.add(fragment);
                            }
                            th2 = th;
                        }
                    }
                    Throwable th3 = th2;
                    hashSet2.removeAll(hashSet3);
                    if (!hashSet2.isEmpty()) {
                        StringBuilder sbT = kng0.t("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                        sbT.append(hashSet2.size() == 1 ? Separators.SP + hashSet2.iterator().next() : "s " + hashSet2);
                        sbT.append(" in ");
                        sbT.append(zb5Var);
                        sbT.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                        eVar.A0(new IllegalArgumentException(sbT.toString()));
                        throw th3;
                    }
                    i4++;
                    th2 = th3;
                }
                Throwable th4 = th2;
                ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                while (!arrayDeque.isEmpty()) {
                    Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
                    if (fragment2.f1) {
                        StringBuilder sbT2 = kng0.t("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                        sbT2.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                        sbT2.append("fragment ");
                        sbT2.append(fragment2);
                        eVar.A0(new IllegalArgumentException(sbT2.toString()));
                        throw th4;
                    }
                    for (Fragment fragment3 : fragment2.x.c.o()) {
                        if (fragment3 != null) {
                            arrayDeque.addLast(fragment3);
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((Fragment) it.next()).f);
                }
                ArrayList arrayList4 = new ArrayList(eVar.d.size() - iG);
                for (int i5 = iG; i5 < eVar.d.size(); i5++) {
                    arrayList4.add(th4);
                }
                BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
                for (int size = eVar.d.size() - 1; size >= iG; size--) {
                    zb5 zb5Var2 = (zb5) eVar.d.remove(size);
                    zb5 zb5Var3 = new zb5(zb5Var2);
                    zb5Var3.e();
                    arrayList4.set(size - iG, new BackStackRecordState(zb5Var3));
                    zb5Var2.u = true;
                    arrayList.add(zb5Var2);
                    arrayList2.add(Boolean.TRUE);
                }
                eVar.l.put(str, backStackState);
                return true;
            }
            zb5 zb5Var4 = (zb5) eVar.d.get(i3);
            if (!zb5Var4.p) {
                eVar.A0(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + zb5Var4 + " that did not use setReorderingAllowed(true)."));
                throw null;
            }
            i3++;
        }
    }
}
