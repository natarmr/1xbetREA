.class public final La/sx00;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/tx00;


# direct methods
.method public synthetic constructor <init>(La/tx00;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sx00;->i:B

    iput-object p1, p0, La/sx00;->k:La/tx00;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/sx00;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/sx00;->k:La/tx00;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/sx00;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/sx00;-><init>(La/tx00;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/sx00;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/sx00;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/sx00;-><init>(La/tx00;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/sx00;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/sx00;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/by00;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/sx00;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/sx00;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/sx00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/ey00;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/sx00;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/sx00;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/sx00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/sx00;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/sx00;->k:La/tx00;

    .line 6
    .line 7
    iget-object p0, p0, La/sx00;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/by00;

    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p1, La/yx00;->a:La/yx00;

    .line 20
    .line 21
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-static {v3}, La/tx00;->T0(La/tx00;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, v2, v2, v2}, La/sik;->z0(ZZZ)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    sget-object p1, La/zx00;->a:La/zx00;

    .line 35
    .line 36
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-static {v3}, La/tx00;->T0(La/tx00;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, La/j120;->h0(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    sget-object p1, La/ay00;->a:La/ay00;

    .line 54
    .line 55
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eqz p0, :cond_2

    .line 60
    .line 61
    sget-object p0, La/tx00;->l2:La/evz;

    .line 62
    .line 63
    iget-object p0, v3, La/tx00;->k2:La/phf0;

    .line 64
    .line 65
    sget-object p1, La/tx00;->m2:[La/iiy;

    .line 66
    .line 67
    const/4 v0, 0x3

    .line 68
    aget-object p1, p1, v0

    .line 69
    .line 70
    invoke-virtual {p0, v3, p1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 75
    .line 76
    new-instance v0, Lkotlin/Pair;

    .line 77
    .line 78
    const-string v1, "CONNECTION_LOST"

    .line 79
    .line 80
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p1, v3, p0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, La/sik;->y0()V

    .line 95
    .line 96
    .line 97
    :goto_0
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 101
    .line 102
    .line 103
    :goto_1
    return-object v1

    .line 104
    :pswitch_0
    check-cast p0, La/ey00;

    .line 105
    .line 106
    sget-object v0, La/wne;->a:La/wne;

    .line 107
    .line 108
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iget-object p1, p0, La/ey00;->a:Ljava/lang/String;

    .line 112
    .line 113
    iget-boolean p0, p0, La/ey00;->b:Z

    .line 114
    .line 115
    sget-object v0, La/tx00;->l2:La/evz;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, La/u0i;->K0()Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iget-object v0, v0, Lorg/xplatform/uikit/components/dialog/DialogFields;->b:Ljava/lang/CharSequence;

    .line 125
    .line 126
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-nez v0, :cond_3

    .line 131
    .line 132
    invoke-virtual {v3}, La/u0i;->K0()Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    const/16 v4, 0x7fd

    .line 137
    .line 138
    invoke-static {v0, p1, v1, v2, v4}, Lorg/xplatform/uikit/components/dialog/DialogFields;->a(Lorg/xplatform/uikit/components/dialog/DialogFields;Ljava/lang/String;Ljava/lang/String;II)Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {v3, p1}, La/u0i;->R0(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 143
    .line 144
    .line 145
    iget-object p1, v3, La/u0i;->a2:La/l12;

    .line 146
    .line 147
    if-eqz p1, :cond_3

    .line 148
    .line 149
    invoke-virtual {v3}, La/u0i;->K0()Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-interface {p1, v0}, La/l12;->setModel(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 154
    .line 155
    .line 156
    :cond_3
    iget-object p1, v3, La/u0i;->a2:La/l12;

    .line 157
    .line 158
    if-eqz p1, :cond_4

    .line 159
    .line 160
    invoke-interface {p1}, La/l12;->getPositiveButton()Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    goto :goto_2

    .line 165
    :cond_4
    move-object p1, v1

    .line 166
    :goto_2
    if-eqz p1, :cond_5

    .line 167
    .line 168
    invoke-virtual {p1, p0}, Landroid/view/View;->setClickable(Z)V

    .line 169
    .line 170
    .line 171
    :cond_5
    iget-object p1, v3, La/u0i;->a2:La/l12;

    .line 172
    .line 173
    if-eqz p1, :cond_6

    .line 174
    .line 175
    invoke-interface {p1}, La/l12;->getNegativeButton()Landroid/view/View;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    :cond_6
    if-eqz v1, :cond_7

    .line 180
    .line 181
    invoke-virtual {v1, p0}, Landroid/view/View;->setClickable(Z)V

    .line 182
    .line 183
    .line 184
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
