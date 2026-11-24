package a;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public class zo3 extends a56 {
    public final /* synthetic */ byte j;
    public final n0o0 k;
    public h0q0 l;
    public ot10 m;
    public yo4 n;
    public c1d0 o;
    public au0 p;
    public pru q;
    public ctf0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo3(Context context, Intent intent, byte b) {
        super(context, intent);
        this.j = b;
        context.getClass();
        intent.getClass();
        switch (b) {
            case 1:
                super(context, intent);
                this.k = maz.b(new a13(this, (byte) 16));
                break;
            default:
                this.k = maz.b(new a13(this, (byte) 14));
                break;
        }
    }

    @Override // a.a56
    public final void g(Context context, Intent intent) {
        byte b = this.j;
        context.getClass();
        switch (b) {
            case 0:
                if (Intrinsics.d(intent.getAction(), "action_update_top_line_games")) {
                    e().a();
                }
                break;
            default:
                if (Intrinsics.d(intent.getAction(), "action_update_top_live_games")) {
                    e().a();
                }
                break;
        }
    }

    @Override // a.a56
    public final g56 h() {
        switch (this.j) {
            case 0:
                h0q0 h0q0Var = this.l;
                if (h0q0Var == null) {
                    Intrinsics.h("widgetTopGameEventsStreamScenario");
                    throw null;
                }
                ot10 ot10Var = this.m;
                if (ot10Var == null) {
                    Intrinsics.h("mainDomainResolver");
                    throw null;
                }
                yo4 yo4Var = this.n;
                if (yo4Var == null) {
                    Intrinsics.h("widgetAnalytics");
                    throw null;
                }
                au0 au0Var = this.p;
                if (au0Var == null) {
                    Intrinsics.h("widgetFatmanLogger");
                    throw null;
                }
                c1d0 c1d0Var = this.o;
                if (c1d0Var == null) {
                    Intrinsics.h("prophylaxisFeature");
                    throw null;
                }
                pru pruVar = this.q;
                if (pruVar != null) {
                    return new p36(h0q0Var, ot10Var, yo4Var, au0Var, c1d0Var, pruVar);
                }
                Intrinsics.h("getRemoteConfigUseCase");
                throw null;
            default:
                h0q0 h0q0Var2 = this.l;
                if (h0q0Var2 == null) {
                    Intrinsics.h("widgetTopGameEventsStreamScenario");
                    throw null;
                }
                ot10 ot10Var2 = this.m;
                if (ot10Var2 == null) {
                    Intrinsics.h("mainDomainResolver");
                    throw null;
                }
                yo4 yo4Var2 = this.n;
                if (yo4Var2 == null) {
                    Intrinsics.h("widgetAnalytics");
                    throw null;
                }
                au0 au0Var2 = this.p;
                if (au0Var2 == null) {
                    Intrinsics.h("widgetFatmanLogger");
                    throw null;
                }
                c1d0 c1d0Var2 = this.o;
                if (c1d0Var2 == null) {
                    Intrinsics.h("prophylaxisFeature");
                    throw null;
                }
                pru pruVar2 = this.q;
                if (pruVar2 != null) {
                    return new p36(h0q0Var2, ot10Var2, yo4Var2, au0Var2, pruVar2, c1d0Var2);
                }
                Intrinsics.h("getRemoteConfigUseCase");
                throw null;
        }
    }

    @Override // a.a56
    public void k(RemoteViews remoteViews, boolean z) {
        switch (this.j) {
            case 1:
                remoteViews.setViewVisibility(R.id.imageViewLive, 8);
                remoteViews.setViewVisibility(R.id.textViewDate, 8);
                break;
            default:
                super.k(remoteViews, z);
                break;
        }
    }

    public void l() {
        switch (this.j) {
            case 0:
                ((kdv0) this.k.getValue()).c(this);
                break;
            default:
                ((kdv0) this.k.getValue()).f(this);
                break;
        }
    }

    @Override // a.a56, android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        switch (this.j) {
            case 0:
                l();
                super.onCreate();
                rdj rdjVar = rdj.f30294a;
                ctf0 ctf0Var = this.r;
                if (ctf0Var != null) {
                    rdj.l(ctf0Var.h());
                    return;
                } else {
                    Intrinsics.h("resourceManager");
                    throw null;
                }
            default:
                l();
                super.onCreate();
                rdj rdjVar2 = rdj.f30294a;
                ctf0 ctf0Var2 = this.r;
                if (ctf0Var2 != null) {
                    rdj.l(ctf0Var2.h());
                    return;
                } else {
                    Intrinsics.h("resourceManager");
                    throw null;
                }
        }
    }
}
