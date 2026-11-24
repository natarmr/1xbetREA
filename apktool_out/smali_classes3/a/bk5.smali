.class public final La/bk5;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:J

.field public final synthetic l:Z

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BJLa/yje;La/diu0;Z)V
    .locals 0

    .line 16
    iput-byte p1, p0, La/bk5;->i:B

    iput-object p5, p0, La/bk5;->m:Ljava/lang/Object;

    iput-wide p2, p0, La/bk5;->k:J

    iput-boolean p6, p0, La/bk5;->l:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/jt80;ZJLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    iput-byte v0, p0, La/bk5;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/bk5;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-boolean p2, p0, La/bk5;->l:Z

    .line 7
    .line 8
    iput-wide p3, p0, La/bk5;->k:J

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(La/w6l;ZLa/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/bk5;->i:B

    .line 15
    iput-object p1, p0, La/bk5;->m:Ljava/lang/Object;

    iput-boolean p2, p0, La/bk5;->l:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    iget-byte v0, p0, La/bk5;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/bk5;->m:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/bk5;

    .line 9
    .line 10
    move-object v7, v1

    .line 11
    check-cast v7, La/ncl0;

    .line 12
    .line 13
    iget-wide v4, p0, La/bk5;->k:J

    .line 14
    .line 15
    iget-boolean v8, p0, La/bk5;->l:Z

    .line 16
    .line 17
    const/4 v3, 0x7

    .line 18
    move-object v6, p2

    .line 19
    invoke-direct/range {v2 .. v8}, La/bk5;-><init>(BJLa/yje;La/diu0;Z)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :pswitch_0
    move-object v7, p2

    .line 24
    new-instance v3, La/bk5;

    .line 25
    .line 26
    move-object v4, v1

    .line 27
    check-cast v4, La/jt80;

    .line 28
    .line 29
    iget-boolean v5, p0, La/bk5;->l:Z

    .line 30
    .line 31
    move-object v8, v7

    .line 32
    iget-wide v6, p0, La/bk5;->k:J

    .line 33
    .line 34
    invoke-direct/range {v3 .. v8}, La/bk5;-><init>(La/jt80;ZJLa/yje;)V

    .line 35
    .line 36
    .line 37
    return-object v3

    .line 38
    :pswitch_1
    move-object v7, p2

    .line 39
    new-instance v3, La/bk5;

    .line 40
    .line 41
    move-object v8, v1

    .line 42
    check-cast v8, La/yks;

    .line 43
    .line 44
    iget-wide v5, p0, La/bk5;->k:J

    .line 45
    .line 46
    iget-boolean v9, p0, La/bk5;->l:Z

    .line 47
    .line 48
    const/4 v4, 0x5

    .line 49
    invoke-direct/range {v3 .. v9}, La/bk5;-><init>(BJLa/yje;La/diu0;Z)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :pswitch_2
    move-object v7, p2

    .line 54
    new-instance v3, La/bk5;

    .line 55
    .line 56
    move-object v8, v1

    .line 57
    check-cast v8, La/g9s;

    .line 58
    .line 59
    iget-wide v5, p0, La/bk5;->k:J

    .line 60
    .line 61
    iget-boolean v9, p0, La/bk5;->l:Z

    .line 62
    .line 63
    const/4 v4, 0x4

    .line 64
    invoke-direct/range {v3 .. v9}, La/bk5;-><init>(BJLa/yje;La/diu0;Z)V

    .line 65
    .line 66
    .line 67
    return-object v3

    .line 68
    :pswitch_3
    move-object v7, p2

    .line 69
    new-instance v3, La/bk5;

    .line 70
    .line 71
    move-object v8, v1

    .line 72
    check-cast v8, La/k4s;

    .line 73
    .line 74
    iget-wide v5, p0, La/bk5;->k:J

    .line 75
    .line 76
    iget-boolean v9, p0, La/bk5;->l:Z

    .line 77
    .line 78
    const/4 v4, 0x3

    .line 79
    invoke-direct/range {v3 .. v9}, La/bk5;-><init>(BJLa/yje;La/diu0;Z)V

    .line 80
    .line 81
    .line 82
    return-object v3

    .line 83
    :pswitch_4
    move-object v7, p2

    .line 84
    new-instance v3, La/bk5;

    .line 85
    .line 86
    move-object v8, v1

    .line 87
    check-cast v8, La/spr;

    .line 88
    .line 89
    iget-wide v5, p0, La/bk5;->k:J

    .line 90
    .line 91
    iget-boolean v9, p0, La/bk5;->l:Z

    .line 92
    .line 93
    const/4 v4, 0x2

    .line 94
    invoke-direct/range {v3 .. v9}, La/bk5;-><init>(BJLa/yje;La/diu0;Z)V

    .line 95
    .line 96
    .line 97
    return-object v3

    .line 98
    :pswitch_5
    move-object v7, p2

    .line 99
    new-instance p2, La/bk5;

    .line 100
    .line 101
    check-cast v1, La/w6l;

    .line 102
    .line 103
    iget-boolean p0, p0, La/bk5;->l:Z

    .line 104
    .line 105
    invoke-direct {p2, v1, p0, v7}, La/bk5;-><init>(La/w6l;ZLa/yje;)V

    .line 106
    .line 107
    .line 108
    check-cast p1, Ljava/lang/Number;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 111
    .line 112
    .line 113
    move-result-wide p0

    .line 114
    iput-wide p0, p2, La/bk5;->k:J

    .line 115
    .line 116
    return-object p2

    .line 117
    :pswitch_6
    move-object v7, p2

    .line 118
    new-instance v3, La/bk5;

    .line 119
    .line 120
    move-object v8, v1

    .line 121
    check-cast v8, La/dk5;

    .line 122
    .line 123
    iget-wide v5, p0, La/bk5;->k:J

    .line 124
    .line 125
    iget-boolean v9, p0, La/bk5;->l:Z

    .line 126
    .line 127
    const/4 v4, 0x0

    .line 128
    invoke-direct/range {v3 .. v9}, La/bk5;-><init>(BJLa/yje;La/diu0;Z)V

    .line 129
    .line 130
    .line 131
    return-object v3

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/bk5;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/bk5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/bk5;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/bk5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/bk5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/bk5;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/bk5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/bk5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/bk5;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/bk5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/vne;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/bk5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/bk5;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/bk5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/vne;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/bk5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/bk5;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/bk5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/vne;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/bk5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/bk5;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/bk5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, Ljava/lang/Number;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 111
    .line 112
    .line 113
    move-result-wide v0

    .line 114
    check-cast p2, La/yje;

    .line 115
    .line 116
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p0, p1, p2}, La/bk5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    check-cast p0, La/bk5;

    .line 125
    .line 126
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    invoke-virtual {p0, p1}, La/bk5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0

    .line 133
    :pswitch_6
    check-cast p1, La/vne;

    .line 134
    .line 135
    check-cast p2, La/yje;

    .line 136
    .line 137
    invoke-virtual {p0, p1, p2}, La/bk5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    check-cast p0, La/bk5;

    .line 142
    .line 143
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    invoke-virtual {p0, p1}, La/bk5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    iget-byte v0, v8, La/bk5;->i:B

    .line 4
    .line 5
    iget-boolean v1, v8, La/bk5;->l:Z

    .line 6
    .line 7
    iget-object v2, v8, La/bk5;->m:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    const/4 v5, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v9, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v0, v8, La/bk5;->j:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    if-ne v0, v4, :cond_0

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    check-cast v2, La/ncl0;

    .line 36
    .line 37
    iget-object v0, v2, La/ncl0;->g:La/hcp0;

    .line 38
    .line 39
    invoke-virtual {v2}, La/ncl0;->w()La/qz40;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/p7m0;

    .line 44
    .line 45
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, La/zqs;

    .line 50
    .line 51
    iget-wide v1, v1, La/zqs;->c:J

    .line 52
    .line 53
    move-wide v5, v1

    .line 54
    iget-wide v1, v8, La/bk5;->k:J

    .line 55
    .line 56
    iput-boolean v4, v8, La/bk5;->j:Z

    .line 57
    .line 58
    iget-boolean v3, v8, La/bk5;->l:Z

    .line 59
    .line 60
    move-wide v4, v5

    .line 61
    const-wide/16 v6, 0x0

    .line 62
    .line 63
    invoke-virtual/range {v0 .. v8}, La/hcp0;->p(JZJJLa/yje;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-ne v0, v9, :cond_2

    .line 68
    .line 69
    move-object v5, v9

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    :goto_1
    return-object v5

    .line 74
    :pswitch_0
    check-cast v2, La/jt80;

    .line 75
    .line 76
    sget-object v6, La/wne;->a:La/wne;

    .line 77
    .line 78
    iget-boolean v0, v8, La/bk5;->j:Z

    .line 79
    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    if-ne v0, v4, :cond_3

    .line 83
    .line 84
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, v2, La/jt80;->V:La/m1e;

    .line 96
    .line 97
    invoke-interface {v0}, La/m1e;->c()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_5

    .line 102
    .line 103
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, La/rs80;

    .line 111
    .line 112
    iget-object v0, v0, La/rs80;->r:Ljava/util/List;

    .line 113
    .line 114
    iget-wide v9, v8, La/bk5;->k:J

    .line 115
    .line 116
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-eqz v3, :cond_7

    .line 125
    .line 126
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    move-object v7, v3

    .line 131
    check-cast v7, La/mlr;

    .line 132
    .line 133
    iget-wide v11, v7, La/mlr;->a:J

    .line 134
    .line 135
    cmp-long v7, v11, v9

    .line 136
    .line 137
    if-nez v7, :cond_6

    .line 138
    .line 139
    move-object v5, v3

    .line 140
    :cond_7
    check-cast v5, La/mlr;

    .line 141
    .line 142
    if-nez v5, :cond_8

    .line 143
    .line 144
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_8
    iget-object v0, v2, La/jt80;->T:La/xr;

    .line 148
    .line 149
    xor-int/2addr v1, v4

    .line 150
    invoke-virtual {v2}, La/jt80;->U()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    iget-object v7, v2, La/jt80;->Z:La/eyg0;

    .line 155
    .line 156
    iget-wide v9, v5, La/mlr;->a:J

    .line 157
    .line 158
    invoke-virtual {v2, v9, v10}, La/jt80;->O(J)La/lu0;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v7, v2}, La/eyg0;->k(La/lu0;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    iput-boolean v4, v8, La/bk5;->j:Z

    .line 167
    .line 168
    move-object v4, v2

    .line 169
    move v2, v1

    .line 170
    move-object v1, v5

    .line 171
    move-object v5, v8

    .line 172
    invoke-virtual/range {v0 .. v5}, La/xr;->m(La/mlr;ZILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-ne v0, v6, :cond_9

    .line 177
    .line 178
    move-object v5, v6

    .line 179
    goto :goto_3

    .line 180
    :cond_9
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    :goto_3
    return-object v5

    .line 183
    :pswitch_1
    sget-object v9, La/wne;->a:La/wne;

    .line 184
    .line 185
    iget-boolean v0, v8, La/bk5;->j:Z

    .line 186
    .line 187
    if-eqz v0, :cond_b

    .line 188
    .line 189
    if-ne v0, v4, :cond_a

    .line 190
    .line 191
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_a
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    check-cast v2, La/yks;

    .line 203
    .line 204
    iget-object v0, v2, La/yks;->u:La/hcp0;

    .line 205
    .line 206
    iget-object v1, v2, La/yks;->p:Lorg/xplatform/sportgame/lite/api/SportGameLiteScreenParams;

    .line 207
    .line 208
    iget-wide v1, v1, Lorg/xplatform/sportgame/lite/api/SportGameLiteScreenParams;->a:J

    .line 209
    .line 210
    move-wide v5, v1

    .line 211
    iget-wide v1, v8, La/bk5;->k:J

    .line 212
    .line 213
    iput-boolean v4, v8, La/bk5;->j:Z

    .line 214
    .line 215
    iget-boolean v3, v8, La/bk5;->l:Z

    .line 216
    .line 217
    move-wide v4, v5

    .line 218
    const-wide/16 v6, 0x0

    .line 219
    .line 220
    invoke-virtual/range {v0 .. v8}, La/hcp0;->p(JZJJLa/yje;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    if-ne v0, v9, :cond_c

    .line 225
    .line 226
    move-object v5, v9

    .line 227
    goto :goto_5

    .line 228
    :cond_c
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    :goto_5
    return-object v5

    .line 231
    :pswitch_2
    sget-object v9, La/wne;->a:La/wne;

    .line 232
    .line 233
    iget-boolean v0, v8, La/bk5;->j:Z

    .line 234
    .line 235
    if-eqz v0, :cond_e

    .line 236
    .line 237
    if-ne v0, v4, :cond_d

    .line 238
    .line 239
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_d
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    goto :goto_7

    .line 247
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    check-cast v2, La/g9s;

    .line 251
    .line 252
    iget-object v0, v2, La/g9s;->u:La/hcp0;

    .line 253
    .line 254
    iget-object v1, v2, La/g9s;->p:Lorg/xplatform/sportgame/dashboard/api/SportGameDashboardScreenParams;

    .line 255
    .line 256
    iget-wide v1, v1, Lorg/xplatform/sportgame/dashboard/api/SportGameDashboardScreenParams;->a:J

    .line 257
    .line 258
    move-wide v5, v1

    .line 259
    iget-wide v1, v8, La/bk5;->k:J

    .line 260
    .line 261
    iput-boolean v4, v8, La/bk5;->j:Z

    .line 262
    .line 263
    iget-boolean v3, v8, La/bk5;->l:Z

    .line 264
    .line 265
    move-wide v4, v5

    .line 266
    const-wide/16 v6, 0x0

    .line 267
    .line 268
    invoke-virtual/range {v0 .. v8}, La/hcp0;->p(JZJJLa/yje;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    if-ne v0, v9, :cond_f

    .line 273
    .line 274
    move-object v5, v9

    .line 275
    goto :goto_7

    .line 276
    :cond_f
    :goto_6
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 277
    .line 278
    :goto_7
    return-object v5

    .line 279
    :pswitch_3
    sget-object v9, La/wne;->a:La/wne;

    .line 280
    .line 281
    iget-boolean v0, v8, La/bk5;->j:Z

    .line 282
    .line 283
    if-eqz v0, :cond_11

    .line 284
    .line 285
    if-ne v0, v4, :cond_10

    .line 286
    .line 287
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    goto :goto_8

    .line 291
    :cond_10
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    goto :goto_9

    .line 295
    :cond_11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    check-cast v2, La/k4s;

    .line 299
    .line 300
    iget-object v0, v2, La/k4s;->w:La/hcp0;

    .line 301
    .line 302
    iget-object v1, v2, La/k4s;->o:La/frs;

    .line 303
    .line 304
    iget-wide v1, v1, La/frs;->b:J

    .line 305
    .line 306
    move-wide v5, v1

    .line 307
    iget-wide v1, v8, La/bk5;->k:J

    .line 308
    .line 309
    iput-boolean v4, v8, La/bk5;->j:Z

    .line 310
    .line 311
    iget-boolean v3, v8, La/bk5;->l:Z

    .line 312
    .line 313
    move-wide v4, v5

    .line 314
    const-wide/16 v6, 0x0

    .line 315
    .line 316
    invoke-virtual/range {v0 .. v8}, La/hcp0;->p(JZJJLa/yje;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    if-ne v0, v9, :cond_12

    .line 321
    .line 322
    move-object v5, v9

    .line 323
    goto :goto_9

    .line 324
    :cond_12
    :goto_8
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 325
    .line 326
    :goto_9
    return-object v5

    .line 327
    :pswitch_4
    sget-object v9, La/wne;->a:La/wne;

    .line 328
    .line 329
    iget-boolean v0, v8, La/bk5;->j:Z

    .line 330
    .line 331
    if-eqz v0, :cond_14

    .line 332
    .line 333
    if-ne v0, v4, :cond_13

    .line 334
    .line 335
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    goto :goto_a

    .line 339
    :cond_13
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    goto :goto_b

    .line 343
    :cond_14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    check-cast v2, La/spr;

    .line 347
    .line 348
    iget-object v0, v2, La/spr;->u:La/hcp0;

    .line 349
    .line 350
    iget-object v1, v2, La/spr;->p:Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;

    .line 351
    .line 352
    iget-wide v1, v1, Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;->a:J

    .line 353
    .line 354
    move-wide v5, v1

    .line 355
    iget-wide v1, v8, La/bk5;->k:J

    .line 356
    .line 357
    iput-boolean v4, v8, La/bk5;->j:Z

    .line 358
    .line 359
    iget-boolean v3, v8, La/bk5;->l:Z

    .line 360
    .line 361
    move-wide v4, v5

    .line 362
    const-wide/16 v6, 0x0

    .line 363
    .line 364
    invoke-virtual/range {v0 .. v8}, La/hcp0;->p(JZJJLa/yje;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    if-ne v0, v9, :cond_15

    .line 369
    .line 370
    move-object v5, v9

    .line 371
    goto :goto_b

    .line 372
    :cond_15
    :goto_a
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 373
    .line 374
    :goto_b
    return-object v5

    .line 375
    :pswitch_5
    check-cast v2, La/w6l;

    .line 376
    .line 377
    iget-wide v6, v8, La/bk5;->k:J

    .line 378
    .line 379
    sget-object v0, La/wne;->a:La/wne;

    .line 380
    .line 381
    iget-boolean v9, v8, La/bk5;->j:Z

    .line 382
    .line 383
    if-eqz v9, :cond_17

    .line 384
    .line 385
    if-ne v9, v4, :cond_16

    .line 386
    .line 387
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    goto/16 :goto_e

    .line 391
    .line 392
    :cond_16
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    goto :goto_f

    .line 396
    :cond_17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    if-nez v3, :cond_18

    .line 404
    .line 405
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 406
    .line 407
    goto :goto_f

    .line 408
    :cond_18
    const-wide/16 v9, 0x3e8

    .line 409
    .line 410
    div-long v9, v6, v9

    .line 411
    .line 412
    const-wide/16 v11, 0x3c

    .line 413
    .line 414
    div-long v11, v9, v11

    .line 415
    .line 416
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 417
    .line 418
    invoke-virtual {v3, v11, v12}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 419
    .line 420
    .line 421
    move-result-wide v13

    .line 422
    sub-long v13, v9, v13

    .line 423
    .line 424
    const-wide/16 v15, 0x0

    .line 425
    .line 426
    cmp-long v3, v11, v15

    .line 427
    .line 428
    if-eqz v3, :cond_1a

    .line 429
    .line 430
    if-eqz v1, :cond_19

    .line 431
    .line 432
    goto :goto_c

    .line 433
    :cond_19
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    iget-object v3, v2, La/w6l;->d:Ljava/lang/String;

    .line 438
    .line 439
    new-instance v9, Ljava/text/DecimalFormat;

    .line 440
    .line 441
    invoke-direct {v9}, Ljava/text/DecimalFormat;-><init>()V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v9, v11, v12}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v9

    .line 448
    iget-object v10, v2, La/w6l;->e:Ljava/text/DecimalFormat;

    .line 449
    .line 450
    invoke-virtual {v10, v13, v14}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v10

    .line 454
    filled-new-array {v9, v10}, [Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v9

    .line 458
    const/4 v10, 0x2

    .line 459
    invoke-static {v9, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v9

    .line 463
    invoke-static {v1, v3, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    goto :goto_d

    .line 468
    :cond_1a
    :goto_c
    new-instance v1, Ljava/text/DecimalFormat;

    .line 469
    .line 470
    invoke-direct {v1}, Ljava/text/DecimalFormat;-><init>()V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v1, v9, v10}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    :goto_d
    sget-object v3, La/tvk;->a:La/rwj;

    .line 481
    .line 482
    sget-object v3, La/ys10;->a:La/vs10;

    .line 483
    .line 484
    new-instance v9, La/sxk;

    .line 485
    .line 486
    invoke-direct {v9, v2, v1, v5, v4}, La/sxk;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 487
    .line 488
    .line 489
    iput-wide v6, v8, La/bk5;->k:J

    .line 490
    .line 491
    iput-boolean v4, v8, La/bk5;->j:Z

    .line 492
    .line 493
    invoke-static {v3, v9, v8}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    if-ne v1, v0, :cond_1b

    .line 498
    .line 499
    move-object v5, v0

    .line 500
    goto :goto_f

    .line 501
    :cond_1b
    :goto_e
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 502
    .line 503
    :goto_f
    return-object v5

    .line 504
    :pswitch_6
    iget-wide v6, v8, La/bk5;->k:J

    .line 505
    .line 506
    check-cast v2, La/dk5;

    .line 507
    .line 508
    sget-object v0, La/wne;->a:La/wne;

    .line 509
    .line 510
    iget-boolean v9, v8, La/bk5;->j:Z

    .line 511
    .line 512
    if-eqz v9, :cond_1d

    .line 513
    .line 514
    if-ne v9, v4, :cond_1c

    .line 515
    .line 516
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    move-object/from16 v3, p1

    .line 520
    .line 521
    goto :goto_10

    .line 522
    :cond_1c
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    goto :goto_13

    .line 526
    :cond_1d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    iget-object v3, v2, La/dk5;->k:La/sp;

    .line 530
    .line 531
    iput-boolean v4, v8, La/bk5;->j:Z

    .line 532
    .line 533
    invoke-virtual {v3, v6, v7, v8}, La/sp;->a(JLa/zje;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v3

    .line 537
    if-ne v3, v0, :cond_1e

    .line 538
    .line 539
    move-object v5, v0

    .line 540
    goto :goto_13

    .line 541
    :cond_1e
    :goto_10
    check-cast v3, Ljava/lang/Boolean;

    .line 542
    .line 543
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    if-eqz v0, :cond_20

    .line 548
    .line 549
    iget-object v0, v2, La/dk5;->A:La/l7k;

    .line 550
    .line 551
    const-string v3, "screen"

    .line 552
    .line 553
    const-string v4, "bill_management"

    .line 554
    .line 555
    if-eqz v1, :cond_1f

    .line 556
    .line 557
    iget-object v5, v2, La/dk5;->l:La/ih5;

    .line 558
    .line 559
    iget-object v5, v5, La/ih5;->a:La/kt2;

    .line 560
    .line 561
    const-string v8, "deposit_call"

    .line 562
    .line 563
    invoke-static {v3, v4, v5, v8}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    sget-object v3, La/y1p;->b:La/y1p;

    .line 567
    .line 568
    iget-object v3, v2, La/dk5;->K:La/cmt;

    .line 569
    .line 570
    invoke-virtual {v3}, La/cmt;->g()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v3

    .line 574
    invoke-virtual {v0, v4, v3}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    goto :goto_11

    .line 578
    :cond_1f
    iget-object v5, v2, La/dk5;->j:La/ih5;

    .line 579
    .line 580
    iget-object v5, v5, La/ih5;->a:La/kt2;

    .line 581
    .line 582
    const-string v8, "withdraw_call"

    .line 583
    .line 584
    invoke-static {v3, v4, v5, v8}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    sget-object v3, La/y1p;->b:La/y1p;

    .line 588
    .line 589
    invoke-virtual {v0, v4}, La/l7k;->c(Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    :goto_11
    iget-object v0, v2, La/dk5;->m:La/v88;

    .line 593
    .line 594
    iget-object v2, v2, La/dk5;->b:La/i1w0;

    .line 595
    .line 596
    invoke-virtual {v0, v2, v1, v6, v7}, La/v88;->a(La/i1w0;ZJ)V

    .line 597
    .line 598
    .line 599
    goto :goto_12

    .line 600
    :cond_20
    iget-object v0, v2, La/dk5;->Z:La/p7m0;

    .line 601
    .line 602
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 603
    .line 604
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v0, v5, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    :goto_12
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 611
    .line 612
    :goto_13
    return-object v5

    .line 613
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
