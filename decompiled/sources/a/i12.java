package a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class i12 {
    public final int A;
    public final int B;
    public final boolean C;
    public final g12 D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13974a;
    public final k12 b;
    public final Window c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f;
    public Button h;
    public CharSequence i;
    public Message j;
    public Button k;
    public CharSequence l;
    public Message m;
    public Button n;
    public CharSequence o;
    public Message p;
    public NestedScrollView q;
    public Drawable r;
    public ImageView s;
    public TextView t;
    public TextView u;
    public View v;
    public ListAdapter w;
    public final int y;
    public final int z;
    public boolean g = false;
    public int x = -1;
    public final wh E = new wh(this, 1);

    public i12(Context context, k12 k12Var, Window window) {
        this.f13974a = context;
        this.b = k12Var;
        this.c = window;
        g12 g12Var = new g12();
        g12Var.b = new WeakReference(k12Var);
        this.D = g12Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, mqd0.e, R.attr.alertDialogStyle, 0);
        this.y = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.z = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.C = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        k12Var.e().y(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.D.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.o = charSequence;
            this.p = messageObtainMessage;
        } else if (i == -2) {
            this.l = charSequence;
            this.m = messageObtainMessage;
        } else if (i != -1) {
            jf4.o("Button does not exist");
        } else {
            this.i = charSequence;
            this.j = messageObtainMessage;
        }
    }
}
