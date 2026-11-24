.class public final La/pbg0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/yfu;

.field public final c:La/mne;

.field public final d:La/i1w0;

.field public final e:La/j1q0;

.field public final f:La/duj;

.field public final g:La/sa10;

.field public final h:La/ol60;


# direct methods
.method public constructor <init>(La/yfu;La/mne;La/i1w0;La/j1q0;La/duj;La/sa10;)V
    .locals 17

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {v2}, La/w46;-><init>()V

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    iput-object v1, v2, La/pbg0;->b:La/yfu;

    .line 14
    .line 15
    iput-object v0, v2, La/pbg0;->c:La/mne;

    .line 16
    .line 17
    move-object/from16 v1, p3

    .line 18
    .line 19
    iput-object v1, v2, La/pbg0;->d:La/i1w0;

    .line 20
    .line 21
    move-object/from16 v1, p4

    .line 22
    .line 23
    iput-object v1, v2, La/pbg0;->e:La/j1q0;

    .line 24
    .line 25
    move-object/from16 v1, p5

    .line 26
    .line 27
    iput-object v1, v2, La/pbg0;->f:La/duj;

    .line 28
    .line 29
    move-object/from16 v1, p6

    .line 30
    .line 31
    iput-object v1, v2, La/pbg0;->g:La/sa10;

    .line 32
    .line 33
    new-instance v1, La/ol60;

    .line 34
    .line 35
    const/4 v3, 0x3

    .line 36
    invoke-direct {v1, v3}, La/ol60;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iput-object v1, v2, La/pbg0;->h:La/ol60;

    .line 40
    .line 41
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    iget-object v13, v0, La/mne;->b:La/dvj;

    .line 46
    .line 47
    const-class v1, Ljava/net/UnknownHostException;

    .line 48
    .line 49
    const-class v3, La/oqt0;

    .line 50
    .line 51
    const-class v5, Ljava/net/SocketTimeoutException;

    .line 52
    .line 53
    filled-new-array {v5, v1, v3}, [Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    new-instance v11, La/coc0;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    const/16 v3, 0x1d

    .line 65
    .line 66
    invoke-direct {v11, v2, v1, v3}, La/coc0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 67
    .line 68
    .line 69
    new-instance v14, La/eme0;

    .line 70
    .line 71
    const/16 v5, 0x13

    .line 72
    .line 73
    invoke-direct {v14, v2, v5}, La/eme0;-><init>(Ljava/lang/Object;B)V

    .line 74
    .line 75
    .line 76
    const/4 v15, 0x0

    .line 77
    const/16 v16, 0x250

    .line 78
    .line 79
    const-string v5, "RewardSystemPresenter.getSessionId"

    .line 80
    .line 81
    const/4 v6, 0x5

    .line 82
    const-wide/16 v7, 0x2

    .line 83
    .line 84
    const/4 v10, 0x0

    .line 85
    const/4 v12, 0x0

    .line 86
    invoke-static/range {v4 .. v16}, La/sac;->i0(La/vne;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)La/bby;

    .line 87
    .line 88
    .line 89
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    iget-object v9, v0, La/mne;->a:La/rwj;

    .line 94
    .line 95
    new-instance v0, La/aif0;

    .line 96
    .line 97
    const/4 v6, 0x0

    .line 98
    const/16 v7, 0x11

    .line 99
    .line 100
    move-object v4, v1

    .line 101
    const/4 v1, 0x1

    .line 102
    move v5, v3

    .line 103
    const-class v3, La/pbg0;

    .line 104
    .line 105
    move-object v10, v4

    .line 106
    const-string v4, "handleError"

    .line 107
    .line 108
    move v11, v5

    .line 109
    const-string v5, "handleError(Ljava/lang/Throwable;)V"

    .line 110
    .line 111
    invoke-direct/range {v0 .. v7}, La/aif0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 112
    .line 113
    .line 114
    new-instance v1, La/d7a0;

    .line 115
    .line 116
    invoke-direct {v1, v2, v10, v11}, La/d7a0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 117
    .line 118
    .line 119
    const/16 v2, 0xa

    .line 120
    .line 121
    const/4 v3, 0x0

    .line 122
    move-object/from16 p1, v0

    .line 123
    .line 124
    move-object/from16 p4, v1

    .line 125
    .line 126
    move/from16 p5, v2

    .line 127
    .line 128
    move-object/from16 p2, v3

    .line 129
    .line 130
    move-object/from16 p0, v8

    .line 131
    .line 132
    move-object/from16 p3, v9

    .line 133
    .line 134
    invoke-static/range {p0 .. p5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 135
    .line 136
    .line 137
    return-void
.end method
