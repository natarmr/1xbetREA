package a;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class cch0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rah0 f4111a;
    public final vne b;
    public final nul0 c;
    public Integer d;

    public cch0(rah0 rah0Var, vne vneVar, nul0 nul0Var) {
        this.f4111a = rah0Var;
        this.b = vneVar;
        this.c = nul0Var;
    }

    public final void a(w6k w6kVar, int i, ArrayList arrayList, int i2) {
        Integer num = this.d;
        if (num != null && num.intValue() == i2) {
            return;
        }
        this.d = Integer.valueOf(i2);
        ado0 ado0Var = (ado0) CollectionsKt.W(i2, arrayList);
        if (ado0Var != null) {
            ado0 ado0Var2 = (ado0) CollectionsKt.d0(arrayList);
            int iT = w6kVar.T(ado0Var2.f689a + ado0Var2.b) + i;
            rah0 rah0Var = this.f4111a;
            int iL = iT - rah0Var.f.l();
            int iT2 = w6kVar.T(ado0Var.f689a) - ((iL / 2) - (w6kVar.T(ado0Var.b) / 2));
            int i3 = iT - iL;
            if (i3 < 0) {
                i3 = 0;
            }
            int iD = l1e0.d(iT2, 0, i3);
            if (rah0Var.f30133a.l() != iD) {
                qjj.W(this.b, null, null, new u52((Object) this, iD, (yje) null, (byte) 22), 3);
            }
        }
    }
}
