package a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class jxj extends p4 {
    public final boolean c;
    public boolean d;
    public iqi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxj(rnk0 rnk0Var, boolean z) {
        super(rnk0Var);
        rnk0Var.getClass();
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9 A[Catch: RuntimeException -> 0x00ef, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00ef, blocks: (B:78:0x00e3, B:80:0x00e9), top: B:91:0x00e3 }] */
    public final iqi n1(Context context) {
        int i;
        iqi iqiVar;
        Animator animatorLoadAnimator;
        int iW;
        context.getClass();
        if (this.d) {
            return this.e;
        }
        rnk0 rnk0Var = (rnk0) this.b;
        Fragment fragment = rnk0Var.c;
        boolean z = rnk0Var.f30792a == tnk0.c;
        cxq cxqVar = fragment.o1;
        int i2 = cxqVar == null ? 0 : cxqVar.f;
        if (this.c) {
            if (z) {
                if (cxqVar == null) {
                    i = 0;
                } else {
                    i = cxqVar.d;
                }
            } else if (cxqVar == null) {
                i = 0;
            } else {
                i = cxqVar.e;
            }
        } else if (z) {
            if (cxqVar == null) {
                i = 0;
            } else {
                i = cxqVar.b;
            }
        } else if (cxqVar == null) {
            i = 0;
        } else {
            i = cxqVar.c;
        }
        fragment.r0(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.k1;
        iqi iqiVar2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fragment.k1.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.k1;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i == 0 && i2 != 0) {
                if (i2 == 4097) {
                    iW = z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                } else if (i2 == 8194) {
                    iW = z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                } else if (i2 == 8197) {
                    iW = z ? qbc.W(android.R.attr.activityCloseEnterAnimation, context) : qbc.W(android.R.attr.activityCloseExitAnimation, context);
                } else if (i2 == 4099) {
                    iW = z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                } else if (i2 != 4100) {
                    iW = -1;
                } else {
                    iW = z ? qbc.W(android.R.attr.activityOpenEnterAnimation, context) : qbc.W(android.R.attr.activityOpenExitAnimation, context);
                }
                i = iW;
            }
            if (i != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i));
                if (zEquals) {
                    try {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i);
                        if (animationLoadAnimation != null) {
                            iqiVar = new iqi(animationLoadAnimation);
                            iqiVar2 = iqiVar;
                        }
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                            if (animatorLoadAnimator != null) {
                                iqiVar = new iqi(animatorLoadAnimator);
                                iqiVar2 = iqiVar;
                            }
                        } catch (RuntimeException e2) {
                            if (zEquals) {
                                throw e2;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i);
                            if (animationLoadAnimation2 != null) {
                                iqiVar2 = new iqi(animationLoadAnimation2);
                            }
                        }
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (animatorLoadAnimator != null) {
                        iqiVar = new iqi(animatorLoadAnimator);
                        iqiVar2 = iqiVar;
                    }
                }
            }
        }
        this.e = iqiVar2;
        this.d = true;
        return iqiVar2;
    }
}
