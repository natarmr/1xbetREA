package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public interface te50 extends ve50 {
    @Override // a.ve50
    default wul0 a() {
        wul0 wul0Var = (wul0) CollectionsKt.f0(c());
        return wul0Var == null ? getRoot() : wul0Var;
    }

    @Override // a.ve50
    default List b() {
        return CollectionsKt.q0(kotlin.collections.a.c(getRoot()), c());
    }

    List c();

    wul0 getRoot();
}
