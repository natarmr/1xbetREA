package org.xplatform.spin_and_win.presentation.views;

import a.a8z;
import a.ay5;
import a.bs50;
import a.ejk0;
import a.maz;
import a.mic;
import a.q3d;
import a.sue0;
import a.wez;
import a.yxk0;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class SpinAndWinChoiceView extends ay5 {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f46982a;
    public Function1 b;
    public final ArrayList c;

    /* JADX WARN: Illegal instructions before constructor call */
    public SpinAndWinChoiceView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet);
        this.f46982a = maz.a(wez.b, new sue0(this, this, (byte) 22));
        this.b = new ejk0((byte) 9);
        this.c = new ArrayList();
    }

    private final mic getViewBinding() {
        Object value = this.f46982a.getValue();
        value.getClass();
        return (mic) value;
    }

    @Override // a.ay5
    public final void a() {
        mic viewBinding = getViewBinding();
        this.c.addAll(q3d.j(viewBinding.e, viewBinding.g, viewBinding.c, viewBinding.f, viewBinding.d, viewBinding.h));
    }

    public final void b(int i, int i2, int i3) {
        float dimension = getResources().getDimension(R.dimen.spin_and_win_btn_height);
        float dimension2 = getResources().getDimension(R.dimen.space_2) * 6.0f;
        float dimension3 = getResources().getDimension(R.dimen.space_8) * 2.0f;
        int i4 = i2 - i;
        float f = (dimension * 6.0f) + dimension2 + dimension3;
        float f2 = i4;
        boolean z = f2 < f;
        float f3 = (f2 - dimension2) - dimension3;
        boolean z2 = f2 > f - dimension;
        ArrayList<SpinAndWinButton> arrayList = this.c;
        if (!z || z2) {
            getViewBinding().b.setColumnCount(1);
            int i5 = (int) (f3 / 6.0f);
            int i6 = i5 * 2;
            for (SpinAndWinButton spinAndWinButton : arrayList) {
                spinAndWinButton.getLayoutParams().width = i6;
                spinAndWinButton.getLayoutParams().height = i5;
            }
            c();
            return;
        }
        getViewBinding().b.setColumnCount(2);
        if (getResources().getDimension(R.dimen.spin_and_win_btn_width) * 2.0f > i3) {
            int i7 = i3 / 2;
            int i8 = i7 / 2;
            for (SpinAndWinButton spinAndWinButton2 : arrayList) {
                spinAndWinButton2.getLayoutParams().width = i7;
                spinAndWinButton2.getLayoutParams().height = i8;
            }
        }
        c();
    }

    public final void c() {
        mic viewBinding = getViewBinding();
        viewBinding.e.e(R.drawable.ic_spin_and_win_blue_btn, R.drawable.ic_spin_and_win_blue_btn_up, yxk0.f43427a);
        viewBinding.g.e(R.drawable.ic_spin_and_win_yellow_btn, R.drawable.ic_spin_and_win_yellow_btn_up, yxk0.c);
        viewBinding.c.e(R.drawable.ic_spin_and_win_pink_btn, R.drawable.ic_spin_and_win_pink_up_btn, yxk0.e);
        viewBinding.f.e(R.drawable.ic_spin_and_win_violet_btn, R.drawable.ic_spin_and_win_violet_up_btn, yxk0.b);
        viewBinding.d.e(R.drawable.ic_spin_and_win_green_btn, R.drawable.ic_spin_and_win_green_btn_up, yxk0.f);
        viewBinding.h.e(R.drawable.ic_spin_and_win_lime_btn, R.drawable.ic_spin_and_win_lime_btn_up, yxk0.d);
        for (SpinAndWinButton spinAndWinButton : this.c) {
            spinAndWinButton.setOnClickListener(new bs50((Object) this, (Object) spinAndWinButton, (byte) 10));
        }
    }

    @Override // a.ay5
    public int getLayoutView() {
        return R.layout.choose_view_spin_and_win;
    }

    public final void setOnButtonClickListener$spin_and_win(Function1<? super yxk0, Unit> function1) {
        function1.getClass();
        this.b = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpinAndWinChoiceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpinAndWinChoiceView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
