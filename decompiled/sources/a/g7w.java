package a;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g7w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f10836a = q3d.j("defaultlogo.png", "teamdefault.png");

    public static final uzm a(a2w a2wVar, boolean z) {
        a2wVar.getClass();
        return new uzm(a2wVar.f144a, z ? d(a2wVar) : null);
    }

    public static final vzm b(a2w a2wVar, String str) {
        a2wVar.getClass();
        str.getClass();
        return new vzm(a2wVar.f144a, str);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    public static final d280 c(a2w a2wVar) {
        String str;
        a2wVar.getClass();
        v1w v1wVar = a2wVar.e;
        List list = a2wVar.b;
        int iOrdinal = v1wVar.ordinal();
        if (iOrdinal == 0) {
            return new b280(R.drawable.ic_home);
        }
        if (iOrdinal == 1) {
            return new b280(R.drawable.ic_away);
        }
        if (iOrdinal != 2) {
            t9f.b();
            return null;
        }
        String str2 = "";
        List list2 = f10836a;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = (String) CollectionsKt.f0(list);
                    if (str != null) {
                        str2 = str;
                    }
                } else if (list.contains((String) it.next())) {
                }
            }
        } else {
            str = (String) CollectionsKt.f0(list);
            if (str != null) {
                str2 = str;
            }
        }
        Long l = (Long) CollectionsKt.W(1, a2wVar.c);
        return new c280(vsm0.s(l != null ? l.longValue() : 0L, str2), R.drawable.ic_glyph_placeholder_player);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    public static final d280 d(a2w a2wVar) {
        String str;
        a2wVar.getClass();
        v1w v1wVar = a2wVar.e;
        List list = a2wVar.b;
        int iOrdinal = v1wVar.ordinal();
        if (iOrdinal == 0) {
            return new b280(R.drawable.ic_home);
        }
        if (iOrdinal == 1) {
            return new b280(R.drawable.ic_away);
        }
        if (iOrdinal != 2) {
            t9f.b();
            return null;
        }
        String str2 = "";
        List list2 = f10836a;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = (String) CollectionsKt.firstOrNull(list);
                    if (str != null) {
                        str2 = str;
                    }
                } else if (list.contains((String) it.next())) {
                }
            }
        } else {
            str = (String) CollectionsKt.firstOrNull(list);
            if (str != null) {
                str2 = str;
            }
        }
        Long l = (Long) CollectionsKt.firstOrNull(a2wVar.c);
        return new c280(vsm0.s(l != null ? l.longValue() : 0L, str2), R.drawable.ic_glyph_placeholder_player);
    }

    public static final w1n e(a2w a2wVar, boolean z) {
        a2wVar.getClass();
        return new w1n(a2wVar.f144a, z ? d(a2wVar) : null, z ? c(a2wVar) : null);
    }
}
