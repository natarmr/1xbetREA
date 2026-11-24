package a;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class pce extends w46 {
    public final mne b;
    public final gg5 c;
    public final i1w0 d;
    public final xex e;
    public final ntu f;
    public final x0u g;
    public final iqt h;
    public final c4m0 i;
    public bby j;
    public final p7m0 k;
    public final q99 l;

    public pce(mne mneVar, gg5 gg5Var, duj dujVar, m1e m1eVar, i1w0 i1w0Var, xex xexVar, ntu ntuVar, x0u x0uVar, iqt iqtVar, sa10 sa10Var) {
        m1eVar.getClass();
        this.b = mneVar;
        this.c = gg5Var;
        this.d = i1w0Var;
        this.e = xexVar;
        this.f = ntuVar;
        this.g = x0uVar;
        this.h = iqtVar;
        this.k = q7m0.a(new gce("", sa10.b(sa10Var, pb10.g, R.string.data_retrieval_error, 0, null, 28), false, false));
        yje yjeVar = null;
        this.l = vtb.d(0, null, null, 7);
        c4m0 c4m0Var = this.i;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.i = sac.T(new fnq(m1eVar.b(), new igb((Object) this, yjeVar, (byte) 11), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), oce.h);
        }
    }

    public final void w(xbe xbeVar) {
        if (!(xbeVar instanceof vbe)) {
            if (xbeVar instanceof wbe) {
                this.l.f(wbe.f38873a);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        Uri uri = ((vbe) xbeVar).f37138a;
        boolean zD = Intrinsics.d(uri.getScheme(), "tel");
        gg5 gg5Var = this.c;
        if (zD) {
            gg5Var.o();
            return;
        }
        String string = uri.toString();
        string.getClass();
        if (Intrinsics.d(uri.getScheme(), "tg") || StringsKt.O(string, "https://telegram.dog", false) || StringsKt.O(string, "https://t.me", false) || StringsKt.O(string, "https://telegram.me", false) || StringsKt.O(string, "tg://", false)) {
            gg5Var.s();
        }
    }
}
