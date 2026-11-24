.class public final synthetic La/o74;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/a4x;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/o74;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/o74;->b:La/a4x;

    iput-object p2, p0, La/o74;->c:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, La/o74;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/a4x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/o74;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/o74;->b:La/a4x;

    iput-object p2, p0, La/o74;->d:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/o74;->c:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/o74;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/16 v2, 0x11

    .line 5
    .line 6
    check-cast p1, La/hcz;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, La/x0h0;

    .line 15
    .line 16
    const/16 v3, 0x10

    .line 17
    .line 18
    invoke-direct {v0, v3}, La/x0h0;-><init>(B)V

    .line 19
    .line 20
    .line 21
    iget-object v5, p0, La/o74;->b:La/a4x;

    .line 22
    .line 23
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    new-instance v10, La/pwe0;

    .line 28
    .line 29
    invoke-direct {v10, v0, v5, v2}, La/pwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    new-instance v0, La/d1c0;

    .line 33
    .line 34
    const/16 v2, 0x16

    .line 35
    .line 36
    invoke-direct {v0, v5, v2}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 37
    .line 38
    .line 39
    new-instance v4, La/gq4;

    .line 40
    .line 41
    const/16 v9, 0x9

    .line 42
    .line 43
    iget-object v7, p0, La/o74;->c:Lkotlin/jvm/functions/Function0;

    .line 44
    .line 45
    iget-object v8, p0, La/o74;->d:Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    move-object v6, v5

    .line 48
    invoke-direct/range {v4 .. v9}, La/gq4;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 49
    .line 50
    .line 51
    new-instance p0, La/ugd;

    .line 52
    .line 53
    const v2, 0x799532c4

    .line 54
    .line 55
    .line 56
    invoke-direct {p0, v2, v1, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v3, v10, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, La/o74;->b:La/a4x;

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_4

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, La/f94;

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    instance-of v5, v3, La/c94;

    .line 90
    .line 91
    const/4 v6, 0x3

    .line 92
    if-eqz v5, :cond_0

    .line 93
    .line 94
    sget-object v3, La/nnw0;->a:La/ugd;

    .line 95
    .line 96
    invoke-static {p1, v4, v4, v3, v6}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    instance-of v5, v3, La/e94;

    .line 101
    .line 102
    if-eqz v5, :cond_1

    .line 103
    .line 104
    new-instance v5, La/un6;

    .line 105
    .line 106
    const/16 v7, 0x12

    .line 107
    .line 108
    invoke-direct {v5, v3, v7}, La/un6;-><init>(Ljava/lang/Object;B)V

    .line 109
    .line 110
    .line 111
    new-instance v3, La/ugd;

    .line 112
    .line 113
    const v7, -0x2c8e7d8f

    .line 114
    .line 115
    .line 116
    invoke-direct {v3, v7, v1, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-static {p1, v4, v4, v3, v6}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_1
    instance-of v5, v3, La/e84;

    .line 124
    .line 125
    if-eqz v5, :cond_2

    .line 126
    .line 127
    new-instance v5, La/ri1;

    .line 128
    .line 129
    const/16 v7, 0x1d

    .line 130
    .line 131
    iget-object v8, p0, La/o74;->c:Lkotlin/jvm/functions/Function0;

    .line 132
    .line 133
    invoke-direct {v5, v3, v8, v7}, La/ri1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 134
    .line 135
    .line 136
    new-instance v3, La/ugd;

    .line 137
    .line 138
    const v7, -0xbfd334e

    .line 139
    .line 140
    .line 141
    invoke-direct {v3, v7, v1, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-static {p1, v4, v4, v3, v6}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_2
    instance-of v5, v3, La/r84;

    .line 149
    .line 150
    if-eqz v5, :cond_3

    .line 151
    .line 152
    check-cast v3, La/r84;

    .line 153
    .line 154
    iget-object v4, p0, La/o74;->d:Lkotlin/jvm/functions/Function1;

    .line 155
    .line 156
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object v3, v3, La/r84;->a:La/a4x;

    .line 160
    .line 161
    new-instance v5, La/ij4;

    .line 162
    .line 163
    const/16 v6, 0xa

    .line 164
    .line 165
    invoke-direct {v5, v6}, La/ij4;-><init>(B)V

    .line 166
    .line 167
    .line 168
    new-instance v6, La/ij4;

    .line 169
    .line 170
    const/16 v7, 0xb

    .line 171
    .line 172
    invoke-direct {v6, v7}, La/ij4;-><init>(B)V

    .line 173
    .line 174
    .line 175
    invoke-static {v3, v5}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    new-instance v8, La/b8;

    .line 184
    .line 185
    const/16 v9, 0x19

    .line 186
    .line 187
    invoke-direct {v8, v5, v9}, La/b8;-><init>(Ljava/util/List;B)V

    .line 188
    .line 189
    .line 190
    new-instance v5, La/ci2;

    .line 191
    .line 192
    invoke-direct {v5, v6, v3, v2}, La/ci2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 193
    .line 194
    .line 195
    new-instance v6, La/c8;

    .line 196
    .line 197
    const/4 v9, 0x7

    .line 198
    invoke-direct {v6, v3, v3, v4, v9}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 199
    .line 200
    .line 201
    new-instance v3, La/ugd;

    .line 202
    .line 203
    const v4, -0x4e295cff

    .line 204
    .line 205
    .line 206
    invoke-direct {v3, v4, v1, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1, v7, v8, v5, v3}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 215
    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    :goto_1
    return-object v4

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
