.class public final La/xfu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/gii0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/wgn;

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, La/wgn;-><init>(La/gii0;B)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/xfu;->a:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(La/ino;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, La/xfu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/j1q0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, La/xfu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/ovf;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, La/xfu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/qi10;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, La/xfu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/twz;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, La/xfu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/xs70;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, La/xfu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/yse0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, La/xfu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/zkg;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, La/xfu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/zz90;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, La/xfu;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 35
    iput-object p1, p0, La/xfu;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)La/p6d;
    .locals 6

    .line 1
    iget-object p0, p0, La/xfu;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/lef0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/lef0;->f(Z)La/p7m0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x3

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    new-instance p0, La/wgq0;

    .line 15
    .line 16
    const-wide/16 v4, -0x1

    .line 17
    .line 18
    invoke-direct {p0, v4, v5, v4, v5}, La/wgq0;-><init>(JJ)V

    .line 19
    .line 20
    .line 21
    new-instance p1, La/eu4;

    .line 22
    .line 23
    const/16 v4, 0xc

    .line 24
    .line 25
    invoke-direct {p1, p0, v4}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object p0, p0, La/lef0;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, La/m8l0;

    .line 32
    .line 33
    iget-object p1, p0, La/m8l0;->d:La/p7m0;

    .line 34
    .line 35
    iget-object p0, p0, La/m8l0;->e:La/p7m0;

    .line 36
    .line 37
    new-instance v4, La/l8l0;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-direct {v4, v2, v3, v5}, La/l8l0;-><init>(ILa/yje;B)V

    .line 41
    .line 42
    .line 43
    new-instance v5, La/p6d;

    .line 44
    .line 45
    invoke-direct {v5, p1, p0, v4, v1}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 46
    .line 47
    .line 48
    move-object p1, v5

    .line 49
    :goto_0
    new-instance p0, La/qos;

    .line 50
    .line 51
    const/4 v4, 0x7

    .line 52
    invoke-direct {p0, v2, v3, v4}, La/qos;-><init>(ILa/yje;B)V

    .line 53
    .line 54
    .line 55
    new-instance v2, La/p6d;

    .line 56
    .line 57
    invoke-direct {v2, v0, p1, p0, v1}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 58
    .line 59
    .line 60
    return-object v2
.end method

.method public b()La/rkv;
    .locals 3

    .line 1
    iget-object p0, p0, La/xfu;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/reu;

    .line 4
    .line 5
    iget-object p0, p0, La/reu;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/cih;

    .line 8
    .line 9
    sget-object v0, La/rkv;->j:La/c0o;

    .line 10
    .line 11
    iget-object p0, p0, La/cih;->a:La/q7d0;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v1, "SELECTED_HAND_SHAKE_SCREEN"

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-interface {p0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-virtual {v0, p0}, La/c0o;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/rkv;

    .line 32
    .line 33
    return-object p0
.end method

.method public c(La/n3q;)La/hxs0;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/hxs0;

    .line 5
    .line 6
    iget-object p0, p0, La/xfu;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/dgu;

    .line 9
    .line 10
    sget-object v1, La/lgp0;->a:La/lgp0;

    .line 11
    .line 12
    invoke-virtual {p0, p1, v1}, La/dgu;->h(La/n3q;La/lgp0;)La/svf;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, La/lgp0;->b:La/lgp0;

    .line 17
    .line 18
    invoke-virtual {p0, p1, v2}, La/dgu;->h(La/n3q;La/lgp0;)La/svf;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v0, v1, p0}, La/hxs0;-><init>(La/svf;La/svf;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public d(JLa/zje;)Ljava/io/Serializable;
    .locals 5

    .line 1
    const-string v0, "\u20ac "

    .line 2
    .line 3
    instance-of v1, p3, La/pgu;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p3

    .line 8
    check-cast v1, La/pgu;

    .line 9
    .line 10
    iget v2, v1, La/pgu;->k:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/pgu;->k:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/pgu;

    .line 23
    .line 24
    invoke-direct {v1, p0, p3}, La/pgu;-><init>(La/xfu;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p3, v1, La/pgu;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/pgu;->k:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    if-ne v3, v4, :cond_1

    .line 37
    .line 38
    :try_start_0
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :try_start_1
    sget-object p3, La/j0g0;->b:La/e0g0;

    .line 53
    .line 54
    iget-object p0, p0, La/xfu;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/b8u;

    .line 57
    .line 58
    const-string p3, "EUR"

    .line 59
    .line 60
    iput v4, v1, La/pgu;->k:I

    .line 61
    .line 62
    iget-object p0, p0, La/b8u;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, La/k41;

    .line 65
    .line 66
    invoke-virtual {p0, p1, p2, v1, p3}, La/k41;->c(JLa/zje;Ljava/lang/String;)Ljava/io/Serializable;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    if-ne p3, v2, :cond_3

    .line 71
    .line 72
    return-object v2

    .line 73
    :cond_3
    :goto_1
    check-cast p3, Ljava/math/BigDecimal;

    .line 74
    .line 75
    new-instance p0, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    sget-object p1, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :catchall_0
    move-exception p0

    .line 91
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 92
    .line 93
    new-instance p1, La/g0g0;

    .line 94
    .line 95
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    move-object p0, p1

    .line 99
    :goto_2
    nop

    .line 100
    instance-of p1, p0, La/g0g0;

    .line 101
    .line 102
    if-eqz p1, :cond_4

    .line 103
    .line 104
    const-string p0, ""

    .line 105
    .line 106
    :cond_4
    return-object p0
.end method

.method public e(ILa/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/xfu;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/yse0;

    .line 4
    .line 5
    iget-object v0, p0, La/yse0;->b:La/xse0;

    .line 6
    .line 7
    iget-object v0, v0, La/xse0;->a:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/util/List;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, La/yse0;->d:La/mne;

    .line 22
    .line 23
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 24
    .line 25
    new-instance v1, La/u52;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/16 v3, 0x14

    .line 29
    .line 30
    invoke-direct {v1, p0, p1, v2, v3}, La/u52;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1, p2}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_0
    return-object v0
.end method

.method public f(JLa/aj00;ZJILa/jvn;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p9, La/hiu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p9

    .line 6
    check-cast v0, La/hiu;

    .line 7
    .line 8
    iget v1, v0, La/hiu;->k:I

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
    iput v1, v0, La/hiu;->k:I

    .line 18
    .line 19
    :goto_0
    move-object p9, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/hiu;

    .line 22
    .line 23
    invoke-direct {v0, p0, p9}, La/hiu;-><init>(La/xfu;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p9, La/hiu;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, p9, La/hiu;->k:I

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
    iget-object p0, p0, La/xfu;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, La/ouu;

    .line 55
    .line 56
    iput v3, p9, La/hiu;->k:I

    .line 57
    .line 58
    invoke-virtual/range {p0 .. p9}, La/ouu;->x(JLa/aj00;ZJILa/jvn;La/zje;)Ljava/io/Serializable;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    :goto_2
    check-cast v0, Ljava/util/List;

    .line 66
    .line 67
    return-object v0
.end method

.method public g(Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/hhu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/hhu;

    .line 7
    .line 8
    iget v1, v0, La/hhu;->l:I

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
    iput v1, v0, La/hhu;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/hhu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/hhu;-><init>(La/xfu;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/hhu;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/hhu;->l:I

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
    iget-object p1, v0, La/hhu;->i:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 38
    .line 39
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/xfu;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, La/ciu;

    .line 55
    .line 56
    iput-object p1, v0, La/hhu;->i:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 57
    .line 58
    iput v4, v0, La/hhu;->l:I

    .line 59
    .line 60
    invoke-virtual {p0, v0}, La/ciu;->a(La/zje;)Ljava/lang/Object;

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
    check-cast p2, Ljava/lang/Iterable;

    .line 68
    .line 69
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_5

    .line 78
    .line 79
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    move-object v0, p2

    .line 84
    check-cast v0, La/kzz;

    .line 85
    .line 86
    iget-object v0, v0, La/kzz;->a:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 87
    .line 88
    if-ne v0, p1, :cond_4

    .line 89
    .line 90
    move-object v3, p2

    .line 91
    :cond_5
    check-cast v3, La/kzz;

    .line 92
    .line 93
    if-nez v3, :cond_6

    .line 94
    .line 95
    sget-object p0, La/kzz;->i:La/kzz;

    .line 96
    .line 97
    return-object p0

    .line 98
    :cond_6
    return-object v3
.end method

.method public h(JJLa/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p5, La/fyu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/fyu;

    .line 7
    .line 8
    iget v1, v0, La/fyu;->k:I

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
    iput v1, v0, La/fyu;->k:I

    .line 18
    .line 19
    :goto_0
    move-object p5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/fyu;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, La/fyu;-><init>(La/xfu;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p5, La/fyu;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, p5, La/fyu;->k:I

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
    check-cast v0, La/j0g0;

    .line 42
    .line 43
    iget-object p0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, La/xfu;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, La/ouu;

    .line 59
    .line 60
    iput v3, p5, La/fyu;->k:I

    .line 61
    .line 62
    invoke-virtual/range {p0 .. p5}, La/ouu;->y(JJLa/zje;)Ljava/io/Serializable;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-ne p0, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    return-object p0
.end method

.method public i(JLjava/lang/Long;ILa/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p5, La/rru;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/rru;

    .line 7
    .line 8
    iget v1, v0, La/rru;->k:I

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
    iput v1, v0, La/rru;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/rru;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, La/rru;-><init>(La/xfu;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v7, La/rru;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v7, La/rru;->k:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-ne v1, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    check-cast p5, La/j0g0;

    .line 43
    .line 44
    iget-object p0, p5, La/j0g0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :cond_2
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    if-eqz p3, :cond_5

    .line 57
    .line 58
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    const-wide/16 v8, 0x0

    .line 63
    .line 64
    cmp-long p5, v4, v8

    .line 65
    .line 66
    if-gtz p5, :cond_3

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    iget-object p0, p0, La/xfu;->a:Ljava/lang/Object;

    .line 70
    .line 71
    move-object v1, p0

    .line 72
    check-cast v1, La/nvu;

    .line 73
    .line 74
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 75
    .line 76
    .line 77
    move-result-wide v5

    .line 78
    iput v3, v7, La/rru;->k:I

    .line 79
    .line 80
    move-wide v3, p1

    .line 81
    move v2, p4

    .line 82
    invoke-virtual/range {v1 .. v7}, La/nvu;->z(IJJLa/zje;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-ne p0, v0, :cond_4

    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_4
    return-object p0

    .line 90
    :cond_5
    :goto_2
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 91
    .line 92
    new-instance p0, La/ff5;

    .line 93
    .line 94
    invoke-direct {p0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    new-instance p1, La/g0g0;

    .line 98
    .line 99
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    return-object p1
.end method
