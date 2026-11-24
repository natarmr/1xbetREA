package a;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class z9z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44044a;
    public final baz b;

    public /* synthetic */ z9z(baz bazVar, byte b) {
        this.f44044a = b;
        this.b = bazVar;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0179  */
    /* JADX WARN: Code duplicated, block: B:56:0x019c  */
    /* JADX WARN: Code duplicated, block: B:91:0x026c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        zqe0 gqe0Var;
        zqe0 xqe0Var;
        byte b = this.f44044a;
        baz bazVar = this.b;
        switch (b) {
            case 0:
                g950 g950Var = (g950) obj;
                g950Var.getClass();
                baz bazVar2 = bazVar.c;
                if (bazVar2 != null) {
                    return (Collection) bazVar2.f.invoke(g950Var);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ckj) bazVar.e.invoke()).d(g950Var).iterator();
                while (it.hasNext()) {
                    u9y u9yVarT = bazVar.t((vqe0) it.next());
                    if (bazVar.r(u9yVarT)) {
                        Object obj2 = bazVar.b.b;
                        arrayList.add(u9yVarT);
                    }
                }
                bazVar.j(g950Var, arrayList);
                return arrayList;
            case 1:
                g950 g950Var2 = (g950) obj;
                g950Var2.getClass();
                baz bazVar3 = bazVar.c;
                if (bazVar3 != null) {
                    return (d0d0) bazVar3.g.invoke(g950Var2);
                }
                sqe0 sqe0VarB = ((ckj) bazVar.e.invoke()).b(g950Var2);
                if (sqe0VarB != null) {
                    Field field = sqe0VarB.f32626a;
                    if (!field.isEnumConstant()) {
                        mie0 mie0Var = new mie0();
                        boolean z = !Modifier.isFinal(((Field) sqe0VarB.b()).getModifiers());
                        f7u f7uVar = bazVar.b;
                        j9z j9zVarW = r8x.W(f7uVar, sqe0VarB);
                        v7i v7iVar = (v7i) f7uVar.b;
                        vjj vjjVarQ = bazVar.q();
                        evz evzVar = gm40.f11524a;
                        x9y x9yVarX1 = x9y.x1(vjjVarQ, j9zVarW, u4n0.u(sqe0VarB.e()), z, sqe0VarB.c(), m2a.v(sqe0VarB), Modifier.isFinal(((Field) sqe0VarB.b()).getModifiers()) && Modifier.isStatic(((Field) sqe0VarB.b()).getModifiers()));
                        mie0Var.f21842a = x9yVarX1;
                        x9yVarX1.t1(null, null, null, null);
                        nvu nvuVar = (nvu) f7uVar.e;
                        Type genericType = field.getGenericType();
                        genericType.getClass();
                        boolean z2 = genericType instanceof Class;
                        if (z2) {
                            Class cls = (Class) genericType;
                            if (cls.isPrimitive()) {
                                xqe0Var = new xqe0(cls);
                            } else {
                                if (!(genericType instanceof GenericArrayType) || (z2 && ((Class) genericType).isArray())) {
                                    gqe0Var = new gqe0(genericType);
                                } else {
                                    gqe0Var = genericType instanceof WildcardType ? new cre0((WildcardType) genericType) : new oqe0(genericType);
                                }
                                xqe0Var = gqe0Var;
                            }
                        } else {
                            if (genericType instanceof GenericArrayType) {
                                gqe0Var = new gqe0(genericType);
                            } else {
                                gqe0Var = new gqe0(genericType);
                            }
                            xqe0Var = gqe0Var;
                        }
                        wsy wsyVarV = nvuVar.V(xqe0Var, xvw.Y(b0t0.b, false, null, 7));
                        if ((ary.H(wsyVarV) || ary.I(wsyVarV)) && Modifier.isFinal(((Field) sqe0VarB.b()).getModifiers())) {
                            Modifier.isStatic(((Field) sqe0VarB.b()).getModifiers());
                        }
                        f0d0 f0d0Var = (f0d0) mie0Var.f21842a;
                        iun iunVar = iun.f15405a;
                        f0d0Var.w1(wsyVarV, iunVar, bazVar.p(), null, iunVar);
                        vjj vjjVarQ2 = bazVar.q();
                        wm40 wm40Var = vjjVarQ2 instanceof wm40 ? (wm40) vjjVarQ2 : null;
                        if (wm40Var != null) {
                            mie0Var.f21842a = ((kld) ((e6o0) v7iVar.o)).h(wm40Var, (f0d0) mie0Var.f21842a, f7uVar);
                        }
                        Object obj3 = mie0Var.f21842a;
                        r3u0 r3u0Var = (r3u0) obj3;
                        wsy type = ((f0d0) obj3).getType();
                        if (r3u0Var == null) {
                            oek.a(65);
                            throw null;
                        }
                        if (type == null) {
                            oek.a(66);
                            throw null;
                        }
                        int i = oek.f25126a;
                        if (!r3u0Var.E() && !bdx.k0(type)) {
                            if (e0t0.b(type)) {
                                ((f0d0) mie0Var.f21842a).u1(null, new kch(bazVar, sqe0VarB, mie0Var, (byte) 4));
                            } else {
                                int i2 = rek.f30339a;
                                ym40 ym40VarC = oek.c(r3u0Var);
                                ym40VarC.getClass();
                                ary aryVarC = ym40VarC.c();
                                if (ary.H(type)) {
                                    ((f0d0) mie0Var.f21842a).u1(null, new kch(bazVar, sqe0VarB, mie0Var, (byte) 4));
                                } else {
                                    lm50 lm50Var = ysy.f43192a;
                                    if (lm50Var.a(aryVarC.v(), type) || lm50Var.a(aryVarC.k("Number").I(), type) || lm50Var.a(aryVarC.e(), type) || nft0.a(type)) {
                                        ((f0d0) mie0Var.f21842a).u1(null, new kch(bazVar, sqe0VarB, mie0Var, (byte) 4));
                                    }
                                }
                            }
                        }
                        Object obj4 = mie0Var.f21842a;
                        if (((d0d0) obj4) != null) {
                            return (d0d0) obj4;
                        }
                        Object[] objArr = new Object[3];
                        switch (6) {
                            case 1:
                                objArr[0] = "member";
                                break;
                            case 2:
                            case 4:
                            case 6:
                            case 8:
                                objArr[0] = "descriptor";
                                break;
                            case 3:
                                objArr[0] = "element";
                                break;
                            case 5:
                                objArr[0] = "field";
                                break;
                            case 7:
                                objArr[0] = "javaClass";
                                break;
                            default:
                                objArr[0] = "fqName";
                                break;
                        }
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
                        switch (6) {
                            case 1:
                            case 2:
                                objArr[2] = "recordMethod";
                                break;
                            case 3:
                            case 4:
                                objArr[2] = "recordConstructor";
                                break;
                            case 5:
                            case 6:
                                objArr[2] = "recordField";
                                break;
                            case 7:
                            case 8:
                                objArr[2] = "recordClass";
                                break;
                            default:
                                objArr[2] = "getClassResolvedFromSource";
                                break;
                        }
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                    }
                }
                return null;
            case 2:
                g950 g950Var3 = (g950) obj;
                g950Var3.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) bazVar.f.invoke(g950Var3));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj5 : linkedHashSet) {
                    String strW = m7x.w((fyj0) obj5, 2);
                    Object arrayList2 = linkedHashMap.get(strW);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strW, arrayList2);
                    }
                    ((List) arrayList2).add(obj5);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        Collection collectionD = m2x.D(list, j9x.v);
                        linkedHashSet.removeAll(list);
                        linkedHashSet.addAll(collectionD);
                    }
                }
                bazVar.m(linkedHashSet, g950Var3);
                f7u f7uVar2 = bazVar.b;
                return CollectionsKt.L0(((cge0) ((v7i) f7uVar2.b).f36925a).e(f7uVar2, linkedHashSet));
            default:
                g950 g950Var4 = (g950) obj;
                g950Var4.getClass();
                ArrayList arrayList3 = new ArrayList();
                Object objInvoke = bazVar.g.invoke(g950Var4);
                if (objInvoke != null) {
                    arrayList3.add(objInvoke);
                }
                bazVar.n(g950Var4, arrayList3);
                vjj vjjVarQ3 = bazVar.q();
                int i3 = oek.f25126a;
                if (oek.m(vjjVarQ3, slc.e)) {
                    return CollectionsKt.L0(arrayList3);
                }
                f7u f7uVar3 = bazVar.b;
                return CollectionsKt.L0(((cge0) ((v7i) f7uVar3.b).f36925a).e(f7uVar3, arrayList3));
        }
    }
}
