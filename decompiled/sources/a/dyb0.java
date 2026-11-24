package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class dyb0 extends yge0 {
    public final pf10 d;
    public final ArrayList e = new ArrayList();

    public dyb0(pf10 pf10Var) {
        this.d = pf10Var;
    }

    @Override // a.yge0
    public final int d() {
        return this.e.size();
    }

    @Override // a.yge0
    public final int f(int i) {
        vxb0 vxb0Var = (vxb0) this.e.get(i);
        if (vxb0Var != null) {
            if (vxb0Var instanceof uxb0) {
                return 1;
            }
            if (vxb0Var instanceof txb0) {
                return 2;
            }
        }
        t9f.b();
        return 0;
    }

    @Override // a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        cyb0 cyb0Var = (cyb0) xhe0Var;
        vxb0 vxb0Var = (vxb0) this.e.get(i);
        switch (cyb0Var.v) {
            case 0:
                ttx ttxVar = (ttx) cyb0Var.w;
                vxb0Var.getClass();
                txb0 txb0Var = vxb0Var instanceof txb0 ? (txb0) vxb0Var : null;
                if (txb0Var != null) {
                    ttxVar.d.setImageResource(txb0Var.f34689a);
                    ttxVar.e.setText(txb0Var.b);
                    ttxVar.c.setVisibility(txb0Var.d ? 0 : 8);
                    ttxVar.f.setText(String.valueOf(txb0Var.c));
                    break;
                }
                break;
            default:
                vxb0Var.getClass();
                uxb0 uxb0Var = vxb0Var instanceof uxb0 ? (uxb0) vxb0Var : null;
                if (uxb0Var != null) {
                    ((dtx) cyb0Var.w).c.setText(uxb0Var.f36433a);
                    break;
                }
                break;
        }
    }

    @Override // a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_list_title, viewGroup, false);
            if (viewInflate != null) {
                TextView textView = (TextView) viewInflate;
                return new cyb0(new dtx(textView, textView, (byte) 1));
            }
            hny.u("rootView");
            return null;
        }
        if (i != 2) {
            jf4.o(twn.m(i, "Unknown prize list element with itemType="));
            return null;
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.item_list_prize, viewGroup, false);
        int i2 = R.id.imvArrow;
        ImageView imageView = (ImageView) yum0.f(viewInflate2, R.id.imvArrow);
        if (imageView != null) {
            i2 = R.id.imvBonusIcon;
            ImageView imageView2 = (ImageView) yum0.f(viewInflate2, R.id.imvBonusIcon);
            if (imageView2 != null) {
                i2 = R.id.tvBonusDescription;
                TextView textView2 = (TextView) yum0.f(viewInflate2, R.id.tvBonusDescription);
                if (textView2 != null) {
                    i2 = R.id.tvCount;
                    TextView textView3 = (TextView) yum0.f(viewInflate2, R.id.tvCount);
                    if (textView3 != null) {
                        return new cyb0(this, new ttx((ConstraintLayout) viewInflate2, imageView, imageView2, textView2, textView3, (byte) 2));
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
        return null;
    }
}
