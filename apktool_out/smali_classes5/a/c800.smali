.class public final La/c800;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/cp;

.field public final synthetic b:La/gkz;

.field public final synthetic c:La/gkz;

.field public final synthetic d:La/n0o0;

.field public final synthetic e:La/cp;


# direct methods
.method public constructor <init>(La/cp;La/gkz;La/gkz;La/n0o0;La/cp;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/c800;->a:La/cp;

    .line 5
    .line 6
    iput-object p2, p0, La/c800;->b:La/gkz;

    .line 7
    .line 8
    iput-object p3, p0, La/c800;->c:La/gkz;

    .line 9
    .line 10
    iput-object p4, p0, La/c800;->d:La/n0o0;

    .line 11
    .line 12
    iput-object p5, p0, La/c800;->e:La/cp;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, La/c800;->a:La/cp;

    .line 13
    .line 14
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    move-object v1, v0

    .line 17
    check-cast v1, La/ssx;

    .line 18
    .line 19
    iget-object v1, v1, La/ssx;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 20
    .line 21
    iget-object v2, p0, La/c800;->d:La/n0o0;

    .line 22
    .line 23
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, La/b800;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->o(La/lhe0;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, La/cp;->u()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, La/a800;

    .line 37
    .line 38
    iget-object v1, v1, La/a800;->a:Ljava/util/ArrayList;

    .line 39
    .line 40
    iget-object v2, p0, La/c800;->b:La/gkz;

    .line 41
    .line 42
    invoke-virtual {v2, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, La/cp;->u()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, La/a800;

    .line 50
    .line 51
    iget-object v1, v1, La/a800;->b:Ljava/util/ArrayList;

    .line 52
    .line 53
    iget-object p0, p0, La/c800;->c:La/gkz;

    .line 54
    .line 55
    invoke-virtual {p0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    check-cast v0, La/ssx;

    .line 59
    .line 60
    iget-object p0, v0, La/ssx;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    .line 61
    .line 62
    invoke-virtual {p1}, La/cp;->u()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, La/a800;

    .line 67
    .line 68
    iget-object v1, v1, La/a800;->d:La/jmo;

    .line 69
    .line 70
    invoke-virtual {p0, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;->a(La/jmo;)V

    .line 71
    .line 72
    .line 73
    iget-object p0, v0, La/ssx;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 74
    .line 75
    invoke-virtual {p1}, La/cp;->u()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, La/a800;

    .line 80
    .line 81
    iget-boolean v1, v1, La/a800;->c:Z

    .line 82
    .line 83
    invoke-virtual {p1}, La/cp;->u()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, La/a800;

    .line 88
    .line 89
    iget-object v2, v2, La/a800;->a:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    iget-object v3, v0, La/ssx;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    .line 96
    .line 97
    new-instance v4, La/jto;

    .line 98
    .line 99
    invoke-direct {v4, p0, v3, v1, v2}, La/jto;-><init>(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ZI)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, La/cp;->u()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, La/a800;

    .line 110
    .line 111
    iget-boolean p0, p0, La/a800;->e:Z

    .line 112
    .line 113
    if-eqz p0, :cond_0

    .line 114
    .line 115
    const/4 p0, 0x2

    .line 116
    goto :goto_0

    .line 117
    :cond_0
    const/4 p0, 0x0

    .line 118
    :goto_0
    iget-object p1, v0, La/ssx;->c:Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 119
    .line 120
    invoke-virtual {p1, p0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 121
    .line 122
    .line 123
    iget-object p1, v0, La/ssx;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 124
    .line 125
    invoke-virtual {p1, p0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_2

    .line 143
    .line 144
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    check-cast v1, Ljava/util/Collection;

    .line 152
    .line 153
    check-cast v1, Ljava/lang/Iterable;

    .line 154
    .line 155
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_7

    .line 168
    .line 169
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, Ljava/util/List;

    .line 174
    .line 175
    new-instance v1, Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    if-eqz v2, :cond_5

    .line 189
    .line 190
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    instance-of v3, v2, La/hpa;

    .line 195
    .line 196
    if-eqz v3, :cond_4

    .line 197
    .line 198
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_3

    .line 211
    .line 212
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    check-cast v1, La/hpa;

    .line 217
    .line 218
    instance-of v2, v1, La/hpa;

    .line 219
    .line 220
    if-eqz v2, :cond_6

    .line 221
    .line 222
    iget-object v2, p0, La/c800;->e:La/cp;

    .line 223
    .line 224
    iget-object v2, v2, La/cp;->u:La/yfu0;

    .line 225
    .line 226
    check-cast v2, La/ssx;

    .line 227
    .line 228
    iget-object v2, v2, La/ssx;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    .line 229
    .line 230
    iget-object v1, v1, La/hpa;->a:La/jmo;

    .line 231
    .line 232
    invoke-virtual {v2, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;->a(La/jmo;)V

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 237
    .line 238
    .line 239
    const/4 p0, 0x0

    .line 240
    return-object p0

    .line 241
    :cond_7
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    return-object p0
.end method
