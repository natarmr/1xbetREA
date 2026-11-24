package a;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class hry extends e9x {
    public hry(Metadata metadata) {
        String[] strArrD1 = metadata.d1();
        strArrD1 = strArrD1.length == 0 ? null : strArrD1;
        if (strArrD1 != null) {
            Pair pairG = egy.g(strArrD1, metadata.d2());
            ify ifyVar = (ify) pairG.f46059a;
            i3d0 i3d0Var = (i3d0) pairG.b;
            boolean z = new gfy(metadata.mv()).compareTo(new gfy(1, 4, 0)) < 0;
            i3d0Var.getClass();
            ifyVar.getClass();
            g4d0 g4d0Var = i3d0Var.q;
            g4d0Var.getClass();
            m8x.q0(i3d0Var, new hhk(ifyVar, new roi0(g4d0Var), xbu0.b, z, (List) null, 48));
        }
        new gfy(metadata.mv());
        metadata.xi();
    }
}
