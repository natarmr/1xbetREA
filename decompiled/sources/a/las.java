package a;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class las {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f19719a = new ConcurrentHashMap();

    public final das a(String str) {
        das dasVar = (das) this.f19719a.get(str);
        return dasVar == null ? new das() : dasVar;
    }
}
