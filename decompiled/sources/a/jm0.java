package a;

import java.net.ConnectException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class jm0 extends bnn0 implements Function1 {
    public String i;
    public dn0 j;
    public jm0 k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public byte p;
    public final /* synthetic */ dn0 q;
    public final /* synthetic */ String r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm0(dn0 dn0Var, String str, boolean z, boolean z2, yje yjeVar) {
        super(1, yjeVar);
        this.q = dn0Var;
        this.r = str;
        this.s = z;
        this.t = z2;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new jm0(this.q, this.r, this.s, this.t, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((jm0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x0107  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00e4 -> B:21:0x0051). Please report as a decompilation issue!!! */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object g0g0Var;
        Object g0g0Var2;
        Object obj2;
        Object obj3;
        String str;
        dn0 dn0Var;
        jm0 jm0Var;
        boolean z2;
        boolean z3;
        int i;
        wne wneVar = wne.f39444a;
        int i2 = this.p;
        dn0 dn0Var2 = this.q;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        i2 = this.o;
                        i = this.n;
                        z3 = this.m;
                        z2 = this.l;
                        jm0Var = this.k;
                        dn0Var = this.j;
                        str = this.i;
                        z1x.P(obj);
                    } else {
                        if (i2 != 2) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = this.o;
                        i = this.n;
                        z3 = this.m;
                        z2 = this.l;
                        jm0Var = this.k;
                        dn0Var = this.j;
                        str = this.i;
                        z1x.P(obj);
                    }
                    g0g0Var = (List) obj;
                    e0g0 e0g0Var = j0g0.b;
                    obj3 = iun.f15405a;
                    if (g0g0Var instanceof g0g0) {
                        g0g0Var = obj3;
                    }
                    g0g0Var2 = (List) g0g0Var;
                    obj2 = iun.f15405a;
                    if (g0g0Var2 instanceof g0g0) {
                        g0g0Var2 = obj2;
                    }
                    List list = (List) g0g0Var2;
                    xk0 xk0Var = dn0Var2.c;
                    xk0Var.c = false;
                    list.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList = xk0Var.d;
                    copyOnWriteArrayList.clear();
                    copyOnWriteArrayList.addAll(list);
                    xk0Var.c();
                    xk0Var.f41010a = true;
                    return Unit.f46060a;
                }
                z1x.P(obj);
                e0g0 e0g0Var2 = j0g0.b;
                jm0Var = this;
                str = this.r;
                z2 = this.s;
                dn0Var = dn0Var2;
                i2 = 0;
                z3 = this.t;
                i = 0;
            } catch (Throwable th) {
                boolean z4 = i != 0 && (th instanceof zhi0) && th.e;
                if ((th instanceof CancellationException) || (th instanceof ConnectException) || z4) {
                    throw th;
                }
                if (th instanceof zhi0) {
                    if (th.f || th.e) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (hic.C(th)) {
                    z = false;
                } else {
                    z = true;
                }
                i2++;
                if (i2 <= 3 && !z) {
                    System.out.println((Object) ("error (" + i2 + "): " + th));
                    this.i = str;
                    this.j = dn0Var;
                    this.k = jm0Var;
                    this.l = z2;
                    this.m = z3;
                    this.n = i;
                    this.o = i2;
                    this.p = (byte) 2;
                    if (qcc.O(3000L, jm0Var) != wneVar) {
                    }
                    return wneVar;
                }
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var = new g0g0(th);
                obj3 = iun.f15405a;
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = obj3;
                }
                g0g0Var2 = (List) g0g0Var;
                obj2 = iun.f15405a;
                if (g0g0Var2 instanceof g0g0) {
                    g0g0Var2 = obj2;
                }
                List list2 = (List) g0g0Var2;
                xk0 xk0Var2 = dn0Var2.c;
                xk0Var2.c = false;
                list2.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList2 = xk0Var2.d;
                copyOnWriteArrayList2.clear();
                copyOnWriteArrayList2.addAll(list2);
                xk0Var2.c();
                xk0Var2.f41010a = true;
                return Unit.f46060a;
            }
            e0g0 e0g0Var4 = j0g0.b;
            this.i = str;
            this.j = dn0Var;
            this.k = jm0Var;
            this.l = z2;
            this.m = z3;
            this.n = i;
            this.o = i2;
            this.p = (byte) 1;
            obj = dn0Var.m(this, str, z2, z3);
            if (obj == wneVar) {
                return wneVar;
            }
            g0g0Var = (List) obj;
            e0g0 e0g0Var5 = j0g0.b;
            obj3 = iun.f15405a;
            if (g0g0Var instanceof g0g0) {
                g0g0Var = obj3;
            }
            g0g0Var2 = (List) g0g0Var;
        } catch (Throwable th2) {
            e0g0 e0g0Var6 = j0g0.b;
            g0g0Var2 = new g0g0(th2);
        }
        obj2 = iun.f15405a;
        if (g0g0Var2 instanceof g0g0) {
            g0g0Var2 = obj2;
        }
        List list3 = (List) g0g0Var2;
        xk0 xk0Var3 = dn0Var2.c;
        xk0Var3.c = false;
        list3.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList3 = xk0Var3.d;
        copyOnWriteArrayList3.clear();
        copyOnWriteArrayList3.addAll(list3);
        xk0Var3.c();
        xk0Var3.f41010a = true;
        return Unit.f46060a;
    }
}
