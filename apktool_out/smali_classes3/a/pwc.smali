.class public final La/pwc;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public k:I

.field public l:I

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/rwc;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/pwc;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/pwc;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, La/pwc;->k:I

    .line 7
    .line 8
    iput p3, p0, La/pwc;->l:I

    .line 9
    .line 10
    iput-object p4, p0, La/pwc;->n:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, La/pwc;->o:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p6, p0, La/pwc;->p:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;La/cmt;Ljava/util/Set;IILa/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/pwc;->i:B

    .line 21
    iput-object p1, p0, La/pwc;->n:Ljava/lang/Object;

    iput-object p2, p0, La/pwc;->o:Ljava/lang/Object;

    iput-object p3, p0, La/pwc;->p:Ljava/lang/Object;

    iput p4, p0, La/pwc;->k:I

    iput p5, p0, La/pwc;->l:I

    invoke-direct {p0, v0, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;IILa/kwj;La/pz40;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/pwc;->i:B

    .line 22
    iput-object p1, p0, La/pwc;->m:Ljava/lang/Object;

    iput-object p2, p0, La/pwc;->n:Ljava/lang/Object;

    iput p3, p0, La/pwc;->k:I

    iput p4, p0, La/pwc;->l:I

    iput-object p5, p0, La/pwc;->o:Ljava/lang/Object;

    iput-object p6, p0, La/pwc;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;La/j3t0;La/yje;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/pwc;->i:B

    .line 23
    iput-object p1, p0, La/pwc;->o:Ljava/lang/Object;

    iput-object p2, p0, La/pwc;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 12

    .line 1
    iget-byte v0, p0, La/pwc;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/pwc;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/pwc;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p0, La/pwc;

    .line 11
    .line 12
    check-cast v2, [Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, La/j3t0;

    .line 15
    .line 16
    invoke-direct {p0, v2, v1, p2}, La/pwc;-><init>([Ljava/lang/Object;La/j3t0;La/yje;)V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    new-instance v3, La/pwc;

    .line 21
    .line 22
    iget-object v0, p0, La/pwc;->n:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v4, v0

    .line 25
    check-cast v4, Ljava/util/ArrayList;

    .line 26
    .line 27
    move-object v5, v2

    .line 28
    check-cast v5, La/cmt;

    .line 29
    .line 30
    move-object v6, v1

    .line 31
    check-cast v6, Ljava/util/Set;

    .line 32
    .line 33
    iget v7, p0, La/pwc;->k:I

    .line 34
    .line 35
    iget v8, p0, La/pwc;->l:I

    .line 36
    .line 37
    move-object v9, p2

    .line 38
    invoke-direct/range {v3 .. v9}, La/pwc;-><init>(Ljava/util/ArrayList;La/cmt;Ljava/util/Set;IILa/yje;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v3, La/pwc;->m:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v3

    .line 44
    :pswitch_1
    move-object v11, p2

    .line 45
    new-instance v4, La/pwc;

    .line 46
    .line 47
    iget-object p1, p0, La/pwc;->m:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v5, p1

    .line 50
    check-cast v5, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 51
    .line 52
    iget-object p1, p0, La/pwc;->n:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v6, p1

    .line 55
    check-cast v6, Ljava/util/Calendar;

    .line 56
    .line 57
    iget v7, p0, La/pwc;->k:I

    .line 58
    .line 59
    iget v8, p0, La/pwc;->l:I

    .line 60
    .line 61
    move-object v9, v2

    .line 62
    check-cast v9, La/kwj;

    .line 63
    .line 64
    move-object v10, v1

    .line 65
    check-cast v10, La/pz40;

    .line 66
    .line 67
    invoke-direct/range {v4 .. v11}, La/pwc;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;IILa/kwj;La/pz40;La/yje;)V

    .line 68
    .line 69
    .line 70
    return-object v4

    .line 71
    :pswitch_2
    move-object v11, p2

    .line 72
    new-instance v4, La/pwc;

    .line 73
    .line 74
    iget-object p1, p0, La/pwc;->m:Ljava/lang/Object;

    .line 75
    .line 76
    move-object v5, p1

    .line 77
    check-cast v5, La/rwc;

    .line 78
    .line 79
    iget v6, p0, La/pwc;->k:I

    .line 80
    .line 81
    iget v7, p0, La/pwc;->l:I

    .line 82
    .line 83
    iget-object p0, p0, La/pwc;->n:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v8, p0

    .line 86
    check-cast v8, Ljava/lang/String;

    .line 87
    .line 88
    move-object v9, v2

    .line 89
    check-cast v9, Ljava/lang/String;

    .line 90
    .line 91
    move-object v10, v1

    .line 92
    check-cast v10, Ljava/lang/String;

    .line 93
    .line 94
    invoke-direct/range {v4 .. v11}, La/pwc;-><init>(La/rwc;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/yje;)V

    .line 95
    .line 96
    .line 97
    return-object v4

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/pwc;->i:B

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
    invoke-virtual {p0, p1, p2}, La/pwc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/pwc;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/pwc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/pwc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/pwc;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/pwc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/pwc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/pwc;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/pwc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/pwc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/pwc;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/pwc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget-byte v0, v7, La/pwc;->i:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v8, v7, La/pwc;->p:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v9, v7, La/pwc;->o:Ljava/lang/Object;

    .line 9
    .line 10
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v0, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-boolean v5, v7, La/pwc;->j:Z

    .line 20
    .line 21
    if-eqz v5, :cond_1

    .line 22
    .line 23
    if-ne v5, v3, :cond_0

    .line 24
    .line 25
    iget v1, v7, La/pwc;->l:I

    .line 26
    .line 27
    iget v2, v7, La/pwc;->k:I

    .line 28
    .line 29
    iget-object v4, v7, La/pwc;->n:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v4, La/j3t0;

    .line 32
    .line 33
    iget-object v5, v7, La/pwc;->m:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, [Ljava/lang/Object;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    check-cast v9, [Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v8, La/j3t0;

    .line 51
    .line 52
    array-length v2, v9

    .line 53
    move-object v4, v8

    .line 54
    move-object v5, v9

    .line 55
    :goto_0
    if-ge v1, v2, :cond_3

    .line 56
    .line 57
    aget-object v6, v5, v1

    .line 58
    .line 59
    iput-object v5, v7, La/pwc;->m:Ljava/lang/Object;

    .line 60
    .line 61
    iput-object v4, v7, La/pwc;->n:Ljava/lang/Object;

    .line 62
    .line 63
    iput v1, v7, La/pwc;->k:I

    .line 64
    .line 65
    iput v2, v7, La/pwc;->l:I

    .line 66
    .line 67
    iput-boolean v3, v7, La/pwc;->j:Z

    .line 68
    .line 69
    invoke-interface {v4, v6, v7}, La/j3t0;->a(Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    if-ne v6, v0, :cond_2

    .line 74
    .line 75
    move-object v4, v0

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    move/from16 v20, v2

    .line 78
    .line 79
    move v2, v1

    .line 80
    move/from16 v1, v20

    .line 81
    .line 82
    :goto_1
    add-int/2addr v2, v3

    .line 83
    move/from16 v20, v2

    .line 84
    .line 85
    move v2, v1

    .line 86
    move/from16 v1, v20

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    :goto_2
    return-object v4

    .line 92
    :pswitch_0
    iget-object v0, v7, La/pwc;->m:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, La/vne;

    .line 95
    .line 96
    sget-object v1, La/wne;->a:La/wne;

    .line 97
    .line 98
    iget-boolean v5, v7, La/pwc;->j:Z

    .line 99
    .line 100
    if-eqz v5, :cond_5

    .line 101
    .line 102
    if-ne v5, v3, :cond_4

    .line 103
    .line 104
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    move-object/from16 v0, p1

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto/16 :goto_6

    .line 114
    .line 115
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget-object v2, v7, La/pwc;->n:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, Ljava/util/ArrayList;

    .line 121
    .line 122
    move-object v11, v9

    .line 123
    check-cast v11, La/cmt;

    .line 124
    .line 125
    move-object v12, v8

    .line 126
    check-cast v12, Ljava/util/Set;

    .line 127
    .line 128
    iget v13, v7, La/pwc;->k:I

    .line 129
    .line 130
    iget v5, v7, La/pwc;->l:I

    .line 131
    .line 132
    new-instance v6, Ljava/util/ArrayList;

    .line 133
    .line 134
    const/16 v8, 0xa

    .line 135
    .line 136
    invoke-static {v2, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v8

    .line 151
    if-eqz v8, :cond_6

    .line 152
    .line 153
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    check-cast v8, Lkotlin/Pair;

    .line 158
    .line 159
    iget-object v9, v8, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v9, Ljava/lang/Number;

    .line 162
    .line 163
    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    .line 164
    .line 165
    .line 166
    move-result-wide v14

    .line 167
    iget-object v8, v8, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v8, Ljava/lang/Number;

    .line 170
    .line 171
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 172
    .line 173
    .line 174
    move-result-wide v16

    .line 175
    new-instance v10, La/icu;

    .line 176
    .line 177
    const/16 v19, 0x0

    .line 178
    .line 179
    move/from16 v18, v5

    .line 180
    .line 181
    invoke-direct/range {v10 .. v19}, La/icu;-><init>(La/cmt;Ljava/util/Set;IJJILa/yje;)V

    .line 182
    .line 183
    .line 184
    const/4 v5, 0x3

    .line 185
    invoke-static {v0, v4, v10, v5}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move/from16 v5, v18

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_6
    iput-object v4, v7, La/pwc;->m:Ljava/lang/Object;

    .line 196
    .line 197
    iput-boolean v3, v7, La/pwc;->j:Z

    .line 198
    .line 199
    invoke-static {v6, v7}, La/qjj;->N(Ljava/util/Collection;La/zje;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    if-ne v0, v1, :cond_7

    .line 204
    .line 205
    move-object v4, v1

    .line 206
    goto :goto_6

    .line 207
    :cond_7
    :goto_4
    check-cast v0, Ljava/lang/Iterable;

    .line 208
    .line 209
    invoke-static {v0}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    new-instance v1, Ljava/util/HashSet;

    .line 214
    .line 215
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 216
    .line 217
    .line 218
    new-instance v2, Ljava/util/ArrayList;

    .line 219
    .line 220
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    :cond_8
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    if-eqz v3, :cond_9

    .line 232
    .line 233
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    move-object v4, v3

    .line 238
    check-cast v4, La/l2g0;

    .line 239
    .line 240
    iget-wide v4, v4, La/l2g0;->a:J

    .line 241
    .line 242
    new-instance v6, Ljava/lang/Long;

    .line 243
    .line 244
    invoke-direct {v6, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    if-eqz v4, :cond_8

    .line 252
    .line 253
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_9
    new-instance v0, La/vvt;

    .line 258
    .line 259
    const/16 v1, 0xd

    .line 260
    .line 261
    invoke-direct {v0, v1}, La/vvt;-><init>(B)V

    .line 262
    .line 263
    .line 264
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    :goto_6
    return-object v4

    .line 269
    :pswitch_1
    check-cast v9, La/kwj;

    .line 270
    .line 271
    sget-object v0, La/wne;->a:La/wne;

    .line 272
    .line 273
    iget-boolean v5, v7, La/pwc;->j:Z

    .line 274
    .line 275
    if-eqz v5, :cond_b

    .line 276
    .line 277
    if-ne v5, v3, :cond_a

    .line 278
    .line 279
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    goto :goto_7

    .line 283
    :cond_a
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    goto :goto_8

    .line 287
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    iget-object v2, v7, La/pwc;->m:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v2, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 293
    .line 294
    iget-object v4, v7, La/pwc;->n:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v4, Ljava/util/Calendar;

    .line 297
    .line 298
    invoke-static {v2, v4}, La/wdx;->J(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)V

    .line 299
    .line 300
    .line 301
    invoke-static {v4}, La/wdx;->j0(Ljava/util/Calendar;)La/w2w0;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    invoke-static {v2}, La/bsr0;->m0(La/w2w0;)I

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    iget v5, v7, La/pwc;->k:I

    .line 310
    .line 311
    sub-int/2addr v4, v5

    .line 312
    iget v5, v7, La/pwc;->l:I

    .line 313
    .line 314
    sub-int/2addr v5, v3

    .line 315
    invoke-static {v4, v1, v5}, La/l1e0;->d(III)I

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    invoke-virtual {v9}, La/xk80;->k()I

    .line 320
    .line 321
    .line 322
    move-result v4

    .line 323
    if-ne v1, v4, :cond_c

    .line 324
    .line 325
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 326
    .line 327
    goto :goto_8

    .line 328
    :cond_c
    check-cast v8, La/pz40;

    .line 329
    .line 330
    invoke-interface {v8, v2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    iput-boolean v3, v7, La/pwc;->j:Z

    .line 334
    .line 335
    const/4 v2, 0x0

    .line 336
    invoke-virtual {v9, v1, v2, v7}, La/xk80;->v(IFLa/yje;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    if-ne v1, v0, :cond_d

    .line 341
    .line 342
    move-object v4, v0

    .line 343
    goto :goto_8

    .line 344
    :cond_d
    :goto_7
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 345
    .line 346
    :goto_8
    return-object v4

    .line 347
    :pswitch_2
    sget-object v10, La/wne;->a:La/wne;

    .line 348
    .line 349
    iget-boolean v0, v7, La/pwc;->j:Z

    .line 350
    .line 351
    if-eqz v0, :cond_f

    .line 352
    .line 353
    if-ne v0, v3, :cond_e

    .line 354
    .line 355
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    move-object/from16 v0, p1

    .line 359
    .line 360
    goto :goto_9

    .line 361
    :cond_e
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    goto :goto_a

    .line 365
    :cond_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    iget-object v0, v7, La/pwc;->m:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v0, La/rwc;

    .line 371
    .line 372
    iget-object v2, v0, La/rwc;->b:La/do20;

    .line 373
    .line 374
    iget v4, v7, La/pwc;->k:I

    .line 375
    .line 376
    iget-object v0, v0, La/rwc;->e:La/knf0;

    .line 377
    .line 378
    invoke-virtual {v0}, La/knf0;->c()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    move v5, v4

    .line 383
    iget v4, v7, La/pwc;->l:I

    .line 384
    .line 385
    iget-object v6, v7, La/pwc;->n:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v6, Ljava/lang/String;

    .line 388
    .line 389
    iput-boolean v3, v7, La/pwc;->j:Z

    .line 390
    .line 391
    iget-object v2, v2, La/do20;->a:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v2, La/sza;

    .line 394
    .line 395
    invoke-virtual {v2}, La/sza;->invoke()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    check-cast v2, La/et5;

    .line 400
    .line 401
    move v3, v5

    .line 402
    move-object v5, v6

    .line 403
    new-instance v6, La/fk9;

    .line 404
    .line 405
    invoke-direct {v6, v1}, La/fk9;-><init>(Z)V

    .line 406
    .line 407
    .line 408
    move v1, v3

    .line 409
    move-object v3, v0

    .line 410
    move-object v0, v2

    .line 411
    const-string v2, "application/vnd.xenvelop+json"

    .line 412
    .line 413
    invoke-interface/range {v0 .. v7}, La/et5;->f(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    if-ne v0, v10, :cond_10

    .line 418
    .line 419
    move-object v4, v10

    .line 420
    goto :goto_a

    .line 421
    :cond_10
    :goto_9
    check-cast v0, La/dx5;

    .line 422
    .line 423
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    check-cast v0, La/xvc;

    .line 428
    .line 429
    check-cast v9, Ljava/lang/String;

    .line 430
    .line 431
    check-cast v8, Ljava/lang/String;

    .line 432
    .line 433
    invoke-static {v0, v9, v8}, La/gkb;->a0(La/xvc;Ljava/lang/String;Ljava/lang/String;)La/uvc;

    .line 434
    .line 435
    .line 436
    move-result-object v4

    .line 437
    :goto_a
    return-object v4

    .line 438
    nop

    .line 439
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
