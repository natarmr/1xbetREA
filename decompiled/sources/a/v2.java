package a;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v2 implements tzj, nkq, mzj0, yxs0, kiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mre0 f36658a;

    public v2(Function0 function0) {
        mre0 mre0VarS = null;
        mre0 mre0Var = function0 instanceof mre0 ? (mre0) function0 : null;
        if (mre0Var != null) {
            mre0VarS = mre0Var;
        } else if (function0 != null) {
            mre0VarS = bww.S(null, function0);
        }
        this.f36658a = mre0VarS;
    }

    public v2 A(boolean z) {
        if (!z) {
            return this;
        }
        ohq.u(this, "Definitely not null captured type is not supported yet: ");
        return null;
    }

    public abstract v2 B(boolean z);

    public v2 C() {
        return null;
    }

    public kiy c() {
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof v2) && y9a.S(jtv.u, this, (aty) obj);
    }

    public abstract a8z f();

    @Override // a.pgy
    public final List getAnnotations() {
        return (List) f().getValue();
    }

    public int hashCode() {
        fhy fhyVarO = o();
        int iHashCode = fhyVarO != null ? fhyVarO.hashCode() : 0;
        return Boolean.hashCode(h()) + ((M().hashCode() + (iHashCode * 31)) * 31);
    }

    public sgy j() {
        return null;
    }

    public boolean n() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q() {
        return false;
    }

    public String toString() {
        return rv00.z(this, false);
    }

    public boolean u() {
        return false;
    }

    public v2 z() {
        return null;
    }
}
