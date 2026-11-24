package a;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final swq f4235a;
    public static final swq b;
    public static final swq c;
    public static final swq d;
    public static final swq e;
    public static final swq f;
    public static final swq g;
    public static final swq h;
    public static final swq i;
    public static final Set j;
    public static final Set k;
    public static final Set l;
    public static final Set m;
    public static final Set n;
    public static final Set o;
    public static final Map p;
    public static final swq q;

    static {
        swq swqVar = new swq("org.jspecify.nullness.Nullable");
        swq swqVar2 = new swq("org.jspecify.nullness.NullMarked");
        f4235a = swqVar2;
        swq swqVar3 = new swq("org.jspecify.nullness.NullnessUnspecified");
        swq swqVar4 = new swq("org.jspecify.annotations.NonNull");
        swq swqVar5 = new swq("org.jspecify.annotations.Nullable");
        swq swqVar6 = new swq("org.jspecify.annotations.NullMarked");
        b = swqVar6;
        swq swqVar7 = new swq("org.jspecify.annotations.NullnessUnspecified");
        swq swqVar8 = new swq("org.jspecify.annotations.NullUnmarked");
        c = swqVar8;
        d = new swq("javax.annotation.meta.TypeQualifier");
        e = new swq("javax.annotation.meta.TypeQualifierNickname");
        f = new swq("javax.annotation.meta.TypeQualifierDefault");
        swq swqVar9 = new swq("javax.annotation.Nonnull");
        g = swqVar9;
        swq swqVar10 = new swq("javax.annotation.Nullable");
        swq swqVar11 = new swq("javax.annotation.CheckForNull");
        h = new swq("javax.annotation.ParametersAreNonnullByDefault");
        i = new swq("javax.annotation.ParametersAreNullableByDefault");
        j = tx3.l0(new swq[]{swqVar9, swqVar11});
        Set setL0 = tx3.l0(new swq[]{bey.h, swqVar4, new swq("android.annotation.NonNull"), new swq("androidx.annotation.NonNull"), new swq("androidx.annotation.RecentlyNonNull"), new swq("android.support.annotation.NonNull"), new swq("com.android.annotations.NonNull"), new swq("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new swq("org.checkerframework.checker.nullness.qual.NonNull"), new swq("edu.umd.cs.findbugs.annotations.NonNull"), new swq("io.reactivex.annotations.NonNull"), new swq("io.reactivex.rxjava3.annotations.NonNull"), new swq("org.eclipse.jdt.annotation.NonNull"), new swq("lombok.NonNull"), new swq("jakarta.annotation.Nonnull")});
        k = setL0;
        Set setL1 = tx3.l0(new swq[]{bey.i, swqVar, swqVar5, swqVar10, swqVar11, new swq("android.annotation.Nullable"), new swq("androidx.annotation.Nullable"), new swq("androidx.annotation.RecentlyNullable"), new swq("android.support.annotation.Nullable"), new swq("com.android.annotations.Nullable"), new swq("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new swq("org.checkerframework.checker.nullness.qual.Nullable"), new swq("edu.umd.cs.findbugs.annotations.Nullable"), new swq("edu.umd.cs.findbugs.annotations.PossiblyNull"), new swq("edu.umd.cs.findbugs.annotations.CheckForNull"), new swq("io.reactivex.annotations.Nullable"), new swq("io.reactivex.rxjava3.annotations.Nullable"), new swq("org.eclipse.jdt.annotation.Nullable"), new swq("jakarta.annotation.Nullable"), new swq("io.vertx.codegen.annotations.Nullable")});
        l = setL1;
        m = tx3.l0(new swq[]{swqVar3, swqVar7});
        eui0.h(eui0.h(eui0.h(eui0.h(eui0.g(eui0.g(new LinkedHashSet(), setL0), setL1), swqVar9), swqVar2), swqVar6), swqVar8);
        n = tx3.l0(new swq[]{bey.k, bey.n, bey.l, bey.m});
        o = tx3.l0(new swq[]{bey.j, bey.o});
        p = xp20.f(new Pair(bey.c, i4m0.t), new Pair(bey.d, i4m0.w), new Pair(bey.e, i4m0.m), new Pair(bey.f, i4m0.x));
        q = new swq("kotlin.annotations.jvm.UnderMigration");
    }
}
