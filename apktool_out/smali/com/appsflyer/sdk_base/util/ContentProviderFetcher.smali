.class public abstract Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field protected final authority:Ljava/lang/String;

.field private final backgroundExecutor:Ljava/util/concurrent/Executor;

.field protected final context:Landroid/content/Context;

.field protected final logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

.field private final sig:[Ljava/lang/String;

.field private final task:Ljava/util/concurrent/FutureTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/FutureTask<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public varargs constructor <init>(Landroid/content/Context;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Ljava/util/concurrent/Executor;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/FutureTask;

    .line 5
    .line 6
    new-instance v1, La/hrd;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-direct {v1, p0, v2}, La/hrd;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->task:Ljava/util/concurrent/FutureTask;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->context:Landroid/content/Context;

    .line 18
    .line 19
    iput-object p4, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->authority:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 22
    .line 23
    iput-object p5, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->sig:[Ljava/lang/String;

    .line 24
    .line 25
    iput-object p3, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->backgroundExecutor:Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->lambda$new$0()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic lambda$new$0()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->valid()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->query()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->task:Ljava/util/concurrent/FutureTask;

    .line 2
    .line 3
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    const-wide/16 v2, 0x1f4

    .line 6
    .line 7
    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return-object p0

    .line 12
    :catch_0
    move-exception v0

    .line 13
    goto :goto_0

    .line 14
    :catch_1
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :catch_2
    move-exception v0

    .line 17
    :goto_0
    const/4 v1, 0x0

    .line 18
    invoke-virtual {p0, v0, v1}, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->onError(Ljava/lang/Throwable;Z)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public onError(Ljava/lang/Throwable;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

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
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    move-object v2, p0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const-string p0, ""

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :goto_1
    const/4 v4, 0x0

    .line 21
    move-object v3, p1

    .line 22
    move v5, p2

    .line 23
    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public abstract query()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->backgroundExecutor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->task:Ljava/util/concurrent/FutureTask;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public valid()Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->context:Landroid/content/Context;

    .line 3
    .line 4
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v2, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->authority:Ljava/lang/String;

    .line 9
    .line 10
    const/16 v3, 0x80

    .line 11
    .line 12
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->sig:[Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-object v3, p0, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->context:Landroid/content/Context;

    .line 25
    .line 26
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iget-object v1, v1, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v3, v1}, Lcom/appsflyer/sdk_base/util/AndroidExtensionsKt;->signature(Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :catch_0
    move-exception v1

    .line 45
    goto :goto_0

    .line 46
    :catch_1
    move-exception v1

    .line 47
    goto :goto_0

    .line 48
    :catch_2
    move-exception v1

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return v0

    .line 51
    :goto_0
    invoke-virtual {p0, v1, v0}, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->onError(Ljava/lang/Throwable;Z)V

    .line 52
    .line 53
    .line 54
    return v0
.end method
