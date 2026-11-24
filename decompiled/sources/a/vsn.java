package a;

import android.text.Editable;

/* JADX INFO: loaded from: classes4.dex */
public final class vsn extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f37958a = new Object();
    public static volatile vsn b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new ymk0(cls, charSequence) : super.newEditable(charSequence);
    }
}
