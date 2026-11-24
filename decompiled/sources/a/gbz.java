package a;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gbz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bzg0 f11034a;
    public final rip b;
    public final hz40 c;

    public gbz(bzg0 bzg0Var, rip ripVar) {
        this.f11034a = bzg0Var;
        this.b = ripVar;
        long[] jArr = u1h0.f34903a;
        this.c = new hz40();
    }

    public final Function2 a(int i, Object obj, Object obj2) {
        hz40 hz40Var = this.c;
        fbz fbzVar = (fbz) hz40Var.g(obj);
        byte b = 10;
        if (fbzVar != null && fbzVar.c == i && Intrinsics.d(fbzVar.b, obj2)) {
            ugd ugdVar = fbzVar.d;
            if (ugdVar != null) {
                return ugdVar;
            }
            ugd ugdVar2 = new ugd(818252804, true, new r7y(fbzVar.e, fbzVar, b));
            fbzVar.d = ugdVar2;
            return ugdVar2;
        }
        fbz fbzVar2 = new fbz(this, i, obj, obj2);
        hz40Var.n(obj, fbzVar2);
        ugd ugdVar3 = fbzVar2.d;
        if (ugdVar3 != null) {
            return ugdVar3;
        }
        ugd ugdVar4 = new ugd(818252804, true, new r7y(this, fbzVar2, b));
        fbzVar2.d = ugdVar4;
        return ugdVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        fbz fbzVar = (fbz) this.c.g(obj);
        if (fbzVar != null) {
            return fbzVar.b;
        }
        hbz hbzVar = (hbz) this.b.invoke();
        int iC = hbzVar.c(obj);
        if (iC != -1) {
            return hbzVar.a(iC);
        }
        return null;
    }
}
