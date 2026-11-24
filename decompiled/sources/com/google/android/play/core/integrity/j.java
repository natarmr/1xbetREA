package com.google.android.play.core.integrity;

import a.qa3;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements k {
    @Override // com.google.android.play.core.integrity.k
    public final qa3 a(Bundle bundle) {
        int i = bundle.getInt("error");
        if (i == 0) {
            return null;
        }
        return new StandardIntegrityException(i, null);
    }
}
