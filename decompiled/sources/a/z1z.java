package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z1z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f43646a = tx3.l0(new Long[]{0L, -1L});

    public static final ljg a(ljg ljgVar, m9s m9sVar) {
        Boolean bool;
        boolean zBooleanValue;
        m9sVar.getClass();
        Long l = (Long) CollectionsKt.firstOrNull(m9sVar.c);
        Long l2 = (Long) CollectionsKt.firstOrNull(m9sVar.d);
        String str = m9sVar.k;
        String str2 = m9sVar.l;
        f2h f2hVar = ljgVar.b;
        v1h v1hVar = ljgVar.d;
        f2h f2hVar2 = ljgVar.c;
        long j = f2hVar.b;
        Long lValueOf = Long.valueOf(j);
        Set set = f43646a;
        Boolean bool2 = null;
        if (!set.contains(lValueOf) && l != null && j == l.longValue()) {
            bool = Boolean.FALSE;
        } else if (set.contains(Long.valueOf(j)) || l2 == null || j != l2.longValue()) {
            long j2 = f2hVar2.b;
            bool = (set.contains(Long.valueOf(j2)) || l == null || j2 != l.longValue()) ? (set.contains(Long.valueOf(j2)) || l2 == null || j2 != l2.longValue()) ? null : Boolean.FALSE : Boolean.TRUE;
        } else {
            bool = Boolean.TRUE;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (!StringsKt.W(str)) {
                String str3 = f2hVar.c;
                if (!StringsKt.W(str3) && kotlin.text.c.o(str3, str)) {
                    bool2 = Boolean.FALSE;
                } else if (StringsKt.W(str3) || !str3.equalsIgnoreCase(str2)) {
                    String str4 = f2hVar2.c;
                    if (!StringsKt.W(str4) && str4.equalsIgnoreCase(str)) {
                        bool2 = Boolean.TRUE;
                    } else if (!StringsKt.W(str4) && str4.equalsIgnoreCase(str2)) {
                        bool2 = Boolean.FALSE;
                    }
                } else {
                    bool2 = Boolean.TRUE;
                }
            }
            zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (!zBooleanValue) {
            return ljgVar;
        }
        List<q1h> list = v1hVar.d;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (q1h q1hVar : list) {
            arrayList.add(new q1h(q1hVar.f27952a, q1hVar.c, q1hVar.b, q1hVar.e, q1hVar.d, q1hVar.f, q1hVar.g, q1hVar.h));
        }
        return new ljg(q3d.j(f2hVar2, f2hVar), f2hVar2, f2hVar, new v1h(v1hVar.b, v1hVar.f36629a, v1hVar.c, arrayList, v1hVar.e, v1hVar.f, v1hVar.g, v1hVar.h), ljgVar.e, ljgVar.f, ljgVar.g, ljgVar.h, ljgVar.i);
    }
}
