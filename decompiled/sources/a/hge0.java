package a;

import android.R;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class hge0 implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final svu f13015a;
    public final boolean b;
    public final djz c;
    public final k7q0 d;
    public final wgu0 e;
    public int f;
    public a8q0 g;
    public int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public boolean k = true;

    public hge0(a8q0 a8q0Var, svu svuVar, boolean z, djz djzVar, k7q0 k7q0Var, wgu0 wgu0Var) {
        this.f13015a = svuVar;
        this.b = z;
        this.c = djzVar;
        this.d = k7q0Var;
        this.e = wgu0Var;
        this.g = a8q0Var;
    }

    public final void a(vjn vjnVar) {
        this.f++;
        try {
            this.j.add(vjnVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                ((ejz) this.f13015a.f32888a).c.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        this.f++;
        return true;
    }

    public final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.f = 0;
        this.k = false;
        ArrayList arrayList = ((ejz) this.f13015a.f32888a).j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.d(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.k;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new l8d(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new g6k(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new h6k(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new bfq());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        a8q0 a8q0Var = this.g;
        return TextUtils.getCapsMode(a8q0Var.f440a.b, o9q0.f(a8q0Var.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.i = z;
        if (z) {
            this.h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return d9x.V(this.g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (o9q0.c(this.g.b)) {
            return null;
        }
        return lvm0.h(this.g).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return lvm0.i(this.g, i).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return lvm0.j(this.g, i).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new fsi0(0, this.g.f440a.b.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.k;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            ((ejz) this.f13015a.f32888a).d.invoke(new j3x(i2));
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0268  */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        j83 j83Var;
        long jH;
        int i;
        b9q0 b9q0VarD;
        b9q0 b9q0VarD2;
        z8q0 z8q0Var;
        if (Build.VERSION.SDK_INT >= 34) {
            v6d0 v6d0Var = new v6d0(this, (byte) 24);
            djz djzVar = this.c;
            int iW = 3;
            if (djzVar != null && (j83Var = djzVar.j) != null) {
                b9q0 b9q0VarD3 = djzVar.d();
                if (j83Var.equals((b9q0VarD3 == null || (z8q0Var = b9q0VarD3.f2224a.f491a) == null) ? null : z8q0Var.f43981a)) {
                    boolean zS = dwf.s(handwritingGesture);
                    k7q0 k7q0Var = this.d;
                    if (zS) {
                        SelectGesture selectGestureL = dwf.l(handwritingGesture);
                        long jN = bkb.N(djzVar, e9x.Y(selectGestureL.getSelectionArea()), selectGestureL.getGranularity() == 1 ? 1 : 0);
                        if (o9q0.c(jN)) {
                            iW = zjb.w(dwf.h(selectGestureL), v6d0Var);
                        } else {
                            v6d0Var.invoke(new fsi0((int) (jN >> 32), (int) (jN & 4294967295L)));
                            if (k7q0Var != null) {
                                k7q0Var.e(true);
                            }
                            iW = 1;
                        }
                    } else if (mmv.y(handwritingGesture)) {
                        DeleteGesture deleteGestureM = mmv.m(handwritingGesture);
                        int i2 = deleteGestureM.getGranularity() != 1 ? 0 : 1;
                        long jN2 = bkb.N(djzVar, e9x.Y(deleteGestureM.getDeletionArea()), i2);
                        if (o9q0.c(jN2)) {
                            iW = zjb.w(dwf.h(deleteGestureM), v6d0Var);
                        } else {
                            zjb.K(jN2, j83Var, i2 == 1, v6d0Var);
                            iW = 1;
                        }
                    } else if (mmv.C(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureP = mmv.p(handwritingGesture);
                        long jO = bkb.O(djzVar, e9x.Y(selectRangeGestureP.getSelectionStartArea()), e9x.Y(selectRangeGestureP.getSelectionEndArea()), selectRangeGestureP.getGranularity() == 1 ? 1 : 0);
                        if (o9q0.c(jO)) {
                            iW = zjb.w(dwf.h(selectRangeGestureP), v6d0Var);
                        } else {
                            v6d0Var.invoke(new fsi0((int) (jO >> 32), (int) (jO & 4294967295L)));
                            if (k7q0Var != null) {
                                k7q0Var.e(true);
                            }
                            iW = 1;
                        }
                    } else if (mmv.D(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureN = mmv.n(handwritingGesture);
                        int i3 = deleteRangeGestureN.getGranularity() != 1 ? 0 : 1;
                        long jO2 = bkb.O(djzVar, e9x.Y(deleteRangeGestureN.getDeletionStartArea()), e9x.Y(deleteRangeGestureN.getDeletionEndArea()), i3);
                        if (o9q0.c(jO2)) {
                            iW = zjb.w(dwf.h(deleteRangeGestureN), v6d0Var);
                        } else {
                            zjb.K(jO2, j83Var, i3 == 1, v6d0Var);
                            iW = 1;
                        }
                    } else {
                        boolean zA = dwf.A(handwritingGesture);
                        wgu0 wgu0Var = this.e;
                        if (zA) {
                            JoinOrSplitGesture joinOrSplitGestureJ = dwf.j(handwritingGesture);
                            if (wgu0Var == null) {
                                iW = zjb.w(mmv.o(joinOrSplitGestureJ), v6d0Var);
                            } else {
                                int iM = bkb.M(djzVar, bkb.s0(joinOrSplitGestureJ.getJoinOrSplitPoint()), wgu0Var);
                                if (iM == -1 || ((b9q0VarD2 = djzVar.d()) != null && bkb.X(b9q0VarD2.f2224a, iM))) {
                                    iW = zjb.w(dwf.h(joinOrSplitGestureJ), v6d0Var);
                                } else {
                                    int iCharCount = iM;
                                    while (iCharCount > 0) {
                                        int iCodePointBefore = Character.codePointBefore(j83Var, iCharCount);
                                        if (!bkb.a0(iCodePointBefore)) {
                                            break;
                                        } else {
                                            iCharCount -= Character.charCount(iCodePointBefore);
                                        }
                                    }
                                    while (iM < j83Var.b.length()) {
                                        int iCodePointAt = Character.codePointAt(j83Var, iM);
                                        if (!bkb.a0(iCodePointAt)) {
                                            break;
                                        } else {
                                            iM += Character.charCount(iCodePointAt);
                                        }
                                    }
                                    long jE = s7n0.e(iCharCount, iM);
                                    if (o9q0.c(jE)) {
                                        int i4 = (int) (jE >> 32);
                                        v6d0Var.invoke(new nmv(new vjn[]{new fsi0(i4, i4), new l8d(Separators.SP, 1)}));
                                    } else {
                                        zjb.K(jE, j83Var, false, v6d0Var);
                                    }
                                    iW = 1;
                                }
                            }
                        } else if (dwf.w(handwritingGesture)) {
                            InsertGesture insertGestureI = dwf.i(handwritingGesture);
                            if (wgu0Var == null) {
                                iW = zjb.w(mmv.o(insertGestureI), v6d0Var);
                            } else {
                                int iM2 = bkb.M(djzVar, bkb.s0(insertGestureI.getInsertionPoint()), wgu0Var);
                                if (iM2 == -1 || ((b9q0VarD = djzVar.d()) != null && bkb.X(b9q0VarD.f2224a, iM2))) {
                                    iW = zjb.w(dwf.h(insertGestureI), v6d0Var);
                                } else {
                                    v6d0Var.invoke(new nmv(new vjn[]{new fsi0(iM2, iM2), new l8d(insertGestureI.getTextToInsert(), 1)}));
                                    iW = 1;
                                }
                            }
                        } else if (dwf.y(handwritingGesture)) {
                            RemoveSpaceGesture removeSpaceGestureK = dwf.k(handwritingGesture);
                            b9q0 b9q0VarD4 = djzVar.d();
                            a9q0 a9q0Var = b9q0VarD4 != null ? b9q0VarD4.f2224a : null;
                            long jS0 = bkb.s0(removeSpaceGestureK.getStartPoint());
                            long jS1 = bkb.s0(removeSpaceGestureK.getEndPoint());
                            j6z j6zVarC = djzVar.c();
                            if (a9q0Var != null) {
                                bw40 bw40Var = a9q0Var.b;
                                if (j6zVarC == null) {
                                    jH = o9q0.b;
                                } else {
                                    long jC = j6zVarC.C(jS0);
                                    long jC2 = j6zVarC.C(jS1);
                                    int iL = bkb.L(bw40Var, jC, wgu0Var);
                                    int iL2 = bkb.L(bw40Var, jC2, wgu0Var);
                                    if (iL != -1) {
                                        if (iL2 != -1) {
                                            iL = Math.min(iL, iL2);
                                        }
                                        iL2 = iL;
                                    } else if (iL2 == -1) {
                                        jH = o9q0.b;
                                    }
                                    float fB = (bw40Var.b(iL2) + bw40Var.f(iL2)) / 2.0f;
                                    int i5 = (int) (jC >> 32);
                                    int i6 = (int) (jC2 >> 32);
                                    jH = bw40Var.h(new jge0(Math.min(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)), fB - 0.1f, Math.max(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)), fB + 0.1f), 0, qek0.d);
                                }
                            } else {
                                jH = o9q0.b;
                            }
                            if (o9q0.c(jH)) {
                                iW = zjb.w(dwf.h(removeSpaceGestureK), v6d0Var);
                            } else {
                                kie0 kie0Var = new kie0();
                                kie0Var.f18333a = -1;
                                kie0 kie0Var2 = new kie0();
                                kie0Var2.f18333a = -1;
                                String strH = new Regex("\\s+").h(j83Var.subSequence(o9q0.f(jH), o9q0.e(jH)).b, new f3s(kie0Var, kie0Var2, (byte) 19));
                                int i7 = kie0Var.f18333a;
                                if (i7 == -1 || (i = kie0Var2.f18333a) == -1) {
                                    iW = zjb.w(dwf.h(removeSpaceGestureK), v6d0Var);
                                } else {
                                    int i8 = (int) (jH >> 32);
                                    v6d0Var.invoke(new nmv(new vjn[]{new fsi0(i8 + i7, i8 + i), new l8d(strH.substring(i7, strH.length() - (o9q0.d(jH) - kie0Var2.f18333a)), 1)}));
                                    iW = 1;
                                }
                            }
                        } else {
                            iW = 2;
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new n23(intConsumer, iW, (byte) 1));
            } else {
                intConsumer.accept(iW);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        djz djzVar;
        j83 j83Var;
        z8q0 z8q0Var;
        if (Build.VERSION.SDK_INT >= 34 && (djzVar = this.c) != null && (j83Var = djzVar.j) != null) {
            b9q0 b9q0VarD = djzVar.d();
            if (j83Var.equals((b9q0VarD == null || (z8q0Var = b9q0VarD.f2224a.f491a) == null) ? null : z8q0Var.f43981a)) {
                boolean zS = dwf.s(previewableHandwritingGesture);
                byte b = 1;
                k7q0 k7q0Var = this.d;
                if (zS) {
                    SelectGesture selectGestureL = dwf.l(previewableHandwritingGesture);
                    if (k7q0Var != null) {
                        long jN = bkb.N(djzVar, e9x.Y(selectGestureL.getSelectionArea()), selectGestureL.getGranularity() != 1 ? 0 : 1);
                        djz djzVar2 = k7q0Var.d;
                        if (djzVar2 != null) {
                            djzVar2.f(jN);
                        }
                        djz djzVar3 = k7q0Var.d;
                        if (djzVar3 != null) {
                            djzVar3.e(o9q0.b);
                        }
                        if (!o9q0.c(jN)) {
                            k7q0Var.u(false);
                            k7q0Var.r(dmv.f6336a);
                        }
                    }
                } else if (mmv.y(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureM = mmv.m(previewableHandwritingGesture);
                    if (k7q0Var != null) {
                        long jN2 = bkb.N(djzVar, e9x.Y(deleteGestureM.getDeletionArea()), deleteGestureM.getGranularity() != 1 ? 0 : 1);
                        djz djzVar4 = k7q0Var.d;
                        if (djzVar4 != null) {
                            djzVar4.e(jN2);
                        }
                        djz djzVar5 = k7q0Var.d;
                        if (djzVar5 != null) {
                            djzVar5.f(o9q0.b);
                        }
                        if (!o9q0.c(jN2)) {
                            k7q0Var.u(false);
                            k7q0Var.r(dmv.f6336a);
                        }
                    }
                } else if (mmv.C(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureP = mmv.p(previewableHandwritingGesture);
                    if (k7q0Var != null) {
                        long jO = bkb.O(djzVar, e9x.Y(selectRangeGestureP.getSelectionStartArea()), e9x.Y(selectRangeGestureP.getSelectionEndArea()), selectRangeGestureP.getGranularity() != 1 ? 0 : 1);
                        djz djzVar6 = k7q0Var.d;
                        if (djzVar6 != null) {
                            djzVar6.f(jO);
                        }
                        djz djzVar7 = k7q0Var.d;
                        if (djzVar7 != null) {
                            djzVar7.e(o9q0.b);
                        }
                        if (!o9q0.c(jO)) {
                            k7q0Var.u(false);
                            k7q0Var.r(dmv.f6336a);
                        }
                    }
                } else if (mmv.D(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureN = mmv.n(previewableHandwritingGesture);
                    if (k7q0Var != null) {
                        long jO2 = bkb.O(djzVar, e9x.Y(deleteRangeGestureN.getDeletionStartArea()), e9x.Y(deleteRangeGestureN.getDeletionEndArea()), deleteRangeGestureN.getGranularity() != 1 ? 0 : 1);
                        djz djzVar8 = k7q0Var.d;
                        if (djzVar8 != null) {
                            djzVar8.e(jO2);
                        }
                        djz djzVar9 = k7q0Var.d;
                        if (djzVar9 != null) {
                            djzVar9.f(o9q0.b);
                        }
                        if (!o9q0.c(jO2)) {
                            k7q0Var.u(false);
                            k7q0Var.r(dmv.f6336a);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new hkd(k7q0Var, b));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0065 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x006b A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:44:0x005b, B:46:0x0065, B:48:0x006b, B:51:0x0071), top: B:57:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:57:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        viz vizVar;
        boolean z4 = this.k;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean z6 = (i & 1) != 0;
        boolean z7 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z8 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (z2 || z3 || z8 || z5) {
                z = z5;
                z5 = z8;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z5 = true;
                } else {
                    z = z5;
                    z5 = true;
                }
                z2 = z5;
            }
            vizVar = ((ejz) this.f13015a.f32888a).m;
            synchronized (vizVar.c) {
                try {
                    vizVar.f = z2;
                    vizVar.g = z3;
                    vizVar.h = z5;
                    vizVar.i = z;
                    if (z6) {
                        vizVar.e = true;
                        if (vizVar.j != null) {
                            vizVar.a();
                        }
                    }
                    vizVar.d = z7;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        vizVar = ((ejz) this.f13015a.f32888a).m;
        synchronized (vizVar.c) {
            vizVar.f = z2;
            vizVar.g = z3;
            vizVar.h = z5;
            vizVar.i = z;
            if (z6) {
                vizVar.e = true;
                if (vizVar.j != null) {
                    vizVar.a();
                }
            }
            vizVar.d = z7;
            return true;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((ejz) this.f13015a.f32888a).k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.k;
        if (z) {
            a(new doi0(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.k;
        if (z) {
            a(new eoi0(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.k;
        if (!z) {
            return z;
        }
        a(new fsi0(i, i2));
        return true;
    }
}
