package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s7a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31740a;

    public s7a(List list) {
        if (list == null || list.isEmpty()) {
            jf4.o("Cannot set an empty CaptureStage list.");
            throw null;
        }
        this.f31740a = Collections.unmodifiableList(new ArrayList(list));
    }
}
