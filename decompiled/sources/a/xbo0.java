package a;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.tabs.TabLayoutChips;

/* JADX INFO: loaded from: classes2.dex */
public final class xbo0 implements qbo0 {
    @Override // a.pbo0
    public final void a(tbo0 tbo0Var) {
        View view;
        if (tbo0Var == null || (view = tbo0Var.c) == null) {
            return;
        }
        int i = TabLayoutChips.B1;
        MaterialCardView materialCardView = (MaterialCardView) view.findViewById(R.id.mcv_container);
        TypedValue typedValue = j5d.f15927a;
        Context context = view.getContext();
        context.getClass();
        materialCardView.setCardBackgroundColor(j5d.a(context, R.attr.uikitBackgroundContent, false));
        TextView textView = (TextView) view.findViewById(R.id.text1);
        Context context2 = view.getContext();
        context2.getClass();
        textView.setTextColor(j5d.a(context2, R.attr.uikitTextPrimary, false));
    }

    @Override // a.pbo0
    public final void b(tbo0 tbo0Var) {
        View view;
        if (tbo0Var == null || (view = tbo0Var.c) == null) {
            return;
        }
        int i = TabLayoutChips.B1;
        MaterialCardView materialCardView = (MaterialCardView) view.findViewById(R.id.mcv_container);
        TypedValue typedValue = j5d.f15927a;
        Context context = view.getContext();
        context.getClass();
        materialCardView.setCardBackgroundColor(j5d.a(context, R.attr.uikitPrimary, false));
        TextView textView = (TextView) view.findViewById(R.id.text1);
        Context context2 = view.getContext();
        context2.getClass();
        textView.setTextColor(context2.getColor(R.color.static_white));
    }

    @Override // a.pbo0
    public final void c(tbo0 tbo0Var) {
        View view = tbo0Var.c;
        if (view != null) {
            int i = TabLayoutChips.B1;
            MaterialCardView materialCardView = (MaterialCardView) view.findViewById(R.id.mcv_container);
            TypedValue typedValue = j5d.f15927a;
            Context context = view.getContext();
            context.getClass();
            materialCardView.setCardBackgroundColor(j5d.a(context, R.attr.uikitPrimary, false));
            TextView textView = (TextView) view.findViewById(R.id.text1);
            Context context2 = view.getContext();
            context2.getClass();
            textView.setTextColor(context2.getColor(R.color.static_white));
        }
    }
}
