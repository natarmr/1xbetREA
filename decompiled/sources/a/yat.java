package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yat extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ pbt m;
    public final /* synthetic */ String n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yat(byte b, int i, yje yjeVar, pbt pbtVar, String str, boolean z) {
        super(2, yjeVar);
        this.i = b;
        this.l = z;
        this.m = pbtVar;
        this.n = str;
        this.o = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                yat yatVar = new yat((byte) 0, this.o, yjeVar, this.m, this.n, this.l);
                yatVar.k = obj;
                return yatVar;
            default:
                yat yatVar2 = new yat((byte) 1, this.o, yjeVar, this.m, this.n, this.l);
                yatVar2.k = obj;
                return yatVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((yat) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x017b  */
    /* JADX WARN: Code duplicated, block: B:76:0x017e  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object g0g0Var;
        String str;
        Map linkedHashMap;
        Object objA;
        boolean z;
        String str2;
        uub0 uub0Var;
        int i;
        boolean z2;
        Object objE;
        Object g0g0Var2;
        String str3;
        Object next;
        l070 l070Var;
        l070 l070Var2;
        List list;
        byte b = this.i;
        String str4 = this.n;
        Object obj3 = "PreviewServiceStatusLocalDataSource.CACHE_AUTHORIZED_KEY";
        pbt pbtVar = this.m;
        boolean z3 = this.l;
        switch (b) {
            case 0:
                Object obj4 = null;
                uub0 uub0Var2 = pbtVar.e;
                wne wneVar = wne.f39444a;
                boolean z4 = this.j;
                try {
                    if (z4) {
                        if (z4) {
                            z1x.P(obj);
                            objA = obj;
                            obj2 = "PreviewServiceStatusLocalDataSource.CACHE_AUTHORIZED_KEY";
                            obj3 = "PreviewServiceStatusLocalDataSource.CACHE_AUTHORIZED_KEY";
                        } else {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                        }
                        return obj4;
                    }
                    z1x.P(obj);
                    String strA = z3 ? pbtVar.i.a() : null;
                    int i2 = this.o;
                    e0g0 e0g0Var = j0g0.b;
                    gxu gxuVar = pbtVar.g;
                    pbtVar.h.getClass();
                    String strA2 = pbtVar.n.a();
                    this.k = null;
                    this.j = true;
                    obj2 = "PreviewServiceStatusLocalDataSource.CACHE_AUTHORIZED_KEY";
                    yat yatVar = this;
                    try {
                        objA = ((is60) ((o270) gxuVar.c).invoke()).a(strA, 22, 1, new Integer(1357), strA2, new Integer(i2), new Integer(i2), yatVar);
                        obj3 = yatVar;
                        obj2 = obj2;
                        if (objA == wneVar) {
                            return wneVar;
                        }
                    } catch (Throwable th) {
                        th = th;
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                        str = obj2;
                    }
                    g0g0Var = (dx5) objA;
                    e0g0 e0g0Var3 = j0g0.b;
                    str = obj2;
                    break;
                } catch (Throwable th2) {
                    th = th2;
                    obj2 = obj3;
                }
                Throwable thA = j0g0.a(g0g0Var);
                if (thA != null && !(thA instanceof CancellationException)) {
                    sub0.b.getClass();
                    uub0Var2.b(nh70.i(thA));
                }
                if (!(g0g0Var instanceof g0g0)) {
                    uub0Var2.f36291a.d(str, z3);
                    uub0Var2.b(sub0.SUCCESS);
                }
                z1x.P(g0g0Var);
                a070 a070Var = (a070) ((dx5) g0g0Var).a();
                str4.getClass();
                Iterable iterable = a070Var.f13a;
                List list2 = a070Var.b;
                if (iterable == null) {
                    iterable = iun.f15405a;
                }
                ArrayList<wz60> arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : iterable) {
                    List list3 = ((wz60) obj5).h;
                    if (list3 == null || !list3.contains(157360)) {
                        arrayList2.add(obj5);
                    } else {
                        arrayList.add(obj5);
                    }
                }
                p070 p070Var = new p070(hkb.S(str4, arrayList2, list2), hmw0.h0(a070Var.c));
                if (list2 != null) {
                    int iA = wp20.a(r3d.q(list2, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iA);
                    for (Object obj6 : list2) {
                        linkedHashMap.put(((zz60) obj6).f45237a, obj6);
                    }
                } else {
                    linkedHashMap = lun.f20680a;
                    linkedHashMap.getClass();
                }
                ArrayList arrayList3 = new ArrayList();
                for (wz60 wz60Var : arrayList) {
                    if (wz60Var == null) {
                        obj4 = null;
                        jf4.k(null);
                        return obj4;
                    }
                    Boolean bool = wz60Var.l;
                    Integer num = wz60Var.b;
                    Integer num2 = wz60Var.f40009a;
                    long jIntValue = num2 != null ? num2.intValue() : 0L;
                    zz60 zz60Var = (zz60) linkedHashMap.get(num);
                    String str5 = zz60Var != null ? zz60Var.b : null;
                    String str6 = str5 == null ? "" : str5;
                    int iIntValue = num != null ? num.intValue() : 0;
                    Double d = wz60Var.i;
                    String strValueOf = d != null ? String.valueOf(d.doubleValue()) : null;
                    String str7 = strValueOf == null ? "" : strValueOf;
                    hcs hcsVar = wz60Var.c;
                    if (hcsVar == null) {
                        hcsVar = hcs.NONE;
                    }
                    hcs hcsVar2 = hcsVar;
                    t470 t470Var = a570.Companion;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    t470Var.getClass();
                    a570 a570VarA = t470.a(zBooleanValue, jIntValue);
                    Boolean bool2 = wz60Var.d;
                    boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                    boolean zBooleanValue3 = bool != null ? bool.booleanValue() : false;
                    List list4 = wz60Var.h;
                    if (list4 == null) {
                        list4 = iun.f15405a;
                    }
                    List list5 = list4;
                    hds.Companion.getClass();
                    hds hdsVarB = dds.b(str4, wz60Var);
                    Boolean bool3 = wz60Var.m;
                    boolean zBooleanValue4 = bool3 != null ? bool3.booleanValue() : false;
                    Boolean bool4 = wz60Var.n;
                    arrayList3.add(new pe8(jIntValue, str6, iIntValue, hcsVar2, a570VarA, str7, zBooleanValue2, zBooleanValue3, list5, hdsVarB, zBooleanValue4, true, bool4 != null ? bool4.booleanValue() : false));
                }
                return new d7d(p070Var, arrayList3);
            default:
                uub0 uub0Var3 = pbtVar.e;
                wne wneVar2 = wne.f39444a;
                boolean z5 = this.j;
                if (z5) {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    try {
                        z1x.P(obj);
                        objE = obj;
                        z = true;
                        z2 = z3;
                        str2 = null;
                        uub0Var = uub0Var3;
                        i = 157360;
                        g0g0Var2 = (u2t) objE;
                        e0g0 e0g0Var4 = j0g0.b;
                    } catch (Throwable th3) {
                        th = th3;
                        z = true;
                        z2 = z3;
                        str2 = null;
                        uub0Var = uub0Var3;
                        i = 157360;
                        e0g0 e0g0Var5 = j0g0.b;
                        g0g0Var2 = new g0g0(th);
                    }
                    break;
                } else {
                    z1x.P(obj);
                    String strA3 = z3 ? pbtVar.i.a() : null;
                    int i3 = this.o;
                    try {
                        e0g0 e0g0Var6 = j0g0.b;
                        gxu gxuVar2 = pbtVar.g;
                        pbtVar.h.getClass();
                        String strA4 = pbtVar.n.a();
                        this.k = null;
                        this.j = true;
                        nz60 nz60Var = (nz60) ((o270) gxuVar2.b).invoke();
                        str2 = null;
                        z = true;
                        uub0Var = uub0Var3;
                        z2 = z3;
                        i = 157360;
                        try {
                            objE = nz60Var.e(strA3, 22, strA4, 1, 1357, i3, this);
                            if (objE == wneVar2) {
                                return wneVar2;
                            }
                            g0g0Var2 = (u2t) objE;
                            e0g0 e0g0Var7 = j0g0.b;
                        } catch (Throwable th4) {
                            th = th4;
                            e0g0 e0g0Var8 = j0g0.b;
                            g0g0Var2 = new g0g0(th);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z = true;
                        str2 = null;
                        uub0Var = uub0Var3;
                        i = 157360;
                        z2 = z3;
                        e0g0 e0g0Var9 = j0g0.b;
                        g0g0Var2 = new g0g0(th);
                    }
                    break;
                }
                Throwable thA2 = j0g0.a(g0g0Var2);
                if (thA2 != null && !(thA2 instanceof CancellationException)) {
                    sub0.b.getClass();
                    uub0Var.b(nh70.i(thA2));
                }
                if (!(g0g0Var2 instanceof g0g0)) {
                    uub0Var.f36291a.d("PreviewServiceStatusLocalDataSource.CACHE_AUTHORIZED_KEY", z2);
                    uub0Var.b(sub0.SUCCESS);
                }
                z1x.P(g0g0Var2);
                m070 m070Var = (m070) ((u2t) g0g0Var2).a();
                str4.getClass();
                Iterable iterable2 = m070Var.f20941a;
                List list6 = m070Var.c;
                if (iterable2 == null) {
                    iterable2 = iun.f15405a;
                }
                ArrayList<i070> arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj7 : iterable2) {
                    i070 i070Var = (i070) obj7;
                    if (i070Var == null || (list = i070Var.f13936a) == null || list.contains(Integer.valueOf(i)) != z) {
                        arrayList5.add(obj7);
                    } else {
                        arrayList4.add(obj7);
                    }
                }
                p070 p070Var2 = new p070(vfc.S(str4, arrayList5, list6), vfc.T(m070Var.b));
                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList4, 10));
                for (i070 i070Var2 : arrayList4) {
                    if (i070Var2 == null) {
                        jf4.k(str2);
                        return str2;
                    }
                    Boolean bool5 = i070Var2.j;
                    Integer num3 = i070Var2.b;
                    Long l = i070Var2.f;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    if (list6 != null) {
                        Iterator it = list6.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                                l070Var2 = (l070) next;
                            } else {
                                next = str2;
                            }
                            l070Var = (l070) next;
                            if (l070Var != null) {
                                str3 = l070Var.b;
                            } else {
                                str3 = str2;
                            }
                        } while (!Intrinsics.d(l070Var2 != null ? l070Var2.f19185a : str2, num3));
                        l070Var = (l070) next;
                        if (l070Var != null) {
                            str3 = l070Var.b;
                        } else {
                            str3 = str2;
                        }
                    } else {
                        str3 = str2;
                    }
                    String str8 = str3 == null ? "" : str3;
                    int iIntValue2 = num3 != null ? num3.intValue() : 0;
                    String strValueOf2 = String.valueOf(i070Var2.c);
                    hcs hcsVar3 = i070Var2.e;
                    if (hcsVar3 == null) {
                        hcsVar3 = hcs.NONE;
                    }
                    hcs hcsVar4 = hcsVar3;
                    t470 t470Var2 = a570.Companion;
                    long jLongValue2 = l != null ? l.longValue() : 0L;
                    boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : false;
                    t470Var2.getClass();
                    a570 a570VarA2 = t470.a(zBooleanValue5, jLongValue2);
                    Boolean bool6 = i070Var2.g;
                    boolean zBooleanValue6 = bool6 != null ? bool6.booleanValue() : false;
                    boolean zBooleanValue7 = bool5 != null ? bool5.booleanValue() : false;
                    List list7 = i070Var2.f13936a;
                    if (list7 == null) {
                        list7 = iun.f15405a;
                    }
                    List list8 = list7;
                    hds.Companion.getClass();
                    hds hdsVarC = dds.c(str4, i070Var2);
                    Boolean bool7 = i070Var2.m;
                    boolean zBooleanValue8 = bool7 != null ? bool7.booleanValue() : false;
                    Boolean bool8 = i070Var2.n;
                    arrayList6.add(new pe8(jLongValue, str8, iIntValue2, hcsVar4, a570VarA2, strValueOf2, zBooleanValue6, zBooleanValue7, list8, hdsVarC, zBooleanValue8, true, bool8 != null ? bool8.booleanValue() : false));
                }
                return new d7d(p070Var2, arrayList6);
        }
    }
}
