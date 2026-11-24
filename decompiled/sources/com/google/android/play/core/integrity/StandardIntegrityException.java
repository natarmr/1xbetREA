package com.google.android.play.core.integrity;

import a.jf4;
import a.qa3;
import android.gov.nist.core.Separators;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class StandardIntegrityException extends qa3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f45587a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardIntegrityException(int i, Throwable th) {
        super(new Status(i, defpackage.c.b(i, "Standard Integrity API error (", "): ", com.google.android.play.core.integrity.model.b.a(i), Separators.DOT), null, null));
        Locale locale = Locale.ROOT;
        if (i != 0) {
            this.f45587a = th;
        } else {
            jf4.o("ErrorCode should not be 0.");
            throw null;
        }
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f45587a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
