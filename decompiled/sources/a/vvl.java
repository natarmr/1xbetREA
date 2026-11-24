package a;

import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vvl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38105a;
    public final /* synthetic */ xvl b;

    public /* synthetic */ vvl(xvl xvlVar, byte b) {
        this.f38105a = b;
        this.b = xvlVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f38105a;
        xvl xvlVar = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        switch (b) {
            case 0:
                Drawable drawable = xvlVar.o;
                if (drawable != null) {
                    xvlVar.f(drawable, fFloatValue);
                }
                Drawable drawable2 = xvlVar.p;
                if (drawable2 != null) {
                    xvlVar.f(drawable2, 1.0f - fFloatValue);
                }
                xvlVar.b.invoke();
                break;
            case 1:
                Drawable drawable3 = xvlVar.p;
                if (drawable3 != null) {
                    xvlVar.f(drawable3, fFloatValue);
                }
                xvlVar.k.setAlpha(l1e0.d((int) (fFloatValue * 255.0f), 0, 255));
                xvlVar.b.invoke();
                break;
            default:
                Drawable drawable4 = xvlVar.o;
                if (drawable4 != null) {
                    xvlVar.f(drawable4, fFloatValue);
                }
                xvlVar.k.setAlpha(l1e0.d((int) (fFloatValue * 255.0f), 0, 255));
                xvlVar.b.invoke();
                break;
        }
        return Unit.f46060a;
    }
}
