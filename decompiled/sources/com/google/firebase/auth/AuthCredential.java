package com.google.firebase.auth;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AuthCredential extends AbstractSafeParcelable {
    public String m() {
        return ParameterNames.PASSWORD;
    }
}
