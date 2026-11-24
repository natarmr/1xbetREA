.class public final La/gfg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final synthetic a:B

.field public final b:La/g2v;

.field public final c:La/ctf0;

.field public final d:La/n0o0;

.field public final e:La/n0o0;

.field public final f:La/n0o0;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/dfg;La/ctf0;La/g2v;La/y78;)V
    .locals 3

    const/4 v0, 0x0

    iput-byte v0, p0, La/gfg;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 197
    iput-object p1, p0, La/gfg;->g:Ljava/lang/Object;

    .line 198
    iput-object p2, p0, La/gfg;->c:La/ctf0;

    .line 199
    iput-object p3, p0, La/gfg;->b:La/g2v;

    .line 200
    iput-object p4, p0, La/gfg;->h:Ljava/lang/Object;

    .line 201
    iget-boolean p2, p1, La/dfg;->g:Z

    .line 202
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    move-result-object p2

    iput-object p2, p0, La/gfg;->d:La/n0o0;

    .line 203
    iget-object p1, p1, La/dfg;->c:La/j0g0;

    .line 204
    const-string p2, ""

    const/4 p3, 0x0

    if-eqz p1, :cond_2

    .line 205
    iget-object p4, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 206
    instance-of v1, p4, La/g0g0;

    if-eqz v1, :cond_0

    move-object p4, p3

    .line 207
    :cond_0
    check-cast p4, La/bfg;

    if-eqz p4, :cond_2

    .line 208
    iget-object p4, p4, La/bfg;->b:La/j0g0;

    if-eqz p4, :cond_2

    .line 209
    iget-object p4, p4, La/j0g0;->a:Ljava/lang/Object;

    .line 210
    new-instance v1, La/fcg;

    .line 211
    sget-object v2, La/iun;->a:La/iun;

    .line 212
    invoke-direct {v1, v2, p2}, La/fcg;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 213
    instance-of v2, p4, La/g0g0;

    if-eqz v2, :cond_1

    move-object p4, v1

    .line 214
    :cond_1
    check-cast p4, La/fcg;

    goto :goto_0

    :cond_2
    move-object p4, p3

    .line 215
    :goto_0
    new-instance v1, La/ffg;

    invoke-direct {v1, p0, v0}, La/ffg;-><init>(La/gfg;B)V

    .line 216
    new-instance v0, La/yw9;

    const/16 v2, 0x14

    invoke-direct {v0, p4, v1, v2}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p4

    .line 217
    iput-object p4, p0, La/gfg;->e:La/n0o0;

    if-eqz p1, :cond_5

    .line 218
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 219
    instance-of p4, p1, La/g0g0;

    if-eqz p4, :cond_3

    move-object p1, p3

    .line 220
    :cond_3
    check-cast p1, La/bfg;

    if-eqz p1, :cond_5

    .line 221
    iget-object p1, p1, La/bfg;->c:La/j0g0;

    if-eqz p1, :cond_5

    .line 222
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 223
    new-instance p3, La/fcg;

    .line 224
    sget-object p4, La/iun;->a:La/iun;

    .line 225
    invoke-direct {p3, p4, p2}, La/fcg;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 226
    instance-of p2, p1, La/g0g0;

    if-eqz p2, :cond_4

    move-object p1, p3

    .line 227
    :cond_4
    move-object p3, p1

    check-cast p3, La/fcg;

    .line 228
    :cond_5
    new-instance p1, La/ffg;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, La/ffg;-><init>(La/gfg;B)V

    .line 229
    new-instance p2, La/yw9;

    invoke-direct {p2, p3, p1, v2}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    .line 230
    iput-object p1, p0, La/gfg;->f:La/n0o0;

    return-void
.end method

.method public constructor <init>(La/upu0;La/ctf0;La/g2v;La/y78;)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, La/gfg;->a:B

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
    iput-object p1, p0, La/gfg;->g:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, p0, La/gfg;->c:La/ctf0;

    .line 13
    .line 14
    iput-object p3, p0, La/gfg;->b:La/g2v;

    .line 15
    .line 16
    iput-object p4, p0, La/gfg;->h:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p1, p1, La/upu0;->c:La/j0g0;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    iget-object p3, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    instance-of p4, p3, La/g0g0;

    .line 26
    .line 27
    if-eqz p4, :cond_0

    .line 28
    .line 29
    move-object p3, p2

    .line 30
    :cond_0
    check-cast p3, La/fqu0;

    .line 31
    .line 32
    if-eqz p3, :cond_2

    .line 33
    .line 34
    iget-object p3, p3, La/fqu0;->c:La/j0g0;

    .line 35
    .line 36
    iget-object p3, p3, La/j0g0;->a:Ljava/lang/Object;

    .line 37
    .line 38
    instance-of p4, p3, La/g0g0;

    .line 39
    .line 40
    if-eqz p4, :cond_1

    .line 41
    .line 42
    move-object p3, p2

    .line 43
    :cond_1
    check-cast p3, Ljava/util/List;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object p3, p2

    .line 47
    :goto_0
    if-nez p3, :cond_3

    .line 48
    .line 49
    sget-object p3, La/iun;->a:La/iun;

    .line 50
    .line 51
    :cond_3
    new-instance p4, La/ypu0;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    invoke-direct {p4, p0, v0}, La/ypu0;-><init>(La/gfg;B)V

    .line 55
    .line 56
    .line 57
    new-instance v0, La/yw9;

    .line 58
    .line 59
    const/16 v1, 0x14

    .line 60
    .line 61
    invoke-direct {v0, p3, p4, v1}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    iput-object p3, p0, La/gfg;->d:La/n0o0;

    .line 69
    .line 70
    if-eqz p1, :cond_6

    .line 71
    .line 72
    iget-object p3, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 73
    .line 74
    instance-of p4, p3, La/g0g0;

    .line 75
    .line 76
    if-eqz p4, :cond_4

    .line 77
    .line 78
    move-object p3, p2

    .line 79
    :cond_4
    check-cast p3, La/fqu0;

    .line 80
    .line 81
    if-eqz p3, :cond_6

    .line 82
    .line 83
    iget-object p3, p3, La/fqu0;->a:La/j0g0;

    .line 84
    .line 85
    iget-object p3, p3, La/j0g0;->a:Ljava/lang/Object;

    .line 86
    .line 87
    instance-of p4, p3, La/g0g0;

    .line 88
    .line 89
    if-eqz p4, :cond_5

    .line 90
    .line 91
    move-object p3, p2

    .line 92
    :cond_5
    check-cast p3, Ljava/util/List;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_6
    move-object p3, p2

    .line 96
    :goto_1
    if-nez p3, :cond_7

    .line 97
    .line 98
    sget-object p3, La/iun;->a:La/iun;

    .line 99
    .line 100
    :cond_7
    new-instance p4, La/ypu0;

    .line 101
    .line 102
    const/4 v0, 0x1

    .line 103
    invoke-direct {p4, p0, v0}, La/ypu0;-><init>(La/gfg;B)V

    .line 104
    .line 105
    .line 106
    new-instance v0, La/yw9;

    .line 107
    .line 108
    invoke-direct {v0, p3, p4, v1}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 109
    .line 110
    .line 111
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    iput-object p3, p0, La/gfg;->e:La/n0o0;

    .line 116
    .line 117
    if-eqz p1, :cond_a

    .line 118
    .line 119
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 120
    .line 121
    instance-of p3, p1, La/g0g0;

    .line 122
    .line 123
    if-eqz p3, :cond_8

    .line 124
    .line 125
    move-object p1, p2

    .line 126
    :cond_8
    check-cast p1, La/fqu0;

    .line 127
    .line 128
    if-eqz p1, :cond_a

    .line 129
    .line 130
    iget-object p1, p1, La/fqu0;->b:La/j0g0;

    .line 131
    .line 132
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 133
    .line 134
    instance-of p3, p1, La/g0g0;

    .line 135
    .line 136
    if-eqz p3, :cond_9

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_9
    move-object p2, p1

    .line 140
    :goto_2
    check-cast p2, Ljava/util/List;

    .line 141
    .line 142
    :cond_a
    if-nez p2, :cond_b

    .line 143
    .line 144
    sget-object p2, La/iun;->a:La/iun;

    .line 145
    .line 146
    :cond_b
    new-instance p1, La/ypu0;

    .line 147
    .line 148
    const/4 p3, 0x2

    .line 149
    invoke-direct {p1, p0, p3}, La/ypu0;-><init>(La/gfg;B)V

    .line 150
    .line 151
    .line 152
    new-instance p3, La/yw9;

    .line 153
    .line 154
    invoke-direct {p3, p2, p1, v1}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 155
    .line 156
    .line 157
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iput-object p1, p0, La/gfg;->f:La/n0o0;

    .line 162
    .line 163
    return-void
.end method

.method public constructor <init>(La/wap0;La/ctf0;La/g2v;Ljava/util/Locale;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/gfg;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 183
    iput-object p1, p0, La/gfg;->g:Ljava/lang/Object;

    .line 184
    iput-object p2, p0, La/gfg;->c:La/ctf0;

    .line 185
    iput-object p3, p0, La/gfg;->b:La/g2v;

    .line 186
    iput-object p4, p0, La/gfg;->h:Ljava/lang/Object;

    .line 187
    new-instance p2, La/caz;

    const/16 p3, 0x14

    invoke-direct {p2, p0, p3}, La/caz;-><init>(Ljava/lang/Object;B)V

    .line 188
    new-instance p4, La/yw9;

    const/4 v0, 0x0

    invoke-direct {p4, v0, p2, p3}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {p4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p2

    .line 189
    iput-object p2, p0, La/gfg;->d:La/n0o0;

    .line 190
    new-instance p2, La/yap0;

    const/4 p4, 0x0

    invoke-direct {p2, p0, p4}, La/yap0;-><init>(La/gfg;B)V

    .line 191
    new-instance p4, La/yw9;

    invoke-direct {p4, p1, p2, p3}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {p4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p2

    .line 192
    iput-object p2, p0, La/gfg;->e:La/n0o0;

    .line 193
    new-instance p2, La/yap0;

    const/4 p4, 0x1

    invoke-direct {p2, p0, p4}, La/yap0;-><init>(La/gfg;B)V

    .line 194
    new-instance p4, La/yw9;

    invoke-direct {p4, p1, p2, p3}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {p4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    .line 195
    iput-object p1, p0, La/gfg;->f:La/n0o0;

    return-void
.end method

.method public constructor <init>(La/yc40;La/g2v;La/ctf0;)V
    .locals 2

    const/4 v0, 0x1

    iput-byte v0, p0, La/gfg;->a:B

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 165
    iput-object p1, p0, La/gfg;->g:Ljava/lang/Object;

    .line 166
    iput-object p2, p0, La/gfg;->b:La/g2v;

    .line 167
    iput-object p3, p0, La/gfg;->c:La/ctf0;

    .line 168
    iget-object p2, p1, La/yc40;->a:La/xb40;

    .line 169
    invoke-static {p2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    move-result-object p2

    iput-object p2, p0, La/gfg;->d:La/n0o0;

    .line 170
    iget-boolean p2, p1, La/yc40;->d:Z

    .line 171
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    move-result-object p2

    iput-object p2, p0, La/gfg;->e:La/n0o0;

    .line 172
    iget-object p1, p1, La/yc40;->c:La/j0g0;

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    .line 173
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 174
    instance-of p3, p1, La/g0g0;

    if-eqz p3, :cond_0

    move-object p1, p2

    .line 175
    :cond_0
    check-cast p1, Ljava/util/List;

    goto :goto_0

    :cond_1
    move-object p1, p2

    .line 176
    :goto_0
    new-instance p3, La/b530;

    const/16 v0, 0xa

    invoke-direct {p3, p0, v0}, La/b530;-><init>(Ljava/lang/Object;B)V

    .line 177
    new-instance v0, La/yw9;

    const/16 v1, 0x14

    invoke-direct {v0, p1, p3, v1}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    .line 178
    iput-object p1, p0, La/gfg;->f:La/n0o0;

    .line 179
    new-instance p1, La/caz;

    const/4 p3, 0x4

    invoke-direct {p1, p0, p3}, La/caz;-><init>(Ljava/lang/Object;B)V

    .line 180
    new-instance p3, La/yw9;

    invoke-direct {p3, p2, p1, v1}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    .line 181
    iput-object p1, p0, La/gfg;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gfg;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x7

    .line 7
    iget-object v4, v0, La/gfg;->g:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v5, ""

    .line 10
    .line 11
    const-wide/16 v6, -0x1

    .line 12
    .line 13
    iget-object v8, v0, La/gfg;->d:La/n0o0;

    .line 14
    .line 15
    iget-object v9, v0, La/gfg;->f:La/n0o0;

    .line 16
    .line 17
    iget-object v10, v0, La/gfg;->e:La/n0o0;

    .line 18
    .line 19
    iget-object v11, v0, La/gfg;->b:La/g2v;

    .line 20
    .line 21
    const/4 v12, 0x1

    .line 22
    const/4 v13, 0x0

    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, La/upu0;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v2, La/xpu0;

    .line 34
    .line 35
    iget-boolean v3, v1, La/upu0;->e:Z

    .line 36
    .line 37
    iget-object v4, v1, La/upu0;->a:Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;

    .line 38
    .line 39
    new-instance v8, La/wpu0;

    .line 40
    .line 41
    new-instance v9, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget v10, v4, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;->b:I

    .line 49
    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    const-string v5, "Tablet"

    .line 53
    .line 54
    :cond_0
    new-instance v14, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v15, "static/img/ImgDefault/Esports/virtualCategories/header/"

    .line 57
    .line 58
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v5, ".png"

    .line 68
    .line 69
    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    if-nez v10, :cond_1

    .line 81
    .line 82
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v5, v10, v13}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    if-nez v10, :cond_4

    .line 93
    .line 94
    const-string v10, "https://"

    .line 95
    .line 96
    invoke-static {v5, v10, v13}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    if-eqz v10, :cond_2

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    const/16 v14, 0x2f

    .line 108
    .line 109
    if-lez v10, :cond_3

    .line 110
    .line 111
    const-string v10, "/"

    .line 112
    .line 113
    invoke-static {v9, v10}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-nez v10, :cond_3

    .line 118
    .line 119
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    :cond_3
    new-array v10, v12, [C

    .line 123
    .line 124
    aput-char v14, v10, v13

    .line 125
    .line 126
    invoke-static {v5, v10}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_4
    :goto_0
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    :goto_1
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    if-eqz v3, :cond_5

    .line 145
    .line 146
    const v3, 0x7f08045e

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_5
    const v3, 0x7f080459

    .line 151
    .line 152
    .line 153
    :goto_2
    iget-object v4, v4, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;->c:Ljava/lang/String;

    .line 154
    .line 155
    invoke-direct {v8, v5, v3, v4}, La/wpu0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 156
    .line 157
    .line 158
    iget-object v3, v1, La/upu0;->b:La/sff0;

    .line 159
    .line 160
    iget-object v3, v3, La/sff0;->g:La/mum0;

    .line 161
    .line 162
    iget-object v3, v3, La/mum0;->y:La/v5l0;

    .line 163
    .line 164
    iget-object v4, v1, La/upu0;->c:La/j0g0;

    .line 165
    .line 166
    new-instance v5, La/ugu0;

    .line 167
    .line 168
    const/4 v9, 0x3

    .line 169
    invoke-direct {v5, v0, v1, v9}, La/ugu0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 170
    .line 171
    .line 172
    sget-object v0, La/gpu0;->a:La/gpu0;

    .line 173
    .line 174
    if-eqz v4, :cond_c

    .line 175
    .line 176
    iget-object v1, v4, La/j0g0;->a:Ljava/lang/Object;

    .line 177
    .line 178
    instance-of v3, v1, La/g0g0;

    .line 179
    .line 180
    if-nez v3, :cond_a

    .line 181
    .line 182
    :try_start_0
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 183
    .line 184
    check-cast v1, La/fqu0;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    iget-object v3, v1, La/fqu0;->b:La/j0g0;

    .line 190
    .line 191
    iget-object v1, v1, La/fqu0;->c:La/j0g0;

    .line 192
    .line 193
    filled-new-array {v3, v1}, [La/j0g0;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    if-eqz v1, :cond_6

    .line 202
    .line 203
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    if-eqz v3, :cond_6

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-eqz v3, :cond_9

    .line 219
    .line 220
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    check-cast v3, La/j0g0;

    .line 225
    .line 226
    if-eqz v3, :cond_7

    .line 227
    .line 228
    iget-object v3, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 229
    .line 230
    instance-of v3, v3, La/g0g0;

    .line 231
    .line 232
    if-ne v3, v12, :cond_7

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_7
    invoke-virtual {v5}, La/ugu0;->invoke()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    check-cast v1, La/a4x;

    .line 240
    .line 241
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    if-nez v3, :cond_8

    .line 246
    .line 247
    new-instance v3, La/spu0;

    .line 248
    .line 249
    invoke-direct {v3, v0, v1, v13}, La/spu0;-><init>(La/ipu0;La/a4x;Z)V

    .line 250
    .line 251
    .line 252
    goto :goto_5

    .line 253
    :catchall_0
    move-exception v0

    .line 254
    goto :goto_6

    .line 255
    :cond_8
    new-instance v3, La/spu0;

    .line 256
    .line 257
    new-instance v0, La/hpu0;

    .line 258
    .line 259
    invoke-static {v6, v7, v11}, La/ozb;->P(JLa/g2v;)La/mdm;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-direct {v0, v1}, La/hpu0;-><init>(La/mdm;)V

    .line 264
    .line 265
    .line 266
    invoke-direct {v3, v0}, La/spu0;-><init>(La/hpu0;)V

    .line 267
    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_9
    :goto_4
    new-instance v3, La/spu0;

    .line 271
    .line 272
    new-instance v0, La/hpu0;

    .line 273
    .line 274
    invoke-static {v6, v7, v11}, La/ozb;->Q(JLa/g2v;)La/mdm;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-direct {v0, v1}, La/hpu0;-><init>(La/mdm;)V

    .line 279
    .line 280
    .line 281
    invoke-direct {v3, v0}, La/spu0;-><init>(La/hpu0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 282
    .line 283
    .line 284
    :goto_5
    move-object v1, v3

    .line 285
    goto :goto_7

    .line 286
    :goto_6
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 287
    .line 288
    new-instance v1, La/g0g0;

    .line 289
    .line 290
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 291
    .line 292
    .line 293
    :cond_a
    :goto_7
    invoke-static {v1}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    if-nez v0, :cond_b

    .line 298
    .line 299
    goto :goto_8

    .line 300
    :cond_b
    new-instance v1, La/spu0;

    .line 301
    .line 302
    new-instance v0, La/hpu0;

    .line 303
    .line 304
    invoke-static {v6, v7, v11}, La/ozb;->Q(JLa/g2v;)La/mdm;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    invoke-direct {v0, v3}, La/hpu0;-><init>(La/mdm;)V

    .line 309
    .line 310
    .line 311
    invoke-direct {v1, v0}, La/spu0;-><init>(La/hpu0;)V

    .line 312
    .line 313
    .line 314
    :goto_8
    check-cast v1, La/spu0;

    .line 315
    .line 316
    goto/16 :goto_9

    .line 317
    .line 318
    :cond_c
    new-instance v1, La/spu0;

    .line 319
    .line 320
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    new-instance v5, La/qpu0;

    .line 325
    .line 326
    new-instance v6, La/ijm;

    .line 327
    .line 328
    invoke-direct {v6}, La/ijm;-><init>()V

    .line 329
    .line 330
    .line 331
    const-string v7, "shimmer_header_1"

    .line 332
    .line 333
    invoke-direct {v5, v7, v6}, La/qpu0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    new-instance v5, La/jpu0;

    .line 340
    .line 341
    const-string v6, "shimmer_category_card_collection"

    .line 342
    .line 343
    sget-object v7, La/x3b;->a:La/x3b;

    .line 344
    .line 345
    invoke-direct {v5, v6, v7}, La/jpu0;-><init>(Ljava/lang/String;La/y3b;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    new-instance v5, La/qpu0;

    .line 352
    .line 353
    new-instance v6, La/ijm;

    .line 354
    .line 355
    invoke-direct {v6}, La/ijm;-><init>()V

    .line 356
    .line 357
    .line 358
    const-string v7, "shimmer_header_2"

    .line 359
    .line 360
    invoke-direct {v5, v7, v6}, La/qpu0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    const-string v5, "shimmer_games_virtual_main_1"

    .line 367
    .line 368
    invoke-static {v3, v5}, La/qem0;->q(La/v5l0;Ljava/lang/String;)La/epu0;

    .line 369
    .line 370
    .line 371
    move-result-object v5

    .line 372
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    new-instance v5, La/qpu0;

    .line 376
    .line 377
    new-instance v6, La/ijm;

    .line 378
    .line 379
    invoke-direct {v6}, La/ijm;-><init>()V

    .line 380
    .line 381
    .line 382
    const-string v7, "shimmer_header_3"

    .line 383
    .line 384
    invoke-direct {v5, v7, v6}, La/qpu0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    const-string v5, "shimmer_games_virtual_main_2"

    .line 391
    .line 392
    invoke-static {v3, v5}, La/qem0;->q(La/v5l0;Ljava/lang/String;)La/epu0;

    .line 393
    .line 394
    .line 395
    move-result-object v5

    .line 396
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    new-instance v5, La/qpu0;

    .line 400
    .line 401
    new-instance v6, La/ijm;

    .line 402
    .line 403
    invoke-direct {v6}, La/ijm;-><init>()V

    .line 404
    .line 405
    .line 406
    const-string v7, "shimmer_header_4"

    .line 407
    .line 408
    invoke-direct {v5, v7, v6}, La/qpu0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v4, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    const-string v5, "shimmer_games_virtual_main_3"

    .line 415
    .line 416
    invoke-static {v3, v5}, La/qem0;->q(La/v5l0;Ljava/lang/String;)La/epu0;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    invoke-virtual {v4, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    new-instance v3, La/qpu0;

    .line 424
    .line 425
    new-instance v5, La/ijm;

    .line 426
    .line 427
    invoke-direct {v5}, La/ijm;-><init>()V

    .line 428
    .line 429
    .line 430
    const-string v6, "shimmer_header_5"

    .line 431
    .line 432
    invoke-direct {v3, v6, v5}, La/qpu0;-><init>(Ljava/lang/String;La/jjm;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v4, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    new-instance v3, La/fpu0;

    .line 439
    .line 440
    const-string v5, "shimmer_banner_1"

    .line 441
    .line 442
    sget-object v6, La/urm;->a:La/urm;

    .line 443
    .line 444
    invoke-direct {v3, v5, v6}, La/fpu0;-><init>(Ljava/lang/String;La/vrm;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v4, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    new-instance v3, La/fpu0;

    .line 451
    .line 452
    const-string v5, "shimmer_banner_2"

    .line 453
    .line 454
    invoke-direct {v3, v5, v6}, La/fpu0;-><init>(Ljava/lang/String;La/vrm;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v4, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    new-instance v3, La/fpu0;

    .line 461
    .line 462
    const-string v5, "shimmer_banner_3"

    .line 463
    .line 464
    invoke-direct {v3, v5, v6}, La/fpu0;-><init>(Ljava/lang/String;La/vrm;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v4, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    invoke-static {v4}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    invoke-direct {v1, v0, v3, v12}, La/spu0;-><init>(La/ipu0;La/a4x;Z)V

    .line 479
    .line 480
    .line 481
    :goto_9
    invoke-direct {v2, v8, v1}, La/xpu0;-><init>(La/wpu0;La/spu0;)V

    .line 482
    .line 483
    .line 484
    return-object v2

    .line 485
    :pswitch_0
    move-object/from16 v0, p1

    .line 486
    .line 487
    check-cast v0, La/wap0;

    .line 488
    .line 489
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v10}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    check-cast v1, La/fee;

    .line 497
    .line 498
    invoke-virtual {v1, v0}, La/fee;->d(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    check-cast v1, La/fee;

    .line 506
    .line 507
    invoke-virtual {v1, v0}, La/fee;->d(Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    iget-object v1, v0, La/wap0;->c:La/j0g0;

    .line 511
    .line 512
    iget-boolean v0, v0, La/wap0;->a:Z

    .line 513
    .line 514
    if-nez v1, :cond_d

    .line 515
    .line 516
    if-eqz v0, :cond_d

    .line 517
    .line 518
    move/from16 v19, v12

    .line 519
    .line 520
    goto :goto_a

    .line 521
    :cond_d
    move/from16 v19, v13

    .line 522
    .line 523
    :goto_a
    if-eqz v19, :cond_f

    .line 524
    .line 525
    check-cast v4, La/wap0;

    .line 526
    .line 527
    iget-object v1, v4, La/wap0;->d:La/sff0;

    .line 528
    .line 529
    iget-object v1, v1, La/sff0;->g:La/mum0;

    .line 530
    .line 531
    iget-object v1, v1, La/mum0;->y:La/v5l0;

    .line 532
    .line 533
    sget-object v2, La/q0s;->a:La/q0s;

    .line 534
    .line 535
    new-instance v4, Ljava/util/ArrayList;

    .line 536
    .line 537
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 538
    .line 539
    .line 540
    move v5, v13

    .line 541
    :goto_b
    if-ge v5, v3, :cond_e

    .line 542
    .line 543
    invoke-static {v1}, La/pzw;->I(La/v5l0;)La/w0g0;

    .line 544
    .line 545
    .line 546
    move-result-object v9

    .line 547
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    add-int/lit8 v5, v5, 0x1

    .line 551
    .line 552
    goto :goto_b

    .line 553
    :cond_e
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    new-instance v3, La/vb90;

    .line 558
    .line 559
    invoke-direct {v3, v2, v1, v13, v12}, La/vb90;-><init>(La/q0s;La/a4x;ZZ)V

    .line 560
    .line 561
    .line 562
    new-instance v1, La/dap0;

    .line 563
    .line 564
    const-string v2, "RESULT_CARD_SHIMMER_KEY"

    .line 565
    .line 566
    invoke-direct {v1, v2, v3}, La/dap0;-><init>(Ljava/lang/String;La/vb90;)V

    .line 567
    .line 568
    .line 569
    filled-new-array {v1}, [La/dap0;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    invoke-static {v1}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    :goto_c
    move-object/from16 v18, v1

    .line 578
    .line 579
    goto :goto_d

    .line 580
    :cond_f
    if-eqz v1, :cond_10

    .line 581
    .line 582
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    check-cast v1, La/fee;

    .line 587
    .line 588
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    check-cast v1, Ljava/lang/Iterable;

    .line 593
    .line 594
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    goto :goto_c

    .line 599
    :cond_10
    sget-object v1, La/lak0;->c:La/lak0;

    .line 600
    .line 601
    goto :goto_c

    .line 602
    :goto_d
    new-instance v14, La/xap0;

    .line 603
    .line 604
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    check-cast v1, La/fee;

    .line 609
    .line 610
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    move-object v15, v1

    .line 615
    check-cast v15, La/p9p0;

    .line 616
    .line 617
    invoke-virtual {v10}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v1

    .line 621
    check-cast v1, La/fee;

    .line 622
    .line 623
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    move-object/from16 v16, v1

    .line 628
    .line 629
    check-cast v16, La/r8p0;

    .line 630
    .line 631
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->isEmpty()Z

    .line 632
    .line 633
    .line 634
    move-result v1

    .line 635
    if-eqz v1, :cond_11

    .line 636
    .line 637
    if-nez v0, :cond_11

    .line 638
    .line 639
    new-instance v0, La/pap0;

    .line 640
    .line 641
    invoke-static {v6, v7, v11}, La/ozb;->Q(JLa/g2v;)La/mdm;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    invoke-direct {v0, v1}, La/pap0;-><init>(La/mdm;)V

    .line 646
    .line 647
    .line 648
    :goto_e
    move-object/from16 v17, v0

    .line 649
    .line 650
    goto :goto_f

    .line 651
    :cond_11
    if-eqz v1, :cond_12

    .line 652
    .line 653
    new-instance v0, La/pap0;

    .line 654
    .line 655
    invoke-static {v6, v7, v11}, La/ozb;->P(JLa/g2v;)La/mdm;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    invoke-direct {v0, v1}, La/pap0;-><init>(La/mdm;)V

    .line 660
    .line 661
    .line 662
    goto :goto_e

    .line 663
    :cond_12
    sget-object v0, La/oap0;->a:La/oap0;

    .line 664
    .line 665
    goto :goto_e

    .line 666
    :goto_f
    invoke-direct/range {v14 .. v19}, La/xap0;-><init>(La/p9p0;La/r8p0;La/qap0;La/a4x;Z)V

    .line 667
    .line 668
    .line 669
    return-object v14

    .line 670
    :pswitch_1
    iget-object v0, v0, La/gfg;->h:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast v0, La/n0o0;

    .line 673
    .line 674
    move-object/from16 v1, p1

    .line 675
    .line 676
    check-cast v1, La/yc40;

    .line 677
    .line 678
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v4

    .line 685
    check-cast v4, La/fee;

    .line 686
    .line 687
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 691
    .line 692
    .line 693
    move-result-object v5

    .line 694
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 695
    .line 696
    .line 697
    move-result-object v4

    .line 698
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v4

    .line 702
    check-cast v4, La/xb40;

    .line 703
    .line 704
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    iget-object v4, v1, La/yc40;->a:La/xb40;

    .line 708
    .line 709
    invoke-interface {v5, v4}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v10}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v4

    .line 716
    check-cast v4, La/fee;

    .line 717
    .line 718
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 722
    .line 723
    .line 724
    move-result-object v5

    .line 725
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 726
    .line 727
    .line 728
    move-result-object v4

    .line 729
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v4

    .line 733
    check-cast v4, Ljava/lang/Boolean;

    .line 734
    .line 735
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    iget-boolean v4, v1, La/yc40;->d:Z

    .line 739
    .line 740
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 741
    .line 742
    .line 743
    move-result-object v4

    .line 744
    invoke-interface {v5, v4}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    iget-object v4, v1, La/yc40;->c:La/j0g0;

    .line 748
    .line 749
    if-nez v4, :cond_13

    .line 750
    .line 751
    iget-boolean v1, v1, La/yc40;->e:Z

    .line 752
    .line 753
    if-nez v1, :cond_13

    .line 754
    .line 755
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    check-cast v0, La/fee;

    .line 760
    .line 761
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 762
    .line 763
    invoke-static {v0, v11}, La/n6x;->r(La/l7m0;La/g2v;)La/ad40;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    goto/16 :goto_12

    .line 768
    .line 769
    :cond_13
    sget-object v1, La/db40;->a:La/db40;

    .line 770
    .line 771
    if-nez v4, :cond_15

    .line 772
    .line 773
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    check-cast v0, La/fee;

    .line 778
    .line 779
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 780
    .line 781
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    new-instance v2, La/ad40;

    .line 785
    .line 786
    new-instance v4, La/oc40;

    .line 787
    .line 788
    new-instance v5, Ljava/util/ArrayList;

    .line 789
    .line 790
    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 791
    .line 792
    .line 793
    :goto_10
    if-ge v13, v3, :cond_14

    .line 794
    .line 795
    new-instance v6, La/ub40;

    .line 796
    .line 797
    const-string v7, "META_CHARACTER_CARD_SHIMMER_KEY"

    .line 798
    .line 799
    invoke-static {v13, v7}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 800
    .line 801
    .line 802
    move-result-object v7

    .line 803
    sget-object v8, La/la40;->a:La/la40;

    .line 804
    .line 805
    invoke-direct {v6, v7, v8}, La/ub40;-><init>(Ljava/lang/String;La/ma40;)V

    .line 806
    .line 807
    .line 808
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 809
    .line 810
    .line 811
    add-int/lit8 v13, v13, 0x1

    .line 812
    .line 813
    goto :goto_10

    .line 814
    :cond_14
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 815
    .line 816
    .line 817
    move-result-object v3

    .line 818
    invoke-direct {v4, v1, v3}, La/oc40;-><init>(La/fb40;La/a4x;)V

    .line 819
    .line 820
    .line 821
    invoke-direct {v2, v0, v4}, La/ad40;-><init>(La/l7m0;La/oc40;)V

    .line 822
    .line 823
    .line 824
    move-object v0, v2

    .line 825
    goto/16 :goto_12

    .line 826
    .line 827
    :cond_15
    iget-object v3, v4, La/j0g0;->a:Ljava/lang/Object;

    .line 828
    .line 829
    instance-of v4, v3, La/g0g0;

    .line 830
    .line 831
    if-eqz v4, :cond_16

    .line 832
    .line 833
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    check-cast v0, La/fee;

    .line 838
    .line 839
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 840
    .line 841
    invoke-static {v0, v11}, La/n6x;->r(La/l7m0;La/g2v;)La/ad40;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    goto :goto_12

    .line 846
    :cond_16
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v4

    .line 850
    check-cast v4, La/fee;

    .line 851
    .line 852
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 853
    .line 854
    .line 855
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 856
    .line 857
    .line 858
    move-result-object v5

    .line 859
    invoke-virtual {v4}, La/fee;->a()La/pz40;

    .line 860
    .line 861
    .line 862
    move-result-object v4

    .line 863
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v4

    .line 867
    check-cast v4, Ljava/util/List;

    .line 868
    .line 869
    instance-of v4, v3, La/g0g0;

    .line 870
    .line 871
    if-eqz v4, :cond_17

    .line 872
    .line 873
    goto :goto_11

    .line 874
    :cond_17
    move-object v2, v3

    .line 875
    :goto_11
    check-cast v2, Ljava/util/List;

    .line 876
    .line 877
    if-nez v2, :cond_18

    .line 878
    .line 879
    sget-object v2, La/iun;->a:La/iun;

    .line 880
    .line 881
    :cond_18
    invoke-interface {v5, v2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 882
    .line 883
    .line 884
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v2

    .line 888
    check-cast v2, La/fee;

    .line 889
    .line 890
    invoke-virtual {v2}, La/fee;->b()Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v2

    .line 894
    check-cast v2, Ljava/util/List;

    .line 895
    .line 896
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 897
    .line 898
    .line 899
    move-result v2

    .line 900
    if-eqz v2, :cond_19

    .line 901
    .line 902
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    check-cast v0, La/fee;

    .line 907
    .line 908
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 909
    .line 910
    invoke-static {v0, v11}, La/n6x;->r(La/l7m0;La/g2v;)La/ad40;

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    goto :goto_12

    .line 915
    :cond_19
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    check-cast v0, La/fee;

    .line 920
    .line 921
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 922
    .line 923
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    check-cast v2, La/fee;

    .line 928
    .line 929
    invoke-virtual {v2}, La/fee;->b()Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v2

    .line 933
    check-cast v2, Ljava/lang/Iterable;

    .line 934
    .line 935
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 936
    .line 937
    .line 938
    move-result-object v2

    .line 939
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 940
    .line 941
    .line 942
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 943
    .line 944
    .line 945
    new-instance v3, La/ad40;

    .line 946
    .line 947
    new-instance v4, La/oc40;

    .line 948
    .line 949
    invoke-direct {v4, v1, v2}, La/oc40;-><init>(La/fb40;La/a4x;)V

    .line 950
    .line 951
    .line 952
    invoke-direct {v3, v0, v4}, La/ad40;-><init>(La/l7m0;La/oc40;)V

    .line 953
    .line 954
    .line 955
    move-object v0, v3

    .line 956
    :goto_12
    return-object v0

    .line 957
    :pswitch_2
    move-object/from16 v1, p1

    .line 958
    .line 959
    check-cast v1, La/dfg;

    .line 960
    .line 961
    check-cast v4, La/dfg;

    .line 962
    .line 963
    iget-object v3, v4, La/dfg;->a:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 964
    .line 965
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 966
    .line 967
    .line 968
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 969
    .line 970
    .line 971
    move-result-object v6

    .line 972
    check-cast v6, La/fee;

    .line 973
    .line 974
    iget-boolean v7, v1, La/dfg;->g:Z

    .line 975
    .line 976
    iget-boolean v8, v1, La/dfg;->f:Z

    .line 977
    .line 978
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 979
    .line 980
    .line 981
    move-result-object v7

    .line 982
    invoke-virtual {v6, v7}, La/fee;->d(Ljava/lang/Object;)V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v10}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 986
    .line 987
    .line 988
    move-result-object v6

    .line 989
    check-cast v6, La/fee;

    .line 990
    .line 991
    iget-object v1, v1, La/dfg;->c:La/j0g0;

    .line 992
    .line 993
    if-eqz v1, :cond_1c

    .line 994
    .line 995
    iget-object v7, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 996
    .line 997
    instance-of v11, v7, La/g0g0;

    .line 998
    .line 999
    if-eqz v11, :cond_1a

    .line 1000
    .line 1001
    move-object v7, v2

    .line 1002
    :cond_1a
    check-cast v7, La/bfg;

    .line 1003
    .line 1004
    if-eqz v7, :cond_1c

    .line 1005
    .line 1006
    iget-object v7, v7, La/bfg;->b:La/j0g0;

    .line 1007
    .line 1008
    if-eqz v7, :cond_1c

    .line 1009
    .line 1010
    iget-object v7, v7, La/j0g0;->a:Ljava/lang/Object;

    .line 1011
    .line 1012
    instance-of v11, v7, La/g0g0;

    .line 1013
    .line 1014
    if-eqz v11, :cond_1b

    .line 1015
    .line 1016
    move-object v7, v2

    .line 1017
    :cond_1b
    check-cast v7, La/fcg;

    .line 1018
    .line 1019
    if-nez v7, :cond_1d

    .line 1020
    .line 1021
    :cond_1c
    new-instance v7, La/fcg;

    .line 1022
    .line 1023
    sget-object v11, La/iun;->a:La/iun;

    .line 1024
    .line 1025
    invoke-direct {v7, v11, v5}, La/fcg;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 1026
    .line 1027
    .line 1028
    :cond_1d
    invoke-virtual {v6, v7}, La/fee;->d(Ljava/lang/Object;)V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v6

    .line 1035
    check-cast v6, La/fee;

    .line 1036
    .line 1037
    if-eqz v1, :cond_20

    .line 1038
    .line 1039
    iget-object v7, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 1040
    .line 1041
    instance-of v11, v7, La/g0g0;

    .line 1042
    .line 1043
    if-eqz v11, :cond_1e

    .line 1044
    .line 1045
    move-object v7, v2

    .line 1046
    :cond_1e
    check-cast v7, La/bfg;

    .line 1047
    .line 1048
    if-eqz v7, :cond_20

    .line 1049
    .line 1050
    iget-object v7, v7, La/bfg;->c:La/j0g0;

    .line 1051
    .line 1052
    if-eqz v7, :cond_20

    .line 1053
    .line 1054
    iget-object v7, v7, La/j0g0;->a:Ljava/lang/Object;

    .line 1055
    .line 1056
    instance-of v11, v7, La/g0g0;

    .line 1057
    .line 1058
    if-eqz v11, :cond_1f

    .line 1059
    .line 1060
    move-object v7, v2

    .line 1061
    :cond_1f
    check-cast v7, La/fcg;

    .line 1062
    .line 1063
    if-nez v7, :cond_21

    .line 1064
    .line 1065
    :cond_20
    new-instance v7, La/fcg;

    .line 1066
    .line 1067
    sget-object v11, La/iun;->a:La/iun;

    .line 1068
    .line 1069
    invoke-direct {v7, v11, v5}, La/fcg;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 1070
    .line 1071
    .line 1072
    :cond_21
    invoke-virtual {v6, v7}, La/fee;->d(Ljava/lang/Object;)V

    .line 1073
    .line 1074
    .line 1075
    if-nez v1, :cond_22

    .line 1076
    .line 1077
    if-eqz v8, :cond_22

    .line 1078
    .line 1079
    move v5, v12

    .line 1080
    goto :goto_13

    .line 1081
    :cond_22
    move v5, v13

    .line 1082
    :goto_13
    if-eqz v5, :cond_24

    .line 1083
    .line 1084
    iget-object v4, v4, La/dfg;->b:La/sff0;

    .line 1085
    .line 1086
    iget-object v4, v4, La/sff0;->g:La/mum0;

    .line 1087
    .line 1088
    iget-object v4, v4, La/mum0;->y:La/v5l0;

    .line 1089
    .line 1090
    sget-object v6, La/q0s;->a:La/q0s;

    .line 1091
    .line 1092
    new-instance v7, Ljava/util/ArrayList;

    .line 1093
    .line 1094
    const/16 v9, 0xa

    .line 1095
    .line 1096
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 1097
    .line 1098
    .line 1099
    move v10, v13

    .line 1100
    :goto_14
    if-ge v10, v9, :cond_23

    .line 1101
    .line 1102
    invoke-static {v4}, La/pzw;->I(La/v5l0;)La/w0g0;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v11

    .line 1106
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1107
    .line 1108
    .line 1109
    add-int/lit8 v10, v10, 0x1

    .line 1110
    .line 1111
    goto :goto_14

    .line 1112
    :cond_23
    invoke-static {v7}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v4

    .line 1116
    new-instance v7, La/vb90;

    .line 1117
    .line 1118
    invoke-direct {v7, v6, v4, v13, v12}, La/vb90;-><init>(La/q0s;La/a4x;ZZ)V

    .line 1119
    .line 1120
    .line 1121
    new-instance v4, La/ieg;

    .line 1122
    .line 1123
    const-string v6, "GAME_CARD_SHIMMER_KEY"

    .line 1124
    .line 1125
    invoke-direct {v4, v6, v7}, La/ieg;-><init>(Ljava/lang/String;La/vb90;)V

    .line 1126
    .line 1127
    .line 1128
    filled-new-array {v4}, [La/ieg;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v4

    .line 1132
    invoke-static {v4}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v4

    .line 1136
    goto :goto_15

    .line 1137
    :cond_24
    if-eqz v1, :cond_25

    .line 1138
    .line 1139
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v4

    .line 1143
    invoke-virtual {v10}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v6

    .line 1147
    check-cast v6, La/fee;

    .line 1148
    .line 1149
    invoke-virtual {v6}, La/fee;->b()Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v6

    .line 1153
    check-cast v6, Ljava/util/Collection;

    .line 1154
    .line 1155
    invoke-virtual {v4, v6}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v6

    .line 1162
    check-cast v6, La/fee;

    .line 1163
    .line 1164
    invoke-virtual {v6}, La/fee;->b()Ljava/lang/Object;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v6

    .line 1168
    check-cast v6, Ljava/util/Collection;

    .line 1169
    .line 1170
    invoke-static {v4, v6, v4}, La/twn;->k(La/lc00;Ljava/util/Collection;La/lc00;)La/a4x;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v4

    .line 1174
    goto :goto_15

    .line 1175
    :cond_25
    sget-object v4, La/lak0;->c:La/lak0;

    .line 1176
    .line 1177
    :goto_15
    new-instance v6, La/efg;

    .line 1178
    .line 1179
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1180
    .line 1181
    .line 1182
    move-result v7

    .line 1183
    sget-object v9, La/veg;->a:La/veg;

    .line 1184
    .line 1185
    if-nez v1, :cond_26

    .line 1186
    .line 1187
    if-eqz v8, :cond_26

    .line 1188
    .line 1189
    goto/16 :goto_1e

    .line 1190
    .line 1191
    :cond_26
    iget-object v13, v0, La/gfg;->b:La/g2v;

    .line 1192
    .line 1193
    if-eqz v1, :cond_31

    .line 1194
    .line 1195
    iget-object v0, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 1196
    .line 1197
    instance-of v1, v0, La/g0g0;

    .line 1198
    .line 1199
    if-nez v1, :cond_31

    .line 1200
    .line 1201
    if-eqz v1, :cond_27

    .line 1202
    .line 1203
    move-object v8, v2

    .line 1204
    goto :goto_16

    .line 1205
    :cond_27
    move-object v8, v0

    .line 1206
    :goto_16
    check-cast v8, La/bfg;

    .line 1207
    .line 1208
    if-eqz v8, :cond_28

    .line 1209
    .line 1210
    iget-object v8, v8, La/bfg;->c:La/j0g0;

    .line 1211
    .line 1212
    goto :goto_17

    .line 1213
    :cond_28
    move-object v8, v2

    .line 1214
    :goto_17
    if-nez v8, :cond_2b

    .line 1215
    .line 1216
    if-eqz v1, :cond_29

    .line 1217
    .line 1218
    move-object v8, v2

    .line 1219
    goto :goto_18

    .line 1220
    :cond_29
    move-object v8, v0

    .line 1221
    :goto_18
    check-cast v8, La/bfg;

    .line 1222
    .line 1223
    if-eqz v8, :cond_2a

    .line 1224
    .line 1225
    iget-object v8, v8, La/bfg;->b:La/j0g0;

    .line 1226
    .line 1227
    goto :goto_19

    .line 1228
    :cond_2a
    move-object v8, v2

    .line 1229
    :goto_19
    if-eqz v8, :cond_31

    .line 1230
    .line 1231
    :cond_2b
    if-eqz v1, :cond_2c

    .line 1232
    .line 1233
    move-object v8, v2

    .line 1234
    goto :goto_1a

    .line 1235
    :cond_2c
    move-object v8, v0

    .line 1236
    :goto_1a
    check-cast v8, La/bfg;

    .line 1237
    .line 1238
    if-eqz v8, :cond_2d

    .line 1239
    .line 1240
    iget-object v8, v8, La/bfg;->c:La/j0g0;

    .line 1241
    .line 1242
    if-eqz v8, :cond_2d

    .line 1243
    .line 1244
    iget-object v8, v8, La/j0g0;->a:Ljava/lang/Object;

    .line 1245
    .line 1246
    instance-of v8, v8, La/g0g0;

    .line 1247
    .line 1248
    goto :goto_1b

    .line 1249
    :cond_2d
    move v8, v12

    .line 1250
    :goto_1b
    if-eqz v8, :cond_30

    .line 1251
    .line 1252
    if-eqz v1, :cond_2e

    .line 1253
    .line 1254
    goto :goto_1c

    .line 1255
    :cond_2e
    move-object v2, v0

    .line 1256
    :goto_1c
    check-cast v2, La/bfg;

    .line 1257
    .line 1258
    if-eqz v2, :cond_2f

    .line 1259
    .line 1260
    iget-object v0, v2, La/bfg;->b:La/j0g0;

    .line 1261
    .line 1262
    if-eqz v0, :cond_2f

    .line 1263
    .line 1264
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 1265
    .line 1266
    instance-of v12, v0, La/g0g0;

    .line 1267
    .line 1268
    :cond_2f
    if-eqz v12, :cond_30

    .line 1269
    .line 1270
    goto :goto_1d

    .line 1271
    :cond_30
    if-eqz v7, :cond_32

    .line 1272
    .line 1273
    new-instance v9, La/weg;

    .line 1274
    .line 1275
    iget-wide v0, v3, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->c:J

    .line 1276
    .line 1277
    sget-object v2, La/pb10;->v:La/pb10;

    .line 1278
    .line 1279
    invoke-static {v0, v1, v2}, La/ozb;->L(JLa/pb10;)La/pb10;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v14

    .line 1283
    const-wide/16 v24, 0x0

    .line 1284
    .line 1285
    const/16 v26, 0x25e

    .line 1286
    .line 1287
    const/4 v15, 0x0

    .line 1288
    const/16 v16, 0x0

    .line 1289
    .line 1290
    const/16 v17, 0x0

    .line 1291
    .line 1292
    const/16 v18, 0x0

    .line 1293
    .line 1294
    const v19, 0x7f1305c0

    .line 1295
    .line 1296
    .line 1297
    const/16 v20, 0x0

    .line 1298
    .line 1299
    const v21, 0x7f131690

    .line 1300
    .line 1301
    .line 1302
    const-wide/16 v22, 0x2710

    .line 1303
    .line 1304
    invoke-static/range {v13 .. v26}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v0

    .line 1308
    invoke-direct {v9, v0}, La/weg;-><init>(La/mdm;)V

    .line 1309
    .line 1310
    .line 1311
    goto :goto_1e

    .line 1312
    :cond_31
    :goto_1d
    new-instance v9, La/weg;

    .line 1313
    .line 1314
    iget-wide v0, v3, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->c:J

    .line 1315
    .line 1316
    sget-object v2, La/pb10;->v:La/pb10;

    .line 1317
    .line 1318
    invoke-static {v0, v1, v2}, La/ozb;->L(JLa/pb10;)La/pb10;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v14

    .line 1322
    const-wide/16 v24, 0x0

    .line 1323
    .line 1324
    const/16 v26, 0x25e

    .line 1325
    .line 1326
    const/4 v15, 0x0

    .line 1327
    const/16 v16, 0x0

    .line 1328
    .line 1329
    const/16 v17, 0x0

    .line 1330
    .line 1331
    const/16 v18, 0x0

    .line 1332
    .line 1333
    const v19, 0x7f130677

    .line 1334
    .line 1335
    .line 1336
    const/16 v20, 0x0

    .line 1337
    .line 1338
    const v21, 0x7f131690

    .line 1339
    .line 1340
    .line 1341
    const-wide/16 v22, 0x2710

    .line 1342
    .line 1343
    invoke-static/range {v13 .. v26}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v0

    .line 1347
    invoke-direct {v9, v0}, La/weg;-><init>(La/mdm;)V

    .line 1348
    .line 1349
    .line 1350
    :cond_32
    :goto_1e
    invoke-direct {v6, v9, v4, v5}, La/efg;-><init>(La/xeg;La/a4x;Z)V

    .line 1351
    .line 1352
    .line 1353
    return-object v6

    .line 1354
    nop

    .line 1355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
