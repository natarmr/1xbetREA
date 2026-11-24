package a;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sog0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qlc f32540a;

    static {
        swq swqVar = new swq("java.lang.Void");
        f32540a = new qlc(swqVar.b(), swqVar.f32934a.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static bfy a(mer merVar) {
        String strR = x0x.R(merVar);
        if (strR == null) {
            if (merVar instanceof g0d0) {
                String strB = rek.j(merVar).getName().b();
                strB.getClass();
                strR = aey.a(strB);
            } else if (merVar instanceof n0d0) {
                String strB2 = rek.j(merVar).getName().b();
                strB2.getClass();
                strR = aey.b(strB2);
            } else {
                strR = ((wjj) merVar).getName().b();
                strR.getClass();
            }
        }
        return new bfy(new dfy(strR, m7x.w(merVar, 1)));
    }

    public static g1x b(d0d0 d0d0Var) {
        d0d0Var.getClass();
        d0d0 d0d0VarO1 = ((d0d0) oek.s(d0d0Var)).o1();
        d0d0VarO1.getClass();
        if (d0d0VarO1 instanceof rfk) {
            rfk rfkVar = (rfk) d0d0VarO1;
            p3d0 p3d0Var = rfkVar.B;
            ijt ijtVar = dgy.d;
            ijtVar.getClass();
            xfy xfyVar = (xfy) h8x.L(p3d0Var, ijtVar);
            if (xfyVar != null) {
                return new qfy(rfkVar, p3d0Var, xfyVar, rfkVar.Y, rfkVar.Z);
            }
        } else if (d0d0VarO1 instanceof x9y) {
            x9y x9yVar = (x9y) d0d0VarO1;
            gmk0 gmk0VarB = x9yVar.b();
            rog0 rog0Var = gmk0VarB instanceof rog0 ? (rog0) gmk0VarB : null;
            qqe0 qqe0Var = rog0Var != null ? rog0Var.f30835a : null;
            if (qqe0Var instanceof sqe0) {
                return new ofy(((sqe0) qqe0Var).f32626a);
            }
            if (!(qqe0Var instanceof vqe0)) {
                c99.u("Incorrect resolution sequence for Java field ", d0d0VarO1, " (source = ", qqe0Var);
                return null;
            }
            Method method = ((vqe0) qqe0Var).f37852a;
            n0d0 n0d0Var = x9yVar.y;
            gmk0 gmk0VarB2 = n0d0Var != null ? n0d0Var.b() : null;
            rog0 rog0Var2 = gmk0VarB2 instanceof rog0 ? (rog0) gmk0VarB2 : null;
            qqe0 qqe0Var2 = rog0Var2 != null ? rog0Var2.f30835a : null;
            vqe0 vqe0Var = qqe0Var2 instanceof vqe0 ? (vqe0) qqe0Var2 : null;
            return new pfy(method, vqe0Var != null ? vqe0Var.f37852a : null);
        }
        g0d0 g0d0VarD = d0d0VarO1.d();
        g0d0VarD.getClass();
        bfy bfyVarA = a(g0d0VarD);
        n0d0 n0d0VarE = d0d0VarO1.e();
        return new rfy(bfyVarA, n0d0VarE != null ? a(n0d0VarE) : null);
    }

    public static q0x c(mer merVar) {
        merVar.getClass();
        mer merVarO1 = ((mer) oek.s(merVar)).o1();
        merVarO1.getClass();
        if (merVarO1 instanceof wek) {
            kfk kfkVar = (kfk) merVarO1;
            z3 z3VarO = kfkVar.O();
            if (z3VarO instanceof i3d0) {
                sso ssoVar = egy.f7784a;
                dfy dfyVarC = egy.c((i3d0) z3VarO, kfkVar.A(), kfkVar.x());
                if (dfyVarC != null) {
                    return new bfy(dfyVarC);
                }
            }
            if (z3VarO instanceof v2d0) {
                sso ssoVar2 = egy.f7784a;
                dfy dfyVarA = egy.a((v2d0) z3VarO, kfkVar.A(), kfkVar.x());
                if (dfyVarA != null) {
                    vjj vjjVarJ = merVar.j();
                    vjjVarJ.getClass();
                    return ddx.a(vjjVarJ) ? new bfy(dfyVarA) : new afy(dfyVarA);
                }
            }
            return a(merVarO1);
        }
        if (merVarO1 instanceof u9y) {
            gmk0 gmk0VarB = ((u9y) merVarO1).b();
            rog0 rog0Var = gmk0VarB instanceof rog0 ? (rog0) gmk0VarB : null;
            qqe0 qqe0Var = rog0Var != null ? rog0Var.f30835a : null;
            vqe0 vqe0Var = qqe0Var instanceof vqe0 ? (vqe0) qqe0Var : null;
            if (vqe0Var != null) {
                return new zey(vqe0Var.f37852a);
            }
            ohq.u(merVarO1, "Incorrect resolution sequence for Java method ");
            return null;
        }
        if (!(merVarO1 instanceof p8y)) {
            return a(merVarO1);
        }
        gmk0 gmk0VarB2 = ((p8y) merVarO1).b();
        rog0 rog0Var2 = gmk0VarB2 instanceof rog0 ? (rog0) gmk0VarB2 : null;
        qqe0 qqe0Var2 = rog0Var2 != null ? rog0Var2.f30835a : null;
        if (qqe0Var2 instanceof pqe0) {
            return new yey(((pqe0) qqe0Var2).f27412a);
        }
        if (qqe0Var2 instanceof mqe0) {
            Class cls = ((mqe0) qqe0Var2).f22221a;
            if (cls.isAnnotation()) {
                return new xey(cls);
            }
        }
        c99.u("Incorrect resolution sequence for Java constructor ", merVarO1, " (", qqe0Var2);
        return null;
    }
}
