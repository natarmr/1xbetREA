package a;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class nqt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbt f23973a;

    public nqt(pbt pbtVar) {
        pbtVar.getClass();
        this.f23973a = pbtVar;
    }

    public final w05 a() {
        String string = ((SharedPreferences) this.f23973a.b.f20589a).getString("autoSpinAmount", "AUTOSPIN_5");
        return w05.valueOf(string != null ? string : "AUTOSPIN_5");
    }
}
