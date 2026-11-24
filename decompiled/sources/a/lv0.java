package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class lv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20698a;

    public lv0(String str) {
        this.f20698a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lv0) && this.f20698a.equals(((lv0) obj).f20698a);
    }

    public final int hashCode() {
        return this.f20698a.hashCode();
    }

    public final String toString() {
        return kng0.l("SendResult(value=", this.f20698a, Separators.RPAREN);
    }
}
