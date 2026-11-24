package a;

import android.content.ClipData;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes.dex */
public final class pee implements oee, qee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26847a = 0;
    public ClipData b;
    public byte c;
    public int d;
    public Uri e;
    public Bundle f;

    public pee(pee peeVar) {
        ClipData clipData = peeVar.b;
        clipData.getClass();
        this.b = clipData;
        byte b = peeVar.c;
        z1x.v(b, 0, 5, Payload.SOURCE);
        this.c = b;
        int i = peeVar.d;
        if ((i & 1) != i) {
            c99.p("Requested flags 0x", Integer.toHexString(i), ", but only 0x", Integer.toHexString(1), " are allowed");
            throw null;
        }
        this.d = i;
        this.e = peeVar.e;
        this.f = peeVar.f;
    }

    @Override // a.qee
    public int a() {
        return this.d;
    }

    @Override // a.qee
    public int b() {
        return this.c;
    }

    @Override // a.oee
    public ree build() {
        return new ree(new pee(this));
    }

    @Override // a.oee
    public void d(Uri uri) {
        this.e = uri;
    }

    @Override // a.qee
    public ContentInfo e() {
        return null;
    }

    @Override // a.qee
    public ClipData f() {
        return this.b;
    }

    @Override // a.oee
    public void h(int i) {
        this.d = i;
    }

    @Override // a.oee
    public void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f26847a) {
            case 1:
                Uri uri = this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                byte b = this.c;
                if (b == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (b == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (b == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (b == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (b != 4) {
                    strValueOf = b != 5 ? String.valueOf((int) b) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i = this.d;
                sb.append((i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + Separators.RPAREN;
                }
                sb.append(str);
                return axq.n(sb, this.f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ pee() {
    }
}
