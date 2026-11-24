package a;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class rry implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31007a;
    public final sry b;

    public /* synthetic */ rry(sry sryVar, byte b) {
        this.f31007a = b;
        this.b = sryVar;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[LOOP:1: B:39:0x011e->B:108:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:38:0x011a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0124  */
    /* JADX WARN: Code duplicated, block: B:84:0x020f  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        GenericDeclaration genericDeclarationB;
        sv9 sv9VarU;
        List listA;
        Iterator it;
        GenericDeclaration genericDeclarationZ;
        byte b = this.f31007a;
        boolean z = false;
        sry sryVar = this.b;
        switch (b) {
            case 0:
                sry sryVar2 = this.b;
                return w9x.B(sryVar2, sryVar2.z(), sryVar2.A(), sryVar2.D(), sryVar2.C(), true);
            case 1:
                sry sryVar3 = this.b;
                return fre0.W(sryVar3) ? w9x.B(sryVar3, sryVar3.z(), sryVar3.A(), sryVar3.D(), sryVar3.C(), false) : sryVar3.a();
            case 2:
                boolean zX = fre0.X(sryVar);
                ihy ihyVar = sryVar.c;
                if (!zX && !(ihyVar instanceof zhy)) {
                    StringBuilder sb = new StringBuilder("Only constructors and top-level functions are supported for now: ");
                    sb.append(ihyVar);
                    hny.r(sb, sryVar.getName(), sryVar.d);
                    return null;
                }
                hfy hfyVarB = sryVar.B();
                String str = hfyVarB.c;
                if (fre0.X(sryVar)) {
                    if (ihyVar instanceof xgy) {
                        xgy xgyVar = (xgy) ihyVar;
                        if (xgyVar.I()) {
                            qpy qpyVarX = xgyVar.X();
                            if ((qpyVarX != null ? qpyVarX.m : null) != null) {
                                genericDeclarationB = ihyVar.B(hfyVarB.b, str);
                            }
                        }
                    }
                    if (fre0.V(sryVar)) {
                        Class clsJ = ihyVar.j();
                        List parameters = sryVar.getParameters();
                        ArrayList arrayList = new ArrayList(r3d.q(parameters, 10));
                        Iterator it2 = parameters.iterator();
                        while (it2.hasNext()) {
                            String name = ((hre0) it2.next()).getName();
                            name.getClass();
                            arrayList.add(name);
                        }
                        o83 o83Var = o83.b;
                        p83 p83Var = p83.f26536a;
                        return new q83(clsJ, arrayList, o83Var);
                    }
                    ihyVar.getClass();
                    str.getClass();
                    Class clsJ2 = ihyVar.j();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) xtt0.m(bqe0.d(ihyVar.j()), str, false).b).toArray(new Class[0]);
                        genericDeclarationB = clsJ2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    } catch (NoSuchMethodException unused) {
                        genericDeclarationB = null;
                    }
                    break;
                } else {
                    genericDeclarationB = ihyVar.B(hfyVarB.b, str);
                }
                if (genericDeclarationB instanceof Constructor) {
                    sv9VarU = sryVar.p((Constructor) genericDeclarationB, false);
                } else {
                    if (!(genericDeclarationB instanceof Method)) {
                        ohq.u(sryVar, "Could not compute caller for function: ");
                        return null;
                    }
                    sv9VarU = sryVar.u((Method) genericDeclarationB, false);
                }
                return gnm0.j(sv9VarU, sryVar, iun.f15405a, false);
            default:
                boolean zX2 = fre0.X(sryVar);
                ihy ihyVar2 = sryVar.c;
                if (!zX2 && !(ihyVar2 instanceof zhy)) {
                    StringBuilder sb2 = new StringBuilder("Only constructors and top-level functions are supported for now: ");
                    sb2.append(ihyVar2);
                    hny.r(sb2, sryVar.getName(), sryVar.d);
                    return null;
                }
                hfy hfyVarB2 = sryVar.B();
                ArrayList arrayList2 = new ArrayList();
                if (fre0.X(sryVar)) {
                    if (ihyVar2 instanceof xgy) {
                        xgy xgyVar2 = (xgy) ihyVar2;
                        if (xgyVar2.I()) {
                            qpy qpyVarX2 = xgyVar2.X();
                            if ((qpyVarX2 != null ? qpyVarX2.m : null) != null) {
                                fhj fhjVarA = vvw.A(sryVar, hfyVarB2.c);
                                arrayList2.addAll((Set) fhjVarA.b);
                                String str2 = hfyVarB2.b;
                                String str3 = (String) fhjVarA.f9543a;
                                Member memberB = sryVar.x().b();
                                memberB.getClass();
                                boolean z2 = !Modifier.isStatic(memberB.getModifiers());
                                listA = sryVar.a();
                                if (listA != null) {
                                    it = listA.iterator();
                                    while (it.hasNext()) {
                                        if (((hre0) it.next()).n() == aiy.c) {
                                            z = true;
                                        }
                                    }
                                } else {
                                    it = listA.iterator();
                                    while (it.hasNext()) {
                                        if (((hre0) it.next()).n() == aiy.c) {
                                            z = true;
                                        }
                                    }
                                }
                                genericDeclarationZ = ihyVar2.z(str2, str3, z2, z);
                            }
                        }
                    }
                    if (fre0.V(sryVar)) {
                        Class clsJ3 = ihyVar2.j();
                        List parameters2 = sryVar.getParameters();
                        ArrayList arrayList3 = new ArrayList(r3d.q(parameters2, 10));
                        Iterator it3 = parameters2.iterator();
                        while (it3.hasNext()) {
                            String name2 = ((hre0) it3.next()).getName();
                            name2.getClass();
                            arrayList3.add(name2);
                        }
                        o83 o83Var2 = o83.f24813a;
                        p83 p83Var2 = p83.f26536a;
                        return new q83(clsJ3, arrayList3, o83Var2);
                    }
                    fhj fhjVarA2 = vvw.A(sryVar, sryVar.B().c);
                    arrayList2.addAll((Set) fhjVarA2.b);
                    String str4 = (String) fhjVarA2.f9543a;
                    ihyVar2.getClass();
                    str4.getClass();
                    Class clsJ4 = ihyVar2.j();
                    ArrayList arrayList4 = new ArrayList();
                    ihy.q(arrayList4, (ArrayList) xtt0.m(bqe0.d(ihyVar2.j()), str4, false).b, true, false);
                    try {
                        Class[] clsArr2 = (Class[]) arrayList4.toArray(new Class[0]);
                        genericDeclarationZ = clsJ4.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                    } catch (NoSuchMethodException unused2) {
                        genericDeclarationZ = null;
                    }
                    break;
                } else {
                    fhj fhjVarA3 = vvw.A(sryVar, hfyVarB2.c);
                    arrayList2.addAll((Set) fhjVarA3.b);
                    String str5 = hfyVarB2.b;
                    String str6 = (String) fhjVarA3.f9543a;
                    Member memberB2 = sryVar.x().b();
                    memberB2.getClass();
                    boolean z3 = !Modifier.isStatic(memberB2.getModifiers());
                    listA = sryVar.a();
                    if (listA != null || !listA.isEmpty()) {
                        it = listA.iterator();
                        while (it.hasNext()) {
                            if (((hre0) it.next()).n() == aiy.c) {
                                z = true;
                            }
                        }
                    }
                    genericDeclarationZ = ihyVar2.z(str5, str6, z3, z);
                }
                sv9 sv9VarP = genericDeclarationZ instanceof Constructor ? sryVar.p((Constructor) genericDeclarationZ, true) : genericDeclarationZ instanceof Method ? sryVar.u((Method) genericDeclarationZ, sryVar.x().c()) : null;
                if (sv9VarP != null) {
                    return gnm0.j(sv9VarP, sryVar, arrayList2, true);
                }
                return null;
        }
    }
}
