package a;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class qck extends ock implements ger, zer, gre0 {
    public static final /* synthetic */ iiy[] n = {new j0d0(qck.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0)};
    public final ihy h;
    public final String i;
    public final Object j;
    public final mre0 k;
    public final a8z l;
    public final a8z m;

    public qck(ihy ihyVar, String str, String str2, mer merVar, Object obj, rgy rgyVar) {
        super(rgyVar);
        this.h = ihyVar;
        this.i = str2;
        this.j = obj;
        this.k = bww.S(merVar, new lhf(this, str, (byte) 14));
        wez wezVar = wez.f39042a;
        this.l = maz.a(wezVar, new pck(this, (byte) 0));
        this.m = maz.a(wezVar, new pck(this, (byte) 1));
    }

    public final sv9 A(Constructor constructor, mer merVar, boolean z) {
        if (!z) {
            merVar.getClass();
            flc flcVar = merVar instanceof flc ? (flc) merVar : null;
            if (flcVar != null && !uek.e(flcVar.getVisibility())) {
                wm40 wm40VarZ1 = flcVar.z1();
                wm40VarZ1.getClass();
                if (!ddx.a(wm40VarZ1) && !oek.p(flcVar.z1())) {
                    List listZ = flcVar.z();
                    listZ.getClass();
                    if (!listZ.isEmpty()) {
                        Iterator it = listZ.iterator();
                        while (it.hasNext()) {
                            wsy type = ((k3u0) it.next()).getType();
                            type.getClass();
                            if (bdx.n0(type)) {
                                return fre0.W(this) ? new cv9(constructor, fre0.P(this), acb.V(constructor)) : new dv9(constructor, acb.V(constructor));
                            }
                        }
                    }
                }
            }
        }
        return fre0.W(this) ? new ev9(constructor, fre0.P(this)) : new fv9(constructor);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    public final jv9 B(Method method, boolean z) {
        Object objP;
        if (!fre0.W(this)) {
            return new rv9((byte) 2, 6, method, false);
        }
        c8z c8zVarC = z().C();
        if (c8zVarC != null) {
            wsy type = c8zVarC.getType();
            int i = ddx.f5919a;
            foc focVarN = type.S().n();
            if (focVarN != null ? ddx.a(focVarN) : false) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                Class cls = (Class) tx3.B(parameterTypes);
                if (cls == null || !cls.isInterface()) {
                    objP = fre0.P(this);
                } else {
                    objP = this.j;
                }
            } else {
                objP = fre0.P(this);
            }
        } else {
            objP = fre0.P(this);
        }
        return new qv9(method, z, objP);
    }

    @Override // a.ock
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final mer z() {
        iiy iiyVar = n[0];
        Object objInvoke = this.k.invoke();
        objInvoke.getClass();
        return (mer) objInvoke;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // a.dre0
    public final bv9 G() {
        return (bv9) this.m.getValue();
    }

    @Override // a.dre0
    public final dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        return new qck(ihyVar, z(), rgyVar);
    }

    @Override // a.dre0
    public final ihy K() {
        return this.h;
    }

    @Override // a.dre0
    public final Object L() {
        return this.j;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    public final boolean equals(Object obj) {
        gre0 gre0VarB = xtt0.b(obj);
        return gre0VarB != null && Intrinsics.d(this.h, gre0VarB.K()) && Intrinsics.d(getName(), gre0VarB.getName()) && Intrinsics.d(this.i, gre0VarB.getSignature()) && Intrinsics.d(this.j, gre0VarB.L());
    }

    @Override // a.cer
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, fet fetVar, Integer num) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, fetVar, num);
    }

    @Override // a.kry
    public final GenericDeclaration findJavaDeclaration() {
        return t9x.E(this.h, this.i);
    }

    @Override // a.ger
    public final int getArity() {
        bv9 bv9VarX = x();
        bv9VarX.getClass();
        return bv9VarX.a().size();
    }

    @Override // a.qgy
    public final String getName() {
        String strB = ((wjj) z()).getName().b();
        strB.getClass();
        return strB;
    }

    @Override // a.gre0
    public final String getSignature() {
        return this.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((getName().hashCode() + (this.h.hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // a.jhy
    public final boolean isExternal() {
        return this.f8277a.g || z().isExternal();
    }

    @Override // a.jhy
    public final boolean isInfix() {
        return this.f8277a.i || z().isInfix();
    }

    @Override // a.jhy
    public final boolean isInline() {
        return this.f8277a.j || z().isInline();
    }

    @Override // a.jhy
    public final boolean isOperator() {
        return this.f8277a.h || z().isOperator();
    }

    @Override // a.qgy
    public final boolean isSuspend() {
        return z().isSuspend();
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // a.ber
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, fet fetVar, Integer num) {
        return call(obj, obj2, obj3, obj4, obj5, fetVar, num);
    }

    public final String toString() {
        return rv00.x(this);
    }

    @Override // a.ock
    public final wdk u() {
        wsy returnType = z().getReturnType();
        returnType.getClass();
        return new wdk(returnType, new pck(this, (byte) 2), false);
    }

    @Override // a.dre0
    public final bv9 x() {
        return (bv9) this.l.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    public /* synthetic */ qck(ihy ihyVar, mer merVar) {
        this(ihyVar, merVar, rgy.k);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public qck(ihy ihyVar, mer merVar, rgy rgyVar) {
        ihyVar.getClass();
        merVar.getClass();
        rgyVar.getClass();
        String strB = ((wjj) merVar).getName().b();
        strB.getClass();
        this(ihyVar, strB, sog0.c(merVar).H(), merVar, op9.NO_RECEIVER, rgyVar);
    }
}
