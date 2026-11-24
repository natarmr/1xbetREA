package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.universal.impl.presentation.killerjoker.KillerJokerView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class al1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1047a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ al1(int i, int i2, xcz xczVar, int i3) {
        this.f1047a = (byte) 4;
        this.b = i;
        this.c = i2;
        this.d = xczVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1047a;
        int i = this.c;
        int i2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                gfk0 gfk0Var = cl1.o2;
                ((cl1) obj3).Q0(i2, i, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                vbc.f((l7m0) obj3, i2, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 2:
                KillerJokerView killerJokerView = (KillerJokerView) obj3;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int i3 = KillerJokerView.h1;
                int i4 = killerJokerView.f;
                int i5 = killerJokerView.d;
                int i6 = ((i - (i4 * 2)) - i2) - i5;
                int i7 = iIntValue2 / 2;
                if (iIntValue >= i7) {
                    i6 = i6 + i4 + i2;
                }
                int i8 = i6 + i4;
                Integer numValueOf = Integer.valueOf(i6);
                Integer numValueOf2 = Integer.valueOf(i8);
                int iIntValue3 = numValueOf.intValue();
                int iIntValue4 = numValueOf2.intValue();
                if (iIntValue >= i7) {
                    iIntValue3 = (i - i4) - i5;
                }
                Integer numValueOf3 = Integer.valueOf(iIntValue3);
                if (iIntValue >= i7) {
                    iIntValue4 = i - i5;
                }
                return new Pair(numValueOf3, Integer.valueOf(iIntValue4));
            case 3:
                w370 w370Var = (w370) obj2;
                f3b f3bVar = w370Var.g;
                return w370.a(w370Var, false, false, null, null, null, null, new f3b((i2 == 0 && ((long) i) == 0) ? false : true, Integer.valueOf(i), dyb.o0((ArrayList) obj3)), false, false, false, false, 16319);
            case 4:
                ((Integer) obj2).getClass();
                bww.c(i2, i, (xcz) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                List list = (List) obj3;
                l1m0 l1m0Var = (l1m0) obj2;
                ((oyg0) obj).getClass();
                l1m0Var.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                int i9 = 0;
                for (Object obj4 : list) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        q3d.p();
                        throw null;
                    }
                    j1m0 h1m0Var = (j1m0) obj4;
                    if ((h1m0Var instanceof h1m0) && i2 - 1 == i9) {
                        ArrayList arrayList2 = ((h1m0) h1m0Var).f12291a;
                        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                        int i11 = 0;
                        for (Object obj5 : arrayList2) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList3.add(ifo0.c((ifo0) obj5, i11 == i));
                            i11 = i12;
                        }
                        h1m0Var = new h1m0(arrayList3);
                    }
                    arrayList.add(h1m0Var);
                    i9 = i10;
                }
                return l1m0.a(l1m0Var, false, false, arrayList, null, null, null, null, 247);
        }
    }

    public /* synthetic */ al1(byte b, int i, int i2, Object obj) {
        this.f1047a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ al1(cl1 cl1Var, int i, int i2, int i3) {
        this.f1047a = (byte) 0;
        this.d = cl1Var;
        this.b = i;
        this.c = i2;
    }
}
