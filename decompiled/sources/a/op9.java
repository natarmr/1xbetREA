package a;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class op9 implements qgy, Serializable, kry {
    public static final Object NO_RECEIVER = np9.f23900a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient qgy reflected;
    private final String signature;

    public op9(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // a.qgy
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // a.qgy
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public qgy compute() {
        qgy qgyVar = this.reflected;
        if (qgyVar != null) {
            return qgyVar;
        }
        qgy qgyVarComputeReflected = computeReflected();
        this.reflected = qgyVarComputeReflected;
        return qgyVarComputeReflected;
    }

    public abstract qgy computeReflected();

    @Override // a.kry
    public GenericDeclaration findJavaDeclaration() {
        return t9x.E(getOwner(), getSignature());
    }

    @Override // a.pgy
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // a.qgy
    public String getName() {
        return this.name;
    }

    public ghy getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? sre0.f32672a.c(cls) : sre0.f32672a.b(cls);
    }

    @Override // a.qgy
    public List<hre0> getParameters() {
        return getReflected().getParameters();
    }

    public qgy getReflected() {
        qgy qgyVarCompute = compute();
        if (qgyVarCompute != this) {
            return qgyVarCompute;
        }
        throw new tsy();
    }

    @Override // a.qgy
    public kiy getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // a.qgy, a.oiy
    public List<miy> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // a.qgy
    public viy getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // a.qgy
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // a.qgy
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // a.qgy
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public op9() {
        this(NO_RECEIVER, null, null, null, false);
    }
}
