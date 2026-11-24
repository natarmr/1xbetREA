package a;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ix2 extends lm40 implements z29, qai0, lky, v6z, hps0 {
    public final m51 o = new m51(this, 26);
    public final /* synthetic */ AndroidComposeView p;

    public ix2(AndroidComposeView androidComposeView) {
        this.p = androidComposeView;
    }

    @Override // a.z29
    public final Object a0(s460 s460Var, gj4 gj4Var, zje zjeVar) {
        long jY = s460Var.Y(0L);
        jge0 jge0Var = (jge0) gj4Var.invoke();
        jge0 jge0VarM = jge0Var != null ? jge0Var.m(jY) : null;
        if (jge0VarM != null) {
            this.p.requestRectangleOnScreen(e9x.V(jge0VarM), false);
        }
        return Unit.f46060a;
    }

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        pu90 pu90VarS = pj30Var.S(j);
        int i = pu90VarS.f27604a;
        int i2 = pu90VarS.b;
        y1 y1Var = new y1(pu90VarS, (byte) 3);
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        return vj30Var.D0(i, i2, lunVar, this.o, y1Var);
    }

    @Override // a.lky
    public final boolean c0(KeyEvent keyEvent) {
        return false;
    }

    @Override // a.hps0
    public final Object j() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:125:0x0207  */
    /* JADX WARN: Code duplicated, block: B:127:0x0218  */
    @Override // a.lky
    public final boolean l0(KeyEvent keyEvent) {
        final jpq jpqVar;
        Boolean boolG;
        int[] iArr = spq.f32599a;
        long jC = n7x.C(keyEvent);
        final byte b = 1;
        final char c = 2;
        if (qjy.a(jC, qjy.b)) {
            jpqVar = new jpq(2);
        } else if (qjy.a(jC, qjy.c)) {
            jpqVar = new jpq(1);
        } else if (qjy.a(jC, qjy.p)) {
            jpqVar = new jpq(keyEvent.isShiftPressed() ? 2 : 1);
        } else if (qjy.a(jC, qjy.g)) {
            jpqVar = new jpq(4);
        } else if (qjy.a(jC, qjy.f)) {
            jpqVar = new jpq(3);
        } else if (qjy.a(jC, qjy.d) || qjy.a(jC, qjy.C)) {
            jpqVar = new jpq(5);
        } else if (qjy.a(jC, qjy.e) || qjy.a(jC, qjy.D)) {
            jpqVar = new jpq(6);
        } else if (qjy.a(jC, qjy.h) || qjy.a(jC, qjy.r) || qjy.a(jC, qjy.E)) {
            jpqVar = new jpq(7);
        } else {
            jpqVar = (qjy.a(jC, qjy.f28862a) || qjy.a(jC, qjy.u)) ? new jpq(8) : null;
        }
        boolean z = false;
        if (jpqVar != null) {
            int i = jpqVar.f16914a;
            if (n7x.H(keyEvent) == 2) {
                boolean z2 = ebc.f7512a;
                AndroidComposeView androidComposeView = this.p;
                if (z2) {
                    nqq nqqVarH = ((ypq) androidComposeView.getFocusOwner()).h();
                    if (nqqVarH != null && nqqVarH.o && androidComposeView.u(i)) {
                        androidComposeView.getPlayNavigationSoundEffect$ui().invoke(jpqVar, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                        return true;
                    }
                    jge0 embeddedViewFocusRect = androidComposeView.getEmbeddedViewFocusRect();
                    wpq focusOwner = androidComposeView.getFocusOwner();
                    final byte b2 = z ? (byte) 1 : (byte) 0;
                    Boolean boolG2 = ((ypq) focusOwner).g(i, embeddedViewFocusRect, new Function1() { // from class: a.hx2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            boolean zH1;
                            byte b3 = b2;
                            jpq jpqVar2 = jpqVar;
                            nqq nqqVar = (nqq) obj;
                            switch (b3) {
                                case 0:
                                    zH1 = nqqVar.h1(jpqVar2.f16914a);
                                    break;
                                case 1:
                                    zH1 = nqqVar.h1(jpqVar2.f16914a);
                                    break;
                                default:
                                    zH1 = nqqVar.h1(jpqVar2.f16914a);
                                    break;
                            }
                            return Boolean.valueOf(zH1);
                        }
                    });
                    if (boolG2 != null) {
                        if (boolG2.booleanValue()) {
                            androidComposeView.getPlayNavigationSoundEffect$ui().invoke(jpqVar, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                            return true;
                        }
                        if (i != 1 && i != 2) {
                            return false;
                        }
                        Integer numC = spq.c(i);
                        int iIntValue = numC != null ? numC.intValue() : 2;
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View rootView = androidComposeView.getRootView();
                        rootView.getClass();
                        View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, androidComposeView.getView(), iIntValue);
                        if (viewFindNextFocus == null || viewFindNextFocus.equals(androidComposeView)) {
                            return ((ypq) androidComposeView.getFocusOwner()).j(i);
                        }
                    }
                } else {
                    Integer numC2 = spq.c(i);
                    jge0 embeddedViewFocusRect2 = androidComposeView.getEmbeddedViewFocusRect();
                    Boolean boolG3 = ((ypq) androidComposeView.getFocusOwner()).g(i, embeddedViewFocusRect2, new Function1() { // from class: a.hx2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            boolean zH1;
                            byte b3 = b;
                            jpq jpqVar2 = jpqVar;
                            nqq nqqVar = (nqq) obj;
                            switch (b3) {
                                case 0:
                                    zH1 = nqqVar.h1(jpqVar2.f16914a);
                                    break;
                                case 1:
                                    zH1 = nqqVar.h1(jpqVar2.f16914a);
                                    break;
                                default:
                                    zH1 = nqqVar.h1(jpqVar2.f16914a);
                                    break;
                            }
                            return Boolean.valueOf(zH1);
                        }
                    });
                    if (boolG3 != null) {
                        if (boolG3.booleanValue()) {
                            androidComposeView.getPlayNavigationSoundEffect$ui().invoke(jpqVar, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                            return true;
                        }
                        if (i != 1 && i != 2) {
                            return false;
                        }
                        if (numC2 != null) {
                            int iIntValue2 = numC2.intValue();
                            FocusFinder focusFinder2 = FocusFinder.getInstance();
                            View viewFindNextFocus2 = androidComposeView;
                            while (true) {
                                if (viewFindNextFocus2 == null) {
                                    viewFindNextFocus2 = null;
                                    break;
                                }
                                View rootView2 = androidComposeView.getRootView();
                                rootView2.getClass();
                                viewFindNextFocus2 = focusFinder2.findNextFocus((ViewGroup) rootView2, viewFindNextFocus2, iIntValue2);
                                if (viewFindNextFocus2 != null && !cy2.y(androidComposeView, viewFindNextFocus2)) {
                                    break;
                                }
                            }
                            if (Intrinsics.d(viewFindNextFocus2, androidComposeView)) {
                                viewFindNextFocus2 = null;
                            }
                            if (viewFindNextFocus2 != null) {
                                Rect rectV = embeddedViewFocusRect2 != null ? e9x.V(embeddedViewFocusRect2) : null;
                                if (rectV == null) {
                                    throw cs0.g("Invalid rect");
                                }
                                View rootView3 = androidComposeView.getRootView();
                                rootView3.getClass();
                                ViewGroup viewGroup = (ViewGroup) rootView3;
                                viewGroup.offsetDescendantRectToMyCoords(androidComposeView.getView(), rectV);
                                viewGroup.offsetRectIntoDescendantCoords(viewFindNextFocus2, rectV);
                                if (!spq.b(viewFindNextFocus2, numC2, rectV)) {
                                    if (((ypq) androidComposeView.getFocusOwner()).d(i, false, false)) {
                                        boolG = ((ypq) androidComposeView.getFocusOwner()).g(i, null, new Function1() { // from class: a.hx2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                boolean zH1;
                                                byte b3 = c;
                                                jpq jpqVar2 = jpqVar;
                                                nqq nqqVar = (nqq) obj;
                                                switch (b3) {
                                                    case 0:
                                                        zH1 = nqqVar.h1(jpqVar2.f16914a);
                                                        break;
                                                    case 1:
                                                        zH1 = nqqVar.h1(jpqVar2.f16914a);
                                                        break;
                                                    default:
                                                        zH1 = nqqVar.h1(jpqVar2.f16914a);
                                                        break;
                                                }
                                                return Boolean.valueOf(zH1);
                                            }
                                        });
                                        if (boolG != null) {
                                            return boolG.booleanValue();
                                        }
                                    }
                                }
                            } else if (((ypq) androidComposeView.getFocusOwner()).d(i, false, false)) {
                                boolG = ((ypq) androidComposeView.getFocusOwner()).g(i, null, new Function1() { // from class: a.hx2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        boolean zH1;
                                        byte b3 = c;
                                        jpq jpqVar2 = jpqVar;
                                        nqq nqqVar = (nqq) obj;
                                        switch (b3) {
                                            case 0:
                                                zH1 = nqqVar.h1(jpqVar2.f16914a);
                                                break;
                                            case 1:
                                                zH1 = nqqVar.h1(jpqVar2.f16914a);
                                                break;
                                            default:
                                                zH1 = nqqVar.h1(jpqVar2.f16914a);
                                                break;
                                        }
                                        return Boolean.valueOf(zH1);
                                    }
                                });
                                if (boolG != null) {
                                    return boolG.booleanValue();
                                }
                            }
                        } else if (((ypq) androidComposeView.getFocusOwner()).d(i, false, false)) {
                            boolG = ((ypq) androidComposeView.getFocusOwner()).g(i, null, new Function1() { // from class: a.hx2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    boolean zH1;
                                    byte b3 = c;
                                    jpq jpqVar2 = jpqVar;
                                    nqq nqqVar = (nqq) obj;
                                    switch (b3) {
                                        case 0:
                                            zH1 = nqqVar.h1(jpqVar2.f16914a);
                                            break;
                                        case 1:
                                            zH1 = nqqVar.h1(jpqVar2.f16914a);
                                            break;
                                        default:
                                            zH1 = nqqVar.h1(jpqVar2.f16914a);
                                            break;
                                    }
                                    return Boolean.valueOf(zH1);
                                }
                            });
                            if (boolG != null) {
                                return boolG.booleanValue();
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // a.qai0
    public final void x0(abi0 abi0Var) {
    }
}
