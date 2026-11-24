package a;

import androidx.media3.common.DrmInitData;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xbw extends hxg0 {
    public final Map K;
    public DrmInitData L;

    public xbw(lhf0 lhf0Var, cil cilVar, zhl zhlVar, Map map) {
        super(lhf0Var, cilVar, zhlVar);
        this.K = map;
    }

    @Override // a.hxg0
    public final androidx.media3.common.b m(androidx.media3.common.b bVar) {
        DrmInitData drmInitData;
        DrmInitData drmInitData2 = this.L;
        if (drmInitData2 == null) {
            drmInitData2 = bVar.t;
        }
        if (drmInitData2 != null && (drmInitData = (DrmInitData) this.K.get(drmInitData2.c)) != null) {
            drmInitData2 = drmInitData;
        }
        ed40 ed40Var = bVar.m;
        ed40 ed40Var2 = null;
        if (ed40Var == null) {
            ed40Var = ed40Var2;
        } else {
            cd40[] cd40VarArr = ed40Var.f7600a;
            int length = cd40VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                cd40 cd40Var = cd40VarArr[i2];
                if ((cd40Var instanceof rwb0) && "com.apple.streaming.transportStreamTimestamp".equals(((rwb0) cd40Var).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    cd40[] cd40VarArr2 = new cd40[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            cd40VarArr2[i < i2 ? i : i - 1] = cd40VarArr[i];
                        }
                        i++;
                    }
                    ed40Var2 = new ed40(cd40VarArr2);
                }
                ed40Var = ed40Var2;
            }
        }
        if (drmInitData2 != bVar.t || ed40Var != bVar.m) {
            awq awqVarA = bVar.a();
            awqVarA.s = drmInitData2;
            awqVarA.l = ed40Var;
            bVar = new androidx.media3.common.b(awqVarA);
        }
        return super.m(bVar);
    }
}
