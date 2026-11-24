package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m0d0 extends op9 implements iiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20949a;

    public m0d0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f20949a = false;
    }

    @Override // a.op9
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final iiy getReflected() {
        if (!this.f20949a) {
            return (iiy) super.getReflected();
        }
        v4i0.p("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    @Override // a.op9
    public final qgy compute() {
        return this.f20949a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m0d0) {
            m0d0 m0d0Var = (m0d0) obj;
            return getOwner().equals(m0d0Var.getOwner()) && getName().equals(m0d0Var.getName()) && getSignature().equals(m0d0Var.getSignature()) && Intrinsics.d(getBoundReceiver(), m0d0Var.getBoundReceiver());
        }
        if (obj instanceof iiy) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        qgy qgyVarCompute = compute();
        if (qgyVarCompute != this) {
            return qgyVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public m0d0() {
        this.f20949a = false;
    }
}
