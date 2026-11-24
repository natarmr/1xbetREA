package a;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class inl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15078a;
    public final /* synthetic */ uzh b;
    public final /* synthetic */ int c;

    public /* synthetic */ inl(uzh uzhVar, int i, byte b) {
        this.f15078a = b;
        this.b = uzhVar;
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x021e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ff  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int iMin;
        int iMin2;
        byte b = this.f15078a;
        pu90 pu90VarS = null;
        uzh uzhVar = this.b;
        switch (b) {
            case 0:
                c5n0 c5n0Var = (c5n0) obj;
                p4e p4eVar = (p4e) obj2;
                c5n0Var.getClass();
                int i = p4e.i(p4eVar.f26347a);
                boolean zW = StringsKt.W(uzhVar.c);
                pu90 pu90VarS2 = ((pj30) CollectionsKt.U(c5n0Var.k("titleCurrent", new ugd(-207300007, true, new bnl(uzhVar, (byte) 2))))).S(p4e.b(p4eVar.f26347a, 0, i, 0, 0, 12));
                pu90 pu90VarS3 = zW ? null : ((pj30) CollectionsKt.U(c5n0Var.k("tagCurrent", new ugd(-703281101, true, new bnl(uzhVar, (byte) 3))))).S(p4e.b(p4eVar.f26347a, 0, i, 0, 0, 12));
                int i2 = i / 2;
                int i3 = pu90VarS2.f27604a;
                boolean z = i3 > i2;
                boolean z2 = (pu90VarS3 != null ? pu90VarS3.f27604a : 0) > i2;
                int i4 = this.c;
                if (zW) {
                    i3 = i;
                } else {
                    if (z && z2) {
                        iMin = i2 - (i4 / 2);
                    } else if (z && !z2) {
                        iMin = (i - i4) - Math.min(pu90VarS3 != null ? pu90VarS3.f27604a : 0, i2);
                        if (iMin < 0) {
                            iMin = 0;
                        }
                    }
                    i3 = iMin;
                }
                if (zW) {
                    i2 = 0;
                } else if (z && z2) {
                    i2 -= i4 / 2;
                } else if (z2) {
                    int i5 = (i - i4) - pu90VarS2.f27604a;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    i2 = i5;
                }
                pu90 pu90VarS4 = ((pj30) CollectionsKt.U(c5n0Var.k("title", new ugd(-1943960212, true, new bnl(uzhVar, (byte) 4))))).S(p4e.b(p4eVar.f26347a, 0, i3 > i ? i : i3, 0, 0, 12));
                if (!zW) {
                    pu90VarS = ((pj30) CollectionsKt.U(c5n0Var.k("tag", new ugd(-458352430, true, new bnl(uzhVar, (byte) 1))))).S(p4e.b(p4eVar.f26347a, 0, i2 > i ? i : i2, 0, 0, 12));
                }
                int iMax = Math.max(pu90VarS4.b, pu90VarS != null ? pu90VarS.b : 0);
                return vj30.x(c5n0Var, i, iMax, new lw7(iMax, pu90VarS4, pu90VarS, i4, i, (byte) 2));
            case 1:
                c5n0 c5n0Var2 = (c5n0) obj;
                p4e p4eVar2 = (p4e) obj2;
                c5n0Var2.getClass();
                int i6 = p4e.i(p4eVar2.f26347a);
                boolean zW2 = StringsKt.W(uzhVar.c);
                pu90 pu90VarS5 = ((pj30) CollectionsKt.U(c5n0Var2.k("titleCurrent", new ugd(-1274100247, true, new bnl(uzhVar, (byte) 7))))).S(p4e.b(p4eVar2.f26347a, 0, i6, 0, 0, 12));
                pu90 pu90VarS6 = zW2 ? null : ((pj30) CollectionsKt.U(c5n0Var2.k("tagCurrent", new ugd(469412675, true, new bnl(uzhVar, (byte) 8))))).S(p4e.b(p4eVar2.f26347a, 0, i6, 0, 0, 12));
                int i7 = i6 / 2;
                int i8 = pu90VarS5.f27604a;
                boolean z3 = i8 > i7;
                boolean z4 = (pu90VarS6 != null ? pu90VarS6.f27604a : 0) > i7;
                int i9 = this.c;
                if (zW2) {
                    i8 = i6;
                } else if (z3 && z4) {
                    int i10 = i7 - (i9 / 2);
                    if (i10 < 0) {
                        iMin2 = 0;
                    } else {
                        iMin2 = i10;
                    }
                    i8 = iMin2;
                } else if (z3 && !z4) {
                    iMin2 = (i6 - i9) - Math.min(pu90VarS6 != null ? pu90VarS6.f27604a : 0, i7);
                    if (iMin2 < 0) {
                        iMin2 = 0;
                    }
                    i8 = iMin2;
                }
                if (zW2) {
                    i7 = 0;
                } else if (z3 && z4) {
                    i7 -= i9 / 2;
                    if (i7 < 0) {
                        i7 = 0;
                    }
                } else if (z4) {
                    int i11 = (i6 - i9) - pu90VarS5.f27604a;
                    if (i11 < 0) {
                        i7 = 0;
                    } else {
                        i7 = i11;
                    }
                }
                pu90 pu90VarS7 = ((pj30) CollectionsKt.U(c5n0Var2.k("title", new ugd(-1310001860, true, new bnl(uzhVar, (byte) 5))))).S(p4e.b(p4eVar2.f26347a, 0, i8 > i6 ? i6 : i8, 0, 0, 12));
                if (!zW2) {
                    if (i7 < 0) {
                        i7 = 0;
                    }
                    pu90VarS = ((pj30) CollectionsKt.U(c5n0Var2.k("tag", new ugd(1899692322, true, new bnl(uzhVar, (byte) 6))))).S(p4e.b(p4eVar2.f26347a, 0, i7 > i6 ? i6 : i7, 0, 0, 12));
                }
                int iMax2 = Math.max(pu90VarS7.b, pu90VarS != null ? pu90VarS.b : 0);
                return vj30.x(c5n0Var2, i6, iMax2, new lw7(iMax2, pu90VarS7, pu90VarS, i9, i6, (byte) 3));
            default:
                c5n0 c5n0Var3 = (c5n0) obj;
                p4e p4eVar3 = (p4e) obj2;
                c5n0Var3.getClass();
                int i12 = p4e.i(p4eVar3.f26347a);
                boolean zW3 = StringsKt.W(uzhVar.c);
                pu90 pu90VarS8 = ((pj30) CollectionsKt.U(c5n0Var3.k("titleCurrent", new ugd(509894711, true, new bnl(uzhVar, (byte) 11))))).S(p4e.b(p4eVar3.f26347a, 0, i12, 0, 0, 12));
                pu90 pu90VarS9 = zW3 ? null : ((pj30) CollectionsKt.U(c5n0Var3.k("tagCurrent", new ugd(988567313, true, new bnl(uzhVar, (byte) 12))))).S(p4e.b(p4eVar3.f26347a, 0, i12, 0, 0, 12));
                int i13 = i12 / 2;
                int iMin3 = pu90VarS8.f27604a;
                boolean z5 = iMin3 > i13;
                boolean z6 = (pu90VarS9 != null ? pu90VarS9.f27604a : 0) > i13;
                int i14 = this.c;
                if (zW3) {
                    iMin3 = i12;
                } else if (z5 && z6) {
                    int i15 = i13 - (i14 / 2);
                    if (i15 < 0) {
                        i15 = 0;
                    }
                    iMin3 = i15;
                } else if (z5 && !z6) {
                    iMin3 = (i12 - i14) - Math.min(pu90VarS9 != null ? pu90VarS9.f27604a : 0, i13);
                    if (iMin3 < 0) {
                        iMin3 = 0;
                    }
                }
                if (zW3) {
                    i13 = 0;
                } else if (z5 && z6) {
                    i13 -= i14 / 2;
                    if (i13 < 0) {
                        i13 = 0;
                    }
                } else if (z6) {
                    int i16 = (i12 - i14) - pu90VarS8.f27604a;
                    if (i16 < 0) {
                        i13 = 0;
                    } else {
                        i13 = i16;
                    }
                }
                pu90 pu90VarS10 = ((pj30) CollectionsKt.U(c5n0Var3.k("title", new ugd(368182986, true, new bnl(uzhVar, (byte) 9))))).S(p4e.b(p4eVar3.f26347a, 0, iMin3 > i12 ? i12 : iMin3, 0, 0, 12));
                if (!zW3) {
                    if (i13 < 0) {
                        i13 = 0;
                    }
                    pu90VarS = ((pj30) CollectionsKt.U(c5n0Var3.k("tag", new ugd(1097773360, true, new bnl(uzhVar, (byte) 10))))).S(p4e.b(p4eVar3.f26347a, 0, i13 > i12 ? i12 : i13, 0, 0, 12));
                }
                int iMax3 = Math.max(pu90VarS10.b, pu90VarS != null ? pu90VarS.b : 0);
                return vj30.x(c5n0Var3, i12, iMax3, new lw7(iMax3, pu90VarS10, pu90VarS, i14, i12, (byte) 4));
        }
    }
}
