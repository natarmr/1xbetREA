.class public final La/n7f;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/r7f;

.field public j:La/q4f;

.field public k:Z

.field public l:B

.field public final synthetic m:La/r7f;

.field public final synthetic n:I

.field public final synthetic o:Z


# direct methods
.method public constructor <init>(La/r7f;IZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/n7f;->m:La/r7f;

    .line 2
    .line 3
    iput p2, p0, La/n7f;->n:I

    .line 4
    .line 5
    iput-boolean p3, p0, La/n7f;->o:Z

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance p1, La/n7f;

    .line 2
    .line 3
    iget v0, p0, La/n7f;->n:I

    .line 4
    .line 5
    iget-boolean v1, p0, La/n7f;->o:Z

    .line 6
    .line 7
    iget-object p0, p0, La/n7f;->m:La/r7f;

    .line 8
    .line 9
    invoke-direct {p1, p0, v0, v1, p2}, La/n7f;-><init>(La/r7f;IZLa/yje;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/n7f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/n7f;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/n7f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, La/n7f;->m:La/r7f;

    .line 2
    .line 3
    iget-object v1, v0, La/r7f;->i:La/j9c;

    .line 4
    .line 5
    sget-object v2, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v3, p0, La/n7f;->l:B

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x3

    .line 11
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    if-eqz v3, :cond_3

    .line 15
    .line 16
    if-eq v3, v7, :cond_2

    .line 17
    .line 18
    if-eq v3, v6, :cond_1

    .line 19
    .line 20
    if-ne v3, v5, :cond_0

    .line 21
    .line 22
    iget-boolean v0, p0, La/n7f;->k:Z

    .line 23
    .line 24
    iget-object p0, p0, La/n7f;->i:La/r7f;

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_4

    .line 30
    .line 31
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v4

    .line 37
    :cond_1
    iget-boolean v0, p0, La/n7f;->k:Z

    .line 38
    .line 39
    iget-object v1, p0, La/n7f;->j:La/q4f;

    .line 40
    .line 41
    iget-object v3, p0, La/n7f;->i:La/r7f;

    .line 42
    .line 43
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move-object v13, v3

    .line 47
    move v3, v0

    .line 48
    move-object v0, v13

    .line 49
    goto/16 :goto_2

    .line 50
    .line 51
    :cond_2
    iget-boolean v0, p0, La/n7f;->k:Z

    .line 52
    .line 53
    iget-object v1, p0, La/n7f;->j:La/q4f;

    .line 54
    .line 55
    iget-object v3, p0, La/n7f;->i:La/r7f;

    .line 56
    .line 57
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object v13, v3

    .line 61
    move v3, v0

    .line 62
    move-object v0, v13

    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, La/r7f;->I()Ljava/util/ArrayList;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget v3, p0, La/n7f;->n:I

    .line 73
    .line 74
    invoke-static {v3, p1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, La/q4f;

    .line 79
    .line 80
    if-eqz p1, :cond_a

    .line 81
    .line 82
    invoke-virtual {v1}, La/j9c;->a()La/q4f;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    if-ne p1, v9, :cond_4

    .line 87
    .line 88
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_4
    iget-object v9, v0, La/r7f;->I0:La/qu;

    .line 92
    .line 93
    invoke-static {p1}, La/lgb;->R(La/q4f;)F

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    iget-object v9, v9, La/qu;->a:La/kt2;

    .line 98
    .line 99
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    new-instance v11, Lkotlin/Pair;

    .line 104
    .line 105
    const-string v12, "bet_type"

    .line 106
    .line 107
    invoke-direct {v11, v12, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v11}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    const-string v11, "coupon_type_bet"

    .line 115
    .line 116
    invoke-interface {v9, v11, v10}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 117
    .line 118
    .line 119
    iget-object v9, v0, La/r7f;->K0:La/x20;

    .line 120
    .line 121
    invoke-static {p1}, La/lgb;->R(La/q4f;)F

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    iget-object v9, v9, La/x20;->a:La/s1p;

    .line 126
    .line 127
    new-instance v11, La/h1p;

    .line 128
    .line 129
    invoke-direct {v11, v10, v8}, La/h1p;-><init>(FB)V

    .line 130
    .line 131
    .line 132
    invoke-static {v11}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    const-wide/16 v11, 0xc89

    .line 137
    .line 138
    invoke-virtual {v9, v10, v11, v12}, La/s1p;->a(Ljava/util/Set;J)V

    .line 139
    .line 140
    .line 141
    iget-object v9, v0, La/r7f;->c0:La/mpc;

    .line 142
    .line 143
    invoke-virtual {v9}, La/mpc;->a()I

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    if-eq v3, v9, :cond_5

    .line 148
    .line 149
    iget-object v3, v0, La/r7f;->b0:La/ni9;

    .line 150
    .line 151
    invoke-virtual {v3}, La/ni9;->b()V

    .line 152
    .line 153
    .line 154
    :cond_5
    invoke-virtual {v1}, La/j9c;->a()La/q4f;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    iget-boolean v3, p0, La/n7f;->o:Z

    .line 159
    .line 160
    if-ne p1, v1, :cond_7

    .line 161
    .line 162
    iget-object v1, v0, La/r7f;->W1:La/p7m0;

    .line 163
    .line 164
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    check-cast v1, La/n9h0;

    .line 169
    .line 170
    iget-boolean v1, v1, La/n9h0;->g:Z

    .line 171
    .line 172
    if-nez v1, :cond_6

    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_6
    move-object v1, p1

    .line 176
    goto :goto_1

    .line 177
    :cond_7
    :goto_0
    iget-object v1, v0, La/r7f;->u:La/ipc;

    .line 178
    .line 179
    iput-object v0, p0, La/n7f;->i:La/r7f;

    .line 180
    .line 181
    iput-object p1, p0, La/n7f;->j:La/q4f;

    .line 182
    .line 183
    iput-boolean v3, p0, La/n7f;->k:Z

    .line 184
    .line 185
    iput-byte v7, p0, La/n7f;->l:B

    .line 186
    .line 187
    invoke-virtual {v1, p0}, La/ipc;->b(La/zje;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    if-ne v1, v2, :cond_6

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :goto_1
    iget-object p1, v0, La/r7f;->v:La/vit0;

    .line 195
    .line 196
    iput-object v0, p0, La/n7f;->i:La/r7f;

    .line 197
    .line 198
    iput-object v1, p0, La/n7f;->j:La/q4f;

    .line 199
    .line 200
    iput-boolean v3, p0, La/n7f;->k:Z

    .line 201
    .line 202
    iput-byte v6, p0, La/n7f;->l:B

    .line 203
    .line 204
    invoke-virtual {p1, v1, p0}, La/vit0;->g(La/q4f;La/zje;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    if-ne p1, v2, :cond_8

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_8
    :goto_2
    iput-object v0, p0, La/n7f;->i:La/r7f;

    .line 212
    .line 213
    iput-object v4, p0, La/n7f;->j:La/q4f;

    .line 214
    .line 215
    iput-boolean v3, p0, La/n7f;->k:Z

    .line 216
    .line 217
    iput-byte v5, p0, La/n7f;->l:B

    .line 218
    .line 219
    invoke-virtual {v0, v1, v8, p0}, La/r7f;->z(La/q4f;ZLa/zje;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    if-ne p0, v2, :cond_9

    .line 224
    .line 225
    :goto_3
    return-object v2

    .line 226
    :cond_9
    move-object p0, v0

    .line 227
    move v0, v3

    .line 228
    :goto_4
    new-instance p1, La/rd7;

    .line 229
    .line 230
    const/4 v1, 0x6

    .line 231
    invoke-direct {p1, p0, v0, v1}, La/rd7;-><init>(Ljava/lang/Object;ZB)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0, v8, v8, p1}, La/r7f;->h0(ZZLkotlin/jvm/functions/Function0;)V

    .line 235
    .line 236
    .line 237
    :cond_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    return-object p0
.end method
