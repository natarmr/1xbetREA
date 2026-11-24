package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class t2i implements tj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c4i f33215a;
    public final /* synthetic */ u3i b;
    public final /* synthetic */ u3i c;
    public final /* synthetic */ u3i d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public t2i(c4i c4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, int i, int i2, int i3, int i4, int i5) {
        this.f33215a = c4iVar;
        this.b = u3iVar;
        this.c = u3iVar2;
        this.d = u3iVar3;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

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
        list.getClass();
        final int i5 = p4e.i(j);
        c4i c4iVar = this.f33215a;
        o0x o0xVar = c4iVar.c;
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
        int i6 = i2 + 1;
        pj30 pj30Var = (pj30) list.get(i2);
        if (this.b instanceof z3i) {
            i3 = i2 + 2;
            pu90VarS3 = ((pj30) list.get(i6)).S(p4e.b(j, 0, 0, 0, 0, 10));
        } else {
            i3 = i6;
            pu90VarS3 = null;
        }
        if (this.c instanceof x3i) {
            i4 = i3 + 1;
            pu90VarS4 = ((pj30) list.get(i3)).S(p4e.b(j, 0, 0, 0, 0, 10));
        } else {
            i4 = i3;
            pu90VarS4 = null;
        }
        final pu90 pu90VarS5 = this.d instanceof s3i ? ((pj30) list.get(i4)).S(p4e.b(j, 0, 0, 0, 0, 10)) : null;
        Iterator it = ((ArrayList) tx3.z(new pu90[]{pu90VarS3, pu90VarS4, pu90VarS5})).iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((pu90) it.next()).f27604a;
        }
        int i8 = (pu90VarS != null ? pu90VarS.f27604a : 0) + (pu90VarS2 != null ? pu90VarS2.f27604a : 0);
        int i9 = pu90VarS != null ? this.f : 0;
        int i10 = pu90VarS2 != null ? this.g : 0;
        final pu90 pu90Var = pu90VarS4;
        final pu90 pu90Var2 = pu90VarS;
        final int i11 = this.e;
        int i12 = ((((i5 - i11) - i8) - i9) - i10) - i7;
        int i13 = i12 < 0 ? 0 : i12;
        if (i12 < 0) {
            i12 = 0;
        }
        final pu90 pu90VarS6 = pj30Var.S(r4e.b(i13, i12, 0, 0, 12));
        final pu90 pu90Var3 = pu90VarS2;
        final int i14 = this.i;
        final int i15 = this.f;
        final int i16 = this.g;
        return vj30.x(vj30Var, i5, this.h, new Function1() { // from class: a.s2i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                int i17 = i11;
                pu90 pu90Var4 = pu90Var2;
                int i18 = i14;
                if (pu90Var4 != null) {
                    ou90Var.m(pu90Var4, i17, i18 - (pu90Var4.b / 2), 0.0f);
                    i17 = i17 + pu90Var4.f27604a + i15;
                }
                pu90 pu90Var5 = pu90Var3;
                if (pu90Var5 != null) {
                    ou90Var.m(pu90Var5, i17, i18 - (pu90Var5.b / 2), 0.0f);
                    i17 = i17 + pu90Var5.f27604a + i16;
                }
                pu90 pu90Var6 = pu90VarS6;
                ou90Var.m(pu90Var6, i17, i18 - (pu90Var6.b / 2), 0.0f);
                Iterator it2 = new ah30(tx3.z(new pu90[]{pu90VarS3, pu90Var, pu90VarS5})).iterator();
                int i19 = i5;
                while (true) {
                    ListIterator listIterator = (ListIterator) ((xag0) it2).b;
                    if (!listIterator.hasPrevious()) {
                        return Unit.f46060a;
                    }
                    pu90 pu90Var7 = (pu90) listIterator.previous();
                    i19 -= pu90Var7.f27604a;
                    ou90Var.m(pu90Var7, i19, i18 - (pu90Var7.b / 2), 0.0f);
                }
            }
        });
    }
}
