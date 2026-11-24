package org.xplatform.cyber.game.counterstrike.impl.presentation.map_movement;

import a.a3e;
import a.a8z;
import a.cpf;
import a.ejd;
import a.fd5;
import a.hf5;
import a.hxm0;
import a.iun;
import a.jof;
import a.jwd;
import a.lhf;
import a.maz;
import a.pif;
import a.sj3;
import a.sw8;
import a.tl60;
import a.u0d;
import a.wez;
import a.wof;
import a.zb1;
import a.zsh;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class Cs2MapMovementView extends ConstraintLayout {
    public static final LinkedHashMap A = new LinkedHashMap();
    public final a8z q;
    public final LinkedHashMap r;
    public final ImageView s;
    public final ValueAnimator t;
    public final int u;
    public final int v;
    public short w;
    public short x;
    public float y;
    public List z;

    /* JADX WARN: Illegal instructions before constructor call */
    public Cs2MapMovementView(Context context, AttributeSet attributeSet, int i) {
        byte b = 2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.q = maz.a(wez.b, new lhf(this, this, b));
        this.r = new LinkedHashMap();
        this.u = (int) getResources().getDimension(R.dimen.icon_size_12);
        int dimension = (int) getResources().getDimension(R.dimen.icon_size_12);
        this.v = dimension;
        this.z = iun.f15405a;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new a3e(dimension, dimension));
        this.s = imageView;
        imageView.setImageResource(R.drawable.cs2_bomb_ic);
        imageView.getImageTintList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.25f);
        valueAnimatorOfFloat.getClass();
        this.t = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new fd5(this, (byte) 6));
    }

    private final zsh getBinding() {
        return (zsh) this.q.getValue();
    }

    private final void setBombOnMap(jof jofVar) {
        ImageView imageView = getBinding().b;
        int i = jofVar.b;
        int i2 = jofVar.c;
        ImageView imageView2 = this.s;
        tl60.a(imageView, new cpf(imageView, imageView, i, i2, this, imageView2));
        if (imageView2.getParent() == null) {
            addView(imageView2);
        }
    }

    public static final Unit v(String str, Cs2MapMovementView cs2MapMovementView, zb1 zb1Var, Drawable drawable) {
        Drawable drawableNewDrawable;
        String str2;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            LinkedHashMap linkedHashMap = A;
            if (constantState != null) {
                linkedHashMap.put(str, constantState);
                while (linkedHashMap.size() > 8) {
                    Set setEntrySet = linkedHashMap.entrySet();
                    setEntrySet.getClass();
                    Map.Entry entry = (Map.Entry) CollectionsKt.V(setEntrySet);
                    if (entry == null || (str2 = (String) entry.getKey()) == null) {
                        break;
                    }
                    linkedHashMap.remove(str2);
                }
            }
            ImageView imageView = cs2MapMovementView.getBinding().b;
            Drawable.ConstantState constantState2 = (Drawable.ConstantState) linkedHashMap.get(str);
            Drawable drawableMutate = (constantState2 == null || (drawableNewDrawable = constantState2.newDrawable()) == null) ? null : drawableNewDrawable.mutate();
            if (drawableMutate != null) {
                drawable = drawableMutate;
            }
            imageView.setImageDrawable(drawable);
            zb1Var.invoke();
        }
        return Unit.f46060a;
    }

    public final void setBomb(jof jofVar) {
        jofVar.getClass();
        pif pifVar = jofVar.f16854a;
        pif pifVar2 = pif.d;
        ImageView imageView = this.s;
        if (pifVar == pifVar2 || (jofVar.b == 0 && jofVar.c == 0)) {
            if (imageView.getParent() != null) {
                hxm0.v(imageView);
                return;
            }
            return;
        }
        pif pifVar3 = pif.f27040a;
        ValueAnimator valueAnimator = this.t;
        if (pifVar == pifVar3) {
            setBombOnMap(jofVar);
            Drawable drawable = imageView.getDrawable();
            Context context = getContext();
            context.getClass();
            sj3.C0(drawable, context, R.color.static_white);
            valueAnimator.start();
            return;
        }
        if (pifVar == pif.b) {
            setBombOnMap(jofVar);
            valueAnimator.cancel();
            Drawable drawable2 = imageView.getDrawable();
            Context context2 = getContext();
            context2.getClass();
            sj3.C0(drawable2, context2, R.color.cyber_cs2_defused_bomb_color);
            return;
        }
        if (pifVar == pif.c) {
            setBombOnMap(jofVar);
            valueAnimator.cancel();
            Drawable drawable3 = imageView.getDrawable();
            Context context3 = getContext();
            context3.getClass();
            sj3.C0(drawable3, context3, R.color.cyber_cs2_exploded_bomb_color);
        }
    }

    public final void setPlayers(List<wof> list) {
        list.getClass();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.r;
            if (!zHasNext) {
                ImageView imageView = getBinding().b;
                tl60.a(imageView, new hf5((View) imageView, (Object) linkedHashMap, (View) this, (View) imageView, (byte) 5));
                return;
            }
            wof wofVar = (wof) it.next();
            String str = wofVar.f39493a;
            Pair pair = (Pair) linkedHashMap.get(str);
            if (pair == null) {
                Context context = getRootView().getContext();
                context.getClass();
                ImageView imageView2 = new ImageView(context);
                int i = this.u;
                imageView2.setLayoutParams(new a3e(i, i));
                addView(imageView2);
                linkedHashMap.put(str, new Pair(wofVar, imageView2));
            } else {
                linkedHashMap.put(str, new Pair(wofVar, pair.b));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(String str, int i, int i2, float f, ArrayList arrayList, zb1 zb1Var, jwd jwdVar, String str2) {
        Drawable drawableNewDrawable;
        this.w = i;
        this.x = i2;
        this.y = f;
        this.z = arrayList;
        Drawable.ConstantState constantState = (Drawable.ConstantState) A.get(str);
        Drawable drawableMutate = (constantState == null || (drawableNewDrawable = constantState.newDrawable()) == null) ? null : drawableNewDrawable.mutate();
        if (drawableMutate != null) {
            if (getBinding().b.getDrawable() == null || !Intrinsics.d(getBinding().b.getDrawable(), drawableMutate)) {
                getBinding().b.setImageDrawable(drawableMutate);
            }
            zb1Var.invoke();
            return;
        }
        List list = u0d.f34849a;
        Context context = getBinding().b.getContext();
        context.getClass();
        u0d.s(context, str, null, null, null, new sw8((Object) str, (Object) this, (Object) zb1Var, (byte) 17), new ejd(jwdVar, (byte) 25), 14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cs2MapMovementView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cs2MapMovementView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
