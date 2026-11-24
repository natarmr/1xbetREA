package a;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.crystal.presentation.views.CrystalFieldView;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;
import org.xplatform.uikit.compose.components.calendar.model.DateRangeModel;
import org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vef implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37284a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vef(Object obj, Object obj2, byte b) {
        this.f37284a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0130  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:135:0x0212  */
    /* JADX WARN: Code duplicated, block: B:150:0x023e  */
    /* JADX WARN: Code duplicated, block: B:165:0x0267  */
    /* JADX WARN: Code duplicated, block: B:179:0x0285  */
    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:193:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x010c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map map;
        btk btkVar;
        btk btkVar2;
        Object obj;
        List list;
        List list2;
        Object obj2;
        j0g0 j0g0Var;
        j0g0 j0g0Var2;
        j0g0 j0g0Var3;
        j0g0 j0g0Var4;
        j0g0 j0g0Var5;
        Object obj3;
        btk btkVar3;
        btk btkVar4;
        tqk tqkVar;
        Object obj4;
        Object obj5;
        List list3;
        j0g0 j0g0Var6;
        j0g0 j0g0Var7;
        j0g0 j0g0Var8;
        j0g0 j0g0Var9;
        j0g0 j0g0Var10;
        byte b = this.f37284a;
        Object obj6 = null;
        boolean z = false;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                return CrystalFieldView.d((CrystalFieldView) obj8, (LinkedHashMap) obj7);
            case 1:
                d9z d9zVar = (d9z) obj7;
                if (!((Boolean) ((l7m0) obj8).getValue()).booleanValue() && d9zVar.h.a()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                yag yagVar = (yag) obj8;
                s7g s7gVar = (s7g) obj7;
                usd usdVar = s7g.U1;
                int iOrdinal = yagVar.ordinal();
                if (iOrdinal == 0) {
                    qud qudVar = n5g.S1;
                    CyberCalendarParams cyberCalendarParamsG0 = s7gVar.G0();
                    qudVar.getClass();
                    n5g n5gVar = new n5g();
                    n5gVar.R1.J(n5gVar, n5g.U1[1], cyberCalendarParamsG0);
                    return n5gVar;
                }
                if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                qud qudVar2 = b9g.R1;
                boolean z2 = s7gVar.G0().d;
                qudVar2.getClass();
                b9g b9gVar = new b9g();
                iiy[] iiyVarArr = b9g.S1;
                b9gVar.M1.u(b9gVar, iiyVarArr[1], yagVar);
                b9gVar.N1.u(b9gVar, iiyVarArr[2], Boolean.valueOf(z2));
                return b9gVar;
            case 3:
                wbg wbgVar = (wbg) obj7;
                ((Function1) obj8).invoke(new h6h(!wbgVar.b, wbgVar.f38876a.f12573a));
                return Unit.f46060a;
            case 4:
                Map map2 = (Map) obj7;
                for (wbg wbgVar2 : (a4x) obj8) {
                    ngk0 ngk0Var = (ngk0) map2.get(Long.valueOf(wbgVar2.f38876a.f12573a));
                    if (ngk0Var != null) {
                        Iterator it = ngk0Var.c.iterator();
                        while (true) {
                            a8m0 a8m0Var = (a8m0) it;
                            if (a8m0Var.hasNext()) {
                                if (((Integer) ((a8m0) it).next()).intValue() >= wbgVar2.f38876a.g.size()) {
                                    a8m0Var.remove();
                                }
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 5:
                sig sigVar = (sig) obj7;
                n0o0 n0o0Var = ((hjg) obj8).d;
                fee feeVar = (fee) n0o0Var.getValue();
                mig migVar = sigVar.h;
                if (migVar != null) {
                    Object obj9 = migVar.f21844a;
                    e0g0 e0g0Var = j0g0.b;
                    obj6 = (List) (obj9 instanceof g0g0 ? null : obj9);
                }
                if (obj6 == null) {
                    obj6 = iun.f15405a;
                }
                ?? r7 = obj6;
                wcb wcbVar = sigVar.g;
                List list4 = sigVar.j;
                String str = sigVar.i;
                boolean z3 = sigVar.k;
                List list5 = sigVar.l;
                boolean z4 = list5.size() >= 10;
                if (migVar == null || (map = migVar.e) == null) {
                    map = lun.f20680a;
                    map.getClass();
                }
                feeVar.d(new lig(r7, wcbVar, list4, str, z3, list5, z4, map));
                return (a4x) ((fee) n0o0Var.getValue()).b();
            case 6:
                d9z d9zVar2 = (d9z) obj8;
                yog yogVar = (yog) obj7;
                if (d9zVar2.h() == 0 && d9zVar2.i() == 0 && yogVar.b.l() <= 0.0f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                zog zogVar = (zog) obj7;
                kwd kwdVar = upg.X1;
                ((upg) obj8).H0().x(zogVar.c, zogVar.d);
                return Unit.f46060a;
            case 8:
                k7h k7hVar = (k7h) obj8;
                pz40 pz40Var = (pz40) obj7;
                if (k7hVar.f) {
                    pz40Var.setValue(k7hVar);
                }
                return Unit.f46060a;
            case 9:
                ((ujd) obj8).getClass();
                ujd.a((Fragment) obj7);
                return Unit.f46060a;
            case 10:
                ((Function1) obj8).invoke(Long.valueOf(((ihh) obj7).f14779a));
                return Unit.f46060a;
            case 11:
                ((Function1) obj8).invoke(Long.valueOf(((joh) obj7).f16858a));
                return Unit.f46060a;
            case 12:
                ((Function1) obj8).invoke(((qoh) obj7).b);
                return Unit.f46060a;
            case 13:
                Function2 function2 = (Function2) obj8;
                cql cqlVar = (cql) obj7;
                if (function2 != null) {
                    function2.invoke(Long.valueOf(cqlVar.f4799a), cqlVar.c);
                }
                return Unit.f46060a;
            case 14:
                ((Function1) obj8).invoke(Long.valueOf(((i0i) obj7).f13949a));
                return Unit.f46060a;
            case 15:
                int i = DSLottieEmptyContainer.d;
                DsLottieEmpty dsLottieEmpty = new DsLottieEmpty((Context) obj8, (AttributeSet) obj7, 0);
                dsLottieEmpty.setId(jmu0.d());
                return dsLottieEmpty;
            case 16:
                Function1 function1 = (Function1) obj8;
                k9n k9nVar = (k9n) obj7;
                if (function1 != null) {
                    function1.invoke(k9nVar);
                }
                return Unit.f46060a;
            case 17:
                int i2 = q1j.n2;
                return Boolean.valueOf(((kwj) obj8).k() == q3d.i(((e2j) ((pz40) obj7).getValue()).f7089a.f25510a));
            case 18:
                f3j f3jVar = (f3j) obj8;
                ((rl1) f3jVar.e).d(new ngh(f3jVar, (hm1) obj7, (byte) 7));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                g3j g3jVar = (g3j) obj8;
                ((rl1) g3jVar.j).d(new ngh(g3jVar, (hm1) obj7, (byte) 8));
                return Unit.f46060a;
            case 20:
                vcj vcjVar = (vcj) obj7;
                kud kudVar = vcj.m2;
                SimpleDate simpleDateA = ((hdj) obj8).a();
                if (simpleDateA != null) {
                    vcjVar.F().t0(i120.V(new Pair("RESULT_KEY_CALENDAR_SIMPLE_DATE", simpleDateA)), vcjVar.l2.n(vcjVar, vcj.n2[1]));
                    vcjVar.x0();
                }
                return Unit.f46060a;
            case 21:
                dej dejVar = (dej) obj7;
                kwd kwdVar2 = dej.l2;
                DateRangeModel dateRangeModelA = ((jej) obj8).a();
                if (dateRangeModelA.f47284a != null && dateRangeModelA.b != null) {
                    dejVar.F().t0(i120.V(new Pair("RESULT_KEY_CALENDAR_DATE_RANGE", dateRangeModelA)), "RESULT_KEY_CALENDAR_RANGE_REQUEST");
                    dejVar.x0();
                }
                return Unit.f46060a;
            case 22:
                return androidx.compose.runtime.e.e(new xk9((SimpleDateTime) obj8, (SimpleDateTime) obj7));
            case 23:
                return androidx.compose.runtime.e.e(new wk9((SimpleDate) obj8, (SimpleDate) obj7));
            case 24:
                ((zrj) obj8).b.q(new ya50(((tcp) obj7).f33727a), true);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new ikx(x1x.J(((v4q0) obj8).L0((j6z) ((Function0) obj7).invoke())));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((b5q0) obj8).d.invoke((g5q0) obj7);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                bqk bqkVar = (bqk) obj8;
                n0o0 n0o0Var2 = bqkVar.k;
                n0o0 n0o0Var3 = bqkVar.j;
                n0o0 n0o0Var4 = bqkVar.i;
                n0o0 n0o0Var5 = bqkVar.h;
                n0o0 n0o0Var6 = bqkVar.g;
                fee feeVar2 = (fee) n0o0Var6.getValue();
                j0g0 j0g0Var11 = ((ksk) obj7).d;
                if (j0g0Var11 != null) {
                    Object obj10 = j0g0Var11.f15681a;
                    if (obj10 instanceof g0g0) {
                        obj10 = null;
                    }
                    kuk kukVar = (kuk) obj10;
                    if (kukVar == null || (j0g0Var5 = kukVar.c) == null) {
                        btkVar = new btk(iun.f15405a, "");
                    } else {
                        Object obj11 = j0g0Var5.f15681a;
                        if (obj11 instanceof g0g0) {
                            obj11 = null;
                        }
                        btkVar = (btk) obj11;
                        if (btkVar == null) {
                            btkVar = new btk(iun.f15405a, "");
                        }
                    }
                } else {
                    btkVar = new btk(iun.f15405a, "");
                }
                feeVar2.d(btkVar);
                fee feeVar3 = (fee) n0o0Var5.getValue();
                if (j0g0Var11 != null) {
                    Object obj12 = j0g0Var11.f15681a;
                    if (obj12 instanceof g0g0) {
                        obj12 = null;
                    }
                    kuk kukVar2 = (kuk) obj12;
                    if (kukVar2 == null || (j0g0Var4 = kukVar2.d) == null) {
                        btkVar2 = new btk(iun.f15405a, "");
                    } else {
                        Object obj13 = j0g0Var4.f15681a;
                        if (obj13 instanceof g0g0) {
                            obj13 = null;
                        }
                        btkVar2 = (btk) obj13;
                        if (btkVar2 == null) {
                            btkVar2 = new btk(iun.f15405a, "");
                        }
                    }
                } else {
                    btkVar2 = new btk(iun.f15405a, "");
                }
                feeVar3.d(btkVar2);
                fee feeVar4 = (fee) n0o0Var4.getValue();
                if (j0g0Var11 != null) {
                    Object obj14 = j0g0Var11.f15681a;
                    if (obj14 instanceof g0g0) {
                        obj14 = null;
                    }
                    kuk kukVar3 = (kuk) obj14;
                    if (kukVar3 == null || (j0g0Var3 = kukVar3.g) == null) {
                        obj = iun.f15405a;
                    } else {
                        Object obj15 = j0g0Var3.f15681a;
                        if (obj15 instanceof g0g0) {
                            obj15 = null;
                        }
                        obj = (List) obj15;
                        if (obj == null) {
                            obj = iun.f15405a;
                        }
                    }
                } else {
                    obj = iun.f15405a;
                }
                feeVar4.d(obj);
                fee feeVar5 = (fee) n0o0Var3.getValue();
                if (j0g0Var11 != null) {
                    Object obj16 = j0g0Var11.f15681a;
                    if (obj16 instanceof g0g0) {
                        obj16 = null;
                    }
                    kuk kukVar4 = (kuk) obj16;
                    if (kukVar4 == null || (j0g0Var2 = kukVar4.f18914a) == null) {
                        list = iun.f15405a;
                    } else {
                        Object obj17 = j0g0Var2.f15681a;
                        if (obj17 instanceof g0g0) {
                            obj17 = null;
                        }
                        list = (List) obj17;
                        if (list == null) {
                            list = iun.f15405a;
                        }
                    }
                } else {
                    list = iun.f15405a;
                }
                if (j0g0Var11 != null) {
                    Object obj18 = j0g0Var11.f15681a;
                    if (obj18 instanceof g0g0) {
                        obj18 = null;
                    }
                    kuk kukVar5 = (kuk) obj18;
                    if (kukVar5 == null || (j0g0Var = kukVar5.b) == null) {
                        list2 = iun.f15405a;
                    } else {
                        Object obj19 = j0g0Var.f15681a;
                        if (obj19 instanceof g0g0) {
                            obj19 = null;
                        }
                        list2 = (List) obj19;
                        if (list2 == null) {
                            list2 = iun.f15405a;
                        }
                    }
                } else {
                    list2 = iun.f15405a;
                }
                feeVar5.d(new mpk(list, list2));
                fee feeVar6 = (fee) n0o0Var2.getValue();
                if (j0g0Var11 != null) {
                    Object obj20 = j0g0Var11.f15681a;
                    if (obj20 instanceof g0g0) {
                        obj20 = null;
                    }
                    kuk kukVar6 = (kuk) obj20;
                    if (kukVar6 != null) {
                        Object obj21 = kukVar6.j;
                        obj2 = (List) (obj21 instanceof g0g0 ? null : obj21);
                        if (obj2 == null) {
                            obj2 = iun.f15405a;
                        }
                    } else {
                        obj2 = iun.f15405a;
                    }
                } else {
                    obj2 = iun.f15405a;
                }
                feeVar6.d(obj2);
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.addAll((Collection) ((fee) n0o0Var6.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var5.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var4.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) n0o0Var3.getValue()).b());
                return twn.k(lc00VarB, (Collection) ((fee) n0o0Var2.getValue()).b(), lc00VarB);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Function1) obj8).invoke(((gqk) obj7).f11737a);
                return Unit.f46060a;
            default:
                xqk xqkVar = (xqk) obj8;
                n0o0 n0o0Var7 = xqkVar.k;
                n0o0 n0o0Var8 = xqkVar.m;
                n0o0 n0o0Var9 = xqkVar.l;
                n0o0 n0o0Var10 = xqkVar.j;
                n0o0 n0o0Var11 = xqkVar.i;
                n0o0 n0o0Var12 = xqkVar.h;
                n0o0 n0o0Var13 = xqkVar.g;
                fee feeVar7 = (fee) n0o0Var13.getValue();
                j0g0 j0g0Var12 = ((ksk) obj7).d;
                if (j0g0Var12 != null) {
                    Object obj22 = j0g0Var12.f15681a;
                    if (obj22 instanceof g0g0) {
                        obj22 = null;
                    }
                    kuk kukVar7 = (kuk) obj22;
                    if (kukVar7 == null || (j0g0Var10 = kukVar7.g) == null) {
                        obj3 = iun.f15405a;
                    } else {
                        Object obj23 = j0g0Var10.f15681a;
                        if (obj23 instanceof g0g0) {
                            obj23 = null;
                        }
                        obj3 = (List) obj23;
                        if (obj3 == null) {
                            obj3 = iun.f15405a;
                        }
                    }
                } else {
                    obj3 = iun.f15405a;
                }
                feeVar7.d(obj3);
                fee feeVar8 = (fee) n0o0Var12.getValue();
                if (j0g0Var12 != null) {
                    Object obj24 = j0g0Var12.f15681a;
                    if (obj24 instanceof g0g0) {
                        obj24 = null;
                    }
                    kuk kukVar8 = (kuk) obj24;
                    if (kukVar8 == null || (j0g0Var9 = kukVar8.c) == null) {
                        btkVar3 = new btk(iun.f15405a, "");
                    } else {
                        Object obj25 = j0g0Var9.f15681a;
                        if (obj25 instanceof g0g0) {
                            obj25 = null;
                        }
                        btkVar3 = (btk) obj25;
                        if (btkVar3 == null) {
                            btkVar3 = new btk(iun.f15405a, "");
                        }
                    }
                } else {
                    btkVar3 = new btk(iun.f15405a, "");
                }
                feeVar8.d(btkVar3);
                fee feeVar9 = (fee) n0o0Var11.getValue();
                if (j0g0Var12 != null) {
                    Object obj26 = j0g0Var12.f15681a;
                    if (obj26 instanceof g0g0) {
                        obj26 = null;
                    }
                    kuk kukVar9 = (kuk) obj26;
                    if (kukVar9 == null || (j0g0Var8 = kukVar9.d) == null) {
                        btkVar4 = new btk(iun.f15405a, "");
                    } else {
                        Object obj27 = j0g0Var8.f15681a;
                        if (obj27 instanceof g0g0) {
                            obj27 = null;
                        }
                        btkVar4 = (btk) obj27;
                        if (btkVar4 == null) {
                            btkVar4 = new btk(iun.f15405a, "");
                        }
                    }
                } else {
                    btkVar4 = new btk(iun.f15405a, "");
                }
                feeVar9.d(btkVar4);
                fee feeVar10 = (fee) n0o0Var10.getValue();
                if (j0g0Var12 != null) {
                    Object obj28 = j0g0Var12.f15681a;
                    if (obj28 instanceof g0g0) {
                        obj28 = null;
                    }
                    kuk kukVar10 = (kuk) obj28;
                    if (kukVar10 != null) {
                        tqkVar = u1c.S(kukVar10);
                    } else {
                        iun iunVar = iun.f15405a;
                        tqkVar = new tqk(iunVar, iunVar);
                    }
                } else {
                    iun iunVar2 = iun.f15405a;
                    tqkVar = new tqk(iunVar2, iunVar2);
                }
                feeVar10.d(tqkVar);
                fee feeVar11 = (fee) n0o0Var9.getValue();
                if (j0g0Var12 != null) {
                    Object obj29 = j0g0Var12.f15681a;
                    if (obj29 instanceof g0g0) {
                        obj29 = null;
                    }
                    kuk kukVar11 = (kuk) obj29;
                    if (kukVar11 == null || (j0g0Var7 = kukVar11.h) == null) {
                        obj4 = iun.f15405a;
                    } else {
                        Object obj30 = j0g0Var7.f15681a;
                        if (obj30 instanceof g0g0) {
                            obj30 = null;
                        }
                        obj4 = (List) obj30;
                        if (obj4 == null) {
                            obj4 = iun.f15405a;
                        }
                    }
                } else {
                    obj4 = iun.f15405a;
                }
                feeVar11.d(obj4);
                fee feeVar12 = (fee) n0o0Var8.getValue();
                if (j0g0Var12 != null) {
                    Object obj31 = j0g0Var12.f15681a;
                    if (obj31 instanceof g0g0) {
                        obj31 = null;
                    }
                    kuk kukVar12 = (kuk) obj31;
                    if (kukVar12 == null || (j0g0Var6 = kukVar12.i) == null) {
                        obj5 = iun.f15405a;
                    } else {
                        Object obj32 = j0g0Var6.f15681a;
                        if (obj32 instanceof g0g0) {
                            obj32 = null;
                        }
                        obj5 = (List) obj32;
                        if (obj5 == null) {
                            obj5 = iun.f15405a;
                        }
                    }
                } else {
                    obj5 = iun.f15405a;
                }
                feeVar12.d(obj5);
                fee feeVar13 = (fee) n0o0Var7.getValue();
                if (j0g0Var12 != null) {
                    Object obj33 = j0g0Var12.f15681a;
                    if (obj33 instanceof g0g0) {
                        obj33 = null;
                    }
                    kuk kukVar13 = (kuk) obj33;
                    if (kukVar13 != null) {
                        Object obj34 = kukVar13.j;
                        list3 = (List) (obj34 instanceof g0g0 ? null : obj34);
                        if (list3 == null) {
                            list3 = iun.f15405a;
                        }
                    } else {
                        list3 = iun.f15405a;
                    }
                } else {
                    list3 = iun.f15405a;
                }
                feeVar13.d(qzb.f1(list3));
                lc00 lc00VarB2 = kotlin.collections.a.b();
                lc00VarB2.addAll((Collection) ((fee) n0o0Var13.getValue()).b());
                lc00VarB2.addAll((Collection) ((fee) n0o0Var12.getValue()).b());
                lc00VarB2.addAll((Collection) ((fee) n0o0Var10.getValue()).b());
                lc00VarB2.addAll((Collection) ((fee) n0o0Var11.getValue()).b());
                lc00VarB2.addAll((Collection) ((fee) n0o0Var8.getValue()).b());
                lc00VarB2.addAll((Collection) ((fee) n0o0Var9.getValue()).b());
                return twn.k(lc00VarB2, (Collection) ((fee) n0o0Var7.getValue()).b(), lc00VarB2);
        }
    }
}
