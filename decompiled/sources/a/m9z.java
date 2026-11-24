package a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class m9z implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21435a = 1;
    public final f7u b;
    public final p9z c;

    public m9z(f7u f7uVar, p9z p9zVar) {
        this.b = f7uVar;
        this.c = p9zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [a.flc, a.oer, a.p8y] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [a.p9z] */
    /* JADX WARN: Type inference failed for: r8v6, types: [a.p9z] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        mqe0 mqe0Var;
        wm40 wm40Var;
        Class cls;
        ArrayList arrayList;
        List listK;
        ?? arrayList2;
        ?? r8;
        ?? r9;
        Pair pair;
        List listD;
        byte b = this.f21435a;
        f7u f7uVar = this.b;
        switch (b) {
            case 0:
                f93 f93Var = ujn.c;
                p9z p9zVar = this.c;
                mqe0 mqe0Var2 = p9zVar.o;
                f7u f7uVar2 = p9zVar.b;
                wm40 wm40Var2 = p9zVar.n;
                Constructor<?>[] declaredConstructors = mqe0Var2.f22221a.getDeclaredConstructors();
                declaredConstructors.getClass();
                List<pqe0> listT = pgi0.t(pgi0.p(pgi0.i(tx3.t(declaredConstructors), hqe0.f13483a), iqe0.f15208a));
                ArrayList arrayList3 = new ArrayList(listT.size());
                for (pqe0 pqe0Var : listT) {
                    p8y p8yVarF1 = p8y.F1(wm40Var2, r8x.W(f7uVar2, pqe0Var), false, m2a.v(pqe0Var));
                    f7u f7uVar3 = new f7u((v7i) f7uVar2.b, new ucs0(f7uVar2, p8yVarF1, pqe0Var, wm40Var2.M().size()), (a8z) f7uVar2.d);
                    Constructor constructor = pqe0Var.f27412a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    genericParameterTypes.getClass();
                    if (genericParameterTypes.length == 0) {
                        listD = iun.f15405a;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) qx3.k(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            e9d0.v(constructor, "Illegal generic signature: ");
                            return null;
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) qx3.k(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                        }
                        parameterAnnotations.getClass();
                        listD = pqe0Var.d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    rsq rsqVarU = baz.u(f7uVar3, p8yVarF1, listD);
                    List listM = wm40Var2.M();
                    listM.getClass();
                    ArrayList typeParameters = pqe0Var.getTypeParameters();
                    ArrayList arrayList4 = new ArrayList(r3d.q(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        p9z p9zVar2 = p9zVar;
                        hzs0 hzs0VarC = ((mzs0) f7uVar3.c).c((are0) it.next());
                        hzs0VarC.getClass();
                        arrayList4.add(hzs0VarC);
                        p9zVar = p9zVar2;
                    }
                    p8yVarF1.D1(rsqVarU.f31043a, u4n0.u(pqe0Var.e()), CollectionsKt.q0(listM, arrayList4));
                    p8yVarF1.v1(false);
                    p8yVarF1.w1(rsqVarU.b);
                    p8yVarF1.x1(wm40Var2.I());
                    arrayList3.add(p8yVarF1);
                    p9zVar = p9zVar;
                }
                p9z p9zVar3 = p9zVar;
                boolean zG = mqe0Var2.g();
                Class cls2 = mqe0Var2.f22221a;
                if (zG) {
                    Object obj = f7uVar2.b;
                    p8y p8yVarF2 = p8y.F1(wm40Var2, f93Var, true, m2a.v(mqe0Var2));
                    ArrayList<yqe0> arrayListF = mqe0Var2.f();
                    ArrayList arrayList5 = new ArrayList(arrayListF.size());
                    boolean z = false;
                    Object obj2 = null;
                    fay fayVarY = xvw.Y(b0t0.b, false, null, 6);
                    int i = 0;
                    for (yqe0 yqe0Var : arrayListF) {
                        ArrayList arrayList6 = arrayList5;
                        Class cls3 = cls2;
                        p8y p8yVar = p8yVarF2;
                        arrayList6.add(new k3u0(p8yVar, null, i, f93Var, yqe0Var.c(), ((nvu) f7uVar2.e).V(yqe0Var.f(), fayVarY), false, false, false, null, m2a.v(yqe0Var)));
                        arrayList3 = arrayList3;
                        arrayList5 = arrayList6;
                        p8yVarF2 = p8yVar;
                        i++;
                        mqe0Var2 = mqe0Var2;
                        wm40Var2 = wm40Var2;
                        cls2 = cls3;
                        fayVarY = fayVarY;
                        z = false;
                        obj2 = null;
                    }
                    mqe0Var = mqe0Var2;
                    wm40Var = wm40Var2;
                    cls = cls2;
                    ArrayList arrayList7 = arrayList5;
                    flc flcVar = p8yVarF2;
                    arrayList = arrayList3;
                    flcVar.w1(z);
                    tek visibility = wm40Var.getVisibility();
                    visibility.getClass();
                    if (visibility.equals(w8y.b)) {
                        visibility = w8y.c;
                        visibility.getClass();
                    }
                    flcVar.C1(arrayList7, visibility);
                    flcVar.v1(z);
                    flcVar.x1(wm40Var.I());
                    String strW = m7x.w(flcVar, 2);
                    if (arrayList.isEmpty()) {
                        arrayList.add(flcVar);
                        Object obj3 = f7uVar.b;
                    } else {
                        Iterator it2 = arrayList.iterator();
                        do {
                            if (!it2.hasNext()) {
                                arrayList.add(flcVar);
                                Object obj4 = f7uVar.b;
                            }
                        } while (!m7x.w((flc) it2.next(), 2).equals(strW));
                    }
                } else {
                    mqe0Var = mqe0Var2;
                    wm40Var = wm40Var2;
                    cls = cls2;
                    arrayList = arrayList3;
                }
                wm40 wm40Var3 = wm40Var;
                ((kld) ((e6o0) ((v7i) f7uVar.b).o)).a(wm40Var3, arrayList, f7uVar);
                cge0 cge0Var = (cge0) ((v7i) f7uVar.b).f36925a;
                if (arrayList.isEmpty()) {
                    boolean zIsAnnotation = cls.isAnnotation();
                    cls.isInterface();
                    if (zIsAnnotation) {
                        Object obj5 = f7uVar2.b;
                        nvu nvuVar = (nvu) f7uVar2.e;
                        ?? F1 = p8y.F1(wm40Var3, f93Var, true, m2a.v(mqe0Var));
                        if (zIsAnnotation) {
                            List listD2 = mqe0Var.d();
                            arrayList2 = new ArrayList(listD2.size());
                            fay fayVarY2 = xvw.Y(b0t0.b, true, null, 6);
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList<vqe0> arrayList9 = new ArrayList();
                            for (Object obj6 : listD2) {
                                if (Intrinsics.d(((vqe0) obj6).c(), bey.b)) {
                                    arrayList8.add(obj6);
                                } else {
                                    arrayList9.add(obj6);
                                }
                            }
                            arrayList8.size();
                            vqe0 vqe0Var = (vqe0) CollectionsKt.firstOrNull(arrayList8);
                            if (vqe0Var != null) {
                                zqe0 zqe0VarF = vqe0Var.f();
                                if (zqe0VarF instanceof gqe0) {
                                    gqe0 gqe0Var = (gqe0) zqe0VarF;
                                    pair = new Pair(nvuVar.U(gqe0Var, fayVarY2, true), nvuVar.V(gqe0Var.b, fayVarY2));
                                } else {
                                    pair = new Pair(nvuVar.V(zqe0VarF, fayVarY2), null);
                                }
                                ?? r10 = p9zVar3;
                                r10.v(arrayList2, F1, 0, vqe0Var, (wsy) pair.f46059a, (wsy) pair.b);
                                r9 = r10;
                            } else {
                                r9 = p9zVar3;
                            }
                            int i2 = vqe0Var != null ? 1 : 0;
                            int i3 = 0;
                            for (vqe0 vqe0Var2 : arrayList9) {
                                r9.v(arrayList2, F1, i3 + i2, vqe0Var2, nvuVar.V(vqe0Var2.f(), fayVarY2), null);
                                i3++;
                            }
                        } else {
                            arrayList2 = Collections.EMPTY_LIST;
                        }
                        F1.w1(false);
                        tek visibility2 = wm40Var3.getVisibility();
                        visibility2.getClass();
                        if (visibility2.equals(w8y.b)) {
                            visibility2 = w8y.c;
                            visibility2.getClass();
                        }
                        F1.C1(arrayList2, visibility2);
                        F1.v1(true);
                        F1.x1(wm40Var3.I());
                        r8 = F1;
                    } else {
                        r8 = 0;
                    }
                    listK = q3d.k(r8);
                } else {
                    listK = arrayList;
                }
                return CollectionsKt.L0(cge0Var.e(f7uVar, listK));
            default:
                return CollectionsKt.P0(((kld) ((e6o0) ((v7i) f7uVar.b).o)).f(this.c.n, f7uVar));
        }
    }

    public m9z(p9z p9zVar, f7u f7uVar) {
        this.c = p9zVar;
        this.b = f7uVar;
    }
}
