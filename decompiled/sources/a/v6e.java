package a;

import android.graphics.drawable.RippleDrawable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v6e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36873a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v6e(e7e e7eVar, RecyclerView recyclerView, int i, ImageView imageView, TextView textView) {
        this.d = e7eVar;
        this.b = recyclerView;
        this.c = i;
        this.e = imageView;
        this.f = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f36873a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                e7e e7eVar = (e7e) obj4;
                RecyclerView recyclerView = (RecyclerView) obj3;
                ImageView imageView = (ImageView) obj2;
                TextView textView = (TextView) obj;
                e7eVar.a2 = false;
                e7eVar.J0().C(e7eVar.I0());
                xhe0 xhe0VarO = recyclerView.O(this.c);
                if (xhe0VarO != null) {
                    View view = xhe0VarO.f40887a;
                    view.getClass();
                    if (!(view.getBackground() instanceof RippleDrawable)) {
                        Object obj5 = null;
                        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                        if (viewGroup != null) {
                            Iterator it = new ihu0(viewGroup).iterator();
                            while (true) {
                                jhu0 jhu0Var = (jhu0) it;
                                if (jhu0Var.hasNext()) {
                                    Object next = jhu0Var.next();
                                    if (((View) next).getBackground() instanceof RippleDrawable) {
                                        obj5 = next;
                                    }
                                }
                            }
                            view = (View) obj5;
                        } else {
                            view = null;
                        }
                    }
                    if (view != null) {
                        view.setPressed(true);
                        view.setPressed(false);
                        view.performClick();
                    }
                }
                tl60.a(recyclerView, new hf5((View) recyclerView, (Object) e7eVar, (View) imageView, (View) textView, (byte) 4));
                break;
            case 1:
                RecyclerView recyclerView2 = (RecyclerView) obj3;
                e7e e7eVar2 = (e7e) obj4;
                ImageView imageView2 = (ImageView) obj2;
                TextView textView2 = (TextView) obj;
                kwd kwdVar = e7e.d2;
                int i = this.c;
                kcx.G(recyclerView2, i);
                e7eVar2.S1.removeCallbacks(e7eVar2.b2);
                v6e v6eVar = new v6e(e7eVar2, recyclerView2, i, imageView2, textView2);
                e7eVar2.b2 = v6eVar;
                e7eVar2.S1.postDelayed(v6eVar, 400L);
                break;
            default:
                Pair pair = (Pair) obj3;
                ((go30) obj4).b.i.i(((Integer) pair.first).intValue(), (vn30) pair.second, (wn00) obj2, (in30) obj, this.c);
                break;
        }
    }

    public /* synthetic */ v6e(go30 go30Var, Pair pair, wn00 wn00Var, in30 in30Var, int i) {
        this.d = go30Var;
        this.b = pair;
        this.e = wn00Var;
        this.f = in30Var;
        this.c = i;
    }

    public /* synthetic */ v6e(RecyclerView recyclerView, int i, e7e e7eVar, ImageView imageView, TextView textView) {
        this.b = recyclerView;
        this.c = i;
        this.d = e7eVar;
        this.e = imageView;
        this.f = textView;
    }
}
