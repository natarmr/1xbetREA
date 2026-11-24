package org.xplatform.cyber.game.universal.impl.presentation.crystal.view;

import a.akc;
import a.hny;
import a.jk30;
import a.rgf;
import a.yum0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class CrystalPlayerLogView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46527a;
    public boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX WARN: Illegal instructions before constructor call */
    public CrystalPlayerLogView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46527a = new ArrayList();
        this.c = context.getResources().getDimensionPixelSize(R.dimen.space_40);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.space_1);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.space_8);
        this.f = context.getColor(R.color.static_white_20);
        setOrientation(1);
    }

    public final void a(ArrayList arrayList, boolean z) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rgf rgfVar = (rgf) it.next();
            ArrayList arrayList2 = this.f46527a;
            if (!arrayList2.contains(rgfVar)) {
                if (rgfVar.b == 2 && !this.b && z) {
                    View view = new View(getContext());
                    view.setBackgroundColor(this.f);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.c, this.d);
                    layoutParams.setMargins(0, 0, 0, this.e);
                    addView(view, layoutParams);
                    this.b = true;
                }
                View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.synthetic_crystal_player_log_item, (ViewGroup) this, false);
                int i = R.id.ivCrystal;
                ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivCrystal);
                if (imageView != null) {
                    i = R.id.tvAdditionalInfo;
                    TextView textView = (TextView) yum0.f(viewInflate, R.id.tvAdditionalInfo);
                    if (textView != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        jk30 jk30Var = new jk30(linearLayout, imageView, textView, (byte) 1);
                        textView.setText(rgfVar.d);
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) LinearLayout.ALPHA, 1.0f, 0.0f);
                        objectAnimatorOfFloat.setDuration(400L);
                        objectAnimatorOfFloat.setStartDelay(3500L);
                        objectAnimatorOfFloat.addListener(new akc(jk30Var, rgfVar, (byte) 2));
                        objectAnimatorOfFloat.start();
                        addView(linearLayout);
                        arrayList2.add(rgfVar);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CrystalPlayerLogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CrystalPlayerLogView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
