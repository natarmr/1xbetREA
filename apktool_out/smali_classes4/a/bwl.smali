.class public final La/bwl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n1x;


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, La/bwl;->a:Ljava/lang/Object;

    return-void

    .line 63
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    sget-object p1, La/iun;->a:La/iun;

    .line 65
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    move-result-object p1

    iput-object p1, p0, La/bwl;->a:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/aln;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, La/bwl;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sparse-switch p2, :sswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance p2, La/wgn;

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    invoke-direct {p2, p1, v0}, La/wgn;-><init>(La/gii0;B)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, La/bwl;->a:Ljava/lang/Object;

    .line 17
    .line 18
    return-void

    .line 19
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p2, La/wgn;

    .line 23
    .line 24
    const/16 v0, 0x1b

    .line 25
    .line 26
    invoke-direct {p2, p1, v0}, La/wgn;-><init>(La/gii0;B)V

    .line 27
    .line 28
    .line 29
    iput-object p2, p0, La/bwl;->a:Ljava/lang/Object;

    .line 30
    .line 31
    return-void

    .line 32
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance p2, La/wgn;

    .line 36
    .line 37
    const/16 v0, 0x12

    .line 38
    .line 39
    invoke-direct {p2, p1, v0}, La/wgn;-><init>(La/gii0;B)V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, La/bwl;->a:Ljava/lang/Object;

    .line 43
    .line 44
    return-void

    .line 45
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance p2, La/wgn;

    .line 49
    .line 50
    const/16 v0, 0x8

    .line 51
    .line 52
    invoke-direct {p2, p1, v0}, La/wgn;-><init>(La/gii0;B)V

    .line 53
    .line 54
    .line 55
    iput-object p2, p0, La/bwl;->a:Ljava/lang/Object;

    .line 56
    .line 57
    return-void

    .line 58
    nop

    .line 59
    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_2
        0xc -> :sswitch_1
        0xe -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 59
    iput-object p1, p0, La/bwl;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(B)V
    .locals 0

    .line 1
    iget-object p0, p0, La/bwl;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/os/Parcel;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeByte(B)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(F)V
    .locals 0

    .line 1
    iget-object p0, p0, La/bwl;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/os/Parcel;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeFloat(F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public c(J)V
    .locals 8

    .line 1
    invoke-static {p1, p2}, La/daq0;->b(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, La/eaq0;->a(JJ)Z

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    const/4 v5, 0x0

    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-wide v6, 0x100000000L

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1, v6, v7}, La/eaq0;->a(JJ)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const-wide v6, 0x200000000L

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1, v6, v7}, La/eaq0;->a(JJ)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    const/4 v5, 0x2

    .line 40
    :cond_2
    :goto_0
    invoke-virtual {p0, v5}, La/bwl;->a(B)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2}, La/daq0;->b(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    invoke-static {v0, v1, v2, v3}, La/eaq0;->a(JJ)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    invoke-static {p1, p2}, La/daq0;->c(J)F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {p0, p1}, La/bwl;->b(F)V

    .line 58
    .line 59
    .line 60
    :cond_3
    return-void
.end method

.method public d(Ljava/util/LinkedHashMap;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/q8o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/q8o;

    .line 7
    .line 8
    iget v1, v0, La/q8o;->k:I

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
    iput v1, v0, La/q8o;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/q8o;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/q8o;-><init>(La/bwl;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/q8o;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/q8o;->k:I

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
    iget-object p0, p0, La/bwl;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/wgn;

    .line 53
    .line 54
    invoke-virtual {p0}, La/wgn;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/t7o;

    .line 59
    .line 60
    iput v3, v0, La/q8o;->k:I

    .line 61
    .line 62
    invoke-interface {p0, p1, v0}, La/t7o;->b(Ljava/util/Map;La/yje;)Ljava/lang/Object;

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

.method public e(Ljava/util/LinkedHashMap;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/r8o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/r8o;

    .line 7
    .line 8
    iget v1, v0, La/r8o;->k:I

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
    iput v1, v0, La/r8o;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/r8o;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/r8o;-><init>(La/bwl;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/r8o;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/r8o;->k:I

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
    iget-object p0, p0, La/bwl;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/wgn;

    .line 53
    .line 54
    invoke-virtual {p0}, La/wgn;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/t7o;

    .line 59
    .line 60
    iput v3, v0, La/r8o;->k:I

    .line 61
    .line 62
    invoke-interface {p0, p1, v0}, La/t7o;->a(Ljava/util/Map;La/yje;)Ljava/lang/Object;

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

.method public f(Ljava/lang/String;La/zje;)Ljava/io/Serializable;
    .locals 5

    .line 1
    instance-of v0, p2, La/lmt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/lmt;

    .line 7
    .line 8
    iget v1, v0, La/lmt;->k:I

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
    iput v1, v0, La/lmt;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/lmt;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/lmt;-><init>(La/bwl;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/lmt;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/lmt;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_4

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :try_start_1
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 53
    .line 54
    iget-object p0, p0, La/bwl;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/k41;

    .line 57
    .line 58
    iput v3, v0, La/lmt;->k:I

    .line 59
    .line 60
    invoke-virtual {p0, p1, v0}, La/k41;->b(Ljava/lang/String;La/zje;)Ljava/io/Serializable;

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
    check-cast p2, Ljava/util/List;

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
    move-result p1

    .line 77
    if-eqz p1, :cond_5

    .line 78
    .line 79
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    move-object p2, p1

    .line 84
    check-cast p2, La/d41;

    .line 85
    .line 86
    iget p2, p2, La/d41;->b:I

    .line 87
    .line 88
    const/4 v0, 0x2

    .line 89
    if-ne p2, v0, :cond_4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    move-object p1, v4

    .line 93
    :goto_2
    check-cast p1, La/d41;

    .line 94
    .line 95
    if-eqz p1, :cond_6

    .line 96
    .line 97
    iget-wide p0, p1, La/d41;->a:J

    .line 98
    .line 99
    new-instance p2, Ljava/lang/Long;

    .line 100
    .line 101
    invoke-direct {p2, p0, p1}, Ljava/lang/Long;-><init>(J)V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_6
    move-object p2, v4

    .line 106
    :goto_3
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :goto_4
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 110
    .line 111
    new-instance p2, La/g0g0;

    .line 112
    .line 113
    invoke-direct {p2, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    :goto_5
    instance-of p0, p2, La/g0g0;

    .line 117
    .line 118
    if-eqz p0, :cond_7

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_7
    move-object v4, p2

    .line 122
    :goto_6
    return-object v4
.end method

.method public g(La/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, La/fut;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/fut;

    .line 11
    .line 12
    iget v3, v2, La/fut;->q:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/fut;->q:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/fut;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/fut;-><init>(La/bwl;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/fut;->o:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/fut;->q:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v9, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/fut;->m:I

    .line 47
    .line 48
    iget v10, v2, La/fut;->l:I

    .line 49
    .line 50
    iget v11, v2, La/fut;->k:I

    .line 51
    .line 52
    iget-wide v12, v2, La/fut;->j:J

    .line 53
    .line 54
    iget-wide v14, v2, La/fut;->i:J

    .line 55
    .line 56
    const/16 p1, 0x0

    .line 57
    .line 58
    iget-object v7, v2, La/fut;->n:Ljava/lang/Throwable;

    .line 59
    .line 60
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move v0, v4

    .line 64
    move v4, v10

    .line 65
    move-wide/from16 v16, v14

    .line 66
    .line 67
    move-object v14, v7

    .line 68
    move v7, v11

    .line 69
    move-wide v10, v12

    .line 70
    move-wide/from16 v12, v16

    .line 71
    .line 72
    goto/16 :goto_5

    .line 73
    .line 74
    :cond_1
    const/16 p1, 0x0

    .line 75
    .line 76
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object p1

    .line 82
    :cond_2
    const/16 p1, 0x0

    .line 83
    .line 84
    iget v4, v2, La/fut;->m:I

    .line 85
    .line 86
    iget v7, v2, La/fut;->l:I

    .line 87
    .line 88
    iget v10, v2, La/fut;->k:I

    .line 89
    .line 90
    iget-wide v11, v2, La/fut;->j:J

    .line 91
    .line 92
    iget-wide v13, v2, La/fut;->i:J

    .line 93
    .line 94
    iget-object v15, v2, La/fut;->n:Ljava/lang/Throwable;

    .line 95
    .line 96
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    move v0, v4

    .line 100
    move v4, v7

    .line 101
    move v7, v10

    .line 102
    move-wide v10, v11

    .line 103
    move-wide v12, v13

    .line 104
    move-object v14, v15

    .line 105
    goto/16 :goto_5

    .line 106
    .line 107
    :cond_3
    const/16 p1, 0x0

    .line 108
    .line 109
    iget v4, v2, La/fut;->l:I

    .line 110
    .line 111
    iget v7, v2, La/fut;->k:I

    .line 112
    .line 113
    iget-wide v10, v2, La/fut;->j:J

    .line 114
    .line 115
    iget-wide v12, v2, La/fut;->i:J

    .line 116
    .line 117
    iget-object v14, v2, La/fut;->n:Ljava/lang/Throwable;

    .line 118
    .line 119
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    goto :goto_3

    .line 125
    :cond_4
    const/16 p1, 0x0

    .line 126
    .line 127
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    sget-wide v10, La/cag0;->a:J

    .line 131
    .line 132
    const-wide/16 v12, 0x3

    .line 133
    .line 134
    move-object/from16 v14, p1

    .line 135
    .line 136
    move v0, v9

    .line 137
    move v7, v0

    .line 138
    const/4 v4, 0x0

    .line 139
    :goto_1
    if-eqz v0, :cond_e

    .line 140
    .line 141
    :try_start_1
    iget-object v15, v1, La/bwl;->a:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v15, La/oif0;

    .line 144
    .line 145
    iput-object v14, v2, La/fut;->n:Ljava/lang/Throwable;

    .line 146
    .line 147
    iput-wide v12, v2, La/fut;->i:J

    .line 148
    .line 149
    iput-wide v10, v2, La/fut;->j:J

    .line 150
    .line 151
    iput v7, v2, La/fut;->k:I

    .line 152
    .line 153
    iput v4, v2, La/fut;->l:I

    .line 154
    .line 155
    iput v0, v2, La/fut;->m:I

    .line 156
    .line 157
    iput v9, v2, La/fut;->q:I

    .line 158
    .line 159
    invoke-virtual {v15, v2}, La/oif0;->o(La/zje;)Ljava/io/Serializable;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    if-ne v0, v3, :cond_5

    .line 164
    .line 165
    goto :goto_8

    .line 166
    :cond_5
    :goto_2
    check-cast v0, Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 167
    .line 168
    return-object v0

    .line 169
    :goto_3
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 170
    .line 171
    .line 172
    move-result v15

    .line 173
    if-eqz v15, :cond_a

    .line 174
    .line 175
    if-nez v7, :cond_6

    .line 176
    .line 177
    new-instance v14, La/el50;

    .line 178
    .line 179
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    const/4 v0, 0x0

    .line 183
    goto :goto_1

    .line 184
    :cond_6
    int-to-long v8, v4

    .line 185
    cmp-long v8, v8, v12

    .line 186
    .line 187
    if-gez v8, :cond_7

    .line 188
    .line 189
    const/4 v8, 0x1

    .line 190
    goto :goto_4

    .line 191
    :cond_7
    const/4 v8, 0x0

    .line 192
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 193
    .line 194
    if-eqz v8, :cond_8

    .line 195
    .line 196
    iput-object v14, v2, La/fut;->n:Ljava/lang/Throwable;

    .line 197
    .line 198
    iput-wide v12, v2, La/fut;->i:J

    .line 199
    .line 200
    iput-wide v10, v2, La/fut;->j:J

    .line 201
    .line 202
    iput v7, v2, La/fut;->k:I

    .line 203
    .line 204
    iput v4, v2, La/fut;->l:I

    .line 205
    .line 206
    iput v8, v2, La/fut;->m:I

    .line 207
    .line 208
    iput v6, v2, La/fut;->q:I

    .line 209
    .line 210
    invoke-static {v10, v11, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-ne v0, v3, :cond_9

    .line 215
    .line 216
    goto :goto_8

    .line 217
    :goto_5
    const/4 v9, 0x1

    .line 218
    goto :goto_1

    .line 219
    :cond_8
    new-instance v14, La/el50;

    .line 220
    .line 221
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    :cond_9
    :goto_6
    move v0, v8

    .line 225
    goto :goto_5

    .line 226
    :cond_a
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    if-eqz v8, :cond_d

    .line 231
    .line 232
    int-to-long v8, v4

    .line 233
    cmp-long v8, v8, v12

    .line 234
    .line 235
    if-gez v8, :cond_b

    .line 236
    .line 237
    const/4 v8, 0x1

    .line 238
    goto :goto_7

    .line 239
    :cond_b
    const/4 v8, 0x0

    .line 240
    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 241
    .line 242
    if-eqz v8, :cond_c

    .line 243
    .line 244
    iput-object v14, v2, La/fut;->n:Ljava/lang/Throwable;

    .line 245
    .line 246
    iput-wide v12, v2, La/fut;->i:J

    .line 247
    .line 248
    iput-wide v10, v2, La/fut;->j:J

    .line 249
    .line 250
    iput v7, v2, La/fut;->k:I

    .line 251
    .line 252
    iput v4, v2, La/fut;->l:I

    .line 253
    .line 254
    iput v8, v2, La/fut;->m:I

    .line 255
    .line 256
    iput v5, v2, La/fut;->q:I

    .line 257
    .line 258
    invoke-static {v10, v11, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    if-ne v0, v3, :cond_9

    .line 263
    .line 264
    :goto_8
    return-object v3

    .line 265
    :cond_c
    new-instance v14, La/dag0;

    .line 266
    .line 267
    invoke-direct {v14, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 268
    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_d
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 272
    .line 273
    .line 274
    move-object v14, v0

    .line 275
    const/4 v0, 0x0

    .line 276
    goto :goto_5

    .line 277
    :cond_e
    if-nez v14, :cond_f

    .line 278
    .line 279
    const-string v0, "Unexpected error"

    .line 280
    .line 281
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    return-object p1

    .line 285
    :cond_f
    throw v14
.end method

.method public h(La/o1x;La/hhn0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/bwl;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/xplatform/uikit/components/chips/DsChip;

    .line 4
    .line 5
    iget-object p1, p2, La/hhn0;->a:La/dyw;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p2}, La/c3x;->q(La/dyw;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p0, p0, Lorg/xplatform/uikit/components/chips/DsChip;->g:Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public i(ZLa/zje;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/bwl;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/f7u;

    .line 4
    .line 5
    iget-object p0, p0, La/f7u;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/lxv;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, La/lxv;->a:La/ir30;

    .line 12
    .line 13
    invoke-virtual {p0}, La/ir30;->c()La/p6d;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0, p2}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    iget-object p0, p0, La/lxv;->b:La/ir30;

    .line 23
    .line 24
    invoke-virtual {p0}, La/ir30;->c()La/p6d;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0, p2}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public k(La/o1x;La/r1o;)V
    .locals 0

    .line 1
    return-void
.end method
