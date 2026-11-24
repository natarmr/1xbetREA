package com.google.android.play.core.integrity;

import a.jf4;

/* JADX INFO: loaded from: classes2.dex */
final class a extends ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45588a;
    private y b;

    @Override // com.google.android.play.core.integrity.ap
    public final ap a(y yVar) {
        this.b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final ap b(String str) {
        this.f45588a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final aq c() {
        y yVar;
        String str = this.f45588a;
        if (str != null && (yVar = this.b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f45588a == null) {
            sb.append(" token");
        }
        if (this.b == null) {
            sb.append(" integrityDialogWrapper");
        }
        jf4.n("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
