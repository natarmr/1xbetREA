package a;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.xplatform.uikit.components.search_field.DsSearchField;

/* JADX INFO: loaded from: classes6.dex */
public final class upm implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0l f36072a;
    public final /* synthetic */ vpm b;
    public final /* synthetic */ DsSearchField c;
    public final /* synthetic */ TextWatcher d;

    public upm(k0l k0lVar, vpm vpmVar, DsSearchField dsSearchField, TextWatcher textWatcher) {
        this.f36072a = k0lVar;
        this.b = vpmVar;
        this.c = dsSearchField;
        this.d = textWatcher;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f36072a.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.j(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            Character chValueOf = charSequence.length() == 0 ? null : Character.valueOf(charSequence.charAt(0));
            if (chValueOf != null && CharsKt.d(chValueOf.charValue())) {
                this.c.getEditText().setText(StringsKt.c0(charSequence));
                return;
            }
        }
        this.d.onTextChanged(charSequence, i, i2, i3);
    }
}
