package a;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cw9 implements bmf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5070a = new Object();
    public final Object b = new Object();
    public bbw0 c = new bbw0((byte) 16);
    public odd d;
    public odd e;

    public final odd b(pot0 pot0Var, boolean z) {
        hx9 hx9VarC;
        odd oddVar = new odd();
        synchronized (this.f5070a) {
            hx9VarC = this.c.c();
        }
        synchronized (this.b) {
            try {
                if (pot0Var != null) {
                    odd oddVar2 = this.d;
                    if (z) {
                        if (oddVar2 != null) {
                            oddVar2.b0(new c44("Camera2CameraControl was updated with new options.", (byte) 1));
                        }
                    } else if (oddVar2 != null) {
                        vzb.g0(oddVar, oddVar2);
                    }
                    this.d = oddVar;
                    pot0Var.g(hx9VarC, wp20.b(new Pair("Camera2CameraControl.tag", Integer.valueOf(oddVar.hashCode()))));
                } else {
                    odd oddVar3 = this.e;
                    if (oddVar3 != null) {
                        oddVar3.b0(new c44("Camera2CameraControl was updated with new options.", (byte) 1));
                    }
                    this.e = oddVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oddVar;
    }

    @Override // a.bmf0
    public final void d(gnf0 gnf0Var, long j, oz2 oz2Var) {
        synchronized (this.b) {
            odd oddVar = this.d;
            if (oddVar != null) {
                if (Intrinsics.d(((eoo0) gnf0Var.b(vso0.f37960a, eoo0.b)).f8147a.get("Camera2CameraControl.tag"), Integer.valueOf(oddVar.hashCode()))) {
                    oddVar.N(null);
                    this.d = null;
                    odd oddVar2 = this.e;
                    if (oddVar2 != null) {
                        oddVar2.N(null);
                        this.e = null;
                    }
                }
            }
        }
    }
}
