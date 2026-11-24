package a;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class sql0 extends q4 {
    public static final pn20 h = new pn20((byte) 15);
    public xdr f;
    public int g;

    @Override // a.q4, a.yge0
    public final int f(int i) {
        lql0 lql0Var = (lql0) A(i);
        if (lql0Var != null) {
            if (lql0Var instanceof kql0) {
                ae9 ae9Var = ae9.f717a;
                return 2;
            }
            if (lql0Var instanceof iql0) {
                ae9 ae9Var2 = ae9.f717a;
                return 0;
            }
            if (lql0Var instanceof jql0) {
                ae9 ae9Var3 = ae9.f717a;
                return 1;
            }
        }
        t9f.b();
        return 0;
    }

    @Override // a.q4, a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        View view = xhe0Var.f40887a;
        lql0 lql0Var = (lql0) A(i);
        if (lql0Var != null) {
            if (lql0Var instanceof kql0) {
                rql0 rql0Var = xhe0Var instanceof rql0 ? (rql0) xhe0Var : null;
                if (rql0Var != null) {
                    vql0 vql0Var = ((kql0) lql0Var).b;
                    tql0 tql0Var = rql0Var.u;
                    tql0Var.setIcon(vql0Var.c);
                    tql0Var.setTitle(vql0Var.b);
                }
                view.getClass();
                dyb.c0(view, new u5l0((Object) this, (Object) lql0Var, (byte) 8));
                return;
            }
            if (lql0Var instanceof iql0) {
                pql0 pql0Var = xhe0Var instanceof pql0 ? (pql0) xhe0Var : null;
                if (pql0Var != null) {
                    ud9 ud9Var = ((iql0) lql0Var).b;
                    ud9Var.getClass();
                    tql0 tql0Var2 = pql0Var.u;
                    tql0Var2.setIcon(ud9Var.b);
                    tql0Var2.setTitle(ud9Var.f35466a);
                }
                view.getClass();
                final byte b = 0;
                dyb.c0(view, new Function1(this) { // from class: a.oql0
                    public final /* synthetic */ sql0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b2 = b;
                        sql0 sql0Var = this.b;
                        View view2 = (View) obj;
                        switch (b2) {
                            case 0:
                                view2.getClass();
                                xdr xdrVar = sql0Var.f;
                                if (xdrVar != null) {
                                    xdrVar.F(ae9.f717a, null, null);
                                }
                                break;
                            default:
                                view2.getClass();
                                xdr xdrVar2 = sql0Var.f;
                                if (xdrVar2 != null) {
                                    xdrVar2.F(ae9.b, null, null);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                return;
            }
            if (lql0Var instanceof jql0) {
                qql0 qql0Var = xhe0Var instanceof qql0 ? (qql0) xhe0Var : null;
                if (qql0Var != null) {
                    ke9 ke9Var = ((jql0) lql0Var).b;
                    ke9Var.getClass();
                    tql0 tql0Var3 = qql0Var.u;
                    tql0Var3.setIcon(ke9Var.b);
                    tql0Var3.setTitle(ke9Var.f18143a);
                }
                view.getClass();
                final byte b2 = 1;
                dyb.c0(view, new Function1(this) { // from class: a.oql0
                    public final /* synthetic */ sql0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b3 = b2;
                        sql0 sql0Var = this.b;
                        View view2 = (View) obj;
                        switch (b3) {
                            case 0:
                                view2.getClass();
                                xdr xdrVar = sql0Var.f;
                                if (xdrVar != null) {
                                    xdrVar.F(ae9.f717a, null, null);
                                }
                                break;
                            default:
                                view2.getClass();
                                xdr xdrVar2 = sql0Var.f;
                                if (xdrVar2 != null) {
                                    xdrVar2.F(ae9.b, null, null);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                return;
            }
        }
        t9f.b();
    }

    @Override // a.q4, a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        int iOrdinal = ((ae9) ae9.e.get(i)).ordinal();
        if (iOrdinal == 0) {
            return new pql0(new tql0(new ContextThemeWrapper(viewGroup.getContext(), this.g)));
        }
        if (iOrdinal == 1) {
            return new qql0(new tql0(new ContextThemeWrapper(viewGroup.getContext(), this.g)));
        }
        if (iOrdinal == 2) {
            return new rql0(new tql0(new ContextThemeWrapper(viewGroup.getContext(), this.g)));
        }
        t9f.b();
        return null;
    }
}
