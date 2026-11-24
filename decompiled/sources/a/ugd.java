package a;

import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ugd implements Function2, xdr, ydr, zdr, aer, ber, cer, der, kdr, ldr, mdr, ndr, odr, pdr, qdr, rdr, sdr, udr, vdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35619a;
    public final boolean b;
    public Object c;
    public yfe0 d;
    public ArrayList e;

    public ugd(int i, boolean z, Object obj) {
        this.f35619a = i;
        this.b = z;
        this.c = obj;
    }

    @Override // a.xdr
    public final /* bridge */ /* synthetic */ Object F(Object obj, Object obj2, Object obj3) {
        return b(obj, (fet) obj2, ((Number) obj3).intValue());
    }

    @Override // a.zdr
    public final /* bridge */ /* synthetic */ Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return g(obj, obj2, obj3, (fet) obj4, ((Number) obj5).intValue());
    }

    public final Object a(int i, fet fetVar) {
        fetVar.g0(this.f35619a);
        m(fetVar);
        int iU = i | (fetVar.g(this) ? u1c.u(2, 0) : u1c.u(1, 0));
        Object obj = this.c;
        obj.getClass();
        zys0.e(2, obj);
        Object objInvoke = ((Function2) obj).invoke(fetVar, Integer.valueOf(iU));
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new c48(2, this, ugd.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, (byte) 26);
        }
        return objInvoke;
    }

    public final Object b(Object obj, fet fetVar, int i) {
        fetVar.g0(this.f35619a);
        m(fetVar);
        int iU = fetVar.g(this) ? u1c.u(2, 1) : u1c.u(1, 1);
        Object obj2 = this.c;
        obj2.getClass();
        zys0.e(3, obj2);
        Object objF = ((xdr) obj2).F(obj, fetVar, Integer.valueOf(iU | i));
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(this, obj, i, (byte) 7);
        }
        return objF;
    }

    public final Object c(Object obj, Object obj2, fet fetVar, int i) {
        fetVar.g0(this.f35619a);
        m(fetVar);
        int iU = fetVar.g(this) ? u1c.u(2, 2) : u1c.u(1, 2);
        Object obj3 = this.c;
        obj3.getClass();
        zys0.e(4, obj3);
        Object objJ = ((ydr) obj3).j(obj, obj2, fetVar, Integer.valueOf(iU | i));
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(this, obj, obj2, i, (byte) 8);
        }
        return objJ;
    }

    @Override // a.cer
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, fet fetVar, Integer num) {
        return l(obj, obj2, obj3, obj4, obj5, obj6, fetVar, num.intValue());
    }

    public final Object g(Object obj, Object obj2, Object obj3, fet fetVar, int i) {
        fetVar.g0(this.f35619a);
        m(fetVar);
        int iU = fetVar.g(this) ? u1c.u(2, 3) : u1c.u(1, 3);
        Object obj4 = this.c;
        obj4.getClass();
        zys0.e(5, obj4);
        Object objO = ((zdr) obj4).O(obj, obj2, obj3, fetVar, Integer.valueOf(iU | i));
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 15, i, (Object) this, obj, obj2, obj3);
        }
        return objO;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, fet fetVar, int i) {
        fetVar.g0(this.f35619a);
        m(fetVar);
        int iU = fetVar.g(this) ? u1c.u(2, 4) : u1c.u(1, 4);
        Object obj5 = this.c;
        obj5.getClass();
        zys0.e(6, obj5);
        Object objN = ((aer) obj5).n(obj, obj2, obj3, obj4, fetVar, Integer.valueOf(i | iU));
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf((Object) this, obj, obj2, obj3, obj4, i, (byte) 9);
        }
        return objN;
    }

    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, fet fetVar, int i) {
        fetVar.g0(this.f35619a);
        m(fetVar);
        int iU = fetVar.g(this) ? u1c.u(2, 5) : u1c.u(1, 5);
        Object obj6 = this.c;
        obj6.getClass();
        zys0.e(7, obj6);
        Object objQ = ((ber) obj6).q(obj, obj2, obj3, obj4, obj5, fetVar, Integer.valueOf(i | iU));
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) this, obj, obj2, obj3, obj4, obj5, i, (byte) 6);
        }
        return objQ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((Number) obj2).intValue(), (fet) obj);
    }

    @Override // a.ydr
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        return c(obj, obj2, (fet) obj3, ((Number) obj4).intValue());
    }

    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, fet fetVar, int i) {
        fetVar.g0(this.f35619a);
        m(fetVar);
        int iU = fetVar.g(this) ? u1c.u(2, 6) : u1c.u(1, 6);
        Object obj7 = this.c;
        obj7.getClass();
        zys0.e(8, obj7);
        Object objF = ((cer) obj7).f(obj, obj2, obj3, obj4, obj5, obj6, fetVar, Integer.valueOf(i | iU));
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49((Object) this, obj, obj2, obj3, obj4, obj5, obj6, i, (byte) 4);
        }
        return objF;
    }

    public final void m(fet fetVar) {
        yfe0 yfe0VarA;
        if (!this.b || (yfe0VarA = fetVar.A()) == null) {
            return;
        }
        yfe0VarA.b |= 1;
        yfe0 yfe0Var = this.d;
        if (yfe0Var == null || !yfe0Var.a() || yfe0Var == yfe0VarA || Intrinsics.d(yfe0Var.c, yfe0VarA.c)) {
            this.d = yfe0VarA;
            return;
        }
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.e = arrayList2;
            arrayList2.add(yfe0VarA);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yfe0 yfe0Var2 = (yfe0) arrayList.get(i);
            if (yfe0Var2 == null || !yfe0Var2.a() || yfe0Var2 == yfe0VarA || Intrinsics.d(yfe0Var2.c, yfe0VarA.c)) {
                arrayList.set(i, yfe0VarA);
                return;
            }
        }
        arrayList.add(yfe0VarA);
    }

    @Override // a.aer
    public final /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return h(obj, obj2, obj3, obj4, (fet) obj5, ((Number) obj6).intValue());
    }

    @Override // a.ber
    public final /* bridge */ /* synthetic */ Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, fet fetVar, Integer num) {
        return i(obj, obj2, obj3, obj4, obj5, fetVar, num.intValue());
    }
}
