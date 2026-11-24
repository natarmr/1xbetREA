.class public final La/bbw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zf60;
.implements La/tdo0;
.implements La/xro;


# static fields
.field public static c:La/bbw0;

.field public static final d:Ljava/lang/Object;

.field public static volatile e:La/bbw0;

.field public static final f:La/vit;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/bbw0;->d:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, La/vit;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, La/vit;-><init>(B)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/bbw0;->f:La/vit;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(B)V
    .locals 4

    .line 1
    iput-byte p1, p0, La/bbw0;->a:B

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    return-void

    .line 17
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {}, La/wy40;->l()La/wy40;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 25
    .line 26
    return-void

    .line 27
    :sswitch_1
    new-instance p1, La/ao20;

    .line 28
    .line 29
    :try_start_0
    const-string v0, "com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory"

    .line 30
    .line 31
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "getInstance"

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, La/x440;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catch_0
    sget-object v0, La/bbw0;->f:La/vit;

    .line 50
    .line 51
    :goto_0
    const/4 v1, 0x2

    .line 52
    new-array v1, v1, [La/x440;

    .line 53
    .line 54
    sget-object v2, La/vit;->b:La/vit;

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    aput-object v2, v1, v3

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    aput-object v0, v1, v2

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v1, p1, La/ao20;->a:[La/x440;

    .line 66
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    sget-object v0, La/cmx;->a:Ljava/nio/charset/Charset;

    .line 71
    .line 72
    iput-object p1, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 73
    .line 74
    return-void

    .line 75
    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_1
        0x10 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(La/epi0;)V
    .locals 2

    const/16 v0, 0xa

    iput-byte v0, p0, La/bbw0;->a:B

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    new-instance v0, La/clc;

    const/16 v1, 0x14

    invoke-direct {v0, p1, v1}, La/clc;-><init>(Ljava/lang/Object;B)V

    .line 100
    iput-object v0, p0, La/bbw0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    iput-byte p2, p0, La/bbw0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sparse-switch p2, :sswitch_data_0

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p1, p0, La/bbw0;->b:Ljava/lang/Object;

    return-void

    .line 92
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    new-instance p2, La/sza;

    const/4 v0, 0x5

    invoke-direct {p2, p1, v0}, La/sza;-><init>(La/gii0;B)V

    iput-object p2, p0, La/bbw0;->b:Ljava/lang/Object;

    return-void

    .line 94
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    new-instance p2, La/sza;

    const/4 v0, 0x1

    invoke-direct {p2, p1, v0}, La/sza;-><init>(La/gii0;B)V

    iput-object p2, p0, La/bbw0;->b:Ljava/lang/Object;

    return-void

    .line 96
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    new-instance p2, La/zm;

    const/16 v0, 0x14

    invoke-direct {p2, p1, v0}, La/zm;-><init>(La/gii0;B)V

    iput-object p2, p0, La/bbw0;->b:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xd -> :sswitch_2
        0x11 -> :sswitch_1
        0x12 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(La/ht2;)V
    .locals 1

    const/4 v0, 0x4

    iput-byte v0, p0, La/bbw0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-object p1, p0, La/bbw0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/kki;La/uxs0;)V
    .locals 0

    const/16 p2, 0xe

    iput-byte p2, p0, La/bbw0;->a:B

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    iput-object p1, p0, La/bbw0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/qp;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/bbw0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    iput-object p1, p0, La/bbw0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/sjl0;)V
    .locals 1

    const/16 v0, 0x14

    iput-byte v0, p0, La/bbw0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p1, p0, La/bbw0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/ulk;)V
    .locals 1

    const/16 v0, 0x18

    iput-byte v0, p0, La/bbw0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, La/bbw0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/bbw0;->a:B

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, La/xqm0;->a(Landroid/content/Context;)La/xqm0;

    move-result-object p1

    iput-object p1, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 77
    invoke-virtual {p1}, La/xqm0;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 78
    const-string p0, "defaultGoogleSignInAccount"

    invoke-virtual {p1, p0}, La/xqm0;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 79
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "googleSignInOptions"

    .line 80
    invoke-static {v0, p0}, La/xqm0;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, La/xqm0;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 81
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->m(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 75
    iput-byte p2, p0, La/bbw0;->a:B

    iput-object p1, p0, La/bbw0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static h(J)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;
    .locals 2

    .line 1
    new-instance v0, La/i44;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, La/i44;-><init>(J)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {p0, p1, v0, v1}, Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;-><init>(Ljava/lang/String;La/xbf;Z)V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public static m()La/bbw0;
    .locals 3

    .line 1
    sget-object v0, La/bbw0;->e:La/bbw0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget-object v0, La/bbw0;->d:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, La/bbw0;->e:La/bbw0;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, La/bbw0;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, v2}, La/bbw0;-><init>(B)V

    .line 16
    .line 17
    .line 18
    sput-object v1, La/bbw0;->e:La/bbw0;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    monitor-exit v0

    .line 24
    goto :goto_2

    .line 25
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw v1

    .line 27
    :cond_1
    :goto_2
    sget-object v0, La/bbw0;->e:La/bbw0;

    .line 28
    .line 29
    invoke-static {v0}, La/s0x;->H(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public static n(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
    .locals 2

    .line 1
    sget-object v0, La/s470;->e:La/s470;

    .line 2
    .line 3
    invoke-virtual {v0}, La/s470;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    cmp-long v0, p0, v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance p0, Lorg/xplatform/bonus_games/impl/core/presentation/games_list/utils/PromoXGamesScreens$PromoChestsScreen;

    .line 12
    .line 13
    invoke-direct {p0, p2}, Lorg/xplatform/bonus_games/impl/core/presentation/games_list/utils/PromoXGamesScreens$PromoChestsScreen;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object v0, La/s470;->d:La/s470;

    .line 18
    .line 19
    invoke-virtual {v0}, La/s470;->a()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    cmp-long v0, p0, v0

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    new-instance p0, Lorg/xplatform/bonus_games/impl/core/presentation/games_list/utils/PromoXGamesScreens$PromoSafesScreen;

    .line 28
    .line 29
    invoke-direct {p0, p2}, Lorg/xplatform/bonus_games/impl/core/presentation/games_list/utils/PromoXGamesScreens$PromoSafesScreen;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_1
    sget-object p2, La/s470;->f:La/s470;

    .line 34
    .line 35
    invoke-virtual {p2}, La/s470;->a()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    cmp-long p2, p0, v0

    .line 40
    .line 41
    if-nez p2, :cond_2

    .line 42
    .line 43
    new-instance p0, Lorg/xplatform/bonus_games/impl/core/presentation/games_list/utils/PromoXGamesScreens$LotteryScreen;

    .line 44
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_2
    sget-object p2, La/s470;->c:La/s470;

    .line 50
    .line 51
    invoke-virtual {p2}, La/s470;->a()J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    cmp-long p0, p0, v0

    .line 56
    .line 57
    if-nez p0, :cond_3

    .line 58
    .line 59
    new-instance p0, Lorg/xplatform/bonus_games/impl/core/presentation/games_list/utils/PromoXGamesScreens$MemoryScreen;

    .line 60
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_3
    const/4 p0, 0x0

    .line 66
    return-object p0
.end method

.method public static declared-synchronized t(Landroid/content/Context;)La/bbw0;
    .locals 2

    .line 1
    const-class v0, La/bbw0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    :try_start_1
    sget-object v1, La/bbw0;->c:La/bbw0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :try_start_3
    new-instance v1, La/bbw0;

    .line 16
    .line 17
    invoke-direct {v1, p0}, La/bbw0;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, La/bbw0;->c:La/bbw0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :goto_1
    monitor-exit v0

    .line 24
    return-object v1

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 27
    :try_start_5
    throw p0

    .line 28
    :catchall_1
    move-exception p0

    .line 29
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 30
    throw p0
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    const/4 v7, 0x0

    .line 10
    move-object v1, p0

    .line 11
    move-object v2, p1

    .line 12
    move-object v4, p2

    .line 13
    move-object v5, p3

    .line 14
    move v6, p4

    .line 15
    invoke-virtual/range {v1 .. v7}, La/bbw0;->v(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/content/ServiceConnection;ILjava/util/concurrent/Executor;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public b()La/wy40;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public c()La/hx9;
    .locals 2

    .line 1
    new-instance v0, La/hx9;

    .line 2
    .line 3
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/wy40;

    .line 6
    .line 7
    invoke-static {p0}, La/b780;->j(La/drd;)La/b780;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/16 v1, 0x14

    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, La/h03;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public d(Ljava/lang/String;IIILjava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p6, La/ul5;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, La/ul5;

    .line 7
    .line 8
    iget v1, v0, La/ul5;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/ul5;->k:I

    .line 18
    .line 19
    :goto_0
    move-object p6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/ul5;

    .line 22
    .line 23
    invoke-direct {v0, p0, p6}, La/ul5;-><init>(La/bbw0;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p6, La/ul5;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, p6, La/ul5;->k:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, La/gii0;

    .line 55
    .line 56
    const-class v0, La/sl5;

    .line 57
    .line 58
    sget-object v2, La/sre0;->a:La/tre0;

    .line 59
    .line 60
    invoke-virtual {v2, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p0, v0}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/sl5;

    .line 69
    .line 70
    iput v3, p6, La/ul5;->k:I

    .line 71
    .line 72
    move v4, p3

    .line 73
    move p3, p2

    .line 74
    move-object p2, p5

    .line 75
    move p5, p4

    .line 76
    move p4, v4

    .line 77
    invoke-interface/range {p0 .. p6}, La/sl5;->a(Ljava/lang/String;Ljava/lang/String;IIILa/yje;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-ne v0, v1, :cond_3

    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_3
    :goto_2
    check-cast v0, La/q16;

    .line 85
    .line 86
    iget-object p0, v0, La/q16;->d:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p0, Ljava/util/List;

    .line 89
    .line 90
    if-nez p0, :cond_4

    .line 91
    .line 92
    sget-object p0, La/iun;->a:La/iun;

    .line 93
    .line 94
    :cond_4
    new-instance p1, La/s7f;

    .line 95
    .line 96
    const/16 p2, 0x1a

    .line 97
    .line 98
    invoke-direct {p1, p2}, La/s7f;-><init>(B)V

    .line 99
    .line 100
    .line 101
    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0
.end method

.method public f(JLa/a570;Ljava/lang/String;Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
    .locals 3

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p3, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    instance-of p0, p3, La/z470;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-static {p3}, La/x1x;->D(La/a570;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sget-object p0, La/csr;->e:La/csr;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v2, Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1;

    .line 21
    .line 22
    invoke-direct {v2, v0, v1, p0, p5}, Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1;-><init>(JLa/csr;Z)V

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    instance-of p0, p3, La/w470;

    .line 27
    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    invoke-static {p3}, La/x1x;->D(La/a570;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    invoke-static {v0, v1, p4}, La/bbw0;->n(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    :goto_0
    if-eqz p3, :cond_3

    .line 40
    .line 41
    invoke-static {p3}, La/x1x;->D(La/a570;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    goto :goto_1

    .line 46
    :cond_3
    move-wide v0, p1

    .line 47
    :goto_1
    invoke-static {v0, v1, p4}, La/bbw0;->n(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-nez p0, :cond_4

    .line 52
    .line 53
    sget-object p0, La/csr;->e:La/csr;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v2, Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1;

    .line 59
    .line 60
    invoke-direct {v2, v0, v1, p0, p5}, Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1;-><init>(JLa/csr;Z)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    move-object v2, p0

    .line 65
    :goto_2
    if-nez v2, :cond_7

    .line 66
    .line 67
    if-eqz p3, :cond_5

    .line 68
    .line 69
    invoke-static {p3}, La/x1x;->D(La/a570;)J

    .line 70
    .line 71
    .line 72
    move-result-wide p1

    .line 73
    :cond_5
    invoke-static {p1, p2, p4}, La/bbw0;->n(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-nez p0, :cond_6

    .line 78
    .line 79
    sget-object p0, La/csr;->e:La/csr;

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    new-instance p3, Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1;

    .line 85
    .line 86
    invoke-direct {p3, p1, p2, p0, p5}, Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1;-><init>(JLa/csr;Z)V

    .line 87
    .line 88
    .line 89
    return-object p3

    .line 90
    :cond_6
    return-object p0

    .line 91
    :cond_7
    return-object v2
.end method

.method public g(JLa/zje;Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, La/cf8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/cf8;

    .line 7
    .line 8
    iget v1, v0, La/cf8;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/cf8;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/cf8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/cf8;-><init>(La/bbw0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/cf8;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/cf8;->n:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-boolean p5, v0, La/cf8;->k:Z

    .line 38
    .line 39
    iget-wide p1, v0, La/cf8;->i:J

    .line 40
    .line 41
    iget-object p4, v0, La/cf8;->j:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, La/kki;

    .line 59
    .line 60
    iput-object p4, v0, La/cf8;->j:Ljava/lang/String;

    .line 61
    .line 62
    iput-wide p1, v0, La/cf8;->i:J

    .line 63
    .line 64
    iput-boolean p5, v0, La/cf8;->k:Z

    .line 65
    .line 66
    iput v4, v0, La/cf8;->n:I

    .line 67
    .line 68
    invoke-virtual {p0, v0}, La/kki;->o(La/zje;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    if-ne p3, v1, :cond_3

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/Iterable;

    .line 76
    .line 77
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    if-eqz p3, :cond_5

    .line 86
    .line 87
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    move-object v0, p3

    .line 92
    check-cast v0, La/pe8;

    .line 93
    .line 94
    iget-wide v0, v0, La/pe8;->a:J

    .line 95
    .line 96
    cmp-long v0, v0, p1

    .line 97
    .line 98
    if-nez v0, :cond_4

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    move-object p3, v3

    .line 102
    :goto_2
    check-cast p3, La/pe8;

    .line 103
    .line 104
    if-eqz p3, :cond_8

    .line 105
    .line 106
    sget-object p0, La/a570;->Companion:La/t470;

    .line 107
    .line 108
    iget-boolean p3, p3, La/pe8;->h:Z

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {p3, p1, p2}, La/t470;->a(ZJ)La/a570;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    instance-of p3, p0, La/z470;

    .line 118
    .line 119
    if-eqz p3, :cond_6

    .line 120
    .line 121
    sget-object p0, La/csr;->e:La/csr;

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance p3, Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1;

    .line 127
    .line 128
    invoke-direct {p3, p1, p2, p0, p5}, Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1;-><init>(JLa/csr;Z)V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    instance-of p3, p0, La/w470;

    .line 133
    .line 134
    if-eqz p3, :cond_7

    .line 135
    .line 136
    invoke-static {p0}, La/x1x;->D(La/a570;)J

    .line 137
    .line 138
    .line 139
    move-result-wide v0

    .line 140
    invoke-static {v0, v1, p4}, La/bbw0;->n(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    :goto_3
    if-eqz p3, :cond_8

    .line 145
    .line 146
    return-object p3

    .line 147
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 148
    .line 149
    .line 150
    return-object v3

    .line 151
    :cond_8
    invoke-static {p1, p2, p4}, La/bbw0;->n(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    if-nez p0, :cond_9

    .line 156
    .line 157
    sget-object p0, La/csr;->e:La/csr;

    .line 158
    .line 159
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    new-instance p3, Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1;

    .line 163
    .line 164
    invoke-direct {p3, p1, p2, p0, p5}, Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1;-><init>(JLa/csr;Z)V

    .line 165
    .line 166
    .line 167
    return-object p3

    .line 168
    :cond_9
    return-object p0
.end method

.method public i(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jo20;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/sza;

    .line 4
    .line 5
    instance-of v1, p4, La/mmb;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p4

    .line 10
    check-cast v1, La/mmb;

    .line 11
    .line 12
    iget v2, v1, La/mmb;->k:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, La/mmb;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/mmb;

    .line 25
    .line 26
    invoke-direct {v1, p0, p4}, La/mmb;-><init>(La/bbw0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p0, v1, La/mmb;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object p4, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v1, La/mmb;->k:I

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x2

    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v5, :cond_2

    .line 41
    .line 42
    if-ne v2, v4, :cond_1

    .line 43
    .line 44
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_6

    .line 66
    .line 67
    if-ne p0, v5, :cond_5

    .line 68
    .line 69
    invoke-virtual {v0}, La/sza;->invoke()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, La/bog;

    .line 74
    .line 75
    invoke-static {p2}, Lorg/xplatform/cyber/section/api/domain/entity/d;->b(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput v4, v1, La/mmb;->k:I

    .line 80
    .line 81
    invoke-interface {p0, p1, p3, v1}, La/bog;->b(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-ne p0, p4, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    :goto_1
    check-cast p0, La/dx5;

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 92
    .line 93
    .line 94
    return-object v3

    .line 95
    :cond_6
    invoke-virtual {v0}, La/sza;->invoke()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/bog;

    .line 100
    .line 101
    invoke-static {p2}, Lorg/xplatform/cyber/section/api/domain/entity/d;->b(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iput v5, v1, La/mmb;->k:I

    .line 106
    .line 107
    invoke-interface {p0, p1, p3, v1}, La/bog;->g(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    if-ne p0, p4, :cond_7

    .line 112
    .line 113
    :goto_2
    return-object p4

    .line 114
    :cond_7
    :goto_3
    check-cast p0, La/dx5;

    .line 115
    .line 116
    :goto_4
    invoke-virtual {p0}, La/dx5;->a()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0
.end method

.method public j(Landroid/widget/FrameLayout;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/gd5;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/gd5;->d(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    instance-of v0, p1, Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    check-cast p1, Ljava/lang/String;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, La/gd5;->b:Lkotlin/jvm/functions/Function1;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public k(La/sip;La/jo20;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/sza;

    .line 4
    .line 5
    instance-of v1, p3, La/zbb;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p3

    .line 10
    check-cast v1, La/zbb;

    .line 11
    .line 12
    iget v2, v1, La/zbb;->k:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, La/zbb;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/zbb;

    .line 25
    .line 26
    invoke-direct {v1, p0, p3}, La/zbb;-><init>(La/bbw0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p0, v1, La/zbb;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object p3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v1, La/zbb;->k:I

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x2

    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v5, :cond_2

    .line 41
    .line 42
    if-ne v2, v4, :cond_1

    .line 43
    .line 44
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_6

    .line 66
    .line 67
    if-ne p0, v5, :cond_5

    .line 68
    .line 69
    invoke-virtual {v0}, La/sza;->invoke()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, La/bog;

    .line 74
    .line 75
    iput v4, v1, La/zbb;->k:I

    .line 76
    .line 77
    invoke-interface {p0, p2, v1}, La/bog;->h(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-ne p0, p3, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    :goto_1
    check-cast p0, La/dx5;

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 88
    .line 89
    .line 90
    return-object v3

    .line 91
    :cond_6
    invoke-virtual {v0}, La/sza;->invoke()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, La/bog;

    .line 96
    .line 97
    iput v5, v1, La/zbb;->k:I

    .line 98
    .line 99
    invoke-interface {p0, p2, v1}, La/bog;->a(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-ne p0, p3, :cond_7

    .line 104
    .line 105
    :goto_2
    return-object p3

    .line 106
    :cond_7
    :goto_3
    check-cast p0, La/dx5;

    .line 107
    .line 108
    :goto_4
    invoke-virtual {p0}, La/dx5;->a()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0
.end method

.method public l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 2

    .line 1
    iget-byte v0, p0, La/bbw0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p1, p2, La/xiv0;->a:La/uiv0;

    .line 12
    .line 13
    const/16 p2, 0x8

    .line 14
    .line 15
    invoke-virtual {p1, p2}, La/uiv0;->u(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1, p2}, La/uiv0;->i(I)La/pfx;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget p1, p1, La/pfx;->d:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p2, 0x2

    .line 29
    invoke-virtual {p1, p2}, La/uiv0;->i(I)La/pfx;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget p1, p1, La/pfx;->d:I

    .line 34
    .line 35
    :goto_0
    check-cast p0, La/tn3;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {p0, p2, v0, v1, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 54
    .line 55
    .line 56
    sget-object p0, La/xiv0;->b:La/xiv0;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_0
    check-cast p0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    move-object p1, p2

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    const/4 p1, 0x0

    .line 70
    :goto_1
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->g:La/xiv0;

    .line 71
    .line 72
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_3

    .line 77
    .line 78
    iput-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->g:La/xiv0;

    .line 79
    .line 80
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->x:Landroid/graphics/drawable/Drawable;

    .line 81
    .line 82
    const/4 v0, 0x1

    .line 83
    if-eqz p1, :cond_2

    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-lez p1, :cond_2

    .line 90
    .line 91
    move p1, v0

    .line 92
    goto :goto_2

    .line 93
    :cond_2
    const/4 p1, 0x0

    .line 94
    :goto_2
    xor-int/2addr p1, v0

    .line 95
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 99
    .line 100
    .line 101
    :cond_3
    return-object p2

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public o(La/drd;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, La/drd;->c()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, La/u15;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, La/wy40;

    .line 30
    .line 31
    invoke-interface {p1, v1}, La/drd;->g(La/u15;)La/crd;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-interface {p1, v1}, La/drd;->d(La/u15;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v2, v1, v3, v4}, La/wy40;->x(La/u15;La/crd;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-void
.end method

.method public p(JLa/zje;Ljava/util/List;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/l3c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/l3c;

    .line 7
    .line 8
    iget v1, v0, La/l3c;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/l3c;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/l3c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/l3c;-><init>(La/bbw0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/l3c;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/l3c;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance p3, Ljava/lang/Long;

    .line 51
    .line 52
    invoke-direct {p3, p1, p2}, Ljava/lang/Long;-><init>(J)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p4, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p3

    .line 59
    if-nez p3, :cond_4

    .line 60
    .line 61
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, La/sjl0;

    .line 64
    .line 65
    iput v3, v0, La/l3c;->k:I

    .line 66
    .line 67
    invoke-virtual {p0, p1, p2, v0}, La/sjl0;->c(JLa/zje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    if-ne p3, v1, :cond_3

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    :goto_1
    check-cast p3, La/ril0;

    .line 75
    .line 76
    iget-boolean p0, p3, La/ril0;->e:Z

    .line 77
    .line 78
    if-eqz p0, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    const/4 v3, 0x0

    .line 82
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method

.method public q(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/n8c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/n8c;

    .line 7
    .line 8
    iget v1, v0, La/n8c;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/n8c;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/n8c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/n8c;-><init>(La/bbw0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/n8c;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/n8c;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, La/n8c;->i:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, La/u8u;

    .line 55
    .line 56
    iput-object p1, v0, La/n8c;->i:Ljava/lang/String;

    .line 57
    .line 58
    iput v3, v0, La/n8c;->l:I

    .line 59
    .line 60
    invoke-virtual {p0, v0}, La/u8u;->x(La/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-ne p2, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method

.method public r(La/uaq0;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/jm6;

    .line 4
    .line 5
    sget-object v0, La/jm6;->c:Ljava/util/List;

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_4

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, La/im6;

    .line 33
    .line 34
    iget-object v3, p0, La/jm6;->a:La/kuy;

    .line 35
    .line 36
    invoke-virtual {v3}, La/kuy;->a()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const-string v4, "ru"

    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    invoke-static {v3, v4, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v4, La/hm6;

    .line 51
    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    const-string v3, "/ru/"

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    const-string v3, "/en/"

    .line 58
    .line 59
    :goto_1
    sget-object v5, La/uaq0;->a:La/s9m0;

    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, La/s9m0;->j(La/uaq0;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    const-string v6, "1_l"

    .line 69
    .line 70
    if-eqz v5, :cond_1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_1
    invoke-static {p1}, La/s9m0;->i(La/uaq0;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_2

    .line 78
    .line 79
    const-string v6, "1_d"

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    invoke-static {p1}, La/s9m0;->k(La/uaq0;)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_3

    .line 87
    .line 88
    const-string v6, "1_n"

    .line 89
    .line 90
    :cond_3
    :goto_2
    const-string v5, "static/img/android/onboarding/bet_builder"

    .line 91
    .line 92
    const-string v7, ".png"

    .line 93
    .line 94
    invoke-static {v5, v3, v6, v7}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-direct {v4, v2, v3}, La/hm6;-><init>(La/im6;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    return-object v1
.end method

.method public s(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    instance-of v0, p2, La/t4x0;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/content/ServiceConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    :try_start_1
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/NoSuchElementException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :catch_0
    :goto_0
    invoke-virtual {p0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :goto_1
    invoke-virtual {p0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_0
    :try_start_2
    invoke-virtual {p1, p2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/NoSuchElementException; {:try_start_2 .. :try_end_2} :catch_1

    .line 36
    .line 37
    .line 38
    :catch_1
    return-void
.end method

.method public declared-synchronized u()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, La/xqm0;

    .line 5
    .line 6
    iget-object v1, v0, La/xqm0;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    .line 11
    :try_start_1
    iget-object v0, v0, La/xqm0;->b:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    :try_start_2
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 25
    .line 26
    .line 27
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    :try_start_3
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :goto_0
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 35
    throw v0

    .line 36
    :catchall_1
    move-exception v0

    .line 37
    goto :goto_0
.end method

.method public v(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/content/ServiceConnection;ILjava/util/concurrent/Executor;)Z
    .locals 5

    .line 1
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {p3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    :catch_0
    :cond_0
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :try_start_0
    invoke-static {p1}, La/grv0;->a(Landroid/content/Context;)La/o58;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2, v1, v0}, La/o58;->a(ILjava/lang/String;)Landroid/content/pm/ApplicationInfo;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    const/high16 v2, 0x200000

    .line 29
    .line 30
    and-int/2addr v0, v2

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    :goto_0
    const-string v2, "ConnectionTracker"

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    const-string p0, "Attempted to bind to a service in a STOPPED package."

    .line 39
    .line 40
    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    return v1

    .line 44
    :cond_2
    instance-of v0, p4, La/t4x0;

    .line 45
    .line 46
    const/16 v3, 0x1d

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    if-nez v0, :cond_7

    .line 50
    .line 51
    invoke-virtual {p0, p4, p4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Landroid/content/ServiceConnection;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    if-eq p4, v0, :cond_3

    .line 60
    .line 61
    invoke-virtual {p3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    filled-new-array {p4, p2, v0}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    const-string v0, "Duplicate binding with the same ServiceConnection: %s, %s, %s."

    .line 70
    .line 71
    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-static {v2, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    :cond_3
    if-nez p6, :cond_4

    .line 79
    .line 80
    move-object p6, v4

    .line 81
    :cond_4
    :try_start_1
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 82
    .line 83
    if-lt p2, v3, :cond_5

    .line 84
    .line 85
    if-eqz p6, :cond_5

    .line 86
    .line 87
    invoke-static {p1, p3, p5, p6, p4}, La/y5a;->t(Landroid/content/Context;Landroid/content/Intent;ILjava/util/concurrent/Executor;Landroid/content/ServiceConnection;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    goto :goto_1

    .line 92
    :cond_5
    invoke-virtual {p1, p3, p4, p5}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 93
    .line 94
    .line 95
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    :goto_1
    if-eqz p1, :cond_6

    .line 97
    .line 98
    return p1

    .line 99
    :cond_6
    invoke-virtual {p0, p4, p4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    return v1

    .line 103
    :catchall_0
    move-exception p1

    .line 104
    invoke-virtual {p0, p4, p4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :cond_7
    if-nez p6, :cond_8

    .line 109
    .line 110
    move-object p6, v4

    .line 111
    :cond_8
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 112
    .line 113
    if-lt p0, v3, :cond_9

    .line 114
    .line 115
    if-eqz p6, :cond_9

    .line 116
    .line 117
    invoke-static {p1, p3, p5, p6, p4}, La/y5a;->t(Landroid/content/Context;Landroid/content/Intent;ILjava/util/concurrent/Executor;Landroid/content/ServiceConnection;)Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    goto :goto_2

    .line 122
    :cond_9
    invoke-virtual {p1, p3, p4, p5}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    :goto_2
    return p0
.end method
