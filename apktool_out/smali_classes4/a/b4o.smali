.class public final La/b4o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final a:La/y3o;

.field public final b:La/g2v;

.field public final c:La/ctf0;

.field public final d:La/y78;

.field public final e:J

.field public final f:La/n0o0;

.field public final g:La/n0o0;

.field public final h:La/n0o0;

.field public final i:La/n0o0;

.field public final j:La/n0o0;

.field public final k:La/n0o0;

.field public final l:La/n0o0;

.field public final m:La/n0o0;

.field public final n:La/n0o0;

.field public final o:La/n0o0;

.field public final p:La/n0o0;

.field public final q:La/n0o0;

.field public final r:La/n0o0;


# direct methods
.method public constructor <init>(La/y3o;La/g2v;La/ctf0;La/y78;)V
    .locals 4

    .line 1
    iget-object v0, p1, La/y3o;->c:La/j0g0;

    .line 2
    .line 3
    iget-object v1, p1, La/y3o;->b:La/j0g0;

    .line 4
    .line 5
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La/b4o;->a:La/y3o;

    .line 12
    .line 13
    iput-object p2, p0, La/b4o;->b:La/g2v;

    .line 14
    .line 15
    iput-object p3, p0, La/b4o;->c:La/ctf0;

    .line 16
    .line 17
    iput-object p4, p0, La/b4o;->d:La/y78;

    .line 18
    .line 19
    iget-object p2, p1, La/y3o;->a:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

    .line 20
    .line 21
    instance-of p3, p2, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$SportGames;

    .line 22
    .line 23
    const/4 p4, 0x0

    .line 24
    if-eqz p3, :cond_0

    .line 25
    .line 26
    move-object p3, p2

    .line 27
    check-cast p3, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$SportGames;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object p3, p4

    .line 31
    :goto_0
    if-eqz p3, :cond_2

    .line 32
    .line 33
    iget v2, p3, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$SportGames;->d:I

    .line 34
    .line 35
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 36
    .line 37
    iget-byte v3, v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-wide v2, p3, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$SportGames;->b:J

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    iget-wide v2, p3, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$SportGames;->a:J

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const-wide/16 v2, 0x28

    .line 48
    .line 49
    :goto_1
    iput-wide v2, p0, La/b4o;->e:J

    .line 50
    .line 51
    iget-boolean p3, p1, La/y3o;->o:Z

    .line 52
    .line 53
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    invoke-static {p3}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    iput-object p3, p0, La/b4o;->f:La/n0o0;

    .line 62
    .line 63
    iget p3, p1, La/y3o;->e:I

    .line 64
    .line 65
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-static {p3}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    iput-object p3, p0, La/b4o;->g:La/n0o0;

    .line 74
    .line 75
    iget-boolean p3, p1, La/y3o;->h:Z

    .line 76
    .line 77
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    invoke-static {p3}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    iput-object p3, p0, La/b4o;->h:La/n0o0;

    .line 86
    .line 87
    invoke-interface {p2}, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;->I()I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-static {p2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    iput-object p2, p0, La/b4o;->i:La/n0o0;

    .line 100
    .line 101
    iget-object p2, p1, La/y3o;->i:La/ygq0;

    .line 102
    .line 103
    invoke-static {p2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    iput-object p2, p0, La/b4o;->j:La/n0o0;

    .line 108
    .line 109
    iget-boolean p2, p1, La/y3o;->m:Z

    .line 110
    .line 111
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-static {p2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    iput-object p2, p0, La/b4o;->k:La/n0o0;

    .line 120
    .line 121
    iget-object p2, p1, La/y3o;->j:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {p2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    iput-object p2, p0, La/b4o;->l:La/n0o0;

    .line 128
    .line 129
    invoke-static {v1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    iput-object p2, p0, La/b4o;->m:La/n0o0;

    .line 134
    .line 135
    invoke-static {v0}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    iput-object p2, p0, La/b4o;->n:La/n0o0;

    .line 140
    .line 141
    iget-boolean p1, p1, La/y3o;->n:Z

    .line 142
    .line 143
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-static {p1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iput-object p1, p0, La/b4o;->o:La/n0o0;

    .line 152
    .line 153
    new-instance p1, La/a4o;

    .line 154
    .line 155
    invoke-direct {p1, p0}, La/a4o;-><init>(La/b4o;)V

    .line 156
    .line 157
    .line 158
    new-instance p2, La/yw9;

    .line 159
    .line 160
    const/16 p3, 0x14

    .line 161
    .line 162
    invoke-direct {p2, p4, p1, p3}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 163
    .line 164
    .line 165
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    iput-object p1, p0, La/b4o;->p:La/n0o0;

    .line 170
    .line 171
    new-instance p1, La/w0;

    .line 172
    .line 173
    const/16 p2, 0x15

    .line 174
    .line 175
    invoke-direct {p1, p0, p2}, La/w0;-><init>(Ljava/lang/Object;B)V

    .line 176
    .line 177
    .line 178
    new-instance p2, La/yw9;

    .line 179
    .line 180
    invoke-direct {p2, p4, p1, p3}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 181
    .line 182
    .line 183
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    iput-object p1, p0, La/b4o;->q:La/n0o0;

    .line 188
    .line 189
    invoke-virtual {p0}, La/b4o;->a()La/fee;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    check-cast p1, Ljava/lang/Number;

    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    if-nez p1, :cond_3

    .line 204
    .line 205
    move-object v0, v1

    .line 206
    :cond_3
    if-eqz v0, :cond_5

    .line 207
    .line 208
    iget-object p1, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 209
    .line 210
    instance-of p2, p1, La/g0g0;

    .line 211
    .line 212
    if-eqz p2, :cond_4

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_4
    move-object p4, p1

    .line 216
    :goto_2
    check-cast p4, La/m3o;

    .line 217
    .line 218
    :cond_5
    new-instance p1, La/yhn;

    .line 219
    .line 220
    const/16 p2, 0x9

    .line 221
    .line 222
    invoke-direct {p1, p0, p2}, La/yhn;-><init>(Ljava/lang/Object;B)V

    .line 223
    .line 224
    .line 225
    new-instance p2, La/yw9;

    .line 226
    .line 227
    invoke-direct {p2, p4, p1, p3}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 228
    .line 229
    .line 230
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    iput-object p1, p0, La/b4o;->r:La/n0o0;

    .line 235
    .line 236
    return-void
.end method


# virtual methods
.method public final a()La/fee;
    .locals 0

    .line 1
    iget-object p0, p0, La/b4o;->g:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/fee;

    .line 8
    .line 9
    return-object p0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/b4o;->r:La/n0o0;

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    check-cast v2, La/y3o;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-boolean v3, v2, La/y3o;->g:Z

    .line 13
    .line 14
    iget-object v4, v0, La/b4o;->f:La/n0o0;

    .line 15
    .line 16
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, La/fee;

    .line 21
    .line 22
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-boolean v4, v2, La/y3o;->o:Z

    .line 43
    .line 44
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-interface {v5, v4}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v4, v0, La/b4o;->h:La/n0o0;

    .line 52
    .line 53
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, La/fee;

    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    check-cast v4, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-boolean v4, v2, La/y3o;->h:Z

    .line 80
    .line 81
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-interface {v5, v4}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object v4, v0, La/b4o;->j:La/n0o0;

    .line 89
    .line 90
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    check-cast v4, La/fee;

    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    check-cast v4, La/ygq0;

    .line 112
    .line 113
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    iget-object v4, v2, La/y3o;->i:La/ygq0;

    .line 117
    .line 118
    invoke-interface {v5, v4}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object v4, v0, La/b4o;->k:La/n0o0;

    .line 122
    .line 123
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    check-cast v4, La/fee;

    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    iget-boolean v4, v2, La/y3o;->m:Z

    .line 150
    .line 151
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-interface {v5, v4}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    iget-object v4, v0, La/b4o;->m:La/n0o0;

    .line 159
    .line 160
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    check-cast v4, La/fee;

    .line 165
    .line 166
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    check-cast v4, La/j0g0;

    .line 182
    .line 183
    iget-object v4, v2, La/y3o;->b:La/j0g0;

    .line 184
    .line 185
    invoke-interface {v5, v4}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    iget-object v5, v0, La/b4o;->n:La/n0o0;

    .line 189
    .line 190
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    check-cast v5, La/fee;

    .line 195
    .line 196
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5}, La/fee;->a()La/pz40;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    invoke-virtual {v5}, La/fee;->a()La/pz40;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    check-cast v5, La/j0g0;

    .line 212
    .line 213
    iget-object v5, v2, La/y3o;->c:La/j0g0;

    .line 214
    .line 215
    invoke-interface {v6, v5}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    iget-object v6, v0, La/b4o;->o:La/n0o0;

    .line 219
    .line 220
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    check-cast v6, La/fee;

    .line 225
    .line 226
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v6}, La/fee;->a()La/pz40;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    invoke-virtual {v6}, La/fee;->a()La/pz40;

    .line 234
    .line 235
    .line 236
    move-result-object v6

    .line 237
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    check-cast v6, Ljava/lang/Boolean;

    .line 242
    .line 243
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    iget-boolean v6, v2, La/y3o;->n:Z

    .line 247
    .line 248
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    invoke-interface {v7, v6}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    iget-object v6, v0, La/b4o;->l:La/n0o0;

    .line 256
    .line 257
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    check-cast v6, La/fee;

    .line 262
    .line 263
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v6}, La/fee;->a()La/pz40;

    .line 267
    .line 268
    .line 269
    move-result-object v7

    .line 270
    invoke-virtual {v6}, La/fee;->a()La/pz40;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    check-cast v6, Ljava/lang/String;

    .line 279
    .line 280
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    iget-object v6, v2, La/y3o;->j:Ljava/lang/String;

    .line 284
    .line 285
    invoke-interface {v7, v6}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0}, La/b4o;->a()La/fee;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v6}, La/fee;->a()La/pz40;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    invoke-virtual {v6}, La/fee;->a()La/pz40;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    check-cast v6, Ljava/lang/Integer;

    .line 308
    .line 309
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    iget v6, v2, La/y3o;->e:I

    .line 313
    .line 314
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 315
    .line 316
    .line 317
    move-result-object v6

    .line 318
    invoke-interface {v7, v6}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    new-instance v6, La/z3o;

    .line 322
    .line 323
    iget-object v7, v0, La/b4o;->p:La/n0o0;

    .line 324
    .line 325
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    check-cast v7, La/fee;

    .line 330
    .line 331
    iget-object v7, v7, La/fee;->e:La/zbk;

    .line 332
    .line 333
    iget-object v8, v0, La/b4o;->q:La/n0o0;

    .line 334
    .line 335
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v8

    .line 339
    check-cast v8, La/fee;

    .line 340
    .line 341
    invoke-virtual {v8}, La/fee;->b()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v8

    .line 345
    check-cast v8, La/l2o;

    .line 346
    .line 347
    iget-boolean v9, v2, La/y3o;->p:Z

    .line 348
    .line 349
    iget-object v10, v0, La/b4o;->a:La/y3o;

    .line 350
    .line 351
    iget-object v10, v10, La/y3o;->a:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

    .line 352
    .line 353
    invoke-interface {v10}, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;->I()I

    .line 354
    .line 355
    .line 356
    move-result v11

    .line 357
    invoke-static {v11}, Lorg/xplatform/cyber/section/api/domain/entity/d;->d(I)Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 358
    .line 359
    .line 360
    move-result-object v11

    .line 361
    iget-wide v12, v0, La/b4o;->e:J

    .line 362
    .line 363
    invoke-static {v12, v13, v11}, Lorg/xplatform/cyber/section/api/domain/entity/d;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Lkotlin/Pair;

    .line 364
    .line 365
    .line 366
    move-result-object v11

    .line 367
    iget-object v12, v11, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 368
    .line 369
    iget-object v11, v11, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 370
    .line 371
    invoke-virtual {v0}, La/b4o;->a()La/fee;

    .line 372
    .line 373
    .line 374
    move-result-object v13

    .line 375
    invoke-virtual {v13}, La/fee;->c()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v13

    .line 379
    check-cast v13, Ljava/lang/Number;

    .line 380
    .line 381
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 382
    .line 383
    .line 384
    move-result v13

    .line 385
    const/4 v15, 0x0

    .line 386
    if-nez v13, :cond_0

    .line 387
    .line 388
    const/4 v13, 0x1

    .line 389
    goto :goto_0

    .line 390
    :cond_0
    move v13, v15

    .line 391
    :goto_0
    if-eqz v13, :cond_1

    .line 392
    .line 393
    move-object v5, v4

    .line 394
    :cond_1
    const/16 v16, 0x0

    .line 395
    .line 396
    if-eqz v5, :cond_9

    .line 397
    .line 398
    iget-object v2, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 399
    .line 400
    instance-of v5, v2, La/g0g0;

    .line 401
    .line 402
    iget-object v14, v0, La/b4o;->b:La/g2v;

    .line 403
    .line 404
    if-nez v5, :cond_7

    .line 405
    .line 406
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 407
    .line 408
    check-cast v2, La/m3o;

    .line 409
    .line 410
    iget-object v0, v2, La/m3o;->a:Ljava/util/List;

    .line 411
    .line 412
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    if-eqz v0, :cond_4

    .line 417
    .line 418
    move-object v0, v11

    .line 419
    check-cast v0, Ljava/lang/Number;

    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 422
    .line 423
    .line 424
    move-result-wide v0

    .line 425
    move-object v4, v12

    .line 426
    check-cast v4, Ljava/lang/Number;

    .line 427
    .line 428
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 429
    .line 430
    .line 431
    move-result-wide v4

    .line 432
    iget-object v2, v2, La/m3o;->c:Ljava/lang/String;

    .line 433
    .line 434
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 435
    .line 436
    .line 437
    move-result v2

    .line 438
    if-lez v2, :cond_2

    .line 439
    .line 440
    const/4 v15, 0x1

    .line 441
    :cond_2
    if-eqz v15, :cond_3

    .line 442
    .line 443
    invoke-static {v0, v1, v4, v5}, La/ozb;->N(JJ)La/pb10;

    .line 444
    .line 445
    .line 446
    move-result-object v18
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 447
    const-wide/16 v28, 0x0

    .line 448
    .line 449
    const/16 v30, 0x3de

    .line 450
    .line 451
    const/16 v19, 0x0

    .line 452
    .line 453
    const/16 v20, 0x0

    .line 454
    .line 455
    const/16 v21, 0x0

    .line 456
    .line 457
    const/16 v22, 0x0

    .line 458
    .line 459
    const v23, 0x7f130e37

    .line 460
    .line 461
    .line 462
    const/16 v24, 0x0

    .line 463
    .line 464
    const/16 v25, 0x0

    .line 465
    .line 466
    const-wide/16 v26, 0x0

    .line 467
    .line 468
    move-object/from16 v17, v14

    .line 469
    .line 470
    :try_start_1
    invoke-static/range {v17 .. v30}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    goto :goto_1

    .line 475
    :cond_3
    move-object/from16 v17, v14

    .line 476
    .line 477
    invoke-static {v0, v1, v4, v5}, La/ozb;->N(JJ)La/pb10;

    .line 478
    .line 479
    .line 480
    move-result-object v18

    .line 481
    const-wide/16 v28, 0x0

    .line 482
    .line 483
    const/16 v30, 0x25e

    .line 484
    .line 485
    const/16 v19, 0x0

    .line 486
    .line 487
    const/16 v20, 0x0

    .line 488
    .line 489
    const/16 v21, 0x0

    .line 490
    .line 491
    const/16 v22, 0x0

    .line 492
    .line 493
    const v23, 0x7f1305c0

    .line 494
    .line 495
    .line 496
    const/16 v24, 0x0

    .line 497
    .line 498
    const v25, 0x7f131111

    .line 499
    .line 500
    .line 501
    const-wide/16 v26, 0x2710

    .line 502
    .line 503
    invoke-static/range {v17 .. v30}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    :goto_1
    new-instance v1, La/e4o;

    .line 508
    .line 509
    new-instance v2, La/o3o;

    .line 510
    .line 511
    invoke-direct {v2, v4, v5, v0}, La/o3o;-><init>(JLa/mdm;)V

    .line 512
    .line 513
    .line 514
    invoke-direct {v1, v2, v3}, La/e4o;-><init>(La/o3o;Z)V

    .line 515
    .line 516
    .line 517
    goto :goto_3

    .line 518
    :catchall_0
    move-exception v0

    .line 519
    move-object/from16 v17, v14

    .line 520
    .line 521
    goto :goto_4

    .line 522
    :cond_4
    move-object/from16 v17, v14

    .line 523
    .line 524
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    check-cast v0, La/fee;

    .line 529
    .line 530
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v0}, La/fee;->a()La/pz40;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    invoke-virtual {v0}, La/fee;->a()La/pz40;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    check-cast v0, La/m3o;

    .line 546
    .line 547
    if-eqz v4, :cond_6

    .line 548
    .line 549
    iget-object v0, v4, La/j0g0;->a:Ljava/lang/Object;

    .line 550
    .line 551
    instance-of v4, v0, La/g0g0;

    .line 552
    .line 553
    if-eqz v4, :cond_5

    .line 554
    .line 555
    goto :goto_2

    .line 556
    :cond_5
    move-object/from16 v16, v0

    .line 557
    .line 558
    :goto_2
    check-cast v16, La/m3o;

    .line 559
    .line 560
    :cond_6
    move-object/from16 v0, v16

    .line 561
    .line 562
    invoke-interface {v2, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    invoke-interface {v10}, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;->I()I

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    invoke-static {v0}, Lorg/xplatform/cyber/section/api/domain/entity/d;->d(I)Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    check-cast v1, La/fee;

    .line 578
    .line 579
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    check-cast v1, La/a4x;

    .line 584
    .line 585
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    new-instance v2, La/n3o;

    .line 589
    .line 590
    invoke-direct {v2, v13, v9, v15, v0}, La/n3o;-><init>(ZZZLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V

    .line 591
    .line 592
    .line 593
    new-instance v0, La/e4o;

    .line 594
    .line 595
    invoke-direct {v0, v2, v1, v3}, La/e4o;-><init>(La/p3o;La/a4x;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 596
    .line 597
    .line 598
    move-object v1, v0

    .line 599
    :goto_3
    move-object v2, v1

    .line 600
    goto :goto_5

    .line 601
    :catchall_1
    move-exception v0

    .line 602
    :goto_4
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 603
    .line 604
    new-instance v1, La/g0g0;

    .line 605
    .line 606
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 607
    .line 608
    .line 609
    goto :goto_3

    .line 610
    :cond_7
    move-object/from16 v17, v14

    .line 611
    .line 612
    :goto_5
    invoke-static {v2}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    if-nez v0, :cond_8

    .line 617
    .line 618
    goto :goto_6

    .line 619
    :cond_8
    check-cast v11, Ljava/lang/Number;

    .line 620
    .line 621
    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    .line 622
    .line 623
    .line 624
    move-result-wide v0

    .line 625
    check-cast v12, Ljava/lang/Number;

    .line 626
    .line 627
    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    .line 628
    .line 629
    .line 630
    move-result-wide v4

    .line 631
    new-instance v2, La/o3o;

    .line 632
    .line 633
    invoke-static {v0, v1, v4, v5}, La/ozb;->N(JJ)La/pb10;

    .line 634
    .line 635
    .line 636
    move-result-object v18

    .line 637
    const-wide/16 v28, 0x0

    .line 638
    .line 639
    const/16 v30, 0x25e

    .line 640
    .line 641
    const/16 v19, 0x0

    .line 642
    .line 643
    const/16 v20, 0x0

    .line 644
    .line 645
    const/16 v21, 0x0

    .line 646
    .line 647
    const/16 v22, 0x0

    .line 648
    .line 649
    const v23, 0x7f130677

    .line 650
    .line 651
    .line 652
    const/16 v24, 0x0

    .line 653
    .line 654
    const v25, 0x7f131690

    .line 655
    .line 656
    .line 657
    const-wide/16 v26, 0x2710

    .line 658
    .line 659
    invoke-static/range {v17 .. v30}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    invoke-direct {v2, v4, v5, v0}, La/o3o;-><init>(JLa/mdm;)V

    .line 664
    .line 665
    .line 666
    new-instance v0, La/e4o;

    .line 667
    .line 668
    invoke-direct {v0, v2, v3}, La/e4o;-><init>(La/o3o;Z)V

    .line 669
    .line 670
    .line 671
    move-object v2, v0

    .line 672
    :goto_6
    check-cast v2, La/e4o;

    .line 673
    .line 674
    goto :goto_9

    .line 675
    :cond_9
    invoke-interface {v10}, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;->I()I

    .line 676
    .line 677
    .line 678
    move-result v0

    .line 679
    invoke-static {v0}, Lorg/xplatform/cyber/section/api/domain/entity/d;->d(I)Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    iget-object v1, v2, La/y3o;->f:La/sff0;

    .line 684
    .line 685
    iget-object v1, v1, La/sff0;->g:La/mum0;

    .line 686
    .line 687
    iget-object v1, v1, La/mum0;->y:La/v5l0;

    .line 688
    .line 689
    new-instance v2, La/e4o;

    .line 690
    .line 691
    new-instance v3, La/n3o;

    .line 692
    .line 693
    const/4 v4, 0x1

    .line 694
    invoke-direct {v3, v13, v9, v4, v0}, La/n3o;-><init>(ZZZLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V

    .line 695
    .line 696
    .line 697
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 698
    .line 699
    .line 700
    move-result v0

    .line 701
    if-eqz v0, :cond_e

    .line 702
    .line 703
    if-eq v0, v4, :cond_d

    .line 704
    .line 705
    const/4 v1, 0x2

    .line 706
    if-eq v0, v1, :cond_c

    .line 707
    .line 708
    const/4 v1, 0x3

    .line 709
    if-eq v0, v1, :cond_b

    .line 710
    .line 711
    const/4 v1, 0x4

    .line 712
    if-ne v0, v1, :cond_a

    .line 713
    .line 714
    sget-object v0, La/h0l0;->a:La/h0l0;

    .line 715
    .line 716
    goto :goto_7

    .line 717
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 718
    .line 719
    .line 720
    return-object v16

    .line 721
    :cond_b
    sget-object v0, La/i0l0;->a:La/i0l0;

    .line 722
    .line 723
    goto :goto_7

    .line 724
    :cond_c
    sget-object v0, La/j0l0;->a:La/j0l0;

    .line 725
    .line 726
    goto :goto_7

    .line 727
    :cond_d
    sget-object v0, La/k0l0;->a:La/k0l0;

    .line 728
    .line 729
    goto :goto_7

    .line 730
    :cond_e
    sget-object v0, La/g0l0;->a:La/g0l0;

    .line 731
    .line 732
    :goto_7
    new-instance v1, Ljava/util/ArrayList;

    .line 733
    .line 734
    const/16 v4, 0xc

    .line 735
    .line 736
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 737
    .line 738
    .line 739
    move v5, v15

    .line 740
    :goto_8
    if-ge v5, v4, :cond_f

    .line 741
    .line 742
    new-instance v9, La/x56;

    .line 743
    .line 744
    invoke-direct {v9, v0}, La/x56;-><init>(La/l0l0;)V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    add-int/lit8 v5, v5, 0x1

    .line 751
    .line 752
    goto :goto_8

    .line 753
    :cond_f
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    invoke-direct {v2, v3, v0, v15}, La/e4o;-><init>(La/p3o;La/a4x;Z)V

    .line 758
    .line 759
    .line 760
    :goto_9
    invoke-direct {v6, v7, v8, v2}, La/z3o;-><init>(La/l7m0;La/l2o;La/e4o;)V

    .line 761
    .line 762
    .line 763
    return-object v6
.end method
