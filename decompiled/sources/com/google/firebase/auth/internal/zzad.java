package com.google.firebase.auth.internal;

import a.equ0;
import a.lrt0;
import a.nfq;
import a.q5x;
import a.qmw0;
import a.s0x;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.zzc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzad extends FirebaseUser {
    public static final Parcelable.Creator<zzad> CREATOR = new equ0(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzaia f45652a;
    public zzz b;
    public String c;
    public String d;
    public ArrayList e;
    public ArrayList f;
    public String g;
    public Boolean h;
    public zzaf i;
    public boolean j;
    public zzc k;
    public zzbl l;
    public List m;

    public zzad(nfq nfqVar, ArrayList arrayList) {
        s0x.H(nfqVar);
        nfqVar.a();
        this.c = nfqVar.b;
        this.d = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.g = "2";
        p(arrayList);
    }

    @Override // a.lrt0
    public final String i() {
        return this.b.b;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String m() {
        String str;
        Map map;
        zzaia zzaiaVar = this.f45652a;
        if (zzaiaVar == null || (str = zzaiaVar.b) == null || (map = (Map) qmw0.a(str).b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final boolean o() {
        String str;
        Boolean bool = this.h;
        if (bool == null || bool.booleanValue()) {
            zzaia zzaiaVar = this.f45652a;
            if (zzaiaVar != null) {
                Map map = (Map) qmw0.a(zzaiaVar.b).b.get("firebase");
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z = true;
            if (this.e.size() > 1 || (str != null && str.equals(Payload.CUSTOM))) {
                z = false;
            }
            this.h = Boolean.valueOf(z);
        }
        return this.h.booleanValue();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final synchronized zzad p(List list) {
        try {
            s0x.H(list);
            this.e = new ArrayList(list.size());
            this.f = new ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                lrt0 lrt0Var = (lrt0) list.get(i);
                if (lrt0Var.i().equals("firebase")) {
                    this.b = (zzz) lrt0Var;
                } else {
                    this.f.add(lrt0Var.i());
                }
                this.e.add((zzz) lrt0Var);
            }
            if (this.b == null) {
                this.b = (zzz) this.e.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void s(ArrayList arrayList) {
        zzbl zzblVar;
        if (arrayList.isEmpty()) {
            zzblVar = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
                if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                    arrayList2.add((PhoneMultiFactorInfo) multiFactorInfo);
                } else if (multiFactorInfo instanceof TotpMultiFactorInfo) {
                    arrayList3.add((TotpMultiFactorInfo) multiFactorInfo);
                }
            }
            zzblVar = new zzbl(arrayList2, arrayList3);
        }
        this.l = zzblVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.j0(parcel, 1, this.f45652a, i);
        q5x.j0(parcel, 2, this.b, i);
        q5x.k0(parcel, 3, this.c);
        q5x.k0(parcel, 4, this.d);
        q5x.n0(parcel, 5, this.e);
        q5x.l0(parcel, 6, this.f);
        q5x.k0(parcel, 7, this.g);
        q5x.c0(parcel, 8, Boolean.valueOf(o()));
        q5x.j0(parcel, 9, this.i, i);
        boolean z = this.j;
        q5x.o0(parcel, 10, 4);
        parcel.writeInt(z ? 1 : 0);
        q5x.j0(parcel, 11, this.k, i);
        q5x.j0(parcel, 12, this.l, i);
        q5x.n0(parcel, 13, this.m);
        q5x.q0(parcel, iP0);
    }
}
