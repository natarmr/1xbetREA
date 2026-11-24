package a;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jbz implements vj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gbz f16252a;
    public final c5n0 b;
    public final hbz c;
    public final ey40 d;

    public jbz(gbz gbzVar, c5n0 c5n0Var) {
        this.f16252a = gbzVar;
        this.b = c5n0Var;
        this.c = (hbz) gbzVar.b.invoke();
        hkx.a();
        this.d = new ey40();
    }

    @Override // a.w6k
    public final long B(float f) {
        return this.b.B(f);
    }

    @Override // a.w6k
    public final int B0(long j) {
        return this.b.B0(j);
    }

    @Override // a.vj30
    public final uj30 D0(int i, int i2, Map map, Function1 function1, Function1 function2) {
        return this.b.D0(i, i2, map, function1, function2);
    }

    @Override // a.w6k
    public final long G0(long j) {
        return this.b.G0(j);
    }

    @Override // a.cnx
    public final boolean M() {
        return this.b.M();
    }

    @Override // a.w6k
    public final int T(float f) {
        return this.b.T(f);
    }

    @Override // a.w6k
    public final float X(long j) {
        return this.b.X(j);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final List a(int i) {
        ey40 ey40Var = this.d;
        List list = (List) ey40Var.b(i);
        if (list != null) {
            return list;
        }
        hbz hbzVar = this.c;
        Object objD = hbzVar.d(i);
        List listK = this.b.k(objD, this.f16252a.a(i, objD, hbzVar.a(i)));
        ey40Var.j(i, listK);
        return listK;
    }

    @Override // a.w6k
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override // a.cnx
    public final k6z getLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    @Override // a.vj30
    public final uj30 i0(int i, int i2, Map map, Function1 function1) {
        return this.b.i0(i, i2, map, function1);
    }

    @Override // a.w6k
    public final long o(float f) {
        return this.b.o(f);
    }

    @Override // a.w6k
    public final long p(long j) {
        return this.b.p(j);
    }

    @Override // a.w6k
    public final float r0(int i) {
        return this.b.r0(i);
    }

    @Override // a.w6k
    public final float s(long j) {
        return this.b.s(j);
    }

    @Override // a.w6k
    public final float s0(float f) {
        return this.b.s0(f);
    }

    @Override // a.w6k
    public final float v0() {
        return this.b.v0();
    }

    @Override // a.w6k
    public final float w0(float f) {
        return this.b.w0(f);
    }

    @Override // a.w6k
    public final long z(int i) {
        return this.b.z(i);
    }
}
