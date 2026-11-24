.class public La/roi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/spg0;


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/g4d0;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, La/g4d0;->c:Ljava/util/List;

    .line 8
    .line 9
    iget v1, p1, La/g4d0;->b:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    and-int/2addr v1, v2

    .line 13
    if-ne v1, v2, :cond_4

    .line 14
    .line 15
    iget p1, p1, La/g4d0;->d:I

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    const/16 v3, 0xa

    .line 23
    .line 24
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/4 v3, 0x0

    .line 36
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    add-int/lit8 v5, v3, 0x1

    .line 47
    .line 48
    if-ltz v3, :cond_2

    .line 49
    .line 50
    check-cast v4, La/a4d0;

    .line 51
    .line 52
    if-lt v3, p1, :cond_1

    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {v4}, La/a4d0;->t(La/a4d0;)La/z3d0;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iget v4, v3, La/z3d0;->d:I

    .line 62
    .line 63
    or-int/lit8 v4, v4, 0x2

    .line 64
    .line 65
    iput v4, v3, La/z3d0;->d:I

    .line 66
    .line 67
    iput-boolean v2, v3, La/z3d0;->f:Z

    .line 68
    .line 69
    invoke-virtual {v3}, La/z3d0;->g()La/a4d0;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v4}, La/a4d0;->b()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_0

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_0
    new-instance p0, La/ss3;

    .line 81
    .line 82
    const/16 p1, 0x1c

    .line 83
    .line 84
    invoke-direct {p0, p1}, La/ss3;-><init>(B)V

    .line 85
    .line 86
    .line 87
    throw p0

    .line 88
    :cond_1
    :goto_1
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move v3, v5

    .line 92
    goto :goto_0

    .line 93
    :cond_2
    invoke-static {}, La/q3d;->p()V

    .line 94
    .line 95
    .line 96
    const/4 p0, 0x0

    .line 97
    throw p0

    .line 98
    :cond_3
    move-object v0, v1

    .line 99
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 103
    .line 104
    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch p2, :pswitch_data_0

    .line 109
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    new-instance p2, La/enj0;

    const/4 v0, 0x4

    invoke-direct {p2, p1, v0}, La/enj0;-><init>(La/gii0;B)V

    iput-object p2, p0, La/roi0;->a:Ljava/lang/Object;

    return-void

    .line 111
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    new-instance p2, La/lkr0;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, La/lkr0;-><init>(La/gii0;B)V

    iput-object p2, p0, La/roi0;->a:Ljava/lang/Object;

    return-void

    .line 113
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    new-instance p2, La/enj0;

    const/16 v0, 0x19

    invoke-direct {p2, p1, v0}, La/enj0;-><init>(La/gii0;B)V

    iput-object p2, p0, La/roi0;->a:Ljava/lang/Object;

    return-void

    .line 115
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    new-instance p2, La/enj0;

    const/16 v0, 0xd

    invoke-direct {p2, p1, v0}, La/enj0;-><init>(La/gii0;B)V

    iput-object p2, p0, La/roi0;->a:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(La/q7d0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    iput-object p1, p0, La/roi0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/rbq0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    iput-object p1, p0, La/roi0;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 117
    iput-object p1, p0, La/roi0;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)La/qpg0;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, La/okn0;

    .line 5
    .line 6
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/rkn0;

    .line 9
    .line 10
    invoke-interface {p0}, La/rkn0;->G0()La/w7r;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-direct {p1, p0}, La/okn0;-><init>(La/w7r;)V

    .line 15
    .line 16
    .line 17
    return-object p1
.end method

.method public c(I)La/a4d0;
    .locals 0

    .line 1
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/a4d0;

    .line 10
    .line 11
    return-object p0
.end method

.method public d(Ljava/util/List;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/hzq0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/hzq0;

    .line 7
    .line 8
    iget v1, v0, La/hzq0;->k:I

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
    iput v1, v0, La/hzq0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/hzq0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/hzq0;-><init>(La/roi0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/hzq0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/hzq0;->k:I

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/enj0;

    .line 53
    .line 54
    invoke-virtual {p0}, La/enj0;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/bog;

    .line 59
    .line 60
    iput v3, v0, La/hzq0;->k:I

    .line 61
    .line 62
    invoke-interface {p0, p1, v0}, La/bog;->e(Ljava/util/List;La/yje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    if-ne p2, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p2, La/dx5;

    .line 70
    .line 71
    invoke-virtual {p2}, La/dx5;->a()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method

.method public e(La/jo20;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/izq0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/izq0;

    .line 7
    .line 8
    iget v1, v0, La/izq0;->k:I

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
    iput v1, v0, La/izq0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/izq0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/izq0;-><init>(La/roi0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/izq0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/izq0;->k:I

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/enj0;

    .line 53
    .line 54
    invoke-virtual {p0}, La/enj0;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/bog;

    .line 59
    .line 60
    iput v3, v0, La/izq0;->k:I

    .line 61
    .line 62
    invoke-interface {p0, p1, v0}, La/bog;->d(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    if-ne p2, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p2, La/dx5;

    .line 70
    .line 71
    invoke-virtual {p2}, La/dx5;->a()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method

.method public f(I)[Landroid/util/Size;
    .locals 0

    .line 1
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getHighResolutionOutputSizes(I)[Landroid/util/Size;

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

.method public g()[Ljava/lang/Integer;
    .locals 4

    .line 1
    const-string v0, "Failed to get output formats from StreamConfigurationMap"

    .line 2
    .line 3
    const-string v1, "StreamConfigurationMapCompatBaseImpl"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputFormats()[I

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    goto :goto_3

    .line 17
    :catch_0
    move-exception p0

    .line 18
    goto :goto_0

    .line 19
    :catch_1
    move-exception p0

    .line 20
    goto :goto_2

    .line 21
    :goto_0
    invoke-static {v1, v0, p0}, La/l8x;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    :goto_1
    move-object p0, v2

    .line 25
    goto :goto_3

    .line 26
    :goto_2
    invoke-static {v1, v0, p0}, La/l8x;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :goto_3
    if-eqz p0, :cond_1

    .line 31
    .line 32
    array-length v0, p0

    .line 33
    new-array v2, v0, [Ljava/lang/Integer;

    .line 34
    .line 35
    array-length v0, p0

    .line 36
    const/4 v1, 0x0

    .line 37
    :goto_4
    if-ge v1, v0, :cond_1

    .line 38
    .line 39
    aget v3, p0, v1

    .line 40
    .line 41
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    aput-object v3, v2, v1

    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_1
    return-object v2
.end method

.method public h(ILandroid/util/Size;)J
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputMinFrameDuration(ILandroid/util/Size;)J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0

    .line 15
    :cond_0
    const-wide/16 p0, 0x0

    .line 16
    .line 17
    return-wide p0
.end method

.method public i(I)[Landroid/util/Size;
    .locals 0

    .line 1
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

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

.method public j(La/sip;Ljava/util/TreeMap;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/enj0;

    .line 4
    .line 5
    instance-of v1, p3, La/kzo0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p3

    .line 10
    check-cast v1, La/kzo0;

    .line 11
    .line 12
    iget v2, v1, La/kzo0;->k:I

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
    iput v2, v1, La/kzo0;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/kzo0;

    .line 25
    .line 26
    invoke-direct {v1, p0, p3}, La/kzo0;-><init>(La/roi0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p0, v1, La/kzo0;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object p3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v1, La/kzo0;->k:I

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
    invoke-virtual {v0}, La/enj0;->invoke()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, La/dzo0;

    .line 74
    .line 75
    iput v4, v1, La/kzo0;->k:I

    .line 76
    .line 77
    invoke-interface {p0, p2, v1}, La/dzo0;->a(Ljava/util/Map;La/yje;)Ljava/lang/Object;

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
    invoke-virtual {v0}, La/enj0;->invoke()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, La/dzo0;

    .line 96
    .line 97
    iput v5, v1, La/kzo0;->k:I

    .line 98
    .line 99
    invoke-interface {p0, p2, v1}, La/dzo0;->b(Ljava/util/Map;La/yje;)Ljava/lang/Object;

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

.method public k(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jo20;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/enj0;

    .line 4
    .line 5
    instance-of v1, p4, La/jzq0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p4

    .line 10
    check-cast v1, La/jzq0;

    .line 11
    .line 12
    iget v2, v1, La/jzq0;->k:I

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
    iput v2, v1, La/jzq0;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/jzq0;

    .line 25
    .line 26
    invoke-direct {v1, p0, p4}, La/jzq0;-><init>(La/roi0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p0, v1, La/jzq0;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object p4, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v1, La/jzq0;->k:I

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
    invoke-virtual {v0}, La/enj0;->invoke()Ljava/lang/Object;

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
    iput v4, v1, La/jzq0;->k:I

    .line 80
    .line 81
    invoke-interface {p0, p1, p3, v1}, La/bog;->f(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;

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
    invoke-virtual {v0}, La/enj0;->invoke()Ljava/lang/Object;

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
    iput v5, v1, La/jzq0;->k:I

    .line 106
    .line 107
    invoke-interface {p0, p1, p3, v1}, La/bog;->k(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;

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

.method public l(La/y930;)V
    .locals 9

    .line 1
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/gbl0;

    .line 4
    .line 5
    sget-object v0, La/gbl0;->c2:La/lme0;

    .line 6
    .line 7
    invoke-virtual {p0}, La/gbl0;->J0()La/ncl0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object p0, p0, La/ncl0;->O:La/p7m0;

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, La/yqs;

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    const/16 v8, 0x2f

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    move-object v6, p1

    .line 28
    invoke-static/range {v1 .. v8}, La/yqs;->a(La/yqs;La/gna;La/anq0;La/bg30;La/ui9;La/y930;Ljava/util/List;I)La/yqs;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0, v0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    move-object p1, v6

    .line 40
    goto :goto_0
.end method
