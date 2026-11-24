package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d4s implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5470a;
    public final /* synthetic */ k4s b;

    public /* synthetic */ d4s(k4s k4sVar, byte b) {
        this.f5470a = b;
        this.b = k4sVar;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f5470a;
        k4s k4sVar = this.b;
        switch (b) {
            case 0:
                u5s u5sVar = (u5s) obj;
                if (u5sVar instanceof l5s) {
                    final long j = ((l5s) u5sVar).f19474a;
                    int i = k4s.c0;
                    final boolean z = true;
                    final boolean z2 = false;
                    final boolean z3 = true;
                    k4sVar.H(new Function2() { // from class: a.i3s
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            oyg0 oyg0Var = (oyg0) obj2;
                            z2s z2sVar = (z2s) obj3;
                            oyg0Var.getClass();
                            z2sVar.getClass();
                            long j2 = j;
                            q7x.F(oyg0Var, Long.valueOf(j2), "KEY_GAME_ID");
                            boolean z4 = z;
                            q7x.F(oyg0Var, Boolean.valueOf(z4), "KEY_LIVE");
                            t3z.f33292a.getClass();
                            t3z t3zVarH = rqt.h(z4, z2, z3);
                            q7x.F(oyg0Var, t3zVarH, "KEY_GAME_TYPE");
                            return z2s.a(z2sVar, j2, null, null, z4, 0L, 0L, null, t3zVarH, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, -266, 65535);
                        }
                    });
                } else if (u5sVar instanceof n5s) {
                    final long j2 = ((n5s) u5sVar).f22959a;
                    int i2 = k4s.c0;
                    final boolean z4 = true;
                    final boolean z5 = false;
                    final boolean z6 = false;
                    k4sVar.H(new Function2() { // from class: a.i3s
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            oyg0 oyg0Var = (oyg0) obj2;
                            z2s z2sVar = (z2s) obj3;
                            oyg0Var.getClass();
                            z2sVar.getClass();
                            long j3 = j2;
                            q7x.F(oyg0Var, Long.valueOf(j3), "KEY_GAME_ID");
                            boolean z7 = z4;
                            q7x.F(oyg0Var, Boolean.valueOf(z7), "KEY_LIVE");
                            t3z.f33292a.getClass();
                            t3z t3zVarH = rqt.h(z7, z5, z6);
                            q7x.F(oyg0Var, t3zVarH, "KEY_GAME_TYPE");
                            return z2s.a(z2sVar, j3, null, null, z7, 0L, 0L, null, t3zVarH, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, -266, 65535);
                        }
                    });
                } else if (u5sVar instanceof q5s) {
                    final long j3 = ((q5s) u5sVar).f28167a;
                    int i3 = k4s.c0;
                    final boolean z7 = false;
                    final boolean z8 = true;
                    final boolean z9 = false;
                    k4sVar.H(new Function2() { // from class: a.i3s
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            oyg0 oyg0Var = (oyg0) obj2;
                            z2s z2sVar = (z2s) obj3;
                            oyg0Var.getClass();
                            z2sVar.getClass();
                            long j4 = j3;
                            q7x.F(oyg0Var, Long.valueOf(j4), "KEY_GAME_ID");
                            boolean z10 = z7;
                            q7x.F(oyg0Var, Boolean.valueOf(z10), "KEY_LIVE");
                            t3z.f33292a.getClass();
                            t3z t3zVarH = rqt.h(z10, z8, z9);
                            q7x.F(oyg0Var, t3zVarH, "KEY_GAME_TYPE");
                            return z2s.a(z2sVar, j4, null, null, z10, 0L, 0L, null, t3zVarH, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, -266, 65535);
                        }
                    });
                    k4sVar.H(new gwr((byte) 26));
                } else if (u5sVar instanceof r5s) {
                    final long j4 = ((r5s) u5sVar).f29903a;
                    int i4 = k4s.c0;
                    final boolean z10 = false;
                    final boolean z11 = true;
                    final boolean z12 = false;
                    k4sVar.H(new Function2() { // from class: a.i3s
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            oyg0 oyg0Var = (oyg0) obj2;
                            z2s z2sVar = (z2s) obj3;
                            oyg0Var.getClass();
                            z2sVar.getClass();
                            long j5 = j4;
                            q7x.F(oyg0Var, Long.valueOf(j5), "KEY_GAME_ID");
                            boolean z13 = z10;
                            q7x.F(oyg0Var, Boolean.valueOf(z13), "KEY_LIVE");
                            t3z.f33292a.getClass();
                            t3z t3zVarH = rqt.h(z13, z11, z12);
                            q7x.F(oyg0Var, t3zVarH, "KEY_GAME_TYPE");
                            return z2s.a(z2sVar, j5, null, null, z13, 0L, 0L, null, t3zVarH, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, -266, 65535);
                        }
                    });
                    k4sVar.H(new gwr((byte) 27));
                } else if (u5sVar instanceof s5s) {
                    s5s s5sVar = (s5s) u5sVar;
                    final long j5 = s5sVar.f31668a;
                    final boolean z13 = s5sVar.b;
                    int i5 = k4s.c0;
                    final boolean z14 = false;
                    final boolean z15 = false;
                    k4sVar.H(new Function2() { // from class: a.i3s
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            oyg0 oyg0Var = (oyg0) obj2;
                            z2s z2sVar = (z2s) obj3;
                            oyg0Var.getClass();
                            z2sVar.getClass();
                            long j6 = j5;
                            q7x.F(oyg0Var, Long.valueOf(j6), "KEY_GAME_ID");
                            boolean z16 = z13;
                            q7x.F(oyg0Var, Boolean.valueOf(z16), "KEY_LIVE");
                            t3z.f33292a.getClass();
                            t3z t3zVarH = rqt.h(z16, z14, z15);
                            q7x.F(oyg0Var, t3zVarH, "KEY_GAME_TYPE");
                            return z2s.a(z2sVar, j6, null, null, z16, 0L, 0L, null, t3zVarH, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, -266, 65535);
                        }
                    });
                    k4sVar.H(new gwr((byte) 28));
                } else if (!Intrinsics.d(u5sVar, j5s.f15947a) && !Intrinsics.d(u5sVar, p5s.f26420a)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 1:
                h3s h3sVar = new h3s((k9s) obj, (byte) 1);
                int i6 = k4s.c0;
                k4sVar.H(h3sVar);
                return Unit.f46060a;
            default:
                obg obgVar = new obg((byte) 7, ((Boolean) obj).booleanValue());
                int i7 = k4s.c0;
                k4sVar.H(obgVar);
                return Unit.f46060a;
        }
    }
}
