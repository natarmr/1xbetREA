package a;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public class q860 implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final adw f28285a;
    public hge0 b;

    public q860(hge0 hge0Var, adw adwVar) {
        this.f28285a = adwVar;
        this.b = hge0Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() throws Exception {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            if (hge0Var != null) {
                hge0Var.closeConnection();
                this.b = null;
            }
            this.f28285a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        hge0 hge0Var = this.b;
        if (hge0Var != null) {
            return hge0Var.setSelection(i, i2);
        }
        return false;
    }
}
