package org.xplatform.alerts_pipe_api.presentation;

import a.t9f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e {
    public static final int a(AlertsPipeType alertsPipeType) {
        alertsPipeType.getClass();
        if (alertsPipeType instanceof AlertsPipeType.UserAgreementDocumentsDialog) {
            return 0;
        }
        if (Intrinsics.d(alertsPipeType, AlertsPipeType.IdentificationAlertKzAlert.f46312a)) {
            return 1;
        }
        if (Intrinsics.d(alertsPipeType, AlertsPipeType.KzFirstDepositBottom.f46313a)) {
            return 2;
        }
        if (alertsPipeType instanceof AlertsPipeType.NotIdentifiedKzAlert) {
            return 3;
        }
        t9f.b();
        return 0;
    }
}
