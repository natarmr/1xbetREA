package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.SIPConstants;
import android.javax.sip.ListeningPoint;
import android.javax.sip.address.Address;
import android.javax.sip.address.AddressFactory;
import android.javax.sip.address.URI;
import android.javax.sip.header.CSeqHeader;
import android.javax.sip.header.CallIdHeader;
import android.javax.sip.header.ContactHeader;
import android.javax.sip.header.ExpiresHeader;
import android.javax.sip.header.FromHeader;
import android.javax.sip.header.HeaderFactory;
import android.javax.sip.header.MaxForwardsHeader;
import android.javax.sip.header.ToHeader;
import android.javax.sip.header.ViaHeader;
import android.javax.sip.message.MessageFactory;
import android.javax.sip.message.Request;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.main_menu.impl.navigation.MainMenuFragmentScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class zx10 implements zf60, zfu0, pdf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45137a;

    public zx10(euf0 euf0Var) {
        xio xioVar = euf0Var.f8418a;
        czz czzVar = euf0Var.b;
        q7d0 q7d0Var = euf0Var.c;
        dzz dzzVar = euf0Var.d;
        btt0 btt0Var = euf0Var.e;
        gii0 gii0Var = euf0Var.f;
        ort ortVar = euf0Var.g;
        pru pruVar = euf0Var.h;
        knf0 knf0Var = euf0Var.i;
        xioVar.getClass();
        czzVar.getClass();
        q7d0Var.getClass();
        dzzVar.getClass();
        btt0Var.getClass();
        gii0Var.getClass();
        knf0Var.getClass();
        g45 g45Var = new g45();
        g45Var.f10647a = q7d0Var;
        g45Var.b = pruVar;
        g45Var.c = ortVar;
        g45Var.d = gii0Var;
        g45Var.e = dzzVar;
        g45Var.f = xioVar;
        g45Var.g = czzVar;
        g45Var.h = btt0Var;
        g45Var.i = knf0Var;
        this.f45137a = g45Var;
    }

    public static MainMenuFragmentScreen k(zx10 zx10Var, r040 r040Var, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        r9u r9uVar = (r9u) zx10Var.f45137a;
        ygp ygpVar = ygp.f;
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        return new MainMenuFragmentScreen(r040Var, false, z, j1q0Var.f15748a.d(ygpVar));
    }

    @Override // a.zfu0
    public int a(View view) {
        return androidx.recyclerview.widget.b.R(view) - ((ViewGroup.MarginLayoutParams) ((hhe0) view.getLayoutParams())).topMargin;
    }

    @Override // a.zfu0
    public int b() {
        return ((androidx.recyclerview.widget.b) this.f45137a).getPaddingTop();
    }

    @Override // a.pdf0
    public owp0 c() {
        return ((pmi) this.f45137a).c();
    }

    @Override // a.pdf0
    public gxu d() {
        return ((pmi) this.f45137a).d();
    }

    @Override // a.pdf0
    public xfu e() {
        return ((pmi) this.f45137a).e();
    }

    @Override // a.zfu0
    public int f() {
        androidx.recyclerview.widget.b bVar = (androidx.recyclerview.widget.b) this.f45137a;
        return bVar.o - bVar.getPaddingBottom();
    }

    @Override // a.zfu0
    public View g(int i) {
        return ((androidx.recyclerview.widget.b) this.f45137a).H(i);
    }

    @Override // a.zfu0
    public int h(View view) {
        return androidx.recyclerview.widget.b.L(view) + ((ViewGroup.MarginLayoutParams) ((hhe0) view.getLayoutParams())).bottomMargin;
    }

    public Request i(String str, String str2, String str3, String str4, long j, String str5, Map map, int i) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        str5.getClass();
        map.getClass();
        r6k0 r6k0Var = (r6k0) this.f45137a;
        HeaderFactory headerFactoryD = r6k0Var.d();
        AddressFactory addressFactoryC = r6k0Var.c();
        MessageFactory messageFactoryE = r6k0Var.e();
        String strM = n7x.M(str);
        String strM2 = n7x.M(str4);
        Address addressCreateAddress = addressFactoryC.createAddress("sip:" + strM + Separators.AT + str2);
        addressCreateAddress.getClass();
        if (strM2.length() > 0) {
            addressCreateAddress.setDisplayName(strM2);
        }
        Address addressCreateAddress2 = addressFactoryC.createAddress("sip:" + strM + Separators.AT + str2);
        addressCreateAddress2.getClass();
        if (strM2.length() > 0) {
            addressCreateAddress2.setDisplayName(strM2);
        }
        URI uriCreateURI = addressFactoryC.createURI("sip:".concat(str2));
        String strL = kng0.l(strM, Separators.AT, str3);
        String string = UUID.randomUUID().toString();
        string.getClass();
        String strConcat = SIPConstants.BRANCH_MAGIC_COOKIE.concat(kotlin.text.c.r(string, "-", "", false));
        FromHeader fromHeaderCreateFromHeader = headerFactoryD.createFromHeader(addressCreateAddress, str5);
        fromHeaderCreateFromHeader.getClass();
        ToHeader toHeaderCreateToHeader = headerFactoryD.createToHeader(addressCreateAddress2, null);
        toHeaderCreateToHeader.getClass();
        CallIdHeader callIdHeaderCreateCallIdHeader = headerFactoryD.createCallIdHeader(strL);
        callIdHeaderCreateCallIdHeader.getClass();
        CSeqHeader cSeqHeaderCreateCSeqHeader = headerFactoryD.createCSeqHeader(j, "REGISTER");
        cSeqHeaderCreateCSeqHeader.getClass();
        ViaHeader viaHeaderCreateViaHeader = headerFactoryD.createViaHeader(str3, r6k0Var.i(), ListeningPoint.UDP, strConcat);
        viaHeaderCreateViaHeader.getClass();
        MaxForwardsHeader maxForwardsHeaderCreateMaxForwardsHeader = headerFactoryD.createMaxForwardsHeader(70);
        maxForwardsHeaderCreateMaxForwardsHeader.getClass();
        viaHeaderCreateViaHeader.setRPort();
        Request requestCreateRequest = messageFactoryE.createRequest(uriCreateURI, "REGISTER", callIdHeaderCreateCallIdHeader, cSeqHeaderCreateCSeqHeader, fromHeaderCreateFromHeader, toHeaderCreateToHeader, kotlin.collections.a.c(viaHeaderCreateViaHeader), maxForwardsHeaderCreateMaxForwardsHeader);
        requestCreateRequest.getClass();
        int i2 = r6k0Var.i();
        StringBuilder sbN = b1j.n("sip:", strM, Separators.AT, str3, Separators.COLON);
        sbN.append(i2);
        sbN.append(";ob");
        ContactHeader contactHeaderCreateContactHeader = headerFactoryD.createContactHeader(addressFactoryC.createAddress(sbN.toString()));
        contactHeaderCreateContactHeader.getClass();
        requestCreateRequest.addHeader(contactHeaderCreateContactHeader);
        ExpiresHeader expiresHeaderCreateExpiresHeader = headerFactoryD.createExpiresHeader(i);
        expiresHeaderCreateExpiresHeader.getClass();
        requestCreateRequest.addHeader(expiresHeaderCreateExpiresHeader);
        for (Map.Entry entry : map.entrySet()) {
            String str6 = (String) entry.getKey();
            String str7 = (String) entry.getValue();
            String strM3 = n7x.M(str6);
            String strM4 = n7x.M(str7);
            if (n7x.J(strM3) && requestCreateRequest.getHeader(strM3) == null) {
                requestCreateRequest.addHeader(headerFactoryD.createHeader(strM3, strM4));
            }
        }
        return requestCreateRequest;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public android.content.Intent j(a.k9h0 r5, java.util.Map r6) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zx10.j(a.k9h0, java.util.Map):android.content.Intent");
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        uiv0 uiv0Var = xiv0Var.f40966a;
        boolean zU = uiv0Var.u(8);
        int i = uiv0Var.i(8).d;
        if (!zU) {
            ((ck60) this.f45137a).invoke();
        }
        return xiv0Var;
    }

    public Object m(zje zjeVar) {
        nhf0 nhf0Var = (nhf0) this.f45137a;
        Object objD0 = qjj.d0(((mne) nhf0Var.d).b, new d09((Object) nhf0Var, (Object) ((knf0) nhf0Var.b).c(), (yje) null, (byte) 25), zjeVar);
        wne wneVar = wne.f39444a;
        if (objD0 != wneVar) {
            objD0 = Unit.f46060a;
        }
        if (objD0 != wneVar) {
            objD0 = Unit.f46060a;
        }
        return objD0 == wneVar ? objD0 : Unit.f46060a;
    }

    public void n(gv00 gv00Var) {
        gv00Var.getClass();
        g090 g090Var = (g090) ((dpi0) this.f45137a).f6468a;
        List listL = g090Var.l();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            gv00 gv00Var2 = (gv00) obj;
            gv00Var2.getClass();
            if (!Intrinsics.d(gv00Var2.d, gv00Var.d)) {
                arrayList.add(obj);
            }
        }
        g090Var.w(CollectionsKt.r0(arrayList, gv00Var));
    }

    public void o(String str) {
        str.getClass();
        hk3 hk3Var = (hk3) ((mii0) this.f45137a).e;
        hk3Var.getClass();
        File file = new File(hk3Var.f13190a.getFilesDir(), ".CWAC-Update");
        file.mkdirs();
        File file2 = new File(file, hk3.c(str));
        if (file2.exists()) {
            file2.delete();
        }
    }

    public zx10(etj etjVar) {
        etjVar.getClass();
        this.f45137a = etjVar;
    }

    public zx10(j1q0 j1q0Var) {
        j1q0Var.getClass();
        this.f45137a = j1q0Var;
    }

    public zx10(l6a l6aVar) {
        l6aVar.getClass();
        this.f45137a = l6aVar;
    }

    public zx10(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 8:
                this.f45137a = new rta0(gii0Var, (byte) 5);
                break;
            default:
                this.f45137a = new rta0(gii0Var, (byte) 0);
                break;
        }
    }

    public zx10(gne0 gne0Var, gii0 gii0Var, xyt xytVar, knf0 knf0Var) {
        gii0Var.getClass();
        knf0Var.getClass();
        this.f45137a = new pmi(gii0Var, xytVar, knf0Var);
    }

    public zx10(zxz zxzVar) {
        knf0 knf0Var = (knf0) zxzVar.f45181a;
        btt0 btt0Var = (btt0) zxzVar.b;
        wsf0 wsf0Var = (wsf0) zxzVar.d;
        gii0 gii0Var = (gii0) zxzVar.c;
        knf0Var.getClass();
        btt0Var.getClass();
        gii0Var.getClass();
        this.f45137a = new ali(knf0Var, wsf0Var, gii0Var, btt0Var);
    }

    public zx10(cad cadVar, btt0 btt0Var, knf0 knf0Var, r9u r9uVar) {
        btt0Var.getClass();
        knf0Var.getClass();
        r9uVar.getClass();
        this.f45137a = new uii(cadVar, btt0Var, knf0Var, r9uVar);
    }

    public zx10(cad cadVar, knf0 knf0Var, gii0 gii0Var, ubu ubuVar, zoi0 zoi0Var, btt0 btt0Var) {
        knf0Var.getClass();
        gii0Var.getClass();
        btt0Var.getClass();
        this.f45137a = new cu(knf0Var, gii0Var, btt0Var);
    }

    public zx10(r6k0 r6k0Var) {
        r6k0Var.getClass();
        this.f45137a = r6k0Var;
    }

    public /* synthetic */ zx10(Object obj) {
        this.f45137a = obj;
    }

    public zx10() {
        this.f45137a = (ExtraCroppingQuirk) mhk.a().b(ExtraCroppingQuirk.class);
    }

    public zx10(String str, eme0 eme0Var) {
        this.f45137a = new eme0(eme0Var, (byte) 23);
    }

    public zx10(esg0 esg0Var, lsn lsnVar, a1d a1dVar, iip iipVar, oeg0 oeg0Var, wdk0 wdk0Var, mii0 mii0Var, roi0 roi0Var, r9u r9uVar, h3c h3cVar, iqt iqtVar, rou rouVar, sek sekVar, ugf0 ugf0Var) {
        iipVar.getClass();
        oeg0Var.getClass();
        wdk0Var.getClass();
        r9uVar.getClass();
        g45 g45Var = new g45();
        g45Var.f10647a = esg0Var;
        g45Var.b = lsnVar;
        g45Var.c = rouVar;
        g45Var.d = iipVar;
        g45Var.e = a1dVar;
        g45Var.f = oeg0Var;
        g45Var.g = roi0Var;
        g45Var.h = ugf0Var;
        g45Var.i = wdk0Var;
        this.f45137a = g45Var;
    }

    public zx10(Context context) {
        context.getClass();
        this.f45137a = context;
    }
}
