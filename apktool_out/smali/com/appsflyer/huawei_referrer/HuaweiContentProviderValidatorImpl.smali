.class public final Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidatorImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidator;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000c\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidatorImpl;",
        "Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidator;",
        "logger",
        "Lcom/appsflyer/sdk_base/logger/AFLoggerBase;",
        "<init>",
        "(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V",
        "getLogger",
        "()Lcom/appsflyer/sdk_base/logger/AFLoggerBase;",
        "isContentProviderPresent",
        "",
        "context",
        "Landroid/content/Context;",
        "isProviderSignatureValid",
        "getContentProviderInfo",
        "Landroid/content/pm/ProviderInfo;",
        "onError",
        "",
        "throwable",
        "",
        "huawei_referrer_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;


# direct methods
.method public constructor <init>(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidatorImpl;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 8
    .line 9
    return-void
.end method

.method private final getContentProviderInfo(Landroid/content/Context;)Landroid/content/pm/ProviderInfo;
    .locals 3

    .line 1
    const-string v0, "com.huawei.appmarket.commondata"

    .line 2
    .line 3
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v2, 0x21

    .line 6
    .line 7
    if-lt v1, v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, La/r6e;->b()Landroid/content/pm/PackageManager$ComponentInfoFlags;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1, v0}, La/r6e;->c(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageManager$ComponentInfoFlags;)Landroid/content/pm/ProviderInfo;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 30
    .line 31
    .line 32
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    return-object p0

    .line 34
    :goto_0
    invoke-direct {p0, p1}, Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidatorImpl;->onError(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return-object p0
.end method

.method private final onError(Ljava/lang/Throwable;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidatorImpl;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 2
    .line 3
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const-string p0, ""

    .line 12
    .line 13
    :cond_0
    move-object v2, p0

    .line 14
    const/16 v8, 0x60

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    move-object v3, p1

    .line 22
    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final getLogger()Lcom/appsflyer/sdk_base/logger/AFLoggerBase;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidatorImpl;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 2
    .line 3
    return-object p0
.end method

.method public isContentProviderPresent(Landroid/content/Context;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidatorImpl;->getContentProviderInfo(Landroid/content/Context;)Landroid/content/pm/ProviderInfo;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public isProviderSignatureValid(Landroid/content/Context;)Z
    .locals 4

    .line 1
    const-string v0, "com.huawei.appmarket"

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidatorImpl;->getContentProviderInfo(Landroid/content/Context;)Landroid/content/pm/ProviderInfo;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return v2

    .line 14
    :cond_0
    :try_start_0
    new-instance v3, Lcom/huawei/appgallery/serviceverifykit/api/ServiceVerifyKit$PkgVerifyBuilder;

    .line 15
    .line 16
    invoke-direct {v3, p1}, Lcom/huawei/appgallery/serviceverifykit/api/ServiceVerifyKit$PkgVerifyBuilder;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, v1, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v3, p1}, Lcom/huawei/appgallery/serviceverifykit/api/ServiceVerifyKit$PkgVerifyBuilder;->setPackageName(Ljava/lang/String;)Lcom/huawei/appgallery/serviceverifykit/api/ServiceVerifyKit$PkgVerifyBuilder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v1, "com.huawei.appgallery.sign_certchain"

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lcom/huawei/appgallery/serviceverifykit/api/ServiceVerifyKit$PkgVerifyBuilder;->setCertChainKey(Ljava/lang/String;)Lcom/huawei/appgallery/serviceverifykit/api/ServiceVerifyKit$PkgVerifyBuilder;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v1, "com.huawei.appgallery.fingerprint_signature"

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Lcom/huawei/appgallery/serviceverifykit/api/ServiceVerifyKit$PkgVerifyBuilder;->setCertSignerKey(Ljava/lang/String;)Lcom/huawei/appgallery/serviceverifykit/api/ServiceVerifyKit$PkgVerifyBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string v1, "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212"

    .line 38
    .line 39
    invoke-virtual {p1, v0, v1}, Lcom/huawei/appgallery/serviceverifykit/api/ServiceVerifyKit$PkgVerifyBuilder;->addLegacyInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/appgallery/serviceverifykit/api/ServiceVerifyKit$PkgVerifyBuilder;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v1, "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F"

    .line 44
    .line 45
    invoke-virtual {p1, v0, v1}, Lcom/huawei/appgallery/serviceverifykit/api/ServiceVerifyKit$PkgVerifyBuilder;->addLegacyInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/appgallery/serviceverifykit/api/ServiceVerifyKit$PkgVerifyBuilder;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Lcom/huawei/appgallery/serviceverifykit/api/ServiceVerifyKit$PkgVerifyBuilder;->isValidPkg()Z

    .line 50
    .line 51
    .line 52
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    return p0

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    invoke-direct {p0, p1}, Lcom/appsflyer/huawei_referrer/HuaweiContentProviderValidatorImpl;->onError(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    return v2
.end method
