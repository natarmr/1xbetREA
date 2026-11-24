package com.google.android.play.core.integrity;

import a.hny;
import a.jf4;

/* JADX INFO: loaded from: classes2.dex */
final class b extends bq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45610a;
    private y b;

    @Override // com.google.android.play.core.integrity.bq
    public final bq a(y yVar) {
        this.b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final bq b(String str) {
        if (str != null) {
            this.f45610a = str;
            return this;
        }
        hny.u("Null token");
        return null;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final br c() {
        y yVar;
        String str = this.f45610a;
        if (str != null && (yVar = this.b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f45610a == null) {
            sb.append(" token");
        }
        if (this.b == null) {
            sb.append(" integrityDialogWrapper");
        }
        jf4.n("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
