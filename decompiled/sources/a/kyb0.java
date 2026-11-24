package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class kyb0 extends veq {
    public static final ueq b = new ueq(meq.V_4, null, tul0.f34557a);
    public static final Set c = cui0.b("processor");
    public static final Set d = tx3.l0(new String[]{"bogomips", "cpu mhz"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v7f f19099a;

    public kyb0(v7f v7fVar) {
        v7fVar.getClass();
        List list = v7fVar.f36921a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String lowerCase = ((String) ((Pair) obj).f46059a).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (!c.contains(lowerCase)) {
                arrayList.add(obj);
            }
        }
        List<List> list2 = v7fVar.b;
        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
        for (List list3 : list2) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list3) {
                String lowerCase2 = ((String) ((Pair) obj2).f46059a).toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                if (!d.contains(lowerCase2)) {
                    arrayList3.add(obj2);
                }
            }
            arrayList2.add(arrayList3);
        }
        this.f19099a = new v7f(arrayList, arrayList2);
    }

    @Override // a.veq
    public final ueq a() {
        return b;
    }

    @Override // a.veq
    public final Object b() {
        return this.f19099a;
    }
}
