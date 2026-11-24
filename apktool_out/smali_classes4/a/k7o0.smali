.class public final La/k7o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final a:La/i7o0;

.field public final b:La/ctf0;

.field public final c:La/g2v;

.field public final d:J

.field public final e:La/n0o0;

.field public final f:La/n0o0;


# direct methods
.method public constructor <init>(La/i7o0;La/ctf0;La/g2v;J)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/k7o0;->a:La/i7o0;

    .line 8
    .line 9
    iput-object p2, p0, La/k7o0;->b:La/ctf0;

    .line 10
    .line 11
    iput-object p3, p0, La/k7o0;->c:La/g2v;

    .line 12
    .line 13
    iput-wide p4, p0, La/k7o0;->d:J

    .line 14
    .line 15
    new-instance p2, La/rgn0;

    .line 16
    .line 17
    const/16 p3, 0x13

    .line 18
    .line 19
    invoke-direct {p2, p3}, La/rgn0;-><init>(B)V

    .line 20
    .line 21
    .line 22
    new-instance p3, La/yw9;

    .line 23
    .line 24
    const/16 p4, 0x14

    .line 25
    .line 26
    invoke-direct {p3, p1, p2, p4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iput-object p2, p0, La/k7o0;->e:La/n0o0;

    .line 34
    .line 35
    new-instance p2, La/ttn0;

    .line 36
    .line 37
    const/4 p3, 0x4

    .line 38
    invoke-direct {p2, p0, p3}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    new-instance p3, La/yw9;

    .line 42
    .line 43
    invoke-direct {p3, p1, p2, p4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, La/k7o0;->f:La/n0o0;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/i7o0;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, La/k7o0;->e:La/n0o0;

    .line 11
    .line 12
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, La/fee;

    .line 17
    .line 18
    invoke-virtual {v3, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v3, v0, La/k7o0;->f:La/n0o0;

    .line 22
    .line 23
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, La/fee;

    .line 28
    .line 29
    invoke-virtual {v4, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-boolean v4, v1, La/i7o0;->f:Z

    .line 33
    .line 34
    iget-object v1, v1, La/i7o0;->d:Ljava/util/List;

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    iget-object v3, v0, La/k7o0;->a:La/i7o0;

    .line 39
    .line 40
    iget-object v3, v3, La/i7o0;->g:La/sff0;

    .line 41
    .line 42
    iget-object v3, v3, La/sff0;->g:La/mum0;

    .line 43
    .line 44
    iget-object v3, v3, La/mum0;->y:La/v5l0;

    .line 45
    .line 46
    new-instance v5, Ljava/util/ArrayList;

    .line 47
    .line 48
    const/4 v6, 0x5

    .line 49
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 50
    .line 51
    .line 52
    const/4 v7, 0x0

    .line 53
    :goto_0
    if-ge v7, v6, :cond_0

    .line 54
    .line 55
    new-instance v8, La/f7o0;

    .line 56
    .line 57
    const-string v9, "RESULTS_SHIMMER"

    .line 58
    .line 59
    invoke-static {v7, v9}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    invoke-static {v3}, La/pzw;->I(La/v5l0;)La/w0g0;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    const/4 v11, 0x1

    .line 68
    invoke-direct {v8, v9, v10, v11}, La/f7o0;-><init>(Ljava/lang/String;La/x0g0;Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    add-int/lit8 v7, v7, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    if-eqz v1, :cond_2

    .line 83
    .line 84
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, La/fee;

    .line 89
    .line 90
    invoke-virtual {v3}, La/fee;->b()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Ljava/lang/Iterable;

    .line 95
    .line 96
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    sget-object v3, La/lak0;->c:La/lak0;

    .line 102
    .line 103
    :goto_1
    iget-wide v5, v0, La/k7o0;->d:J

    .line 104
    .line 105
    iget-object v7, v0, La/k7o0;->c:La/g2v;

    .line 106
    .line 107
    if-nez v1, :cond_3

    .line 108
    .line 109
    if-nez v4, :cond_3

    .line 110
    .line 111
    new-instance v0, La/a7o0;

    .line 112
    .line 113
    sget-object v1, La/pb10;->v:La/pb10;

    .line 114
    .line 115
    invoke-static {v5, v6, v1}, La/ozb;->L(JLa/pb10;)La/pb10;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    const-wide/16 v18, 0x0

    .line 120
    .line 121
    const/16 v20, 0x25e

    .line 122
    .line 123
    const/4 v9, 0x0

    .line 124
    const/4 v10, 0x0

    .line 125
    const/4 v11, 0x0

    .line 126
    const/4 v12, 0x0

    .line 127
    const v13, 0x7f130677

    .line 128
    .line 129
    .line 130
    const/4 v14, 0x0

    .line 131
    const v15, 0x7f131690

    .line 132
    .line 133
    .line 134
    const-wide/16 v16, 0x2710

    .line 135
    .line 136
    invoke-static/range {v7 .. v20}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-direct {v0, v1}, La/a7o0;-><init>(La/mdm;)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_3
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_4

    .line 149
    .line 150
    new-instance v0, La/a7o0;

    .line 151
    .line 152
    sget-object v1, La/pb10;->v:La/pb10;

    .line 153
    .line 154
    invoke-static {v5, v6, v1}, La/ozb;->L(JLa/pb10;)La/pb10;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    const-wide/16 v18, 0x0

    .line 159
    .line 160
    const/16 v20, 0x25e

    .line 161
    .line 162
    const/4 v9, 0x0

    .line 163
    const/4 v10, 0x0

    .line 164
    const/4 v11, 0x0

    .line 165
    const/4 v12, 0x0

    .line 166
    const v13, 0x7f130791

    .line 167
    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    const v15, 0x7f131690

    .line 171
    .line 172
    .line 173
    const-wide/16 v16, 0x2710

    .line 174
    .line 175
    invoke-static/range {v7 .. v20}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-direct {v0, v1}, La/a7o0;-><init>(La/mdm;)V

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_4
    sget-object v0, La/z6o0;->a:La/z6o0;

    .line 184
    .line 185
    :goto_2
    new-instance v1, La/j7o0;

    .line 186
    .line 187
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    check-cast v2, La/fee;

    .line 192
    .line 193
    invoke-virtual {v2}, La/fee;->b()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    check-cast v2, La/y6o0;

    .line 198
    .line 199
    invoke-direct {v1, v2, v0, v3, v4}, La/j7o0;-><init>(La/y6o0;La/b7o0;La/a4x;Z)V

    .line 200
    .line 201
    .line 202
    return-object v1
.end method
