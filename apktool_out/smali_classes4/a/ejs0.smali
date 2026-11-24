.class public final synthetic La/ejs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gjs0;


# direct methods
.method public synthetic constructor <init>(La/gjs0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ejs0;->a:B

    iput-object p1, p0, La/ejs0;->b:La/gjs0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/ejs0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ejs0;->b:La/gjs0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/oks0;

    .line 9
    .line 10
    sget-object v0, La/gjs0;->R1:La/j6m0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/kks0;

    .line 16
    .line 17
    iget-object v3, p0, La/ejs0;->b:La/gjs0;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {v3}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    instance-of p0, p1, La/mks0;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    check-cast p1, La/mks0;

    .line 31
    .line 32
    iget-object v6, p1, La/mks0;->a:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v1, v3, La/gjs0;->L1:La/wdk0;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    new-instance v2, La/xdk0;

    .line 39
    .line 40
    sget-object v5, La/rek0;->b:La/rek0;

    .line 41
    .line 42
    const/4 v10, 0x0

    .line 43
    const/16 v11, 0x7c

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    move-object v4, v2

    .line 49
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 50
    .line 51
    .line 52
    const/16 v8, 0x3fc

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    const/4 v6, 0x0

    .line 57
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const-string p0, "snackbarManager"

    .line 62
    .line 63
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v0

    .line 67
    :cond_2
    instance-of p0, p1, La/lks0;

    .line 68
    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    check-cast p1, La/lks0;

    .line 72
    .line 73
    const-class p0, La/zis0;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    new-instance v0, La/ck60;

    .line 80
    .line 81
    const/16 v1, 0x1c

    .line 82
    .line 83
    invoke-direct {v0, v3, p0, p1, v1}, La/ck60;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    invoke-static {v3, v0}, La/j120;->P(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    instance-of p0, p1, La/nks0;

    .line 91
    .line 92
    if-eqz p0, :cond_4

    .line 93
    .line 94
    check-cast p1, La/nks0;

    .line 95
    .line 96
    const-class p0, La/uks0;

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    new-instance v0, La/ck60;

    .line 103
    .line 104
    const/16 v1, 0x1d

    .line 105
    .line 106
    invoke-direct {v0, v3, p0, p1, v1}, La/ck60;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {v3, v0}, La/j120;->P(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 110
    .line 111
    .line 112
    :goto_0
    invoke-virtual {v3}, La/gjs0;->G0()La/k3t0;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    sget-object p1, La/ais0;->a:La/ais0;

    .line 117
    .line 118
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 125
    .line 126
    .line 127
    :goto_1
    return-object v0

    .line 128
    :pswitch_0
    check-cast p1, La/qis0;

    .line 129
    .line 130
    sget-object p0, La/gjs0;->R1:La/j6m0;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, La/gjs0;->G0()La/k3t0;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object p0

    .line 145
    :pswitch_1
    check-cast p1, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;

    .line 146
    .line 147
    sget-object p0, La/gjs0;->R1:La/j6m0;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, La/gjs0;->G0()La/k3t0;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    new-instance v0, La/ois0;

    .line 157
    .line 158
    invoke-direct {v0, p1}, La/ois0;-><init>(Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_2
    check-cast p1, Ljava/lang/Long;

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 170
    .line 171
    .line 172
    move-result-wide p0

    .line 173
    sget-object v0, La/gjs0;->R1:La/j6m0;

    .line 174
    .line 175
    invoke-virtual {v1}, La/gjs0;->G0()La/k3t0;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    new-instance v1, La/gis0;

    .line 180
    .line 181
    invoke-direct {v1, p0, p1}, La/gis0;-><init>(J)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    return-object p0

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
