package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bur0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3247a;
    public final /* synthetic */ int b;

    public /* synthetic */ bur0(int i, cur0 cur0Var) {
        this.f3247a = (byte) 0;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3247a;
        int i = this.b;
        switch (b) {
            case 0:
                ztr0 ztr0Var = (ztr0) obj2;
                ((oyg0) obj).getClass();
                ztr0Var.getClass();
                List list = ztr0Var.b;
                vd80 vd80Var = (vd80) list.get(i);
                List list2 = vd80Var.d;
                ArrayList arrayList = new ArrayList(list);
                be80 be80Var = vd80Var.f37219a;
                boolean z = be80Var == be80.f2437a;
                int size = z ? 0 : list2.size();
                int i2 = (ztr0Var.d - vd80Var.c) + size;
                vd80 vd80Var2 = (vd80) list.get(i);
                ArrayList arrayList2 = new ArrayList(list2);
                int i3 = 0;
                for (Object obj3 : list2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        q3d.p();
                        throw null;
                    }
                    arrayList2.set(i3, ntr0.a((ntr0) obj3, be80Var == be80.c || be80Var == be80.b));
                    i3 = i4;
                }
                arrayList.set(i, vd80.a(vd80Var2, z ? be80.b : be80.f2437a, size, arrayList2));
                return new ztr0(ztr0Var.f44976a, arrayList, ztr0Var.c, i2);
            case 1:
                ((Integer) obj2).getClass();
                qem0.c(x8x.L(i | 1), (fet) obj);
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                pvm0.k(x8x.L(i | 1), (fet) obj);
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                vbw0.O(x8x.L(i | 1), (fet) obj);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ bur0(int i, byte b) {
        this.f3247a = b;
        this.b = i;
    }
}
