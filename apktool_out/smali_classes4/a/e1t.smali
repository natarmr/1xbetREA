.class public final La/e1t;
.super La/w46;
.source "SourceFile"

# interfaces
.implements La/r0t;
.implements La/dke;


# instance fields
.field public final b:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

.field public final c:La/ali;

.field public final d:La/a5v;

.field public final e:La/yqc;

.field public final f:La/xsc;

.field public final g:La/xsc;

.field public final h:La/m1e;

.field public final i:La/mne;

.field public final j:La/fuj0;

.field public final k:La/nw20;

.field public final l:La/chf0;

.field public final m:La/xex;

.field public final n:La/p7m0;

.field public final o:La/p7m0;

.field public p:La/c4m0;

.field public q:La/bby;


# direct methods
.method public constructor <init>(Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;La/ali;La/a5v;La/yqc;La/xsc;La/xsc;La/bdu;La/m1e;La/mne;La/wgu;La/fuj0;La/nw20;La/chf0;La/xex;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, La/w46;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, v0, La/e1t;->b:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 12
    .line 13
    move-object/from16 v2, p2

    .line 14
    .line 15
    iput-object v2, v0, La/e1t;->c:La/ali;

    .line 16
    .line 17
    move-object/from16 v2, p3

    .line 18
    .line 19
    iput-object v2, v0, La/e1t;->d:La/a5v;

    .line 20
    .line 21
    move-object/from16 v2, p4

    .line 22
    .line 23
    iput-object v2, v0, La/e1t;->e:La/yqc;

    .line 24
    .line 25
    move-object/from16 v2, p5

    .line 26
    .line 27
    iput-object v2, v0, La/e1t;->f:La/xsc;

    .line 28
    .line 29
    move-object/from16 v2, p6

    .line 30
    .line 31
    iput-object v2, v0, La/e1t;->g:La/xsc;

    .line 32
    .line 33
    move-object/from16 v2, p8

    .line 34
    .line 35
    iput-object v2, v0, La/e1t;->h:La/m1e;

    .line 36
    .line 37
    move-object/from16 v2, p9

    .line 38
    .line 39
    iput-object v2, v0, La/e1t;->i:La/mne;

    .line 40
    .line 41
    move-object/from16 v2, p11

    .line 42
    .line 43
    iput-object v2, v0, La/e1t;->j:La/fuj0;

    .line 44
    .line 45
    move-object/from16 v2, p12

    .line 46
    .line 47
    iput-object v2, v0, La/e1t;->k:La/nw20;

    .line 48
    .line 49
    move-object/from16 v2, p13

    .line 50
    .line 51
    iput-object v2, v0, La/e1t;->l:La/chf0;

    .line 52
    .line 53
    move-object/from16 v2, p14

    .line 54
    .line 55
    iput-object v2, v0, La/e1t;->m:La/xex;

    .line 56
    .line 57
    iget-wide v2, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->a:J

    .line 58
    .line 59
    iget-wide v4, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->d:J

    .line 60
    .line 61
    iget v6, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->e:I

    .line 62
    .line 63
    iget-wide v7, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->g:J

    .line 64
    .line 65
    invoke-virtual/range {p7 .. p7}, La/bdu;->a()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-virtual/range {p10 .. p10}, La/wgu;->a()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v15

    .line 73
    sget-object v16, La/w3w0;->b:La/w3w0;

    .line 74
    .line 75
    const-class v10, La/e1t;

    .line 76
    .line 77
    invoke-virtual {v10}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    iget-wide v11, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->a:J

    .line 82
    .line 83
    new-instance v1, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const-string v10, "_"

    .line 89
    .line 90
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v19

    .line 100
    new-instance v1, La/s0t;

    .line 101
    .line 102
    const/16 v17, 0x0

    .line 103
    .line 104
    const/16 v18, 0x1

    .line 105
    .line 106
    const/4 v10, 0x0

    .line 107
    const/4 v11, 0x0

    .line 108
    const/4 v12, 0x0

    .line 109
    const/4 v13, 0x0

    .line 110
    const/4 v14, 0x0

    .line 111
    invoke-direct/range {v1 .. v19}, La/s0t;-><init>(JJIJLjava/lang/String;ZZZZZLjava/lang/String;La/w3w0;ZZLjava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    iput-object v1, v0, La/e1t;->n:La/p7m0;

    .line 119
    .line 120
    sget-object v1, La/j0t;->a:La/j0t;

    .line 121
    .line 122
    invoke-static {v1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    iput-object v1, v0, La/e1t;->o:La/p7m0;

    .line 127
    .line 128
    invoke-virtual {v0}, La/e1t;->x()V

    .line 129
    .line 130
    .line 131
    return-void
.end method


# virtual methods
.method public canChangeViewZone(Z)V
    .locals 11
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    :goto_0
    iget-object v0, p0, La/e1t;->n:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, La/s0t;

    .line 9
    .line 10
    const/4 v9, 0x0

    .line 11
    const/16 v10, 0x6fff

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    move v8, p1

    .line 19
    invoke-static/range {v2 .. v10}, La/s0t;->a(La/s0t;ZZZZLa/w3w0;ZZI)La/s0t;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, v1, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    move p1, v8

    .line 31
    goto :goto_0
.end method

.method public getModeZone(I)V
    .locals 11
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    :cond_0
    iget-object v0, p0, La/e1t;->n:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, La/s0t;

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne p1, v3, :cond_1

    .line 12
    .line 13
    sget-object v3, La/w3w0;->b:La/w3w0;

    .line 14
    .line 15
    :goto_0
    move-object v7, v3

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    sget-object v3, La/w3w0;->a:La/w3w0;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :goto_1
    const/4 v9, 0x0

    .line 21
    const/16 v10, 0x77ff

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v8, 0x0

    .line 28
    invoke-static/range {v2 .. v10}, La/s0t;->a(La/s0t;ZZZZLa/w3w0;ZZI)La/s0t;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    return-void
.end method

.method public returnResult()V
    .locals 11
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    :cond_0
    iget-object v0, p0, La/e1t;->n:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, La/s0t;

    .line 9
    .line 10
    const/4 v9, 0x0

    .line 11
    const/16 v10, 0x7f3f

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    invoke-static/range {v2 .. v10}, La/s0t;->a(La/s0t;ZZZZLa/w3w0;ZZI)La/s0t;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    return-void
.end method

.method public final v()V
    .locals 1

    .line 1
    iget-object v0, p0, La/e1t;->n:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/s0t;

    .line 8
    .line 9
    iget-boolean v0, v0, La/s0t;->n:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, La/e1t;->w()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final w()V
    .locals 11

    .line 1
    iget-object v0, p0, La/e1t;->n:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/s0t;

    .line 8
    .line 9
    iget-object v0, v0, La/s0t;->o:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v1, p0, La/e1t;->l:La/chf0;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, La/chf0;->M(Ljava/lang/String;)La/b49;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v1, v0, La/a49;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    check-cast v0, La/a49;

    .line 22
    .line 23
    iget-wide v2, v0, La/a49;->b:J

    .line 24
    .line 25
    iget-wide v4, v0, La/a49;->c:J

    .line 26
    .line 27
    iget-wide v6, v0, La/a49;->a:J

    .line 28
    .line 29
    iget-object v8, v0, La/a49;->d:La/v39;

    .line 30
    .line 31
    iget-wide v9, v0, La/a49;->e:J

    .line 32
    .line 33
    iget-object v1, p0, La/e1t;->m:La/xex;

    .line 34
    .line 35
    invoke-virtual/range {v1 .. v10}, La/xex;->O(JJJLa/v39;J)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method

.method public final x()V
    .locals 4

    .line 1
    iget-object v0, p0, La/e1t;->p:La/c4m0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, La/e1t;->h:La/m1e;

    .line 14
    .line 15
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, La/b1t;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v1, p0, v2, v3}, La/b1t;-><init>(La/e1t;La/yje;B)V

    .line 24
    .line 25
    .line 26
    new-instance v2, La/fnq;

    .line 27
    .line 28
    const/4 v3, 0x4

    .line 29
    invoke-direct {v2, v0, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v1, p0, La/e1t;->i:La/mne;

    .line 37
    .line 38
    iget-object v1, v1, La/mne;->a:La/rwj;

    .line 39
    .line 40
    invoke-static {v0, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v2, v0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, La/e1t;->p:La/c4m0;

    .line 49
    .line 50
    return-void
.end method

.method public final y()V
    .locals 1

    .line 1
    iget-object v0, p0, La/e1t;->n:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/s0t;

    .line 8
    .line 9
    iget-object v0, v0, La/s0t;->o:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p0, p0, La/e1t;->k:La/nw20;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, La/nw20;->o(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final z()V
    .locals 11

    .line 1
    iget-object v0, p0, La/e1t;->b:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 2
    .line 3
    iget-wide v2, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->a:J

    .line 4
    .line 5
    iget-wide v4, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->d:J

    .line 6
    .line 7
    iget-wide v6, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->g:J

    .line 8
    .line 9
    sget-object v8, La/v39;->c:La/v39;

    .line 10
    .line 11
    iget v0, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;->e:I

    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v9

    .line 17
    iget-object v0, p0, La/e1t;->n:La/p7m0;

    .line 18
    .line 19
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, La/s0t;

    .line 24
    .line 25
    iget-object v10, v0, La/s0t;->o:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p0, La/e1t;->j:La/fuj0;

    .line 28
    .line 29
    invoke-virtual/range {v1 .. v10}, La/fuj0;->A(JJJLa/v39;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
