package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class ap80 {
    public static final List b = q3d.j(l700.f19534a, l700.b, l700.c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzc f1240a;

    public ap80(uzc uzcVar) {
        uzcVar.getClass();
        this.f1240a = uzcVar;
    }

    public final Map a(long j, boolean z, boolean z2, long j2, boolean z3, String str) {
        Map mapB;
        Map mapB2;
        str.getClass();
        Map mapB3 = wp20.b(new Pair(ParameterNames.ID, Long.valueOf(j)));
        rxs0[] rxs0VarArr = rxs0.f31281a;
        l700 l700Var = l700.f19534a;
        xun.f41520a.getClass();
        if (!z2 || j2 <= 0) {
            mapB = lun.f20680a;
            mapB.getClass();
        } else {
            mapB = wp20.b(new Pair("userId", Long.valueOf(j2)));
        }
        Map mapB4 = lun.f20680a;
        mapB4.getClass();
        LinkedHashMap linkedHashMapJ = xp20.j(mapB, mapB4);
        uzc uzcVar = this.f1240a;
        if (uzcVar.b() != jvn.d) {
            mapB2 = wp20.b(new Pair("cfview", Integer.valueOf(uzcVar.b().getId())));
        } else {
            mapB4.getClass();
            mapB2 = mapB4;
        }
        LinkedHashMap linkedHashMapJ2 = xp20.j(linkedHashMapJ, mapB2);
        if (z3) {
            mapB4.getClass();
        } else {
            mapB4 = wp20.b(new Pair("lng", str));
        }
        return xp20.j(mapB3, xp20.j(xp20.j(xp20.j(xp20.j(linkedHashMapJ2, mapB4), wp20.b(new Pair("grMode", 2))), wp20.b(new Pair("groupEvents", Boolean.TRUE))), wp20.b(new Pair("gr", 1357))));
    }
}
