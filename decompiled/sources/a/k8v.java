package a;

import android.content.Context;
import android.view.View;
import android.view.Window;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class k8v implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17890a = 1;
    public final Object b;
    public final /* synthetic */ Object c;

    public k8v(rwq0 rwq0Var) {
        this.c = rwq0Var;
        Context context = rwq0Var.f31228a.getContext();
        CharSequence charSequence = rwq0Var.h;
        ri riVar = new ri();
        riVar.e = 4096;
        riVar.g = 4096;
        riVar.l = null;
        riVar.m = null;
        riVar.n = false;
        riVar.o = false;
        riVar.p = 16;
        riVar.i = context;
        riVar.f30513a = charSequence;
        this.b = riVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f17890a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((Function1) obj).invoke(new c8v(((jfo0) obj2).f16439a));
                break;
            default:
                rwq0 rwq0Var = (rwq0) obj2;
                Window.Callback callback = rwq0Var.k;
                if (callback != null && rwq0Var.l) {
                    callback.onMenuItemSelected(0, (ri) obj);
                    break;
                }
                break;
        }
    }

    public k8v(Function1 function1, jfo0 jfo0Var) {
        this.b = function1;
        this.c = jfo0Var;
    }
}
