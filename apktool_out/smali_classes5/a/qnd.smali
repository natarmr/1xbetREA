.class public final synthetic La/qnd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/snd;


# direct methods
.method public synthetic constructor <init>(La/snd;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qnd;->a:B

    iput-object p1, p0, La/qnd;->b:La/snd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qnd;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/high16 v3, 0x41c00000    # 24.0f

    .line 8
    .line 9
    const/high16 v4, 0x3f800000    # 1.0f

    .line 10
    .line 11
    sget-object v5, La/jm40;->b:La/jm40;

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    iget-object v0, v0, La/qnd;->b:La/snd;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v15, p1

    .line 22
    .line 23
    check-cast v15, La/fet;

    .line 24
    .line 25
    move-object/from16 v1, p2

    .line 26
    .line 27
    check-cast v1, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    and-int/lit8 v9, v1, 0x3

    .line 34
    .line 35
    if-eq v9, v6, :cond_0

    .line 36
    .line 37
    move v6, v7

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v6, v8

    .line 40
    :goto_0
    and-int/2addr v1, v7

    .line 41
    invoke-virtual {v15, v1, v6}, La/fet;->U(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    sget-object v4, La/qmk;->a:La/zcl;

    .line 52
    .line 53
    invoke-static {v1, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    iget-object v10, v0, La/snd;->c:La/mdp0;

    .line 58
    .line 59
    iget-object v1, v0, La/snd;->a:La/cex;

    .line 60
    .line 61
    sget-object v3, La/cex;->b:La/cex;

    .line 62
    .line 63
    if-ne v1, v3, :cond_1

    .line 64
    .line 65
    move v11, v7

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move v11, v8

    .line 68
    :goto_1
    iget-object v12, v0, La/snd;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-boolean v13, v0, La/snd;->g:Z

    .line 71
    .line 72
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-ne v0, v2, :cond_2

    .line 77
    .line 78
    new-instance v0, La/shd;

    .line 79
    .line 80
    const/16 v1, 0x11

    .line 81
    .line 82
    invoke-direct {v0, v1}, La/shd;-><init>(B)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v15, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    move-object v14, v0

    .line 89
    check-cast v14, Lkotlin/jvm/functions/Function2;

    .line 90
    .line 91
    const/high16 v16, 0x30000

    .line 92
    .line 93
    invoke-static/range {v9 .. v16}, La/dtb;->c(La/mm40;La/sdp0;ZLjava/lang/String;ZLkotlin/jvm/functions/Function2;La/fet;I)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    invoke-virtual {v15}, La/fet;->X()V

    .line 98
    .line 99
    .line 100
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_0
    move-object/from16 v1, p1

    .line 104
    .line 105
    check-cast v1, La/fet;

    .line 106
    .line 107
    move-object/from16 v9, p2

    .line 108
    .line 109
    check-cast v9, Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    and-int/lit8 v10, v9, 0x3

    .line 116
    .line 117
    if-eq v10, v6, :cond_4

    .line 118
    .line 119
    move v6, v7

    .line 120
    goto :goto_3

    .line 121
    :cond_4
    move v6, v8

    .line 122
    :goto_3
    and-int/2addr v9, v7

    .line 123
    invoke-virtual {v1, v9, v6}, La/fet;->U(IZ)Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-eqz v6, :cond_7

    .line 128
    .line 129
    invoke-static {v5, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    sget-object v5, La/qmk;->a:La/zcl;

    .line 134
    .line 135
    invoke-static {v4, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    iget-object v4, v0, La/snd;->b:La/mdp0;

    .line 140
    .line 141
    iget-object v5, v0, La/snd;->a:La/cex;

    .line 142
    .line 143
    sget-object v6, La/cex;->a:La/cex;

    .line 144
    .line 145
    if-ne v5, v6, :cond_5

    .line 146
    .line 147
    :goto_4
    move-object v5, v4

    .line 148
    goto :goto_5

    .line 149
    :cond_5
    move v7, v8

    .line 150
    goto :goto_4

    .line 151
    :goto_5
    iget-object v4, v0, La/snd;->d:Ljava/lang/String;

    .line 152
    .line 153
    iget-boolean v0, v0, La/snd;->e:Z

    .line 154
    .line 155
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    if-ne v6, v2, :cond_6

    .line 160
    .line 161
    new-instance v6, La/shd;

    .line 162
    .line 163
    const/16 v2, 0x12

    .line 164
    .line 165
    invoke-direct {v6, v2}, La/shd;-><init>(B)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :cond_6
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 172
    .line 173
    const/high16 v8, 0x30000

    .line 174
    .line 175
    move v2, v7

    .line 176
    move-object v7, v1

    .line 177
    move-object v1, v3

    .line 178
    move v3, v2

    .line 179
    move-object v2, v5

    .line 180
    move v5, v0

    .line 181
    invoke-static/range {v1 .. v8}, La/dtb;->c(La/mm40;La/sdp0;ZLjava/lang/String;ZLkotlin/jvm/functions/Function2;La/fet;I)V

    .line 182
    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_7
    move-object v7, v1

    .line 186
    invoke-virtual {v7}, La/fet;->X()V

    .line 187
    .line 188
    .line 189
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object v0

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
