.class public final synthetic La/yh40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ai40;


# direct methods
.method public synthetic constructor <init>(La/ai40;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yh40;->a:B

    iput-object p1, p0, La/yh40;->b:La/ai40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/yh40;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/yh40;->b:La/ai40;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/ims;

    .line 9
    .line 10
    sget-object v0, La/ai40;->b2:La/atz;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/ai40;->H0()La/k3t0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v0, La/lh40;

    .line 20
    .line 21
    invoke-direct {v0, p1}, La/lh40;-><init>(La/ims;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, La/nus;

    .line 31
    .line 32
    sget-object v0, La/ai40;->b2:La/atz;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/ai40;->H0()La/k3t0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance v0, La/th40;

    .line 42
    .line 43
    invoke-direct {v0, p1}, La/th40;-><init>(La/nus;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_1
    check-cast p1, La/bl40;

    .line 53
    .line 54
    sget-object v0, La/ai40;->b2:La/atz;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    instance-of v0, p1, La/zk40;

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    const/4 v2, 0x0

    .line 63
    const-string v3, "snackbarManager"

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    check-cast p1, La/zk40;

    .line 68
    .line 69
    iget-object p1, p1, La/zk40;->a:La/wus;

    .line 70
    .line 71
    iget-object v0, p0, La/ai40;->R1:La/xi70;

    .line 72
    .line 73
    if-eqz v0, :cond_1

    .line 74
    .line 75
    iget-object v4, p0, La/ai40;->P1:La/wdk0;

    .line 76
    .line 77
    if-eqz v4, :cond_0

    .line 78
    .line 79
    new-instance v2, La/yh40;

    .line 80
    .line 81
    invoke-direct {v2, p0, v1}, La/yh40;-><init>(La/ai40;B)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0, p1, v0, v4, v2}, La/ntb;->S(Landroidx/fragment/app/Fragment;La/wus;La/xi70;La/wdk0;Lkotlin/jvm/functions/Function1;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v2

    .line 92
    :cond_1
    const-string p0, "quickBetDialogNavigator"

    .line 93
    .line 94
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v2

    .line 98
    :cond_2
    instance-of v0, p1, La/yk40;

    .line 99
    .line 100
    const/4 v4, 0x2

    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    check-cast p1, La/yk40;

    .line 104
    .line 105
    iget-object p1, p1, La/yk40;->a:La/xa30;

    .line 106
    .line 107
    iget-object v0, p0, La/ai40;->P1:La/wdk0;

    .line 108
    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    new-instance v1, La/yh40;

    .line 112
    .line 113
    invoke-direct {v1, p0, v4}, La/yh40;-><init>(La/ai40;B)V

    .line 114
    .line 115
    .line 116
    invoke-static {p0, p1, v0, v1}, La/cww;->v(Landroidx/fragment/app/Fragment;La/xa30;La/wdk0;Lkotlin/jvm/functions/Function1;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v2

    .line 124
    :cond_4
    instance-of p1, p1, La/al40;

    .line 125
    .line 126
    if-eqz p1, :cond_7

    .line 127
    .line 128
    iget-object p1, p0, La/ai40;->Q1:La/poq0;

    .line 129
    .line 130
    if-eqz p1, :cond_6

    .line 131
    .line 132
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    sget-object v0, La/fk60;->b:La/uuz;

    .line 140
    .line 141
    sget-object v0, La/ki60;->q2:La/htz;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    const-string v0, "OnboardingBottomSheetContainerFragment"

    .line 147
    .line 148
    invoke-virtual {p1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    if-nez v2, :cond_5

    .line 153
    .line 154
    new-instance v2, La/ki60;

    .line 155
    .line 156
    invoke-direct {v2}, La/ki60;-><init>()V

    .line 157
    .line 158
    .line 159
    sget-object v3, La/ki60;->r2:[La/iiy;

    .line 160
    .line 161
    aget-object v1, v3, v1

    .line 162
    .line 163
    iget-object v5, v2, La/ki60;->n2:La/zz2;

    .line 164
    .line 165
    const/16 v6, 0x15

    .line 166
    .line 167
    invoke-virtual {v5, v2, v1, v6}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 168
    .line 169
    .line 170
    iget-object v1, v2, La/ki60;->o2:La/phf0;

    .line 171
    .line 172
    aget-object v3, v3, v4

    .line 173
    .line 174
    const-string v4, ""

    .line 175
    .line 176
    invoke-virtual {v1, v2, v3, v4}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-static {v2, p1, v0}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    :cond_5
    :goto_0
    invoke-virtual {p0}, La/ai40;->H0()La/k3t0;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    sget-object p1, La/ih40;->a:La/ih40;

    .line 187
    .line 188
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_6
    const-string p0, "tipsDialogFeature"

    .line 195
    .line 196
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw v2

    .line 200
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 201
    .line 202
    .line 203
    :goto_1
    return-object v2

    .line 204
    nop

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
