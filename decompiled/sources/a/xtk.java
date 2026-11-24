package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.discipline.presentation.model.DisciplineListParams;

/* JADX INFO: loaded from: classes4.dex */
public final class xtk extends w46 {
    public final DisciplineListParams b;
    public final hzg c;
    public final ih5 d;
    public final es e;
    public final s31 f;
    public final cyu g;
    public final zr1 h;
    public final duj i;
    public final g2v j;
    public final mne k;
    public final p7m0 l;
    public da10 m;
    public List n;
    public final c4m0 o;
    public bby p;
    public bby q;
    public boolean r;
    public String s;

    public xtk(DisciplineListParams disciplineListParams, hzg hzgVar, ih5 ih5Var, es esVar, s31 s31Var, cyu cyuVar, zr1 zr1Var, duj dujVar, g2v g2vVar, m1e m1eVar, mne mneVar) {
        m1eVar.getClass();
        this.b = disciplineListParams;
        this.c = hzgVar;
        this.d = ih5Var;
        this.e = esVar;
        this.f = s31Var;
        this.g = cyuVar;
        this.h = zr1Var;
        this.i = dujVar;
        this.j = g2vVar;
        this.k = mneVar;
        this.l = q7m0.a(utk.f36258a);
        this.m = da10.DEFAULT_ERROR;
        this.n = iun.f15405a;
        this.r = true;
        this.s = "";
        c4m0 c4m0Var = this.o;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.o = slb.U(new fnq(m1eVar.b(), new hij(this, null, (byte) 5), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a));
        }
    }

    public final void w() {
        bby bbyVar = this.p;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.p = sac.V(jiu0.a(this), new e3j(this, (byte) 16), null, this.k.f22085a, new b1f((Object) this, yjeVar, (byte) 27), 10);
    }

    public final void x() {
        p7m0 p7m0Var;
        Object value;
        jkm jkmVarD = g2v.d(this.j, ozb.J(-1L, pb10.v), null, null, R.string.data_retrieval_error, R.string.try_again_text, null, 350);
        do {
            p7m0Var = this.l;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, new stk(jkmVarD, this.m.f5727a)));
        bby bbyVar = this.p;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
    }

    public final void y(da10 da10Var) {
        Object value;
        this.m = da10Var;
        p7m0 p7m0Var = this.l;
        Object value2 = p7m0Var.getValue();
        stk stkVar = value2 instanceof stk ? (stk) value2 : null;
        if (stkVar != null) {
            stk stkVar2 = new stk(stkVar.f32776a, this.m.f5727a);
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, stkVar2));
        }
    }

    public final void z() {
        Object value;
        ArrayList arrayList;
        Object value2;
        List list = this.n;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            String lowerCase = ((ypl0) obj).b.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (StringsKt.O(lowerCase, this.s, false)) {
                arrayList2.add(obj);
            }
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        p7m0 p7m0Var = this.l;
        if (zIsEmpty) {
            jkm jkmVarD = g2v.d(this.j, this.s.length() == 0 ? ozb.J(-1L, pb10.v) : pb10.v, null, null, this.s.length() == 0 ? R.string.currently_no_events : R.string.nothing_found, 0, null, 478);
            do {
                value2 = p7m0Var.getValue();
            } while (!p7m0Var.m(value2, new rtk(jkmVarD)));
            return;
        }
        do {
            value = p7m0Var.getValue();
            arrayList = new ArrayList(r3d.q(arrayList2, 10));
            int i = 0;
            for (Object obj2 : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                ypl0 ypl0Var = (ypl0) obj2;
                ypl0Var.getClass();
                arrayList.add(new hok(i, ypl0Var.f43037a, ypl0Var.c.f19909a, ypl0Var.b));
                i = i2;
            }
        } while (!p7m0Var.m(value, new ttk(arrayList)));
    }
}
