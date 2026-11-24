package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ua implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35307a;
    public final /* synthetic */ kmq b;

    public /* synthetic */ ua(kmq kmqVar, byte b) {
        this.f35307a = b;
        this.b = kmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0168  */
    /* JADX WARN: Code duplicated, block: B:129:0x01da  */
    /* JADX WARN: Code duplicated, block: B:147:0x0218  */
    /* JADX WARN: Code duplicated, block: B:163:0x0258  */
    /* JADX WARN: Code duplicated, block: B:196:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:214:0x0315  */
    /* JADX WARN: Code duplicated, block: B:232:0x0356  */
    /* JADX WARN: Code duplicated, block: B:248:0x0396  */
    /* JADX WARN: Code duplicated, block: B:264:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:282:0x0422  */
    /* JADX WARN: Code duplicated, block: B:302:0x047d  */
    /* JADX WARN: Code duplicated, block: B:322:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:338:0x0523  */
    /* JADX WARN: Code duplicated, block: B:356:0x0564  */
    /* JADX WARN: Code duplicated, block: B:376:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:396:0x061a  */
    /* JADX WARN: Code duplicated, block: B:412:0x0658  */
    /* JADX WARN: Code duplicated, block: B:428:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:449:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:467:0x072d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:535:0x083c  */
    /* JADX WARN: Code duplicated, block: B:551:0x087f  */
    /* JADX WARN: Code duplicated, block: B:567:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:583:0x0905  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x0129  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        ta taVar;
        kr krVar;
        vr vrVar;
        cs csVar;
        Object objA;
        b00 b00Var;
        Object[] objArr;
        Object[] objArr2;
        od0 od0Var;
        ie0 ie0Var;
        ke0 ke0Var;
        qf0 qf0Var;
        sg0 sg0Var;
        ug0 ug0Var;
        az0 az0Var;
        sz0 sz0Var;
        rg1 rg1Var;
        tg1 tg1Var;
        tn1 tn1Var;
        ro1 ro1Var;
        bp1 bp1Var;
        ov1 ov1Var;
        ci3 ci3Var;
        gi3 gi3Var;
        ii3 ii3Var;
        li3 li3Var;
        ni3 ni3Var;
        el3 el3Var;
        dn3 dn3Var;
        fn3 fn3Var;
        mn3 mn3Var;
        co3 co3Var;
        byte b = this.f35307a;
        z = false;
        boolean z = false;
        int size = 0;
        kmq kmqVar = this.b;
        ArrayList arrayList = null;
        switch (b) {
            case 0:
                if (yjeVar instanceof ta) {
                    taVar = (ta) yjeVar;
                    int i = taVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        taVar.j = i - Integer.MIN_VALUE;
                    } else {
                        taVar = new ta(this, yjeVar);
                    }
                } else {
                    taVar = new ta(this, yjeVar);
                }
                Object obj2 = taVar.i;
                Object obj3 = wne.f39444a;
                int i2 = taVar.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    if (obj instanceof ab50) {
                        taVar.j = 1;
                        if (kmqVar.a(obj, taVar) == obj3) {
                            return obj3;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof kr) {
                    krVar = (kr) yjeVar;
                    int i3 = krVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        krVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        krVar = new kr(this, yjeVar);
                    }
                } else {
                    krVar = new kr(this, yjeVar);
                }
                Object obj4 = krVar.i;
                Object obj5 = wne.f39444a;
                int i4 = krVar.j;
                if (i4 == 0) {
                    z1x.P(obj4);
                    Object num = new Integer(((List) obj).size());
                    krVar.j = 1;
                    if (kmqVar.a(num, krVar) == obj5) {
                        return obj5;
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
                if (yjeVar instanceof vr) {
                    vrVar = (vr) yjeVar;
                    int i5 = vrVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        vrVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        vrVar = new vr(this, yjeVar);
                    }
                } else {
                    vrVar = new vr(this, yjeVar);
                }
                Object obj6 = vrVar.i;
                Object obj7 = wne.f39444a;
                int i6 = vrVar.j;
                if (i6 == 0) {
                    z1x.P(obj6);
                    Object num2 = new Integer(((List) obj).size());
                    vrVar.j = 1;
                    if (kmqVar.a(num2, vrVar) == obj7) {
                        return obj7;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            case 3:
                if (yjeVar instanceof cs) {
                    csVar = (cs) yjeVar;
                    int i7 = csVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        csVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        csVar = new cs(this, yjeVar);
                    }
                } else {
                    csVar = new cs(this, yjeVar);
                }
                Object obj8 = csVar.i;
                Object obj9 = wne.f39444a;
                int i8 = csVar.j;
                if (i8 == 0) {
                    z1x.P(obj8);
                    Object num3 = new Integer(((List) obj).size());
                    csVar.j = 1;
                    if (kmqVar.a(num3, csVar) == obj9) {
                        return obj9;
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
                e7a e7aVar = (e7a) obj;
                return ((e7aVar instanceof c7a) && (objA = kmqVar.a(((c7a) e7aVar).f3852a, yjeVar)) == wne.f39444a) ? objA : Unit.f46060a;
            case 5:
                if (yjeVar instanceof b00) {
                    b00Var = (b00) yjeVar;
                    int i9 = b00Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        b00Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        b00Var = new b00(this, yjeVar);
                    }
                } else {
                    b00Var = new b00(this, yjeVar);
                }
                Object obj10 = b00Var.i;
                Object obj11 = wne.f39444a;
                int i10 = b00Var.j;
                if (i10 == 0) {
                    z1x.P(obj10);
                    List list = (List) obj;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj12 : list) {
                        if (obj12 instanceof x7q0) {
                            arrayList2.add(obj12);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj13 : arrayList2) {
                        if (((x7q0) obj13).d) {
                            arrayList3.add(obj13);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        objArr = false;
                    } else {
                        Iterator it = arrayList3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                objArr = false;
                            } else if (((x7q0) it.next()).b.length() > 0) {
                                objArr = true;
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj14 : list) {
                        if (obj14 instanceof itc) {
                            arrayList4.add(obj14);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj15 : arrayList4) {
                        if (((itc) obj15).f) {
                            arrayList5.add(obj15);
                        }
                    }
                    if (arrayList5.isEmpty()) {
                        objArr2 = false;
                    } else {
                        Iterator it2 = arrayList5.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                objArr2 = false;
                            } else if (((itc) it2.next()).d.length() > 0) {
                                objArr2 = true;
                            }
                        }
                    }
                    Object objValueOf = Boolean.valueOf(objArr == true || objArr2 == true);
                    b00Var.j = 1;
                    if (kmqVar.a(objValueOf, b00Var) == obj11) {
                        return obj11;
                    }
                } else {
                    if (i10 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj10);
                }
                return Unit.f46060a;
            case 6:
                if (yjeVar instanceof od0) {
                    od0Var = (od0) yjeVar;
                    int i11 = od0Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        od0Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        od0Var = new od0(this, yjeVar);
                    }
                } else {
                    od0Var = new od0(this, yjeVar);
                }
                Object obj16 = od0Var.i;
                Object obj17 = wne.f39444a;
                int i12 = od0Var.j;
                if (i12 == 0) {
                    z1x.P(obj16);
                    if (((Boolean) obj).booleanValue()) {
                        od0Var.j = 1;
                        if (kmqVar.a(obj, od0Var) == obj17) {
                            return obj17;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj16);
                }
                return Unit.f46060a;
            case 7:
                if (yjeVar instanceof ie0) {
                    ie0Var = (ie0) yjeVar;
                    int i13 = ie0Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        ie0Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        ie0Var = new ie0(this, yjeVar);
                    }
                } else {
                    ie0Var = new ie0(this, yjeVar);
                }
                Object obj18 = ie0Var.i;
                Object obj19 = wne.f39444a;
                int i14 = ie0Var.j;
                if (i14 == 0) {
                    z1x.P(obj18);
                    String str = (String) obj;
                    if (str.length() == 0 || str.length() >= 3) {
                        ie0Var.j = 1;
                        if (kmqVar.a(obj, ie0Var) == obj19) {
                            return obj19;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj18);
                }
                return Unit.f46060a;
            case 8:
                if (yjeVar instanceof ke0) {
                    ke0Var = (ke0) yjeVar;
                    int i15 = ke0Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        ke0Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        ke0Var = new ke0(this, yjeVar);
                    }
                } else {
                    ke0Var = new ke0(this, yjeVar);
                }
                Object obj20 = ke0Var.i;
                Object obj21 = wne.f39444a;
                int i16 = ke0Var.j;
                if (i16 == 0) {
                    z1x.P(obj20);
                    Object lowerCase = StringsKt.u0((String) obj).toString().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    ke0Var.j = 1;
                    if (kmqVar.a(lowerCase, ke0Var) == obj21) {
                        return obj21;
                    }
                } else {
                    if (i16 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj20);
                }
                return Unit.f46060a;
            case 9:
                if (yjeVar instanceof qf0) {
                    qf0Var = (qf0) yjeVar;
                    int i17 = qf0Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        qf0Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        qf0Var = new qf0(this, yjeVar);
                    }
                } else {
                    qf0Var = new qf0(this, yjeVar);
                }
                Object obj22 = qf0Var.i;
                Object obj23 = wne.f39444a;
                int i18 = qf0Var.j;
                if (i18 == 0) {
                    z1x.P(obj22);
                    Object objY = jar0.Y((wf0) obj);
                    qf0Var.j = 1;
                    if (kmqVar.a(objY, qf0Var) == obj23) {
                        return obj23;
                    }
                } else {
                    if (i18 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj22);
                }
                return Unit.f46060a;
            case 10:
                if (yjeVar instanceof sg0) {
                    sg0Var = (sg0) yjeVar;
                    int i19 = sg0Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        sg0Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        sg0Var = new sg0(this, yjeVar);
                    }
                } else {
                    sg0Var = new sg0(this, yjeVar);
                }
                Object obj24 = sg0Var.i;
                Object obj25 = wne.f39444a;
                int i20 = sg0Var.j;
                if (i20 == 0) {
                    z1x.P(obj24);
                    List list2 = (List) obj;
                    ArrayList arrayList6 = new ArrayList(r3d.q(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(hew0.W((uvc) it3.next()));
                    }
                    sg0Var.j = 1;
                    if (kmqVar.a(arrayList6, sg0Var) == obj25) {
                        return obj25;
                    }
                } else {
                    if (i20 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj24);
                }
                return Unit.f46060a;
            case 11:
                if (yjeVar instanceof ug0) {
                    ug0Var = (ug0) yjeVar;
                    int i21 = ug0Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        ug0Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        ug0Var = new ug0(this, yjeVar);
                    }
                } else {
                    ug0Var = new ug0(this, yjeVar);
                }
                Object obj26 = ug0Var.i;
                Object obj27 = wne.f39444a;
                int i22 = ug0Var.j;
                if (i22 == 0) {
                    z1x.P(obj26);
                    List list3 = (List) obj;
                    ArrayList arrayList7 = new ArrayList(r3d.q(list3, 10));
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        arrayList7.add(hew0.V((kr5) it4.next()));
                    }
                    ug0Var.j = 1;
                    if (kmqVar.a(arrayList7, ug0Var) == obj27) {
                        return obj27;
                    }
                } else {
                    if (i22 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj26);
                }
                return Unit.f46060a;
            case 12:
                if (yjeVar instanceof az0) {
                    az0Var = (az0) yjeVar;
                    int i23 = az0Var.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        az0Var.j = i23 - Integer.MIN_VALUE;
                    } else {
                        az0Var = new az0(this, yjeVar);
                    }
                } else {
                    az0Var = new az0(this, yjeVar);
                }
                Object obj28 = az0Var.i;
                Object obj29 = wne.f39444a;
                int i24 = az0Var.j;
                if (i24 == 0) {
                    z1x.P(obj28);
                    if (((Boolean) obj).booleanValue()) {
                        az0Var.j = 1;
                        if (kmqVar.a(obj, az0Var) == obj29) {
                            return obj29;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj28);
                }
                return Unit.f46060a;
            case 13:
                if (yjeVar instanceof sz0) {
                    sz0Var = (sz0) yjeVar;
                    int i25 = sz0Var.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        sz0Var.j = i25 - Integer.MIN_VALUE;
                    } else {
                        sz0Var = new sz0(this, yjeVar);
                    }
                } else {
                    sz0Var = new sz0(this, yjeVar);
                }
                Object obj30 = sz0Var.i;
                Object obj31 = wne.f39444a;
                int i26 = sz0Var.j;
                if (i26 == 0) {
                    z1x.P(obj30);
                    Object lowerCase2 = StringsKt.u0((String) obj).toString().toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    sz0Var.j = 1;
                    if (kmqVar.a(lowerCase2, sz0Var) == obj31) {
                        return obj31;
                    }
                } else {
                    if (i26 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj30);
                }
                return Unit.f46060a;
            case 14:
                if (yjeVar instanceof rg1) {
                    rg1Var = (rg1) yjeVar;
                    int i27 = rg1Var.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        rg1Var.j = i27 - Integer.MIN_VALUE;
                    } else {
                        rg1Var = new rg1(this, yjeVar);
                    }
                } else {
                    rg1Var = new rg1(this, yjeVar);
                }
                Object obj32 = rg1Var.i;
                Object obj33 = wne.f39444a;
                int i28 = rg1Var.j;
                if (i28 == 0) {
                    z1x.P(obj32);
                    List list4 = (List) obj;
                    ArrayList arrayList8 = new ArrayList(r3d.q(list4, 10));
                    Iterator it5 = list4.iterator();
                    while (it5.hasNext()) {
                        arrayList8.add(hew0.W((uvc) it5.next()));
                    }
                    rg1Var.j = 1;
                    if (kmqVar.a(arrayList8, rg1Var) == obj33) {
                        return obj33;
                    }
                } else {
                    if (i28 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj32);
                }
                return Unit.f46060a;
            case 15:
                if (yjeVar instanceof tg1) {
                    tg1Var = (tg1) yjeVar;
                    int i29 = tg1Var.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        tg1Var.j = i29 - Integer.MIN_VALUE;
                    } else {
                        tg1Var = new tg1(this, yjeVar);
                    }
                } else {
                    tg1Var = new tg1(this, yjeVar);
                }
                Object obj34 = tg1Var.i;
                Object obj35 = wne.f39444a;
                int i30 = tg1Var.j;
                if (i30 == 0) {
                    z1x.P(obj34);
                    List list5 = (List) obj;
                    ArrayList arrayList9 = new ArrayList(r3d.q(list5, 10));
                    Iterator it6 = list5.iterator();
                    while (it6.hasNext()) {
                        arrayList9.add(hew0.V((kr5) it6.next()));
                    }
                    tg1Var.j = 1;
                    if (kmqVar.a(arrayList9, tg1Var) == obj35) {
                        return obj35;
                    }
                } else {
                    if (i30 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj34);
                }
                return Unit.f46060a;
            case 16:
                if (yjeVar instanceof tn1) {
                    tn1Var = (tn1) yjeVar;
                    int i31 = tn1Var.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        tn1Var.j = i31 - Integer.MIN_VALUE;
                    } else {
                        tn1Var = new tn1(this, yjeVar);
                    }
                } else {
                    tn1Var = new tn1(this, yjeVar);
                }
                Object obj36 = tn1Var.i;
                Object obj37 = wne.f39444a;
                int i32 = tn1Var.j;
                if (i32 == 0) {
                    z1x.P(obj36);
                    if (((Boolean) obj).booleanValue()) {
                        tn1Var.j = 1;
                        if (kmqVar.a(obj, tn1Var) == obj37) {
                            return obj37;
                        }
                    }
                } else {
                    if (i32 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj36);
                }
                return Unit.f46060a;
            case 17:
                if (yjeVar instanceof ro1) {
                    ro1Var = (ro1) yjeVar;
                    int i33 = ro1Var.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        ro1Var.j = i33 - Integer.MIN_VALUE;
                    } else {
                        ro1Var = new ro1(this, yjeVar);
                    }
                } else {
                    ro1Var = new ro1(this, yjeVar);
                }
                Object obj38 = ro1Var.i;
                Object obj39 = wne.f39444a;
                int i34 = ro1Var.j;
                if (i34 == 0) {
                    z1x.P(obj38);
                    Object lowerCase3 = StringsKt.u0((String) obj).toString().toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    ro1Var.j = 1;
                    if (kmqVar.a(lowerCase3, ro1Var) == obj39) {
                        return obj39;
                    }
                } else {
                    if (i34 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj38);
                }
                return Unit.f46060a;
            case 18:
                if (yjeVar instanceof bp1) {
                    bp1Var = (bp1) yjeVar;
                    int i35 = bp1Var.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        bp1Var.j = i35 - Integer.MIN_VALUE;
                    } else {
                        bp1Var = new bp1(this, yjeVar);
                    }
                } else {
                    bp1Var = new bp1(this, yjeVar);
                }
                Object obj40 = bp1Var.i;
                Object obj41 = wne.f39444a;
                int i36 = bp1Var.j;
                if (i36 == 0) {
                    z1x.P(obj40);
                    Object objValueOf2 = Boolean.valueOf(((sw00) obj).f32897a);
                    bp1Var.j = 1;
                    if (kmqVar.a(objValueOf2, bp1Var) == obj41) {
                        return obj41;
                    }
                } else {
                    if (i36 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj40);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof ov1) {
                    ov1Var = (ov1) yjeVar;
                    int i37 = ov1Var.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        ov1Var.j = i37 - Integer.MIN_VALUE;
                    } else {
                        ov1Var = new ov1(this, yjeVar);
                    }
                } else {
                    ov1Var = new ov1(this, yjeVar);
                }
                Object obj42 = ov1Var.i;
                Object obj43 = wne.f39444a;
                int i38 = ov1Var.j;
                if (i38 == 0) {
                    z1x.P(obj42);
                    if (((Boolean) obj).booleanValue()) {
                        ov1Var.j = 1;
                        if (kmqVar.a(obj, ov1Var) == obj43) {
                            return obj43;
                        }
                    }
                } else {
                    if (i38 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj42);
                }
                return Unit.f46060a;
            case 20:
                if (yjeVar instanceof ci3) {
                    ci3Var = (ci3) yjeVar;
                    int i39 = ci3Var.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        ci3Var.j = i39 - Integer.MIN_VALUE;
                    } else {
                        ci3Var = new ci3(this, yjeVar);
                    }
                } else {
                    ci3Var = new ci3(this, yjeVar);
                }
                Object obj44 = ci3Var.i;
                Object obj45 = wne.f39444a;
                int i40 = ci3Var.j;
                if (i40 == 0) {
                    z1x.P(obj44);
                    if (!(((og3) obj) instanceof kg3)) {
                        ci3Var.j = 1;
                        if (kmqVar.a(obj, ci3Var) == obj45) {
                            return obj45;
                        }
                    }
                } else {
                    if (i40 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj44);
                }
                return Unit.f46060a;
            case 21:
                if (yjeVar instanceof gi3) {
                    gi3Var = (gi3) yjeVar;
                    int i41 = gi3Var.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        gi3Var.j = i41 - Integer.MIN_VALUE;
                    } else {
                        gi3Var = new gi3(this, yjeVar);
                    }
                } else {
                    gi3Var = new gi3(this, yjeVar);
                }
                Object obj46 = gi3Var.i;
                Object obj47 = wne.f39444a;
                int i42 = gi3Var.j;
                if (i42 == 0) {
                    z1x.P(obj46);
                    jh3 jh3Var = (jh3) obj;
                    jh3Var.getClass();
                    List list6 = jh3Var.d;
                    Iterator it7 = list6.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            List list7 = ((npm0) it7.next()).b;
                            if (!list7.isEmpty()) {
                                Iterator it8 = list7.iterator();
                                while (true) {
                                    if (!it8.hasNext()) {
                                        continue;
                                    } else if (!((mpm0) it8.next()).b) {
                                    }
                                }
                            }
                            size++;
                        } else {
                            size = -1;
                        }
                    }
                    if (size == -1) {
                        size = list6.size();
                    }
                    Object oh3Var = new oh3(size);
                    gi3Var.j = 1;
                    if (kmqVar.a(oh3Var, gi3Var) == obj47) {
                        return obj47;
                    }
                } else {
                    if (i42 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj46);
                }
                return Unit.f46060a;
            case 22:
                if (yjeVar instanceof ii3) {
                    ii3Var = (ii3) yjeVar;
                    int i43 = ii3Var.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        ii3Var.j = i43 - Integer.MIN_VALUE;
                    } else {
                        ii3Var = new ii3(this, yjeVar);
                    }
                } else {
                    ii3Var = new ii3(this, yjeVar);
                }
                Object obj48 = ii3Var.i;
                Object obj49 = wne.f39444a;
                int i44 = ii3Var.j;
                if (i44 == 0) {
                    z1x.P(obj48);
                    Object objValueOf3 = Boolean.valueOf(((jh3) obj).k);
                    ii3Var.j = 1;
                    if (kmqVar.a(objValueOf3, ii3Var) == obj49) {
                        return obj49;
                    }
                } else {
                    if (i44 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj48);
                }
                return Unit.f46060a;
            case 23:
                if (yjeVar instanceof li3) {
                    li3Var = (li3) yjeVar;
                    int i45 = li3Var.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        li3Var.j = i45 - Integer.MIN_VALUE;
                    } else {
                        li3Var = new li3(this, yjeVar);
                    }
                } else {
                    li3Var = new li3(this, yjeVar);
                }
                Object obj50 = li3Var.i;
                Object obj51 = wne.f39444a;
                int i46 = li3Var.j;
                if (i46 == 0) {
                    z1x.P(obj50);
                    Object obj52 = ((jh3) obj).h;
                    if (obj52 != null) {
                        li3Var.j = 1;
                        if (kmqVar.a(obj52, li3Var) == obj51) {
                            return obj51;
                        }
                    }
                } else {
                    if (i46 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj50);
                }
                return Unit.f46060a;
            case 24:
                if (yjeVar instanceof ni3) {
                    ni3Var = (ni3) yjeVar;
                    int i47 = ni3Var.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        ni3Var.j = i47 - Integer.MIN_VALUE;
                    } else {
                        ni3Var = new ni3(this, yjeVar);
                    }
                } else {
                    ni3Var = new ni3(this, yjeVar);
                }
                Object obj53 = ni3Var.i;
                Object obj54 = wne.f39444a;
                int i48 = ni3Var.j;
                if (i48 == 0) {
                    z1x.P(obj53);
                    jh3 jh3Var2 = (jh3) obj;
                    oc5 oc5Var = jh3Var2.g;
                    if (oc5Var != null) {
                        List listJ = q3d.j(o050.b0(oc5Var, jh3Var2.b), oc5Var.d, oc5Var.e);
                        arrayList = new ArrayList();
                        for (Object obj55 : listJ) {
                            if (((String) obj55).length() > 0) {
                                arrayList.add(obj55);
                            }
                        }
                    }
                    if (arrayList != null) {
                        ni3Var.j = 1;
                        if (kmqVar.a(arrayList, ni3Var) == obj54) {
                            return obj54;
                        }
                    }
                } else {
                    if (i48 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj53);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (yjeVar instanceof el3) {
                    el3Var = (el3) yjeVar;
                    int i49 = el3Var.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        el3Var.j = i49 - Integer.MIN_VALUE;
                    } else {
                        el3Var = new el3(this, yjeVar);
                    }
                } else {
                    el3Var = new el3(this, yjeVar);
                }
                Object obj56 = el3Var.i;
                Object obj57 = wne.f39444a;
                int i50 = el3Var.j;
                if (i50 == 0) {
                    z1x.P(obj56);
                    if (!(((xk3) obj) instanceof sk3)) {
                        el3Var.j = 1;
                        if (kmqVar.a(obj, el3Var) == obj57) {
                            return obj57;
                        }
                    }
                } else {
                    if (i50 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj56);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (yjeVar instanceof dn3) {
                    dn3Var = (dn3) yjeVar;
                    int i51 = dn3Var.j;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        dn3Var.j = i51 - Integer.MIN_VALUE;
                    } else {
                        dn3Var = new dn3(this, yjeVar);
                    }
                } else {
                    dn3Var = new dn3(this, yjeVar);
                }
                Object obj58 = dn3Var.i;
                Object obj59 = wne.f39444a;
                int i52 = dn3Var.j;
                if (i52 == 0) {
                    z1x.P(obj58);
                    if (!(((wl3) obj) instanceof rl3)) {
                        dn3Var.j = 1;
                        if (kmqVar.a(obj, dn3Var) == obj59) {
                            return obj59;
                        }
                    }
                } else {
                    if (i52 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj58);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (yjeVar instanceof fn3) {
                    fn3Var = (fn3) yjeVar;
                    int i53 = fn3Var.j;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        fn3Var.j = i53 - Integer.MIN_VALUE;
                    } else {
                        fn3Var = new fn3(this, yjeVar);
                    }
                } else {
                    fn3Var = new fn3(this, yjeVar);
                }
                Object obj60 = fn3Var.i;
                Object obj61 = wne.f39444a;
                int i54 = fn3Var.j;
                if (i54 == 0) {
                    z1x.P(obj60);
                    um3 um3Var = (um3) obj;
                    if (um3Var.p && um3Var.q) {
                        fn3Var.j = 1;
                        if (kmqVar.a(obj, fn3Var) == obj61) {
                            return obj61;
                        }
                    }
                } else {
                    if (i54 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj60);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (yjeVar instanceof mn3) {
                    mn3Var = (mn3) yjeVar;
                    int i55 = mn3Var.j;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        mn3Var.j = i55 - Integer.MIN_VALUE;
                    } else {
                        mn3Var = new mn3(this, yjeVar);
                    }
                } else {
                    mn3Var = new mn3(this, yjeVar);
                }
                Object obj62 = mn3Var.i;
                Object obj63 = wne.f39444a;
                int i56 = mn3Var.j;
                if (i56 == 0) {
                    z1x.P(obj62);
                    um3 um3Var2 = (um3) obj;
                    if (um3Var2.n && um3Var2.o) {
                        z = true;
                    }
                    Object objValueOf4 = Boolean.valueOf(z);
                    mn3Var.j = 1;
                    if (kmqVar.a(objValueOf4, mn3Var) == obj63) {
                        return obj63;
                    }
                } else {
                    if (i56 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj62);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof co3) {
                    co3Var = (co3) yjeVar;
                    int i57 = co3Var.j;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        co3Var.j = i57 - Integer.MIN_VALUE;
                    } else {
                        co3Var = new co3(this, yjeVar);
                    }
                } else {
                    co3Var = new co3(this, yjeVar);
                }
                Object obj64 = co3Var.i;
                Object obj65 = wne.f39444a;
                int i58 = co3Var.j;
                if (i58 == 0) {
                    z1x.P(obj64);
                    if (!(((yn3) obj) instanceof vn3)) {
                        co3Var.j = 1;
                        if (kmqVar.a(obj, co3Var) == obj65) {
                            return obj65;
                        }
                    }
                } else {
                    if (i58 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj64);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ua(kmq kmqVar, w46 w46Var, byte b) {
        this.f35307a = b;
        this.b = kmqVar;
    }
}
