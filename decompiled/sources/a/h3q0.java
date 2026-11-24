package a;

import android.app.RemoteAction;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.inputmethod.BaseInputConnection;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.tile_matching.presentation.views.TileMatchingGameFieldView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h3q0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12398a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h3q0(y78 y78Var, r1a r1aVar) {
        this.f12398a = (byte) 9;
        this.b = r1aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        v5l0 v5l0Var;
        l0l0 l0l0Var;
        byte b = this.f12398a;
        byte b2 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final byte b3 = 1;
        yje yjeVar = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                m6m0 m6m0Var = j3q0.P1;
                fiu0 fiu0Var = ((j3q0) obj).M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                return Integer.valueOf(((v3q0) obj).d.size());
            case 2:
                btm0.u(((RemoteAction) obj).getActionIntent());
                return Unit.f46060a;
            case 3:
                j5q0 j5q0Var = (j5q0) obj;
                return j5q0Var.n ? etm0.k(j5q0Var) : u4q0.b;
            case 4:
                return new BaseInputConnection(((q8q0) obj).f28312a, false);
            case 5:
                return new ikx(((mkx) obj).b());
            case 6:
                x9q0 x9q0Var = (x9q0) obj;
                x9q0Var.z = null;
                s0x.S(x9q0Var);
                n7x.I(x9q0Var);
                vfc.J(x9q0Var);
                return Boolean.TRUE;
            case 7:
                return d5c.a(kotlin.coroutines.e.c(qem0.e(), ((waq0) obj).b.c));
            case 8:
                return d5c.a(kotlin.coroutines.e.c(qem0.e(), ((rbq0) obj).b.c));
            case 9:
                HandlerThread handlerThread = new HandlerThread("CXCP-Camera-H", -3);
                handlerThread.start();
                ((r1a) obj).a(p1a.c, new apj0((Object) handlerThread, (byte) 16));
                return new Handler(handlerThread.getLooper());
            case 10:
                return (Executor) ((yip0) obj).invoke();
            case 11:
                ((ck60) obj).invoke();
                return Unit.f46060a;
            case 12:
                TileMatchingGameFieldView tileMatchingGameFieldView = (TileMatchingGameFieldView) obj;
                int i = TileMatchingGameFieldView.h;
                tileMatchingGameFieldView.c();
                tileMatchingGameFieldView.e.invoke();
                tileMatchingGameFieldView.a();
                return Unit.f46060a;
            case 13:
                wfq0 wfq0Var = (wfq0) obj;
                sac.V(jiu0.a(wfq0Var), vfq0.f37347a, null, wfq0Var.q.f22085a, new tfq0(wfq0Var, yjeVar, b2), 10);
                wfq0Var.B();
                return Unit.f46060a;
            case 14:
                ugq0 ugq0Var = (ugq0) obj;
                ((es00) ((ieu) ugq0Var.e.f6468a).c).f8306a = System.currentTimeMillis();
                ugq0Var.f.a();
                ugq0Var.j.o(null, i8d.c);
                return Unit.f46060a;
            case 15:
                p7m0 p7m0Var = ((wmq0) obj).f;
                Boolean bool = Boolean.FALSE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                return Unit.f46060a;
            case 16:
                y2m0 y2m0Var = noq0.m2;
                fiu0 fiu0Var2 = ((noq0) obj).j2;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 17:
                ((tpq0) obj).w(true);
                return Unit.f46060a;
            case 18:
                ((yqq0) obj).w(true);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((qrq0) obj).i();
                return Unit.f46060a;
            case 20:
                ((cym0) obj).invoke();
                return Unit.f46060a;
            case 21:
                dvq0 dvq0Var = (dvq0) obj;
                dvq0Var.o1.invoke(Boolean.valueOf(!dvq0Var.n1));
                return Unit.f46060a;
            case 22:
                ((czq0) obj).h.o(null, i8d.c);
                return Unit.f46060a;
            case 23:
                return (f2m0) ((gii0) ((trm0) obj).b).b(sre0.f32672a.b(f2m0.class));
            case 24:
                ibo0 ibo0Var = (ibo0) obj;
                if (ibo0Var == null || (v5l0Var = ibo0Var.h) == null) {
                    v5l0Var = v5l0.MEDIUM_CARD_SMALL_TEAM_LOGO;
                }
                ArrayList arrayList = new ArrayList(12);
                for (int i2 = 0; i2 < 12; i2++) {
                    String strValueOf = String.valueOf(i2);
                    int iOrdinal = v5l0Var.ordinal();
                    if (iOrdinal == 0) {
                        l0l0Var = g0l0.f10465a;
                    } else if (iOrdinal == 1) {
                        l0l0Var = k0l0.f17474a;
                    } else if (iOrdinal == 2) {
                        l0l0Var = j0l0.f15687a;
                    } else if (iOrdinal == 3) {
                        l0l0Var = i0l0.f13953a;
                    } else {
                        if (iOrdinal != 4) {
                            t9f.b();
                            return null;
                        }
                        l0l0Var = h0l0.f12241a;
                    }
                    arrayList.add(new x56(l0l0Var, strValueOf));
                }
                return new ydo0(dyb.o0(arrayList));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                final q7r0 q7r0Var = (q7r0) obj;
                y2m0 y2m0Var2 = q7r0.O1;
                final Object[] objArr3 = objArr == true ? 1 : 0;
                Function1 function1 = new Function1() { // from class: a.o7r0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b4 = objArr3;
                        q7r0 q7r0Var2 = q7r0Var;
                        switch (b4) {
                            case 0:
                                f240 f240Var = (f240) obj2;
                                y2m0 y2m0Var3 = q7r0.O1;
                                f240Var.getClass();
                                ((fho0) q7r0Var2.M1.getValue()).F(f240Var);
                                break;
                            default:
                                z140 z140Var = (z140) obj2;
                                y2m0 y2m0Var4 = q7r0.O1;
                                z140Var.getClass();
                                fho0 fho0Var = (fho0) q7r0Var2.M1.getValue();
                                int eventId = z140Var.getEventId();
                                String strV = bww.V(fho0Var.z());
                                fho0Var.s.a(strV, String.valueOf(eventId));
                                fho0Var.D.l(z140Var.getEventId(), strV);
                                FragmentScreen fragmentScreenH = fho0Var.t.h(eventId, z140Var.getTitle());
                                i1w0 i1w0Var = fho0Var.y;
                                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                                if (fragmentScreenH instanceof DialogScreen) {
                                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenH)));
                                } else {
                                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenH)));
                                }
                                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                                while (true) {
                                    paw pawVar = (paw) listIteratorO;
                                    if (pawVar.hasNext()) {
                                        i1w0Var.a((oe50) pawVar.next());
                                    }
                                    break;
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                Function1 function2 = new Function1() { // from class: a.o7r0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b4 = b3;
                        q7r0 q7r0Var2 = q7r0Var;
                        switch (b4) {
                            case 0:
                                f240 f240Var = (f240) obj2;
                                y2m0 y2m0Var3 = q7r0.O1;
                                f240Var.getClass();
                                ((fho0) q7r0Var2.M1.getValue()).F(f240Var);
                                break;
                            default:
                                z140 z140Var = (z140) obj2;
                                y2m0 y2m0Var4 = q7r0.O1;
                                z140Var.getClass();
                                fho0 fho0Var = (fho0) q7r0Var2.M1.getValue();
                                int eventId = z140Var.getEventId();
                                String strV = bww.V(fho0Var.z());
                                fho0Var.s.a(strV, String.valueOf(eventId));
                                fho0Var.D.l(z140Var.getEventId(), strV);
                                FragmentScreen fragmentScreenH = fho0Var.t.h(eventId, z140Var.getTitle());
                                i1w0 i1w0Var = fho0Var.y;
                                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                                if (fragmentScreenH instanceof DialogScreen) {
                                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenH)));
                                } else {
                                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenH)));
                                }
                                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                                while (true) {
                                    paw pawVar = (paw) listIteratorO;
                                    if (pawVar.hasNext()) {
                                        i1w0Var.a((oe50) pawVar.next());
                                    }
                                    break;
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                n7r0 n7r0Var = new n7r0();
                gbn gbnVarS = ccq0.S(function1);
                dp dpVar = n7r0Var.d;
                dpVar.b(gbnVarS);
                dpVar.b(zjb.B(function1));
                dpVar.b(ofm0.p(function1));
                dpVar.b(gkb.T(function1));
                dpVar.b(q7x.A(function1));
                dpVar.b(e3c.y(function1));
                dpVar.b(m7x.L(function2));
                dpVar.b(bfb.P(function1));
                return n7r0Var;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Integer.valueOf(((adr0) obj).b.b);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                g9m0 g9m0Var = jbr0.O1;
                fiu0 fiu0Var3 = ((jbr0) obj).M1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                s9m0 s9m0Var = qbr0.O1;
                fiu0 fiu0Var4 = ((qbr0) obj).M1;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                final udr0 udr0Var = (udr0) obj;
                s2m0 s2m0Var = udr0.O1;
                final Object[] objArr4 = objArr2 == true ? 1 : 0;
                Function1 function3 = new Function1() { // from class: a.tdr0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b4 = objArr4;
                        udr0 udr0Var2 = udr0Var;
                        switch (b4) {
                            case 0:
                                f240 f240Var = (f240) obj2;
                                s2m0 s2m0Var2 = udr0.O1;
                                f240Var.getClass();
                                ((rio0) udr0Var2.M1.getValue()).E(f240Var);
                                break;
                            default:
                                z140 z140Var = (z140) obj2;
                                s2m0 s2m0Var3 = udr0.O1;
                                z140Var.getClass();
                                rio0 rio0Var = (rio0) udr0Var2.M1.getValue();
                                int eventId = z140Var.getEventId();
                                String strV = bww.V(rio0Var.z());
                                rio0Var.t.a(strV, String.valueOf(eventId));
                                rio0Var.E.l(z140Var.getEventId(), strV);
                                FragmentScreen fragmentScreenH = rio0Var.u.h(eventId, z140Var.getTitle());
                                i1w0 i1w0Var = rio0Var.z;
                                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                                if (fragmentScreenH instanceof DialogScreen) {
                                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenH)));
                                } else {
                                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenH)));
                                }
                                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                                while (true) {
                                    paw pawVar = (paw) listIteratorO;
                                    if (pawVar.hasNext()) {
                                        i1w0Var.a((oe50) pawVar.next());
                                    }
                                    break;
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                Function1 function4 = new Function1() { // from class: a.tdr0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b4 = b3;
                        udr0 udr0Var2 = udr0Var;
                        switch (b4) {
                            case 0:
                                f240 f240Var = (f240) obj2;
                                s2m0 s2m0Var2 = udr0.O1;
                                f240Var.getClass();
                                ((rio0) udr0Var2.M1.getValue()).E(f240Var);
                                break;
                            default:
                                z140 z140Var = (z140) obj2;
                                s2m0 s2m0Var3 = udr0.O1;
                                z140Var.getClass();
                                rio0 rio0Var = (rio0) udr0Var2.M1.getValue();
                                int eventId = z140Var.getEventId();
                                String strV = bww.V(rio0Var.z());
                                rio0Var.t.a(strV, String.valueOf(eventId));
                                rio0Var.E.l(z140Var.getEventId(), strV);
                                FragmentScreen fragmentScreenH = rio0Var.u.h(eventId, z140Var.getTitle());
                                i1w0 i1w0Var = rio0Var.z;
                                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                                if (fragmentScreenH instanceof DialogScreen) {
                                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenH)));
                                } else {
                                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenH)));
                                }
                                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                                while (true) {
                                    paw pawVar = (paw) listIteratorO;
                                    if (pawVar.hasNext()) {
                                        i1w0Var.a((oe50) pawVar.next());
                                    }
                                    break;
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                sdr0 sdr0Var = new sdr0();
                gbn gbnVarN = phu0.N(function3);
                dp dpVar2 = sdr0Var.d;
                dpVar2.b(gbnVarN);
                dpVar2.b(k9x.L(function3));
                dpVar2.b(egm0.i(function3));
                dpVar2.b(gkb.T(function3));
                dpVar2.b(e3c.y(function3));
                dpVar2.b(m7x.L(function4));
                dpVar2.b(ro4.X(function3));
                dpVar2.b(wvb.Q(function3));
                dpVar2.b(q7x.A(function3));
                return sdr0Var;
        }
    }

    public /* synthetic */ h3q0(ibo0 ibo0Var, m72 m72Var) {
        this.f12398a = (byte) 24;
        this.b = ibo0Var;
    }

    public /* synthetic */ h3q0(Object obj, byte b) {
        this.f12398a = b;
        this.b = obj;
    }
}
