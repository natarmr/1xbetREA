package a;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a9o0 extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f489a;
    public final /* synthetic */ b9o0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9o0(b9o0 b9o0Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.b = b9o0Var;
        this.f489a = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        b9o0 b9o0Var = this.b;
        ArrayList arrayList = b9o0Var.b;
        Drawable background = this.f489a.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (b9o0Var.e != color) {
            b9o0Var.e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((i2d0) arrayList.get(size)).b(color);
            }
        }
    }
}
