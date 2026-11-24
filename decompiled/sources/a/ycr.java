package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ycr extends k2u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42395a;
    public final Map b;

    public ycr(ArrayList arrayList) {
        this.f42395a = arrayList;
        this.b = arrayList != null ? xp20.m(arrayList) : null;
    }

    public final String toString() {
        return "FullValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.f42395a + ')';
    }
}
