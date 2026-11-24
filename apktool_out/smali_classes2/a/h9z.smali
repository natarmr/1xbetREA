.class public final La/h9z;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/i9z;


# direct methods
.method public synthetic constructor <init>(La/i9z;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/h9z;->a:B

    iput-object p1, p0, La/h9z;->b:La/i9z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/h9z;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/h9z;->b:La/i9z;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/i9z;->b:La/cqe0;

    .line 10
    .line 11
    invoke-virtual {v0}, La/cqe0;->b()Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_3

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, La/dqe0;

    .line 35
    .line 36
    iget-object v4, v3, La/dqe0;->a:La/g950;

    .line 37
    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    sget-object v4, La/bey;->b:La/g950;

    .line 41
    .line 42
    :cond_1
    invoke-virtual {p0, v3}, La/i9z;->a(La/dqe0;)La/r2e;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    new-instance v5, Lkotlin/Pair;

    .line 49
    .line 50
    invoke-direct {v5, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move-object v5, v1

    .line 55
    :goto_1
    if-eqz v5, :cond_0

    .line 56
    .line 57
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-static {v2}, La/xp20;->m(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_0
    invoke-virtual {p0}, La/i9z;->d()La/swq;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v2, p0, La/i9z;->b:La/cqe0;

    .line 71
    .line 72
    iget-object p0, p0, La/i9z;->a:La/f7u;

    .line 73
    .line 74
    if-nez v0, :cond_4

    .line 75
    .line 76
    sget-object p0, La/c2o;->f1:La/c2o;

    .line 77
    .line 78
    invoke-virtual {v2}, La/cqe0;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    filled-new-array {v0}, [Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {p0, v0}, La/f2o;->c(La/c2o;[Ljava/lang/String;)La/a2o;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    goto :goto_4

    .line 91
    :cond_4
    iget-object p0, p0, La/f7u;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p0, La/v7i;

    .line 94
    .line 95
    iget-object v3, p0, La/v7i;->j:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v3, La/zm40;

    .line 98
    .line 99
    iget-object v3, v3, La/zm40;->e:La/ary;

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    sget-object v4, La/bay;->a:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v0}, La/bay;->g(La/swq;)La/qlc;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    if-eqz v4, :cond_5

    .line 111
    .line 112
    invoke-virtual {v4}, La/qlc;->a()La/swq;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v3, v4}, La/ary;->j(La/swq;)La/wm40;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    goto :goto_2

    .line 121
    :cond_5
    move-object v3, v1

    .line 122
    :goto_2
    if-nez v3, :cond_7

    .line 123
    .line 124
    new-instance v3, La/mqe0;

    .line 125
    .line 126
    iget-object v2, v2, La/cqe0;->a:Ljava/lang/annotation/Annotation;

    .line 127
    .line 128
    invoke-static {v2}, La/azw;->F(Ljava/lang/annotation/Annotation;)La/sgy;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-static {v2}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-direct {v3, v2}, La/mqe0;-><init>(Ljava/lang/Class;)V

    .line 137
    .line 138
    .line 139
    iget-object v2, p0, La/v7i;->d:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v2, La/epi0;

    .line 142
    .line 143
    iget-object v2, v2, La/epi0;->b:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v2, La/yox;

    .line 146
    .line 147
    if-eqz v2, :cond_6

    .line 148
    .line 149
    invoke-virtual {v2, v3}, La/yox;->t(La/mqe0;)La/wm40;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    if-nez v3, :cond_7

    .line 154
    .line 155
    iget-object v1, p0, La/v7i;->j:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v1, La/zm40;

    .line 158
    .line 159
    new-instance v2, La/qlc;

    .line 160
    .line 161
    invoke-virtual {v0}, La/swq;->b()La/swq;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    iget-object v0, v0, La/swq;->a:La/twq;

    .line 166
    .line 167
    invoke-virtual {v0}, La/twq;->g()La/g950;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-direct {v2, v3, v0}, La/qlc;-><init>(La/swq;La/g950;)V

    .line 172
    .line 173
    .line 174
    iget-object p0, p0, La/v7i;->f:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p0, La/jfk;

    .line 177
    .line 178
    invoke-virtual {p0}, La/jfk;->c()La/f6i;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    iget-object p0, p0, La/f6i;->n:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast p0, La/n660;

    .line 185
    .line 186
    invoke-static {v1, v2, p0}, La/obb;->X(La/ym40;La/qlc;La/n660;)La/wm40;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    goto :goto_3

    .line 191
    :cond_6
    const-string p0, "resolver"

    .line 192
    .line 193
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw v1

    .line 197
    :cond_7
    :goto_3
    invoke-virtual {v3}, La/wm40;->I()La/kzj0;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    :goto_4
    return-object p0

    .line 202
    :pswitch_1
    iget-object p0, p0, La/i9z;->b:La/cqe0;

    .line 203
    .line 204
    iget-object p0, p0, La/cqe0;->a:Ljava/lang/annotation/Annotation;

    .line 205
    .line 206
    invoke-static {p0}, La/azw;->F(Ljava/lang/annotation/Annotation;)La/sgy;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-static {p0}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-static {p0}, La/bqe0;->a(Ljava/lang/Class;)La/qlc;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-virtual {p0}, La/qlc;->a()La/swq;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    return-object p0

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
