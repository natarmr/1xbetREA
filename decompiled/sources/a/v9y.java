package a;

import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v9y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final swq f37057a;
    public static final swq[] b;
    public static final nw20 c;
    public static final w9y d;

    static {
        swq swqVar = new swq("org.jspecify.nullness");
        swq swqVar2 = new swq("org.jspecify.annotations");
        f37057a = swqVar2;
        swq swqVar3 = new swq("io.reactivex.rxjava3.annotations");
        swq swqVar4 = new swq("org.checkerframework.checker.nullness.compatqual");
        String str = swqVar3.f32934a.f34663a;
        b = new swq[]{new swq(ohs0.n(str, ".Nullable")), new swq(ohs0.n(str, ".NonNull"))};
        swq swqVar5 = new swq("org.jetbrains.annotations");
        w9y w9yVar = w9y.d;
        Pair pair = new Pair(swqVar5, w9yVar);
        Pair pair2 = new Pair(new swq("kotlin.annotations.jvm"), w9yVar);
        Pair pair3 = new Pair(new swq("androidx.annotation"), w9yVar);
        Pair pair4 = new Pair(new swq("android.support.annotation"), w9yVar);
        Pair pair5 = new Pair(new swq("android.annotation"), w9yVar);
        Pair pair6 = new Pair(new swq("com.android.annotations"), w9yVar);
        Pair pair7 = new Pair(new swq("org.eclipse.jdt.annotation"), w9yVar);
        Pair pair8 = new Pair(new swq("org.checkerframework.checker.nullness.qual"), w9yVar);
        Pair pair9 = new Pair(swqVar4, w9yVar);
        Pair pair10 = new Pair(new swq("javax.annotation"), w9yVar);
        Pair pair11 = new Pair(new swq("edu.umd.cs.findbugs.annotations"), w9yVar);
        Pair pair12 = new Pair(new swq("io.reactivex.annotations"), w9yVar);
        swq swqVar6 = new swq("androidx.annotation.RecentlyNullable");
        zlf0 zlf0Var = zlf0.WARN;
        Pair pair13 = new Pair(swqVar6, new w9y(zlf0Var, 4));
        Pair pair14 = new Pair(new swq("androidx.annotation.RecentlyNonNull"), new w9y(zlf0Var, 4));
        Pair pair15 = new Pair(new swq("lombok"), w9yVar);
        fty ftyVar = new fty(2, 1, 0);
        zlf0 zlf0Var2 = zlf0.STRICT;
        c = new nw20(xp20.f(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, new Pair(swqVar, new w9y(zlf0Var, ftyVar, zlf0Var2)), new Pair(swqVar2, new w9y(zlf0Var, new fty(2, 1, 0), zlf0Var2)), new Pair(swqVar3, new w9y(zlf0Var, new fty(1, 8, 0), zlf0Var2)), new Pair(new swq("jakarta.annotation"), new w9y(zlf0Var, new fty(2, 4, 0), zlf0Var2)), new Pair(bey.l, new w9y(zlf0Var, new fty(2, 5, 0), zlf0Var2)), new Pair(bey.m, new w9y(zlf0Var, new fty(2, 5, 0), zlf0Var2)), new Pair(new swq("io.vertx.codegen.annotations"), new w9y(zlf0Var, new fty(2, 5, 0), zlf0Var2))));
        d = new w9y(zlf0Var, 4);
    }
}
