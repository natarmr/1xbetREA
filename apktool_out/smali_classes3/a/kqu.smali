.class public final La/kqu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:J

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/kqu;->i:B

    iput-object p3, p0, La/kqu;->n:Ljava/lang/Object;

    iput-wide p1, p0, La/kqu;->m:J

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/kqu;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/kqu;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, La/kmq;

    .line 6
    .line 7
    move-object v6, p3

    .line 8
    check-cast v6, La/yje;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance v2, La/kqu;

    .line 14
    .line 15
    move-object v5, v1

    .line 16
    check-cast v5, La/f1v;

    .line 17
    .line 18
    iget-wide v3, p0, La/kqu;->m:J

    .line 19
    .line 20
    const/4 v7, 0x1

    .line 21
    invoke-direct/range {v2 .. v7}, La/kqu;-><init>(JLjava/lang/Object;La/yje;B)V

    .line 22
    .line 23
    .line 24
    iput-object p1, v2, La/kqu;->k:La/kmq;

    .line 25
    .line 26
    iput-object p2, v2, La/kqu;->l:Ljava/lang/Object;

    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    invoke-virtual {v2, p0}, La/kqu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_0
    new-instance v2, La/kqu;

    .line 36
    .line 37
    move-object v5, v1

    .line 38
    check-cast v5, La/f7u;

    .line 39
    .line 40
    iget-wide v3, p0, La/kqu;->m:J

    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    invoke-direct/range {v2 .. v7}, La/kqu;-><init>(JLjava/lang/Object;La/yje;B)V

    .line 44
    .line 45
    .line 46
    iput-object p1, v2, La/kqu;->k:La/kmq;

    .line 47
    .line 48
    iput-object p2, v2, La/kqu;->l:Ljava/lang/Object;

    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {v2, p0}, La/kqu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kqu;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/kqu;->n:Ljava/lang/Object;

    .line 6
    .line 7
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 8
    .line 9
    const-wide/16 v4, 0x1e

    .line 10
    .line 11
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget-object v1, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v9, v0, La/kqu;->j:Z

    .line 21
    .line 22
    if-eqz v9, :cond_1

    .line 23
    .line 24
    if-ne v9, v7, :cond_0

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v6, v0, La/kqu;->k:La/kmq;

    .line 38
    .line 39
    iget-object v9, v0, La/kqu;->l:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v12, v9

    .line 42
    check-cast v12, La/jvn;

    .line 43
    .line 44
    new-instance v10, La/upp;

    .line 45
    .line 46
    move-object v11, v2

    .line 47
    check-cast v11, La/f1v;

    .line 48
    .line 49
    const/4 v15, 0x0

    .line 50
    const/16 v16, 0x2

    .line 51
    .line 52
    iget-wide v13, v0, La/kqu;->m:J

    .line 53
    .line 54
    invoke-direct/range {v10 .. v16}, La/upp;-><init>(Ljava/lang/Object;Ljava/lang/Enum;JLa/yje;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v4, v5, v3, v10}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iput-object v8, v0, La/kqu;->k:La/kmq;

    .line 62
    .line 63
    iput-object v8, v0, La/kqu;->l:Ljava/lang/Object;

    .line 64
    .line 65
    iput-boolean v7, v0, La/kqu;->j:Z

    .line 66
    .line 67
    invoke-static {v6, v2, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-ne v0, v1, :cond_2

    .line 72
    .line 73
    move-object v8, v1

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    :goto_0
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    :goto_1
    return-object v8

    .line 78
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 79
    .line 80
    iget-boolean v9, v0, La/kqu;->j:Z

    .line 81
    .line 82
    if-eqz v9, :cond_4

    .line 83
    .line 84
    if-ne v9, v7, :cond_3

    .line 85
    .line 86
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object v6, v0, La/kqu;->k:La/kmq;

    .line 98
    .line 99
    iget-object v9, v0, La/kqu;->l:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v12, v9

    .line 102
    check-cast v12, La/jvn;

    .line 103
    .line 104
    new-instance v10, La/n1;

    .line 105
    .line 106
    move-object v11, v2

    .line 107
    check-cast v11, La/f7u;

    .line 108
    .line 109
    const/4 v15, 0x0

    .line 110
    const/16 v16, 0xd

    .line 111
    .line 112
    iget-wide v13, v0, La/kqu;->m:J

    .line 113
    .line 114
    invoke-direct/range {v10 .. v16}, La/n1;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V

    .line 115
    .line 116
    .line 117
    invoke-static {v4, v5, v3, v10}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    iput-object v8, v0, La/kqu;->k:La/kmq;

    .line 122
    .line 123
    iput-object v8, v0, La/kqu;->l:Ljava/lang/Object;

    .line 124
    .line 125
    iput-boolean v7, v0, La/kqu;->j:Z

    .line 126
    .line 127
    invoke-static {v6, v2, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    if-ne v0, v1, :cond_5

    .line 132
    .line 133
    move-object v8, v1

    .line 134
    goto :goto_3

    .line 135
    :cond_5
    :goto_2
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    :goto_3
    return-object v8

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
