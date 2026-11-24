.class public final La/nv20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nub0;
.implements La/zf60;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/al50;)V
    .locals 3

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    iget-object p1, p1, La/al50;->a:Ljava/util/Map;

    .line 109
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 110
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 111
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 112
    check-cast v1, Ljava/util/Map$Entry;

    .line 113
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 114
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->N0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    .line 115
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 116
    :cond_0
    iput-object v0, p0, La/nv20;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/ctf0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    iput-object p1, p0, La/nv20;->a:Ljava/lang/Object;

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
    new-instance p2, La/tpv;

    .line 11
    .line 12
    const/16 v0, 0x17

    .line 13
    .line 14
    invoke-direct {p2, p1, v0}, La/tpv;-><init>(La/gii0;B)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, La/nv20;->a:Ljava/lang/Object;

    .line 18
    .line 19
    return-void

    .line 20
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance p2, La/rta0;

    .line 24
    .line 25
    const/16 v0, 0x14

    .line 26
    .line 27
    invoke-direct {p2, p1, v0}, La/rta0;-><init>(La/gii0;B)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, La/nv20;->a:Ljava/lang/Object;

    .line 31
    .line 32
    return-void

    .line 33
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance p2, La/rta0;

    .line 37
    .line 38
    const/16 v0, 0xc

    .line 39
    .line 40
    invoke-direct {p2, p1, v0}, La/rta0;-><init>(La/gii0;B)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, La/nv20;->a:Ljava/lang/Object;

    .line 44
    .line 45
    return-void

    .line 46
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance p2, La/rta0;

    .line 50
    .line 51
    const/4 v0, 0x6

    .line 52
    invoke-direct {p2, p1, v0}, La/rta0;-><init>(La/gii0;B)V

    .line 53
    .line 54
    .line 55
    iput-object p2, p0, La/nv20;->a:Ljava/lang/Object;

    .line 56
    .line 57
    return-void

    .line 58
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    new-instance p2, La/rta0;

    .line 62
    .line 63
    const/4 v0, 0x2

    .line 64
    invoke-direct {p2, p1, v0}, La/rta0;-><init>(La/gii0;B)V

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, La/nv20;->a:Ljava/lang/Object;

    .line 68
    .line 69
    return-void

    .line 70
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    new-instance p2, La/tpv;

    .line 74
    .line 75
    const/16 v0, 0x1a

    .line 76
    .line 77
    invoke-direct {p2, p1, v0}, La/tpv;-><init>(La/gii0;B)V

    .line 78
    .line 79
    .line 80
    iput-object p2, p0, La/nv20;->a:Ljava/lang/Object;

    .line 81
    .line 82
    return-void

    .line 83
    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_4
        0xa -> :sswitch_3
        0xd -> :sswitch_2
        0x13 -> :sswitch_1
        0x15 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(La/ju9;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p1, p0, La/nv20;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/l77;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, La/nv20;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/ntu;La/rou;La/ieu;La/rqc;La/iqt;La/bzt;La/knf0;La/mne;La/emg0;La/ljf0;La/wsf0;La/rl70;La/x0u;La/ocl;La/o0u;La/vby;La/r9u;)V
    .locals 17

    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p9 .. p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 105
    new-instance v0, La/h6i;

    move-object/from16 v2, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v1, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v3, p17

    invoke-direct/range {v0 .. v16}, La/h6i;-><init>(La/wsf0;La/ntu;La/r9u;La/rou;La/rqc;La/iqt;La/bzt;La/knf0;La/mne;La/emg0;La/ljf0;La/rl70;La/x0u;La/ocl;La/o0u;La/vby;)V

    move-object v1, v0

    move-object/from16 v0, p0

    .line 106
    iput-object v1, v0, La/nv20;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/ql;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput-object p1, p0, La/nv20;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/r9u;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    new-instance v0, La/r46;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, La/r46;-><init>(La/r9u;C)V

    .line 93
    iput-object v0, p0, La/nv20;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/rrc;)V
    .locals 2

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    new-instance v0, La/dio;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, La/dio;-><init>(La/rrc;B)V

    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    iput-object p1, p0, La/nv20;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/tj60;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    iput-object p1, p0, La/nv20;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/u5g0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    iput-object p1, p0, La/nv20;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/vdd0;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    new-instance v0, La/lrc;

    const/16 v1, 0x11

    invoke-direct {v0, p1, v1}, La/lrc;-><init>(Ljava/lang/Object;B)V

    .line 100
    iput-object v0, p0, La/nv20;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 101
    iput-object p1, p0, La/nv20;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/TreeMap;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/jef0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/jef0;

    .line 7
    .line 8
    iget v1, v0, La/jef0;->k:I

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
    iput v1, v0, La/jef0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/jef0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/jef0;-><init>(La/nv20;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/jef0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/jef0;->k:I

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
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/rta0;

    .line 53
    .line 54
    invoke-virtual {p0}, La/rta0;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/cdf0;

    .line 59
    .line 60
    iput v3, v0, La/jef0;->k:I

    .line 61
    .line 62
    invoke-interface {p0, p1, v0}, La/cdf0;->a(Ljava/util/Map;La/yje;)Ljava/lang/Object;

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

.method public b(La/jo20;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/kef0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/kef0;

    .line 7
    .line 8
    iget v1, v0, La/kef0;->k:I

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
    iput v1, v0, La/kef0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/kef0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/kef0;-><init>(La/nv20;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/kef0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/kef0;->k:I

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
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/rta0;

    .line 53
    .line 54
    invoke-virtual {p0}, La/rta0;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/cdf0;

    .line 59
    .line 60
    iput v3, v0, La/kef0;->k:I

    .line 61
    .line 62
    invoke-interface {p0, p1, v0}, La/cdf0;->b(Ljava/util/Map;La/yje;)Ljava/lang/Object;

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

.method public c(La/npn;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p1, La/npn;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Long;

    .line 4
    .line 5
    iget-wide v1, p1, La/npn;->a:J

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance p1, La/qgb;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    invoke-direct {p1, v1, v2, v3, v4}, La/qgb;-><init>(JJ)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, La/rgb;

    .line 20
    .line 21
    invoke-direct {p1, v1, v2}, La/rgb;-><init>(J)V

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, La/khf0;

    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, La/khf0;->D(La/sgb;La/zje;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object p1, La/wne;->a:La/wne;

    .line 33
    .line 34
    if-ne p0, p1, :cond_1

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0
.end method

.method public d(La/pmn0;)V
    .locals 6

    .line 1
    invoke-static {}, La/ofm0;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroidx/camera/view/PreviewView;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, La/jiq0;->o0(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, La/oh60;

    .line 20
    .line 21
    const/16 v2, 0x8

    .line 22
    .line 23
    invoke-direct {v1, p0, p1, v2}, La/oh60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string v0, "PreviewView"

    .line 31
    .line 32
    const-string v1, "Surface requested by Preview."

    .line 33
    .line 34
    invoke-static {v0, v1}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p1, La/pmn0;->d:La/s0a;

    .line 38
    .line 39
    iget-object v1, p0, La/nv20;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Landroidx/camera/view/PreviewView;

    .line 42
    .line 43
    invoke-interface {v0}, La/s0a;->h()La/n0a;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iput-object v2, v1, Landroidx/camera/view/PreviewView;->i:La/n0a;

    .line 48
    .line 49
    iget-object v1, p0, La/nv20;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Landroidx/camera/view/PreviewView;

    .line 52
    .line 53
    iget-object v1, v1, Landroidx/camera/view/PreviewView;->h:La/evb0;

    .line 54
    .line 55
    invoke-interface {v0}, La/s0a;->h()La/n0a;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-interface {v2}, La/n0a;->g()Landroid/graphics/Rect;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance v3, Landroid/util/Rational;

    .line 67
    .line 68
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    invoke-direct {v3, v4, v5}, Landroid/util/Rational;-><init>(II)V

    .line 77
    .line 78
    .line 79
    monitor-enter v1

    .line 80
    :try_start_0
    iput-object v2, v1, La/evb0;->b:Landroid/graphics/Rect;

    .line 81
    .line 82
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    iget-object v1, p0, La/nv20;->a:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, Landroidx/camera/view/PreviewView;

    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1}, La/jiq0;->o0(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    new-instance v2, La/hi;

    .line 96
    .line 97
    const/16 v3, 0xb

    .line 98
    .line 99
    invoke-direct {v2, p0, v0, p1, v3}, La/hi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v1, v2}, La/pmn0;->b(Ljava/util/concurrent/Executor;La/omn0;)V

    .line 103
    .line 104
    .line 105
    iget-object v1, p0, La/nv20;->a:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, Landroidx/camera/view/PreviewView;

    .line 108
    .line 109
    iget-object v2, v1, Landroidx/camera/view/PreviewView;->b:La/dvb0;

    .line 110
    .line 111
    iget-object v1, v1, Landroidx/camera/view/PreviewView;->a:La/avb0;

    .line 112
    .line 113
    instance-of v2, v2, La/wmn0;

    .line 114
    .line 115
    if-eqz v2, :cond_1

    .line 116
    .line 117
    invoke-static {p1, v1}, Landroidx/camera/view/PreviewView;->b(La/pmn0;La/avb0;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-nez v1, :cond_1

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_1
    iget-object v1, p0, La/nv20;->a:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v1, Landroidx/camera/view/PreviewView;

    .line 127
    .line 128
    iget-object v2, v1, Landroidx/camera/view/PreviewView;->a:La/avb0;

    .line 129
    .line 130
    invoke-static {p1, v2}, Landroidx/camera/view/PreviewView;->b(La/pmn0;La/avb0;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    iget-object v3, p0, La/nv20;->a:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v3, Landroidx/camera/view/PreviewView;

    .line 137
    .line 138
    iget-object v4, v3, Landroidx/camera/view/PreviewView;->d:La/n8z;

    .line 139
    .line 140
    if-eqz v2, :cond_2

    .line 141
    .line 142
    new-instance v2, La/raq0;

    .line 143
    .line 144
    invoke-direct {v2, v3, v4}, La/dvb0;-><init>(Landroid/widget/FrameLayout;La/n8z;)V

    .line 145
    .line 146
    .line 147
    const/4 v3, 0x0

    .line 148
    iput-boolean v3, v2, La/raq0;->i:Z

    .line 149
    .line 150
    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 151
    .line 152
    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 153
    .line 154
    .line 155
    iput-object v3, v2, La/raq0;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_2
    new-instance v2, La/wmn0;

    .line 159
    .line 160
    invoke-direct {v2, v3, v4}, La/wmn0;-><init>(Landroid/widget/FrameLayout;La/n8z;)V

    .line 161
    .line 162
    .line 163
    :goto_0
    iput-object v2, v1, Landroidx/camera/view/PreviewView;->b:La/dvb0;

    .line 164
    .line 165
    :goto_1
    new-instance v1, La/zub0;

    .line 166
    .line 167
    invoke-interface {v0}, La/s0a;->h()La/n0a;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    iget-object v3, p0, La/nv20;->a:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v3, Landroidx/camera/view/PreviewView;

    .line 174
    .line 175
    iget-object v4, v3, Landroidx/camera/view/PreviewView;->f:La/hy40;

    .line 176
    .line 177
    iget-object v3, v3, Landroidx/camera/view/PreviewView;->b:La/dvb0;

    .line 178
    .line 179
    invoke-direct {v1, v2, v4, v3}, La/zub0;-><init>(La/n0a;La/hy40;La/dvb0;)V

    .line 180
    .line 181
    .line 182
    iget-object v2, p0, La/nv20;->a:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v2, Landroidx/camera/view/PreviewView;

    .line 185
    .line 186
    iget-object v2, v2, Landroidx/camera/view/PreviewView;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 187
    .line 188
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    invoke-interface {v0}, La/s0a;->b()La/da60;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    iget-object v3, p0, La/nv20;->a:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v3, Landroidx/camera/view/PreviewView;

    .line 198
    .line 199
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-static {v3}, La/jiq0;->o0(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    invoke-interface {v2, v3, v1}, La/da60;->b(Ljava/util/concurrent/Executor;La/ca60;)V

    .line 208
    .line 209
    .line 210
    iget-object v2, p0, La/nv20;->a:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v2, Landroidx/camera/view/PreviewView;

    .line 213
    .line 214
    iget-object v2, v2, Landroidx/camera/view/PreviewView;->b:La/dvb0;

    .line 215
    .line 216
    new-instance v3, La/hi;

    .line 217
    .line 218
    const/16 v4, 0xc

    .line 219
    .line 220
    invoke-direct {v3, p0, v1, v0, v4}, La/hi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, p1, v3}, La/dvb0;->e(La/pmn0;La/hi;)V

    .line 224
    .line 225
    .line 226
    iget-object p1, p0, La/nv20;->a:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast p1, Landroidx/camera/view/PreviewView;

    .line 229
    .line 230
    iget-object v0, p1, Landroidx/camera/view/PreviewView;->c:La/q7h0;

    .line 231
    .line 232
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    const/4 v0, -0x1

    .line 237
    if-ne p1, v0, :cond_3

    .line 238
    .line 239
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast p0, Landroidx/camera/view/PreviewView;

    .line 242
    .line 243
    iget-object p1, p0, Landroidx/camera/view/PreviewView;->c:La/q7h0;

    .line 244
    .line 245
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 246
    .line 247
    .line 248
    :cond_3
    return-void

    .line 249
    :catchall_0
    move-exception p0

    .line 250
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 251
    throw p0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;La/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/z220;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, La/z220;->N(Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object p1, La/wne;->a:La/wne;

    .line 10
    .line 11
    if-ne p0, p1, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    return-object p0
.end method

.method public f(La/swp0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/dpi0;

    .line 7
    .line 8
    iget-object p0, p0, La/dpi0;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/at4;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/at4;->a:La/swp0;

    .line 16
    .line 17
    return-void
.end method

.method public g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, La/ls70;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/ls70;

    .line 7
    .line 8
    iget v1, v0, La/ls70;->k:I

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
    iput v1, v0, La/ls70;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ls70;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/ls70;-><init>(La/nv20;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/ls70;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ls70;->k:I

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
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/tpv;

    .line 53
    .line 54
    invoke-virtual {p0}, La/tpv;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/ds70;

    .line 59
    .line 60
    iput v3, v0, La/ls70;->k:I

    .line 61
    .line 62
    invoke-interface {p0, p1, p2, p3, v0}, La/ds70;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    if-ne p4, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p4, La/jpx;

    .line 70
    .line 71
    return-object p4
.end method

.method public h(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p6, La/ms70;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, La/ms70;

    .line 7
    .line 8
    iget v1, v0, La/ms70;->k:I

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
    iput v1, v0, La/ms70;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ms70;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, La/ms70;-><init>(La/nv20;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, La/ms70;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ms70;->k:I

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
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object p6, p5

    .line 51
    move-object p5, p4

    .line 52
    move-object p4, p3

    .line 53
    move-object p3, p1

    .line 54
    new-instance p1, La/jte0;

    .line 55
    .line 56
    invoke-direct/range {p1 .. p6}, La/jte0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, La/tpv;

    .line 62
    .line 63
    invoke-virtual {p0}, La/tpv;->invoke()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, La/ds70;

    .line 68
    .line 69
    iput v3, v0, La/ms70;->k:I

    .line 70
    .line 71
    invoke-interface {p0, p1, v0}, La/ds70;->a(La/jte0;La/yje;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p6

    .line 75
    if-ne p6, v1, :cond_3

    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_3
    :goto_1
    check-cast p6, La/mte0;

    .line 79
    .line 80
    return-object p6
.end method

.method public i(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 6
    .line 7
    const-string v1, "Cache-Control"

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    filled-new-array {p1}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {p1}, La/q3d;->l([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/o2e0;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, p1, v0, p2, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 22
    .line 23
    .line 24
    sget-object p0, La/xiv0;->b:La/xiv0;

    .line 25
    .line 26
    return-object p0
.end method
