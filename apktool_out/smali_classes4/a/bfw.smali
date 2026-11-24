.class public final La/bfw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final synthetic a:B

.field public final b:Z

.field public final c:La/ctf0;

.field public final d:La/n0o0;

.field public final e:La/n0o0;

.field public final f:La/n0o0;

.field public final g:La/n0o0;

.field public final h:La/n0o0;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/lew;La/ctf0;Z)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/bfw;->a:B

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
    iput-object p2, p0, La/bfw;->c:La/ctf0;

    .line 11
    .line 12
    iput-boolean p3, p0, La/bfw;->b:Z

    .line 13
    .line 14
    iget-wide v1, p1, La/lew;->a:J

    .line 15
    .line 16
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    invoke-static {p3}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    iput-object p3, p0, La/bfw;->d:La/n0o0;

    .line 25
    .line 26
    new-instance p3, La/few;

    .line 27
    .line 28
    invoke-static {}, La/bfw;->a()La/eew;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {p3, v1}, La/few;-><init>(La/jwb;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p3}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    iput-object p3, p0, La/bfw;->i:Ljava/lang/Object;

    .line 40
    .line 41
    iget-object p3, p1, La/lew;->b:La/tew;

    .line 42
    .line 43
    iget-object v1, p3, La/tew;->a:La/j0g0;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    iget-object v1, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 49
    .line 50
    instance-of v3, v1, La/g0g0;

    .line 51
    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    move-object v1, v2

    .line 55
    :cond_0
    check-cast v1, La/new;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move-object v1, v2

    .line 59
    :goto_0
    new-instance v3, La/afw;

    .line 60
    .line 61
    invoke-direct {v3, p0, v0}, La/afw;-><init>(La/bfw;B)V

    .line 62
    .line 63
    .line 64
    new-instance v4, La/yw9;

    .line 65
    .line 66
    const/16 v5, 0x14

    .line 67
    .line 68
    invoke-direct {v4, v1, v3, v5}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iput-object v1, p0, La/bfw;->e:La/n0o0;

    .line 76
    .line 77
    iget-object v1, p3, La/tew;->b:La/j0g0;

    .line 78
    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    iget-object v1, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 82
    .line 83
    instance-of v3, v1, La/g0g0;

    .line 84
    .line 85
    if-eqz v3, :cond_2

    .line 86
    .line 87
    move-object v1, v2

    .line 88
    :cond_2
    check-cast v1, Ljava/util/List;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    move-object v1, v2

    .line 92
    :goto_1
    new-instance v3, La/afw;

    .line 93
    .line 94
    const/4 v4, 0x1

    .line 95
    invoke-direct {v3, p0, v4}, La/afw;-><init>(La/bfw;B)V

    .line 96
    .line 97
    .line 98
    new-instance v4, La/yw9;

    .line 99
    .line 100
    invoke-direct {v4, v1, v3, v5}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 101
    .line 102
    .line 103
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iput-object v1, p0, La/bfw;->f:La/n0o0;

    .line 108
    .line 109
    iget-object p3, p3, La/tew;->a:La/j0g0;

    .line 110
    .line 111
    if-eqz p3, :cond_5

    .line 112
    .line 113
    iget-object p3, p3, La/j0g0;->a:Ljava/lang/Object;

    .line 114
    .line 115
    instance-of v1, p3, La/g0g0;

    .line 116
    .line 117
    if-eqz v1, :cond_4

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_4
    move-object v2, p3

    .line 121
    :goto_2
    check-cast v2, La/new;

    .line 122
    .line 123
    if-eqz v2, :cond_5

    .line 124
    .line 125
    iget-object p3, v2, La/new;->b:Ljava/util/List;

    .line 126
    .line 127
    if-nez p3, :cond_6

    .line 128
    .line 129
    :cond_5
    sget-object p3, La/iun;->a:La/iun;

    .line 130
    .line 131
    :cond_6
    new-instance v1, La/afw;

    .line 132
    .line 133
    const/4 v2, 0x2

    .line 134
    invoke-direct {v1, p0, v2}, La/afw;-><init>(La/bfw;B)V

    .line 135
    .line 136
    .line 137
    new-instance v2, La/yw9;

    .line 138
    .line 139
    invoke-direct {v2, p3, v1, v5}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 140
    .line 141
    .line 142
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 143
    .line 144
    .line 145
    move-result-object p3

    .line 146
    iput-object p3, p0, La/bfw;->g:La/n0o0;

    .line 147
    .line 148
    new-instance p3, La/wf60;

    .line 149
    .line 150
    new-array v1, v0, [Ljava/lang/Object;

    .line 151
    .line 152
    iget-object p2, p2, La/ctf0;->b:La/lsm0;

    .line 153
    .line 154
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    const v1, 0x7f130a01

    .line 159
    .line 160
    .line 161
    invoke-virtual {p2, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-direct {p3, p2}, La/wf60;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    iput-object p3, p0, La/bfw;->j:Ljava/lang/Object;

    .line 169
    .line 170
    new-instance p2, La/afw;

    .line 171
    .line 172
    const/4 p3, 0x3

    .line 173
    invoke-direct {p2, p0, p3}, La/afw;-><init>(La/bfw;B)V

    .line 174
    .line 175
    .line 176
    new-instance p3, La/yw9;

    .line 177
    .line 178
    invoke-direct {p3, p1, p2, v5}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 179
    .line 180
    .line 181
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    iput-object p1, p0, La/bfw;->h:La/n0o0;

    .line 186
    .line 187
    return-void
.end method

.method public constructor <init>(La/m730;ZLa/udl0;ZLa/ctf0;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/bfw;->a:B

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 189
    iput-object p3, p0, La/bfw;->i:Ljava/lang/Object;

    .line 190
    iput-boolean p4, p0, La/bfw;->b:Z

    .line 191
    iput-object p5, p0, La/bfw;->c:La/ctf0;

    .line 192
    new-instance p3, La/vef0;

    const/4 p4, 0x0

    new-array v0, p4, [Ljava/lang/Object;

    .line 193
    iget-object p5, p5, La/ctf0;->b:La/lsm0;

    invoke-static {v0, p4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p4

    const v0, 0x7f130e0a

    invoke-virtual {p5, v0, p4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    .line 194
    invoke-direct {p3, p4}, La/vef0;-><init>(Ljava/lang/String;)V

    iput-object p3, p0, La/bfw;->j:Ljava/lang/Object;

    .line 195
    iget-object p3, p1, La/m730;->a:Ljava/util/List;

    .line 196
    invoke-static {p3}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    move-result-object p3

    iput-object p3, p0, La/bfw;->d:La/n0o0;

    .line 197
    iget-wide p3, p1, La/m730;->d:J

    .line 198
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-static {p3}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    move-result-object p3

    iput-object p3, p0, La/bfw;->e:La/n0o0;

    .line 199
    iget-object p3, p1, La/m730;->e:La/aw20;

    .line 200
    invoke-static {p3}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    move-result-object p3

    iput-object p3, p0, La/bfw;->f:La/n0o0;

    .line 201
    iget-object p3, p1, La/m730;->g:La/ycs;

    .line 202
    invoke-static {p3}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    move-result-object p3

    iput-object p3, p0, La/bfw;->g:La/n0o0;

    .line 203
    iget-object p3, p1, La/m730;->b:Ljava/util/Map;

    .line 204
    new-instance p4, La/r91;

    const/16 p5, 0x13

    invoke-direct {p4, p0, p2, p1, p5}, La/r91;-><init>(Ljava/lang/Object;ZLjava/lang/Object;B)V

    .line 205
    new-instance p1, La/yw9;

    const/16 p2, 0x14

    invoke-direct {p1, p3, p4, p2}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    .line 206
    iput-object p1, p0, La/bfw;->h:La/n0o0;

    return-void
.end method

.method public static a()La/eew;
    .locals 15

    .line 1
    new-instance v0, La/eew;

    .line 2
    .line 3
    sget-object v4, La/ldm;->b:La/ldm;

    .line 4
    .line 5
    sget-object v1, La/pb10;->c:La/xuz;

    .line 6
    .line 7
    const-wide/16 v2, 0x2e

    .line 8
    .line 9
    invoke-static {v2, v3}, La/ozb;->K(J)La/pb10;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget v2, v2, La/pb10;->a:I

    .line 17
    .line 18
    new-instance v1, La/mdm;

    .line 19
    .line 20
    const-wide/16 v12, 0x0

    .line 21
    .line 22
    const/16 v14, 0x3fa

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v8, 0x0

    .line 29
    const/4 v9, 0x0

    .line 30
    const-wide/16 v10, 0x0

    .line 31
    .line 32
    invoke-direct/range {v1 .. v14}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1}, La/eew;-><init>(La/mdm;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bfw;->a:B

    .line 4
    .line 5
    iget-object v3, v0, La/bfw;->j:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v4, v0, La/bfw;->h:La/n0o0;

    .line 8
    .line 9
    iget-object v5, v0, La/bfw;->g:La/n0o0;

    .line 10
    .line 11
    iget-object v6, v0, La/bfw;->f:La/n0o0;

    .line 12
    .line 13
    iget-object v7, v0, La/bfw;->e:La/n0o0;

    .line 14
    .line 15
    iget-object v8, v0, La/bfw;->d:La/n0o0;

    .line 16
    .line 17
    iget-object v9, v0, La/bfw;->i:Ljava/lang/Object;

    .line 18
    .line 19
    const/4 v10, 0x1

    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v1, p1

    .line 24
    .line 25
    check-cast v1, La/m730;

    .line 26
    .line 27
    check-cast v9, La/udl0;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    check-cast v8, La/fee;

    .line 37
    .line 38
    iget-object v11, v1, La/m730;->a:Ljava/util/List;

    .line 39
    .line 40
    iget-boolean v12, v1, La/m730;->f:Z

    .line 41
    .line 42
    invoke-virtual {v8, v11}, La/fee;->d(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    check-cast v8, La/fee;

    .line 50
    .line 51
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v8}, La/fee;->a()La/pz40;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    invoke-virtual {v8}, La/fee;->a()La/pz40;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    check-cast v8, Ljava/lang/Long;

    .line 67
    .line 68
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-wide v13, v1, La/m730;->d:J

    .line 72
    .line 73
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-interface {v11, v8}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    check-cast v6, La/fee;

    .line 85
    .line 86
    iget-object v8, v1, La/m730;->e:La/aw20;

    .line 87
    .line 88
    invoke-virtual {v6, v8}, La/fee;->d(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    check-cast v5, La/fee;

    .line 96
    .line 97
    iget-object v6, v1, La/m730;->g:La/ycs;

    .line 98
    .line 99
    invoke-virtual {v5, v6}, La/fee;->d(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    check-cast v5, La/fee;

    .line 107
    .line 108
    iget-object v6, v1, La/m730;->b:Ljava/util/Map;

    .line 109
    .line 110
    invoke-virtual {v5, v6}, La/fee;->d(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    check-cast v5, La/fee;

    .line 118
    .line 119
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    check-cast v5, La/cx7;

    .line 128
    .line 129
    iget-boolean v6, v0, La/bfw;->b:Z

    .line 130
    .line 131
    if-nez v5, :cond_0

    .line 132
    .line 133
    new-instance v2, La/x730;

    .line 134
    .line 135
    invoke-direct {v2, v9, v6, v12}, La/x730;-><init>(La/udl0;ZZ)V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_4

    .line 139
    .line 140
    :cond_0
    instance-of v7, v5, La/ax7;

    .line 141
    .line 142
    if-eqz v7, :cond_1

    .line 143
    .line 144
    new-instance v2, La/x730;

    .line 145
    .line 146
    invoke-direct {v2, v9, v6, v12}, La/x730;-><init>(La/udl0;ZZ)V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_4

    .line 150
    .line 151
    :cond_1
    instance-of v7, v5, La/ww7;

    .line 152
    .line 153
    if-eqz v7, :cond_4

    .line 154
    .line 155
    new-instance v2, La/w730;

    .line 156
    .line 157
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v0, La/fee;

    .line 162
    .line 163
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 164
    .line 165
    invoke-virtual {v0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, Ljava/util/List;

    .line 170
    .line 171
    if-eqz v0, :cond_2

    .line 172
    .line 173
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-nez v0, :cond_3

    .line 178
    .line 179
    :cond_2
    sget-object v0, La/lak0;->c:La/lak0;

    .line 180
    .line 181
    :cond_3
    invoke-direct {v2, v9, v6, v0, v12}, La/w730;-><init>(La/udl0;ZLa/a4x;Z)V

    .line 182
    .line 183
    .line 184
    goto/16 :goto_4

    .line 185
    .line 186
    :cond_4
    instance-of v4, v5, La/uw7;

    .line 187
    .line 188
    if-eqz v4, :cond_5

    .line 189
    .line 190
    new-instance v2, La/u730;

    .line 191
    .line 192
    check-cast v5, La/uw7;

    .line 193
    .line 194
    iget-wide v3, v5, La/uw7;->a:J

    .line 195
    .line 196
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    iget-object v0, v0, La/bfw;->c:La/ctf0;

    .line 205
    .line 206
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 207
    .line 208
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    const v3, 0x7f130e0b

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-direct {v2, v9, v0}, La/u730;-><init>(La/udl0;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_5
    instance-of v0, v5, La/yw7;

    .line 224
    .line 225
    if-eqz v0, :cond_b

    .line 226
    .line 227
    new-instance v2, La/y730;

    .line 228
    .line 229
    iget-object v0, v1, La/m730;->c:La/l9s;

    .line 230
    .line 231
    const/4 v1, 0x0

    .line 232
    if-eqz v0, :cond_6

    .line 233
    .line 234
    invoke-interface {v0}, La/l9s;->e()Z

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    if-ne v4, v10, :cond_6

    .line 239
    .line 240
    move v12, v10

    .line 241
    goto :goto_0

    .line 242
    :cond_6
    move v12, v1

    .line 243
    :goto_0
    const-wide/16 v4, -0x1

    .line 244
    .line 245
    if-eqz v0, :cond_7

    .line 246
    .line 247
    invoke-interface {v0}, La/l9s;->a()J

    .line 248
    .line 249
    .line 250
    move-result-wide v6

    .line 251
    move-wide v13, v6

    .line 252
    goto :goto_1

    .line 253
    :cond_7
    move-wide v13, v4

    .line 254
    :goto_1
    if-eqz v0, :cond_8

    .line 255
    .line 256
    invoke-interface {v0}, La/l9s;->b()J

    .line 257
    .line 258
    .line 259
    move-result-wide v6

    .line 260
    move-wide/from16 v19, v6

    .line 261
    .line 262
    goto :goto_2

    .line 263
    :cond_8
    move-wide/from16 v19, v4

    .line 264
    .line 265
    :goto_2
    if-eqz v0, :cond_9

    .line 266
    .line 267
    invoke-interface {v0}, La/l9s;->c()J

    .line 268
    .line 269
    .line 270
    move-result-wide v6

    .line 271
    move-wide v15, v6

    .line 272
    goto :goto_3

    .line 273
    :cond_9
    move-wide v15, v4

    .line 274
    :goto_3
    if-eqz v0, :cond_a

    .line 275
    .line 276
    invoke-interface {v0}, La/l9s;->d()J

    .line 277
    .line 278
    .line 279
    move-result-wide v4

    .line 280
    :cond_a
    move-wide/from16 v17, v4

    .line 281
    .line 282
    sget-object v21, La/tef0;->a:La/tef0;

    .line 283
    .line 284
    sget-object v0, La/pb10;->c:La/xuz;

    .line 285
    .line 286
    new-instance v11, Lorg/xplatform/related/api/presentation/RelatedParams;

    .line 287
    .line 288
    invoke-direct/range {v11 .. v21}, Lorg/xplatform/related/api/presentation/RelatedParams;-><init>(ZJJJJLa/tef0;)V

    .line 289
    .line 290
    .line 291
    check-cast v3, La/vef0;

    .line 292
    .line 293
    invoke-direct {v2, v9, v11, v3}, La/y730;-><init>(La/udl0;Lorg/xplatform/related/api/presentation/RelatedParams;La/xef0;)V

    .line 294
    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 298
    .line 299
    .line 300
    const/4 v2, 0x0

    .line 301
    :goto_4
    return-object v2

    .line 302
    :pswitch_0
    move-object/from16 v0, p1

    .line 303
    .line 304
    check-cast v0, La/lew;

    .line 305
    .line 306
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    check-cast v1, La/fee;

    .line 314
    .line 315
    iget-wide v11, v0, La/lew;->a:J

    .line 316
    .line 317
    iget-object v8, v0, La/lew;->d:Ljava/util/Map;

    .line 318
    .line 319
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 320
    .line 321
    .line 322
    move-result-object v13

    .line 323
    invoke-virtual {v1, v13}, La/fee;->d(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    check-cast v1, La/fee;

    .line 331
    .line 332
    iget-object v13, v0, La/lew;->b:La/tew;

    .line 333
    .line 334
    iget-object v14, v13, La/tew;->a:La/j0g0;

    .line 335
    .line 336
    if-eqz v14, :cond_d

    .line 337
    .line 338
    iget-object v15, v14, La/j0g0;->a:Ljava/lang/Object;

    .line 339
    .line 340
    instance-of v2, v15, La/g0g0;

    .line 341
    .line 342
    if-eqz v2, :cond_c

    .line 343
    .line 344
    const/4 v15, 0x0

    .line 345
    :cond_c
    check-cast v15, La/new;

    .line 346
    .line 347
    goto :goto_5

    .line 348
    :cond_d
    const/4 v15, 0x0

    .line 349
    :goto_5
    invoke-virtual {v1, v15}, La/fee;->d(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    check-cast v1, La/fee;

    .line 357
    .line 358
    iget-object v2, v13, La/tew;->b:La/j0g0;

    .line 359
    .line 360
    if-eqz v2, :cond_f

    .line 361
    .line 362
    iget-object v2, v2, La/j0g0;->a:Ljava/lang/Object;

    .line 363
    .line 364
    instance-of v13, v2, La/g0g0;

    .line 365
    .line 366
    if-eqz v13, :cond_e

    .line 367
    .line 368
    const/4 v2, 0x0

    .line 369
    :cond_e
    check-cast v2, Ljava/util/List;

    .line 370
    .line 371
    goto :goto_6

    .line 372
    :cond_f
    const/4 v2, 0x0

    .line 373
    :goto_6
    invoke-virtual {v1, v2}, La/fee;->d(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    check-cast v1, La/fee;

    .line 381
    .line 382
    if-eqz v14, :cond_11

    .line 383
    .line 384
    iget-object v2, v14, La/j0g0;->a:Ljava/lang/Object;

    .line 385
    .line 386
    instance-of v13, v2, La/g0g0;

    .line 387
    .line 388
    if-eqz v13, :cond_10

    .line 389
    .line 390
    const/4 v2, 0x0

    .line 391
    :cond_10
    check-cast v2, La/new;

    .line 392
    .line 393
    if-eqz v2, :cond_11

    .line 394
    .line 395
    iget-object v2, v2, La/new;->b:Ljava/util/List;

    .line 396
    .line 397
    if-nez v2, :cond_12

    .line 398
    .line 399
    :cond_11
    sget-object v2, La/iun;->a:La/iun;

    .line 400
    .line 401
    :cond_12
    invoke-virtual {v1, v2}, La/fee;->d(Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    check-cast v1, La/fee;

    .line 409
    .line 410
    invoke-virtual {v1, v0}, La/fee;->d(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    check-cast v0, La/fee;

    .line 418
    .line 419
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 420
    .line 421
    check-cast v9, La/pz40;

    .line 422
    .line 423
    if-eqz v14, :cond_13

    .line 424
    .line 425
    iget-object v1, v14, La/j0g0;->a:Ljava/lang/Object;

    .line 426
    .line 427
    instance-of v1, v1, La/g0g0;

    .line 428
    .line 429
    if-ne v1, v10, :cond_13

    .line 430
    .line 431
    new-instance v1, La/few;

    .line 432
    .line 433
    new-instance v2, La/eew;

    .line 434
    .line 435
    sget-object v13, La/ldm;->b:La/ldm;

    .line 436
    .line 437
    sget-object v3, La/pb10;->c:La/xuz;

    .line 438
    .line 439
    const-wide/16 v4, 0x2e

    .line 440
    .line 441
    sget-object v6, La/pb10;->v:La/pb10;

    .line 442
    .line 443
    invoke-static {v4, v5, v6}, La/ozb;->J(JLa/pb10;)La/pb10;

    .line 444
    .line 445
    .line 446
    move-result-object v4

    .line 447
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    iget v11, v4, La/pb10;->a:I

    .line 451
    .line 452
    new-instance v10, La/mdm;

    .line 453
    .line 454
    const-wide/16 v21, 0x0

    .line 455
    .line 456
    const/16 v23, 0x25a

    .line 457
    .line 458
    const/4 v12, 0x0

    .line 459
    const/4 v14, 0x0

    .line 460
    const/4 v15, 0x0

    .line 461
    const v16, 0x7f130677

    .line 462
    .line 463
    .line 464
    const/16 v17, 0x0

    .line 465
    .line 466
    const v18, 0x7f131690

    .line 467
    .line 468
    .line 469
    const-wide/16 v19, 0x2710

    .line 470
    .line 471
    invoke-direct/range {v10 .. v23}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 472
    .line 473
    .line 474
    invoke-direct {v2, v10}, La/eew;-><init>(La/mdm;)V

    .line 475
    .line 476
    .line 477
    invoke-direct {v1, v2}, La/few;-><init>(La/jwb;)V

    .line 478
    .line 479
    .line 480
    goto/16 :goto_b

    .line 481
    .line 482
    :cond_13
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    invoke-interface {v8, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    check-cast v1, La/edw;

    .line 491
    .line 492
    if-eqz v1, :cond_15

    .line 493
    .line 494
    iget-object v1, v1, La/edw;->b:Ljava/lang/Object;

    .line 495
    .line 496
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 497
    .line 498
    instance-of v2, v1, La/g0g0;

    .line 499
    .line 500
    if-eqz v2, :cond_14

    .line 501
    .line 502
    const/4 v1, 0x0

    .line 503
    :cond_14
    check-cast v1, La/m9s;

    .line 504
    .line 505
    goto :goto_7

    .line 506
    :cond_15
    const/4 v1, 0x0

    .line 507
    :goto_7
    if-nez v1, :cond_18

    .line 508
    .line 509
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    invoke-interface {v8, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    check-cast v1, La/edw;

    .line 518
    .line 519
    if-eqz v1, :cond_17

    .line 520
    .line 521
    iget-object v1, v1, La/edw;->a:Ljava/lang/Object;

    .line 522
    .line 523
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 524
    .line 525
    instance-of v2, v1, La/g0g0;

    .line 526
    .line 527
    if-eqz v2, :cond_16

    .line 528
    .line 529
    const/4 v1, 0x0

    .line 530
    :cond_16
    check-cast v1, La/m9s;

    .line 531
    .line 532
    goto :goto_8

    .line 533
    :cond_17
    const/4 v1, 0x0

    .line 534
    :goto_8
    if-eqz v1, :cond_1b

    .line 535
    .line 536
    :cond_18
    if-eqz v14, :cond_1a

    .line 537
    .line 538
    iget-object v1, v14, La/j0g0;->a:Ljava/lang/Object;

    .line 539
    .line 540
    instance-of v2, v1, La/g0g0;

    .line 541
    .line 542
    if-eqz v2, :cond_19

    .line 543
    .line 544
    const/4 v2, 0x0

    .line 545
    goto :goto_9

    .line 546
    :cond_19
    move-object v2, v1

    .line 547
    :goto_9
    check-cast v2, La/new;

    .line 548
    .line 549
    goto :goto_a

    .line 550
    :cond_1a
    const/4 v2, 0x0

    .line 551
    :goto_a
    if-nez v2, :cond_1c

    .line 552
    .line 553
    :cond_1b
    new-instance v1, La/few;

    .line 554
    .line 555
    invoke-static {}, La/bfw;->a()La/eew;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    invoke-direct {v1, v2}, La/few;-><init>(La/jwb;)V

    .line 560
    .line 561
    .line 562
    goto :goto_b

    .line 563
    :cond_1c
    new-instance v1, La/few;

    .line 564
    .line 565
    new-instance v2, La/dew;

    .line 566
    .line 567
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 568
    .line 569
    .line 570
    move-result-object v7

    .line 571
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v4

    .line 575
    check-cast v4, La/fee;

    .line 576
    .line 577
    invoke-virtual {v4}, La/fee;->b()Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v4

    .line 581
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v4

    .line 588
    check-cast v4, La/fee;

    .line 589
    .line 590
    invoke-virtual {v4}, La/fee;->b()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v4

    .line 594
    check-cast v4, Ljava/util/Collection;

    .line 595
    .line 596
    invoke-virtual {v7, v4}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 597
    .line 598
    .line 599
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v4

    .line 603
    check-cast v4, La/fee;

    .line 604
    .line 605
    invoke-virtual {v4}, La/fee;->b()Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v4

    .line 609
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    check-cast v3, La/wf60;

    .line 613
    .line 614
    invoke-virtual {v7, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    invoke-static {v7}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 618
    .line 619
    .line 620
    move-result-object v3

    .line 621
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    invoke-static {v3}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 626
    .line 627
    .line 628
    move-result-object v3

    .line 629
    invoke-direct {v2, v3}, La/dew;-><init>(La/l7m0;)V

    .line 630
    .line 631
    .line 632
    invoke-direct {v1, v2}, La/few;-><init>(La/jwb;)V

    .line 633
    .line 634
    .line 635
    :goto_b
    check-cast v9, La/hgk0;

    .line 636
    .line 637
    invoke-virtual {v9, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 638
    .line 639
    .line 640
    new-instance v1, La/zew;

    .line 641
    .line 642
    invoke-direct {v1, v0, v9}, La/zew;-><init>(La/l7m0;La/l7m0;)V

    .line 643
    .line 644
    .line 645
    return-object v1

    .line 646
    nop

    .line 647
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
