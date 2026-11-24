package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n2a {
    public static final n2a b;
    public static final n2a c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f22788a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new akz(0));
        b = new n2a(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new akz(1));
        c = new n2a(linkedHashSet2);
    }

    public n2a(LinkedHashSet linkedHashSet) {
        this.f22788a = linkedHashSet;
    }

    public final List a(ArrayList arrayList) {
        List arrayList2 = new ArrayList(arrayList);
        Iterator it = this.f22788a.iterator();
        while (it.hasNext()) {
            arrayList2 = ((gz9) it.next()).a(Collections.unmodifiableList(arrayList2));
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Integer num = null;
        for (gz9 gz9Var : this.f22788a) {
            if (gz9Var instanceof akz) {
                Integer numValueOf = Integer.valueOf(((akz) gz9Var).b);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    jf4.n("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final s0a c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((s0a) it.next()).a());
        }
        List listA = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            s0a s0aVar = (s0a) it2.next();
            if (listA.contains(s0aVar.a())) {
                linkedHashSet2.add(s0aVar);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (s0a) it3.next();
        }
        StringBuilder sb = new StringBuilder("Cams:");
        sb.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            n0a n0aVarH = ((s0a) it4.next()).h();
            sb.append(" Id:" + n0aVarH.e() + "  Lens:" + n0aVarH.h());
        }
        String string = sb.toString();
        LinkedHashSet<gz9> linkedHashSet3 = this.f22788a;
        StringBuilder sb2 = new StringBuilder(twn.m(linkedHashSet3.size(), "PhyId:null  Filters:"));
        for (gz9 gz9Var : linkedHashSet3) {
            sb2.append(" Id:");
            gz9Var.getClass();
            sb2.append(gz9.f12170a);
            if (gz9Var instanceof akz) {
                sb2.append(" LensFilter:");
                sb2.append(((akz) gz9Var).b);
            }
        }
        jf4.o(ua80.i("No available camera can be found. ", string, Separators.SP, sb2.toString()));
        return null;
    }
}
