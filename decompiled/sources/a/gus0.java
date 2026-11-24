package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gus0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f11946a = q3d.j("static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Field/GameTable.png", "static/img/ImgDefault/Esports/Virtual/TwentyOne/Dota2/Field/TimerTable.png");

    public static final i4 a(List list) {
        List listD0 = CollectionsKt.D0(list, 10);
        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
        Iterator it = listD0.iterator();
        while (it.hasNext()) {
            arrayList.add(new una0(z1x.F((tna0) it.next())));
        }
        return dyb.r0(arrayList);
    }
}
