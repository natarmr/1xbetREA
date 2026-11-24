package a;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class aju0 extends eju0 {
    public final /* synthetic */ byte g;

    public /* synthetic */ aju0(byte b) {
        this.g = b;
    }

    @Override // a.eju0
    public final void f(View view, float f) {
        switch (this.g) {
            case 0:
                view.setAlpha(a(f));
                break;
            case 1:
                view.setElevation(a(f));
                break;
            case 2:
                view.setRotation(a(f));
                break;
            case 3:
                view.setRotationX(a(f));
                break;
            case 4:
                view.setRotationY(a(f));
                break;
            case 5:
                view.setScaleX(a(f));
                break;
            case 6:
                view.setScaleY(a(f));
                break;
            case 7:
                view.setTranslationX(a(f));
                break;
            case 8:
                view.setTranslationY(a(f));
                break;
            default:
                view.setTranslationZ(a(f));
                break;
        }
    }
}
