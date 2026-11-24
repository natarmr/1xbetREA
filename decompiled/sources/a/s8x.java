package a;

import android.content.ComponentCallbacks2;
import android.view.View;
import java.io.File;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s8x implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31824a;
    public final /* synthetic */ v8x b;

    public /* synthetic */ s8x(v8x v8xVar, byte b) {
        this.f31824a = b;
        this.b = v8xVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31824a;
        final byte b2 = 0;
        v8x v8xVar = this.b;
        switch (b) {
            case 0:
                gst gstVar = v8x.U1;
                ComponentCallbacks2 application = v8xVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(w8x.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof w8x)) {
                        ze3Var = null;
                    }
                    w8x w8xVar = (w8x) ze3Var;
                    if (w8xVar != null) {
                        i1w0 i1w0VarF = a4n0.f(v8xVar);
                        String str = v8xVar.N1;
                        File filesDir = v8xVar.o0().getFilesDir();
                        filesDir.getClass();
                        i1w0VarF.getClass();
                        str.getClass();
                        mne mneVar = w8xVar.f38747a;
                        wdk0 wdk0Var = w8xVar.b;
                        b8u b8uVar = w8xVar.c;
                        u58 u58Var = w8xVar.d;
                        zx10 zx10Var = w8xVar.e;
                        lbu lbuVar = w8xVar.f;
                        pru pruVar = w8xVar.g;
                        aqt aqtVar = w8xVar.h;
                        nv20 nv20Var = w8xVar.i;
                        db9 db9Var = w8xVar.j;
                        edu eduVar = w8xVar.k;
                        m1e m1eVar = w8xVar.l;
                        v6k v6kVar = w8xVar.m;
                        zx10 zx10Var2 = w8xVar.n;
                        d1p d1pVar = w8xVar.o;
                        gle0 gle0Var = w8xVar.p;
                        bzs0 bzs0Var = w8xVar.q;
                        yox yoxVar = w8xVar.r;
                        wxs0 wxs0Var = w8xVar.s;
                        gst0 gst0Var = w8xVar.t;
                        d1pVar.getClass();
                        wdk0Var.getClass();
                        aqtVar.getClass();
                        m1eVar.getClass();
                        gst0Var.getClass();
                        return new bji(mneVar, zx10Var, v6kVar, zx10Var2, d1pVar, wxs0Var, i1w0VarF, wdk0Var, b8uVar, u58Var, lbuVar, pruVar, aqtVar, nv20Var, db9Var, eduVar, m1eVar, gle0Var, bzs0Var, yoxVar, str, filesDir, gst0Var);
                    }
                }
                jf4.n(b1j.i(w8x.class, "Cannot create dependency "));
                return null;
            case 1:
                gst gstVar2 = v8x.U1;
                return (aji) ((bji) v8xVar.P1.getValue()).v.get();
            case 2:
                gst gstVar3 = v8x.U1;
                final adw adwVar = new adw(v8xVar, (byte) 11);
                h9x h9xVar = new h9x();
                final byte b3 = 1;
                gbn gbnVar = new gbn(new v1x((byte) 9), new thd((byte) 27), new Function1() { // from class: a.y8x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b3;
                        final adw adwVar2 = adwVar;
                        final cp cpVar = (cp) obj;
                        switch (b4) {
                            case 0:
                                cpVar.getClass();
                                View view = cpVar.f40887a;
                                view.getClass();
                                final byte b5 = 0;
                                dyb.O(view, new Function1() { // from class: a.z8x
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) throws Exception {
                                        byte b6 = b5;
                                        cp cpVar2 = cpVar;
                                        adw adwVar3 = adwVar2;
                                        View view2 = (View) obj2;
                                        switch (b6) {
                                            case 0:
                                                view2.getClass();
                                                adwVar3.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view2.getClass();
                                                adwVar3.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 2));
                                break;
                            default:
                                cpVar.getClass();
                                View view2 = cpVar.f40887a;
                                view2.getClass();
                                final byte b6 = 1;
                                dyb.O(view2, new Function1() { // from class: a.z8x
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) throws Exception {
                                        byte b7 = b6;
                                        cp cpVar2 = cpVar;
                                        adw adwVar3 = adwVar2;
                                        View view3 = (View) obj2;
                                        switch (b7) {
                                            case 0:
                                                view3.getClass();
                                                adwVar3.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view3.getClass();
                                                adwVar3.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 3));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, btv.A);
                dp dpVar = h9xVar.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new v1x((byte) 8), new thd((byte) 26), new Function1() { // from class: a.y8x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b2;
                        final adw adwVar2 = adwVar;
                        final cp cpVar = (cp) obj;
                        switch (b4) {
                            case 0:
                                cpVar.getClass();
                                View view = cpVar.f40887a;
                                view.getClass();
                                final byte b5 = 0;
                                dyb.O(view, new Function1() { // from class: a.z8x
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) throws Exception {
                                        byte b7 = b5;
                                        cp cpVar2 = cpVar;
                                        adw adwVar3 = adwVar2;
                                        View view3 = (View) obj2;
                                        switch (b7) {
                                            case 0:
                                                view3.getClass();
                                                adwVar3.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view3.getClass();
                                                adwVar3.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 2));
                                break;
                            default:
                                cpVar.getClass();
                                View view2 = cpVar.f40887a;
                                view2.getClass();
                                final byte b6 = 1;
                                dyb.O(view2, new Function1() { // from class: a.z8x
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) throws Exception {
                                        byte b7 = b6;
                                        cp cpVar2 = cpVar;
                                        adw adwVar3 = adwVar2;
                                        View view3 = (View) obj2;
                                        switch (b7) {
                                            case 0:
                                                view3.getClass();
                                                adwVar3.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view3.getClass();
                                                adwVar3.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 3));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, btv.z));
                return h9xVar;
            default:
                gst gstVar4 = v8x.U1;
                i1w0 i1w0Var = v8xVar.H0().b;
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
        }
    }
}
