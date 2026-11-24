package a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.nio.ByteBuffer;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class py3 implements nqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27787a;

    public /* synthetic */ py3(byte b) {
        this.f27787a = b;
    }

    @Override // a.nqp
    public final oqp a(Object obj, a780 a780Var, gbe0 gbe0Var) {
        byte b = 0;
        byte b2 = 1;
        byte b3 = 2;
        switch (this.f27787a) {
            case 0:
                aot0 aot0Var = (aot0) obj;
                Bitmap.Config[] configArr = lut0.f20691a;
                if (Intrinsics.d(aot0Var.c, "file") && Intrinsics.d(CollectionsKt.firstOrNull(dqm0.q(aot0Var)), "android_asset")) {
                    return new qy3(aot0Var, a780Var, b);
                }
                return null;
            case 1:
                return new a78((Bitmap) obj);
            case 2:
                return new uf9((byte[]) obj, a780Var, b);
            case 3:
                return new uf9((ByteBuffer) obj, a780Var, b2);
            case 4:
                aot0 aot0Var2 = (aot0) obj;
                if (Intrinsics.d(aot0Var2.c, RemoteMessageConst.Notification.CONTENT)) {
                    return new qy3(aot0Var2, a780Var, b2);
                }
                return null;
            case 5:
                aot0 aot0Var3 = (aot0) obj;
                if (Intrinsics.d(aot0Var3.c, RemoteMessageConst.DATA)) {
                    return new qy3(aot0Var3, a780Var, b3);
                }
                return null;
            case 6:
                return new uf9((Drawable) obj, a780Var, b3);
            case 7:
                aot0 aot0Var4 = (aot0) obj;
                String str = aot0Var4.c;
                if ((str != null && !str.equals("file")) || aot0Var4.e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = lut0.f20691a;
                if (Intrinsics.d(aot0Var4.c, "file") && Intrinsics.d(CollectionsKt.firstOrNull(dqm0.q(aot0Var4)), "android_asset")) {
                    return null;
                }
                return new qy3(aot0Var4, a780Var, (byte) 3);
            case 8:
                aot0 aot0Var5 = (aot0) obj;
                if (Intrinsics.d(aot0Var5.c, "jar:file")) {
                    return new qy3(aot0Var5, a780Var, (byte) 4);
                }
                return null;
            default:
                aot0 aot0Var6 = (aot0) obj;
                if (Intrinsics.d(aot0Var6.c, "android.resource")) {
                    return new qy3(aot0Var6, a780Var, (byte) 5);
                }
                return null;
        }
    }
}
