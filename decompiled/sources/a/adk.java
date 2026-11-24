package a;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class adk extends hre0 {
    public static final /* synthetic */ iiy[] e = {new j0d0(adk.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0), new j0d0(adk.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ock f683a;
    public final int b;
    public final aiy c;
    public final mre0 d;

    public adk(ock ockVar, int i, aiy aiyVar, Function0 function0) {
        this.f683a = ockVar;
        this.b = i;
        this.c = aiyVar;
        this.d = bww.S(null, function0);
        bww.S(null, new zck(this, (byte) 0));
    }

    @Override // a.hre0
    public final dre0 c() {
        return this.f683a;
    }

    @Override // a.hre0
    public final boolean f() {
        go80 go80VarZ = z();
        k3u0 k3u0Var = go80VarZ instanceof k3u0 ? (k3u0) go80VarZ : null;
        return k3u0Var != null && k3u0Var.q1();
    }

    @Override // a.pgy
    public final List getAnnotations() {
        throw null;
    }

    @Override // a.hre0
    public final String getName() {
        go80 go80VarZ = z();
        k3u0 k3u0Var = go80VarZ instanceof k3u0 ? (k3u0) go80VarZ : null;
        if (k3u0Var != null && !k3u0Var.j().P()) {
            g950 name = k3u0Var.getName();
            name.getClass();
            if (!name.b) {
                return name.b();
            }
        }
        return null;
    }

    @Override // a.hre0
    public final int j() {
        return this.b;
    }

    @Override // a.hre0
    public final aiy n() {
        return this.c;
    }

    @Override // a.hre0
    public final kiy p() {
        wsy type = z().getType();
        type.getClass();
        wdk wdkVar = new wdk(type, new zck(this, (byte) 1), false);
        return this.c == aiy.f949a ? wdkVar : fre0.c0(this.f683a, wdkVar);
    }

    @Override // a.hre0
    public final boolean q() {
        go80 go80VarZ = z();
        k3u0 k3u0Var = go80VarZ instanceof k3u0 ? (k3u0) go80VarZ : null;
        if (k3u0Var != null) {
            return rek.a(k3u0Var);
        }
        return false;
    }

    @Override // a.hre0
    public final boolean u() {
        go80 go80VarZ = z();
        return (go80VarZ instanceof k3u0) && ((k3u0) go80VarZ).k != null;
    }

    public final go80 z() {
        iiy iiyVar = e[0];
        Object objInvoke = this.d.invoke();
        objInvoke.getClass();
        return (go80) objInvoke;
    }
}
