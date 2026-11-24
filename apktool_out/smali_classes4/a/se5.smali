.class public final La/se5;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:J

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/mo60;La/g9b0;Ljava/lang/String;La/yje;)V
    .locals 1

    const/4 v0, 0x5

    iput-byte v0, p0, La/se5;->i:B

    .line 21
    iput-object p1, p0, La/se5;->k:Ljava/lang/Object;

    iput-object p2, p0, La/se5;->o:Ljava/lang/Object;

    iput-object p3, p0, La/se5;->n:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/pz40;La/a4x;La/pz40;Lkotlin/jvm/functions/Function0;JLa/yje;)V
    .locals 1

    const/4 v0, 0x4

    iput-byte v0, p0, La/se5;->i:B

    .line 20
    iput-object p1, p0, La/se5;->k:Ljava/lang/Object;

    iput-object p2, p0, La/se5;->l:Ljava/lang/Object;

    iput-object p3, p0, La/se5;->n:Ljava/lang/Object;

    iput-object p4, p0, La/se5;->o:Ljava/lang/Object;

    iput-wide p5, p0, La/se5;->m:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/ze5;JLjava/lang/String;Ljava/lang/String;La/rwn;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/se5;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/se5;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iput-wide p2, p0, La/se5;->m:J

    .line 7
    .line 8
    iput-object p4, p0, La/se5;->l:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p5, p0, La/se5;->n:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p6, p0, La/se5;->o:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(La/ze5;Ljava/lang/String;JLjava/lang/String;La/xwn;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/se5;->i:B

    .line 19
    iput-object p1, p0, La/se5;->k:Ljava/lang/Object;

    iput-object p2, p0, La/se5;->l:Ljava/lang/Object;

    iput-wide p3, p0, La/se5;->m:J

    iput-object p5, p0, La/se5;->n:Ljava/lang/Object;

    iput-object p6, p0, La/se5;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V
    .locals 0

    .line 22
    iput-byte p7, p0, La/se5;->i:B

    iput-object p1, p0, La/se5;->l:Ljava/lang/Object;

    iput-object p2, p0, La/se5;->n:Ljava/lang/Object;

    iput-object p3, p0, La/se5;->o:Ljava/lang/Object;

    iput-wide p4, p0, La/se5;->m:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 12

    .line 1
    iget-byte v0, p0, La/se5;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/se5;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/se5;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/se5;

    .line 11
    .line 12
    iget-object p0, p0, La/se5;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/mo60;

    .line 15
    .line 16
    check-cast v2, La/g9b0;

    .line 17
    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    invoke-direct {p1, p0, v2, v1, p2}, La/se5;-><init>(La/mo60;La/g9b0;Ljava/lang/String;La/yje;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    new-instance v3, La/se5;

    .line 25
    .line 26
    iget-object p1, p0, La/se5;->k:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v4, p1

    .line 29
    check-cast v4, La/pz40;

    .line 30
    .line 31
    iget-object p1, p0, La/se5;->l:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v5, p1

    .line 34
    check-cast v5, La/a4x;

    .line 35
    .line 36
    move-object v6, v1

    .line 37
    check-cast v6, La/pz40;

    .line 38
    .line 39
    move-object v7, v2

    .line 40
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 41
    .line 42
    iget-wide v8, p0, La/se5;->m:J

    .line 43
    .line 44
    move-object v10, p2

    .line 45
    invoke-direct/range {v3 .. v10}, La/se5;-><init>(La/pz40;La/a4x;La/pz40;Lkotlin/jvm/functions/Function0;JLa/yje;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :pswitch_1
    move-object v10, p2

    .line 50
    new-instance v4, La/se5;

    .line 51
    .line 52
    iget-object p2, p0, La/se5;->l:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v5, p2

    .line 55
    check-cast v5, La/t33;

    .line 56
    .line 57
    move-object v6, v1

    .line 58
    check-cast v6, La/zsf;

    .line 59
    .line 60
    move-object v7, v2

    .line 61
    check-cast v7, La/t33;

    .line 62
    .line 63
    iget-wide v8, p0, La/se5;->m:J

    .line 64
    .line 65
    const/4 v11, 0x3

    .line 66
    invoke-direct/range {v4 .. v11}, La/se5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V

    .line 67
    .line 68
    .line 69
    iput-object p1, v4, La/se5;->k:Ljava/lang/Object;

    .line 70
    .line 71
    return-object v4

    .line 72
    :pswitch_2
    move-object v10, p2

    .line 73
    new-instance v4, La/se5;

    .line 74
    .line 75
    iget-object p2, p0, La/se5;->l:Ljava/lang/Object;

    .line 76
    .line 77
    move-object v5, p2

    .line 78
    check-cast v5, La/nee;

    .line 79
    .line 80
    move-object v6, v1

    .line 81
    check-cast v6, La/aht0;

    .line 82
    .line 83
    move-object v7, v2

    .line 84
    check-cast v7, La/j39;

    .line 85
    .line 86
    iget-wide v8, p0, La/se5;->m:J

    .line 87
    .line 88
    const/4 v11, 0x2

    .line 89
    invoke-direct/range {v4 .. v11}, La/se5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLa/yje;B)V

    .line 90
    .line 91
    .line 92
    iput-object p1, v4, La/se5;->k:Ljava/lang/Object;

    .line 93
    .line 94
    return-object v4

    .line 95
    :pswitch_3
    move-object v10, p2

    .line 96
    new-instance v4, La/se5;

    .line 97
    .line 98
    iget-object p1, p0, La/se5;->k:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v5, p1

    .line 101
    check-cast v5, La/ze5;

    .line 102
    .line 103
    iget-object p1, p0, La/se5;->l:Ljava/lang/Object;

    .line 104
    .line 105
    move-object v6, p1

    .line 106
    check-cast v6, Ljava/lang/String;

    .line 107
    .line 108
    iget-wide v7, p0, La/se5;->m:J

    .line 109
    .line 110
    move-object v9, v1

    .line 111
    check-cast v9, Ljava/lang/String;

    .line 112
    .line 113
    check-cast v2, La/xwn;

    .line 114
    .line 115
    move-object v11, v10

    .line 116
    move-object v10, v2

    .line 117
    invoke-direct/range {v4 .. v11}, La/se5;-><init>(La/ze5;Ljava/lang/String;JLjava/lang/String;La/xwn;La/yje;)V

    .line 118
    .line 119
    .line 120
    return-object v4

    .line 121
    :pswitch_4
    move-object v10, p2

    .line 122
    new-instance v4, La/se5;

    .line 123
    .line 124
    iget-object p1, p0, La/se5;->k:Ljava/lang/Object;

    .line 125
    .line 126
    move-object v5, p1

    .line 127
    check-cast v5, La/ze5;

    .line 128
    .line 129
    iget-wide v6, p0, La/se5;->m:J

    .line 130
    .line 131
    iget-object p0, p0, La/se5;->l:Ljava/lang/Object;

    .line 132
    .line 133
    move-object v8, p0

    .line 134
    check-cast v8, Ljava/lang/String;

    .line 135
    .line 136
    move-object v9, v1

    .line 137
    check-cast v9, Ljava/lang/String;

    .line 138
    .line 139
    check-cast v2, La/rwn;

    .line 140
    .line 141
    move-object v11, v10

    .line 142
    move-object v10, v2

    .line 143
    invoke-direct/range {v4 .. v11}, La/se5;-><init>(La/ze5;JLjava/lang/String;Ljava/lang/String;La/rwn;La/yje;)V

    .line 144
    .line 145
    .line 146
    return-object v4

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/se5;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/se5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/se5;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/se5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/se5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/se5;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/se5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/se5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/se5;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/se5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/se5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/se5;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/se5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/se5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/se5;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/se5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, La/se5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/se5;

    .line 80
    .line 81
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, La/se5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    iget-byte v0, v6, La/se5;->i:B

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    const/4 v2, 0x0

    .line 7
    iget-object v3, v6, La/se5;->n:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    iget-object v5, v6, La/se5;->o:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v0, v6, La/se5;->k:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La/mo60;

    .line 21
    .line 22
    move-object v10, v5

    .line 23
    check-cast v10, La/g9b0;

    .line 24
    .line 25
    sget-object v5, La/wne;->a:La/wne;

    .line 26
    .line 27
    iget-boolean v9, v6, La/se5;->j:Z

    .line 28
    .line 29
    if-eqz v9, :cond_1

    .line 30
    .line 31
    if-ne v9, v7, :cond_0

    .line 32
    .line 33
    iget-wide v0, v6, La/se5;->m:J

    .line 34
    .line 35
    iget-object v2, v6, La/se5;->l:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-wide v11, v0

    .line 43
    move-object v14, v2

    .line 44
    move-object/from16 v1, p1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v4, v0, La/mo60;->b:La/a570;

    .line 56
    .line 57
    invoke-static {v4}, La/x1x;->D(La/a570;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v11

    .line 61
    iget-object v0, v0, La/mo60;->b:La/a570;

    .line 62
    .line 63
    instance-of v0, v0, La/z470;

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    goto :goto_0

    .line 76
    :cond_2
    const-string v0, ""

    .line 77
    .line 78
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object v4, v10, La/g9b0;->v:La/lbu;

    .line 82
    .line 83
    iput-object v0, v6, La/se5;->l:Ljava/lang/Object;

    .line 84
    .line 85
    iput-wide v11, v6, La/se5;->m:J

    .line 86
    .line 87
    iput-boolean v7, v6, La/se5;->j:Z

    .line 88
    .line 89
    invoke-static {v4, v2, v6, v1}, La/lbu;->k(La/lbu;ILa/yje;I)Ljava/io/Serializable;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    if-ne v1, v5, :cond_3

    .line 94
    .line 95
    move-object v8, v5

    .line 96
    goto/16 :goto_4

    .line 97
    .line 98
    :cond_3
    move-object v14, v0

    .line 99
    :goto_1
    check-cast v1, Ljava/lang/Iterable;

    .line 100
    .line 101
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    move-object v2, v1

    .line 116
    check-cast v2, La/pbv;

    .line 117
    .line 118
    iget-object v2, v2, La/pbv;->e:La/a570;

    .line 119
    .line 120
    invoke-static {v2}, La/x1x;->D(La/a570;)J

    .line 121
    .line 122
    .line 123
    move-result-wide v4

    .line 124
    cmp-long v2, v4, v11

    .line 125
    .line 126
    if-nez v2, :cond_4

    .line 127
    .line 128
    move-object v8, v1

    .line 129
    :cond_5
    check-cast v8, La/pbv;

    .line 130
    .line 131
    if-eqz v8, :cond_6

    .line 132
    .line 133
    iget-object v0, v8, La/pbv;->n:La/hds;

    .line 134
    .line 135
    if-eqz v0, :cond_6

    .line 136
    .line 137
    check-cast v3, Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v0, v3}, La/hds;->a(Ljava/lang/String;)La/lz60;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    if-eqz v0, :cond_6

    .line 144
    .line 145
    :goto_2
    move-object/from16 v16, v0

    .line 146
    .line 147
    move-wide v12, v11

    .line 148
    goto :goto_3

    .line 149
    :cond_6
    sget-object v0, La/jz60;->a:La/jz60;

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :goto_3
    iget-object v11, v10, La/g9b0;->B:La/hs60;

    .line 153
    .line 154
    move-object v15, v14

    .line 155
    sget-object v14, La/zn60;->b:La/zn60;

    .line 156
    .line 157
    invoke-virtual/range {v11 .. v16}, La/hs60;->d(JLa/zn60;Ljava/lang/String;La/lz60;)V

    .line 158
    .line 159
    .line 160
    move-wide v0, v12

    .line 161
    move-object v2, v15

    .line 162
    move-object/from16 v3, v16

    .line 163
    .line 164
    iget-object v4, v10, La/g9b0;->C:La/gw60;

    .line 165
    .line 166
    long-to-int v5, v0

    .line 167
    sget-object v7, La/y1p;->h1:La/y1p;

    .line 168
    .line 169
    invoke-virtual {v4, v5, v7, v2, v3}, La/gw60;->d(ILa/y1p;Ljava/lang/String;La/lz60;)V

    .line 170
    .line 171
    .line 172
    iget-object v3, v6, La/se5;->k:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v3, La/mo60;

    .line 175
    .line 176
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    new-instance v5, La/e9b0;

    .line 181
    .line 182
    const/4 v15, 0x0

    .line 183
    const/16 v16, 0x0

    .line 184
    .line 185
    move-object v11, v10

    .line 186
    const/4 v10, 0x1

    .line 187
    const-class v12, La/g9b0;

    .line 188
    .line 189
    const-string v13, "handleGameError"

    .line 190
    .line 191
    const-string v14, "handleGameError(Ljava/lang/Throwable;)V"

    .line 192
    .line 193
    move-object v9, v5

    .line 194
    invoke-direct/range {v9 .. v16}, La/e9b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 195
    .line 196
    .line 197
    iget-object v6, v11, La/g9b0;->h:La/mne;

    .line 198
    .line 199
    iget-object v7, v6, La/mne;->b:La/dvj;

    .line 200
    .line 201
    new-instance v8, La/ze1;

    .line 202
    .line 203
    const/4 v15, 0x0

    .line 204
    move-object v14, v2

    .line 205
    move-object v13, v3

    .line 206
    move-object v9, v8

    .line 207
    move-object v10, v11

    .line 208
    move-wide v11, v0

    .line 209
    invoke-direct/range {v9 .. v15}, La/ze1;-><init>(La/g9b0;JLa/mo60;Ljava/lang/String;La/yje;)V

    .line 210
    .line 211
    .line 212
    const/16 v9, 0xa

    .line 213
    .line 214
    const/4 v6, 0x0

    .line 215
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 216
    .line 217
    .line 218
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    :goto_4
    return-object v8

    .line 221
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 222
    .line 223
    iget-boolean v1, v6, La/se5;->j:Z

    .line 224
    .line 225
    if-eqz v1, :cond_8

    .line 226
    .line 227
    if-ne v1, v7, :cond_7

    .line 228
    .line 229
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_7
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    iget-object v1, v6, La/se5;->k:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v1, La/pz40;

    .line 243
    .line 244
    new-instance v2, La/rip;

    .line 245
    .line 246
    const/16 v4, 0x9

    .line 247
    .line 248
    invoke-direct {v2, v1, v4}, La/rip;-><init>(La/pz40;B)V

    .line 249
    .line 250
    .line 251
    invoke-static {v8, v2}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    new-instance v8, La/i5u;

    .line 256
    .line 257
    iget-object v2, v6, La/se5;->l:Ljava/lang/Object;

    .line 258
    .line 259
    move-object v9, v2

    .line 260
    check-cast v9, La/a4x;

    .line 261
    .line 262
    move-object v10, v3

    .line 263
    check-cast v10, La/pz40;

    .line 264
    .line 265
    move-object v11, v5

    .line 266
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 267
    .line 268
    iget-wide v12, v6, La/se5;->m:J

    .line 269
    .line 270
    const/4 v14, 0x1

    .line 271
    invoke-direct/range {v8 .. v14}, La/i5u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JB)V

    .line 272
    .line 273
    .line 274
    iput-boolean v7, v6, La/se5;->j:Z

    .line 275
    .line 276
    invoke-virtual {v1, v8, v6}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    if-ne v1, v0, :cond_9

    .line 281
    .line 282
    move-object v8, v0

    .line 283
    goto :goto_6

    .line 284
    :cond_9
    :goto_5
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    :goto_6
    return-object v8

    .line 287
    :pswitch_1
    move-object v13, v3

    .line 288
    check-cast v13, La/zsf;

    .line 289
    .line 290
    iget-object v0, v6, La/se5;->k:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v0, La/vne;

    .line 293
    .line 294
    sget-object v3, La/wne;->a:La/wne;

    .line 295
    .line 296
    iget-boolean v9, v6, La/se5;->j:Z

    .line 297
    .line 298
    if-eqz v9, :cond_b

    .line 299
    .line 300
    if-ne v9, v7, :cond_a

    .line 301
    .line 302
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    goto :goto_7

    .line 306
    :cond_a
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    goto :goto_8

    .line 310
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    new-instance v9, La/oxn;

    .line 314
    .line 315
    move-object v10, v5

    .line 316
    check-cast v10, La/t33;

    .line 317
    .line 318
    iget-wide v11, v6, La/se5;->m:J

    .line 319
    .line 320
    const/4 v14, 0x0

    .line 321
    const/4 v15, 0x1

    .line 322
    invoke-direct/range {v9 .. v15}, La/oxn;-><init>(La/t33;JLa/zsf;La/yje;B)V

    .line 323
    .line 324
    .line 325
    invoke-static {v0, v8, v8, v9, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 326
    .line 327
    .line 328
    iget-object v0, v6, La/se5;->l:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v0, La/t33;

    .line 331
    .line 332
    new-instance v1, Ljava/lang/Float;

    .line 333
    .line 334
    const/4 v4, 0x0

    .line 335
    invoke-direct {v1, v4}, Ljava/lang/Float;-><init>(F)V

    .line 336
    .line 337
    .line 338
    const/16 v4, 0x190

    .line 339
    .line 340
    const/4 v5, 0x2

    .line 341
    invoke-static {v4, v2, v13, v5}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    iput-object v8, v6, La/se5;->k:Ljava/lang/Object;

    .line 346
    .line 347
    iput-boolean v7, v6, La/se5;->j:Z

    .line 348
    .line 349
    move-object v4, v3

    .line 350
    const/4 v3, 0x0

    .line 351
    move-object v5, v4

    .line 352
    const/4 v4, 0x0

    .line 353
    const/16 v6, 0xc

    .line 354
    .line 355
    move-object v7, v5

    .line 356
    move-object/from16 v5, p0

    .line 357
    .line 358
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    if-ne v0, v7, :cond_c

    .line 363
    .line 364
    move-object v8, v7

    .line 365
    goto :goto_8

    .line 366
    :cond_c
    :goto_7
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 367
    .line 368
    :goto_8
    return-object v8

    .line 369
    :pswitch_2
    iget-object v0, v6, La/se5;->l:Ljava/lang/Object;

    .line 370
    .line 371
    move-object v11, v0

    .line 372
    check-cast v11, La/nee;

    .line 373
    .line 374
    iget-object v1, v11, La/nee;->t:La/h03;

    .line 375
    .line 376
    sget-object v0, La/wne;->a:La/wne;

    .line 377
    .line 378
    iget-boolean v9, v6, La/se5;->j:Z

    .line 379
    .line 380
    if-eqz v9, :cond_e

    .line 381
    .line 382
    if-ne v9, v7, :cond_d

    .line 383
    .line 384
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 385
    .line 386
    .line 387
    goto :goto_9

    .line 388
    :catchall_0
    move-exception v0

    .line 389
    goto :goto_c

    .line 390
    :catch_0
    move-exception v0

    .line 391
    move-object v8, v0

    .line 392
    goto :goto_b

    .line 393
    :cond_d
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    goto :goto_a

    .line 397
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    iget-object v4, v6, La/se5;->k:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v4, La/vne;

    .line 403
    .line 404
    invoke-interface {v4}, La/vne;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    invoke-static {v4}, La/zvw;->R(Lkotlin/coroutines/CoroutineContext;)La/bby;

    .line 409
    .line 410
    .line 411
    move-result-object v15

    .line 412
    :try_start_1
    iput-boolean v7, v11, La/nee;->w:Z

    .line 413
    .line 414
    iget-object v4, v11, La/nee;->p:La/sch0;

    .line 415
    .line 416
    sget-object v9, La/c050;->a:La/c050;

    .line 417
    .line 418
    move-object v10, v9

    .line 419
    new-instance v9, La/mee;

    .line 420
    .line 421
    check-cast v3, La/aht0;

    .line 422
    .line 423
    move-object v12, v5

    .line 424
    check-cast v12, La/j39;

    .line 425
    .line 426
    iget-wide v13, v6, La/se5;->m:J

    .line 427
    .line 428
    const/16 v16, 0x0

    .line 429
    .line 430
    const/16 v17, 0x0

    .line 431
    .line 432
    move-object/from16 v18, v10

    .line 433
    .line 434
    move-object v10, v3

    .line 435
    move-object/from16 v3, v18

    .line 436
    .line 437
    invoke-direct/range {v9 .. v17}, La/mee;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 438
    .line 439
    .line 440
    iput-boolean v7, v6, La/se5;->j:Z

    .line 441
    .line 442
    invoke-virtual {v4, v3, v9, v6}, La/sch0;->g(La/c050;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    if-ne v3, v0, :cond_f

    .line 447
    .line 448
    move-object v8, v0

    .line 449
    goto :goto_a

    .line 450
    :cond_f
    :goto_9
    invoke-virtual {v1}, La/h03;->F()V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 451
    .line 452
    .line 453
    iput-boolean v2, v11, La/nee;->w:Z

    .line 454
    .line 455
    invoke-virtual {v1, v8}, La/h03;->x(Ljava/util/concurrent/CancellationException;)V

    .line 456
    .line 457
    .line 458
    iput-boolean v2, v11, La/nee;->u:Z

    .line 459
    .line 460
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 461
    .line 462
    :goto_a
    return-object v8

    .line 463
    :goto_b
    :try_start_2
    throw v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 464
    :goto_c
    iput-boolean v2, v11, La/nee;->w:Z

    .line 465
    .line 466
    invoke-virtual {v1, v8}, La/h03;->x(Ljava/util/concurrent/CancellationException;)V

    .line 467
    .line 468
    .line 469
    iput-boolean v2, v11, La/nee;->u:Z

    .line 470
    .line 471
    throw v0

    .line 472
    :pswitch_3
    sget-object v9, La/wne;->a:La/wne;

    .line 473
    .line 474
    iget-boolean v0, v6, La/se5;->j:Z

    .line 475
    .line 476
    if-eqz v0, :cond_11

    .line 477
    .line 478
    if-ne v0, v7, :cond_10

    .line 479
    .line 480
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    goto :goto_d

    .line 484
    :cond_10
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    goto :goto_e

    .line 488
    :cond_11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    iget-object v0, v6, La/se5;->k:Ljava/lang/Object;

    .line 492
    .line 493
    check-cast v0, La/ze5;

    .line 494
    .line 495
    iget-object v1, v6, La/se5;->l:Ljava/lang/Object;

    .line 496
    .line 497
    check-cast v1, Ljava/lang/String;

    .line 498
    .line 499
    move-object v10, v3

    .line 500
    iget-wide v2, v6, La/se5;->m:J

    .line 501
    .line 502
    move-object v4, v10

    .line 503
    check-cast v4, Ljava/lang/String;

    .line 504
    .line 505
    check-cast v5, La/xwn;

    .line 506
    .line 507
    iput-boolean v7, v6, La/se5;->j:Z

    .line 508
    .line 509
    invoke-virtual/range {v0 .. v6}, La/ze5;->y(Ljava/lang/String;JLjava/lang/String;La/xwn;La/zje;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    if-ne v0, v9, :cond_12

    .line 514
    .line 515
    move-object v8, v9

    .line 516
    goto :goto_e

    .line 517
    :cond_12
    :goto_d
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 518
    .line 519
    :goto_e
    return-object v8

    .line 520
    :pswitch_4
    move-object v10, v3

    .line 521
    sget-object v9, La/wne;->a:La/wne;

    .line 522
    .line 523
    iget-boolean v0, v6, La/se5;->j:Z

    .line 524
    .line 525
    if-eqz v0, :cond_14

    .line 526
    .line 527
    if-ne v0, v7, :cond_13

    .line 528
    .line 529
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    goto :goto_f

    .line 533
    :cond_13
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    goto :goto_10

    .line 537
    :cond_14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    iget-object v0, v6, La/se5;->k:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast v0, La/ze5;

    .line 543
    .line 544
    iget-wide v1, v6, La/se5;->m:J

    .line 545
    .line 546
    iget-object v3, v6, La/se5;->l:Ljava/lang/Object;

    .line 547
    .line 548
    check-cast v3, Ljava/lang/String;

    .line 549
    .line 550
    move-object v4, v10

    .line 551
    check-cast v4, Ljava/lang/String;

    .line 552
    .line 553
    check-cast v5, La/rwn;

    .line 554
    .line 555
    iput-boolean v7, v6, La/se5;->j:Z

    .line 556
    .line 557
    invoke-virtual/range {v0 .. v6}, La/ze5;->x(JLjava/lang/String;Ljava/lang/String;La/rwn;La/zje;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    if-ne v0, v9, :cond_15

    .line 562
    .line 563
    move-object v8, v9

    .line 564
    goto :goto_10

    .line 565
    :cond_15
    :goto_f
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 566
    .line 567
    :goto_10
    return-object v8

    .line 568
    nop

    .line 569
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
