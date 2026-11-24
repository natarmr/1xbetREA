package a;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kxk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f19060a;
    public static final qlc b;

    static {
        List<swq> listJ = q3d.j(bey.f2475a, bey.h, bey.i, bey.c, bey.d, bey.f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (swq swqVar : listJ) {
            swqVar.getClass();
            linkedHashSet.add(new qlc(swqVar.b(), swqVar.f32934a.g()));
        }
        f19060a = linkedHashSet;
        swq swqVar2 = bey.g;
        swqVar2.getClass();
        b = new qlc(swqVar2.b(), swqVar2.f32934a.g());
    }
}
