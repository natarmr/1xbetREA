package a;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tzk0 extends rzk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34809a;
    public final long b;
    public final List c;

    public tzk0(long j, long j2, List list) {
        this.f34809a = j;
        this.b = j2;
        this.c = Collections.unmodifiableList(list);
    }

    @Override // a.rzk0
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f34809a);
        sb.append(", programSplicePlaybackPositionUs= ");
        return brm0.k(this.b, " }", sb);
    }
}
