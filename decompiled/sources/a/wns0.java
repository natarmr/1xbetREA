package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class wns0 {
    public static final vns0 Companion = new vns0();
    public static final a8z[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39463a;
    public final Map b;
    public final String c;
    public final Map d;
    public final String e;
    public final String f;
    public final btw g;
    public final List h;
    public final String i;

    static {
        wez wezVar = wez.f39042a;
        j = new a8z[]{null, maz.a(wezVar, new yqr0((byte) 27)), null, maz.a(wezVar, new yqr0((byte) 28)), null, null, null, maz.a(wezVar, new yqr0((byte) 29)), null};
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [a.iun] */
    public wns0(edy edyVar, String str) {
        btw btwVar;
        ?? arrayList;
        String strL = piz.L(edyVar, "title");
        Map mapI = piz.I(edyVar, "title_loc");
        String strL2 = piz.L(edyVar, "descr");
        Map mapI2 = piz.I(edyVar, "descr_loc");
        String strL3 = piz.L(edyVar, "img");
        String strL4 = piz.L(edyVar, "style");
        try {
            mcy mcyVar = (mcy) edyVar.get("href");
            byte b = mcyVar == null ? (byte) -1 : mcyVar instanceof bdy ? (byte) 0 : (byte) -2;
            if (b == -1 || b == 0) {
                btwVar = null;
            } else {
                edy edyVar2 = mcyVar instanceof edy ? (edy) mcyVar : null;
                if (edyVar2 != null) {
                    String strL5 = piz.L(edyVar2, "img");
                    String strL6 = piz.L(edyVar2, "link");
                    String strL7 = piz.L(edyVar2, "deeplink");
                    String strL8 = piz.L(edyVar2, "title");
                    if (!kotlin.text.c.x(strL5, "http", false) && strL5.length() != 0) {
                        strL5 = str.concat(strL5);
                    }
                    btwVar = new btw(strL6, strL7, strL8, strL5);
                } else {
                    btwVar = null;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Object obj = (mcy) edyVar.get(ParameterNames.INFO);
            if (obj instanceof yby) {
                ArrayList<edy> arrayList2 = new ArrayList();
                for (mcy mcyVar2 : (Iterable) obj) {
                    edy edyVar3 = mcyVar2 instanceof edy ? (edy) mcyVar2 : null;
                    if (edyVar3 != null) {
                        arrayList2.add(edyVar3);
                    }
                }
                arrayList = new ArrayList(r3d.q(arrayList2, 10));
                for (edy edyVar4 : arrayList2) {
                    edyVar4.getClass();
                    arrayList.add(new wns0(edyVar4, str));
                }
            } else {
                arrayList = iun.f15405a;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            arrayList = iun.f15405a;
        }
        String strL9 = piz.L(edyVar, Payload.TYPE);
        this.f39463a = strL;
        this.b = mapI;
        this.c = strL2;
        this.d = mapI2;
        this.e = strL3;
        this.f = strL4;
        this.g = btwVar;
        this.h = arrayList;
        this.i = strL9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wns0)) {
            return false;
        }
        wns0 wns0Var = (wns0) obj;
        return Intrinsics.d(this.f39463a, wns0Var.f39463a) && Intrinsics.d(this.b, wns0Var.b) && Intrinsics.d(this.c, wns0Var.c) && Intrinsics.d(this.d, wns0Var.d) && Intrinsics.d(this.e, wns0Var.e) && Intrinsics.d(this.f, wns0Var.f) && Intrinsics.d(this.g, wns0Var.g) && Intrinsics.d(this.h, wns0Var.h) && Intrinsics.d(this.i, wns0Var.i);
    }

    public final int hashCode() {
        String str = this.f39463a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map2 = this.d;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        btw btwVar = this.g;
        int iHashCode7 = (iHashCode6 + (btwVar == null ? 0 : btwVar.hashCode())) * 31;
        List list = this.h;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.i;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TranslationResponse(title=");
        sb.append(this.f39463a);
        sb.append(", titleLocalized=");
        sb.append(this.b);
        sb.append(", textDescription=");
        sb.append(this.c);
        sb.append(", textDescriptionLocalized=");
        sb.append(this.d);
        sb.append(", image=");
        f140.v(sb, this.e, ", style=", this.f, ", hrefResponse=");
        sb.append(this.g);
        sb.append(", info=");
        sb.append(this.h);
        sb.append(", type=");
        return axq.n(sb, this.i, Separators.RPAREN);
    }

    public wns0(int i, String str, Map map, String str2, Map map2, String str3, String str4, btw btwVar, List list, String str5) {
        if ((i & 1) == 0) {
            this.f39463a = null;
        } else {
            this.f39463a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = map2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = new btw();
        } else {
            this.g = btwVar;
        }
        if ((i & 128) == 0) {
            this.h = iun.f15405a;
        } else {
            this.h = list;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
    }
}
