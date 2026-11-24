package a;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class s06 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s33 f31399a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ View c;

    public /* synthetic */ s06(View view, byte b) {
        this.b = b;
        this.c = view;
    }

    public final void a(Drawable drawable) {
        byte b = this.b;
        View view = this.c;
        switch (b) {
            case 0:
                t06 t06Var = (t06) view;
                t06Var.setIndeterminate(false);
                t06Var.c(t06Var.b);
                break;
            case 1:
                t06 t06Var2 = (t06) view;
                if (!t06Var2.g) {
                    t06Var2.setVisibility(t06Var2.h);
                }
                break;
            default:
                ColorStateList colorStateList = ((com.google.android.material.checkbox.b) view).o;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                }
                break;
        }
    }

    public void b(Drawable drawable) {
        switch (this.b) {
            case 2:
                com.google.android.material.checkbox.b bVar = (com.google.android.material.checkbox.b) this.c;
                ColorStateList colorStateList = bVar.o;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(bVar.s, colorStateList.getDefaultColor()));
                }
                break;
        }
    }

    public final void c(Drawable drawable) {
    }
}
