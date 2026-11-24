package a;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class jey extends ary {
    public static final /* synthetic */ iiy[] h = {new j0d0(jey.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0)};
    public gey f;
    public final cu00 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jey(eu00 eu00Var) {
        super(eu00Var);
        hey[] heyVarArr = hey.f12948a;
        this.g = new cu00(eu00Var, new nsr((Object) this, (Object) eu00Var, (byte) 17));
    }

    public final mey L() {
        return (mey) yqm0.s(this.g, h[0]);
    }

    @Override // a.ary
    public final fx d() {
        return L();
    }

    @Override // a.ary
    public final Iterable m() {
        Iterable iterableM = super.m();
        zm40 zm40VarL = l();
        zm40VarL.getClass();
        return CollectionsKt.p0(iterableM, new fey(this.d, zm40VarL));
    }

    @Override // a.ary
    public final qv90 q() {
        return L();
    }
}
