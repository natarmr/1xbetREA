package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hp00 implements mp00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13419a;

    public hp00(String str) {
        str.getClass();
        this.f13419a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hp00) && Intrinsics.d(this.f13419a, ((hp00) obj).f13419a);
    }

    public final int hashCode() {
        return this.f13419a.hashCode();
    }

    public final String toString() {
        return kng0.l("Block(imageUrl=", this.f13419a, Separators.RPAREN);
    }
}
