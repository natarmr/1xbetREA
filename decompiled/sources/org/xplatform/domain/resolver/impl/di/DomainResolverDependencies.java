package org.xplatform.domain.resolver.impl.di;

import a.azk;
import a.kii0;
import a.mmy;
import a.nk50;
import a.tiu;
import a.wnh0;
import a.wsb0;
import a.yyk;
import a.zjh0;
import a.zyk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 À\u0006\u0003"}, d2 = {"Lorg/xplatform/domain/resolver/impl/di/DomainResolverDependencies;", "", "La/yyk;", "getDomainResolverConfig", "()La/yyk;", "La/zyk;", "getDomainResolverListener", "()La/zyk;", "La/wsb0;", "getPreferenceDataSource", "()La/wsb0;", "La/kii0;", "getServiceProvider", "()La/kii0;", "La/azk;", "getDomainResolverLogger", "()La/azk;", "La/zjh0;", "getSecretLibSettingsRepository", "()La/zjh0;", "La/mmy;", "getKeys", "()La/mmy;", "La/wnh0;", "getSecurity", "()La/wnh0;", "La/nk50;", "getNetworkAvailableUtil", "()La/nk50;", "La/tiu;", "getLocalDnsUseCase", "()La/tiu;", "org.xplatform.secret.resolver:impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface DomainResolverDependencies {
    yyk getDomainResolverConfig();

    zyk getDomainResolverListener();

    azk getDomainResolverLogger();

    mmy getKeys();

    tiu getLocalDnsUseCase();

    nk50 getNetworkAvailableUtil();

    wsb0 getPreferenceDataSource();

    zjh0 getSecretLibSettingsRepository();

    wnh0 getSecurity();

    kii0 getServiceProvider();
}
