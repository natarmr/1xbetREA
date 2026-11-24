package org.xplatform.uikit.components.cells.menu;

import a.a3e;
import a.a8z;
import a.ape;
import a.bqd0;
import a.djl;
import a.h7w;
import a.hf5;
import a.hny;
import a.if5;
import a.jk3;
import a.jmu0;
import a.ktt0;
import a.ljc0;
import a.maz;
import a.r0m;
import a.r0x;
import a.tje;
import a.tl60;
import a.tw5;
import a.wez;
import a.yum0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.textview.MaterialTextView;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.badges.DsBadge;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.counter.DsCounter;

/* JADX INFO: loaded from: classes6.dex */
public final class DsMenuCompactCell extends tw5 {
    public static final /* synthetic */ int k1 = 0;
    public final jk3 A;
    public final if5 B;
    public final ape f1;
    public final a8z g1;
    public final int h1;
    public final int i1;
    public final float j1;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.rkm, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public DsMenuCompactCell(Context context, AttributeSet attributeSet, int i) {
        final byte b = 2;
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, R.attr.cellMenuCompactStyle);
        LayoutInflater.from(context).inflate(R.layout.menu_compact_layout, this);
        int i2 = R.id.iconImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(this, R.id.iconImageView);
        if (appCompatImageView != null) {
            i2 = R.id.statusIcon;
            ImageView imageView = (ImageView) yum0.f(this, R.id.statusIcon);
            if (imageView != null) {
                i2 = R.id.subtitle;
                MaterialTextView materialTextView = (MaterialTextView) yum0.f(this, R.id.subtitle);
                if (materialTextView != null) {
                    i2 = R.id.titleTextView;
                    TextView textView = (TextView) yum0.f(this, R.id.titleTextView);
                    if (textView != null) {
                        this.A = new jk3(this, appCompatImageView, imageView, materialTextView, textView);
                        final byte b2 = 0;
                        if5 if5Var = new if5(appCompatImageView, new Function0(this) { // from class: a.rkm
                            public final /* synthetic */ DsMenuCompactCell b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b3 = b2;
                                DsMenuCompactCell dsMenuCompactCell = this.b;
                                switch (b3) {
                                    case 0:
                                        int i3 = DsMenuCompactCell.k1;
                                        Object parent = dsMenuCompactCell.getParent();
                                        parent.getClass();
                                        return (View) parent;
                                    case 1:
                                        int i4 = DsMenuCompactCell.k1;
                                        Object parent2 = dsMenuCompactCell.getParent();
                                        parent2.getClass();
                                        return (View) parent2;
                                    default:
                                        return new r0x((AppCompatImageView) dsMenuCompactCell.A.d);
                                }
                            }
                        });
                        this.B = if5Var;
                        final byte b3 = 1;
                        ?? r3 = new Function0(this) { // from class: a.rkm
                            public final /* synthetic */ DsMenuCompactCell b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b4 = b3;
                                DsMenuCompactCell dsMenuCompactCell = this.b;
                                switch (b4) {
                                    case 0:
                                        int i3 = DsMenuCompactCell.k1;
                                        Object parent = dsMenuCompactCell.getParent();
                                        parent.getClass();
                                        return (View) parent;
                                    case 1:
                                        int i4 = DsMenuCompactCell.k1;
                                        Object parent2 = dsMenuCompactCell.getParent();
                                        parent2.getClass();
                                        return (View) parent2;
                                    default:
                                        return new r0x((AppCompatImageView) dsMenuCompactCell.A.d);
                                }
                            }
                        };
                        ape apeVar = new ape(this, r3);
                        this.f1 = apeVar;
                        this.g1 = maz.a(wez.b, new Function0(this) { // from class: a.rkm
                            public final /* synthetic */ DsMenuCompactCell b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b4 = b;
                                DsMenuCompactCell dsMenuCompactCell = this.b;
                                switch (b4) {
                                    case 0:
                                        int i3 = DsMenuCompactCell.k1;
                                        Object parent = dsMenuCompactCell.getParent();
                                        parent.getClass();
                                        return (View) parent;
                                    case 1:
                                        int i4 = DsMenuCompactCell.k1;
                                        Object parent2 = dsMenuCompactCell.getParent();
                                        parent2.getClass();
                                        return (View) parent2;
                                    default:
                                        return new r0x((AppCompatImageView) dsMenuCompactCell.A.d);
                                }
                            }
                        });
                        this.h1 = getResources().getDimensionPixelSize(R.dimen.space_12);
                        this.i1 = getResources().getDimensionPixelSize(R.dimen.space_4);
                        this.j1 = 0.5f;
                        if5Var.f(attributeSet2, 0);
                        Context context2 = getContext();
                        context2.getClass();
                        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, bqd0.y, 0, 0);
                        apeVar.g = typedArrayObtainStyledAttributes.getInt(2, apeVar.g);
                        apeVar.h = ktt0.q(typedArrayObtainStyledAttributes, 4, 7);
                        apeVar.i = ktt0.q(typedArrayObtainStyledAttributes, 6, 8);
                        apeVar.e = (r0m) r0m.t.get(typedArrayObtainStyledAttributes.getInt(3, 0));
                        apeVar.f = typedArrayObtainStyledAttributes.getResourceId(3, apeVar.f);
                        if (apeVar.d == null) {
                            Integer[] numArr = DsBadge.e;
                            Context context3 = getContext();
                            context3.getClass();
                            DsBadge dsBadge = new DsBadge(new tje(context3, apeVar.f), null, 6);
                            jmu0.g(dsBadge);
                            apeVar.d = dsBadge;
                            dsBadge.d(apeVar.g, apeVar.h, apeVar.i);
                            DsBadge dsBadge2 = apeVar.d;
                            if (dsBadge2 != 0) {
                                dsBadge2.a(this, r3);
                            }
                        }
                        apeVar.a(Integer.valueOf(typedArrayObtainStyledAttributes.getInt(0, 0)));
                        typedArrayObtainStyledAttributes.recycle();
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, bqd0.U, R.attr.cellMenuCompactStyle, 0);
                        String strP = ktt0.p(typedArrayObtainStyledAttributes2, context, 10);
                        String string = strP != null ? strP.toString() : null;
                        setTitle(string == null ? "" : string);
                        String strP2 = ktt0.p(typedArrayObtainStyledAttributes2, context, 8);
                        String string2 = strP2 != null ? strP2.toString() : null;
                        setSubTitle(string2 != null ? string2 : "");
                        Integer numL = ktt0.l(typedArrayObtainStyledAttributes2, 11);
                        if (numL != null) {
                            setTitleColor(numL.intValue());
                        }
                        Integer numL2 = ktt0.l(typedArrayObtainStyledAttributes2, 9);
                        if (numL2 != null) {
                            setSubTitleColor(numL2.intValue());
                        }
                        setIcon(typedArrayObtainStyledAttributes2.getDrawable(1));
                        setStatusIcon(typedArrayObtainStyledAttributes2.getDrawable(6));
                        setIconTint(ktt0.m(2, context, typedArrayObtainStyledAttributes2));
                        setStatusIconTint(ktt0.m(7, context, typedArrayObtainStyledAttributes2));
                        View cellMiddleView = getCellMiddleView();
                        DsCellMiddleTitle dsCellMiddleTitle = cellMiddleView instanceof DsCellMiddleTitle ? (DsCellMiddleTitle) cellMiddleView : null;
                        if (dsCellMiddleTitle != null) {
                            dsCellMiddleTitle.setTitleMinLines(typedArrayObtainStyledAttributes2.getInt(5, 1));
                            dsCellMiddleTitle.setTitleMaxLines(typedArrayObtainStyledAttributes2.getInt(4, 2));
                            dsCellMiddleTitle.setSubtitleMaxLines(typedArrayObtainStyledAttributes2.getInt(3, 2));
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        return;
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final r0x getImageHelper() {
        return (r0x) this.g1.getValue();
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        DsBadge dsBadge;
        super.setBackgroundTintList(colorStateList);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new djl(this, colorStateList, (byte) 1));
            return;
        }
        if5 if5Var = this.B;
        if (if5Var.i || (dsBadge = if5Var.c) == null) {
            return;
        }
        tl60.a(dsBadge, new hf5(dsBadge, if5Var, colorStateList, (byte) 0));
    }

    public void setBadgeBackgroundTint(int i) {
        this.B.j(i);
    }

    public void setBadgeVisible(boolean z) {
        DsBadge dsBadge = this.B.c;
        if (dsBadge != null) {
            dsBadge.setVisibility(z ? 0 : 8);
        }
    }

    public final void setCounter(Integer num) {
        this.f1.a(num);
    }

    @Override // a.tw5, android.view.View
    public void setEnabled(boolean z) {
        jmu0.b(this, z);
        DsBadge dsBadge = this.B.c;
        if (dsBadge != null) {
            dsBadge.setEnabled(z);
        }
        ape apeVar = this.f1;
        DsCounter dsCounter = apeVar.c;
        if (dsCounter != null) {
            dsCounter.setEnabled(z);
        }
        DsBadge dsBadge2 = apeVar.d;
        if (dsBadge2 != null) {
            dsBadge2.setEnabled(z);
        }
        super.setEnabled(z);
    }

    public final void setIcon(Drawable drawable) {
        jk3 jk3Var = this.A;
        ((AppCompatImageView) jk3Var.d).setImageDrawable(drawable);
        ((AppCompatImageView) jk3Var.d).setVisibility(drawable != null ? 0 : 8);
    }

    public final void setIconResource(int i) {
        jk3 jk3Var = this.A;
        ((AppCompatImageView) jk3Var.d).setImageResource(i);
        ((AppCompatImageView) jk3Var.d).setVisibility(0);
    }

    public final void setIconTint(ColorStateList colorStateList) {
        ((AppCompatImageView) this.A.d).setImageTintList(colorStateList);
    }

    public final void setStatusIcon(Drawable drawable) {
        jk3 jk3Var = this.A;
        ((ImageView) jk3Var.e).setImageDrawable(drawable);
        ((ImageView) jk3Var.e).setVisibility(drawable != null ? 0 : 8);
    }

    public final void setStatusIconTint(ColorStateList colorStateList) {
        ((ImageView) this.A.e).setImageTintList(colorStateList);
    }

    public final void setSubTitle(CharSequence charSequence) {
        charSequence.getClass();
        jk3 jk3Var = this.A;
        MaterialTextView materialTextView = (MaterialTextView) jk3Var.c;
        TextView textView = (TextView) jk3Var.f;
        materialTextView.setText(charSequence);
        MaterialTextView materialTextView2 = (MaterialTextView) jk3Var.c;
        materialTextView2.setVisibility(charSequence.length() > 0 ? 0 : 8);
        if (materialTextView2.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                hny.u("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            a3e a3eVar = (a3e) layoutParams;
            a3eVar.k = materialTextView2.getId();
            a3eVar.F = 0.0f;
            textView.setLayoutParams(a3eVar);
            jmu0.l(this.h1, this.i1, 5, textView);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 == null) {
            hny.u("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        a3e a3eVar2 = (a3e) layoutParams2;
        a3eVar2.l = ((DsMenuCompactCell) jk3Var.b).getId();
        a3eVar2.F = this.j1;
        textView.setLayoutParams(a3eVar2);
        jmu0.l(0, 0, 5, textView);
    }

    public final void setSubTitleColor(int i) {
        ((MaterialTextView) this.A.c).setTextColor(i);
    }

    public final void setTitle(int i) {
        String string = getContext().getString(i);
        string.getClass();
        setTitle(string);
    }

    public final void setTitleColor(int i) {
        ((TextView) this.A.f).setTextColor(i);
    }

    public final void v(int i, String str) {
        jk3 jk3Var = this.A;
        ((AppCompatImageView) jk3Var.d).setVisibility(0);
        r0x imageHelper = getImageHelper();
        AppCompatImageView appCompatImageView = (AppCompatImageView) jk3Var.d;
        imageHelper.getClass();
        appCompatImageView.setColorFilter((ColorFilter) null);
        getImageHelper().f(str, i, new h7w((byte) 19), new ljc0((byte) 14));
    }

    public final void setTitle(String str) {
        str.getClass();
        ((TextView) this.A.f).setText(str);
    }

    public final void setSubTitle(int i) {
        String string = getContext().getString(i);
        string.getClass();
        setSubTitle(string);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsMenuCompactCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsMenuCompactCell(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
