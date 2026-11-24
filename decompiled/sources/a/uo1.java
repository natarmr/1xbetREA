package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uo1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35989a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uo1(ql5 ql5Var, boolean z, boolean z2) {
        this.f35989a = (byte) 3;
        this.d = ql5Var;
        this.b = z;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f35989a;
        boolean z = this.c;
        boolean z2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                List list = (List) obj3;
                bo1 bo1Var = (bo1) obj2;
                h9h0 f8h0Var = z2 ? new f8h0(list) : new j8h0(list);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    w3d.u(arrayList, ((j8b) it.next()).c);
                }
                int iA = wp20.a(r3d.q(arrayList, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Object obj4 : arrayList) {
                    linkedHashMap.put(Long.valueOf(((mlr) obj4).f22006a), obj4);
                }
                return bo1.a(bo1Var, null, f8h0Var, null, null, z2 ? bo1Var.f : true, linkedHashMap, false, false, list, null, this.c, 0L, 753501);
            case 1:
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) obj3;
                yu1 yu1Var = (yu1) obj2;
                ((oyg0) obj).getClass();
                yu1Var.getClass();
                return yu1.a(yu1Var, null, false, null, null, z2 ? ct1.f4914a : z ? bt1.f3159a : at1.f1413a, null, null, null, linkedHashMap2, false, false, false, null, null, null, null, null, 33488639);
            case 2:
                ((Integer) obj2).getClass();
                n7x.b((foa0) obj3, z2, z, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ql5 ql5Var = (ql5) obj3;
                s1y s1yVar = (s1y) obj2;
                ((oyg0) obj).getClass();
                s1yVar.getClass();
                long j = ql5Var.f28916a;
                pn40 pn40Var = pn40.f27267a;
                String strC = pn40.c(ql5Var.b, p3u0.c);
                String str = ql5Var.f;
                long j2 = ql5Var.e;
                str.getClass();
                return s1y.a(s1yVar, new sm5(j, j2, strC, str, this.b, this.c), null, false, false, 123);
            case 4:
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                pvj0 pvj0Var = a820Var.e;
                bx6 bx6Var = pvj0Var.f27665a;
                return a820.a(a820Var, null, null, null, pvj0.a(pvj0Var, bx6.a(bx6Var, null, tw6.a(bx6Var.b, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, this.b, 32767), false, 5), knb0.b(pvj0Var.b, false, ((on20) obj3).h0(z, null), 5), null, null, null, false, 60), null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262127);
            case 5:
                String str2 = (String) obj3;
                a820 a820Var2 = (a820) obj2;
                pvj0 pvj0Var2 = a820Var2.e;
                return a820.a(a820Var2, null, null, null, pvj0.a(pvj0Var2, null, null, null, nnd0.a(pvj0Var2.d, z2 && z, 0.0d, 0.0d, 0.0d, false, 46), str2, false, 39), null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262127);
            default:
                ((Integer) obj2).getClass();
                ju70.A((tar0) obj3, z2, z, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ uo1(byte b, Object obj, boolean z, boolean z2) {
        this.f35989a = b;
        this.b = z;
        this.d = obj;
        this.c = z2;
    }

    public /* synthetic */ uo1(Object obj, boolean z, boolean z2, int i, byte b) {
        this.f35989a = b;
        this.d = obj;
        this.b = z;
        this.c = z2;
    }

    public /* synthetic */ uo1(boolean z, boolean z2, Serializable serializable, byte b) {
        this.f35989a = b;
        this.b = z;
        this.c = z2;
        this.d = serializable;
    }
}
