package a;

import java.security.AccessControlException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class mae0 implements nry {
    public static final boolean h;
    public static final HashMap i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f21454a;
    public String b;
    public int c;
    public String[] d;
    public String[] e;
    public String[] f;
    public bry g;

    static {
        try {
            h = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            h = false;
        }
        HashMap map = new HashMap();
        i = map;
        map.put(plc.S(new swq("kotlin.jvm.internal.KotlinClass")), bry.CLASS);
        map.put(plc.S(new swq("kotlin.jvm.internal.KotlinFileFacade")), bry.FILE_FACADE);
        map.put(plc.S(new swq("kotlin.jvm.internal.KotlinMultifileClass")), bry.MULTIFILE_CLASS);
        map.put(plc.S(new swq("kotlin.jvm.internal.KotlinMultifileClassPart")), bry.MULTIFILE_CLASS_PART);
        map.put(plc.S(new swq("kotlin.jvm.internal.KotlinSyntheticClass")), bry.SYNTHETIC_CLASS);
    }

    @Override // a.nry
    public final lry b(qlc qlcVar, zpe0 zpe0Var) {
        bry bryVar;
        if (qlcVar.a().equals(bey.f2475a)) {
            return new jw20((Object) this, (byte) 18);
        }
        if (h || this.g != null || (bryVar = (bry) i.get(qlcVar)) == null) {
            return null;
        }
        this.g = bryVar;
        return new onv(this);
    }
}
