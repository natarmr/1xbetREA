package a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class jp5 extends q4 {
    public static final ek5 h = new ek5((byte) 9);
    public final dp5 f;
    public xdr g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp5(dp5 dp5Var) {
        super(h);
        dp5Var.getClass();
        this.f = dp5Var;
    }

    @Override // a.q4, a.yge0
    public final int f(int i) {
        return ((fp5) A(i)).c.f22206a;
    }

    @Override // a.q4, a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        fp5 fp5Var = (fp5) A(i);
        hp5 hp5Var = xhe0Var instanceof hp5 ? (hp5) xhe0Var : null;
        if (hp5Var != null) {
            fp5Var.getClass();
            ViewParent viewParent = hp5Var.u;
            gr5 gr5Var = (gr5) viewParent;
            gr5Var.a(fp5Var.b, fp5Var.h);
            gr5Var.setTitle(fp5Var.d);
            gr5Var.setTag(fp5Var.f);
            gr5Var.setTagColor(null);
            m0x m0xVar = fp5Var.g;
            if (m0xVar != null) {
                gr5Var.setDecoratorImage(m0xVar);
            }
            if (viewParent instanceof ro5) {
                ((ro5) viewParent).setSubtitle(fp5Var.e);
            }
        }
        View view = xhe0Var.f40887a;
        view.getClass();
        dyb.b0(view, ymx.INTERVAL_1000, new ec3(this, fp5Var, i, xhe0Var, (byte) 1));
    }

    @Override // a.yge0
    public final void o(xhe0 xhe0Var, int i, List list) {
        list.getClass();
        if (list.isEmpty()) {
            n(xhe0Var, i);
            return;
        }
        Set setV = pgi0.v(pgi0.k(new sx3(list, (byte) 1), new ij4((byte) 25)));
        hp5 hp5Var = xhe0Var instanceof hp5 ? (hp5) xhe0Var : null;
        if (hp5Var != null) {
            ViewParent viewParent = hp5Var.u;
            setV.getClass();
            for (Object obj : setV) {
                if (obj != null) {
                    if (obj instanceof pp5) {
                        ((gr5) viewParent).setTitle(((pp5) obj).f27360a);
                    } else if (obj instanceof mp5) {
                        if (viewParent instanceof ro5) {
                            ((ro5) viewParent).setSubtitle(((mp5) obj).f22162a);
                        }
                    } else if (obj instanceof op5) {
                        ((gr5) viewParent).setTag(((op5) obj).f25624a);
                    } else if (obj instanceof np5) {
                        ((gr5) viewParent).setTagColor(null);
                    } else if (obj instanceof kp5) {
                        kp5 kp5Var = (kp5) obj;
                        ((gr5) viewParent).a(kp5Var.f18660a, kp5Var.b);
                    } else if (obj instanceof lp5) {
                        ((gr5) viewParent).setDecoratorImage(((lp5) obj).f20424a);
                    }
                }
            }
        }
    }

    @Override // a.q4, a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        ViewGroup is5Var;
        mq5 mq5Var = mq5.RectangleHorizontal;
        if (i == 1) {
            Context context = viewGroup.getContext();
            context.getClass();
            is5Var = new rr5(context);
        } else if (i == 2) {
            Context context2 = viewGroup.getContext();
            context2.getClass();
            is5Var = new wr5(context2);
        } else if (i == 3) {
            Context context3 = viewGroup.getContext();
            context3.getClass();
            is5Var = new fs5(context3);
        } else {
            dp5 dp5Var = this.f;
            if (i == 4) {
                if (ip5.f15146a[dp5Var.ordinal()] == 1) {
                    Context context4 = viewGroup.getContext();
                    context4.getClass();
                    is5Var = new ns5(context4);
                } else {
                    Context context5 = viewGroup.getContext();
                    context5.getClass();
                    is5Var = new ks5(context5);
                }
            } else if (i == 5) {
                Context context6 = viewGroup.getContext();
                context6.getClass();
                is5Var = new ro5(context6);
            } else if (i == 6) {
                Context context7 = viewGroup.getContext();
                context7.getClass();
                is5Var = new tr5(context7);
            } else if (i == 7) {
                Context context8 = viewGroup.getContext();
                context8.getClass();
                is5Var = new yr5(context8);
            } else if (i == 8) {
                Context context9 = viewGroup.getContext();
                context9.getClass();
                is5Var = new hs5(context9);
            } else {
                if (i != 9) {
                    jf4.o(twn.m(i, "Unknown view type "));
                    return null;
                }
                if (ip5.f15146a[dp5Var.ordinal()] == 1) {
                    Context context10 = viewGroup.getContext();
                    context10.getClass();
                    is5Var = new js5(context10);
                } else {
                    Context context11 = viewGroup.getContext();
                    context11.getClass();
                    is5Var = new is5(context11);
                }
            }
        }
        return new hp5(is5Var);
    }
}
