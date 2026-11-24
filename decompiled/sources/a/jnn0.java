package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jnn0 extends lm40 implements hpa0, w6k, gpa0 {
    public Object o;
    public Object p;
    public PointerInputEventHandler q;
    public c4m0 r;
    public woa0 s = fnn0.f9847a;
    public final xz40 t;
    public final xz40 u;
    public final xz40 v;
    public woa0 w;
    public long x;

    public jnn0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.o = obj;
        this.p = obj2;
        this.q = pointerInputEventHandler;
        xz40 xz40Var = new xz40(new inn0[16]);
        this.t = xz40Var;
        this.u = xz40Var;
        this.v = new xz40(new inn0[16]);
        this.x = 0L;
    }

    @Override // a.gpa0
    public final void H0() {
        b1();
    }

    @Override // a.lm40
    public final void S0() {
        b1();
    }

    public final Object Z0(yje yjeVar, Function2 function2) {
        n5a n5aVar = new n5a(1, pnx.b(yjeVar));
        n5aVar.r();
        inn0 inn0Var = new inn0(this, n5aVar);
        synchronized (this.u) {
            this.t.b(inn0Var);
            yje yjeVarB = pnx.b(pnx.a(inn0Var, inn0Var, function2));
            wne wneVar = wne.f39444a;
            usg0 usg0Var = new usg0(yjeVarB);
            e0g0 e0g0Var = j0g0.b;
            usg0Var.resumeWith(Unit.f46060a);
        }
        n5aVar.t(new caz(inn0Var, (byte) 18));
        return n5aVar.p();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004e A[Catch: all -> 0x0021, TryCatch #1 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0042, B:26:0x0045, B:28:0x004e, B:30:0x0056, B:32:0x005a), top: B:43:0x000d }] */
    public final void a1(woa0 woa0Var, xoa0 xoa0Var) {
        Object[] objArr;
        int i;
        int i2;
        inn0 inn0Var;
        n5a n5aVar;
        n5a n5aVar2;
        synchronized (this.u) {
            xz40 xz40Var = this.v;
            xz40Var.c(xz40Var.c, this.t);
        }
        try {
            int iOrdinal = xoa0Var.ordinal();
            if (iOrdinal == 0) {
                xz40 xz40Var2 = this.v;
                objArr = xz40Var2.f41739a;
                i = xz40Var2.c;
                for (i2 = 0; i2 < i; i2++) {
                    inn0Var = (inn0) objArr[i2];
                    if (xoa0Var != inn0Var.d && (n5aVar = inn0Var.c) != null) {
                        inn0Var.c = null;
                        e0g0 e0g0Var = j0g0.b;
                        n5aVar.resumeWith(woa0Var);
                    }
                }
            } else if (iOrdinal == 1) {
                xz40 xz40Var3 = this.v;
                int i3 = xz40Var3.c - 1;
                Object[] objArr2 = xz40Var3.f41739a;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        inn0 inn0Var2 = (inn0) objArr2[i3];
                        if (xoa0Var == inn0Var2.d && (n5aVar2 = inn0Var2.c) != null) {
                            inn0Var2.c = null;
                            e0g0 e0g0Var2 = j0g0.b;
                            n5aVar2.resumeWith(woa0Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new m460();
                }
                xz40 xz40Var4 = this.v;
                objArr = xz40Var4.f41739a;
                i = xz40Var4.c;
                while (i2 < i) {
                    inn0Var = (inn0) objArr[i2];
                    if (xoa0Var != inn0Var.d) {
                    }
                }
            }
            this.v.g();
        } catch (Throwable th) {
            this.v.g();
            throw th;
        }
    }

    @Override // a.yzj
    public final void b() {
        b1();
    }

    public final void b1() {
        c4m0 c4m0Var = this.r;
        if (c4m0Var != null) {
            c4m0Var.s(new tm40("Pointer input was reset", (byte) 2));
            this.r = null;
        }
    }

    @Override // a.w6k
    public final float getDensity() {
        return vcc.Z(this).z.getDensity();
    }

    @Override // a.gpa0
    public final void h(woa0 woa0Var, xoa0 xoa0Var, long j) {
        this.x = j;
        if (xoa0Var == xoa0.f41207a) {
            this.s = woa0Var;
        }
        yje yjeVar = null;
        if (this.r == null) {
            this.r = qjj.W(N0(), null, yne.d, new z8b0(this, yjeVar, (byte) 26), 1);
        }
        a1(woa0Var, xoa0Var);
        List list = woa0Var.f39485a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!x2x.L((dpa0) list.get(i))) {
                this.w = woa0Var;
            }
        }
        woa0Var = null;
        this.w = woa0Var;
    }

    @Override // a.gpa0
    public final void n0() {
        woa0 woa0Var = this.w;
        if (woa0Var == null) {
            return;
        }
        List list = woa0Var.f39485a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((dpa0) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    dpa0 dpa0Var = (dpa0) list.get(i2);
                    long j = dpa0Var.f6456a;
                    long j2 = dpa0Var.c;
                    long j3 = dpa0Var.b;
                    float f = dpa0Var.e;
                    boolean z = dpa0Var.d;
                    arrayList.add(new dpa0(j, j3, j2, false, f, j3, j2, z, z, dpa0Var.i, 0L, 1.0f, 0L));
                }
                woa0 woa0Var2 = new woa0(arrayList, null);
                this.s = woa0Var2;
                a1(woa0Var2, xoa0.f41207a);
                a1(woa0Var2, xoa0.b);
                a1(woa0Var2, xoa0.c);
                this.w = null;
                return;
            }
        }
    }

    @Override // a.w6k
    public final float v0() {
        return vcc.Z(this).z.v0();
    }
}
