package a;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class qft0 extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Feature f28654a;

    public qft0(Feature feature) {
        this.f28654a = feature;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f28654a));
    }
}
