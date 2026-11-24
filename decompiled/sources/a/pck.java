package a;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class pck implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26764a;
    public final qck b;

    public /* synthetic */ pck(qck qckVar, byte b) {
        this.f26764a = b;
        this.b = qckVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x029c  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:59:0x010a  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        sv9 sv9VarB;
        GenericDeclaration declaredConstructor;
        sv9 sv9VarB2;
        sgy sgyVar;
        Object next;
        gre0 gre0Var;
        byte b = this.f26764a;
        qck qckVar = this.b;
        Object objB = null;
        switch (b) {
            case 0:
                qlc qlcVar = sog0.f32540a;
                mer merVarZ = qckVar.z();
                ihy ihyVar = qckVar.h;
                q0x q0xVarC = sog0.c(merVarZ);
                if (q0xVarC instanceof afy) {
                    if (fre0.V(qckVar)) {
                        Class clsJ = ihyVar.j();
                        List parameters = qckVar.getParameters();
                        ArrayList arrayList = new ArrayList(r3d.q(parameters, 10));
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((hre0) it.next()).getName();
                            name.getClass();
                            arrayList.add(name);
                        }
                        o83 o83Var = o83.b;
                        p83 p83Var = p83.f26536a;
                        return new q83(clsJ, arrayList, o83Var);
                    }
                    String str = ((afy) q0xVarC).f801a.c;
                    ihyVar.getClass();
                    str.getClass();
                    Class clsJ2 = ihyVar.j();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) xtt0.m(bqe0.d(ihyVar.j()), str, false).b).toArray(new Class[0]);
                        objB = clsJ2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                        break;
                    } catch (NoSuchMethodException unused) {
                    }
                } else if (q0xVarC instanceof bfy) {
                    dfy dfyVar = ((bfy) q0xVarC).f2527a;
                    objB = ihyVar.B(dfyVar.b, dfyVar.c);
                } else if (q0xVarC instanceof zey) {
                    objB = ((zey) q0xVarC).f44276a;
                } else {
                    if (!(q0xVarC instanceof yey)) {
                        if (!(q0xVarC instanceof xey)) {
                            t9f.b();
                            return null;
                        }
                        List list = ((xey) q0xVarC).f40765a;
                        Class clsJ3 = ihyVar.j();
                        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new q83(clsJ3, arrayList2, o83.b, p83.f26536a, list);
                    }
                    objB = ((yey) q0xVarC).f42514a;
                }
                if (objB instanceof Constructor) {
                    sv9VarB = qckVar.A((Constructor) objB, qckVar.z(), false);
                } else {
                    if (!(objB instanceof Method)) {
                        throw new poe("Could not compute caller for function: " + qckVar.z() + " (member = " + objB + ')');
                    }
                    Method method = (Method) objB;
                    if (!Modifier.isStatic(method.getModifiers())) {
                        sv9VarB = fre0.W(qckVar) ? new ov9(method, fre0.P(qckVar)) : new rv9((byte) 0, 6, method, false);
                    } else if (((p4) qckVar.z()).getAnnotations().O0(xtt0.f41480a) != null) {
                        sv9VarB = fre0.W(qckVar) ? new pv9(method, false, 4) : new rv9((byte) 1, 4, method, true);
                    } else {
                        sv9VarB = qckVar.B(method, false);
                    }
                }
                return gnm0.j(sv9VarB, qckVar, iun.f15405a, false);
            case 1:
                ArrayList arrayList3 = new ArrayList();
                qlc qlcVar2 = sog0.f32540a;
                mer merVarZ2 = qckVar.z();
                ihy ihyVar2 = qckVar.h;
                q0x q0xVarC2 = sog0.c(merVarZ2);
                if (!(q0xVarC2 instanceof bfy)) {
                    if (q0xVarC2 instanceof afy) {
                        if (fre0.V(qckVar)) {
                            Class clsJ4 = ihyVar2.j();
                            List parameters2 = qckVar.getParameters();
                            ArrayList arrayList4 = new ArrayList(r3d.q(parameters2, 10));
                            Iterator it3 = parameters2.iterator();
                            while (it3.hasNext()) {
                                String name2 = ((hre0) it3.next()).getName();
                                name2.getClass();
                                arrayList4.add(name2);
                            }
                            o83 o83Var2 = o83.f24813a;
                            p83 p83Var2 = p83.f26536a;
                            return new q83(clsJ4, arrayList4, o83Var2);
                        }
                        fhj fhjVarA = vvw.A(qckVar, ((afy) q0xVarC2).f801a.c);
                        arrayList3.addAll((Set) fhjVarA.b);
                        String str2 = (String) fhjVarA.f9543a;
                        ihyVar2.getClass();
                        str2.getClass();
                        Class clsJ5 = ihyVar2.j();
                        ArrayList arrayList5 = new ArrayList();
                        ihy.q(arrayList5, (ArrayList) xtt0.m(bqe0.d(ihyVar2.j()), str2, false).b, true, false);
                        try {
                            Class[] clsArr2 = (Class[]) arrayList5.toArray(new Class[0]);
                            declaredConstructor = clsJ5.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = null;
                        }
                    } else if (q0xVarC2 instanceof xey) {
                        List list2 = ((xey) q0xVarC2).f40765a;
                        Class clsJ6 = ihyVar2.j();
                        ArrayList arrayList6 = new ArrayList(r3d.q(list2, 10));
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList6.add(((Method) it4.next()).getName());
                        }
                        return new q83(clsJ6, arrayList6, o83.f24813a, p83.f26536a, list2);
                    }
                    declaredConstructor = null;
                    break;
                } else {
                    ArrayList arrayListK = z1x.K(qckVar);
                    if (arrayListK.isEmpty()) {
                        if (ihyVar2 instanceof sgy) {
                            sgyVar = (sgy) ihyVar2;
                        } else {
                            sgyVar = null;
                        }
                        if (sgyVar == null && sgyVar.I()) {
                            Member memberB = qckVar.x().b();
                            memberB.getClass();
                            if (Modifier.isStatic(memberB.getModifiers())) {
                                Collection collectionK = qckVar.z().k();
                                collectionK.getClass();
                                Collection<mer> collection = collectionK;
                                ArrayList arrayList7 = new ArrayList(r3d.q(collection, 10));
                                for (mer merVar : collection) {
                                    vjj vjjVarJ = merVar.j();
                                    vjjVarJ.getClass();
                                    Class clsQ = xtt0.q((wm40) vjjVarJ);
                                    if (clsQ == null) {
                                        ohq.u(qckVar, "Unknown container class for overridden function: ");
                                        return null;
                                    }
                                    arrayList7.add(new qck((xgy) sre0.f32672a.b(clsQ), merVar));
                                }
                                Iterator it5 = arrayList7.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next = it5.next();
                                        ArrayList arrayListK2 = z1x.K((gre0) next);
                                        if (!arrayListK2.isEmpty()) {
                                            Iterator it6 = arrayListK2.iterator();
                                            while (true) {
                                                if (it6.hasNext()) {
                                                    hre0 hre0Var = (hre0) it6.next();
                                                    if (hre0Var == null) {
                                                        hre0Var = null;
                                                    }
                                                    if (hre0Var == null || !hre0Var.f()) {
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                gre0Var = (gre0) next;
                            } else {
                                gre0Var = null;
                            }
                        } else {
                            gre0Var = null;
                        }
                    } else {
                        Iterator it7 = arrayListK.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                hre0 hre0Var2 = (hre0) it7.next();
                                if (hre0Var2 == null) {
                                    hre0Var2 = null;
                                }
                                if (hre0Var2 == null || !hre0Var2.f()) {
                                }
                            } else {
                                if (ihyVar2 instanceof sgy) {
                                    sgyVar = (sgy) ihyVar2;
                                } else {
                                    sgyVar = null;
                                }
                                if (sgyVar == null) {
                                }
                            }
                            gre0Var = null;
                        }
                    }
                    if (gre0Var != null) {
                        String strQ0 = StringsKt.q0(gre0Var.getSignature(), '(');
                        fhj fhjVarA2 = vvw.A(gre0Var, gre0Var.getSignature().substring(strQ0.length()));
                        arrayList3.addAll((Set) fhjVarA2.b);
                        declaredConstructor = ihyVar2.z(strQ0, (String) fhjVarA2.f9543a, true, qckVar.z().F() != null);
                    } else {
                        dfy dfyVar2 = ((bfy) q0xVarC2).f2527a;
                        fhj fhjVarA3 = vvw.A(qckVar, dfyVar2.c);
                        arrayList3.addAll((Set) fhjVarA3.b);
                        String str3 = dfyVar2.b;
                        String str4 = (String) fhjVarA3.f9543a;
                        Member memberB2 = qckVar.x().b();
                        memberB2.getClass();
                        declaredConstructor = ihyVar2.z(str3, str4, !Modifier.isStatic(memberB2.getModifiers()), qckVar.z().F() != null);
                    }
                }
                if (declaredConstructor instanceof Constructor) {
                    sv9VarB2 = qckVar.A((Constructor) declaredConstructor, qckVar.z(), true);
                } else if (!(declaredConstructor instanceof Method)) {
                    sv9VarB2 = null;
                } else if (((p4) qckVar.z()).getAnnotations().O0(xtt0.f41480a) != null) {
                    vjj vjjVarJ2 = qckVar.z().j();
                    vjjVarJ2.getClass();
                    if (((wm40) vjjVarJ2).o0()) {
                        sv9VarB2 = qckVar.B((Method) declaredConstructor, qckVar.x().c());
                    } else {
                        Method method2 = (Method) declaredConstructor;
                        sv9VarB2 = fre0.W(qckVar) ? new pv9(method2, false, 4) : new rv9((byte) 1, 4, method2, true);
                    }
                } else {
                    sv9VarB2 = qckVar.B((Method) declaredConstructor, qckVar.x().c());
                }
                if (sv9VarB2 != null) {
                    return gnm0.j(sv9VarB2, qckVar, arrayList3, true);
                }
                return null;
            default:
                Type typeW = vvw.w(qckVar);
                return typeW == null ? qckVar.x().getReturnType() : typeW;
        }
    }
}
