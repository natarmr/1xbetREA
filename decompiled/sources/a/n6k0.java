package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class n6k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ony f23000a;

    public n6k0(ony onyVar) {
        onyVar.getClass();
        this.f23000a = onyVar;
    }

    public final void a(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(str, ncy.c(str2));
        ((rny) this.f23000a).a("SIP_EVENT", new tny("event", xp20.n(linkedHashMap)));
    }
}
