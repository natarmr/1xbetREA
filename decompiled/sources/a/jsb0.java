package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jsb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iay f17044a = new iay(p860.b, false);
    public static final iay b;
    public static final iay c;
    public static final LinkedHashMap d;

    static {
        p860 p860Var = p860.c;
        b = new iay(p860Var, false);
        c = new iay(p860Var, true);
        ea70 ea70Var = new ea70((byte) 2);
        new fuj0(ea70Var, "java/util/Iterator").o("forEachRemaining", null, new gsb0("java/util/function/Consumer", (byte) 0));
        new fuj0(ea70Var, "java/lang/Iterable").o("spliterator", null, new pnk0((byte) 22));
        fuj0 fuj0Var = new fuj0(ea70Var, "java/util/Collection");
        fuj0Var.o("removeIf", null, new gsb0("java/util/function/Predicate", (byte) 17));
        fuj0Var.o("stream", null, new gsb0("java/util/stream/Stream", (byte) 26));
        fuj0Var.o("parallelStream", null, new isb0("java/util/stream/Stream", (byte) 1));
        fuj0 fuj0Var2 = new fuj0(ea70Var, "java/util/List");
        fuj0Var2.o("replaceAll", null, new isb0("java/util/function/UnaryOperator", (byte) 2));
        fuj0Var2.o("addFirst", "2.1", new isb0("java/lang/Object", (byte) 3));
        fuj0Var2.o("addLast", "2.1", new isb0("java/lang/Object", (byte) 4));
        fuj0Var2.o("removeFirst", "2.1", new isb0("java/lang/Object", (byte) 5));
        fuj0Var2.o("removeLast", "2.1", new isb0("java/lang/Object", (byte) 6));
        fuj0 fuj0Var3 = new fuj0(ea70Var, "java/util/LinkedList");
        fuj0Var3.o("addFirst", "2.1", new gsb0("java/lang/Object", (byte) 1));
        fuj0Var3.o("addLast", "2.1", new gsb0("java/lang/Object", (byte) 2));
        fuj0Var3.o("removeFirst", "2.1", new gsb0("java/lang/Object", (byte) 3));
        fuj0Var3.o("removeLast", "2.1", new gsb0("java/lang/Object", (byte) 4));
        fuj0 fuj0Var4 = new fuj0(ea70Var, "java/util/LinkedHashSet");
        fuj0Var4.o("addFirst", "2.2", new gsb0("java/lang/Object", (byte) 5));
        fuj0Var4.o("addLast", "2.2", new gsb0("java/lang/Object", (byte) 6));
        fuj0Var4.o("removeFirst", "2.2", new gsb0("java/lang/Object", (byte) 7));
        fuj0Var4.o("removeLast", "2.2", new gsb0("java/lang/Object", (byte) 8));
        fuj0Var4.o("getFirst", "2.2", new gsb0("java/lang/Object", (byte) 9));
        fuj0Var4.o("getLast", "2.2", new gsb0("java/lang/Object", (byte) 10));
        fuj0 fuj0Var5 = new fuj0(ea70Var, "java/util/Map");
        fuj0Var5.o("forEach", null, new gsb0("java/util/function/BiConsumer", (byte) 11));
        fuj0Var5.o("putIfAbsent", null, new gsb0("java/lang/Object", (byte) 12));
        fuj0Var5.o("replace", null, new gsb0("java/lang/Object", (byte) 13));
        fuj0Var5.o("replace", null, new gsb0("java/lang/Object", (byte) 14));
        fuj0Var5.o("replaceAll", null, new gsb0("java/util/function/BiFunction", (byte) 15));
        fuj0Var5.o("compute", null, new hsb0("java/lang/Object", "java/util/function/BiFunction", (byte) 0));
        fuj0Var5.o("computeIfAbsent", null, new hsb0("java/lang/Object", "java/util/function/Function", (byte) 1));
        fuj0Var5.o("computeIfPresent", null, new hsb0("java/lang/Object", "java/util/function/BiFunction", (byte) 2));
        fuj0Var5.o("merge", null, new hsb0("java/lang/Object", "java/util/function/BiFunction", (byte) 3));
        fuj0 fuj0Var6 = new fuj0(ea70Var, "java/util/LinkedHashMap");
        fuj0Var6.o("putFirst", "2.2", new gsb0("java/lang/Object", (byte) 16));
        fuj0Var6.o("putLast", "2.2", new gsb0("java/lang/Object", (byte) 18));
        fuj0 fuj0Var7 = new fuj0(ea70Var, "java/util/Optional");
        fuj0Var7.o("empty", null, new gsb0("java/util/Optional", (byte) 19));
        fuj0Var7.o("of", null, new hsb0("java/lang/Object", "java/util/Optional", (byte) 4));
        fuj0Var7.o("ofNullable", null, new hsb0("java/lang/Object", "java/util/Optional", (byte) 5));
        fuj0Var7.o("get", null, new gsb0("java/lang/Object", (byte) 20));
        fuj0Var7.o("ifPresent", null, new gsb0("java/util/function/Consumer", (byte) 21));
        new fuj0(ea70Var, "java/lang/ref/Reference").o("get", null, new gsb0("java/lang/Object", (byte) 22));
        new fuj0(ea70Var, "java/util/function/Predicate").o("test", null, new gsb0("java/lang/Object", (byte) 23));
        new fuj0(ea70Var, "java/util/function/BiPredicate").o("test", null, new gsb0("java/lang/Object", (byte) 24));
        new fuj0(ea70Var, "java/util/function/Consumer").o("accept", null, new gsb0("java/lang/Object", (byte) 25));
        new fuj0(ea70Var, "java/util/function/BiConsumer").o("accept", null, new gsb0("java/lang/Object", (byte) 27));
        new fuj0(ea70Var, "java/util/function/Function").o("apply", null, new gsb0("java/lang/Object", (byte) 28));
        new fuj0(ea70Var, "java/util/function/BiFunction").o("apply", null, new gsb0("java/lang/Object", (byte) 29));
        new fuj0(ea70Var, "java/util/function/Supplier").o("get", null, new isb0("java/lang/Object", (byte) 0));
        d = ea70Var.f7454a;
    }
}
