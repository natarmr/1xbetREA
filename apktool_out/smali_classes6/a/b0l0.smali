.class public final synthetic La/b0l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/e0l0;
.implements La/zf60;
.implements La/n9c;
.implements La/k4r;
.implements La/wyg;
.implements La/rbe;
.implements La/xbf;
.implements La/u8m0;
.implements La/hwq0;
.implements La/zon0;
.implements La/wzn0;
.implements La/ikf0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/b0l0;->a:B

    iput-object p1, p0, La/b0l0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object p0, p0, La/b0l0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/y4m0;

    .line 4
    .line 5
    iget-object v0, p0, La/y4m0;->d:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    .line 7
    iget-object p0, p0, La/y4m0;->i:Landroid/view/View$OnLongClickListener;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, p0, v1}, La/cww;->S(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/b0l0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/u3x;

    .line 4
    .line 5
    check-cast p1, La/ftf;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, La/r3x;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public b()V
    .locals 5

    .line 1
    iget-object p0, p0, La/b0l0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/zes0;

    .line 4
    .line 5
    sget-object v0, La/zes0;->b2:La/m6m0;

    .line 6
    .line 7
    iget-object p0, p0, La/zes0;->N1:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, La/vfs0;

    .line 14
    .line 15
    iget-object v0, p0, La/vfs0;->l:La/p7m0;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    sget-object v2, La/qfs0;->a:La/qfs0;

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v2, p0, La/vfs0;->k:La/ax5;

    .line 31
    .line 32
    iget-object v3, p0, La/vfs0;->f:La/mne;

    .line 33
    .line 34
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {v2, v3}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    new-instance v3, La/k6s0;

    .line 44
    .line 45
    const/4 v4, 0x2

    .line 46
    invoke-direct {v3, p0, v1, v4}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v2, v1, v3, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, La/b0l0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;

    .line 4
    .line 5
    check-cast p1, La/m1r;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object p1, La/jjn0;->S1:La/g9m0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p1, La/jjn0;

    .line 16
    .line 17
    invoke-direct {p1}, La/jjn0;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v0, La/jjn0;->U1:[La/iiy;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    aget-object v0, v0, v1

    .line 24
    .line 25
    iget-object v1, p1, La/jjn0;->L1:La/khf0;

    .line 26
    .line 27
    invoke-virtual {v1, p1, v0, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 28
    .line 29
    .line 30
    return-object p1
.end method

.method public d(La/qo8;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-object p0, p0, La/b0l0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/vub;

    .line 4
    .line 5
    new-instance v0, La/c0l0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p1, p2, p0, v1}, La/c0l0;-><init>(La/qo8;Ljava/lang/CharSequence;Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public e(La/p6t0;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v0, v0, La/b0l0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, La/hqm0;

    .line 8
    .line 9
    sget-object v2, La/hqm0;->V1:La/s9m0;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, La/hqm0;->I0()La/rqm0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v2, v0, La/rqm0;->c:La/hzg;

    .line 19
    .line 20
    instance-of v3, v1, La/cqm0;

    .line 21
    .line 22
    if-eqz v3, :cond_4

    .line 23
    .line 24
    iget-object v3, v0, La/rqm0;->f:La/ih5;

    .line 25
    .line 26
    move-object v4, v1

    .line 27
    check-cast v4, La/cqm0;

    .line 28
    .line 29
    iget-object v5, v4, La/cqm0;->g:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v6, v4, La/cqm0;->f:Ljava/lang/String;

    .line 32
    .line 33
    iget-boolean v7, v4, La/cqm0;->e:Z

    .line 34
    .line 35
    iget v9, v4, La/cqm0;->a:I

    .line 36
    .line 37
    sget-object v8, La/r1g;->i:La/r1g;

    .line 38
    .line 39
    invoke-virtual {v3, v9, v8}, La/ih5;->j(ILa/r1g;)V

    .line 40
    .line 41
    .line 42
    iget-object v10, v0, La/rqm0;->g:La/zr1;

    .line 43
    .line 44
    iget v11, v4, La/cqm0;->a:I

    .line 45
    .line 46
    sget-object v3, La/y1p;->b:La/y1p;

    .line 47
    .line 48
    const/4 v15, 0x0

    .line 49
    const/16 v16, 0x0

    .line 50
    .line 51
    const/4 v12, 0x0

    .line 52
    const-string v13, ""

    .line 53
    .line 54
    const-string v14, "cybersport_actions"

    .line 55
    .line 56
    invoke-virtual/range {v10 .. v16}, La/zr1;->b(IILjava/lang/String;Ljava/lang/String;ZLjava/lang/Float;)V

    .line 57
    .line 58
    .line 59
    if-eqz v7, :cond_0

    .line 60
    .line 61
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-lez v3, :cond_0

    .line 66
    .line 67
    check-cast v2, La/uzg;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v1, v2, La/uzg;->i:La/grj;

    .line 73
    .line 74
    invoke-virtual {v1, v6}, La/grj;->a(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_0
    if-eqz v7, :cond_1

    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-lez v3, :cond_1

    .line 85
    .line 86
    check-cast v2, La/uzg;

    .line 87
    .line 88
    invoke-virtual {v2, v5}, La/uzg;->m(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_1
    iget-object v3, v0, La/rqm0;->r:La/p7m0;

    .line 93
    .line 94
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    check-cast v3, La/jqm0;

    .line 102
    .line 103
    iget-object v3, v3, La/jqm0;->a:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    check-cast v2, La/uzg;

    .line 110
    .line 111
    iget-object v1, v2, La/uzg;->a:La/oeg0;

    .line 112
    .line 113
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    new-instance v8, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;

    .line 122
    .line 123
    const/16 v11, 0x2e

    .line 124
    .line 125
    const/4 v12, 0x0

    .line 126
    const/4 v13, 0x1

    .line 127
    invoke-direct/range {v8 .. v13}, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;-><init>(IIIZZ)V

    .line 128
    .line 129
    .line 130
    instance-of v3, v8, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 131
    .line 132
    if-eqz v3, :cond_2

    .line 133
    .line 134
    new-instance v3, La/e1w0;

    .line 135
    .line 136
    check-cast v8, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 137
    .line 138
    invoke-direct {v3, v8}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 139
    .line 140
    .line 141
    new-instance v4, La/c8d;

    .line 142
    .line 143
    sget-object v5, La/y7d;->a:La/v7d;

    .line 144
    .line 145
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_2
    new-instance v3, La/w0w0;

    .line 153
    .line 154
    invoke-direct {v3, v8}, La/w0w0;-><init>(La/m7h0;)V

    .line 155
    .line 156
    .line 157
    new-instance v4, La/c8d;

    .line 158
    .line 159
    sget-object v5, La/y7d;->a:La/v7d;

    .line 160
    .line 161
    invoke-direct {v4, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    :goto_0
    const/4 v3, 0x0

    .line 168
    invoke-static {v1, v2, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    :goto_1
    move-object v3, v2

    .line 173
    check-cast v3, La/paw;

    .line 174
    .line 175
    invoke-virtual {v3}, La/paw;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    if-eqz v4, :cond_3

    .line 180
    .line 181
    invoke-virtual {v3}, La/paw;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, La/oe50;

    .line 186
    .line 187
    invoke-virtual {v1, v3}, La/i1w0;->a(La/oe50;)V

    .line 188
    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_3
    :goto_2
    iget-object v0, v0, La/rqm0;->k:La/lrc;

    .line 192
    .line 193
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-virtual {v0, v1}, La/lrc;->y(Ljava/util/List;)V

    .line 202
    .line 203
    .line 204
    :cond_4
    return-void
.end method

.method public f(JLa/fq80;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/b0l0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/cyu;

    .line 4
    .line 5
    iget-object p0, p0, La/cyu;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, [La/ncs0;

    .line 8
    .line 9
    invoke-static {p1, p2, p3, p0}, La/nnw0;->E(JLa/fq80;[La/ncs0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public g(F)F
    .locals 0

    .line 1
    iget-object p0, p0, La/b0l0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/f7m0;

    .line 4
    .line 5
    iget-object p0, p0, La/f7m0;->k:La/w6k;

    .line 6
    .line 7
    invoke-interface {p0}, La/w6k;->getDensity()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    mul-float/2addr p0, p1

    .line 12
    return p0
.end method

.method public i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 13

    .line 1
    iget-byte v0, p0, La/b0l0;->a:B

    .line 2
    .line 3
    const-string v1, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const-string v4, "RESULT_TOURNAMENT_PAGE"

    .line 8
    .line 9
    const/16 v5, 0x21

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object p0, p0, La/b0l0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    :pswitch_0
    check-cast p0, La/ebh;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object p1, La/fk0;->a:La/fk0;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, La/ebh;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    check-cast p0, La/mas0;

    .line 29
    .line 30
    sget-object v0, La/mas0;->Q1:La/g9m0;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 36
    .line 37
    if-lt p2, v5, :cond_0

    .line 38
    .line 39
    invoke-static {p1}, La/e4e0;->q(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    instance-of p2, p1, La/s9s0;

    .line 49
    .line 50
    if-nez p2, :cond_1

    .line 51
    .line 52
    move-object p1, v6

    .line 53
    :cond_1
    check-cast p1, La/s9s0;

    .line 54
    .line 55
    :goto_0
    instance-of p2, p1, La/s9s0;

    .line 56
    .line 57
    if-eqz p2, :cond_2

    .line 58
    .line 59
    move-object v6, p1

    .line 60
    check-cast v6, La/s9s0;

    .line 61
    .line 62
    :cond_2
    if-eqz v6, :cond_3

    .line 63
    .line 64
    invoke-virtual {p0}, La/mas0;->G0()La/k3t0;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    new-instance p1, La/y9s0;

    .line 69
    .line 70
    invoke-direct {p1, v6}, La/y9s0;-><init>(La/s9s0;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    return-void

    .line 77
    :pswitch_2
    check-cast p0, La/z6s0;

    .line 78
    .line 79
    sget-object v0, La/z6s0;->S1:La/m6m0;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 85
    .line 86
    if-lt p2, v5, :cond_4

    .line 87
    .line 88
    invoke-static {p1}, La/e4e0;->q(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    goto :goto_1

    .line 93
    :cond_4
    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    instance-of p2, p1, La/s9s0;

    .line 98
    .line 99
    if-nez p2, :cond_5

    .line 100
    .line 101
    move-object p1, v6

    .line 102
    :cond_5
    check-cast p1, La/s9s0;

    .line 103
    .line 104
    :goto_1
    instance-of p2, p1, La/s9s0;

    .line 105
    .line 106
    if-eqz p2, :cond_6

    .line 107
    .line 108
    move-object v6, p1

    .line 109
    check-cast v6, La/s9s0;

    .line 110
    .line 111
    :cond_6
    if-eqz v6, :cond_7

    .line 112
    .line 113
    invoke-virtual {p0, v6}, La/z6s0;->G0(La/s9s0;)V

    .line 114
    .line 115
    .line 116
    :cond_7
    return-void

    .line 117
    :pswitch_3
    check-cast p0, La/a6s0;

    .line 118
    .line 119
    sget-object v0, La/a6s0;->S1:La/j6m0;

    .line 120
    .line 121
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 125
    .line 126
    if-lt p2, v5, :cond_8

    .line 127
    .line 128
    invoke-static {p1}, La/e4e0;->q(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    goto :goto_2

    .line 133
    :cond_8
    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    instance-of p2, p1, La/s9s0;

    .line 138
    .line 139
    if-nez p2, :cond_9

    .line 140
    .line 141
    move-object p1, v6

    .line 142
    :cond_9
    check-cast p1, La/s9s0;

    .line 143
    .line 144
    :goto_2
    instance-of p2, p1, La/s9s0;

    .line 145
    .line 146
    if-eqz p2, :cond_a

    .line 147
    .line 148
    move-object v6, p1

    .line 149
    check-cast v6, La/s9s0;

    .line 150
    .line 151
    :cond_a
    if-eqz v6, :cond_b

    .line 152
    .line 153
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    new-instance p2, Lkotlin/Pair;

    .line 162
    .line 163
    const-string v0, "TOURNAMENT_PAGE_ITEM"

    .line 164
    .line 165
    invoke-direct {p2, v0, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    filled-new-array {p2}, [Lkotlin/Pair;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-static {p2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    const-string v0, "REQUEST_KEY_CLOSE_OTHER_TOURNAMENTS_FRAGMENTS"

    .line 177
    .line 178
    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, La/a6s0;->G0()La/k3t0;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    sget-object p1, La/u5s0;->a:La/u5s0;

    .line 186
    .line 187
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_b
    return-void

    .line 191
    :pswitch_4
    check-cast p0, La/v3s0;

    .line 192
    .line 193
    sget-object v0, La/v3s0;->S1:La/y2m0;

    .line 194
    .line 195
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 199
    .line 200
    if-lt p2, v5, :cond_c

    .line 201
    .line 202
    invoke-static {p1}, La/e4e0;->q(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    goto :goto_3

    .line 207
    :cond_c
    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    instance-of p2, p1, La/s9s0;

    .line 212
    .line 213
    if-nez p2, :cond_d

    .line 214
    .line 215
    move-object p1, v6

    .line 216
    :cond_d
    check-cast p1, La/s9s0;

    .line 217
    .line 218
    :goto_3
    instance-of p2, p1, La/s9s0;

    .line 219
    .line 220
    if-eqz p2, :cond_e

    .line 221
    .line 222
    move-object v6, p1

    .line 223
    check-cast v6, La/s9s0;

    .line 224
    .line 225
    :cond_e
    if-eqz v6, :cond_f

    .line 226
    .line 227
    invoke-virtual {p0, v6}, La/v3s0;->G0(La/s9s0;)V

    .line 228
    .line 229
    .line 230
    :cond_f
    return-void

    .line 231
    :pswitch_5
    check-cast p0, La/xsq0;

    .line 232
    .line 233
    sget-object p1, La/xsq0;->P1:La/y2m0;

    .line 234
    .line 235
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0}, La/xsq0;->H0()La/xtq0;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    invoke-virtual {p0}, La/xtq0;->z()V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :pswitch_6
    check-cast p0, La/fhq0;

    .line 247
    .line 248
    sget-object v0, La/fhq0;->q2:La/m6m0;

    .line 249
    .line 250
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    const-string v0, "RESULT_KEY_DATE_TIME_CALENDAR_REQUEST"

    .line 254
    .line 255
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result p2

    .line 259
    if-nez p2, :cond_10

    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_10
    const-string p2, "RESULT_KEY_CALENDAR_START_SIMPLE_DATE"

    .line 263
    .line 264
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 265
    .line 266
    .line 267
    move-result-wide v0

    .line 268
    iget-wide v4, p0, La/fhq0;->m2:J

    .line 269
    .line 270
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 271
    .line 272
    .line 273
    move-result-wide v4

    .line 274
    iput-wide v4, p0, La/fhq0;->m2:J

    .line 275
    .line 276
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 277
    .line 278
    .line 279
    move-result-wide v0

    .line 280
    iget-object p2, p0, La/fhq0;->g2:La/r34;

    .line 281
    .line 282
    sget-object v2, La/fhq0;->r2:[La/iiy;

    .line 283
    .line 284
    aget-object v3, v2, v3

    .line 285
    .line 286
    invoke-virtual {p2, p0, v3, v0, v1}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0}, La/fhq0;->V0()V

    .line 290
    .line 291
    .line 292
    const-string p2, "RESULT_KEY_CALENDAR_END_SIMPLE_DATE"

    .line 293
    .line 294
    const-wide/16 v0, -0x1

    .line 295
    .line 296
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 297
    .line 298
    .line 299
    move-result-wide p1

    .line 300
    const-wide/16 v0, 0x0

    .line 301
    .line 302
    cmp-long v0, p1, v0

    .line 303
    .line 304
    if-lez v0, :cond_11

    .line 305
    .line 306
    iget-object v0, p0, La/fhq0;->h2:La/r34;

    .line 307
    .line 308
    const/4 v1, 0x2

    .line 309
    aget-object v1, v2, v1

    .line 310
    .line 311
    invoke-virtual {v0, p0, v1, p1, p2}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {p0}, La/fhq0;->V0()V

    .line 315
    .line 316
    .line 317
    sget-object p1, La/ygq0;->p:La/ygq0;

    .line 318
    .line 319
    invoke-virtual {p0, p1}, La/fhq0;->T0(La/ygq0;)V

    .line 320
    .line 321
    .line 322
    :cond_11
    :goto_4
    return-void

    .line 323
    :pswitch_7
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 324
    .line 325
    sget-object p1, La/jho0;->R1:La/y2m0;

    .line 326
    .line 327
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    return-void

    .line 334
    :pswitch_8
    check-cast p0, La/ufo0;

    .line 335
    .line 336
    sget-object p1, La/ufo0;->Q1:La/s2m0;

    .line 337
    .line 338
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-virtual {p0}, La/ufo0;->H0()La/fho0;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    invoke-virtual {p0}, La/fho0;->B()V

    .line 346
    .line 347
    .line 348
    return-void

    .line 349
    :pswitch_9
    check-cast p0, La/vvn0;

    .line 350
    .line 351
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 352
    .line 353
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    const-string p2, "SWIPE_ACTION_CONFIRMED_RESULT_KEY"

    .line 357
    .line 358
    invoke-virtual {p1, p2, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 359
    .line 360
    .line 361
    move-result p1

    .line 362
    if-eqz p1, :cond_12

    .line 363
    .line 364
    invoke-virtual {p0}, La/vvn0;->K0()La/k3t0;

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    sget-object p1, La/vrn0;->a:La/vrn0;

    .line 369
    .line 370
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    goto :goto_5

    .line 374
    :cond_12
    invoke-virtual {p0}, La/vvn0;->K0()La/k3t0;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    sget-object p1, La/wrn0;->a:La/wrn0;

    .line 379
    .line 380
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    :goto_5
    return-void

    .line 384
    :pswitch_a
    check-cast p0, La/bun0;

    .line 385
    .line 386
    sget-object v0, La/bun0;->g2:La/s2m0;

    .line 387
    .line 388
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 392
    .line 393
    .line 394
    move-result p1

    .line 395
    if-eqz p1, :cond_13

    .line 396
    .line 397
    invoke-virtual {p0}, La/bun0;->R0()La/pun0;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    iget-object p1, p0, La/pun0;->i:La/vzg0;

    .line 402
    .line 403
    const-string p2, "SUM_STEPPER_FIRST_FOCUS_KEY"

    .line 404
    .line 405
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 406
    .line 407
    invoke-virtual {p1, p2, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    iget-object p1, p0, La/pun0;->l:La/rrc;

    .line 411
    .line 412
    invoke-virtual {p1}, La/rrc;->E()V

    .line 413
    .line 414
    .line 415
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 416
    .line 417
    .line 418
    move-result-object v7

    .line 419
    iget-object p1, p0, La/pun0;->d:La/mne;

    .line 420
    .line 421
    iget-object v10, p1, La/mne;->a:La/rwj;

    .line 422
    .line 423
    new-instance v8, La/dun0;

    .line 424
    .line 425
    invoke-direct {v8, p0, v2}, La/dun0;-><init>(La/pun0;B)V

    .line 426
    .line 427
    .line 428
    new-instance v11, La/wk20;

    .line 429
    .line 430
    invoke-direct {v11, v3, p0, v6}, La/wk20;-><init>(ZLa/pun0;La/yje;)V

    .line 431
    .line 432
    .line 433
    const/16 v12, 0xa

    .line 434
    .line 435
    const/4 v9, 0x0

    .line 436
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 437
    .line 438
    .line 439
    :cond_13
    return-void

    .line 440
    :pswitch_b
    check-cast p0, La/eym0;

    .line 441
    .line 442
    sget-object v0, La/eym0;->S1:La/g9m0;

    .line 443
    .line 444
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    const v1, -0x7de06280

    .line 452
    .line 453
    .line 454
    if-eq v0, v1, :cond_14

    .line 455
    .line 456
    goto :goto_6

    .line 457
    :cond_14
    const-string v0, "KEY_SUB_GAME_FILTER_MODEL_REQUEST"

    .line 458
    .line 459
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result p2

    .line 463
    if-eqz p2, :cond_15

    .line 464
    .line 465
    invoke-virtual {p0}, La/eym0;->H0()La/dzm0;

    .line 466
    .line 467
    .line 468
    move-result-object p0

    .line 469
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 470
    .line 471
    .line 472
    move-result-wide p1

    .line 473
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    sget-object v1, La/bzm0;->a:La/bzm0;

    .line 478
    .line 479
    iget-object v2, p0, La/dzm0;->j:La/mne;

    .line 480
    .line 481
    iget-object v3, v2, La/mne;->a:La/rwj;

    .line 482
    .line 483
    new-instance v4, La/czm0;

    .line 484
    .line 485
    invoke-direct {v4, p0, p1, p2, v6}, La/czm0;-><init>(La/dzm0;JLa/yje;)V

    .line 486
    .line 487
    .line 488
    const/16 v5, 0xa

    .line 489
    .line 490
    const/4 v2, 0x0

    .line 491
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 492
    .line 493
    .line 494
    :cond_15
    :goto_6
    return-void

    .line 495
    :pswitch_c
    check-cast p0, La/vi6;

    .line 496
    .line 497
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    const-string p2, "SUB_GAME_SELECTED_KEY"

    .line 501
    .line 502
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 503
    .line 504
    .line 505
    move-result-wide p1

    .line 506
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 507
    .line 508
    .line 509
    move-result-object p1

    .line 510
    invoke-virtual {p0, p1}, La/vi6;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    return-void

    .line 514
    :pswitch_d
    check-cast p0, La/ubm0;

    .line 515
    .line 516
    sget-object v0, La/ubm0;->R1:La/y2m0;

    .line 517
    .line 518
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    const-string v0, "SELECT_MENU_REQUEST_KEY"

    .line 522
    .line 523
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    move-result p2

    .line 527
    if-nez p2, :cond_16

    .line 528
    .line 529
    goto :goto_8

    .line 530
    :cond_16
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 531
    .line 532
    .line 533
    move-result p2

    .line 534
    if-eqz p2, :cond_18

    .line 535
    .line 536
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 537
    .line 538
    if-gt p2, v5, :cond_17

    .line 539
    .line 540
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 541
    .line 542
    .line 543
    move-result-object p1

    .line 544
    goto :goto_7

    .line 545
    :cond_17
    invoke-static {p1}, La/e4e0;->o(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object p1

    .line 549
    check-cast p1, Landroid/os/Parcelable;

    .line 550
    .line 551
    :goto_7
    check-cast p1, Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampSubMenuItem;

    .line 552
    .line 553
    if-eqz p1, :cond_18

    .line 554
    .line 555
    invoke-virtual {p0}, La/ubm0;->G0()La/k3t0;

    .line 556
    .line 557
    .line 558
    move-result-object p0

    .line 559
    new-instance p2, La/rbm0;

    .line 560
    .line 561
    invoke-direct {p2, p1}, La/rbm0;-><init>(Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampSubMenuItem;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 565
    .line 566
    .line 567
    :cond_18
    :goto_8
    return-void

    .line 568
    nop

    .line 569
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_d
        :pswitch_0
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_0
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public k()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/b0l0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/wdu;

    .line 4
    .line 5
    iget-object p0, p0, La/wdu;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/wpg0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/wpg0;->a()Landroid/database/sqlite/SQLiteDatabase;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    const-string v1, "DELETE FROM log_event_dropped"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    .line 23
    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v2, "UPDATE global_log_event_state SET last_metrics_upload_ms="

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, La/wpg0;->b:La/quc;

    .line 33
    .line 34
    invoke-interface {p0}, La/quc;->getTime()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v0, p0}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    return-object p0

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 62
    .line 63
    .line 64
    throw p0
.end method

.method public l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 8

    .line 1
    iget-byte v2, p0, La/b0l0;->a:B

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const v3, 0x7f070074

    .line 5
    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    iget-object v0, p0, La/b0l0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    sparse-switch v2, :sswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v0, La/zqp0;

    .line 14
    .line 15
    sget-object v2, La/zqp0;->V1:La/y2m0;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v1, p2, La/xiv0;->a:La/uiv0;

    .line 21
    .line 22
    invoke-virtual {v1, v4}, La/uiv0;->i(I)La/pfx;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget v1, v1, La/pfx;->d:I

    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    add-int v4, v0, v1

    .line 37
    .line 38
    const/4 v5, 0x7

    .line 39
    const/4 v1, 0x0

    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    move-object v0, p1

    .line 43
    invoke-static/range {v0 .. v5}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-virtual {p1, v0, v1, v3, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 59
    .line 60
    .line 61
    sget-object v0, La/xiv0;->b:La/xiv0;

    .line 62
    .line 63
    return-object v0

    .line 64
    :sswitch_0
    check-cast v0, La/b9o0;

    .line 65
    .line 66
    iget-object v2, v0, La/b9o0;->b:Ljava/util/ArrayList;

    .line 67
    .line 68
    iget-object v3, p2, La/xiv0;->a:La/uiv0;

    .line 69
    .line 70
    const/16 v4, 0x207

    .line 71
    .line 72
    invoke-virtual {v3, v4}, La/uiv0;->i(I)La/pfx;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    const/16 v6, 0x40

    .line 77
    .line 78
    invoke-virtual {v3, v6}, La/uiv0;->i(I)La/pfx;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-static {v5, v7}, La/pfx;->b(La/pfx;La/pfx;)La/pfx;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v3, v4}, La/uiv0;->j(I)La/pfx;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v3, v6}, La/uiv0;->j(I)La/pfx;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-static {v4, v3}, La/pfx;->b(La/pfx;La/pfx;)La/pfx;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    iget-object v4, v0, La/b9o0;->c:La/pfx;

    .line 99
    .line 100
    invoke-virtual {v5, v4}, La/pfx;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_0

    .line 105
    .line 106
    iget-object v4, v0, La/b9o0;->d:La/pfx;

    .line 107
    .line 108
    invoke-virtual {v3, v4}, La/pfx;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-nez v4, :cond_1

    .line 113
    .line 114
    :cond_0
    iput-object v5, v0, La/b9o0;->c:La/pfx;

    .line 115
    .line 116
    iput-object v3, v0, La/b9o0;->d:La/pfx;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    add-int/lit8 v0, v0, -0x1

    .line 123
    .line 124
    :goto_0
    if-ltz v0, :cond_1

    .line 125
    .line 126
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    check-cast v4, La/i2d0;

    .line 131
    .line 132
    iput-object v5, v4, La/i2d0;->c:La/pfx;

    .line 133
    .line 134
    iput-object v3, v4, La/i2d0;->d:La/pfx;

    .line 135
    .line 136
    invoke-virtual {v4}, La/i2d0;->c()V

    .line 137
    .line 138
    .line 139
    add-int/lit8 v0, v0, -0x1

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_1
    return-object p2

    .line 143
    :sswitch_1
    check-cast v0, La/ddl0;

    .line 144
    .line 145
    sget-object v5, La/ddl0;->V1:La/cge0;

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object v1, p2, La/xiv0;->a:La/uiv0;

    .line 151
    .line 152
    invoke-virtual {v1, v4}, La/uiv0;->i(I)La/pfx;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    iget v1, v1, La/pfx;->d:I

    .line 157
    .line 158
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    add-int v4, v0, v1

    .line 167
    .line 168
    const/4 v5, 0x7

    .line 169
    const/4 v1, 0x0

    .line 170
    const/4 v2, 0x0

    .line 171
    const/4 v3, 0x0

    .line 172
    move-object v0, p1

    .line 173
    invoke-static/range {v0 .. v5}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    invoke-virtual {p1, v1, v2, v3, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 189
    .line 190
    .line 191
    sget-object v0, La/xiv0;->b:La/xiv0;

    .line 192
    .line 193
    return-object v0

    .line 194
    nop

    .line 195
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0xd -> :sswitch_0
    .end sparse-switch
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    iget-object p0, p0, La/b0l0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/u2s0;

    .line 4
    .line 5
    sget-object v0, La/u2s0;->X1:La/s2m0;

    .line 6
    .line 7
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const v0, 0x7f0a0ad0

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, La/u2s0;->H0()La/o6j;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v0, p0, La/u2s0;->P1:La/cgx0;

    .line 22
    .line 23
    sget-object v2, La/u2s0;->Y1:[La/iiy;

    .line 24
    .line 25
    aget-object v1, v2, v1

    .line 26
    .line 27
    invoke-virtual {v0, p0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    iget-object v0, p1, La/o6j;->d:La/i1w0;

    .line 36
    .line 37
    new-instance v1, La/x9;

    .line 38
    .line 39
    const/16 v2, 0xc

    .line 40
    .line 41
    invoke-direct {v1, p1, p0, v2}, La/x9;-><init>(Ljava/lang/Object;ZB)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    return p0

    .line 49
    :cond_0
    return v1
.end method
