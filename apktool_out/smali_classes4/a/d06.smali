.class public abstract La/d06;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

.field public final c:La/zlt0;

.field public final d:La/nw20;

.field public final e:La/ilt0;

.field public final f:La/trm0;

.field public final g:La/ahu;

.field public final h:La/duj;

.field public final i:La/mii0;

.field public final j:La/zr1;

.field public final k:La/v6q;

.field public final l:La/mne;

.field public final m:La/r9u;

.field public final n:La/m1u;

.field public final o:La/ol60;

.field public final p:La/ol60;

.field public final q:Ljava/util/List;


# direct methods
.method public constructor <init>(Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;La/zlt0;La/nw20;La/ilt0;La/trm0;La/ahu;La/duj;La/mii0;La/zr1;La/v6q;La/mne;La/r9u;La/m1u;)V
    .locals 0

    .line 1
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/d06;->b:Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 8
    .line 9
    iput-object p2, p0, La/d06;->c:La/zlt0;

    .line 10
    .line 11
    iput-object p3, p0, La/d06;->d:La/nw20;

    .line 12
    .line 13
    iput-object p4, p0, La/d06;->e:La/ilt0;

    .line 14
    .line 15
    iput-object p5, p0, La/d06;->f:La/trm0;

    .line 16
    .line 17
    iput-object p6, p0, La/d06;->g:La/ahu;

    .line 18
    .line 19
    iput-object p7, p0, La/d06;->h:La/duj;

    .line 20
    .line 21
    iput-object p8, p0, La/d06;->i:La/mii0;

    .line 22
    .line 23
    iput-object p9, p0, La/d06;->j:La/zr1;

    .line 24
    .line 25
    iput-object p10, p0, La/d06;->k:La/v6q;

    .line 26
    .line 27
    iput-object p11, p0, La/d06;->l:La/mne;

    .line 28
    .line 29
    iput-object p12, p0, La/d06;->m:La/r9u;

    .line 30
    .line 31
    iput-object p13, p0, La/d06;->n:La/m1u;

    .line 32
    .line 33
    new-instance p1, La/ol60;

    .line 34
    .line 35
    const/4 p2, 0x3

    .line 36
    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, La/d06;->o:La/ol60;

    .line 40
    .line 41
    new-instance p1, La/ol60;

    .line 42
    .line 43
    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, La/d06;->p:La/ol60;

    .line 47
    .line 48
    sget-object p1, La/i2o;->A:La/i2o;

    .line 49
    .line 50
    sget-object p2, La/i2o;->B:La/i2o;

    .line 51
    .line 52
    sget-object p3, La/i2o;->t:La/i2o;

    .line 53
    .line 54
    filled-new-array {p1, p2, p3}, [La/i2o;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, La/d06;->q:Ljava/util/List;

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final A(ZLjava/lang/String;JLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object v0, La/l320;->a:La/l320;

    .line 10
    .line 11
    iget-object v2, v1, La/d06;->o:La/ol60;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, La/ygp;->Z:La/ygp;

    .line 17
    .line 18
    iget-object v3, v1, La/d06;->m:La/r9u;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v3, v3, La/r9u;->a:La/j1q0;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v3, v3, La/j1q0;->a:La/m1q0;

    .line 29
    .line 30
    invoke-virtual {v3, v0}, La/m1q0;->d(La/ygp;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 37
    .line 38
    .line 39
    move-result-object v14

    .line 40
    new-instance v0, La/c06;

    .line 41
    .line 42
    const/4 v13, 0x0

    .line 43
    move/from16 v2, p1

    .line 44
    .line 45
    move-object/from16 v3, p2

    .line 46
    .line 47
    move-wide/from16 v4, p3

    .line 48
    .line 49
    move-object/from16 v6, p5

    .line 50
    .line 51
    move-wide/from16 v7, p6

    .line 52
    .line 53
    move-object/from16 v9, p8

    .line 54
    .line 55
    move-object/from16 v10, p9

    .line 56
    .line 57
    move-object/from16 v11, p10

    .line 58
    .line 59
    move/from16 v12, p11

    .line 60
    .line 61
    invoke-direct/range {v0 .. v13}, La/c06;-><init>(La/d06;ZLjava/lang/String;JLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa/yje;)V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x3

    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-static {v14, v2, v2, v0, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_0
    new-instance v15, La/h520;

    .line 71
    .line 72
    move/from16 v16, p1

    .line 73
    .line 74
    move-object/from16 v17, p2

    .line 75
    .line 76
    move-wide/from16 v18, p3

    .line 77
    .line 78
    move-object/from16 v20, p5

    .line 79
    .line 80
    move-wide/from16 v21, p6

    .line 81
    .line 82
    move-object/from16 v23, p8

    .line 83
    .line 84
    move-object/from16 v24, p9

    .line 85
    .line 86
    move-object/from16 v25, p10

    .line 87
    .line 88
    move/from16 v26, p11

    .line 89
    .line 90
    invoke-direct/range {v15 .. v26}, La/h520;-><init>(ZLjava/lang/String;JLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v15}, La/ol60;->f(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public abstract B(Z)V
.end method

.method public final w(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/fa2;

    .line 5
    .line 6
    const/16 v1, 0x17

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, La/fa2;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/d06;->h:La/duj;

    .line 12
    .line 13
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final x()V
    .locals 11

    .line 1
    iget-object v0, p0, La/d06;->k:La/v6q;

    .line 2
    .line 3
    iget-object v0, v0, La/v6q;->a:La/h7q;

    .line 4
    .line 5
    iget-object v0, v0, La/h7q;->d:La/dev;

    .line 6
    .line 7
    iget-object v0, v0, La/dev;->c:La/p7m0;

    .line 8
    .line 9
    new-instance v1, La/i89;

    .line 10
    .line 11
    const/16 v2, 0x16

    .line 12
    .line 13
    invoke-direct {v1, v0, v2}, La/i89;-><init>(La/gmq;B)V

    .line 14
    .line 15
    .line 16
    new-instance v0, La/fc4;

    .line 17
    .line 18
    const/4 v2, 0x6

    .line 19
    invoke-direct {v0, v1, v2}, La/fc4;-><init>(La/i89;B)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/vp3;

    .line 23
    .line 24
    const/4 v9, 0x4

    .line 25
    const/16 v10, 0x14

    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    const-class v6, La/d06;

    .line 29
    .line 30
    const-string v7, "updateBetButtonState"

    .line 31
    .line 32
    const-string v8, "updateBetButtonState(Z)V"

    .line 33
    .line 34
    move-object v5, p0

    .line 35
    invoke-direct/range {v3 .. v10}, La/vp3;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 36
    .line 37
    .line 38
    new-instance p0, La/fnq;

    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    invoke-direct {p0, v0, v3, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, v5, La/d06;->l:La/mne;

    .line 49
    .line 50
    iget-object v1, v1, La/mne;->a:La/rwj;

    .line 51
    .line 52
    invoke-static {v0, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sget-object v1, La/a06;->h:La/a06;

    .line 57
    .line 58
    invoke-static {p0, v0, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final y(Ljava/lang/Throwable;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/d06;->o:La/ol60;

    .line 5
    .line 6
    sget-object v1, La/l320;->a:La/l320;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    instance-of v0, p1, La/zhi0;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, La/d06;->w(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    move-object v0, p1

    .line 20
    check-cast v0, La/zhi0;

    .line 21
    .line 22
    iget-object v1, v0, La/zhi0;->c:La/kuw;

    .line 23
    .line 24
    invoke-interface {v1}, La/kuw;->getErrorCode()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v3, p0, La/d06;->i:La/mii0;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v3, v3, La/mii0;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, La/kt2;

    .line 43
    .line 44
    const-string v4, "finbet_bet_error"

    .line 45
    .line 46
    const-string v5, "error_code"

    .line 47
    .line 48
    invoke-static {v5, v2, v3, v4}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, La/d06;->j:La/zr1;

    .line 52
    .line 53
    iget-object v2, v2, La/zr1;->a:La/s1p;

    .line 54
    .line 55
    const-wide/16 v3, 0xd1b

    .line 56
    .line 57
    invoke-static {v1, v2, v3, v4}, La/b1j;->r(ILa/s1p;J)V

    .line 58
    .line 59
    .line 60
    iget-object v0, v0, La/zhi0;->c:La/kuw;

    .line 61
    .line 62
    sget-object v1, La/i2o;->m2:La/i2o;

    .line 63
    .line 64
    const-string v2, ""

    .line 65
    .line 66
    iget-object v3, p0, La/d06;->p:La/ol60;

    .line 67
    .line 68
    if-ne v0, v1, :cond_2

    .line 69
    .line 70
    new-instance p0, La/p0o;

    .line 71
    .line 72
    new-instance v4, La/xdk0;

    .line 73
    .line 74
    sget-object v5, La/rek0;->b:La/rek0;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-nez p1, :cond_1

    .line 81
    .line 82
    move-object v6, v2

    .line 83
    goto :goto_0

    .line 84
    :cond_1
    move-object v6, p1

    .line 85
    :goto_0
    const/4 v10, 0x0

    .line 86
    const/16 v11, 0x7c

    .line 87
    .line 88
    const/4 v7, 0x0

    .line 89
    const/4 v8, 0x0

    .line 90
    const/4 v9, 0x0

    .line 91
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 92
    .line 93
    .line 94
    invoke-direct {p0, v4}, La/p0o;-><init>(La/xdk0;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_2
    sget-object v1, La/i2o;->n2:La/i2o;

    .line 102
    .line 103
    if-ne v0, v1, :cond_4

    .line 104
    .line 105
    new-instance p0, La/o0o;

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-nez p1, :cond_3

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    move-object v2, p1

    .line 115
    :goto_1
    invoke-direct {p0, v2}, La/o0o;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_4
    sget-object v1, La/i2o;->q:La/i2o;

    .line 123
    .line 124
    if-ne v0, v1, :cond_6

    .line 125
    .line 126
    new-instance p0, La/q0o;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-nez p1, :cond_5

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    move-object v2, p1

    .line 136
    :goto_2
    invoke-direct {p0, v2}, La/q0o;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_6
    invoke-virtual {p0, p1}, La/d06;->w(Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public final z(La/yh7;La/ql5;La/zje;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    move-object/from16 v2, p3

    .line 4
    .line 5
    instance-of v3, v2, La/b06;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, La/b06;

    .line 11
    .line 12
    iget v4, v3, La/b06;->m:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, La/b06;->m:I

    .line 22
    .line 23
    :goto_0
    move-object v9, v3

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v3, La/b06;

    .line 26
    .line 27
    invoke-direct {v3, p0, v2}, La/b06;-><init>(La/d06;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v2, v9, La/b06;->k:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v10, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v3, v9, La/b06;->m:I

    .line 36
    .line 37
    const/4 v7, 0x2

    .line 38
    const/4 v8, 0x1

    .line 39
    const/4 v11, 0x0

    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    if-eq v3, v8, :cond_2

    .line 43
    .line 44
    if-ne v3, v7, :cond_1

    .line 45
    .line 46
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v11

    .line 56
    :cond_2
    iget-object v0, v9, La/b06;->j:La/ql5;

    .line 57
    .line 58
    iget-object v1, v9, La/b06;->i:La/yh7;

    .line 59
    .line 60
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object v13, v1

    .line 64
    move-object v1, v0

    .line 65
    move-object v0, v13

    .line 66
    goto :goto_2

    .line 67
    :cond_3
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-wide v2, v1, La/ql5;->a:J

    .line 71
    .line 72
    iget-wide v4, p1, La/yh7;->a:D

    .line 73
    .line 74
    iget-object v6, p0, La/d06;->e:La/ilt0;

    .line 75
    .line 76
    invoke-virtual {v6, v4, v5, v2, v3}, La/ilt0;->a(DJ)V

    .line 77
    .line 78
    .line 79
    sget-object v12, La/bm5;->m:La/bm5;

    .line 80
    .line 81
    iget-wide v2, p1, La/yh7;->a:D

    .line 82
    .line 83
    const/4 v5, 0x0

    .line 84
    const/16 v6, 0x1ffd

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    invoke-static/range {v1 .. v6}, La/ql5;->a(La/ql5;DLjava/lang/String;II)La/ql5;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    iget-object v3, p0, La/d06;->f:La/trm0;

    .line 92
    .line 93
    invoke-virtual {v3, v12, v2}, La/trm0;->l(La/bm5;La/ql5;)V

    .line 94
    .line 95
    .line 96
    iget-object v2, p0, La/d06;->c:La/zlt0;

    .line 97
    .line 98
    invoke-virtual {v2}, La/zlt0;->n()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_6

    .line 103
    .line 104
    iput-object p1, v9, La/b06;->i:La/yh7;

    .line 105
    .line 106
    iput-object v1, v9, La/b06;->j:La/ql5;

    .line 107
    .line 108
    iput v8, v9, La/b06;->m:I

    .line 109
    .line 110
    iget-object v2, p0, La/d06;->g:La/ahu;

    .line 111
    .line 112
    invoke-virtual {v2, v12, v9}, La/ahu;->b(La/bm5;La/yje;)Ljava/io/Serializable;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    if-ne v2, v10, :cond_4

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_4
    move-object v0, p1

    .line 120
    :goto_2
    check-cast v2, La/ql5;

    .line 121
    .line 122
    iget-wide v5, v1, La/ql5;->a:J

    .line 123
    .line 124
    iget-wide v0, v0, La/yh7;->b:J

    .line 125
    .line 126
    new-array v8, v8, [J

    .line 127
    .line 128
    const/4 v3, 0x0

    .line 129
    aput-wide v0, v8, v3

    .line 130
    .line 131
    iput-object v11, v9, La/b06;->i:La/yh7;

    .line 132
    .line 133
    iput-object v11, v9, La/b06;->j:La/ql5;

    .line 134
    .line 135
    iput v7, v9, La/b06;->m:I

    .line 136
    .line 137
    iget-object v4, p0, La/d06;->d:La/nw20;

    .line 138
    .line 139
    move-object v7, v2

    .line 140
    invoke-virtual/range {v4 .. v9}, La/nw20;->m(JLa/ql5;[JLa/zje;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    if-ne p0, v10, :cond_5

    .line 145
    .line 146
    :goto_3
    return-object v10

    .line 147
    :cond_5
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object p0
.end method
