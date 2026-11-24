package a;

import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class o8l implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p8l f24835a;
    public final /* synthetic */ long b;
    public final /* synthetic */ vne c;

    public o8l(p8l p8lVar, long j, vne vneVar) {
        this.f24835a = p8lVar;
        this.b = j;
        this.c = vneVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        p8l p8lVar = this.f24835a;
        j8l j8lVarN = p8lVar.n();
        p7l p7lVar = (p7l) p8lVar.c;
        j8l.l(j8lVarN, R.drawable.dota_tormentor_active_ic, this.b, this.c, p7lVar.e(), p7lVar.f(), null, 32);
        p8lVar.n().setVisibility(8);
        ((l8l) p8lVar.m).getClass();
    }
}
