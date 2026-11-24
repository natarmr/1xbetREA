package org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo;

import a.a8z;
import a.aiu0;
import a.dyb;
import a.eb30;
import a.fb30;
import a.ha30;
import a.maz;
import a.o0t;
import a.r3w;
import a.rgu0;
import a.w23;
import a.wez;
import a.ymx;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class MatchInfoTabsContainerView extends LinearLayout {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47000a;
    public boolean b;
    public final a8z c;
    public final fb30 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public MatchInfoTabsContainerView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.c = maz.a(wez.b, new ha30(this, this, (byte) 1));
        fb30 fb30Var = new fb30(this);
        this.d = fb30Var;
        setOrientation(0);
        setVisibility(8);
        WeakHashMap weakHashMap = rgu0.f30456a;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new w23(this, (byte) 10));
        } else {
            fb30Var.b = getMeasuredHeight();
        }
    }

    private final aiu0 getBinding() {
        Object value = this.c.getValue();
        value.getClass();
        return (aiu0) value;
    }

    public final boolean getBroadcastTabSelected() {
        return getBinding().b.isSelected();
    }

    public final boolean getInfoTabSelected() {
        return getBinding().c.isSelected();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        Bundle bundle = (Bundle) parcelable;
        this.f47000a = bundle.getBoolean("IS_VISIBLE", false);
        this.b = bundle.getBoolean("IS_TRANSLATED", false);
        super.onRestoreInstanceState(bundle.getParcelable("SUPER_STATE"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER_STATE", super.onSaveInstanceState());
        bundle.putBoolean("IS_VISIBLE", this.f47000a);
        bundle.putBoolean("IS_TRANSLATED", this.b);
        return bundle;
    }

    public final void setBroadcastTabSelected(boolean z) {
        getBinding().b.setSelected(z);
        getBinding().c.setSelected(!z);
    }

    public final void setBroadcastingTabClickDebounceListener(Function0<Unit> function0) {
        function0.getClass();
        dyb.b0(getBinding().b, ymx.INTERVAL_400, new r3w(function0, (byte) 7));
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        getBinding().c.setClickable(z);
        getBinding().b.setClickable(z);
        super.setClickable(z);
    }

    public final void setInfoTabClickDebounceListener(Function0<Unit> function0) {
        function0.getClass();
        dyb.b0(getBinding().c, ymx.INTERVAL_400, new r3w(function0, (byte) 8));
    }

    public final void setInfoTabSelected(boolean z) {
        getBinding().c.setSelected(z);
        getBinding().b.setSelected(!z);
    }

    public final void setTabsVisibilityWithAnimation(boolean z) {
        this.f47000a = z;
        fb30 fb30Var = this.d;
        int i = fb30Var.b;
        if (i == -1 || this.b) {
            setVisibility(z ? 0 : 8);
            return;
        }
        if (i != -1) {
            MatchInfoTabsContainerView matchInfoTabsContainerView = fb30Var.f9238a;
            eb30 eb30Var = fb30Var.e;
            eb30Var.cancel();
            if (z && matchInfoTabsContainerView.getHeight() == 0) {
                eb30Var.b = new o0t(0, fb30Var, fb30.class, "showViewByTranslation", "showViewByTranslation()V", 0, (byte) 23);
                eb30Var.start();
            }
            if (z || matchInfoTabsContainerView.getHeight() == 0) {
                return;
            }
            eb30Var.b = new o0t(0, fb30Var, fb30.class, "hideViewByTranslation", "hideViewByTranslation()V", 0, (byte) 24);
            eb30Var.start();
        }
    }

    public final void setTranslatedContainer(boolean z) {
        this.b = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MatchInfoTabsContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MatchInfoTabsContainerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
