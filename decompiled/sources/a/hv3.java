package a;

import android.gov.nist.core.Separators;
import android.util.Log;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.share.SessionReadyListener;
import com.appsflyer.share.deeplink.DeepLink;
import com.appsflyer.share.deeplink.DeepLinkListener;
import com.appsflyer.share.deeplink.DeepLinkResult;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hv3 implements SessionReadyListener, DeepLinkListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv3 f13708a;

    @Override // com.appsflyer.share.deeplink.DeepLinkListener
    public void onDeepLinking(DeepLinkResult deepLinkResult) {
        rv3 rv3Var = this.f13708a;
        deepLinkResult.getClass();
        int i = iv3.f15425a[deepLinkResult.getStatus().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    t9f.b();
                    return;
                }
                Log.e(rv3.class.getSimpleName(), "UDL error: " + deepLinkResult.getError());
                return;
            }
            Log.d(rv3.class.getSimpleName(), "UDL: " + deepLinkResult.getStatus() + Separators.SP + deepLinkResult.getError());
            return;
        }
        DeepLink deepLink = deepLinkResult.getDeepLink();
        if (deepLink == null) {
            Log.w(rv3.class.getSimpleName(), "UDL FOUND but deepLink is null");
            return;
        }
        if (((gst0) rv3Var.b.get()).a()) {
            return;
        }
        String mediaSource = deepLink.getMediaSource();
        boolean z = false;
        boolean z2 = mediaSource == null || mediaSource.length() == 0;
        String campaign = deepLink.getCampaign();
        String stringValue = deepLink.getStringValue("nr_cid");
        if (stringValue == null) {
            stringValue = "";
        }
        if (campaign != null && campaign.length() != 0) {
            rv3Var.c.f17908a.h("referral_dl", campaign);
            z = z2;
        }
        if (mediaSource != null && mediaSource.length() != 0) {
            rv3Var.c.f17908a.h("MEDIA_SOURCE_ID", mediaSource);
        }
        if (stringValue.length() > 0) {
            rv3Var.c.f17908a.h("promo", stringValue);
            z = true;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String afSub1 = deepLink.getAfSub1();
        if (afSub1 != null) {
        }
        String afSub2 = deepLink.getAfSub2();
        if (afSub2 != null) {
        }
        String afSub3 = deepLink.getAfSub3();
        if (afSub3 != null) {
        }
        String afSub4 = deepLink.getAfSub4();
        if (afSub4 != null) {
        }
        String afSub5 = deepLink.getAfSub5();
        if (afSub5 != null) {
        }
        String stringValue2 = deepLink.getStringValue("af_sub6");
        if (stringValue2 != null) {
            linkedHashMap.put("af_sub6", stringValue2);
        }
        String stringValue3 = deepLink.getStringValue("af_sub7");
        if (stringValue3 != null) {
            linkedHashMap.put("af_sub7", stringValue3);
        }
        String stringValue4 = deepLink.getStringValue("nr_cid");
        if (stringValue4 != null) {
            linkedHashMap.put("nr_cid", stringValue4);
        }
        String campaign2 = deepLink.getCampaign();
        if (campaign2 != null) {
            linkedHashMap.put("campaign", campaign2);
        }
        String mediaSource2 = deepLink.getMediaSource();
        if (mediaSource2 != null) {
            linkedHashMap.put("media_source", mediaSource2);
        }
        rv3Var.c.f17908a.h("post_back", rv3.b(linkedHashMap));
        if (z) {
            if (!rv3Var.l) {
                rv3Var.m = true;
            } else {
                rv3Var.c.f17908a.e("IS_ORGANIC", z2);
                rv3Var.c();
            }
        }
    }

    @Override // com.appsflyer.share.SessionReadyListener
    public void onSessionReady() {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        appsFlyerLib.getClass();
        this.f13708a.a(appsFlyerLib);
    }
}
