package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class dn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xzp f6343a;
    public final j51 b;
    public final xk0 c;
    public final knf0 d;
    public final x2c0 e;
    public final btt0 f;

    public dn0(xzp xzpVar, j51 j51Var, xk0 xk0Var, knf0 knf0Var, x2c0 x2c0Var, btt0 btt0Var) {
        j51Var.getClass();
        xk0Var.getClass();
        knf0Var.getClass();
        x2c0Var.getClass();
        btt0Var.getClass();
        this.f6343a = xzpVar;
        this.b = j51Var;
        this.c = xk0Var;
        this.d = knf0Var;
        this.e = x2c0Var;
        this.f = btt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(mlr mlrVar, int i, lu0 lu0Var, yje yjeVar) {
        em0 em0Var;
        if (yjeVar instanceof em0) {
            em0Var = (em0) yjeVar;
            int i2 = em0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                em0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                em0Var = new em0(this, yjeVar);
            }
        } else {
            em0Var = new em0(this, yjeVar);
        }
        Object obj = em0Var.i;
        wne wneVar = wne.f39444a;
        int i3 = em0Var.k;
        if (i3 == 0) {
            z1x.P(obj);
            xk0 xk0Var = this.c;
            if (xk0Var.d.size() >= 999) {
                throw new jfp();
            }
            if (xk0Var.g) {
                return Unit.f46060a;
            }
            pjf0 pjf0Var = new pjf0(this, mlrVar, i, lu0Var, null);
            em0Var.k = 1;
            if (d5c.J(em0Var, pjf0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (kotlin.Unit.f46060a == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(a.a7p r7, int r8, a.zje r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof a.hm0
            if (r0 == 0) goto L13
            r0 = r9
            a.hm0 r0 = (a.hm0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.hm0 r0 = new a.hm0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r9)
            goto L79
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L31:
            short r8 = r0.i
            a.z1x.P(r9)
            goto L63
        L37:
            a.z1x.P(r9)
            a.btt0 r9 = r6.f
            java.lang.String r9 = r9.a()
            int r7 = r7.ordinal()
            if (r7 == 0) goto L54
            if (r7 == r5) goto L51
            if (r7 != r4) goto L4d
            a.c7p r7 = a.c7p.d
            goto L56
        L4d:
            a.t9f.b()
            return r3
        L51:
            a.c7p r7 = a.c7p.c
            goto L56
        L54:
            a.c7p r7 = a.c7p.b
        L56:
            r0.i = r8
            r0.l = r5
            a.xzp r2 = r6.f6343a
            java.lang.Object r7 = r2.k(r9, r7, r8, r0)
            if (r7 != r1) goto L63
            goto L78
        L63:
            r0.i = r8
            r0.l = r4
            a.xk0 r6 = r6.c
            java.util.concurrent.CopyOnWriteArrayList r7 = r6.d
            r7.clear()
            r6.c()
            r7 = 0
            r6.f41010a = r7
            kotlin.Unit r6 = kotlin.Unit.f46060a
            if (r6 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dn0.b(a.a7p, int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zje zjeVar) {
        im0 im0Var;
        if (zjeVar instanceof im0) {
            im0Var = (im0) zjeVar;
            int i = im0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                im0Var.k = i - Integer.MIN_VALUE;
            } else {
                im0Var = new im0(this, zjeVar);
            }
        } else {
            im0Var = new im0(this, zjeVar);
        }
        Object obj = im0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = im0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            String strA = this.f.a();
            String strA2 = this.d.a();
            im0Var.k = 1;
            if (this.f6343a.l(strA, strA2, im0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        this.b.b = true;
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0183  */
    /* JADX WARN: Code duplicated, block: B:63:0x0198 A[LOOP:0: B:61:0x0192->B:63:0x0198, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b1, code lost:
    
        if (r0 == r7) goto L56;
     */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Set r23, boolean r24, java.lang.String r25, boolean r26, boolean r27, a.zje r28) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dn0.d(java.util.Set, boolean, java.lang.String, boolean, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:49:0x010d A[LOOP:0: B:47:0x0107->B:49:0x010d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x011d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0120  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r0 == r3) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r23, java.util.List r25, int r26, boolean r27, java.lang.String r28, java.lang.String r29, boolean r30, a.zje r31) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dn0.e(long, java.util.List, int, boolean, java.lang.String, java.lang.String, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable f(jo20 jo20Var, String str, String str2, boolean z, zje zjeVar) {
        om0 om0Var;
        if (zjeVar instanceof om0) {
            om0Var = (om0) zjeVar;
            int i = om0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                om0Var.l = i - Integer.MIN_VALUE;
            } else {
                om0Var = new om0(this, zjeVar);
            }
        } else {
            om0Var = new om0(this, zjeVar);
        }
        Object objG = om0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = om0Var.l;
        ArrayList arrayList = null;
        if (i2 == 0) {
            z1x.P(objG);
            om0Var.i = str;
            om0Var.l = 1;
            objG = ((bx0) ((il1) this.f6343a.d).invoke()).g(jo20Var, str2, new fk9(z), om0Var);
            if (objG == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = om0Var.i;
            z1x.P(objG);
        }
        List list = ((ty0) ((dx5) objG).a()).f34728a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(saj.h0((bw0) it.next(), str));
            }
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable g(edy edyVar, String str, String str2, zje zjeVar) {
        pm0 pm0Var;
        if (zjeVar instanceof pm0) {
            pm0Var = (pm0) zjeVar;
            int i = pm0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                pm0Var.l = i - Integer.MIN_VALUE;
            } else {
                pm0Var = new pm0(this, zjeVar);
            }
        } else {
            pm0Var = new pm0(this, zjeVar);
        }
        Object objW = pm0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = pm0Var.l;
        ArrayList arrayList = null;
        if (i2 == 0) {
            z1x.P(objW);
            pm0Var.i = str;
            pm0Var.l = 1;
            objW = this.f6343a.W(edyVar, str2, pm0Var);
            if (objW == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = pm0Var.i;
            z1x.P(objW);
        }
        List list = ((ty0) ((dx5) objW).a()).f34728a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(saj.h0((bw0) it.next(), str));
            }
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:50:0x0119 A[LOOP:0: B:48:0x0113->B:50:0x0119, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0127  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
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
    public final Object h(int i, long j, zje zjeVar, String str, boolean z, boolean z2) {
        qm0 qm0Var;
        String str2;
        Object g0g0Var;
        List list;
        List list2;
        ArrayList arrayList;
        Iterator it;
        if (zjeVar instanceof qm0) {
            qm0Var = (qm0) zjeVar;
            int i2 = qm0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qm0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                qm0Var = new qm0(this, zjeVar);
            }
        } else {
            qm0Var = new qm0(this, zjeVar);
        }
        qm0 qm0Var2 = qm0Var;
        Object objA = qm0Var2.j;
        wne wneVar = wne.f39444a;
        int i3 = qm0Var2.l;
        if (i3 == 0) {
            z1x.P(objA);
            if (z2) {
                jo20 jo20VarK = cwr0.K(0, i, kotlin.collections.a.c(String.valueOf(j)), null, cs0.u(nw80.f24223a.getId()), null, null, null, null, null, Boolean.valueOf(z), null, null, 30696);
                try {
                    e0g0 e0g0Var = j0g0.b;
                    g0g0Var = this.f.a();
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = null;
                }
                String str3 = (String) g0g0Var;
                if (str3 == null || str3.length() <= 0) {
                    str3 = null;
                }
                qm0Var2.i = null;
                qm0Var2.l = 1;
                objA = f(jo20VarK, str, str3, false, qm0Var2);
                if (objA == wneVar) {
                    return wneVar;
                }
                list = (List) objA;
            } else {
                knf0 knf0Var = this.d;
                int iB = knf0Var.b();
                String strC = knf0Var.c();
                long id = nw80.f24223a.getId();
                m2c0 m2c0VarA = this.e.a();
                Integer intOrNull = m2c0VarA != null ? StringsKt.toIntOrNull(m2c0VarA.c) : null;
                List listC = kotlin.collections.a.c(String.valueOf(j));
                iun iunVar = iun.f15405a;
                qm0Var2.i = str;
                qm0Var2.l = 2;
                objA = this.f6343a.A(id, intOrNull, "", listC, iunVar, "", iB, false, 0, i, z, strC, qm0Var2);
                if (objA == wneVar) {
                    return wneVar;
                }
                str2 = str;
                list2 = ((bt0) ((dx5) objA).a()).f3158a;
                if (list2 != null) {
                    arrayList = new ArrayList(r3d.q(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(saj.g0((ys0) it.next(), str2));
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    list = iun.f15405a;
                } else {
                    list = arrayList;
                }
            }
        } else if (i3 == 1) {
            z1x.P(objA);
            list = (List) objA;
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = qm0Var2.i;
            z1x.P(objA);
            list2 = ((bt0) ((dx5) objA).a()).f3158a;
            if (list2 != null) {
                arrayList = new ArrayList(r3d.q(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(saj.g0((ys0) it.next(), str2));
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                list = iun.f15405a;
            } else {
                list = arrayList;
            }
        }
        this.b.a(list);
        return list;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:100|234|101|(3:238|103|104)(2:109|110)|105|228|111|(2:113|114)(1:117)|118|(2:242|120)(1:121)|(1:127)|126|128|129|224|130|131|214|132|133|230|134|135|(1:138)) */
    /* JADX WARN: Can't wrap try/catch for region: R(26:(3:236|28|(2:246|35))(2:246|35)|31|(3:(30:226|38|39|206|40|(0)|43|232|50|(1:52)(1:53)|54|222|55|56|218|57|212|61|(1:63)|64|(3:210|66|(1:69))(1:69)|72|73|240|74|75|220|76|77|(1:80))(1:48)|218|57)|49|43|232|50|(1:52)(1:53)|54|222|55|56|212|61|(1:63)|64|(3:210|66|(1:69))(1:69)|72|73|240|74|75|220|76|77|(1:80)) */
    /* JADX WARN: Can't wrap try/catch for region: R(28:(3:236|28|(2:246|35))(2:246|35)|31|(30:226|38|39|206|40|(0)|43|232|50|(1:52)(1:53)|54|222|55|56|218|57|212|61|(1:63)|64|(3:210|66|(1:69))(1:69)|72|73|240|74|75|220|76|77|(1:80))(1:48)|49|43|232|50|(1:52)(1:53)|54|222|55|56|218|57|212|61|(1:63)|64|(3:210|66|(1:69))(1:69)|72|73|240|74|75|220|76|77|(1:80)) */
    /* JADX WARN: Can't wrap try/catch for region: R(2:242|120) */
    /* JADX WARN: Can't wrap try/catch for region: R(2:246|35) */
    /* JADX WARN: Can't wrap try/catch for region: R(30:226|38|39|206|40|(0)|43|232|50|(1:52)(1:53)|54|222|55|56|218|57|212|61|(1:63)|64|(3:210|66|(1:69))(1:69)|72|73|240|74|75|220|76|77|(1:80)) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:210|66|(1:69)) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:236|28|(2:246|35)) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:238|103|104) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:13|201|248|25|(28:(3:236|28|(2:246|35))(2:246|35)|31|(30:226|38|39|206|40|(0)|43|232|50|(1:52)(1:53)|54|222|55|56|218|57|212|61|(1:63)|64|(3:210|66|(1:69))(1:69)|72|73|240|74|75|220|76|77|(1:80))(1:48)|49|43|232|50|(1:52)(1:53)|54|222|55|56|218|57|212|61|(1:63)|64|(3:210|66|(1:69))(1:69)|72|73|240|74|75|220|76|77|(1:80))(24:100|234|101|(3:238|103|104)(2:109|110)|105|228|111|(2:113|114)(1:117)|118|(2:242|120)(1:121)|(1:127)|126|128|129|224|130|131|214|132|133|230|134|135|(1:138))|199) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:(6:13|201|248|25|(28:(3:236|28|(2:246|35))(2:246|35)|31|(30:226|38|39|206|40|(0)|43|232|50|(1:52)(1:53)|54|222|55|56|218|57|212|61|(1:63)|64|(3:210|66|(1:69))(1:69)|72|73|240|74|75|220|76|77|(1:80))(1:48)|49|43|232|50|(1:52)(1:53)|54|222|55|56|218|57|212|61|(1:63)|64|(3:210|66|(1:69))(1:69)|72|73|240|74|75|220|76|77|(1:80))(24:100|234|101|(3:238|103|104)(2:109|110)|105|228|111|(2:113|114)(1:117)|118|(2:242|120)(1:121)|(1:127)|126|128|129|224|130|131|214|132|133|230|134|135|(1:138))|199)(2:14|15))(3:16|17|18)|244|139|(4:141|(2:144|142)|250|147)(1:148)|(1:150)|151|152|203|204) */
    /* JADX WARN: Code duplicated, block: B:100:0x0206  */
    /* JADX WARN: Code duplicated, block: B:109:0x0247  */
    /* JADX WARN: Code duplicated, block: B:113:0x0258  */
    /* JADX WARN: Code duplicated, block: B:117:0x025f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0272  */
    /* JADX WARN: Code duplicated, block: B:123:0x0276 A[Catch: all -> 0x025d, TRY_LEAVE, TryCatch #18 {all -> 0x025d, blocks: (B:120:0x0269, B:123:0x0276), top: B:242:0x0269 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0288 A[Catch: all -> 0x0330, TRY_ENTER, TryCatch #11 {all -> 0x0330, blocks: (B:111:0x0252, B:118:0x0261, B:128:0x028b, B:127:0x0288, B:110:0x024b), top: B:228:0x0252 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:141:0x02dc A[Catch: all -> 0x02ff, TryCatch #19 {all -> 0x02ff, blocks: (B:139:0x02d0, B:141:0x02dc, B:142:0x02eb, B:144:0x02f1, B:150:0x030a), top: B:244:0x02d0 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x02f1 A[Catch: all -> 0x02ff, LOOP:0: B:142:0x02eb->B:144:0x02f1, LOOP_END, TryCatch #19 {all -> 0x02ff, blocks: (B:139:0x02d0, B:141:0x02dc, B:142:0x02eb, B:144:0x02f1, B:150:0x030a), top: B:244:0x02d0 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0306  */
    /* JADX WARN: Code duplicated, block: B:150:0x030a A[Catch: all -> 0x02ff, TRY_LEAVE, TryCatch #19 {all -> 0x02ff, blocks: (B:139:0x02d0, B:141:0x02dc, B:142:0x02eb, B:144:0x02f1, B:150:0x030a), top: B:244:0x02d0 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x034f  */
    /* JADX WARN: Code duplicated, block: B:174:0x035c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0361  */
    /* JADX WARN: Code duplicated, block: B:187:0x0377  */
    /* JADX WARN: Code duplicated, block: B:189:0x037a  */
    /* JADX WARN: Code duplicated, block: B:210:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x022c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x0269 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0112  */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:63:0x0153  */
    /* JADX WARN: Code duplicated, block: B:69:0x0160  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ad  */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0238, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0239, code lost:
    
        r33 = r13;
        r34 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x023d, code lost:
    
        r1 = r2;
        r2 = r33;
        r4 = r34;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x025d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ff, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0300, code lost:
    
        r14 = r5;
        r15 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0312, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0313, code lost:
    
        r18 = r9;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0315, code lost:
    
        r9 = r5;
        r7 = r7;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0318, code lost:
    
        r4 = r8;
        r2 = r13;
        r10 = r18;
        r1 = r31;
        r13 = r6;
        r6 = r11;
        r11 = r7;
        r7 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0324, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0325, code lost:
    
        r31 = r2;
        r18 = r9;
        r29 = r10;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x032c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x032d, code lost:
    
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0330, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0331, code lost:
    
        r13 = r13;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0336, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0337, code lost:
    
        r31 = r2;
        r18 = r9;
        r29 = r10;
        r8 = r14;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x033f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0340, code lost:
    
        r29 = r10;
        r31 = r12;
        r8 = r14;
        r18 = r28;
        r12 = r7;
        r7 = r2;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x035a, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0369, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x036b, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0370, code lost:
    
        if (r5.f != false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0377, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x037a, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0380, code lost:
    
        if (a.hic.C(r0) == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0383, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0385, code lost:
    
        if (r2 > 3) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x038a, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r2, "error (", "): ", r0));
        r1.i = r15;
        r1.j = r14;
        r1.k = r13;
        r1.l = r12;
        r1.m = r11;
        r1.n = r10;
        r1.q = r9;
        r1.r = r7;
        r1.s = r6;
        r1.o = r4;
        r1.p = r2;
        r1.v = 3;
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03b7, code lost:
    
        if (a.qcc.O(3000, r1) != r3) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03ba, code lost:
    
        r9 = r13;
        r13 = r2;
        r2 = r11;
        r11 = r6;
        r6 = r9;
        r9 = r14;
        r14 = r4;
        r4 = r9;
        r9 = r5;
        r28 = r10;
        r10 = r7;
        r7 = r12;
        r12 = r1;
        r1 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03cd, code lost:
    
        r1 = a.j0g0.b;
        r0 = new a.g0g0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        r6 = r11 == true ? 1 : 0;
        r4 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00df, code lost:
    
        r15 = r1;
        r1 = r12;
        r12 = r7;
        r7 = r10;
        r10 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0102, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        r6 = r11 == true ? 1 : 0;
        r4 = r14;
        r9 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010f, code lost:
    
        r39 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0163, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0164, code lost:
    
        r15 = r11;
        r11 = r2;
        r2 = r13;
        r13 = r6;
        r6 = r15 == true ? 1 : 0;
        r15 = r14;
        r14 = r4;
        r4 = r15;
        r15 = r1;
        r1 = r12;
        r12 = r7;
        r7 = r10;
        r10 = r9;
        r9 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c8, code lost:
    
        r7 = r33;
        r12 = r35;
        r2 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ce, code lost:
    
        r4 = r14;
        r1 = r2;
        r2 = r13;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d6, code lost:
    
        r11 = r7;
        r7 = r10;
        r10 = r9;
        r9 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01dc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01dd, code lost:
    
        r5 = r7;
        r7 = r2;
        r2 = r12;
        r12 = r5;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e4, code lost:
    
        r5 = r7;
        r7 = r2;
        r2 = r12;
        r12 = r5;
        r5 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01eb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ec, code lost:
    
        r5 = r7;
        r7 = r2;
        r2 = r12;
        r12 = r5;
        r5 = r39;
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f6, code lost:
    
        r12 = r7;
        r5 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01fc, code lost:
    
        r9 = r28;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ff, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0200, code lost:
    
        r12 = r7;
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v2, types: [a.dn0] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [int] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v6, types: [int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [a.dn0] */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v6, types: [a.dn0] */
    /* JADX WARN: Type inference failed for: r36v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v10, types: [a.dn0] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:200:0x03ba -> B:201:0x03c9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Integer r34, java.lang.Long r35, java.lang.String r36, int r37, java.lang.String r38, boolean r39, boolean r40, boolean r41, a.zje r42) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dn0.i(java.lang.Integer, java.lang.Long, java.lang.String, int, java.lang.String, boolean, boolean, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object j(String str, zje zjeVar) {
        sm0 sm0Var;
        Object g0g0Var;
        if (zjeVar instanceof sm0) {
            sm0Var = (sm0) zjeVar;
            int i = sm0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                sm0Var.k = i - Integer.MIN_VALUE;
            } else {
                sm0Var = new sm0(this, zjeVar);
            }
        } else {
            sm0Var = new sm0(this, zjeVar);
        }
        sm0 sm0Var2 = sm0Var;
        Object objF = sm0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = sm0Var2.k;
        j51 j51Var = this.b;
        String str2 = null;
        if (i2 == 0) {
            z1x.P(objF);
            boolean z = j51Var.b;
            jo20 jo20VarK = cwr0.K(0, 0, kotlin.collections.a.c("847"), null, null, null, null, null, null, null, null, null, null, 32760);
            try {
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = this.f.a();
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            if (g0g0Var instanceof g0g0) {
                g0g0Var = null;
            }
            String str3 = (String) g0g0Var;
            if (str3 != null && str3.length() > 0) {
                str2 = str3;
            }
            sm0Var2.k = 1;
            objF = f(jo20VarK, str, str2, z, sm0Var2);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objF);
        }
        j51Var.b = false;
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        if (r0 == r7) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0103, code lost:
    
        if (r0 == r7) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(int r25, long r26, a.zje r28, java.lang.String r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dn0.k(int, long, a.zje, java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        if (r0 == r7) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010d, code lost:
    
        if (r0 == r7) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(int r25, long r26, a.zje r28, java.lang.String r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dn0.l(int, long, a.zje, java.lang.String, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r1 == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        if (r1 == r6) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(a.zje r24, java.lang.String r25, boolean r26, boolean r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r1 instanceof a.vm0
            if (r2 == 0) goto L18
            r2 = r1
            a.vm0 r2 = (a.vm0) r2
            int r3 = r2.k
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.k = r3
        L16:
            r5 = r2
            goto L1e
        L18:
            a.vm0 r2 = new a.vm0
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r5.i
            a.wne r6 = a.wne.f39444a
            int r2 = r5.k
            a.xk0 r7 = r0.c
            r3 = 2
            r8 = 1
            if (r2 == 0) goto L3d
            if (r2 == r8) goto L39
            if (r2 != r3) goto L32
            a.z1x.P(r1)
            goto L9b
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            r0 = 0
            return r0
        L39:
            a.z1x.P(r1)
            goto L7b
        L3d:
            a.z1x.P(r1)
            if (r26 != 0) goto L47
            r7.b = r8
            a.iun r0 = a.iun.f15405a
            return r0
        L47:
            a.btt0 r1 = r0.f
            java.lang.String r1 = r1.a()
            if (r27 == 0) goto L7e
            java.lang.String r2 = "825"
            java.util.List r11 = kotlin.collections.a.c(r2)
            r21 = 0
            r22 = 32760(0x7ff8, float:4.5907E-41)
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            a.jo20 r2 = a.cwr0.K(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r5.k = r8
            r4 = 0
            r3 = r1
            r1 = r2
            r2 = r25
            java.io.Serializable r1 = r0.f(r1, r2, r3, r4, r5)
            if (r1 != r6) goto L7b
            goto L9a
        L7b:
            java.util.List r1 = (java.util.List) r1
            goto L9d
        L7e:
            r9 = 825(0x339, double:4.076E-321)
            java.util.List r13 = a.cs0.u(r9)
            r16 = 0
            r17 = 4088(0xff8, float:5.729E-42)
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            a.edy r2 = a.phu0.C(r11, r12, r13, r14, r15, r16, r17)
            r5.k = r3
            r3 = r25
            java.io.Serializable r1 = r0.g(r2, r3, r1, r5)
            if (r1 != r6) goto L9b
        L9a:
            return r6
        L9b:
            java.util.List r1 = (java.util.List) r1
        L9d:
            r7.b = r8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dn0.m(a.zje, java.lang.String, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:(8:13|14|109|119|26|(7:129|28|127|32|(1:34)|35|(1:40)(1:39))(1:40)|(7:117|46|47|121|48|49|(1:52))(7:60|115|61|62|125|63|(1:66))|108)(2:15|16))(3:17|18|19)|123|67|68|111|112) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:117|46|47|121|48|49|(1:52)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:129|28|127|32|(1:34)|35|(1:40)(1:39)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:60|115|61|62|125|63|(1:66)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:13|14|109|119|26|(7:129|28|127|32|(1:34)|35|(1:40)(1:39))(1:40)|(7:117|46|47|121|48|49|(1:52))(7:60|115|61|62|125|63|(1:66))|108) */
    /* JADX WARN: Code duplicated, block: B:117:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x0100  */
    /* JADX WARN: Code duplicated, block: B:60:0x0119  */
    /* JADX WARN: Code duplicated, block: B:66:0x014f  */
    /* JADX WARN: Code duplicated, block: B:79:0x016d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x017a  */
    /* JADX WARN: Code duplicated, block: B:87:0x017f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0195  */
    /* JADX WARN: Code duplicated, block: B:98:0x0197  */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c7, code lost:
    
        if (a.qcc.O(3000, r1) == r3) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        r2 = r11;
        r13 = r1;
        r15 = r8;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
    
        r4 = r12;
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010b, code lost:
    
        r13 = r16;
        r1 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010f, code lost:
    
        r10 = r11;
        r11 = r2;
        r2 = r10;
        r15 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0115, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0116, code lost:
    
        r13 = r1;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015e, code lost:
    
        r2 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0163, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0164, code lost:
    
        r15 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0166, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0167, code lost:
    
        r13 = r1;
        r15 = r8;
        r1 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [a.dn0] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [a.dn0] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x01c7 -> B:14:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(a.zje r33, java.lang.String r34, boolean r35, boolean r36) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dn0.n(a.zje, java.lang.String, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:143|29|135|(6:137|31|35|(1:37)|38|(1:43)(1:42))(1:43)|46|47|145|48|49|(1:52)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:(7:13|14|127|147|27|(10:143|29|135|(6:137|31|35|(1:37)|38|(1:43)(1:42))(1:43)|46|47|145|48|49|(1:52))(9:61|141|62|63|149|64|(6:132|66|70|(1:72)|73|(1:78)(1:77))(1:78)|81|(1:84))|125)(2:15|16))(3:17|18|19)|139|85|86|129|130) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:13|14|127|147|27|(10:143|29|135|(6:137|31|35|(1:37)|38|(1:43)(1:42))(1:43)|46|47|145|48|49|(1:52))(9:61|141|62|63|149|64|(6:132|66|70|(1:72)|73|(1:78)(1:77))(1:78)|81|(1:84))|125) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:61|141|62|63|149|64|(6:132|66|70|(1:72)|73|(1:78)(1:77))(1:78)|81|(1:84)) */
    /* JADX WARN: Code duplicated, block: B:101:0x019f  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:115:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:132:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x011d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0151  */
    /* JADX WARN: Code duplicated, block: B:78:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x017b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0192  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d6, code lost:
    
        r7 = r11;
        r11 = r2;
        r2 = r7;
        r13 = r1;
        r7 = r4;
        r1 = r10;
        r4 = r12;
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010c, code lost:
    
        r13 = r16;
        r1 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0110, code lost:
    
        r2 = r11;
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0115, code lost:
    
        r4 = r12;
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
    
        r13 = r1;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0160, code lost:
    
        r2 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0187, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0189, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018c, code lost:
    
        r13 = r1;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x018e, code lost:
    
        r10 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0064: MOVE (r7 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r10 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:101), block:B:21:0x0064 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x01ef -> B:14:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(a.zje r30, java.lang.String r31, boolean r32, boolean r33) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dn0.o(a.zje, java.lang.String, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object p(mlr mlrVar, String str, boolean z, boolean z2, zje zjeVar) {
        ym0 ym0Var;
        mlr mlrVar2;
        if (zjeVar instanceof ym0) {
            ym0Var = (ym0) zjeVar;
            int i = ym0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ym0Var.l = i - Integer.MIN_VALUE;
            } else {
                ym0Var = new ym0(this, zjeVar);
            }
        } else {
            ym0Var = new ym0(this, zjeVar);
        }
        ym0 ym0Var2 = ym0Var;
        Object obj = ym0Var2.j;
        wne wneVar = wne.f39444a;
        int i2 = ym0Var2.l;
        xk0 xk0Var = this.c;
        boolean z3 = true;
        if (i2 == 0) {
            z1x.P(obj);
            ym0Var2.i = mlrVar;
            ym0Var2.l = 1;
            Object objA = xk0Var.a(new jm0(this, str, z, z2, null), ym0Var2);
            if (objA != wneVar) {
                objA = Unit.f46060a;
            }
            if (objA == wneVar) {
                return wneVar;
            }
            mlrVar2 = mlrVar;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mlr mlrVar3 = ym0Var2.i;
            z1x.P(obj);
            mlrVar2 = mlrVar3;
        }
        xk0Var.getClass();
        mlrVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = xk0Var.d;
        if (copyOnWriteArrayList.isEmpty()) {
            z3 = false;
        } else {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (((mlr) it.next()).f22006a == mlrVar2.f22006a) {
                }
            }
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object q(long j, int i, lu0 lu0Var, yje yjeVar) {
        zm0 zm0Var;
        if (yjeVar instanceof zm0) {
            zm0Var = (zm0) yjeVar;
            int i2 = zm0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zm0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                zm0Var = new zm0(this, yjeVar);
            }
        } else {
            zm0Var = new zm0(this, yjeVar);
        }
        zm0 zm0Var2 = zm0Var;
        Object obj = zm0Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = zm0Var2.k;
        if (i3 == 0) {
            z1x.P(obj);
            if (this.c.h) {
                return Unit.f46060a;
            }
            bn0 bn0Var = new bn0(this, j, i, lu0Var, null);
            zm0Var2.k = 1;
            if (d5c.J(zm0Var2, bn0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:167|28|(1:30)(1:31)|32|(1:34)(1:35)|36|37|(7:172|39|169|43|(1:45)|46|(2:48|(1:51))(1:51))(1:51)|192|54|55|174|56|57|(5:60|165|61|62|111)) */
    /* JADX WARN: Can't wrap try/catch for region: R(21:73|188|74|(1:76)(1:77)|78|190|79|80|(1:83)|84|186|85|86|176|(6:178|88|92|(1:94)|95|(2:97|(1:100))(1:100))(1:100)|184|104|105|182|106|(4:109|180|110|111)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:(2:13|196)(2:14|15))(3:16|17|18)|180|110|111|162|163) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:172|39)|169|43|(1:45)|46|(2:48|(1:51))(1:51)) */
    /* JADX WARN: Code duplicated, block: B:100:0x0203  */
    /* JADX WARN: Code duplicated, block: B:109:0x0236  */
    /* JADX WARN: Code duplicated, block: B:128:0x0267  */
    /* JADX WARN: Code duplicated, block: B:133:0x0274  */
    /* JADX WARN: Code duplicated, block: B:136:0x0279  */
    /* JADX WARN: Code duplicated, block: B:146:0x028f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0293  */
    /* JADX WARN: Code duplicated, block: B:167:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x01e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:45:0x0112  */
    /* JADX WARN: Code duplicated, block: B:48:0x0118 A[Catch: all -> 0x0122, TRY_LEAVE, TryCatch #2 {all -> 0x0122, blocks: (B:43:0x010d, B:46:0x0114, B:48:0x0118, B:42:0x0105, B:39:0x00fd), top: B:169:0x010d, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x011f  */
    /* JADX WARN: Code duplicated, block: B:60:0x016d  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fc A[Catch: all -> 0x0206, TRY_LEAVE, TryCatch #6 {all -> 0x0206, blocks: (B:92:0x01f1, B:95:0x01f8, B:97:0x01fc, B:91:0x01e9, B:88:0x01e1), top: B:176:0x01df, inners: #7 }] */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0206, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0207, code lost:
    
        r1 = r2;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x020b, code lost:
    
        r13 = r4;
        r4 = r14;
        r14 = r8;
        r31 = r6;
        r7 = r10;
        r6 = r11;
        r10 = r12;
        r11 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0249, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x024b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x024c, code lost:
    
        r1 = r2;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0250, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0253, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0254, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0257, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0258, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x025a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025b, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0122, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0123, code lost:
    
        r15 = r13;
        r13 = r2;
        r2 = r15 == true ? 1 : 0;
        r15 = r14;
        r14 = r4;
        r4 = r15;
        r5 = r1;
        r1 = r12;
        r32 = r10;
        r10 = r5;
        r33 = r6;
        r7 = r32;
        r6 = r11;
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0185, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0186, code lost:
    
        r4 = r35;
        r8 = r37;
        r2 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018c, code lost:
    
        r31 = r6;
        r6 = r11;
        r11 = r31;
        r7 = r10;
        r10 = r5;
        r5 = r1;
        r1 = r2;
        r2 = r13;
        r13 = r4;
        r4 = r14;
        r14 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x019e, code lost:
    
        r4 = r2;
        r2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a2, code lost:
    
        r5 = r18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0085: MOVE (r31 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:134), block:B:20:0x0085 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r11v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r13v10, types: [int] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [a.dn0] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [a.dn0] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r35v2, types: [a.dn0] */
    /* JADX WARN: Type inference failed for: r38v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24, types: [a.dn0] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(long r36, java.lang.String r38, int r39, java.lang.String r40, boolean r41, boolean r42, boolean r43, a.zje r44) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dn0.r(long, java.lang.String, int, java.lang.String, boolean, boolean, boolean, a.zje):java.lang.Object");
    }
}
