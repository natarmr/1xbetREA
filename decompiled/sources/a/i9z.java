package a;

import com.appsflyer.sdk_base.referrer.Payload;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class i9z implements rnb0 {
    public static final /* synthetic */ iiy[] h = {new j0d0(i9z.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0), new j0d0(i9z.class, Payload.TYPE, "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new j0d0(i9z.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f7u f14412a;
    public final cqe0 b;
    public final bu00 c;
    public final cu00 d;
    public final rog0 e;
    public final cu00 f;
    public final boolean g;

    public i9z(f7u f7uVar, cqe0 cqe0Var, boolean z) {
        f7uVar.getClass();
        cqe0Var.getClass();
        this.f14412a = f7uVar;
        this.b = cqe0Var;
        v7i v7iVar = (v7i) f7uVar.b;
        this.c = new bu00((eu00) v7iVar.i, new h9z(this, (byte) 0));
        this.d = new cu00((eu00) v7iVar.i, new h9z(this, (byte) 1));
        this.e = m2a.v(cqe0Var);
        this.f = new cu00((eu00) v7iVar.i, new h9z(this, (byte) 2));
        this.g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r2e a(dqe0 dqe0Var) throws Throwable {
        zqe0 gqe0Var;
        wsy wsyVarH;
        if (dqe0Var instanceof tqe0) {
            return jtv.G0(null, ((tqe0) dqe0Var).b);
        }
        if (dqe0Var instanceof rqe0) {
            Enum r6 = ((rqe0) dqe0Var).b;
            Class<?> enclosingClass = r6.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            enclosingClass.getClass();
            return new h0o(bqe0.a(enclosingClass), g950.e(r6.name()));
        }
        boolean z = dqe0Var instanceof fqe0;
        f7u f7uVar = this.f14412a;
        if (z) {
            fqe0 fqe0Var = (fqe0) dqe0Var;
            g950 g950Var = fqe0Var.f6511a;
            if (g950Var == null) {
                g950Var = bey.b;
            }
            g950Var.getClass();
            ArrayList arrayListA = fqe0Var.a();
            if (!bdx.k0((kzj0) yqm0.s(this.d, h[1]))) {
                wm40 wm40VarD = rek.d(this);
                wm40VarD.getClass();
                k3u0 k3u0VarM0 = rcb.m0(g950Var, wm40VarD);
                if (k3u0VarM0 == null || (wsyVarH = k3u0VarM0.getType()) == null) {
                    ary aryVar = ((zm40) ((v7i) f7uVar.b).j).e;
                    t3u0 t3u0Var = t3u0.c;
                    wsyVarH = aryVar.h(f2o.c(c2o.Z, new String[0]));
                }
                ArrayList arrayList = new ArrayList(r3d.q(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    r2e r2eVarA = a((dqe0) it.next());
                    if (r2eVarA == null) {
                        r2eVarA = new l860(null);
                    }
                    arrayList.add(r2eVarA);
                }
                return new h0t0(arrayList, wsyVarH);
            }
        } else {
            if (dqe0Var instanceof eqe0) {
                return new e93((Object) new i9z(f7uVar, new cqe0(((eqe0) dqe0Var).b), false));
            }
            if (dqe0Var instanceof nqe0) {
                Class cls = ((nqe0) dqe0Var).b;
                if (cls.isPrimitive()) {
                    gqe0Var = new xqe0(cls);
                } else if ((cls instanceof GenericArrayType) || cls.isArray()) {
                    gqe0Var = new gqe0(cls);
                } else {
                    gqe0Var = cls instanceof WildcardType ? new cre0((WildcardType) cls) : new oqe0(cls);
                }
                wsy wsyVarV = ((nvu) f7uVar.e).V(gqe0Var, xvw.Y(b0t0.b, false, null, 7));
                if (!bdx.k0(wsyVarV)) {
                    wsy wsyVarB = wsyVarV;
                    int i = 0;
                    while (ary.z(wsyVarB)) {
                        wsyVarB = ((pzs0) CollectionsKt.v0(wsyVarB.J())).b();
                        wsyVarB.getClass();
                        i++;
                    }
                    foc focVarN = wsyVarB.S().n();
                    if (focVarN instanceof wm40) {
                        qlc qlcVarF = rek.f(focVarN);
                        return qlcVarF == null ? new ehy(new bhy(wsyVarV)) : new ehy(qlcVarF, i);
                    }
                    if (focVarN instanceof hzs0) {
                        swq swqVarI = i4m0.f14153a.i();
                        return new ehy(new qlc(swqVarI.b(), swqVarI.f32934a.g()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // a.t83
    public final gmk0 b() {
        return this.e;
    }

    @Override // a.t83
    public final Map c() {
        return (Map) yqm0.s(this.f, h[2]);
    }

    @Override // a.t83
    public final swq d() {
        iiy iiyVar = h[0];
        bu00 bu00Var = this.c;
        bu00Var.getClass();
        iiyVar.getClass();
        return (swq) bu00Var.invoke();
    }

    @Override // a.t83
    public final wsy getType() {
        return (kzj0) yqm0.s(this.d, h[1]);
    }

    public final String toString() {
        return iek.c.o(this, null);
    }
}
