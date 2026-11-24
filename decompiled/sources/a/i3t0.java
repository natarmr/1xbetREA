package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i3t0 extends k3t0 {
    public static final /* synthetic */ iiy[] n = {new j0d0(i3t0.class, CommonConstant.ReqAccessTokenParam.STATE_LABEL, "getState()Ljava/lang/Object;", 0)};
    public final Function0 b;
    public final Function1 c;
    public final g090 d;
    public final yzn0 e;
    public final oyg0 f;
    public final String g;
    public final Object h;
    public final ocj i;
    public final n0o0 j;
    public final yzn0 k;
    public final xae0 l;
    public final p7m0 m;

    public i3t0(vzg0 vzg0Var, Function0 function0, Function1 function1, g090 g090Var, yzn0 yzn0Var) {
        this.b = function0;
        this.c = function1;
        this.d = g090Var;
        this.e = yzn0Var;
        this.f = new oyg0(vzg0Var);
        this.g = getClass().getSimpleName();
        Object objInvoke = function0.invoke();
        this.h = objInvoke;
        ocj ocjVar = new ocj(objInvoke);
        this.i = ocjVar;
        this.j = maz.b(new ui6(this, (byte) 17));
        this.k = yzn0Var;
        p7m0 p7m0Var = ocjVar.f25029a;
        this.l = vtb.h0(new omi0(new p6d(p7m0Var, ydx.V(null, new xns0((byte) 12)), new sye0(3, null), (byte) 1), function1, (byte) 14), d5c.S(jiu0.a(this), (lne) g090Var.f10448a), new o6m0(Long.MAX_VALUE), function1.invoke(objInvoke));
        this.m = p7m0Var;
    }

    public static void A(i3t0 i3t0Var, j3t0 j3t0Var, Object obj, lne lneVar, Function1 function1, int i) {
        if ((i & 2) != 0) {
            lneVar = (lne) i3t0Var.d.b;
        }
        if ((i & 4) != 0) {
            function1 = z2t0.f43688a;
        }
        i3t0Var.z(j3t0Var, obj, lneVar, function1);
    }

    public static bby B(i3t0 i3t0Var, j3t0 j3t0Var, Object[] objArr) {
        lne lneVar = (lne) i3t0Var.d.b;
        a3t0 a3t0Var = a3t0.f191a;
        i3t0Var.getClass();
        j3t0Var.getClass();
        lneVar.getClass();
        return sac.V(jiu0.a(i3t0Var), new xar0(a3t0Var, (byte) 19), null, lneVar, new pwc(objArr, j3t0Var, null), 10);
    }

    public static bby F(i3t0 i3t0Var, j3t0 j3t0Var, lne lneVar, Function1 function1, Function2 function2, int i) {
        if ((i & 1) != 0) {
            lneVar = null;
        }
        Function1 function3 = (i & 2) != 0 ? null : function1;
        i3t0Var.getClass();
        j3t0Var.getClass();
        bvc bvcVarA = jiu0.a(i3t0Var);
        qzs0 qzs0Var = new qzs0((byte) 1);
        if (lneVar == null) {
            lneVar = (lne) i3t0Var.d.b;
        }
        return sac.V(bvcVarA, qzs0Var, null, lneVar, new jv0(function3, function2, j3t0Var, i3t0Var, null, (byte) 15), 10);
    }

    public static bby K(i3t0 i3t0Var, lne lneVar, Function1 function1, Function1 function2, int i) {
        if ((i & 1) != 0) {
            lneVar = (lne) i3t0Var.d.b;
        }
        if ((i & 2) != 0) {
            function1 = g3t0.f10628a;
        }
        return i3t0Var.I(lneVar, function1, function2);
    }

    public static c4m0 L(i3t0 i3t0Var, gmq gmqVar, lne lneVar, Function1 function1, int i) {
        if ((i & 1) != 0) {
            lneVar = (lne) i3t0Var.d.b;
        }
        if ((i & 2) != 0) {
            function1 = h3t0.f12404a;
        }
        return i3t0Var.J(gmqVar, lneVar, function1);
    }

    public final gmq C() {
        ntj0 ntj0Var = (ntj0) this.j.getValue();
        byte b = 22;
        return new i89(new fnq(new xp90(new i89(ntj0Var.c, b), (byte) 8), new tmg0(ntj0Var, null, (byte) 13)), b);
    }

    public final Object D() {
        iiy iiyVar = n[0];
        p7m0 p7m0Var = this.m;
        p7m0Var.getClass();
        return p7m0Var.getValue();
    }

    public final void E() {
        ((ntj0) this.j.getValue()).d();
    }

    public final void G(Object obj) {
        ((ntj0) this.j.getValue()).e(obj);
    }

    public final void H(Function2 function2) {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
        } while (!p7m0Var.m(value, function2.invoke(this.f, value)));
    }

    public final bby I(lne lneVar, Function1 function1, Function1 function2) {
        lneVar.getClass();
        function1.getClass();
        return sac.V(jiu0.a(this), new xar0(function1, (byte) 20), null, lneVar, new a2f(function2, null, (byte) 9), 10);
    }

    public final c4m0 J(gmq gmqVar, lne lneVar, Function1 function1) {
        lneVar.getClass();
        function1.getClass();
        return sac.T(gmqVar, d5c.S(jiu0.a(this), lneVar), new myh(function1, (yje) null, (byte) 3));
    }

    @Override // a.k3t0
    public gmq w() {
        return ulb.L(new omi0(this.i.f25029a, this.c, (byte) 13), (lne) this.d.f10448a);
    }

    @Override // a.k3t0
    public void x(Object obj) {
        obj.getClass();
        yzn0 yzn0Var = this.k;
        if (yzn0Var != null) {
            yzn0Var.t(obj);
        }
        yzn0 yzn0Var2 = this.e;
        if (yzn0Var2 != null) {
            yzn0Var2.t(obj);
        }
        String str = this.g;
        str.getClass();
        yum0.j(str, "onAction", "🚀 Выполнить Action ".concat(obj.getClass().getSimpleName()));
    }

    public final pz40 y(fet fetVar) {
        fetVar.e0(-1818269777);
        boolean zG = fetVar.g(this);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = this.l;
            fetVar.o0(objP);
        }
        pz40 pz40VarF = ydx.F((n7m0) objP, fetVar);
        fetVar.r(false);
        return pz40VarF;
    }

    public final bby z(j3t0 j3t0Var, Object obj, lne lneVar, Function1 function1) {
        j3t0Var.getClass();
        lneVar.getClass();
        function1.getClass();
        return sac.V(jiu0.a(this), new xar0(function1, (byte) 21), null, lneVar, new meq0((Object) j3t0Var, obj, (yje) null, (byte) 29), 10);
    }

    public i3t0(Function0 function0, g090 g090Var, Function1 function1, yzn0 yzn0Var) {
        this(null, function0, new las0(1, function1.invoke(function0.invoke()), v6t0.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 8), g090Var, yzn0Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i3t0(final vzg0 vzg0Var, final Function1 function1, Function1 function2, g090 g090Var) {
        vzg0Var.getClass();
        final byte b = 1;
        this(vzg0Var, new Function0() { // from class: a.y2t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                vzg0 vzg0Var2 = vzg0Var;
                Function1 function3 = function1;
                switch (b2) {
                    case 0:
                        break;
                }
                return function3.invoke(vzg0Var2);
            }
        }, function2, g090Var, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i3t0(final vzg0 vzg0Var, final Function1 function1, g090 g090Var, Function1 function2) {
        vzg0Var.getClass();
        final byte b = 0;
        this(vzg0Var, new Function0() { // from class: a.y2t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                vzg0 vzg0Var2 = vzg0Var;
                Function1 function3 = function1;
                switch (b2) {
                    case 0:
                        break;
                }
                return function3.invoke(vzg0Var2);
            }
        }, new las0(1, function2.invoke(function1.invoke(vzg0Var)), v6t0.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 9), g090Var, null);
    }
}
