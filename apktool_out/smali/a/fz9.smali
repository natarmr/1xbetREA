.class public final La/fz9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ehf0;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ehf0;

    .line 5
    .line 6
    const/16 v1, 0xf

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/ehf0;-><init>(B)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/fz9;->a:La/ehf0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;La/q15;La/n2a;JLa/l4a;La/trm0;)La/ru;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    cmp-long v0, p4, v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 p4, 0x0

    .line 11
    move-object v5, p4

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, La/zen;

    .line 14
    .line 15
    invoke-direct {v0, p4, p5}, La/zen;-><init>(J)V

    .line 16
    .line 17
    .line 18
    move-object v5, v0

    .line 19
    :goto_0
    new-instance v1, La/mr0;

    .line 20
    .line 21
    const/4 v6, 0x6

    .line 22
    move-object v2, p0

    .line 23
    move-object v3, p1

    .line 24
    move-object v4, p2

    .line 25
    invoke-direct/range {v1 .. v6}, La/mr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    move-object p4, p3

    .line 33
    new-instance p3, La/ru;

    .line 34
    .line 35
    if-nez p6, :cond_1

    .line 36
    .line 37
    new-instance p5, La/fvt0;

    .line 38
    .line 39
    invoke-direct {p5}, La/fvt0;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance p6, La/l4a;

    .line 43
    .line 44
    iget-object p5, p5, La/fvt0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p5, La/wy40;

    .line 47
    .line 48
    invoke-static {p5}, La/b780;->j(La/drd;)La/b780;

    .line 49
    .line 50
    .line 51
    move-result-object p5

    .line 52
    invoke-direct {p6, p5}, La/l4a;-><init>(La/b780;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object p0, p3, La/ru;->a:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object p4, p3, La/ru;->b:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object p7, p3, La/ru;->c:Ljava/lang/Object;

    .line 69
    .line 70
    iput-object p6, p3, La/ru;->d:Ljava/lang/Object;

    .line 71
    .line 72
    new-instance p4, La/wy9;

    .line 73
    .line 74
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p5

    .line 78
    check-cast p5, La/m1a;

    .line 79
    .line 80
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    check-cast p0, La/m1a;

    .line 85
    .line 86
    invoke-virtual {p0}, La/m1a;->b()La/zy9;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-direct {p4, p5, p0}, La/wy9;-><init>(La/m1a;La/zy9;)V

    .line 91
    .line 92
    .line 93
    iput-object p4, p3, La/ru;->e:Ljava/lang/Object;

    .line 94
    .line 95
    new-instance p0, La/mr0;

    .line 96
    .line 97
    const/4 p5, 0x5

    .line 98
    iget-object p4, v2, La/fz9;->a:La/ehf0;

    .line 99
    .line 100
    invoke-direct/range {p0 .. p5}, La/mr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 101
    .line 102
    .line 103
    invoke-static {p0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    iput-object p0, p3, La/ru;->g:Ljava/lang/Object;

    .line 108
    .line 109
    sget-object p4, La/xun;->a:La/xun;

    .line 110
    .line 111
    iput-object p4, p3, La/ru;->h:Ljava/lang/Object;

    .line 112
    .line 113
    new-instance p4, Ljava/lang/Object;

    .line 114
    .line 115
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object p4, p3, La/ru;->i:Ljava/lang/Object;

    .line 119
    .line 120
    new-instance p4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 121
    .line 122
    const/4 p5, 0x0

    .line 123
    invoke-direct {p4, p5}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 124
    .line 125
    .line 126
    iput-object p4, p3, La/ru;->j:Ljava/lang/Object;

    .line 127
    .line 128
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    check-cast p0, La/cbi;

    .line 133
    .line 134
    invoke-virtual {p0}, La/cbi;->a()La/zy9;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {p0}, La/zy9;->a(La/zy9;)Ljava/util/ArrayList;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    if-eqz p0, :cond_2

    .line 143
    .line 144
    new-instance p4, Ljava/util/ArrayList;

    .line 145
    .line 146
    const/16 p5, 0xa

    .line 147
    .line 148
    invoke-static {p0, p5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 149
    .line 150
    .line 151
    move-result p5

    .line 152
    invoke-direct {p4, p5}, Ljava/util/ArrayList;-><init>(I)V

    .line 153
    .line 154
    .line 155
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result p5

    .line 163
    if-eqz p5, :cond_3

    .line 164
    .line 165
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p5

    .line 169
    check-cast p5, La/g0a;

    .line 170
    .line 171
    iget-object p5, p5, La/g0a;->a:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_2
    sget-object p4, La/iun;->a:La/iun;

    .line 178
    .line 179
    :cond_3
    new-instance p0, La/jrs0;

    .line 180
    .line 181
    iget-object p5, p3, La/ru;->a:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p5, La/n0o0;

    .line 184
    .line 185
    invoke-virtual {p5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p5

    .line 189
    check-cast p5, La/m1a;

    .line 190
    .line 191
    invoke-virtual {p5}, La/m1a;->b()La/zy9;

    .line 192
    .line 193
    .line 194
    move-result-object p5

    .line 195
    invoke-virtual {p5}, La/zy9;->d()La/wv9;

    .line 196
    .line 197
    .line 198
    move-result-object p5

    .line 199
    iget-object p5, p5, La/wv9;->b:La/cx9;

    .line 200
    .line 201
    iget-object p5, p5, La/cx9;->k:La/vae0;

    .line 202
    .line 203
    iget-object p2, p2, La/q15;->a:Ljava/util/concurrent/Executor;

    .line 204
    .line 205
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-static {p2}, La/obb;->Y(Ljava/util/concurrent/Executor;)La/lne;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    invoke-static {p2}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    invoke-direct {p0, p5, p2, p4, p1}, La/jrs0;-><init>(La/vae0;La/sje;Ljava/util/List;Landroid/content/Context;)V

    .line 217
    .line 218
    .line 219
    iput-object p0, p3, La/ru;->f:Ljava/lang/Object;

    .line 220
    .line 221
    invoke-virtual {p3, p4}, La/ru;->t(Ljava/util/List;)V

    .line 222
    .line 223
    .line 224
    return-object p3
.end method
