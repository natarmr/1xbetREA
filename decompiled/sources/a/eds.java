package a;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eds implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eds f7632a;
    private static final ugi0 descriptor;

    static {
        eds edsVar = new eds();
        f7632a = edsVar;
        scx scxVar = new scx("org.xplatform.onexuser.domain.entity.onexgame.GameImageInfo.LogoUrl", edsVar);
        scxVar.j(RemoteMessageConst.Notification.URL, false);
        descriptor = scxVar;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ysm0.f43175a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        String strZ = rkjVar.y(descriptor).z();
        strZ.getClass();
        return new gds(strZ);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        String str = ((gds) obj).f11116a;
        str.getClass();
        bwn bwnVarA = bwnVar.A(descriptor);
        if (bwnVarA == null) {
            return;
        }
        bwnVarA.E(str);
    }
}
