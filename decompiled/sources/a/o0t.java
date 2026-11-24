package a;

import android.animation.ValueAnimator;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.personal.impl.navigation.PersonalScreen$EditProfileTjScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0t extends rer implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24445a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0t(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f24445a = b;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:219:0x053a  */
    /* JADX WARN: Code duplicated, block: B:263:0x069e  */
    /* JADX WARN: Code duplicated, block: B:268:0x06bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [a.sgy] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v38, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        Object value3;
        boolean zIsAssignableFrom;
        Object next;
        Object next2;
        boolean z;
        ?? arrayList;
        ht30 ht30Var;
        byte b = 4;
        byte b2 = 2;
        yje yjeVar = null;
        Object obj = null;
        byte b3 = 1;
        switch (this.f24445a) {
            case 0:
                e1t e1tVar = (e1t) this.receiver;
                p7m0 p7m0Var = e1tVar.n;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, s0t.a((s0t) value, false, false, true, false, null, false, false, 32383)));
                e1tVar.y();
                return Unit.f46060a;
            case 1:
                e1t e1tVar2 = (e1t) this.receiver;
                bby bbyVar = e1tVar2.q;
                if (bbyVar == null || !bbyVar.isActive()) {
                    e1tVar2.q = sac.V(jiu0.a(e1tVar2), d1t.f5326a, null, e1tVar2.i.c, new b1t(e1tVar2, null, b2), 10);
                }
                return Unit.f46060a;
            case 2:
                x1t x1tVar = (x1t) this.receiver;
                p7m0 p7m0Var2 = x1tVar.m;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, j1t.a((j1t) value2, 0L, 0L, 0, 0L, null, true, true, false, null, false, null, 32607)));
                x1tVar.y();
                return Unit.f46060a;
            case 3:
                x1t x1tVar2 = (x1t) this.receiver;
                p7m0 p7m0Var3 = x1tVar2.m;
                do {
                    value3 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value3, j1t.a((j1t) value3, 0L, 0L, 0, 0L, null, false, false, false, null, false, null, 32511)));
                x1tVar2.x();
                return Unit.f46060a;
            case 4:
                ((x1t) this.receiver).w();
                return Unit.f46060a;
            case 5:
                naw nawVar = (naw) this.receiver;
                String str = nawVar.d == sys0.c ? nawVar.B0 : null;
                if (str == null) {
                    str = "";
                }
                nawVar.Z0.f(new k9w(nawVar.U0, str));
                return Unit.f46060a;
            case 6:
                naw nawVar2 = (naw) this.receiver;
                i1w0 i1w0Var = nawVar2.O;
                if (nawVar2.d == sys0.c) {
                    FragmentScreen fragmentScreenH = nawVar2.p0.h(Integer.parseInt(nawVar2.A0), nawVar2.B0);
                    i1w0Var.getClass();
                    k0w0 k0w0Var = new k0w0(i1w0Var);
                    k0w0Var.c(null);
                    k0w0Var.h(fragmentScreenH);
                    ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    s77 s77Var = nawVar2.D0;
                    if (s77Var == s77.TOTO) {
                        i1w0Var.d(new p8w(nawVar2, (byte) 1));
                    } else if (s77Var == s77.JACKPOT) {
                        i1w0Var.d(new p8w(nawVar2, b2));
                    } else if (s77Var == s77.AGGREGATOR) {
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        FragmentScreen fragmentScreenQ = nawVar2.N.q(new hr1(0L, 3));
                        if (fragmentScreenQ instanceof DialogScreen) {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenQ)));
                        } else {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenQ)));
                        }
                        ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorO2;
                            if (pawVar2.hasNext()) {
                                i1w0Var.a((oe50) pawVar2.next());
                            }
                        }
                    } else {
                        nawVar2.P.q(new bb50(true), true);
                    }
                }
                return Unit.f46060a;
            case 7:
                naw nawVar3 = (naw) this.receiver;
                if (nawVar3.e.f25751a.a()) {
                    nawVar3.G(true);
                }
                return Unit.f46060a;
            case 8:
                lox loxVar = (lox) this.receiver;
                synchronized (loxVar.f) {
                    be60 be60Var = (be60) loxVar.b.g;
                    ReentrantLock reentrantLock = be60Var.f2433a;
                    reentrantLock.lock();
                    try {
                        boolean[] zArr = be60Var.c;
                        Arrays.fill(zArr, 0, zArr.length, false);
                        be60Var.d = true;
                        reentrantLock.unlock();
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return Unit.f46060a;
            case 9:
                Method method = (Method) this.receiver;
                Class cls = Boolean.TYPE;
                method.getClass();
                if (Modifier.isStatic(method.getModifiers())) {
                    zIsAssignableFrom = false;
                } else {
                    g950 g950VarE = g950.e(method.getName());
                    int length = method.getParameterTypes().length;
                    boolean zIsVarArgs = method.isVarArgs();
                    if (g950VarE.equals(d180.i)) {
                        if (length >= 1) {
                            zIsAssignableFrom = true;
                        } else {
                            zIsAssignableFrom = false;
                        }
                    } else if (g950VarE.equals(d180.j)) {
                        if (length < 2 || zIsVarArgs) {
                            zIsAssignableFrom = false;
                        } else {
                            zIsAssignableFrom = true;
                        }
                    } else if (g950VarE.equals(d180.f5300a)) {
                        if (!zIsVarArgs && length == 2) {
                            Class<?> cls2 = method.getParameterTypes()[1];
                            cls2.getClass();
                            if (cls2.isAssignableFrom(iiy.class)) {
                                zIsAssignableFrom = true;
                            }
                        }
                        zIsAssignableFrom = false;
                    } else if (g950VarE.equals(d180.b)) {
                        if (!zIsVarArgs && length == 3) {
                            Class<?> cls3 = method.getParameterTypes()[1];
                            cls3.getClass();
                            if (cls3.isAssignableFrom(iiy.class)) {
                                zIsAssignableFrom = true;
                            }
                        }
                        zIsAssignableFrom = false;
                    } else if (g950VarE.equals(d180.c)) {
                        if (!zIsVarArgs && length == 2) {
                            Class<?> cls4 = method.getParameterTypes()[1];
                            cls4.getClass();
                            if (cls4.isAssignableFrom(iiy.class)) {
                                zIsAssignableFrom = true;
                            }
                        }
                        zIsAssignableFrom = false;
                    } else if (g950VarE.equals(d180.g)) {
                        zIsAssignableFrom = true;
                    } else if (g950VarE.equals(d180.f)) {
                        if (length == 1 && !zIsVarArgs && Intrinsics.d(method.getReturnType(), cls)) {
                            zIsAssignableFrom = true;
                        } else {
                            zIsAssignableFrom = false;
                        }
                    } else if (g950VarE.equals(d180.h)) {
                        if (length == 0) {
                            zIsAssignableFrom = true;
                        } else {
                            zIsAssignableFrom = false;
                        }
                    } else if (g950VarE.equals(d180.k)) {
                        if (length == 0) {
                            zIsAssignableFrom = true;
                        } else {
                            zIsAssignableFrom = false;
                        }
                    } else if (g950VarE.equals(d180.l)) {
                        if (length == 0 && Intrinsics.d(method.getReturnType(), cls)) {
                            zIsAssignableFrom = true;
                        } else {
                            zIsAssignableFrom = false;
                        }
                    } else if (g950VarE.equals(d180.d)) {
                        if (length == 1 && Intrinsics.d(method.getParameterTypes()[0], Object.class)) {
                            zIsAssignableFrom = true;
                        } else {
                            zIsAssignableFrom = false;
                        }
                    } else if (g950VarE.equals(d180.e)) {
                        if (Intrinsics.d(method.getReturnType(), Integer.TYPE) && length == 1 && !zIsVarArgs) {
                            zIsAssignableFrom = true;
                        } else {
                            zIsAssignableFrom = false;
                        }
                    } else if (d180.y.contains(g950VarE)) {
                        if (length != 1 || zIsVarArgs) {
                            zIsAssignableFrom = false;
                        } else {
                            zIsAssignableFrom = true;
                        }
                    } else if (d180.x.contains(g950VarE)) {
                        if (length == 0) {
                            zIsAssignableFrom = true;
                        } else {
                            zIsAssignableFrom = false;
                        }
                    } else if (g950VarE.equals(d180.n) || g950VarE.equals(d180.o)) {
                        zIsAssignableFrom = method.getDeclaringClass().isAssignableFrom(method.getReturnType());
                    } else {
                        if (!d180.z.contains(g950VarE)) {
                            String strB = g950VarE.b();
                            if (strB != null) {
                                zIsAssignableFrom = d180.m.g(strB);
                            }
                        } else if (Intrinsics.d(method.getReturnType(), Void.TYPE) && length == 1 && !zIsVarArgs) {
                            zIsAssignableFrom = true;
                        }
                        zIsAssignableFrom = false;
                    }
                }
                return Boolean.valueOf(zIsAssignableFrom);
            case 10:
                xgy xgyVar = (xgy) this.receiver;
                xgyVar.getClass();
                a8z a8zVar = xgyVar.c;
                if (!aao0.b || aao0.f538a || xgyVar.Z()) {
                    lc00 lc00VarB = kotlin.collections.a.b();
                    lc00VarB.addAll(((vgy) a8zVar.getValue()).a());
                    cr30 cr30VarY = xgyVar.W().I().y();
                    rq30 rq30Var = rq30.b;
                    lc00VarB.addAll(ahy.b0(xgyVar, cr30VarY, rq30Var));
                    cr30 cr30VarU = xgyVar.W().U();
                    cr30VarU.getClass();
                    lc00VarB.addAll(ahy.b0(xgyVar, cr30VarU, rq30Var));
                    return kotlin.collections.a.a(lc00VarB);
                }
                mre0 mre0Var = ((vgy) a8zVar.getValue()).p;
                iiy iiyVar = vgy.r[12];
                Object objInvoke = mre0Var.invoke();
                objInvoke.getClass();
                Map map = (Map) objInvoke;
                Class clsG = azw.G(xgyVar);
                gi2 gi2Var = two.f34660a;
                boolean z2 = clsG.getAnnotation(Metadata.class) != null;
                int size = map.size();
                HashMap map2 = new HashMap(size >= 3 ? (size / 3) + size + 1 : 3);
                for (Map.Entry entry : map.entrySet()) {
                    dre0 dre0Var = (dre0) entry.getValue();
                    if (!z2 || !two.f(dre0Var) || !((ere0) dre0Var).f8277a.c()) {
                        if (!dre0Var.t() || Intrinsics.d(two.d(dre0Var).j().getPackage(), azw.G(xgyVar).getPackage())) {
                            map2.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                Collection collectionValues = map2.values();
                collectionValues.getClass();
                Collection collectionA = ((vgy) a8zVar.getValue()).a();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collectionA) {
                    if (two.e(xgyVar, (dre0) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                return CollectionsKt.q0(collectionValues, arrayList2);
            case 11:
                xgy xgyVar2 = (xgy) this.receiver;
                xgyVar2.getClass();
                lc00 lc00VarB2 = kotlin.collections.a.b();
                if (aao0.f538a) {
                    cr30 cr30VarY2 = xgyVar2.W().I().y();
                    rq30 rq30Var2 = rq30.f30912a;
                    lc00VarB2.addAll(ahy.b0(xgyVar2, cr30VarY2, rq30Var2));
                    cr30 cr30VarU2 = xgyVar2.W().U();
                    cr30VarU2.getClass();
                    lc00VarB2.addAll(ahy.b0(xgyVar2, cr30VarU2, rq30Var2));
                } else {
                    boolean Z = xgyVar2.Z();
                    Class cls5 = xgyVar2.b;
                    if (Z || xgyVar2.X() != null) {
                        cr30 cr30VarY3 = xgyVar2.W().I().y();
                        rq30 rq30Var3 = rq30.f30912a;
                        lc00VarB2.addAll(ahy.b0(xgyVar2, cr30VarY3, rq30Var3));
                        cr30 cr30VarU3 = xgyVar2.W().U();
                        cr30VarU3.getClass();
                        lc00VarB2.addAll(ahy.b0(xgyVar2, cr30VarU3, rq30Var3));
                    } else {
                        for (Object obj3 : ahy.a0(xgyVar2)) {
                            n9y n9yVar = (n9y) obj3;
                            n9yVar.getClass();
                            List listK = g8x.K(g950.e(n9yVar.getName()));
                            if (listK != null && listK.isEmpty()) {
                                lc00VarB2.add(obj3);
                            }
                            Iterator it = listK.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    lc00VarB2.add(obj3);
                                }
                                String strB2 = ((g950) it.next()).b();
                                strB2.getClass();
                                List listB = xgyVar2.b();
                                ArrayList<giy> arrayList3 = new ArrayList();
                                Iterator it2 = listB.iterator();
                                while (it2.hasNext()) {
                                    fhy fhyVarO = ((kiy) it2.next()).o();
                                    ?? r13 = fhyVarO instanceof sgy ? (sgy) fhyVarO : yjeVar;
                                    if (r13 != 0) {
                                        Collection collectionS = r13.s();
                                        ArrayList arrayList4 = new ArrayList();
                                        for (Object obj4 : collectionS) {
                                            qgy qgyVar = (qgy) obj4;
                                            if ((qgyVar instanceof giy) && (qgyVar instanceof ire0)) {
                                                dre0 dre0Var2 = (dre0) qgyVar;
                                                if (!two.f(dre0Var2)) {
                                                    List listA = dre0Var2.a();
                                                    if (listA != null && listA.isEmpty()) {
                                                        arrayList4.add(obj4);
                                                    }
                                                    Iterator it3 = listA.iterator();
                                                    do {
                                                        if (!it3.hasNext()) {
                                                            arrayList4.add(obj4);
                                                        }
                                                        break;
                                                    } while (((hre0) it3.next()).n() != aiy.c);
                                                    break;
                                                }
                                            }
                                        }
                                        arrayList = new ArrayList();
                                        for (Object obj5 : arrayList4) {
                                            if (Intrinsics.d(((giy) obj5).getName(), strB2)) {
                                                arrayList.add(obj5);
                                            }
                                        }
                                    } else {
                                        arrayList = 0;
                                    }
                                    if (arrayList == 0) {
                                        arrayList = iun.f15405a;
                                    }
                                    w3d.u(arrayList3, arrayList);
                                    yjeVar = null;
                                }
                                if (!arrayList3.isEmpty()) {
                                    for (giy giyVar : arrayList3) {
                                        ygy ygyVar = new ygy(n9yVar, xgyVar2, (byte) 0);
                                        if (!(giyVar instanceof t9y)) {
                                            Iterator it4 = ((Iterable) ygyVar.invoke(aey.a(giyVar.getName()))).iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    next = it4.next();
                                                    gre0 gre0Var = (gre0) next;
                                                    if (!z1x.K(gre0Var).isEmpty() || !d7x.E(gre0Var.getReturnType(), giyVar.getReturnType())) {
                                                    }
                                                } else {
                                                    next = null;
                                                }
                                            }
                                            gre0 gre0Var2 = (gre0) next;
                                            Iterator it5 = ((Iterable) ygyVar.invoke(aey.b(giyVar.getName()))).iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    next2 = it5.next();
                                                    gre0 gre0Var3 = (gre0) next2;
                                                    ArrayList arrayListK = z1x.K(gre0Var3);
                                                    if (arrayListK.size() != 1 || !Intrinsics.d(gre0Var3.getReturnType(), g4m0.e) || !n6x.m(((hre0) CollectionsKt.v0(arrayListK)).p(), giyVar.getReturnType())) {
                                                    }
                                                } else {
                                                    next2 = null;
                                                }
                                            }
                                            gre0 gre0Var4 = (gre0) next2;
                                            if (gre0Var2 != null && (!((z = giyVar instanceof uhy)) || (gre0Var4 != null && gre0Var4.m() == gre0Var2.m()))) {
                                                if (z) {
                                                }
                                                String name = n9yVar.getName();
                                                name.getClass();
                                                if (!kotlin.text.c.x(name, "set", false)) {
                                                }
                                                break;
                                                break;
                                            }
                                        }
                                    }
                                }
                                yjeVar = null;
                                break;
                            }
                            break;
                            yjeVar = null;
                        }
                        for (Object obj6 : ahy.b0(xgyVar2, xgyVar2.W().I().y(), rq30.f30912a)) {
                            if (((ock) obj6) instanceof iiy) {
                                lc00VarB2.add(obj6);
                            }
                        }
                        Method[] declaredMethods = cls5.getDeclaredMethods();
                        declaredMethods.getClass();
                        for (Method method2 : declaredMethods) {
                            if (Modifier.isStatic(method2.getModifiers()) && !method2.isSynthetic()) {
                                lc00VarB2.add(new n9y(xgyVar2, method2, op9.NO_RECEIVER, rgy.k));
                            }
                        }
                        Field[] declaredFields = cls5.getDeclaredFields();
                        declaredFields.getClass();
                        for (Field field : declaredFields) {
                            if (!field.isEnumConstant() && Modifier.isStatic(field.getModifiers()) && !field.isSynthetic()) {
                                if (Modifier.isFinal(field.getModifiers())) {
                                    lc00VarB2.add(new t9y(xgyVar2, field, op9.NO_RECEIVER, rgy.k));
                                } else {
                                    lc00VarB2.add(new k9y(xgyVar2, field, op9.NO_RECEIVER, rgy.k));
                                }
                            }
                        }
                        if (cls5.isEnum()) {
                            lc00VarB2.add(new b9y(xgyVar2));
                        }
                    }
                }
                return kotlin.collections.a.a(lc00VarB2);
            case 12:
                ef00 ef00Var = (ef00) this.receiver;
                ef00Var.x0.f(new oe00(((smu) ef00Var.a0.get()).a(), ((rmu) ef00Var.b0.get()).a()));
                return Unit.f46060a;
            case 13:
                nt00 nt00Var = (nt00) this.receiver;
                String str2 = (String) nt00Var.f.a("QUERY_KEY");
                if (str2 == null) {
                    str2 = "";
                }
                nt00Var.x(str2);
                return Unit.f46060a;
            case 14:
                v3c.N(((nt00) this.receiver).j);
                return Unit.f46060a;
            case 15:
                ((nt00) this.receiver).i.f(gt00.f11858a);
                return Unit.f46060a;
            case 16:
                ((e910) this.receiver).w(v06.f36567a);
                return Unit.f46060a;
            case 17:
                i1w0 i1w0Var2 = ((vq10) this.receiver).q;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorP;
                    if (!pawVar3.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar3.next());
                }
                break;
            case 18:
                cx10 cx10Var = (cx10) this.receiver;
                i1w0 i1w0Var3 = cx10Var.d;
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var3);
                cx10Var.j.getClass();
                FragmentScreen fragmentScreen = PersonalScreen$EditProfileTjScreen.f46781a;
                if (fragmentScreen instanceof DialogScreen) {
                    copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                } else {
                    copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                }
                ListIterator listIteratorO3 = b1j.o(i1w0Var3, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar4 = (paw) listIteratorO3;
                    if (!pawVar4.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var3.a((oe50) pawVar4.next());
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                h620 h620Var = (h620) this.receiver;
                c4m0 c4m0Var = h620Var.c0;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    h620Var.c0 = sac.T(new fnq(h620Var.u.b(), new a620(h620Var, yjeVar, b3), b), d5c.S(jiu0.a(h620Var), h620Var.c.b), new sax(b2, yjeVar, (byte) 11));
                }
                return Unit.f46060a;
            case 20:
                qg20 qg20Var = (qg20) this.receiver;
                c4m0 c4m0Var2 = qg20Var.S0;
                if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                    qg20Var.S0 = sac.T(new fnq(qg20Var.G.b(), new jf20(qg20Var, yjeVar, b3), b), d5c.S(jiu0.a(qg20Var), qg20Var.d.b), new sax(b2, yjeVar, (byte) 16));
                }
                return Unit.f46060a;
            case 21:
                e730 e730Var = (e730) this.receiver;
                e730Var.getClass();
                sac.V(jiu0.a(e730Var), new du20(1, e730Var.j, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, null, new a730(e730Var, yjeVar, b3), 14);
                return Unit.f46060a;
            case 22:
                f730 f730Var = (f730) this.receiver;
                f730Var.getClass();
                sac.V(jiu0.a(f730Var), new du20(1, f730Var.j, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, null, new b730(f730Var, yjeVar, b3), 14);
                return Unit.f46060a;
            case 23:
                fb30 fb30Var = (fb30) this.receiver;
                ValueAnimator valueAnimator = fb30Var.c;
                if (valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                fb30Var.d.start();
                return Unit.f46060a;
            case 24:
                fb30 fb30Var2 = (fb30) this.receiver;
                ValueAnimator valueAnimator2 = fb30Var2.d;
                if (valueAnimator2.isRunning()) {
                    valueAnimator2.cancel();
                }
                fb30Var2.c.start();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                dq00 dq00Var = ((zk30) this.receiver).k;
                wgh0 wgh0Var = wgh0.MY_AGGREGATOR;
                ((yo4) dq00Var.b).m("medal_table");
                ((zr1) dq00Var.c).q("medal_table");
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((zk30) this.receiver).x();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                zk30 zk30Var = (zk30) this.receiver;
                dq00 dq00Var2 = zk30Var.k;
                int i = zk30Var.c;
                b1j.w("championship_id", Integer.valueOf(i), ((yo4) dq00Var2.b).f42966a, "bet_statistic_medal_table_filter_call");
                b1j.r(i, ((zr1) dq00Var2.c).f44833a, 3117L);
                p7m0 p7m0Var4 = zk30Var.o;
                w0k0 w0k0Var = new w0k0(i, ((nk30) zk30Var.n.getValue()).f23664a);
                p7m0Var4.getClass();
                p7m0Var4.o(null, w0k0Var);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ns30 ns30Var = (ns30) this.receiver;
                ys30 ys30Var = ns30Var.l;
                if (ys30Var != null) {
                    tr30 tr30Var = ys30Var.e;
                    int i2 = tr30Var.e;
                    xr30[] xr30VarArr = xr30.f41350a;
                    if (i2 != 0) {
                        for (Object obj7 : ht30.b) {
                            if (((ht30) obj7).getId() == tr30Var.f) {
                                obj = obj7;
                                ht30Var = (ht30) obj;
                                if (ht30Var != null) {
                                    ns30Var.w(c16.f3559a);
                                    ns30Var.B(tr30Var, ht30Var);
                                }
                            }
                        }
                        ht30Var = (ht30) obj;
                        if (ht30Var != null) {
                            ns30Var.w(c16.f3559a);
                            ns30Var.B(tr30Var, ht30Var);
                        }
                    }
                }
                return Unit.f46060a;
            default:
                ((Function0) this.receiver).invoke();
                return Unit.f46060a;
        }
    }
}
