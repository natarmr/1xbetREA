.class public final La/ag30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/pz40;

.field public final synthetic b:La/cp;

.field public final synthetic c:La/pz40;

.field public final synthetic d:La/pz40;

.field public final synthetic e:La/pz40;

.field public final synthetic f:La/cp;

.field public final synthetic g:La/pz40;


# direct methods
.method public constructor <init>(La/pz40;La/cp;La/pz40;La/pz40;La/pz40;La/cp;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ag30;->a:La/pz40;

    .line 5
    .line 6
    iput-object p2, p0, La/ag30;->b:La/cp;

    .line 7
    .line 8
    iput-object p3, p0, La/ag30;->c:La/pz40;

    .line 9
    .line 10
    iput-object p4, p0, La/ag30;->d:La/pz40;

    .line 11
    .line 12
    iput-object p5, p0, La/ag30;->e:La/pz40;

    .line 13
    .line 14
    iput-object p6, p0, La/ag30;->f:La/cp;

    .line 15
    .line 16
    iput-object p7, p0, La/ag30;->g:La/pz40;

    .line 17
    .line 18
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
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, La/ag30;->b:La/cp;

    .line 13
    .line 14
    invoke-virtual {p1}, La/cp;->u()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/yf30;

    .line 19
    .line 20
    iget-boolean v0, v0, La/yf30;->b:Z

    .line 21
    .line 22
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, La/ag30;->a:La/pz40;

    .line 27
    .line 28
    check-cast v1, La/hgk0;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, La/cp;->u()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, La/yf30;

    .line 38
    .line 39
    iget-object v0, v0, La/yf30;->a:La/a4x;

    .line 40
    .line 41
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v1, p0, La/ag30;->c:La/pz40;

    .line 46
    .line 47
    check-cast v1, La/hgk0;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, La/cp;->u()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, La/yf30;

    .line 57
    .line 58
    iget-boolean v0, v0, La/yf30;->d:Z

    .line 59
    .line 60
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object p0, p0, La/ag30;->d:La/pz40;

    .line 65
    .line 66
    check-cast p0, La/hgk0;

    .line 67
    .line 68
    invoke-virtual {p0, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p0, p1, La/cp;->u:La/yfu0;

    .line 72
    .line 73
    check-cast p0, La/vsx;

    .line 74
    .line 75
    iget-object p0, p0, La/vsx;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    .line 76
    .line 77
    invoke-virtual {p1}, La/cp;->u()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, La/yf30;

    .line 82
    .line 83
    iget-object p1, p1, La/yf30;->c:La/jmo;

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;->a(La/jmo;)V

    .line 86
    .line 87
    .line 88
    goto/16 :goto_3

    .line 89
    .line 90
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_1

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    check-cast v1, Ljava/util/Collection;

    .line 113
    .line 114
    check-cast v1, Ljava/lang/Iterable;

    .line 115
    .line 116
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_7

    .line 129
    .line 130
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, Ljava/util/List;

    .line 135
    .line 136
    new-instance v1, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-eqz v2, :cond_4

    .line 150
    .line 151
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    instance-of v3, v2, La/kpa;

    .line 156
    .line 157
    if-eqz v3, :cond_3

    .line 158
    .line 159
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_2

    .line 172
    .line 173
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    check-cast v1, La/kpa;

    .line 178
    .line 179
    if-eqz v1, :cond_6

    .line 180
    .line 181
    instance-of v2, v1, La/ipa;

    .line 182
    .line 183
    iget-object v3, p0, La/ag30;->f:La/cp;

    .line 184
    .line 185
    if-eqz v2, :cond_5

    .line 186
    .line 187
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    check-cast v2, La/yf30;

    .line 192
    .line 193
    iget-boolean v2, v2, La/yf30;->b:Z

    .line 194
    .line 195
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    iget-object v4, p0, La/ag30;->e:La/pz40;

    .line 200
    .line 201
    check-cast v4, La/hgk0;

    .line 202
    .line 203
    invoke-virtual {v4, v2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    check-cast v1, La/ipa;

    .line 207
    .line 208
    iget-object v2, v3, La/cp;->u:La/yfu0;

    .line 209
    .line 210
    check-cast v2, La/vsx;

    .line 211
    .line 212
    iget-object v2, v2, La/vsx;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    .line 213
    .line 214
    iget-object v1, v1, La/ipa;->a:La/jmo;

    .line 215
    .line 216
    invoke-virtual {v2, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;->a(La/jmo;)V

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_5
    instance-of v1, v1, La/jpa;

    .line 221
    .line 222
    if-eqz v1, :cond_6

    .line 223
    .line 224
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    check-cast v1, La/yf30;

    .line 229
    .line 230
    iget-object v1, v1, La/yf30;->a:La/a4x;

    .line 231
    .line 232
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    iget-object v2, p0, La/ag30;->g:La/pz40;

    .line 237
    .line 238
    check-cast v2, La/hgk0;

    .line 239
    .line 240
    invoke-virtual {v2, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 245
    .line 246
    .line 247
    const/4 p0, 0x0

    .line 248
    return-object p0

    .line 249
    :cond_7
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    return-object p0
.end method
