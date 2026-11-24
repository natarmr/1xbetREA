package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class f5s0 extends w5 {
    public final auh u;

    public f5s0(auh auhVar) {
        super(auhVar.b);
        this.u = auhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5s0) && this.u == ((f5s0) obj).u;
    }

    public final int hashCode() {
        return this.u.hashCode();
    }

    @Override // a.xhe0
    public final String toString() {
        return "TournamentRowHeaderFooterViewHolder(binding=" + this.u + Separators.RPAREN;
    }

    public final void v(int i) {
        FrameLayout frameLayout = this.u.b;
        Context context = frameLayout.getContext();
        context.getClass();
        u(m5d.b(R.attr.uikitBackgroundGroupSecondary, context));
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = -1;
        layoutParams.height = i;
        frameLayout.setLayoutParams(layoutParams);
    }
}
