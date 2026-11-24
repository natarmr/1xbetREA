package a;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class vgy extends hhy {
    public static final /* synthetic */ iiy[] r = {new j0d0(vgy.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new j0d0(vgy.class, "annotations", "getAnnotations()Ljava/util/List;", 0), new j0d0(vgy.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0), new j0d0(vgy.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0), new j0d0(vgy.class, "constructors", "getConstructors()Ljava/util/Collection;", 0), new j0d0(vgy.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0), new j0d0(vgy.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0), new j0d0(vgy.class, "typeParameterTable", "getTypeParameterTable$kotlin_reflection()Lkotlin/reflect/jvm/internal/TypeParameterTable;", 0), new j0d0(vgy.class, "supertypes", "getSupertypes()Ljava/util/List;", 0), new j0d0(vgy.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0), new j0d0(vgy.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0), new j0d0(vgy.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0), new j0d0(vgy.class, "fakeOverrideMembers", "getFakeOverrideMembers()Ljava/util/Map;", 0)};
    public final a8z c;
    public final mre0 d;
    public final mre0 e;
    public final mre0 f;
    public final mre0 g;
    public final mre0 h;
    public final mre0 i;
    public final mre0 j;
    public final mre0 k;
    public final a8z l;
    public final a8z m;
    public final mre0 n;
    public final mre0 o;
    public final mre0 p;
    public final /* synthetic */ xgy q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgy(xgy xgyVar) {
        super(xgyVar);
        this.q = xgyVar;
        wez wezVar = wez.f39042a;
        this.c = maz.a(wezVar, new ugy(xgyVar, this, (byte) 0));
        byte b = 2;
        this.d = bww.S(null, new tgy(xgyVar, b));
        byte b2 = 3;
        this.e = bww.S(null, new tgy(xgyVar, this, b2));
        byte b3 = 4;
        this.f = bww.S(null, new tgy(xgyVar, this, b3));
        byte b4 = 5;
        this.g = bww.S(null, new tgy(xgyVar, b4));
        this.h = bww.S(null, new ugy(xgyVar, this, b4));
        bww.S(null, new ugy(this, xgyVar, (byte) 6));
        maz.a(wezVar, new ugy(this, xgyVar, (byte) 7));
        this.i = bww.S(null, new ugy(this, xgyVar, (byte) 8));
        this.j = bww.S(null, new ugy(this, xgyVar, (byte) 9));
        byte b5 = 1;
        this.k = bww.S(null, new ugy(xgyVar, this, b5));
        bww.S(null, new ugy(xgyVar, this, b));
        this.l = maz.a(wezVar, new ugy(this, xgyVar, b2));
        this.m = maz.a(wezVar, new tgy(xgyVar, b5));
        int i = 1;
        int i2 = 0;
        Class<ahy> cls = ahy.class;
        this.n = bww.S(null, new o0t(i2, xgyVar, cls, "computeDeclaredMembers", "computeDeclaredMembers(Lkotlin/reflect/jvm/internal/KClassImpl;)Ljava/util/Collection;", i, (byte) 11));
        this.o = bww.S(null, new o0t(i2, xgyVar, cls, "computeAllMembers", "computeAllMembers(Lkotlin/reflect/jvm/internal/KClassImpl;)Ljava/util/Collection;", i, (byte) 10));
        this.p = bww.S(null, new ugy(xgyVar, this, b3));
    }

    public final Collection a() {
        iiy iiyVar = r[10];
        Object objInvoke = this.n.invoke();
        objInvoke.getClass();
        return (Collection) objInvoke;
    }

    public final wm40 b() {
        iiy iiyVar = r[0];
        Object objInvoke = this.d.invoke();
        objInvoke.getClass();
        return (wm40) objInvoke;
    }

    public final qpy c() {
        return (qpy) this.c.getValue();
    }

    public final nzs0 d() {
        iiy iiyVar = r[7];
        Object objInvoke = this.j.invoke();
        objInvoke.getClass();
        return (nzs0) objInvoke;
    }
}
