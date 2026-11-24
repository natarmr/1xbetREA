package a;

import android.app.Dialog;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w6q0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38637a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6q0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f38637a = b;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:150:0x0447  */
    /* JADX WARN: Code duplicated, block: B:181:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:218:0x052d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [a.vq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v100 */
    /* JADX WARN: Type inference failed for: r8v101 */
    /* JADX WARN: Type inference failed for: r8v102 */
    /* JADX WARN: Type inference failed for: r8v103 */
    /* JADX WARN: Type inference failed for: r8v104 */
    /* JADX WARN: Type inference failed for: r8v105 */
    /* JADX WARN: Type inference failed for: r8v106 */
    /* JADX WARN: Type inference failed for: r8v107 */
    /* JADX WARN: Type inference failed for: r8v108 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [a.wjy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v83 */
    /* JADX WARN: Type inference failed for: r8v84 */
    /* JADX WARN: Type inference failed for: r8v85 */
    /* JADX WARN: Type inference failed for: r8v86 */
    /* JADX WARN: Type inference failed for: r8v87 */
    /* JADX WARN: Type inference failed for: r8v88 */
    /* JADX WARN: Type inference failed for: r8v89 */
    /* JADX WARN: Type inference failed for: r8v90 */
    /* JADX WARN: Type inference failed for: r8v91 */
    /* JADX WARN: Type inference failed for: r8v92 */
    /* JADX WARN: Type inference failed for: r8v93 */
    /* JADX WARN: Type inference failed for: r8v94 */
    /* JADX WARN: Type inference failed for: r8v95 */
    /* JADX WARN: Type inference failed for: r8v96 */
    /* JADX WARN: Type inference failed for: r8v97 */
    /* JADX WARN: Type inference failed for: r8v98 */
    /* JADX WARN: Type inference failed for: r8v99 */
    /* JADX WARN: Type inference failed for: r9v14, types: [android.view.ViewGroup] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l8d l8dVar;
        ?? r8;
        Integer numValueOf;
        Window window;
        Object value;
        dbr0 dbr0Var;
        boolean z = false;
        Object obj2 = null;
        switch (this.f38637a) {
            case 0:
                KeyEvent keyEvent = ((gky) obj).f11467a;
                u6q0 u6q0Var = (u6q0) this.receiver;
                n9q0 n9q0Var = u6q0Var.f;
                boolean z2 = u6q0Var.d;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    l8dVar = null;
                } else {
                    vij vijVar = u6q0Var.i;
                    vijVar.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        vijVar.f37480a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = vijVar.f37480a;
                        if (num != null) {
                            vijVar.f37480a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer numValueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                unicodeChar = numValueOf2.intValue();
                            }
                            numValueOf = Integer.valueOf(unicodeChar);
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        l8dVar = new l8d(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    } else {
                        l8dVar = null;
                    }
                }
                if (l8dVar != null) {
                    if (z2) {
                        u6q0Var.a(kotlin.collections.a.c(l8dVar));
                        n9q0Var.f23154a = null;
                        z = true;
                    }
                } else if (n7x.H(keyEvent) == 2) {
                    int iZ = q7x.z(keyEvent);
                    if (iZ == 9) {
                        long jC = u7x.c(keyEvent.getKeyCode());
                        if (qjy.a(jC, qjy.f)) {
                            r8 = wjy.SELECT_LINE_LEFT;
                        } else if (qjy.a(jC, qjy.g)) {
                            r8 = wjy.SELECT_LINE_RIGHT;
                        } else if (qjy.a(jC, qjy.d)) {
                            r8 = wjy.SELECT_HOME;
                        } else if (qjy.a(jC, qjy.e)) {
                            r8 = wjy.SELECT_END;
                        } else {
                            r8 = 0;
                        }
                    } else if (iZ == 1) {
                        long jC2 = u7x.c(keyEvent.getKeyCode());
                        if (qjy.a(jC2, qjy.f)) {
                            r8 = wjy.LINE_LEFT;
                        } else if (qjy.a(jC2, qjy.g)) {
                            r8 = wjy.LINE_RIGHT;
                        } else if (qjy.a(jC2, qjy.d)) {
                            r8 = wjy.HOME;
                        } else if (qjy.a(jC2, qjy.e)) {
                            r8 = wjy.END;
                        } else if (qjy.a(jC2, qjy.s)) {
                            r8 = wjy.DELETE_FROM_LINE_START;
                        } else {
                            r8 = 0;
                        }
                    } else {
                        r8 = 0;
                    }
                    if (r8 == 0) {
                        int iZ2 = q7x.z(keyEvent);
                        long jC3 = u7x.c(keyEvent.getKeyCode());
                        if (qjy.a(jC3, qjy.s)) {
                            if (iZ2 == 0 || iZ2 == 8 || iZ2 == 12) {
                                r8 = wjy.DELETE_PREV_CHAR;
                            } else if (iZ2 == 2 || iZ2 == 10) {
                                r8 = wjy.DELETE_PREV_WORD;
                            } else {
                                r8 = 0;
                            }
                        } else if ((qjy.a(jC3, qjy.r) || qjy.a(jC3, qjy.E)) && (iZ2 == 0 || iZ2 == 8 || iZ2 == 2 || iZ2 == 10)) {
                            r8 = wjy.NEW_LINE;
                        } else {
                            r8 = 0;
                        }
                        if (r8 == 0) {
                            int iZ3 = q7x.z(keyEvent);
                            if (iZ3 == 10) {
                                long jC4 = u7x.c(keyEvent.getKeyCode());
                                if (qjy.a(jC4, qjy.f) || qjy.a(jC4, qjy.H)) {
                                    r8 = wjy.SELECT_LEFT_WORD;
                                } else if (qjy.a(jC4, qjy.g) || qjy.a(jC4, qjy.I)) {
                                    r8 = wjy.SELECT_RIGHT_WORD;
                                } else if (qjy.a(jC4, qjy.d) || qjy.a(jC4, qjy.F)) {
                                    r8 = wjy.SELECT_PREV_PARAGRAPH;
                                } else if (qjy.a(jC4, qjy.e) || qjy.a(jC4, qjy.G)) {
                                    r8 = wjy.SELECT_NEXT_PARAGRAPH;
                                } else {
                                    r8 = 0;
                                }
                            } else if (iZ3 == 2) {
                                long jC5 = u7x.c(keyEvent.getKeyCode());
                                if (qjy.a(jC5, qjy.f) || qjy.a(jC5, qjy.H)) {
                                    r8 = wjy.LEFT_WORD;
                                } else if (qjy.a(jC5, qjy.g) || qjy.a(jC5, qjy.I)) {
                                    r8 = wjy.RIGHT_WORD;
                                } else if (qjy.a(jC5, qjy.d) || qjy.a(jC5, qjy.F)) {
                                    r8 = wjy.PREV_PARAGRAPH;
                                } else if (qjy.a(jC5, qjy.e) || qjy.a(jC5, qjy.G)) {
                                    r8 = wjy.NEXT_PARAGRAPH;
                                } else if (qjy.a(jC5, qjy.k)) {
                                    r8 = wjy.DELETE_PREV_CHAR;
                                } else if (qjy.a(jC5, qjy.t)) {
                                    r8 = wjy.DELETE_NEXT_WORD;
                                } else if (qjy.a(jC5, qjy.B)) {
                                    r8 = wjy.DESELECT;
                                } else {
                                    r8 = 0;
                                }
                            } else if (iZ3 == 8) {
                                long jC6 = u7x.c(keyEvent.getKeyCode());
                                if (qjy.a(jC6, qjy.v) || qjy.a(jC6, qjy.J)) {
                                    r8 = wjy.SELECT_LINE_START;
                                } else if (qjy.a(jC6, qjy.w) || qjy.a(jC6, qjy.K)) {
                                    r8 = wjy.SELECT_LINE_END;
                                } else {
                                    r8 = 0;
                                }
                            } else if (iZ3 == 1 && qjy.a(u7x.c(keyEvent.getKeyCode()), qjy.t)) {
                                r8 = wjy.DELETE_TO_LINE_END;
                            } else {
                                r8 = 0;
                            }
                            if (r8 == 0) {
                                Object obj3 = pky.f27157a.b;
                                int iZ4 = q7x.z(keyEvent);
                                if (iZ4 == 10) {
                                    if (qjy.a(u7x.c(keyEvent.getKeyCode()), qjy.o)) {
                                        obj2 = wjy.REDO;
                                    }
                                } else if (iZ4 == 2) {
                                    long jC7 = u7x.c(keyEvent.getKeyCode());
                                    if (qjy.a(jC7, qjy.j) || qjy.a(jC7, qjy.x) || qjy.a(jC7, qjy.N)) {
                                        obj2 = wjy.COPY;
                                    } else if (qjy.a(jC7, qjy.l)) {
                                        obj2 = wjy.PASTE;
                                    } else if (qjy.a(jC7, qjy.m)) {
                                        obj2 = wjy.CUT;
                                    } else if (qjy.a(jC7, qjy.i)) {
                                        obj2 = wjy.SELECT_ALL;
                                    } else if (qjy.a(jC7, qjy.n)) {
                                        obj2 = wjy.REDO;
                                    } else if (qjy.a(jC7, qjy.o)) {
                                        obj2 = wjy.UNDO;
                                    }
                                } else if (iZ4 == 8) {
                                    long jC8 = u7x.c(keyEvent.getKeyCode());
                                    if (qjy.a(jC8, qjy.f) || qjy.a(jC8, qjy.H)) {
                                        obj2 = wjy.SELECT_LEFT_CHAR;
                                    } else if (qjy.a(jC8, qjy.g) || qjy.a(jC8, qjy.I)) {
                                        obj2 = wjy.SELECT_RIGHT_CHAR;
                                    } else if (qjy.a(jC8, qjy.d) || qjy.a(jC8, qjy.F)) {
                                        obj2 = wjy.SELECT_UP;
                                    } else if (qjy.a(jC8, qjy.e) || qjy.a(jC8, qjy.G)) {
                                        obj2 = wjy.SELECT_DOWN;
                                    } else if (qjy.a(jC8, qjy.C) || qjy.a(jC8, qjy.L)) {
                                        obj2 = wjy.SELECT_PAGE_UP;
                                    } else if (qjy.a(jC8, qjy.D) || qjy.a(jC8, qjy.M)) {
                                        obj2 = wjy.SELECT_PAGE_DOWN;
                                    } else if (qjy.a(jC8, qjy.v) || qjy.a(jC8, qjy.J)) {
                                        obj2 = wjy.SELECT_LINE_START;
                                    } else if (qjy.a(jC8, qjy.w) || qjy.a(jC8, qjy.K)) {
                                        obj2 = wjy.SELECT_LINE_END;
                                    } else if (qjy.a(jC8, qjy.x) || qjy.a(jC8, qjy.N)) {
                                        obj2 = wjy.PASTE;
                                    }
                                } else if (iZ4 == 0) {
                                    long jC9 = u7x.c(keyEvent.getKeyCode());
                                    if (qjy.a(jC9, qjy.f) || qjy.a(jC9, qjy.H)) {
                                        obj2 = wjy.LEFT_CHAR;
                                    } else if (qjy.a(jC9, qjy.g) || qjy.a(jC9, qjy.I)) {
                                        obj2 = wjy.RIGHT_CHAR;
                                    } else if (qjy.a(jC9, qjy.d) || qjy.a(jC9, qjy.F)) {
                                        obj2 = wjy.UP;
                                    } else if (qjy.a(jC9, qjy.e) || qjy.a(jC9, qjy.G)) {
                                        obj2 = wjy.DOWN;
                                    } else if (qjy.a(jC9, qjy.h)) {
                                        obj2 = wjy.CENTER;
                                    } else if (qjy.a(jC9, qjy.C) || qjy.a(jC9, qjy.L)) {
                                        obj2 = wjy.PAGE_UP;
                                    } else if (qjy.a(jC9, qjy.D) || qjy.a(jC9, qjy.M)) {
                                        obj2 = wjy.PAGE_DOWN;
                                    } else if (qjy.a(jC9, qjy.v) || qjy.a(jC9, qjy.J)) {
                                        obj2 = wjy.LINE_START;
                                    } else if (qjy.a(jC9, qjy.w) || qjy.a(jC9, qjy.K)) {
                                        obj2 = wjy.LINE_END;
                                    } else if (qjy.a(jC9, qjy.r) || qjy.a(jC9, qjy.E)) {
                                        obj2 = wjy.NEW_LINE;
                                    } else if (qjy.a(jC9, qjy.s)) {
                                        obj2 = wjy.DELETE_PREV_CHAR;
                                    } else if (qjy.a(jC9, qjy.t)) {
                                        obj2 = wjy.DELETE_NEXT_CHAR;
                                    } else if (qjy.a(jC9, qjy.A)) {
                                        obj2 = wjy.PASTE;
                                    } else if (qjy.a(jC9, qjy.y)) {
                                        obj2 = wjy.CUT;
                                    } else if (qjy.a(jC9, qjy.z)) {
                                        obj2 = wjy.COPY;
                                    } else if (qjy.a(jC9, qjy.p)) {
                                        obj2 = wjy.TAB;
                                    }
                                }
                                r8 = obj2;
                            }
                        }
                    }
                    if (r8 != 0 && (!r8.f39284a || z2)) {
                        hie0 hie0Var = new hie0();
                        hie0Var.f13108a = true;
                        nej0 nej0Var = new nej0((Object) r8, (Object) u6q0Var, (Object) hie0Var, (byte) 21);
                        a8q0 a8q0Var = u6q0Var.c;
                        z6q0 z6q0Var = new z6q0(a8q0Var, u6q0Var.g, u6q0Var.f35150a.d(), n9q0Var);
                        nej0Var.invoke(z6q0Var);
                        boolean zB = o9q0.b(z6q0Var.f, a8q0Var.b);
                        j83 j83Var = z6q0Var.g;
                        if (!zB || !Intrinsics.d(j83Var, a8q0Var.f440a)) {
                            u6q0Var.j.invoke(a8q0.a(a8q0Var, j83Var, z6q0Var.f, 4));
                        }
                        u6q0Var.h.e = true;
                        z = hie0Var.f13108a;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                ((juc) this.receiver).setTextColor(((Number) obj).intValue());
                return Unit.f46060a;
            case 2:
                ((nbq0) this.receiver).c.o(null, new ibq0(((Number) obj).intValue()));
                return Unit.f46060a;
            case 3:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((oeq0) this.receiver).w(th);
                return Unit.f46060a;
            case 4:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((oeq0) this.receiver).w(th2);
                return Unit.f46060a;
            case 5:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((oeq0) this.receiver).w(th3);
                return Unit.f46060a;
            case 6:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((oeq0) this.receiver).w(th4);
                return Unit.f46060a;
            case 7:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((wfq0) this.receiver).z(th5);
                return Unit.f46060a;
            case 8:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((wfq0) this.receiver).z(th6);
                return Unit.f46060a;
            case 9:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((wfq0) this.receiver).z(th7);
                return Unit.f46060a;
            case 10:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((wfq0) this.receiver).z(th8);
                return Unit.f46060a;
            case 11:
                ygq0 ygq0Var = (ygq0) obj;
                ygq0Var.getClass();
                fhq0 fhq0Var = (fhq0) this.receiver;
                m6m0 m6m0Var = fhq0.q2;
                fhq0Var.T0(ygq0Var);
                return Unit.f46060a;
            case 12:
                giq0 giq0Var = (giq0) obj;
                giq0Var.getClass();
                diq0 diq0Var = (diq0) this.receiver;
                g9m0 g9m0Var = diq0.b2;
                diq0Var.getClass();
                if (!giq0Var.equals(giq0.f11362a)) {
                    t9f.b();
                    return null;
                }
                j120.g0(diq0Var.o0(), i120.U());
                diq0Var.z0(false, false, false);
                ((k3t0) diq0Var.a2.getValue()).x(xhq0.f40908a);
                return Unit.f46060a;
            case 13:
                wjq0 wjq0Var = (wjq0) obj;
                wjq0Var.getClass();
                ((k3t0) this.receiver).x(wjq0Var);
                return Unit.f46060a;
            case 14:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((duj) this.receiver).a(th9);
                return Unit.f46060a;
            case 15:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((xtq0) this.receiver).y(th10);
                return Unit.f46060a;
            case 16:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((xtq0) this.receiver).y(th11);
                return Unit.f46060a;
            case 17:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((xtq0) this.receiver).y(th12);
                return Unit.f46060a;
            case 18:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((xtq0) this.receiver).y(th13);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((xtq0) this.receiver).y(th14);
                return Unit.f46060a;
            case 20:
                g5r0 g5r0Var = (g5r0) obj;
                g5r0Var.getClass();
                b5r0 b5r0Var = (b5r0) this.receiver;
                j6m0 j6m0Var = b5r0.t2;
                b5r0Var.getClass();
                if (g5r0Var instanceof d5r0) {
                    sjd sjdVar = ((d5r0) g5r0Var).f5521a;
                    if (sjdVar.equals(qjd.f28832a)) {
                        qek0 qek0Var = qek0.f28589a;
                        String strH = b5r0Var.H(R.string.favorites_subscribe_snackbar);
                        strH.getClass();
                        b5r0Var.R0(new xdk0(qek0Var, strH, null, null, null, Integer.valueOf(R.drawable.ic_glyph_favourite_active), 92));
                    } else if (sjdVar instanceof rjd) {
                        rek0 rek0Var = rek0.b;
                        String strH2 = b5r0Var.H(((rjd) sjdVar).f30586a);
                        strH2.getClass();
                        b5r0Var.R0(new xdk0(rek0Var, strH2, null, null, null, null, 124));
                    } else if (sjdVar instanceof njd) {
                        ?? W = b5r0Var.P0().o.w();
                        x1x.x(W);
                        njd njdVar = (njd) sjdVar;
                        aud audVar = njdVar.f23629a;
                        Dialog dialog = b5r0Var.S1;
                        if (dialog != null && (window = dialog.getWindow()) != null) {
                            obj2 = (ViewGroup) window.findViewById(android.R.id.content);
                        }
                        W.a(b5r0Var, audVar, obj2, null, null, njdVar.b, true, new ks2(), -1L, "");
                    } else {
                        ujd ujdVarD = b5r0Var.P0().c.d();
                        x1x.x(ujdVarD);
                        ujdVarD.b(b5r0Var, sjdVar);
                    }
                } else if (g5r0Var instanceof c5r0) {
                    b5r0Var.m2 = true;
                    b5r0Var.y0();
                } else if (g5r0Var instanceof e5r0) {
                    ndk0 ndk0Var = b5r0Var.o2;
                    if (ndk0Var != null) {
                        ndk0Var.dismiss();
                    }
                } else {
                    if (!(g5r0Var instanceof f5r0)) {
                        t9f.b();
                        return null;
                    }
                    b5r0Var.R0(((f5r0) g5r0Var).f8977a);
                }
                b5r0Var.Q0().x(k4r0.f17682a);
                return Unit.f46060a;
            case 21:
                t4r0 t4r0Var = (t4r0) obj;
                t4r0Var.getClass();
                ((k3t0) this.receiver).x(t4r0Var);
                return Unit.f46060a;
            case 22:
                v6r0 v6r0Var = (v6r0) obj;
                v6r0Var.getClass();
                r6r0 r6r0Var = (r6r0) this.receiver;
                s2m0 s2m0Var = r6r0.S1;
                if (v6r0Var instanceof u6r0) {
                    ujd ujdVar = r6r0Var.L1;
                    if (ujdVar == null) {
                        Intrinsics.h("composeGameCardFragmentDelegate");
                        throw null;
                    }
                    ujdVar.b(r6r0Var, ((u6r0) v6r0Var).f35152a);
                } else {
                    r6r0Var.getClass();
                    if (!v6r0Var.equals(t6r0.f33433a)) {
                        t9f.b();
                        return null;
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new b1(r6r0Var.o0(), r6r0Var.q0().getWindowToken(), new t32((byte) 28), (byte) 2), 0L);
                }
                r6r0Var.G0().x(a6r0.f331a);
                return Unit.f46060a;
            case 23:
                n6r0 n6r0Var = (n6r0) obj;
                n6r0Var.getClass();
                ((k3t0) this.receiver).x(n6r0Var);
                return Unit.f46060a;
            case 24:
                n9r0 n9r0Var = (n9r0) obj;
                n9r0Var.getClass();
                ((k3t0) this.receiver).x(n9r0Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                n9r0 n9r0Var2 = (n9r0) obj;
                n9r0Var2.getClass();
                ((k3t0) this.receiver).x(n9r0Var2);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                n9r0 n9r0Var3 = (n9r0) obj;
                n9r0Var3.getClass();
                ((k3t0) this.receiver).x(n9r0Var3);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gbr0 gbr0Var = (gbr0) obj;
                gbr0Var.getClass();
                ((k3t0) this.receiver).x(gbr0Var);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                nbr0 nbr0Var = (nbr0) obj;
                nbr0Var.getClass();
                ((k3t0) this.receiver).x(nbr0Var);
                return Unit.f46060a;
            default:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                edr0 edr0Var = (edr0) this.receiver;
                p7m0 p7m0Var = edr0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    dbr0Var = (dbr0) value;
                    edr0Var.f.getClass();
                } while (!p7m0Var.m(value, dbr0.a(dbr0Var, false, null, new qar0(th15 instanceof ff5 ? par0.c : par0.b, dbr0Var.f.b), null, 443)));
                return Unit.f46060a;
        }
    }
}
