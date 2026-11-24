package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class hkt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbt f13224a;

    public hkt0(pbt pbtVar) {
        pbtVar.getClass();
        this.f13224a = pbtVar;
    }

    public final void a(vpv0 vpv0Var) {
        pbt pbtVar = this.f13224a;
        Long l = (Long) CollectionsKt.f0(pbtVar.f26724a.m);
        if (l != null) {
            List listC = kotlin.collections.a.c(new no60(l.longValue(), vpv0Var));
            pbtVar.getClass();
            listC.getClass();
            pbtVar.c.f(listC);
        }
    }
}
