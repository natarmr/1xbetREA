package a;

import org.xbet.client1.R;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes4.dex */
public final class qsq0 extends v46 {
    public final dsx u;

    public qsq0(dsx dsxVar) {
        super(dsxVar.b);
        this.u = dsxVar;
    }

    @Override // a.v46
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void t(lfs0 lfs0Var) {
        lfs0Var.getClass();
        dsx dsxVar = this.u;
        DsHeader dsHeader = dsxVar.c;
        String string = dsxVar.b.getContext().getString(R.string.transactions_history);
        string.getClass();
        dsHeader.setModel(new nrv(string, false, null, null, null, null, null, 254));
    }
}
