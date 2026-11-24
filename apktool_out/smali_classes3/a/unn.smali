.class public final La/unn;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/wnn;


# direct methods
.method public synthetic constructor <init>(La/wnn;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/unn;->i:B

    iput-object p1, p0, La/unn;->k:La/wnn;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/unn;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/unn;->k:La/wnn;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/unn;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/unn;-><init>(La/wnn;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/unn;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/unn;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/unn;-><init>(La/wnn;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/unn;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/unn;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/en7;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/unn;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/unn;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/unn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/q4f;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/unn;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/unn;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/unn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
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
    iget-byte v1, v0, La/unn;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/unn;->k:La/wnn;

    .line 6
    .line 7
    iget-object v0, v0, La/unn;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v12, v0

    .line 13
    check-cast v12, La/en7;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget v0, La/wnn;->g0:I

    .line 21
    .line 22
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 23
    .line 24
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object v3, v0

    .line 34
    check-cast v3, La/inn;

    .line 35
    .line 36
    const/4 v15, 0x0

    .line 37
    const/16 v16, 0x77ff

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v9, 0x0

    .line 45
    const/4 v10, 0x0

    .line 46
    const/4 v11, 0x0

    .line 47
    const-wide/16 v13, 0x0

    .line 48
    .line 49
    invoke-static/range {v3 .. v16}, La/inn;->a(La/inn;La/q4f;ZLjava/util/List;La/amn;La/v0f;La/nnn;ZZLa/en7;JZI)La/inn;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_0
    move-object v4, v0

    .line 63
    check-cast v4, La/q4f;

    .line 64
    .line 65
    sget-object v0, La/wne;->a:La/wne;

    .line 66
    .line 67
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, v2, La/wnn;->x:La/ag3;

    .line 71
    .line 72
    invoke-static {v4}, La/lgb;->R(La/q4f;)F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    iget-object v3, v2, La/wnn;->E:La/ocl;

    .line 77
    .line 78
    iget-object v5, v3, La/ocl;->a:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v5, La/vqc;

    .line 81
    .line 82
    invoke-virtual {v5}, La/vqc;->d()La/v0f;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    iget-object v5, v5, La/v0f;->a:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iget-object v0, v0, La/ag3;->a:La/kt2;

    .line 95
    .line 96
    new-instance v6, Lkotlin/Pair;

    .line 97
    .line 98
    const-string v7, "coupon_id"

    .line 99
    .line 100
    invoke-direct {v6, v7, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    new-instance v5, Lkotlin/Pair;

    .line 108
    .line 109
    const-string v7, "bet_type"

    .line 110
    .line 111
    invoke-direct {v5, v7, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    filled-new-array {v6, v5}, [Lkotlin/Pair;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-static {v1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    const-string v5, "coupon_edit_change_type"

    .line 123
    .line 124
    invoke-interface {v0, v5, v1}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 125
    .line 126
    .line 127
    iget-object v0, v2, La/wnn;->y:La/ik4;

    .line 128
    .line 129
    iget-object v1, v3, La/ocl;->a:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, La/vqc;

    .line 132
    .line 133
    invoke-virtual {v1}, La/vqc;->d()La/v0f;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iget-object v1, v1, La/v0f;->a:Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {v4}, La/lgb;->R(La/q4f;)F

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    iget-object v0, v0, La/ik4;->a:La/s1p;

    .line 150
    .line 151
    new-instance v5, La/j1p;

    .line 152
    .line 153
    const/4 v6, 0x0

    .line 154
    invoke-direct {v5, v1, v6}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 155
    .line 156
    .line 157
    new-instance v1, La/h1p;

    .line 158
    .line 159
    invoke-direct {v1, v3, v6}, La/h1p;-><init>(FB)V

    .line 160
    .line 161
    .line 162
    const/4 v3, 0x2

    .line 163
    new-array v3, v3, [La/k1p;

    .line 164
    .line 165
    aput-object v5, v3, v6

    .line 166
    .line 167
    const/4 v5, 0x1

    .line 168
    aput-object v1, v3, v5

    .line 169
    .line 170
    invoke-static {v3}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    const-wide/16 v5, 0xc94

    .line 175
    .line 176
    invoke-virtual {v0, v1, v5, v6}, La/s1p;->a(Ljava/util/Set;J)V

    .line 177
    .line 178
    .line 179
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 180
    .line 181
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 182
    .line 183
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-object v3, v1

    .line 191
    check-cast v3, La/inn;

    .line 192
    .line 193
    const/4 v15, 0x0

    .line 194
    const/16 v16, 0x7ffe

    .line 195
    .line 196
    const/4 v5, 0x0

    .line 197
    const/4 v6, 0x0

    .line 198
    const/4 v7, 0x0

    .line 199
    const/4 v8, 0x0

    .line 200
    const/4 v9, 0x0

    .line 201
    const/4 v10, 0x0

    .line 202
    const/4 v11, 0x0

    .line 203
    const/4 v12, 0x0

    .line 204
    const-wide/16 v13, 0x0

    .line 205
    .line 206
    invoke-static/range {v3 .. v16}, La/inn;->a(La/inn;La/q4f;ZLjava/util/List;La/amn;La/v0f;La/nnn;ZZLa/en7;JZI)La/inn;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-eqz v1, :cond_1

    .line 215
    .line 216
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object v0

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
