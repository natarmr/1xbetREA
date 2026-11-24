package a;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;

/* JADX INFO: loaded from: classes3.dex */
public final class ft90 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f10100a;
    public final MaterialButton b;
    public final MaterialButton c;
    public final DsPresetTextFieldBasic d;
    public final ImageView e;

    public ft90(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, DsPresetTextFieldBasic dsPresetTextFieldBasic, ImageView imageView) {
        this.f10100a = constraintLayout;
        this.b = materialButton;
        this.c = materialButton2;
        this.d = dsPresetTextFieldBasic;
        this.e = imageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10100a;
    }
}
