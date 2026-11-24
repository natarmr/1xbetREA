package a;

import android.view.View;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;

/* JADX INFO: loaded from: classes6.dex */
public final class jvl implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DsCellLeftIcon f17208a;
    public final /* synthetic */ gbe0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Integer f;

    public jvl(DsCellLeftIcon dsCellLeftIcon, gbe0 gbe0Var, String str, int i, Integer num, Integer num2) {
        this.f17208a = dsCellLeftIcon;
        this.b = gbe0Var;
        this.c = str;
        this.d = i;
        this.e = num;
        this.f = num2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        DsCellLeftIcon.p(this.f17208a, this.b, this.c, this.d, this.e, this.f);
    }
}
