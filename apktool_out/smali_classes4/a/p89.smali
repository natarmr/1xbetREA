.class public final La/p89;
.super La/w46;
.source "SourceFile"

# interfaces
.implements La/r0t;
.implements La/dke;


# instance fields
.field public final b:Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;

.field public final c:La/m1e;

.field public final d:La/mne;

.field public final e:La/ali;

.field public final f:La/a5v;

.field public final g:La/sdi0;

.field public final h:La/fuj0;

.field public final i:La/nw20;

.field public final j:La/chf0;

.field public final k:La/xex;

.field public final l:La/p7m0;

.field public final m:La/p7m0;

.field public n:La/c4m0;

.field public o:La/bby;


# direct methods
.method public constructor <init>(Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;La/m1e;La/mne;La/ali;La/a5v;La/sdi0;La/wgu;La/fuj0;La/nw20;La/chf0;La/xex;La/bdu;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, La/w46;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, v0, La/p89;->b:Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;

    .line 12
    .line 13
    move-object/from16 v2, p2

    .line 14
    .line 15
    iput-object v2, v0, La/p89;->c:La/m1e;

    .line 16
    .line 17
    move-object/from16 v2, p3

    .line 18
    .line 19
    iput-object v2, v0, La/p89;->d:La/mne;

    .line 20
    .line 21
    move-object/from16 v2, p4

    .line 22
    .line 23
    iput-object v2, v0, La/p89;->e:La/ali;

    .line 24
    .line 25
    move-object/from16 v2, p5

    .line 26
    .line 27
    iput-object v2, v0, La/p89;->f:La/a5v;

    .line 28
    .line 29
    move-object/from16 v2, p6

    .line 30
    .line 31
    iput-object v2, v0, La/p89;->g:La/sdi0;

    .line 32
    .line 33
    move-object/from16 v2, p8

    .line 34
    .line 35
    iput-object v2, v0, La/p89;->h:La/fuj0;

    .line 36
    .line 37
    move-object/from16 v2, p9

    .line 38
    .line 39
    iput-object v2, v0, La/p89;->i:La/nw20;

    .line 40
    .line 41
    move-object/from16 v2, p10

    .line 42
    .line 43
    iput-object v2, v0, La/p89;->j:La/chf0;

    .line 44
    .line 45
    move-object/from16 v2, p11

    .line 46
    .line 47
    iput-object v2, v0, La/p89;->k:La/xex;

    .line 48
    .line 49
    iget-wide v2, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;->a:J

    .line 50
    .line 51
    iget-wide v4, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;->b:J

    .line 52
    .line 53
    iget v6, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;->c:I

    .line 54
    .line 55
    iget-wide v7, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;->d:J

    .line 56
    .line 57
    invoke-virtual/range {p12 .. p12}, La/bdu;->a()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-virtual/range {p7 .. p7}, La/wgu;->a()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v15

    .line 65
    sget-object v16, La/w3w0;->b:La/w3w0;

    .line 66
    .line 67
    const-class v10, La/p89;

    .line 68
    .line 69
    invoke-virtual {v10}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    iget-wide v11, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;->a:J

    .line 74
    .line 75
    new-instance v1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-string v10, "_"

    .line 81
    .line 82
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v19

    .line 92
    new-instance v1, La/b89;

    .line 93
    .line 94
    const/16 v17, 0x0

    .line 95
    .line 96
    const/16 v18, 0x1

    .line 97
    .line 98
    const/4 v10, 0x0

    .line 99
    const/4 v11, 0x0

    .line 100
    const/4 v12, 0x0

    .line 101
    const/4 v13, 0x0

    .line 102
    const/4 v14, 0x0

    .line 103
    invoke-direct/range {v1 .. v19}, La/b89;-><init>(JJIJLjava/lang/String;ZZZZZLjava/lang/String;La/w3w0;ZZLjava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iput-object v1, v0, La/p89;->l:La/p7m0;

    .line 111
    .line 112
    sget-object v1, La/t79;->a:La/t79;

    .line 113
    .line 114
    invoke-static {v1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    iput-object v1, v0, La/p89;->m:La/p7m0;

    .line 119
    .line 120
    return-void
.end method


# virtual methods
.method public canChangeViewZone(Z)V
    .locals 10
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    :goto_0
    iget-object v0, p0, La/p89;->l:La/p7m0;

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
    check-cast v2, La/b89;

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    const/16 v9, 0x6fff

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
    move v8, p1

    .line 18
    invoke-static/range {v2 .. v9}, La/b89;->a(La/b89;ZZZZLa/w3w0;ZI)La/b89;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0, v1, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    move p1, v8

    .line 30
    goto :goto_0
.end method

.method public getModeZone(I)V
    .locals 10
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    :cond_0
    iget-object v0, p0, La/p89;->l:La/p7m0;

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
    check-cast v2, La/b89;

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
    const/4 v8, 0x0

    .line 21
    const/16 v9, 0x77ff

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
    invoke-static/range {v2 .. v9}, La/b89;->a(La/b89;ZZZZLa/w3w0;ZI)La/b89;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    return-void
.end method

.method public returnResult()V
    .locals 10
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    :cond_0
    iget-object v0, p0, La/p89;->l:La/p7m0;

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
    check-cast v2, La/b89;

    .line 9
    .line 10
    const/4 v8, 0x0

    .line 11
    const/16 v9, 0x7f3f

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
    invoke-static/range {v2 .. v9}, La/b89;->a(La/b89;ZZZZLa/w3w0;ZI)La/b89;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    return-void
.end method

.method public final v()V
    .locals 11

    .line 1
    iget-object v0, p0, La/p89;->l:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/b89;

    .line 8
    .line 9
    iget-boolean v1, v1, La/b89;->n:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, La/b89;

    .line 18
    .line 19
    iget-object v0, v0, La/b89;->o:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v1, p0, La/p89;->j:La/chf0;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, La/chf0;->M(Ljava/lang/String;)La/b49;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    instance-of v1, v0, La/a49;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    check-cast v0, La/a49;

    .line 32
    .line 33
    iget-wide v2, v0, La/a49;->b:J

    .line 34
    .line 35
    iget-wide v4, v0, La/a49;->c:J

    .line 36
    .line 37
    iget-wide v6, v0, La/a49;->a:J

    .line 38
    .line 39
    iget-object v8, v0, La/a49;->d:La/v39;

    .line 40
    .line 41
    iget-wide v9, v0, La/a49;->e:J

    .line 42
    .line 43
    iget-object v1, p0, La/p89;->k:La/xex;

    .line 44
    .line 45
    invoke-virtual/range {v1 .. v10}, La/xex;->O(JJJLa/v39;J)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

.method public final w()V
    .locals 10

    .line 1
    :cond_0
    iget-object v0, p0, La/p89;->l:La/p7m0;

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
    check-cast v2, La/b89;

    .line 9
    .line 10
    const/4 v8, 0x0

    .line 11
    const/16 v9, 0x5fff

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
    invoke-static/range {v2 .. v9}, La/b89;->a(La/b89;ZZZZLa/w3w0;ZI)La/b89;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, La/p89;->b:Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;

    .line 29
    .line 30
    iget-boolean v0, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;->e:Z

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, La/p89;->x()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    iget-object v0, p0, La/p89;->m:La/p7m0;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    sget-object v2, La/u79;->a:La/u79;

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, La/p89;->e:La/ali;

    .line 50
    .line 51
    invoke-virtual {v0}, La/ali;->d()V

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    sget-object v3, La/j89;->a:La/j89;

    .line 59
    .line 60
    iget-object v0, p0, La/p89;->d:La/mne;

    .line 61
    .line 62
    iget-object v5, v0, La/mne;->a:La/rwj;

    .line 63
    .line 64
    new-instance v6, La/k89;

    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    invoke-direct {v6, p0, v1, v0}, La/k89;-><init>(La/p89;La/yje;B)V

    .line 68
    .line 69
    .line 70
    const/16 v7, 0xa

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final x()V
    .locals 7

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/o89;->a:La/o89;

    .line 6
    .line 7
    iget-object v2, p0, La/p89;->d:La/mne;

    .line 8
    .line 9
    iget-object v3, v2, La/mne;->a:La/rwj;

    .line 10
    .line 11
    new-instance v4, La/k89;

    .line 12
    .line 13
    const/4 v2, 0x4

    .line 14
    const/4 v6, 0x0

    .line 15
    invoke-direct {v4, p0, v6, v2}, La/k89;-><init>(La/p89;La/yje;B)V

    .line 16
    .line 17
    .line 18
    const/16 v5, 0xa

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 22
    .line 23
    .line 24
    new-instance v0, La/v79;

    .line 25
    .line 26
    new-instance v1, La/vb8;

    .line 27
    .line 28
    const/16 v2, 0x13

    .line 29
    .line 30
    invoke-direct {v1, p0, v2}, La/vb8;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1}, La/v79;-><init>(La/vb8;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, La/p89;->m:La/p7m0;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v6, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final y()V
    .locals 1

    .line 1
    iget-object v0, p0, La/p89;->l:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/b89;

    .line 8
    .line 9
    iget-object v0, v0, La/b89;->o:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p0, p0, La/p89;->i:La/nw20;

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
    iget-object v0, p0, La/p89;->b:Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;

    .line 2
    .line 3
    iget-wide v2, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;->a:J

    .line 4
    .line 5
    iget-wide v4, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;->b:J

    .line 6
    .line 7
    iget-wide v6, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;->d:J

    .line 8
    .line 9
    sget-object v8, La/v39;->c:La/v39;

    .line 10
    .line 11
    iget v0, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;->c:I

    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v9

    .line 17
    iget-object v0, p0, La/p89;->l:La/p7m0;

    .line 18
    .line 19
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, La/b89;

    .line 24
    .line 25
    iget-object v10, v0, La/b89;->o:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p0, La/p89;->h:La/fuj0;

    .line 28
    .line 29
    invoke-virtual/range {v1 .. v10}, La/fuj0;->A(JJJLa/v39;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
