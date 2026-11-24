.class public final La/xl7;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/fm7;


# direct methods
.method public synthetic constructor <init>(La/fm7;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xl7;->i:B

    iput-object p1, p0, La/xl7;->k:La/fm7;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/xl7;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/xl7;->k:La/fm7;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/xl7;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/xl7;-><init>(La/fm7;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/xl7;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/xl7;-><init>(La/fm7;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/xl7;->i:B

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
    invoke-virtual {p0, p1, p2}, La/xl7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/xl7;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/xl7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/xl7;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/xl7;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/xl7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xl7;->i:B

    .line 4
    .line 5
    const-wide/16 v2, 0x7530

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x2

    .line 12
    iget-object v8, v0, La/xl7;->k:La/fm7;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-byte v9, v0, La/xl7;->j:B

    .line 20
    .line 21
    if-eqz v9, :cond_2

    .line 22
    .line 23
    if-eq v9, v6, :cond_1

    .line 24
    .line 25
    if-ne v9, v7, :cond_0

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-byte v6, v0, La/xl7;->j:B

    .line 43
    .line 44
    sget v4, La/fm7;->p0:I

    .line 45
    .line 46
    invoke-virtual {v8, v0}, La/fm7;->M(La/zje;)Ljava/io/Serializable;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-ne v4, v1, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    :goto_0
    sget v4, La/fm7;->p0:I

    .line 54
    .line 55
    invoke-virtual {v8}, La/fm7;->T()V

    .line 56
    .line 57
    .line 58
    sget-object v4, La/wen;->b:La/uen;

    .line 59
    .line 60
    sget-object v4, La/bfn;->d:La/bfn;

    .line 61
    .line 62
    invoke-static {v2, v3, v4}, La/ibc;->w0(JLa/bfn;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    iput-byte v7, v0, La/xl7;->j:B

    .line 67
    .line 68
    invoke-static {v2, v3, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-ne v0, v1, :cond_4

    .line 73
    .line 74
    :goto_1
    move-object v4, v1

    .line 75
    goto :goto_3

    .line 76
    :cond_4
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    :goto_3
    return-object v4

    .line 79
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 80
    .line 81
    iget-byte v9, v0, La/xl7;->j:B

    .line 82
    .line 83
    if-eqz v9, :cond_7

    .line 84
    .line 85
    if-eq v9, v6, :cond_6

    .line 86
    .line 87
    if-ne v9, v7, :cond_5

    .line 88
    .line 89
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_6

    .line 93
    :cond_5
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_7

    .line 97
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    sget v4, La/fm7;->p0:I

    .line 105
    .line 106
    iget-object v4, v8, La/i3t0;->i:La/ocj;

    .line 107
    .line 108
    iget-object v4, v4, La/ocj;->a:La/p7m0;

    .line 109
    .line 110
    :cond_8
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-object v9, v5

    .line 118
    check-cast v9, La/jk7;

    .line 119
    .line 120
    const/16 v30, 0x0

    .line 121
    .line 122
    const v31, 0x1fffffe

    .line 123
    .line 124
    .line 125
    const/4 v10, 0x1

    .line 126
    const/4 v11, 0x0

    .line 127
    const-wide/16 v12, 0x0

    .line 128
    .line 129
    const/4 v14, 0x0

    .line 130
    const/4 v15, 0x0

    .line 131
    const/16 v16, 0x0

    .line 132
    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    const/16 v18, 0x0

    .line 136
    .line 137
    const/16 v19, 0x0

    .line 138
    .line 139
    const/16 v20, 0x0

    .line 140
    .line 141
    const/16 v21, 0x0

    .line 142
    .line 143
    const/16 v22, 0x0

    .line 144
    .line 145
    const/16 v23, 0x0

    .line 146
    .line 147
    const/16 v24, 0x0

    .line 148
    .line 149
    const/16 v25, 0x0

    .line 150
    .line 151
    const/16 v26, 0x0

    .line 152
    .line 153
    const/16 v27, 0x0

    .line 154
    .line 155
    const/16 v28, 0x0

    .line 156
    .line 157
    const/16 v29, 0x0

    .line 158
    .line 159
    invoke-static/range {v9 .. v31}, La/jk7;->a(La/jk7;ZZJZLa/ql5;ZZLjava/util/List;Ljava/util/List;ZLjava/util/List;ZZLjava/util/List;Ljava/util/List;ZLjava/util/Map;ZLjava/util/HashMap;ZI)La/jk7;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    invoke-virtual {v4, v5, v9}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-eqz v5, :cond_8

    .line 168
    .line 169
    iput-byte v6, v0, La/xl7;->j:B

    .line 170
    .line 171
    invoke-virtual {v8, v0}, La/fm7;->M(La/zje;)Ljava/io/Serializable;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    if-ne v4, v1, :cond_9

    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_9
    :goto_4
    sget v4, La/fm7;->p0:I

    .line 179
    .line 180
    invoke-virtual {v8}, La/fm7;->T()V

    .line 181
    .line 182
    .line 183
    sget-object v4, La/wen;->b:La/uen;

    .line 184
    .line 185
    sget-object v4, La/bfn;->d:La/bfn;

    .line 186
    .line 187
    invoke-static {v2, v3, v4}, La/ibc;->w0(JLa/bfn;)J

    .line 188
    .line 189
    .line 190
    move-result-wide v2

    .line 191
    iput-byte v7, v0, La/xl7;->j:B

    .line 192
    .line 193
    invoke-static {v2, v3, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    if-ne v0, v1, :cond_a

    .line 198
    .line 199
    :goto_5
    move-object v4, v1

    .line 200
    goto :goto_7

    .line 201
    :cond_a
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    :goto_7
    return-object v4

    .line 204
    nop

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
