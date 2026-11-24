package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.xplatform.ufc.api.weight_class_rating.UfcWeightClassRatingParams;

/* JADX INFO: loaded from: classes4.dex */
public final class s7p0 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31761a = 1;
    public final ctf0 b;
    public final Object c;
    public final n0o0 d;
    public final n0o0 e;

    public s7p0(UfcWeightClassRatingParams ufcWeightClassRatingParams, z7v0 z7v0Var, g2v g2vVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.c = g2vVar;
        this.b = ctf0Var;
        Object obj = null;
        this.d = maz.b(new yw9(null, new xlr0(ufcWeightClassRatingParams, this, (byte) 11), (byte) 20));
        j0g0 j0g0Var = z7v0Var.f43939a;
        if (j0g0Var != null) {
            Object obj2 = j0g0Var.f15681a;
            obj = (List) (obj2 instanceof g0g0 ? null : obj2);
        }
        this.e = maz.b(new yw9(obj == null ? iun.f15405a : obj, new xis0((Object) this, (Object) ufcWeightClassRatingParams, (byte) 26), (byte) 20));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        a4x a4xVarO0;
        j7p0 i7p0Var;
        w9t0 v9t0Var;
        a4x a4xVarO1;
        sat0 rat0Var;
        y7v0 y7v0Var;
        byte b = this.f31761a;
        int i = 0;
        n0o0 n0o0Var = this.e;
        Object obj2 = this.c;
        n0o0 n0o0Var2 = this.d;
        switch (b) {
            case 0:
                p7p0 p7p0Var = (p7p0) obj;
                p7p0Var.getClass();
                ((fee) n0o0Var.getValue()).d(p7p0Var);
                o9p0 o9p0Var = p7p0Var.b;
                boolean z = p7p0Var.f26518a;
                boolean z2 = o9p0Var == null && z;
                if (z2) {
                    ArrayList arrayList = new ArrayList(8);
                    while (i < 8) {
                        arrayList.add(new q7p0(twn.m(i, "ACHIEVEMENTS_SHIMMER_KEY"), i0g.f13946a));
                        i++;
                    }
                    a4xVarO0 = dyb.o0(arrayList);
                } else {
                    a4xVarO0 = o9p0Var != null ? dyb.o0((Iterable) ((fee) n0o0Var.getValue()).b()) : lak0.c;
                }
                p9p0 p9p0Var = (p9p0) ((fee) n0o0Var2.getValue()).b();
                boolean zIsEmpty = a4xVarO0.isEmpty();
                g2v g2vVar = (g2v) obj2;
                if (!zIsEmpty || z) {
                    i7p0Var = zIsEmpty ? new i7p0(ozb.P(-1L, g2vVar)) : h7p0.f12587a;
                } else {
                    i7p0Var = new i7p0(ozb.Q(-1L, g2vVar));
                }
                return new r7p0(p9p0Var, i7p0Var, a4xVarO0, z2);
            case 1:
                aat0 aat0Var = (aat0) obj;
                aat0Var.getClass();
                ((fee) n0o0Var.getValue()).d(aat0Var);
                j0g0 j0g0Var = aat0Var.b;
                boolean z3 = j0g0Var == null;
                a4x a4xVarG0 = z3 ? dyb.g0(adt0.f697a, new bat0("CHAMP_INFO_SHIMMER_KEY", hnh.f13352a)) : dyb.o0((Iterable) ((fee) n0o0Var.getValue()).b());
                gat0 gat0Var = (gat0) ((fee) n0o0Var2.getValue()).b();
                boolean zIsEmpty2 = a4xVarG0.isEmpty();
                g2v g2vVar2 = (g2v) obj2;
                if (j0g0Var == null || !(j0g0Var.f15681a instanceof g0g0)) {
                    v9t0Var = zIsEmpty2 ? new v9t0(ozb.P(-1L, g2vVar2)) : u9t0.f35299a;
                } else {
                    v9t0Var = new v9t0(ozb.Q(-1L, g2vVar2));
                }
                return new cat0(gat0Var, v9t0Var, a4xVarG0, z3);
            case 2:
                wat0 wat0Var = (wat0) obj;
                wat0Var.getClass();
                fee feeVar = (fee) n0o0Var.getValue();
                j0g0 j0g0Var2 = wat0Var.b;
                feeVar.d(j0g0Var2);
                boolean z4 = j0g0Var2 == null;
                if (z4) {
                    ArrayList arrayList2 = new ArrayList(10);
                    while (i < 10) {
                        arrayList2.add(new pat0(twn.m(i, "CHAMP_PRIZE_POOL_SHIMMER_KEY"), p8m.f26562a));
                        i++;
                    }
                    a4xVarO1 = dyb.o0(arrayList2);
                } else {
                    a4xVarO1 = dyb.o0((Iterable) ((fee) n0o0Var.getValue()).b());
                }
                gat0 gat0Var2 = (gat0) ((fee) n0o0Var2.getValue()).b();
                boolean zIsEmpty3 = a4xVarO1.isEmpty();
                g2v g2vVar3 = (g2v) obj2;
                if (j0g0Var2 == null || !(j0g0Var2.f15681a instanceof g0g0)) {
                    rat0Var = zIsEmpty3 ? new rat0(ozb.P(-1L, g2vVar3)) : qat0.f28414a;
                } else {
                    rat0Var = new rat0(ozb.Q(-1L, g2vVar3));
                }
                return new xat0(gat0Var2, rat0Var, a4xVarO1, z4);
            case 3:
                z7v0 z7v0Var = (z7v0) obj;
                z7v0Var.getClass();
                zbk zbkVar = ((fee) n0o0Var2.getValue()).e;
                g2v g2vVar4 = (g2v) obj2;
                j0g0 j0g0Var3 = z7v0Var.f43939a;
                if (j0g0Var3 != null || z7v0Var.b) {
                    v7v0 v7v0Var = v7v0.f36949a;
                    if (j0g0Var3 == null) {
                        p7v0 p7v0Var = new p7v0("CHAMPION_SHIMMER", hoh.f13393a);
                        ArrayList arrayList3 = new ArrayList(10);
                        while (i < 10) {
                            arrayList3.add(new u7v0(String.valueOf(i), loh.f20389a));
                            i++;
                        }
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lc00VarB.add(p7v0Var);
                        lc00VarB.addAll(arrayList3);
                        y7v0Var = new y7v0(v7v0Var, dyb.o0(kotlin.collections.a.a(lc00VarB)));
                    } else {
                        Object obj3 = j0g0Var3.f15681a;
                        if (obj3 instanceof g0g0) {
                            y7v0Var = new y7v0(new w7v0(yyw.N(g2vVar4, ldm.f19857a)));
                        } else {
                            fee feeVar2 = (fee) n0o0Var.getValue();
                            feeVar2.getClass();
                            pz40 pz40VarA = feeVar2.a();
                            ((List) feeVar2.a().getValue()).getClass();
                            if (obj3 instanceof g0g0) {
                                obj3 = null;
                            }
                            Object obj4 = (List) obj3;
                            if (obj4 == null) {
                                obj4 = iun.f15405a;
                            }
                            pz40VarA.setValue(obj4);
                            if (((a4x) ((fee) n0o0Var.getValue()).b()).isEmpty()) {
                                y7v0Var = new y7v0(new w7v0(yyw.M(g2vVar4)));
                            } else {
                                lc00 lc00VarB2 = kotlin.collections.a.b();
                                y7v0Var = new y7v0(v7v0Var, twn.k(lc00VarB2, (Collection) ((fee) n0o0Var.getValue()).b(), lc00VarB2));
                            }
                        }
                    }
                } else {
                    y7v0Var = new y7v0(new w7v0(yyw.N(g2vVar4, ldm.f19857a)));
                }
                return new b8v0(zbkVar, y7v0Var);
            default:
                kyo0 kyo0Var = (kyo0) obj;
                kyo0Var.getClass();
                fee feeVar3 = (fee) n0o0Var2.getValue();
                feeVar3.getClass();
                pz40 pz40VarA2 = feeVar3.a();
                ((j3p0) feeVar3.a().getValue()).getClass();
                pz40VarA2.setValue(kyo0Var.e);
                n0o0 n0o0Var3 = (n0o0) obj2;
                fee feeVar4 = (fee) n0o0Var3.getValue();
                feeVar4.getClass();
                pz40 pz40VarA3 = feeVar4.a();
                ((kyo0) feeVar4.a().getValue()).getClass();
                pz40VarA3.setValue(kyo0Var);
                q6n q6nVar = (q6n) ((fee) n0o0Var3.getValue()).b();
                jyo0 jyo0Var = kyo0Var.f19116a;
                return new lyo0(q6nVar, (a4x) ((fee) n0o0Var.getValue()).b(), jyo0Var != null ? jyo0Var.f17370a : axh0.f1625a, (j3p0) ((fee) n0o0Var2.getValue()).c());
        }
    }

    public s7p0(wat0 wat0Var, ctf0 ctf0Var, g2v g2vVar) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = g2vVar;
        this.d = maz.b(new yw9(null, new caz(this, (byte) 27), (byte) 20));
        this.e = maz.b(new yw9(wat0Var.b, new qzs0((byte) 3), (byte) 20));
    }

    public s7p0(p7p0 p7p0Var, ctf0 ctf0Var, g2v g2vVar) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = g2vVar;
        this.d = maz.b(new yw9(null, new caz(this, (byte) 19), (byte) 20));
        this.e = maz.b(new yw9(p7p0Var, new ttn0(this, (byte) 21), (byte) 20));
    }

    public s7p0(aat0 aat0Var, ctf0 ctf0Var, g2v g2vVar) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = g2vVar;
        this.d = maz.b(new yw9(null, new caz(this, (byte) 26), (byte) 20));
        this.e = maz.b(new yw9(aat0Var, new lcr0(this, (byte) 25), (byte) 20));
    }

    public s7p0(kyo0 kyo0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.d = bkb.H(kyo0Var.e);
        this.e = maz.b(new yw9(j3p0.e, new ttn0(this, (byte) 16), (byte) 20));
        this.c = maz.b(new yw9(kyo0Var, new meo0((byte) 11), (byte) 20));
    }
}
