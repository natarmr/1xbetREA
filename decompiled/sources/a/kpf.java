package a;

import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kpf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f18672a = tx3.l0(new Long[]{0L, -1L});

    public static final jpf a(jpf jpfVar, m9s m9sVar) {
        Boolean bool;
        boolean zBooleanValue;
        jpfVar.getClass();
        m9sVar.getClass();
        Long l = (Long) CollectionsKt.firstOrNull(m9sVar.c);
        Long l2 = (Long) CollectionsKt.firstOrNull(m9sVar.d);
        String str = m9sVar.k;
        String str2 = m9sVar.l;
        long j = jpfVar.j;
        String str3 = jpfVar.m;
        String str4 = jpfVar.l;
        long j2 = jpfVar.k;
        Long lValueOf = Long.valueOf(j);
        Set set = f18672a;
        Boolean bool2 = null;
        if (!set.contains(lValueOf) && l != null && j == l.longValue()) {
            bool = Boolean.FALSE;
        } else if (!set.contains(Long.valueOf(j)) && l2 != null && j == l2.longValue()) {
            bool = Boolean.TRUE;
        } else if (set.contains(Long.valueOf(j2)) || l == null || j2 != l.longValue()) {
            bool = (set.contains(Long.valueOf(j2)) || l2 == null || j2 != l2.longValue()) ? null : Boolean.FALSE;
        } else {
            bool = Boolean.TRUE;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (!StringsKt.W(str)) {
                if (!StringsKt.W(str4) && str4.equalsIgnoreCase(str)) {
                    bool2 = Boolean.FALSE;
                } else if (!StringsKt.W(str4) && str4.equalsIgnoreCase(str2)) {
                    bool2 = Boolean.TRUE;
                } else if (!StringsKt.W(str3) && str3.equalsIgnoreCase(str)) {
                    bool2 = Boolean.TRUE;
                } else if (!StringsKt.W(str3) && str3.equalsIgnoreCase(str2)) {
                    bool2 = Boolean.FALSE;
                }
            }
            zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (!zBooleanValue) {
            return jpfVar;
        }
        return new jpf(jpfVar.f16897a, jpfVar.c, jpfVar.b, jpfVar.e, jpfVar.d, jpfVar.g, jpfVar.f, jpfVar.i, jpfVar.h, jpfVar.k, jpfVar.j, str3, str4);
    }
}
