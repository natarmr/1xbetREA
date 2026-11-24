package a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l9z extends jlc {
    public final f7u g;
    public final mqe0 h;
    public final wm40 i;
    public final f7u j;
    public final n0o0 k;
    public final slc l;
    public final gm40 m;
    public final xj n;
    public final boolean o;
    public final efk p;
    public final p9z q;
    public final c3h0 r;
    public final pdx s;
    public final eaz t;
    public final j9z u;
    public final cu00 v;

    static {
        tx3.l0(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9z(f7u f7uVar, vjj vjjVar, mqe0 mqe0Var, wm40 wm40Var) throws IllegalAccessException, InvocationTargetException {
        gm40 gm40Var;
        super((eu00) ((v7i) f7uVar.b).i, vjjVar, mqe0Var.e(), m2a.v(mqe0Var));
        f7uVar.getClass();
        vjjVar.getClass();
        mqe0Var.getClass();
        this.g = f7uVar;
        this.h = mqe0Var;
        this.i = wm40Var;
        f7u f7uVarG = f7k.G(f7uVar, this, mqe0Var, 4);
        this.j = f7uVarG;
        eu00 eu00Var = (eu00) ((v7i) f7uVarG.b).i;
        this.k = maz.b(new k9z(this, (byte) 0));
        Class cls = mqe0Var.f22221a;
        this.l = cls.isAnnotation() ? slc.e : cls.isInterface() ? slc.b : cls.isEnum() ? slc.c : slc.f32392a;
        byte b = 1;
        if (cls.isAnnotation() || cls.isEnum()) {
            gm40Var = gm40.b;
        } else {
            evz evzVar = gm40.f11524a;
            Boolean boolE = zdx.E(cls);
            boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
            Boolean boolE2 = zdx.E(cls);
            boolean z = (boolE2 != null ? boolE2.booleanValue() : false) || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
            evzVar.getClass();
            gm40Var = zBooleanValue ? gm40.c : z ? gm40.e : !zIsFinal ? gm40.d : gm40.b;
        }
        this.m = gm40Var;
        int modifiers = cls.getModifiers();
        this.n = Modifier.isPublic(modifiers) ? huu0.d : Modifier.isPrivate(modifiers) ? euu0.d : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? oay.d : nay.d : may.d;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.o = ((declaringClass != null ? new mqe0(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.p = new efk(this);
        p9z p9zVar = new p9z(f7uVarG, this, mqe0Var, wm40Var != null, null);
        this.q = p9zVar;
        zie0 zie0Var = c3h0.d;
        w0 w0Var = new w0((Object) this, (byte) 29);
        zie0Var.getClass();
        this.r = new c3h0(this, eu00Var, w0Var);
        this.s = new pdx(p9zVar);
        this.t = new eaz(f7uVarG, mqe0Var, this);
        this.u = r8x.W(f7uVarG, mqe0Var);
        this.v = new cu00(eu00Var, new k9z(this, b));
    }

    @Override // a.sq30
    public final boolean L() {
        return false;
    }

    @Override // a.wm40, a.goc
    public final List M() {
        return (List) this.v.invoke();
    }

    @Override // a.sq30
    public final boolean Q() {
        return false;
    }

    @Override // a.wm40
    public final cr30 U() {
        return this.t;
    }

    @Override // a.wm40
    public final Collection g() {
        return (List) this.q.q.invoke();
    }

    @Override // a.e83
    public final g93 getAnnotations() {
        return this.u;
    }

    @Override // a.wm40, a.sq30
    public final tek getVisibility() {
        tek tekVar = uek.f35533a;
        xj xjVar = this.n;
        if (Intrinsics.d(xjVar, tekVar)) {
            Class<?> declaringClass = this.h.f22221a.getDeclaringClass();
            if ((declaringClass != null ? new mqe0(declaringClass) : null) == null) {
                tek tekVar2 = w8y.f38749a;
                tekVar2.getClass();
                return tekVar2;
            }
        }
        return u4n0.u(xjVar);
    }

    @Override // a.foc
    public final iys0 h() {
        return this.p;
    }

    @Override // a.goc
    public final boolean i() {
        return this.o;
    }

    @Override // a.wm40
    public final boolean isInline() {
        return false;
    }

    @Override // a.h1, a.wm40
    public final cr30 j0() {
        return this.s;
    }

    @Override // a.wm40
    public final cr30 k0() {
        return (p9z) super.k0();
    }

    @Override // a.wm40
    public final cr30 l0(cty ctyVar) {
        c3h0 c3h0Var = this.r;
        h1 h1Var = c3h0Var.f3674a;
        int i = rek.f30339a;
        oek.c(h1Var).getClass();
        return (p9z) ((cr30) yqm0.s(c3h0Var.c, c3h0.e[0]));
    }

    @Override // a.wm40, a.sq30
    public final gm40 m() {
        return this.m;
    }

    @Override // a.wm40
    public final flc m0() {
        return null;
    }

    @Override // a.wm40
    public final k2u0 n0() {
        return null;
    }

    @Override // a.wm40
    public final boolean o0() {
        return false;
    }

    @Override // a.wm40
    public final boolean p0() {
        return false;
    }

    @Override // a.wm40
    public final boolean q0() {
        return false;
    }

    @Override // a.wm40
    public final slc r() {
        return this.l;
    }

    @Override // a.wm40
    public final boolean r0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Lazy Java class ");
        int i = rek.f30339a;
        twq twqVarF = oek.f(this);
        twqVarF.getClass();
        sb.append(twqVarF);
        return sb.toString();
    }

    public final p9z u0() {
        return (p9z) super.k0();
    }
}
