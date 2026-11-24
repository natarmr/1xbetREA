package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class akj0 implements zjj0 {
    public static final zef0 m = new zef0(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qzb f1025a = new wgg0();
    public qzb b = new wgg0();
    public qzb c = new wgg0();
    public qzb d = new wgg0();
    public dne e = new q0(0.0f);
    public dne f = new q0(0.0f);
    public dne g = new q0(0.0f);
    public dne h = new q0(0.0f);
    public ujn i;
    public ujn j;
    public ujn k;
    public ujn l;

    public akj0() {
        byte b = 0;
        this.i = new ujn(b);
        this.j = new ujn(b);
        this.k = new ujn(b);
        this.l = new ujn(b);
    }

    public static daf g(Context context, int i, int i2) {
        q0 q0Var = new q0(0.0f);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        return i(contextThemeWrapper.obtainStyledAttributes(rpd0.O), q0Var);
    }

    public static daf h(Context context, AttributeSet attributeSet, int i, int i2) {
        q0 q0Var = new q0(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rpd0.G, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return i(contextThemeWrapper.obtainStyledAttributes(rpd0.O), q0Var);
    }

    public static daf i(TypedArray typedArray, dne dneVar) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            dne dneVarJ = j(typedArray, 5, dneVar);
            dne dneVarJ2 = j(typedArray, 8, dneVarJ);
            dne dneVarJ3 = j(typedArray, 9, dneVarJ);
            dne dneVarJ4 = j(typedArray, 7, dneVarJ);
            dne dneVarJ5 = j(typedArray, 6, dneVarJ);
            daf dafVar = new daf();
            dafVar.b = k7x.A(i2);
            dafVar.f = dneVarJ2;
            dafVar.c = k7x.A(i3);
            dafVar.g = dneVarJ3;
            dafVar.d = k7x.A(i4);
            dafVar.h = dneVarJ4;
            dafVar.e = k7x.A(i5);
            dafVar.i = dneVarJ5;
            return dafVar;
        } finally {
            typedArray.recycle();
        }
    }

    public static dne j(TypedArray typedArray, int i, dne dneVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new q0(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new zef0(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dneVar;
    }

    @Override // a.zjj0
    public final akj0 a(float f) {
        daf dafVarL = l();
        dafVarL.R(f);
        return dafVarL.c();
    }

    @Override // a.zjj0
    public final akj0[] c() {
        return new akj0[]{this};
    }

    @Override // a.zjj0
    public final akj0 e(zef0 zef0Var) {
        daf dafVarL = l();
        dafVarL.f = zef0Var;
        dafVarL.g = zef0Var;
        dafVarL.h = zef0Var;
        dafVarL.i = zef0Var;
        return dafVarL.c();
    }

    @Override // a.zjj0
    public final boolean f() {
        return false;
    }

    public final boolean k(RectF rectF) {
        boolean z = this.l.getClass().equals(ujn.class) && this.j.getClass().equals(ujn.class) && this.i.getClass().equals(ujn.class) && this.k.getClass().equals(ujn.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && (this.b instanceof wgg0) && (this.f1025a instanceof wgg0) && (this.c instanceof wgg0) && (this.d instanceof wgg0);
    }

    public final daf l() {
        daf dafVar = new daf(false);
        dafVar.b = this.f1025a;
        dafVar.c = this.b;
        dafVar.d = this.c;
        dafVar.e = this.d;
        dafVar.f = this.e;
        dafVar.g = this.f;
        dafVar.h = this.g;
        dafVar.i = this.h;
        dafVar.j = this.i;
        dafVar.k = this.j;
        dafVar.l = this.k;
        dafVar.m = this.l;
        return dafVar;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }

    @Override // a.zjj0
    public final akj0 d() {
        return this;
    }

    @Override // a.zjj0
    public final akj0 b(int[] iArr) {
        return this;
    }
}
