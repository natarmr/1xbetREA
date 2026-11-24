package a;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class n0o0 implements a8z, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f22709a;
    public volatile Object b;
    public final Object c;

    public n0o0(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i & 2) != 0 ? null : obj;
        function0.getClass();
        this.f22709a = function0;
        this.b = m2t0.f21082a;
        this.c = obj == null ? this : obj;
    }

    public final boolean a() {
        return this.b != m2t0.f21082a;
    }

    @Override // a.a8z
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.b;
        m2t0 m2t0Var = m2t0.f21082a;
        if (obj != m2t0Var) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == m2t0Var) {
                Function0 function0 = this.f22709a;
                function0.getClass();
                objInvoke = function0.invoke();
                this.b = objInvoke;
                this.f22709a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
