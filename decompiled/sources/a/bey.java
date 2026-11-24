package a;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final swq f2475a;
    public static final g950 b;
    public static final swq c;
    public static final swq d;
    public static final swq e;
    public static final swq f;
    public static final swq g;
    public static final swq h;
    public static final swq i;
    public static final swq j;
    public static final swq k;
    public static final swq l;
    public static final swq m;
    public static final swq n;
    public static final swq o;
    public static final swq p;
    public static final swq q;
    public static final swq r;

    static {
        swq swqVar = new swq("kotlin.Metadata");
        f2475a = swqVar;
        if (swqVar.f32934a.f34663a.replace('.', '/') == null) {
            rey.a(7);
            throw null;
        }
        b = g950.e("value");
        c = new swq(Target.class.getName());
        new swq(ElementType.class.getName());
        d = new swq(Retention.class.getName());
        new swq(RetentionPolicy.class.getName());
        e = new swq(Deprecated.class.getName());
        f = new swq(Documented.class.getName());
        g = new swq("java.lang.annotation.Repeatable");
        new swq("java.lang.annotation.Inherited");
        new swq(Override.class.getName());
        h = new swq("org.jetbrains.annotations.NotNull");
        i = new swq("org.jetbrains.annotations.Nullable");
        j = new swq("org.jetbrains.annotations.Mutable");
        k = new swq("org.jetbrains.annotations.ReadOnly");
        l = new swq("org.jetbrains.annotations.Unmodifiable");
        m = new swq("org.jetbrains.annotations.UnmodifiableView");
        n = new swq("kotlin.annotations.jvm.ReadOnly");
        o = new swq("kotlin.annotations.jvm.Mutable");
        p = new swq("kotlin.jvm.PurelyImplements");
        new swq("kotlin.jvm.internal");
        q = new swq("kotlin.jvm.internal.EnhancedNullability");
        r = new swq("kotlin.jvm.internal.EnhancedMutability");
    }
}
