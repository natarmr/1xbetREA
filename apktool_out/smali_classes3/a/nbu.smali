.class public final La/nbu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/dn0;

.field public final b:La/j1q0;


# direct methods
.method public constructor <init>(La/dn0;La/j1q0;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, La/nbu;->a:La/dn0;

    .line 17
    iput-object p2, p0, La/nbu;->b:La/j1q0;

    return-void
.end method

.method public constructor <init>(La/j1q0;La/dn0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/nbu;->b:La/j1q0;

    .line 11
    .line 12
    iput-object p2, p0, La/nbu;->a:La/dn0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/lang/String;ZLa/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p4, La/mbu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/mbu;

    .line 7
    .line 8
    iget v1, v0, La/mbu;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/mbu;->l:I

    .line 18
    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/mbu;

    .line 22
    .line 23
    invoke-direct {v0, p0, p4}, La/mbu;-><init>(La/nbu;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p4, v7, La/mbu;->j:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v7, La/mbu;->l:I

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    const/16 v8, 0xa

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    iget-object p1, v7, La/mbu;->i:Ljava/util/List;

    .line 41
    .line 42
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    invoke-static {p4}, La/twn;->t(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_5

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    move-object v4, v3

    .line 73
    check-cast v4, La/mlr;

    .line 74
    .line 75
    iget-object v5, v4, La/mlr;->e:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v5}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-nez v5, :cond_4

    .line 82
    .line 83
    iget-object v4, v4, La/mlr;->g:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v4}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_3

    .line 90
    .line 91
    :cond_4
    invoke-virtual {p4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-static {p4, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p4

    .line 108
    :goto_3
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_6

    .line 113
    .line 114
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    check-cast v3, La/mlr;

    .line 119
    .line 120
    iget-wide v3, v3, La/mlr;->a:J

    .line 121
    .line 122
    invoke-static {v3, v4, v1}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 127
    .line 128
    .line 129
    move-result-object p4

    .line 130
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_7

    .line 135
    .line 136
    return-object p1

    .line 137
    :cond_7
    iget-object v1, p0, La/nbu;->b:La/j1q0;

    .line 138
    .line 139
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 140
    .line 141
    invoke-virtual {v1}, La/m1q0;->a()Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    iput-object p1, v7, La/mbu;->i:Ljava/util/List;

    .line 146
    .line 147
    iput v2, v7, La/mbu;->l:I

    .line 148
    .line 149
    const/4 v6, 0x0

    .line 150
    iget-object v1, p0, La/nbu;->a:La/dn0;

    .line 151
    .line 152
    move-object v4, p2

    .line 153
    move v5, p3

    .line 154
    move-object v2, p4

    .line 155
    invoke-virtual/range {v1 .. v7}, La/dn0;->d(Ljava/util/Set;ZLjava/lang/String;ZZLa/zje;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p4

    .line 159
    if-ne p4, v0, :cond_8

    .line 160
    .line 161
    return-object v0

    .line 162
    :cond_8
    :goto_4
    check-cast p4, Ljava/lang/Iterable;

    .line 163
    .line 164
    invoke-static {p4, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    invoke-static {p0}, La/wp20;->a(I)I

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    const/16 p2, 0x10

    .line 173
    .line 174
    if-ge p0, p2, :cond_9

    .line 175
    .line 176
    move p0, p2

    .line 177
    :cond_9
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 178
    .line 179
    invoke-direct {p2, p0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 180
    .line 181
    .line 182
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result p3

    .line 190
    if-eqz p3, :cond_a

    .line 191
    .line 192
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p3

    .line 196
    move-object p4, p3

    .line 197
    check-cast p4, La/mlr;

    .line 198
    .line 199
    iget-wide v0, p4, La/mlr;->a:J

    .line 200
    .line 201
    new-instance p4, Ljava/lang/Long;

    .line 202
    .line 203
    invoke-direct {p4, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 204
    .line 205
    .line 206
    invoke-interface {p2, p4, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_a
    new-instance p0, Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-static {p1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 213
    .line 214
    .line 215
    move-result p3

    .line 216
    invoke-direct {p0, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 217
    .line 218
    .line 219
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result p3

    .line 227
    if-eqz p3, :cond_c

    .line 228
    .line 229
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p3

    .line 233
    check-cast p3, La/mlr;

    .line 234
    .line 235
    iget-wide v0, p3, La/mlr;->a:J

    .line 236
    .line 237
    new-instance p4, Ljava/lang/Long;

    .line 238
    .line 239
    invoke-direct {p4, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p2, p4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p4

    .line 246
    check-cast p4, La/mlr;

    .line 247
    .line 248
    if-nez p4, :cond_b

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_b
    move-object p3, p4

    .line 252
    :goto_7
    invoke-virtual {p0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_c
    return-object p0
.end method
