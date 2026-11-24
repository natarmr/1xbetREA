package a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.xplatform.ui_core.viewcomponents.views.AnimatingPasswordTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class y63 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42076a;
    public final int b;
    public final Object c;

    public y63(RecyclerView recyclerView, int i) {
        this.f42076a = (byte) 3;
        this.b = i;
        this.c = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f42076a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                AnimatingPasswordTextView animatingPasswordTextView = (AnimatingPasswordTextView) obj;
                if (animatingPasswordTextView.g == this) {
                    ArrayList arrayList = new ArrayList();
                    Object obj2 = animatingPasswordTextView.c.get(i);
                    obj2.getClass();
                    TextView textView = (TextView) obj2;
                    arrayList.add(ObjectAnimator.ofFloat(textView, "scaleX", 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView, "scaleY", 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", 0.0f));
                    Object obj3 = animatingPasswordTextView.d.get(i);
                    obj3.getClass();
                    TextView textView2 = (TextView) obj3;
                    arrayList.add(ObjectAnimator.ofFloat(textView2, "scaleX", 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, "scaleY", 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, "alpha", 1.0f));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150L);
                    animatorSet.playTogether(arrayList);
                    animatorSet.addListener(new x63(animatingPasswordTextView, (byte) 0));
                    animatorSet.start();
                    animatingPasswordTextView.f = animatorSet;
                    break;
                }
                break;
            case 1:
                xvw xvwVar = (xvw) ((owp0) obj).b;
                if (xvwVar != null) {
                    xvwVar.T(i);
                }
                break;
            case 2:
                ((com.google.android.material.datepicker.e) obj).O1.B0(i);
                break;
            case 3:
                ((RecyclerView) obj).B0(i);
                break;
            default:
                ((h9w0) obj).c(i);
                break;
        }
    }

    public /* synthetic */ y63(Object obj, int i, byte b) {
        this.f42076a = b;
        this.c = obj;
        this.b = i;
    }
}
