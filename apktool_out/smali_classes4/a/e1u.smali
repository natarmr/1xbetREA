.class public final La/e1u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/bs20;)V
    .locals 1

    const/16 v0, 0x19

    iput-byte v0, p0, La/e1u;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, La/e1u;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/d4t0;)V
    .locals 1

    const/16 v0, 0xc

    iput-byte v0, p0, La/e1u;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, La/e1u;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/edo;)V
    .locals 1

    const/16 v0, 0x9

    iput-byte v0, p0, La/e1u;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, La/e1u;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gn40;)V
    .locals 1

    const/16 v0, 0x1a

    iput-byte v0, p0, La/e1u;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, La/e1u;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/pew;)V
    .locals 1

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    iput-byte v0, p0, La/e1u;->a:B

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La/e1u;->b:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/q2m0;)V
    .locals 1

    const/16 v0, 0x10

    iput-byte v0, p0, La/e1u;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, La/e1u;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 14
    iput-byte p2, p0, La/e1u;->a:B

    iput-object p1, p0, La/e1u;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()La/xp90;
    .locals 0

    .line 1
    iget-object p0, p0, La/e1u;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/u6t;

    .line 4
    .line 5
    iget-object p0, p0, La/u6t;->b:La/s6t;

    .line 6
    .line 7
    iget-object p0, p0, La/s6t;->a:La/ouu;

    .line 8
    .line 9
    invoke-virtual {p0}, La/ouu;->z()La/xp90;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public b(Ljava/io/File;Ljava/lang/String;La/bnn0;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object p0, p0, La/e1u;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    check-cast v1, La/pzu;

    .line 5
    .line 6
    iget-object p0, v1, La/pzu;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/mne;

    .line 9
    .line 10
    iget-object p0, p0, La/mne;->b:La/dvj;

    .line 11
    .line 12
    new-instance v0, La/qkb0;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/16 v5, 0x13

    .line 16
    .line 17
    move-object v2, p1

    .line 18
    move-object v3, p2

    .line 19
    invoke-direct/range {v0 .. v5}, La/qkb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v0, p3}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public c(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/e1u;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/q990;

    .line 4
    .line 5
    iget-object v0, p0, La/q990;->a:La/mne;

    .line 6
    .line 7
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 8
    .line 9
    new-instance v1, La/s980;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/16 v3, 0xb

    .line 13
    .line 14
    invoke-direct {v1, p0, p1, v2, v3}, La/s980;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p2}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public d(J)Ljava/util/List;
    .locals 1

    .line 1
    iget-object p0, p0, La/e1u;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/jr0;

    .line 4
    .line 5
    iget-object p0, p0, La/jr0;->b:La/ap0;

    .line 6
    .line 7
    iget-object v0, p0, La/ap0;->c:La/mi1;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, v0, La/mi1;->b:Ljava/util/List;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0

    .line 17
    :cond_1
    :goto_0
    iget-object p0, p0, La/ap0;->a:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-nez p0, :cond_2

    .line 28
    .line 29
    sget-object p0, La/iun;->a:La/iun;

    .line 30
    .line 31
    :cond_2
    check-cast p0, Ljava/util/List;

    .line 32
    .line 33
    return-object p0
.end method

.method public e(Z)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/e1u;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/uii;

    .line 4
    .line 5
    iget-object p0, p0, La/uii;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/phj;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, La/phj;->c:La/ir30;

    .line 12
    .line 13
    invoke-virtual {p0}, La/ir30;->b()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/util/List;

    .line 18
    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    sget-object p0, La/iun;->a:La/iun;

    .line 22
    .line 23
    :cond_0
    return-object p0

    .line 24
    :cond_1
    iget-object p0, p0, La/phj;->d:La/ir30;

    .line 25
    .line 26
    invoke-virtual {p0}, La/ir30;->b()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/util/List;

    .line 31
    .line 32
    if-nez p0, :cond_2

    .line 33
    .line 34
    sget-object p0, La/iun;->a:La/iun;

    .line 35
    .line 36
    :cond_2
    return-object p0
.end method

.method public f()Z
    .locals 2

    .line 1
    iget-byte v0, p0, La/e1u;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/e1u;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/rrc;

    .line 9
    .line 10
    iget-object p0, p0, La/rrc;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/xkn;

    .line 13
    .line 14
    iget-object p0, p0, La/xkn;->a:La/p7m0;

    .line 15
    .line 16
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :pswitch_0
    check-cast p0, La/wrh;

    .line 28
    .line 29
    iget-object p0, p0, La/wrh;->a:La/h03;

    .line 30
    .line 31
    iget-object p0, p0, La/h03;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, La/q7d0;

    .line 34
    .line 35
    const-string v0, "AUTO_STREAM_KEY"

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-static {p0, v0, v1}, La/axq;->z(La/q7d0;Ljava/lang/String;Z)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public g()La/p760;
    .locals 6

    .line 1
    iget-object p0, p0, La/e1u;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/jm3;

    .line 4
    .line 5
    new-instance v0, La/p760;

    .line 6
    .line 7
    iget-object v1, p0, La/jm3;->a:La/q7d0;

    .line 8
    .line 9
    sget-object v2, Landroid/provider/Settings$System;->DEFAULT_NOTIFICATION_URI:Landroid/net/Uri;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const-string v5, "GlobalSoundPath"

    .line 26
    .line 27
    invoke-interface {v4, v5, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    :cond_0
    const-string v2, ""

    .line 41
    .line 42
    invoke-virtual {v1}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const-string v5, "BaseChannelId"

    .line 47
    .line 48
    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget-object p0, p0, La/jm3;->b:La/us3;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    const-string p0, "prod_id_channel_base"

    .line 58
    .line 59
    invoke-static {v2, p0}, La/sj3;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-virtual {v1}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const-string v4, "NOTIFICATION_LIGHT"

    .line 69
    .line 70
    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-direct {v0, v3, p0, v1}, La/p760;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 75
    .line 76
    .line 77
    return-object v0
.end method

.method public h(La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/s6u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/s6u;

    .line 7
    .line 8
    iget v1, v0, La/s6u;->k:I

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
    iput v1, v0, La/s6u;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/s6u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/s6u;-><init>(La/e1u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/s6u;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/s6u;->k:I

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
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :try_start_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 51
    .line 52
    iget-object p0, p0, La/e1u;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, La/dzg;

    .line 55
    .line 56
    iput v3, v0, La/s6u;->k:I

    .line 57
    .line 58
    invoke-virtual {p0, v0}, La/dzg;->c(La/zje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Iterable;

    .line 66
    .line 67
    new-instance p0, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    move-object v1, v0

    .line 87
    check-cast v1, La/fal;

    .line 88
    .line 89
    iget-wide v2, v1, La/fal;->d:J

    .line 90
    .line 91
    const-wide/16 v4, 0x0

    .line 92
    .line 93
    cmp-long v2, v2, v4

    .line 94
    .line 95
    if-ltz v2, :cond_4

    .line 96
    .line 97
    iget-object v1, v1, La/fal;->c:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-lez v1, :cond_4

    .line 104
    .line 105
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    new-instance p1, La/vvt;

    .line 110
    .line 111
    const/16 v0, 0xa

    .line 112
    .line 113
    invoke-direct {p1, v0}, La/vvt;-><init>(B)V

    .line 114
    .line 115
    .line 116
    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    sget-object p1, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    .line 122
    return-object p0

    .line 123
    :catchall_0
    move-exception p0

    .line 124
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 125
    .line 126
    new-instance p1, La/g0g0;

    .line 127
    .line 128
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    return-object p1
.end method

.method public i(Ljava/util/List;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/z9u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/z9u;

    .line 7
    .line 8
    iget v1, v0, La/z9u;->k:I

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
    iput v1, v0, La/z9u;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/z9u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/z9u;-><init>(La/e1u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/z9u;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/z9u;->k:I

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    check-cast p2, La/j0g0;

    .line 40
    .line 41
    iget-object p0, p2, La/j0g0;->a:Ljava/lang/Object;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, La/e1u;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/d4t0;

    .line 57
    .line 58
    iput v3, v0, La/z9u;->k:I

    .line 59
    .line 60
    invoke-virtual {p0, p1, v0}, La/d4t0;->c(Ljava/util/List;La/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-ne p0, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    return-object p0
.end method
