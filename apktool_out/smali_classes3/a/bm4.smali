.class public final La/bm4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/g0q;Ljava/lang/Object;La/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/bm4;->i:B

    .line 3
    iput-object p1, p0, La/bm4;->m:Ljava/lang/Object;

    iput-object p2, p0, La/bm4;->n:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/mz80;Ljava/lang/String;Lkotlin/jvm/functions/Function2;La/yje;)V
    .locals 1

    const/4 v0, 0x4

    iput-byte v0, p0, La/bm4;->i:B

    .line 2
    iput-object p1, p0, La/bm4;->l:Ljava/lang/Object;

    iput-object p2, p0, La/bm4;->m:Ljava/lang/Object;

    iput-object p3, p0, La/bm4;->n:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/bm4;->i:B

    iput-object p1, p0, La/bm4;->k:Ljava/lang/Object;

    iput-object p2, p0, La/bm4;->l:Ljava/lang/Object;

    iput-object p3, p0, La/bm4;->m:Ljava/lang/Object;

    iput-object p4, p0, La/bm4;->n:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 11

    .line 1
    iget-byte v0, p0, La/bm4;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/bm4;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/bm4;->m:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v3, La/bm4;

    .line 11
    .line 12
    iget-object v0, p0, La/bm4;->k:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v4, v0

    .line 15
    check-cast v4, La/n660;

    .line 16
    .line 17
    iget-object p0, p0, La/bm4;->l:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v5, p0

    .line 20
    check-cast v5, La/sip;

    .line 21
    .line 22
    move-object v6, v2

    .line 23
    check-cast v6, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 24
    .line 25
    move-object v7, v1

    .line 26
    check-cast v7, La/jo20;

    .line 27
    .line 28
    const/4 v9, 0x5

    .line 29
    move-object v8, p1

    .line 30
    invoke-direct/range {v3 .. v9}, La/bm4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;La/yje;B)V

    .line 31
    .line 32
    .line 33
    return-object v3

    .line 34
    :pswitch_0
    move-object v9, p1

    .line 35
    new-instance p1, La/bm4;

    .line 36
    .line 37
    iget-object p0, p0, La/bm4;->l:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, La/mz80;

    .line 40
    .line 41
    check-cast v2, Ljava/lang/String;

    .line 42
    .line 43
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 44
    .line 45
    invoke-direct {p1, p0, v2, v1, v9}, La/bm4;-><init>(La/mz80;Ljava/lang/String;Lkotlin/jvm/functions/Function2;La/yje;)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_1
    move-object v9, p1

    .line 50
    new-instance v4, La/bm4;

    .line 51
    .line 52
    iget-object p1, p0, La/bm4;->k:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v5, p1

    .line 55
    check-cast v5, La/phf0;

    .line 56
    .line 57
    iget-object p0, p0, La/bm4;->l:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v6, p0

    .line 60
    check-cast v6, La/sip;

    .line 61
    .line 62
    move-object v7, v2

    .line 63
    check-cast v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 64
    .line 65
    move-object v8, v1

    .line 66
    check-cast v8, La/jo20;

    .line 67
    .line 68
    const/4 v10, 0x3

    .line 69
    invoke-direct/range {v4 .. v10}, La/bm4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;La/yje;B)V

    .line 70
    .line 71
    .line 72
    return-object v4

    .line 73
    :pswitch_2
    move-object v9, p1

    .line 74
    new-instance p0, La/bm4;

    .line 75
    .line 76
    check-cast v2, La/g0q;

    .line 77
    .line 78
    invoke-direct {p0, v2, v1, v9}, La/bm4;-><init>(La/g0q;Ljava/lang/Object;La/yje;)V

    .line 79
    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_3
    move-object v9, p1

    .line 83
    new-instance v4, La/bm4;

    .line 84
    .line 85
    iget-object p1, p0, La/bm4;->k:Ljava/lang/Object;

    .line 86
    .line 87
    move-object v5, p1

    .line 88
    check-cast v5, La/mii0;

    .line 89
    .line 90
    iget-object p0, p0, La/bm4;->l:Ljava/lang/Object;

    .line 91
    .line 92
    move-object v6, p0

    .line 93
    check-cast v6, La/sip;

    .line 94
    .line 95
    move-object v7, v2

    .line 96
    check-cast v7, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 97
    .line 98
    move-object v8, v1

    .line 99
    check-cast v8, La/jo20;

    .line 100
    .line 101
    const/4 v10, 0x1

    .line 102
    invoke-direct/range {v4 .. v10}, La/bm4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;La/yje;B)V

    .line 103
    .line 104
    .line 105
    return-object v4

    .line 106
    :pswitch_4
    move-object v9, p1

    .line 107
    new-instance v4, La/bm4;

    .line 108
    .line 109
    iget-object p1, p0, La/bm4;->k:Ljava/lang/Object;

    .line 110
    .line 111
    move-object v5, p1

    .line 112
    check-cast v5, La/im4;

    .line 113
    .line 114
    iget-object p0, p0, La/bm4;->l:Ljava/lang/Object;

    .line 115
    .line 116
    move-object v6, p0

    .line 117
    check-cast v6, La/uu4;

    .line 118
    .line 119
    move-object v7, v2

    .line 120
    check-cast v7, Ljava/lang/String;

    .line 121
    .line 122
    move-object v8, v1

    .line 123
    check-cast v8, La/df2;

    .line 124
    .line 125
    const/4 v10, 0x0

    .line 126
    invoke-direct/range {v4 .. v10}, La/bm4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;La/yje;B)V

    .line 127
    .line 128
    .line 129
    return-object v4

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/bm4;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/bm4;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/bm4;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/bm4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/bm4;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/bm4;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/bm4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/bm4;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/bm4;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/bm4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/bm4;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/bm4;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/bm4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1}, La/bm4;->create(La/yje;)La/yje;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/bm4;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/bm4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_4
    invoke-virtual {p0, p1}, La/bm4;->create(La/yje;)La/yje;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, La/bm4;

    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, La/bm4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    nop

    .line 87
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
    .locals 14

    .line 1
    iget-byte v0, p0, La/bm4;->i:B

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    iget-object v2, p0, La/bm4;->n:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/bm4;->m:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, La/bm4;->l:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v8, v0

    .line 19
    check-cast v8, La/sip;

    .line 20
    .line 21
    sget-object v0, La/wne;->a:La/wne;

    .line 22
    .line 23
    iget-boolean v7, p0, La/bm4;->j:Z

    .line 24
    .line 25
    if-eqz v7, :cond_1

    .line 26
    .line 27
    if-ne v7, v5, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_4

    .line 37
    .line 38
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, La/bm4;->k:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, La/n660;

    .line 44
    .line 45
    iget-object p1, p1, La/n660;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, La/pmi0;

    .line 48
    .line 49
    check-cast v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 50
    .line 51
    check-cast v2, La/jo20;

    .line 52
    .line 53
    iput-boolean v5, p0, La/bm4;->j:Z

    .line 54
    .line 55
    invoke-virtual {p1, v8, v3, v2, p0}, La/pmi0;->d(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jo20;La/zje;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v0, :cond_2

    .line 60
    .line 61
    move-object v6, v0

    .line 62
    goto/16 :goto_4

    .line 63
    .line 64
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Iterable;

    .line 65
    .line 66
    new-instance p0, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_7

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, La/l7r0;

    .line 90
    .line 91
    iget-object v2, v0, La/l7r0;->c:Ljava/util/List;

    .line 92
    .line 93
    if-eqz v2, :cond_5

    .line 94
    .line 95
    new-instance v3, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-static {v2, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_6

    .line 113
    .line 114
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    move-object v7, v4

    .line 119
    check-cast v7, La/f5h;

    .line 120
    .line 121
    iget-object v4, v0, La/l7r0;->a:La/l26;

    .line 122
    .line 123
    const-wide/16 v5, -0x1

    .line 124
    .line 125
    if-eqz v4, :cond_3

    .line 126
    .line 127
    iget-object v4, v4, La/l26;->a:Ljava/lang/Long;

    .line 128
    .line 129
    if-eqz v4, :cond_3

    .line 130
    .line 131
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 132
    .line 133
    .line 134
    move-result-wide v9

    .line 135
    goto :goto_3

    .line 136
    :cond_3
    move-wide v9, v5

    .line 137
    :goto_3
    iget-object v4, v0, La/l7r0;->b:La/l26;

    .line 138
    .line 139
    if-eqz v4, :cond_4

    .line 140
    .line 141
    iget-object v4, v4, La/l26;->a:Ljava/lang/Long;

    .line 142
    .line 143
    if-eqz v4, :cond_4

    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 146
    .line 147
    .line 148
    move-result-wide v5

    .line 149
    :cond_4
    move-wide v11, v5

    .line 150
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-static/range {v7 .. v12}, La/pzb;->E(La/f5h;La/sip;JJ)La/nas;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_5
    sget-object v3, La/iun;->a:La/iun;

    .line 162
    .line 163
    :cond_6
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_7
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    move-object v6, p0

    .line 172
    check-cast v6, Ljava/util/List;

    .line 173
    .line 174
    if-nez v6, :cond_8

    .line 175
    .line 176
    sget-object v6, La/iun;->a:La/iun;

    .line 177
    .line 178
    :cond_8
    :goto_4
    return-object v6

    .line 179
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 180
    .line 181
    iget-boolean v1, p0, La/bm4;->j:Z

    .line 182
    .line 183
    if-eqz v1, :cond_a

    .line 184
    .line 185
    if-ne v1, v5, :cond_9

    .line 186
    .line 187
    iget-object p0, p0, La/bm4;->k:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast p0, La/xpg0;

    .line 190
    .line 191
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    .line 193
    .line 194
    goto :goto_5

    .line 195
    :catchall_0
    move-exception v0

    .line 196
    move-object p1, v0

    .line 197
    goto :goto_7

    .line 198
    :cond_9
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    iget-object p1, p0, La/bm4;->l:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast p1, La/mz80;

    .line 208
    .line 209
    iget-object p1, p1, La/mz80;->b:La/qpg0;

    .line 210
    .line 211
    check-cast v3, Ljava/lang/String;

    .line 212
    .line 213
    invoke-interface {p1, v3}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 218
    .line 219
    :try_start_1
    iput-object p1, p0, La/bm4;->k:Ljava/lang/Object;

    .line 220
    .line 221
    iput-boolean v5, p0, La/bm4;->j:Z

    .line 222
    .line 223
    invoke-interface {v2, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 227
    if-ne p0, v0, :cond_b

    .line 228
    .line 229
    move-object v6, v0

    .line 230
    goto :goto_6

    .line 231
    :cond_b
    move-object v13, p1

    .line 232
    move-object p1, p0

    .line 233
    move-object p0, v13

    .line 234
    :goto_5
    invoke-static {p0, v6}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 235
    .line 236
    .line 237
    move-object v6, p1

    .line 238
    :goto_6
    return-object v6

    .line 239
    :catchall_1
    move-exception v0

    .line 240
    move-object p0, v0

    .line 241
    move-object v13, p1

    .line 242
    move-object p1, p0

    .line 243
    move-object p0, v13

    .line 244
    :goto_7
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 245
    :catchall_2
    move-exception v0

    .line 246
    invoke-static {p0, p1}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 247
    .line 248
    .line 249
    throw v0

    .line 250
    :pswitch_1
    iget-object v0, p0, La/bm4;->l:Ljava/lang/Object;

    .line 251
    .line 252
    move-object v8, v0

    .line 253
    check-cast v8, La/sip;

    .line 254
    .line 255
    sget-object v0, La/wne;->a:La/wne;

    .line 256
    .line 257
    iget-boolean v7, p0, La/bm4;->j:Z

    .line 258
    .line 259
    if-eqz v7, :cond_d

    .line 260
    .line 261
    if-ne v7, v5, :cond_c

    .line 262
    .line 263
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_c
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    goto :goto_a

    .line 271
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    iget-object p1, p0, La/bm4;->k:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast p1, La/phf0;

    .line 277
    .line 278
    iget-object p1, p1, La/phf0;->a:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast p1, La/ocl;

    .line 281
    .line 282
    check-cast v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 283
    .line 284
    check-cast v2, La/jo20;

    .line 285
    .line 286
    iput-boolean v5, p0, La/bm4;->j:Z

    .line 287
    .line 288
    invoke-virtual {p1, v8, v3, v2, p0}, La/ocl;->c(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jo20;La/zje;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    if-ne p1, v0, :cond_e

    .line 293
    .line 294
    move-object v6, v0

    .line 295
    goto :goto_a

    .line 296
    :cond_e
    :goto_8
    check-cast p1, Ljava/lang/Iterable;

    .line 297
    .line 298
    new-instance v6, Ljava/util/ArrayList;

    .line 299
    .line 300
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 301
    .line 302
    .line 303
    move-result p0

    .line 304
    invoke-direct {v6, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 305
    .line 306
    .line 307
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    if-eqz p1, :cond_f

    .line 316
    .line 317
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    move-object v7, p1

    .line 322
    check-cast v7, La/f5h;

    .line 323
    .line 324
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    const-wide/16 v9, 0x0

    .line 328
    .line 329
    const-wide/16 v11, 0x0

    .line 330
    .line 331
    invoke-static/range {v7 .. v12}, La/pzb;->E(La/f5h;La/sip;JJ)La/nas;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    goto :goto_9

    .line 339
    :cond_f
    :goto_a
    return-object v6

    .line 340
    :pswitch_2
    check-cast v3, La/g0q;

    .line 341
    .line 342
    iget-object v1, v3, La/nzp;->a:Ljava/io/File;

    .line 343
    .line 344
    sget-object v0, La/wne;->a:La/wne;

    .line 345
    .line 346
    iget-boolean v7, p0, La/bm4;->j:Z

    .line 347
    .line 348
    if-eqz v7, :cond_11

    .line 349
    .line 350
    if-ne v7, v5, :cond_10

    .line 351
    .line 352
    iget-object v0, p0, La/bm4;->l:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v0, Ljava/io/FileOutputStream;

    .line 355
    .line 356
    iget-object p0, p0, La/bm4;->k:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast p0, Ljava/io/FileOutputStream;

    .line 359
    .line 360
    :try_start_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 361
    .line 362
    .line 363
    goto :goto_b

    .line 364
    :catchall_3
    move-exception v0

    .line 365
    move-object p1, v0

    .line 366
    goto :goto_d

    .line 367
    :cond_10
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    goto :goto_c

    .line 371
    :cond_11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    :try_start_4
    new-instance p1, Ljava/io/FileOutputStream;

    .line 375
    .line 376
    invoke-direct {p1, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 377
    .line 378
    .line 379
    :try_start_5
    iget-object v3, v3, La/nzp;->b:La/mhi0;

    .line 380
    .line 381
    new-instance v4, La/k7t0;

    .line 382
    .line 383
    invoke-direct {v4, p1}, La/k7t0;-><init>(Ljava/io/FileOutputStream;)V

    .line 384
    .line 385
    .line 386
    iput-object p1, p0, La/bm4;->k:Ljava/lang/Object;

    .line 387
    .line 388
    iput-object p1, p0, La/bm4;->l:Ljava/lang/Object;

    .line 389
    .line 390
    iput-boolean v5, p0, La/bm4;->j:Z

    .line 391
    .line 392
    invoke-interface {v3, v2, v4}, La/mhi0;->b0(Ljava/lang/Object;La/k7t0;)Lkotlin/Unit;

    .line 393
    .line 394
    .line 395
    move-result-object p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 396
    if-ne p0, v0, :cond_12

    .line 397
    .line 398
    move-object v6, v0

    .line 399
    goto :goto_c

    .line 400
    :cond_12
    move-object p0, p1

    .line 401
    move-object v0, p0

    .line 402
    :goto_b
    :try_start_6
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 403
    .line 404
    .line 405
    move-result-object p1

    .line 406
    invoke-virtual {p1}, Ljava/io/FileDescriptor;->sync()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 407
    .line 408
    .line 409
    :try_start_7
    invoke-static {p0, v6}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 410
    .line 411
    .line 412
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 413
    .line 414
    :goto_c
    return-object v6

    .line 415
    :catch_0
    move-exception v0

    .line 416
    move-object p0, v0

    .line 417
    goto :goto_e

    .line 418
    :catchall_4
    move-exception v0

    .line 419
    move-object p0, v0

    .line 420
    move-object v13, p1

    .line 421
    move-object p1, p0

    .line 422
    move-object p0, v13

    .line 423
    :goto_d
    :try_start_8
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 424
    :catchall_5
    move-exception v0

    .line 425
    :try_start_9
    invoke-static {p0, p1}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 426
    .line 427
    .line 428
    throw v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    .line 429
    :goto_e
    instance-of p1, p0, Ljava/io/FileNotFoundException;

    .line 430
    .line 431
    if-eqz p1, :cond_13

    .line 432
    .line 433
    invoke-virtual {v1}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object p1

    .line 437
    check-cast p0, Ljava/io/FileNotFoundException;

    .line 438
    .line 439
    invoke-static {p1, p0}, La/ntb;->e0(Ljava/lang/String;Ljava/io/FileNotFoundException;)Ljava/lang/Exception;

    .line 440
    .line 441
    .line 442
    move-result-object p0

    .line 443
    :cond_13
    throw p0

    .line 444
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 445
    .line 446
    iget-boolean v1, p0, La/bm4;->j:Z

    .line 447
    .line 448
    if-eqz v1, :cond_15

    .line 449
    .line 450
    if-ne v1, v5, :cond_14

    .line 451
    .line 452
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    goto :goto_f

    .line 456
    :cond_14
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    goto :goto_10

    .line 460
    :cond_15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    iget-object p1, p0, La/bm4;->k:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast p1, La/mii0;

    .line 466
    .line 467
    iget-object p1, p1, La/mii0;->c:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast p1, La/bbw0;

    .line 470
    .line 471
    iget-object v1, p0, La/bm4;->l:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v1, La/sip;

    .line 474
    .line 475
    check-cast v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 476
    .line 477
    check-cast v2, La/jo20;

    .line 478
    .line 479
    iput-boolean v5, p0, La/bm4;->j:Z

    .line 480
    .line 481
    invoke-virtual {p1, v1, v3, v2, p0}, La/bbw0;->i(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jo20;La/zje;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    if-ne p1, v0, :cond_16

    .line 486
    .line 487
    move-object v6, v0

    .line 488
    goto :goto_10

    .line 489
    :cond_16
    :goto_f
    check-cast p1, Ljava/util/List;

    .line 490
    .line 491
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object p0

    .line 495
    check-cast p0, La/web;

    .line 496
    .line 497
    if-eqz p0, :cond_17

    .line 498
    .line 499
    invoke-static {p0}, La/feb;->h0(La/web;)Ljava/util/List;

    .line 500
    .line 501
    .line 502
    move-result-object p0

    .line 503
    move-object v6, p0

    .line 504
    :cond_17
    if-nez v6, :cond_18

    .line 505
    .line 506
    sget-object v6, La/iun;->a:La/iun;

    .line 507
    .line 508
    :cond_18
    :goto_10
    return-object v6

    .line 509
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 510
    .line 511
    iget-boolean v1, p0, La/bm4;->j:Z

    .line 512
    .line 513
    if-eqz v1, :cond_1a

    .line 514
    .line 515
    if-ne v1, v5, :cond_19

    .line 516
    .line 517
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    goto :goto_11

    .line 521
    :cond_19
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    goto :goto_12

    .line 525
    :cond_1a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    iget-object p1, p0, La/bm4;->k:Ljava/lang/Object;

    .line 529
    .line 530
    move-object v6, p1

    .line 531
    check-cast v6, La/im4;

    .line 532
    .line 533
    iget-object p1, p0, La/bm4;->l:Ljava/lang/Object;

    .line 534
    .line 535
    move-object v7, p1

    .line 536
    check-cast v7, La/uu4;

    .line 537
    .line 538
    move-object v8, v3

    .line 539
    check-cast v8, Ljava/lang/String;

    .line 540
    .line 541
    move-object v9, v2

    .line 542
    check-cast v9, La/df2;

    .line 543
    .line 544
    iput-boolean v5, p0, La/bm4;->j:Z

    .line 545
    .line 546
    sget p1, La/im4;->u:I

    .line 547
    .line 548
    const-string v10, ""

    .line 549
    .line 550
    move-object v11, p0

    .line 551
    invoke-virtual/range {v6 .. v11}, La/im4;->i(La/uu4;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object p0

    .line 555
    if-ne p0, v0, :cond_1b

    .line 556
    .line 557
    move-object v6, v0

    .line 558
    goto :goto_12

    .line 559
    :cond_1b
    :goto_11
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 560
    .line 561
    :goto_12
    return-object v6

    .line 562
    nop

    .line 563
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
