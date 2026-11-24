.class public final La/anq;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:La/htb;

.field public j:J

.field public k:I

.field public l:Z

.field public synthetic m:La/vne;

.field public synthetic n:La/kmq;

.field public final synthetic o:J

.field public final synthetic p:La/gmq;


# direct methods
.method public constructor <init>(JLa/gmq;La/yje;)V
    .locals 0

    .line 1
    iput-wide p1, p0, La/anq;->o:J

    .line 2
    .line 3
    iput-object p3, p0, La/anq;->p:La/gmq;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/kmq;

    .line 4
    .line 5
    check-cast p3, La/yje;

    .line 6
    .line 7
    new-instance v0, La/anq;

    .line 8
    .line 9
    iget-wide v1, p0, La/anq;->o:J

    .line 10
    .line 11
    iget-object p0, p0, La/anq;->p:La/gmq;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, p0, p3}, La/anq;-><init>(JLa/gmq;La/yje;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/anq;->m:La/vne;

    .line 17
    .line 18
    iput-object p2, v0, La/anq;->n:La/kmq;

    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, La/anq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/anq;->m:La/vne;

    .line 4
    .line 5
    iget-object v2, v0, La/anq;->n:La/kmq;

    .line 6
    .line 7
    sget-object v3, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-boolean v4, v0, La/anq;->l:Z

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    if-eqz v4, :cond_1

    .line 14
    .line 15
    if-ne v4, v5, :cond_0

    .line 16
    .line 17
    iget v1, v0, La/anq;->k:I

    .line 18
    .line 19
    iget-wide v7, v0, La/anq;->j:J

    .line 20
    .line 21
    iget-object v4, v0, La/anq;->i:La/htb;

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object/from16 v9, p1

    .line 27
    .line 28
    goto/16 :goto_1

    .line 29
    .line 30
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v6

    .line 36
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget-object v4, La/wen;->b:La/uen;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const-wide/16 v7, 0x0

    .line 45
    .line 46
    iget-wide v9, v0, La/anq;->o:J

    .line 47
    .line 48
    invoke-static {v9, v10, v7, v8}, La/wen;->c(JJ)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-lez v4, :cond_6

    .line 53
    .line 54
    iget-object v4, v0, La/anq;->p:La/gmq;

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    invoke-static {v4, v7}, La/ulb;->D(La/gmq;I)La/gmq;

    .line 58
    .line 59
    .line 60
    move-result-object v12

    .line 61
    instance-of v4, v12, La/ktb;

    .line 62
    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    move-object v4, v12

    .line 66
    check-cast v4, La/ktb;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move-object v4, v6

    .line 70
    :goto_0
    if-nez v4, :cond_3

    .line 71
    .line 72
    new-instance v11, La/rtb;

    .line 73
    .line 74
    const/4 v15, 0x0

    .line 75
    const/16 v16, 0xe

    .line 76
    .line 77
    const/4 v13, 0x0

    .line 78
    const/4 v14, 0x0

    .line 79
    invoke-direct/range {v11 .. v16}, La/rtb;-><init>(La/gmq;Lkotlin/coroutines/CoroutineContext;ILa/i99;I)V

    .line 80
    .line 81
    .line 82
    move-object v4, v11

    .line 83
    :cond_3
    invoke-virtual {v4, v1}, La/ktb;->l(La/vne;)La/htb;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    move-object v4, v1

    .line 88
    move v1, v7

    .line 89
    move-wide v7, v9

    .line 90
    :cond_4
    new-instance v9, La/o2i0;

    .line 91
    .line 92
    invoke-interface {v0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    invoke-direct {v9, v10}, La/o2i0;-><init>(Lkotlin/coroutines/CoroutineContext;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v4}, La/htb;->i()La/i1i0;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    new-instance v11, La/g6q;

    .line 104
    .line 105
    invoke-direct {v11, v2, v6}, La/g6q;-><init>(La/kmq;La/yje;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v9, v10, v11}, La/o2i0;->g(La/i1i0;Lkotlin/jvm/functions/Function2;)V

    .line 109
    .line 110
    .line 111
    new-instance v10, La/zmq;

    .line 112
    .line 113
    invoke-direct {v10, v7, v8, v6}, La/zmq;-><init>(JLa/yje;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v7, v8}, La/qcc;->g0(J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v11

    .line 120
    invoke-static {v9, v11, v12, v10}, La/idx;->L(La/o2i0;JLkotlin/jvm/functions/Function1;)V

    .line 121
    .line 122
    .line 123
    iput-object v6, v0, La/anq;->m:La/vne;

    .line 124
    .line 125
    iput-object v2, v0, La/anq;->n:La/kmq;

    .line 126
    .line 127
    iput-object v4, v0, La/anq;->i:La/htb;

    .line 128
    .line 129
    iput-wide v7, v0, La/anq;->j:J

    .line 130
    .line 131
    iput v1, v0, La/anq;->k:I

    .line 132
    .line 133
    iput-boolean v5, v0, La/anq;->l:Z

    .line 134
    .line 135
    invoke-static {v9, v0}, La/o2i0;->d(La/o2i0;La/bnn0;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    if-ne v9, v3, :cond_5

    .line 140
    .line 141
    return-object v3

    .line 142
    :cond_5
    :goto_1
    check-cast v9, Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    if-nez v9, :cond_4

    .line 149
    .line 150
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object v0

    .line 153
    :cond_6
    new-instance v0, La/gmq0;

    .line 154
    .line 155
    const-string v1, "Timed out immediately"

    .line 156
    .line 157
    invoke-direct {v0, v1, v6}, La/gmq0;-><init>(Ljava/lang/String;La/hmq0;)V

    .line 158
    .line 159
    .line 160
    throw v0
.end method
