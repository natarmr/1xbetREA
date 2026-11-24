package a;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uh30 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35657a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ uh30(MaterialButton materialButton, Drawable drawable, byte b) {
        this.f35657a = b;
        this.b = materialButton;
        this.c = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f35657a;
        Drawable drawable = this.c;
        MaterialButton materialButton = this.b;
        switch (b) {
            case 0:
                int[] iArr = MaterialButton.r1;
                materialButton.setIcon(drawable);
                break;
            default:
                int[] iArr2 = MaterialButton.r1;
                materialButton.setIcon(drawable);
                break;
        }
    }
}
