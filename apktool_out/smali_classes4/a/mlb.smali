.class public final synthetic La/mlb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ctf0;

.field public final synthetic c:La/g2v;

.field public final synthetic d:La/y78;


# direct methods
.method public synthetic constructor <init>(La/ctf0;La/g2v;La/y78;B)V
    .locals 0

    .line 3
    iput-byte p4, p0, La/mlb;->a:B

    iput-object p1, p0, La/mlb;->b:La/ctf0;

    iput-object p2, p0, La/mlb;->c:La/g2v;

    iput-object p3, p0, La/mlb;->d:La/y78;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/ctf0;La/y78;La/g2v;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/mlb;->a:B

    iput-object p1, p0, La/mlb;->b:La/ctf0;

    iput-object p2, p0, La/mlb;->d:La/y78;

    iput-object p3, p0, La/mlb;->c:La/g2v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/g2v;La/ctf0;La/y78;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/mlb;->a:B

    iput-object p1, p0, La/mlb;->c:La/g2v;

    iput-object p2, p0, La/mlb;->b:La/ctf0;

    iput-object p3, p0, La/mlb;->d:La/y78;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/mlb;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/mlb;->d:La/y78;

    .line 4
    .line 5
    iget-object v2, p0, La/mlb;->c:La/g2v;

    .line 6
    .line 7
    iget-object v3, p0, La/mlb;->b:La/ctf0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/upu0;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance p0, La/gfg;

    .line 18
    .line 19
    invoke-direct {p0, p1, v3, v2, v1}, La/gfg;-><init>(La/upu0;La/ctf0;La/g2v;La/y78;)V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/cdt0;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance p0, La/ej1;

    .line 29
    .line 30
    invoke-direct {p0, p1, v3, v2, v1}, La/ej1;-><init>(La/cdt0;La/ctf0;La/g2v;La/y78;)V

    .line 31
    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_1
    check-cast p1, La/szo0;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance p0, La/b430;

    .line 40
    .line 41
    invoke-direct {p0, p1, v3, v1, v2}, La/b430;-><init>(La/szo0;La/ctf0;La/y78;La/g2v;)V

    .line 42
    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_2
    check-cast p1, La/tbn0;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance p0, La/ee2;

    .line 51
    .line 52
    invoke-direct {p0, p1, v3, v1, v2}, La/ee2;-><init>(La/tbn0;La/ctf0;La/y78;La/g2v;)V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_3
    check-cast p1, La/hdn0;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance p0, La/b430;

    .line 62
    .line 63
    invoke-direct {p0, p1, v3, v1, v2}, La/b430;-><init>(La/hdn0;La/ctf0;La/y78;La/g2v;)V

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_4
    check-cast p1, La/nj00;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance p0, La/syp;

    .line 73
    .line 74
    invoke-direct {p0, p1, v3, v1, v2}, La/syp;-><init>(La/nj00;La/ctf0;La/y78;La/g2v;)V

    .line 75
    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_5
    check-cast p1, La/yjw;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance p0, La/mkw;

    .line 84
    .line 85
    invoke-direct {p0, p1, v2, v3, v1}, La/mkw;-><init>(La/yjw;La/g2v;La/ctf0;La/y78;)V

    .line 86
    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_6
    check-cast p1, La/cis;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    new-instance p0, La/ov0;

    .line 95
    .line 96
    invoke-direct {p0, p1, v3, v1, v2}, La/ov0;-><init>(La/cis;La/ctf0;La/y78;La/g2v;)V

    .line 97
    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_7
    check-cast p1, La/kxp;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    new-instance p0, La/syp;

    .line 106
    .line 107
    invoke-direct {p0, p1, v2, v3, v1}, La/syp;-><init>(La/kxp;La/g2v;La/ctf0;La/y78;)V

    .line 108
    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_8
    check-cast p1, La/x4p;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance p0, La/t2f;

    .line 117
    .line 118
    invoke-direct {p0, v3, p1, v1, v2}, La/t2f;-><init>(La/ctf0;La/x4p;La/y78;La/g2v;)V

    .line 119
    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_9
    move-object v5, p1

    .line 123
    check-cast v5, La/z8o;

    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    new-instance v4, La/i9o;

    .line 129
    .line 130
    sget-object p1, La/wen;->b:La/uen;

    .line 131
    .line 132
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 133
    .line 134
    .line 135
    move-result-wide v0

    .line 136
    sget-object p1, La/bfn;->d:La/bfn;

    .line 137
    .line 138
    invoke-static {v0, v1, p1}, La/ibc;->w0(JLa/bfn;)J

    .line 139
    .line 140
    .line 141
    move-result-wide v0

    .line 142
    sget-object p1, La/bfn;->e:La/bfn;

    .line 143
    .line 144
    invoke-static {v0, v1, p1}, La/wen;->l(JLa/bfn;)J

    .line 145
    .line 146
    .line 147
    move-result-wide v9

    .line 148
    iget-object v6, p0, La/mlb;->b:La/ctf0;

    .line 149
    .line 150
    iget-object v7, p0, La/mlb;->c:La/g2v;

    .line 151
    .line 152
    iget-object v8, p0, La/mlb;->d:La/y78;

    .line 153
    .line 154
    invoke-direct/range {v4 .. v10}, La/i9o;-><init>(La/z8o;La/ctf0;La/g2v;La/y78;J)V

    .line 155
    .line 156
    .line 157
    return-object v4

    .line 158
    :pswitch_a
    check-cast p1, La/y3o;

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    new-instance p0, La/b4o;

    .line 164
    .line 165
    invoke-direct {p0, p1, v2, v3, v1}, La/b4o;-><init>(La/y3o;La/g2v;La/ctf0;La/y78;)V

    .line 166
    .line 167
    .line 168
    return-object p0

    .line 169
    :pswitch_b
    check-cast p1, La/ksk;

    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    iget-object p0, p1, La/ksk;->b:La/sff0;

    .line 175
    .line 176
    iget-object p0, p0, La/sff0;->c:La/ech;

    .line 177
    .line 178
    iget-object p0, p0, La/ech;->q:La/n2o;

    .line 179
    .line 180
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 181
    .line 182
    .line 183
    move-result p0

    .line 184
    if-eqz p0, :cond_3

    .line 185
    .line 186
    const/4 v0, 0x1

    .line 187
    if-eq p0, v0, :cond_2

    .line 188
    .line 189
    const/4 v0, 0x2

    .line 190
    if-eq p0, v0, :cond_1

    .line 191
    .line 192
    const/4 v0, 0x3

    .line 193
    if-ne p0, v0, :cond_0

    .line 194
    .line 195
    new-instance p0, La/csk;

    .line 196
    .line 197
    invoke-direct {p0, p1, v3, v2, v1}, La/csk;-><init>(La/ksk;La/ctf0;La/g2v;La/y78;)V

    .line 198
    .line 199
    .line 200
    goto :goto_0

    .line 201
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 202
    .line 203
    .line 204
    const/4 p0, 0x0

    .line 205
    goto :goto_0

    .line 206
    :cond_1
    new-instance p0, La/mrk;

    .line 207
    .line 208
    invoke-direct {p0, p1, v3, v2, v1}, La/mrk;-><init>(La/ksk;La/ctf0;La/g2v;La/y78;)V

    .line 209
    .line 210
    .line 211
    goto :goto_0

    .line 212
    :cond_2
    new-instance p0, La/xqk;

    .line 213
    .line 214
    invoke-direct {p0, p1, v3, v2, v1}, La/xqk;-><init>(La/ksk;La/ctf0;La/g2v;La/y78;)V

    .line 215
    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_3
    new-instance p0, La/bqk;

    .line 219
    .line 220
    invoke-direct {p0, p1, v3, v2, v1}, La/bqk;-><init>(La/ksk;La/ctf0;La/g2v;La/y78;)V

    .line 221
    .line 222
    .line 223
    :goto_0
    return-object p0

    .line 224
    :pswitch_c
    check-cast p1, La/dfg;

    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    new-instance p0, La/gfg;

    .line 230
    .line 231
    invoke-direct {p0, p1, v3, v2, v1}, La/gfg;-><init>(La/dfg;La/ctf0;La/g2v;La/y78;)V

    .line 232
    .line 233
    .line 234
    return-object p0

    .line 235
    :pswitch_d
    check-cast p1, La/alb;

    .line 236
    .line 237
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    new-instance p0, La/xa9;

    .line 241
    .line 242
    invoke-direct {p0, p1, v2, v3, v1}, La/xa9;-><init>(La/alb;La/g2v;La/ctf0;La/y78;)V

    .line 243
    .line 244
    .line 245
    return-object p0

    .line 246
    nop

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
