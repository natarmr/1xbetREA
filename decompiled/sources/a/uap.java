package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class uap implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35342a;
    public final /* synthetic */ kmq b;

    public uap(kmq kmqVar, nnp nnpVar) {
        this.f35342a = (byte) 3;
        this.b = kmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0215  */
    /* JADX WARN: Code duplicated, block: B:135:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:153:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:181:0x0368  */
    /* JADX WARN: Code duplicated, block: B:197:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:213:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:233:0x0454  */
    /* JADX WARN: Code duplicated, block: B:263:0x04be  */
    /* JADX WARN: Code duplicated, block: B:281:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:301:0x0556  */
    /* JADX WARN: Code duplicated, block: B:319:0x0592  */
    /* JADX WARN: Code duplicated, block: B:337:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:355:0x060a  */
    /* JADX WARN: Code duplicated, block: B:373:0x0644  */
    /* JADX WARN: Code duplicated, block: B:391:0x0683  */
    /* JADX WARN: Code duplicated, block: B:409:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:425:0x0706  */
    /* JADX WARN: Code duplicated, block: B:444:0x074c  */
    /* JADX WARN: Code duplicated, block: B:466:0x0793  */
    /* JADX WARN: Code duplicated, block: B:482:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:502:0x0847  */
    /* JADX WARN: Code duplicated, block: B:532:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:563:0x0947  */
    /* JADX WARN: Code duplicated, block: B:579:0x098c  */
    /* JADX WARN: Code duplicated, block: B:67:0x012c  */
    /* JADX WARN: Code duplicated, block: B:85:0x016d  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        tap tapVar;
        wap wapVar;
        rbp rbpVar;
        Object obj2;
        fnp fnpVar;
        jnb jnbVar;
        xop xopVar;
        ppp pppVar;
        dqp dqpVar;
        u6q u6qVar;
        ldq ldqVar;
        ceq ceqVar;
        koq koqVar;
        moq moqVar;
        ror rorVar;
        r3s r3sVar;
        m8s m8sVar;
        rhs rhsVar;
        fks fksVar;
        oos oosVar;
        dvs dvsVar;
        ivs ivsVar;
        kvs kvsVar;
        jzs jzsVar;
        Object ezsVar;
        qzs qzsVar;
        z0t z0tVar;
        Object u0tVar;
        p1t p1tVar;
        Object l1tVar;
        imt imtVar;
        qmt qmtVar;
        knt kntVar;
        mnt mntVar;
        byte b = this.f35342a;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof tap) {
                    tapVar = (tap) yjeVar;
                    int i = tapVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tapVar.j = i - Integer.MIN_VALUE;
                    } else {
                        tapVar = new tap(this, yjeVar);
                    }
                } else {
                    tapVar = new tap(this, yjeVar);
                }
                Object obj3 = tapVar.i;
                wne wneVar = wne.f39444a;
                int i2 = tapVar.j;
                if (i2 == 0) {
                    z1x.P(obj3);
                    List listL0 = CollectionsKt.L0(((Map) obj).values());
                    tapVar.j = 1;
                    if (kmqVar.a(listL0, tapVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof wap) {
                    wapVar = (wap) yjeVar;
                    int i3 = wapVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        wapVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        wapVar = new wap(this, yjeVar);
                    }
                } else {
                    wapVar = new wap(this, yjeVar);
                }
                Object obj4 = wapVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = wapVar.j;
                if (i4 == 0) {
                    z1x.P(obj4);
                    List listL1 = CollectionsKt.L0(((Map) obj).values());
                    wapVar.j = 1;
                    if (kmqVar.a(listL1, wapVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
            case 2:
                if (yjeVar instanceof rbp) {
                    rbpVar = (rbp) yjeVar;
                    int i5 = rbpVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        rbpVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        rbpVar = new rbp(this, yjeVar);
                    }
                } else {
                    rbpVar = new rbp(this, yjeVar);
                }
                Object obj5 = rbpVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = rbpVar.j;
                if (i6 == 0) {
                    z1x.P(obj5);
                    dip dipVar = (dip) obj;
                    if (dipVar != null) {
                        if ((dipVar instanceof zhp) || (dipVar instanceof aip)) {
                            obj2 = iun.f15405a;
                        } else if (dipVar instanceof bip) {
                            obj2 = ((bip) dipVar).f2667a;
                        } else if (dipVar instanceof cip) {
                            obj2 = iun.f15405a;
                        }
                        rbpVar.j = 1;
                        if (kmqVar.a(obj2, rbpVar) == wneVar3) {
                            return wneVar3;
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (i6 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj5);
                return Unit.f46060a;
            case 3:
                if (yjeVar instanceof fnp) {
                    fnpVar = (fnp) yjeVar;
                    int i7 = fnpVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        fnpVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        fnpVar = new fnp(this, yjeVar);
                    }
                } else {
                    fnpVar = new fnp(this, yjeVar);
                }
                Object obj6 = fnpVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = fnpVar.j;
                if (i8 == 0) {
                    z1x.P(obj6);
                    knb knbVar = (knb) obj;
                    List<bj00> list = knbVar.b;
                    if (list.isEmpty()) {
                        jnbVar = new jnb(knbVar, iun.f15405a);
                    } else {
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (bj00 bj00Var : list) {
                            int i9 = nnp.a0;
                            long j = bj00Var.c;
                            int i10 = bj00Var.b;
                            boolean z = bj00Var.f2681a;
                            List list2 = bj00Var.d;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj7 : list2) {
                                if (((si00) obj7).c > 0) {
                                    arrayList2.add(obj7);
                                }
                            }
                            arrayList.add(new ri00(i10, j, arrayList2, z));
                        }
                        jnbVar = new jnb(knbVar, arrayList);
                    }
                    fnpVar.j = 1;
                    if (kmqVar.a(jnbVar, fnpVar) == wneVar4) {
                        return wneVar4;
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
                if (yjeVar instanceof xop) {
                    xopVar = (xop) yjeVar;
                    int i11 = xopVar.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        xopVar.j = i11 - Integer.MIN_VALUE;
                    } else {
                        xopVar = new xop(this, yjeVar);
                    }
                } else {
                    xopVar = new xop(this, yjeVar);
                }
                Object obj8 = xopVar.i;
                wne wneVar5 = wne.f39444a;
                int i12 = xopVar.j;
                if (i12 == 0) {
                    z1x.P(obj8);
                    List<jkp> list3 = (List) obj;
                    ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                    for (jkp jkpVar : list3) {
                        jkpVar.getClass();
                        arrayList3.add(new jfl0(jkpVar.d, jkpVar.b, jkpVar.f16682a, jkpVar.c));
                    }
                    xopVar.j = 1;
                    if (kmqVar.a(arrayList3, xopVar) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (i12 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj8);
                }
                return Unit.f46060a;
            case 5:
                if (yjeVar instanceof ppp) {
                    pppVar = (ppp) yjeVar;
                    int i13 = pppVar.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        pppVar.j = i13 - Integer.MIN_VALUE;
                    } else {
                        pppVar = new ppp(this, yjeVar);
                    }
                } else {
                    pppVar = new ppp(this, yjeVar);
                }
                Object obj9 = pppVar.i;
                wne wneVar6 = wne.f39444a;
                int i14 = pppVar.j;
                if (i14 == 0) {
                    z1x.P(obj9);
                    Long l = new Long(((fs20) obj).a());
                    pppVar.j = 1;
                    if (kmqVar.a(l, pppVar) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (i14 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj9);
                }
                return Unit.f46060a;
            case 6:
                if (yjeVar instanceof dqp) {
                    dqpVar = (dqp) yjeVar;
                    int i15 = dqpVar.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        dqpVar.j = i15 - Integer.MIN_VALUE;
                    } else {
                        dqpVar = new dqp(this, yjeVar);
                    }
                } else {
                    dqpVar = new dqp(this, yjeVar);
                }
                Object obj10 = dqpVar.i;
                wne wneVar7 = wne.f39444a;
                int i16 = dqpVar.j;
                if (i16 == 0) {
                    z1x.P(obj10);
                    jlr jlrVar = (jlr) obj;
                    xkr xkrVar = jlrVar instanceof xkr ? (xkr) jlrVar : null;
                    m9s m9sVar = xkrVar != null ? xkrVar.d : null;
                    dqpVar.j = 1;
                    if (kmqVar.a(m9sVar, dqpVar) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (i16 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj10);
                }
                return Unit.f46060a;
            case 7:
                if (yjeVar instanceof u6q) {
                    u6qVar = (u6q) yjeVar;
                    int i17 = u6qVar.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        u6qVar.j = i17 - Integer.MIN_VALUE;
                    } else {
                        u6qVar = new u6q(this, yjeVar);
                    }
                } else {
                    u6qVar = new u6q(this, yjeVar);
                }
                Object obj11 = u6qVar.i;
                wne wneVar8 = wne.f39444a;
                int i18 = u6qVar.j;
                if (i18 == 0) {
                    z1x.P(obj11);
                    Boolean boolValueOf = Boolean.valueOf(((xbq) obj).f > 0);
                    u6qVar.j = 1;
                    if (kmqVar.a(boolValueOf, u6qVar) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (i18 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj11);
                }
                return Unit.f46060a;
            case 8:
                if (yjeVar instanceof ldq) {
                    ldqVar = (ldq) yjeVar;
                    int i19 = ldqVar.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        ldqVar.j = i19 - Integer.MIN_VALUE;
                    } else {
                        ldqVar = new ldq(this, yjeVar);
                    }
                } else {
                    ldqVar = new ldq(this, yjeVar);
                }
                Object obj12 = ldqVar.i;
                wne wneVar9 = wne.f39444a;
                int i20 = ldqVar.j;
                if (i20 == 0) {
                    z1x.P(obj12);
                    dlr dlrVar = new dlr(((ens0) obj).f8111a);
                    ldqVar.j = 1;
                    if (kmqVar.a(dlrVar, ldqVar) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (i20 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj12);
                }
                return Unit.f46060a;
            case 9:
                if (yjeVar instanceof ceq) {
                    ceqVar = (ceq) yjeVar;
                    int i21 = ceqVar.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        ceqVar.j = i21 - Integer.MIN_VALUE;
                    } else {
                        ceqVar = new ceq(this, yjeVar);
                    }
                } else {
                    ceqVar = new ceq(this, yjeVar);
                }
                Object obj13 = ceqVar.i;
                wne wneVar10 = wne.f39444a;
                int i22 = ceqVar.j;
                if (i22 == 0) {
                    z1x.P(obj13);
                    if (((Boolean) obj).booleanValue()) {
                        ceqVar.j = 1;
                        if (kmqVar.a(obj, ceqVar) == wneVar10) {
                            return wneVar10;
                        }
                    }
                } else {
                    if (i22 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj13);
                }
                return Unit.f46060a;
            case 10:
                return b((gmq) obj, yjeVar);
            case 11:
                if (yjeVar instanceof koq) {
                    koqVar = (koq) yjeVar;
                    int i23 = koqVar.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        koqVar.j = i23 - Integer.MIN_VALUE;
                    } else {
                        koqVar = new koq(this, yjeVar);
                    }
                } else {
                    koqVar = new koq(this, yjeVar);
                }
                Object obj14 = koqVar.i;
                wne wneVar11 = wne.f39444a;
                int i24 = koqVar.j;
                if (i24 == 0) {
                    z1x.P(obj14);
                    koqVar.j = 1;
                    if (kmqVar.a(obj, koqVar) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (i24 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj14);
                }
                return Unit.f46060a;
            case 12:
                if (yjeVar instanceof moq) {
                    moqVar = (moq) yjeVar;
                    int i25 = moqVar.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        moqVar.j = i25 - Integer.MIN_VALUE;
                    } else {
                        moqVar = new moq(this, yjeVar);
                    }
                } else {
                    moqVar = new moq(this, yjeVar);
                }
                Object obj15 = moqVar.i;
                wne wneVar12 = wne.f39444a;
                int i26 = moqVar.j;
                if (i26 == 0) {
                    z1x.P(obj15);
                    if (obj != null) {
                        moqVar.j = 1;
                        if (kmqVar.a(obj, moqVar) == wneVar12) {
                            return wneVar12;
                        }
                    }
                } else {
                    if (i26 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj15);
                }
                return Unit.f46060a;
            case 13:
                if (yjeVar instanceof ror) {
                    rorVar = (ror) yjeVar;
                    int i27 = rorVar.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        rorVar.j = i27 - Integer.MIN_VALUE;
                    } else {
                        rorVar = new ror(this, yjeVar);
                    }
                } else {
                    rorVar = new ror(this, yjeVar);
                }
                Object obj16 = rorVar.i;
                wne wneVar13 = wne.f39444a;
                int i28 = rorVar.j;
                if (i28 == 0) {
                    z1x.P(obj16);
                    if (obj instanceof psr) {
                        rorVar.j = 1;
                        if (kmqVar.a(obj, rorVar) == wneVar13) {
                            return wneVar13;
                        }
                    }
                } else {
                    if (i28 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj16);
                }
                return Unit.f46060a;
            case 14:
                if (yjeVar instanceof r3s) {
                    r3sVar = (r3s) yjeVar;
                    int i29 = r3sVar.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        r3sVar.j = i29 - Integer.MIN_VALUE;
                    } else {
                        r3sVar = new r3s(this, yjeVar);
                    }
                } else {
                    r3sVar = new r3s(this, yjeVar);
                }
                Object obj17 = r3sVar.i;
                wne wneVar14 = wne.f39444a;
                int i30 = r3sVar.j;
                if (i30 == 0) {
                    z1x.P(obj17);
                    if (obj instanceof psr) {
                        r3sVar.j = 1;
                        if (kmqVar.a(obj, r3sVar) == wneVar14) {
                            return wneVar14;
                        }
                    }
                } else {
                    if (i30 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj17);
                }
                return Unit.f46060a;
            case 15:
                if (yjeVar instanceof m8s) {
                    m8sVar = (m8s) yjeVar;
                    int i31 = m8sVar.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        m8sVar.j = i31 - Integer.MIN_VALUE;
                    } else {
                        m8sVar = new m8s(this, yjeVar);
                    }
                } else {
                    m8sVar = new m8s(this, yjeVar);
                }
                Object obj18 = m8sVar.i;
                wne wneVar15 = wne.f39444a;
                int i32 = m8sVar.j;
                if (i32 == 0) {
                    z1x.P(obj18);
                    if (obj instanceof psr) {
                        m8sVar.j = 1;
                        if (kmqVar.a(obj, m8sVar) == wneVar15) {
                            return wneVar15;
                        }
                    }
                } else {
                    if (i32 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj18);
                }
                return Unit.f46060a;
            case 16:
                if (yjeVar instanceof rhs) {
                    rhsVar = (rhs) yjeVar;
                    int i33 = rhsVar.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        rhsVar.j = i33 - Integer.MIN_VALUE;
                    } else {
                        rhsVar = new rhs(this, yjeVar);
                    }
                } else {
                    rhsVar = new rhs(this, yjeVar);
                }
                Object obj19 = rhsVar.i;
                wne wneVar16 = wne.f39444a;
                int i34 = rhsVar.j;
                if (i34 == 0) {
                    z1x.P(obj19);
                    List list4 = (List) obj;
                    ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(((klr) it.next()).h());
                    }
                    rhsVar.j = 1;
                    if (kmqVar.a(arrayList4, rhsVar) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (i34 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj19);
                }
                return Unit.f46060a;
            case 17:
                if (yjeVar instanceof fks) {
                    fksVar = (fks) yjeVar;
                    int i35 = fksVar.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        fksVar.j = i35 - Integer.MIN_VALUE;
                    } else {
                        fksVar = new fks(this, yjeVar);
                    }
                } else {
                    fksVar = new fks(this, yjeVar);
                }
                Object obj20 = fksVar.i;
                wne wneVar17 = wne.f39444a;
                int i36 = fksVar.j;
                if (i36 == 0) {
                    z1x.P(obj20);
                    if (obj instanceof psr) {
                        fksVar.j = 1;
                        if (kmqVar.a(obj, fksVar) == wneVar17) {
                            return wneVar17;
                        }
                    }
                } else {
                    if (i36 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj20);
                }
                return Unit.f46060a;
            case 18:
                if (yjeVar instanceof oos) {
                    oosVar = (oos) yjeVar;
                    int i37 = oosVar.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        oosVar.j = i37 - Integer.MIN_VALUE;
                    } else {
                        oosVar = new oos(this, yjeVar);
                    }
                } else {
                    oosVar = new oos(this, yjeVar);
                }
                Object obj21 = oosVar.i;
                wne wneVar18 = wne.f39444a;
                int i38 = oosVar.j;
                if (i38 == 0) {
                    z1x.P(obj21);
                    zms0 zms0Var = (zms0) obj;
                    zms0Var.getClass();
                    Long l2 = zms0Var.i;
                    long jLongValue = l2 != null ? l2.longValue() : 0L;
                    Long l3 = zms0Var.n;
                    long jLongValue2 = l3 != null ? l3.longValue() : 0L;
                    Integer num = zms0Var.s;
                    ens0 ens0Var = new ens0(jLongValue, num != null && num.intValue() == 1, jLongValue2);
                    oosVar.j = 1;
                    if (kmqVar.a(ens0Var, oosVar) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (i38 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj21);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof dvs) {
                    dvsVar = (dvs) yjeVar;
                    int i39 = dvsVar.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        dvsVar.j = i39 - Integer.MIN_VALUE;
                    } else {
                        dvsVar = new dvs(this, yjeVar);
                    }
                } else {
                    dvsVar = new dvs(this, yjeVar);
                }
                Object obj22 = dvsVar.i;
                wne wneVar19 = wne.f39444a;
                int i40 = dvsVar.j;
                if (i40 == 0) {
                    z1x.P(obj22);
                    yus yusVar = (yus) obj;
                    yusVar.getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append(yusVar.f);
                    dub.b0(yusVar.g, sb);
                    dub.b0(yusVar.h, sb);
                    zus zusVar = new zus(yusVar.k, yusVar.j, sb.toString(), yusVar.i ? R.drawable.ic_quick_bet_active : R.drawable.ic_quick_bet);
                    dvsVar.j = 1;
                    if (kmqVar.a(zusVar, dvsVar) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (i40 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj22);
                }
                return Unit.f46060a;
            case 20:
                if (yjeVar instanceof ivs) {
                    ivsVar = (ivs) yjeVar;
                    int i41 = ivsVar.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        ivsVar.j = i41 - Integer.MIN_VALUE;
                    } else {
                        ivsVar = new ivs(this, yjeVar);
                    }
                } else {
                    ivsVar = new ivs(this, yjeVar);
                }
                Object obj23 = ivsVar.i;
                wne wneVar20 = wne.f39444a;
                int i42 = ivsVar.j;
                if (i42 == 0) {
                    z1x.P(obj23);
                    Boolean boolValueOf2 = Boolean.valueOf(((xvm0) obj) instanceof svm0);
                    ivsVar.j = 1;
                    if (kmqVar.a(boolValueOf2, ivsVar) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (i42 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj23);
                }
                return Unit.f46060a;
            case 21:
                if (yjeVar instanceof kvs) {
                    kvsVar = (kvs) yjeVar;
                    int i43 = kvsVar.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        kvsVar.j = i43 - Integer.MIN_VALUE;
                    } else {
                        kvsVar = new kvs(this, yjeVar);
                    }
                } else {
                    kvsVar = new kvs(this, yjeVar);
                }
                Object obj24 = kvsVar.i;
                wne wneVar21 = wne.f39444a;
                int i44 = kvsVar.j;
                if (i44 == 0) {
                    z1x.P(obj24);
                    Boolean boolValueOf3 = Boolean.valueOf(((px7) obj) instanceof ox7);
                    kvsVar.j = 1;
                    if (kmqVar.a(boolValueOf3, kvsVar) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (i44 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj24);
                }
                return Unit.f46060a;
            case 22:
                if (yjeVar instanceof jzs) {
                    jzsVar = (jzs) yjeVar;
                    int i45 = jzsVar.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        jzsVar.j = i45 - Integer.MIN_VALUE;
                    } else {
                        jzsVar = new jzs(this, yjeVar);
                    }
                } else {
                    jzsVar = new jzs(this, yjeVar);
                }
                Object obj25 = jzsVar.i;
                wne wneVar22 = wne.f39444a;
                int i46 = jzsVar.j;
                if (i46 == 0) {
                    z1x.P(obj25);
                    czs czsVar = (czs) obj;
                    czsVar.getClass();
                    boolean z2 = czsVar.j;
                    boolean z3 = czsVar.f;
                    boolean z4 = czsVar.h;
                    if (z2) {
                        ezsVar = dzs.f6955a;
                    } else if (czsVar.m) {
                        ezsVar = new gzs(z4);
                    } else {
                        ezsVar = (czsVar.g || !z3) ? new ezs(z3, z4, czsVar.i) : new fzs(czsVar.e, z4);
                    }
                    jzsVar.j = 1;
                    if (kmqVar.a(ezsVar, jzsVar) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (i46 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj25);
                }
                return Unit.f46060a;
            case 23:
                if (yjeVar instanceof qzs) {
                    qzsVar = (qzs) yjeVar;
                    int i47 = qzsVar.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        qzsVar.j = i47 - Integer.MIN_VALUE;
                    } else {
                        qzsVar = new qzs(this, yjeVar);
                    }
                } else {
                    qzsVar = new qzs(this, yjeVar);
                }
                Object obj26 = qzsVar.i;
                wne wneVar23 = wne.f39444a;
                int i48 = qzsVar.j;
                if (i48 == 0) {
                    z1x.P(obj26);
                    if (((Boolean) obj).booleanValue()) {
                        qzsVar.j = 1;
                        if (kmqVar.a(obj, qzsVar) == wneVar23) {
                            return wneVar23;
                        }
                    }
                } else {
                    if (i48 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj26);
                }
                return Unit.f46060a;
            case 24:
                if (yjeVar instanceof z0t) {
                    z0tVar = (z0t) yjeVar;
                    int i49 = z0tVar.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        z0tVar.j = i49 - Integer.MIN_VALUE;
                    } else {
                        z0tVar = new z0t(this, yjeVar);
                    }
                } else {
                    z0tVar = new z0t(this, yjeVar);
                }
                Object obj27 = z0tVar.i;
                wne wneVar24 = wne.f39444a;
                int i50 = z0tVar.j;
                if (i50 == 0) {
                    z1x.P(obj27);
                    s0t s0tVar = (s0t) obj;
                    s0tVar.getClass();
                    boolean z5 = s0tVar.i;
                    int i51 = s0tVar.c;
                    boolean z6 = s0tVar.j;
                    if (z5) {
                        u0tVar = new t0t(z6);
                    } else if (s0tVar.h || !s0tVar.f) {
                        Locale locale = Locale.ENGLISH;
                        Long lValueOf = Long.valueOf(s0tVar.b);
                        Integer numValueOf = Integer.valueOf(i51);
                        String upperCase = s0tVar.k.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        u0tVar = new u0t(String.format(locale, "javascript:startGameZone(%d, \"%d\", \"%s\")", Arrays.copyOf(new Object[]{lValueOf, numValueOf, upperCase}, 3)), String.format(locale, "javascript:changeViewZone(\"%d\")", Arrays.copyOf(new Object[]{Integer.valueOf(i51)}, 1)), s0tVar.f, s0tVar.j, s0tVar.l, s0tVar.m);
                    } else {
                        u0tVar = new v0t(s0tVar.e, z6);
                    }
                    z0tVar.j = 1;
                    if (kmqVar.a(u0tVar, z0tVar) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (i50 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj27);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (yjeVar instanceof p1t) {
                    p1tVar = (p1t) yjeVar;
                    int i52 = p1tVar.j;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        p1tVar.j = i52 - Integer.MIN_VALUE;
                    } else {
                        p1tVar = new p1t(this, yjeVar);
                    }
                } else {
                    p1tVar = new p1t(this, yjeVar);
                }
                Object obj28 = p1tVar.i;
                wne wneVar25 = wne.f39444a;
                int i53 = p1tVar.j;
                if (i53 == 0) {
                    z1x.P(obj28);
                    j1t j1tVar = (j1t) obj;
                    j1tVar.getClass();
                    boolean z7 = j1tVar.i;
                    int i54 = j1tVar.c;
                    boolean z8 = j1tVar.j;
                    if (z7) {
                        l1tVar = new k1t(z8);
                    } else if (j1tVar.h || !j1tVar.f) {
                        Locale locale2 = Locale.ENGLISH;
                        Long lValueOf2 = Long.valueOf(j1tVar.b);
                        Integer numValueOf2 = Integer.valueOf(i54);
                        String upperCase2 = j1tVar.k.toUpperCase(Locale.ROOT);
                        upperCase2.getClass();
                        l1tVar = new l1t(String.format(locale2, "javascript:startGameZone(%d, \"%d\", \"%s\")", Arrays.copyOf(new Object[]{lValueOf2, numValueOf2, upperCase2}, 3)), String.format(locale2, "javascript:changeViewZone(\"%d\")", Arrays.copyOf(new Object[]{Integer.valueOf(i54)}, 1)), j1tVar.f, j1tVar.j, j1tVar.l, j1tVar.m);
                    } else {
                        l1tVar = new m1t(j1tVar.e, z8);
                    }
                    p1tVar.j = 1;
                    if (kmqVar.a(l1tVar, p1tVar) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (i53 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj28);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (yjeVar instanceof imt) {
                    imtVar = (imt) yjeVar;
                    int i55 = imtVar.j;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        imtVar.j = i55 - Integer.MIN_VALUE;
                    } else {
                        imtVar = new imt(this, yjeVar);
                    }
                } else {
                    imtVar = new imt(this, yjeVar);
                }
                Object obj29 = imtVar.i;
                wne wneVar26 = wne.f39444a;
                int i56 = imtVar.j;
                if (i56 == 0) {
                    z1x.P(obj29);
                    if (!((List) obj).isEmpty()) {
                        imtVar.j = 1;
                        if (kmqVar.a(obj, imtVar) == wneVar26) {
                            return wneVar26;
                        }
                    }
                } else {
                    if (i56 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj29);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (yjeVar instanceof qmt) {
                    qmtVar = (qmt) yjeVar;
                    int i57 = qmtVar.j;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        qmtVar.j = i57 - Integer.MIN_VALUE;
                    } else {
                        qmtVar = new qmt(this, yjeVar);
                    }
                } else {
                    qmtVar = new qmt(this, yjeVar);
                }
                Object obj30 = qmtVar.i;
                wne wneVar27 = wne.f39444a;
                int i58 = qmtVar.j;
                if (i58 == 0) {
                    z1x.P(obj30);
                    if (!Intrinsics.d((krr0) obj, krr0.n)) {
                        qmtVar.j = 1;
                        if (kmqVar.a(obj, qmtVar) == wneVar27) {
                            return wneVar27;
                        }
                    }
                } else {
                    if (i58 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj30);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (yjeVar instanceof knt) {
                    kntVar = (knt) yjeVar;
                    int i59 = kntVar.j;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        kntVar.j = i59 - Integer.MIN_VALUE;
                    } else {
                        kntVar = new knt(this, yjeVar);
                    }
                } else {
                    kntVar = new knt(this, yjeVar);
                }
                Object obj31 = kntVar.i;
                wne wneVar28 = wne.f39444a;
                int i60 = kntVar.j;
                if (i60 == 0) {
                    z1x.P(obj31);
                    List list5 = (List) obj;
                    ArrayList arrayList5 = new ArrayList(r3d.q(list5, 10));
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        axq.t(((mlr) it2.next()).f22006a, arrayList5);
                    }
                    kntVar.j = 1;
                    if (kmqVar.a(arrayList5, kntVar) == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (i60 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj31);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof mnt) {
                    mntVar = (mnt) yjeVar;
                    int i61 = mntVar.j;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        mntVar.j = i61 - Integer.MIN_VALUE;
                    } else {
                        mntVar = new mnt(this, yjeVar);
                    }
                } else {
                    mntVar = new mnt(this, yjeVar);
                }
                Object obj32 = mntVar.i;
                wne wneVar29 = wne.f39444a;
                int i62 = mntVar.j;
                if (i62 == 0) {
                    z1x.P(obj32);
                    List<pxy> list6 = (List) obj;
                    ArrayList arrayList6 = new ArrayList(r3d.q(list6, 10));
                    for (pxy pxyVar : list6) {
                        arrayList6.add(new gxy(pxyVar.f27779a, pxyVar.c));
                    }
                    mntVar.j = 1;
                    if (kmqVar.a(arrayList6, mntVar) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (i62 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj32);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(gmq gmqVar, yje yjeVar) {
        znq znqVar;
        if (yjeVar instanceof znq) {
            znqVar = (znq) yjeVar;
            int i = znqVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                znqVar.k = i - Integer.MIN_VALUE;
            } else {
                znqVar = new znq(this, yjeVar);
            }
        } else {
            znqVar = new znq(this, yjeVar);
        }
        Object obj = znqVar.i;
        wne wneVar = wne.f39444a;
        int i2 = znqVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            znqVar.k = 1;
            if (slb.Q(this.b, gmqVar, znqVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public /* synthetic */ uap(kmq kmqVar, byte b) {
        this.f35342a = b;
        this.b = kmqVar;
    }
}
