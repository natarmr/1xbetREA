package a;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class oeg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f25121a = new LinkedHashMap();

    public final void a(ihg0 ihg0Var, i1w0 i1w0Var) {
        i1w0Var.getClass();
        LinkedHashMap linkedHashMap = this.f25121a;
        chg0 chg0Var = (chg0) linkedHashMap.get(ihg0Var);
        if (Intrinsics.d(chg0Var != null ? chg0Var.f4359a : null, i1w0Var)) {
            return;
        }
        Set setKeySet = linkedHashMap.keySet();
        setKeySet.getClass();
        linkedHashMap.put(ihg0Var, new chg0((ihg0) CollectionsKt.e0(setKeySet), i1w0Var));
    }

    public final i1w0 b() {
        i1w0 i1w0Var;
        chg0 chg0Var = (chg0) this.f25121a.get(fhg0.f9540a);
        return (chg0Var == null || (i1w0Var = chg0Var.f4359a) == null) ? p1w0.h : i1w0Var;
    }

    public final i1w0 c() {
        i1w0 i1w0Var;
        Collection collectionValues = this.f25121a.values();
        collectionValues.getClass();
        chg0 chg0Var = (chg0) CollectionsKt.e0(collectionValues);
        return (chg0Var == null || (i1w0Var = chg0Var.f4359a) == null) ? p1w0.h : i1w0Var;
    }
}
