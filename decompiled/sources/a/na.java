package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xplatform.cyber.game.core.betting.domain.model.RelatedParams;

/* JADX INFO: loaded from: classes3.dex */
public final class na implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23164a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ na(Object obj, Object obj2, byte b) {
        this.f23164a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final Object c(yje yjeVar, Object obj) {
        p2a p2aVar = (p2a) obj;
        if (p2aVar instanceof u2a) {
            r9a r9aVar = (r9a) ((mie0) this.b).f21842a;
            yy9 yy9Var = ((u2a) p2aVar).f34935a;
            synchronized (r9aVar.k) {
                o9a o9aVar = r9aVar.u;
                if (o9aVar != o9a.d && o9aVar != o9a.e) {
                    r9aVar.q = yy9Var;
                    qjj.W(r9aVar.i, null, null, new p9a(r9aVar, null, (byte) 0), 3);
                }
            }
        } else if (p2aVar instanceof t2a) {
            ((r9a) ((mie0) this.b).f21842a).n();
        } else if (p2aVar instanceof s2a) {
            ((r9a) ((mie0) this.b).f21842a).n();
            iw9 iw9Var = (iw9) this.c;
            s2a s2aVar = (s2a) p2aVar;
            synchronized (iw9Var.q) {
                try {
                    if (!iw9Var.c()) {
                        az9 az9Var = s2aVar.i;
                        if (az9Var != null) {
                            iw9Var.u = az9Var;
                            int i = az9Var.f1706a;
                            if (i == 6 || i == 1 || i == 2) {
                                iw9Var.s = ty9.m0;
                                Log.d("CXCP", iw9Var + " is disconnected");
                            } else {
                                iw9Var.s = ty9.n0;
                                Log.d("CXCP", iw9Var + " encountered error: " + ((Object) az9.a(s2aVar.i.f1706a)));
                            }
                        } else {
                            iw9Var.s = ty9.p0;
                        }
                        iw9Var.f.d();
                        iw9Var.g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object d(yje yjeVar, Object obj) {
        dqb dqbVar;
        if (yjeVar instanceof dqb) {
            dqbVar = (dqb) yjeVar;
            int i = dqbVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                dqbVar.j = i - Integer.MIN_VALUE;
            } else {
                dqbVar = new dqb(this, yjeVar);
            }
        } else {
            dqbVar = new dqb(this, yjeVar);
        }
        Object obj2 = dqbVar.i;
        wne wneVar = wne.f39444a;
        int i2 = dqbVar.j;
        if (i2 == 0) {
            z1x.P(obj2);
            kmq kmqVar = (kmq) this.b;
            Pair pair = new Pair((e7a) obj, (String) ((p6a) this.c).b);
            dqbVar.j = 1;
            if (kmqVar.a(pair, dqbVar) == wneVar) {
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
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r7.a(r8, r1) == r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(a.yje r8, java.lang.Object r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            a.v7c r0 = (a.v7c) r0
            boolean r1 = r8 instanceof a.r7c
            if (r1 == 0) goto L17
            r1 = r8
            a.r7c r1 = (a.r7c) r1
            int r2 = r1.j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.j = r2
            goto L1c
        L17:
            a.r7c r1 = new a.r7c
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.i
            a.wne r2 = a.wne.f39444a
            int r3 = r1.j
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3b
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2f
            a.z1x.P(r8)
            goto L83
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r6
        L35:
            a.kmq r7 = r1.l
            a.z1x.P(r8)
            goto L6e
        L3b:
            a.z1x.P(r8)
            java.lang.Object r7 = r7.b
            a.kmq r7 = (a.kmq) r7
            a.e7a r9 = (a.e7a) r9
            if (r9 == 0) goto L86
            boolean r8 = r9 instanceof a.d7a
            if (r8 == 0) goto L57
            a.ol60 r7 = r0.P
            a.z6c r8 = new a.z6c
            a.d7a r9 = (a.d7a) r9
            r8.<init>(r9)
            r7.f(r8)
            goto L83
        L57:
            boolean r8 = r9 instanceof a.c7a
            if (r8 == 0) goto L86
            a.jnk r8 = r0.y
            a.c7a r9 = (a.c7a) r9
            a.ynb0 r9 = r9.f3852a
            r1.l = r7
            r1.j = r5
            java.lang.String r3 = ""
            java.lang.Object r8 = r8.a(r1, r9, r3)
            if (r8 != r2) goto L6e
            goto L82
        L6e:
            a.nte0 r8 = (a.nte0) r8
            int r8 = r8.b
            r9 = 0
            r0.L(r8, r9)
            kotlin.Unit r8 = kotlin.Unit.f46060a
            r1.l = r6
            r1.j = r4
            java.lang.Object r7 = r7.a(r8, r1)
            if (r7 != r2) goto L83
        L82:
            return r2
        L83:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        L86:
            a.t9f.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.na.e(a.yje, java.lang.Object):java.lang.Object");
    }

    private final Object f(yje yjeVar, Object obj) {
        Object uhkVar;
        List list = ((jjv0) obj).f16636a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof tmv) {
                arrayList.add(obj2);
            }
        }
        tmv tmvVar = (tmv) CollectionsKt.firstOrNull(arrayList);
        pz40 pz40Var = (pz40) this.c;
        if (tmvVar != null) {
            m60 m60Var = tmvVar.c;
            uhkVar = (m60Var == m60.g || m60Var == m60.f) ? new uhk(false) : new uhk(true);
        } else {
            agd agdVar = (agd) this.b;
            float f = pkd.f27129a;
            mjv0.f21914a.getClass();
            njv0 njv0Var = ljv0.b;
            njv0Var.getClass();
            kjv0 kjv0VarA = njv0Var.a(agdVar);
            float f2 = agdVar.getResources().getDisplayMetrics().density;
            tq8 tq8Var = kjv0VarA.f18406a;
            float fWidth = tq8Var.c().width() / f2;
            tq8Var.c().height();
            uhkVar = fWidth >= f ? yhk.f42641a : whk.f39170a;
        }
        float f3 = pkd.f27129a;
        pz40Var.setValue(uhkVar);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object h(yje yjeVar, Object obj) {
        sze szeVar;
        if (yjeVar instanceof sze) {
            szeVar = (sze) yjeVar;
            int i = szeVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                szeVar.j = i - Integer.MIN_VALUE;
            } else {
                szeVar = new sze(this, yjeVar);
            }
        } else {
            szeVar = new sze(this, yjeVar);
        }
        Object obj2 = szeVar.i;
        wne wneVar = wne.f39444a;
        int i2 = szeVar.j;
        if (i2 == 0) {
            z1x.P(obj2);
            kmq kmqVar = (kmq) this.b;
            im7 im7Var = (im7) obj;
            ctf0 ctf0Var = ((wze) this.c).i;
            im7Var.getClass();
            ctf0Var.getClass();
            String str = im7Var.f15012a;
            boolean z = im7Var.b;
            boolean z2 = im7Var.c;
            en7 en7Var = im7Var.d;
            jm7 jm7Var = new jm7(str, en7Var != null ? lv00.X(en7Var, ctf0Var) : "", z, z2);
            szeVar.j = 1;
            if (kmqVar.a(jm7Var, szeVar) == wneVar) {
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

    private final Object j(yje yjeVar, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        x3m x3mVar = (x3m) this.b;
        if (zBooleanValue && x3mVar.c() != y3m.f41958a) {
            qjj.W((vne) this.c, null, null, new d3g(x3mVar, null, (byte) 0), 3);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object k(yje yjeVar, Object obj) {
        cch cchVar;
        if (yjeVar instanceof cch) {
            cchVar = (cch) yjeVar;
            int i = cchVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                cchVar.j = i - Integer.MIN_VALUE;
            } else {
                cchVar = new cch(this, yjeVar);
            }
        } else {
            cchVar = new cch(this, yjeVar);
        }
        Object obj2 = cchVar.i;
        wne wneVar = wne.f39444a;
        int i2 = cchVar.j;
        RelatedParams relatedParamsP = null;
        if (i2 == 0) {
            z1x.P(obj2);
            kmq kmqVar = (kmq) this.b;
            jlr jlrVar = (jlr) obj;
            if (jlrVar != null) {
                dch dchVar = (dch) this.c;
                int i3 = dch.F;
                relatedParamsP = dchVar.P(jlrVar);
            }
            cchVar.j = 1;
            if (kmqVar.a(relatedParamsP, cchVar) == wneVar) {
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

    private final Object l(yje yjeVar, Object obj) {
        List list = (List) obj;
        boolean zIsEmpty = list.isEmpty();
        dch dchVar = (dch) this.b;
        if (zIsEmpty) {
            RelatedParams relatedParams = (RelatedParams) this.c;
            int i = dch.F;
            dchVar.M(relatedParams);
        } else {
            dchVar.x(new ibh(list));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
    
        if (r13.a(r12, r7) == r0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(a.yje r13, java.lang.Object r14) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof a.n2j
            if (r0 == 0) goto L14
            r0 = r13
            a.n2j r0 = (a.n2j) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.j = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            a.n2j r0 = new a.n2j
            r0.<init>(r12, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.i
            a.wne r0 = a.wne.f39444a
            int r1 = r7.j
            r8 = 3
            r2 = 2
            r3 = 1
            r9 = 0
            if (r1 == 0) goto L4f
            if (r1 == r3) goto L3e
            if (r1 == r2) goto L37
            if (r1 != r8) goto L31
            a.z1x.P(r13)
            goto Lbc
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r12)
            return r9
        L37:
            a.kmq r12 = r7.k
            a.z1x.P(r13)
            goto La7
        L3e:
            long r3 = r7.o
            a.yqc r12 = r7.n
            a.umt0 r14 = r7.m
            a.kmq r1 = r7.k
            a.z1x.P(r13)
            r5 = r14
            r14 = r13
            r13 = r1
            r1 = r5
            r5 = r3
            goto L84
        L4f:
            a.z1x.P(r13)
            java.lang.Object r13 = r12.b
            a.kmq r13 = (a.kmq) r13
            a.vmt0 r14 = (a.vmt0) r14
            boolean r1 = r14 instanceof a.umt0
            if (r1 == 0) goto Lad
            java.lang.Object r12 = r12.c
            a.cu r12 = (a.cu) r12
            java.lang.Object r1 = r12.c
            a.yqc r1 = (a.yqc) r1
            r4 = r14
            a.umt0 r4 = (a.umt0) r4
            long r5 = r4.f35934a
            java.lang.Object r12 = r12.d
            a.khf0 r12 = (a.khf0) r12
            a.bm5 r10 = a.bm5.e
            r7.k = r13
            r7.m = r4
            r7.n = r1
            r7.o = r5
            r7.j = r3
            java.io.Serializable r12 = a.khf0.G(r12, r10, r7)
            if (r12 != r0) goto L80
            goto Lbb
        L80:
            r11 = r14
            r14 = r12
            r12 = r1
            r1 = r11
        L84:
            a.ql5 r14 = (a.ql5) r14
            long r3 = r14.f28916a
            a.umt0 r1 = (a.umt0) r1
            int r14 = r1.b
            r7.k = r13
            r7.m = r9
            r7.n = r9
            r7.j = r2
            java.lang.Object r12 = r12.b
            r1 = r12
            a.kki r1 = (a.kki) r1
            r2 = r14
            java.lang.Object r12 = r1.z(r2, r3, r5, r7)
            if (r12 != r0) goto La1
            goto La3
        La1:
            kotlin.Unit r12 = kotlin.Unit.f46060a
        La3:
            if (r12 != r0) goto La6
            goto Lbb
        La6:
            r12 = r13
        La7:
            kotlin.Unit r13 = kotlin.Unit.f46060a
            r11 = r13
            r13 = r12
            r12 = r11
            goto Laf
        Lad:
            kotlin.Unit r12 = kotlin.Unit.f46060a
        Laf:
            r7.k = r9
            r7.m = r9
            r7.j = r8
            java.lang.Object r12 = r13.a(r12, r7)
            if (r12 != r0) goto Lbc
        Lbb:
            return r0
        Lbc:
            kotlin.Unit r12 = kotlin.Unit.f46060a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.na.m(a.yje, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:170:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:183:0x0401  */
    /* JADX WARN: Code duplicated, block: B:186:0x0436  */
    /* JADX WARN: Code duplicated, block: B:198:0x0479  */
    /* JADX WARN: Code duplicated, block: B:218:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:239:0x0550  */
    /* JADX WARN: Code duplicated, block: B:255:0x0596  */
    /* JADX WARN: Code duplicated, block: B:351:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:386:0x0793  */
    /* JADX WARN: Code duplicated, block: B:403:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:419:0x082c  */
    /* JADX WARN: Code duplicated, block: B:420:0x082f  */
    /* JADX WARN: Code duplicated, block: B:423:0x0834  */
    /* JADX WARN: Code duplicated, block: B:427:0x083f  */
    /* JADX WARN: Code duplicated, block: B:433:0x0850  */
    /* JADX WARN: Code duplicated, block: B:434:0x0853  */
    /* JADX WARN: Code duplicated, block: B:437:0x0857  */
    /* JADX WARN: Code duplicated, block: B:440:0x0865  */
    /* JADX WARN: Code duplicated, block: B:442:0x0870  */
    /* JADX WARN: Code duplicated, block: B:453:0x088a  */
    /* JADX WARN: Code duplicated, block: B:463:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:466:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:474:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:496:0x0921  */
    /* JADX WARN: Code duplicated, block: B:554:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:574:0x0adf  */
    /* JADX WARN: Code duplicated, block: B:594:0x0b54  */
    /* JADX WARN: Code duplicated, block: B:619:0x0bb0  */
    /* JADX WARN: Code duplicated, block: B:669:0x084b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20, types: [a.h7d, a.kmq] */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x0436 -> B:187:0x0437). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.kmq
    public final java.lang.Object a(java.lang.Object r34, a.yje r35) {
        /*
            Method dump skipped, instruction units count: 3136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.na.a(java.lang.Object, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d0 A[PHI: r0 r1 r3 r4
  0x00d0: PHI (r0v5 ??) = (r0v20 ??), (r0v13 ??) binds: [B:31:0x00cd, B:19:0x0055] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r1v12 java.lang.Object) = (r1v11 java.lang.Object), (r1v1 java.lang.Object) binds: [B:31:0x00cd, B:19:0x0055] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r3v8 a.p7m0) = (r3v7 a.p7m0), (r3v11 a.p7m0) binds: [B:31:0x00cd, B:19:0x0055] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r4v4 int) = (r4v3 int), (r4v9 int) binds: [B:31:0x00cd, B:19:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e6 A[PHI: r0 r4
  0x00e6: PHI (r0v6 ??) = (r0v19 ??), (r0v15 ??) binds: [B:34:0x00e3, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r4v5 int) = (r4v4 int), (r4v10 int) binds: [B:34:0x00e3, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f8, code lost:
    
        if (kotlin.Unit.f46060a == r11) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v5, types: [a.p7m0, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v16, types: [a.p7m0, java.lang.Object] */
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
    public java.lang.Object b(java.util.Map r18, a.yje r19) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.na.b(java.util.Map, a.yje):java.lang.Object");
    }
}
