package a;

import org.xbet.client1.R;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;

/* JADX INFO: loaded from: classes4.dex */
public final class zun implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45017a = 0;
    public final g2v b;

    public zun(y690 y690Var, g2v g2vVar) {
        this.b = g2vVar;
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        switch (this.f45017a) {
            case 0:
                mbp0 mbp0Var = (mbp0) obj;
                mbp0Var.getClass();
                TeamDetailsParams teamDetailsParams = mbp0Var.b;
                return new sbp0(androidx.compose.runtime.e.e(new qbp0(teamDetailsParams.c, gcm.f11070a, "", "", mbp0Var.e ? R.drawable.cybergames_tablet_header_placeholder : R.drawable.cybergames_header_placeholder)), androidx.compose.runtime.e.e(qim0.k(mbp0Var.h, ucx.X(mbp0Var.f), mbp0Var.f21520a, mbp0Var.k, mbp0Var.l)), androidx.compose.runtime.e.e(new bbp0(new t8p0(ozb.P(teamDetailsParams.f46569a, this.b)), (a4x) null, 6)));
            default:
                y690 y690Var = (y690) obj;
                y690Var.getClass();
                int iOrdinal = y690Var.f42086a.ordinal();
                if (iOrdinal == 0) {
                    return b790.f2095a;
                }
                if (iOrdinal == 1) {
                    return new a790(y690Var.c);
                }
                g2v g2vVar = this.b;
                if (iOrdinal == 2) {
                    return new z690(g2v.b(g2vVar, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, 0, 0L, 0L, 990));
                }
                if (iOrdinal == 3) {
                    return new c790(g2v.b(g2vVar, pb10.g, null, null, 0, 0, R.string.page_not_found_error, 0, 0, 0L, 0L, 990));
                }
                t9f.b();
                return null;
        }
    }

    public zun(g2v g2vVar) {
        this.b = g2vVar;
    }
}
