package a;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class iko implements Enumeration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enumeration f14936a;

    public iko(jko jkoVar) {
        this.f14936a = Collections.enumeration(jkoVar.f16680a);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f14936a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return new HashMap((Map) this.f14936a.nextElement());
    }
}
