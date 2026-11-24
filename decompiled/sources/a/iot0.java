package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class iot0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f15131a;
    public final sev b;
    public final zii0 c;
    public final a8z d;

    public iot0(Function1 function1, sev sevVar, zii0 zii0Var, a8z a8zVar) {
        function1.getClass();
        this.f15131a = function1;
        this.b = sevVar;
        this.c = zii0Var;
        this.d = a8zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!iot0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        iot0 iot0Var = (iot0) obj;
        return this.c == iot0Var.c && this.b == iot0Var.b;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.c.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "UseCaseCameraConfig(cameraGraphFactory=" + this.f15131a + ", graphStateToCameraStateAdapter=" + this.b + ", sessionConfigAdapter=" + this.c + ", sessionProcessor=null, lazyCreationResult=" + this.d + ')';
    }
}
