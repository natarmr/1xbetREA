.class public final synthetic La/qd6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wd6;


# direct methods
.method public synthetic constructor <init>(La/wd6;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qd6;->a:B

    iput-object p1, p0, La/qd6;->b:La/wd6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/qd6;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/qd6;->b:La/wd6;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wd6;->o2:La/cl5;

    .line 11
    .line 12
    invoke-virtual {p0}, La/wd6;->W0()La/me6;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, La/wd6;->V0()La/xo8;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, La/xo8;->b:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 21
    .line 22
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->getText()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget-object v3, v0, La/me6;->p:La/lsn;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v4, v0, La/me6;->s:La/nmo;

    .line 32
    .line 33
    iget v5, v0, La/me6;->b:I

    .line 34
    .line 35
    invoke-virtual {v4, v5}, La/nmo;->d(I)I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-ltz v4, :cond_0

    .line 40
    .line 41
    invoke-virtual {v3}, La/lsn;->e()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    check-cast v5, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    sub-int/2addr v5, v1

    .line 52
    if-ge v4, v5, :cond_0

    .line 53
    .line 54
    iget-object v5, v0, La/me6;->r:La/pv00;

    .line 55
    .line 56
    iget v6, v0, La/me6;->b:I

    .line 57
    .line 58
    invoke-virtual {v5, v6, p0}, La/pv00;->l(ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, La/lsn;->e()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    add-int/2addr v4, v1

    .line 66
    check-cast p0, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, La/q88;

    .line 73
    .line 74
    iget p0, p0, La/q88;->a:I

    .line 75
    .line 76
    iput p0, v0, La/me6;->b:I

    .line 77
    .line 78
    new-instance p0, La/xd6;

    .line 79
    .line 80
    invoke-direct {p0, v0, v1}, La/xd6;-><init>(La/me6;B)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p0}, La/me6;->z(Lkotlin/jvm/functions/Function0;)V

    .line 84
    .line 85
    .line 86
    iget-object p0, v0, La/me6;->B:La/p7m0;

    .line 87
    .line 88
    invoke-virtual {v0}, La/me6;->C()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    iget-object p0, v0, La/me6;->C:La/p7m0;

    .line 99
    .line 100
    iget-object v1, v0, La/me6;->u:La/tqc;

    .line 101
    .line 102
    iget v3, v0, La/me6;->b:I

    .line 103
    .line 104
    invoke-virtual {v1, v3}, La/tqc;->c(I)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, La/me6;->w()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, La/me6;->x()V

    .line 122
    .line 123
    .line 124
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_0
    sget-object v0, La/wd6;->o2:La/cl5;

    .line 128
    .line 129
    invoke-virtual {p0}, La/wd6;->W0()La/me6;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {p0}, La/wd6;->V0()La/xo8;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    iget-object p0, p0, La/xo8;->b:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 138
    .line 139
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->getText()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    iget-object v3, v0, La/me6;->p:La/lsn;

    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object v4, v0, La/me6;->s:La/nmo;

    .line 149
    .line 150
    iget v5, v0, La/me6;->b:I

    .line 151
    .line 152
    invoke-virtual {v4, v5}, La/nmo;->d(I)I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-gt v1, v4, :cond_1

    .line 157
    .line 158
    invoke-virtual {v3}, La/lsn;->e()Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    check-cast v5, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    if-ge v4, v5, :cond_1

    .line 169
    .line 170
    iget-object v5, v0, La/me6;->r:La/pv00;

    .line 171
    .line 172
    iget v6, v0, La/me6;->b:I

    .line 173
    .line 174
    invoke-virtual {v5, v6, p0}, La/pv00;->l(ILjava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3}, La/lsn;->e()Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    sub-int/2addr v4, v1

    .line 182
    check-cast p0, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    check-cast p0, La/q88;

    .line 189
    .line 190
    iget p0, p0, La/q88;->a:I

    .line 191
    .line 192
    iput p0, v0, La/me6;->b:I

    .line 193
    .line 194
    new-instance p0, La/xd6;

    .line 195
    .line 196
    const/4 v1, 0x0

    .line 197
    invoke-direct {p0, v0, v1}, La/xd6;-><init>(La/me6;B)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, p0}, La/me6;->z(Lkotlin/jvm/functions/Function0;)V

    .line 201
    .line 202
    .line 203
    iget-object p0, v0, La/me6;->B:La/p7m0;

    .line 204
    .line 205
    invoke-virtual {v0}, La/me6;->C()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    iget-object p0, v0, La/me6;->C:La/p7m0;

    .line 216
    .line 217
    iget-object v1, v0, La/me6;->u:La/tqc;

    .line 218
    .line 219
    iget v3, v0, La/me6;->b:I

    .line 220
    .line 221
    invoke-virtual {v1, v3}, La/tqc;->c(I)Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0}, La/me6;->w()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0}, La/me6;->x()V

    .line 239
    .line 240
    .line 241
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    return-object p0

    .line 244
    :pswitch_1
    iget-object p0, p0, La/wd6;->j2:La/fiu0;

    .line 245
    .line 246
    if-eqz p0, :cond_2

    .line 247
    .line 248
    return-object p0

    .line 249
    :cond_2
    const-string p0, "viewModelFactory"

    .line 250
    .line 251
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw v2

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
