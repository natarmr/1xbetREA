package a;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class lex extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ viq f19926a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lex(InputConnection inputConnection, viq viqVar) {
        super(inputConnection, false);
        this.f19926a = viqVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        hnu hnuVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            hnuVar = new hnu(new nex(inputContentInfo));
        }
        if (this.f19926a.h(hnuVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
