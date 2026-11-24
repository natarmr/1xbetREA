package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class s9z implements pg80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f7u f31869a;
    public final zt00 b;

    public s9z(v7i v7iVar) {
        this.f31869a = new f7u(v7iVar, jdk0.f, new obx(null));
        this.b = new zt00((eu00) v7iVar.i, new ConcurrentHashMap(3, 1.0f, 2), new pnk0((byte) 19), (byte) 0);
    }

    @Override // a.pg80
    public final void a(swq swqVar, ArrayList arrayList) {
        swqVar.getClass();
        arrayList.add(c(swqVar));
    }

    @Override // a.pg80
    public final boolean b(swq swqVar) {
        swqVar.getClass();
        return false;
    }

    public final r9z c(swq swqVar) throws Throwable {
        swqVar.getClass();
        Object objInvoke = this.b.invoke(new au00(swqVar, new nsr((Object) this, (Object) new wqe0(swqVar), (byte) 22)));
        if (objInvoke != null) {
            return (r9z) objInvoke;
        }
        zt00.a(3);
        throw null;
    }

    @Override // a.pg80
    public final Collection n(swq swqVar, Function1 function1) {
        swqVar.getClass();
        List list = (List) c(swqVar).l.invoke();
        return list == null ? iun.f15405a : list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((zm40) ((v7i) this.f31869a.b).j);
    }
}
