package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hc6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f12805a = q3d.j(new jc6(), new kc6());

    public static final void a(lc00 lc00Var, List list, List list2) {
        ec6 cc6Var;
        ArrayList<wmg> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((wmg) obj).k.isEmpty()) {
                arrayList.add(obj);
            }
        }
        for (wmg wmgVar : arrayList) {
            boolean zContains = list2.contains(wmgVar.f39405a);
            String strN = ohs0.n(sre0.f32672a.b(gc6.class).J(), wmgVar.f39405a);
            wb6 wb6Var = wb6.f38862a;
            String str = wmgVar.c;
            String str2 = wmgVar.b;
            List<jmg> listD0 = CollectionsKt.D0(wmgVar.k, 3);
            ArrayList arrayList2 = new ArrayList(r3d.q(listD0, 10));
            for (jmg jmgVar : listD0) {
                jmgVar.getClass();
                arrayList2.add(new zb6(jmgVar.b, jmgVar.f16763a, String.valueOf(jmgVar.d), f140.i((int) jmgVar.c, Separators.PERCENT)));
            }
            a4x a4xVarO0 = dyb.o0(arrayList2);
            int i = zContains ? R.drawable.ic_glyph_chevron_up_small : R.drawable.ic_glyph_chevron_down_small;
            int i2 = wmgVar.j;
            if (i2 == 1) {
                cc6Var = new cc6(R.drawable.dota_first_role_ic);
            } else if (i2 == 2) {
                cc6Var = new cc6(R.drawable.dota_second_role_ic);
            } else if (i2 == 3) {
                cc6Var = new cc6(R.drawable.dota_third_role_ic);
            } else if (i2 != 4) {
                cc6Var = i2 != 5 ? dc6.f5836a : new cc6(R.drawable.dota_five_role_ic);
            } else {
                cc6Var = new cc6(R.drawable.dota_fourth_role_ic);
            }
            lc00Var.add(new gc6(strN, wb6Var, wmgVar.f39405a, str2, str, a4xVarO0, zContains, cc6Var, i, false));
        }
    }
}
