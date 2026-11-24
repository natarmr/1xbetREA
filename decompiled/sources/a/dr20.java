package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class dr20 extends peg0 {
    public final /* synthetic */ er20 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr20(er20 er20Var, CharSequence charSequence) {
        super(charSequence);
        charSequence.getClass();
        this.g = er20Var;
    }

    @Override // a.peg0
    public final List h(ar20 ar20Var, int i, int i2) {
        int i3;
        ar20Var.getClass();
        if (!er20.f8261a.contains(ar20Var)) {
            return super.h(ar20Var, i, i2);
        }
        CharSequence charSequence = (CharSequence) this.b;
        charSequence.getClass();
        l4w0 l4w0Var = new l4w0();
        br20 br20Var = new br20(l4w0Var);
        charSequence.getClass();
        br20Var.d = charSequence;
        br20Var.e = i;
        br20Var.f = i2;
        l4w0Var.c = charSequence;
        l4w0Var.f = i;
        l4w0Var.d = i;
        l4w0Var.e = i;
        byte b = 0;
        l4w0Var.h = false;
        l4w0Var.g = i2;
        l4w0Var.b = 0;
        br20Var.b = br20Var.a();
        br20Var.g = l4w0Var.f;
        br20Var.b();
        dgu dguVar = new dgu(br20Var);
        byte b2 = 1;
        IntRange intRange = new IntRange(0, ((ArrayList) dguVar.b).size(), 1);
        ArrayList arrayList = new ArrayList();
        int i4 = intRange.b;
        int i5 = i4 - 1;
        if (i5 >= 0) {
            int i6 = 0;
            i3 = 0;
            while (true) {
                if (Intrinsics.d(new wvq0(dguVar, i6).e(), cy2.z)) {
                    if (i3 < i6) {
                        arrayList.add(new IntRange(i3, i6 - 1, 1));
                    }
                    i3 = i6 + 1;
                }
                if (i6 == i5) {
                    break;
                }
                i6++;
            }
        } else {
            i3 = 0;
        }
        if (i3 < i4) {
            arrayList.add(new IntRange(i3, i4, 1));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<List> arrayList3 = new ArrayList();
        arrayList3.add(arrayList);
        for (tgi0 tgi0Var : q3d.j(new x55(kotlin.collections.a.c(cy2.f0)), new hdx(b2), new hdx((byte) 2), new hdx(b), new hdx((byte) 3), new x55(new nek[]{new nek()}))) {
            ArrayList arrayList4 = new ArrayList();
            for (List list : arrayList3) {
                list.getClass();
                j910 j910VarA = tgi0Var.a(dguVar, list);
                arrayList2.addAll((ArrayList) j910VarA.b);
                arrayList4.addAll((ArrayList) j910VarA.c);
            }
            arrayList3 = arrayList4;
        }
        return kotlin.collections.a.c(new rcx(new peg0(charSequence), dguVar).p0(CollectionsKt.q0(arrayList2, kotlin.collections.a.c(new sgi0(intRange, ar20Var)))));
    }
}
