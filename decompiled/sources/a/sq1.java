package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes3.dex */
public final class sq1 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sq1 f32610a = new sq1();
    public static final wgi0 b = x2x.F("AggregatorSpecialBannerNavigationData", new ugi0[0]);

    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        String strB;
        jiy jiyVarSerializer;
        mcy mcyVar;
        icy icyVar = (icy) rkjVar;
        mcy mcyVarG = icyVar.g();
        if (!(mcyVarG instanceof bdy)) {
            edy edyVar = mcyVarG instanceof edy ? (edy) mcyVarG : null;
            if (edyVar == null || (mcyVar = (mcy) edyVar.get(Payload.TYPE)) == null) {
                strB = null;
            } else {
                jdy jdyVar = mcyVar instanceof jdy ? (jdy) mcyVar : null;
                if (jdyVar != null) {
                    scx scxVar = ncy.f23316a;
                    if (jdyVar instanceof bdy) {
                        strB = null;
                    } else {
                        strB = jdyVar.b();
                    }
                } else {
                    strB = null;
                }
            }
            if (strB != null) {
                switch (strB) {
                    case "Game":
                        jiyVarSerializer = nq1.Companion.serializer();
                        break;
                    case "Href":
                        jiyVarSerializer = qq1.Companion.serializer();
                        break;
                    case "Brand":
                        jiyVarSerializer = gq1.Companion.serializer();
                        break;
                    case "Category":
                        jiyVarSerializer = jq1.Companion.serializer();
                        break;
                    default:
                        jiyVarSerializer = null;
                        break;
                }
            } else {
                jiyVarSerializer = null;
            }
            if (jiyVarSerializer != null) {
                return (rq1) icyVar.d().a(jiyVarSerializer, mcyVarG);
            }
        }
        return null;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rq1 rq1Var = (rq1) obj;
        if (rq1Var == null) {
            bwnVar.q();
            return;
        }
        if (rq1Var instanceof qq1) {
            bwnVar.C(qq1.Companion.serializer(), rq1Var);
            return;
        }
        if (rq1Var instanceof gq1) {
            bwnVar.C(gq1.Companion.serializer(), rq1Var);
            return;
        }
        if (rq1Var instanceof jq1) {
            bwnVar.C(jq1.Companion.serializer(), rq1Var);
        } else if (rq1Var instanceof nq1) {
            bwnVar.C(nq1.Companion.serializer(), rq1Var);
        } else {
            t9f.b();
        }
    }
}
