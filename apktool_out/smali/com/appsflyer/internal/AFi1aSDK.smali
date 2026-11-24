.class public final Lcom/appsflyer/internal/AFi1aSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

.field public volatile AFLogger:Z

.field public final d:Lcom/appsflyer/internal/AFi1hSDK;

.field private final registerClient:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/appsflyer/sdk_base/referrer/Referrer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFi1hSDK;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFLogger:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lcom/appsflyer/internal/AFi1aSDK;->registerClient:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 22
    .line 23
    iput-object p2, p0, Lcom/appsflyer/internal/AFi1aSDK;->d:Lcom/appsflyer/internal/AFi1hSDK;

    .line 24
    .line 25
    return-void
.end method

.method private synthetic AFKeystoreWrapper(Landroid/content/Context;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "com.appsflyer.referrer.INSTALL_PROVIDER"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->queryIntentContentProviders(Landroid/content/Intent;I)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_3

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Landroid/content/pm/ResolveInfo;

    .line 46
    .line 47
    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    new-instance v2, Lcom/appsflyer/internal/AFi1cSDK;

    .line 52
    .line 53
    invoke-direct {v2, v1, p2, p3}, Lcom/appsflyer/internal/AFi1cSDK;-><init>(Landroid/content/pm/ProviderInfo;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 61
    .line 62
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 63
    .line 64
    const-string v3, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component"

    .line 65
    .line 66
    invoke-virtual {v1, v2, v3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_3

    .line 75
    .line 76
    iget-object p0, p0, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 79
    .line 80
    .line 81
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 82
    .line 83
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 84
    .line 85
    new-instance p2, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v1, "Detected "

    .line 88
    .line 89
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v1, " valid preinstall provider(s)"

    .line 100
    .line 101
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_3

    .line 120
    .line 121
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    check-cast p1, Lcom/appsflyer/sdk_base/referrer/Referrer;

    .line 126
    .line 127
    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    iget-object p2, p2, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 132
    .line 133
    invoke-virtual {p1, p2}, Lcom/appsflyer/sdk_base/referrer/Referrer;->start(Landroid/content/Context;)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_3
    :goto_2
    return-void
.end method

.method private synthetic AFKeystoreWrapper(Ljava/lang/Runnable;)V
    .locals 4

    .line 138
    :try_start_0
    iget-boolean v0, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFLogger:Z

    if-nez v0, :cond_0

    .line 139
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v0, "Skipping ATTR trigger: conversion not yet prepared, referrer data will be included in conversion"

    invoke-virtual {p0, p1, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    .line 140
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v0

    .line 141
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v1, "appsFlyerCount"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v0

    .line 142
    iget-object v1, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object v1

    const-string v3, "newGPReferrerSent"

    invoke-interface {v1, v3}, Lcom/appsflyer/internal/AFc1kSDK;->AFKeystoreWrapper(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 143
    iget-object p0, p0, Lcom/appsflyer/internal/AFi1aSDK;->registerClient:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 144
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception p0

    .line 145
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const-string v1, "Error processing referrer data"

    :goto_0
    invoke-virtual {p1, v0, v1, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private synthetic AFLogger(Lcom/appsflyer/internal/AFi1gSDK;Ljava/lang/Runnable;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFLogger:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 6
    .line 7
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 8
    .line 9
    const-string p2, "Skipping ATTR trigger: conversion not yet prepared, referrer data will be included in conversion"

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 16
    .line 17
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 22
    .line 23
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 28
    .line 29
    const-string v2, "appsFlyerCount"

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-interface {v1, v2, v3}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const-string v2, "newGPReferrerSent"

    .line 37
    .line 38
    invoke-interface {v0, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFKeystoreWrapper(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p1}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getState()Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object v2, Lcom/appsflyer/sdk_base/referrer/Referrer$State;->NOT_STARTED:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 47
    .line 48
    const/4 v4, 0x1

    .line 49
    if-ne p1, v2, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    if-eqz v0, :cond_2

    .line 53
    .line 54
    :goto_0
    move p1, v4

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move p1, v3

    .line 57
    :goto_1
    if-ne v1, v4, :cond_3

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    iget-object p0, p0, Lcom/appsflyer/internal/AFi1aSDK;->registerClient:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 62
    .line 63
    invoke-virtual {p0, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-eqz p0, :cond_3

    .line 68
    .line 69
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 70
    .line 71
    .line 72
    :cond_3
    return-void
.end method

.method private synthetic AFLogger(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
    .locals 4

    .line 73
    new-instance v0, Lcom/appsflyer/internal/AFi1iSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 74
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    sget-object v2, Lcom/appsflyer/internal/AFi1jSDK;->d:Lcom/appsflyer/internal/AFi1jSDK;

    new-instance v3, Lcom/appsflyer/internal/y;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/appsflyer/internal/AFi1iSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFi1jSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Ljava/lang/Runnable;)V

    .line 75
    iget-object p1, p0, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    iget-object p0, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    move-result-object p0

    .line 77
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 78
    invoke-virtual {v0, p0}, Lcom/appsflyer/internal/AFi1iSDK;->start(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFi1aSDK;Ljava/util/concurrent/ExecutorService;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/internal/AFi1aSDK;->d(Ljava/util/concurrent/ExecutorService;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic b(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/internal/AFi1gSDK;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/internal/AFi1aSDK;->AFLogger(Lcom/appsflyer/internal/AFi1gSDK;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic c()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient()V

    return-void
.end method

.method public static synthetic d(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFi1aSDK;->AFLogger(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    return-void
.end method

.method private synthetic d(Ljava/util/concurrent/ExecutorService;Ljava/lang/Runnable;)V
    .locals 2

    .line 31
    new-instance v0, Lcom/appsflyer/internal/o;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p2, v1}, Lcom/appsflyer/internal/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic e(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFi1aSDK;->registerClient(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    return-void
.end method

.method public static synthetic f(Lcom/appsflyer/internal/AFi1aSDK;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic g(Lcom/appsflyer/internal/AFi1aSDK;Landroid/content/Context;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper(Landroid/content/Context;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V

    return-void
.end method

.method private synthetic registerClient(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
    .locals 5

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFi1iSDK;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 4
    .line 5
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lcom/appsflyer/internal/AFi1jSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFi1jSDK;

    .line 10
    .line 11
    new-instance v3, Lcom/appsflyer/internal/w;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-direct {v3, p0, p1, v4}, Lcom/appsflyer/internal/w;-><init>(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;B)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2, p1, v3}, Lcom/appsflyer/internal/AFi1iSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFi1jSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 26
    .line 27
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->valueOf()Lcom/appsflyer/internal/AFd1zSDK;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Lcom/appsflyer/internal/AFi1iSDK;->start(Landroid/content/Context;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method private static synthetic unregisterClient()V
    .locals 0

    .line 39
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Runnable;)Lcom/appsflyer/internal/AFi1gSDK;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->d()Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/appsflyer/internal/r;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {v1, p0, v0, p1, v2}, Lcom/appsflyer/internal/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    .line 14
    .line 15
    iget-object p0, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 16
    .line 17
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->afErrorLog()Lcom/appsflyer/sdk_base/logger/LoggerDelegate;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {p1, v1, p0, v0}, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;-><init>(Ljava/lang/Runnable;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Ljava/util/concurrent/ExecutorService;)V

    .line 22
    .line 23
    .line 24
    new-instance p0, Lcom/appsflyer/internal/AFi1gSDK;

    .line 25
    .line 26
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFi1gSDK;-><init>(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public final unregisterClient(Lcom/appsflyer/internal/AFi1gSDK;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 2

    .line 43
    new-instance v0, Lcom/appsflyer/internal/r;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/appsflyer/internal/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    return-object v0
.end method

.method public final unregisterClient(Landroid/content/Context;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 3

    .line 1
    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 6
    .line 7
    const-string v1, "appsFlyerCount"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 17
    .line 18
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 19
    .line 20
    const-string p2, "Preinstall referrer will not load, the counter >= 1, "

    .line 21
    .line 22
    invoke-virtual {p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->d()Ljava/util/concurrent/ExecutorService;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lcom/appsflyer/internal/x;

    .line 31
    .line 32
    invoke-direct {v1, p0, p1, p2, p3}, Lcom/appsflyer/internal/x;-><init>(Lcom/appsflyer/internal/AFi1aSDK;Landroid/content/Context;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final unregisterClient(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
    .locals 5

    .line 40
    new-instance v0, Lcom/appsflyer/internal/AFi1iSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFi1aSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 41
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    sget-object v2, Lcom/appsflyer/internal/AFi1jSDK;->AFLogger:Lcom/appsflyer/internal/AFi1jSDK;

    new-instance v3, Lcom/appsflyer/internal/w;

    const/4 v4, 0x1

    invoke-direct {v3, p0, p1, v4}, Lcom/appsflyer/internal/w;-><init>(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;B)V

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/appsflyer/internal/AFi1iSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFi1jSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Ljava/lang/Runnable;)V

    .line 42
    iget-object p0, p0, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
