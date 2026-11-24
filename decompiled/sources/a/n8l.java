package a;

import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class n8l implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p8l f23095a;
    public final /* synthetic */ long b;
    public final /* synthetic */ vne c;
    public final /* synthetic */ boolean d;

    public n8l(p8l p8lVar, long j, vne vneVar, boolean z) {
        this.f23095a = p8lVar;
        this.b = j;
        this.c = vneVar;
        this.d = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        p8l p8lVar = this.f23095a;
        j8l j8lVarJ = p8lVar.j();
        p7l p7lVar = (p7l) p8lVar.c;
        j8lVarJ.k(R.drawable.dota_aegis_ic, this.b, this.c, p7lVar.e(), p7lVar.f(), new v9k(p8lVar, (byte) 28));
        j8l j8lVarJ2 = p8lVar.j();
        boolean z = this.d;
        j8lVarJ2.setVisibility(z ? 0 : 8);
        ((l8l) p8lVar.m).i = z;
    }
}
