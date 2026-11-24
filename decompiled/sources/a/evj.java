package a;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class evj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8470a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ kvj c;

    public /* synthetic */ evj(kvj kvjVar, ArrayList arrayList, byte b) {
        this.f8470a = b;
        this.c = kvjVar;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f8470a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    kvj kvjVar = this.c;
                    if (!zHasNext) {
                        arrayList.clear();
                        kvjVar.m.remove(arrayList);
                    } else {
                        jvj jvjVar = (jvj) it.next();
                        xhe0 xhe0Var = jvjVar.f17206a;
                        int i = jvjVar.b;
                        int i2 = jvjVar.c;
                        int i3 = jvjVar.d;
                        int i4 = jvjVar.e;
                        kvjVar.getClass();
                        View view = xhe0Var.f40887a;
                        int i5 = i3 - i;
                        int i6 = i4 - i2;
                        if (i5 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        kvjVar.p.add(xhe0Var);
                        viewPropertyAnimatorAnimate.setDuration(kvjVar.e).setListener(new gvj(kvjVar, xhe0Var, i5, view, i6, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            default:
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    kvj kvjVar2 = this.c;
                    if (!zHasNext2) {
                        arrayList.clear();
                        kvjVar2.l.remove(arrayList);
                    } else {
                        xhe0 xhe0Var2 = (xhe0) it2.next();
                        kvjVar2.getClass();
                        View view2 = xhe0Var2.f40887a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                        kvjVar2.o.add(xhe0Var2);
                        viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(kvjVar2.c).setListener(new fvj(kvjVar2, xhe0Var2, view2, viewPropertyAnimatorAnimate2)).start();
                    }
                    break;
                }
                break;
        }
    }
}
