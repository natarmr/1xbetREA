package a;

import android.graphics.drawable.Drawable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class a5q0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f284a;
    public final /* synthetic */ Drawable b;

    public /* synthetic */ a5q0(Drawable drawable, byte b) {
        this.f284a = b;
        this.b = drawable;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f284a;
        Drawable drawable = this.b;
        switch (b) {
            case 0:
                long j = ((y3d) obj).f41946a;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    hfk0.d.h(drawable, fetVar, 48);
                } else {
                    fetVar.X();
                }
                break;
            default:
                long j2 = ((y3d) obj).f41946a;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    hfk0.d.h(drawable, fetVar2, 48);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
