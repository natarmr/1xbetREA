package a;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ebl0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7524a = 1;
    public final /* synthetic */ gbl0 b;
    public final /* synthetic */ ucs c;
    public final /* synthetic */ ImageView d;
    public final /* synthetic */ int e;

    public /* synthetic */ ebl0(gbl0 gbl0Var, ucs ucsVar, ImageView imageView, int i) {
        this.b = gbl0Var;
        this.c = ucsVar;
        this.d = imageView;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f7524a;
        int i = this.e;
        ImageView imageView = this.d;
        ucs ucsVar = this.c;
        gbl0 gbl0Var = this.b;
        switch (b) {
            case 0:
                Drawable drawable = (Drawable) obj;
                lme0 lme0Var = gbl0.c2;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                } else {
                    gbl0Var.K0(ucsVar, imageView, i + 1);
                }
                break;
            default:
                lme0 lme0Var2 = gbl0.c2;
                gbl0Var.K0(ucsVar, imageView, i + 1);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ebl0(ImageView imageView, gbl0 gbl0Var, ucs ucsVar, int i) {
        this.d = imageView;
        this.b = gbl0Var;
        this.c = ucsVar;
        this.e = i;
    }
}
