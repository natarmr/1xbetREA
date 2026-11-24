package a;

import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class o8z implements ibz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9z f24854a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ hh80 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ tgv e;
    public final /* synthetic */ sw3 f;
    public final /* synthetic */ ow3 g;
    public final /* synthetic */ vne h;
    public final /* synthetic */ afv i;
    public final /* synthetic */ g9m0 j;

    public o8z(d9z d9zVar, boolean z, hh80 hh80Var, eiy eiyVar, tgv tgvVar, sw3 sw3Var, ow3 ow3Var, vne vneVar, afv afvVar, g9m0 g9m0Var) {
        this.f24854a = d9zVar;
        this.b = z;
        this.c = hh80Var;
        this.d = eiyVar;
        this.e = tgvVar;
        this.f = sw3Var;
        this.g = ow3Var;
        this.h = vneVar;
        this.i = afvVar;
        this.j = g9m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:186:0x0480  */
    /* JADX WARN: Code duplicated, block: B:194:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:198:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:238:0x0571 A[LOOP:6: B:223:0x0528->B:238:0x0571, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:240:0x057d  */
    /* JADX WARN: Code duplicated, block: B:243:0x0586  */
    /* JADX WARN: Code duplicated, block: B:246:0x0591  */
    /* JADX WARN: Code duplicated, block: B:261:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:263:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:267:0x060c  */
    /* JADX WARN: Code duplicated, block: B:273:0x061a  */
    /* JADX WARN: Code duplicated, block: B:275:0x0625  */
    /* JADX WARN: Code duplicated, block: B:277:0x062f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:283:0x0648  */
    /* JADX WARN: Code duplicated, block: B:285:0x0650  */
    /* JADX WARN: Code duplicated, block: B:287:0x0659  */
    /* JADX WARN: Code duplicated, block: B:289:0x0660  */
    /* JADX WARN: Code duplicated, block: B:293:0x066c  */
    /* JADX WARN: Code duplicated, block: B:296:0x0673  */
    /* JADX WARN: Code duplicated, block: B:297:0x0676  */
    /* JADX WARN: Code duplicated, block: B:300:0x067d  */
    /* JADX WARN: Code duplicated, block: B:301:0x0680  */
    /* JADX WARN: Code duplicated, block: B:308:0x0695 A[LOOP:12: B:307:0x0693->B:308:0x0695, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:311:0x06af  */
    /* JADX WARN: Code duplicated, block: B:316:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:319:0x06ca A[LOOP:13: B:318:0x06c8->B:319:0x06ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:322:0x06db  */
    /* JADX WARN: Code duplicated, block: B:324:0x06df  */
    /* JADX WARN: Code duplicated, block: B:325:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:327:0x06f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:328:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:337:0x072a A[LOOP:15: B:336:0x0728->B:337:0x072a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:339:0x0736 A[LOOP:14: B:335:0x0718->B:339:0x0736, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:341:0x0740  */
    /* JADX WARN: Code duplicated, block: B:343:0x0747  */
    /* JADX WARN: Code duplicated, block: B:345:0x075b  */
    /* JADX WARN: Code duplicated, block: B:349:0x0774 A[LOOP:18: B:346:0x075d->B:349:0x0774, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:352:0x077f  */
    /* JADX WARN: Code duplicated, block: B:354:0x0791 A[LOOP:20: B:353:0x078f->B:354:0x0791, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:358:0x07ac A[LOOP:21: B:357:0x07aa->B:358:0x07ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:362:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:364:0x07f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:365:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:367:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:370:0x0815  */
    /* JADX WARN: Code duplicated, block: B:371:0x0818  */
    /* JADX WARN: Code duplicated, block: B:373:0x081b  */
    /* JADX WARN: Code duplicated, block: B:375:0x0822 A[LOOP:16: B:374:0x0820->B:375:0x0822, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:378:0x083a  */
    /* JADX WARN: Code duplicated, block: B:382:0x0873  */
    /* JADX WARN: Code duplicated, block: B:386:0x087a  */
    /* JADX WARN: Code duplicated, block: B:389:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:391:0x08af  */
    /* JADX WARN: Code duplicated, block: B:394:0x08bc A[LOOP:17: B:393:0x08ba->B:394:0x08bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:426:0x0584 A[EDGE_INSN: B:426:0x0584->B:242:0x0584 BREAK  A[LOOP:6: B:223:0x0528->B:238:0x0571], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x073b A[EDGE_INSN: B:439:0x073b->B:340:0x073b BREAK  A[LOOP:14: B:335:0x0718->B:339:0x0736], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x0776 A[EDGE_INSN: B:443:0x0776->B:350:0x0776 BREAK  A[LOOP:18: B:346:0x075d->B:349:0x0774], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x0644 A[ADDED_TO_REGION, EDGE_INSN: B:448:0x0644->B:281:0x0644 BREAK  A[LOOP:22: B:274:0x0623->B:280:0x0639], REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.ibz
    public final uj30 a(jbz jbzVar, long j) {
        v8z v8zVar;
        float fA;
        int iC;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        List list;
        m8z m8zVar;
        List list2;
        int i9;
        List arrayList;
        int[] iArr2;
        int i10;
        int i11;
        List arrayList2;
        List list3;
        int iB;
        int i12;
        s8z s8zVar;
        int i13;
        int i14;
        long j2;
        int iG;
        int iG2;
        int iH;
        int i15;
        List listQ0;
        int i16;
        boolean z;
        int size;
        boolean z2;
        int length;
        int i17;
        ArrayList arrayList3;
        int size2;
        int size3;
        int iM;
        int i18;
        int size4;
        int i19;
        r8z[] r8zVarArrA;
        int length2;
        int i20;
        int iM2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        float f2;
        int iF;
        int i27;
        List listV;
        boolean z3;
        ma80 ma80Var;
        int size5;
        int i28;
        int i29;
        q8z q8zVar;
        c5n0 c5n0Var;
        long jB;
        int i30;
        int i31;
        int size6;
        int i32;
        int size7;
        int[] iArr3;
        int i33;
        int[] iArr4;
        int i34;
        int i35;
        int i36;
        r8z[] r8zVarArrA2;
        int length3;
        int i37;
        int i38;
        int i39;
        int i40;
        m8z m8zVar2;
        int[] iArr5;
        r8z r8zVar;
        int i41;
        m8z m8zVar3;
        r8z r8zVar2;
        c5n0 c5n0Var2 = jbzVar.b;
        d9z d9zVar = this.f24854a;
        d9zVar.s.getValue();
        boolean z4 = d9zVar.b || c5n0Var2.M();
        boolean z5 = this.b;
        d5c.H(j, z5 ? ma80.f21447a : ma80.b);
        hh80 hh80Var = this.c;
        int iT = z5 ? c5n0Var2.T(hh80Var.b(c5n0Var2.getLayoutDirection())) : c5n0Var2.T(s5x0.B(hh80Var, c5n0Var2.getLayoutDirection()));
        int iT2 = z5 ? c5n0Var2.T(hh80Var.c(c5n0Var2.getLayoutDirection())) : c5n0Var2.T(s5x0.A(hh80Var, c5n0Var2.getLayoutDirection()));
        int iT3 = c5n0Var2.T(hh80Var.d());
        int iT4 = c5n0Var2.T(hh80Var.a()) + iT3;
        int i42 = iT + iT2;
        int i43 = z5 ? iT4 : i42;
        int i44 = z5 ? iT3 : !z5 ? iT : iT2;
        int i45 = i43 - i44;
        long jI = r4e.i(-i42, -iT4, j);
        j8z j8zVar = (j8z) this.d.invoke();
        y8z y8zVar = j8zVar.b.f14364a;
        tgv tgvVar = this.e;
        if (tgvVar.d != null && p4e.c(tgvVar.b, jI) && tgvVar.c == c5n0Var2.getDensity()) {
            v8z v8zVar2 = tgvVar.d;
            v8zVar2.getClass();
            v8zVar = v8zVar2;
        } else {
            tgvVar.b = jI;
            tgvVar.c = c5n0Var2.getDensity();
            v8zVar = (v8z) tgvVar.f33933a.invoke(jbzVar, new p4e(jI));
            tgvVar.d = v8zVar;
        }
        int length4 = v8zVar.f37007a.length;
        if (length4 != y8zVar.i) {
            y8zVar.i = length4;
            ArrayList arrayList4 = y8zVar.b;
            arrayList4.clear();
            arrayList4.add(new w8z(0, 0));
            y8zVar.c = 0;
            y8zVar.d = 0;
            y8zVar.e = 0;
            y8zVar.f = -1;
            y8zVar.g.clear();
        }
        ow3 ow3Var = this.g;
        sw3 sw3Var = this.f;
        if (z5 != 0) {
            if (sw3Var == null) {
                throw w6x.i("null verticalArrangement when isVertical == true");
            }
            fA = sw3Var.a();
        } else {
            if (ow3Var == null) {
                throw w6x.i("null horizontalArrangement when isVertical == false");
            }
            fA = ow3Var.a();
        }
        int iT5 = c5n0Var2.T(fA);
        int iB2 = j8zVar.b();
        int iH2 = z5 != 0 ? p4e.h(j) - iT4 : p4e.i(j) - i42;
        int i46 = i44;
        m8z m8zVar4 = new m8z(j8zVar, jbzVar, iT5, this.f24854a, this.b, i46, i45, (((long) iT) << 32) | (((long) iT3) & 4294967295L));
        j8z j8zVar2 = m8zVar4.c;
        androidx.compose.foundation.lazy.layout.c cVar = j8zVar2.c;
        n8z n8zVar = new n8z();
        n8zVar.d = z5;
        n8zVar.f = v8zVar;
        n8zVar.c = z5;
        n8zVar.e = v8zVar;
        n8zVar.f23114a = iB2;
        n8zVar.b = iT5;
        n8zVar.g = m8zVar4;
        n8zVar.h = y8zVar;
        y8z y8zVar2 = (y8z) n8zVar.h;
        okw okwVar = new okw(y8zVar, n8zVar, (byte) 18);
        adw adwVar = new adw(y8zVar, (byte) 28);
        rfk0 rfk0VarJ = vdx.J();
        Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
        rfk0 rfk0VarW = vdx.W(rfk0VarJ);
        try {
            int iH3 = d9zVar.h();
            t8z t8zVar = d9zVar.d;
            int iJ = k9x.J(iH3, j8zVar, t8zVar.e);
            if (iH3 != iJ) {
                t8zVar.b.m(iJ);
                t8zVar.f.b(iH3);
            }
            if (iJ < iB2 || iB2 <= 0) {
                iC = y8zVar.c(iJ);
                i = d9zVar.i();
            } else {
                iC = y8zVar.c(iB2 - 1);
                i = 0;
            }
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            MutableIntList mutableIntListT = c9x.t(j8zVar, d9zVar.q, d9zVar.n);
            float fFloatValue = (c5n0Var2.M() || !z4) ? d9zVar.g : ((Number) ((hgk0) ((l73) d9zVar.v.c).b).getValue()).floatValue();
            dbz dbzVar = d9zVar.m;
            boolean zM = c5n0Var2.M();
            q8z q8zVar2 = d9zVar.c;
            pz40 pz40Var = d9zVar.r;
            if (i46 < 0) {
                adx.a("negative beforeContentPadding");
            }
            if (i45 < 0) {
                adx.a("negative afterContentPadding");
            }
            boolean z6 = this.b;
            vne vneVar = this.h;
            float f3 = fFloatValue;
            afv afvVar = this.i;
            if (iB2 <= 0) {
                int iK = p4e.k(jI);
                int iJ2 = p4e.j(jI);
                dbzVar.d(0, iK, iJ2, new ArrayList(), cVar, m8zVar4, z6, zM, length4, z4, 0, 0, vneVar, afvVar);
                if (!zM) {
                    long jB2 = dbzVar.b();
                    if (!qkx.a(jB2, 0L)) {
                        iK = r4e.g((int) (jB2 >> 32), jI);
                        iJ2 = r4e.f((int) (jB2 & 4294967295L), jI);
                    }
                }
                djx djxVar = new djx((byte) 29);
                int iG3 = r4e.g(iK + i42, j);
                int iF2 = r4e.f(iJ2 + iT4, j);
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                c5n0Var = c5n0Var2;
                q8zVar = new q8z(null, 0, false, 0.0f, c5n0Var2.i0(iG3, iF2, lunVar, djxVar), 0.0f, false, vneVar, jbzVar, length4, okwVar, adwVar, 0, iun.f15405a, -i46, iH2 + i45, 0, z6 ? ma80.f21447a : ma80.b, i45, iT5);
            } else {
                Function1 function1 = okwVar;
                m8z m8zVar5 = r1;
                int iRound = Math.round(f3);
                int i47 = i - iRound;
                if (iC == 0 && i47 < 0) {
                    iRound += i47;
                    i47 = 0;
                }
                xw3 xw3Var = new xw3();
                int i48 = -i46;
                int i49 = i48 + (iT5 < 0 ? iT5 : 0);
                int i50 = i47 + i49;
                while (i50 < 0 && iC > 0) {
                    iC--;
                    Function1 function2 = function1;
                    s8z s8zVarB = n8zVar.b(iC);
                    xw3Var.add(0, s8zVarB);
                    i50 += s8zVarB.h;
                    function1 = function2;
                    i48 = i48;
                }
                Function1 function3 = function1;
                int i51 = i48;
                if (i50 < i49) {
                    iRound -= i49 - i50;
                    i50 = i49;
                }
                int i52 = iRound;
                int i53 = i50 - i49;
                int i54 = iH2 + i45;
                int i55 = i54 >= 0 ? i54 : 0;
                int i56 = iC;
                int i57 = i53;
                int i58 = i56;
                boolean z7 = false;
                int i59 = -i53;
                int i60 = 0;
                while (i60 < xw3Var.c) {
                    if (i59 >= i55) {
                        xw3Var.e(i60);
                        z7 = true;
                    } else {
                        i58++;
                        i59 += ((s8z) xw3Var.get(i60)).h;
                        i60++;
                    }
                }
                int i61 = i56;
                boolean z8 = z7;
                int i62 = i58;
                while (true) {
                    if (i62 >= iB2 || (i59 >= i55 && i59 > 0 && !xw3Var.isEmpty())) {
                        i2 = i61;
                        break;
                    }
                    i2 = i61;
                    s8z s8zVarB2 = n8zVar.b(i62);
                    int i63 = i62;
                    int i64 = s8zVarB2.h;
                    r8z[] r8zVarArr = s8zVarB2.b;
                    int i65 = i55;
                    if (r8zVarArr.length == 0) {
                        break;
                    }
                    i59 += i64;
                    if (i59 > i49 || ((r8z) tx3.O(r8zVarArr)).f30051a == iB2 - 1) {
                        xw3Var.addLast(s8zVarB2);
                        i61 = i2;
                    } else {
                        i57 -= i64;
                        i61 = i63 + 1;
                        z8 = true;
                    }
                    i62 = i63 + 1;
                    i55 = i65;
                }
                if (i59 < iH2) {
                    int i66 = iH2 - i59;
                    int i67 = i59 + i66;
                    int i68 = i57 - i66;
                    while (i68 < i46 && i2 > 0) {
                        int i69 = i2 - 1;
                        int i70 = i68;
                        s8z s8zVarB3 = n8zVar.b(i69);
                        xw3Var.add(0, s8zVarB3);
                        i68 = i70 + s8zVarB3.h;
                        i2 = i69;
                        i67 = i67;
                    }
                    int i71 = i68;
                    int i72 = i67;
                    i4 = i66 + i52;
                    if (i71 < 0) {
                        i4 += i71;
                        i3 = i72 + i71;
                        i5 = 0;
                    } else {
                        i5 = i71;
                        i3 = i72;
                    }
                } else {
                    i3 = i59;
                    i4 = i52;
                    i5 = i57;
                }
                float f4 = (Integer.signum(Math.round(f3)) != Integer.signum(i4) || Math.abs(Math.round(f3)) < Math.abs(i4)) ? f3 : i4;
                float f5 = f3 - f4;
                float f6 = 0.0f;
                if (zM && i4 > i52 && f5 <= 0.0f) {
                    f6 = (i4 - i52) + f5;
                }
                float f7 = f6;
                if (i5 < 0) {
                    adx.a("negative initial offset");
                }
                int i73 = -i5;
                s8z s8zVar2 = (s8z) xw3Var.h();
                int i74 = i5;
                int i75 = (s8zVar2 == null || (r8zVar2 = (r8z) tx3.B(s8zVar2.b)) == null) ? 0 : r8zVar2.f30051a;
                s8z s8zVar3 = (s8z) xw3Var.k();
                if (s8zVar3 != null) {
                    r8z[] r8zVarArr2 = s8zVar3.b;
                    f = f7;
                    r8z r8zVar3 = r8zVarArr2.length == 0 ? null : r8zVarArr2[r8zVarArr2.length - 1];
                    i6 = r8zVar3 != null ? r8zVar3.f30051a : 0;
                    iArr = mutableIntListT.f45342a;
                    i7 = mutableIntListT.b;
                    i8 = 0;
                    list = null;
                    while (i8 < i7) {
                        int i76 = i7;
                        i41 = iArr[i8];
                        if (i41 >= 0 || i41 >= i75) {
                            m8zVar3 = m8zVar5;
                        } else {
                            int i77 = y8zVar2.i;
                            int iE = y8zVar2.e(i41);
                            m8z m8zVar6 = m8zVar5;
                            r8z r8zVarN1 = m8zVar6.n1(i41, n8zVar.a(0, iE), 0, iE, m8zVar5.e);
                            m8zVar3 = m8zVar6;
                            List arrayList5 = list == null ? new ArrayList() : list;
                            arrayList5.add(r8zVarN1);
                            list = arrayList5;
                        }
                        i8++;
                        m8zVar5 = m8zVar3;
                        i7 = i76;
                        i75 = i75;
                    }
                    int i78 = i75;
                    m8zVar = m8zVar5;
                    if (list == null) {
                        list = iun.f15405a;
                    }
                    list2 = list;
                    if (zM || q8zVar2 == null) {
                        i9 = i6;
                        arrayList = null;
                    } else {
                        List list4 = q8zVar2.n;
                        if (list4.isEmpty()) {
                            i9 = i6;
                            arrayList = null;
                        } else {
                            int size8 = list4.size();
                            while (true) {
                                size8--;
                                if (-1 >= size8) {
                                    r8zVar = null;
                                    break;
                                }
                                if (((r8z) list4.get(size8)).f30051a > i6 && (size8 == 0 || ((r8z) list4.get(size8 - 1)).f30051a <= i6)) {
                                    r8zVar = (r8z) list4.get(size8);
                                    break;
                                }
                            }
                            r8z r8zVar4 = (r8z) CollectionsKt.d0(list4);
                            s8z s8zVar4 = (s8z) CollectionsKt.f0(xw3Var);
                            int i79 = s8zVar4 != null ? s8zVar4.f31827a + 1 : 0;
                            if (r8zVar != null) {
                                int i80 = r8zVar.f30051a;
                                i9 = i6;
                                int iMin = Math.min(r8zVar4.f30051a, iB2 - 1);
                                if (i80 <= iMin) {
                                    arrayList = null;
                                    while (true) {
                                        if (arrayList != null) {
                                            j8zVar2 = j8zVar2;
                                            int size9 = arrayList.size();
                                            f4 = f4;
                                            int i81 = 0;
                                            while (true) {
                                                if (i81 < size9) {
                                                    int i82 = i81;
                                                    r8z[] r8zVarArr3 = ((s8z) arrayList.get(i81)).b;
                                                    int i83 = size9;
                                                    int length5 = r8zVarArr3.length;
                                                    int i84 = 0;
                                                    while (true) {
                                                        if (i84 < length5) {
                                                            int i85 = i84;
                                                            if (r8zVarArr3[i85].f30051a != i80) {
                                                                i84 = i85 + 1;
                                                            }
                                                        } else {
                                                            i81 = i82 + 1;
                                                            size9 = i83;
                                                        }
                                                    }
                                                }
                                                if (i80 != iMin) {
                                                    break;
                                                }
                                                i80++;
                                                j8zVar2 = j8zVar2;
                                                f4 = f4;
                                            }
                                        } else {
                                            f4 = f4;
                                            j8zVar2 = j8zVar2;
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        s8z s8zVarB4 = n8zVar.b(i79);
                                        i79++;
                                        arrayList.add(s8zVarB4);
                                        if (i80 != iMin) {
                                            break;
                                            break;
                                        }
                                        i80++;
                                        j8zVar2 = j8zVar2;
                                        f4 = f4;
                                    }
                                }
                            } else {
                                i9 = i6;
                            }
                            arrayList = null;
                        }
                    }
                    if (arrayList == null) {
                        arrayList = iun.f15405a;
                    }
                    iArr2 = mutableIntListT.f45342a;
                    i10 = mutableIntListT.b;
                    i11 = 0;
                    arrayList2 = null;
                    while (i11 < i10) {
                        i39 = iArr2[i11];
                        if (i9 + 1 <= i39 || i39 >= iB2) {
                            i40 = i10;
                            m8zVar2 = m8zVar;
                            iArr5 = iArr2;
                        } else if (zM) {
                            int size10 = arrayList.size();
                            int i86 = 0;
                            while (true) {
                                if (i86 < size10) {
                                    i40 = i10;
                                    r8z[] r8zVarArr4 = ((s8z) arrayList.get(i86)).b;
                                    iArr5 = iArr2;
                                    int length6 = r8zVarArr4.length;
                                    int i87 = 0;
                                    while (true) {
                                        if (i87 < length6) {
                                            int i88 = i87;
                                            if (r8zVarArr4[i88].f30051a == i39) {
                                                m8zVar2 = m8zVar;
                                            } else {
                                                i87 = i88 + 1;
                                            }
                                        } else {
                                            i86++;
                                            iArr2 = iArr5;
                                            i10 = i40;
                                        }
                                    }
                                } else {
                                    i40 = i10;
                                    iArr5 = iArr2;
                                    int i89 = y8zVar2.i;
                                    int iE2 = y8zVar2.e(i39);
                                    m8zVar2 = m8zVar;
                                    r8z r8zVarN2 = m8zVar2.n1(i39, n8zVar.a(0, iE2), 0, iE2, m8zVar.e);
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    List list5 = arrayList2;
                                    list5.add(r8zVarN2);
                                    arrayList2 = list5;
                                }
                            }
                        } else {
                            i40 = i10;
                            iArr5 = iArr2;
                            int i810 = y8zVar2.i;
                            int iE3 = y8zVar2.e(i39);
                            m8zVar2 = m8zVar;
                            r8z r8zVarN3 = m8zVar2.n1(i39, n8zVar.a(0, iE3), 0, iE3, m8zVar.e);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            List list6 = arrayList2;
                            list6.add(r8zVarN3);
                            arrayList2 = list6;
                        }
                        i11++;
                        iArr2 = iArr5;
                        m8zVar = m8zVar2;
                        i10 = i40;
                    }
                    m8z m8zVar7 = m8zVar;
                    if (arrayList2 == null) {
                        arrayList2 = iun.f15405a;
                    }
                    list3 = arrayList2;
                    if (i46 <= 0 || iT5 < 0) {
                        iB = xw3Var.b();
                        i12 = i74;
                        s8zVar = s8zVar2;
                        i13 = 0;
                        while (i13 < iB) {
                            int i90 = ((s8z) xw3Var.get(i13)).h;
                            if (i12 != 0 || i90 > i12 || i13 == xw3Var.b() - 1) {
                                break;
                            }
                            i12 -= i90;
                            i13++;
                            s8zVar = (s8z) xw3Var.get(i13);
                        }
                        i14 = i12;
                    } else {
                        i14 = i74;
                        s8zVar = s8zVar2;
                    }
                    if (z6) {
                        iG = p4e.i(jI);
                        j2 = jI;
                    } else {
                        j2 = jI;
                        iG = r4e.g(i3, j2);
                    }
                    iG2 = iG;
                    if (z6) {
                        iH = r4e.f(i3, j2);
                    } else {
                        iH = p4e.h(j2);
                    }
                    i15 = iH;
                    listQ0 = xw3Var;
                    if (!arrayList.isEmpty()) {
                        listQ0 = CollectionsKt.q0(xw3Var, arrayList);
                    }
                    if (z6) {
                        i16 = i15;
                    } else {
                        i16 = iG2;
                    }
                    if (i3 < Math.min(i16, iH2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && i73 != 0) {
                        adx.c("non-zero firstLineScrollOffset");
                    }
                    z2 = z;
                    length = 0;
                    i17 = 0;
                    for (size = listQ0.size(); i17 < size; size = size) {
                        length += ((s8z) listQ0.get(i17)).b.length;
                        i17++;
                    }
                    arrayList3 = new ArrayList(length);
                    if (z2) {
                        if (list2.isEmpty() || !list3.isEmpty()) {
                            adx.a("no items");
                        }
                        size7 = listQ0.size();
                        iArr3 = new int[size7];
                        for (i33 = 0; i33 < size7; i33++) {
                            iArr3[i33] = ((s8z) listQ0.get(i33)).g;
                        }
                        iArr4 = new int[size7];
                        if (z6) {
                            if (sw3Var != null) {
                                throw w6x.i("null verticalArrangement");
                            }
                            sw3Var.c(jbzVar, i16, iArr3, iArr4);
                        } else {
                            if (ow3Var != null) {
                                throw w6x.i("null horizontalArrangement");
                            }
                            ow3Var.b(jbzVar, i16, iArr3, k6z.f17794a, iArr4);
                        }
                        IntRange intRangeC = tx3.C(iArr4);
                        i34 = intRangeC.b;
                        i35 = intRangeC.c;
                        if ((i35 > 0 && i34 >= 0) || (i35 < 0 && i34 <= 0)) {
                            i36 = 0;
                            while (true) {
                                r8zVarArrA2 = ((s8z) listQ0.get(i36)).a(iArr4[i36], iG2, i15);
                                length3 = r8zVarArrA2.length;
                                i37 = i35;
                                i38 = 0;
                                while (i38 < length3) {
                                    int i91 = i38;
                                    arrayList3.add(r8zVarArrA2[i91]);
                                    i38 = i91 + 1;
                                }
                                if (i36 == i34) {
                                    break;
                                }
                                i36 += i37;
                                i35 = i37;
                            }
                        }
                    } else {
                        iB2 = iB2;
                        i3 = i3;
                        s8zVar = s8zVar;
                        i15 = i15;
                        j = j;
                        size2 = list2.size() - 1;
                        if (size2 >= 0) {
                            iM2 = i73;
                            while (true) {
                                i21 = size2 - 1;
                                r8z r8zVar5 = (r8z) list2.get(size2);
                                iM2 -= r8zVar5.m();
                                r8zVar5.a(iM2, 0, iG2, i15);
                                arrayList3.add(r8zVar5);
                                if (i21 < 0) {
                                    break;
                                }
                                size2 = i21;
                            }
                        }
                        size3 = listQ0.size();
                        iM = i73;
                        i18 = 0;
                        while (i18 < size3) {
                            s8z s8zVar5 = (s8z) listQ0.get(i18);
                            r8zVarArrA = s8zVar5.a(iM, iG2, i15);
                            int i92 = size3;
                            int i93 = i18;
                            i20 = 0;
                            for (length2 = r8zVarArrA.length; i20 < length2; length2 = length2) {
                                arrayList3.add(r8zVarArrA[i20]);
                                i20++;
                            }
                            iM += s8zVar5.h;
                            i18 = i93 + 1;
                            size3 = i92;
                        }
                        size4 = list3.size();
                        for (i19 = 0; i19 < size4; i19++) {
                            r8z r8zVar6 = (r8z) list3.get(i19);
                            r8zVar6.a(iM, 0, iG2, i15);
                            arrayList3.add(r8zVar6);
                            iM += r8zVar6.m();
                        }
                    }
                    dbzVar.d((int) f4, iG2, i15, arrayList3, cVar, m8zVar7, z6, zM, length4, z4, i14, i3, vneVar, afvVar);
                    i22 = i14;
                    i23 = i3;
                    if (zM) {
                        i24 = length4;
                        i25 = i22;
                        i26 = i23;
                    } else {
                        i26 = i23;
                        jB = dbzVar.b();
                        i24 = length4;
                        i25 = i22;
                        if (!qkx.a(jB, 0L)) {
                            if (z6) {
                                i30 = i15;
                            } else {
                                i30 = iG2;
                            }
                            f2 = f4;
                            iG2 = r4e.g(Math.max(iG2, (int) (jB >> 32)), j2);
                            iF = r4e.f(Math.max(i15, (int) (jB & 4294967295L)), j2);
                            if (z6) {
                                i31 = iF;
                            } else {
                                i31 = iG2;
                            }
                            if (i31 != i30) {
                                size6 = arrayList3.size();
                                for (i32 = 0; i32 < size6; i32++) {
                                    r8z r8zVar7 = (r8z) arrayList3.get(i32);
                                    r8zVar7.t = i31;
                                    r8zVar7.v = r8zVar7.g + i31;
                                }
                            }
                        }
                        int i94 = iG2;
                        j8zVar2.b.getClass();
                        i27 = i9;
                        int i95 = iF;
                        listV = ucx.V(this.j, i78, i27, arrayList3, IntListKt.f45341a, i46, i94, i95, z6, new okw(n8zVar, m8zVar7, (byte) 19));
                        if (i27 == iB2 - 1 || i26 > iH2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        p8z p8zVar = new p8z(pz40Var, arrayList3, listV, zM, (byte) 0);
                        int iG4 = r4e.g(i94 + i42, j);
                        int iF3 = r4e.f(i95 + iT4, j);
                        lun lunVar2 = lun.f20680a;
                        lunVar2.getClass();
                        uj30 uj30VarI0 = c5n0Var2.i0(iG4, iF3, lunVar2, p8zVar);
                        List listJ0 = j120.j0(i78, i27, arrayList3, listV);
                        if (z6) {
                            ma80Var = ma80.f21447a;
                        } else {
                            ma80Var = ma80.b;
                        }
                        ma80 ma80Var2 = ma80Var;
                        size5 = listV.size();
                        int i96 = i24;
                        i29 = 0;
                        for (i28 = 0; i28 < size5; i28++) {
                            i29 += ((r8z) listV.get(i28)).o;
                        }
                        c5n0Var = c5n0Var2;
                        q8zVar = new q8z(s8zVar, i25, z3, f2, uj30VarI0, f, z8, vneVar, jbzVar, i96, function3, adwVar, i29, listJ0, i51, i54, iB2, ma80Var2, i45, iT5);
                    }
                    f2 = f4;
                    iF = i15;
                    int i97 = iG2;
                    j8zVar2.b.getClass();
                    i27 = i9;
                    int i98 = iF;
                    listV = ucx.V(this.j, i78, i27, arrayList3, IntListKt.f45341a, i46, i97, i98, z6, new okw(n8zVar, m8zVar7, (byte) 19));
                    if (i27 == iB2 - 1) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    p8z p8zVar2 = new p8z(pz40Var, arrayList3, listV, zM, (byte) 0);
                    int iG5 = r4e.g(i97 + i42, j);
                    int iF4 = r4e.f(i98 + iT4, j);
                    lun lunVar3 = lun.f20680a;
                    lunVar3.getClass();
                    uj30 uj30VarI1 = c5n0Var2.i0(iG5, iF4, lunVar3, p8zVar2);
                    List listJ1 = j120.j0(i78, i27, arrayList3, listV);
                    if (z6) {
                        ma80Var = ma80.f21447a;
                    } else {
                        ma80Var = ma80.b;
                    }
                    ma80 ma80Var3 = ma80Var;
                    size5 = listV.size();
                    int i99 = i24;
                    i29 = 0;
                    while (i28 < size5) {
                        i29 += ((r8z) listV.get(i28)).o;
                    }
                    c5n0Var = c5n0Var2;
                    q8zVar = new q8z(s8zVar, i25, z3, f2, uj30VarI1, f, z8, vneVar, jbzVar, i99, function3, adwVar, i29, listJ1, i51, i54, iB2, ma80Var3, i45, iT5);
                } else {
                    f = f7;
                }
                iArr = mutableIntListT.f45342a;
                i7 = mutableIntListT.b;
                i8 = 0;
                list = null;
                while (i8 < i7) {
                    int i710 = i7;
                    i41 = iArr[i8];
                    if (i41 >= 0) {
                        m8zVar3 = m8zVar5;
                    } else {
                        m8zVar3 = m8zVar5;
                    }
                    i8++;
                    m8zVar5 = m8zVar3;
                    i7 = i710;
                    i75 = i75;
                }
                int i711 = i75;
                m8zVar = m8zVar5;
                if (list == null) {
                    list = iun.f15405a;
                }
                list2 = list;
                if (zM) {
                    i9 = i6;
                    arrayList = null;
                } else {
                    i9 = i6;
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = iun.f15405a;
                }
                iArr2 = mutableIntListT.f45342a;
                i10 = mutableIntListT.b;
                i11 = 0;
                arrayList2 = null;
                while (i11 < i10) {
                    i39 = iArr2[i11];
                    if (i9 + 1 <= i39) {
                        i40 = i10;
                        m8zVar2 = m8zVar;
                        iArr5 = iArr2;
                    } else {
                        i40 = i10;
                        m8zVar2 = m8zVar;
                        iArr5 = iArr2;
                    }
                    i11++;
                    iArr2 = iArr5;
                    m8zVar = m8zVar2;
                    i10 = i40;
                }
                m8z m8zVar8 = m8zVar;
                if (arrayList2 == null) {
                    arrayList2 = iun.f15405a;
                }
                list3 = arrayList2;
                if (i46 <= 0) {
                    iB = xw3Var.b();
                    i12 = i74;
                    s8zVar = s8zVar2;
                    i13 = 0;
                    while (i13 < iB) {
                        int i910 = ((s8z) xw3Var.get(i13)).h;
                        if (i12 != 0) {
                            break;
                        }
                        break;
                    }
                    i14 = i12;
                } else {
                    iB = xw3Var.b();
                    i12 = i74;
                    s8zVar = s8zVar2;
                    i13 = 0;
                    while (i13 < iB) {
                        int i911 = ((s8z) xw3Var.get(i13)).h;
                        if (i12 != 0) {
                            break;
                            break;
                        }
                        break;
                        break;
                    }
                    i14 = i12;
                }
                if (z6) {
                    iG = p4e.i(jI);
                    j2 = jI;
                } else {
                    j2 = jI;
                    iG = r4e.g(i3, j2);
                }
                iG2 = iG;
                if (z6) {
                    iH = r4e.f(i3, j2);
                } else {
                    iH = p4e.h(j2);
                }
                i15 = iH;
                listQ0 = xw3Var;
                if (!arrayList.isEmpty()) {
                    listQ0 = CollectionsKt.q0(xw3Var, arrayList);
                }
                if (z6) {
                    i16 = i15;
                } else {
                    i16 = iG2;
                }
                if (i3 < Math.min(i16, iH2)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    adx.c("non-zero firstLineScrollOffset");
                }
                z2 = z;
                length = 0;
                i17 = 0;
                while (i17 < size) {
                    length += ((s8z) listQ0.get(i17)).b.length;
                    i17++;
                }
                arrayList3 = new ArrayList(length);
                if (z2) {
                    if (list2.isEmpty()) {
                        adx.a("no items");
                    } else {
                        adx.a("no items");
                    }
                    size7 = listQ0.size();
                    iArr3 = new int[size7];
                    while (i33 < size7) {
                        iArr3[i33] = ((s8z) listQ0.get(i33)).g;
                    }
                    iArr4 = new int[size7];
                    if (z6) {
                        if (sw3Var != null) {
                            throw w6x.i("null verticalArrangement");
                        }
                        sw3Var.c(jbzVar, i16, iArr3, iArr4);
                    } else {
                        if (ow3Var != null) {
                            throw w6x.i("null horizontalArrangement");
                        }
                        ow3Var.b(jbzVar, i16, iArr3, k6z.f17794a, iArr4);
                    }
                    IntRange intRangeC2 = tx3.C(iArr4);
                    i34 = intRangeC2.b;
                    i35 = intRangeC2.c;
                    if (i35 > 0) {
                        i36 = 0;
                        while (true) {
                            r8zVarArrA2 = ((s8z) listQ0.get(i36)).a(iArr4[i36], iG2, i15);
                            length3 = r8zVarArrA2.length;
                            i37 = i35;
                            i38 = 0;
                            while (i38 < length3) {
                                int i912 = i38;
                                arrayList3.add(r8zVarArrA2[i912]);
                                i38 = i912 + 1;
                            }
                            if (i36 == i34) {
                                break;
                                break;
                            }
                            i36 += i37;
                            i35 = i37;
                        }
                    } else {
                        i36 = 0;
                        while (true) {
                            r8zVarArrA2 = ((s8z) listQ0.get(i36)).a(iArr4[i36], iG2, i15);
                            length3 = r8zVarArrA2.length;
                            i37 = i35;
                            i38 = 0;
                            while (i38 < length3) {
                                int i913 = i38;
                                arrayList3.add(r8zVarArrA2[i913]);
                                i38 = i913 + 1;
                            }
                            if (i36 == i34) {
                                break;
                                break;
                            }
                            i36 += i37;
                            i35 = i37;
                        }
                    }
                } else {
                    iB2 = iB2;
                    i3 = i3;
                    s8zVar = s8zVar;
                    i15 = i15;
                    j = j;
                    size2 = list2.size() - 1;
                    if (size2 >= 0) {
                        iM2 = i73;
                        while (true) {
                            i21 = size2 - 1;
                            r8z r8zVar8 = (r8z) list2.get(size2);
                            iM2 -= r8zVar8.m();
                            r8zVar8.a(iM2, 0, iG2, i15);
                            arrayList3.add(r8zVar8);
                            if (i21 < 0) {
                                break;
                                break;
                            }
                            size2 = i21;
                        }
                    }
                    size3 = listQ0.size();
                    iM = i73;
                    i18 = 0;
                    while (i18 < size3) {
                        s8z s8zVar6 = (s8z) listQ0.get(i18);
                        r8zVarArrA = s8zVar6.a(iM, iG2, i15);
                        int i914 = size3;
                        int i915 = i18;
                        i20 = 0;
                        while (i20 < length2) {
                            arrayList3.add(r8zVarArrA[i20]);
                            i20++;
                        }
                        iM += s8zVar6.h;
                        i18 = i915 + 1;
                        size3 = i914;
                    }
                    size4 = list3.size();
                    while (i19 < size4) {
                        r8z r8zVar9 = (r8z) list3.get(i19);
                        r8zVar9.a(iM, 0, iG2, i15);
                        arrayList3.add(r8zVar9);
                        iM += r8zVar9.m();
                    }
                }
                dbzVar.d((int) f4, iG2, i15, arrayList3, cVar, m8zVar8, z6, zM, length4, z4, i14, i3, vneVar, afvVar);
                i22 = i14;
                i23 = i3;
                if (zM) {
                    i26 = i23;
                    jB = dbzVar.b();
                    i24 = length4;
                    i25 = i22;
                    if (!qkx.a(jB, 0L)) {
                        if (z6) {
                            i30 = i15;
                        } else {
                            i30 = iG2;
                        }
                        f2 = f4;
                        iG2 = r4e.g(Math.max(iG2, (int) (jB >> 32)), j2);
                        iF = r4e.f(Math.max(i15, (int) (jB & 4294967295L)), j2);
                        if (z6) {
                            i31 = iF;
                        } else {
                            i31 = iG2;
                        }
                        if (i31 != i30) {
                            size6 = arrayList3.size();
                            while (i32 < size6) {
                                r8z r8zVar10 = (r8z) arrayList3.get(i32);
                                r8zVar10.t = i31;
                                r8zVar10.v = r8zVar10.g + i31;
                            }
                        }
                    }
                    int i916 = iG2;
                    j8zVar2.b.getClass();
                    i27 = i9;
                    int i917 = iF;
                    listV = ucx.V(this.j, i711, i27, arrayList3, IntListKt.f45341a, i46, i916, i917, z6, new okw(n8zVar, m8zVar8, (byte) 19));
                    if (i27 == iB2 - 1) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    p8z p8zVar3 = new p8z(pz40Var, arrayList3, listV, zM, (byte) 0);
                    int iG6 = r4e.g(i916 + i42, j);
                    int iF5 = r4e.f(i917 + iT4, j);
                    lun lunVar4 = lun.f20680a;
                    lunVar4.getClass();
                    uj30 uj30VarI2 = c5n0Var2.i0(iG6, iF5, lunVar4, p8zVar3);
                    List listJ2 = j120.j0(i711, i27, arrayList3, listV);
                    if (z6) {
                        ma80Var = ma80.f21447a;
                    } else {
                        ma80Var = ma80.b;
                    }
                    ma80 ma80Var4 = ma80Var;
                    size5 = listV.size();
                    int i918 = i24;
                    i29 = 0;
                    while (i28 < size5) {
                        i29 += ((r8z) listV.get(i28)).o;
                    }
                    c5n0Var = c5n0Var2;
                    q8zVar = new q8z(s8zVar, i25, z3, f2, uj30VarI2, f, z8, vneVar, jbzVar, i918, function3, adwVar, i29, listJ2, i51, i54, iB2, ma80Var4, i45, iT5);
                } else {
                    i24 = length4;
                    i25 = i22;
                    i26 = i23;
                }
                f2 = f4;
                iF = i15;
                int i919 = iG2;
                j8zVar2.b.getClass();
                i27 = i9;
                int i9110 = iF;
                listV = ucx.V(this.j, i711, i27, arrayList3, IntListKt.f45341a, i46, i919, i9110, z6, new okw(n8zVar, m8zVar8, (byte) 19));
                if (i27 == iB2 - 1) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                p8z p8zVar4 = new p8z(pz40Var, arrayList3, listV, zM, (byte) 0);
                int iG7 = r4e.g(i919 + i42, j);
                int iF6 = r4e.f(i9110 + iT4, j);
                lun lunVar5 = lun.f20680a;
                lunVar5.getClass();
                uj30 uj30VarI3 = c5n0Var2.i0(iG7, iF6, lunVar5, p8zVar4);
                List listJ3 = j120.j0(i711, i27, arrayList3, listV);
                if (z6) {
                    ma80Var = ma80.f21447a;
                } else {
                    ma80Var = ma80.b;
                }
                ma80 ma80Var5 = ma80Var;
                size5 = listV.size();
                int i9111 = i24;
                i29 = 0;
                while (i28 < size5) {
                    i29 += ((r8z) listV.get(i28)).o;
                }
                c5n0Var = c5n0Var2;
                q8zVar = new q8z(s8zVar, i25, z3, f2, uj30VarI3, f, z8, vneVar, jbzVar, i9111, function3, adwVar, i29, listJ3, i51, i54, iB2, ma80Var5, i45, iT5);
            }
            d9zVar.g(q8zVar, c5n0Var.M(), false);
            ovj ovjVar = d9zVar.f5722a;
            return q8zVar;
        } catch (Throwable th) {
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            throw th;
        }
    }
}
