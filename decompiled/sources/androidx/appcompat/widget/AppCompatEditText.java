package androidx.appcompat.widget;

import a.ad3;
import a.aem0;
import a.chf0;
import a.ehf0;
import a.fp;
import a.ga3;
import a.jaq0;
import a.lex;
import a.mex;
import a.nnw0;
import a.oe3;
import a.oee;
import a.pe3;
import a.pee;
import a.phu0;
import a.prc;
import a.ree;
import a.rgu0;
import a.ud3;
import a.viq;
import a.ybq0;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fp f45290a;
    public final pe3 b;
    public final ehf0 c;
    public final jaq0 d;
    public final chf0 e;
    public ud3 f;
    public oe3 g;

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ybq0.a(this, getContext());
        fp fpVar = new fp(this);
        this.f45290a = fpVar;
        fpVar.A(attributeSet, i);
        pe3 pe3Var = new pe3(this);
        this.b = pe3Var;
        pe3Var.h(attributeSet, i);
        pe3Var.b();
        ehf0 ehf0Var = new ehf0((byte) 7, false);
        ehf0Var.b = this;
        this.c = ehf0Var;
        this.d = new jaq0();
        chf0 chf0Var = new chf0(this);
        this.e = chf0Var;
        chf0Var.S(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerH = chf0Var.H(keyListener);
        if (keyListenerH == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerH);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private ud3 getSuperCaller() {
        ud3 ud3Var = this.f;
        if (ud3Var != null) {
            return ud3Var;
        }
        ud3 ud3Var2 = new ud3(this);
        this.f = ud3Var2;
        return ud3Var2;
    }

    public final ree c(ree reeVar) {
        this.d.getClass();
        return jaq0.a(this, reeVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fp fpVar = this.f45290a;
        if (fpVar != null) {
            fpVar.c();
        }
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            pe3Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return aem0.z(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().e;
    }

    public oe3 getFontVariationSettingsManager() {
        oe3 oe3Var = this.g;
        if (oe3Var != null) {
            return oe3Var;
        }
        oe3 oe3Var2 = new oe3(this, new ad3(this, (byte) 1));
        this.g = oe3Var2;
        return oe3Var2;
    }

    public ColorStateList getSupportBackgroundTintList() {
        fp fpVar = this.f45290a;
        if (fpVar != null) {
            return fpVar.x();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fp fpVar = this.f45290a;
        if (fpVar != null) {
            return fpVar.y();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.g();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        ehf0 ehf0Var;
        if (Build.VERSION.SDK_INT >= 28 || (ehf0Var = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) ehf0Var.c;
        return textClassifier == null ? ga3.k((TextView) ehf0Var.b) : textClassifier;
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().c : super.getTypeface();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e A[PHI: r1
  0x005e: PHI (r1v9 java.lang.String[]) = (r1v4 java.lang.String[]), (r1v10 java.lang.String[]) binds: [B:33:0x0071, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrH;
        String[] stringArray;
        InputConnection mexVar;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            nnw0.H(editorInfo, getText());
        }
        phu0.T(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrH = rgu0.h(this)) != null) {
            if (i >= 25) {
                editorInfo.contentMimeTypes = strArrH;
            } else {
                Bundle bundle = editorInfo.extras;
                if (bundle == null) {
                    bundle = new Bundle();
                    editorInfo.extras = bundle;
                }
                bundle.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrH);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrH);
            }
            viq viqVar = new viq(this, (byte) 11);
            if (i >= 25) {
                mexVar = new lex(inputConnectionOnCreateInputConnection, viqVar);
            } else {
                String[] strArr = nnw0.j;
                if (i >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                } else {
                    Bundle bundle2 = editorInfo.extras;
                    if (bundle2 != null) {
                        stringArray = bundle2.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                            strArr = stringArray;
                        }
                    }
                }
                if (strArr.length != 0) {
                    mexVar = new mex(inputConnectionOnCreateInputConnection, viqVar);
                }
            }
            inputConnectionOnCreateInputConnection = mexVar;
        }
        return this.e.b0(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        oee prcVar;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && rgu0.h(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                activity.requestDragAndDropPermissions(dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    Selection.setSelection((Spannable) getText(), offsetForPosition);
                    ClipData clipData = dragEvent.getClipData();
                    if (Build.VERSION.SDK_INT >= 31) {
                        prcVar = new prc(clipData, 3);
                    } else {
                        pee peeVar = new pee();
                        peeVar.b = clipData;
                        peeVar.c = (byte) 3;
                        prcVar = peeVar;
                    }
                    rgu0.k(this, prcVar.build());
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        oee prcVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || rgu0.h(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                prcVar = new prc(primaryClip, 1);
            } else {
                pee peeVar = new pee();
                peeVar.b = primaryClip;
                peeVar.c = (byte) 1;
                prcVar = peeVar;
            }
            prcVar.h(i == 16908322 ? 0 : 1);
            rgu0.k(this, prcVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fp fpVar = this.f45290a;
        if (fpVar != null) {
            fpVar.C();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fp fpVar = this.f45290a;
        if (fpVar != null) {
            fpVar.D(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            pe3Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            pe3Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(aem0.A(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.e.e0(z);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().a(str);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.H(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fp fpVar = this.f45290a;
        if (fpVar != null) {
            fpVar.P(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fp fpVar = this.f45290a;
        if (fpVar != null) {
            fpVar.Q(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        pe3 pe3Var = this.b;
        pe3Var.m(colorStateList);
        pe3Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        pe3 pe3Var = this.b;
        pe3Var.n(mode);
        pe3Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        pe3 pe3Var = this.b;
        if (pe3Var != null) {
            pe3Var.i(i, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        ehf0 ehf0Var;
        if (Build.VERSION.SDK_INT >= 28 || (ehf0Var = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            ehf0Var.c = textClassifier;
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT < 26) {
            super.setTypeface(typeface);
            return;
        }
        oe3 fontVariationSettingsManager = getFontVariationSettingsManager();
        fontVariationSettingsManager.c = typeface;
        fontVariationSettingsManager.d = typeface;
        fontVariationSettingsManager.b.accept(typeface);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ CharSequence getText() {
        return getText();
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }
}
