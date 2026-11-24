package com.huawei.hms.hwid;

import a.fuo0;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;

/* JADX INFO: loaded from: classes2.dex */
public class al extends TaskApiCall<ai, Void> {
    public al(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(ai aiVar, ResponseErrorCode responseErrorCode, String str, fuo0 fuo0Var) {
        ag agVarB = ag.b(str);
        Integer numA = agVarB.a();
        String strB = agVarB.b();
        if (numA == null) {
            numA = Integer.valueOf(responseErrorCode.getErrorCode());
            strB = responseErrorCode.getErrorReason();
        }
        if (a(responseErrorCode, agVarB.a())) {
            fuo0Var.b(null);
        } else {
            fuo0Var.a(new ApiException(new Status(numA.intValue(), strB)));
        }
        if (aiVar != null) {
            HiAnalyticsClient.reportExit(aiVar.getContext(), getUri(), getTransactionId(), ar.a(numA.intValue()), numA.intValue());
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        as.b("StartConsentTaskApiCall", "startConsent getApiLevel8", true);
        return 8;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 50005300;
    }

    private boolean a(ResponseErrorCode responseErrorCode, Integer num) {
        if (num == null) {
            return responseErrorCode.getStatusCode() == 0;
        }
        return num.intValue() == 0;
    }
}
