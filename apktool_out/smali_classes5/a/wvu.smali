.class public final La/wvu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/pwi;

.field public final synthetic m:I

.field public final synthetic n:Ljava/lang/Integer;

.field public final synthetic o:Z

.field public final synthetic p:Z

.field public final synthetic q:Z

.field public final synthetic r:La/hie0;


# direct methods
.method public constructor <init>(La/yje;La/pwi;ILjava/lang/Integer;ZZZLa/hie0;)V
    .locals 0

    .line 1
    iput-object p2, p0, La/wvu;->l:La/pwi;

    .line 2
    .line 3
    iput p3, p0, La/wvu;->m:I

    .line 4
    .line 5
    iput-object p4, p0, La/wvu;->n:Ljava/lang/Integer;

    .line 6
    .line 7
    iput-boolean p5, p0, La/wvu;->o:Z

    .line 8
    .line 9
    iput-boolean p6, p0, La/wvu;->p:Z

    .line 10
    .line 11
    iput-boolean p7, p0, La/wvu;->q:Z

    .line 12
    .line 13
    iput-object p8, p0, La/wvu;->r:La/hie0;

    .line 14
    .line 15
    const/4 p2, 0x3

    .line 16
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/wvu;

    .line 7
    .line 8
    iget-boolean v7, p0, La/wvu;->q:Z

    .line 9
    .line 10
    iget-object v8, p0, La/wvu;->r:La/hie0;

    .line 11
    .line 12
    iget-object v2, p0, La/wvu;->l:La/pwi;

    .line 13
    .line 14
    iget v3, p0, La/wvu;->m:I

    .line 15
    .line 16
    iget-object v4, p0, La/wvu;->n:Ljava/lang/Integer;

    .line 17
    .line 18
    iget-boolean v5, p0, La/wvu;->o:Z

    .line 19
    .line 20
    iget-boolean v6, p0, La/wvu;->p:Z

    .line 21
    .line 22
    invoke-direct/range {v0 .. v8}, La/wvu;-><init>(La/yje;La/pwi;ILjava/lang/Integer;ZZZLa/hie0;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/wvu;->j:La/kmq;

    .line 26
    .line 27
    iput-object p2, v0, La/wvu;->k:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {v0, p0}, La/wvu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/wvu;->j:La/kmq;

    .line 4
    .line 5
    iget-object v2, v0, La/wvu;->k:Ljava/lang/Object;

    .line 6
    .line 7
    sget-object v3, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-boolean v4, v0, La/wvu;->i:Z

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
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto/16 :goto_2

    .line 21
    .line 22
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v6

    .line 28
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object v11, v2

    .line 32
    check-cast v11, La/jvn;

    .line 33
    .line 34
    iget-object v2, v0, La/wvu;->l:La/pwi;

    .line 35
    .line 36
    iget-object v4, v2, La/pwi;->b:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v8, v4

    .line 39
    check-cast v8, La/a6u;

    .line 40
    .line 41
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v7, La/zvu;

    .line 45
    .line 46
    const/4 v14, 0x0

    .line 47
    iget v9, v0, La/wvu;->m:I

    .line 48
    .line 49
    iget-object v10, v0, La/wvu;->n:Ljava/lang/Integer;

    .line 50
    .line 51
    iget-boolean v12, v0, La/wvu;->o:Z

    .line 52
    .line 53
    iget-boolean v13, v0, La/wvu;->p:Z

    .line 54
    .line 55
    invoke-direct/range {v7 .. v14}, La/zvu;-><init>(La/a6u;ILjava/lang/Integer;La/jvn;ZZLa/yje;)V

    .line 56
    .line 57
    .line 58
    const-wide/16 v9, 0x1e

    .line 59
    .line 60
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 61
    .line 62
    invoke-static {v9, v10, v4, v7}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    new-instance v7, La/umu;

    .line 67
    .line 68
    const/4 v11, 0x4

    .line 69
    invoke-direct {v7, v11}, La/umu;-><init>(B)V

    .line 70
    .line 71
    .line 72
    new-instance v11, La/jcs;

    .line 73
    .line 74
    const/16 v12, 0x19

    .line 75
    .line 76
    invoke-direct {v11, v8, v12}, La/jcs;-><init>(Ljava/lang/Object;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {v4, v9, v10, v7, v11}, La/ebc;->i0(La/vsg0;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)La/a1g;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    new-instance v14, La/xvu;

    .line 84
    .line 85
    const/4 v7, 0x0

    .line 86
    iget-object v8, v0, La/wvu;->r:La/hie0;

    .line 87
    .line 88
    invoke-direct {v14, v8, v7}, La/xvu;-><init>(La/hie0;B)V

    .line 89
    .line 90
    .line 91
    new-instance v15, La/u5u;

    .line 92
    .line 93
    const/4 v7, 0x6

    .line 94
    invoke-direct {v15, v2, v6, v7}, La/u5u;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 95
    .line 96
    .line 97
    new-instance v12, La/yvu;

    .line 98
    .line 99
    const/16 v17, 0x0

    .line 100
    .line 101
    iget-boolean v7, v0, La/wvu;->q:Z

    .line 102
    .line 103
    move-object v13, v2

    .line 104
    move/from16 v16, v7

    .line 105
    .line 106
    invoke-direct/range {v12 .. v17}, La/yvu;-><init>(La/pwi;La/xvu;La/u5u;ZLa/yje;)V

    .line 107
    .line 108
    .line 109
    new-instance v2, La/a1g;

    .line 110
    .line 111
    const/16 v7, 0x14

    .line 112
    .line 113
    invoke-direct {v2, v4, v12, v7}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 114
    .line 115
    .line 116
    new-instance v4, La/ko0;

    .line 117
    .line 118
    const/16 v7, 0x15

    .line 119
    .line 120
    invoke-direct {v4, v13, v6, v7}, La/ko0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 121
    .line 122
    .line 123
    new-instance v7, La/dnq;

    .line 124
    .line 125
    invoke-direct {v7, v2, v4, v5}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 126
    .line 127
    .line 128
    new-instance v2, La/fns;

    .line 129
    .line 130
    const/16 v4, 0x17

    .line 131
    .line 132
    invoke-direct {v2, v8, v13, v6, v4}, La/fns;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 133
    .line 134
    .line 135
    iput-object v6, v0, La/wvu;->j:La/kmq;

    .line 136
    .line 137
    iput-object v6, v0, La/wvu;->k:Ljava/lang/Object;

    .line 138
    .line 139
    iput-boolean v5, v0, La/wvu;->i:Z

    .line 140
    .line 141
    invoke-static {v1}, La/f7k;->J(La/kmq;)V

    .line 142
    .line 143
    .line 144
    new-instance v4, La/vnq;

    .line 145
    .line 146
    const/4 v5, 0x2

    .line 147
    invoke-direct {v4, v1, v2, v5}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7, v4, v0}, La/dnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    if-ne v0, v3, :cond_2

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    :goto_0
    if-ne v0, v3, :cond_3

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    :goto_1
    if-ne v0, v3, :cond_4

    .line 165
    .line 166
    return-object v3

    .line 167
    :cond_4
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object v0
.end method
