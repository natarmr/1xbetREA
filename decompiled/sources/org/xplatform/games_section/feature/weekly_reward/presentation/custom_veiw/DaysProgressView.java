package org.xplatform.games_section.feature.weekly_reward.presentation.custom_veiw;

import a.i120;
import a.nva;
import a.q3d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class DaysProgressView extends LinearLayout {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46731a;

    /* JADX WARN: Illegal instructions before constructor call */
    public DaysProgressView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46731a = new ArrayList();
        setOrientation(0);
        setHorizontalGravity(17);
        setGravity(17);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (layoutParams == null ? new LinearLayout.LayoutParams(context, attributeSet) : layoutParams);
        marginLayoutParams.height = i120.Y(context, 11.0f);
        marginLayoutParams.width = i120.Y(context, 26.0f);
        marginLayoutParams.setMargins(i120.Y(context, 10.0f), 0, i120.Y(context, 10.0f), 0);
        for (int i2 = 0; i2 < 7; i2++) {
            View view = new View(context);
            view.setLayoutParams(marginLayoutParams);
            view.setBackgroundResource(R.drawable.completed_day_selector);
            this.f46731a.add(view);
            addView(view);
        }
    }

    public final void setOnItemClickListener(Function1<? super Integer, Unit> function1) {
        function1.getClass();
        int i = 0;
        for (Object obj : this.f46731a) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ((View) obj).setOnClickListener(new nva(function1, i, (byte) 2));
            i = i2;
        }
    }

    public final void setSelectedDay(int i) {
        int i2 = 0;
        while (i2 < 7) {
            ((View) this.f46731a.get(i2)).setSelected(i2 == i);
            i2++;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DaysProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DaysProgressView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
