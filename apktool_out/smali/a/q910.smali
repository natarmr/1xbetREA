.class public final La/q910;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Z

.field public final synthetic j:La/u910;

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:Z

.field public final synthetic n:F

.field public final synthetic o:La/fa10;

.field public final synthetic p:F

.field public final synthetic q:Z

.field public final synthetic r:La/ea10;


# direct methods
.method public constructor <init>(La/u910;IIZFLa/fa10;FZLa/ea10;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/q910;->j:La/u910;

    .line 2
    .line 3
    iput p2, p0, La/q910;->k:I

    .line 4
    .line 5
    iput p3, p0, La/q910;->l:I

    .line 6
    .line 7
    iput-boolean p4, p0, La/q910;->m:Z

    .line 8
    .line 9
    iput p5, p0, La/q910;->n:F

    .line 10
    .line 11
    iput-object p6, p0, La/q910;->o:La/fa10;

    .line 12
    .line 13
    iput p7, p0, La/q910;->p:F

    .line 14
    .line 15
    iput-boolean p8, p0, La/q910;->q:Z

    .line 16
    .line 17
    iput-object p9, p0, La/q910;->r:La/ea10;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-direct {p0, p1, p10}, La/bnn0;-><init>(ILa/yje;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 11

    .line 1
    new-instance v0, La/q910;

    .line 2
    .line 3
    iget-boolean v8, p0, La/q910;->q:Z

    .line 4
    .line 5
    iget-object v9, p0, La/q910;->r:La/ea10;

    .line 6
    .line 7
    iget-object v1, p0, La/q910;->j:La/u910;

    .line 8
    .line 9
    iget v2, p0, La/q910;->k:I

    .line 10
    .line 11
    iget v3, p0, La/q910;->l:I

    .line 12
    .line 13
    iget-boolean v4, p0, La/q910;->m:Z

    .line 14
    .line 15
    iget v5, p0, La/q910;->n:F

    .line 16
    .line 17
    iget-object v6, p0, La/q910;->o:La/fa10;

    .line 18
    .line 19
    iget v7, p0, La/q910;->p:F

    .line 20
    .line 21
    move-object v10, p1

    .line 22
    invoke-direct/range {v0 .. v10}, La/q910;-><init>(La/u910;IIZFLa/fa10;FZLa/ea10;La/yje;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/q910;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/q910;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/q910;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/q910;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v10, p0, La/q910;->j:La/u910;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v4, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :catchall_0
    move-exception v0

    .line 20
    move-object p0, v0

    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v2

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget p1, p0, La/q910;->k:I

    .line 33
    .line 34
    invoke-virtual {v10, p1}, La/u910;->i(I)V

    .line 35
    .line 36
    .line 37
    iget-object p1, v10, La/u910;->c:La/pz40;

    .line 38
    .line 39
    iget v1, p0, La/q910;->l:I

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    check-cast p1, La/hgk0;

    .line 46
    .line 47
    invoke-virtual {p1, v5}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, v10, La/u910;->d:La/pz40;

    .line 51
    .line 52
    iget-boolean v5, p0, La/q910;->m:Z

    .line 53
    .line 54
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast p1, La/hgk0;

    .line 59
    .line 60
    invoke-virtual {p1, v5}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, v10, La/u910;->f:La/pz40;

    .line 64
    .line 65
    iget v5, p0, La/q910;->n:F

    .line 66
    .line 67
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    check-cast p1, La/hgk0;

    .line 72
    .line 73
    invoke-virtual {p1, v6}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, v10, La/u910;->e:La/pz40;

    .line 77
    .line 78
    check-cast p1, La/hgk0;

    .line 79
    .line 80
    invoke-virtual {p1, v2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, v10, La/u910;->i:La/pz40;

    .line 84
    .line 85
    check-cast p1, La/hgk0;

    .line 86
    .line 87
    iget-object v2, p0, La/q910;->o:La/fa10;

    .line 88
    .line 89
    invoke-virtual {p1, v2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget p1, p0, La/q910;->p:F

    .line 93
    .line 94
    invoke-virtual {v10, p1}, La/u910;->k(F)V

    .line 95
    .line 96
    .line 97
    iget-object p1, v10, La/u910;->g:La/pz40;

    .line 98
    .line 99
    iget-boolean v6, p0, La/q910;->q:Z

    .line 100
    .line 101
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    check-cast p1, La/hgk0;

    .line 106
    .line 107
    invoke-virtual {p1, v6}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-object p1, v10, La/u910;->l:La/pz40;

    .line 111
    .line 112
    const-wide/high16 v6, -0x8000000000000000L

    .line 113
    .line 114
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    check-cast p1, La/hgk0;

    .line 119
    .line 120
    invoke-virtual {p1, v6}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    if-nez v2, :cond_2

    .line 124
    .line 125
    invoke-virtual {v10, v3}, La/u910;->j(Z)V

    .line 126
    .line 127
    .line 128
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object p0

    .line 131
    :cond_2
    invoke-static {v5}, Ljava/lang/Float;->isInfinite(F)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-eqz p1, :cond_3

    .line 136
    .line 137
    iget-object p0, v10, La/u910;->m:La/zbk;

    .line 138
    .line 139
    invoke-virtual {p0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    check-cast p0, Ljava/lang/Number;

    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    invoke-virtual {v10, p0}, La/u910;->k(F)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v10, v3}, La/u910;->j(Z)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v10, v1}, La/u910;->i(I)V

    .line 156
    .line 157
    .line 158
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object p0

    .line 161
    :cond_3
    invoke-virtual {v10, v4}, La/u910;->j(Z)V

    .line 162
    .line 163
    .line 164
    :try_start_1
    iget-object p1, p0, La/q910;->r:La/ea10;

    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-eqz p1, :cond_5

    .line 171
    .line 172
    if-ne p1, v4, :cond_4

    .line 173
    .line 174
    sget-object p1, La/z560;->b:La/z560;

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_4
    new-instance p0, La/m460;

    .line 178
    .line 179
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 180
    .line 181
    .line 182
    throw p0

    .line 183
    :cond_5
    sget-object p1, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 184
    .line 185
    :goto_0
    invoke-interface {p0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-static {v1}, La/zvw;->R(Lkotlin/coroutines/CoroutineContext;)La/bby;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    new-instance v5, La/p910;

    .line 194
    .line 195
    iget-object v6, p0, La/q910;->r:La/ea10;

    .line 196
    .line 197
    iget v8, p0, La/q910;->l:I

    .line 198
    .line 199
    iget v9, p0, La/q910;->k:I

    .line 200
    .line 201
    const/4 v11, 0x0

    .line 202
    invoke-direct/range {v5 .. v11}, La/p910;-><init>(La/ea10;La/bby;IILa/u910;La/yje;)V

    .line 203
    .line 204
    .line 205
    iput-boolean v4, p0, La/q910;->i:Z

    .line 206
    .line 207
    invoke-static {p1, v5, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    if-ne p1, v0, :cond_6

    .line 212
    .line 213
    return-object v0

    .line 214
    :cond_6
    :goto_1
    invoke-interface {p0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-static {p0}, La/zvw;->O(Lkotlin/coroutines/CoroutineContext;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 219
    .line 220
    .line 221
    invoke-virtual {v10, v3}, La/u910;->j(Z)V

    .line 222
    .line 223
    .line 224
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    return-object p0

    .line 227
    :goto_2
    invoke-virtual {v10, v3}, La/u910;->j(Z)V

    .line 228
    .line 229
    .line 230
    throw p0
.end method
