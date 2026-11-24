package a;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class nlu0 extends rlu0 {
    public final /* synthetic */ byte k;

    @Override // a.rlu0
    public final boolean d(float f, long j, vjy vjyVar, View view) {
        switch (this.k) {
            case 0:
                view.setAlpha(b(f, j, vjyVar, view));
                break;
            case 1:
                view.setElevation(b(f, j, vjyVar, view));
                break;
            case 2:
                view.setRotation(b(f, j, vjyVar, view));
                break;
            case 3:
                view.setRotationX(b(f, j, vjyVar, view));
                break;
            case 4:
                view.setRotationY(b(f, j, vjyVar, view));
                break;
            case 5:
                view.setScaleX(b(f, j, vjyVar, view));
                break;
            case 6:
                view.setScaleY(b(f, j, vjyVar, view));
                break;
            case 7:
                view.setTranslationX(b(f, j, vjyVar, view));
                break;
            case 8:
                view.setTranslationY(b(f, j, vjyVar, view));
                break;
            default:
                view.setTranslationZ(b(f, j, vjyVar, view));
                break;
        }
        return this.h;
    }
}
