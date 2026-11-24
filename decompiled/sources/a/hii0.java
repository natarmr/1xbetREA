package a;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class hii0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13114a = 0;
    public boolean b;
    public final Object c;
    public final Object d;

    public hii0(glz glzVar, kkz kkzVar) {
        kkzVar.getClass();
        this.c = glzVar;
        this.d = kkzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yk50 yk50Var;
        byte b = this.f13114a;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (!this.b) {
                    ((glz) obj2).d((kkz) obj);
                    this.b = true;
                }
                break;
            default:
                View view = (View) obj2;
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj;
                ygu0 ygu0Var = swipeDismissBehavior.f45561a;
                if (ygu0Var != null && ygu0Var.f()) {
                    view.postOnAnimation(this);
                    break;
                } else if (this.b && (yk50Var = swipeDismissBehavior.b) != null) {
                    yk50Var.h(view);
                    break;
                }
                break;
        }
    }

    public hii0(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.d = swipeDismissBehavior;
        this.c = view;
        this.b = z;
    }
}
