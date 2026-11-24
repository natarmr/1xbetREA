package a;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class btt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vwb0 f3200a;
    public final AtomicReference b = new AtomicReference("");

    public btt0(vwb0 vwb0Var) {
        this.f3200a = vwb0Var;
    }

    public final String a() {
        AtomicReference atomicReference = this.b;
        CharSequence charSequenceC = (CharSequence) atomicReference.get();
        if (charSequenceC.length() == 0) {
            charSequenceC = this.f3200a.c("new_user_token", "");
            atomicReference.set(charSequenceC);
        }
        String str = (String) charSequenceC;
        return (kotlin.text.c.x(str, "Bearer", false) || str.length() == 0) ? str : "Bearer ".concat(str);
    }

    public final void b(String str) {
        str.getClass();
        if (!kotlin.text.c.x(str, "Bearer", false)) {
            str = "Bearer ".concat(str);
        }
        this.b.set(str);
        this.f3200a.h("new_user_token", str);
    }
}
