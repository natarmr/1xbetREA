.class public Lcom/appsflyer/samsung_referrer/SamsungReferrer;
.super Lcom/appsflyer/samsung_referrer/ContentProviderReferrer;
.source "SourceFile"


# instance fields
.field private final executorService:Ljava/util/concurrent/ExecutorService;

.field private final loggerBase:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;


# direct methods
.method public constructor <init>(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
    .locals 2

    .line 1
    const-string v0, "store"

    .line 2
    .line 3
    const-string v1, "samsung"

    .line 4
    .line 5
    invoke-direct {p0, v0, v1, p1}, Lcom/appsflyer/samsung_referrer/ContentProviderReferrer;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;->getBackgroundExecutor()Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;->getLogger()Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer;->loggerBase:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public start(Landroid/content/Context;)V
    .locals 7

    .line 1
    new-instance v0, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;

    .line 2
    .line 3
    iget-object v3, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer;->loggerBase:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 4
    .line 5
    iget-object v4, p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    const-string v1, "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901"

    .line 8
    .line 9
    filled-new-array {v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    const-string v5, "com.sec.android.app.samsungapps.referrer"

    .line 14
    .line 15
    move-object v1, p0

    .line 16
    move-object v2, p1

    .line 17
    invoke-direct/range {v0 .. v6}, Lcom/appsflyer/samsung_referrer/SamsungReferrer$1;-><init>(Lcom/appsflyer/samsung_referrer/SamsungReferrer;Landroid/content/Context;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Ljava/util/concurrent/Executor;Ljava/lang/String;[Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Lcom/appsflyer/samsung_referrer/ContentProviderReferrer;->start(Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
