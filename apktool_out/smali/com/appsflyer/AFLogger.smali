.class public final Lcom/appsflyer/AFLogger;
.super Lcom/appsflyer/sdk_base/logger/AFLoggerBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/AFLogger$LogLevel;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010#\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001.B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\u0008J#\u0010\u0010\u001a\u00020\u00062\u0008\u0010\r\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J+\u0010\u0010\u001a\u00020\u00062\u0008\u0010\r\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0014J!\u0010\u0017\u001a\u00020\u00062\u0012\u0010\u0016\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u0015\"\u00020\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00062\u0012\u0010\u0016\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u0015\"\u00020\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\'\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJG\u0010#\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\'\u0010%\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008%\u0010\u001fJ\'\u0010&\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008&\u0010\u001fJ\'\u0010\'\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\'\u0010\u001fJ\u001f\u0010(\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008(\u0010)R\u001b\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00010*8BX\u0083\u0084\u0002\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0015\u0010\u001e\u001a\u00020-8BX\u0083\u0084\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010,"
    }
    d2 = {
        "Lcom/appsflyer/AFLogger;",
        "Lcom/appsflyer/sdk_base/logger/AFLoggerBase;",
        "<init>",
        "()V",
        "",
        "logMessage",
        "",
        "afInfoLog",
        "(Ljava/lang/String;)V",
        "debugLogMessage",
        "afDebugLog",
        "warningLogMessage",
        "afWarnLog",
        "errorLogMessage",
        "",
        "ex",
        "afErrorLog",
        "(Ljava/lang/String;Ljava/lang/Throwable;)V",
        "",
        "printThrowable",
        "(Ljava/lang/String;Ljava/lang/Throwable;Z)V",
        "",
        "client",
        "registerClient",
        "([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V",
        "unregisterClient",
        "Lcom/appsflyer/sdk_base/logger/LogTag;",
        "tag",
        "msg",
        "shouldRemoteDebug",
        "d",
        "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V",
        "throwable",
        "printMsg",
        "shouldReportToExManager",
        "e",
        "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V",
        "i",
        "w",
        "v",
        "force",
        "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V",
        "",
        "AFLogger",
        "La/a8z;",
        "Ljava/util/concurrent/ExecutorService;",
        "LogLevel"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final AFLogger:La/a8z;

.field public static final INSTANCE:Lcom/appsflyer/AFLogger;

.field private static final registerClient:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/appsflyer/AFLogger;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/appsflyer/AFLogger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 7
    .line 8
    new-instance v0, Lcom/appsflyer/c;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Lcom/appsflyer/c;-><init>(B)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lcom/appsflyer/AFLogger;->AFLogger:La/a8z;

    .line 19
    .line 20
    new-instance v0, Lcom/appsflyer/c;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {v0, v1}, Lcom/appsflyer/c;-><init>(B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lcom/appsflyer/AFLogger;->registerClient:La/a8z;

    .line 31
    .line 32
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final AFKeystoreWrapper()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 16
    invoke-static {}, Lcom/appsflyer/internal/AFc1jSDK;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method private static final AFKeystoreWrapper(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    invoke-virtual {p3, p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final AFKeystoreWrapper([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/appsflyer/AFLogger;->AFLogger:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Set;

    .line 8
    .line 9
    check-cast v0, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-static {v0, p0}, La/w3d;->v(Ljava/util/Collection;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final AFLogger(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    invoke-virtual {p3, p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final AFLogger([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/appsflyer/AFLogger;->AFLogger:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Set;

    .line 8
    .line 9
    invoke-static {p0}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/util/Collection;

    .line 14
    .line 15
    invoke-interface {v0, p0}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    invoke-static {}, Lcom/appsflyer/AFLogger;->AFKeystoreWrapper()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static final afDebugLog(Ljava/lang/String;)V
    .locals 3
    .annotation runtime La/lbk;
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 5
    .line 6
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->OTHER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {v0, v1, p0, v2}, Lcom/appsflyer/AFLogger;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 10
    .annotation runtime La/lbk;
    .end annotation

    .line 1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 2
    .line 3
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->OTHER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    move-object v2, p0

    .line 15
    goto :goto_2

    .line 16
    :cond_1
    :goto_1
    const-string p0, "null"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :goto_2
    if-nez p1, :cond_2

    .line 20
    .line 21
    new-instance p1, Ljava/lang/NullPointerException;

    .line 22
    .line 23
    const-string p0, "Invoked with null Throwable"

    .line 24
    .line 25
    invoke-direct {p1, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    move-object v3, p1

    .line 29
    const/16 v8, 0x78

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static final afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 10
    .annotation runtime La/lbk;
    .end annotation

    .line 40
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 41
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->OTHER:Lcom/appsflyer/sdk_base/logger/LogTag;

    if-eqz p0, :cond_1

    .line 42
    invoke-static {p0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v2, p0

    goto :goto_2

    :cond_1
    :goto_1
    const-string p0, "null"

    goto :goto_0

    :goto_2
    if-nez p1, :cond_2

    .line 43
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p0, "Invoked with null Throwable"

    invoke-direct {p1, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    :cond_2
    move-object v3, p1

    const/16 v8, 0x68

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v5, p2

    .line 44
    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    return-void
.end method

.method public static final afInfoLog(Ljava/lang/String;)V
    .locals 3
    .annotation runtime La/lbk;
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 5
    .line 6
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->OTHER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {v0, v1, p0, v2}, Lcom/appsflyer/AFLogger;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final afWarnLog(Ljava/lang/String;)V
    .locals 6
    .annotation runtime La/lbk;
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 5
    .line 6
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->OTHER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 7
    .line 8
    const/4 v4, 0x4

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    move-object v2, p0

    .line 12
    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic b(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/appsflyer/AFLogger;->AFKeystoreWrapper(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/appsflyer/AFLogger;->registerClient(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final d()Ljava/util/Set;
    .locals 1

    .line 31
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    return-object v0
.end method

.method private static final d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    invoke-virtual {p3, p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic f()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-static {}, Lcom/appsflyer/AFLogger;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/appsflyer/AFLogger;->registerClient(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/appsflyer/AFLogger;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/appsflyer/AFLogger;->AFLogger(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/appsflyer/AFLogger;->registerClient(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/AFLogger;->AFLogger([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    return-void
.end method

.method public static synthetic m([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/AFLogger;->AFKeystoreWrapper([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    return-void
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/AFLogger;->unregisterClient(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final registerClient(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-virtual {p2, p0, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->force(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final registerClient(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v0, p1

    move-object p1, p0

    move-object p0, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, v0

    .line 23
    invoke-virtual/range {p0 .. p7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V

    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final registerClient(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-virtual {p3, p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final unregisterClient(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/appsflyer/AFLogger;->AFLogger:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Set;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 26
    .line 27
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method


# virtual methods
.method public final d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Lcom/appsflyer/a;

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/appsflyer/a;-><init>(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZB)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Lcom/appsflyer/b;

    .line 14
    .line 15
    const/4 p2, 0x5

    .line 16
    invoke-direct {p1, p0, p2}, Lcom/appsflyer/b;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lcom/appsflyer/AFLogger;->registerClient:La/a8z;

    .line 20
    .line 21
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/util/concurrent/ExecutorService;

    .line 26
    .line 27
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, Lcom/appsflyer/d;

    .line 11
    .line 12
    invoke-direct/range {p0 .. p7}, Lcom/appsflyer/d;-><init>(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Lcom/appsflyer/b;

    .line 16
    .line 17
    const/4 p2, 0x3

    .line 18
    invoke-direct {p1, p0, p2}, Lcom/appsflyer/b;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lcom/appsflyer/AFLogger;->registerClient:La/a8z;

    .line 22
    .line 23
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljava/util/concurrent/ExecutorService;

    .line 28
    .line 29
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final force(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Lcom/appsflyer/f;

    .line 8
    .line 9
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/f;-><init>(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Lcom/appsflyer/b;

    .line 13
    .line 14
    const/4 p2, 0x4

    .line 15
    invoke-direct {p1, p0, p2}, Lcom/appsflyer/b;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lcom/appsflyer/AFLogger;->registerClient:La/a8z;

    .line 19
    .line 20
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/util/concurrent/ExecutorService;

    .line 25
    .line 26
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Lcom/appsflyer/a;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/appsflyer/a;-><init>(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZB)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Lcom/appsflyer/b;

    .line 14
    .line 15
    const/4 p2, 0x2

    .line 16
    invoke-direct {p1, p0, p2}, Lcom/appsflyer/b;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lcom/appsflyer/AFLogger;->registerClient:La/a8z;

    .line 20
    .line 21
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/util/concurrent/ExecutorService;

    .line 26
    .line 27
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final varargs registerClient([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lcom/appsflyer/e;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1, v0}, Lcom/appsflyer/e;-><init>([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;B)V

    .line 8
    .line 9
    .line 10
    sget-object p1, Lcom/appsflyer/AFLogger;->registerClient:La/a8z;

    .line 11
    .line 12
    invoke-interface {p1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/util/concurrent/ExecutorService;

    .line 17
    .line 18
    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final varargs unregisterClient([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    new-instance p0, Lcom/appsflyer/e;

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/appsflyer/e;-><init>([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;B)V

    .line 33
    sget-object p1, Lcom/appsflyer/AFLogger;->registerClient:La/a8z;

    invoke-interface {p1}, La/a8z;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final v(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Lcom/appsflyer/a;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/appsflyer/a;-><init>(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZB)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Lcom/appsflyer/b;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-direct {p1, p0, p2}, Lcom/appsflyer/b;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lcom/appsflyer/AFLogger;->registerClient:La/a8z;

    .line 20
    .line 21
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/util/concurrent/ExecutorService;

    .line 26
    .line 27
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Lcom/appsflyer/a;

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/appsflyer/a;-><init>(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZB)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Lcom/appsflyer/b;

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-direct {p1, p0, p2}, Lcom/appsflyer/b;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lcom/appsflyer/AFLogger;->registerClient:La/a8z;

    .line 20
    .line 21
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Ljava/util/concurrent/ExecutorService;

    .line 26
    .line 27
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
