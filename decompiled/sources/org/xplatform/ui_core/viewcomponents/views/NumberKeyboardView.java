package org.xplatform.ui_core.viewcomponents.views;

import a.a8z;
import a.bs50;
import a.ha30;
import a.maz;
import a.q3d;
import a.r3d;
import a.w860;
import a.wez;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.ui_core.viewcomponents.views.NumberKeyboardView;

/* JADX INFO: loaded from: classes6.dex */
public final class NumberKeyboardView extends LinearLayout {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f47210a;
    public Function1 b;
    public Function1 c;
    public Function1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f47210a = maz.a(wez.b, new ha30(this, this, (byte) 11));
        FrameLayout frameLayout = getBinding().d;
        if (4 != frameLayout.getVisibility()) {
            frameLayout.setVisibility(4);
        }
    }

    private final w860 getBinding() {
        return (w860) this.f47210a.getValue();
    }

    public final void a(boolean z) {
        FrameLayout frameLayout = getBinding().d;
        int i = !z ? 4 : 0;
        if (i != frameLayout.getVisibility()) {
            frameLayout.setVisibility(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final byte b = 0;
        getBinding().d.setOnClickListener(new View.OnClickListener(this) { // from class: a.v860
            public final /* synthetic */ NumberKeyboardView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                NumberKeyboardView numberKeyboardView = this.b;
                switch (b2) {
                    case 0:
                        Function1 function1 = numberKeyboardView.c;
                        if (function1 != null) {
                            view.getClass();
                            function1.invoke(view);
                        }
                        break;
                    default:
                        int i = NumberKeyboardView.e;
                        Context context = numberKeyboardView.getContext();
                        context.getClass();
                        new nvu(context).Z();
                        Function1 function2 = numberKeyboardView.d;
                        if (function2 != null) {
                            view.getClass();
                            function2.invoke(view);
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        getBinding().c.setOnClickListener(new View.OnClickListener(this) { // from class: a.v860
            public final /* synthetic */ NumberKeyboardView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                NumberKeyboardView numberKeyboardView = this.b;
                switch (b3) {
                    case 0:
                        Function1 function1 = numberKeyboardView.c;
                        if (function1 != null) {
                            view.getClass();
                            function1.invoke(view);
                        }
                        break;
                    default:
                        int i = NumberKeyboardView.e;
                        Context context = numberKeyboardView.getContext();
                        context.getClass();
                        new nvu(context).Z();
                        Function1 function2 = numberKeyboardView.d;
                        if (function2 != null) {
                            view.getClass();
                            function2.invoke(view);
                        }
                        break;
                }
            }
        });
        List<NumberItemView> listJ = q3d.j(getBinding().h, getBinding().l, getBinding().k, getBinding().f, getBinding().e, getBinding().j, getBinding().i, getBinding().b, getBinding().g, getBinding().m);
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        for (NumberItemView numberItemView : listJ) {
            numberItemView.setOnClickListener(new bs50((Object) this, (Object) numberItemView, (byte) 2));
            arrayList.add(Unit.f46060a);
        }
    }

    public final void setEraseClickListener(Function1<? super View, Unit> function1) {
        function1.getClass();
        this.d = function1;
    }

    public final void setFingerprintClickListener(Function1<? super View, Unit> function1) {
        function1.getClass();
        this.c = function1;
    }

    public final void setNumberClickListener(Function1<? super View, Unit> function1) {
        function1.getClass();
        this.b = function1;
    }
}
