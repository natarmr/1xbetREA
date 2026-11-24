.class public final La/q6b0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/u6b0;


# direct methods
.method public synthetic constructor <init>(La/u6b0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/q6b0;->i:B

    iput-object p1, p0, La/q6b0;->k:La/u6b0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/q6b0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/q6b0;->k:La/u6b0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/q6b0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/q6b0;-><init>(La/u6b0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/q6b0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/q6b0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/q6b0;-><init>(La/u6b0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/q6b0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/q6b0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/j9b0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/q6b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/q6b0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/q6b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/mo4;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/q6b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/q6b0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/q6b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/q6b0;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/q6b0;->k:La/u6b0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v0, v0, La/q6b0;->j:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v0, La/j9b0;

    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, La/h9b0;->a:La/h9b0;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-nez v4, :cond_1

    .line 27
    .line 28
    instance-of v0, v0, La/i9b0;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    sget-object v0, La/u6b0;->e2:La/xi70;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    new-array v4, v0, [Ljava/lang/String;

    .line 36
    .line 37
    const-string v5, "android.permission.POST_NOTIFICATIONS"

    .line 38
    .line 39
    invoke-static {v2, v5, v4}, La/m7x;->P(Landroidx/fragment/app/Fragment;Ljava/lang/String;[Ljava/lang/String;)La/khf0;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4}, La/khf0;->d()La/qog0;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    iget-object v5, v4, La/qog0;->b:Landroid/app/Activity;

    .line 48
    .line 49
    iget-object v6, v4, La/qog0;->c:[Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v6}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-static {v5, v6}, La/n4c;->J(Landroid/app/Activity;Ljava/util/List;)Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-static {v5}, La/n7x;->r(Ljava/util/ArrayList;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    new-instance v6, La/r6b0;

    .line 64
    .line 65
    invoke-direct {v6, v2, v0}, La/r6b0;-><init>(La/u6b0;B)V

    .line 66
    .line 67
    .line 68
    iput-object v6, v4, La/qog0;->e:Lkotlin/jvm/functions/Function0;

    .line 69
    .line 70
    new-instance v6, La/s6b0;

    .line 71
    .line 72
    invoke-direct {v6, v4, v2, v5, v0}, La/s6b0;-><init>(La/qog0;La/yx5;ZB)V

    .line 73
    .line 74
    .line 75
    iget-object v0, v4, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 76
    .line 77
    invoke-interface {v0, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, La/qog0;->a()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, La/u6b0;->J0()La/sbb0;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget-object v0, v0, La/sbb0;->H0:La/p7m0;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v3, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    :goto_1
    return-object v3

    .line 103
    :pswitch_0
    check-cast v0, La/mo4;

    .line 104
    .line 105
    sget-object v1, La/wne;->a:La/wne;

    .line 106
    .line 107
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-object v1, v0, La/mo4;->a:Landroid/text/SpannableString;

    .line 111
    .line 112
    iget-object v0, v0, La/mo4;->b:Ljava/lang/String;

    .line 113
    .line 114
    sget-object v4, La/u6b0;->e2:La/xi70;

    .line 115
    .line 116
    iget-object v4, v2, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 117
    .line 118
    if-nez v4, :cond_2

    .line 119
    .line 120
    new-instance v4, Landroid/os/Bundle;

    .line 121
    .line 122
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v4}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 126
    .line 127
    .line 128
    :cond_2
    const-string v5, "RESET_AUTHENTICATOR_SECRET_HASH_KEY"

    .line 129
    .line 130
    invoke-virtual {v4, v5, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    iget-object v0, v2, La/u6b0;->S1:La/ii;

    .line 134
    .line 135
    if-eqz v0, :cond_3

    .line 136
    .line 137
    new-instance v4, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 138
    .line 139
    const v3, 0x7f130162

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    const v1, 0x7f1304ff

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    const v1, 0x7f130e5c

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    sget-object v13, La/n12;->a:La/n12;

    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    const/16 v15, 0x5d0

    .line 171
    .line 172
    const/4 v9, 0x0

    .line 173
    const-string v10, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY"

    .line 174
    .line 175
    const/4 v11, 0x0

    .line 176
    const/4 v12, 0x0

    .line 177
    invoke-direct/range {v4 .. v15}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v4, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 188
    .line 189
    .line 190
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object v0

    .line 193
    :cond_3
    const-string v0, "actionDialogManager"

    .line 194
    .line 195
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v3

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
