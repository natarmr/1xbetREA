package a;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class vek implements g93 {
    public static final /* synthetic */ iiy[] b = {new j0d0(vek.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cu00 f37291a;

    public vek(eu00 eu00Var, Function0 function0) {
        eu00Var.getClass();
        this.f37291a = new cu00(eu00Var, function0);
    }

    @Override // a.g93
    public final /* bridge */ t83 O0(swq swqVar) {
        return jar0.R(this, swqVar);
    }

    @Override // a.g93
    public boolean isEmpty() {
        b[0].getClass();
        return ((List) this.f37291a.invoke()).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b[0].getClass();
        return ((List) this.f37291a.invoke()).iterator();
    }

    @Override // a.g93
    public final /* bridge */ boolean z0(swq swqVar) {
        return jar0.U(this, swqVar);
    }
}
