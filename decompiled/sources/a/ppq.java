package a;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ppq extends lm40 implements bqq, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View o;
    public ViewTreeObserver p;
    public final opq q;
    public final opq r;

    /* JADX WARN: Type inference failed for: r0v0, types: [a.opq] */
    /* JADX WARN: Type inference failed for: r0v1, types: [a.opq] */
    public ppq() {
        final byte b = 0;
        this.q = new Function1(this) { // from class: a.opq
            public final /* synthetic */ ppq b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                ppq ppqVar = this.b;
                d5a d5aVar = (d5a) obj;
                switch (b2) {
                    case 0:
                        View viewW = dyb.W(ppqVar);
                        if (!viewW.isFocused() && !viewW.hasFocus()) {
                            if (!spq.b(viewW, spq.c(d5aVar.f5496a), dyb.T(vcc.a0(ppqVar).getFocusOwner(), tdc.Z(ppqVar), viewW))) {
                                d5aVar.b = true;
                            }
                        }
                        return Unit.f46060a;
                    default:
                        View viewW2 = dyb.W(ppqVar);
                        if (!ebc.f7512a && viewW2.hasFocus()) {
                            wpq focusOwner = vcc.a0(ppqVar).getFocusOwner();
                            View viewZ = tdc.Z(ppqVar);
                            if (viewW2 instanceof ViewGroup) {
                                Rect rectT = dyb.T(focusOwner, viewZ, viewW2);
                                Integer numC = spq.c(d5aVar.f5496a);
                                int iIntValue = numC != null ? numC.intValue() : 130;
                                FocusFinder focusFinder = FocusFinder.getInstance();
                                View view = ppqVar.o;
                                View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewZ, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewZ, rectT, iIntValue);
                                if (viewFindNextFocus != null && dyb.M(viewW2, viewFindNextFocus)) {
                                    viewFindNextFocus.requestFocus(iIntValue, rectT);
                                    d5aVar.b = true;
                                } else if (!viewZ.requestFocus()) {
                                    jf4.n("host view did not take focus");
                                    return null;
                                }
                            } else if (!viewZ.requestFocus()) {
                                jf4.n("host view did not take focus");
                                return null;
                            }
                        }
                        return Unit.f46060a;
                }
            }
        };
        final byte b2 = 1;
        this.r = new Function1(this) { // from class: a.opq
            public final /* synthetic */ ppq b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                ppq ppqVar = this.b;
                d5a d5aVar = (d5a) obj;
                switch (b3) {
                    case 0:
                        View viewW = dyb.W(ppqVar);
                        if (!viewW.isFocused() && !viewW.hasFocus()) {
                            if (!spq.b(viewW, spq.c(d5aVar.f5496a), dyb.T(vcc.a0(ppqVar).getFocusOwner(), tdc.Z(ppqVar), viewW))) {
                                d5aVar.b = true;
                            }
                        }
                        return Unit.f46060a;
                    default:
                        View viewW2 = dyb.W(ppqVar);
                        if (!ebc.f7512a && viewW2.hasFocus()) {
                            wpq focusOwner = vcc.a0(ppqVar).getFocusOwner();
                            View viewZ = tdc.Z(ppqVar);
                            if (viewW2 instanceof ViewGroup) {
                                Rect rectT = dyb.T(focusOwner, viewZ, viewW2);
                                Integer numC = spq.c(d5aVar.f5496a);
                                int iIntValue = numC != null ? numC.intValue() : 130;
                                FocusFinder focusFinder = FocusFinder.getInstance();
                                View view = ppqVar.o;
                                View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewZ, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewZ, rectT, iIntValue);
                                if (viewFindNextFocus != null && dyb.M(viewW2, viewFindNextFocus)) {
                                    viewFindNextFocus.requestFocus(iIntValue, rectT);
                                    d5aVar.b = true;
                                } else if (!viewZ.requestFocus()) {
                                    jf4.n("host view did not take focus");
                                    return null;
                                }
                            } else if (!viewZ.requestFocus()) {
                                jf4.n("host view did not take focus");
                                return null;
                            }
                        }
                        return Unit.f46060a;
                }
            }
        };
    }

    @Override // a.lm40
    public final void R0() {
        ViewTreeObserver viewTreeObserver = tdc.Z(this).getViewTreeObserver();
        this.p = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // a.lm40
    public final void S0() {
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.p = null;
        tdc.Z(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.o = null;
    }

    public final nqq Z0() {
        boolean z;
        if (!this.f20279a.n) {
            xcx.b("visitLocalDescendants called on an unattached node");
        }
        lm40 lm40Var = this.f20279a;
        if ((lm40Var.d & 1024) != 0) {
            boolean z2 = false;
            for (lm40 lm40Var2 = lm40Var.f; lm40Var2 != null; lm40Var2 = lm40Var2.f) {
                if ((lm40Var2.c & 1024) != 0) {
                    lm40 lm40VarV = lm40Var2;
                    xz40 xz40Var = null;
                    while (lm40VarV != null) {
                        if (lm40VarV instanceof nqq) {
                            nqq nqqVar = (nqq) lm40VarV;
                            if (z2) {
                                return nqqVar;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (lm40VarV.c & 1024) != 0 && (lm40VarV instanceof f3k)) {
                            int i = 0;
                            for (lm40 lm40Var3 = ((f3k) lm40VarV).p; lm40Var3 != null; lm40Var3 = lm40Var3.f) {
                                if ((lm40Var3.c & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        lm40VarV = lm40Var3;
                                    } else {
                                        if (xz40Var == null) {
                                            xz40Var = new xz40(new lm40[16]);
                                        }
                                        if (lm40VarV != null) {
                                            xz40Var.b(lm40VarV);
                                            lm40VarV = null;
                                        }
                                        xz40Var.b(lm40Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        lm40VarV = vcc.V(xz40Var);
                    }
                }
            }
        }
        jf4.n("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // a.bqq
    public final void n(zpq zpqVar) {
        zpqVar.c(false);
        zpqVar.a(this.q);
        zpqVar.e(this.r);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (vcc.Z(this).o == null) {
            return;
        }
        View viewW = dyb.W(this);
        wpq focusOwner = vcc.a0(this).getFocusOwner();
        cg80 cg80VarA0 = vcc.a0(this);
        boolean z = (view == null || view.equals(cg80VarA0) || !dyb.M(viewW, view)) ? false : true;
        boolean z2 = (view2 == null || view2.equals(cg80VarA0) || !dyb.M(viewW, view2)) ? false : true;
        if (z && z2) {
            this.o = view2;
            return;
        }
        if (z2) {
            this.o = view2;
            nqq nqqVarZ0 = Z0();
            if (nqqVarZ0.e1().a()) {
                return;
            }
            qzb.M0(nqqVarZ0);
            return;
        }
        if (!z) {
            this.o = null;
            return;
        }
        this.o = null;
        if (Z0().e1().b()) {
            ((ypq) focusOwner).d(8, false, false);
        }
    }
}
