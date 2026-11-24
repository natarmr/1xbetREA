.class public final synthetic La/p51;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/v51;


# direct methods
.method public synthetic constructor <init>(La/v51;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p51;->a:B

    iput-object p1, p0, La/p51;->b:La/v51;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/p51;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/p51;->b:La/v51;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p0, La/q0h0;

    .line 11
    .line 12
    iget-object v0, v3, La/v51;->L1:La/o7i;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-direct {p0, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string p0, "aggregatorMainViewModelFactory"

    .line 21
    .line 22
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v2

    .line 26
    :pswitch_0
    iget-object p0, v3, La/v51;->M1:La/fiu0;

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    const-string p0, "viewModelFactory"

    .line 32
    .line 33
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v2

    .line 37
    :pswitch_1
    sget-object p0, La/v51;->a2:La/qek0;

    .line 38
    .line 39
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    instance-of v0, p0, La/af3;

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    check-cast p0, La/af3;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    move-object p0, v2

    .line 58
    :goto_0
    const-class v0, La/is0;

    .line 59
    .line 60
    if-eqz p0, :cond_5

    .line 61
    .line 62
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, La/o5d0;

    .line 71
    .line 72
    if-eqz p0, :cond_3

    .line 73
    .line 74
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, La/ze3;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    move-object p0, v2

    .line 82
    :goto_1
    instance-of v4, p0, La/is0;

    .line 83
    .line 84
    if-nez v4, :cond_4

    .line 85
    .line 86
    move-object p0, v2

    .line 87
    :cond_4
    move-object v4, p0

    .line 88
    check-cast v4, La/is0;

    .line 89
    .line 90
    if-eqz v4, :cond_5

    .line 91
    .line 92
    iget-object p0, v3, La/v51;->R1:La/yzn0;

    .line 93
    .line 94
    sget-object v0, La/v51;->b2:[La/iiy;

    .line 95
    .line 96
    aget-object v1, v0, v1

    .line 97
    .line 98
    invoke-virtual {p0, v3, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    move-object v5, p0

    .line 103
    check-cast v5, La/lr1;

    .line 104
    .line 105
    iget-object p0, v3, La/v51;->S1:La/khf0;

    .line 106
    .line 107
    const/4 v1, 0x1

    .line 108
    aget-object v0, v0, v1

    .line 109
    .line 110
    invoke-virtual {p0, v3, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    move-object v6, p0

    .line 115
    check-cast v6, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 116
    .line 117
    const-class p0, La/v51;

    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    const/4 v10, 0x0

    .line 124
    const/16 v11, 0x24

    .line 125
    .line 126
    const/4 v7, 0x0

    .line 127
    const/4 v9, 0x1

    .line 128
    invoke-static/range {v4 .. v11}, La/is0;->a(La/is0;La/lr1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/lang/String;Ljava/lang/String;ZLa/mdp;I)La/q7i;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    goto :goto_2

    .line 133
    :cond_5
    const-string p0, "Cannot create dependency "

    .line 134
    .line 135
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :goto_2
    return-object v2

    .line 143
    :pswitch_2
    sget-object v0, La/v51;->a2:La/qek0;

    .line 144
    .line 145
    new-instance v0, La/ua0;

    .line 146
    .line 147
    iget-object v3, p0, La/p51;->b:La/v51;

    .line 148
    .line 149
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-static {v3}, La/a4n0;->e(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    new-instance v1, La/f8;

    .line 165
    .line 166
    const/4 v7, 0x0

    .line 167
    const/4 v8, 0x7

    .line 168
    const/4 v2, 0x0

    .line 169
    const-class v4, La/v51;

    .line 170
    .line 171
    const-string v5, "isCurrentFragmentTabRoot"

    .line 172
    .line 173
    const-string v6, "isCurrentFragmentTabRoot()Z"

    .line 174
    .line 175
    invoke-direct/range {v1 .. v8}, La/f8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 176
    .line 177
    .line 178
    invoke-direct {v0, p0, v9, v10, v1}, La/ua0;-><init>(La/kxq;Landroidx/fragment/app/e;La/i1w0;La/f8;)V

    .line 179
    .line 180
    .line 181
    return-object v0

    .line 182
    :pswitch_3
    sget-object p0, La/v51;->a2:La/qek0;

    .line 183
    .line 184
    invoke-virtual {v3}, La/v51;->H0()La/b61;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    iget-object p0, p0, La/b61;->n:La/m2c;

    .line 189
    .line 190
    invoke-virtual {p0, v1}, La/m2c;->a(Z)V

    .line 191
    .line 192
    .line 193
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    return-object p0

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
