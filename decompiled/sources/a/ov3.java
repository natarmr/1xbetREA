package a;

import android.util.Log;
import com.appsflyer.share.AppsFlyerConversionListener;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ov3 implements AppsFlyerConversionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv3 f25906a;

    public ov3(rv3 rv3Var) {
        this.f25906a = rv3Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(LinkedHashMap linkedHashMap, zje zjeVar) {
        kv3 kv3Var;
        Object objD;
        if (zjeVar instanceof kv3) {
            kv3Var = (kv3) zjeVar;
            int i = kv3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kv3Var.k = i - Integer.MIN_VALUE;
            } else {
                kv3Var = new kv3(this, zjeVar);
            }
        } else {
            kv3Var = new kv3(this, zjeVar);
        }
        kv3 kv3Var2 = kv3Var;
        Object obj = kv3Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = kv3Var2.k;
        if (i2 == 0) {
            z1x.P(obj);
            String str = (String) linkedHashMap.get("nr_pid");
            if (str == null) {
                str = "";
            }
            String str2 = (String) linkedHashMap.get("nr_ipid");
            if (str2 == null) {
                str2 = "";
            }
            String str3 = (String) linkedHashMap.get("nr_bid");
            String str4 = str3 == null ? "" : str3;
            if (str.length() > 0 && str2.length() > 0 && str4.length() > 0) {
                String name = ov3.class.getName();
                uen uenVar = wen.b;
                long jW0 = ibc.w0(3L, bfn.SECONDS);
                List listC = kotlin.collections.a.c(oqt0.class);
                wn2 wn2Var = new wn2(this.f25906a, str, str2, str4, this, null, (byte) 4);
                kv3Var2.k = 1;
                objD = j0x.D(3, jW0, kv3Var2, name, listC, wn2Var);
                if (objD == wneVar) {
                    return wneVar;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        objD = ((j0g0) obj).f15681a;
        z1x.P(objD);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0132 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(LinkedHashMap linkedHashMap, zje zjeVar) {
        lv3 lv3Var;
        String str;
        String str2;
        String str3;
        Object objN;
        if (zjeVar instanceof lv3) {
            lv3Var = (lv3) zjeVar;
            int i = lv3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lv3Var.k = i - Integer.MIN_VALUE;
            } else {
                lv3Var = new lv3(this, zjeVar);
            }
        } else {
            lv3Var = new lv3(this, zjeVar);
        }
        Object obj = lv3Var.i;
        wne wneVar = wne.f39444a;
        int i2 = lv3Var.k;
        rv3 rv3Var = this.f25906a;
        if (i2 == 0) {
            z1x.P(obj);
            String str4 = (String) linkedHashMap.get("btag");
            if (str4 == null) {
                str4 = "";
            }
            if (str4.length() > 0) {
                vwb0 vwb0Var = rv3Var.c.f17908a;
                if (str4.length() > 0) {
                    vwb0Var.h("referral_dl", str4);
                    vwb0Var.g("B_TAG_RECEIVING_TIME", System.currentTimeMillis());
                }
            } else {
                String str5 = (String) linkedHashMap.get("af_sub1");
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = (String) linkedHashMap.get("agency");
                if (str6 == null) {
                    str6 = "";
                }
                if (Intrinsics.d(linkedHashMap.get("campaign"), "None") || (str = (String) linkedHashMap.get("campaign")) == null) {
                    str = "";
                }
                String str7 = (String) linkedHashMap.get("af_sub2");
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = (String) linkedHashMap.get("af_sub3");
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = (String) linkedHashMap.get("af_sub4");
                if (str9 == null) {
                    str9 = "";
                }
                String str10 = (String) linkedHashMap.get("af_sub5");
                if (str10 == null) {
                    str10 = "";
                }
                mb5 mb5Var = new mb5(str7, str8, str9, str10);
                lv3Var.k = 1;
                yqc yqcVar = rv3Var.d;
                if (StringsKt.O(str, BundleUtil.UNDERLINE_TAG, false)) {
                    List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{BundleUtil.UNDERLINE_TAG}, false, 0, 6, null);
                    str3 = (String) CollectionsKt.firstOrNull(listSplit$default);
                    if (str3 == null) {
                        str3 = "";
                    }
                    str2 = (String) CollectionsKt.f0(listSplit$default);
                    if (str2 == null) {
                        str2 = "";
                    }
                } else {
                    str2 = "";
                    str3 = str;
                }
                if (str5.length() <= 0 && str6.length() <= 0) {
                    mb5Var = mb5.e;
                }
                if (str5.length() > 0) {
                    objN = yqcVar.n(str5, mb5Var, lv3Var);
                } else if (str6.length() > 0) {
                    objN = yqcVar.m(str6, mb5Var, lv3Var);
                } else if (str.length() <= 0 || str2.length() <= 0) {
                    if (str.length() > 0) {
                        objN = yqcVar.n(str, mb5Var, lv3Var);
                    } else {
                        obj = "";
                    }
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    objN = yqcVar.o(str3, str2, lv3Var);
                }
                obj = objN;
                if (obj == wneVar) {
                    return wneVar;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        String str11 = (String) obj;
        vwb0 vwb0Var2 = rv3Var.c.f17908a;
        if (str11.length() > 0) {
            vwb0Var2.h("referral_dl", str11);
            vwb0Var2.g("B_TAG_RECEIVING_TIME", System.currentTimeMillis());
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object c(LinkedHashMap linkedHashMap, zje zjeVar) {
        mv3 mv3Var;
        Object objD;
        if (zjeVar instanceof mv3) {
            mv3Var = (mv3) zjeVar;
            int i = mv3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mv3Var.k = i - Integer.MIN_VALUE;
            } else {
                mv3Var = new mv3(this, zjeVar);
            }
        } else {
            mv3Var = new mv3(this, zjeVar);
        }
        mv3 mv3Var2 = mv3Var;
        Object obj = mv3Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = mv3Var2.k;
        if (i2 == 0) {
            z1x.P(obj);
            String str = (String) linkedHashMap.get("c");
            String str2 = str == null ? "" : str;
            String str3 = (String) linkedHashMap.get("af_sub1");
            String str4 = str3 == null ? "" : str3;
            String str5 = (String) linkedHashMap.get("pid");
            String str6 = str5 == null ? "" : str5;
            String name = ov3.class.getName();
            uen uenVar = wen.b;
            long jW0 = ibc.w0(3L, bfn.SECONDS);
            List listC = kotlin.collections.a.c(oqt0.class);
            ic1 ic1Var = new ic1((Object) this.f25906a, (Object) str2, (Object) str4, (Object) str6, (yje) null, (byte) 3);
            mv3Var2.k = 1;
            objD = j0x.D(3, jW0, mv3Var2, name, listC, ic1Var);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objD = ((j0g0) obj).f15681a;
        }
        z1x.P(objD);
        return Unit.f46060a;
    }

    public final void d(boolean z, boolean z2) {
        ((gv3) this.f25906a.h.g).f11956a.g(new ka80(z2));
        if (z) {
            boolean z3 = this.f25906a.l;
            rv3 rv3Var = this.f25906a;
            if (z3) {
                rv3Var.c();
            } else {
                rv3Var.m = true;
            }
        }
    }

    @Override // com.appsflyer.share.AppsFlyerConversionListener
    public final void onConversionDataFail(String str) {
        Log.d(rv3.class.getSimpleName(), "onConversionDataFail: " + str);
        this.f25906a.c.f17908a.e("IS_ORGANIC", true);
        d(false, true);
    }

    @Override // com.appsflyer.share.AppsFlyerConversionListener
    public final void onConversionDataSuccess(Map map) {
        String string;
        boolean z;
        rv3 rv3Var = this.f25906a;
        n0o0 n0o0Var = rv3Var.k;
        if (map != null) {
            Object obj = map.get("is_first_launch");
            byte b = 0;
            boolean zBooleanValue = obj != null ? ((Boolean) obj).booleanValue() : false;
            nwd nwdVar = rv3Var.i;
            vwb0 vwb0Var = rv3Var.c.f17908a;
            nwdVar.getClass();
            if (((gst0) rv3Var.b.get()).a() || !zBooleanValue) {
                return;
            }
            boolean zD = Intrinsics.d(map.get("af_status"), "Organic");
            Object obj2 = map.get("campaign");
            yje yjeVar = null;
            String string2 = obj2 != null ? obj2.toString() : null;
            Object obj3 = map.get("nr_cid");
            if (obj3 == null || (string = obj3.toString()) == null) {
                string = "";
            }
            Object obj4 = map.get("media_source");
            String string3 = obj4 != null ? obj4.toString() : null;
            if (string3 != null && string3.length() != 0) {
                vwb0Var.h("MEDIA_SOURCE_ID", string3);
            }
            if (string2 == null || string2.length() == 0) {
                z = false;
            } else {
                vwb0Var.h("referral_dl", string2);
                z = zD;
            }
            byte b2 = 1;
            if (string.length() > 0) {
                vwb0Var.h("promo", string);
                z = true;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            vwb0Var.h("post_back", rv3.b(linkedHashMap));
            String str = (String) linkedHashMap.get("af_siteid");
            vwb0Var.h("siteId", str != null ? str : "");
            v8d v8dVar = (v8d) n0o0Var.getValue();
            sje sjeVar = rv3Var.r;
            if (v8dVar.s) {
                sac.V(sjeVar, new or3((byte) 6), new jv3(this, z, zD, b), null, new nv3(this, linkedHashMap, yjeVar, b), 12);
            } else if (((v8d) n0o0Var.getValue()).u) {
                sac.V(sjeVar, new or3((byte) 7), new jv3(this, z, zD, b2), null, new nv3(this, linkedHashMap, yjeVar, b2), 12);
            } else if (((v8d) n0o0Var.getValue()).t) {
                byte b3 = 2;
                sac.V(sjeVar, new or3((byte) 8), new jv3(this, z, zD, b3), null, new nv3(this, linkedHashMap, yjeVar, b3), 12);
            } else {
                d(z, zD);
            }
            vwb0Var.e("IS_ORGANIC", zD);
        }
    }
}
