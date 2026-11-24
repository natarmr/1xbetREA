package a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class zao extends ConstraintLayout {
    public final vd7 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zao(Context context) {
        super(context, null);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.event_card_indicator, this);
        int i = R.id.botIndicator;
        View viewF = yum0.f(this, R.id.botIndicator);
        if (viewF != null) {
            i = R.id.guideline;
            if (((Guideline) yum0.f(this, R.id.guideline)) != null) {
                i = R.id.topIndicator;
                View viewF2 = yum0.f(this, R.id.topIndicator);
                if (viewF2 != null) {
                    this.q = new vd7(this, viewF, viewF2, (byte) 10);
                    return;
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void setBotIndication(xao xaoVar) {
        this.q.c.setBackground(getContext().getDrawable(xaoVar != null ? xaoVar.f40567a : android.R.color.transparent));
    }

    public final void setIndication(xao xaoVar) {
        setTopIndication(xaoVar);
        setBotIndication(xaoVar);
    }

    public final void setTopIndication(xao xaoVar) {
        this.q.d.setBackground(getContext().getDrawable(xaoVar != null ? xaoVar.f40567a : android.R.color.transparent));
    }

    public final void u(boolean z) {
        vd7 vd7Var = this.q;
        if (z) {
            View view = vd7Var.d;
            view.setClipToOutline(true);
            view.setOutlineProvider(new yao(view, true, (byte) 0));
            View view2 = vd7Var.c;
            view2.setClipToOutline(true);
            view2.setOutlineProvider(new yao(view2, false, (byte) 0));
            return;
        }
        View view3 = vd7Var.d;
        view3.setClipToOutline(true);
        view3.setOutlineProvider(new yao(view3, true, (byte) 1));
        View view4 = vd7Var.c;
        view4.setClipToOutline(true);
        view4.setOutlineProvider(new yao(view4, false, (byte) 1));
    }
}
