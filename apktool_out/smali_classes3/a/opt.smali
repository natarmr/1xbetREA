.class public final La/opt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g45;


# direct methods
.method public synthetic constructor <init>(La/g45;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/opt;->a:La/g45;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, La/npt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/npt;

    .line 7
    .line 8
    iget v1, v0, La/npt;->k:I

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
    iput v1, v0, La/npt;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/npt;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/npt;-><init>(La/opt;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/npt;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/npt;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    iget-object p0, p0, La/opt;->a:La/g45;

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput v4, v0, La/npt;->k:I

    .line 53
    .line 54
    invoke-virtual {p0, v0}, La/g45;->s(La/zje;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v1, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    :goto_1
    move-object v4, p1

    .line 62
    check-cast v4, La/gxb;

    .line 63
    .line 64
    iget-object p1, p0, La/g45;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, La/i7e;

    .line 67
    .line 68
    iget-object p1, p1, La/i7e;->i:La/p7m0;

    .line 69
    .line 70
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, La/gxb;

    .line 75
    .line 76
    iget v0, p1, La/gxb;->d:I

    .line 77
    .line 78
    iget v1, v4, La/gxb;->d:I

    .line 79
    .line 80
    if-le v0, v1, :cond_4

    .line 81
    .line 82
    invoke-virtual {p0, v0}, La/g45;->a0(I)V

    .line 83
    .line 84
    .line 85
    :cond_4
    iget-object v0, p1, La/gxb;->j:La/vxy;

    .line 86
    .line 87
    iget v1, v0, La/vxy;->a:I

    .line 88
    .line 89
    iget-object v2, v4, La/gxb;->j:La/vxy;

    .line 90
    .line 91
    iget v5, v2, La/vxy;->a:I

    .line 92
    .line 93
    if-le v1, v5, :cond_5

    .line 94
    .line 95
    move-object v11, v0

    .line 96
    goto :goto_2

    .line 97
    :cond_5
    move-object v11, v2

    .line 98
    :goto_2
    iget-object v0, v4, La/gxb;->f:La/v9k0;

    .line 99
    .line 100
    if-eqz v0, :cond_7

    .line 101
    .line 102
    new-instance v1, La/v9k0;

    .line 103
    .line 104
    iget-wide v5, v0, La/v9k0;->a:J

    .line 105
    .line 106
    iget-object v0, p1, La/gxb;->f:La/v9k0;

    .line 107
    .line 108
    if-eqz v0, :cond_6

    .line 109
    .line 110
    iget-object v3, v0, La/v9k0;->b:Ljava/lang/Long;

    .line 111
    .line 112
    :cond_6
    invoke-direct {v1, v3, v5, v6}, La/v9k0;-><init>(Ljava/lang/Long;J)V

    .line 113
    .line 114
    .line 115
    move-object v8, v1

    .line 116
    goto :goto_3

    .line 117
    :cond_7
    move-object v8, v3

    .line 118
    :goto_3
    iget-object v0, p1, La/gxb;->i:Ljava/util/List;

    .line 119
    .line 120
    const/16 v1, 0xa

    .line 121
    .line 122
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    invoke-static {v1}, La/wp20;->a(I)I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    const/16 v2, 0x10

    .line 131
    .line 132
    if-ge v1, v2, :cond_8

    .line 133
    .line 134
    move v1, v2

    .line 135
    :cond_8
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 136
    .line 137
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_9

    .line 149
    .line 150
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    move-object v3, v1

    .line 155
    check-cast v3, La/xrt0;

    .line 156
    .line 157
    invoke-virtual {v3}, La/xrt0;->a()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_9
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 166
    .line 167
    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 168
    .line 169
    .line 170
    iget-object v1, v4, La/gxb;->i:Ljava/util/List;

    .line 171
    .line 172
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-eqz v2, :cond_a

    .line 181
    .line 182
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    check-cast v2, La/xrt0;

    .line 187
    .line 188
    invoke-virtual {v2}, La/xrt0;->a()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_a
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, Ljava/lang/Iterable;

    .line 201
    .line 202
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    iget v0, p1, La/gxb;->d:I

    .line 207
    .line 208
    iget v1, v4, La/gxb;->d:I

    .line 209
    .line 210
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    const/4 v9, 0x0

    .line 215
    const/16 v12, 0xd7

    .line 216
    .line 217
    const/4 v5, 0x0

    .line 218
    const/4 v7, 0x0

    .line 219
    invoke-static/range {v4 .. v12}, La/gxb;->a(La/gxb;ZIILa/v9k0;ZLjava/util/List;La/vxy;I)La/gxb;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {p0, v0}, La/g45;->j0(La/gxb;)V

    .line 224
    .line 225
    .line 226
    return-object p1
.end method
