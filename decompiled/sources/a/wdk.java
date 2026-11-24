package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wdk extends v2 {
    public static final /* synthetic */ iiy[] g = {new j0d0(wdk.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0), new j0d0(wdk.class, "arguments", "getArguments()Ljava/util/List;", 0)};
    public final wsy b;
    public final boolean c;
    public final mre0 d;
    public final mre0 e;
    public final a8z f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wdk(wsy wsyVar, Function0 function0, boolean z) {
        super(function0);
        wsyVar.getClass();
        this.b = wsyVar;
        this.c = z;
        this.d = bww.S(null, new vdk(this, (byte) 0));
        this.e = bww.S(null, new lhf(this, function0, (byte) 15));
        this.f = maz.a(wez.f39042a, new vdk(this, (byte) 1));
    }

    @Override // a.v2
    public final v2 A(boolean z) {
        wsy wsyVarE;
        wsy wsyVar = this.b;
        if (z) {
            wsyVarE = kud.e(wsyVar.j0(), true);
            if (wsyVarE == null) {
                return this;
            }
        } else {
            szj szjVar = wsyVar instanceof szj ? (szj) wsyVar : null;
            if (szjVar == null || (wsyVarE = szjVar.b) == null) {
                return this;
            }
        }
        return new wdk(wsyVarE, null);
    }

    @Override // a.v2
    public final v2 B(boolean z) {
        wsy wsyVar = this.b;
        wsyVar.getClass();
        if (!(wsyVar.j0() instanceof kkq) && wsyVar.U() == z) {
            return this;
        }
        tft0 tft0VarH = e0t0.h(wsyVar, z);
        tft0VarH.getClass();
        return new wdk(tft0VarH, null);
    }

    @Override // a.v2
    public final v2 C() {
        tft0 tft0VarJ0 = this.b.j0();
        if (tft0VarJ0 instanceof kkq) {
            return new wdk(((kkq) tft0VarJ0).c, null);
        }
        return null;
    }

    public final fhy D(wsy wsyVar) {
        ihy ihyVarH;
        oiy oiyVarH;
        wsy wsyVarB;
        if (this.c) {
            foc focVarN = wsyVar.S().n();
            m660 m660Var = focVarN instanceof m660 ? (m660) focVarN : null;
            if (m660Var != null) {
                return new liy(rek.g(m660Var));
            }
        }
        foc focVarN2 = wsyVar.S().n();
        if (focVarN2 instanceof wm40) {
            Class clsQ = xtt0.q((wm40) focVarN2);
            if (clsQ != null) {
                if (!ary.z(wsyVar)) {
                    if (e0t0.e(wsyVar)) {
                        return new xgy(clsQ);
                    }
                    Class cls = (Class) bqe0.b.get(clsQ);
                    if (cls != null) {
                        clsQ = cls;
                    }
                    return new xgy(clsQ);
                }
                pzs0 pzs0Var = (pzs0) CollectionsKt.x0(wsyVar.J());
                if (pzs0Var == null || (wsyVarB = pzs0Var.b()) == null) {
                    return new xgy(clsQ);
                }
                fhy fhyVarD = D(e0t0.h(wsyVarB, true));
                if (fhyVarD != null) {
                    return new xgy(xtt0.e(azw.H(g7x.F(fhyVarD))));
                }
                ohq.u(this, "Cannot determine classifier for array element type: ");
                return null;
            }
        } else if (focVarN2 instanceof hzs0) {
            hzs0 hzs0Var = (hzs0) focVarN2;
            vjj vjjVarJ = hzs0Var.j();
            vjjVarJ.getClass();
            if (vjjVarJ instanceof wm40) {
                oiyVarH = c3x.H((wm40) vjjVarJ);
            } else if (vjjVarJ instanceof mp9) {
                vjj vjjVarJ2 = ((mp9) vjjVarJ).j();
                vjjVarJ2.getClass();
                if (vjjVarJ2 instanceof wm40) {
                    ihyVarH = c3x.H((wm40) vjjVarJ2);
                } else {
                    kfk kfkVar = vjjVarJ instanceof kfk ? (kfk) vjjVarJ : null;
                    if (kfkVar == null) {
                        ohq.u(vjjVarJ, "Non-class callable descriptor must be deserialized: ");
                        return null;
                    }
                    hfk hfkVarB = kfkVar.B();
                    if (hfkVarB instanceof kfy) {
                        jre0 jre0Var = ((kfy) hfkVarB).c;
                        jre0 jre0Var2 = jre0Var != null ? jre0Var : null;
                        if (jre0Var2 == null) {
                            udk.f("Container of top-level deserialized member is not resolved: ", kfkVar, " (", jre0Var);
                            return null;
                        }
                        ghy ghyVarC = sre0.f32672a.c(jre0Var2.f16999a);
                        ghyVarC.getClass();
                        ihyVarH = (zhy) ghyVarC;
                    } else if (hfkVarB instanceof ir00) {
                        ihyVarH = ((ir00) hfkVarB).f15234a;
                    } else {
                        if (!(hfkVarB instanceof qre0)) {
                            ohq.u(kfkVar, "Container of deserialized member is not resolved: ");
                            return null;
                        }
                        ihyVarH = ztn.b;
                    }
                }
                Object objI0 = vjjVarJ.i0(new xex(ihyVarH), Unit.f46060a);
                objI0.getClass();
                oiyVarH = (oiy) objI0;
            } else {
                ohq.u(vjjVarJ, "Unknown type parameter container: ");
            }
            return new niy(oiyVarH, hzs0Var);
        }
        return null;
    }

    @Override // a.kiy
    public final List M() {
        iiy iiyVar = g[1];
        Object objInvoke = this.e.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // a.v2
    public final kiy c() {
        wsy wsyVar = this.b;
        wsyVar.getClass();
        tft0 tft0VarJ0 = wsyVar.j0();
        p pVar = tft0VarJ0 instanceof p ? (p) tft0VarJ0 : null;
        kzj0 kzj0Var = pVar != null ? pVar.c : null;
        if (kzj0Var != null) {
            return new wdk(kzj0Var, this.f36658a, true);
        }
        return null;
    }

    @Override // a.v2
    public final boolean equals(Object obj) {
        if (!aao0.f538a) {
            return super.equals(obj);
        }
        if (!(obj instanceof wdk)) {
            return false;
        }
        wdk wdkVar = (wdk) obj;
        return Intrinsics.d(this.b, wdkVar.b) && Intrinsics.d(o(), wdkVar.o()) && Intrinsics.d(M(), wdkVar.M());
    }

    @Override // a.v2
    public final a8z f() {
        return this.f;
    }

    @Override // a.kiy
    public final boolean h() {
        return this.b.U();
    }

    @Override // a.v2
    public final int hashCode() {
        if (!aao0.f538a) {
            return super.hashCode();
        }
        int iHashCode = this.b.hashCode() * 31;
        fhy fhyVarO = o();
        return M().hashCode() + ((iHashCode + (fhyVarO != null ? fhyVarO.hashCode() : 0)) * 31);
    }

    @Override // a.v2
    public final sgy j() {
        foc focVarN = this.b.S().n();
        wm40 wm40Var = focVarN instanceof wm40 ? (wm40) focVarN : null;
        if (wm40Var != null) {
            String str = bay.f2281a;
            if (bay.j.containsKey(oek.f(wm40Var))) {
                if (aao0.f538a) {
                    fhy fhyVarO = o();
                    fhyVarO.getClass();
                    return new eek((sgy) fhyVarO, wm40Var);
                }
                fhy fhyVarO2 = o();
                fhyVarO2.getClass();
                return md9.a((sgy) fhyVarO2);
            }
        }
        return null;
    }

    @Override // a.v2
    public final boolean n() {
        wsy wsyVar = this.b;
        wsyVar.getClass();
        return wsyVar.j0() instanceof szj;
    }

    @Override // a.kiy
    public final fhy o() {
        iiy iiyVar = g[0];
        return (fhy) this.d.invoke();
    }

    @Override // a.v2
    public final boolean p() {
        wsy wsyVar = this.b;
        if (wsyVar != null) {
            g950 g950Var = ary.e;
            return ary.B(wsyVar, i4m0.b);
        }
        ary.a(138);
        throw null;
    }

    @Override // a.v2
    public final boolean q() {
        return this.b instanceof dae0;
    }

    @Override // a.v2
    public final boolean u() {
        return bfb.Y(this.b);
    }

    @Override // a.v2
    public final v2 z() {
        tft0 tft0VarJ0 = this.b.j0();
        if (tft0VarJ0 instanceof kkq) {
            return new wdk(((kkq) tft0VarJ0).b, null);
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wdk(wsy wsyVar, Function0 function0) {
        this(wsyVar, function0, false);
        wsyVar.getClass();
    }
}
