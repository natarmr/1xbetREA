.class public final La/xm00;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/duj;

.field public final c:La/ctf0;

.field public final d:La/gxu;

.field public final e:La/mne;

.field public final f:La/gbi;

.field public final g:La/p7m0;

.field public final h:La/ol60;

.field public i:La/bby;


# direct methods
.method public constructor <init>(La/duj;La/ctf0;La/gxu;La/mne;La/gbi;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/xm00;->b:La/duj;

    .line 8
    .line 9
    iput-object p2, p0, La/xm00;->c:La/ctf0;

    .line 10
    .line 11
    iput-object p3, p0, La/xm00;->d:La/gxu;

    .line 12
    .line 13
    iput-object p4, p0, La/xm00;->e:La/mne;

    .line 14
    .line 15
    iput-object p5, p0, La/xm00;->f:La/gbi;

    .line 16
    .line 17
    sget-object p1, La/rm00;->a:La/rm00;

    .line 18
    .line 19
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, La/xm00;->g:La/p7m0;

    .line 24
    .line 25
    new-instance p1, La/ol60;

    .line 26
    .line 27
    const/4 p2, 0x1

    .line 28
    sget-object p3, La/i99;->b:La/i99;

    .line 29
    .line 30
    invoke-direct {p1, p2, p3}, La/ol60;-><init>(ILa/i99;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, La/xm00;->h:La/ol60;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final v()V
    .locals 0

    .line 1
    iget-object p0, p0, La/xm00;->i:La/bby;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, La/v3c;->N(La/bby;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final w(La/cm00;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    instance-of v3, v2, La/um00;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/um00;

    .line 13
    .line 14
    iget v4, v3, La/um00;->k:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/um00;->k:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/um00;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, La/um00;-><init>(La/xm00;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/um00;->i:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/um00;->k:I

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    if-ne v5, v6, :cond_1

    .line 41
    .line 42
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    return-object v0

    .line 53
    :cond_2
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v2, v1, La/cm00;->h:Ljava/util/ArrayList;

    .line 57
    .line 58
    new-instance v5, Ljava/util/ArrayList;

    .line 59
    .line 60
    const/16 v7, 0xa

    .line 61
    .line 62
    invoke-static {v2, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_3

    .line 78
    .line 79
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    check-cast v7, La/am00;

    .line 84
    .line 85
    invoke-static {v7}, La/tdc;->b0(La/am00;)La/jwe;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    iget-object v2, v1, La/cm00;->i:Ljava/util/List;

    .line 94
    .line 95
    iget-boolean v7, v1, La/cm00;->a:Z

    .line 96
    .line 97
    iget-wide v8, v1, La/cm00;->b:D

    .line 98
    .line 99
    iget-wide v10, v1, La/cm00;->c:J

    .line 100
    .line 101
    iget-wide v12, v1, La/cm00;->d:D

    .line 102
    .line 103
    iget v14, v1, La/cm00;->e:I

    .line 104
    .line 105
    iget-boolean v15, v1, La/cm00;->g:Z

    .line 106
    .line 107
    iget-object v1, v1, La/cm00;->j:Ljava/util/List;

    .line 108
    .line 109
    iput v6, v3, La/um00;->k:I

    .line 110
    .line 111
    move-object v6, v4

    .line 112
    iget-object v4, v0, La/xm00;->f:La/gbi;

    .line 113
    .line 114
    move-object/from16 v16, p2

    .line 115
    .line 116
    move-object/from16 v17, v1

    .line 117
    .line 118
    move-object/from16 v18, v3

    .line 119
    .line 120
    move-object v1, v6

    .line 121
    move-object v6, v2

    .line 122
    invoke-virtual/range {v4 .. v18}, La/gbi;->C(Ljava/util/ArrayList;Ljava/util/List;ZDJDIZLjava/lang/String;Ljava/util/List;La/zje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    if-ne v2, v1, :cond_4

    .line 127
    .line 128
    return-object v1

    .line 129
    :cond_4
    :goto_2
    iget-object v0, v0, La/xm00;->h:La/ol60;

    .line 130
    .line 131
    sget-object v1, La/lm00;->a:La/lm00;

    .line 132
    .line 133
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object v0
.end method
