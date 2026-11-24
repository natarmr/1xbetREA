.class public final Lcom/appsflyer/internal/AFd1jSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFd1jSDK$AFa1tSDK;,
        Lcom/appsflyer/internal/AFd1jSDK$AFa1ySDK;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0015\u0010\u0011\u001a\u00020\u000e8BX\u0083\u0084\u0002\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0015\u0010\u000f\u001a\u00020\u000e8BX\u0083\u0084\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u00138G\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u000e8G\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u000e8G\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u0015"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFd1jSDK;",
        "",
        "Lcom/appsflyer/internal/AFc1iSDK;",
        "p0",
        "Lcom/appsflyer/internal/AFc1kSDK;",
        "p1",
        "<init>",
        "(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFc1kSDK;)V",
        "i",
        "Lcom/appsflyer/internal/AFc1iSDK;",
        "registerClient",
        "v",
        "Lcom/appsflyer/internal/AFc1kSDK;",
        "d",
        "",
        "w",
        "La/a8z;",
        "unregisterClient",
        "AFKeystoreWrapper",
        "",
        "()Z",
        "()Ljava/lang/String;",
        "AFLogger",
        "AFa1tSDK"
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
.field public static AFLogger:Ljava/lang/String;

.field public static final AFa1tSDK:Lcom/appsflyer/internal/AFd1jSDK$AFa1tSDK;

.field public static d:Lcom/appsflyer/internal/AFd1gSDK;

.field public static registerClient:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static unregisterClient:Ljava/lang/String;


# instance fields
.field public final AFKeystoreWrapper:La/a8z;

.field private final i:Lcom/appsflyer/internal/AFc1iSDK;

.field private final v:Lcom/appsflyer/internal/AFc1kSDK;

.field private final w:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFd1jSDK$AFa1tSDK;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFd1jSDK$AFa1tSDK;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/appsflyer/internal/AFd1jSDK;->AFa1tSDK:Lcom/appsflyer/internal/AFd1jSDK$AFa1tSDK;

    .line 8
    .line 9
    const-string v0, "https://%scdn-%ssettings.%s/android/v2/%s/settings"

    .line 10
    .line 11
    sput-object v0, Lcom/appsflyer/internal/AFd1jSDK;->AFLogger:Ljava/lang/String;

    .line 12
    .line 13
    const-string v0, "https://%scdn-%stestsettings.%s/android/v2/%s/settings"

    .line 14
    .line 15
    sput-object v0, Lcom/appsflyer/internal/AFd1jSDK;->unregisterClient:Ljava/lang/String;

    .line 16
    .line 17
    const-string v0, "playstore"

    .line 18
    .line 19
    const-string v1, "googleplaystore"

    .line 20
    .line 21
    const-string v2, "googleplay"

    .line 22
    .line 23
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lcom/appsflyer/internal/AFd1jSDK;->registerClient:Ljava/util/List;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFc1kSDK;)V
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/appsflyer/internal/AFd1jSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/appsflyer/internal/AFd1jSDK;->v:Lcom/appsflyer/internal/AFc1kSDK;

    .line 13
    .line 14
    new-instance p1, Lcom/appsflyer/internal/n;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p0, p2}, Lcom/appsflyer/internal/n;-><init>(Lcom/appsflyer/internal/AFd1jSDK;B)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/appsflyer/internal/AFd1jSDK;->w:La/a8z;

    .line 25
    .line 26
    new-instance p1, Lcom/appsflyer/internal/n;

    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    invoke-direct {p1, p0, p2}, Lcom/appsflyer/internal/n;-><init>(Lcom/appsflyer/internal/AFd1jSDK;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lcom/appsflyer/internal/AFd1jSDK;->AFKeystoreWrapper:La/a8z;

    .line 37
    .line 38
    return-void
.end method

.method private static final AFKeystoreWrapper(Lcom/appsflyer/internal/AFd1jSDK;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1jSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1jSDK;->w:La/a8z;

    .line 15
    .line 16
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0, p0}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "SHA-256"

    .line 27
    .line 28
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    invoke-static {p0, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v0, Lkotlin/text/Regex;

    .line 69
    .line 70
    const-string v1, "[^\\w]+"

    .line 71
    .line 72
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const-string v1, ""

    .line 76
    .line 77
    invoke-virtual {v0, p0, v1}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const/4 v0, 0x0

    .line 82
    const/4 v1, 0x6

    .line 83
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    const-string v0, "."

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0
.end method

.method public static AFKeystoreWrapper()Z
    .locals 1

    .line 94
    sget-object v0, Lcom/appsflyer/internal/AFd1jSDK;->d:Lcom/appsflyer/internal/AFd1gSDK;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static final AFLogger(Lcom/appsflyer/internal/AFd1gSDK;)V
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/internal/AFd1jSDK$AFa1tSDK;->unregisterClient(Lcom/appsflyer/internal/AFd1gSDK;)V

    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFd1jSDK;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFd1jSDK;->d(Lcom/appsflyer/internal/AFd1jSDK;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/appsflyer/internal/AFd1jSDK;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFd1jSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFd1jSDK;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lcom/appsflyer/internal/AFd1jSDK;)Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1jSDK;->v:Lcom/appsflyer/internal/AFc1kSDK;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1jSDK;->i:Lcom/appsflyer/internal/AFc1iSDK;

    .line 4
    .line 5
    const-string v1, "CHANNEL"

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, ""

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    :cond_0
    invoke-static {v0, p0}, Lcom/appsflyer/internal/AFa1tSDK;->d(Lcom/appsflyer/internal/AFc1kSDK;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_3

    .line 27
    .line 28
    invoke-static {p0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {p0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget-object v0, Lcom/appsflyer/internal/AFd1jSDK;->registerClient:Ljava/util/List;

    .line 44
    .line 45
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_2

    .line 62
    .line 63
    const-string v0, "-"

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 71
    .line 72
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 73
    .line 74
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 75
    .line 76
    const/4 v4, 0x1

    .line 77
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const-string v4, "AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix."

    .line 86
    .line 87
    invoke-static {v0, v4, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    const/4 v6, 0x4

    .line 92
    const/4 v7, 0x0

    .line 93
    const/4 v5, 0x0

    .line 94
    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    move-object p0, v1

    .line 98
    :cond_3
    :goto_0
    if-nez p0, :cond_4

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    move-object v1, p0

    .line 102
    :goto_1
    invoke-static {v1}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0
.end method

.method public static final synthetic registerClient(Lcom/appsflyer/internal/AFd1gSDK;)V
    .locals 0

    .line 54
    sput-object p0, Lcom/appsflyer/internal/AFd1jSDK;->d:Lcom/appsflyer/internal/AFd1gSDK;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 3

    .line 111
    sget-object p0, Lcom/appsflyer/internal/AFd1jSDK;->d:Lcom/appsflyer/internal/AFd1gSDK;

    if-nez p0, :cond_0

    .line 112
    sget-object p0, Lcom/appsflyer/internal/AFd1dSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1dSDK;

    goto :goto_0

    .line 113
    :cond_0
    sget-object p0, Lcom/appsflyer/internal/AFd1dSDK;->registerClient:Lcom/appsflyer/internal/AFd1dSDK;

    .line 114
    :goto_0
    sget-object v0, Lcom/appsflyer/internal/AFd1jSDK$AFa1ySDK;->AFKeystoreWrapper:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_5

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, ""

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-ne p0, v0, :cond_1

    return-object v2

    :cond_1
    invoke-static {}, La/t9f;->b()V

    return-object v1

    .line 115
    :cond_2
    sget-object p0, Lcom/appsflyer/internal/AFd1jSDK;->d:Lcom/appsflyer/internal/AFd1gSDK;

    if-eqz p0, :cond_3

    .line 116
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1gSDK;->AFLogger:Ljava/lang/String;

    :cond_3
    if-nez v1, :cond_4

    return-object v2

    :cond_4
    return-object v1

    .line 117
    :cond_5
    const-string p0, "appsflyersdk.com"

    return-object p0
.end method

.method public final registerClient()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lcom/appsflyer/internal/AFd1jSDK;->d:Lcom/appsflyer/internal/AFd1gSDK;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/appsflyer/internal/AFd1dSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1dSDK;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lcom/appsflyer/internal/AFd1dSDK;->registerClient:Lcom/appsflyer/internal/AFd1dSDK;

    .line 9
    .line 10
    :goto_0
    sget-object v1, Lcom/appsflyer/internal/AFd1jSDK$AFa1ySDK;->AFKeystoreWrapper:[I

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    aget v0, v1, v0

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    if-eq v0, v1, :cond_5

    .line 20
    .line 21
    const/4 p0, 0x2

    .line 22
    const/4 v1, 0x0

    .line 23
    const-string v2, ""

    .line 24
    .line 25
    if-eq v0, p0, :cond_2

    .line 26
    .line 27
    const/4 p0, 0x3

    .line 28
    if-ne v0, p0, :cond_1

    .line 29
    .line 30
    return-object v2

    .line 31
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_2
    sget-object p0, Lcom/appsflyer/internal/AFd1jSDK;->d:Lcom/appsflyer/internal/AFd1gSDK;

    .line 36
    .line 37
    if-eqz p0, :cond_3

    .line 38
    .line 39
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1gSDK;->registerClient:Ljava/lang/String;

    .line 40
    .line 41
    :cond_3
    if-nez v1, :cond_4

    .line 42
    .line 43
    return-object v2

    .line 44
    :cond_4
    return-object v1

    .line 45
    :cond_5
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1jSDK;->AFKeystoreWrapper:La/a8z;

    .line 46
    .line 47
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Ljava/lang/String;

    .line 52
    .line 53
    return-object p0
.end method
