.class public final La/bzs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zp2;
.implements La/quc;
.implements La/lix0;
.implements La/xmw0;


# static fields
.field public static b:La/bzs0;

.field public static final synthetic c:La/bzs0;

.field public static final synthetic d:La/bzs0;

.field public static final synthetic e:La/bzs0;

.field public static final synthetic f:La/bzs0;


# instance fields
.field public final synthetic a:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/bzs0;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/bzs0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/bzs0;->c:La/bzs0;

    .line 9
    .line 10
    new-instance v0, La/bzs0;

    .line 11
    .line 12
    const/16 v1, 0x1a

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/bzs0;-><init>(B)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/bzs0;->d:La/bzs0;

    .line 18
    .line 19
    new-instance v0, La/bzs0;

    .line 20
    .line 21
    const/16 v1, 0x1b

    .line 22
    .line 23
    invoke-direct {v0, v1}, La/bzs0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/bzs0;->e:La/bzs0;

    .line 27
    .line 28
    new-instance v0, La/bzs0;

    .line 29
    .line 30
    const/16 v1, 0x1d

    .line 31
    .line 32
    invoke-direct {v0, v1}, La/bzs0;-><init>(B)V

    .line 33
    .line 34
    .line 35
    sput-object v0, La/bzs0;->f:La/bzs0;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0xf

    .line 2
    .line 3
    iput-byte v0, p0, La/bzs0;->a:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, La/sto;->a()I

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 12
    iput-byte p1, p0, La/bzs0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    const/16 p1, 0xe

    iput-byte p1, p0, La/bzs0;->a:B

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(La/bwv0;La/zvv0;La/uvv0;Z)La/svv0;
    .locals 1

    .line 1
    iget-object p0, p0, La/bwv0;->a:La/mcz;

    .line 2
    .line 3
    invoke-static {p1, p0}, La/bzs0;->c(La/zvv0;La/mcz;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    iget p1, p2, La/uvv0;->c:I

    .line 8
    .line 9
    iget v0, p2, La/uvv0;->e:I

    .line 10
    .line 11
    sub-int/2addr p1, v0

    .line 12
    sub-int v0, p1, p0

    .line 13
    .line 14
    invoke-static {v0, p3, p2}, La/bzs0;->f(IZLa/uvv0;)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    const/4 p3, 0x3

    .line 19
    if-lt p2, p3, :cond_0

    .line 20
    .line 21
    new-instance p0, La/ovv0;

    .line 22
    .line 23
    sget-object p1, La/tvv0;->f:La/tvv0;

    .line 24
    .line 25
    invoke-direct {p0, p1}, La/ovv0;-><init>(La/tvv0;)V

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    new-instance p3, La/qvv0;

    .line 30
    .line 31
    invoke-direct {p3, v0, p1, p0, p2}, La/qvv0;-><init>(IIII)V

    .line 32
    .line 33
    .line 34
    return-object p3
.end method

.method public static c(La/zvv0;La/mcz;)I
    .locals 1

    .line 1
    iget-object v0, p0, La/zvv0;->e:La/nsv0;

    .line 2
    .line 3
    iget v0, v0, La/nsv0;->a:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, La/zvv0;->f:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget-object p0, p0, La/zvv0;->d:La/nsv0;

    .line 12
    .line 13
    iget p0, p0, La/nsv0;->a:I

    .line 14
    .line 15
    sub-int/2addr p0, v0

    .line 16
    iget p1, p1, La/mcz;->m:I

    .line 17
    .line 18
    neg-int p1, p1

    .line 19
    sub-int/2addr p0, p1

    .line 20
    return p0
.end method

.method public static d(ILjava/lang/String;)Lorg/xplatform/web_rules/impl/presentation/navigation/Screens$WebRulesScreen;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/xplatform/web_rules/impl/presentation/navigation/Screens$WebRulesScreen;

    .line 5
    .line 6
    new-instance v1, La/kge;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, v2, p0, p1}, La/kge;-><init>(BILjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lorg/xplatform/web_rules/impl/presentation/navigation/Screens$WebRulesScreen;-><init>(La/kge;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static e(La/bwv0;La/zvv0;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/bwv0;->a:La/mcz;

    .line 5
    .line 6
    invoke-virtual {p0}, La/mcz;->h()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide v2, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    and-long/2addr v0, v2

    .line 16
    long-to-int p0, v0

    .line 17
    iget-object p1, p1, La/zvv0;->d:La/nsv0;

    .line 18
    .line 19
    iget p1, p1, La/nsv0;->a:I

    .line 20
    .line 21
    sub-int/2addr p0, p1

    .line 22
    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    const/4 p1, 0x1

    .line 27
    if-gt p0, p1, :cond_0

    .line 28
    .line 29
    return p1

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    return p0
.end method

.method public static f(IZLa/uvv0;)I
    .locals 0

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    iget p0, p2, La/uvv0;->g:I

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget p0, p2, La/uvv0;->f:I

    .line 9
    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    return p0

    .line 13
    :cond_1
    add-int/lit8 p0, p0, 0x1

    .line 14
    .line 15
    return p0

    .line 16
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public static final g(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Ljava/lang/CharSequence;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ljava/lang/CharSequence;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method


# virtual methods
.method public synthetic b(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-static {p1, p2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/MessageDigest;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public getTime()J
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public i(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string p0, "FirebaseCrashlytics"

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-static {p0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const-string p1, "Skipping logging Crashlytics event to Firebase, no Firebase Analytics"

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p0, p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public zza()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte p0, p0, La/bzs0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, La/btw0;->a:Ljava/util/List;

    .line 7
    .line 8
    sget-object p0, La/zgw0;->b:La/zgw0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/zgw0;->a()La/ahw0;

    .line 11
    .line 12
    .line 13
    sget-object p0, La/ahw0;->a:La/trm0;

    .line 14
    .line 15
    const/16 v0, 0x2e

    .line 16
    .line 17
    const-wide/16 v1, 0x5

    .line 18
    .line 19
    const-string v3, "measurement.sgtm.upload.batches_retrieval_limit"

    .line 20
    .line 21
    invoke-virtual {p0, v3, v0, v1, v2}, La/trm0;->u(Ljava/lang/String;IJ)La/b5x0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, La/b5x0;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Ljava/lang/Long;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    long-to-int p0, v0

    .line 36
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_0
    sget-object p0, La/btw0;->a:Ljava/util/List;

    .line 42
    .line 43
    sget-object p0, La/zgw0;->b:La/zgw0;

    .line 44
    .line 45
    invoke-virtual {p0}, La/zgw0;->a()La/ahw0;

    .line 46
    .line 47
    .line 48
    sget-object p0, La/ahw0;->a:La/trm0;

    .line 49
    .line 50
    const/16 v0, 0x4e

    .line 51
    .line 52
    const-string v1, "measurement.upload.url"

    .line 53
    .line 54
    const-string v2, "https://app-measurement.com/a"

    .line 55
    .line 56
    invoke-virtual {p0, v0, v1, v2}, La/trm0;->v(ILjava/lang/String;Ljava/lang/String;)La/b5x0;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, La/b5x0;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Ljava/lang/String;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_1
    sget-object p0, La/btw0;->a:Ljava/util/List;

    .line 68
    .line 69
    sget-object p0, La/ohw0;->b:La/ohw0;

    .line 70
    .line 71
    iget-object p0, p0, La/ohw0;->a:La/oin0;

    .line 72
    .line 73
    iget-object p0, p0, La/oin0;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, La/qhw0;

    .line 76
    .line 77
    sget-object p0, La/qhw0;->c:La/y4x0;

    .line 78
    .line 79
    invoke-virtual {p0}, La/b5x0;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, Ljava/lang/String;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_2
    sget-object p0, La/btw0;->a:Ljava/util/List;

    .line 87
    .line 88
    sget-object p0, La/zgw0;->b:La/zgw0;

    .line 89
    .line 90
    invoke-virtual {p0}, La/zgw0;->a()La/ahw0;

    .line 91
    .line 92
    .line 93
    sget-object p0, La/ahw0;->a:La/trm0;

    .line 94
    .line 95
    const/4 v0, 0x1

    .line 96
    const-wide/32 v1, 0x36ee80

    .line 97
    .line 98
    .line 99
    const-string v3, "measurement.app_uninstalled_additional_ad_id_cache_time"

    .line 100
    .line 101
    invoke-virtual {p0, v3, v0, v1, v2}, La/trm0;->u(Ljava/lang/String;IJ)La/b5x0;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p0}, La/b5x0;->get()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, Ljava/lang/Long;

    .line 110
    .line 111
    return-object p0

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
