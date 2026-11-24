package a;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class mfn extends zjb {
    public final /* synthetic */ byte e;

    public /* synthetic */ mfn(byte b) {
        this.e = b;
    }

    @Override // a.zjb
    public final float I(Object obj) {
        switch (this.e) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getScaleX();
            case 2:
                return ((View) obj).getScaleY();
            case 3:
                return ((View) obj).getRotation();
            case 4:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }

    @Override // a.zjb
    public final void M(Object obj, float f) {
        switch (this.e) {
            case 0:
                ((View) obj).setAlpha(f);
                break;
            case 1:
                ((View) obj).setScaleX(f);
                break;
            case 2:
                ((View) obj).setScaleY(f);
                break;
            case 3:
                ((View) obj).setRotation(f);
                break;
            case 4:
                ((View) obj).setRotationX(f);
                break;
            default:
                ((View) obj).setRotationY(f);
                break;
        }
    }
}
