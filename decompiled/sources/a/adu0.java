package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class adu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f698a;
    public final FrameLayout b;
    public final AppCompatImageView c;
    public final TextView d;

    public /* synthetic */ adu0(FrameLayout frameLayout, AppCompatImageView appCompatImageView, TextView textView, byte b) {
        this.f698a = b;
        this.b = frameLayout;
        this.c = appCompatImageView;
        this.d = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        switch (this.f698a) {
            case 0:
                break;
        }
        return this.b;
    }
}
