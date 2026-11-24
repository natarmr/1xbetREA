.class public final La/v9f0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:I

.field public j:I

.field public k:I

.field public l:B

.field public final synthetic m:La/y9f0;

.field public final synthetic n:La/xcz;

.field public final synthetic o:La/rv2;

.field public final synthetic p:La/u0f0;

.field public final synthetic q:La/pz40;


# direct methods
.method public constructor <init>(La/y9f0;La/xcz;La/rv2;La/u0f0;La/pz40;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/v9f0;->m:La/y9f0;

    .line 2
    .line 3
    iput-object p2, p0, La/v9f0;->n:La/xcz;

    .line 4
    .line 5
    iput-object p3, p0, La/v9f0;->o:La/rv2;

    .line 6
    .line 7
    iput-object p4, p0, La/v9f0;->p:La/u0f0;

    .line 8
    .line 9
    iput-object p5, p0, La/v9f0;->q:La/pz40;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/v9f0;

    .line 2
    .line 3
    iget-object v4, p0, La/v9f0;->p:La/u0f0;

    .line 4
    .line 5
    iget-object v5, p0, La/v9f0;->q:La/pz40;

    .line 6
    .line 7
    iget-object v1, p0, La/v9f0;->m:La/y9f0;

    .line 8
    .line 9
    iget-object v2, p0, La/v9f0;->n:La/xcz;

    .line 10
    .line 11
    iget-object v3, p0, La/v9f0;->o:La/rv2;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/v9f0;-><init>(La/y9f0;La/xcz;La/rv2;La/u0f0;La/pz40;La/yje;)V

    .line 15
    .line 16
    .line 17
    return-object v0
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
    invoke-virtual {p0, p1, p2}, La/v9f0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/v9f0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/v9f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/v9f0;->l:B

    .line 4
    .line 5
    iget-object v2, p0, La/v9f0;->n:La/xcz;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v4, :cond_1

    .line 13
    .line 14
    if-ne v1, v3, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v5

    .line 27
    :cond_1
    iget v1, p0, La/v9f0;->k:I

    .line 28
    .line 29
    iget v4, p0, La/v9f0;->j:I

    .line 30
    .line 31
    iget v5, p0, La/v9f0;->i:I

    .line 32
    .line 33
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, La/v9f0;->m:La/y9f0;

    .line 42
    .line 43
    iget-object p1, p1, La/y9f0;->c:La/a4x;

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const/4 v1, 0x0

    .line 50
    move v6, v1

    .line 51
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    const/4 v8, -0x1

    .line 56
    if-eqz v7, :cond_4

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    check-cast v7, La/x0f0;

    .line 63
    .line 64
    invoke-interface {v7}, La/x0f0;->q()La/u0f0;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    iget-object v9, p0, La/v9f0;->p:La/u0f0;

    .line 69
    .line 70
    if-ne v7, v9, :cond_3

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    move v6, v8

    .line 77
    :goto_1
    if-eq v6, v8, :cond_c

    .line 78
    .line 79
    invoke-virtual {v2}, La/xcz;->j()La/mcz;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object v7, p1, La/mcz;->l:Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    :cond_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    if-eqz v10, :cond_6

    .line 94
    .line 95
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    move-object v11, v10

    .line 100
    check-cast v11, La/ncz;

    .line 101
    .line 102
    iget v11, v11, La/ncz;->a:I

    .line 103
    .line 104
    if-ne v11, v6, :cond_5

    .line 105
    .line 106
    move-object v5, v10

    .line 107
    :cond_6
    check-cast v5, La/ncz;

    .line 108
    .line 109
    if-eqz v5, :cond_7

    .line 110
    .line 111
    iget v9, v5, La/ncz;->p:I

    .line 112
    .line 113
    iget v10, p1, La/mcz;->m:I

    .line 114
    .line 115
    if-lt v9, v10, :cond_7

    .line 116
    .line 117
    iget v5, v5, La/ncz;->q:I

    .line 118
    .line 119
    add-int/2addr v9, v5

    .line 120
    iget p1, p1, La/mcz;->n:I

    .line 121
    .line 122
    if-gt v9, p1, :cond_7

    .line 123
    .line 124
    move p1, v4

    .line 125
    goto :goto_2

    .line 126
    :cond_7
    move p1, v1

    .line 127
    :goto_2
    if-nez p1, :cond_9

    .line 128
    .line 129
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    check-cast v5, La/ncz;

    .line 134
    .line 135
    if-eqz v5, :cond_8

    .line 136
    .line 137
    iget v8, v5, La/ncz;->a:I

    .line 138
    .line 139
    :cond_8
    if-gt v8, v6, :cond_9

    .line 140
    .line 141
    move v1, v4

    .line 142
    :cond_9
    if-eqz v1, :cond_b

    .line 143
    .line 144
    sget-object v5, La/ot2;->b:La/ot2;

    .line 145
    .line 146
    iput v6, p0, La/v9f0;->i:I

    .line 147
    .line 148
    iput p1, p0, La/v9f0;->j:I

    .line 149
    .line 150
    iput v1, p0, La/v9f0;->k:I

    .line 151
    .line 152
    iput-byte v4, p0, La/v9f0;->l:B

    .line 153
    .line 154
    sget-object v4, La/nu2;->a:La/uts0;

    .line 155
    .line 156
    iget-object v7, p0, La/v9f0;->o:La/rv2;

    .line 157
    .line 158
    invoke-static {v7, v5, v4, p0}, La/dv2;->c(La/rv2;Ljava/lang/Object;La/uts0;La/yje;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    if-ne v4, v0, :cond_a

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_a
    move v4, p1

    .line 166
    move v5, v6

    .line 167
    :goto_3
    move p1, v4

    .line 168
    move v6, v5

    .line 169
    :cond_b
    invoke-virtual {v2}, La/xcz;->j()La/mcz;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-virtual {v4}, La/mcz;->h()J

    .line 174
    .line 175
    .line 176
    move-result-wide v4

    .line 177
    const-wide v7, 0xffffffffL

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    and-long/2addr v4, v7

    .line 183
    long-to-int v4, v4

    .line 184
    neg-int v4, v4

    .line 185
    div-int/2addr v4, v3

    .line 186
    iput v6, p0, La/v9f0;->i:I

    .line 187
    .line 188
    iput p1, p0, La/v9f0;->j:I

    .line 189
    .line 190
    iput v1, p0, La/v9f0;->k:I

    .line 191
    .line 192
    iput-byte v3, p0, La/v9f0;->l:B

    .line 193
    .line 194
    invoke-virtual {v2, v6, v4, p0}, La/xcz;->f(IILa/yje;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    if-ne p1, v0, :cond_c

    .line 199
    .line 200
    :goto_4
    return-object v0

    .line 201
    :cond_c
    :goto_5
    iget-object p0, p0, La/v9f0;->q:La/pz40;

    .line 202
    .line 203
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 208
    .line 209
    sget-object p1, La/l8f0;->a:La/l8f0;

    .line 210
    .line 211
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object p0
.end method
