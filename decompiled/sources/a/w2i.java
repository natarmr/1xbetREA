package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class w2i implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c4i f38449a;
    public final /* synthetic */ u3i b;
    public final /* synthetic */ u3i c;
    public final /* synthetic */ u3i d;
    public final /* synthetic */ u3i e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public w2i(c4i c4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, u3i u3iVar4, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f38449a = c4iVar;
        this.b = u3iVar;
        this.c = u3iVar2;
        this.d = u3iVar3;
        this.e = u3iVar4;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0087  */
    /* JADX WARN: Code duplicated, block: B:22:0x0091  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:40:0x0105 A[LOOP:0: B:38:0x00ff->B:40:0x0105, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0111  */
    /* JADX WARN: Code duplicated, block: B:43:0x0114  */
    /* JADX WARN: Code duplicated, block: B:45:0x0117  */
    /* JADX WARN: Code duplicated, block: B:46:0x011a  */
    /* JADX WARN: Code duplicated, block: B:49:0x011e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0121  */
    /* JADX WARN: Code duplicated, block: B:52:0x0124  */
    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Code duplicated, block: B:57:0x0138  */
    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Code duplicated, block: B:60:0x013d  */
    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        pu90 pu90VarS;
        int i;
        int i2;
        pu90 pu90VarS2;
        int i3;
        final pu90 pu90VarS3;
        int i4;
        pu90 pu90VarS4;
        int i5;
        final pu90 pu90VarS5;
        Iterator it;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        pj30 pj30Var;
        pj30 pj30Var2;
        pj30 pj30Var3;
        list.getClass();
        final int i13 = p4e.i(j);
        c4i c4iVar = this.f38449a;
        o0x o0xVar = c4iVar.c;
        pu90 pu90VarS6 = null;
        if (o0xVar == null || !c4iVar.b) {
            pu90VarS = null;
            i = 0;
        } else {
            pu90VarS = ((pj30) list.get(0)).S(p4e.b(j, 0, 0, 0, 0, 10));
            i = 1;
        }
        if (o0xVar != null) {
            i2 = i + 1;
            pu90VarS2 = ((pj30) list.get(i)).S(p4e.b(j, 0, 0, 0, 0, 10));
        } else {
            i2 = i;
            pu90VarS2 = null;
        }
        int i14 = i2 + 1;
        pj30 pj30Var4 = (pj30) list.get(i2);
        if (this.b instanceof v3i) {
            i3 = i2 + 2;
            pj30 pj30Var5 = (pj30) CollectionsKt.W(i14, list);
            if (pj30Var5 != null) {
                pu90VarS3 = pj30Var5.S(p4e.b(j, 0, 0, 0, 0, 10));
            }
            if (this.c instanceof z3i) {
                i4 = i3 + 1;
                pj30Var3 = (pj30) CollectionsKt.W(i3, list);
                if (pj30Var3 != null) {
                    pu90VarS4 = pj30Var3.S(p4e.b(j, 0, 0, 0, 0, 10));
                }
                if (this.d instanceof x3i) {
                    i5 = i4 + 1;
                    pj30Var2 = (pj30) CollectionsKt.W(i4, list);
                    if (pj30Var2 != null) {
                        pu90VarS5 = pj30Var2.S(p4e.b(j, 0, 0, 0, 0, 10));
                    }
                    if ((this.e instanceof s3i) && (pj30Var = (pj30) CollectionsKt.W(i5, list)) != null) {
                        pu90VarS6 = pj30Var.S(p4e.b(j, 0, 0, 0, 0, 10));
                    }
                    final pu90 pu90Var = pu90VarS6;
                    it = ((ArrayList) tx3.z(new pu90[]{pu90VarS3, pu90VarS4, pu90VarS5, pu90Var})).iterator();
                    i6 = 0;
                    while (it.hasNext()) {
                        i6 += ((pu90) it.next()).f27604a;
                    }
                    if (pu90VarS != null) {
                        i7 = pu90VarS.f27604a;
                    } else {
                        i7 = 0;
                    }
                    if (pu90VarS2 != null) {
                        i8 = pu90VarS2.f27604a;
                    } else {
                        i8 = 0;
                    }
                    int i15 = i7 + i8;
                    if (pu90VarS != null) {
                        i9 = this.g;
                    } else {
                        i9 = 0;
                    }
                    if (pu90VarS2 != null) {
                        i10 = this.h;
                    } else {
                        i10 = 0;
                    }
                    final pu90 pu90Var2 = pu90VarS4;
                    final pu90 pu90Var3 = pu90VarS;
                    final int i16 = this.f;
                    i11 = (((((i13 - i16) - i15) - i9) - i10) - this.i) - i6;
                    if (i11 < 0) {
                        i12 = 0;
                    } else {
                        i12 = i11;
                    }
                    if (i11 < 0) {
                        i11 = 0;
                    }
                    final pu90 pu90VarS7 = pj30Var4.S(r4e.b(i12, i11, 0, 0, 12));
                    final pu90 pu90Var4 = pu90VarS2;
                    final int i17 = this.k;
                    final int i18 = this.h;
                    final int i19 = this.g;
                    final int i20 = this.h;
                    return vj30.x(vj30Var, i13, this.j, new Function1() { // from class: a.v2i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ou90 ou90Var = (ou90) obj;
                            ou90Var.getClass();
                            int i21 = i16;
                            pu90 pu90Var5 = pu90Var3;
                            int i22 = i17;
                            if (pu90Var5 != null) {
                                ou90Var.m(pu90Var5, i21, i22 - (pu90Var5.b / 2), 0.0f);
                                i21 = i21 + pu90Var5.f27604a + i19;
                            }
                            pu90 pu90Var6 = pu90Var4;
                            if (pu90Var6 != null) {
                                ou90Var.m(pu90Var6, i21, i22 - (pu90Var6.b / 2), 0.0f);
                                i21 = i21 + pu90Var6.f27604a + i20;
                            }
                            pu90 pu90Var7 = pu90VarS7;
                            ou90Var.m(pu90Var7, i21, i22 - (pu90Var7.b / 2), 0.0f);
                            ah30 ah30Var = new ah30(tx3.z(new pu90[]{pu90VarS3, pu90Var2, pu90VarS5, pu90Var}));
                            int i23 = i13 - i18;
                            Iterator it2 = ah30Var.iterator();
                            while (true) {
                                ListIterator listIterator = (ListIterator) ((xag0) it2).b;
                                if (!listIterator.hasPrevious()) {
                                    return Unit.f46060a;
                                }
                                pu90 pu90Var8 = (pu90) listIterator.previous();
                                i23 -= pu90Var8.f27604a;
                                ou90Var.m(pu90Var8, i23, i22 - (pu90Var8.b / 2), 0.0f);
                            }
                        }
                    });
                }
                i5 = i4;
                pu90VarS5 = null;
                if (this.e instanceof s3i) {
                    pu90VarS6 = pj30Var.S(p4e.b(j, 0, 0, 0, 0, 10));
                }
                final pu90 pu90Var5 = pu90VarS6;
                it = ((ArrayList) tx3.z(new pu90[]{pu90VarS3, pu90VarS4, pu90VarS5, pu90Var5})).iterator();
                i6 = 0;
                while (it.hasNext()) {
                    i6 += ((pu90) it.next()).f27604a;
                }
                if (pu90VarS != null) {
                    i7 = pu90VarS.f27604a;
                } else {
                    i7 = 0;
                }
                if (pu90VarS2 != null) {
                    i8 = pu90VarS2.f27604a;
                } else {
                    i8 = 0;
                }
                int i110 = i7 + i8;
                if (pu90VarS != null) {
                    i9 = this.g;
                } else {
                    i9 = 0;
                }
                if (pu90VarS2 != null) {
                    i10 = this.h;
                } else {
                    i10 = 0;
                }
                final pu90 pu90Var6 = pu90VarS4;
                final pu90 pu90Var7 = pu90VarS;
                final int i111 = this.f;
                i11 = (((((i13 - i111) - i110) - i9) - i10) - this.i) - i6;
                if (i11 < 0) {
                    i12 = 0;
                } else {
                    i12 = i11;
                }
                if (i11 < 0) {
                    i11 = 0;
                }
                final pu90 pu90VarS8 = pj30Var4.S(r4e.b(i12, i11, 0, 0, 12));
                final pu90 pu90Var8 = pu90VarS2;
                final int i112 = this.k;
                final int i113 = this.h;
                final int i114 = this.g;
                final int i21 = this.h;
                return vj30.x(vj30Var, i13, this.j, new Function1() { // from class: a.v2i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ou90 ou90Var = (ou90) obj;
                        ou90Var.getClass();
                        int i22 = i111;
                        pu90 pu90Var9 = pu90Var7;
                        int i23 = i112;
                        if (pu90Var9 != null) {
                            ou90Var.m(pu90Var9, i22, i23 - (pu90Var9.b / 2), 0.0f);
                            i22 = i22 + pu90Var9.f27604a + i114;
                        }
                        pu90 pu90Var10 = pu90Var8;
                        if (pu90Var10 != null) {
                            ou90Var.m(pu90Var10, i22, i23 - (pu90Var10.b / 2), 0.0f);
                            i22 = i22 + pu90Var10.f27604a + i21;
                        }
                        pu90 pu90Var11 = pu90VarS8;
                        ou90Var.m(pu90Var11, i22, i23 - (pu90Var11.b / 2), 0.0f);
                        ah30 ah30Var = new ah30(tx3.z(new pu90[]{pu90VarS3, pu90Var6, pu90VarS5, pu90Var5}));
                        int i24 = i13 - i113;
                        Iterator it2 = ah30Var.iterator();
                        while (true) {
                            ListIterator listIterator = (ListIterator) ((xag0) it2).b;
                            if (!listIterator.hasPrevious()) {
                                return Unit.f46060a;
                            }
                            pu90 pu90Var12 = (pu90) listIterator.previous();
                            i24 -= pu90Var12.f27604a;
                            ou90Var.m(pu90Var12, i24, i23 - (pu90Var12.b / 2), 0.0f);
                        }
                    }
                });
            }
            i4 = i3;
            pu90VarS4 = null;
            if (this.d instanceof x3i) {
                i5 = i4 + 1;
                pj30Var2 = (pj30) CollectionsKt.W(i4, list);
                if (pj30Var2 != null) {
                    pu90VarS5 = pj30Var2.S(p4e.b(j, 0, 0, 0, 0, 10));
                }
                if (this.e instanceof s3i) {
                    pu90VarS6 = pj30Var.S(p4e.b(j, 0, 0, 0, 0, 10));
                }
                final pu90 pu90Var9 = pu90VarS6;
                it = ((ArrayList) tx3.z(new pu90[]{pu90VarS3, pu90VarS4, pu90VarS5, pu90Var9})).iterator();
                i6 = 0;
                while (it.hasNext()) {
                    i6 += ((pu90) it.next()).f27604a;
                }
                if (pu90VarS != null) {
                    i7 = pu90VarS.f27604a;
                } else {
                    i7 = 0;
                }
                if (pu90VarS2 != null) {
                    i8 = pu90VarS2.f27604a;
                } else {
                    i8 = 0;
                }
                int i115 = i7 + i8;
                if (pu90VarS != null) {
                    i9 = this.g;
                } else {
                    i9 = 0;
                }
                if (pu90VarS2 != null) {
                    i10 = this.h;
                } else {
                    i10 = 0;
                }
                final pu90 pu90Var10 = pu90VarS4;
                final pu90 pu90Var11 = pu90VarS;
                final int i116 = this.f;
                i11 = (((((i13 - i116) - i115) - i9) - i10) - this.i) - i6;
                if (i11 < 0) {
                    i12 = 0;
                } else {
                    i12 = i11;
                }
                if (i11 < 0) {
                    i11 = 0;
                }
                final pu90 pu90VarS9 = pj30Var4.S(r4e.b(i12, i11, 0, 0, 12));
                final pu90 pu90Var12 = pu90VarS2;
                final int i117 = this.k;
                final int i118 = this.h;
                final int i119 = this.g;
                final int i22 = this.h;
                return vj30.x(vj30Var, i13, this.j, new Function1() { // from class: a.v2i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ou90 ou90Var = (ou90) obj;
                        ou90Var.getClass();
                        int i23 = i116;
                        pu90 pu90Var13 = pu90Var11;
                        int i24 = i117;
                        if (pu90Var13 != null) {
                            ou90Var.m(pu90Var13, i23, i24 - (pu90Var13.b / 2), 0.0f);
                            i23 = i23 + pu90Var13.f27604a + i119;
                        }
                        pu90 pu90Var14 = pu90Var12;
                        if (pu90Var14 != null) {
                            ou90Var.m(pu90Var14, i23, i24 - (pu90Var14.b / 2), 0.0f);
                            i23 = i23 + pu90Var14.f27604a + i22;
                        }
                        pu90 pu90Var15 = pu90VarS9;
                        ou90Var.m(pu90Var15, i23, i24 - (pu90Var15.b / 2), 0.0f);
                        ah30 ah30Var = new ah30(tx3.z(new pu90[]{pu90VarS3, pu90Var10, pu90VarS5, pu90Var9}));
                        int i25 = i13 - i118;
                        Iterator it2 = ah30Var.iterator();
                        while (true) {
                            ListIterator listIterator = (ListIterator) ((xag0) it2).b;
                            if (!listIterator.hasPrevious()) {
                                return Unit.f46060a;
                            }
                            pu90 pu90Var16 = (pu90) listIterator.previous();
                            i25 -= pu90Var16.f27604a;
                            ou90Var.m(pu90Var16, i25, i24 - (pu90Var16.b / 2), 0.0f);
                        }
                    }
                });
            }
            i5 = i4;
            pu90VarS5 = null;
            if (this.e instanceof s3i) {
                pu90VarS6 = pj30Var.S(p4e.b(j, 0, 0, 0, 0, 10));
            }
            final pu90 pu90Var13 = pu90VarS6;
            it = ((ArrayList) tx3.z(new pu90[]{pu90VarS3, pu90VarS4, pu90VarS5, pu90Var13})).iterator();
            i6 = 0;
            while (it.hasNext()) {
                i6 += ((pu90) it.next()).f27604a;
            }
            if (pu90VarS != null) {
                i7 = pu90VarS.f27604a;
            } else {
                i7 = 0;
            }
            if (pu90VarS2 != null) {
                i8 = pu90VarS2.f27604a;
            } else {
                i8 = 0;
            }
            int i1110 = i7 + i8;
            if (pu90VarS != null) {
                i9 = this.g;
            } else {
                i9 = 0;
            }
            if (pu90VarS2 != null) {
                i10 = this.h;
            } else {
                i10 = 0;
            }
            final pu90 pu90Var14 = pu90VarS4;
            final pu90 pu90Var15 = pu90VarS;
            final int i1111 = this.f;
            i11 = (((((i13 - i1111) - i1110) - i9) - i10) - this.i) - i6;
            if (i11 < 0) {
                i12 = 0;
            } else {
                i12 = i11;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            final pu90 pu90VarS10 = pj30Var4.S(r4e.b(i12, i11, 0, 0, 12));
            final pu90 pu90Var16 = pu90VarS2;
            final int i1112 = this.k;
            final int i1113 = this.h;
            final int i1114 = this.g;
            final int i23 = this.h;
            return vj30.x(vj30Var, i13, this.j, new Function1() { // from class: a.v2i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ou90 ou90Var = (ou90) obj;
                    ou90Var.getClass();
                    int i24 = i1111;
                    pu90 pu90Var17 = pu90Var15;
                    int i25 = i1112;
                    if (pu90Var17 != null) {
                        ou90Var.m(pu90Var17, i24, i25 - (pu90Var17.b / 2), 0.0f);
                        i24 = i24 + pu90Var17.f27604a + i1114;
                    }
                    pu90 pu90Var18 = pu90Var16;
                    if (pu90Var18 != null) {
                        ou90Var.m(pu90Var18, i24, i25 - (pu90Var18.b / 2), 0.0f);
                        i24 = i24 + pu90Var18.f27604a + i23;
                    }
                    pu90 pu90Var19 = pu90VarS10;
                    ou90Var.m(pu90Var19, i24, i25 - (pu90Var19.b / 2), 0.0f);
                    ah30 ah30Var = new ah30(tx3.z(new pu90[]{pu90VarS3, pu90Var14, pu90VarS5, pu90Var13}));
                    int i26 = i13 - i1113;
                    Iterator it2 = ah30Var.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((xag0) it2).b;
                        if (!listIterator.hasPrevious()) {
                            return Unit.f46060a;
                        }
                        pu90 pu90Var110 = (pu90) listIterator.previous();
                        i26 -= pu90Var110.f27604a;
                        ou90Var.m(pu90Var110, i26, i25 - (pu90Var110.b / 2), 0.0f);
                    }
                }
            });
        }
        i3 = i14;
        pu90VarS3 = null;
        if (this.c instanceof z3i) {
            i4 = i3 + 1;
            pj30Var3 = (pj30) CollectionsKt.W(i3, list);
            if (pj30Var3 != null) {
                pu90VarS4 = pj30Var3.S(p4e.b(j, 0, 0, 0, 0, 10));
            }
            if (this.d instanceof x3i) {
                i5 = i4 + 1;
                pj30Var2 = (pj30) CollectionsKt.W(i4, list);
                if (pj30Var2 != null) {
                    pu90VarS5 = pj30Var2.S(p4e.b(j, 0, 0, 0, 0, 10));
                }
                if (this.e instanceof s3i) {
                    pu90VarS6 = pj30Var.S(p4e.b(j, 0, 0, 0, 0, 10));
                }
                final pu90 pu90Var17 = pu90VarS6;
                it = ((ArrayList) tx3.z(new pu90[]{pu90VarS3, pu90VarS4, pu90VarS5, pu90Var17})).iterator();
                i6 = 0;
                while (it.hasNext()) {
                    i6 += ((pu90) it.next()).f27604a;
                }
                if (pu90VarS != null) {
                    i7 = pu90VarS.f27604a;
                } else {
                    i7 = 0;
                }
                if (pu90VarS2 != null) {
                    i8 = pu90VarS2.f27604a;
                } else {
                    i8 = 0;
                }
                int i1115 = i7 + i8;
                if (pu90VarS != null) {
                    i9 = this.g;
                } else {
                    i9 = 0;
                }
                if (pu90VarS2 != null) {
                    i10 = this.h;
                } else {
                    i10 = 0;
                }
                final pu90 pu90Var18 = pu90VarS4;
                final pu90 pu90Var19 = pu90VarS;
                final int i1116 = this.f;
                i11 = (((((i13 - i1116) - i1115) - i9) - i10) - this.i) - i6;
                if (i11 < 0) {
                    i12 = 0;
                } else {
                    i12 = i11;
                }
                if (i11 < 0) {
                    i11 = 0;
                }
                final pu90 pu90VarS11 = pj30Var4.S(r4e.b(i12, i11, 0, 0, 12));
                final pu90 pu90Var110 = pu90VarS2;
                final int i1117 = this.k;
                final int i1118 = this.h;
                final int i1119 = this.g;
                final int i24 = this.h;
                return vj30.x(vj30Var, i13, this.j, new Function1() { // from class: a.v2i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ou90 ou90Var = (ou90) obj;
                        ou90Var.getClass();
                        int i25 = i1116;
                        pu90 pu90Var111 = pu90Var19;
                        int i26 = i1117;
                        if (pu90Var111 != null) {
                            ou90Var.m(pu90Var111, i25, i26 - (pu90Var111.b / 2), 0.0f);
                            i25 = i25 + pu90Var111.f27604a + i1119;
                        }
                        pu90 pu90Var112 = pu90Var110;
                        if (pu90Var112 != null) {
                            ou90Var.m(pu90Var112, i25, i26 - (pu90Var112.b / 2), 0.0f);
                            i25 = i25 + pu90Var112.f27604a + i24;
                        }
                        pu90 pu90Var113 = pu90VarS11;
                        ou90Var.m(pu90Var113, i25, i26 - (pu90Var113.b / 2), 0.0f);
                        ah30 ah30Var = new ah30(tx3.z(new pu90[]{pu90VarS3, pu90Var18, pu90VarS5, pu90Var17}));
                        int i27 = i13 - i1118;
                        Iterator it2 = ah30Var.iterator();
                        while (true) {
                            ListIterator listIterator = (ListIterator) ((xag0) it2).b;
                            if (!listIterator.hasPrevious()) {
                                return Unit.f46060a;
                            }
                            pu90 pu90Var114 = (pu90) listIterator.previous();
                            i27 -= pu90Var114.f27604a;
                            ou90Var.m(pu90Var114, i27, i26 - (pu90Var114.b / 2), 0.0f);
                        }
                    }
                });
            }
            i5 = i4;
            pu90VarS5 = null;
            if (this.e instanceof s3i) {
                pu90VarS6 = pj30Var.S(p4e.b(j, 0, 0, 0, 0, 10));
            }
            final pu90 pu90Var111 = pu90VarS6;
            it = ((ArrayList) tx3.z(new pu90[]{pu90VarS3, pu90VarS4, pu90VarS5, pu90Var111})).iterator();
            i6 = 0;
            while (it.hasNext()) {
                i6 += ((pu90) it.next()).f27604a;
            }
            if (pu90VarS != null) {
                i7 = pu90VarS.f27604a;
            } else {
                i7 = 0;
            }
            if (pu90VarS2 != null) {
                i8 = pu90VarS2.f27604a;
            } else {
                i8 = 0;
            }
            int i11110 = i7 + i8;
            if (pu90VarS != null) {
                i9 = this.g;
            } else {
                i9 = 0;
            }
            if (pu90VarS2 != null) {
                i10 = this.h;
            } else {
                i10 = 0;
            }
            final pu90 pu90Var112 = pu90VarS4;
            final pu90 pu90Var113 = pu90VarS;
            final int i11111 = this.f;
            i11 = (((((i13 - i11111) - i11110) - i9) - i10) - this.i) - i6;
            if (i11 < 0) {
                i12 = 0;
            } else {
                i12 = i11;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            final pu90 pu90VarS12 = pj30Var4.S(r4e.b(i12, i11, 0, 0, 12));
            final pu90 pu90Var114 = pu90VarS2;
            final int i11112 = this.k;
            final int i11113 = this.h;
            final int i11114 = this.g;
            final int i25 = this.h;
            return vj30.x(vj30Var, i13, this.j, new Function1() { // from class: a.v2i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ou90 ou90Var = (ou90) obj;
                    ou90Var.getClass();
                    int i26 = i11111;
                    pu90 pu90Var115 = pu90Var113;
                    int i27 = i11112;
                    if (pu90Var115 != null) {
                        ou90Var.m(pu90Var115, i26, i27 - (pu90Var115.b / 2), 0.0f);
                        i26 = i26 + pu90Var115.f27604a + i11114;
                    }
                    pu90 pu90Var116 = pu90Var114;
                    if (pu90Var116 != null) {
                        ou90Var.m(pu90Var116, i26, i27 - (pu90Var116.b / 2), 0.0f);
                        i26 = i26 + pu90Var116.f27604a + i25;
                    }
                    pu90 pu90Var117 = pu90VarS12;
                    ou90Var.m(pu90Var117, i26, i27 - (pu90Var117.b / 2), 0.0f);
                    ah30 ah30Var = new ah30(tx3.z(new pu90[]{pu90VarS3, pu90Var112, pu90VarS5, pu90Var111}));
                    int i28 = i13 - i11113;
                    Iterator it2 = ah30Var.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((xag0) it2).b;
                        if (!listIterator.hasPrevious()) {
                            return Unit.f46060a;
                        }
                        pu90 pu90Var118 = (pu90) listIterator.previous();
                        i28 -= pu90Var118.f27604a;
                        ou90Var.m(pu90Var118, i28, i27 - (pu90Var118.b / 2), 0.0f);
                    }
                }
            });
        }
        i4 = i3;
        pu90VarS4 = null;
        if (this.d instanceof x3i) {
            i5 = i4 + 1;
            pj30Var2 = (pj30) CollectionsKt.W(i4, list);
            if (pj30Var2 != null) {
                pu90VarS5 = pj30Var2.S(p4e.b(j, 0, 0, 0, 0, 10));
            }
            if (this.e instanceof s3i) {
                pu90VarS6 = pj30Var.S(p4e.b(j, 0, 0, 0, 0, 10));
            }
            final pu90 pu90Var115 = pu90VarS6;
            it = ((ArrayList) tx3.z(new pu90[]{pu90VarS3, pu90VarS4, pu90VarS5, pu90Var115})).iterator();
            i6 = 0;
            while (it.hasNext()) {
                i6 += ((pu90) it.next()).f27604a;
            }
            if (pu90VarS != null) {
                i7 = pu90VarS.f27604a;
            } else {
                i7 = 0;
            }
            if (pu90VarS2 != null) {
                i8 = pu90VarS2.f27604a;
            } else {
                i8 = 0;
            }
            int i11115 = i7 + i8;
            if (pu90VarS != null) {
                i9 = this.g;
            } else {
                i9 = 0;
            }
            if (pu90VarS2 != null) {
                i10 = this.h;
            } else {
                i10 = 0;
            }
            final pu90 pu90Var116 = pu90VarS4;
            final pu90 pu90Var117 = pu90VarS;
            final int i11116 = this.f;
            i11 = (((((i13 - i11116) - i11115) - i9) - i10) - this.i) - i6;
            if (i11 < 0) {
                i12 = 0;
            } else {
                i12 = i11;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            final pu90 pu90VarS13 = pj30Var4.S(r4e.b(i12, i11, 0, 0, 12));
            final pu90 pu90Var118 = pu90VarS2;
            final int i11117 = this.k;
            final int i11118 = this.h;
            final int i11119 = this.g;
            final int i26 = this.h;
            return vj30.x(vj30Var, i13, this.j, new Function1() { // from class: a.v2i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ou90 ou90Var = (ou90) obj;
                    ou90Var.getClass();
                    int i27 = i11116;
                    pu90 pu90Var119 = pu90Var117;
                    int i28 = i11117;
                    if (pu90Var119 != null) {
                        ou90Var.m(pu90Var119, i27, i28 - (pu90Var119.b / 2), 0.0f);
                        i27 = i27 + pu90Var119.f27604a + i11119;
                    }
                    pu90 pu90Var1110 = pu90Var118;
                    if (pu90Var1110 != null) {
                        ou90Var.m(pu90Var1110, i27, i28 - (pu90Var1110.b / 2), 0.0f);
                        i27 = i27 + pu90Var1110.f27604a + i26;
                    }
                    pu90 pu90Var1111 = pu90VarS13;
                    ou90Var.m(pu90Var1111, i27, i28 - (pu90Var1111.b / 2), 0.0f);
                    ah30 ah30Var = new ah30(tx3.z(new pu90[]{pu90VarS3, pu90Var116, pu90VarS5, pu90Var115}));
                    int i29 = i13 - i11118;
                    Iterator it2 = ah30Var.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((xag0) it2).b;
                        if (!listIterator.hasPrevious()) {
                            return Unit.f46060a;
                        }
                        pu90 pu90Var1112 = (pu90) listIterator.previous();
                        i29 -= pu90Var1112.f27604a;
                        ou90Var.m(pu90Var1112, i29, i28 - (pu90Var1112.b / 2), 0.0f);
                    }
                }
            });
        }
        i5 = i4;
        pu90VarS5 = null;
        if (this.e instanceof s3i) {
            pu90VarS6 = pj30Var.S(p4e.b(j, 0, 0, 0, 0, 10));
        }
        final pu90 pu90Var119 = pu90VarS6;
        it = ((ArrayList) tx3.z(new pu90[]{pu90VarS3, pu90VarS4, pu90VarS5, pu90Var119})).iterator();
        i6 = 0;
        while (it.hasNext()) {
            i6 += ((pu90) it.next()).f27604a;
        }
        if (pu90VarS != null) {
            i7 = pu90VarS.f27604a;
        } else {
            i7 = 0;
        }
        if (pu90VarS2 != null) {
            i8 = pu90VarS2.f27604a;
        } else {
            i8 = 0;
        }
        int i111110 = i7 + i8;
        if (pu90VarS != null) {
            i9 = this.g;
        } else {
            i9 = 0;
        }
        if (pu90VarS2 != null) {
            i10 = this.h;
        } else {
            i10 = 0;
        }
        final pu90 pu90Var1110 = pu90VarS4;
        final pu90 pu90Var1111 = pu90VarS;
        final int i111111 = this.f;
        i11 = (((((i13 - i111111) - i111110) - i9) - i10) - this.i) - i6;
        if (i11 < 0) {
            i12 = 0;
        } else {
            i12 = i11;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        final pu90 pu90VarS14 = pj30Var4.S(r4e.b(i12, i11, 0, 0, 12));
        final pu90 pu90Var1112 = pu90VarS2;
        final int i111112 = this.k;
        final int i111113 = this.h;
        final int i111114 = this.g;
        final int i27 = this.h;
        return vj30.x(vj30Var, i13, this.j, new Function1() { // from class: a.v2i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                int i28 = i111111;
                pu90 pu90Var1113 = pu90Var1111;
                int i29 = i111112;
                if (pu90Var1113 != null) {
                    ou90Var.m(pu90Var1113, i28, i29 - (pu90Var1113.b / 2), 0.0f);
                    i28 = i28 + pu90Var1113.f27604a + i111114;
                }
                pu90 pu90Var1114 = pu90Var1112;
                if (pu90Var1114 != null) {
                    ou90Var.m(pu90Var1114, i28, i29 - (pu90Var1114.b / 2), 0.0f);
                    i28 = i28 + pu90Var1114.f27604a + i27;
                }
                pu90 pu90Var1115 = pu90VarS14;
                ou90Var.m(pu90Var1115, i28, i29 - (pu90Var1115.b / 2), 0.0f);
                ah30 ah30Var = new ah30(tx3.z(new pu90[]{pu90VarS3, pu90Var1110, pu90VarS5, pu90Var119}));
                int i210 = i13 - i111113;
                Iterator it2 = ah30Var.iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((xag0) it2).b;
                    if (!listIterator.hasPrevious()) {
                        return Unit.f46060a;
                    }
                    pu90 pu90Var1116 = (pu90) listIterator.previous();
                    i210 -= pu90Var1116.f27604a;
                    ou90Var.m(pu90Var1116, i210, i29 - (pu90Var1116.b / 2), 0.0f);
                }
            }
        });
    }
}
