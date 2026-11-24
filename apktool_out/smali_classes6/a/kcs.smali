.class public final synthetic La/kcs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mcs;


# direct methods
.method public synthetic constructor <init>(La/mcs;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kcs;->a:B

    iput-object p1, p0, La/kcs;->b:La/mcs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kcs;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/kcs;->b:La/mcs;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, La/ims;

    .line 13
    .line 14
    sget-object v2, La/mcs;->Z1:La/bek;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, La/mcs;->H0()La/k3t0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v2, La/ulr;

    .line 24
    .line 25
    invoke-direct {v2, v1}, La/ulr;-><init>(La/ims;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    move-object/from16 v1, p1

    .line 35
    .line 36
    check-cast v1, La/nus;

    .line 37
    .line 38
    sget-object v2, La/mcs;->Z1:La/bek;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, La/mcs;->H0()La/k3t0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v2, La/zlr;

    .line 48
    .line 49
    invoke-direct {v2, v1}, La/zlr;-><init>(La/nus;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_1
    move-object/from16 v1, p1

    .line 59
    .line 60
    check-cast v1, La/trs;

    .line 61
    .line 62
    sget-object v2, La/mcs;->Z1:La/bek;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    instance-of v2, v1, La/rrs;

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    const-string v4, "snackbarManager"

    .line 71
    .line 72
    if-eqz v2, :cond_2

    .line 73
    .line 74
    check-cast v1, La/rrs;

    .line 75
    .line 76
    iget-object v1, v1, La/rrs;->a:La/wus;

    .line 77
    .line 78
    iget-object v2, v0, La/mcs;->Q1:La/xi70;

    .line 79
    .line 80
    if-eqz v2, :cond_1

    .line 81
    .line 82
    iget-object v5, v0, La/mcs;->P1:La/wdk0;

    .line 83
    .line 84
    if-eqz v5, :cond_0

    .line 85
    .line 86
    new-instance v3, La/kcs;

    .line 87
    .line 88
    const/4 v4, 0x1

    .line 89
    invoke-direct {v3, v0, v4}, La/kcs;-><init>(La/mcs;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v1, v2, v5, v3}, La/ntb;->S(Landroidx/fragment/app/Fragment;La/wus;La/xi70;La/wdk0;Lkotlin/jvm/functions/Function1;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v3

    .line 100
    :cond_1
    const-string v0, "quickBetDialogNavigator"

    .line 101
    .line 102
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v3

    .line 106
    :cond_2
    instance-of v2, v1, La/qrs;

    .line 107
    .line 108
    if-eqz v2, :cond_4

    .line 109
    .line 110
    check-cast v1, La/qrs;

    .line 111
    .line 112
    iget-object v1, v1, La/qrs;->a:La/xa30;

    .line 113
    .line 114
    iget-object v2, v0, La/mcs;->P1:La/wdk0;

    .line 115
    .line 116
    if-eqz v2, :cond_3

    .line 117
    .line 118
    new-instance v3, La/kcs;

    .line 119
    .line 120
    const/4 v4, 0x2

    .line 121
    invoke-direct {v3, v0, v4}, La/kcs;-><init>(La/mcs;B)V

    .line 122
    .line 123
    .line 124
    invoke-static {v0, v1, v2, v3}, La/cww;->v(Landroidx/fragment/app/Fragment;La/xa30;La/wdk0;Lkotlin/jvm/functions/Function1;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_3
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v3

    .line 132
    :cond_4
    instance-of v2, v1, La/srs;

    .line 133
    .line 134
    if-eqz v2, :cond_6

    .line 135
    .line 136
    check-cast v1, La/srs;

    .line 137
    .line 138
    iget-object v7, v1, La/srs;->a:Ljava/lang/String;

    .line 139
    .line 140
    iget-object v1, v0, La/mcs;->P1:La/wdk0;

    .line 141
    .line 142
    if-eqz v1, :cond_5

    .line 143
    .line 144
    new-instance v5, La/xdk0;

    .line 145
    .line 146
    sget-object v6, La/rek0;->b:La/rek0;

    .line 147
    .line 148
    const/4 v11, 0x0

    .line 149
    const/16 v12, 0x7c

    .line 150
    .line 151
    const/4 v8, 0x0

    .line 152
    const/4 v9, 0x0

    .line 153
    const/4 v10, 0x0

    .line 154
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 155
    .line 156
    .line 157
    iget-object v2, v0, La/mcs;->X1:La/s0r;

    .line 158
    .line 159
    sget-object v3, La/mcs;->a2:[La/iiy;

    .line 160
    .line 161
    const/4 v4, 0x0

    .line 162
    aget-object v3, v3, v4

    .line 163
    .line 164
    invoke-virtual {v2, v3, v0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    check-cast v2, La/aid;

    .line 172
    .line 173
    iget-object v11, v2, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 174
    .line 175
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 176
    .line 177
    .line 178
    move-result-object v10

    .line 179
    const/4 v15, 0x0

    .line 180
    const/16 v16, 0x78

    .line 181
    .line 182
    const/4 v12, 0x0

    .line 183
    const/4 v13, 0x0

    .line 184
    const/4 v14, 0x0

    .line 185
    move-object v8, v1

    .line 186
    move-object v9, v5

    .line 187
    invoke-static/range {v8 .. v16}, La/wdk0;->j(La/wdk0;La/xdk0;La/kxq;Landroid/view/View;Lkotlin/jvm/functions/Function0;ZZLjava/lang/Integer;I)La/ndk0;

    .line 188
    .line 189
    .line 190
    :goto_0
    invoke-virtual {v0}, La/mcs;->H0()La/k3t0;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    sget-object v1, La/olr;->a:La/olr;

    .line 195
    .line 196
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_5
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v3

    .line 206
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 207
    .line 208
    .line 209
    :goto_1
    return-object v3

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
