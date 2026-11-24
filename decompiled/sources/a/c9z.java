package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class c9z extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ bch0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9z(bch0 bch0Var, int i, int i2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = bch0Var;
        this.j = i;
        this.k = i2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bch0 bch0Var = this.l;
        switch (b) {
            case 0:
                return new c9z((d9z) bch0Var, this.j, this.k, yjeVar, (byte) 0);
            case 1:
                return new c9z((xcz) bch0Var, this.j, this.k, yjeVar, (byte) 1);
            default:
                return new c9z((mez) bch0Var, this.j, this.k, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        qah0 qah0Var = (qah0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((c9z) create(qah0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int i;
        hez hezVar;
        byte b = this.i;
        int i2 = this.k;
        int i3 = this.j;
        bch0 bch0Var = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ((d9z) bch0Var).m(i3, i2, true);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ((xcz) bch0Var).m(i3, i2, true);
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                mez mezVar = (mez) bch0Var;
                hhk hhkVar = mezVar.c;
                cgk0 cgk0Var = (cgk0) hhkVar.d;
                cgk0 cgk0Var2 = (cgk0) hhkVar.f;
                int i4 = 0;
                boolean z = (cgk0Var.l() == i3 && cgk0Var2.l() == i2) ? false : true;
                if (z) {
                    dbz dbzVar = mezVar.t;
                    dbzVar.e();
                    dbzVar.b = null;
                    dbzVar.c = -1;
                }
                fez fezVar = (fez) ((hgk0) mezVar.d).getValue();
                fez fezVar2 = gez.f11179a;
                List list = fezVar.m;
                if (list.isEmpty()) {
                    hezVar = null;
                } else {
                    int i5 = ((hez) CollectionsKt.U(list)).f12949a;
                    if (i3 > ((hez) CollectionsKt.d0(list)).f12949a || i5 > i3) {
                        hezVar = null;
                    } else {
                        List list2 = fezVar.m;
                        int size = list2.size();
                        q3d.n(list2.size(), size);
                        int i6 = size - 1;
                        int i7 = 0;
                        while (true) {
                            if (i7 <= i6) {
                                i = (i7 + i6) >>> 1;
                                int i8 = ((hez) list2.get(i)).f12949a - i3;
                                if (i8 < 0) {
                                    i7 = i + 1;
                                } else if (i8 > 0) {
                                    i6 = i - 1;
                                }
                            } else {
                                i = -(i7 + 1);
                            }
                        }
                        hezVar = (hez) CollectionsKt.W(i, list);
                    }
                }
                if (hezVar == null || !z) {
                    int[] iArr = (int[]) ((ens) hhkVar.b).invoke(Integer.valueOf(i3), Integer.valueOf(((int[]) hhkVar.c).length));
                    int length = iArr.length;
                    int[] iArr2 = new int[length];
                    while (i4 < length) {
                        iArr2[i4] = i2;
                        i4++;
                    }
                    hhkVar.c = iArr;
                    ((cgk0) hhkVar.d).m(hhk.b(iArr));
                    hhkVar.e = iArr2;
                    cgk0Var2.m(hhk.c(iArr, iArr2));
                    ((lbz) hhkVar.h).b(i3);
                    hhkVar.g = null;
                } else {
                    ma80 ma80Var = fezVar.u;
                    int[] iArr3 = fezVar.b;
                    ma80 ma80Var2 = ma80.f21447a;
                    long j = hezVar.w;
                    int i9 = ((int) (ma80Var == ma80Var2 ? 4294967295L & j : j >> 32)) + i2;
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[length2];
                    while (i4 < length2) {
                        iArr4[i4] = iArr3[i4] + i9;
                        i4++;
                    }
                    hhkVar.e = iArr4;
                    cgk0Var2.m(hhk.c((int[]) hhkVar.c, iArr4));
                }
                e7z e7zVar = mezVar.h;
                if (e7zVar != null) {
                    e7zVar.l();
                }
                break;
        }
        return Unit.f46060a;
    }
}
