package org.xplatform.core.navigation.dialog;

import a.m1r;
import a.of80;
import a.xbf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"org/xplatform/core/navigation/dialog/DialogScreen$Companion$invoke$1", "Lorg/xplatform/core/navigation/dialog/DialogScreen;", "navigation"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DialogScreen$Companion$invoke$1 implements DialogScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46460a;
    public final /* synthetic */ xbf b;

    public DialogScreen$Companion$invoke$1(String str, xbf xbfVar) {
        this.b = xbfVar;
        this.f46460a = str == null ? xbfVar.getClass().getName() : str;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF46460a() {
        return this.f46460a;
    }

    @Override // org.xplatform.core.navigation.dialog.DialogScreen
    public final of80 d(m1r m1rVar) {
        m1rVar.getClass();
        return (of80) this.b.c(m1rVar);
    }
}
