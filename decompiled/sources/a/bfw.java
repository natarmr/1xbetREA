package a;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes4.dex */
public final class bfw implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2525a = 0;
    public final boolean b;
    public final ctf0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final Object i;
    public final Object j;

    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    public bfw(lew lewVar, ctf0 ctf0Var, boolean z) {
        Cnew cnew;
        List list;
        Object obj;
        final byte b = 0;
        ctf0Var.getClass();
        this.c = ctf0Var;
        this.b = z;
        this.d = bkb.H(Long.valueOf(lewVar.f19925a));
        this.i = androidx.compose.runtime.e.e(new few(a()));
        tew tewVar = lewVar.b;
        j0g0 j0g0Var = tewVar.f33842a;
        if (j0g0Var != null) {
            Object obj2 = j0g0Var.f15681a;
            cnew = (Cnew) (obj2 instanceof g0g0 ? null : obj2);
        } else {
            cnew = null;
        }
        this.e = maz.b(new yw9(cnew, new Function1(this) { // from class: a.afw
            public final /* synthetic */ bfw b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x0097  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v15, types: [a.iun] */
            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Iterable, java.util.List] */
            /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r9v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r9v9, types: [a.iun] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v40 java.lang.Object, still in use, count: 2, list:
                  (r11v40 java.lang.Object) from 0x0094: PHI (r11 I:??) = (r11v37 java.lang.Object), (r11v40 java.lang.Object) binds: [B:28:0x0093, B:150:0x0094] A[DONT_GENERATE, DONT_INLINE]
                  (r11v40 java.lang.Object) from 0x008a: CHECK_CAST (a.vcw) (r11v40 java.lang.Object)
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
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r34) {
                /*
                    Method dump skipped, instruction units count: 890
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.afw.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        j0g0 j0g0Var2 = tewVar.b;
        if (j0g0Var2 != null) {
            Object obj3 = j0g0Var2.f15681a;
            list = (List) (obj3 instanceof g0g0 ? null : obj3);
        } else {
            list = null;
        }
        final byte b2 = 1;
        this.f = maz.b(new yw9(list, new Function1(this) { // from class: a.afw
            public final /* synthetic */ bfw b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x0097  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v15, types: [a.iun] */
            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Iterable, java.util.List] */
            /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r9v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r9v9, types: [a.iun] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v40 java.lang.Object, still in use, count: 2, list:
                  (r11v40 java.lang.Object) from 0x0094: PHI (r11 I:??) = (r11v37 java.lang.Object), (r11v40 java.lang.Object) binds: [B:28:0x0093, B:150:0x0094] A[DONT_GENERATE, DONT_INLINE]
                  (r11v40 java.lang.Object) from 0x008a: CHECK_CAST (a.vcw) (r11v40 java.lang.Object)
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
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r34) {
                /*
                    Method dump skipped, instruction units count: 890
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.afw.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        j0g0 j0g0Var3 = tewVar.f33842a;
        if (j0g0Var3 != null) {
            Object obj4 = j0g0Var3.f15681a;
            Cnew cnew2 = (Cnew) (obj4 instanceof g0g0 ? null : obj4);
            obj = (cnew2 == null || (obj = cnew2.b) == null) ? iun.f15405a : obj;
        }
        final byte b3 = 2;
        this.g = maz.b(new yw9(obj, new Function1(this) { // from class: a.afw
            public final /* synthetic */ bfw b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x0097  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v15, types: [a.iun] */
            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Iterable, java.util.List] */
            /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r9v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r9v9, types: [a.iun] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v40 java.lang.Object, still in use, count: 2, list:
                  (r11v40 java.lang.Object) from 0x0094: PHI (r11 I:??) = (r11v37 java.lang.Object), (r11v40 java.lang.Object) binds: [B:28:0x0093, B:150:0x0094] A[DONT_GENERATE, DONT_INLINE]
                  (r11v40 java.lang.Object) from 0x008a: CHECK_CAST (a.vcw) (r11v40 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r34) {
                /*
                    Method dump skipped, instruction units count: 890
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.afw.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        this.j = new wf60(ctf0Var.b.a(R.string.hltv_old_view_button_title, Arrays.copyOf(new Object[0], 0)));
        final byte b4 = 3;
        this.h = maz.b(new yw9(lewVar, new Function1(this) { // from class: a.afw
            public final /* synthetic */ bfw b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x0097  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v15, types: [a.iun] */
            /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Iterable, java.util.List] */
            /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r9v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r9v9, types: [a.iun] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v40 java.lang.Object, still in use, count: 2, list:
                  (r11v40 java.lang.Object) from 0x0094: PHI (r11 I:??) = (r11v37 java.lang.Object), (r11v40 java.lang.Object) binds: [B:28:0x0093, B:150:0x0094] A[DONT_GENERATE, DONT_INLINE]
                  (r11v40 java.lang.Object) from 0x008a: CHECK_CAST (a.vcw) (r11v40 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r34) {
                /*
                    Method dump skipped, instruction units count: 890
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.afw.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
    }

    public static eew a() {
        ldm ldmVar = ldm.b;
        xuz xuzVar = pb10.c;
        pb10 pb10VarK = ozb.K(46L);
        xuzVar.getClass();
        return new eew(new mdm(pb10VarK.f26683a, null, ldmVar, 0, 0, 0, 0, 0, 0L, 0L, 1018));
    }

    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0217 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0219  */
    /* JADX WARN: Code duplicated, block: B:92:0x021f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0221  */
    /* JADX WARN: Code duplicated, block: B:95:0x0225  */
    /* JADX WARN: Code duplicated, block: B:97:0x0228  */
    /* JADX WARN: Code duplicated, block: B:98:0x0232  */
    @Override // a.v6t0
    public final Object invoke(Object obj) {
        Cnew cnew;
        List list;
        Object obj2;
        m9s m9sVar;
        Cnew cnew2;
        few fewVar;
        Object obj3;
        Object obj4;
        m9s m9sVar2;
        a4x a4xVarO0;
        byte b = this.f2525a;
        Object obj5 = this.j;
        n0o0 n0o0Var = this.h;
        n0o0 n0o0Var2 = this.g;
        n0o0 n0o0Var3 = this.f;
        n0o0 n0o0Var4 = this.e;
        n0o0 n0o0Var5 = this.d;
        Object obj6 = this.i;
        switch (b) {
            case 0:
                lew lewVar = (lew) obj;
                lewVar.getClass();
                fee feeVar = (fee) n0o0Var5.getValue();
                long j = lewVar.f19925a;
                Map map = lewVar.d;
                feeVar.d(Long.valueOf(j));
                fee feeVar2 = (fee) n0o0Var4.getValue();
                tew tewVar = lewVar.b;
                j0g0 j0g0Var = tewVar.f33842a;
                if (j0g0Var != null) {
                    Object obj7 = j0g0Var.f15681a;
                    if (obj7 instanceof g0g0) {
                        obj7 = null;
                    }
                    cnew = (Cnew) obj7;
                } else {
                    cnew = null;
                }
                feeVar2.d(cnew);
                fee feeVar3 = (fee) n0o0Var3.getValue();
                j0g0 j0g0Var2 = tewVar.b;
                if (j0g0Var2 != null) {
                    Object obj8 = j0g0Var2.f15681a;
                    if (obj8 instanceof g0g0) {
                        obj8 = null;
                    }
                    list = (List) obj8;
                } else {
                    list = null;
                }
                feeVar3.d(list);
                fee feeVar4 = (fee) n0o0Var2.getValue();
                if (j0g0Var != null) {
                    Object obj9 = j0g0Var.f15681a;
                    if (obj9 instanceof g0g0) {
                        obj9 = null;
                    }
                    Cnew cnew3 = (Cnew) obj9;
                    if (cnew3 == null || (obj2 = cnew3.b) == null) {
                        obj2 = iun.f15405a;
                    }
                } else {
                    obj2 = iun.f15405a;
                }
                feeVar4.d(obj2);
                ((fee) n0o0Var.getValue()).d(lewVar);
                zbk zbkVar = ((fee) n0o0Var4.getValue()).e;
                pz40 pz40Var = (pz40) obj6;
                if (j0g0Var == null || !(j0g0Var.f15681a instanceof g0g0)) {
                    edw edwVar = (edw) map.get(Long.valueOf(j));
                    if (edwVar != null) {
                        Object obj10 = edwVar.b;
                        e0g0 e0g0Var = j0g0.b;
                        if (obj10 instanceof g0g0) {
                            obj10 = null;
                        }
                        m9sVar = (m9s) obj10;
                    } else {
                        m9sVar = null;
                    }
                    if (m9sVar != null) {
                        if (j0g0Var != null) {
                            obj3 = j0g0Var.f15681a;
                            if (obj3 instanceof g0g0) {
                                obj4 = null;
                            } else {
                                obj4 = obj3;
                            }
                            cnew2 = (Cnew) obj4;
                        } else {
                            cnew2 = null;
                        }
                        if (cnew2 == null) {
                            fewVar = new few(a());
                        } else {
                            lc00 lc00VarB = kotlin.collections.a.b();
                            lc00VarB.add(((fee) n0o0Var.getValue()).b());
                            lc00VarB.addAll((Collection) ((fee) n0o0Var2.getValue()).b());
                            lc00VarB.add(((fee) n0o0Var3.getValue()).b());
                            lc00VarB.add((wf60) obj5);
                            fewVar = new few(new dew(androidx.compose.runtime.e.e(dyb.o0(kotlin.collections.a.a(lc00VarB)))));
                        }
                    } else {
                        edw edwVar2 = (edw) map.get(Long.valueOf(j));
                        if (edwVar2 != null) {
                            Object obj11 = edwVar2.f7640a;
                            e0g0 e0g0Var2 = j0g0.b;
                            if (obj11 instanceof g0g0) {
                                obj11 = null;
                            }
                            m9sVar2 = (m9s) obj11;
                        } else {
                            m9sVar2 = null;
                        }
                        if (m9sVar2 != null) {
                            if (j0g0Var != null) {
                                obj3 = j0g0Var.f15681a;
                                if (obj3 instanceof g0g0) {
                                    obj4 = null;
                                } else {
                                    obj4 = obj3;
                                }
                                cnew2 = (Cnew) obj4;
                            } else {
                                cnew2 = null;
                            }
                            if (cnew2 == null) {
                                fewVar = new few(a());
                            } else {
                                lc00 lc00VarB2 = kotlin.collections.a.b();
                                lc00VarB2.add(((fee) n0o0Var.getValue()).b());
                                lc00VarB2.addAll((Collection) ((fee) n0o0Var2.getValue()).b());
                                lc00VarB2.add(((fee) n0o0Var3.getValue()).b());
                                lc00VarB2.add((wf60) obj5);
                                fewVar = new few(new dew(androidx.compose.runtime.e.e(dyb.o0(kotlin.collections.a.a(lc00VarB2)))));
                            }
                        } else {
                            fewVar = new few(a());
                        }
                    }
                } else {
                    ldm ldmVar = ldm.b;
                    xuz xuzVar = pb10.c;
                    pb10 pb10VarJ = ozb.J(46L, pb10.v);
                    xuzVar.getClass();
                    fewVar = new few(new eew(new mdm(pb10VarJ.f26683a, null, ldmVar, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, 602)));
                }
                hgk0 hgk0Var = (hgk0) pz40Var;
                hgk0Var.setValue(fewVar);
                return new zew(zbkVar, hgk0Var);
            default:
                m730 m730Var = (m730) obj;
                udl0 udl0Var = (udl0) obj6;
                m730Var.getClass();
                fee feeVar5 = (fee) n0o0Var5.getValue();
                List list2 = m730Var.f21300a;
                boolean z = m730Var.f;
                feeVar5.d(list2);
                fee feeVar6 = (fee) n0o0Var4.getValue();
                feeVar6.getClass();
                pz40 pz40VarA = feeVar6.a();
                ((Long) feeVar6.a().getValue()).getClass();
                pz40VarA.setValue(Long.valueOf(m730Var.d));
                ((fee) n0o0Var3.getValue()).d(m730Var.e);
                ((fee) n0o0Var2.getValue()).d(m730Var.g);
                fee feeVar7 = (fee) n0o0Var.getValue();
                Map map2 = m730Var.b;
                feeVar7.d(map2);
                cx7 cx7Var = (cx7) map2.get(((fee) n0o0Var4.getValue()).c());
                boolean z2 = this.b;
                if (cx7Var == null) {
                    return new x730(udl0Var, z2, z);
                }
                if (cx7Var instanceof ax7) {
                    return new x730(udl0Var, z2, z);
                }
                if (cx7Var instanceof ww7) {
                    List list3 = (List) ((fee) n0o0Var.getValue()).e.getValue();
                    if (list3 == null || (a4xVarO0 = dyb.o0(list3)) == null) {
                        a4xVarO0 = lak0.c;
                    }
                    return new w730(udl0Var, z2, a4xVarO0, z);
                }
                if (cx7Var instanceof uw7) {
                    return new u730(udl0Var, this.c.b.a(R.string.no_bets_for_selected_event_v2, Arrays.copyOf(new Object[]{Long.valueOf(((uw7) cx7Var).f36380a)}, 1)));
                }
                if (!(cx7Var instanceof yw7)) {
                    t9f.b();
                    return null;
                }
                l9s l9sVar = m730Var.c;
                boolean z3 = l9sVar != null && l9sVar.e();
                long jA = l9sVar != null ? l9sVar.a() : -1L;
                long jB = l9sVar != null ? l9sVar.b() : -1L;
                long jC = l9sVar != null ? l9sVar.c() : -1L;
                long jD = l9sVar != null ? l9sVar.d() : -1L;
                tef0 tef0Var = tef0.f33818a;
                xuz xuzVar2 = pb10.c;
                return new y730(udl0Var, new RelatedParams(z3, jA, jC, jD, jB, tef0Var), (vef0) obj5);
        }
    }

    public bfw(m730 m730Var, boolean z, udl0 udl0Var, boolean z2, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.i = udl0Var;
        this.b = z2;
        this.c = ctf0Var;
        this.j = new vef0(ctf0Var.b.a(R.string.no_available_bets_hint, Arrays.copyOf(new Object[0], 0)));
        this.d = bkb.H(m730Var.f21300a);
        this.e = bkb.H(Long.valueOf(m730Var.d));
        this.f = bkb.H(m730Var.e);
        this.g = bkb.H(m730Var.g);
        this.h = maz.b(new yw9(m730Var.b, new r91((Object) this, z, (Object) m730Var, (byte) 19), (byte) 20));
    }
}
