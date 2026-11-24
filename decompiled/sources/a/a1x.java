package a;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.javax.sip.message.Response;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class a1x extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95a;
    public final vd7 b;

    public a1x(Context context, String str) {
        super(context, R.style.Theme.Black.NoTitleBar);
        this.f95a = str;
        View viewInflate = LayoutInflater.from(context).inflate(org.xbet.client1.R.layout.gallery_view_horizontal, (ViewGroup) null, false);
        int i = org.xbet.client1.R.id.collapseImageView;
        ImageView imageView = (ImageView) yum0.f(viewInflate, org.xbet.client1.R.id.collapseImageView);
        if (imageView != null) {
            i = org.xbet.client1.R.id.imageContainer;
            if (((CardView) yum0.f(viewInflate, org.xbet.client1.R.id.imageContainer)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                ImageView imageView2 = (ImageView) yum0.f(viewInflate, org.xbet.client1.R.id.pickedImageView);
                if (imageView2 != null) {
                    this.b = new vd7(constraintLayout, imageView, imageView2, (byte) 14);
                    requestWindowFeature(1);
                    return;
                }
                i = org.xbet.client1.R.id.pickedImageView;
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.clearFlags(2);
        List list = u0d.f34849a;
        vd7 vd7Var = this.b;
        u0d.j((ImageView) vd7Var.d, this.f95a, 0, 0, kotlin.collections.a.c(new i2x()), null, null, Response.BUSY_HERE);
        setContentView((ConstraintLayout) vd7Var.b);
        ((ImageView) vd7Var.c).setOnClickListener(new q10(this, (byte) 27));
    }
}
