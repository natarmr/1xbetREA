package a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import org.xplatform.cyber.game.universal.impl.presentation.dicepoker.DicePokerView;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberPlayerCardsView;
import org.xplatform.cyber.game.universal.impl.presentation.killerjoker.KillerJokerView;
import org.xplatform.uikit.components.tabs.DsTabs;

/* JADX INFO: loaded from: classes6.dex */
public final class akc implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1016a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public akc(ckc ckcVar, bkc bkcVar) {
        this.f1016a = (byte) 0;
        this.c = ckcVar;
        this.b = bkcVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f1016a) {
            case 0:
                break;
            case 1:
                animator.getClass();
                break;
            case 2:
                animator.getClass();
                break;
            case 3:
                animator.getClass();
                break;
            case 4:
                animator.getClass();
                break;
            case 5:
                animator.getClass();
                break;
            case 6:
                animator.getClass();
                ((b99) ((q4i) this.c)).setEndWidth(0);
                break;
            case 7:
                animator.getClass();
                break;
            case 8:
                animator.getClass();
                break;
            case 9:
                animator.getClass();
                break;
            case 10:
                animator.getClass();
                break;
            case 11:
                animator.getClass();
                break;
            default:
                animator.getClass();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f1016a;
        Object obj = this.b;
        Object obj2 = this.c;
        char c = 0;
        switch (b) {
            case 0:
                return;
            case 1:
                animator.getClass();
                return;
            case 2:
                animator.getClass();
                jk30 jk30Var = (jk30) obj;
                ImageView imageView = jk30Var.c;
                rgf rgfVar = (rgf) obj2;
                imageView.setImageResource(rgfVar.c.f23529a);
                imageView.setVisibility(0);
                TextView textView = jk30Var.d;
                textView.setText(rgfVar.e);
                textView.setAlpha(1.0f);
                return;
            case 3:
                animator.getClass();
                return;
            case 4:
                animator.getClass();
                qkk qkkVar = (qkk) obj;
                DicePokerView dicePokerView = qkkVar.b;
                ImageView imageView2 = qkkVar.f28889a;
                ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) View.TRANSLATION_Y, 0.0f).start();
                int i = 0;
                for (Object obj3 : qkkVar.c) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    fkk fkkVar = (fkk) obj3;
                    ImageView imageView3 = new ImageView((Context) obj2);
                    dicePokerView.addView(imageView3);
                    float x = imageView2.getX();
                    float width = imageView2.getWidth();
                    ekk ekkVar = fkkVar.b;
                    imageView3.setTranslationX((width * ekkVar.b) + x);
                    imageView3.setTranslationY(imageView2.getY() - (imageView3.getHeight() * ekkVar.c));
                    imageView3.setRotation(ekkVar.f7956a);
                    imageView3.setImageResource(fkkVar.f9697a);
                    AnimatorSet animatorSet = new AnimatorSet();
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    Property property = View.TRANSLATION_X;
                    char c2 = c;
                    float[] fArr = new float[1];
                    fArr[c2] = ((dicePokerView.getWidth() * ekkVar.d) / qkkVar.e) + imageView3.getX();
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property, fArr);
                    Property property2 = View.TRANSLATION_Y;
                    float y = imageView3.getY() - ((dicePokerView.getHeight() * ekkVar.e) / qkkVar.f);
                    float[] fArr2 = new float[1];
                    fArr2[c2] = y;
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property2, fArr2);
                    Property property3 = View.ROTATION;
                    float[] fArr3 = new float[1];
                    fArr3[c2] = 180.0f;
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property3, fArr3);
                    Animator[] animatorArr = new Animator[3];
                    animatorArr[c2] = objectAnimatorOfFloat;
                    animatorArr[1] = objectAnimatorOfFloat2;
                    animatorArr[2] = objectAnimatorOfFloat3;
                    animatorSet2.playTogether(animatorArr);
                    animatorSet2.setDuration(600L);
                    animatorSet2.start();
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorOfFloat4.setStartDelay(2000L);
                    objectAnimatorOfFloat4.setDuration(200L);
                    Animator[] animatorArr2 = new Animator[2];
                    animatorArr2[c2] = animatorSet2;
                    animatorArr2[1] = objectAnimatorOfFloat4;
                    animatorSet.playSequentially(animatorArr2);
                    animatorSet.addListener(new pkk(i, qkkVar));
                    animatorSet.start();
                    c = c2;
                    i = i2;
                }
                return;
            case 5:
                animator.getClass();
                return;
            case 6:
                animator.getClass();
                ((b99) ((q4i) obj2)).setEndWidth(0);
                return;
            case 7:
                animator.getClass();
                ((KillerJokerView) obj).s = false;
                ((qzn) obj2).invoke(Boolean.FALSE);
                return;
            case 8:
                animator.getClass();
                ((KillerJokerView) obj).setPlayersCardsSize((coy) obj2);
                return;
            case 9:
                animator.getClass();
                ((View) ((qgd) obj).f).setClickable(true);
                ((mbz) obj2).invoke();
                return;
            case 10:
                animator.getClass();
                return;
            case 11:
                animator.getClass();
                ((View) ((qgd) obj).f).setClickable(true);
                ((z930) obj2).invoke();
                return;
            default:
                animator.getClass();
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f1016a) {
            case 0:
                ckc ckcVar = (ckc) this.c;
                bkc bkcVar = (bkc) this.b;
                ckcVar.a(1.0f, bkcVar, true);
                bkcVar.k = bkcVar.e;
                bkcVar.l = bkcVar.f;
                bkcVar.m = bkcVar.g;
                bkcVar.a((bkcVar.j + 1) % bkcVar.i.length);
                if (!ckcVar.f) {
                    ckcVar.e += 1.0f;
                } else {
                    ckcVar.f = false;
                    animator.cancel();
                    animator.setDuration(1332L);
                    animator.start();
                    if (bkcVar.n) {
                        bkcVar.n = false;
                    }
                }
                break;
            case 1:
                animator.getClass();
                break;
            case 2:
                animator.getClass();
                break;
            case 3:
                animator.getClass();
                break;
            case 4:
                animator.getClass();
                break;
            case 5:
                animator.getClass();
                break;
            case 6:
                animator.getClass();
                break;
            case 7:
                animator.getClass();
                break;
            case 8:
                animator.getClass();
                break;
            case 9:
                animator.getClass();
                break;
            case 10:
                animator.getClass();
                break;
            case 11:
                animator.getClass();
                break;
            default:
                animator.getClass();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int iMax;
        byte b = this.f1016a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((ckc) obj2).e = 0.0f;
                break;
            case 1:
                animator.getClass();
                ((egf) obj).setCrystal((cgf) obj2);
                break;
            case 2:
                animator.getClass();
                break;
            case 3:
                animator.getClass();
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    p1o0 p1o0Var = (p1o0) ((CyberPlayerCardsView) obj2).l.get(Integer.valueOf(((Number) it.next()).intValue()));
                    if (p1o0Var != null) {
                        p1o0Var.c.setVisibility(8);
                    }
                }
                break;
            case 4:
                animator.getClass();
                break;
            case 5:
                animator.getClass();
                ((TextView) obj).setText((String) obj2);
                break;
            case 6:
                q4i q4iVar = (q4i) obj2;
                animator.getClass();
                DsTabs dsTabs = (DsTabs) obj;
                int i = DsTabs.g1;
                if (dsTabs.g()) {
                    iMax = ((b99) q4iVar).b(dsTabs.getSelectedTabWidthForScrollableBubbleTab());
                } else {
                    int measuredWidth = dsTabs.b.getMeasuredWidth();
                    int i2 = dsTabs.m;
                    iMax = Math.max(((measuredWidth - i2) - i2) / dsTabs.t.size(), dsTabs.getSelectedTabMinWidthForFixedBubbleTab());
                }
                ((b99) q4iVar).setEndWidth(iMax);
                break;
            case 7:
                animator.getClass();
                break;
            case 8:
                animator.getClass();
                break;
            case 9:
                animator.getClass();
                break;
            case 10:
                animator.getClass();
                ((View) ((qgd) obj).f).setClickable(false);
                ((z930) obj2).invoke();
                break;
            case 11:
                animator.getClass();
                break;
            default:
                animator.getClass();
                ((View) ((qgd) obj).f).setClickable(false);
                ((z930) obj2).invoke();
                break;
        }
    }

    public /* synthetic */ akc(Object obj, Object obj2, byte b) {
        this.f1016a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }
}
