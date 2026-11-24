package com.android.installreferrer.api;

import a.itt0;
import a.ouw;
import a.puw;
import a.quw;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstallReferrerStateListener f45422a;
    public final /* synthetic */ b b;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.b = bVar;
        if (installReferrerStateListener != null) {
            this.f45422a = installReferrerStateListener;
        } else {
            itt0.k("Please specify a listener to know when setup is done.");
            throw null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        quw ouwVar;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i = puw.f27636a;
        if (iBinder == null) {
            ouwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            ouwVar = iInterfaceQueryLocalInterface instanceof quw ? (quw) iInterfaceQueryLocalInterface : new ouw(iBinder);
        }
        b bVar = this.b;
        bVar.c = ouwVar;
        bVar.f45423a = (byte) 2;
        this.f45422a.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.b;
        bVar.c = null;
        bVar.f45423a = (byte) 0;
        this.f45422a.onInstallReferrerServiceDisconnected();
    }
}
