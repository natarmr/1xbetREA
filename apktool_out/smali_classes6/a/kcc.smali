.class public final La/kcc;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:La/xcz;

.field public final synthetic k:I

.field public final synthetic l:La/w6k;

.field public final synthetic m:I

.field public final synthetic n:Z

.field public final synthetic o:La/hh80;

.field public final synthetic p:La/k6z;


# direct methods
.method public constructor <init>(La/xcz;ILa/w6k;IZLa/hh80;La/k6z;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/kcc;->j:La/xcz;

    .line 2
    .line 3
    iput p2, p0, La/kcc;->k:I

    .line 4
    .line 5
    iput-object p3, p0, La/kcc;->l:La/w6k;

    .line 6
    .line 7
    iput p4, p0, La/kcc;->m:I

    .line 8
    .line 9
    iput-boolean p5, p0, La/kcc;->n:Z

    .line 10
    .line 11
    iput-object p6, p0, La/kcc;->o:La/hh80;

    .line 12
    .line 13
    iput-object p7, p0, La/kcc;->p:La/k6z;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    new-instance v0, La/kcc;

    .line 2
    .line 3
    iget-object v6, p0, La/kcc;->o:La/hh80;

    .line 4
    .line 5
    iget-object v7, p0, La/kcc;->p:La/k6z;

    .line 6
    .line 7
    iget-object v1, p0, La/kcc;->j:La/xcz;

    .line 8
    .line 9
    iget v2, p0, La/kcc;->k:I

    .line 10
    .line 11
    iget-object v3, p0, La/kcc;->l:La/w6k;

    .line 12
    .line 13
    iget v4, p0, La/kcc;->m:I

    .line 14
    .line 15
    iget-boolean v5, p0, La/kcc;->n:Z

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, La/kcc;-><init>(La/xcz;ILa/w6k;IZLa/hh80;La/k6z;La/yje;)V

    .line 19
    .line 20
    .line 21
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
    invoke-virtual {p0, p1, p2}, La/kcc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/kcc;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/kcc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, p0, La/kcc;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget v3, p0, La/kcc;->k:I

    .line 7
    .line 8
    const/4 v4, 0x4

    .line 9
    const/4 v5, 0x3

    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x2

    .line 12
    const/4 v8, 0x0

    .line 13
    iget-object v9, p0, La/kcc;->j:La/xcz;

    .line 14
    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    if-eq v1, v6, :cond_2

    .line 18
    .line 19
    if-eq v1, v7, :cond_1

    .line 20
    .line 21
    if-eq v1, v5, :cond_1

    .line 22
    .line 23
    if-ne v1, v4, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v8

    .line 32
    :cond_1
    :goto_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_4

    .line 36
    .line 37
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v9}, La/xcz;->d()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_4

    .line 49
    .line 50
    invoke-virtual {v9}, La/xcz;->c()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_4

    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_4
    invoke-virtual {v9}, La/xcz;->j()La/mcz;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object p1, p1, La/mcz;->l:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_6

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    move-object v10, v1

    .line 80
    check-cast v10, La/ncz;

    .line 81
    .line 82
    iget v10, v10, La/ncz;->a:I

    .line 83
    .line 84
    if-ne v10, v3, :cond_5

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_6
    move-object v1, v8

    .line 88
    :goto_1
    check-cast v1, La/ncz;

    .line 89
    .line 90
    if-nez v1, :cond_a

    .line 91
    .line 92
    iput-byte v6, p0, La/kcc;->i:B

    .line 93
    .line 94
    invoke-virtual {v9, v3, v2, p0}, La/xcz;->l(IILa/yje;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-ne p1, v0, :cond_7

    .line 99
    .line 100
    goto/16 :goto_3

    .line 101
    .line 102
    :cond_7
    :goto_2
    invoke-virtual {v9}, La/xcz;->j()La/mcz;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iget-object p1, p1, La/mcz;->l:Ljava/util/List;

    .line 107
    .line 108
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_9

    .line 117
    .line 118
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    move-object v6, v1

    .line 123
    check-cast v6, La/ncz;

    .line 124
    .line 125
    iget v6, v6, La/ncz;->a:I

    .line 126
    .line 127
    if-ne v6, v3, :cond_8

    .line 128
    .line 129
    move-object v8, v1

    .line 130
    :cond_9
    move-object v1, v8

    .line 131
    check-cast v1, La/ncz;

    .line 132
    .line 133
    if-nez v1, :cond_a

    .line 134
    .line 135
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object p0

    .line 138
    :cond_a
    iget p1, v1, La/ncz;->q:I

    .line 139
    .line 140
    iget-object v6, p0, La/kcc;->o:La/hh80;

    .line 141
    .line 142
    iget-object v8, p0, La/kcc;->p:La/k6z;

    .line 143
    .line 144
    invoke-static {v6, v8}, La/s5x0;->B(La/hh80;La/k6z;)F

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    iget-object v8, p0, La/kcc;->l:La/w6k;

    .line 149
    .line 150
    invoke-interface {v8, v6}, La/w6k;->T(F)I

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    iget v8, p0, La/kcc;->m:I

    .line 155
    .line 156
    div-int/2addr v8, v7

    .line 157
    iget v10, v1, La/ncz;->p:I

    .line 158
    .line 159
    div-int/lit8 v11, p1, 0x2

    .line 160
    .line 161
    add-int/2addr v11, v10

    .line 162
    sub-int/2addr v11, v8

    .line 163
    add-int/2addr v11, v6

    .line 164
    if-nez v3, :cond_b

    .line 165
    .line 166
    iput-byte v7, p0, La/kcc;->i:B

    .line 167
    .line 168
    sget-object p1, La/xcz;->y:La/v0h0;

    .line 169
    .line 170
    invoke-virtual {v9, v3, v2, p0}, La/xcz;->f(IILa/yje;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    if-ne p0, v0, :cond_d

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_b
    iget-boolean v2, p0, La/kcc;->n:Z

    .line 178
    .line 179
    if-eqz v2, :cond_c

    .line 180
    .line 181
    invoke-virtual {v9}, La/xcz;->j()La/mcz;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    iget v3, v2, La/mcz;->n:I

    .line 186
    .line 187
    iget v2, v2, La/mcz;->r:I

    .line 188
    .line 189
    sub-int/2addr v3, v2

    .line 190
    iget v1, v1, La/ncz;->p:I

    .line 191
    .line 192
    add-int/2addr v1, p1

    .line 193
    sub-int/2addr v1, v3

    .line 194
    int-to-float p1, v1

    .line 195
    sget-object v1, La/lcc;->a:La/uts0;

    .line 196
    .line 197
    iput-byte v5, p0, La/kcc;->i:B

    .line 198
    .line 199
    invoke-static {v9, p1, v1, p0}, La/bww;->x(La/bch0;FLa/j73;La/yje;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    if-ne p0, v0, :cond_d

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_c
    if-eqz v11, :cond_d

    .line 207
    .line 208
    int-to-float p1, v11

    .line 209
    sget-object v1, La/lcc;->a:La/uts0;

    .line 210
    .line 211
    iput-byte v4, p0, La/kcc;->i:B

    .line 212
    .line 213
    invoke-static {v9, p1, v1, p0}, La/bww;->x(La/bch0;FLa/j73;La/yje;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    if-ne p0, v0, :cond_d

    .line 218
    .line 219
    :goto_3
    return-object v0

    .line 220
    :cond_d
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object p0
.end method
