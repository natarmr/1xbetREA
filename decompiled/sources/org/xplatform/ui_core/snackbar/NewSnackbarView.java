package org.xplatform.ui_core.snackbar;

import a.hny;
import a.sj3;
import a.y6z;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class NewSnackbarView extends ConstraintLayout {
    public final y6z q;

    /* JADX WARN: Illegal instructions before constructor call */
    public NewSnackbarView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.layout_new_snackbar_view, this);
        int i2 = R.id.barrier;
        if (((Barrier) yum0.f(this, R.id.barrier)) != null) {
            i2 = R.id.button;
            if (((MaterialButton) yum0.f(this, R.id.button)) != null) {
                i2 = R.id.endIcon;
                if (((ImageView) yum0.f(this, R.id.endIcon)) != null) {
                    i2 = R.id.icon;
                    ImageView imageView = (ImageView) yum0.f(this, R.id.icon);
                    if (imageView != null) {
                        i2 = R.id.message;
                        if (((TextView) yum0.f(this, R.id.message)) != null) {
                            i2 = R.id.title;
                            TextView textView = (TextView) yum0.f(this, R.id.title);
                            if (textView != null) {
                                this.q = new y6z(this, imageView, textView);
                                setClipToPadding(false);
                                return;
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final y6z getViewBinding() {
        return this.q;
    }

    public final void setIcon(int i) {
        this.q.b.setImageResource(i);
    }

    public final void setTitle(String str) {
        str.getClass();
        y6z y6zVar = this.q;
        y6zVar.b.getLayoutParams().height = sj3.X(32);
        y6zVar.b.getLayoutParams().width = sj3.X(32);
        TextView textView = y6zVar.c;
        textView.setVisibility(0);
        textView.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewSnackbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewSnackbarView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
