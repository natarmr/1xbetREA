package com.google.firebase.auth;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MultiFactorInfo extends AbstractSafeParcelable {
    public String m() {
        return "phone";
    }

    public abstract JSONObject o();
}
