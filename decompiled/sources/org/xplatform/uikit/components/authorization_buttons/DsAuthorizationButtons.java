package org.xplatform.uikit.components.authorization_buttons;

import a.bqd0;
import a.hny;
import a.ktt0;
import a.yum0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes5.dex */
public final class DsAuthorizationButtons extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47225a;
    public final DsButton b;
    public final DsButton c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsAuthorizationButtons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f47225a = getResources().getDimensionPixelSize(R.dimen.space_8);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.authorization_buttons_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.authorizationButton;
        DsButton dsButton = (DsButton) yum0.f(viewInflate, R.id.authorizationButton);
        if (dsButton != null) {
            i = R.id.registrationButton;
            DsButton dsButton2 = (DsButton) yum0.f(viewInflate, R.id.registrationButton);
            if (dsButton2 != null) {
                this.b = dsButton;
                this.c = dsButton2;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.e, 0, 0);
                String strP = ktt0.p(typedArrayObtainStyledAttributes, context, 0);
                dsButton.l(strP == null ? "" : strP);
                String strP2 = ktt0.p(typedArrayObtainStyledAttributes, context, 1);
                dsButton2.l(strP2 != null ? strP2 : "");
                typedArrayObtainStyledAttributes.recycle();
                dsButton.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 8388611));
                dsButton2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 8388613));
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final DsButton getAuthorizationButton() {
        return this.b;
    }

    public final DsButton getRegistrationButton() {
        return this.c;
    }

    public final int getSpace() {
        return this.f47225a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = (((View.MeasureSpec.getSize(i) - this.f47225a) - getPaddingRight()) - getPaddingLeft()) / 2;
        this.b.getLayoutParams().width = size;
        this.c.getLayoutParams().width = size;
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsAuthorizationButtons(Context context) {
        this(context, null);
        context.getClass();
    }
}
