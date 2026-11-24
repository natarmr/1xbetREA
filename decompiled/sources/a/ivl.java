package a;

import android.view.View;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;

/* JADX INFO: loaded from: classes6.dex */
public final class ivl implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DsCellLeftIcon f15450a;
    public final /* synthetic */ gbe0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Integer f;
    public final /* synthetic */ Integer g;

    public ivl(DsCellLeftIcon dsCellLeftIcon, gbe0 gbe0Var, String str, Integer num, Integer num2, Integer num3, Integer num4) {
        this.f15450a = dsCellLeftIcon;
        this.b = gbe0Var;
        this.c = str;
        this.d = num;
        this.e = num2;
        this.f = num3;
        this.g = num4;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        DsCellLeftIcon.n(this.f15450a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
