package a;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x8s implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40476a;
    public final /* synthetic */ g9s b;

    public /* synthetic */ x8s(g9s g9sVar, byte b) {
        this.f40476a = b;
        this.b = g9sVar;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f40476a;
        g9s g9sVar = this.b;
        switch (b) {
            case 0:
                u5s u5sVar = (u5s) obj;
                boolean z = u5sVar instanceof l5s;
                g9s g9sVar2 = this.b;
                if (z) {
                    long j = ((l5s) u5sVar).f19474a;
                    int i = g9s.n0;
                    g9sVar2.H(new bor(j, false, false, true, g9sVar2, (byte) 1));
                } else if (u5sVar instanceof n5s) {
                    long j2 = ((n5s) u5sVar).f22959a;
                    int i2 = g9s.n0;
                    g9sVar2.H(new bor(j2, true, false, false, g9sVar2, (byte) 1));
                } else if (u5sVar instanceof q5s) {
                    long j3 = ((q5s) u5sVar).f28167a;
                    int i3 = g9s.n0;
                    g9sVar2.H(new bor(j3, false, true, false, g9sVar2, (byte) 1));
                    g9sVar2.H(new t4s((byte) 13));
                } else if (u5sVar instanceof r5s) {
                    long j4 = ((r5s) u5sVar).f29903a;
                    int i4 = g9s.n0;
                    g9sVar2.H(new bor(j4, false, true, false, g9sVar2, (byte) 1));
                    g9sVar2.H(new t4s((byte) 14));
                } else if (u5sVar instanceof s5s) {
                    s5s s5sVar = (s5s) u5sVar;
                    long j5 = s5sVar.f31668a;
                    boolean z2 = s5sVar.b;
                    int i5 = g9s.n0;
                    g9sVar2.H(new bor(j5, z2, false, false, g9sVar2, (byte) 1));
                    g9sVar2.H(new t4s((byte) 15));
                } else if (!Intrinsics.d(u5sVar, j5s.f15947a) && !Intrinsics.d(u5sVar, p5s.f26420a)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 1:
                c8s c8sVar = new c8s((k9s) obj, g9sVar, (byte) 1);
                int i6 = g9s.n0;
                g9sVar.H(c8sVar);
                return Unit.f46060a;
            default:
                obg obgVar = new obg((byte) 10, ((Boolean) obj).booleanValue());
                int i7 = g9s.n0;
                g9sVar.H(obgVar);
                return Unit.f46060a;
        }
    }
}
