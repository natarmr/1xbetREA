package a;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class r980 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30066a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r980(Object obj, Object obj2, byte b) {
        this.f30066a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final Object d(yje yjeVar, Object obj) {
        nlx nlxVar = (nlx) obj;
        boolean z = nlxVar instanceof lub0;
        p13 p13Var = (p13) this.b;
        if (!z) {
            vne vneVar = (vne) this.c;
            td9 td9Var = p13Var.t;
            float f = 0.0f;
            if (td9Var == null) {
                boolean z2 = p13Var.p;
                t3k t3kVar = p13Var.s;
                td9Var = new td9();
                td9Var.f33756a = z2;
                td9Var.b = t3kVar;
                td9Var.c = xf0.c(0.0f);
                td9Var.d = new ArrayList();
                vfc.J(p13Var);
                p13Var.t = td9Var;
            }
            td9 td9Var2 = td9Var;
            ArrayList arrayList = (ArrayList) td9Var2.d;
            if (nlxVar instanceof rsw) {
                arrayList.add(nlxVar);
            } else if (nlxVar instanceof ssw) {
                arrayList.remove(((ssw) nlxVar).f32747a);
            } else if (nlxVar instanceof qpq) {
                arrayList.add(nlxVar);
            } else if (nlxVar instanceof rpq) {
                arrayList.remove(((rpq) nlxVar).f30899a);
            } else if (nlxVar instanceof nel) {
                arrayList.add(nlxVar);
            } else if (nlxVar instanceof oel) {
                arrayList.remove(((oel) nlxVar).f25128a);
            } else if (nlxVar instanceof mel) {
                arrayList.remove(((mel) nlxVar).f21651a);
            }
            nlx nlxVar2 = (nlx) CollectionsKt.f0(arrayList);
            if (!Intrinsics.d((nlx) td9Var2.e, nlxVar2)) {
                yje yjeVar2 = null;
                if (nlxVar2 != null) {
                    hcg0 hcg0Var = (hcg0) ((t3k) td9Var2.b).invoke();
                    boolean z3 = nlxVar2 instanceof rsw;
                    if (z3) {
                        f = hcg0Var.c;
                    } else if (nlxVar2 instanceof qpq) {
                        f = hcg0Var.b;
                    } else if (nlxVar2 instanceof nel) {
                        f = hcg0Var.f12823a;
                    }
                    float f2 = f;
                    uts0 uts0Var = mcg0.f21550a;
                    if (!z3 && ((nlxVar2 instanceof qpq) || (nlxVar2 instanceof nel))) {
                        uts0Var = new uts0(45, 0, ihn.d);
                    }
                    qjj.W(vneVar, null, null, new ep8((byte) 6, f2, yjeVar2, td9Var2, uts0Var), 3);
                } else {
                    nlx nlxVar3 = (nlx) td9Var2.e;
                    uts0 uts0Var2 = mcg0.f21550a;
                    if (!(nlxVar3 instanceof rsw) && !(nlxVar3 instanceof qpq) && (nlxVar3 instanceof nel)) {
                        uts0Var2 = new uts0(150, 0, ihn.d);
                    }
                    qjj.W(vneVar, null, null, new lcl0(td9Var2, uts0Var2, yjeVar2, (byte) 6), 3);
                }
                td9Var2.e = nlxVar2;
            }
        } else if (p13Var.w) {
            p13Var.Z0((lub0) nlxVar);
        } else {
            p13Var.x.a(nlxVar);
        }
        return Unit.f46060a;
    }

    private final Object e(yje yjeVar, Object obj) {
        Integer num;
        Pair pair = (Pair) obj;
        List list = (List) pair.f46059a;
        int iIntValue = ((Number) pair.b).intValue();
        zrx zrxVar = (zrx) this.b;
        w6k w6kVar = (w6k) this.c;
        rah0 rah0Var = zrxVar.f44880a;
        w6kVar.getClass();
        list.getClass();
        if (!list.isEmpty() && ((num = zrxVar.d) == null || num.intValue() != iIntValue)) {
            zrxVar.d = Integer.valueOf(iIntValue);
            qvx qvxVar = (qvx) CollectionsKt.W(iIntValue, list);
            if (qvxVar != null) {
                qvx qvxVar2 = (qvx) (zrxVar.c ? CollectionsKt.U(list) : CollectionsKt.d0(list));
                int iT = w6kVar.T(qvxVar2.f29410a + qvxVar2.b);
                int iL = iT - rah0Var.f.l();
                int iT2 = w6kVar.T(qvxVar.f29410a) - ((iL / 2) - (w6kVar.T(qvxVar.b) / 2));
                int i = iT - iL;
                if (i < 0) {
                    i = 0;
                }
                int iD = l1e0.d(iT2, 0, i);
                if (rah0Var.f30133a.l() != iD) {
                    qjj.W(zrxVar.b, null, null, new u52((Object) zrxVar, iD, (yje) null, (byte) 12), 3);
                }
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object f(yje yjeVar, Object obj) {
        idi0 idi0Var;
        if (yjeVar instanceof idi0) {
            idi0Var = (idi0) yjeVar;
            int i = idi0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                idi0Var.j = i - Integer.MIN_VALUE;
            } else {
                idi0Var = new idi0(this, yjeVar);
            }
        } else {
            idi0Var = new idi0(this, yjeVar);
        }
        Object obj2 = idi0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = idi0Var.j;
        if (i2 == 0) {
            z1x.P(obj2);
            kmq kmqVar = (kmq) this.b;
            Pair pair = new Pair((e7a) obj, (String) ((zl60) this.c).b);
            idi0Var.j = 1;
            if (kmqVar.a(pair, idi0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r7.a(r8, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object h(a.yje r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.cgi0
            if (r0 == 0) goto L13
            r0 = r8
            a.cgi0 r0 = (a.cgi0) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            a.cgi0 r0 = new a.cgi0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.j
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r8)
            goto L5d
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r3
        L31:
            a.kmq r7 = r0.k
            a.z1x.P(r8)
            goto L52
        L37:
            a.z1x.P(r8)
            java.lang.Object r8 = r7.b
            a.kmq r8 = (a.kmq) r8
            a.wh80 r9 = (a.wh80) r9
            java.lang.Object r7 = r7.c
            a.ufi0 r7 = (a.ufi0) r7
            r0.k = r8
            r0.j = r5
            java.lang.Object r7 = r7.a(r9, r0)
            if (r7 != r1) goto L4f
            goto L5c
        L4f:
            r6 = r8
            r8 = r7
            r7 = r6
        L52:
            r0.k = r3
            r0.j = r4
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L5d
        L5c:
            return r1
        L5d:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r980.h(a.yje, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final java.lang.Object j(a.yje r40, java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 1811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r980.j(a.yje, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object k(yje yjeVar, Object obj) {
        xwj0 xwj0Var;
        String strC;
        ank0 ank0VarU;
        Object cpm0Var;
        if (yjeVar instanceof xwj0) {
            xwj0Var = (xwj0) yjeVar;
            int i = xwj0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                xwj0Var.j = i - Integer.MIN_VALUE;
            } else {
                xwj0Var = new xwj0(this, yjeVar);
            }
        } else {
            xwj0Var = new xwj0(this, yjeVar);
        }
        Object obj2 = xwj0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = xwj0Var.j;
        if (i2 == 0) {
            z1x.P(obj2);
            kmq kmqVar = (kmq) this.b;
            StepInputUiModel stepInputUiModel = (StepInputUiModel) obj;
            ctf0 ctf0Var = ((yxj0) this.c).D;
            stepInputUiModel.getClass();
            double d = stepInputUiModel.d;
            double d2 = stepInputUiModel.f46647a;
            ctf0Var.getClass();
            if ((stepInputUiModel.b == 0.0d && stepInputUiModel.c == 1.0d) || d == -1.0d) {
                cpm0Var = bpm0.f2992a;
            } else {
                if (d2 == -1.0d) {
                    strC = "";
                } else {
                    pn40 pn40Var = pn40.f27267a;
                    strC = pn40.c(d2, p3u0.g);
                }
                String str = strC;
                double d3 = stepInputUiModel.d;
                double d4 = stepInputUiModel.e;
                String str2 = stepInputUiModel.f;
                boolean z = stepInputUiModel.g;
                if ((d3 > d2 || d2 > d4) && d2 != -1.0d && (d2 <= d4 || !z)) {
                    ank0VarU = d2 < d3 ? h8x.u(ctf0Var, d3, str2) : new ank0(iun.f15405a);
                } else {
                    ank0VarU = h8x.r(z, d3, str2, d4);
                }
                ank0 ank0Var = ank0VarU;
                boolean z2 = stepInputUiModel.k;
                double d5 = stepInputUiModel.e;
                cpm0Var = new cpm0(str, stepInputUiModel.j, ank0Var, z2, d2 < d5, d2 > d, d2 != -1.0d && d <= d2 && d2 <= d5 && stepInputUiModel.m, !((d <= d2 && d2 <= d5) || d2 == -1.0d || (d2 > d5 && stepInputUiModel.g)));
            }
            xwj0Var.j = 1;
            if (kmqVar.a(cpm0Var, xwj0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object l(yje yjeVar, Object obj) {
        ryj0 ryj0Var;
        ank0 ank0VarS;
        if (yjeVar instanceof ryj0) {
            ryj0Var = (ryj0) yjeVar;
            int i = ryj0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ryj0Var.j = i - Integer.MIN_VALUE;
            } else {
                ryj0Var = new ryj0(this, yjeVar);
            }
        } else {
            ryj0Var = new ryj0(this, yjeVar);
        }
        Object obj2 = ryj0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ryj0Var.j;
        if (i2 == 0) {
            z1x.P(obj2);
            kmq kmqVar = (kmq) this.b;
            od7 od7Var = (od7) obj;
            ctf0 ctf0Var = ((wyj0) this.c).d;
            od7Var.getClass();
            ctf0Var.getClass();
            boolean z = od7Var.d;
            BigDecimal bigDecimal = od7Var.f25063a;
            String plainString = bigDecimal.toPlainString();
            plainString.getClass();
            BigDecimal bigDecimal2 = od7Var.b;
            BigDecimal bigDecimal3 = od7Var.c;
            String str = od7Var.e;
            if (bigDecimal.compareTo(bigDecimal2) >= 0 || bigDecimal.compareTo(new BigDecimal(String.valueOf(-1.0d))) == 0) {
                ank0VarS = bigDecimal.compareTo(bigDecimal3) > 0 ? h8x.s(ctf0Var, bigDecimal3.doubleValue(), str) : h8x.r(false, bigDecimal2.doubleValue(), str, bigDecimal3.doubleValue());
            } else {
                ank0VarS = h8x.u(ctf0Var, bigDecimal2.doubleValue(), str);
            }
            pd7 pd7Var = new pd7(z, plainString, ank0VarS, bigDecimal.compareTo(bigDecimal2) >= 0 && bigDecimal.compareTo(bigDecimal3) <= 0 && !z, ((bigDecimal.compareTo(bigDecimal2) >= 0 && bigDecimal.compareTo(bigDecimal3) <= 0) || bigDecimal.compareTo(new BigDecimal(String.valueOf(-1.0d))) == 0 || z) ? false : true);
            ryj0Var.j = 1;
            if (kmqVar.a(pd7Var, ryj0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object m(yje yjeVar, Object obj) {
        ojl0 ojl0Var;
        if (yjeVar instanceof ojl0) {
            ojl0Var = (ojl0) yjeVar;
            int i = ojl0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ojl0Var.j = i - Integer.MIN_VALUE;
            } else {
                ojl0Var = new ojl0(this, yjeVar);
            }
        } else {
            ojl0Var = new ojl0(this, yjeVar);
        }
        Object obj2 = ojl0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ojl0Var.j;
        if (i2 == 0) {
            z1x.P(obj2);
            kmq kmqVar = (kmq) this.b;
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(k9x.W((h5l0) it.next(), ((sjl0) this.c).b));
            }
            ojl0Var.j = 1;
            if (kmqVar.a(arrayList, ojl0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
        }
        return Unit.f46060a;
    }

    private final Object n(yje yjeVar, Object obj) {
        Object value;
        Object value2;
        lsl0 lsl0Var;
        Object value3;
        Object value4;
        List listA0 = (List) obj;
        String str = (String) this.c;
        boolean zIsEmpty = listA0.isEmpty();
        vsl0 vsl0Var = (vsl0) this.b;
        vzg0 vzg0Var = vsl0Var.o;
        oyg0 oyg0Var = vsl0Var.f;
        ocj ocjVar = vsl0Var.i;
        if (zIsEmpty) {
            int i = vsl0.F;
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value4 = p7m0Var.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value4, lsl0.a((lsl0) value4, null, null, false, false, false, false, true, null, iun.f15405a, 5631)));
        } else if (((lsl0) vsl0Var.D()).k.isEmpty() && str.length() == 0) {
            long[] jArr = (long[]) vzg0Var.a("SAVED_STATE_ITEMS_ORDER_LIST");
            if (jArr != null) {
                if (!(jArr.length == 0)) {
                    listA0 = CollectionsKt.A0(listA0, new mto(jArr, (byte) 8));
                    vzg0Var.e("SAVED_STATE_ITEMS_ORDER_LIST", null);
                }
            }
            List list = listA0;
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, lsl0.a((lsl0) value3, null, null, false, false, false, false, false, list, list, 4607)));
        } else if (str.length() == 0) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                lsl0Var = (lsl0) value2;
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value2, lsl0.a(lsl0Var, null, null, false, false, false, false, false, null, lsl0Var.k, 5631)));
        } else {
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value = p7m0Var4.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value, lsl0.a((lsl0) value, null, null, false, false, false, false, false, null, listA0, 5631)));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object o(yje yjeVar, Object obj) {
        usl0 usl0Var;
        boolean z;
        ArrayList arrayList;
        vsl0 vsl0Var = (vsl0) this.c;
        if (yjeVar instanceof usl0) {
            usl0Var = (usl0) yjeVar;
            int i = usl0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                usl0Var.j = i - Integer.MIN_VALUE;
            } else {
                usl0Var = new usl0(this, yjeVar);
            }
        } else {
            usl0Var = new usl0(this, yjeVar);
        }
        Object obj2 = usl0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = usl0Var.j;
        if (i2 == 0) {
            z1x.P(obj2);
            kmq kmqVar = (kmq) this.b;
            List<jkp> list = (List) obj;
            int i3 = vsl0.F;
            long[] jArrM = vsl0Var.M();
            if (jArrM == null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (((jkp) obj3).e) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    axq.t(((jkp) it.next()).f16682a, arrayList3);
                }
                long[] jArrM0 = CollectionsKt.M0(arrayList3);
                vsl0Var.o.e("SAVED_STATE_CHECKED_SPORT_IDS_LIST", jArrM0);
                z = jArrM0.length < ((lsl0) vsl0Var.D()).h;
                arrayList = new ArrayList(r3d.q(list, 10));
                for (jkp jkpVar : list) {
                    int i4 = vsl0.F;
                    arrayList.add(zdx.P(jkpVar, z));
                }
            } else {
                z = jArrM.length < ((lsl0) vsl0Var.D()).h;
                ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
                for (jkp jkpVar2 : list) {
                    jkpVar2.e = tx3.x(jArrM, jkpVar2.f16682a);
                    int i5 = vsl0.F;
                    arrayList4.add(zdx.P(jkpVar2, z));
                }
                arrayList = arrayList4;
            }
            usl0Var.j = 1;
            if (kmqVar.a(arrayList, usl0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object p(yje yjeVar, Object obj) {
        a9n0 a9n0Var;
        if (yjeVar instanceof a9n0) {
            a9n0Var = (a9n0) yjeVar;
            int i = a9n0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                a9n0Var.j = i - Integer.MIN_VALUE;
            } else {
                a9n0Var = new a9n0(this, yjeVar);
            }
        } else {
            a9n0Var = new a9n0(this, yjeVar);
        }
        Object obj2 = a9n0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = a9n0Var.j;
        if (i2 == 0) {
            z1x.P(obj2);
            kmq kmqVar = (kmq) this.b;
            String strGroup = (String) obj;
            Matcher matcher = ((Pattern) ((yuu) this.c).d).matcher(strGroup);
            if (matcher.find()) {
                strGroup = matcher.group();
            }
            a9n0Var.j = 1;
            if (kmqVar.a(strGroup, a9n0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0299  */
    /* JADX WARN: Code duplicated, block: B:243:0x0505  */
    /* JADX WARN: Code duplicated, block: B:246:0x050f  */
    /* JADX WARN: Code duplicated, block: B:248:0x0512  */
    /* JADX WARN: Code duplicated, block: B:250:0x0515  */
    /* JADX WARN: Code duplicated, block: B:252:0x0518  */
    /* JADX WARN: Code duplicated, block: B:254:0x051b  */
    /* JADX WARN: Code duplicated, block: B:256:0x0520  */
    /* JADX WARN: Code duplicated, block: B:257:0x0525  */
    /* JADX WARN: Code duplicated, block: B:258:0x0528  */
    /* JADX WARN: Code duplicated, block: B:259:0x052b  */
    /* JADX WARN: Code duplicated, block: B:260:0x052e  */
    /* JADX WARN: Code duplicated, block: B:264:0x055c  */
    /* JADX WARN: Code duplicated, block: B:267:0x0572  */
    /* JADX WARN: Code duplicated, block: B:269:0x058d  */
    /* JADX WARN: Code duplicated, block: B:270:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:271:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:273:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:274:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:276:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:278:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:280:0x0606  */
    /* JADX WARN: Code duplicated, block: B:282:0x0617  */
    /* JADX WARN: Code duplicated, block: B:283:0x0630  */
    /* JADX WARN: Code duplicated, block: B:284:0x0649  */
    /* JADX WARN: Code duplicated, block: B:288:0x069c  */
    /* JADX WARN: Code duplicated, block: B:308:0x0746 A[LOOP:7: B:306:0x0740->B:308:0x0746, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:310:0x0758  */
    /* JADX WARN: Code duplicated, block: B:311:0x075d  */
    /* JADX WARN: Code duplicated, block: B:313:0x0761  */
    /* JADX WARN: Code duplicated, block: B:314:0x0766  */
    /* JADX WARN: Code duplicated, block: B:316:0x076a  */
    /* JADX WARN: Code duplicated, block: B:317:0x076d  */
    /* JADX WARN: Code duplicated, block: B:319:0x0770  */
    /* JADX WARN: Code duplicated, block: B:321:0x0779  */
    /* JADX WARN: Code duplicated, block: B:332:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:348:0x080c  */
    /* JADX WARN: Code duplicated, block: B:470:0x0a52  */
    /* JADX WARN: Code duplicated, block: B:487:0x0aa3  */
    /* JADX WARN: Code duplicated, block: B:527:0x0bca  */
    /* JADX WARN: Code duplicated, block: B:569:0x0c86  */
    /* JADX WARN: Code duplicated, block: B:632:0x0d77  */
    /* JADX WARN: Code duplicated, block: B:654:0x056d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01a8  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v27 java.lang.Object, still in use, count: 2, list:
          (r7v27 java.lang.Object) from 0x070f: PHI (r7 I:??) = (r7v21 java.lang.Object), (r7v27 java.lang.Object) binds: [B:304:0x070e, B:657:0x070f] A[DONT_GENERATE, DONT_INLINE]
          (r7v27 java.lang.Object) from 0x0705: CHECK_CAST (a.lok0) (r7v27 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // a.kmq
    public final java.lang.Object a(java.lang.Object r48, a.yje r49) {
        /*
            Method dump skipped, instruction units count: 3554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r980.a(java.lang.Object, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x032b  */
    /* JADX WARN: Code duplicated, block: B:101:0x032f  */
    /* JADX WARN: Code duplicated, block: B:104:0x034f  */
    /* JADX WARN: Code duplicated, block: B:110:0x037f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0385  */
    /* JADX WARN: Code duplicated, block: B:120:0x03b3 A[PHI: r3 r6 r7
  0x03b3: PHI (r3v50 a.vne) = (r3v45 a.vne), (r3v51 a.vne), (r3v51 a.vne) binds: [B:112:0x0383, B:118:0x03ae, B:119:0x03b0] A[DONT_GENERATE, DONT_INLINE]
  0x03b3: PHI (r6v50 a.qi80) = (r6v45 a.qi80), (r6v52 a.qi80), (r6v52 a.qi80) binds: [B:112:0x0383, B:118:0x03ae, B:119:0x03b0] A[DONT_GENERATE, DONT_INLINE]
  0x03b3: PHI (r7v43 a.dp00) = (r7v40 a.dp00), (r7v45 a.dp00), (r7v45 a.dp00) binds: [B:112:0x0383, B:118:0x03ae, B:119:0x03b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:133:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:136:0x03e9 A[Catch: all -> 0x008a, PHI: r0 r3 r6 r7 r12
  0x03e9: PHI (r0v48 a.ri80) = (r0v43 a.ri80), (r0v53 a.ri80) binds: [B:134:0x03e5, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE]
  0x03e9: PHI (r3v54 a.gp00) = (r3v49 a.gp00), (r3v56 a.gp00) binds: [B:134:0x03e5, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE]
  0x03e9: PHI (r6v55 a.vne) = (r6v49 a.vne), (r6v58 a.vne) binds: [B:134:0x03e5, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE]
  0x03e9: PHI (r7v48 a.qi80) = (r7v42 a.qi80), (r7v51 a.qi80) binds: [B:134:0x03e5, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE]
  0x03e9: PHI (r12v62 a.i050) = (r12v57 a.i050), (r12v64 a.i050) binds: [B:134:0x03e5, B:20:0x008d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x008a, blocks: (B:16:0x0084, B:136:0x03e9), top: B:178:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0401  */
    /* JADX WARN: Code duplicated, block: B:142:0x0412  */
    /* JADX WARN: Code duplicated, block: B:143:0x0416  */
    /* JADX WARN: Code duplicated, block: B:146:0x0433  */
    /* JADX WARN: Code duplicated, block: B:152:0x045f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0465  */
    /* JADX WARN: Code duplicated, block: B:158:0x047c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0491  */
    /* JADX WARN: Code duplicated, block: B:55:0x0234  */
    /* JADX WARN: Code duplicated, block: B:58:0x0240  */
    /* JADX WARN: Code duplicated, block: B:59:0x0245  */
    /* JADX WARN: Code duplicated, block: B:62:0x0264  */
    /* JADX WARN: Code duplicated, block: B:68:0x0295  */
    /* JADX WARN: Code duplicated, block: B:71:0x029c  */
    /* JADX WARN: Code duplicated, block: B:78:0x02c9 A[PHI: r3 r6 r7
  0x02c9: PHI (r3v28 a.vne) = (r3v23 a.vne), (r3v29 a.vne), (r3v29 a.vne) binds: [B:70:0x029a, B:76:0x02c4, B:77:0x02c6] A[DONT_GENERATE, DONT_INLINE]
  0x02c9: PHI (r6v27 a.qi80) = (r6v22 a.qi80), (r6v29 a.qi80), (r6v29 a.qi80) binds: [B:70:0x029a, B:76:0x02c4, B:77:0x02c6] A[DONT_GENERATE, DONT_INLINE]
  0x02c9: PHI (r7v25 a.dp00) = (r7v18 a.dp00), (r7v26 a.dp00), (r7v26 a.dp00) binds: [B:70:0x029a, B:76:0x02c4, B:77:0x02c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:87:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:90:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:93:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:97:0x031a  */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x039b, code lost:
    
        if (r12.d(r1) == r2) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02b1, code lost:
    
        if (r12.d(r1) == r2) goto L157;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [a.r980] */
    /* JADX WARN: Type inference failed for: r12v1, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r12v15, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r12v2, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r12v3, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r12v39, types: [int[]] */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v66, types: [int[]] */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v90 */
    /* JADX WARN: Type inference failed for: r12v91 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(a.yje r13) {
        /*
            Method dump skipped, instruction units count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r980.b(a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object c(List list, yje yjeVar) {
        oqm0 oqm0Var;
        rqm0 rqm0Var = (rqm0) this.b;
        if (yjeVar instanceof oqm0) {
            oqm0Var = (oqm0) yjeVar;
            int i = oqm0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                oqm0Var.k = i - Integer.MIN_VALUE;
            } else {
                oqm0Var = new oqm0(this, yjeVar);
            }
        } else {
            oqm0Var = new oqm0(this, yjeVar);
        }
        Object objA = oqm0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = oqm0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            if (list.isEmpty()) {
                n2u n2uVar = rqm0Var.d;
                List listC = kotlin.collections.a.c(new Integer(46));
                oqm0Var.k = 1;
                objA = n2uVar.a(listC, oqm0Var);
                if (objA == wneVar) {
                    return wneVar;
                }
            }
            rqm0Var.y(dqm0.G(list, (List) this.c));
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        list = (List) objA;
        rqm0Var.y(dqm0.G(list, (List) this.c));
        return Unit.f46060a;
    }
}
