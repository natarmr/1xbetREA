package com.airbnb.lottie;

import a.ah40;
import a.ayj0;
import a.ba10;
import a.bb10;
import a.ca10;
import a.fa10;
import a.fb10;
import a.gb10;
import a.ha10;
import a.hrd;
import a.ijf0;
import a.ird;
import a.jf4;
import a.jiq0;
import a.jrq;
import a.ka10;
import a.kb10;
import a.khf0;
import a.kki;
import a.kng0;
import a.m04;
import a.m5q0;
import a.nb10;
import a.ob10;
import a.opd0;
import a.qyw;
import a.rw2;
import a.sb10;
import a.td90;
import a.tky;
import a.ub10;
import a.uld;
import a.wa10;
import a.wss;
import a.z910;
import a.zn00;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final z910 q = new z910();
    public final ca10 d;
    public final ca10 e;
    public kb10 f;
    public int g;
    public final bb10 h;
    public String i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final HashSet n;
    public final HashSet o;
    public sb10 p;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f45421a;
        public int b;
        public float c;
        public boolean d;
        public String e;
        public int f;
        public int g;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f45421a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.d = new ca10(this, (byte) 1);
        this.e = new ca10(this, (byte) 0);
        this.g = 0;
        this.h = new bb10();
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = new HashSet();
        this.o = new HashSet();
        g(null, R.attr.lottieAnimationViewStyle);
    }

    private void setCompositionTask(sb10 sb10Var) {
        ob10 ob10Var = sb10Var.d;
        bb10 bb10Var = this.h;
        if (ob10Var != null && bb10Var == getDrawable() && bb10Var.f2286a == ob10Var.f24955a) {
            return;
        }
        this.n.add(ba10.f2236a);
        this.h.d();
        d();
        sb10Var.b(this.d);
        sb10Var.a(this.e);
        this.p = sb10Var;
    }

    public final void a() {
        this.l = false;
        this.n.add(ba10.f);
        bb10 bb10Var = this.h;
        bb10Var.f.clear();
        bb10Var.b.cancel();
        if (bb10Var.isVisible()) {
            return;
        }
        bb10Var.s1 = 1;
    }

    public final void d() {
        sb10 sb10Var = this.p;
        if (sb10Var != null) {
            ca10 ca10Var = this.d;
            synchronized (sb10Var) {
                sb10Var.f31909a.remove(ca10Var);
            }
            sb10 sb10Var2 = this.p;
            ca10 ca10Var2 = this.e;
            synchronized (sb10Var2) {
                sb10Var2.b.remove(ca10Var2);
            }
        }
    }

    public final void g(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, opd0.f25636a, i, 0);
        this.m = typedArrayObtainStyledAttributes.getBoolean(4, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(16);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(11);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(21);
        if (zHasValue && zHasValue2) {
            jf4.o("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            return;
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(16, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(11);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(21)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            this.l = true;
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(14, false);
        bb10 bb10Var = this.h;
        if (z) {
            bb10Var.b.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(19)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(19, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(18, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(20, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(6, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(5, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(8));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(13));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(15);
        float f = typedArrayObtainStyledAttributes.getFloat(15, 0.0f);
        if (zHasValue4) {
            this.n.add(ba10.b);
        }
        bb10Var.v(f);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        HashSet hashSet = (HashSet) bb10Var.l.b;
        fb10 fb10Var = fb10.f9235a;
        boolean zAdd = z2 ? hashSet.add(fb10Var) : hashSet.remove(fb10Var);
        if (bb10Var.f2286a != null && zAdd) {
            bb10Var.c();
        }
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(0, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(1, true));
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            ayj0 ayj0Var = new ayj0(jiq0.n0(typedArrayObtainStyledAttributes.getResourceId(7, -1), getContext()).getDefaultColor(), PorterDuff.Mode.SRC_ATOP);
            tky tkyVar = new tky("**");
            zn00 zn00Var = new zn00();
            zn00Var.f44650a = new gb10();
            zn00Var.b = ayj0Var;
            bb10Var.a(tkyVar, nb10.I, zn00Var);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(17, 0);
            if (i2 >= ijf0.values().length) {
                i2 = 0;
            }
            setRenderMode(ijf0.values()[i2]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int i3 = typedArrayObtainStyledAttributes.getInt(2, 0);
            if (i3 >= ijf0.values().length) {
                i3 = 0;
            }
            setAsyncUpdates(m04.values()[i3]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(12, false));
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(22, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public m04 getAsyncUpdates() {
        m04 m04Var = this.h.m1;
        return m04Var != null ? m04Var : m04.f20935a;
    }

    public boolean getAsyncUpdatesEnabled() {
        m04 m04Var = this.h.m1;
        if (m04Var == null) {
            m04Var = m04.f20935a;
        }
        return m04Var == m04.b;
    }

    public boolean getClipTextToBoundingBox() {
        return this.h.u;
    }

    public boolean getClipToCompositionBounds() {
        return this.h.n;
    }

    public fa10 getComposition() {
        Drawable drawable = getDrawable();
        bb10 bb10Var = this.h;
        if (drawable == bb10Var) {
            return bb10Var.f2286a;
        }
        return null;
    }

    public long getDuration() {
        fa10 composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.h.b.h;
    }

    public String getImageAssetsFolder() {
        return this.h.h;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.h.m;
    }

    public float getMaxFrame() {
        return this.h.b.b();
    }

    public float getMinFrame() {
        return this.h.b.c();
    }

    public td90 getPerformanceTracker() {
        fa10 fa10Var = this.h.f2286a;
        if (fa10Var != null) {
            return fa10Var.f9184a;
        }
        return null;
    }

    public float getProgress() {
        return this.h.b.a();
    }

    public ijf0 getRenderMode() {
        return this.h.w ? ijf0.c : ijf0.b;
    }

    public int getRepeatCount() {
        return this.h.b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.h.b.getRepeatMode();
    }

    public float getSpeed() {
        return this.h.b.d;
    }

    public final void h() {
        this.n.add(ba10.f);
        this.h.l();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof bb10) {
            boolean z = ((bb10) drawable).w;
            ijf0 ijf0Var = ijf0.c;
            if ((z ? ijf0Var : ijf0.b) == ijf0Var) {
                this.h.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        bb10 bb10Var = this.h;
        if (drawable2 == bb10Var) {
            super.invalidateDrawable(bb10Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.l) {
            return;
        }
        this.h.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.i = savedState.f45421a;
        HashSet hashSet = this.n;
        ba10 ba10Var = ba10.f2236a;
        if (!hashSet.contains(ba10Var) && !TextUtils.isEmpty(this.i)) {
            setAnimation(this.i);
        }
        this.j = savedState.b;
        if (!hashSet.contains(ba10Var) && (i = this.j) != 0) {
            setAnimation(i);
        }
        if (!hashSet.contains(ba10.b)) {
            this.h.v(savedState.c);
        }
        if (!hashSet.contains(ba10.f) && savedState.d) {
            h();
        }
        if (!hashSet.contains(ba10.e)) {
            setImageAssetsFolder(savedState.e);
        }
        if (!hashSet.contains(ba10.c)) {
            setRepeatMode(savedState.f);
        }
        if (hashSet.contains(ba10.d)) {
            return;
        }
        setRepeatCount(savedState.g);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f45421a = this.i;
        savedState.b = this.j;
        bb10 bb10Var = this.h;
        ub10 ub10Var = bb10Var.b;
        ub10 ub10Var2 = bb10Var.b;
        savedState.c = ub10Var.a();
        if (bb10Var.isVisible()) {
            z = ub10Var2.m;
        } else {
            int i = bb10Var.s1;
            z = i == 2 || i == 3;
        }
        savedState.d = z;
        savedState.e = bb10Var.h;
        savedState.f = ub10Var2.getRepeatMode();
        savedState.g = ub10Var2.getRepeatCount();
        return savedState;
    }

    public void setAnimation(String str) {
        sb10 sb10VarA;
        this.i = str;
        this.j = 0;
        byte b = 1;
        if (isInEditMode()) {
            sb10VarA = new sb10(new ird(this, str, (byte) 2), true);
        } else {
            String str2 = null;
            if (this.m) {
                Context context = getContext();
                HashMap map = ka10.f17941a;
                String strK = kng0.k("asset_", str);
                sb10VarA = ka10.a(strK, new ha10(context.getApplicationContext(), str, strK, b), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = ka10.f17941a;
                sb10VarA = ka10.a(null, new ha10(context2.getApplicationContext(), str, str2, b), null);
            }
        }
        setCompositionTask(sb10VarA);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(ka10.a(null, new hrd(byteArrayInputStream, (byte) 4), new wss(byteArrayInputStream, (byte) 6)));
    }

    public void setAnimationFromUrl(String str) {
        sb10 sb10VarA;
        byte b = 0;
        String str2 = null;
        if (this.m) {
            Context context = getContext();
            HashMap map = ka10.f17941a;
            String strK = kng0.k("url_", str);
            sb10VarA = ka10.a(strK, new ha10(context, str, strK, b), null);
        } else {
            sb10VarA = ka10.a(null, new ha10(getContext(), str, str2, b), null);
        }
        setCompositionTask(sb10VarA);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.h.s = z;
    }

    public void setApplyingShadowToLayersEnabled(boolean z) {
        this.h.t = z;
    }

    public void setAsyncUpdates(m04 m04Var) {
        this.h.m1 = m04Var;
    }

    public void setCacheComposition(boolean z) {
        this.m = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        bb10 bb10Var = this.h;
        if (z != bb10Var.u) {
            bb10Var.u = z;
            bb10Var.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        bb10 bb10Var = this.h;
        if (z != bb10Var.n) {
            bb10Var.n = z;
            uld uldVar = bb10Var.o;
            if (uldVar != null) {
                uldVar.L = z;
            }
            bb10Var.invalidateSelf();
        }
    }

    public void setComposition(fa10 fa10Var) {
        bb10 bb10Var = this.h;
        bb10Var.setCallback(this);
        this.k = true;
        boolean zO = bb10Var.o(fa10Var);
        if (this.l) {
            bb10Var.l();
        }
        this.k = false;
        if (getDrawable() != bb10Var || zO) {
            if (!zO) {
                boolean zI = bb10Var.i();
                setImageDrawable(null);
                setImageDrawable(bb10Var);
                if (zI) {
                    bb10Var.n();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.o.iterator();
            if (it.hasNext()) {
                throw rw2.h(it);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        kki kkiVar;
        bb10 bb10Var = this.h;
        bb10Var.k = str;
        if (bb10Var.getCallback() == null) {
            kkiVar = null;
        } else {
            kki kkiVar2 = bb10Var.i;
            if (kkiVar2 == null) {
                kkiVar2 = new kki(bb10Var.getCallback());
                bb10Var.i = kkiVar2;
                String str2 = bb10Var.k;
                if (str2 != null) {
                    kkiVar2.f = str2;
                }
            }
            kkiVar = kkiVar2;
        }
        if (kkiVar != null) {
            kkiVar.f = str;
        }
    }

    public void setFailureListener(kb10 kb10Var) {
        this.f = kb10Var;
    }

    public void setFallbackResource(int i) {
        this.g = i;
    }

    public void setFontAssetDelegate(jrq jrqVar) {
        kki kkiVar = this.h.i;
    }

    public void setFontMap(Map<String, Typeface> map) {
        bb10 bb10Var = this.h;
        if (map == bb10Var.j) {
            return;
        }
        bb10Var.j = map;
        bb10Var.invalidateSelf();
    }

    public void setFrame(int i) {
        this.h.p(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.h.d = z;
    }

    public void setImageAssetDelegate(qyw qywVar) {
        khf0 khf0Var = this.h.g;
    }

    public void setImageAssetsFolder(String str) {
        this.h.h = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.j = 0;
        this.i = null;
        d();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.j = 0;
        this.i = null;
        d();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.j = 0;
        this.i = null;
        d();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.h.m = z;
    }

    public void setMaxFrame(int i) {
        this.h.q(i);
    }

    public void setMaxProgress(float f) {
        bb10 bb10Var = this.h;
        fa10 fa10Var = bb10Var.f2286a;
        if (fa10Var == null) {
            bb10Var.f.add(new wa10(bb10Var, f, (byte) 0));
            return;
        }
        ub10 ub10Var = bb10Var.b;
        ub10Var.i(ub10Var.j, ah40.f(fa10Var.l, fa10Var.m, f));
    }

    public void setMinAndMaxFrame(String str) {
        this.h.s(str);
    }

    public void setMinFrame(int i) {
        this.h.t(i);
    }

    public void setMinProgress(float f) {
        bb10 bb10Var = this.h;
        fa10 fa10Var = bb10Var.f2286a;
        if (fa10Var == null) {
            bb10Var.f.add(new wa10(bb10Var, f, (byte) 1));
        } else {
            bb10Var.t((int) ah40.f(fa10Var.l, fa10Var.m, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        bb10 bb10Var = this.h;
        if (bb10Var.r == z) {
            return;
        }
        bb10Var.r = z;
        uld uldVar = bb10Var.o;
        if (uldVar != null) {
            uldVar.q(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        bb10 bb10Var = this.h;
        bb10Var.q = z;
        fa10 fa10Var = bb10Var.f2286a;
        if (fa10Var != null) {
            fa10Var.f9184a.f33757a = z;
        }
    }

    public void setProgress(float f) {
        this.n.add(ba10.b);
        this.h.v(f);
    }

    public void setRenderMode(ijf0 ijf0Var) {
        bb10 bb10Var = this.h;
        bb10Var.v = ijf0Var;
        bb10Var.e();
    }

    public void setRepeatCount(int i) {
        this.n.add(ba10.d);
        this.h.b.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.n.add(ba10.c);
        this.h.b.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.h.e = z;
    }

    public void setSpeed(float f) {
        this.h.b.d = f;
    }

    public void setTextDelegate(m5q0 m5q0Var) {
        this.h.getClass();
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.h.b.n = z;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        bb10 bb10Var;
        if (!this.k && drawable == (bb10Var = this.h) && bb10Var.i()) {
            this.l = false;
            bb10Var.k();
        } else if (!this.k && (drawable instanceof bb10)) {
            bb10 bb10Var2 = (bb10) drawable;
            if (bb10Var2.i()) {
                bb10Var2.k();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.h.r(str);
    }

    public void setMinFrame(String str) {
        this.h.u(str);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new ca10(this, (byte) 1);
        this.e = new ca10(this, (byte) 0);
        this.g = 0;
        this.h = new bb10();
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = new HashSet();
        this.o = new HashSet();
        g(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.d = new ca10(this, (byte) 1);
        this.e = new ca10(this, (byte) 0);
        this.g = 0;
        this.h = new bb10();
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = new HashSet();
        this.o = new HashSet();
        g(attributeSet, 0);
    }

    public void setAnimation(final int i) {
        sb10 sb10VarF;
        this.j = i;
        this.i = null;
        if (isInEditMode()) {
            sb10VarF = new sb10(new Callable() { // from class: a.aa10
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    z910 z910Var = LottieAnimationView.q;
                    LottieAnimationView lottieAnimationView = this.f502a;
                    boolean z = lottieAnimationView.m;
                    int i2 = i;
                    if (!z) {
                        return ka10.g(lottieAnimationView.getContext(), i2, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return ka10.g(context, i2, ka10.l(i2, context));
                }
            }, true);
        } else if (this.m) {
            Context context = getContext();
            sb10VarF = ka10.f(context, i, ka10.l(i, context));
        } else {
            sb10VarF = ka10.f(getContext(), i, null);
        }
        setCompositionTask(sb10VarF);
    }
}
