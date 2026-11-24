package a;

import android.gov.nist.core.Separators;
import android.view.View;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.bethistory.history.domain.model.BetHistoryFilterItemModel;

/* JADX INFO: loaded from: classes3.dex */
public final class ugf0 implements phi0, pcl0, vkn0, zf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f35622a;

    public ugf0(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 5:
                this.f35622a = new rta0(gii0Var, (byte) 26);
                break;
            default:
                this.f35622a = new rta0(gii0Var, (byte) 21);
                break;
        }
    }

    @Override // a.pcl0
    public p530 A() {
        return ((pui) this.f35622a).A();
    }

    @Override // a.phi0
    public void B(sgy sgyVar, Function1 function1) {
        ((qaj) this.f35622a).i(sgyVar, function1, true);
    }

    @Override // a.pcl0
    public as20 C() {
        return ((pui) this.f35622a).C();
    }

    @Override // a.pcl0
    public ntt D() {
        return ((pui) this.f35622a).D();
    }

    @Override // a.pcl0
    public s1u E() {
        return ((pui) this.f35622a).E();
    }

    @Override // a.pcl0
    public b8u F() {
        return ((pui) this.f35622a).F();
    }

    @Override // a.phi0
    public void G(sgy sgyVar, Function1 function1) {
        sgyVar.getClass();
        ((qaj) this.f35622a).k(sgyVar, new wje(function1), true);
    }

    @Override // a.pcl0
    public hmt0 H() {
        return ((pui) this.f35622a).H();
    }

    @Override // a.pcl0
    public f4u I() {
        return ((pui) this.f35622a).I();
    }

    @Override // a.pcl0
    public aqp J() {
        return ((pui) this.f35622a).J();
    }

    @Override // a.phi0
    public void K(sgy sgyVar, Function1 function1) {
        ((qaj) this.f35622a).g(sgyVar, function1, true);
    }

    @Override // a.pcl0
    public n1d L() {
        return ((pui) this.f35622a).L();
    }

    @Override // a.pcl0
    public yi6 M() {
        return ((pui) this.f35622a).M();
    }

    @Override // a.pcl0
    public abu N() {
        return ((pui) this.f35622a).N();
    }

    @Override // a.pcl0
    public es O() {
        return ((pui) this.f35622a).O();
    }

    @Override // a.pcl0
    public x4u P() {
        return ((pui) this.f35622a).P();
    }

    @Override // a.pcl0
    public bwl Q() {
        return ((pui) this.f35622a).Q();
    }

    @Override // a.pcl0
    public bwl R() {
        return ((pui) this.f35622a).R();
    }

    @Override // a.pcl0
    public ocl S() {
        return new ocl((ik6) ((pui) this.f35622a).z1.get());
    }

    @Override // a.pcl0
    public n1d T() {
        return ((pui) this.f35622a).T();
    }

    @Override // a.pcl0
    public pqc U() {
        return ((pui) this.f35622a).U();
    }

    @Override // a.pcl0
    public tpp V() {
        return ((pui) this.f35622a).V();
    }

    @Override // a.pcl0
    public f2v W() {
        return ((pui) this.f35622a).W();
    }

    @Override // a.pcl0
    public yfu X() {
        return ((pui) this.f35622a).X();
    }

    @Override // a.pcl0
    public cad Y() {
        return ((pui) this.f35622a).Y();
    }

    @Override // a.phi0
    public void Z(sgy sgyVar, jiy jiyVar) {
        ((qaj) this.f35622a).k(sgyVar, new vje(jiyVar), true);
    }

    @Override // a.pcl0
    public rbu a() {
        return new rbu((w5s) ((pui) this.f35622a).m1.get(), (byte) 0);
    }

    @Override // a.pcl0
    public j1u a0() {
        return ((pui) this.f35622a).a0();
    }

    @Override // a.pcl0
    public oku b() {
        return ((pui) this.f35622a).b();
    }

    @Override // a.pcl0
    public uii b0() {
        return ((pui) this.f35622a).b0();
    }

    @Override // a.pcl0
    public reu c() {
        return ((pui) this.f35622a).c();
    }

    @Override // a.pcl0
    public ikt0 c0() {
        return ((pui) this.f35622a).c0();
    }

    @Override // a.pcl0
    public a1d d() {
        return ((pui) this.f35622a).d();
    }

    public Object d0(double d, zje zjeVar, boolean z) {
        ylq0 ylq0Var;
        j910 j910Var = (j910) this.f35622a;
        ot10 ot10Var = (ot10) j910Var.b;
        ((us3) j910Var.c).getClass();
        int offset = TimeZone.getDefault().getOffset(new Date().getTime()) / 3600000;
        if (2 > offset || offset >= 6) {
            ylq0Var = (6 > offset || offset >= 13) ? ylq0.c : ylq0.b;
        } else {
            ylq0Var = ylq0.f42857a;
        }
        Object objC = ot10Var.c(ot10.a(d, ylq0Var, ot10Var.g.isPartner(), z).code(), zjeVar);
        wne wneVar = wne.f39444a;
        if (objC != wneVar) {
            objC = Unit.f46060a;
        }
        return objC == wneVar ? objC : Unit.f46060a;
    }

    @Override // a.pcl0
    public rrc e() {
        return ((pui) this.f35622a).e();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void e0() {
        p070 p070Var;
        p070 p070Var2;
        p070 p070Var3;
        List list;
        g7d g7dVar = ((pbt) this.f35622a).c;
        g7dVar.g.n(xun.f41520a);
        d7d d7dVarC = g7dVar.c();
        d7d d7dVarA = null;
        list = null;
        list = null;
        List list2 = null;
        if (d7dVarC != null) {
            d7d d7dVarC2 = g7dVar.c();
            if (d7dVarC2 == null || (p070Var2 = d7dVarC2.f5589a) == null) {
                iun iunVar = iun.f15405a;
                p070Var = new p070(iunVar, iunVar);
            } else {
                d7d d7dVarC3 = g7dVar.c();
                if (d7dVarC3 != null && (p070Var3 = d7dVarC3.f5589a) != null && (list = p070Var3.f26136a) != null) {
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(pbv.a((pbv) it.next(), null, false, true, 163839));
                    }
                    list2 = arrayList;
                }
                if (list2 == null) {
                    list2 = iun.f15405a;
                }
                p070Var = p070.a(p070Var2, list2);
            }
            d7dVarA = d7d.a(d7dVarC, p070Var);
        }
        g7dVar.e(d7dVarA);
    }

    @Override // a.pcl0
    public fix f() {
        return ((pui) this.f35622a).f();
    }

    public void f0(List list, HistoryTypeModel historyTypeModel, f8w f8wVar) {
        historyTypeModel.getClass();
        f8wVar.getClass();
        j77 j77Var = (j77) ((dpi0) this.f35622a).f6468a;
        int iOrdinal = f8wVar.ordinal();
        if (iOrdinal == 0) {
            j77Var.getClass();
            j77Var.f16027a.put(historyTypeModel, list);
        } else if (iOrdinal != 1) {
            t9f.b();
        } else {
            j77Var.getClass();
            j77Var.b.put(historyTypeModel, list);
        }
    }

    @Override // a.pcl0
    public oif0 g() {
        return ((pui) this.f35622a).g();
    }

    public void g0(Set set) {
        set.getClass();
        ((vwb0) ((es) this.f35622a).f8305a).h("FOLLOWED_COUNTRY_IDS", CollectionsKt.b0(set, Separators.COMMA, null, null, null, 62));
    }

    @Override // a.phi0
    public void h(sgy sgyVar, sgy sgyVar2, jiy jiyVar) {
        ((qaj) this.f35622a).j(sgyVar, sgyVar2, jiyVar, true);
    }

    public boolean h0(sys0 sys0Var, s77 s77Var, e4f e4fVar) {
        Object next;
        sys0Var.getClass();
        s77Var.getClass();
        tnm0 tnm0Var = (tnm0) this.f35622a;
        tnm0Var.getClass();
        List list = (List) tnm0Var.c(sys0Var).get(s77Var);
        if (list == null) {
            return true;
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((BetHistoryFilterItemModel) next).f46411a != e4fVar);
        BetHistoryFilterItemModel betHistoryFilterItemModel = (BetHistoryFilterItemModel) next;
        if (betHistoryFilterItemModel != null) {
            return betHistoryFilterItemModel.b;
        }
        return true;
    }

    @Override // a.pcl0
    public nvu i() {
        return ((pui) this.f35622a).i();
    }

    public owp0 i0() {
        return new owp0((a4w0) ((pui) this.f35622a).O1.get());
    }

    @Override // a.pcl0
    public ntt j() {
        return ((pui) this.f35622a).j();
    }

    @Override // a.pcl0
    public ivn k() {
        return ((pui) this.f35622a).k();
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        vvn0 vvn0Var = (vvn0) this.f35622a;
        View viewQ0 = vvn0Var.q0();
        jmu0.l(knm0.o(vvn0Var.L1, xiv0Var), vvn0Var.G().getDimensionPixelSize(R.dimen.space_24) + vvn0Var.G().getDimensionPixelSize(R.dimen.bottom_navigation_view_height) + xiv0Var.f40966a.i(2).d, 5, viewQ0);
        return xiv0Var;
    }

    @Override // a.pcl0
    public r1u m() {
        return ((pui) this.f35622a).m();
    }

    @Override // a.pcl0
    public r1u n() {
        return ((pui) this.f35622a).n();
    }

    @Override // a.pcl0
    public uyn o() {
        return ((pui) this.f35622a).o();
    }

    @Override // a.pcl0
    public kym0 p() {
        return ((pui) this.f35622a).p();
    }

    @Override // a.vkn0
    public String q() {
        return ((zkn0) this.f35622a).c;
    }

    @Override // a.pcl0
    public lku r() {
        return ((pui) this.f35622a).r();
    }

    @Override // a.pcl0
    public clc s() {
        return ((pui) this.f35622a).s();
    }

    @Override // a.pcl0
    public s1u t() {
        return ((pui) this.f35622a).t();
    }

    @Override // a.pcl0
    public rr20 u() {
        return ((pui) this.f35622a).u();
    }

    @Override // a.pcl0
    public r1u v() {
        return ((pui) this.f35622a).v();
    }

    @Override // a.pcl0
    public xfu w() {
        return ((pui) this.f35622a).w();
    }

    @Override // a.pcl0
    public s1u x() {
        return ((pui) this.f35622a).x();
    }

    @Override // a.vkn0
    public void y(ukn0 ukn0Var) {
        zkn0 zkn0Var = (zkn0) this.f35622a;
        int length = zkn0Var.e.length;
        for (int i = 1; i < length; i++) {
            int i2 = zkn0Var.e[i];
            if (i2 == 1) {
                ukn0Var.o(i, zkn0Var.f[i]);
            } else if (i2 == 2) {
                ukn0Var.p(zkn0Var.g[i], i);
            } else if (i2 == 3) {
                String str = zkn0Var.h[i];
                str.getClass();
                ukn0Var.r0(i, str);
            } else if (i2 == 4) {
                byte[] bArr = zkn0Var.i[i];
                bArr.getClass();
                ukn0Var.i(bArr, i);
            } else if (i2 == 5) {
                ukn0Var.s(i);
            }
        }
    }

    @Override // a.pcl0
    public ecu z() {
        return ((pui) this.f35622a).z();
    }

    public ugf0(t2g t2gVar) {
        t2gVar.getClass();
        this.f35622a = t2gVar;
    }

    public ugf0(pbt pbtVar) {
        pbtVar.getClass();
        this.f35622a = pbtVar;
    }

    public /* synthetic */ ugf0(Object obj) {
        this.f35622a = obj;
    }

    public ugf0(tnm0 tnm0Var) {
        tnm0Var.getClass();
        this.f35622a = tnm0Var;
    }
}
