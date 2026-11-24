package org.xplatform.uikit.components.tag;

import a.b33;
import a.bqd0;
import a.cem0;
import a.edl;
import a.k14;
import a.maz;
import a.n0o0;
import a.ntl;
import a.po5;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes6.dex */
public class DsTag extends AppCompatTextView {
    public static final /* synthetic */ int l = 0;
    public final n0o0 i;
    public int j;
    public final edl k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsTag(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.i = maz.b(new ntl(this, (byte) 11));
        edl edlVar = new edl(this, (byte) 24);
        this.k = edlVar;
        setTag("DsTagTest");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.q0, i, 0);
        edlVar.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        getAttachHelper().a(attributeSet);
        setGravity(17);
    }

    private final k14 getAttachHelper() {
        return (k14) this.i.getValue();
    }

    public final DsTag j(ShapeableImageView shapeableImageView, po5 po5Var) {
        shapeableImageView.getClass();
        return (DsTag) getAttachHelper().b(shapeableImageView, po5Var);
    }

    public final void setStyle(int i) {
        if (this.j == i) {
            return;
        }
        setBackground(null);
        Context context = getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, bqd0.q0);
        this.k.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        cem0.n(i, this);
        setTextAppearance(getContext(), i);
        k14 attachHelper = getAttachHelper();
        Context context2 = attachHelper.f17500a.getContext();
        context2.getClass();
        b33 b33Var = attachHelper.l;
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i, bqd0.w);
        b33Var.invoke(typedArrayObtainStyledAttributes2);
        typedArrayObtainStyledAttributes2.recycle();
        this.j = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsTag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsTag(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ DsTag(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
