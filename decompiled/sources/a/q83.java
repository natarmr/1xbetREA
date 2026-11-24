package a;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class q83 implements bv9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f28280a;
    public final ArrayList b;
    public final o83 c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public q83(Class cls, ArrayList arrayList, o83 o83Var, p83 p83Var, List list) {
        cls.getClass();
        list.getClass();
        this.f28280a = cls;
        this.b = arrayList;
        this.c = o83Var;
        this.d = list;
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.e = arrayList2;
        List list2 = this.d;
        ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            returnType.getClass();
            Class<?> clsE = bqe0.e(returnType);
            if (clsE != null) {
                returnType = clsE;
            }
            arrayList3.add(returnType);
        }
        this.f = arrayList3;
        List list3 = this.d;
        ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((Method) it3.next()).getDefaultValue());
        }
        this.g = arrayList4;
        if (this.c == o83.b && p83Var == p83.f26536a && !CollectionsKt.m0(this.b, "value").isEmpty()) {
            v4i0.p("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            throw null;
        }
    }

    @Override // a.bv9
    public final List a() {
        return this.e;
    }

    @Override // a.bv9
    public final Member b() {
        return null;
    }

    @Override // a.bv9
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:50:0x0114  */
    /* JADX WARN: Code duplicated, block: B:53:0x013c A[LOOP:0: B:5:0x001a->B:53:0x013c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x008f A[SYNTHETIC] */
    @Override // a.bv9
    public final Object call(Object[] objArr) {
        Object obj;
        Class cls;
        tre0 tre0Var;
        sgy sgyVarB;
        tre0 tre0Var2;
        sgy sgyVarB2;
        String strV;
        objArr.getClass();
        int length = objArr.length;
        ArrayList arrayList = this.e;
        if (arrayList.size() != length) {
            c99.i(arrayList.size(), length);
            return null;
        }
        ArrayList arrayList2 = new ArrayList(objArr.length);
        int length2 = objArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList3 = this.b;
            if (i >= length2) {
                return jiq0.l0(this.f28280a, xp20.m(CollectionsKt.T0(arrayList3, arrayList2)), this.d);
            }
            Object array = objArr[i];
            int i3 = i2 + 1;
            ArrayList arrayList4 = this.f;
            if (array == null && this.c == o83.f24813a) {
                array = this.g.get(i2);
            } else {
                Class cls2 = (Class) arrayList4.get(i2);
                if (!(array instanceof Class)) {
                    if (array instanceof sgy) {
                        array = azw.G((sgy) array);
                    } else {
                        if (array instanceof Object[]) {
                            Object[] objArr2 = (Object[]) array;
                            if (!(objArr2 instanceof Class[])) {
                                if (objArr2 instanceof sgy[]) {
                                    sgy[] sgyVarArr = (sgy[]) array;
                                    ArrayList arrayList5 = new ArrayList(sgyVarArr.length);
                                    for (sgy sgyVar : sgyVarArr) {
                                        arrayList5.add(azw.G(sgyVar));
                                    }
                                    obj = null;
                                    array = arrayList5.toArray(new Class[0]);
                                } else {
                                    obj = null;
                                    array = objArr2;
                                }
                            }
                        }
                        if (!cls2.isInstance(array)) {
                            array = obj;
                        }
                        if (array == null) {
                            String str = (String) arrayList3.get(i2);
                            cls = (Class) arrayList4.get(i2);
                            if (!Intrinsics.d(cls, Class.class)) {
                                if (cls.isArray() || !Intrinsics.d(cls.getComponentType(), Class.class)) {
                                    tre0Var = sre0.f32672a;
                                    sgyVarB = tre0Var.b(cls);
                                    tre0Var2 = tre0Var;
                                } else {
                                    tre0Var2 = sre0.f32672a;
                                    sgyVarB2 = tre0Var2.b(sgy[].class);
                                }
                                if (Intrinsics.d(sgyVarB.v(), tre0Var2.b(Object[].class).v())) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(sgyVarB.v());
                                    sb.append('<');
                                    Class<?> componentType = azw.G(sgyVarB).getComponentType();
                                    componentType.getClass();
                                    sb.append(tre0Var.b(componentType).v());
                                    sb.append('>');
                                    strV = sb.toString();
                                } else {
                                    strV = sgyVarB.v();
                                }
                                throw new IllegalArgumentException("Argument #" + i2 + ' ' + str + " is not of the required type " + strV);
                            }
                            tre0Var2 = sre0.f32672a;
                            sgyVarB2 = tre0Var2.b(sgy.class);
                            sgyVarB = sgyVarB2;
                            tre0Var = tre0Var2;
                            if (Intrinsics.d(sgyVarB.v(), tre0Var2.b(Object[].class).v())) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(sgyVarB.v());
                                sb2.append('<');
                                Class<?> componentType2 = azw.G(sgyVarB).getComponentType();
                                componentType2.getClass();
                                sb2.append(tre0Var.b(componentType2).v());
                                sb2.append('>');
                                strV = sb2.toString();
                            } else {
                                strV = sgyVarB.v();
                            }
                            throw new IllegalArgumentException("Argument #" + i2 + ' ' + str + " is not of the required type " + strV);
                        }
                        arrayList2.add(array);
                        i++;
                        i2 = i3;
                    }
                    obj = null;
                    if (!cls2.isInstance(array)) {
                        array = obj;
                    }
                    if (array == null) {
                        String str2 = (String) arrayList3.get(i2);
                        cls = (Class) arrayList4.get(i2);
                        if (!Intrinsics.d(cls, Class.class)) {
                            if (cls.isArray()) {
                            }
                            tre0Var = sre0.f32672a;
                            sgyVarB = tre0Var.b(cls);
                            tre0Var2 = tre0Var;
                            if (Intrinsics.d(sgyVarB.v(), tre0Var2.b(Object[].class).v())) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(sgyVarB.v());
                                sb3.append('<');
                                Class<?> componentType3 = azw.G(sgyVarB).getComponentType();
                                componentType3.getClass();
                                sb3.append(tre0Var.b(componentType3).v());
                                sb3.append('>');
                                strV = sb3.toString();
                            } else {
                                strV = sgyVarB.v();
                            }
                            throw new IllegalArgumentException("Argument #" + i2 + ' ' + str2 + " is not of the required type " + strV);
                        }
                        tre0Var2 = sre0.f32672a;
                        sgyVarB2 = tre0Var2.b(sgy.class);
                        sgyVarB = sgyVarB2;
                        tre0Var = tre0Var2;
                        if (Intrinsics.d(sgyVarB.v(), tre0Var2.b(Object[].class).v())) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(sgyVarB.v());
                            sb4.append('<');
                            Class<?> componentType4 = azw.G(sgyVarB).getComponentType();
                            componentType4.getClass();
                            sb4.append(tre0Var.b(componentType4).v());
                            sb4.append('>');
                            strV = sb4.toString();
                        } else {
                            strV = sgyVarB.v();
                        }
                        throw new IllegalArgumentException("Argument #" + i2 + ' ' + str2 + " is not of the required type " + strV);
                    }
                    arrayList2.add(array);
                    i++;
                    i2 = i3;
                }
                array = null;
            }
            if (array == null) {
                String str3 = (String) arrayList3.get(i2);
                cls = (Class) arrayList4.get(i2);
                if (!Intrinsics.d(cls, Class.class)) {
                    if (cls.isArray()) {
                    }
                    tre0Var = sre0.f32672a;
                    sgyVarB = tre0Var.b(cls);
                    tre0Var2 = tre0Var;
                    if (Intrinsics.d(sgyVarB.v(), tre0Var2.b(Object[].class).v())) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(sgyVarB.v());
                        sb5.append('<');
                        Class<?> componentType5 = azw.G(sgyVarB).getComponentType();
                        componentType5.getClass();
                        sb5.append(tre0Var.b(componentType5).v());
                        sb5.append('>');
                        strV = sb5.toString();
                    } else {
                        strV = sgyVarB.v();
                    }
                    throw new IllegalArgumentException("Argument #" + i2 + ' ' + str3 + " is not of the required type " + strV);
                }
                tre0Var2 = sre0.f32672a;
                sgyVarB2 = tre0Var2.b(sgy.class);
                sgyVarB = sgyVarB2;
                tre0Var = tre0Var2;
                if (Intrinsics.d(sgyVarB.v(), tre0Var2.b(Object[].class).v())) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(sgyVarB.v());
                    sb6.append('<');
                    Class<?> componentType6 = azw.G(sgyVarB).getComponentType();
                    componentType6.getClass();
                    sb6.append(tre0Var.b(componentType6).v());
                    sb6.append('>');
                    strV = sb6.toString();
                } else {
                    strV = sgyVarB.v();
                }
                throw new IllegalArgumentException("Argument #" + i2 + ' ' + str3 + " is not of the required type " + strV);
            }
            arrayList2.add(array);
            i++;
            i2 = i3;
        }
    }

    @Override // a.bv9
    public final Type getReturnType() {
        return this.f28280a;
    }

    public /* synthetic */ q83(Class cls, ArrayList arrayList, o83 o83Var) {
        p83 p83Var = p83.b;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, o83Var, p83Var, arrayList2);
    }
}
