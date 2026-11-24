package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xfx0 {
    public static final tfx0 f;
    public static final tfx0 h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vgx0 f40814a = new vgx0(ParameterNames.CAUSE, Throwable.class, false, false);
    public static final vgx0 b = new vgx0("ratelimit_count", Integer.class, false, false);
    public static final vgx0 c = new vgx0("sampling_count", Integer.class, false, false);
    public static final vgx0 d = new vgx0("ratelimit_period", cfx0.class, false, false);
    public static final vgx0 e = new vgx0("skipped", Integer.class, false, false);
    public static final vgx0 g = new vgx0("forced", Boolean.class, false, false);
    public static final vgx0 i = new vgx0("stack_size", lhx0.class, false, false);

    static {
        boolean z = true;
        f = new tfx0("group_by", Object.class, z, z, (byte) 0);
        h = new tfx0("tags", rcw0.class, false, z, (byte) 1);
    }
}
