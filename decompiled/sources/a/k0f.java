package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class k0f implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17463a;
    public final /* synthetic */ kmq b;

    public k0f(kmq kmqVar) {
        this.f17463a = (byte) 12;
        bek bekVar = sip.f32274a;
        this.b = kmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0176  */
    /* JADX WARN: Code duplicated, block: B:129:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:149:0x0238  */
    /* JADX WARN: Code duplicated, block: B:173:0x029f  */
    /* JADX WARN: Code duplicated, block: B:193:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:209:0x0336  */
    /* JADX WARN: Code duplicated, block: B:225:0x0372  */
    /* JADX WARN: Code duplicated, block: B:249:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:275:0x0469  */
    /* JADX WARN: Code duplicated, block: B:291:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:322:0x0509  */
    /* JADX WARN: Code duplicated, block: B:360:0x059b  */
    /* JADX WARN: Code duplicated, block: B:376:0x05db  */
    /* JADX WARN: Code duplicated, block: B:392:0x060d  */
    /* JADX WARN: Code duplicated, block: B:404:0x0626  */
    /* JADX WARN: Code duplicated, block: B:414:0x063e A[PHI: r8
  0x063e: PHI (r8v28 java.lang.Object) = (r8v25 java.lang.Object), (r8v29 java.lang.Object) binds: [B:420:0x0650, B:412:0x063b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:431:0x0670  */
    /* JADX WARN: Code duplicated, block: B:447:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:470:0x070c  */
    /* JADX WARN: Code duplicated, block: B:488:0x074c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:504:0x0788  */
    /* JADX WARN: Code duplicated, block: B:520:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:538:0x080a  */
    /* JADX WARN: Code duplicated, block: B:558:0x084f  */
    /* JADX WARN: Code duplicated, block: B:576:0x088b  */
    /* JADX WARN: Code duplicated, block: B:592:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:610:0x0906  */
    /* JADX WARN: Code duplicated, block: B:89:0x0134  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
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
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) throws Throwable {
        j0f j0fVar;
        r0f r0fVar;
        t0f t0fVar;
        d6f d6fVar;
        kbf kbfVar;
        stf stfVar;
        uvf uvfVar;
        wvf wvfVar;
        u0g u0gVar;
        w0g w0gVar;
        Object obj2;
        qag qagVar;
        ddg ddgVar;
        List list;
        List list2;
        j0g0 j0g0Var;
        j0g0 j0g0Var2;
        xgg xggVar;
        Object gkgVar;
        z7h z7hVar;
        ccj ccjVar;
        rhk rhkVar;
        euk eukVar;
        zdn zdnVar;
        den denVar;
        fen fenVar;
        bdo bdoVar;
        ddo ddoVar;
        wfo wfoVar;
        yfo yfoVar;
        xno xnoVar;
        qzo qzoVar;
        pap papVar;
        Object obj3;
        rap rapVar;
        byte b = this.f17463a;
        Object obj4 = "";
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof j0f) {
                    j0fVar = (j0f) yjeVar;
                    int i = j0fVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        j0fVar.j = i - Integer.MIN_VALUE;
                    } else {
                        j0fVar = new j0f(this, yjeVar);
                    }
                } else {
                    j0fVar = new j0f(this, yjeVar);
                }
                Object obj5 = j0fVar.i;
                wne wneVar = wne.f39444a;
                int i2 = j0fVar.j;
                if (i2 == 0) {
                    z1x.P(obj5);
                    if (!Intrinsics.d((cit0) obj, knm0.j())) {
                        j0fVar.j = 1;
                        if (kmqVar.a(obj, j0fVar) == wneVar) {
                            return wneVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof r0f) {
                    r0fVar = (r0f) yjeVar;
                    int i3 = r0fVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        r0fVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        r0fVar = new r0f(this, yjeVar);
                    }
                } else {
                    r0fVar = new r0f(this, yjeVar);
                }
                Object obj6 = r0fVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = r0fVar.j;
                if (i4 == 0) {
                    z1x.P(obj6);
                    if (((q4f) obj) != q4f.b) {
                        r0fVar.j = 1;
                        if (kmqVar.a(obj, r0fVar) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            case 2:
                if (yjeVar instanceof t0f) {
                    t0fVar = (t0f) yjeVar;
                    int i5 = t0fVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        t0fVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        t0fVar = new t0f(this, yjeVar);
                    }
                } else {
                    t0fVar = new t0f(this, yjeVar);
                }
                Object obj7 = t0fVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = t0fVar.j;
                if (i6 == 0) {
                    z1x.P(obj7);
                    q4f q4fVar = ((v0f) obj).b;
                    t0fVar.j = 1;
                    if (kmqVar.a(q4fVar, t0fVar) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj7);
                }
                return Unit.f46060a;
            case 3:
                if (yjeVar instanceof d6f) {
                    d6fVar = (d6f) yjeVar;
                    int i7 = d6fVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        d6fVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        d6fVar = new d6f(this, yjeVar);
                    }
                } else {
                    d6fVar = new d6f(this, yjeVar);
                }
                Object obj8 = d6fVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = d6fVar.j;
                if (i8 == 0) {
                    z1x.P(obj8);
                    if (obj instanceof xa50) {
                        d6fVar.j = 1;
                        if (kmqVar.a(obj, d6fVar) == wneVar4) {
                            return wneVar4;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj8);
                }
                return Unit.f46060a;
            case 4:
                if (yjeVar instanceof kbf) {
                    kbfVar = (kbf) yjeVar;
                    int i9 = kbfVar.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        kbfVar.j = i9 - Integer.MIN_VALUE;
                    } else {
                        kbfVar = new kbf(this, yjeVar);
                    }
                } else {
                    kbfVar = new kbf(this, yjeVar);
                }
                Object obj9 = kbfVar.i;
                wne wneVar5 = wne.f39444a;
                int i10 = kbfVar.j;
                if (i10 == 0) {
                    z1x.P(obj9);
                    r9u0 r9u0Var = ((Boolean) obj).booleanValue() ? r9u0.f30105a : r9u0.b;
                    kbfVar.j = 1;
                    if (kmqVar.a(r9u0Var, kbfVar) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (i10 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj9);
                }
                return Unit.f46060a;
            case 5:
                if (yjeVar instanceof stf) {
                    stfVar = (stf) yjeVar;
                    int i11 = stfVar.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        stfVar.j = i11 - Integer.MIN_VALUE;
                    } else {
                        stfVar = new stf(this, yjeVar);
                    }
                } else {
                    stfVar = new stf(this, yjeVar);
                }
                Object obj10 = stfVar.i;
                wne wneVar6 = wne.f39444a;
                int i12 = stfVar.j;
                if (i12 == 0) {
                    z1x.P(obj10);
                    if (((nlx) obj) instanceof nel) {
                        stfVar.j = 1;
                        if (kmqVar.a(obj, stfVar) == wneVar6) {
                            return wneVar6;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj10);
                }
                return Unit.f46060a;
            case 6:
                if (yjeVar instanceof uvf) {
                    uvfVar = (uvf) yjeVar;
                    int i13 = uvfVar.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        uvfVar.j = i13 - Integer.MIN_VALUE;
                    } else {
                        uvfVar = new uvf(this, yjeVar);
                    }
                } else {
                    uvfVar = new uvf(this, yjeVar);
                }
                Object obj11 = uvfVar.i;
                wne wneVar7 = wne.f39444a;
                int i14 = uvfVar.j;
                if (i14 == 0) {
                    z1x.P(obj11);
                    Long l = new Long(((fs20) obj).a());
                    uvfVar.j = 1;
                    if (kmqVar.a(l, uvfVar) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (i14 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj11);
                }
                return Unit.f46060a;
            case 7:
                if (yjeVar instanceof wvf) {
                    wvfVar = (wvf) yjeVar;
                    int i15 = wvfVar.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        wvfVar.j = i15 - Integer.MIN_VALUE;
                    } else {
                        wvfVar = new wvf(this, yjeVar);
                    }
                } else {
                    wvfVar = new wvf(this, yjeVar);
                }
                Object obj12 = wvfVar.i;
                wne wneVar8 = wne.f39444a;
                int i16 = wvfVar.j;
                if (i16 == 0) {
                    z1x.P(obj12);
                    List list3 = ((o530) obj).b;
                    wvfVar.j = 1;
                    if (kmqVar.a(list3, wvfVar) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (i16 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj12);
                }
                return Unit.f46060a;
            case 8:
                if (yjeVar instanceof u0g) {
                    u0gVar = (u0g) yjeVar;
                    int i17 = u0gVar.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        u0gVar.j = i17 - Integer.MIN_VALUE;
                    } else {
                        u0gVar = new u0g(this, yjeVar);
                    }
                } else {
                    u0gVar = new u0g(this, yjeVar);
                }
                Object obj13 = u0gVar.i;
                wne wneVar9 = wne.f39444a;
                int i18 = u0gVar.j;
                if (i18 == 0) {
                    z1x.P(obj13);
                    m9s m9sVarC = d5c.C((jlr) obj);
                    if (m9sVarC != null) {
                        u0gVar.j = 1;
                        if (kmqVar.a(m9sVarC, u0gVar) == wneVar9) {
                            return wneVar9;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj13);
                }
                return Unit.f46060a;
            case 9:
                if (yjeVar instanceof w0g) {
                    w0gVar = (w0g) yjeVar;
                    int i19 = w0gVar.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        w0gVar.j = i19 - Integer.MIN_VALUE;
                    } else {
                        w0gVar = new w0g(this, yjeVar);
                    }
                } else {
                    w0gVar = new w0g(this, yjeVar);
                }
                Object obj14 = w0gVar.i;
                wne wneVar10 = wne.f39444a;
                int i20 = w0gVar.j;
                if (i20 == 0) {
                    z1x.P(obj14);
                    v5s v5sVar = (v5s) obj;
                    t5s t5sVar = v5sVar instanceof t5s ? (t5s) v5sVar : null;
                    obj2 = t5sVar != null ? t5sVar.h : null;
                    if (obj2 != null) {
                        w0gVar.j = 1;
                        if (kmqVar.a(obj2, w0gVar) == wneVar10) {
                            return wneVar10;
                        }
                    }
                } else {
                    if (i20 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj14);
                }
                return Unit.f46060a;
            case 10:
                if (yjeVar instanceof qag) {
                    qagVar = (qag) yjeVar;
                    int i21 = qagVar.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        qagVar.j = i21 - Integer.MIN_VALUE;
                    } else {
                        qagVar = new qag(this, yjeVar);
                    }
                } else {
                    qagVar = new qag(this, yjeVar);
                }
                Object obj15 = qagVar.i;
                wne wneVar11 = wne.f39444a;
                int i22 = qagVar.j;
                if (i22 == 0) {
                    z1x.P(obj15);
                    Date date = (Date) obj;
                    date.getClass();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(new Date());
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTime(date);
                    String strT = fre0.T(calendar, calendar2);
                    qagVar.j = 1;
                    if (kmqVar.a(strT, qagVar) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (i22 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj15);
                }
                return Unit.f46060a;
            case 11:
                if (yjeVar instanceof ddg) {
                    ddgVar = (ddg) yjeVar;
                    int i23 = ddgVar.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        ddgVar.j = i23 - Integer.MIN_VALUE;
                    } else {
                        ddgVar = new ddg(this, yjeVar);
                    }
                } else {
                    ddgVar = new ddg(this, yjeVar);
                }
                Object obj16 = ddgVar.i;
                wne wneVar12 = wne.f39444a;
                int i24 = ddgVar.j;
                if (i24 == 0) {
                    z1x.P(obj16);
                    hcg hcgVar = (hcg) obj;
                    if (hcgVar == null || (j0g0Var2 = hcgVar.f12822a) == null) {
                        list = null;
                    } else {
                        Object obj17 = j0g0Var2.f15681a;
                        if (obj17 instanceof g0g0) {
                            obj17 = null;
                        }
                        fcg fcgVar = (fcg) obj17;
                        if (fcgVar != null) {
                            list = fcgVar.f9311a;
                        } else {
                            list = null;
                        }
                    }
                    if (list == null) {
                        list = iun.f15405a;
                    }
                    if (hcgVar == null || (j0g0Var = hcgVar.b) == null) {
                        list2 = null;
                    } else {
                        Object obj18 = j0g0Var.f15681a;
                        if (obj18 instanceof g0g0) {
                            obj18 = null;
                        }
                        fcg fcgVar2 = (fcg) obj18;
                        if (fcgVar2 != null) {
                            list2 = fcgVar2.f9311a;
                        } else {
                            list2 = null;
                        }
                    }
                    if (list2 == null) {
                        list2 = iun.f15405a;
                    }
                    if (!list.isEmpty()) {
                        d0t d0tVar = (d0t) CollectionsKt.firstOrNull(list);
                        obj2 = d0tVar != null ? d0tVar.o : null;
                        if (obj2 != null) {
                            obj4 = obj2;
                        }
                    } else if (!list2.isEmpty()) {
                        d0t d0tVar2 = (d0t) CollectionsKt.firstOrNull(list2);
                        obj2 = d0tVar2 != null ? d0tVar2.o : null;
                        if (obj2 != null) {
                            obj4 = obj2;
                        }
                    }
                    ddgVar.j = 1;
                    if (kmqVar.a(obj4, ddgVar) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (i24 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj16);
                }
                return Unit.f46060a;
            case 12:
                if (yjeVar instanceof xgg) {
                    xggVar = (xgg) yjeVar;
                    int i25 = xggVar.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        xggVar.j = i25 - Integer.MIN_VALUE;
                    } else {
                        xggVar = new xgg(this, yjeVar);
                    }
                } else {
                    xggVar = new xgg(this, yjeVar);
                }
                Object obj19 = xggVar.i;
                wne wneVar13 = wne.f39444a;
                int i26 = xggVar.j;
                if (i26 == 0) {
                    z1x.P(obj19);
                    Object obj20 = ((Map) obj).get(sip.c);
                    xggVar.j = 1;
                    if (kmqVar.a(obj20, xggVar) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (i26 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj19);
                }
                return Unit.f46060a;
            case 13:
                pdr0 pdr0Var = (pdr0) obj;
                if (pdr0Var != null) {
                    if (pdr0Var instanceof odr0) {
                        Object obj21 = ((odr0) pdr0Var).f25090a;
                        gkgVar = ((List) obj21).isEmpty() ? new ikg() : new hkg((List) obj21);
                    } else if (pdr0Var instanceof ndr0) {
                        gkgVar = new gkg(((ndr0) pdr0Var).f23349a);
                    }
                    Object objA = kmqVar.a(gkgVar, yjeVar);
                    return objA == wne.f39444a ? objA : Unit.f46060a;
                }
                t9f.b();
                return null;
            case 14:
                Object objA2 = kmqVar.a((List) obj, yjeVar);
                return objA2 == wne.f39444a ? objA2 : Unit.f46060a;
            case 15:
                if (yjeVar instanceof z7h) {
                    z7hVar = (z7h) yjeVar;
                    int i27 = z7hVar.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        z7hVar.j = i27 - Integer.MIN_VALUE;
                    } else {
                        z7hVar = new z7h(this, yjeVar);
                    }
                } else {
                    z7hVar = new z7h(this, yjeVar);
                }
                Object obj22 = z7hVar.i;
                wne wneVar14 = wne.f39444a;
                int i28 = z7hVar.j;
                if (i28 == 0) {
                    z1x.P(obj22);
                    Long l2 = new Long(((fs20) obj).a());
                    z7hVar.j = 1;
                    if (kmqVar.a(l2, z7hVar) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (i28 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj22);
                }
                return Unit.f46060a;
            case 16:
                if (yjeVar instanceof ccj) {
                    ccjVar = (ccj) yjeVar;
                    int i29 = ccjVar.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        ccjVar.j = i29 - Integer.MIN_VALUE;
                    } else {
                        ccjVar = new ccj(this, yjeVar);
                    }
                } else {
                    ccjVar = new ccj(this, yjeVar);
                }
                Object obj23 = ccjVar.i;
                wne wneVar15 = wne.f39444a;
                int i30 = ccjVar.j;
                if (i30 == 0) {
                    z1x.P(obj23);
                    g7m0 g7m0Var = (g7m0) obj;
                    if (g7m0Var instanceof jae0) {
                        throw ((jae0) g7m0Var).b;
                    }
                    if (!(g7m0Var instanceof naj)) {
                        if ((g7m0Var instanceof hbq) || (g7m0Var instanceof h7t0) || (g7m0Var instanceof l460)) {
                            jf4.n("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return null;
                        }
                        t9f.b();
                        return null;
                    }
                    Object obj24 = ((naj) g7m0Var).b;
                    ccjVar.j = 1;
                    if (kmqVar.a(obj24, ccjVar) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (i30 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj23);
                }
                return Unit.f46060a;
            case 17:
                if (yjeVar instanceof rhk) {
                    rhkVar = (rhk) yjeVar;
                    int i31 = rhkVar.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        rhkVar.j = i31 - Integer.MIN_VALUE;
                    } else {
                        rhkVar = new rhk(this, yjeVar);
                    }
                } else {
                    rhkVar = new rhk(this, yjeVar);
                }
                Object obj25 = rhkVar.i;
                wne wneVar16 = wne.f39444a;
                int i32 = rhkVar.j;
                if (i32 == 0) {
                    z1x.P(obj25);
                    bwk bwkVarA = dwk.a((ahk) obj);
                    rhkVar.j = 1;
                    if (kmqVar.a(bwkVarA, rhkVar) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (i32 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj25);
                }
                return Unit.f46060a;
            case 18:
                if (yjeVar instanceof euk) {
                    eukVar = (euk) yjeVar;
                    int i33 = eukVar.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        eukVar.j = i33 - Integer.MIN_VALUE;
                    } else {
                        eukVar = new euk(this, yjeVar);
                    }
                } else {
                    eukVar = new euk(this, yjeVar);
                }
                Object obj26 = eukVar.i;
                wne wneVar17 = wne.f39444a;
                int i34 = eukVar.j;
                if (i34 == 0) {
                    z1x.P(obj26);
                    nuk nukVar = (nuk) obj;
                    nukVar.getClass();
                    List list4 = nukVar.f24152a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj27 : list4) {
                        if (StringsKt.O(((muk) obj27).b, nukVar.b, true)) {
                            arrayList.add(obj27);
                        }
                    }
                    Object pukVar = !arrayList.isEmpty() ? new puk(arrayList) : new quk(nukVar.c);
                    eukVar.j = 1;
                    if (kmqVar.a(pukVar, eukVar) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (i34 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj26);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof zdn) {
                    zdnVar = (zdn) yjeVar;
                    int i35 = zdnVar.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        zdnVar.j = i35 - Integer.MIN_VALUE;
                    } else {
                        zdnVar = new zdn(this, yjeVar);
                    }
                } else {
                    zdnVar = new zdn(this, yjeVar);
                }
                Object obj28 = zdnVar.i;
                wne wneVar18 = wne.f39444a;
                int i36 = zdnVar.j;
                if (i36 == 0) {
                    z1x.P(obj28);
                    hen henVar = (hen) obj;
                    List list5 = henVar.f12930a;
                    ArrayList arrayList2 = new ArrayList(r3d.q(list5, 10));
                    Iterator it = list5.iterator();
                    while (it.hasNext()) {
                        axq.t(((tdn) it.next()).f33777a, arrayList2);
                    }
                    List list6 = henVar.b;
                    ArrayList arrayList3 = new ArrayList(r3d.q(list6, 10));
                    Iterator it2 = list6.iterator();
                    while (it2.hasNext()) {
                        axq.t(((tdn) it2.next()).f33777a, arrayList3);
                    }
                    Pair pair = new Pair(arrayList2, arrayList3);
                    zdnVar.j = 1;
                    if (kmqVar.a(pair, zdnVar) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (i36 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj28);
                }
                return Unit.f46060a;
            case 20:
                if (yjeVar instanceof den) {
                    denVar = (den) yjeVar;
                    int i37 = denVar.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        denVar.j = i37 - Integer.MIN_VALUE;
                    } else {
                        denVar = new den(this, yjeVar);
                    }
                } else {
                    denVar = new den(this, yjeVar);
                }
                Object obj29 = denVar.i;
                wne wneVar19 = wne.f39444a;
                int i38 = denVar.j;
                if (i38 == 0) {
                    z1x.P(obj29);
                    List list7 = ((hen) obj).f12930a;
                    denVar.j = 1;
                    if (kmqVar.a(list7, denVar) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (i38 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj29);
                }
                return Unit.f46060a;
            case 21:
                if (yjeVar instanceof fen) {
                    fenVar = (fen) yjeVar;
                    int i39 = fenVar.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        fenVar.j = i39 - Integer.MIN_VALUE;
                    } else {
                        fenVar = new fen(this, yjeVar);
                    }
                } else {
                    fenVar = new fen(this, yjeVar);
                }
                Object obj30 = fenVar.i;
                wne wneVar20 = wne.f39444a;
                int i40 = fenVar.j;
                if (i40 == 0) {
                    z1x.P(obj30);
                    List list8 = ((hen) obj).b;
                    fenVar.j = 1;
                    if (kmqVar.a(list8, fenVar) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (i40 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj30);
                }
                return Unit.f46060a;
            case 22:
                if (yjeVar instanceof bdo) {
                    bdoVar = (bdo) yjeVar;
                    int i41 = bdoVar.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        bdoVar.j = i41 - Integer.MIN_VALUE;
                    } else {
                        bdoVar = new bdo(this, yjeVar);
                    }
                } else {
                    bdoVar = new bdo(this, yjeVar);
                }
                Object obj31 = bdoVar.i;
                wne wneVar21 = wne.f39444a;
                int i42 = bdoVar.j;
                if (i42 == 0) {
                    z1x.P(obj31);
                    List list9 = (List) obj;
                    ArrayList arrayList4 = new ArrayList(r3d.q(list9, 10));
                    Iterator it3 = list9.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(ddk.s((rco) it3.next()));
                    }
                    bdoVar.j = 1;
                    if (kmqVar.a(arrayList4, bdoVar) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (i42 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj31);
                }
                return Unit.f46060a;
            case 23:
                if (yjeVar instanceof ddo) {
                    ddoVar = (ddo) yjeVar;
                    int i43 = ddoVar.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        ddoVar.j = i43 - Integer.MIN_VALUE;
                    } else {
                        ddoVar = new ddo(this, yjeVar);
                    }
                } else {
                    ddoVar = new ddo(this, yjeVar);
                }
                Object obj32 = ddoVar.i;
                wne wneVar22 = wne.f39444a;
                int i44 = ddoVar.j;
                if (i44 == 0) {
                    z1x.P(obj32);
                    List list10 = (List) obj;
                    int iA = wp20.a(r3d.q(list10, 10));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
                    for (Object obj33 : list10) {
                        linkedHashMap.put(new Long(((xco) obj33).f40655a), obj33);
                    }
                    ddoVar.j = 1;
                    if (kmqVar.a(linkedHashMap, ddoVar) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (i44 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj32);
                }
                return Unit.f46060a;
            case 24:
                if (yjeVar instanceof wfo) {
                    wfoVar = (wfo) yjeVar;
                    int i45 = wfoVar.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        wfoVar.j = i45 - Integer.MIN_VALUE;
                    } else {
                        wfoVar = new wfo(this, yjeVar);
                    }
                } else {
                    wfoVar = new wfo(this, yjeVar);
                }
                Object obj34 = wfoVar.i;
                wne wneVar23 = wne.f39444a;
                int i46 = wfoVar.j;
                if (i46 == 0) {
                    z1x.P(obj34);
                    List list11 = (List) obj;
                    ArrayList arrayList5 = new ArrayList(r3d.q(list11, 10));
                    Iterator it4 = list11.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(bek.p((obo) it4.next()));
                    }
                    wfoVar.j = 1;
                    if (kmqVar.a(arrayList5, wfoVar) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (i46 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj34);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (yjeVar instanceof yfo) {
                    yfoVar = (yfo) yjeVar;
                    int i47 = yfoVar.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        yfoVar.j = i47 - Integer.MIN_VALUE;
                    } else {
                        yfoVar = new yfo(this, yjeVar);
                    }
                } else {
                    yfoVar = new yfo(this, yjeVar);
                }
                Object obj35 = yfoVar.i;
                wne wneVar24 = wne.f39444a;
                int i48 = yfoVar.j;
                if (i48 == 0) {
                    z1x.P(obj35);
                    List list12 = (List) obj;
                    int iA2 = wp20.a(r3d.q(list12, 10));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
                    for (Object obj36 : list12) {
                        linkedHashMap2.put(new Long(((ueo) obj36).f35538a), obj36);
                    }
                    yfoVar.j = 1;
                    if (kmqVar.a(linkedHashMap2, yfoVar) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (i48 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj35);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (yjeVar instanceof xno) {
                    xnoVar = (xno) yjeVar;
                    int i49 = xnoVar.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        xnoVar.j = i49 - Integer.MIN_VALUE;
                    } else {
                        xnoVar = new xno(this, yjeVar);
                    }
                } else {
                    xnoVar = new xno(this, yjeVar);
                }
                Object obj37 = xnoVar.i;
                wne wneVar25 = wne.f39444a;
                int i50 = xnoVar.j;
                if (i50 == 0) {
                    z1x.P(obj37);
                    Boolean boolValueOf = Boolean.valueOf(goo.a((HashMap) obj));
                    xnoVar.j = 1;
                    if (kmqVar.a(boolValueOf, xnoVar) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (i50 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj37);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (yjeVar instanceof qzo) {
                    qzoVar = (qzo) yjeVar;
                    int i51 = qzoVar.j;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        qzoVar.j = i51 - Integer.MIN_VALUE;
                    } else {
                        qzoVar = new qzo(this, yjeVar);
                    }
                } else {
                    qzoVar = new qzo(this, yjeVar);
                }
                Object obj38 = qzoVar.i;
                wne wneVar26 = wne.f39444a;
                int i52 = qzoVar.j;
                if (i52 == 0) {
                    z1x.P(obj38);
                    wzo wzoVar = (wzo) obj;
                    wzoVar.getClass();
                    Integer num = wzoVar.c;
                    if (num == null || num.intValue() != 0) {
                        int iIntValue = num != null ? num.intValue() : 0;
                        String str = wzoVar.d;
                        String str2 = obj4;
                        if (str != null) {
                            str2 = str;
                        }
                        throw new aii0(iIntValue, str2);
                    }
                    String str3 = wzoVar.f40030a;
                    if (str3 == null) {
                        jf4.k(null);
                        return null;
                    }
                    if (str3.length() == 0) {
                        jf4.k(null);
                        return null;
                    }
                    String str4 = wzoVar.b;
                    String str5 = obj4;
                    if (str4 != null) {
                        str5 = str4;
                    }
                    hzo hzoVar = new hzo(str3, str5);
                    qzoVar.j = 1;
                    if (kmqVar.a(hzoVar, qzoVar) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (i52 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj38);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (yjeVar instanceof pap) {
                    papVar = (pap) yjeVar;
                    int i53 = papVar.j;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        papVar.j = i53 - Integer.MIN_VALUE;
                    } else {
                        papVar = new pap(this, yjeVar);
                    }
                } else {
                    papVar = new pap(this, yjeVar);
                }
                Object obj39 = papVar.i;
                wne wneVar27 = wne.f39444a;
                int i54 = papVar.j;
                if (i54 == 0) {
                    z1x.P(obj39);
                    kap kapVar = (kap) obj;
                    if (kapVar instanceof iap) {
                        obj3 = (List) ((iap) kapVar).f14449a;
                    } else {
                        if (!Intrinsics.d(kapVar, jap.f16201a)) {
                            t9f.b();
                            return null;
                        }
                        obj3 = iun.f15405a;
                    }
                    papVar.j = 1;
                    if (kmqVar.a(obj3, papVar) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (i54 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj39);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof rap) {
                    rapVar = (rap) yjeVar;
                    int i55 = rapVar.j;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        rapVar.j = i55 - Integer.MIN_VALUE;
                    } else {
                        rapVar = new rap(this, yjeVar);
                    }
                } else {
                    rapVar = new rap(this, yjeVar);
                }
                Object obj40 = rapVar.i;
                wne wneVar28 = wne.f39444a;
                int i56 = rapVar.j;
                if (i56 == 0) {
                    z1x.P(obj40);
                    List listL0 = CollectionsKt.L0(((Map) obj).values());
                    rapVar.j = 1;
                    if (kmqVar.a(listL0, rapVar) == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (i56 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj40);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ k0f(kmq kmqVar, byte b) {
        this.f17463a = b;
        this.b = kmqVar;
    }

    public /* synthetic */ k0f(kmq kmqVar, Object obj, byte b) {
        this.f17463a = b;
        this.b = kmqVar;
    }
}
