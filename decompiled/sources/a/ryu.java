package a;

import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ryu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final owp0 f31330a;

    public /* synthetic */ ryu(owp0 owp0Var) {
        this.f31330a = owp0Var;
    }

    public a5w a(String str) {
        str.getClass();
        fme fmeVar = (fme) this.f31330a.b;
        fmeVar.getClass();
        return (a5w) fmeVar.c.get(str);
    }

    public void b(a5w a5wVar) {
        a5wVar.getClass();
        fme fmeVar = (fme) this.f31330a.b;
        fmeVar.getClass();
        LinkedHashMap linkedHashMap = fmeVar.c;
        if (linkedHashMap.size() >= 3) {
            linkedHashMap.remove((String) CollectionsKt.T(linkedHashMap.keySet()));
        }
        linkedHashMap.put(a5wVar.d(), a5wVar);
    }
}
