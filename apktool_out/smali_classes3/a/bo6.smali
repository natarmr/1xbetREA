.class public final synthetic La/bo6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fo6;


# direct methods
.method public synthetic constructor <init>(La/fo6;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bo6;->a:B

    iput-object p1, p0, La/bo6;->b:La/fo6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/bo6;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/bo6;->b:La/fo6;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Long;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    check-cast p2, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    sget-object p1, La/fo6;->W1:La/kj5;

    .line 22
    .line 23
    invoke-virtual {p0}, La/fo6;->H0()La/po6;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-object p1, v1, La/po6;->D:La/mne;

    .line 32
    .line 33
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 34
    .line 35
    new-instance v5, La/yj5;

    .line 36
    .line 37
    const/4 v11, 0x0

    .line 38
    const/16 v12, 0xe

    .line 39
    .line 40
    const/4 v6, 0x1

    .line 41
    const-class v8, La/po6;

    .line 42
    .line 43
    const-string v9, "emitShowSnackBarWithDefaultErrorMessage"

    .line 44
    .line 45
    const-string v10, "emitShowSnackBarWithDefaultErrorMessage(Ljava/lang/Throwable;)V"

    .line 46
    .line 47
    move-object v7, v1

    .line 48
    invoke-direct/range {v5 .. v12}, La/yj5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 49
    .line 50
    .line 51
    move-object v6, v5

    .line 52
    new-instance v0, La/zg1;

    .line 53
    .line 54
    const/4 v5, 0x0

    .line 55
    invoke-direct/range {v0 .. v5}, La/zg1;-><init>(La/po6;JILa/yje;)V

    .line 56
    .line 57
    .line 58
    const/16 v10, 0xa

    .line 59
    .line 60
    const/4 v7, 0x0

    .line 61
    move-object v5, p0

    .line 62
    move-object v8, p1

    .line 63
    move-object v9, v0

    .line 64
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 71
    .line 72
    check-cast p2, Landroid/os/Bundle;

    .line 73
    .line 74
    sget-object v0, La/fo6;->W1:La/kj5;

    .line 75
    .line 76
    const-string v0, "REQUEST_TEAM_ACTION_KEY"

    .line 77
    .line 78
    invoke-static {p2, p1, v0}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_0

    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    const-string p1, "RESULT_ON_ITEM_ACTION_LISTENER_KEY"

    .line 88
    .line 89
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_1

    .line 94
    .line 95
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    check-cast p1, La/ojp0;

    .line 103
    .line 104
    invoke-virtual {p0}, La/fo6;->H0()La/po6;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    new-instance v2, La/yj5;

    .line 113
    .line 114
    const/4 v8, 0x0

    .line 115
    const/16 v9, 0x11

    .line 116
    .line 117
    const/4 v3, 0x1

    .line 118
    const-class v5, La/po6;

    .line 119
    .line 120
    const-string v6, "emitShowSnackBarWithDefaultErrorMessage"

    .line 121
    .line 122
    const-string v7, "emitShowSnackBarWithDefaultErrorMessage(Ljava/lang/Throwable;)V"

    .line 123
    .line 124
    invoke-direct/range {v2 .. v9}, La/yj5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 125
    .line 126
    .line 127
    new-instance v9, La/cm3;

    .line 128
    .line 129
    const/16 p2, 0x1b

    .line 130
    .line 131
    invoke-direct {v9, v4, p1, v1, p2}, La/cm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 132
    .line 133
    .line 134
    const/16 v10, 0xe

    .line 135
    .line 136
    const/4 v7, 0x0

    .line 137
    const/4 v8, 0x0

    .line 138
    move-object v5, p0

    .line 139
    move-object v6, v2

    .line 140
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 141
    .line 142
    .line 143
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    :goto_0
    return-object p0

    .line 146
    :pswitch_1
    check-cast p1, La/fet;

    .line 147
    .line 148
    check-cast p2, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    sget-object v0, La/fo6;->W1:La/kj5;

    .line 155
    .line 156
    and-int/lit8 v0, p2, 0x3

    .line 157
    .line 158
    const/4 v2, 0x1

    .line 159
    const/4 v3, 0x2

    .line 160
    if-eq v0, v3, :cond_2

    .line 161
    .line 162
    move v0, v2

    .line 163
    goto :goto_1

    .line 164
    :cond_2
    const/4 v0, 0x0

    .line 165
    :goto_1
    and-int/2addr p2, v2

    .line 166
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    if-eqz p2, :cond_4

    .line 171
    .line 172
    sget-object p2, La/qmk;->a:La/zcl;

    .line 173
    .line 174
    invoke-static {p1}, La/qmk;->a(La/fet;)La/wfn;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    iget p2, p2, La/wfn;->c:F

    .line 179
    .line 180
    iget-object v0, p0, La/fo6;->P1:La/cge0;

    .line 181
    .line 182
    if-eqz v0, :cond_3

    .line 183
    .line 184
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 185
    .line 186
    const/4 v1, 0x0

    .line 187
    invoke-static {v0, p2, v1, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    sget-object v0, La/pb10;->c:La/xuz;

    .line 192
    .line 193
    sget-object v11, La/tef0;->c:La/tef0;

    .line 194
    .line 195
    new-instance v1, Lorg/xplatform/related/api/presentation/RelatedParams;

    .line 196
    .line 197
    const-wide/16 v7, -0x1

    .line 198
    .line 199
    const-wide/16 v9, -0x1

    .line 200
    .line 201
    const/4 v2, 0x0

    .line 202
    const-wide/16 v3, -0x1

    .line 203
    .line 204
    const-wide/16 v5, -0x1

    .line 205
    .line 206
    invoke-direct/range {v1 .. v11}, Lorg/xplatform/related/api/presentation/RelatedParams;-><init>(ZJJJJLa/tef0;)V

    .line 207
    .line 208
    .line 209
    invoke-static {p2, p0, v1, p1}, La/cge0;->b(La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/related/api/presentation/RelatedParams;La/fet;)V

    .line 210
    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_3
    const-string p0, "relatedGamesListFactory"

    .line 214
    .line 215
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw v1

    .line 219
    :cond_4
    invoke-virtual {p1}, La/fet;->X()V

    .line 220
    .line 221
    .line 222
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    return-object p0

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
