package a;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wuj implements lsb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39794a;

    @Override // a.lsb0
    public final boolean apply(Object obj) {
        switch (this.f39794a) {
            case 0:
                return ((Map.Entry) obj).getKey() != null;
            case 1:
                return ((String) obj) != null;
            default:
                jmx jmxVar = (jmx) obj;
                return jmxVar.b.equals("com.apple.iTunes") && jmxVar.c.equals("iTunSMPB");
        }
    }
}
