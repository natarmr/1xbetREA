package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.support.api.navigation.SupportMenuScreenParams;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;
import org.xplatform.uikit.components.cells.right.DsCellRightCounter;
import org.xplatform.uikit.components.counter.DsCounter;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fjn0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9651a;
    public final /* synthetic */ jjn0 b;

    public /* synthetic */ fjn0(jjn0 jjn0Var, byte b) {
        this.f9651a = b;
        this.b = jjn0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9651a;
        final byte b2 = 0;
        jjn0 jjn0Var = this.b;
        switch (b) {
            case 0:
                g9m0 g9m0Var = jjn0.S1;
                i1w0 i1w0Var = jjn0Var.H0().b;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 1:
                g9m0 g9m0Var2 = jjn0.S1;
                ComponentCallbacks2 application = jjn0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(kjn0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof kjn0)) {
                        ze3Var = null;
                    }
                    kjn0 kjn0Var = (kjn0) ze3Var;
                    if (kjn0Var != null) {
                        i1w0 i1w0VarF = a4n0.f(jjn0Var);
                        SupportMenuScreenParams supportMenuScreenParams = (SupportMenuScreenParams) jjn0Var.L1.n(jjn0Var, jjn0.U1[0]);
                        String str = jjn0Var.N1;
                        str.getClass();
                        i1w0VarF.getClass();
                        e6e e6eVar = kjn0Var.b;
                        tp9 tp9Var = kjn0Var.f18395a;
                        ys70 ys70Var = kjn0Var.n;
                        gr70 gr70Var = kjn0Var.h;
                        mne mneVar = kjn0Var.c;
                        wdk0 wdk0Var = kjn0Var.d;
                        iw20 iw20Var = kjn0Var.e;
                        iqt iqtVar = kjn0Var.f;
                        s31 s31Var = kjn0Var.g;
                        nmt0 nmt0Var = kjn0Var.i;
                        ntu ntuVar = kjn0Var.j;
                        ii iiVar = kjn0Var.k;
                        m1e m1eVar = kjn0Var.l;
                        d1p d1pVar = kjn0Var.m;
                        gle0 gle0Var = kjn0Var.o;
                        yfu yfuVar = kjn0Var.p;
                        r9u r9uVar = kjn0Var.q;
                        wgu wguVar = kjn0Var.r;
                        duj dujVar = kjn0Var.s;
                        gr70Var.getClass();
                        e6eVar.getClass();
                        tp9Var.getClass();
                        d1pVar.getClass();
                        wdk0Var.getClass();
                        iiVar.getClass();
                        m1eVar.getClass();
                        ys70Var.getClass();
                        r9uVar.getClass();
                        wguVar.getClass();
                        return new mvi(mneVar, tp9Var, e6eVar, iw20Var, gr70Var, d1pVar, i1w0VarF, gle0Var, wdk0Var, iqtVar, s31Var, nmt0Var, ntuVar, m1eVar, ys70Var, yfuVar, r9uVar, wguVar, dujVar, supportMenuScreenParams, str);
                    }
                }
                jf4.n(b1j.i(kjn0.class, "Cannot create dependency "));
                return null;
            case 2:
                g9m0 g9m0Var3 = jjn0.S1;
                return (lvi) ((mvi) jjn0Var.P1.getValue()).v.get();
            default:
                g9m0 g9m0Var4 = jjn0.S1;
                final gjn0 gjn0Var = new gjn0(jjn0Var, (byte) 2);
                ejn0 ejn0Var = new ejn0();
                final byte b3 = 1;
                gbn gbnVar = new gbn(new acm0((byte) 10), new t330((byte) 12), new Function1() { // from class: a.bjn0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b3;
                        final gjn0 gjn0Var2 = gjn0Var;
                        final cp cpVar = (cp) obj;
                        switch (b4) {
                            case 0:
                                cpVar.getClass();
                                View view = cpVar.f40887a;
                                view.getClass();
                                final byte b5 = 0;
                                dyb.O(view, new Function1() { // from class: a.cjn0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b6 = b5;
                                        cp cpVar2 = cpVar;
                                        gjn0 gjn0Var3 = gjn0Var2;
                                        View view2 = (View) obj2;
                                        switch (b6) {
                                            case 0:
                                                view2.getClass();
                                                gjn0Var3.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view2.getClass();
                                                gjn0Var3.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                DsMenuCompactCell dsMenuCompactCell = ((kyx) cpVar.u).b;
                                int iB = m5d.b(R.attr.uikitStaticRed, cpVar.w);
                                DsCounter dsCounter = dsMenuCompactCell.f1.c;
                                if (dsCounter != null) {
                                    dsCounter.h(Integer.valueOf(iB));
                                }
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 4));
                                break;
                            default:
                                cpVar.getClass();
                                View view2 = cpVar.f40887a;
                                view2.getClass();
                                final byte b6 = 1;
                                dyb.O(view2, new Function1() { // from class: a.cjn0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b7 = b6;
                                        cp cpVar2 = cpVar;
                                        gjn0 gjn0Var3 = gjn0Var2;
                                        View view3 = (View) obj2;
                                        switch (b7) {
                                            case 0:
                                                view3.getClass();
                                                gjn0Var3.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view3.getClass();
                                                gjn0Var3.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                jyx jyxVar = (jyx) cpVar.u;
                                DsCellRightCounter dsCellRightCounter = jyxVar.b;
                                Context context = cpVar.w;
                                dsCellRightCounter.setCounterColor(m5d.b(R.attr.uikitStaticWhite, context));
                                jyxVar.b.setCounterBackgroundColor(Integer.valueOf(m5d.b(R.attr.uikitStaticRed, context)));
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 5));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, wjj0.w);
                dp dpVar = ejn0Var.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new acm0((byte) 7), new t330((byte) 11), new Function1() { // from class: a.bjn0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b2;
                        final gjn0 gjn0Var2 = gjn0Var;
                        final cp cpVar = (cp) obj;
                        switch (b4) {
                            case 0:
                                cpVar.getClass();
                                View view = cpVar.f40887a;
                                view.getClass();
                                final byte b5 = 0;
                                dyb.O(view, new Function1() { // from class: a.cjn0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b7 = b5;
                                        cp cpVar2 = cpVar;
                                        gjn0 gjn0Var3 = gjn0Var2;
                                        View view3 = (View) obj2;
                                        switch (b7) {
                                            case 0:
                                                view3.getClass();
                                                gjn0Var3.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view3.getClass();
                                                gjn0Var3.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                DsMenuCompactCell dsMenuCompactCell = ((kyx) cpVar.u).b;
                                int iB = m5d.b(R.attr.uikitStaticRed, cpVar.w);
                                DsCounter dsCounter = dsMenuCompactCell.f1.c;
                                if (dsCounter != null) {
                                    dsCounter.h(Integer.valueOf(iB));
                                }
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 4));
                                break;
                            default:
                                cpVar.getClass();
                                View view2 = cpVar.f40887a;
                                view2.getClass();
                                final byte b6 = 1;
                                dyb.O(view2, new Function1() { // from class: a.cjn0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b7 = b6;
                                        cp cpVar2 = cpVar;
                                        gjn0 gjn0Var3 = gjn0Var2;
                                        View view3 = (View) obj2;
                                        switch (b7) {
                                            case 0:
                                                view3.getClass();
                                                gjn0Var3.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view3.getClass();
                                                gjn0Var3.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                jyx jyxVar = (jyx) cpVar.u;
                                DsCellRightCounter dsCellRightCounter = jyxVar.b;
                                Context context = cpVar.w;
                                dsCellRightCounter.setCounterColor(m5d.b(R.attr.uikitStaticWhite, context));
                                jyxVar.b.setCounterBackgroundColor(Integer.valueOf(m5d.b(R.attr.uikitStaticRed, context)));
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 5));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, wjj0.t));
                return ejn0Var;
        }
    }
}
