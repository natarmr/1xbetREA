package a;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class bft0 implements a8z, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f2520a;
    public Object b;

    @Override // a.a8z
    public final Object getValue() {
        Object obj = this.b;
        if (obj != m2t0.f21082a) {
            return obj;
        }
        Function0 function0 = this.f2520a;
        function0.getClass();
        Object objInvoke = function0.invoke();
        this.b = objInvoke;
        this.f2520a = null;
        return objInvoke;
    }

    public final String toString() {
        return this.b != m2t0.f21082a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
