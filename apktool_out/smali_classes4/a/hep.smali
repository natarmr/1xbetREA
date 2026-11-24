.class public final synthetic La/hep;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/favorites/impl/presentation/category/e;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/favorites/impl/presentation/category/e;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hep;->a:B

    iput-object p1, p0, La/hep;->b:Lorg/xplatform/favorites/impl/presentation/category/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/hep;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/hep;->b:Lorg/xplatform/favorites/impl/presentation/category/e;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, Lorg/xplatform/favorites/impl/presentation/category/e;->V1:La/sek;

    .line 11
    .line 12
    invoke-virtual {p0}, Lorg/xplatform/favorites/impl/presentation/category/e;->H0()Lorg/xplatform/favorites/impl/presentation/category/f;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object p0, p0, Lorg/xplatform/favorites/impl/presentation/category/f;->c:La/i1w0;

    .line 17
    .line 18
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v2, La/c8d;

    .line 23
    .line 24
    sget-object v3, La/y7d;->a:La/v7d;

    .line 25
    .line 26
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 27
    .line 28
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v2, p0, v0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    move-object v1, v0

    .line 36
    check-cast v1, La/paw;

    .line 37
    .line 38
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, La/oe50;

    .line 49
    .line 50
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_0
    sget-object v0, Lorg/xplatform/favorites/impl/presentation/category/e;->V1:La/sek;

    .line 58
    .line 59
    invoke-virtual {p0}, Lorg/xplatform/favorites/impl/presentation/category/e;->H0()Lorg/xplatform/favorites/impl/presentation/category/f;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    sget-object v0, Lorg/xplatform/favorites/impl/presentation/category/e;->X1:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lorg/xplatform/favorites/impl/presentation/category/f;->u:Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;

    .line 69
    .line 70
    invoke-static {v0}, Lorg/xplatform/favorites/impl/presentation/category/b;->a(Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;)La/d5p;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    const/4 v1, 0x1

    .line 81
    if-ne v0, v1, :cond_1

    .line 82
    .line 83
    sget-object v0, La/wgh0;->e:La/wgh0;

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    sget-object v0, La/wgh0;->d:La/wgh0;

    .line 91
    .line 92
    :goto_1
    iget-object v1, p0, Lorg/xplatform/favorites/impl/presentation/category/f;->q:La/s31;

    .line 93
    .line 94
    invoke-virtual {v1, v0}, La/s31;->g(La/wgh0;)V

    .line 95
    .line 96
    .line 97
    iget-object p0, p0, Lorg/xplatform/favorites/impl/presentation/category/f;->r:La/cyu;

    .line 98
    .line 99
    iget-object v0, v0, La/wgh0;->a:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {p0, v0}, La/cyu;->C(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    :goto_2
    return-object v2

    .line 107
    :pswitch_1
    new-instance v0, La/q0h0;

    .line 108
    .line 109
    iget-object p0, p0, Lorg/xplatform/favorites/impl/presentation/category/e;->N1:La/rgi;

    .line 110
    .line 111
    if-eqz p0, :cond_3

    .line 112
    .line 113
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :cond_3
    const-string p0, "favoriteCategoryViewModelFactory"

    .line 118
    .line 119
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v2

    .line 123
    :pswitch_2
    sget-object v0, Lorg/xplatform/favorites/impl/presentation/category/e;->V1:La/sek;

    .line 124
    .line 125
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    instance-of v3, v0, La/af3;

    .line 137
    .line 138
    if-eqz v3, :cond_4

    .line 139
    .line 140
    check-cast v0, La/af3;

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_4
    move-object v0, v2

    .line 144
    :goto_3
    const-class v3, La/jep;

    .line 145
    .line 146
    if-eqz v0, :cond_7

    .line 147
    .line 148
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, La/o5d0;

    .line 157
    .line 158
    if-eqz v0, :cond_5

    .line 159
    .line 160
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, La/ze3;

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_5
    move-object v0, v2

    .line 168
    :goto_4
    instance-of v4, v0, La/jep;

    .line 169
    .line 170
    if-nez v4, :cond_6

    .line 171
    .line 172
    move-object v0, v2

    .line 173
    :cond_6
    check-cast v0, La/jep;

    .line 174
    .line 175
    if-eqz v0, :cond_7

    .line 176
    .line 177
    iget-object v2, p0, Lorg/xplatform/favorites/impl/presentation/category/e;->L1:La/khf0;

    .line 178
    .line 179
    sget-object v3, Lorg/xplatform/favorites/impl/presentation/category/e;->W1:[La/iiy;

    .line 180
    .line 181
    aget-object v1, v3, v1

    .line 182
    .line 183
    invoke-virtual {v2, p0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    check-cast v1, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;

    .line 188
    .line 189
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-virtual {v0, v1, p0}, La/jep;->a(Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;La/i1w0;)La/tgi;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    goto :goto_5

    .line 198
    :cond_7
    const-string p0, "Cannot create dependency "

    .line 199
    .line 200
    invoke-static {v3, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    :goto_5
    return-object v2

    .line 208
    nop

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
