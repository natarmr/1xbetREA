.class public final synthetic La/vs1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:B

.field public final synthetic g:Z

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/gol;La/b0i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;II)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput-byte v0, p0, La/vs1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vs1;->b:La/mm40;

    iput-object p2, p0, La/vs1;->h:Ljava/lang/Object;

    iput-object p3, p0, La/vs1;->d:Ljava/lang/Object;

    iput-object p4, p0, La/vs1;->e:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, La/vs1;->c:Ljava/lang/Object;

    iput-byte p6, p0, La/vs1;->f:B

    iput-boolean p7, p0, La/vs1;->g:Z

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/lang/Object;La/mtl;La/bch0;Lkotlin/jvm/functions/Function1;IIB)V
    .locals 0

    .line 2
    iput-byte p8, p0, La/vs1;->a:B

    iput-object p1, p0, La/vs1;->b:La/mm40;

    iput-object p2, p0, La/vs1;->h:Ljava/lang/Object;

    iput-object p3, p0, La/vs1;->c:Ljava/lang/Object;

    iput-object p4, p0, La/vs1;->d:Ljava/lang/Object;

    iput-object p5, p0, La/vs1;->e:Lkotlin/jvm/functions/Function1;

    iput-byte p6, p0, La/vs1;->f:B

    iput-boolean p7, p0, La/vs1;->g:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/lang/Object;La/xcz;La/mtl;Lkotlin/jvm/functions/Function1;IIB)V
    .locals 0

    .line 3
    iput-byte p8, p0, La/vs1;->a:B

    iput-object p1, p0, La/vs1;->b:La/mm40;

    iput-object p2, p0, La/vs1;->h:Ljava/lang/Object;

    iput-object p3, p0, La/vs1;->d:Ljava/lang/Object;

    iput-object p4, p0, La/vs1;->c:Ljava/lang/Object;

    iput-object p5, p0, La/vs1;->e:Lkotlin/jvm/functions/Function1;

    iput-byte p6, p0, La/vs1;->f:B

    iput-boolean p7, p0, La/vs1;->g:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/vs1;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/vs1;->h:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, La/gol;

    .line 10
    .line 11
    iget-object v0, p0, La/vs1;->d:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, La/b0i;

    .line 15
    .line 16
    iget-object v0, p0, La/vs1;->c:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v5, v0

    .line 19
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 20
    .line 21
    move-object v6, p1

    .line 22
    check-cast v6, La/fet;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-byte p1, p0, La/vs1;->f:B

    .line 30
    .line 31
    or-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, La/x8x;->L(I)I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    iget-object v1, p0, La/vs1;->b:La/mm40;

    .line 38
    .line 39
    iget-object v4, p0, La/vs1;->e:Lkotlin/jvm/functions/Function1;

    .line 40
    .line 41
    iget-boolean v8, p0, La/vs1;->g:Z

    .line 42
    .line 43
    invoke-static/range {v1 .. v8}, La/wvb;->j(La/mm40;La/gol;La/b0i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    iget-object v0, p0, La/vs1;->h:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v2, v0

    .line 52
    check-cast v2, La/ou1;

    .line 53
    .line 54
    iget-object v0, p0, La/vs1;->d:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v3, v0

    .line 57
    check-cast v3, La/xcz;

    .line 58
    .line 59
    iget-object v0, p0, La/vs1;->c:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v4, v0

    .line 62
    check-cast v4, La/mtl;

    .line 63
    .line 64
    move-object v6, p1

    .line 65
    check-cast v6, La/fet;

    .line 66
    .line 67
    check-cast p2, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-byte p1, p0, La/vs1;->f:B

    .line 73
    .line 74
    or-int/lit8 p1, p1, 0x1

    .line 75
    .line 76
    invoke-static {p1}, La/x8x;->L(I)I

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    iget-object v1, p0, La/vs1;->b:La/mm40;

    .line 81
    .line 82
    iget-object v5, p0, La/vs1;->e:Lkotlin/jvm/functions/Function1;

    .line 83
    .line 84
    iget-boolean v8, p0, La/vs1;->g:Z

    .line 85
    .line 86
    invoke-static/range {v1 .. v8}, La/x4d0;->b(La/mm40;La/ou1;La/xcz;La/mtl;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_1
    iget-object v0, p0, La/vs1;->h:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v2, v0

    .line 95
    check-cast v2, La/bml;

    .line 96
    .line 97
    iget-object v0, p0, La/vs1;->c:Ljava/lang/Object;

    .line 98
    .line 99
    move-object v3, v0

    .line 100
    check-cast v3, La/mtl;

    .line 101
    .line 102
    iget-object v0, p0, La/vs1;->d:Ljava/lang/Object;

    .line 103
    .line 104
    move-object v4, v0

    .line 105
    check-cast v4, La/d9z;

    .line 106
    .line 107
    move-object v6, p1

    .line 108
    check-cast v6, La/fet;

    .line 109
    .line 110
    check-cast p2, Ljava/lang/Integer;

    .line 111
    .line 112
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-byte p1, p0, La/vs1;->f:B

    .line 116
    .line 117
    or-int/lit8 p1, p1, 0x1

    .line 118
    .line 119
    invoke-static {p1}, La/x8x;->L(I)I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    iget-object v1, p0, La/vs1;->b:La/mm40;

    .line 124
    .line 125
    iget-object v5, p0, La/vs1;->e:Lkotlin/jvm/functions/Function1;

    .line 126
    .line 127
    iget-boolean v8, p0, La/vs1;->g:Z

    .line 128
    .line 129
    invoke-static/range {v1 .. v8}, La/wha0;->c(La/mm40;La/bml;La/mtl;La/d9z;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 130
    .line 131
    .line 132
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object p0

    .line 135
    :pswitch_2
    iget-object v0, p0, La/vs1;->h:Ljava/lang/Object;

    .line 136
    .line 137
    move-object v2, v0

    .line 138
    check-cast v2, La/a4x;

    .line 139
    .line 140
    iget-object v0, p0, La/vs1;->c:Ljava/lang/Object;

    .line 141
    .line 142
    move-object v3, v0

    .line 143
    check-cast v3, La/mtl;

    .line 144
    .line 145
    iget-object v0, p0, La/vs1;->d:Ljava/lang/Object;

    .line 146
    .line 147
    move-object v4, v0

    .line 148
    check-cast v4, La/xcz;

    .line 149
    .line 150
    move-object v6, p1

    .line 151
    check-cast v6, La/fet;

    .line 152
    .line 153
    check-cast p2, Ljava/lang/Integer;

    .line 154
    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget-byte p1, p0, La/vs1;->f:B

    .line 159
    .line 160
    or-int/lit8 p1, p1, 0x1

    .line 161
    .line 162
    invoke-static {p1}, La/x8x;->L(I)I

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    iget-object v1, p0, La/vs1;->b:La/mm40;

    .line 167
    .line 168
    iget-object v5, p0, La/vs1;->e:Lkotlin/jvm/functions/Function1;

    .line 169
    .line 170
    iget-boolean v8, p0, La/vs1;->g:Z

    .line 171
    .line 172
    invoke-static/range {v1 .. v8}, La/y860;->d(La/mm40;La/a4x;La/mtl;La/xcz;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 173
    .line 174
    .line 175
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    return-object p0

    .line 178
    :pswitch_3
    iget-object v0, p0, La/vs1;->h:Ljava/lang/Object;

    .line 179
    .line 180
    move-object v2, v0

    .line 181
    check-cast v2, La/zs1;

    .line 182
    .line 183
    iget-object v0, p0, La/vs1;->d:Ljava/lang/Object;

    .line 184
    .line 185
    move-object v3, v0

    .line 186
    check-cast v3, La/xcz;

    .line 187
    .line 188
    iget-object v0, p0, La/vs1;->c:Ljava/lang/Object;

    .line 189
    .line 190
    move-object v4, v0

    .line 191
    check-cast v4, La/mtl;

    .line 192
    .line 193
    move-object v6, p1

    .line 194
    check-cast v6, La/fet;

    .line 195
    .line 196
    check-cast p2, Ljava/lang/Integer;

    .line 197
    .line 198
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget-byte p1, p0, La/vs1;->f:B

    .line 202
    .line 203
    or-int/lit8 p1, p1, 0x1

    .line 204
    .line 205
    invoke-static {p1}, La/x8x;->L(I)I

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    iget-object v1, p0, La/vs1;->b:La/mm40;

    .line 210
    .line 211
    iget-object v5, p0, La/vs1;->e:Lkotlin/jvm/functions/Function1;

    .line 212
    .line 213
    iget-boolean v8, p0, La/vs1;->g:Z

    .line 214
    .line 215
    invoke-static/range {v1 .. v8}, La/o050;->a(La/mm40;La/zs1;La/xcz;La/mtl;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 216
    .line 217
    .line 218
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    return-object p0

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
