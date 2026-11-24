package a;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zdg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sje f44213a;
    public Executor b;
    public tdg0 c;
    public lox d;
    public final cu e = new cu(new b0c0(0, this, zdg0.class, "onClosed", "onClosed()V", 0, 21));
    public final ThreadLocal f = new ThreadLocal();
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();
    public boolean i = true;

    public List a(LinkedHashMap linkedHashMap) {
        return iun.f15405a;
    }

    public lox b() {
        throw new q660("This function should be implemented by Room's generated database implementation.");
    }

    public ke70 c() {
        throw new q660("This function should be implemented by Room's generated database implementation.");
    }

    public final lox d() {
        lox loxVar = this.d;
        if (loxVar != null) {
            return loxVar;
        }
        Intrinsics.h("internalTracker");
        throw null;
    }

    public Set e() {
        return xun.f41520a;
    }

    public Map f() {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        return lunVar;
    }

    public Map g() {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        return lunVar;
    }

    public final Object h(boolean z, Function2 function2, zje zjeVar) {
        u7x.H(this);
        tdg0 tdg0Var = this.c;
        if (tdg0Var != null) {
            return tdg0Var.n(z, function2, zjeVar);
        }
        Intrinsics.h("connectionManager");
        throw null;
    }
}
