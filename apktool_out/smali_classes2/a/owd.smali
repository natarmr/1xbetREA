.class public final synthetic La/owd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ctf0;


# direct methods
.method public synthetic constructor <init>(La/ctf0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/owd;->a:B

    iput-object p1, p0, La/owd;->b:La/ctf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/owd;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/owd;->b:La/ctf0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v0, La/elh0;

    .line 10
    .line 11
    new-array v2, v1, [Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 14
    .line 15
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const v2, 0x7f1311dc

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object v1, La/lak0;->c:La/lak0;

    .line 27
    .line 28
    invoke-direct {v0, v1, p0}, La/elh0;-><init>(La/a4x;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_0
    new-instance v0, La/hbk;

    .line 33
    .line 34
    new-array v2, v1, [Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v3, p0, La/ctf0;->b:La/lsm0;

    .line 37
    .line 38
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const v4, 0x7f1306c4

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    new-array v3, v1, [Ljava/lang/Object;

    .line 50
    .line 51
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 52
    .line 53
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const v3, 0x7f1306bb

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-direct {v0, v2, p0}, La/hbk;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_1
    new-instance v0, La/m5j;

    .line 69
    .line 70
    new-instance v2, La/j5j;

    .line 71
    .line 72
    new-array v3, v1, [Ljava/lang/Object;

    .line 73
    .line 74
    iget-object v4, p0, La/ctf0;->b:La/lsm0;

    .line 75
    .line 76
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    const v5, 0x7f130647

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    new-array v4, v1, [Ljava/lang/Object;

    .line 88
    .line 89
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 90
    .line 91
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    const v5, 0x7f13065f

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-direct {v2, v3, v4}, La/j5j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    new-instance v3, La/j5j;

    .line 106
    .line 107
    new-array v4, v1, [Ljava/lang/Object;

    .line 108
    .line 109
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    const v5, 0x7f13064f

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    new-array v5, v1, [Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {v5, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    const v6, 0x7f13064e

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-direct {v3, v4, v5}, La/j5j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    new-instance v4, La/j5j;

    .line 137
    .line 138
    new-array v5, v1, [Ljava/lang/Object;

    .line 139
    .line 140
    invoke-static {v5, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    const v6, 0x7f13065d

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    new-array v6, v1, [Ljava/lang/Object;

    .line 152
    .line 153
    invoke-static {v6, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    const v6, 0x7f13065c

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, v6, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-direct {v4, v5, p0}, La/j5j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    filled-new-array {v2, v3, v4}, [La/j5j;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-direct {v0, p0}, La/m5j;-><init>(Ljava/util/List;)V

    .line 176
    .line 177
    .line 178
    return-object v0

    .line 179
    :pswitch_2
    move v0, v1

    .line 180
    new-instance v1, La/gwd;

    .line 181
    .line 182
    new-array v2, v0, [Ljava/lang/Object;

    .line 183
    .line 184
    iget-object v3, p0, La/ctf0;->b:La/lsm0;

    .line 185
    .line 186
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    const v4, 0x7f130aae

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    new-array v2, v0, [Ljava/lang/Object;

    .line 198
    .line 199
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 200
    .line 201
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    const v3, 0x7f130aaf

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    new-array v2, v0, [Ljava/lang/Object;

    .line 213
    .line 214
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    const v2, 0x7f130abf

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    const-string v2, ""

    .line 226
    .line 227
    const-string v3, ""

    .line 228
    .line 229
    const-string v4, ""

    .line 230
    .line 231
    invoke-direct/range {v1 .. v7}, La/gwd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    return-object v1

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
