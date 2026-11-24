package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qer extends op9 implements ger, jhy {
    private final int arity;

    public qer(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // a.op9
    public qgy computeReflected() {
        return sre0.f32672a.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qer) {
            qer qerVar = (qer) obj;
            return getName().equals(qerVar.getName()) && getSignature().equals(qerVar.getSignature()) && Intrinsics.d(getBoundReceiver(), qerVar.getBoundReceiver()) && Intrinsics.d(getOwner(), qerVar.getOwner());
        }
        if (obj instanceof jhy) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // a.ger
    public int getArity() {
        return this.arity;
    }

    @Override // a.op9
    public jhy getReflected() {
        return (jhy) super.getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // a.jhy
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // a.jhy
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // a.jhy
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // a.jhy
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // a.qgy
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        qgy qgyVarCompute = compute();
        if (qgyVarCompute != this) {
            return qgyVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
