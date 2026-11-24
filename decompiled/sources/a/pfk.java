package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pfk extends dr30 {
    public static final /* synthetic */ iiy[] f = {new j0d0(pfk.class, "classNames", "getClassNames$org_jetbrains_kotlin_deserialization()Ljava/util/Set;", 0), new j0d0(pfk.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0)};
    public final g45 b;
    public final ofk c;
    public final cu00 d;
    public final bu00 e;

    public pfk(g45 g45Var, List list, List list2, List list3, Function0 function0) {
        g45Var.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.b = g45Var;
        f6i f6iVar = (f6i) g45Var.f10647a;
        ((lwf) f6iVar.c).getClass();
        this.c = new ofk(this, list, list2, list3);
        eu00 eu00Var = (eu00) f6iVar.e;
        lfk lfkVar = new lfk(function0, (byte) 0);
        eu00Var.getClass();
        this.d = new cu00(eu00Var, lfkVar);
        eu00 eu00Var2 = (eu00) f6iVar.e;
        v9k v9kVar = new v9k(this, (byte) 12);
        eu00Var2.getClass();
        this.e = new bu00(eu00Var2, v9kVar);
    }

    @Override // a.dr30, a.cr30
    public Collection a(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ofk ofkVar = this.c;
        ofkVar.getClass();
        return !((Set) yqm0.s(ofkVar.g, ofk.j[0])).contains(g950Var) ? iun.f15405a : (Collection) ofkVar.d.invoke(g950Var);
    }

    @Override // a.dr30, a.cr30
    public final Set c() {
        return (Set) yqm0.s(this.c.g, ofk.j[0]);
    }

    @Override // a.dr30, a.cr30
    public foc d(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ux50Var.getClass();
        if (!q(g950Var)) {
            ofk ofkVar = this.c;
            if (!ofkVar.c.keySet().contains(g950Var)) {
                return null;
            }
            ofkVar.getClass();
            return (tfk) ofkVar.f.invoke(g950Var);
        }
        f6i f6iVar = (f6i) this.b.f10647a;
        qlc qlcVarL = l(g950Var);
        qlcVarL.getClass();
        nlc nlcVar = (nlc) f6iVar.d;
        Set set = nlc.c;
        return nlcVar.a(qlcVarL, null);
    }

    @Override // a.dr30, a.cr30
    public final Set e() {
        iiy iiyVar = f[1];
        bu00 bu00Var = this.e;
        bu00Var.getClass();
        iiyVar.getClass();
        return (Set) bu00Var.invoke();
    }

    @Override // a.dr30, a.cr30
    public Collection f(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ofk ofkVar = this.c;
        ofkVar.getClass();
        return !((Set) yqm0.s(ofkVar.h, ofk.j[1])).contains(g950Var) ? iun.f15405a : (Collection) ofkVar.e.invoke(g950Var);
    }

    @Override // a.dr30, a.cr30
    public final Set g() {
        return (Set) yqm0.s(this.c.h, ofk.j[1]);
    }

    public final List i(cek cekVar, Function1 function1) {
        ux50 ux50Var = ux50.f36425a;
        cekVar.getClass();
        ArrayList arrayList = new ArrayList(0);
        if (cekVar.a(cek.f)) {
            h(arrayList, function1);
        }
        ofk ofkVar = this.c;
        ofkVar.getClass();
        cu00 cu00Var = ofkVar.g;
        cu00 cu00Var2 = ofkVar.h;
        s7f s7fVar = s7f.e;
        if (cekVar.a(cek.j)) {
            Set<g950> set = (Set) yqm0.s(cu00Var2, ofk.j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (g950 g950Var : set) {
                if (((Boolean) function1.invoke(g950Var)).booleanValue()) {
                    g950Var.getClass();
                    arrayList2.addAll(!((Set) yqm0.s(cu00Var2, ofk.j[1])).contains(g950Var) ? iun.f15405a : (Collection) ofkVar.e.invoke(g950Var));
                }
            }
            v3d.t(s7fVar, arrayList2);
            arrayList.addAll(arrayList2);
        }
        if (cekVar.a(cek.i)) {
            Set<g950> set2 = (Set) yqm0.s(cu00Var, ofk.j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (g950 g950Var2 : set2) {
                if (((Boolean) function1.invoke(g950Var2)).booleanValue()) {
                    g950Var2.getClass();
                    arrayList3.addAll(!((Set) yqm0.s(cu00Var, ofk.j[0])).contains(g950Var2) ? iun.f15405a : (Collection) ofkVar.d.invoke(g950Var2));
                }
            }
            v3d.t(s7fVar, arrayList3);
            arrayList.addAll(arrayList3);
        }
        if (cekVar.a(cek.l)) {
            for (g950 g950Var3 : m()) {
                if (((Boolean) function1.invoke(g950Var3)).booleanValue()) {
                    f6i f6iVar = (f6i) this.b.f10647a;
                    qlc qlcVarL = l(g950Var3);
                    qlcVarL.getClass();
                    nlc nlcVar = (nlc) f6iVar.d;
                    Set set3 = nlc.c;
                    wm40 wm40VarA = nlcVar.a(qlcVarL, null);
                    if (wm40VarA != null) {
                        arrayList.add(wm40VarA);
                    }
                }
            }
        }
        if (cekVar.a(cek.g)) {
            for (g950 g950Var4 : ofkVar.c.keySet()) {
                if (((Boolean) function1.invoke(g950Var4)).booleanValue()) {
                    ofkVar.getClass();
                    g950Var4.getClass();
                    tfk tfkVar = (tfk) ofkVar.f.invoke(g950Var4);
                    if (tfkVar != null) {
                        arrayList.add(tfkVar);
                    }
                }
            }
        }
        return d5c.I(arrayList);
    }

    public qlc l(g950 g950Var) {
        g950Var.getClass();
        int i = ju.f17125a;
        throw new IllegalStateException("should not be called");
    }

    public final Set m() {
        return (Set) yqm0.s(this.d, f[0]);
    }

    public Set n() {
        return xun.f41520a;
    }

    public Set o() {
        return xun.f41520a;
    }

    public Set p() {
        return xun.f41520a;
    }

    public boolean q(g950 g950Var) {
        g950Var.getClass();
        return m().contains(g950Var);
    }

    public boolean r(sfk sfkVar) {
        return true;
    }

    public void h(ArrayList arrayList, Function1 function1) {
    }

    public void j(g950 g950Var, ArrayList arrayList) {
    }

    public void k(g950 g950Var, ArrayList arrayList) {
    }
}
