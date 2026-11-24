.class public final synthetic La/w34;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xex;


# direct methods
.method public synthetic constructor <init>(La/xex;IJJ)V
    .locals 0

    .line 3
    const/4 p2, 0x1

    iput-byte p2, p0, La/w34;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/w34;->b:La/xex;

    return-void
.end method

.method public synthetic constructor <init>(La/xex;J)V
    .locals 0

    .line 2
    const/4 p2, 0x2

    iput-byte p2, p0, La/w34;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/w34;->b:La/xex;

    return-void
.end method

.method public synthetic constructor <init>(La/xex;Landroidx/media3/common/b;La/alj;)V
    .locals 0

    .line 1
    const/16 p2, 0x8

    iput-byte p2, p0, La/w34;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/w34;->b:La/xex;

    return-void
.end method

.method public synthetic constructor <init>(La/xex;Ljava/lang/Object;B)V
    .locals 0

    .line 4
    iput-byte p3, p0, La/w34;->a:B

    iput-object p1, p0, La/w34;->b:La/xex;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/xex;Ljava/lang/String;JJ)V
    .locals 0

    .line 5
    const/4 p2, 0x4

    iput-byte p2, p0, La/w34;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/w34;->b:La/xex;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-byte v0, p0, La/w34;->a:B

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    iget-object p0, p0, La/w34;->b:La/xex;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/xex;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/qlo;

    .line 13
    .line 14
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 17
    .line 18
    iget-object p0, p0, La/ulo;->s:La/fsj;

    .line 19
    .line 20
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, La/csj;

    .line 25
    .line 26
    const/16 v2, 0xe

    .line 27
    .line 28
    invoke-direct {v1, v2}, La/csj;-><init>(B)V

    .line 29
    .line 30
    .line 31
    const/16 v2, 0x407

    .line 32
    .line 33
    invoke-virtual {p0, v0, v2, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    iget-object p0, p0, La/xex;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, La/qlo;

    .line 40
    .line 41
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 42
    .line 43
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 44
    .line 45
    iget-object p0, p0, La/ulo;->s:La/fsj;

    .line 46
    .line 47
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v1, La/csj;

    .line 52
    .line 53
    const/4 v2, 0x7

    .line 54
    invoke-direct {v1, v2}, La/csj;-><init>(B)V

    .line 55
    .line 56
    .line 57
    const/16 v2, 0x3f1

    .line 58
    .line 59
    invoke-virtual {p0, v0, v2, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_1
    iget-object p0, p0, La/xex;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, La/qlo;

    .line 66
    .line 67
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 68
    .line 69
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 70
    .line 71
    iget-object p0, p0, La/ulo;->s:La/fsj;

    .line 72
    .line 73
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v2, La/csj;

    .line 78
    .line 79
    invoke-direct {v2, v1}, La/csj;-><init>(B)V

    .line 80
    .line 81
    .line 82
    const/16 v1, 0x3f6

    .line 83
    .line 84
    invoke-virtual {p0, v0, v1, v2}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_2
    iget-object p0, p0, La/xex;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p0, La/qlo;

    .line 91
    .line 92
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 93
    .line 94
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 95
    .line 96
    iget-object p0, p0, La/ulo;->s:La/fsj;

    .line 97
    .line 98
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    new-instance v1, La/t9f;

    .line 103
    .line 104
    const/16 v2, 0x1a

    .line 105
    .line 106
    invoke-direct {v1, v2}, La/t9f;-><init>(B)V

    .line 107
    .line 108
    .line 109
    const/16 v2, 0x3ef

    .line 110
    .line 111
    invoke-virtual {p0, v0, v2, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :pswitch_3
    iget-object p0, p0, La/xex;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p0, La/qlo;

    .line 118
    .line 119
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 120
    .line 121
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 122
    .line 123
    iget-object p0, p0, La/ulo;->s:La/fsj;

    .line 124
    .line 125
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    new-instance v1, La/csj;

    .line 130
    .line 131
    const/16 v2, 0x14

    .line 132
    .line 133
    invoke-direct {v1, v2}, La/csj;-><init>(B)V

    .line 134
    .line 135
    .line 136
    const/16 v2, 0x3f4

    .line 137
    .line 138
    invoke-virtual {p0, v0, v2, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :pswitch_4
    iget-object p0, p0, La/xex;->b:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p0, La/qlo;

    .line 145
    .line 146
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 147
    .line 148
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 149
    .line 150
    iget-object p0, p0, La/ulo;->s:La/fsj;

    .line 151
    .line 152
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    new-instance v2, La/t9f;

    .line 157
    .line 158
    invoke-direct {v2, v1}, La/t9f;-><init>(B)V

    .line 159
    .line 160
    .line 161
    const/16 v1, 0x3f0

    .line 162
    .line 163
    invoke-virtual {p0, v0, v1, v2}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :pswitch_5
    iget-object p0, p0, La/xex;->b:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast p0, La/qlo;

    .line 170
    .line 171
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 172
    .line 173
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 174
    .line 175
    iget-object p0, p0, La/ulo;->s:La/fsj;

    .line 176
    .line 177
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    new-instance v1, La/csj;

    .line 182
    .line 183
    const/16 v2, 0x12

    .line 184
    .line 185
    invoke-direct {v1, v2}, La/csj;-><init>(B)V

    .line 186
    .line 187
    .line 188
    const/16 v2, 0x408

    .line 189
    .line 190
    invoke-virtual {p0, v0, v2, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :pswitch_6
    iget-object p0, p0, La/xex;->b:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast p0, La/qlo;

    .line 197
    .line 198
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 199
    .line 200
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 201
    .line 202
    iget-object p0, p0, La/ulo;->s:La/fsj;

    .line 203
    .line 204
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    new-instance v1, La/csj;

    .line 209
    .line 210
    const/16 v2, 0x11

    .line 211
    .line 212
    invoke-direct {v1, v2}, La/csj;-><init>(B)V

    .line 213
    .line 214
    .line 215
    const/16 v2, 0x3f2

    .line 216
    .line 217
    invoke-virtual {p0, v0, v2, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :pswitch_7
    iget-object p0, p0, La/xex;->b:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p0, La/qlo;

    .line 224
    .line 225
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 226
    .line 227
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 228
    .line 229
    iget-object p0, p0, La/ulo;->s:La/fsj;

    .line 230
    .line 231
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    new-instance v1, La/csj;

    .line 236
    .line 237
    const/16 v2, 0x10

    .line 238
    .line 239
    invoke-direct {v1, v2}, La/csj;-><init>(B)V

    .line 240
    .line 241
    .line 242
    const/16 v2, 0x3f3

    .line 243
    .line 244
    invoke-virtual {p0, v0, v2, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 245
    .line 246
    .line 247
    return-void

    .line 248
    :pswitch_8
    iget-object p0, p0, La/xex;->b:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast p0, La/qlo;

    .line 251
    .line 252
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 253
    .line 254
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 255
    .line 256
    iget-object p0, p0, La/ulo;->s:La/fsj;

    .line 257
    .line 258
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    new-instance v1, La/t9f;

    .line 263
    .line 264
    const/16 v2, 0x15

    .line 265
    .line 266
    invoke-direct {v1, v2}, La/t9f;-><init>(B)V

    .line 267
    .line 268
    .line 269
    const/16 v2, 0x405

    .line 270
    .line 271
    invoke-virtual {p0, v0, v2, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
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
