package a;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public final class sjf0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public final /* synthetic */ Object j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjf0(v9v0 v9v0Var, tcj tcjVar, List list, int i, int i2, cgk0 cgk0Var, cgk0 cgk0Var2, yje yjeVar) {
        super(2, yjeVar);
        this.m = v9v0Var;
        this.n = tcjVar;
        this.j = list;
        this.k = i;
        this.l = i2;
        this.o = cgk0Var;
        this.p = cgk0Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.j;
        Object obj5 = this.n;
        switch (b) {
            case 0:
                return new sjf0((v9v0) this.m, (tcj) obj5, (List) obj4, this.k, this.l, (cgk0) obj3, (cgk0) obj2, yjeVar);
            case 1:
                return new sjf0((List) obj4, this.k, this.l, (v9v0) this.m, (tcj) obj5, (cgk0) obj3, (cgk0) obj2, yjeVar);
            default:
                sjf0 sjf0Var = new sjf0((IntRange) obj5, this.k, this.l, (String) obj4, (String) obj3, (ArrayList) obj2, yjeVar);
                sjf0Var.m = obj;
                return sjf0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((sjf0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException {
        int i;
        int iD;
        boolean z;
        String strM;
        byte b = this.i;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.j;
        int i2 = this.l;
        int i3 = this.k;
        Object obj5 = this.n;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                List list = (List) obj4;
                v9v0 v9v0Var = (v9v0) this.m;
                tcj tcjVar = (tcj) obj5;
                wdx.A(list, i3, v9v0Var, tcjVar);
                cgk0 cgk0Var = (cgk0) obj3;
                wdx.z(tcjVar, list, i2, ((Number) ((u9v0) v9v0Var.f37054a.get(l1e0.d(cgk0Var.l(), 0, q3d.i(v9v0Var.f37054a)))).c).intValue());
                if (up90.e(tcjVar)) {
                    return Unit.f46060a;
                }
                ((t9v0) list.get(i3)).d.i(cgk0Var.l());
                ((t9v0) list.get(i2)).d.i(((cgk0) obj2).l());
                return Unit.f46060a;
            case 1:
                cgk0 cgk0Var2 = (cgk0) obj2;
                cgk0 cgk0Var3 = (cgk0) obj3;
                tcj tcjVar2 = (tcj) obj5;
                v9v0 v9v0Var2 = (v9v0) this.m;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                List list2 = (List) obj4;
                if (((t9v0) list2.get(i3)).e || ((t9v0) list2.get(i2)).e) {
                    return Unit.f46060a;
                }
                List list3 = v9v0Var2.f37054a;
                List list4 = v9v0Var2.f37054a;
                int iIntValue = ((Number) ((u9v0) list3.get(l1e0.d(cgk0Var3.l(), 0, q3d.i(list4)))).c).intValue();
                if (up90.e(tcjVar2)) {
                    wdx.A(list2, i3, v9v0Var2, tcjVar2);
                    wdx.z(tcjVar2, list2, i2, iIntValue);
                    return Unit.f46060a;
                }
                int iL = cgk0Var2.l() + 1;
                Pair pair = new Pair(Integer.valueOf(iIntValue), Integer.valueOf(iL));
                SimpleDate simpleDate = tcjVar2.f33721a;
                if (simpleDate != null) {
                    int i4 = simpleDate.b;
                    int i5 = simpleDate.f47286a;
                    if (iIntValue < i5 || (iIntValue == i5 && iL < i4)) {
                        pair = new Pair(Integer.valueOf(i5), Integer.valueOf(i4));
                    }
                }
                SimpleDate simpleDate2 = tcjVar2.b;
                if (simpleDate2 != null) {
                    int i6 = simpleDate2.b;
                    int i7 = simpleDate2.f47286a;
                    if (iIntValue > i7 || (iIntValue == i7 && iL > i6)) {
                        pair = new Pair(Integer.valueOf(i7), Integer.valueOf(i6));
                    }
                }
                int iIntValue2 = ((Number) pair.f46059a).intValue();
                int iIntValue3 = ((Number) pair.b).intValue();
                u9v0 u9v0Var = (u9v0) CollectionsKt.firstOrNull(list4);
                Integer num = u9v0Var != null ? (Integer) u9v0Var.c : null;
                if (num != null) {
                    iD = l1e0.d(iIntValue2 - num.intValue(), 0, ((t9v0) list2.get(i3)).b.size() - 1);
                    u9v0 u9v0Var2 = (u9v0) CollectionsKt.W(iD, list4);
                    if (u9v0Var2 == null || ((Number) u9v0Var2.c).intValue() != iIntValue2) {
                        Iterator it = list4.iterator();
                        int i8 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i8 = -1;
                            } else if (((Number) ((u9v0) it.next()).c).intValue() != iIntValue2) {
                                i8++;
                            }
                        }
                        i = 0;
                        iD = l1e0.d(i8, 0, ((t9v0) list2.get(i3)).b.size() - 1);
                    } else {
                        i = 0;
                    }
                } else {
                    i = 0;
                    iD = 0;
                }
                int iD2 = l1e0.d(iIntValue3 - 1, i, 11);
                wdx.z(tcjVar2, list2, i2, iIntValue2);
                if (iD != cgk0Var3.l()) {
                    ((t9v0) list2.get(i3)).d.i(iD);
                    z = true;
                } else {
                    z = false;
                }
                wdx.A(list2, i3, v9v0Var2, tcjVar2);
                if (iD2 != cgk0Var2.l()) {
                    ((t9v0) list2.get(i2)).d.i(iD2);
                    z = true;
                }
                if (z) {
                    return Unit.f46060a;
                }
                tcjVar2.c.invoke(new SimpleDate(iIntValue2, iIntValue3, 1));
                return Unit.f46060a;
            default:
                vne vneVar = (vne) this.m;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                IntRange intRange = (IntRange) obj5;
                String str = (String) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                int i9 = intRange.f46068a;
                int[] iArr = new int[i3];
                kotlin.ranges.a aVarK = l1e0.k(tx3.C(iArr));
                int i10 = aVarK.c;
                int i11 = aVarK.b;
                int i12 = aVarK.f46068a;
                ArrayList arrayListG = ttm0.G(2, (String) obj3);
                LinkedHashMap linkedHashMap = z1w0.b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayListG.iterator();
                while (it2.hasNext()) {
                    p1t0 p1t0Var = (p1t0) linkedHashMap.get((String) it2.next());
                    if (p1t0Var != null) {
                        arrayList2.add(p1t0Var);
                    }
                }
                p1t0[] p1t0VarArr = (p1t0[]) arrayList2.toArray(new p1t0[0]);
                p1t0VarArr.getClass();
                int length = p1t0VarArr.length;
                byte[] bArr = new byte[length];
                for (int i13 = 0; i13 < length; i13++) {
                    bArr[i13] = p1t0VarArr[i13].f26221a;
                }
                if ((i10 > 0 && i12 <= i11) || (i10 < 0 && i11 <= i12)) {
                    int i14 = i12;
                    while (true) {
                        iArr[i14] = i9 % i2;
                        i9 /= i2;
                        if (i14 != i11) {
                            i14 += i10;
                        }
                    }
                }
                int iM = CollectionsKt.M(intRange);
                int i15 = 0;
                while (true) {
                    strM = "";
                    if (i15 < iM && d5c.R(vneVar)) {
                        int i16 = i12;
                        int i17 = i10;
                        int i18 = i11;
                        byte[] bArr2 = bArr;
                        vne vneVar2 = vneVar;
                        int i19 = iM;
                        strM = tx3.M(iArr, "", new prc0(1, arrayList, List.class, "get", "get(I)Ljava/lang/Object;", 0, (byte) 7), 30);
                        byte[] bytes = w6x.q(str, "$", strM).getBytes(Charsets.UTF_8);
                        bytes.getClass();
                        byte[] bArrDigest = messageDigest.digest(bytes);
                        bArrDigest.getClass();
                        if (!Arrays.equals(Arrays.copyOf(bArrDigest, bArrDigest.length), bArr2)) {
                            if ((i17 > 0 && i16 <= i18) || (i17 < 0 && i18 <= i16)) {
                                int i20 = i16;
                                while (true) {
                                    int i21 = (iArr[i20] + 1) % i2;
                                    iArr[i20] = i21;
                                    if (i21 != 0 || i20 == i18) {
                                    }
                                    i20 += i17;
                                    break;
                                }
                            }
                            i15++;
                            i11 = i18;
                            bArr = bArr2;
                            i12 = i16;
                            i10 = i17;
                            vneVar = vneVar2;
                            iM = i19;
                        }
                    }
                }
                return strM;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjf0(List list, int i, int i2, v9v0 v9v0Var, tcj tcjVar, cgk0 cgk0Var, cgk0 cgk0Var2, yje yjeVar) {
        super(2, yjeVar);
        this.j = list;
        this.k = i;
        this.l = i2;
        this.m = v9v0Var;
        this.n = tcjVar;
        this.o = cgk0Var;
        this.p = cgk0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjf0(IntRange intRange, int i, int i2, String str, String str2, ArrayList arrayList, yje yjeVar) {
        super(2, yjeVar);
        this.n = intRange;
        this.k = i;
        this.l = i2;
        this.j = str;
        this.o = str2;
        this.p = arrayList;
    }
}
