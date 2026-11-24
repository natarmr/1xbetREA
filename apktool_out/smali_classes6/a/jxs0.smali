.class public final La/jxs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:La/agk0;

.field public final synthetic c:La/pz40;

.field public final synthetic d:La/t33;


# direct methods
.method public constructor <init>(FLa/agk0;La/pz40;La/t33;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/jxs0;->a:F

    .line 5
    .line 6
    iput-object p2, p0, La/jxs0;->b:La/agk0;

    .line 7
    .line 8
    iput-object p3, p0, La/jxs0;->c:La/pz40;

    .line 9
    .line 10
    iput-object p4, p0, La/jxs0;->d:La/t33;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    move-object v3, v1

    .line 20
    check-cast v3, La/pj30;

    .line 21
    .line 22
    invoke-static {v3}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-string v4, "lineups"

    .line 27
    .line 28
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v1, v2

    .line 36
    :goto_0
    check-cast v1, La/pj30;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    const v8, 0x7fffffff

    .line 41
    .line 42
    .line 43
    const/4 v9, 0x3

    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v7, 0x0

    .line 47
    move-wide v3, p3

    .line 48
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 49
    .line 50
    .line 51
    move-result-wide p3

    .line 52
    invoke-interface {v1, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move-wide v3, p3

    .line 58
    move-object p3, v2

    .line 59
    :goto_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p4

    .line 63
    :cond_3
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    move-object v1, v0

    .line 74
    check-cast v1, La/pj30;

    .line 75
    .line 76
    invoke-static {v1}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const-string v5, "navBar"

    .line 81
    .line 82
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    move-object v0, v2

    .line 90
    :goto_2
    check-cast v0, La/pj30;

    .line 91
    .line 92
    if-eqz v0, :cond_5

    .line 93
    .line 94
    const/4 v8, 0x0

    .line 95
    const/16 v9, 0xb

    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    const/4 v6, 0x0

    .line 99
    const/4 v7, 0x0

    .line 100
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 101
    .line 102
    .line 103
    move-result-wide v5

    .line 104
    invoke-interface {v0, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 105
    .line 106
    .line 107
    move-result-object p4

    .line 108
    goto :goto_3

    .line 109
    :cond_5
    move-object p4, v2

    .line 110
    :goto_3
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    :cond_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_7

    .line 119
    .line 120
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    move-object v1, v0

    .line 125
    check-cast v1, La/pj30;

    .line 126
    .line 127
    invoke-static {v1}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    const-string v5, "sheet"

    .line 132
    .line 133
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_6

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_7
    move-object v0, v2

    .line 141
    :goto_4
    check-cast v0, La/pj30;

    .line 142
    .line 143
    if-eqz v0, :cond_8

    .line 144
    .line 145
    invoke-static {v3, v4}, La/p4e;->h(J)I

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    invoke-static {v3, v4}, La/p4e;->h(J)I

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    const/4 v9, 0x3

    .line 154
    const/4 v5, 0x0

    .line 155
    const/4 v6, 0x0

    .line 156
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 157
    .line 158
    .line 159
    move-result-wide v1

    .line 160
    invoke-interface {v0, v1, v2}, La/pj30;->S(J)La/pu90;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    :cond_8
    move-object v6, v2

    .line 165
    const/4 p2, 0x0

    .line 166
    if-eqz p3, :cond_9

    .line 167
    .line 168
    iget v0, p3, La/pu90;->b:I

    .line 169
    .line 170
    int-to-float v0, v0

    .line 171
    goto :goto_5

    .line 172
    :cond_9
    move v0, p2

    .line 173
    :goto_5
    cmpl-float v1, v0, p2

    .line 174
    .line 175
    iget-object v2, p0, La/jxs0;->b:La/agk0;

    .line 176
    .line 177
    if-lez v1, :cond_a

    .line 178
    .line 179
    invoke-virtual {v2, v0}, La/agk0;->m(F)V

    .line 180
    .line 181
    .line 182
    :cond_a
    if-lez v1, :cond_b

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_b
    invoke-virtual {v2}, La/agk0;->l()F

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    :goto_6
    iget v1, p0, La/jxs0;->a:F

    .line 190
    .line 191
    sub-float/2addr v0, v1

    .line 192
    cmpg-float v1, v0, p2

    .line 193
    .line 194
    if-gez v1, :cond_c

    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_c
    move p2, v0

    .line 198
    :goto_7
    iget-object v0, p0, La/jxs0;->c:La/pz40;

    .line 199
    .line 200
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    check-cast v1, Ljava/lang/Float;

    .line 205
    .line 206
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->b(FLjava/lang/Float;)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-nez v1, :cond_d

    .line 211
    .line 212
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    invoke-interface {v0, p2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    :cond_d
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 220
    .line 221
    .line 222
    move-result p2

    .line 223
    invoke-static {v3, v4}, La/p4e;->h(J)I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    new-instance v3, La/l0i0;

    .line 228
    .line 229
    const/16 v8, 0xc

    .line 230
    .line 231
    iget-object v7, p0, La/jxs0;->d:La/t33;

    .line 232
    .line 233
    move-object v4, p3

    .line 234
    move-object v5, p4

    .line 235
    invoke-direct/range {v3 .. v8}, La/l0i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 236
    .line 237
    .line 238
    invoke-static {p1, p2, v0, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    return-object p0
.end method
