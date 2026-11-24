package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class no0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no0(boolean z, qo0 qo0Var, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.k = z;
        this.m = qo0Var;
        this.l = z2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                boolean z = this.l;
                return new no0(this.k, (qo0) obj2, z, yjeVar);
            case 1:
                return new no0((byte) 1, yjeVar, (ld8) obj2, this.k, this.l);
            case 2:
                return new no0((byte) 2, yjeVar, (z220) obj2, this.k, this.l);
            default:
                return new no0((byte) 3, yjeVar, (n660) obj2, this.k, this.l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((no0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:190:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:191:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:194:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:195:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f6  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object objJ;
        Object objA;
        eoc0 eoc0Var;
        ArrayList arrayList;
        List list;
        iun iunVar;
        String str;
        String str2;
        String str3;
        String str4;
        eoc0 eoc0Var2;
        int iIntValue;
        int i;
        Object objA2;
        foc0 foc0Var;
        ArrayList arrayList2;
        List list2;
        iun iunVar2;
        String str5;
        String str6;
        foc0 foc0Var2;
        int iIntValue2;
        byte b = this.i;
        boolean z = this.l;
        boolean z2 = this.k;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                qo0 qo0Var = (qo0) obj2;
                ocj ocjVar = qo0Var.i;
                wne wneVar = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    if (z2) {
                        yk0 yk0Var = yk0.FAVORITES;
                        int i2 = qo0.V;
                        sn0 sn0Var = sn0.f32471a;
                        qo0Var.X(yk0Var, sn0Var);
                        qo0Var.X(yk0.VIEWED, sn0Var);
                    }
                    if (((ln0) qo0Var.D()).b) {
                        p7m0 p7m0Var = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var.getValue();
                            value2.getClass();
                        } while (!p7m0Var.m(value2, ln0.a((ln0) value2, null, false, null, null, null, iun.f15405a, null, null, 0L, false, 30719)));
                        mne mneVar = qo0Var.v;
                        c4m0 c4m0Var = qo0Var.L;
                        yje yjeVar = null;
                        if (c4m0Var != null) {
                            c4m0Var.cancel(null);
                        }
                        byte b2 = 1;
                        fnq fnqVar = new fnq(qo0Var.r.t(), new io0(qo0Var, z, yjeVar, b2), (byte) 4);
                        bvc bvcVarA = jiu0.a(qo0Var);
                        dvj dvjVar = mneVar.b;
                        qo0Var.L = sac.T(fnqVar, d5c.S(bvcVarA, dvjVar), new jo0(qo0Var, yjeVar, b2));
                        qo0Var.V();
                        if (qo0Var.C.a().L1) {
                            phf0 phf0Var = qo0Var.I;
                            sff0 sff0VarA = ((pru) phf0Var.c).a();
                            nmo nmoVar = (nmo) phf0Var.f26994a;
                            String strA = ((ntu) phf0Var.b).a();
                            boolean z4 = sff0VarA.b.N;
                            strA.getClass();
                            byte b3 = 0;
                            fk80 fk80Var = new fk80(new k06(new x860(16, false), new lv(z4, nmoVar.f23782a, (Object) strA, yjeVar, (byte) 2)), jiu0.a(qo0Var), dvjVar);
                            qo0Var.T = sac.T(new fnq(fk80Var.g, new io0(qo0Var, z, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(qo0Var), dvjVar), new jo0(qo0Var, yjeVar, b3));
                            qo0Var.U = fk80Var;
                        } else {
                            qo0Var.M = sac.T(new fnq(qo0Var.t.u(pmu0.f27256a), new io0(qo0Var, z, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(qo0Var), dvjVar), new jo0(qo0Var, yjeVar, (byte) 3));
                        }
                    } else {
                        p7m0 p7m0Var2 = ocjVar.f25029a;
                        do {
                            value = p7m0Var2.getValue();
                            value.getClass();
                        } while (!p7m0Var2.m(value, ln0.a((ln0) value, null, false, null, null, xun.f41520a, iun.f15405a, null, null, 0L, false, 29695)));
                        this.j = true;
                        if (qo0Var.U(z, this) == wneVar) {
                            return wneVar;
                        }
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                ld8 ld8Var = (ld8) obj2;
                ocj ocjVar2 = ld8Var.i;
                wne wneVar2 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    int i3 = ld8.D;
                    p7m0 p7m0Var3 = ocjVar2.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                    } while (!p7m0Var3.m(value3, hd8.a((hd8) value3, null, true, this.l, false, null, 17)));
                    kki kkiVar = ld8Var.o;
                    this.j = true;
                    kkiVar.getClass();
                    objJ = d5c.J(this, new lyh(kkiVar, z2, null));
                    if (objJ == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objJ = obj;
                }
                ic8 ic8Var = (ic8) objJ;
                int i4 = ld8.D;
                p7m0 p7m0Var4 = ocjVar2.f25029a;
                while (true) {
                    Object value4 = p7m0Var4.getValue();
                    value4.getClass();
                    ic8 ic8Var2 = ic8Var;
                    if (p7m0Var4.m(value4, hd8.a((hd8) value4, ic8Var, false, false, false, null, 24))) {
                        return Unit.f46060a;
                    }
                    ic8Var = ic8Var2;
                }
                break;
            case 2:
                z220 z220Var = (z220) obj2;
                knf0 knf0Var = (knf0) z220Var.c;
                wne wneVar3 = wne.f39444a;
                boolean z6 = this.j;
                if (z6) {
                    if (z6) {
                        z1x.P(obj);
                        objA = obj;
                    } else {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                z1x.P(obj);
                nv20 nv20Var = (nv20) z220Var.d;
                String strC = knf0Var.c();
                knf0Var.getClass();
                knf0Var.getClass();
                int iB = knf0Var.b();
                m2c0 m2c0VarA = ((x2c0) z220Var.e).a();
                Integer intOrNull = m2c0VarA != null ? StringsKt.toIntOrNull(m2c0VarA.c) : null;
                knf0Var.getClass();
                this.j = true;
                bza0 bza0Var = (bza0) ((rta0) nv20Var.f24171a).invoke();
                LinkedHashMap linkedHashMapH = xp20.h(new Pair("lng", strC), new Pair("whence", String.valueOf(22)), new Pair("gr", String.valueOf(1357)), new Pair("ref", String.valueOf(1)));
                if (intOrNull != null) {
                    linkedHashMapH.put("country", String.valueOf(intOrNull.intValue()));
                }
                linkedHashMapH.put("fcountry", String.valueOf(iB));
                if (z2) {
                    linkedHashMapH.put("test", String.valueOf(z2));
                }
                objA = bza0Var.a(linkedHashMapH, new fk9(false), this);
                if (objA == wneVar3) {
                    return wneVar3;
                }
                aic0 aic0Var = (aic0) ((dx5) objA).a();
                qic0 qic0Var = aic0Var.f918a;
                jic0 jic0VarZ = qic0Var != null ? bww.Z(qic0Var) : new jic0("", "", "", 0L, "", 0, 0L, false, false, false, false);
                qic0 qic0Var2 = aic0Var.b;
                jic0 jic0VarZ2 = qic0Var2 != null ? bww.Z(qic0Var2) : new jic0("", "", "", 0L, "", 0, 0L, false, false, false, false);
                t7c0 t7c0Var = aic0Var.d;
                if (t7c0Var != null) {
                    Integer num = t7c0Var.e;
                    Integer num2 = t7c0Var.j;
                    if (num != null) {
                        eoc0Var2 = new eoc0("", "", "", "", 0, "", false, "", gz8.f12169a, iun.f15405a);
                    } else {
                        String str7 = t7c0Var.f33460a;
                        String str8 = str7 == null ? "" : str7;
                        String str9 = t7c0Var.b;
                        String str10 = str9 == null ? r5 : str9;
                        String str11 = t7c0Var.c;
                        String str12 = str11 == null ? r5 : str11;
                        Integer num3 = t7c0Var.f;
                        if (num3 == null) {
                            jf4.k(null);
                            return null;
                        }
                        int iIntValue3 = num3.intValue();
                        String str13 = t7c0Var.h;
                        String str14 = str13 == null ? r5 : str13;
                        gz8 gz8Var = (num2 == null || (iIntValue = num2.intValue()) == 0 || iIntValue != 1) ? gz8.f12169a : gz8.b;
                        gz8 gz8Var2 = gz8Var;
                        if (z || (num2 != null && num2.intValue() == 1)) {
                            List<lw80> list3 = t7c0Var.k;
                            if (list3 != null) {
                                arrayList = new ArrayList(r3d.q(list3, 10));
                                for (lw80 lw80Var : list3) {
                                    Long l = lw80Var.f20753a;
                                    long jLongValue = l != null ? l.longValue() : 0L;
                                    String str15 = lw80Var.b;
                                    if (str15 == null) {
                                        str15 = r5;
                                    }
                                    arrayList.add(new gw80(jLongValue, str15));
                                }
                            } else {
                                arrayList = null;
                            }
                            if (arrayList == null) {
                                iunVar = iun.f15405a;
                            } else {
                                list = arrayList;
                            }
                            str = t7c0Var.i;
                            if (str == null) {
                                str2 = r5;
                            } else {
                                str2 = str;
                            }
                            str3 = t7c0Var.d;
                            if (str3 == null) {
                                str4 = r5;
                            } else {
                                str4 = str3;
                            }
                            eoc0Var2 = new eoc0(str8, str10, str12, str4, iIntValue3, str14, true, str2, gz8Var2, list);
                        } else {
                            iunVar = iun.f15405a;
                        }
                        list = iunVar;
                        str = t7c0Var.i;
                        if (str == null) {
                            str2 = r5;
                        } else {
                            str2 = str;
                        }
                        str3 = t7c0Var.d;
                        if (str3 == null) {
                            str4 = r5;
                        } else {
                            str4 = str3;
                        }
                        eoc0Var2 = new eoc0(str8, str10, str12, str4, iIntValue3, str14, true, str2, gz8Var2, list);
                    }
                    eoc0Var = eoc0Var2;
                } else {
                    eoc0Var = new eoc0("", "", "", "", 0, "", false, "", gz8.f12169a, iun.f15405a);
                }
                return new uhc0(jic0VarZ, jic0VarZ2, eoc0Var);
            default:
                n660 n660Var = (n660) obj2;
                knf0 knf0Var2 = (knf0) n660Var.b;
                wne wneVar4 = wne.f39444a;
                boolean z7 = this.j;
                if (z7) {
                    if (z7) {
                        z1x.P(obj);
                        objA2 = obj;
                        i = 1;
                    } else {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                z1x.P(obj);
                nr00 nr00Var = (nr00) n660Var.c;
                String strC2 = knf0Var2.c();
                knf0Var2.getClass();
                knf0Var2.getClass();
                int iB2 = knf0Var2.b();
                m2c0 m2c0VarA2 = ((x2c0) n660Var.d).a();
                Integer intOrNull2 = m2c0VarA2 != null ? StringsKt.toIntOrNull(m2c0VarA2.c) : null;
                knf0Var2.getClass();
                this.j = true;
                cza0 cza0Var = (cza0) ((rta0) nr00Var.f23980a).invoke();
                i = 1;
                LinkedHashMap linkedHashMapH2 = xp20.h(new Pair("lng", strC2), new Pair("whence", String.valueOf(22)), new Pair("gr", String.valueOf(1357)), new Pair("ref", String.valueOf(1)));
                if (z2) {
                    linkedHashMapH2.put("test", String.valueOf(z2));
                }
                if (intOrNull2 != null) {
                    linkedHashMapH2.put("country", String.valueOf(intOrNull2.intValue()));
                }
                linkedHashMapH2.put("fcountry", String.valueOf(iB2));
                objA2 = cza0Var.a(linkedHashMapH2, new fk9(false), this);
                if (objA2 == wneVar4) {
                    return wneVar4;
                }
                bic0 bic0Var = (bic0) ((dx5) objA2).a();
                ric0 ric0Var = bic0Var.f2653a;
                kic0 kic0VarP = ric0Var != null ? cww.P(ric0Var) : new kic0("", "", "", 0L, "", 0, 0L, false, false, false, false);
                ric0 ric0Var2 = bic0Var.b;
                kic0 kic0VarP2 = ric0Var2 != null ? cww.P(ric0Var2) : new kic0("", "", "", 0L, "", 0, 0L, false, false, false, false);
                u7c0 u7c0Var = bic0Var.c;
                if (u7c0Var != null) {
                    Integer num4 = u7c0Var.e;
                    Integer num5 = u7c0Var.i;
                    if (num4 != null) {
                        foc0Var2 = new foc0("", "", "", "", 0, "", false, "", gz8.f12169a, iun.f15405a);
                    } else {
                        String str16 = u7c0Var.f35178a;
                        String str17 = str16 == null ? "" : str16;
                        String str18 = u7c0Var.b;
                        String str19 = str18 == null ? "" : str18;
                        String str20 = u7c0Var.c;
                        String str21 = str20 == null ? "" : str20;
                        String str22 = u7c0Var.d;
                        String str23 = str22 == null ? "" : str22;
                        Integer num6 = u7c0Var.f;
                        if (num6 == null) {
                            jf4.k(null);
                            return null;
                        }
                        int iIntValue4 = num6.intValue();
                        String str24 = u7c0Var.g;
                        String str25 = str24 == null ? "" : str24;
                        gz8 gz8Var3 = (num5 == null || (iIntValue2 = num5.intValue()) == 0 || iIntValue2 != i) ? gz8.f12169a : gz8.b;
                        gz8 gz8Var4 = gz8Var3;
                        if (z || (num5 != null && num5.intValue() == 1)) {
                            List<mw80> list4 = u7c0Var.j;
                            if (list4 != null) {
                                arrayList2 = new ArrayList(r3d.q(list4, 10));
                                for (mw80 mw80Var : list4) {
                                    Long l2 = mw80Var.f22492a;
                                    long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                                    String str26 = mw80Var.b;
                                    if (str26 == null) {
                                        str26 = "";
                                    }
                                    arrayList2.add(new gw80(jLongValue2, str26));
                                }
                            } else {
                                arrayList2 = null;
                            }
                            if (arrayList2 == null) {
                                iunVar2 = iun.f15405a;
                            } else {
                                list2 = arrayList2;
                            }
                            str5 = u7c0Var.h;
                            if (str5 == null) {
                                str6 = "";
                            } else {
                                str6 = str5;
                            }
                            foc0Var2 = new foc0(str17, str19, str21, str23, iIntValue4, str25, true, str6, gz8Var4, list2);
                        } else {
                            iunVar2 = iun.f15405a;
                        }
                        list2 = iunVar2;
                        str5 = u7c0Var.h;
                        if (str5 == null) {
                            str6 = "";
                        } else {
                            str6 = str5;
                        }
                        foc0Var2 = new foc0(str17, str19, str21, str23, iIntValue4, str25, true, str6, gz8Var4, list2);
                    }
                    foc0Var = foc0Var2;
                } else {
                    foc0Var = new foc0("", "", "", "", 0, "", false, "", gz8.f12169a, iun.f15405a);
                }
                return new vhc0(kic0VarP, kic0VarP2, foc0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no0(byte b, yje yjeVar, Object obj, boolean z, boolean z2) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.k = z;
        this.l = z2;
    }
}
