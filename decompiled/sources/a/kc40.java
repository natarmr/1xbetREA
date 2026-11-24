package a;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.section.impl.meta_heroes.presentation.dialog.MetaHeroesRoleModelParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/kc40;", "La/iw5;", "<init>", "()V", "a/uuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kc40 extends iw5 {
    public final khf0 k2 = new khf0("params_key");
    public static final /* synthetic */ iiy[] m2 = {new ez40(kc40.class, "params", "getParams()Lorg/xplatform/cyber/section/impl/meta_heroes/presentation/dialog/MetaHeroesRoleModelParams;", 0)};
    public static final uuz l2 = new uuz();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        int i;
        fetVar.e0(-562121145);
        iiy[] iiyVarArr = m2;
        boolean z = false;
        iiy iiyVar = iiyVarArr[0];
        khf0 khf0Var = this.k2;
        xb40 xb40Var = ((MetaHeroesRoleModelParams) khf0Var.n(this, iiyVar)).f46584a;
        a4x a4xVarO0 = dyb.o0(((MetaHeroesRoleModelParams) khf0Var.n(this, iiyVarArr[0])).b);
        xb40Var.getClass();
        a4xVarO0.getClass();
        boolean zE = fetVar.e(xb40Var.ordinal());
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (zE || objP == cl5Var) {
            objP = androidx.compose.runtime.e.e(new ic40(lak0.c));
            fetVar.o0(objP);
        }
        pz40 pz40Var = (pz40) objP;
        fetVar.e0(-1941930233);
        ArrayList arrayList = new ArrayList(r3d.q(a4xVarO0, 10));
        int i2 = 0;
        for (Object obj : a4xVarO0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            xb40 xb40Var2 = (xb40) obj;
            int iOrdinal = xb40Var2.ordinal();
            if (iOrdinal == 1) {
                i = R.string.dota_easy_position;
            } else if (iOrdinal == 2) {
                i = R.string.dota_middle_role;
            } else if (iOrdinal == 3) {
                i = R.string.dota_hard_position;
            } else if (iOrdinal != 4) {
                i = iOrdinal != 5 ? R.string.empty_str : R.string.dota_full_support_position;
            } else {
                i = R.string.dota_support_position;
            }
            arrayList.add(new lc40(xb40Var2, new rqm((vui0) new tui0(rsm0.w(i, 0, fetVar), null), (pui0) null, (pvi0) new nvi0(xb40Var2 == xb40Var), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506), i2 == a4xVarO0.size() + (-1)));
            i2 = i3;
            z = false;
        }
        fetVar.r(z);
        pz40Var.setValue(new ic40(dyb.r0(arrayList)));
        ic40 ic40Var = (ic40) pz40Var.getValue();
        Object objP2 = fetVar.P();
        if (objP2 == cl5Var) {
            objP2 = new b530((Object) this, (byte) 9);
            fetVar.o0(objP2);
        }
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), tke.c, (ugd) null, u1c.M(-1513299848, new ngz(ic40Var, (Function1) objP2, (byte) 20), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }
}
