package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class uuo extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36310a;
    public boolean b;
    public final /* synthetic */ Object c;

    public uuo(m0p m0pVar) {
        this.f36310a = (byte) 1;
        this.c = m0pVar;
        this.b = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f36310a) {
            case 1:
                this.b = true;
                break;
            case 2:
                this.b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f36310a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (!this.b) {
                    ((View) obj).setVisibility(4);
                }
                break;
            case 1:
                m0p m0pVar = (m0p) obj;
                if (this.b) {
                    this.b = false;
                } else if (((Float) m0pVar.z.getAnimatedValue()).floatValue() != 0.0f) {
                    m0pVar.A = (byte) 2;
                    m0pVar.s.invalidate();
                } else {
                    m0pVar.A = (byte) 0;
                    m0pVar.l(0);
                }
                break;
            default:
                zlq zlqVar = (zlq) obj;
                zlqVar.r = (byte) 0;
                zlqVar.m = null;
                if (!this.b) {
                    zlqVar.s.a(4, false);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        byte b = this.f36310a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (this.b) {
                    ((View) obj).setVisibility(0);
                }
                break;
            case 1:
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                zlq zlqVar = (zlq) obj;
                zlqVar.s.a(0, false);
                zlqVar.r = (byte) 1;
                zlqVar.m = animator;
                this.b = false;
                break;
        }
    }

    public uuo(zlq zlqVar) {
        this.f36310a = (byte) 2;
        this.c = zlqVar;
    }

    public uuo(View view, boolean z) {
        this.f36310a = (byte) 0;
        this.b = z;
        this.c = view;
    }
}
