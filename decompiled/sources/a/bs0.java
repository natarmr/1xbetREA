package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bs0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3103a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public /* synthetic */ bs0(long j, String str) {
        this.f3103a = (byte) 5;
        this.c = j;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:51:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0202  */
    /* JADX WARN: Code duplicated, block: B:55:0x0205  */
    /* JADX WARN: Code duplicated, block: B:59:0x022c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0234  */
    /* JADX WARN: Code duplicated, block: B:63:0x0238  */
    /* JADX WARN: Code duplicated, block: B:72:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        j4b j4bVar;
        Set setB;
        j4b j4bVar2;
        ArrayList arrayList;
        int i;
        j4b j4bVar3;
        byte b = this.f3103a;
        int i2 = -1;
        jm40 jm40Var = jm40.b;
        int i3 = 0;
        long j = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                ur0 ur0Var = (ur0) obj2;
                ((oyg0) obj).getClass();
                ur0Var.getClass();
                str.getClass();
                v5q v5qVar = ur0Var.b;
                r5q r5qVar = v5qVar instanceof r5q ? (r5q) v5qVar : null;
                if (r5qVar == null) {
                    return ur0Var;
                }
                a4x a4xVar = r5qVar.f29900a;
                Iterator it = a4xVar.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    if (Intrinsics.d(((j4b) it.next()).f15876a.f40181a, str)) {
                        i2 = i4;
                        j4bVar = (j4b) CollectionsKt.W(i2, a4xVar);
                        if (j4bVar != null) {
                            return ur0Var;
                        }
                        if (j4bVar.b.contains(String.valueOf(j))) {
                            setB = cui0.b(String.valueOf(j));
                        } else if (str.equals("dopInfo2")) {
                            setB = cui0.b("0");
                        } else {
                            setB = xun.f41520a;
                        }
                        x2q x2qVar = j4bVar.f15876a;
                        setB.getClass();
                        j4bVar2 = new j4b(x2qVar, setB);
                        arrayList = new ArrayList(r3d.q(a4xVar, 10));
                        for (Object obj3 : a4xVar) {
                            i = i3 + 1;
                            if (i3 >= 0) {
                                q3d.p();
                                throw null;
                            }
                            j4bVar3 = (j4b) obj3;
                            if (i3 == i2) {
                                j4bVar3 = j4bVar2;
                            }
                            arrayList.add(j4bVar3);
                            i3 = i;
                        }
                        i4 i4VarR0 = dyb.r0(arrayList);
                        i4VarR0.getClass();
                        return ur0.a(ur0Var, new r5q(i4VarR0), null, null, null, 253);
                    }
                    i4++;
                }
                j4bVar = (j4b) CollectionsKt.W(i2, a4xVar);
                if (j4bVar != null) {
                    return ur0Var;
                }
                if (j4bVar.b.contains(String.valueOf(j))) {
                    setB = cui0.b(String.valueOf(j));
                } else if (str.equals("dopInfo2")) {
                    setB = cui0.b("0");
                } else {
                    setB = xun.f41520a;
                }
                x2q x2qVar2 = j4bVar.f15876a;
                setB.getClass();
                j4bVar2 = new j4b(x2qVar2, setB);
                arrayList = new ArrayList(r3d.q(a4xVar, 10));
                while (r0.hasNext()) {
                    i = i3 + 1;
                    if (i3 >= 0) {
                        q3d.p();
                        throw null;
                    }
                    j4bVar3 = (j4b) obj3;
                    if (i3 == i2) {
                        j4bVar3 = j4bVar2;
                    }
                    arrayList.add(j4bVar3);
                    i3 = i;
                }
                i4 i4VarR1 = dyb.r0(arrayList);
                i4VarR1.getClass();
                return ur0.a(ur0Var, new r5q(i4VarR1), null, null, null, 253);
            case 1:
                ((Integer) obj2).getClass();
                wvb.f(str, j, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                vdb.J(str, j, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                ulb.s(str, j, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                m7x.b(str, j, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                oyg0 oyg0Var = (oyg0) obj;
                gp40 gp40Var = (gp40) obj2;
                oyg0Var.getClass();
                gp40Var.getClass();
                long j2 = this.c;
                q7x.F(oyg0Var, Long.valueOf(j2), "INPUT_VALUE_KEY");
                String str2 = this.b;
                q7x.F(oyg0Var, str2, "TEXT_FIELD_ERROR");
                q7x.F(oyg0Var, -1, "SELECTED_VALUE_INDEX_KEY");
                return gp40.a(gp40Var, null, false, str2, 0, -1, j2, false, 311);
            case 6:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v8q0.a(this.b, o7k0.d(jm40Var, 1.0f), 0L, null, this.c, null, null, null, 0L, null, 0L, 2, false, 5, 0, null, y9q0.a(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), StaticColors.INSTANCE.m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 48, 24960, 110572);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 7:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    v8q0.a(this.b, o7k0.d(jm40Var, 1.0f), 0L, null, this.c, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, 48, 24960, 110572);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                ktt0.c(str, j, (fet) obj, x8x.L(7));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ bs0(String str, long j, byte b) {
        this.f3103a = b;
        this.b = str;
        this.c = j;
    }

    public /* synthetic */ bs0(String str, long j, int i, byte b) {
        this.f3103a = b;
        this.b = str;
        this.c = j;
    }
}
