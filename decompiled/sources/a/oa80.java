package a;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class oa80 extends pa80 {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa80(androidx.recyclerview.widget.b bVar, byte b) {
        super(bVar);
        this.d = b;
    }

    @Override // a.pa80
    public final int d(View view) {
        int iQ;
        int i;
        byte b = this.d;
        Object obj = this.b;
        switch (b) {
            case 0:
                hhe0 hhe0Var = (hhe0) view.getLayoutParams();
                ((androidx.recyclerview.widget.b) obj).getClass();
                iQ = androidx.recyclerview.widget.b.Q(view);
                i = ((ViewGroup.MarginLayoutParams) hhe0Var).rightMargin;
                break;
            default:
                hhe0 hhe0Var2 = (hhe0) view.getLayoutParams();
                ((androidx.recyclerview.widget.b) obj).getClass();
                iQ = androidx.recyclerview.widget.b.L(view);
                i = ((ViewGroup.MarginLayoutParams) hhe0Var2).bottomMargin;
                break;
        }
        return iQ + i;
    }

    @Override // a.pa80
    public final int e(View view) {
        int iP;
        int i;
        byte b = this.d;
        Object obj = this.b;
        switch (b) {
            case 0:
                hhe0 hhe0Var = (hhe0) view.getLayoutParams();
                ((androidx.recyclerview.widget.b) obj).getClass();
                iP = androidx.recyclerview.widget.b.P(view) + ((ViewGroup.MarginLayoutParams) hhe0Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) hhe0Var).rightMargin;
                break;
            default:
                hhe0 hhe0Var2 = (hhe0) view.getLayoutParams();
                ((androidx.recyclerview.widget.b) obj).getClass();
                iP = androidx.recyclerview.widget.b.O(view) + ((ViewGroup.MarginLayoutParams) hhe0Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) hhe0Var2).bottomMargin;
                break;
        }
        return iP + i;
    }

    @Override // a.pa80
    public final int f(View view) {
        int iO;
        int i;
        byte b = this.d;
        Object obj = this.b;
        switch (b) {
            case 0:
                hhe0 hhe0Var = (hhe0) view.getLayoutParams();
                ((androidx.recyclerview.widget.b) obj).getClass();
                iO = androidx.recyclerview.widget.b.O(view) + ((ViewGroup.MarginLayoutParams) hhe0Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) hhe0Var).bottomMargin;
                break;
            default:
                hhe0 hhe0Var2 = (hhe0) view.getLayoutParams();
                ((androidx.recyclerview.widget.b) obj).getClass();
                iO = androidx.recyclerview.widget.b.P(view) + ((ViewGroup.MarginLayoutParams) hhe0Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) hhe0Var2).rightMargin;
                break;
        }
        return iO + i;
    }

    @Override // a.pa80
    public final int g(View view) {
        int iN;
        int i;
        byte b = this.d;
        Object obj = this.b;
        switch (b) {
            case 0:
                hhe0 hhe0Var = (hhe0) view.getLayoutParams();
                ((androidx.recyclerview.widget.b) obj).getClass();
                iN = androidx.recyclerview.widget.b.N(view);
                i = ((ViewGroup.MarginLayoutParams) hhe0Var).leftMargin;
                break;
            default:
                hhe0 hhe0Var2 = (hhe0) view.getLayoutParams();
                ((androidx.recyclerview.widget.b) obj).getClass();
                iN = androidx.recyclerview.widget.b.R(view);
                i = ((ViewGroup.MarginLayoutParams) hhe0Var2).topMargin;
                break;
        }
        return iN - i;
    }

    @Override // a.pa80
    public final int h() {
        switch (this.d) {
            case 0:
                return ((androidx.recyclerview.widget.b) this.b).n;
            default:
                return ((androidx.recyclerview.widget.b) this.b).o;
        }
    }

    @Override // a.pa80
    public final int i() {
        int i;
        int paddingRight;
        byte b = this.d;
        Object obj = this.b;
        switch (b) {
            case 0:
                androidx.recyclerview.widget.b bVar = (androidx.recyclerview.widget.b) obj;
                i = bVar.n;
                paddingRight = bVar.getPaddingRight();
                break;
            default:
                androidx.recyclerview.widget.b bVar2 = (androidx.recyclerview.widget.b) obj;
                i = bVar2.o;
                paddingRight = bVar2.getPaddingBottom();
                break;
        }
        return i - paddingRight;
    }

    @Override // a.pa80
    public final int j() {
        switch (this.d) {
            case 0:
                return ((androidx.recyclerview.widget.b) this.b).getPaddingRight();
            default:
                return ((androidx.recyclerview.widget.b) this.b).getPaddingBottom();
        }
    }

    @Override // a.pa80
    public final int k() {
        switch (this.d) {
            case 0:
                return ((androidx.recyclerview.widget.b) this.b).l;
            default:
                return ((androidx.recyclerview.widget.b) this.b).m;
        }
    }

    @Override // a.pa80
    public final int l() {
        switch (this.d) {
            case 0:
                return ((androidx.recyclerview.widget.b) this.b).m;
            default:
                return ((androidx.recyclerview.widget.b) this.b).l;
        }
    }

    @Override // a.pa80
    public final int m() {
        switch (this.d) {
            case 0:
                return ((androidx.recyclerview.widget.b) this.b).getPaddingLeft();
            default:
                return ((androidx.recyclerview.widget.b) this.b).getPaddingTop();
        }
    }

    @Override // a.pa80
    public final int n() {
        int paddingLeft;
        int paddingRight;
        byte b = this.d;
        Object obj = this.b;
        switch (b) {
            case 0:
                androidx.recyclerview.widget.b bVar = (androidx.recyclerview.widget.b) obj;
                paddingLeft = bVar.n - bVar.getPaddingLeft();
                paddingRight = bVar.getPaddingRight();
                break;
            default:
                androidx.recyclerview.widget.b bVar2 = (androidx.recyclerview.widget.b) obj;
                paddingLeft = bVar2.o - bVar2.getPaddingTop();
                paddingRight = bVar2.getPaddingBottom();
                break;
        }
        return paddingLeft - paddingRight;
    }

    @Override // a.pa80
    public final int p(View view) {
        byte b = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Rect rect = (Rect) obj;
                ((androidx.recyclerview.widget.b) obj2).W(rect, view);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((androidx.recyclerview.widget.b) obj2).W(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // a.pa80
    public final int q(View view) {
        byte b = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Rect rect = (Rect) obj;
                ((androidx.recyclerview.widget.b) obj2).W(rect, view);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((androidx.recyclerview.widget.b) obj2).W(rect2, view);
                return rect2.top;
        }
    }

    @Override // a.pa80
    public final void r(int i) {
        switch (this.d) {
            case 0:
                ((androidx.recyclerview.widget.b) this.b).c0(i);
                break;
            default:
                ((androidx.recyclerview.widget.b) this.b).d0(i);
                break;
        }
    }
}
