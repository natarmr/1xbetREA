package a;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes.dex */
public class j12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12 f15710a;
    public final int b;

    public j12(Context context, int i) {
        this.f15710a = new f12(new ContextThemeWrapper(context, k12.g(i, context)));
        this.b = i;
    }

    public k12 create() {
        f12 f12Var = this.f15710a;
        k12 k12Var = new k12(f12Var.f8744a, this.b);
        View view = f12Var.e;
        i12 i12Var = k12Var.g;
        byte b = 0;
        if (view != null) {
            i12Var.v = view;
        } else {
            CharSequence charSequence = f12Var.d;
            if (charSequence != null) {
                i12Var.d = charSequence;
                TextView textView = i12Var.t;
                if (textView != null) {
                    textView.setText(charSequence);
                }
                i12Var.c.setTitle(charSequence);
            }
            Drawable drawable = f12Var.c;
            if (drawable != null) {
                i12Var.r = drawable;
                ImageView imageView = i12Var.s;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    i12Var.s.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = f12Var.f;
        if (charSequence2 != null) {
            i12Var.c(-1, charSequence2, f12Var.g);
        }
        CharSequence charSequence3 = f12Var.h;
        if (charSequence3 != null) {
            i12Var.c(-2, charSequence3, f12Var.i);
        }
        if (f12Var.k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) f12Var.b.inflate(i12Var.z, (ViewGroup) null);
            int i = f12Var.n ? i12Var.A : i12Var.B;
            ListAdapter h12Var = f12Var.k;
            if (h12Var == null) {
                h12Var = new h12(f12Var.f8744a, i, R.id.text1, null);
            }
            i12Var.w = h12Var;
            i12Var.x = f12Var.o;
            if (f12Var.l != null) {
                alertController$RecycleListView.setOnItemClickListener(new e12(f12Var, i12Var, b));
            }
            if (f12Var.n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            i12Var.e = alertController$RecycleListView;
        }
        View view2 = f12Var.m;
        if (view2 != null) {
            i12Var.f = view2;
            i12Var.g = false;
        }
        k12Var.setCancelable(true);
        k12Var.setCanceledOnTouchOutside(true);
        k12Var.setOnCancelListener(null);
        k12Var.setOnDismissListener(null);
        xy30 xy30Var = f12Var.j;
        if (xy30Var != null) {
            k12Var.setOnKeyListener(xy30Var);
        }
        return k12Var;
    }

    public Context getContext() {
        return this.f15710a.f8744a;
    }

    public j12 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        f12 f12Var = this.f15710a;
        f12Var.h = f12Var.f8744a.getText(i);
        f12Var.i = onClickListener;
        return this;
    }

    public j12 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        f12 f12Var = this.f15710a;
        f12Var.f = f12Var.f8744a.getText(i);
        f12Var.g = onClickListener;
        return this;
    }

    public j12 setTitle(CharSequence charSequence) {
        this.f15710a.d = charSequence;
        return this;
    }

    public j12 setView(View view) {
        this.f15710a.m = view;
        return this;
    }

    public j12(Context context) {
        this(context, k12.g(0, context));
    }
}
