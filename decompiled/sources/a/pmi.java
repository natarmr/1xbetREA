package a;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;

/* JADX INFO: loaded from: classes3.dex */
public final class pmi implements pdf0, njk0, nae0, n1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27235a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;

    public pmi(jh70 jh70Var, g8i g8iVar) {
        this.f27235a = (byte) 2;
        this.b = g8iVar;
        byte b = 15;
        this.d = n0k0.a(new omi(this, 1, b));
        this.c = n0k0.a(new omi(this, 2, b));
        this.e = n0k0.a(new omi(this, 0, b));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object A(List list, ynb0 ynb0Var, int i, boolean z, boolean z2, zje zjeVar) {
        dqt dqtVar;
        lsn lsnVar;
        List listL0;
        cne0 cne0VarP;
        boolean z3;
        ynb0 ynb0Var2;
        boolean z4;
        int i2;
        int i3 = i;
        if (zjeVar instanceof dqt) {
            dqtVar = (dqt) zjeVar;
            int i4 = dqtVar.s;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dqtVar.s = i4 - Integer.MIN_VALUE;
            } else {
                dqtVar = new dqt(this, zjeVar);
            }
        } else {
            dqtVar = new dqt(this, zjeVar);
        }
        Object obj = dqtVar.q;
        wne wneVar = wne.f39444a;
        int i5 = dqtVar.s;
        if (i5 == 0) {
            z1x.P(obj);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(list);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : linkedHashSet) {
                if (obj2 instanceof s1q) {
                    arrayList.add(obj2);
                }
            }
            s1q s1qVar = (s1q) CollectionsKt.firstOrNull(arrayList);
            if (s1qVar != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                String strG = wxs0.g(jCurrentTimeMillis, s1qVar.b);
                linkedHashSet.remove(s1qVar);
                linkedHashSet.add(new t1q(jCurrentTimeMillis));
                linkedHashSet.add(new s1q(strG, s1qVar.f31470a));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof j1q) {
                    arrayList2.add(obj3);
                }
            }
            ((l1f0) ((pmi0) this.c).f27236a).f19249a.getClass();
            lsnVar = (lsn) this.b;
            listL0 = CollectionsKt.L0(linkedHashSet);
            cne0VarP = ((f7u) this.e).p();
            umt umtVar = (umt) this.d;
            dqtVar.i = lsnVar;
            dqtVar.j = listL0;
            dqtVar.k = cne0VarP;
            dqtVar.l = ynb0Var;
            dqtVar.m = i3;
            z3 = z;
            dqtVar.o = z3;
            dqtVar.p = z2;
            dqtVar.n = i3;
            dqtVar.s = 1;
            Object objA = umtVar.a(dqtVar);
            if (objA != wneVar) {
                ynb0Var2 = ynb0Var;
                z4 = z2;
                obj = objA;
                i2 = i3;
            }
        }
        if (i5 != 1) {
            if (i5 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = dqtVar.n;
        boolean z5 = dqtVar.p;
        z3 = dqtVar.o;
        int i6 = dqtVar.m;
        ynb0 ynb0Var3 = dqtVar.l;
        cne0VarP = dqtVar.k;
        listL0 = dqtVar.j;
        lsnVar = dqtVar.i;
        z1x.P(obj);
        z4 = z5;
        i3 = i6;
        ynb0Var2 = ynb0Var3;
        dqtVar.i = null;
        dqtVar.j = null;
        dqtVar.k = null;
        dqtVar.l = null;
        dqtVar.m = i3;
        dqtVar.o = z3;
        dqtVar.p = z4;
        dqtVar.s = 2;
        y1f0 y1f0Var = (y1f0) lsnVar.f20589a;
        y1f0Var.getClass();
        Object objD0 = qjj.d0(y1f0Var.b.b, new w1f0(z4, y1f0Var, (String) obj, efx.R(listL0, cne0VarP, i2, q7f0.PHONE, z3), ynb0Var2, null, (byte) 1), dqtVar);
        return objD0 == wneVar ? wneVar : objD0;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00df A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:54:0x00d3, B:55:0x00d5, B:56:0x00d9, B:58:0x00df, B:62:0x00ec, B:76:0x010c, B:65:0x00f1, B:67:0x00f5, B:71:0x00fd, B:74:0x0105, B:20:0x003f, B:45:0x00b9), top: B:83:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f1 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:54:0x00d3, B:55:0x00d5, B:56:0x00d9, B:58:0x00df, B:62:0x00ec, B:76:0x010c, B:65:0x00f1, B:67:0x00f5, B:71:0x00fd, B:74:0x0105, B:20:0x003f, B:45:0x00b9), top: B:83:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:54:0x00d3, B:55:0x00d5, B:56:0x00d9, B:58:0x00df, B:62:0x00ec, B:76:0x010c, B:65:0x00f1, B:67:0x00f5, B:71:0x00fd, B:74:0x0105, B:20:0x003f, B:45:0x00b9), top: B:83:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:74:0x0105 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:54:0x00d3, B:55:0x00d5, B:56:0x00d9, B:58:0x00df, B:62:0x00ec, B:76:0x010c, B:65:0x00f1, B:67:0x00f5, B:71:0x00fd, B:74:0x0105, B:20:0x003f, B:45:0x00b9), top: B:83:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [a.k41] */
    /* JADX WARN: Type inference failed for: r0v7, types: [a.k41] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [a.ent, a.zje] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
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
    public Object B(boolean z, zje zjeVar) {
        ?? entVar;
        ?? r2;
        Object g0g0Var;
        g41 g41Var;
        g41 g41Var2;
        List list;
        g41 g41Var3;
        g41 g41Var4;
        Iterator it;
        Object next;
        d41 d41Var;
        String plainString;
        if (zjeVar instanceof ent) {
            ent entVar2 = (ent) zjeVar;
            int i = entVar2.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                entVar2.l = i - Integer.MIN_VALUE;
                entVar = entVar2;
            } else {
                entVar = new ent(this, zjeVar);
            }
        } else {
            entVar = new ent(this, zjeVar);
        }
        Object obj = entVar.j;
        wne wneVar = wne.f39444a;
        int i2 = entVar.l;
        String str = "";
        try {
            if (i2 == 0) {
                z1x.P(obj);
                g41 g41Var5 = new g41("", false);
                try {
                    e0g0 e0g0Var = j0g0.b;
                    if (((pru) this.e).a().b.I) {
                        q7d0 q7d0Var = ((dnt) this.d).f6386a.c.f8889a;
                        q7d0Var.getClass();
                        if (!q7d0Var.a().contains("JACKPOT_LAST_SHOWN_KEY")) {
                            q7d0Var = null;
                        }
                        Long lValueOf = q7d0Var != null ? Long.valueOf(q7d0Var.a().getLong("JACKPOT_LAST_SHOWN_KEY", 0L)) : null;
                        if (lValueOf != null) {
                            long jCurrentTimeMillis = System.currentTimeMillis() - lValueOf.longValue();
                            if (jCurrentTimeMillis < 0 || jCurrentTimeMillis < 86400000) {
                            }
                        }
                        if (z) {
                            yfu yfuVar = (yfu) this.c;
                            entVar.i = g41Var5;
                            entVar.l = 1;
                            Serializable serializableA = ((k41) yfuVar.f42558a).a("EUR", entVar);
                            if (serializableA != wneVar) {
                                g41Var2 = g41Var5;
                                obj = serializableA;
                                list = (List) obj;
                                g41Var4 = g41Var2;
                                it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (((d41) next).b != 2);
                                d41Var = (d41) next;
                                if (d41Var != null) {
                                    BigDecimal bigDecimal = d41Var.c;
                                    if (bigDecimal != null) {
                                    }
                                    if (plainString == null) {
                                        str = plainString;
                                    }
                                    if (StringsKt.W(str)) {
                                        g41Var3 = new g41(str, true);
                                        entVar = g41Var4;
                                    }
                                }
                                g41Var3 = g41Var4;
                                entVar = g41Var4;
                            }
                        } else {
                            dnt dntVar = (dnt) this.b;
                            entVar.i = g41Var5;
                            entVar.l = 2;
                            Serializable serializableB = dntVar.f6386a.b("EUR", entVar);
                            if (serializableB != wneVar) {
                                g41Var = g41Var5;
                                obj = serializableB;
                                list = (List) obj;
                                g41Var4 = g41Var;
                                it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (((d41) next).b != 2);
                                d41Var = (d41) next;
                                if (d41Var != null) {
                                    BigDecimal bigDecimal2 = d41Var.c;
                                    if (bigDecimal2 != null) {
                                    }
                                    if (plainString == null) {
                                        str = plainString;
                                    }
                                    if (StringsKt.W(str)) {
                                        g41Var3 = new g41(str, true);
                                        entVar = g41Var4;
                                    }
                                }
                                g41Var3 = g41Var4;
                                entVar = g41Var4;
                            }
                        }
                        return wneVar;
                    }
                    entVar = g41Var5;
                    g41Var3 = g41Var5;
                } catch (Throwable th) {
                    th = th;
                    entVar = g41Var5;
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                    r2 = entVar;
                }
            } else if (i2 == 1) {
                g41 g41Var6 = entVar.i;
                z1x.P(obj);
                g41Var2 = g41Var6;
                list = (List) obj;
                g41Var4 = g41Var2;
                it = list.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((d41) next).b != 2);
                d41Var = (d41) next;
                if (d41Var != null) {
                    BigDecimal bigDecimal3 = d41Var.c;
                    if (bigDecimal3 != null) {
                    }
                    if (plainString == null) {
                        str = plainString;
                    }
                    if (StringsKt.W(str)) {
                        g41Var3 = new g41(str, true);
                        entVar = g41Var4;
                    }
                }
                g41Var3 = g41Var4;
                entVar = g41Var4;
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g41 g41Var7 = entVar.i;
                z1x.P(obj);
                g41Var = g41Var7;
                list = (List) obj;
                g41Var4 = g41Var;
                it = list.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((d41) next).b != 2);
                d41Var = (d41) next;
                if (d41Var != null) {
                    BigDecimal bigDecimal4 = d41Var.c;
                    plainString = bigDecimal4 != null ? bigDecimal4.toPlainString() : null;
                    if (plainString == null) {
                        str = plainString;
                    }
                    if (StringsKt.W(str)) {
                        g41Var3 = new g41(str, true);
                        entVar = g41Var4;
                    }
                }
                g41Var3 = g41Var4;
                entVar = g41Var4;
            }
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = g41Var3;
            r2 = entVar;
        } catch (Throwable th2) {
            th = th2;
        }
        return g0g0Var instanceof g0g0 ? r2 : g0g0Var;
    }

    public void C(androidx.fragment.app.f fVar) {
        Fragment fragment = fVar.c;
        String str = fragment.f;
        HashMap map = (HashMap) this.c;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.f, fVar);
        if (fragment.g1) {
            boolean z = fragment.f1;
            w1r w1rVar = (w1r) this.e;
            if (z) {
                w1rVar.w(fragment);
            } else {
                w1rVar.A(fragment);
            }
            fragment.g1 = false;
        }
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public void D(androidx.fragment.app.f fVar) {
        HashMap map = (HashMap) this.c;
        Fragment fragment = fVar.c;
        if (fragment.f1) {
            ((w1r) this.e).A(fragment);
        }
        if (map.get(fragment.f) == fVar && ((androidx.fragment.app.f) map.put(fragment.f, null)) != null && androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object E(zje zjeVar) throws Throwable {
        oog0 oog0Var;
        i050 i050Var;
        Throwable th;
        i050 i050Var2;
        odd oddVar = (odd) this.c;
        if (zjeVar instanceof oog0) {
            oog0Var = (oog0) zjeVar;
            int i = oog0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                oog0Var.l = i - Integer.MIN_VALUE;
            } else {
                oog0Var = new oog0(this, zjeVar);
            }
        } else {
            oog0Var = new oog0(this, zjeVar);
        }
        Object obj = oog0Var.j;
        Object obj2 = wne.f39444a;
        int i2 = oog0Var.l;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                if (oddVar.isCompleted()) {
                    return Unit.f46060a;
                }
                i050Var = (k050) this.b;
                oog0Var.i = i050Var;
                oog0Var.l = 1;
                if (i050Var.d(oog0Var) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i050Var2 = oog0Var.i;
                try {
                    z1x.P(obj);
                    Unit unit = Unit.f46060a;
                    oddVar.N(unit);
                    i050Var2.c(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    i050Var2.c(null);
                    throw th;
                }
            }
            i050 i050Var3 = oog0Var.i;
            z1x.P(obj);
            i050Var = i050Var3;
            if (oddVar.isCompleted()) {
                Unit unit2 = Unit.f46060a;
                i050Var.c(null);
                return unit2;
            }
            oog0Var.i = i050Var;
            oog0Var.l = 2;
            if (g(oog0Var) != obj2) {
                i050Var2 = i050Var;
                Unit unit3 = Unit.f46060a;
                oddVar.N(unit3);
                i050Var2.c(null);
                return unit3;
            }
            return obj2;
        } catch (Throwable th3) {
            i050 i050Var4 = i050Var;
            th = th3;
            i050Var2 = i050Var4;
            i050Var2.c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    public Object F(ArrayList arrayList, zje zjeVar) {
        pkr pkrVar;
        ?? arrayList2;
        if (zjeVar instanceof pkr) {
            pkrVar = (pkr) zjeVar;
            int i = pkrVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                pkrVar.k = i - Integer.MIN_VALUE;
            } else {
                pkrVar = new pkr(this, zjeVar);
            }
        } else {
            pkrVar = new pkr(this, zjeVar);
        }
        Object objA = pkrVar.i;
        wne wneVar = wne.f39444a;
        int i2 = pkrVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            String str = ((xio) this.c).f40954a;
            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                pio pioVar = (pio) it.next();
                pioVar.getClass();
                arrayList3.add(new vio(pioVar.f27051a, pioVar.b));
            }
            ejo ejoVar = new ejo(str, arrayList3);
            wti wtiVar = (wti) this.b;
            String strA = ((btt0) this.d).a();
            String strC = ((knf0) this.e).c();
            pkrVar.k = 1;
            objA = ((fjr) ((yip) wtiVar.c).invoke()).a(strA, strC, ejoVar, pkrVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        kjo kjoVar = (kjo) ((dx5) objA).a();
        Boolean bool = kjoVar.f18396a;
        if (bool == null) {
            jf4.k(null);
            return null;
        }
        boolean zBooleanValue = bool.booleanValue();
        String str2 = kjoVar.b;
        if (str2 == null) {
            str2 = "";
        }
        Integer num = kjoVar.c;
        int iIntValue = num != null ? num.intValue() : 0;
        List list = kjoVar.d;
        if (list != null) {
            arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(a8k0.M((qhu) it2.next()));
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        return new yio(iIntValue, str2, arrayList2, zBooleanValue);
    }

    public Bundle G(Bundle bundle, String str) {
        HashMap map = (HashMap) this.d;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    /* JADX WARN: Code duplicated, block: B:21:0x0087  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:27:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r0v5, types: [a.sgs, a.zos, java.util.Iterator, java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0099 -> B:36:0x00da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ce -> B:35:0x00d3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object H(a.t9s r21, a.zos r22, a.sgs r23, a.zje r24) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pmi.H(a.t9s, a.zos, a.sgs, a.zje):java.lang.Object");
    }

    public void I(Object obj, iiy iiyVar, Enum r5) {
        iiyVar.getClass();
        r5.getClass();
        thy thyVar = (thy) this.b;
        ijq ijqVar = (ijq) ((ArrayList) this.e).get(r5.ordinal());
        int iIntValue = ((Number) thyVar.get(obj)).intValue();
        int i = (1 << ijqVar.b) - 1;
        int i2 = ijqVar.f14887a;
        thyVar.k(obj, Integer.valueOf((iIntValue & (~(i << i2))) + (ijqVar.c << i2)));
    }

    @Override // a.njk0
    public s5k0 a() {
        return (exj) this.e;
    }

    @Override // a.njk0
    public emk0 b() {
        return (fxj) this.d;
    }

    @Override // a.pdf0
    public owp0 c() {
        return new owp0((Object) new pv00((hdf0) ((n5d0) this.d).get()), (byte) 11);
    }

    @Override // a.njk0
    public void cancel() throws IOException {
        ((Socket) this.b).close();
    }

    @Override // a.pdf0
    public gxu d() {
        knf0 knf0Var = (knf0) this.b;
        lef0 lef0Var = new lef0((gii0) this.c, (byte) 0);
        xyt xytVar = (xyt) this.e;
        knf0Var.getClass();
        gxu gxuVar = new gxu();
        gxuVar.f12096a = knf0Var;
        gxuVar.b = lef0Var;
        gxuVar.c = xytVar;
        return gxuVar;
    }

    @Override // a.pdf0
    public xfu e() {
        return new xfu(new pv00((hdf0) ((n5d0) this.d).get()));
    }

    public void f(Fragment fragment) {
        if (((ArrayList) this.b).contains(fragment)) {
            e9d0.v(fragment, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.b)) {
            ((ArrayList) this.b).add(fragment);
        }
        fragment.l = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r8 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r8 == r2) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(a.zje r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.e
            a.ncj r0 = (a.ncj) r0
            boolean r1 = r8 instanceof a.ybj
            if (r1 == 0) goto L17
            r1 = r8
            a.ybj r1 = (a.ybj) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.k = r2
            goto L1c
        L17:
            a.ybj r1 = new a.ybj
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.i
            a.wne r2 = a.wne.f39444a
            int r3 = r1.k
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L39
            if (r3 == r6) goto L35
            if (r3 != r5) goto L2f
            a.z1x.P(r8)
            goto L5b
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r4
        L35:
            a.z1x.P(r8)
            goto L68
        L39:
            a.z1x.P(r8)
            java.lang.Object r8 = r7.d
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L5e
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L49
            goto L5e
        L49:
            a.mlx r8 = r0.c()
            a.bcj r3 = new a.bcj
            r3.<init>(r0, r7, r4)
            r1.k = r5
            java.lang.Object r8 = r8.b(r3, r1)
            if (r8 != r2) goto L5b
            goto L67
        L5b:
            a.naj r8 = (a.naj) r8
            goto L6a
        L5e:
            r1.k = r6
            r7 = 0
            java.lang.Object r8 = r0.h(r7, r1)
            if (r8 != r2) goto L68
        L67:
            return r2
        L68:
            a.naj r8 = (a.naj) r8
        L6a:
            a.ocj r7 = r0.h
            r7.b(r8)
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pmi.g(a.zje):java.lang.Object");
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        dyw dywVar = hhn0Var.f13073a;
        DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) this.b;
        Resources resources = dsCellLeftIcon.getContext().getResources();
        resources.getClass();
        dsCellLeftIcon.setBackgroundWithDrawable(c3x.q(dywVar, resources));
        dsCellLeftIcon.o = null;
    }

    public khf0 i() {
        return new khf0((knf0) this.b, (btt0) this.c, new cad((gii0) this.d, (byte) 18));
    }

    public Fragment j(String str) {
        androidx.fragment.app.f fVar = (androidx.fragment.app.f) ((HashMap) this.c).get(str);
        if (fVar != null) {
            return fVar.c;
        }
        return null;
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
        DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) this.b;
        Integer num = (Integer) this.c;
        Integer num2 = (Integer) this.d;
        Integer num3 = (Integer) this.e;
        int i = DsCellLeftIcon.s;
        dsCellLeftIcon.q(num, num2, num3);
        dsCellLeftIcon.o = null;
        dsCellLeftIcon.p = null;
    }

    public Fragment l(String str) {
        for (androidx.fragment.app.f fVar : ((HashMap) this.c).values()) {
            if (fVar != null) {
                Fragment fragmentL = fVar.c;
                if (!str.equals(fragmentL.f)) {
                    fragmentL = fragmentL.x.c.l(str);
                }
                if (fragmentL != null) {
                    return fragmentL;
                }
            }
        }
        return null;
    }

    public ArrayList m() {
        ArrayList arrayList = new ArrayList();
        for (androidx.fragment.app.f fVar : ((HashMap) this.c).values()) {
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    @Override // a.nae0
    public Object n(iiy iiyVar, Object obj) {
        stl stlVar = (stl) this.b;
        ((Fragment) obj).getClass();
        iiyVar.getClass();
        yfu0 yfu0Var = (yfu0) this.d;
        if (yfu0Var != null) {
            return yfu0Var;
        }
        Function1 function1 = (Function1) this.c;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(stlVar.o0());
        layoutInflaterFrom.getClass();
        yfu0 yfu0Var2 = (yfu0) function1.invoke(layoutInflaterFrom);
        this.d = yfu0Var2;
        glz glzVar = stlVar.u1;
        glzVar.getClass();
        glzVar.a(new tvj(new cxj(glzVar, this, (byte) 4)));
        return yfu0Var2;
    }

    public ArrayList o() {
        ArrayList arrayList = new ArrayList();
        for (androidx.fragment.app.f fVar : ((HashMap) this.c).values()) {
            if (fVar != null) {
                arrayList.add(fVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List p() {
        ArrayList arrayList;
        if (((ArrayList) this.b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.b)) {
            arrayList = new ArrayList((ArrayList) this.b);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object q(zje zjeVar) {
        y0u y0uVar;
        j1q0 j1q0Var = (j1q0) this.c;
        if (zjeVar instanceof y0u) {
            y0uVar = (y0u) zjeVar;
            int i = y0uVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                y0uVar.k = i - Integer.MIN_VALUE;
            } else {
                y0uVar = new y0u(this, zjeVar);
            }
        } else {
            y0uVar = new y0u(this, zjeVar);
        }
        Object objR = y0uVar.i;
        wne wneVar = wne.f39444a;
        int i2 = y0uVar.k;
        if (i2 == 0) {
            z1x.P(objR);
            boolean zC = j1q0Var.f15748a.c();
            cre creVarJ = j1q0Var.j();
            pmi pmiVar = (pmi) this.b;
            y0uVar.k = 1;
            objR = pmiVar.r(zC, creVarJ, y0uVar);
            if (objR == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objR);
        }
        return new Integer(((elt) objR).e);
    }

    public Object r(boolean z, cre creVar, yje yjeVar) {
        xkt xktVar = ((ykt) this.c).c;
        return xktVar != null ? vic.H(xktVar) : qjj.d0(((mne) this.d).b, new alt(this, z, creVar, null), yjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public Object s(long j, long j2, long j3, zje zjeVar) throws Throwable {
        wuo wuoVar;
        long j4;
        long j5;
        long j6;
        i050 i050Var;
        i050 i050Var2;
        dqr dqrVar;
        j5t j5tVar = (j5t) this.e;
        if (zjeVar instanceof wuo) {
            wuoVar = (wuo) zjeVar;
            int i = wuoVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                wuoVar.o = i - Integer.MIN_VALUE;
            } else {
                wuoVar = new wuo(this, zjeVar);
            }
        } else {
            wuoVar = new wuo(this, zjeVar);
        }
        wuo wuoVar2 = wuoVar;
        Object objD0 = wuoVar2.m;
        wne wneVar = wne.f39444a;
        int i2 = wuoVar2.o;
        try {
            if (i2 == 0) {
                z1x.P(objD0);
                k050 k050Var = j5tVar.B;
                wuoVar2.l = k050Var;
                j4 = j;
                wuoVar2.i = j4;
                j5 = j2;
                wuoVar2.j = j5;
                j6 = j3;
                wuoVar2.k = j6;
                wuoVar2.o = 1;
                if (k050Var.d(wuoVar2) != wneVar) {
                    i050Var = k050Var;
                }
                return wneVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i050Var2 = wuoVar2.l;
                try {
                    z1x.P(objD0);
                    dqrVar = (dqr) objD0;
                    i050Var = i050Var2;
                    i050Var.c(null);
                    return dqrVar;
                } catch (Throwable th) {
                    th = th;
                    i050Var2.c(null);
                    throw th;
                }
            }
            long j7 = wuoVar2.k;
            long j8 = wuoVar2.j;
            long j9 = wuoVar2.i;
            i050 i050Var3 = wuoVar2.l;
            z1x.P(objD0);
            j5 = j8;
            j4 = j9;
            i050Var = i050Var3;
            j6 = j7;
            dqrVar = (dqr) j5tVar.l.get(Long.valueOf(j4));
            if (dqrVar == null) {
                dvj dvjVar = ((mne) this.c).b;
                long j10 = j4;
                long j11 = j5;
                long j12 = j6;
                xuo xuoVar = new xuo(this, j10, j12, j11, null);
                wuoVar2.l = i050Var;
                wuoVar2.i = j10;
                wuoVar2.j = j11;
                wuoVar2.k = j12;
                wuoVar2.o = 2;
                objD0 = qjj.d0(dvjVar, xuoVar, wuoVar2);
                if (objD0 != wneVar) {
                    i050Var2 = i050Var;
                    dqrVar = (dqr) objD0;
                    i050Var = i050Var2;
                }
                return wneVar;
            }
            i050Var.c(null);
            return dqrVar;
        } catch (Throwable th2) {
            th = th2;
            i050Var2 = i050Var;
            i050Var2.c(null);
            throw th;
        }
    }

    public abu t() {
        return new abu(i(), new vlk((vwb0) this.e, (byte) 1), (byte) 27);
    }

    public String toString() {
        switch (this.f27235a) {
            case 8:
                String string = ((Socket) this.b).toString();
                string.getClass();
                return string;
            default:
                return super.toString();
        }
    }

    public uzc0 u() {
        return new uzc0((ctf0) this.b, (pru) this.c);
    }

    public Enum v(iiy iiyVar, Object obj) {
        iiyVar.getClass();
        return (Enum) ((c0o) ((a0o) this.d)).get(((vlx) ((mjq) this.c).e(((Number) ((thy) this.b).get(obj)).intValue())).a());
    }

    public i89 w() {
        byte b = 22;
        yje yjeVar = null;
        byte b2 = 2;
        return new i89(new dnq(dub.e0(new i89(((o0j) ((nmt) this.b).f23788a.c).d, b), ((crt) this.c).a(), new i89(((o0j) ((crt) this.d).f4861a.c).e, b), ((nmt) this.e).a(), new i4u(5, yjeVar, (byte) 0)), new qos(3, yjeVar, b2), b2), b);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0067 A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:13:0x002a, B:38:0x0089, B:39:0x008f, B:17:0x0034, B:34:0x0077, B:20:0x003a, B:28:0x005d, B:30:0x0067, B:31:0x006c, B:23:0x0041, B:25:0x004d, B:35:0x007e), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x006c A[Catch: all -> 0x0097, TryCatch #0 {all -> 0x0097, blocks: (B:13:0x002a, B:38:0x0089, B:39:0x008f, B:17:0x0034, B:34:0x0077, B:20:0x003a, B:28:0x005d, B:30:0x0067, B:31:0x006c, B:23:0x0041, B:25:0x004d, B:35:0x007e), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (r8 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable x(a.yje r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.z0u
            if (r0 == 0) goto L13
            r0 = r8
            a.z0u r0 = (a.z0u) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.z0u r0 = new a.z0u
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> L97
            goto L89
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r3
        L34:
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> L97
            goto L77
        L38:
            a.pmi r7 = r0.i
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> L97
            goto L5d
        L3e:
            a.z1x.P(r8)
            a.e0g0 r8 = a.j0g0.b     // Catch: java.lang.Throwable -> L97
            java.lang.Object r8 = r7.e     // Catch: java.lang.Throwable -> L97
            a.gst0 r8 = (a.gst0) r8     // Catch: java.lang.Throwable -> L97
            boolean r8 = r8.a()     // Catch: java.lang.Throwable -> L97
            if (r8 == 0) goto L7e
            java.lang.Object r8 = r7.d     // Catch: java.lang.Throwable -> L97
            a.b3c0 r8 = (a.b3c0) r8     // Catch: java.lang.Throwable -> L97
            r0.i = r7     // Catch: java.lang.Throwable -> L97
            r0.l = r6     // Catch: java.lang.Throwable -> L97
            r2 = 0
            java.lang.Object r8 = r8.a(r2, r0)     // Catch: java.lang.Throwable -> L97
            if (r8 != r1) goto L5d
            goto L88
        L5d:
            a.m2c0 r8 = (a.m2c0) r8     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = r8.c     // Catch: java.lang.Throwable -> L97
            java.lang.Integer r8 = kotlin.text.StringsKt.toIntOrNull(r8)     // Catch: java.lang.Throwable -> L97
            if (r8 == 0) goto L6c
            int r7 = r8.intValue()     // Catch: java.lang.Throwable -> L97
            goto L8f
        L6c:
            r0.i = r3     // Catch: java.lang.Throwable -> L97
            r0.l = r5     // Catch: java.lang.Throwable -> L97
            java.lang.Object r8 = r7.q(r0)     // Catch: java.lang.Throwable -> L97
            if (r8 != r1) goto L77
            goto L88
        L77:
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L97
            int r7 = r8.intValue()     // Catch: java.lang.Throwable -> L97
            goto L8f
        L7e:
            r0.i = r3     // Catch: java.lang.Throwable -> L97
            r0.l = r4     // Catch: java.lang.Throwable -> L97
            java.lang.Object r8 = r7.q(r0)     // Catch: java.lang.Throwable -> L97
            if (r8 != r1) goto L89
        L88:
            return r1
        L89:
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L97
            int r7 = r8.intValue()     // Catch: java.lang.Throwable -> L97
        L8f:
            java.lang.Integer r8 = new java.lang.Integer     // Catch: java.lang.Throwable -> L97
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L97
            a.e0g0 r7 = a.j0g0.b     // Catch: java.lang.Throwable -> L97
            goto L9f
        L97:
            r7 = move-exception
            a.e0g0 r8 = a.j0g0.b
            a.g0g0 r8 = new a.g0g0
            r8.<init>(r7)
        L9f:
            java.lang.Integer r7 = new java.lang.Integer
            r0 = 225(0xe1, float:3.15E-43)
            r7.<init>(r0)
            boolean r0 = r8 instanceof a.g0g0
            if (r0 == 0) goto Lab
            r8 = r7
        Lab:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pmi.x(a.yje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x016e A[EDGE_INSN: B:106:0x016e->B:64:0x016e BREAK  A[LOOP:5: B:61:0x0145->B:63:0x0150], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:56:0x011a A[LOOP:4: B:54:0x0114->B:56:0x011a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x013b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0150 A[LOOP:5: B:61:0x0145->B:63:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x018a A[LOOP:6: B:65:0x0184->B:67:0x018a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0203 A[LOOP:8: B:86:0x01fd->B:88:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:1: B:33:0x00ab->B:98:?, LOOP_END, SYNTHETIC] */
    public Serializable y(zje zjeVar) {
        jpt jptVar;
        k0j0 k0j0VarB;
        String str;
        List list;
        k0j0 k0j0Var;
        String str2;
        ArrayList<qkt> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        int iA;
        LinkedHashMap linkedHashMap;
        Iterator it2;
        iil iilVar;
        ArrayList<rkt> arrayList4;
        Iterator it3;
        List list2;
        List list3;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Iterator it4;
        Object next;
        p52 p52Var;
        boolean z;
        qkt qktVar;
        Iterator it5;
        if (zjeVar instanceof jpt) {
            jptVar = (jpt) zjeVar;
            int i = jptVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                jptVar.n = i - Integer.MIN_VALUE;
            } else {
                jptVar = new jpt(this, zjeVar);
            }
        } else {
            jptVar = new jpt(this, zjeVar);
        }
        Object obj = jptVar.l;
        wne wneVar = wne.f39444a;
        int i2 = jptVar.n;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(obj);
            String strA = ((ntu) this.e).a();
            k0j0VarB = ((czt) this.d).f5239a.b();
            kpt kptVar = (kpt) this.c;
            jptVar.i = strA;
            jptVar.j = k0j0VarB;
            jptVar.n = 1;
            Object objB = kptVar.f18690a.b(jptVar);
            if (objB != wneVar) {
                str = strA;
                obj = objB;
            }
            return wneVar;
        }
        if (i2 == 1) {
            k0j0VarB = jptVar.j;
            str = jptVar.i;
            z1x.P(obj);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = jptVar.k;
            k0j0Var = jptVar.j;
            str2 = jptVar.i;
            z1x.P(obj);
        }
        arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            qktVar = (qkt) obj2;
            if (list != null || !list.isEmpty()) {
                it5 = list.iterator();
                while (it5.hasNext()) {
                    if (qktVar.f28902a == ((p52) it5.next()).f26383a) {
                        arrayList.add(obj2);
                        break;
                    }
                }
            }
        }
        arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (qkt qktVar2 : arrayList) {
            it4 = list.iterator();
            do {
                if (it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (qktVar2.f28902a != ((p52) next).f26383a);
            p52Var = (p52) next;
            if (p52Var != null) {
                z = p52Var.e;
            } else {
                z = false;
            }
            arrayList2.add(qkt.a(qktVar2, null, z, 191));
        }
        arrayList3 = new ArrayList(r3d.q(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(new Integer(((p52) it.next()).f26383a));
        }
        rx3 rx3VarS0 = CollectionsKt.S0(arrayList3);
        iA = wp20.a(r3d.q(rx3VarS0, 10));
        if (iA < 16) {
            iA = 16;
        }
        linkedHashMap = new LinkedHashMap(iA);
        it2 = rx3VarS0.iterator();
        while (true) {
            iilVar = (iil) it2;
            if (iilVar.b.hasNext()) {
                break;
            }
            IndexedValue indexedValue = (IndexedValue) iilVar.next();
            linkedHashMap.put(new Integer(((Number) indexedValue.b).intValue()), new Integer(indexedValue.f46061a));
        }
        List listA0 = CollectionsKt.A0(arrayList2, new b0c(linkedHashMap, b));
        arrayList4 = new ArrayList(r3d.q(listA0, 10));
        it3 = listA0.iterator();
        while (it3.hasNext()) {
            arrayList4.add(jeb.a0((qkt) it3.next(), str2));
        }
        list2 = k0j0Var.b;
        list3 = k0j0Var.c;
        if (!list2.isEmpty()) {
            if (!list3.isEmpty()) {
                arrayList5 = new ArrayList();
                for (Object obj3 : arrayList4) {
                    if (!list3.contains(((rkt) obj3).d)) {
                        arrayList5.add(obj3);
                    }
                }
            }
            arrayList6 = new ArrayList(r3d.q(arrayList4, 10));
            for (rkt rktVar : arrayList4) {
                rktVar.getClass();
                int i3 = rktVar.f30664a;
                String str3 = rktVar.b;
                String str4 = rktVar.d;
                arrayList6.add(new qkt(i3, rktVar.e, rktVar.h, str3, rktVar.c, str4, rktVar.f, rktVar.g));
            }
            return arrayList6;
        }
        arrayList5 = new ArrayList();
        for (Object obj4 : arrayList4) {
            if (k0j0Var.b.contains(((rkt) obj4).d)) {
                arrayList5.add(obj4);
            }
        }
        arrayList4 = arrayList5;
        arrayList6 = new ArrayList(r3d.q(arrayList4, 10));
        while (r13.hasNext()) {
            rktVar.getClass();
            int i4 = rktVar.f30664a;
            String str5 = rktVar.b;
            String str6 = rktVar.d;
            arrayList6.add(new qkt(i4, rktVar.e, rktVar.h, str5, rktVar.c, str6, rktVar.f, rktVar.g));
        }
        return arrayList6;
        List list4 = (List) obj;
        bot botVar = (bot) this.b;
        jptVar.i = str;
        jptVar.j = k0j0VarB;
        jptVar.k = list4;
        jptVar.n = 2;
        Serializable serializableD = botVar.f2951a.d(jptVar);
        if (serializableD != wneVar) {
            obj = serializableD;
            list = list4;
            k0j0Var = k0j0VarB;
            str2 = str;
            arrayList = new ArrayList();
            while (r13.hasNext()) {
                qktVar = (qkt) obj2;
                if (list != null) {
                }
                it5 = list.iterator();
                while (it5.hasNext()) {
                    if (qktVar.f28902a == ((p52) it5.next()).f26383a) {
                        arrayList.add(obj2);
                        break;
                        break;
                    }
                }
            }
            arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            while (r2.hasNext()) {
                it4 = list.iterator();
                do {
                    if (it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (qktVar2.f28902a != ((p52) next).f26383a);
                p52Var = (p52) next;
                if (p52Var != null) {
                    z = p52Var.e;
                } else {
                    z = false;
                }
                arrayList2.add(qkt.a(qktVar2, null, z, 191));
            }
            arrayList3 = new ArrayList(r3d.q(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(new Integer(((p52) it.next()).f26383a));
            }
            rx3 rx3VarS1 = CollectionsKt.S0(arrayList3);
            iA = wp20.a(r3d.q(rx3VarS1, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            it2 = rx3VarS1.iterator();
            while (true) {
                iilVar = (iil) it2;
                if (iilVar.b.hasNext()) {
                    break;
                    break;
                }
                IndexedValue indexedValue2 = (IndexedValue) iilVar.next();
                linkedHashMap.put(new Integer(((Number) indexedValue2.b).intValue()), new Integer(indexedValue2.f46061a));
            }
            List listA1 = CollectionsKt.A0(arrayList2, new b0c(linkedHashMap, b));
            arrayList4 = new ArrayList(r3d.q(listA1, 10));
            it3 = listA1.iterator();
            while (it3.hasNext()) {
                arrayList4.add(jeb.a0((qkt) it3.next(), str2));
            }
            list2 = k0j0Var.b;
            list3 = k0j0Var.c;
            if (!list2.isEmpty()) {
                if (!list3.isEmpty()) {
                    arrayList5 = new ArrayList();
                    while (r13.hasNext()) {
                        if (!list3.contains(((rkt) obj3).d)) {
                            arrayList5.add(obj3);
                        }
                    }
                }
                arrayList6 = new ArrayList(r3d.q(arrayList4, 10));
                while (r13.hasNext()) {
                    rktVar.getClass();
                    int i5 = rktVar.f30664a;
                    String str7 = rktVar.b;
                    String str8 = rktVar.d;
                    arrayList6.add(new qkt(i5, rktVar.e, rktVar.h, str7, rktVar.c, str8, rktVar.f, rktVar.g));
                }
                return arrayList6;
            }
            arrayList5 = new ArrayList();
            while (r13.hasNext()) {
                if (k0j0Var.b.contains(((rkt) obj4).d)) {
                    arrayList5.add(obj4);
                }
            }
            arrayList4 = arrayList5;
            arrayList6 = new ArrayList(r3d.q(arrayList4, 10));
            while (r13.hasNext()) {
                rktVar.getClass();
                int i6 = rktVar.f30664a;
                String str9 = rktVar.b;
                String str10 = rktVar.d;
                arrayList6.add(new qkt(i6, rktVar.e, rktVar.h, str9, rktVar.c, str10, rktVar.f, rktVar.g));
            }
            return arrayList6;
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        if (r7 == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(java.lang.String r6, a.zje r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a.r0u
            if (r0 == 0) goto L13
            r0 = r7
            a.r0u r0 = (a.r0u) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.r0u r0 = new a.r0u
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r7)
            goto L88
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r7)
            goto L4b
        L35:
            a.z1x.P(r7)
            int r7 = r6.length()
            if (r7 != 0) goto L4f
            java.lang.Object r6 = r5.b
            a.ahu r6 = (a.ahu) r6
            r0.k = r4
            java.io.Serializable r7 = a.ahu.c(r6, r0)
            if (r7 != r1) goto L4b
            goto L87
        L4b:
            a.ql5 r7 = (a.ql5) r7
            java.lang.String r6 = r7.g
        L4f:
            java.lang.Object r7 = r5.c
            a.nmo r7 = (a.nmo) r7
            java.lang.Object r7 = r7.f23782a
            a.nhf0 r7 = (a.nhf0) r7
            java.lang.Object r7 = r7.f23530a
            a.vi5 r7 = (a.vi5) r7
            a.uuf r7 = r7.f37460a
            r7.getClass()
            java.lang.String r2 = r7.f36297a
            java.lang.String r7 = r7.b
            r2.getClass()
            r7.getClass()
            int r4 = r2.length()
            if (r4 <= 0) goto L77
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r6, r2)
            if (r2 == 0) goto L77
            return r7
        L77:
            java.lang.Object r7 = r5.e
            a.uyn r7 = (a.uyn) r7
            r0.k = r3
            java.lang.Object r7 = r7.f36498a
            a.xr r7 = (a.xr) r7
            java.lang.Object r7 = r7.b(r6, r0)
            if (r7 != r1) goto L88
        L87:
            return r1
        L88:
            a.xuf r7 = (a.xuf) r7
            java.lang.Object r5 = r5.d
            a.pmi0 r5 = (a.pmi0) r5
            java.lang.String r6 = r7.b
            java.lang.String r7 = r7.f
            r6.getClass()
            r7.getClass()
            java.lang.Object r5 = r5.f27236a
            a.nhf0 r5 = (a.nhf0) r5
            java.lang.Object r5 = r5.f23530a
            a.vi5 r5 = (a.vi5) r5
            a.uuf r0 = new a.uuf
            r0.<init>(r6, r7)
            r5.getClass()
            r5.f37460a = r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pmi.z(java.lang.String, a.zje):java.lang.Object");
    }

    public pmi(pmi pmiVar, j1q0 j1q0Var, b3c0 b3c0Var, gst0 gst0Var) {
        this.f27235a = (byte) 28;
        j1q0Var.getClass();
        b3c0Var.getClass();
        gst0Var.getClass();
        this.b = pmiVar;
        this.c = j1q0Var;
        this.d = b3c0Var;
        this.e = gst0Var;
    }

    public pmi(lrc lrcVar, iyk iykVar, knf0 knf0Var, mne mneVar) {
        this.f27235a = (byte) 11;
        knf0Var.getClass();
        this.b = lrcVar;
        this.c = iykVar;
        this.d = knf0Var;
        this.e = mneVar;
    }

    public pmi(lsn lsnVar, bst bstVar, pmi0 pmi0Var, umt umtVar, f7u f7uVar) {
        this.f27235a = (byte) 25;
        this.b = lsnVar;
        this.c = pmi0Var;
        this.d = umtVar;
        this.e = f7uVar;
    }

    public pmi(btt0 btt0Var, mne mneVar, svu svuVar, j5t j5tVar) {
        this.f27235a = (byte) 14;
        btt0Var.getClass();
        j5tVar.getClass();
        this.b = btt0Var;
        this.c = mneVar;
        this.d = svuVar;
        this.e = j5tVar;
    }

    public pmi(wti wtiVar, xio xioVar, btt0 btt0Var, knf0 knf0Var) {
        this.f27235a = (byte) 20;
        xioVar.getClass();
        btt0Var.getClass();
        knf0Var.getClass();
        this.b = wtiVar;
        this.c = xioVar;
        this.d = btt0Var;
        this.e = knf0Var;
    }

    public pmi(xzt xztVar, o4a o4aVar, tqt tqtVar, ert ertVar, r9u r9uVar) {
        this.f27235a = (byte) 26;
        r9uVar.getClass();
        this.b = xztVar;
        this.c = o4aVar;
        this.d = ertVar;
        this.e = r9uVar;
    }

    public pmi(bwl bwlVar, ykt yktVar, mne mneVar, knf0 knf0Var) {
        this.f27235a = (byte) 22;
        yktVar.getClass();
        knf0Var.getClass();
        this.b = bwlVar;
        this.c = yktVar;
        this.d = mneVar;
        this.e = knf0Var;
    }

    public pmi(thy thyVar, mjq mjqVar, a0o a0oVar, ArrayList arrayList) {
        this.f27235a = (byte) 13;
        mjqVar.getClass();
        a0oVar.getClass();
        this.b = thyVar;
        this.c = mjqVar;
        this.d = a0oVar;
        this.e = arrayList;
    }

    public pmi(knf0 knf0Var, iqi iqiVar, o8o o8oVar, jtj jtjVar) {
        this.f27235a = (byte) 17;
        knf0Var.getClass();
        this.b = knf0Var;
        this.c = iqiVar;
        this.d = o8oVar;
        this.e = jtjVar;
    }

    public pmi(clc clcVar, vlk vlkVar, knf0 knf0Var, mne mneVar) {
        this.f27235a = (byte) 10;
        knf0Var.getClass();
        this.b = clcVar;
        this.c = vlkVar;
        this.d = knf0Var;
        this.e = mneVar;
    }

    public pmi(ros rosVar, q530 q530Var, j1q0 j1q0Var, cmt cmtVar) {
        this.f27235a = (byte) 15;
        rosVar.getClass();
        q530Var.getClass();
        j1q0Var.getClass();
        this.b = rosVar;
        this.c = q530Var;
        this.d = j1q0Var;
        this.e = cmtVar;
    }

    public pmi() {
        this.f27235a = (byte) 19;
        this.b = new ArrayList();
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public pmi(Socket socket) {
        this.f27235a = (byte) 8;
        this.b = socket;
        this.c = new AtomicInteger();
        this.d = new fxj(this);
        this.e = new exj(this);
    }

    public pmi(cad cadVar, sxo0 sxo0Var, ctf0 ctf0Var) {
        this.f27235a = (byte) 5;
        this.b = sxo0Var;
        this.c = ctf0Var;
        this.d = cadVar;
        this.e = new xvi(this, (byte) 2);
    }

    public pmi(ntu ntuVar, g2v g2vVar, pyu pyuVar) {
        this.f27235a = (byte) 6;
        this.b = g2vVar;
        this.c = pyuVar;
        this.e = ntuVar;
        this.d = n0k0.a(new yxi(this, (byte) 28));
    }

    public pmi(gii0 gii0Var, xyt xytVar, knf0 knf0Var) {
        this.f27235a = (byte) 4;
        this.b = knf0Var;
        this.c = gii0Var;
        this.e = xytVar;
        this.d = mbl.b(new p8i((byte) 9));
    }

    public pmi(g8i g8iVar, i1w0 i1w0Var) {
        byte b = 0;
        this.f27235a = (byte) 0;
        this.b = g8iVar;
        this.c = i1w0Var;
        this.d = n0k0.a(new omi(this, b, b));
        this.e = new omi(this, 1, b);
        n0k0.a(new omi(this, 2, b));
    }

    public pmi(ctf0 ctf0Var, nw20 nw20Var, i1k0 i1k0Var, pru pruVar) {
        this.f27235a = (byte) 3;
        this.b = ctf0Var;
        this.c = pruVar;
        this.d = nw20Var;
        this.e = i1k0Var;
    }

    public pmi(gii0 gii0Var, btt0 btt0Var, knf0 knf0Var, vwb0 vwb0Var) {
        this.f27235a = (byte) 1;
        this.b = knf0Var;
        this.c = btt0Var;
        this.d = gii0Var;
        this.e = vwb0Var;
    }

    public /* synthetic */ pmi(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f27235a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public pmi(stl stlVar, Function1 function1) {
        this.f27235a = (byte) 9;
        this.b = stlVar;
        this.c = function1;
        this.e = new Handler(Looper.getMainLooper());
    }

    public pmi(ncj ncjVar, List list) {
        this.f27235a = (byte) 7;
        list.getClass();
        this.e = ncjVar;
        this.b = new k050();
        this.c = new odd();
        this.d = CollectionsKt.L0(list);
    }
}
