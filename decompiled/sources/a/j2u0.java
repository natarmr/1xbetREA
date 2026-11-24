package a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class j2u0 implements bv9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bv9 f15801a;
    public final boolean b;
    public final glt0 c;

    /* JADX WARN: Code duplicated, block: B:102:0x0188  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:122:0x01db  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:130:0x0208  */
    /* JADX WARN: Code duplicated, block: B:135:0x0218 A[LOOP:2: B:133:0x0212->B:135:0x0218, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x0249  */
    /* JADX WARN: Code duplicated, block: B:147:0x024b  */
    /* JADX WARN: Code duplicated, block: B:149:0x0258  */
    /* JADX WARN: Code duplicated, block: B:153:0x0262  */
    /* JADX WARN: Code duplicated, block: B:168:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0182 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:? A[LOOP:4: B:88:0x014f->B:177:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[LOOP:5: B:39:0x00a1->B:180:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e A[EDGE_INSN: B:32:0x008e->B:57:0x00d7 BREAK  A[LOOP:5: B:39:0x00a1->B:180:?]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:69:0x010c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0117  */
    /* JADX WARN: Code duplicated, block: B:78:0x0126  */
    /* JADX WARN: Code duplicated, block: B:87:0x014b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0155  */
    /* JADX WARN: Code duplicated, block: B:99:0x017d  */
    public j2u0(bv9 bv9Var, dre0 dre0Var, List list, boolean z) {
        Class clsV;
        Method declaredMethod;
        int i;
        List parameters;
        Iterator it;
        ihy ihyVarK;
        xgy xgyVar;
        qpy qpyVarX;
        String str;
        ArrayList arrayList;
        elc elcVarK;
        boolean z2;
        List listA;
        Iterator it2;
        int size;
        List<Type> listA2;
        int i2;
        int i3;
        int i4;
        int size2;
        boolean z3;
        IntRange intRangeO;
        Method[] methodArr;
        int i5;
        Iterator it3;
        glt0 glt0Var;
        Member memberB;
        Class<?> declaringClass;
        boolean z4;
        Method methodL;
        Class clsV2;
        sgy sgyVar;
        sgy sgyVar2;
        kiy kiyVarS;
        list.getClass();
        this.f15801a = bv9Var;
        this.b = z;
        kiy returnType = dre0Var.getReturnType();
        boolean z5 = dre0Var instanceof gre0;
        if ((z5 && ((gre0) dre0Var).isSuspend() && (kiyVarS = xtt0.s(returnType)) != null && gnm0.o(kiyVarS)) || (clsV = gnm0.v(returnType)) == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = clsV.getDeclaredMethod("box-impl", gnm0.l(clsV, dre0Var).getReturnType());
                declaredMethod.getClass();
            } catch (NoSuchMethodException unused) {
                c99.u("No box method found in inline class: ", clsV, " (calling ", dre0Var);
                throw null;
            }
        }
        if (dre0Var instanceof ciy) {
            iiy iiyVarC = ((ciy) dre0Var).c();
            iiyVarC.getClass();
            if (gnm0.p((ire0) iiyVarC)) {
                IntRange.e.getClass();
                glt0Var = new glt0(IntRange.f, new Method[0], declaredMethod);
            } else {
                i = -1;
                if ((bv9Var instanceof qv9) || ((qv9) bv9Var).f) {
                    if (!fre0.X(dre0Var)) {
                        parameters = dre0Var.getParameters();
                        if (parameters != null || !parameters.isEmpty()) {
                            it = parameters.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((hre0) it.next()).n() == aiy.f949a) {
                                        ihyVarK = dre0Var.K();
                                        if (ihyVarK instanceof xgy) {
                                            xgyVar = (xgy) ihyVarK;
                                        } else {
                                            xgyVar = null;
                                        }
                                        if (xgyVar != null && xgyVar.I()) {
                                            qpyVarX = xgyVar.X();
                                            if (qpyVarX != null) {
                                                str = qpyVarX.m;
                                            } else {
                                                str = null;
                                            }
                                            if (str != null) {
                                                break;
                                            }
                                        }
                                        i = 1;
                                        break;
                                    }
                                }
                                i = 0;
                                break;
                            }
                        }
                        i = 0;
                        break;
                    }
                    if (!(bv9Var instanceof oq8)) {
                        i = 0;
                        break;
                    }
                }
                this.f15801a.b();
                arrayList = new ArrayList();
                elcVarK = dre0Var.K();
                if (!fre0.X(dre0Var) && (elcVarK instanceof sgy)) {
                    sgyVar2 = (sgy) elcVarK;
                    if (sgyVar2.I()) {
                        arrayList.add(n2x.v(sgyVar2));
                    }
                }
                if (fre0.X(dre0Var)) {
                    if (elcVarK instanceof sgy) {
                        sgyVar = (sgy) elcVarK;
                    } else {
                        sgyVar = null;
                    }
                    if (sgyVar == null && sgyVar.i()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                for (hre0 hre0Var : dre0Var.a()) {
                    if (hre0Var.n() == aiy.f949a || z2) {
                        arrayList.add(hre0Var.p());
                    }
                }
                listA = dre0Var.a();
                if (listA == null && listA.isEmpty()) {
                    size = arrayList.size();
                    break;
                }
                it2 = listA.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((hre0) it2.next()).n() == aiy.c) {
                            size = arrayList.size() - 1;
                            break;
                        }
                    } else {
                        size = arrayList.size();
                        break;
                    }
                }
                listA2 = this.f15801a.a();
                if (listA2 == null && listA2.isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    for (Type type : listA2) {
                        if (!(type instanceof Class) && ((Class) type).getName().equals(fgy.f9517a.f32934a.f34663a) && (i2 = i2 + 1) < 0) {
                            q3d.o();
                            throw null;
                        }
                    }
                }
                if (this.b) {
                    i3 = (((size + i2) + 31) / 32) + 1;
                } else {
                    i3 = 0;
                }
                if (z5 || !((gre0) dre0Var).isSuspend()) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                size2 = arrayList.size() + i + i3 + i4 + i2;
                z3 = this.b;
                if (a().size() == size2) {
                    StringBuilder sb = new StringBuilder("Inconsistent number of parameters in the descriptor and Java reflection object: ");
                    sb.append(this.f15801a.a().size());
                    sb.append(" != ");
                    sb.append(size2);
                    sb.append("\nCalling: ");
                    sb.append(dre0Var);
                    List listA3 = this.f15801a.a();
                    sb.append("\nParameter types: ");
                    sb.append(listA3);
                    sb.append(")\nDefault: ");
                    sb.append(z3);
                    throw new poe(sb.toString());
                }
                intRangeO = l1e0.o(Math.max(i, 0), arrayList.size() + i);
                methodArr = new Method[size2];
                for (i5 = 0; i5 < size2; i5++) {
                    int i6 = intRangeO.f46068a;
                    if (i5 <= intRangeO.b || i6 > i5 || (clsV2 = gnm0.v((kiy) arrayList.get(i5 - i))) == null) {
                        methodL = null;
                    } else {
                        methodL = gnm0.l(clsV2, dre0Var);
                    }
                    methodArr[i5] = methodL;
                }
                it3 = list.iterator();
                while (it3.hasNext()) {
                    methodArr[((Number) it3.next()).intValue()] = null;
                }
                elc elcVarK2 = dre0Var.K();
                if (!fre0.X(dre0Var) && (elcVarK2 instanceof sgy) && ((sgy) elcVarK2).I() && (memberB = this.f15801a.b()) != null) {
                    declaringClass = memberB.getDeclaringClass();
                    if (declaringClass == null) {
                        z4 = false;
                    } else {
                        z4 = !sre0.f32672a.b(declaringClass).I();
                    }
                    if (z4) {
                        methodArr[0] = null;
                    }
                }
                glt0Var = new glt0(intRangeO, methodArr, declaredMethod);
            }
        } else {
            i = -1;
            if (bv9Var instanceof qv9) {
                if (!fre0.X(dre0Var)) {
                    parameters = dre0Var.getParameters();
                    if (parameters != null) {
                        it = parameters.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((hre0) it.next()).n() == aiy.f949a) {
                                    ihyVarK = dre0Var.K();
                                    if (ihyVarK instanceof xgy) {
                                        xgyVar = (xgy) ihyVarK;
                                    } else {
                                        xgyVar = null;
                                    }
                                    if (xgyVar != null) {
                                        qpyVarX = xgyVar.X();
                                        if (qpyVarX != null) {
                                            str = qpyVarX.m;
                                        } else {
                                            str = null;
                                        }
                                        if (str != null) {
                                            break;
                                        }
                                    }
                                    i = 1;
                                    break;
                                }
                            }
                            i = 0;
                            break;
                        }
                    }
                    it = parameters.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((hre0) it.next()).n() == aiy.f949a) {
                                ihyVarK = dre0Var.K();
                                if (ihyVarK instanceof xgy) {
                                    xgyVar = (xgy) ihyVarK;
                                } else {
                                    xgyVar = null;
                                }
                                if (xgyVar != null) {
                                    qpyVarX = xgyVar.X();
                                    if (qpyVarX != null) {
                                        str = qpyVarX.m;
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        break;
                                    }
                                }
                                i = 1;
                                break;
                            }
                        }
                        i = 0;
                        break;
                    }
                }
                if (!(bv9Var instanceof oq8)) {
                    i = 0;
                    break;
                }
            } else {
                if (!fre0.X(dre0Var)) {
                    parameters = dre0Var.getParameters();
                    if (parameters != null) {
                        it = parameters.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((hre0) it.next()).n() == aiy.f949a) {
                                    ihyVarK = dre0Var.K();
                                    if (ihyVarK instanceof xgy) {
                                        xgyVar = (xgy) ihyVarK;
                                    } else {
                                        xgyVar = null;
                                    }
                                    if (xgyVar != null) {
                                        qpyVarX = xgyVar.X();
                                        if (qpyVarX != null) {
                                            str = qpyVarX.m;
                                        } else {
                                            str = null;
                                        }
                                        if (str != null) {
                                            break;
                                        }
                                    }
                                    i = 1;
                                    break;
                                }
                            }
                            i = 0;
                            break;
                        }
                    }
                    it = parameters.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((hre0) it.next()).n() == aiy.f949a) {
                                ihyVarK = dre0Var.K();
                                if (ihyVarK instanceof xgy) {
                                    xgyVar = (xgy) ihyVarK;
                                } else {
                                    xgyVar = null;
                                }
                                if (xgyVar != null) {
                                    qpyVarX = xgyVar.X();
                                    if (qpyVarX != null) {
                                        str = qpyVarX.m;
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        break;
                                    }
                                }
                                i = 1;
                                break;
                            }
                        }
                        i = 0;
                        break;
                    }
                }
                if (!(bv9Var instanceof oq8)) {
                    i = 0;
                    break;
                }
            }
            this.f15801a.b();
            arrayList = new ArrayList();
            elcVarK = dre0Var.K();
            if (!fre0.X(dre0Var)) {
                sgyVar2 = (sgy) elcVarK;
                if (sgyVar2.I()) {
                    arrayList.add(n2x.v(sgyVar2));
                }
            }
            if (fre0.X(dre0Var)) {
                z2 = false;
            } else {
                if (elcVarK instanceof sgy) {
                    sgyVar = (sgy) elcVarK;
                } else {
                    sgyVar = null;
                }
                if (sgyVar == null) {
                    z2 = false;
                } else {
                    z2 = false;
                }
            }
            while (r6.hasNext()) {
                if (hre0Var.n() == aiy.f949a) {
                }
                arrayList.add(hre0Var.p());
            }
            listA = dre0Var.a();
            if (listA == null) {
                it2 = listA.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((hre0) it2.next()).n() == aiy.c) {
                            size = arrayList.size() - 1;
                            break;
                        }
                    } else {
                        size = arrayList.size();
                        break;
                    }
                }
            } else {
                it2 = listA.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((hre0) it2.next()).n() == aiy.c) {
                            size = arrayList.size() - 1;
                            break;
                        }
                    } else {
                        size = arrayList.size();
                        break;
                    }
                }
            }
            listA2 = this.f15801a.a();
            if (listA2 == null) {
                i2 = 0;
                while (r6.hasNext()) {
                    if (!(type instanceof Class)) {
                    }
                }
            } else {
                i2 = 0;
                while (r6.hasNext()) {
                    if (!(type instanceof Class)) {
                    }
                }
            }
            if (this.b) {
                i3 = (((size + i2) + 31) / 32) + 1;
            } else {
                i3 = 0;
            }
            if (z5) {
                i4 = 0;
            } else {
                i4 = 0;
            }
            size2 = arrayList.size() + i + i3 + i4 + i2;
            z3 = this.b;
            if (a().size() == size2) {
                StringBuilder sb2 = new StringBuilder("Inconsistent number of parameters in the descriptor and Java reflection object: ");
                sb2.append(this.f15801a.a().size());
                sb2.append(" != ");
                sb2.append(size2);
                sb2.append("\nCalling: ");
                sb2.append(dre0Var);
                List listA4 = this.f15801a.a();
                sb2.append("\nParameter types: ");
                sb2.append(listA4);
                sb2.append(")\nDefault: ");
                sb2.append(z3);
                throw new poe(sb2.toString());
            }
            intRangeO = l1e0.o(Math.max(i, 0), arrayList.size() + i);
            methodArr = new Method[size2];
            while (i5 < size2) {
                int i7 = intRangeO.f46068a;
                if (i5 <= intRangeO.b) {
                    methodL = null;
                } else {
                    methodL = null;
                }
                methodArr[i5] = methodL;
            }
            it3 = list.iterator();
            while (it3.hasNext()) {
                methodArr[((Number) it3.next()).intValue()] = null;
            }
            elc elcVarK3 = dre0Var.K();
            if (!fre0.X(dre0Var)) {
                declaringClass = memberB.getDeclaringClass();
                if (declaringClass == null) {
                    z4 = false;
                } else {
                    z4 = !sre0.f32672a.b(declaringClass).I();
                }
                if (z4) {
                    methodArr[0] = null;
                }
            }
            glt0Var = new glt0(intRangeO, methodArr, declaredMethod);
        }
        this.c = glt0Var;
    }

    @Override // a.bv9
    public final List a() {
        return this.f15801a.a();
    }

    @Override // a.bv9
    public final Member b() {
        return this.f15801a.b();
    }

    @Override // a.bv9
    public final boolean c() {
        return this.f15801a instanceof ov9;
    }

    @Override // a.bv9
    public final Object call(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Method method;
        objArr.getClass();
        glt0 glt0Var = this.c;
        IntRange intRange = (IntRange) glt0Var.b;
        Method[] methodArr = (Method[]) glt0Var.c;
        Method method2 = (Method) glt0Var.d;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        for (int i = 0; i < length; i++) {
            Object objF = objArr[i];
            int i2 = intRange.f46068a;
            if (i <= intRange.b && i2 <= i && (method = methodArr[i]) != null) {
                if (objF != null) {
                    objF = method.invoke(objF, null);
                } else {
                    Class<?> returnType = method.getReturnType();
                    returnType.getClass();
                    objF = xtt0.f(returnType);
                }
            }
            objArr2[i] = objF;
        }
        Object objCall = this.f15801a.call(objArr2);
        return (objCall == wne.f39444a || method2 == null || (objInvoke = method2.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // a.bv9
    public final Type getReturnType() {
        return this.f15801a.getReturnType();
    }
}
