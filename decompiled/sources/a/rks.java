package a;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rks implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30662a;
    public final /* synthetic */ yks b;

    public /* synthetic */ rks(yks yksVar, byte b) {
        this.f30662a = b;
        this.b = yksVar;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f30662a;
        yks yksVar = this.b;
        switch (b) {
            case 0:
                u5s u5sVar = (u5s) obj;
                boolean z = u5sVar instanceof l5s;
                yks yksVar2 = this.b;
                if (z) {
                    long j = ((l5s) u5sVar).f19474a;
                    int i = yks.m0;
                    yksVar2.H(new bor(j, false, false, true, yksVar2, (byte) 2));
                } else if (u5sVar instanceof n5s) {
                    long j2 = ((n5s) u5sVar).f22959a;
                    int i2 = yks.m0;
                    yksVar2.H(new bor(j2, true, false, false, yksVar2, (byte) 2));
                } else if (u5sVar instanceof q5s) {
                    long j3 = ((q5s) u5sVar).f28167a;
                    int i3 = yks.m0;
                    yksVar2.H(new bor(j3, false, true, false, yksVar2, (byte) 2));
                    yksVar2.H(new t4s((byte) 22));
                } else if (u5sVar instanceof r5s) {
                    long j4 = ((r5s) u5sVar).f29903a;
                    int i4 = yks.m0;
                    yksVar2.H(new bor(j4, false, true, false, yksVar2, (byte) 2));
                    yksVar2.H(new t4s((byte) 23));
                } else if (u5sVar instanceof s5s) {
                    s5s s5sVar = (s5s) u5sVar;
                    long j5 = s5sVar.f31668a;
                    boolean z2 = s5sVar.b;
                    int i5 = yks.m0;
                    yksVar2.H(new bor(j5, z2, false, false, yksVar2, (byte) 2));
                    yksVar2.H(new t4s((byte) 24));
                } else if (!Intrinsics.d(u5sVar, j5s.f15947a) && !Intrinsics.d(u5sVar, p5s.f26420a)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 1:
                tjs tjsVar = new tjs((k9s) obj, yksVar, (byte) 1);
                int i6 = yks.m0;
                yksVar.H(tjsVar);
                return Unit.f46060a;
            default:
                obg obgVar = new obg((byte) 12, ((Boolean) obj).booleanValue());
                int i7 = yks.m0;
                yksVar.H(obgVar);
                return Unit.f46060a;
        }
    }
}
