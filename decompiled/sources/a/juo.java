package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class juo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f17165a;

    public juo(luo luoVar) {
        this.f17165a = xp20.p(luoVar.f20682a);
    }

    public final void a(kuo kuoVar, Object obj) {
        LinkedHashMap linkedHashMap = this.f17165a;
        if (obj != null) {
            linkedHashMap.put(kuoVar, obj);
        } else {
            linkedHashMap.remove(kuoVar);
        }
    }

    public juo() {
        this.f17165a = new LinkedHashMap();
    }
}
