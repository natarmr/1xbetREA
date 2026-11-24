package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class m8k0 extends zzf0 implements Function2 {
    public Object j;
    public Iterator k;
    public int l;
    public int m;
    public byte n;
    public /* synthetic */ Object o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Iterator r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8k0(int i, int i2, Iterator it, boolean z, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.p = i;
        this.q = i2;
        this.r = it;
        this.s = z;
        this.t = z2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        m8k0 m8k0Var = new m8k0(this.p, this.q, this.r, this.s, this.t, yjeVar);
        m8k0Var.o = obj;
        return m8k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m8k0) create((fgi0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x0117  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0123  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:63:0x013c  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0161 A[EDGE_INSN: B:71:0x0161->B:72:0x0163 BREAK  A[LOOP:0: B:45:0x00eb->B:61:0x0136]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0169  */
    /* JADX WARN: Code duplicated, block: B:76:0x016b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0185  */
    /* JADX WARN: Code duplicated, block: B:81:0x018d  */
    /* JADX WARN: Code duplicated, block: B:85:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0091 A[SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        Iterator it;
        fcg0 fcg0Var;
        ArrayList arrayList;
        int i4;
        int i5;
        Iterator it2;
        Object next;
        int i6;
        Object[] objArr;
        Iterator it3;
        int i7;
        fcg0 fcg0Var2;
        Object next2;
        Object arrayList2;
        int i8;
        Object[] array;
        Iterator it4;
        Object arrayList3;
        fgi0 fgi0Var = (fgi0) this.o;
        wne wneVar = wne.f39444a;
        byte b = this.n;
        boolean z = this.t;
        boolean z2 = this.s;
        int i9 = this.q;
        int i10 = this.p;
        Iterator it5 = null;
        if (b == 0) {
            z1x.P(obj);
            int i11 = i10 <= 1024 ? i10 : 1024;
            i = i9 - i10;
            Iterator it6 = this.r;
            if (i >= 0) {
                arrayList = new ArrayList(i11);
                i4 = i11;
                i5 = 0;
                it2 = it6;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (i5 > 0) {
                        i5--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == i10) {
                            this.o = fgi0Var;
                            this.j = arrayList;
                            this.k = it2;
                            this.l = i4;
                            this.m = i;
                            this.n = (byte) 1;
                            fgi0Var.a(this, arrayList);
                            wne wneVar2 = wne.f39444a;
                            return wneVar;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.o = null;
                    this.j = null;
                    this.k = null;
                    this.l = i4;
                    this.m = i;
                    this.n = (byte) 2;
                    fgi0Var.a(this, arrayList);
                    wne wneVar3 = wne.f39444a;
                    return wneVar;
                }
            } else {
                fcg0 fcg0Var3 = new fcg0(0, new Object[i11]);
                i2 = i11;
                i3 = i;
                it = it6;
                fcg0Var = fcg0Var3;
                while (true) {
                    i6 = fcg0Var.c;
                    objArr = fcg0Var.b;
                    if (it.hasNext()) {
                        it3 = it5;
                        if (z) {
                            i7 = i2;
                            fcg0Var2 = fcg0Var;
                            break;
                        }
                    } else {
                        next2 = it.next();
                        if (fcg0Var.b() != i6) {
                            Iterator it7 = it5;
                            jf4.n("ring buffer is full");
                            return it7;
                        }
                        int i12 = fcg0Var.d;
                        Iterator it8 = it5;
                        int i13 = fcg0Var.e;
                        objArr[(i12 + i13) % i6] = next2;
                        fcg0Var.e = i13 + 1;
                        if (fcg0Var.b() != i6) {
                            if (fcg0Var.e < i10) {
                                if (z2) {
                                    arrayList2 = fcg0Var;
                                } else {
                                    arrayList2 = new ArrayList(fcg0Var);
                                }
                                this.o = fgi0Var;
                                this.j = fcg0Var;
                                this.k = it;
                                this.l = i2;
                                this.m = i3;
                                this.n = (byte) 3;
                                fgi0Var.a(this, arrayList2);
                                wne wneVar4 = wne.f39444a;
                                return wneVar;
                            }
                            i8 = i6 + (i6 >> 1) + 1;
                            if (i8 > i10) {
                                i8 = i10;
                            }
                            if (fcg0Var.d == 0) {
                                array = Arrays.copyOf(objArr, i8);
                            } else {
                                array = fcg0Var.toArray(new Object[i8]);
                            }
                            fcg0Var = new fcg0(fcg0Var.e, array);
                        }
                        it5 = it8;
                    }
                }
                if (fcg0Var2.e > i9) {
                    if (z2) {
                        arrayList3 = fcg0Var2;
                    } else {
                        arrayList3 = new ArrayList(fcg0Var2);
                    }
                    this.o = fgi0Var;
                    this.j = fcg0Var2;
                    this.k = it3;
                    this.l = i7;
                    this.m = i3;
                    this.n = (byte) 4;
                    fgi0Var.a(this, arrayList3);
                    wne wneVar5 = wne.f39444a;
                    return wneVar;
                }
                it4 = it3;
                if (!fcg0Var2.isEmpty()) {
                    this.o = it4;
                    this.j = it4;
                    this.k = it4;
                    this.l = i7;
                    this.m = i3;
                    this.n = (byte) 5;
                    fgi0Var.a(this, fcg0Var2);
                    wne wneVar6 = wne.f39444a;
                    return wneVar;
                }
            }
        } else if (b != 1) {
            if (b != 2) {
                if (b == 3) {
                    i3 = this.m;
                    i2 = this.l;
                    it = this.k;
                    fcg0Var = (fcg0) this.j;
                    z1x.P(obj);
                    fcg0Var.e(i9);
                    while (true) {
                        i6 = fcg0Var.c;
                        objArr = fcg0Var.b;
                        if (it.hasNext()) {
                            it3 = it5;
                            if (z) {
                                i7 = i2;
                                fcg0Var2 = fcg0Var;
                                break;
                            }
                        } else {
                            next2 = it.next();
                            if (fcg0Var.b() != i6) {
                                Iterator it9 = it5;
                                jf4.n("ring buffer is full");
                                return it9;
                            }
                            int i14 = fcg0Var.d;
                            Iterator it10 = it5;
                            int i15 = fcg0Var.e;
                            objArr[(i14 + i15) % i6] = next2;
                            fcg0Var.e = i15 + 1;
                            if (fcg0Var.b() != i6) {
                                if (fcg0Var.e < i10) {
                                    if (z2) {
                                        arrayList2 = fcg0Var;
                                    } else {
                                        arrayList2 = new ArrayList(fcg0Var);
                                    }
                                    this.o = fgi0Var;
                                    this.j = fcg0Var;
                                    this.k = it;
                                    this.l = i2;
                                    this.m = i3;
                                    this.n = (byte) 3;
                                    fgi0Var.a(this, arrayList2);
                                    wne wneVar7 = wne.f39444a;
                                    return wneVar;
                                }
                                i8 = i6 + (i6 >> 1) + 1;
                                if (i8 > i10) {
                                    i8 = i10;
                                }
                                if (fcg0Var.d == 0) {
                                    array = Arrays.copyOf(objArr, i8);
                                } else {
                                    array = fcg0Var.toArray(new Object[i8]);
                                }
                                fcg0Var = new fcg0(fcg0Var.e, array);
                            }
                            it5 = it10;
                        }
                    }
                } else if (b == 4) {
                    i3 = this.m;
                    i7 = this.l;
                    fcg0Var2 = (fcg0) this.j;
                    z1x.P(obj);
                    fcg0Var2.e(i9);
                    it3 = null;
                } else {
                    if (b != 5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                if (fcg0Var2.e > i9) {
                    if (z2) {
                        arrayList3 = fcg0Var2;
                    } else {
                        arrayList3 = new ArrayList(fcg0Var2);
                    }
                    this.o = fgi0Var;
                    this.j = fcg0Var2;
                    this.k = it3;
                    this.l = i7;
                    this.m = i3;
                    this.n = (byte) 4;
                    fgi0Var.a(this, arrayList3);
                    wne wneVar8 = wne.f39444a;
                    return wneVar;
                }
                it4 = it3;
                if (!fcg0Var2.isEmpty()) {
                    this.o = it4;
                    this.j = it4;
                    this.k = it4;
                    this.l = i7;
                    this.m = i3;
                    this.n = (byte) 5;
                    fgi0Var.a(this, fcg0Var2);
                    wne wneVar9 = wne.f39444a;
                    return wneVar;
                }
            }
            z1x.P(obj);
        } else {
            i5 = this.m;
            i4 = this.l;
            it2 = this.k;
            arrayList = (ArrayList) this.j;
            z1x.P(obj);
            if (z2) {
                arrayList.clear();
            } else {
                arrayList = new ArrayList(i10);
            }
            i = i5;
            while (it2.hasNext()) {
                next = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == i10) {
                        this.o = fgi0Var;
                        this.j = arrayList;
                        this.k = it2;
                        this.l = i4;
                        this.m = i;
                        this.n = (byte) 1;
                        fgi0Var.a(this, arrayList);
                        wne wneVar10 = wne.f39444a;
                        return wneVar;
                    }
                }
            }
            if (!arrayList.isEmpty() && (z || arrayList.size() == i10)) {
                this.o = null;
                this.j = null;
                this.k = null;
                this.l = i4;
                this.m = i;
                this.n = (byte) 2;
                fgi0Var.a(this, arrayList);
                wne wneVar11 = wne.f39444a;
                return wneVar;
            }
        }
        return Unit.f46060a;
    }
}
