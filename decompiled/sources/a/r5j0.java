package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class r5j0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29889a;
    public final /* synthetic */ kmq b;

    public /* synthetic */ r5j0(kmq kmqVar, byte b) {
        this.f29889a = b;
        this.b = kmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x021d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0287  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:175:0x031e  */
    /* JADX WARN: Code duplicated, block: B:215:0x0402  */
    /* JADX WARN: Code duplicated, block: B:237:0x0472  */
    /* JADX WARN: Code duplicated, block: B:253:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:273:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:293:0x0544  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:318:0x059a  */
    /* JADX WARN: Code duplicated, block: B:334:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:356:0x0629  */
    /* JADX WARN: Code duplicated, block: B:374:0x066a  */
    /* JADX WARN: Code duplicated, block: B:390:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:415:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:447:0x0769  */
    /* JADX WARN: Code duplicated, block: B:479:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:504:0x0826  */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:541:0x0933  */
    /* JADX WARN: Code duplicated, block: B:69:0x012e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        q5j0 q5j0Var;
        t5j0 t5j0Var;
        Object k5j0Var;
        int i;
        Object objA;
        hdj0 hdj0Var;
        Object objA2;
        Object objA3;
        afj0 afj0Var;
        Object objA4;
        Object objA5;
        ggj0 ggj0Var;
        Object objA6;
        coj0 coj0Var;
        mtj0 mtj0Var;
        nwj0 nwj0Var;
        oxj0 oxj0Var;
        qxj0 qxj0Var;
        Object objA7;
        bjk0 bjk0Var;
        qpk0 qpk0Var;
        spk0 spk0Var;
        itk0 itk0Var;
        u8l0 u8l0Var;
        jbl0 jbl0Var;
        lbl0 lbl0Var;
        Object cusVar;
        ybl0 ybl0Var;
        fcl0 fcl0Var;
        mdl0 mdl0Var;
        Object gdl0Var;
        ArrayList arrayList;
        vpl0 vpl0Var;
        psl0 psl0Var;
        rsl0 rsl0Var;
        byte b = this.f29889a;
        int i2 = 0;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof q5j0) {
                    q5j0Var = (q5j0) yjeVar;
                    int i3 = q5j0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        q5j0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        q5j0Var = new q5j0(this, yjeVar);
                    }
                } else {
                    q5j0Var = new q5j0(this, yjeVar);
                }
                Object obj2 = q5j0Var.i;
                Object obj3 = wne.f39444a;
                int i4 = q5j0Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    if (!(((j5j0) obj) instanceof c5j0)) {
                        q5j0Var.j = 1;
                        if (kmqVar.a(obj, q5j0Var) == obj3) {
                            return obj3;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof t5j0) {
                    t5j0Var = (t5j0) yjeVar;
                    int i5 = t5j0Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        t5j0Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        t5j0Var = new t5j0(this, yjeVar);
                    }
                } else {
                    t5j0Var = new t5j0(this, yjeVar);
                }
                Object obj4 = t5j0Var.i;
                Object obj5 = wne.f39444a;
                int i6 = t5j0Var.j;
                if (i6 == 0) {
                    z1x.P(obj4);
                    b5j0 b5j0Var = (b5j0) obj;
                    b5j0Var.getClass();
                    boolean z = b5j0Var.f2006a;
                    String str = b5j0Var.i;
                    if (z) {
                        k5j0Var = l5j0.f19460a;
                        i = 1;
                    } else {
                        lc00 lc00VarB = kotlin.collections.a.b();
                        ezc ezcVar = b5j0Var.b.f14050a;
                        lc00VarB.add(new m2j0(ezcVar == ezc.CONFIRM_ANY_CHANGE, ezcVar == ezc.ACCEPT_ANY_CHANGE, ezcVar == ezc.ACCEPT_INCREASE));
                        l3j0 l3j0Var = b5j0Var.c;
                        lc00VarB.add(new q3j0(l3j0Var.f19359a, l3j0Var.b, l3j0Var.c));
                        t3j0 t3j0Var = b5j0Var.d;
                        boolean z2 = t3j0Var.f33271a;
                        if (z2) {
                            lc00VarB.add(new x3j0(z2, t3j0Var.b, t3j0Var.c));
                        }
                        d3j0 d3j0Var = b5j0Var.e;
                        pn40 pn40Var = pn40.f27267a;
                        double d = d3j0Var.f5405a;
                        p3u0 p3u0Var = p3u0.g;
                        lc00VarB.add(new h3j0(kng0.l(pn40.c(d, p3u0Var), Separators.SP, str), d3j0Var.b));
                        f4j0 f4j0Var = b5j0Var.f;
                        lc00VarB.add(new o4j0(f4j0Var.f, f4j0Var.b, kng0.l(pn40.c(f4j0Var.c.f7185a, p3u0Var), Separators.SP, str), kng0.l(pn40.c(f4j0Var.d.f7185a, p3u0Var), Separators.SP, str), kng0.l(pn40.c(f4j0Var.e.f7185a, p3u0Var), Separators.SP, str), f4j0Var.g));
                        z1j0 z1j0Var = b5j0Var.g;
                        lc00VarB.add(new d2j0(z1j0Var.b, z1j0Var.f43624a));
                        x5j0 x5j0Var = b5j0Var.h;
                        if (x5j0Var.f40321a) {
                            lc00VarB.add(new b6j0(x5j0Var.c, x5j0Var.b));
                        }
                        k5j0Var = new k5j0(kotlin.collections.a.a(lc00VarB));
                        i = 1;
                    }
                    t5j0Var.j = i;
                    if (kmqVar.a(k5j0Var, t5j0Var) == obj5) {
                        return obj5;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
            case 2:
                e7a e7aVar = (e7a) obj;
                return ((e7aVar instanceof c7a) && (objA = kmqVar.a(((c7a) e7aVar).f3852a, yjeVar)) == wne.f39444a) ? objA : Unit.f46060a;
            case 3:
                if (yjeVar instanceof hdj0) {
                    hdj0Var = (hdj0) yjeVar;
                    int i7 = hdj0Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        hdj0Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        hdj0Var = new hdj0(this, yjeVar);
                    }
                } else {
                    hdj0Var = new hdj0(this, yjeVar);
                }
                Object obj6 = hdj0Var.i;
                Object obj7 = wne.f39444a;
                int i8 = hdj0Var.j;
                if (i8 == 0) {
                    z1x.P(obj6);
                    if (obj instanceof tm4) {
                        hdj0Var.j = 1;
                        if (kmqVar.a(obj, hdj0Var) == obj7) {
                            return obj7;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            case 4:
                e7a e7aVar2 = (e7a) obj;
                return ((e7aVar2 instanceof c7a) && (objA2 = kmqVar.a(((c7a) e7aVar2).f3852a, yjeVar)) == wne.f39444a) ? objA2 : Unit.f46060a;
            case 5:
                e7a e7aVar3 = (e7a) obj;
                return ((e7aVar3 instanceof c7a) && (objA3 = kmqVar.a(((c7a) e7aVar3).f3852a, yjeVar)) == wne.f39444a) ? objA3 : Unit.f46060a;
            case 6:
                if (yjeVar instanceof afj0) {
                    afj0Var = (afj0) yjeVar;
                    int i9 = afj0Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        afj0Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        afj0Var = new afj0(this, yjeVar);
                    }
                } else {
                    afj0Var = new afj0(this, yjeVar);
                }
                Object obj8 = afj0Var.i;
                Object obj9 = wne.f39444a;
                int i10 = afj0Var.j;
                if (i10 == 0) {
                    z1x.P(obj8);
                    if (obj instanceof tm4) {
                        afj0Var.j = 1;
                        if (kmqVar.a(obj, afj0Var) == obj9) {
                            return obj9;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj8);
                }
                return Unit.f46060a;
            case 7:
                e7a e7aVar4 = (e7a) obj;
                return ((e7aVar4 instanceof c7a) && (objA4 = kmqVar.a(((c7a) e7aVar4).f3852a, yjeVar)) == wne.f39444a) ? objA4 : Unit.f46060a;
            case 8:
                e7a e7aVar5 = (e7a) obj;
                return ((e7aVar5 instanceof c7a) && (objA5 = kmqVar.a(((c7a) e7aVar5).f3852a, yjeVar)) == wne.f39444a) ? objA5 : Unit.f46060a;
            case 9:
                if (yjeVar instanceof ggj0) {
                    ggj0Var = (ggj0) yjeVar;
                    int i11 = ggj0Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ggj0Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        ggj0Var = new ggj0(this, yjeVar);
                    }
                } else {
                    ggj0Var = new ggj0(this, yjeVar);
                }
                Object obj10 = ggj0Var.i;
                Object obj11 = wne.f39444a;
                int i12 = ggj0Var.j;
                if (i12 == 0) {
                    z1x.P(obj10);
                    if (obj instanceof tm4) {
                        ggj0Var.j = 1;
                        if (kmqVar.a(obj, ggj0Var) == obj11) {
                            return obj11;
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
            case 10:
                e7a e7aVar6 = (e7a) obj;
                return ((e7aVar6 instanceof c7a) && (objA6 = kmqVar.a(((c7a) e7aVar6).f3852a, yjeVar)) == wne.f39444a) ? objA6 : Unit.f46060a;
            case 11:
                if (yjeVar instanceof coj0) {
                    coj0Var = (coj0) yjeVar;
                    int i13 = coj0Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        coj0Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        coj0Var = new coj0(this, yjeVar);
                    }
                } else {
                    coj0Var = new coj0(this, yjeVar);
                }
                Object obj12 = coj0Var.i;
                Object obj13 = wne.f39444a;
                int i14 = coj0Var.j;
                if (i14 == 0) {
                    z1x.P(obj12);
                    if (((Boolean) obj).booleanValue()) {
                        coj0Var.j = 1;
                        if (kmqVar.a(obj, coj0Var) == obj13) {
                            return obj13;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj12);
                }
                return Unit.f46060a;
            case 12:
                if (yjeVar instanceof mtj0) {
                    mtj0Var = (mtj0) yjeVar;
                    int i15 = mtj0Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        mtj0Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        mtj0Var = new mtj0(this, yjeVar);
                    }
                } else {
                    mtj0Var = new mtj0(this, yjeVar);
                }
                Object obj14 = mtj0Var.i;
                Object obj15 = wne.f39444a;
                int i16 = mtj0Var.j;
                if (i16 == 0) {
                    z1x.P(obj14);
                    Object obj16 = ((ktj0) obj).f18869a;
                    mtj0Var.j = 1;
                    if (kmqVar.a(obj16, mtj0Var) == obj15) {
                        return obj15;
                    }
                } else {
                    if (i16 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj14);
                }
                return Unit.f46060a;
            case 13:
                if (yjeVar instanceof nwj0) {
                    nwj0Var = (nwj0) yjeVar;
                    int i17 = nwj0Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        nwj0Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        nwj0Var = new nwj0(this, yjeVar);
                    }
                } else {
                    nwj0Var = new nwj0(this, yjeVar);
                }
                Object obj17 = nwj0Var.i;
                Object obj18 = wne.f39444a;
                int i18 = nwj0Var.j;
                if (i18 == 0) {
                    z1x.P(obj17);
                    if (((Boolean) obj).booleanValue()) {
                        nwj0Var.j = 1;
                        if (kmqVar.a(obj, nwj0Var) == obj18) {
                            return obj18;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj17);
                }
                return Unit.f46060a;
            case 14:
                if (yjeVar instanceof oxj0) {
                    oxj0Var = (oxj0) yjeVar;
                    int i19 = oxj0Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        oxj0Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        oxj0Var = new oxj0(this, yjeVar);
                    }
                } else {
                    oxj0Var = new oxj0(this, yjeVar);
                }
                Object obj19 = oxj0Var.i;
                Object obj20 = wne.f39444a;
                int i20 = oxj0Var.j;
                if (i20 == 0) {
                    z1x.P(obj19);
                    StepInputUiModel stepInputUiModel = (StepInputUiModel) obj;
                    if (stepInputUiModel.b != 0.0d && stepInputUiModel.d != -1.0d) {
                        oxj0Var.j = 1;
                        if (kmqVar.a(obj, oxj0Var) == obj20) {
                            return obj20;
                        }
                    }
                } else {
                    if (i20 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj19);
                }
                return Unit.f46060a;
            case 15:
                if (yjeVar instanceof qxj0) {
                    qxj0Var = (qxj0) yjeVar;
                    int i21 = qxj0Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        qxj0Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        qxj0Var = new qxj0(this, yjeVar);
                    }
                } else {
                    qxj0Var = new qxj0(this, yjeVar);
                }
                Object obj21 = qxj0Var.i;
                Object obj22 = wne.f39444a;
                int i22 = qxj0Var.j;
                if (i22 == 0) {
                    z1x.P(obj21);
                    Object d2 = new Double(((m97) obj).l);
                    qxj0Var.j = 1;
                    if (kmqVar.a(d2, qxj0Var) == obj22) {
                        return obj22;
                    }
                } else {
                    if (i22 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj21);
                }
                return Unit.f46060a;
            case 16:
                e7a e7aVar7 = (e7a) obj;
                return ((e7aVar7 instanceof c7a) && (objA7 = kmqVar.a(((c7a) e7aVar7).f3852a, yjeVar)) == wne.f39444a) ? objA7 : Unit.f46060a;
            case 17:
                if (yjeVar instanceof bjk0) {
                    bjk0Var = (bjk0) yjeVar;
                    int i23 = bjk0Var.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        bjk0Var.j = i23 - Integer.MIN_VALUE;
                    } else {
                        bjk0Var = new bjk0(this, yjeVar);
                    }
                } else {
                    bjk0Var = new bjk0(this, yjeVar);
                }
                Object obj23 = bjk0Var.i;
                Object obj24 = wne.f39444a;
                int i24 = bjk0Var.j;
                if (i24 == 0) {
                    z1x.P(obj23);
                    if (!(((zik0) obj) instanceof wik0)) {
                        bjk0Var.j = 1;
                        if (kmqVar.a(obj, bjk0Var) == obj24) {
                            return obj24;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj23);
                }
                return Unit.f46060a;
            case 18:
                if (yjeVar instanceof qpk0) {
                    qpk0Var = (qpk0) yjeVar;
                    int i25 = qpk0Var.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        qpk0Var.j = i25 - Integer.MIN_VALUE;
                    } else {
                        qpk0Var = new qpk0(this, yjeVar);
                    }
                } else {
                    qpk0Var = new qpk0(this, yjeVar);
                }
                Object obj25 = qpk0Var.i;
                Object obj26 = wne.f39444a;
                int i26 = qpk0Var.j;
                if (i26 == 0) {
                    z1x.P(obj25);
                    dqk0 dqk0Var = (dqk0) obj;
                    Object obj27 = dqk0Var instanceof cqk0 ? (List) ((cqk0) dqk0Var).f4798a : iun.f15405a;
                    qpk0Var.j = 1;
                    if (kmqVar.a(obj27, qpk0Var) == obj26) {
                        return obj26;
                    }
                } else {
                    if (i26 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj25);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof spk0) {
                    spk0Var = (spk0) yjeVar;
                    int i27 = spk0Var.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        spk0Var.j = i27 - Integer.MIN_VALUE;
                    } else {
                        spk0Var = new spk0(this, yjeVar);
                    }
                } else {
                    spk0Var = new spk0(this, yjeVar);
                }
                Object obj28 = spk0Var.i;
                Object obj29 = wne.f39444a;
                int i28 = spk0Var.j;
                if (i28 == 0) {
                    z1x.P(obj28);
                    dqk0 dqk0Var2 = (dqk0) obj;
                    Object obj30 = dqk0Var2 instanceof cqk0 ? (List) ((cqk0) dqk0Var2).f4798a : iun.f15405a;
                    spk0Var.j = 1;
                    if (kmqVar.a(obj30, spk0Var) == obj29) {
                        return obj29;
                    }
                } else {
                    if (i28 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj28);
                }
                return Unit.f46060a;
            case 20:
                if (yjeVar instanceof itk0) {
                    itk0Var = (itk0) yjeVar;
                    int i29 = itk0Var.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        itk0Var.j = i29 - Integer.MIN_VALUE;
                    } else {
                        itk0Var = new itk0(this, yjeVar);
                    }
                } else {
                    itk0Var = new itk0(this, yjeVar);
                }
                Object obj31 = itk0Var.i;
                Object obj32 = wne.f39444a;
                int i30 = itk0Var.j;
                if (i30 == 0) {
                    z1x.P(obj31);
                    Object l = new Long(((ktk0) obj).b);
                    itk0Var.j = 1;
                    if (kmqVar.a(l, itk0Var) == obj32) {
                        return obj32;
                    }
                } else {
                    if (i30 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj31);
                }
                return Unit.f46060a;
            case 21:
                if (yjeVar instanceof u8l0) {
                    u8l0Var = (u8l0) yjeVar;
                    int i31 = u8l0Var.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        u8l0Var.j = i31 - Integer.MIN_VALUE;
                    } else {
                        u8l0Var = new u8l0(this, yjeVar);
                    }
                } else {
                    u8l0Var = new u8l0(this, yjeVar);
                }
                Object obj33 = u8l0Var.i;
                Object obj34 = wne.f39444a;
                int i32 = u8l0Var.j;
                if (i32 == 0) {
                    z1x.P(obj33);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        if (((Boolean) entry.getValue()).booleanValue()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Object objKeySet = linkedHashMap.keySet();
                    u8l0Var.j = 1;
                    if (kmqVar.a(objKeySet, u8l0Var) == obj34) {
                        return obj34;
                    }
                } else {
                    if (i32 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj33);
                }
                return Unit.f46060a;
            case 22:
                if (yjeVar instanceof jbl0) {
                    jbl0Var = (jbl0) yjeVar;
                    int i33 = jbl0Var.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        jbl0Var.j = i33 - Integer.MIN_VALUE;
                    } else {
                        jbl0Var = new jbl0(this, yjeVar);
                    }
                } else {
                    jbl0Var = new jbl0(this, yjeVar);
                }
                Object obj35 = jbl0Var.i;
                Object obj36 = wne.f39444a;
                int i34 = jbl0Var.j;
                if (i34 == 0) {
                    z1x.P(obj35);
                    tcs tcsVar = (tcs) obj;
                    tcsVar.getClass();
                    String str2 = tcsVar.e;
                    lc00 lc00VarB2 = kotlin.collections.a.b();
                    StringBuilder sb = new StringBuilder(ujn.h);
                    if (str2.length() == 0) {
                        sb.setLength(0);
                    } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                        sb.setLength(0);
                        sb.append(str2);
                    } else {
                        if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                            sb.append('/');
                        }
                        sb.append(StringsKt.y0(str2, '/'));
                    }
                    String string = sb.toString();
                    if (string.length() > 0) {
                        lc00VarB2.add(string);
                    }
                    Integer num = tcsVar.c;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        String strValueOf = tcsVar.d;
                        bzu bzuVarE = rz4.e("static", "img", "android", "TopChamps");
                        if (strValueOf.length() == 0) {
                            strValueOf = String.valueOf(iIntValue);
                        }
                        axq.u(bzuVarE, strValueOf, "backgrounds", "Game_Screen.png");
                        lc00VarB2.add(((StringBuilder) bzuVarE.b).toString());
                    }
                    lc00VarB2.add(p7x.z(tcsVar.f33733a, tcsVar.b));
                    Object ucsVar = new ucs(kotlin.collections.a.a(lc00VarB2), tcsVar.f, tcsVar.g);
                    jbl0Var.j = 1;
                    if (kmqVar.a(ucsVar, jbl0Var) == obj36) {
                        return obj36;
                    }
                } else {
                    if (i34 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj35);
                }
                return Unit.f46060a;
            case 23:
                if (yjeVar instanceof lbl0) {
                    lbl0Var = (lbl0) yjeVar;
                    int i35 = lbl0Var.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        lbl0Var.j = i35 - Integer.MIN_VALUE;
                    } else {
                        lbl0Var = new lbl0(this, yjeVar);
                    }
                } else {
                    lbl0Var = new lbl0(this, yjeVar);
                }
                Object obj37 = lbl0Var.i;
                Object obj38 = wne.f39444a;
                int i36 = lbl0Var.j;
                if (i36 == 0) {
                    z1x.P(obj37);
                    wqs wqsVar = (wqs) obj;
                    wqsVar.getClass();
                    int iOrdinal = wqsVar.f39607a.ordinal();
                    if (iOrdinal == 0) {
                        cusVar = new cus(wqsVar.c);
                    } else {
                        if (iOrdinal != 1) {
                            t9f.b();
                            return null;
                        }
                        cusVar = new bus(wqsVar.b);
                    }
                    lbl0Var.j = 1;
                    if (kmqVar.a(cusVar, lbl0Var) == obj38) {
                        return obj38;
                    }
                } else {
                    if (i36 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj37);
                }
                return Unit.f46060a;
            case 24:
                if (yjeVar instanceof ybl0) {
                    ybl0Var = (ybl0) yjeVar;
                    int i37 = ybl0Var.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        ybl0Var.j = i37 - Integer.MIN_VALUE;
                    } else {
                        ybl0Var = new ybl0(this, yjeVar);
                    }
                } else {
                    ybl0Var = new ybl0(this, yjeVar);
                }
                Object obj39 = ybl0Var.i;
                Object obj40 = wne.f39444a;
                int i38 = ybl0Var.j;
                if (i38 == 0) {
                    z1x.P(obj39);
                    if (obj instanceof usr) {
                        ybl0Var.j = 1;
                        if (kmqVar.a(obj, ybl0Var) == obj40) {
                            return obj40;
                        }
                    }
                } else {
                    if (i38 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj39);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (yjeVar instanceof fcl0) {
                    fcl0Var = (fcl0) yjeVar;
                    int i39 = fcl0Var.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        fcl0Var.j = i39 - Integer.MIN_VALUE;
                    } else {
                        fcl0Var = new fcl0(this, yjeVar);
                    }
                } else {
                    fcl0Var = new fcl0(this, yjeVar);
                }
                Object obj41 = fcl0Var.i;
                Object obj42 = wne.f39444a;
                int i40 = fcl0Var.j;
                if (i40 == 0) {
                    z1x.P(obj41);
                    ArrayList arrayList2 = ((prs) obj).f27481a.f29646a;
                    ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((ofs) it.next()).a().f46994a);
                    }
                    Object objL0 = CollectionsKt.L0(CollectionsKt.O0(arrayList3));
                    fcl0Var.j = 1;
                    if (kmqVar.a(objL0, fcl0Var) == obj42) {
                        return obj42;
                    }
                } else {
                    if (i40 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj41);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (yjeVar instanceof mdl0) {
                    mdl0Var = (mdl0) yjeVar;
                    int i41 = mdl0Var.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        mdl0Var.j = i41 - Integer.MIN_VALUE;
                    } else {
                        mdl0Var = new mdl0(this, yjeVar);
                    }
                } else {
                    mdl0Var = new mdl0(this, yjeVar);
                }
                Object obj43 = mdl0Var.i;
                Object obj44 = wne.f39444a;
                int i42 = mdl0Var.j;
                if (i42 == 0) {
                    z1x.P(obj43);
                    odl0 odl0Var = (odl0) obj;
                    odl0Var.getClass();
                    boolean z3 = odl0Var.g;
                    String str3 = odl0Var.h;
                    jkm jkmVar = odl0Var.m;
                    boolean z4 = odl0Var.e;
                    List list = odl0Var.i;
                    List list2 = odl0Var.j;
                    if (z3 && list2.isEmpty()) {
                        gdl0Var = new jdl0(jkmVar, z4);
                    } else if (odl0Var.b && list.isEmpty()) {
                        gdl0Var = new hdl0(z4, jkmVar, odl0Var.n);
                    } else if ((str3.length() <= 0 || list2.isEmpty()) && list.isEmpty()) {
                        gdl0Var = idl0.f14591a;
                    } else {
                        boolean z5 = odl0Var.c;
                        boolean z6 = odl0Var.d;
                        boolean z7 = odl0Var.e;
                        boolean z8 = odl0Var.f;
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        Set set = odl0Var.k;
                        if (str3.length() <= 0 || list2.isEmpty()) {
                            arrayList = new ArrayList(r3d.q(list, 10));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(m7x.U((cok0) it2.next(), set));
                            }
                        } else {
                            arrayList = new ArrayList(r3d.q(list2, 10));
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(m7x.U((cok0) it3.next(), set));
                            }
                        }
                        lc00VarB3.addAll(arrayList);
                        gdl0Var = new gdl0(z5, z6, z7, z8, kotlin.collections.a.a(lc00VarB3));
                    }
                    mdl0Var.j = 1;
                    if (kmqVar.a(gdl0Var, mdl0Var) == obj44) {
                        return obj44;
                    }
                } else {
                    if (i42 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj43);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (yjeVar instanceof vpl0) {
                    vpl0Var = (vpl0) yjeVar;
                    int i43 = vpl0Var.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        vpl0Var.j = i43 - Integer.MIN_VALUE;
                    } else {
                        vpl0Var = new vpl0(this, yjeVar);
                    }
                } else {
                    vpl0Var = new vpl0(this, yjeVar);
                }
                Object obj45 = vpl0Var.i;
                Object obj46 = wne.f39444a;
                int i44 = vpl0Var.j;
                if (i44 == 0) {
                    z1x.P(obj45);
                    Object string2 = StringsKt.u0((String) obj).toString();
                    vpl0Var.j = 1;
                    if (kmqVar.a(string2, vpl0Var) == obj46) {
                        return obj46;
                    }
                } else {
                    if (i44 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj45);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (yjeVar instanceof psl0) {
                    psl0Var = (psl0) yjeVar;
                    int i45 = psl0Var.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        psl0Var.j = i45 - Integer.MIN_VALUE;
                    } else {
                        psl0Var = new psl0(this, yjeVar);
                    }
                } else {
                    psl0Var = new psl0(this, yjeVar);
                }
                Object obj47 = psl0Var.i;
                Object obj48 = wne.f39444a;
                int i46 = psl0Var.j;
                if (i46 == 0) {
                    z1x.P(obj47);
                    List list3 = (List) obj;
                    ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                    for (Object obj49 : list3) {
                        int i47 = i2 + 1;
                        if (i2 < 0) {
                            q3d.p();
                            throw null;
                        }
                        jkp jkpVar = (jkp) obj49;
                        arrayList4.add(new zpl0(i2, jkpVar.f16682a, jkpVar.e));
                        i2 = i47;
                    }
                    psl0Var.j = 1;
                    if (kmqVar.a(arrayList4, psl0Var) == obj48) {
                        return obj48;
                    }
                } else {
                    if (i46 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj47);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof rsl0) {
                    rsl0Var = (rsl0) yjeVar;
                    int i48 = rsl0Var.j;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        rsl0Var.j = i48 - Integer.MIN_VALUE;
                    } else {
                        rsl0Var = new rsl0(this, yjeVar);
                    }
                } else {
                    rsl0Var = new rsl0(this, yjeVar);
                }
                Object obj50 = rsl0Var.i;
                Object obj51 = wne.f39444a;
                int i49 = rsl0Var.j;
                if (i49 == 0) {
                    z1x.P(obj50);
                    List list4 = (List) obj;
                    ArrayList arrayList5 = new ArrayList(r3d.q(list4, 10));
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        axq.t(((jkp) it4.next()).f16682a, arrayList5);
                    }
                    rsl0Var.j = 1;
                    if (kmqVar.a(arrayList5, rsl0Var) == obj51) {
                        return obj51;
                    }
                } else {
                    if (i49 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj50);
                }
                return Unit.f46060a;
        }
    }
}
