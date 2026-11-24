package a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.xplatform.uikit.components.badges.DsBadge;

/* JADX INFO: loaded from: classes2.dex */
public final class xh extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40864a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xh(Object obj, byte b) {
        this.f40864a = b;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        byte b = this.f40864a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.z = null;
                actionBarOverlayLayout.j = false;
                break;
            case 8:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                focusRingDrawable.k = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        byte b = this.f40864a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.z = null;
                actionBarOverlayLayout.j = false;
                break;
            case 1:
                l63 l63Var = (l63) obj;
                ArrayList arrayList = new ArrayList(l63Var.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((s06) arrayList.get(i)).a(l63Var);
                }
                break;
            case 2:
                animator.getClass();
                gd5 gd5Var = (gd5) obj;
                wak0 wak0Var = gd5Var.r;
                if (wak0Var != null) {
                    wak0Var.b(gd5Var.c(true));
                }
                break;
            case 3:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                bottomSheetBehavior.O(5);
                WeakReference weakReference = bottomSheetBehavior.Y;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.Y.get()).requestLayout();
                    break;
                }
                break;
            case 4:
                animator.getClass();
                a99 a99Var = (a99) obj;
                y89 y89Var = a99Var.y;
                if (y89Var != null) {
                    int iC = a99Var.c(true);
                    y89Var.m.i(iC);
                    if5 if5Var = y89Var.n;
                    if5Var.g = Integer.valueOf(iC);
                    DsBadge dsBadge = if5Var.c;
                    if (dsBadge != null) {
                        dsBadge.d.e(iC);
                    }
                }
                break;
            case 5:
                til tilVar = (til) obj;
                tilVar.p();
                tilVar.r.start();
                break;
            case 6:
                ((ExpandableTransformationBehavior) obj).b = null;
                break;
            case 7:
                zlq zlqVar = (zlq) obj;
                zlqVar.r = (byte) 0;
                zlqVar.m = null;
                break;
            case 8:
            case 9:
            default:
                super.onAnimationEnd(animator);
                break;
            case 10:
                th30 th30Var = (th30) obj;
                th30Var.b.setTranslationY(0.0f);
                th30Var.b(0.0f);
                break;
            case 11:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.y(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    break;
                }
                break;
            case 12:
                ((gms0) obj).r();
                animator.removeListener(this);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f40864a) {
            case 9:
                super.onAnimationRepeat(animator);
                f900 f900Var = (f900) this.b;
                f900Var.f = (f900Var.f + 1) % f900Var.e.e.length;
                f900Var.g = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        byte b = this.f40864a;
        Object obj = this.b;
        switch (b) {
            case 1:
                l63 l63Var = (l63) obj;
                ArrayList arrayList = new ArrayList(l63Var.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((s06) arrayList.get(i)).b(l63Var);
                }
                break;
            case 7:
                zlq zlqVar = (zlq) obj;
                zlqVar.s.a(0, false);
                zlqVar.r = (byte) 2;
                zlqVar.m = animator;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
