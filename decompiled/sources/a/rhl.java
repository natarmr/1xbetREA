package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class rhl extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30494a;
    public final /* synthetic */ shl b;

    public /* synthetic */ rhl(shl shlVar, byte b) {
        this.f30494a = b;
        this.b = shlVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f30494a) {
            case 1:
                super.onAnimationEnd(animator);
                shl shlVar = this.b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = shlVar.g;
                if (arrayList != null && !shlVar.h) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((s06) it.next()).a(shlVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f30494a) {
            case 0:
                super.onAnimationStart(animator);
                shl shlVar = this.b;
                ArrayList arrayList = shlVar.g;
                if (arrayList != null && !shlVar.h) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((s06) it.next()).b(shlVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
