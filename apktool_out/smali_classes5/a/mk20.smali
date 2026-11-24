.class public final synthetic La/mk20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/nn20;

.field public final synthetic c:La/m97;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/nn20;La/m97;Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/mk20;->a:B

    iput-object p1, p0, La/mk20;->b:La/nn20;

    iput-object p2, p0, La/mk20;->c:La/m97;

    iput-object p3, p0, La/mk20;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mk20;->a:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    move-object/from16 v5, p1

    .line 7
    .line 8
    check-cast v5, La/m97;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-boolean v1, v5, La/m97;->d:Z

    .line 14
    .line 15
    iget-object v4, v0, La/mk20;->b:La/nn20;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    sget v1, La/nn20;->c1:I

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v3, La/xg0;

    .line 25
    .line 26
    const/16 v8, 0x11

    .line 27
    .line 28
    iget-object v6, v0, La/mk20;->c:La/m97;

    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    invoke-direct/range {v3 .. v8}, La/xg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v4, v7, v7, v3, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 35
    .line 36
    .line 37
    :cond_0
    new-instance v1, La/qc20;

    .line 38
    .line 39
    new-instance v5, La/xdk0;

    .line 40
    .line 41
    sget-object v6, La/rek0;->b:La/rek0;

    .line 42
    .line 43
    sget-object v10, La/jdk0;->a:La/jdk0;

    .line 44
    .line 45
    const/4 v11, 0x0

    .line 46
    const/16 v12, 0x6c

    .line 47
    .line 48
    iget-object v7, v0, La/mk20;->d:Ljava/lang/String;

    .line 49
    .line 50
    const/4 v8, 0x0

    .line 51
    const/4 v9, 0x0

    .line 52
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, v5}, La/qc20;-><init>(La/xdk0;)V

    .line 56
    .line 57
    .line 58
    sget v0, La/nn20;->c1:I

    .line 59
    .line 60
    invoke-virtual {v4, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, La/nn20;->M0()V

    .line 64
    .line 65
    .line 66
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_0
    iget-object v6, v0, La/mk20;->c:La/m97;

    .line 70
    .line 71
    iget-wide v8, v6, La/m97;->l:D

    .line 72
    .line 73
    iget-wide v10, v5, La/m97;->l:D

    .line 74
    .line 75
    sget v1, La/nn20;->c1:I

    .line 76
    .line 77
    iget-object v4, v0, La/mk20;->b:La/nn20;

    .line 78
    .line 79
    const/4 v12, 0x0

    .line 80
    move-object v7, v4

    .line 81
    invoke-virtual/range {v7 .. v12}, La/nn20;->a0(DDZ)La/czc;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iget-object v3, v4, La/nn20;->S:La/ctf0;

    .line 86
    .line 87
    new-instance v7, La/qc20;

    .line 88
    .line 89
    sget-object v9, La/pek0;->a:La/pek0;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    const/4 v10, 0x2

    .line 96
    const/4 v11, 0x0

    .line 97
    const/4 v12, 0x1

    .line 98
    if-eq v8, v12, :cond_3

    .line 99
    .line 100
    if-eq v8, v10, :cond_2

    .line 101
    .line 102
    if-eq v8, v2, :cond_1

    .line 103
    .line 104
    iget-object v0, v0, La/mk20;->d:Ljava/lang/String;

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    new-array v0, v11, [Ljava/lang/Object;

    .line 108
    .line 109
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 110
    .line 111
    invoke-static {v0, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const v8, 0x7f13023f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v8, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    goto :goto_0

    .line 123
    :cond_2
    new-array v0, v11, [Ljava/lang/Object;

    .line 124
    .line 125
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 126
    .line 127
    invoke-static {v0, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const v8, 0x7f130241

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3, v8, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    goto :goto_0

    .line 139
    :cond_3
    new-array v0, v11, [Ljava/lang/Object;

    .line 140
    .line 141
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 142
    .line 143
    invoke-static {v0, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const v8, 0x7f130242

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3, v8, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    const/4 v3, 0x0

    .line 159
    if-eq v1, v12, :cond_6

    .line 160
    .line 161
    if-eq v1, v10, :cond_5

    .line 162
    .line 163
    if-eq v1, v2, :cond_4

    .line 164
    .line 165
    move-object v14, v3

    .line 166
    goto :goto_2

    .line 167
    :cond_4
    const v1, 0x7f080be7

    .line 168
    .line 169
    .line 170
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    :goto_1
    move-object v14, v1

    .line 175
    goto :goto_2

    .line 176
    :cond_5
    const v1, 0x7f080be4

    .line 177
    .line 178
    .line 179
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    goto :goto_1

    .line 184
    :cond_6
    const v1, 0x7f080be9

    .line 185
    .line 186
    .line 187
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    goto :goto_1

    .line 192
    :goto_2
    sget-object v13, La/jdk0;->a:La/jdk0;

    .line 193
    .line 194
    new-instance v8, La/xdk0;

    .line 195
    .line 196
    const/4 v12, 0x0

    .line 197
    const/16 v15, 0x4c

    .line 198
    .line 199
    move v1, v11

    .line 200
    const/4 v11, 0x0

    .line 201
    move-object v10, v0

    .line 202
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 203
    .line 204
    .line 205
    invoke-direct {v7, v8}, La/qc20;-><init>(La/xdk0;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4, v7}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    move-object v0, v3

    .line 212
    new-instance v3, La/hnp;

    .line 213
    .line 214
    const/4 v8, 0x0

    .line 215
    move v7, v1

    .line 216
    invoke-direct/range {v3 .. v8}, La/hnp;-><init>(La/nn20;La/m97;La/m97;ZLa/yje;)V

    .line 217
    .line 218
    .line 219
    invoke-static {v4, v0, v0, v3, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v4}, La/nn20;->M0()V

    .line 223
    .line 224
    .line 225
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    return-object v0

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
