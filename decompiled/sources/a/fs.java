package a;

import android.gov.nist.core.Separators;
import android.text.format.DateFormat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class fs extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs(sd60 sd60Var, mlr mlrVar, int i, boolean z, String str, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        this.l = sd60Var;
        this.m = mlrVar;
        this.k = i;
        this.j = z;
        this.n = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                return new fs(this.l, (Serializable) obj3, this.k, obj2, yjeVar, (byte) 0);
            case 1:
                return new fs(this.l, this.k, obj3, obj2, yjeVar, (byte) 1);
            case 2:
                return new fs(this.l, this.k, obj3, obj2, yjeVar, (byte) 2);
            case 3:
                return new fs(this.l, this.k, obj3, obj2, yjeVar, (byte) 3);
            case 4:
                return new fs(this.l, (Serializable) obj3, this.k, obj2, yjeVar, (byte) 4);
            case 5:
                fs fsVar = new fs(obj3, (List) obj2, this.k, yjeVar, (byte) 5);
                fsVar.l = obj;
                return fsVar;
            case 6:
                return new fs(this.l, (Serializable) obj3, this.k, obj2, yjeVar, (byte) 6);
            case 7:
                return new fs(this.l, (Serializable) obj3, this.k, obj2, yjeVar, (byte) 7);
            case 8:
                return new fs((kwj) this.l, (Function0) obj3, (Function1) obj2, this.k, yjeVar);
            case 9:
                return new fs(this.l, this.k, obj3, obj2, yjeVar, (byte) 9);
            case 10:
                return new fs((sd60) this.l, (mlr) obj3, this.k, this.j, (String) obj2, yjeVar);
            case 11:
                return new fs(this.l, (Serializable) obj3, this.k, obj2, yjeVar, (byte) 11);
            case 12:
                fs fsVar2 = new fs(obj3, (List) obj2, this.k, yjeVar, (byte) 12);
                fsVar2.l = obj;
                return fsVar2;
            case 13:
                fs fsVar3 = new fs(obj3, (List) obj2, this.k, yjeVar, (byte) 13);
                fsVar3.l = obj;
                return fsVar3;
            case 14:
                fs fsVar4 = new fs(obj3, (List) obj2, this.k, yjeVar, (byte) 14);
                fsVar4.l = obj;
                return fsVar4;
            case 15:
                return new fs(this.l, this.k, obj3, obj2, yjeVar, (byte) 15);
            case 16:
                return new fs(this.k, (String) this.l, (pzu) obj3, (File) obj2, yjeVar);
            default:
                return new fs(this.l, this.k, obj3, obj2, yjeVar, (byte) 17);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((fs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((fs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((fs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((fs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((fs) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((fs) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((fs) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((fs) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((fs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((fs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((fs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((fs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((fs) create((c7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((fs) create((c7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((fs) create((c7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((fs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((fs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((fs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r50v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v17, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.ArrayList] */
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
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        Object obj2;
        ocp ocpVar;
        ?? arrayList;
        String str;
        Pair pair;
        Pair pair2;
        Object objA2;
        Object objA3;
        zqq0 zqq0Var;
        ?? arrayList2;
        byte b = this.i;
        int i = this.k;
        byte b2 = 0;
        Object obj3 = this.n;
        Object obj4 = this.m;
        byte b3 = 1;
        List list = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    this.j = true;
                    if (((dn0) ((khf0) this.l).b).a((mlr) obj4, i, (lu0) obj3, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                AtomicInteger atomicInteger = (AtomicInteger) obj4;
                q99 q99Var = (q99) obj3;
                wne wneVar2 = wne.f39444a;
                boolean z10 = this.j;
                try {
                    if (!z10) {
                        z1x.P(obj);
                        gmq gmqVar = ((gmq[]) this.l)[i];
                        n6d n6dVar = new n6d(q99Var, i, (byte) 0);
                        this.j = true;
                        if (gmqVar.c(n6dVar, this) == wneVar2) {
                            return wneVar2;
                        }
                    } else {
                        if (!z10) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        q99Var.d(null);
                    }
                    return Unit.f46060a;
                } catch (Throwable th) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        q99Var.d(null);
                    }
                    throw th;
                }
            case 2:
                kwj kwjVar = (kwj) this.l;
                wne wneVar3 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    if (kwjVar.k() != i) {
                        this.j = true;
                        if (xk80.g(kwjVar, i, null, this, 6) == wneVar3) {
                            return wneVar3;
                        }
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ((pv40) obj4).e((mbo0) ((i4) obj3).get(i));
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    vsg0 vsg0VarV = ydx.V(null, new eb((xcz) this.l, (byte) 23));
                    exn exnVar = new exn(i, (Function0) obj4, (pz40) obj3);
                    this.j = true;
                    if (vsg0VarV.c(exnVar, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                kki kkiVar = (kki) obj3;
                wne wneVar5 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    String strB0 = CollectionsKt.b0((List) this.l, Separators.COMMA, null, null, null, 62);
                    v8p v8pVar = (v8p) kkiVar.e;
                    this.j = true;
                    objA = ((c9p) v8pVar.b.invoke()).a(xp20.f(new Pair("gameIds", strB0), new Pair("lng", (String) obj4), new Pair("ref", new Integer(1)), new Pair("gr", new Integer(1357)), new Pair("country", new Integer(i))), new fk9(false), this);
                    obj2 = wneVar5;
                    if (objA != wneVar5) {
                    }
                    return obj2;
                }
                if (!z13) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objA = obj;
                jtf0 jtf0Var = (jtf0) objA;
                jtf0Var.getClass();
                rcp rcpVar = (rcp) jtf0Var.b;
                if (rcpVar != null && (ocpVar = rcpVar.f30250a) != null) {
                    Iterable<lcp> iterable = ocpVar.b;
                    Integer num = ocpVar.f25037a;
                    if (num != null && num.intValue() == 0 && iterable == null) {
                        iterable = iun.f15405a;
                    }
                    if (iterable != null) {
                        ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
                        for (lcp lcpVar : iterable) {
                            lcpVar.getClass();
                            Long l = lcpVar.f19809a;
                            if (l == null) {
                                jf4.k(null);
                                return null;
                            }
                            long jLongValue = l.longValue();
                            Long l2 = lcpVar.b;
                            if (l2 == null) {
                                jf4.k(null);
                                return null;
                            }
                            long jLongValue2 = l2.longValue();
                            Long l3 = lcpVar.c;
                            if (l3 == null) {
                                jf4.k(null);
                                return null;
                            }
                            long jLongValue3 = l3.longValue();
                            Long l4 = lcpVar.d;
                            long jLongValue4 = l4 != null ? l4.longValue() : 0L;
                            String str2 = lcpVar.f;
                            if (str2 == null) {
                                jf4.k(null);
                                return null;
                            }
                            Long l5 = lcpVar.g;
                            if (l5 == null) {
                                jf4.k(null);
                                return null;
                            }
                            long jLongValue5 = l5.longValue();
                            String str3 = lcpVar.h;
                            String str4 = str3 == null ? "" : str3;
                            List list2 = lcpVar.i;
                            if (list2 == null) {
                                jf4.k(null);
                                return null;
                            }
                            List list3 = lcpVar.j;
                            if (list3 == null) {
                                list3 = iun.f15405a;
                            }
                            List list4 = list3;
                            String str5 = lcpVar.k;
                            if (str5 == null) {
                                jf4.k(null);
                                return null;
                            }
                            String str6 = lcpVar.l;
                            String str7 = str6 == null ? "" : str6;
                            List list5 = lcpVar.m;
                            if (list5 == null) {
                                list5 = iun.f15405a;
                            }
                            List list6 = list5;
                            List list7 = lcpVar.n;
                            if (list7 == null) {
                                list7 = iun.f15405a;
                            }
                            List list8 = list7;
                            String str8 = lcpVar.o;
                            String str9 = str8 == null ? "" : str8;
                            String str10 = lcpVar.p;
                            String str11 = str10 == null ? "" : str10;
                            Long l6 = lcpVar.q;
                            if (l6 == null) {
                                jf4.k(null);
                                return null;
                            }
                            long jLongValue6 = l6.longValue();
                            Map map = lcpVar.r;
                            if (map == null) {
                                map = lun.f20680a;
                                map.getClass();
                            }
                            Map map2 = map;
                            String str12 = lcpVar.s;
                            String str13 = str12 == null ? "" : str12;
                            Long l7 = lcpVar.e;
                            if (l7 == null) {
                                jf4.k(null);
                                return null;
                            }
                            long jLongValue7 = l7.longValue();
                            Boolean bool = lcpVar.t;
                            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                            String str14 = lcpVar.u;
                            String str15 = str14 == null ? "" : str14;
                            Integer num2 = lcpVar.v;
                            int iIntValue = num2 != null ? num2.intValue() : 0;
                            Integer num3 = lcpVar.w;
                            int iIntValue2 = num3 != null ? num3.intValue() : 0;
                            List<wum0> list9 = lcpVar.x;
                            if (list9 != null) {
                                arrayList = new ArrayList();
                                for (wum0 wum0Var : list9) {
                                    String str16 = wum0Var.f39798a;
                                    scp scpVar = (str16 == null || (str = wum0Var.b) == null) ? null : new scp(str16, str);
                                    if (scpVar != null) {
                                        arrayList.add(scpVar);
                                    }
                                }
                            } else {
                                arrayList = iun.f15405a;
                            }
                            arrayList3.add(new l2g0(jLongValue, jLongValue2, jLongValue3, jLongValue4, str15, jLongValue7, str2, jLongValue5, str4, list2, list4, str5, str7, list6, list8, str9, "", str11, jLongValue6, map2, str13, zBooleanValue, iIntValue, iIntValue2, arrayList));
                        }
                        f8p f8pVar = (f8p) kkiVar.f;
                        f8pVar.getClass();
                        f8pVar.b.d(arrayList3);
                        obj2 = arrayList3;
                        return obj2;
                    }
                }
                jf4.k(null);
                return null;
            case 5:
                kki kkiVar2 = (kki) obj4;
                knf0 knf0Var = (knf0) kkiVar2.c;
                kmq kmqVar = (kmq) this.l;
                wne wneVar6 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    vsg0 vsg0VarH0 = bkb.h0(60L, TimeUnit.SECONDS, new fs(obj3, (Serializable) knf0Var.c(), this.k, (Object) kkiVar2, (yje) null, (byte) 4));
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar, vsg0VarH0, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                yhi yhiVar = (yhi) this.l;
                wne wneVar7 = wne.f39444a;
                boolean z15 = this.j;
                if (z15) {
                    if (z15) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                if (((iqt) yhiVar.o).f15225a.a()) {
                    krt0 krt0VarA = ((x4v) yhiVar.f42638a).a();
                    pair = new Pair(new Long(krt0VarA.f18785a), Boolean.valueOf(krt0VarA.b));
                } else {
                    pair = new Pair(new Long(0L), Boolean.FALSE);
                }
                long jLongValue8 = ((Number) pair.f46059a).longValue();
                boolean zBooleanValue2 = ((Boolean) pair.b).booleanValue();
                String str17 = (String) obj4;
                boolean zBooleanValue3 = ((Boolean) ((xvu) obj3).invoke()).booleanValue();
                hie0 hie0Var = new hie0();
                hie0Var.f13108a = zBooleanValue3;
                hie0 hie0Var2 = new hie0();
                hie0Var2.f13108a = zBooleanValue2;
                a1g a1gVarP = uvw.P(new fnq(new a1g(new vsg0(new kwu(yhiVar, str17, hie0Var2, this.k, jLongValue8, null, (byte) 0)), new lwu(b2, z4 ? 1 : 0, yhiVar, hie0Var2), (byte) 20), new mwu(b2, z3 ? 1 : 0, yhiVar, hie0Var), (byte) 4), new lqu(hie0Var, (byte) 4), 3L, new nwu(yhiVar, z2 ? 1 : 0, b2), new owu(yhiVar, z ? 1 : 0, b2), null, 40);
                this.j = true;
                Object objK = ntb.K(a1gVarP, this);
                return objK == wneVar7 ? wneVar7 : objK;
            case 7:
                yhi yhiVar2 = (yhi) this.l;
                wne wneVar8 = wne.f39444a;
                boolean z16 = this.j;
                if (z16) {
                    if (z16) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                if (((iqt) yhiVar2.o).f15225a.a()) {
                    krt0 krt0VarA2 = ((x4v) yhiVar2.f42638a).a();
                    pair2 = new Pair(new Long(krt0VarA2.f18785a), Boolean.valueOf(krt0VarA2.c));
                } else {
                    pair2 = new Pair(new Long(0L), Boolean.FALSE);
                }
                long jLongValue9 = ((Number) pair2.f46059a).longValue();
                boolean zBooleanValue4 = ((Boolean) pair2.b).booleanValue();
                String str18 = (String) obj4;
                boolean zBooleanValue5 = ((Boolean) ((xvu) obj3).invoke()).booleanValue();
                hie0 hie0Var3 = new hie0();
                hie0Var3.f13108a = zBooleanValue5;
                hie0 hie0Var4 = new hie0();
                hie0Var4.f13108a = zBooleanValue4;
                a1g a1gVarP2 = uvw.P(new fnq(new a1g(new vsg0(new kwu(yhiVar2, str18, hie0Var4, this.k, jLongValue9, null, (byte) 1)), new lwu(b3, z8 ? 1 : 0, yhiVar2, hie0Var4), (byte) 20), new mwu(b3, z7 ? 1 : 0, yhiVar2, hie0Var3), (byte) 4), new lqu(hie0Var3, (byte) 3), 3L, new nwu(yhiVar2, z6 ? 1 : 0, b3), new owu(yhiVar2, z5 ? 1 : 0, b3), null, 40);
                this.j = true;
                Object objK2 = ntb.K(a1gVarP2, this);
                return objK2 == wneVar8 ? wneVar8 : objK2;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z17 = this.j;
                if (z17) {
                    if (z17) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                kwj kwjVar2 = (kwj) this.l;
                qoj0 qoj0Var = kwjVar2.p.f12108a;
                vs50 vs50Var = new vs50((Function0) obj4, (Function1) obj3, kwjVar2, i);
                this.j = true;
                qoj0Var.c(vs50Var, this);
                return wneVar9;
            case 9:
                xk80 xk80Var = (xk80) obj4;
                pz40 pz40Var = (pz40) obj3;
                wne wneVar10 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    int size = ((a4x) this.l).size();
                    if (size > 0 && i >= 0 && i < size && i != xk80Var.k()) {
                        pz40Var.setValue(Boolean.TRUE);
                        int iD = l1e0.d(i, 0, size - 1);
                        uts0 uts0VarM0 = ro4.m0(700, 0, new zsf(0.0f, 1.0f, 1.0f, 1.0f), 2);
                        this.j = true;
                        if (xk80.g(xk80Var, iD, uts0VarM0, this, 2) == wneVar10) {
                            return wneVar10;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z18) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                ((oeg0) ((sd60) this.l).b).c().d(new d5d((sd60) this.l, (mlr) obj4, this.k, this.j, (String) obj3));
                return Unit.f46060a;
            case 11:
                v3b0 v3b0Var = (v3b0) this.l;
                wne wneVar12 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    ytt yttVar = v3b0Var.O;
                    aue0 aue0Var = aue0.d;
                    this.j = true;
                    if (yttVar.a(aue0Var, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                v3b0Var.o.d(new ec3(v3b0Var, (mlr) obj4, this.k, (String) obj3, (byte) 13));
                return Unit.f46060a;
            case 12:
                eze0 eze0Var = (eze0) obj4;
                c7a c7aVar = (c7a) this.l;
                wne wneVar13 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    ynb0 ynb0Var = c7aVar.f3852a;
                    boolean z21 = ((aye0) eze0Var.D()).m.N0;
                    boolean z22 = ((aye0) eze0Var.D()).m.e0;
                    this.l = null;
                    this.j = true;
                    if (eze0Var.k0((List) obj3, ynb0Var, this.k, z21, z22, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                x5f0 x5f0Var = (x5f0) obj4;
                c7a c7aVar2 = (c7a) this.l;
                wne wneVar14 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    ynb0 ynb0Var2 = c7aVar2.f3852a;
                    boolean z24 = ((u4f0) x5f0Var.D()).m.N0;
                    boolean z25 = ((u4f0) x5f0Var.D()).m.e0;
                    this.l = null;
                    this.j = true;
                    if (x5f0Var.g0((List) obj3, ynb0Var2, this.k, z24, z25, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                ocf0 ocf0Var = (ocf0) obj4;
                c7a c7aVar3 = (c7a) this.l;
                wne wneVar15 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    ynb0 ynb0Var3 = c7aVar3.f3852a;
                    boolean z27 = ((mbf0) ocf0Var.D()).m.N0;
                    boolean z28 = ((mbf0) ocf0Var.D()).m.e0;
                    this.l = null;
                    this.j = true;
                    if (ocf0Var.i0((List) obj3, ynb0Var3, this.k, z27, z28, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    if (((ua5) ((p6t0) this.l)).f && i == q3d.i((a4x) obj4)) {
                        this.j = true;
                        v0h0 v0h0Var = xcz.y;
                        if (((xcz) obj3).f(i, 0, this) == wneVar16) {
                            return wneVar16;
                        }
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                pzu pzuVar = (pzu) obj4;
                wne wneVar17 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    String str19 = (String) this.l;
                    int offset = TimeZone.getDefault().getOffset(new Date().getTime());
                    long j = offset;
                    double d = j / 3600000;
                    double d2 = ((j / 60000) - (60.0d * d)) / 100.0d;
                    knj0 knj0Var = new knj0(this.k, str19, offset < 0 ? d - Math.abs(d2) : d + d2, !DateFormat.is24HourFormat(((tgk) pzuVar.b).f33916a));
                    lef0 lef0Var = (lef0) pzuVar.f27863a;
                    String strA = ((btt0) pzuVar.f).a();
                    this.j = true;
                    objA2 = ((nmj0) ((rta0) lef0Var.f19899a).invoke()).a(strA, knj0Var, this);
                    if (objA2 == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                ResponseBody responseBody = (ResponseBody) objA2;
                File file = new File((File) obj3, kng0.l("coupon_", (String) this.l, ".png"));
                try {
                    try {
                        InputStream inputStreamA = responseBody.a();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            wha0.J(inputStreamA, fileOutputStream, 8192);
                            fileOutputStream.close();
                            responseBody.close();
                            return file;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                bkb.E(fileOutputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            bkb.E(responseBody, th4);
                            throw th5;
                        }
                    }
                } catch (IOException e) {
                    file.delete();
                    if (vic.A(e)) {
                        throw new xto();
                    }
                    throw e;
                }
            default:
                wne wneVar18 = wne.f39444a;
                boolean z31 = this.j;
                if (!z31) {
                    z1x.P(obj);
                    nvu nvuVar = (nvu) this.l;
                    afm0 afm0Var = (afm0) nvuVar.c;
                    this.j = true;
                    objA3 = ((flr0) ((lkr0) afm0Var.c).invoke()).a(((knf0) nvuVar.d).c(), (String) obj4, this.k, 1, 70, this);
                    if (objA3 == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z31) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                tlr0 tlr0Var = (tlr0) ((dx5) objA3).a();
                String str20 = (String) obj3;
                str20.getClass();
                List<klr0> list10 = tlr0Var.f34161a;
                if (list10 != null) {
                    ArrayList arrayList4 = new ArrayList(r3d.q(list10, 10));
                    for (klr0 klr0Var : list10) {
                        klr0Var.getClass();
                        Integer num4 = klr0Var.f18506a;
                        int iIntValue3 = num4 != null ? num4.intValue() : 0;
                        s9m0 s9m0Var = zqq0.b;
                        Integer num5 = klr0Var.b;
                        int iIntValue4 = num5 != null ? num5.intValue() : 0;
                        s9m0Var.getClass();
                        zqq0[] zqq0VarArrValues = zqq0.values();
                        int length = zqq0VarArrValues.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                zqq0Var = zqq0VarArrValues[i2];
                                if (zqq0Var.f44818a != iIntValue4) {
                                    i2++;
                                }
                            } else {
                                zqq0Var = null;
                            }
                        }
                        if (zqq0Var == null) {
                            zqq0Var = zqq0.CANCELED;
                        }
                        zqq0 zqq0Var2 = zqq0Var;
                        String str21 = klr0Var.c;
                        String str22 = str21 == null ? "" : str21;
                        String str23 = klr0Var.d;
                        String str24 = str23 == null ? "" : str23;
                        String str25 = klr0Var.e;
                        String str26 = str25 == null ? "" : str25;
                        String str27 = klr0Var.f;
                        String str28 = str27 == null ? "" : str27;
                        Integer num6 = klr0Var.g;
                        int iIntValue5 = num6 != null ? num6.intValue() : 0;
                        Integer num7 = klr0Var.h;
                        int iIntValue6 = num7 != null ? num7.intValue() : 0;
                        Integer num8 = klr0Var.i;
                        int iIntValue7 = num8 != null ? num8.intValue() : 0;
                        Integer num9 = klr0Var.j;
                        int iIntValue8 = num9 != null ? num9.intValue() : 0;
                        Long l8 = klr0Var.k;
                        long jLongValue10 = l8 != null ? l8.longValue() : 0L;
                        List<vlf0> list11 = klr0Var.l;
                        if (list11 != null) {
                            arrayList2 = new ArrayList(r3d.q(list11, 10));
                            for (vlf0 vlf0Var : list11) {
                                vlf0Var.getClass();
                                String str29 = vlf0Var.f37620a;
                                if (str29 == null) {
                                    str29 = "";
                                }
                                String str30 = vlf0Var.b;
                                if (str30 == null) {
                                    str30 = "";
                                }
                                Integer num10 = vlf0Var.c;
                                int iIntValue9 = num10 != null ? num10.intValue() : 0;
                                Integer num11 = vlf0Var.d;
                                arrayList2.add(new slf0(iIntValue9, str29, num11 != null ? num11.intValue() : 0, str30));
                            }
                        } else {
                            arrayList2 = 0;
                        }
                        if (arrayList2 == 0) {
                            arrayList2 = iun.f15405a;
                        }
                        arrayList4.add(new hlr0(iIntValue3, zqq0Var2, str22, str24, str26, str28, iIntValue5, iIntValue6, iIntValue7, iIntValue8, jLongValue10, arrayList2));
                    }
                    list = arrayList4;
                }
                if (list == null) {
                    list = iun.f15405a;
                }
                return new qlr0(list, str20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs(kwj kwjVar, Function0 function0, Function1 function1, int i, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        this.l = kwjVar;
        this.m = function0;
        this.n = function1;
        this.k = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs(int i, String str, pzu pzuVar, File file, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 16;
        this.k = i;
        this.l = str;
        this.m = pzuVar;
        this.n = file;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fs(Object obj, int i, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = i;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fs(Object obj, Serializable serializable, int i, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = serializable;
        this.k = i;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fs(Object obj, List list, int i, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = list;
        this.k = i;
    }
}
