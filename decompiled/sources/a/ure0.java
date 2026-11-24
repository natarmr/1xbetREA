package a;

import android.gov.nist.core.Separators;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public class ure0 extends tre0 {
    public static ihy l(op9 op9Var) {
        ghy owner = op9Var.getOwner();
        return owner instanceof ihy ? (ihy) owner : ztn.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.tre0
    public final jhy a(qer qerVar) {
        ihy ihyVarL = l(qerVar);
        String name = qerVar.getName();
        String signature = qerVar.getSignature();
        if (!aao0.f538a) {
            boolean z = ihyVarL instanceof xgy;
            int i = 0;
            boolean z2 = z && ((xgy) ihyVarL).b.getAnnotation(Metadata.class) == null && !tke.X((sgy) ihyVarL);
            if (name.equals("<init>")) {
                Object obj = null;
                constructor = null;
                Constructor<?> constructor = null;
                obj = null;
                if (!z2) {
                    signature.getClass();
                    Iterator it = ihyVarL.E().iterator();
                    Object obj2 = null;
                    while (true) {
                        if (!it.hasNext()) {
                            if (i == 0) {
                                break;
                            }
                            obj = obj2;
                            break;
                        }
                        Object next = it.next();
                        upy upyVar = (upy) next;
                        upyVar.getClass();
                        zpy zpyVar = sey.b;
                        zpyVar.getClass();
                        if (String.valueOf(((sey) slb.V(upyVar.f, zpyVar)).f32094a).equals(signature)) {
                            if (i != 0) {
                                break;
                            }
                            i = 1;
                            obj2 = next;
                        }
                    }
                    upy upyVar2 = (upy) obj;
                    if (upyVar2 != null) {
                        return new qry(ihyVarL, signature, qerVar.getBoundReceiver(), upyVar2);
                    }
                    String strB0 = CollectionsKt.b0(ihyVarL.E(), Separators.RETURN, null, null, j9x.o, 30);
                    StringBuilder sb = new StringBuilder("Constructor (JVM signature: ");
                    sb.append(signature);
                    sb.append(") not resolved in ");
                    sb.append(ihyVarL);
                    sb.append(':');
                    sb.append(strB0.length() != 0 ? " several matching constructors found:\n".concat(strB0) : " no constructors found");
                    throw new poe(sb.toString());
                }
                signature.getClass();
                Constructor<?>[] declaredConstructors = ihyVarL.j().getDeclaredConstructors();
                declaredConstructors.getClass();
                int length = declaredConstructors.length;
                boolean z3 = false;
                Constructor<?> constructor2 = null;
                while (true) {
                    if (i >= length) {
                        if (!z3) {
                            break;
                        }
                        constructor = constructor2;
                        break;
                    }
                    Constructor<?> constructor3 = declaredConstructors[i];
                    constructor3.getClass();
                    if (azw.J(constructor3).equals(signature)) {
                        if (z3) {
                            break;
                        }
                        z3 = true;
                        constructor2 = constructor3;
                    }
                    i++;
                    z3 = z3;
                }
                if (constructor != null) {
                    return new h9y(ihyVarL, constructor, qerVar.getBoundReceiver());
                }
                Constructor<?>[] declaredConstructors2 = ihyVarL.j().getDeclaredConstructors();
                declaredConstructors2.getClass();
                String strN = tx3.N(declaredConstructors2, Separators.RETURN, null, null, j9x.p, 30);
                StringBuilder sb2 = new StringBuilder("Constructor (JVM signature: ");
                sb2.append(signature);
                sb2.append(") not resolved in ");
                sb2.append(ihyVarL);
                sb2.append(':');
                sb2.append(strN.length() != 0 ? Separators.RETURN.concat(strN) : " no constructors found");
                throw new poe(sb2.toString());
            }
            if (ihyVarL instanceof zhy) {
                signature.getClass();
                zhy zhyVar = (zhy) ihyVarL;
                ArrayList arrayListT = zhyVar.T();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : arrayListT) {
                    bqy bqyVar = (bqy) obj3;
                    if (Intrinsics.d(bqyVar.b, name) && String.valueOf(j0x.u(bqyVar).f39041a).equals(signature)) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.size() == 1) {
                    return new bsy(ihyVarL, signature, qerVar.getBoundReceiver(), (bqy) CollectionsKt.v0(arrayList), rgy.k);
                }
                String strB1 = CollectionsKt.b0(zhyVar.T(), Separators.RETURN, null, null, j9x.l, 30);
                StringBuilder sbN = b1j.n("Function '", name, "' (JVM signature: ", signature, ") not resolved in ");
                sbN.append(ihyVarL);
                sbN.append(':');
                sbN.append(strB1.length() == 0 ? " no members found" : " several matching members found:\n".concat(strB1));
                throw new poe(sbN.toString());
            }
            if (z) {
                xgy xgyVar = (xgy) ihyVarL;
                if (!xgyVar.Z() && z2) {
                    signature.getClass();
                    String strSubstring = signature.substring(StringsKt.U('(', 0, 6, signature), signature.length());
                    zri zriVarM = xtt0.m(bqe0.d(xgyVar.j()), strSubstring, true);
                    Class[] clsArr = (Class[]) ((ArrayList) zriVarM.b).toArray(new Class[0]);
                    Class cls = (Class) zriVarM.c;
                    cls.getClass();
                    Method methodR = ihy.R(ihyVarL.P(), name, clsArr, cls, false);
                    if (methodR != null) {
                        return new n9y(ihyVarL, methodR, qerVar.getBoundReceiver(), rgy.k);
                    }
                    Method[] declaredMethods = xgyVar.b.getDeclaredMethods();
                    declaredMethods.getClass();
                    String strN2 = tx3.N(declaredMethods, Separators.RETURN, null, null, j9x.n, 30);
                    StringBuilder sbN2 = b1j.n("Method '", name, "' (JVM signature: ", strSubstring, ") not resolved in ");
                    sbN2.append(ihyVarL);
                    sbN2.append(':');
                    sbN2.append(strN2.length() == 0 ? " no methods found" : Separators.RETURN.concat(strN2));
                    throw new poe(sbN2.toString());
                }
            }
        }
        Object boundReceiver = qerVar.getBoundReceiver();
        name.getClass();
        signature.getClass();
        return new qck(ihyVarL, name, signature, null, boundReceiver, rgy.k);
    }

    @Override // a.tre0
    public final sgy b(Class cls) {
        return ck9.a(cls);
    }

    @Override // a.tre0
    public final ghy c(Class cls) {
        c5k c5kVar = ck9.f4494a;
        cls.getClass();
        return (ghy) ck9.b.c(cls);
    }

    @Override // a.tre0
    public final rhy d(cz40 cz40Var) {
        ihy ihyVarL = l(cz40Var);
        String name = cz40Var.getName();
        String signature = cz40Var.getSignature();
        if (aao0.f538a) {
            return new sck(ihyVarL, name, signature, cz40Var.getBoundReceiver());
        }
        qig qigVar = new qig(signature, ihyVarL, cz40Var, name, (byte) 3);
        name.getClass();
        return new haz(name, qigVar);
    }

    @Override // a.tre0
    public final thy e(dz40 dz40Var) {
        ihy ihyVarL = l(dz40Var);
        String name = dz40Var.getName();
        String signature = dz40Var.getSignature();
        if (aao0.f538a) {
            return new uck(ihyVarL, name, signature, dz40Var.getBoundReceiver());
        }
        qig qigVar = new qig(ihyVarL, name, signature, dz40Var, (byte) 5);
        name.getClass();
        return new iaz(name, qigVar);
    }

    @Override // a.tre0
    public final eiy f(h0d0 h0d0Var) {
        ihy ihyVarL = l(h0d0Var);
        String name = h0d0Var.getName();
        String signature = h0d0Var.getSignature();
        return !aao0.f538a ? new jaz(name, new qig(signature, ihyVarL, h0d0Var, name, (byte) 2)) : new kdk(ihyVarL, name, signature, h0d0Var.getBoundReceiver());
    }

    @Override // a.tre0
    public final giy g(i0d0 i0d0Var) {
        ihy ihyVarL = l(i0d0Var);
        String name = i0d0Var.getName();
        String signature = i0d0Var.getSignature();
        return !aao0.f538a ? new kaz(name, new qig(ihyVarL, name, signature, i0d0Var, (byte) 4)) : new ndk(ihyVarL, name, signature, i0d0Var.getBoundReceiver());
    }

    @Override // a.tre0
    public final hiy h(k0d0 k0d0Var) {
        return new qdk(l(k0d0Var), k0d0Var.getName(), k0d0Var.getSignature());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0011  */
    @Override // a.tre0
    public final String i(ger gerVar) {
        qck qckVar;
        Metadata metadata = (Metadata) gerVar.getClass().getAnnotation(Metadata.class);
        Object obj = null;
        if (metadata == null) {
            qckVar = null;
        } else {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 == null) {
                qckVar = null;
            } else {
                Pair pairG = egy.g(strArrD1, metadata.d2());
                ify ifyVar = (ify) pairG.f46059a;
                i3d0 i3d0Var = (i3d0) pairG.b;
                vd40 vd40Var = new vd40(metadata.mv(), (metadata.xi() & 8) != 0);
                Class<?> cls = gerVar.getClass();
                g4d0 g4d0Var = i3d0Var.q;
                g4d0Var.getClass();
                qckVar = new qck(ztn.b, (fyj0) xtt0.g(cls, qre0.f29207a, i3d0Var, ifyVar, new roi0(g4d0Var), vd40Var, lre0.f20528a));
            }
        }
        if (qckVar == null) {
            return super.i(gerVar);
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = qckVar.getParameters().iterator();
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                obj = obj2;
                break;
            }
            Object next = it.next();
            if (((hre0) next).n() == aiy.c) {
                if (z) {
                    break;
                }
                z = true;
                obj2 = next;
            }
        }
        hre0 hre0Var = (hre0) obj;
        if (hre0Var != null) {
            sb.append(rv00.z(hre0Var.p(), false));
            sb.append(Separators.DOT);
        }
        CollectionsKt.a0(z1x.K(qckVar), sb, ", ", Separators.LPAREN, Separators.RPAREN, b180.o, 48);
        sb.append(" -> ");
        sb.append(rv00.z(qckVar.getReturnType(), false));
        return sb.toString();
    }

    @Override // a.tre0
    public final String j(guy guyVar) {
        return i(guyVar);
    }

    @Override // a.tre0
    public final kiy k(sgy sgyVar, List list, boolean z) {
        if (!(sgyVar instanceof elc)) {
            return x2x.O(sgyVar, list, z, Collections.EMPTY_LIST, null);
        }
        Class clsJ = ((elc) sgyVar).j();
        c5k c5kVar = ck9.f4494a;
        clsJ.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return z ? (v2) ck9.d.c(clsJ) : (v2) ck9.c.c(clsJ);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ck9.e.c(clsJ);
        Pair pair = new Pair(list, Boolean.valueOf(z));
        Object obj = concurrentHashMap.get(pair);
        if (obj == null) {
            v2 v2VarP = x2x.P(ck9.a(clsJ), list, z, iun.f15405a, 8);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pair, v2VarP);
            obj = objPutIfAbsent == null ? v2VarP : objPutIfAbsent;
        }
        return (kiy) obj;
    }
}
