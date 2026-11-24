.class public final La/fk5;
.super La/gl80;
.source "SourceFile"


# instance fields
.field public final h:La/b33;

.field public final i:La/gi5;


# direct methods
.method public constructor <init>(La/b33;La/gi5;)V
    .locals 1

    .line 1
    sget-object v0, La/ek5;->b:La/ek5;

    .line 2
    .line 3
    invoke-direct {p0, v0}, La/gl80;-><init>(La/dtb;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/fk5;->h:La/b33;

    .line 7
    .line 8
    iput-object p2, p0, La/fk5;->i:La/gi5;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final f(I)I
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, La/gl80;->B(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/vk5;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    if-eqz p0, :cond_7

    .line 9
    .line 10
    instance-of v0, p0, La/tjz;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const p0, 0x7f0d035b

    .line 15
    .line 16
    .line 17
    return p0

    .line 18
    :cond_0
    instance-of v0, p0, La/lfs0;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const p0, 0x7f0d0359

    .line 23
    .line 24
    .line 25
    return p0

    .line 26
    :cond_1
    instance-of v0, p0, La/aes0;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    const p0, 0x7f0d035e

    .line 31
    .line 32
    .line 33
    return p0

    .line 34
    :cond_2
    instance-of v0, p0, La/ogs0;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    const p0, 0x7f0d054c

    .line 39
    .line 40
    .line 41
    return p0

    .line 42
    :cond_3
    instance-of v0, p0, La/ues0;

    .line 43
    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    const p0, 0x7f0d0358

    .line 47
    .line 48
    .line 49
    return p0

    .line 50
    :cond_4
    instance-of v0, p0, La/gxn;

    .line 51
    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    const p0, 0x7f0d03a9

    .line 55
    .line 56
    .line 57
    return p0

    .line 58
    :cond_5
    instance-of p0, p0, La/tds0;

    .line 59
    .line 60
    if-eqz p0, :cond_6

    .line 61
    .line 62
    const/4 p0, -0x1

    .line 63
    return p0

    .line 64
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 65
    .line 66
    .line 67
    return p1

    .line 68
    :cond_7
    const-string p0, "Unknown view"

    .line 69
    .line 70
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return p1
.end method

.method public final n(La/xhe0;I)V
    .locals 9

    .line 1
    invoke-virtual {p0, p2}, La/gl80;->A(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/vk5;

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    instance-of p2, p1, La/ujz;

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    check-cast p1, La/ujz;

    .line 15
    .line 16
    check-cast p0, La/tjz;

    .line 17
    .line 18
    invoke-virtual {p1, p0}, La/ujz;->u(La/tjz;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    instance-of p2, p1, La/qsq0;

    .line 23
    .line 24
    if-eqz p2, :cond_2

    .line 25
    .line 26
    check-cast p1, La/qsq0;

    .line 27
    .line 28
    check-cast p0, La/lfs0;

    .line 29
    .line 30
    invoke-virtual {p1, p0}, La/qsq0;->u(La/lfs0;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    instance-of p2, p1, La/bes0;

    .line 35
    .line 36
    if-eqz p2, :cond_3

    .line 37
    .line 38
    check-cast p1, La/bes0;

    .line 39
    .line 40
    check-cast p0, La/aes0;

    .line 41
    .line 42
    iget-object p1, p1, La/bes0;->u:La/dsx;

    .line 43
    .line 44
    iget-object p1, p1, La/dsx;->c:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 45
    .line 46
    new-instance v0, La/nrv;

    .line 47
    .line 48
    iget-object v1, p0, La/aes0;->a:Ljava/lang/String;

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    const/16 v8, 0xfe

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    const/4 v3, 0x0

    .line 55
    const/4 v4, 0x0

    .line 56
    const/4 v5, 0x0

    .line 57
    const/4 v6, 0x0

    .line 58
    invoke-direct/range {v0 .. v8}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    instance-of p2, p1, La/tgs0;

    .line 66
    .line 67
    if-eqz p2, :cond_4

    .line 68
    .line 69
    check-cast p1, La/tgs0;

    .line 70
    .line 71
    check-cast p0, La/ogs0;

    .line 72
    .line 73
    invoke-virtual {p1, p0}, La/tgs0;->u(La/ogs0;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_4
    instance-of p2, p1, La/fvn;

    .line 78
    .line 79
    if-eqz p2, :cond_5

    .line 80
    .line 81
    check-cast p0, La/ues0;

    .line 82
    .line 83
    return-void

    .line 84
    :cond_5
    instance-of p2, p1, La/hxn;

    .line 85
    .line 86
    if-eqz p2, :cond_6

    .line 87
    .line 88
    check-cast p1, La/hxn;

    .line 89
    .line 90
    check-cast p0, La/gxn;

    .line 91
    .line 92
    invoke-virtual {p1, p0}, La/hxn;->u(La/gxn;)V

    .line 93
    .line 94
    .line 95
    :cond_6
    :goto_0
    return-void
.end method

.method public final p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 5

    .line 1
    const v0, 0x7f0d035b

    .line 2
    .line 3
    .line 4
    if-ne p2, v0, :cond_0

    .line 5
    .line 6
    new-instance p2, La/ujz;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0, p1}, La/dc3;->e(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/dc3;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p0, p0, La/fk5;->h:La/b33;

    .line 21
    .line 22
    invoke-direct {p2, p1, p0}, La/ujz;-><init>(La/dc3;La/b33;)V

    .line 23
    .line 24
    .line 25
    return-object p2

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    const v1, 0x7f0d0359

    .line 28
    .line 29
    .line 30
    const-string v2, "rootView"

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    if-ne p2, v1, :cond_2

    .line 34
    .line 35
    new-instance p0, La/qsq0;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p2, v1, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    check-cast p1, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 52
    .line 53
    new-instance p2, La/dsx;

    .line 54
    .line 55
    invoke-direct {p2, p1, p1, v3}, La/dsx;-><init>(Lorg/xplatform/uikit/components/header/DsHeader;Lorg/xplatform/uikit/components/header/DsHeader;B)V

    .line 56
    .line 57
    .line 58
    invoke-direct {p0, p2}, La/qsq0;-><init>(La/dsx;)V

    .line 59
    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_1
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_2
    const v1, 0x7f0d035e

    .line 67
    .line 68
    .line 69
    if-ne p2, v1, :cond_4

    .line 70
    .line 71
    new-instance p0, La/bes0;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {p2, v1, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    check-cast p1, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 88
    .line 89
    new-instance p2, La/dsx;

    .line 90
    .line 91
    const/4 v0, 0x1

    .line 92
    invoke-direct {p2, p1, p1, v0}, La/dsx;-><init>(Lorg/xplatform/uikit/components/header/DsHeader;Lorg/xplatform/uikit/components/header/DsHeader;B)V

    .line 93
    .line 94
    .line 95
    invoke-direct {p0, p2}, La/bes0;-><init>(La/dsx;)V

    .line 96
    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_3
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object v0

    .line 103
    :cond_4
    const v1, 0x7f0d054c

    .line 104
    .line 105
    .line 106
    if-ne p2, v1, :cond_6

    .line 107
    .line 108
    new-instance p0, La/tgs0;

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-virtual {p2, v1, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-eqz p1, :cond_5

    .line 123
    .line 124
    check-cast p1, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;

    .line 125
    .line 126
    new-instance p2, La/nq8;

    .line 127
    .line 128
    const/16 v0, 0xd

    .line 129
    .line 130
    invoke-direct {p2, p1, p1, v0}, La/nq8;-><init>(Landroid/view/View;Landroid/view/View;B)V

    .line 131
    .line 132
    .line 133
    invoke-direct {p0, p2}, La/tgs0;-><init>(La/nq8;)V

    .line 134
    .line 135
    .line 136
    return-object p0

    .line 137
    :cond_5
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-object v0

    .line 141
    :cond_6
    const v1, 0x7f0d03a9

    .line 142
    .line 143
    .line 144
    if-ne p2, v1, :cond_8

    .line 145
    .line 146
    new-instance p2, La/hxn;

    .line 147
    .line 148
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v4, v1, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-eqz p1, :cond_7

    .line 161
    .line 162
    check-cast p1, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 163
    .line 164
    new-instance v0, La/nq8;

    .line 165
    .line 166
    const/4 v1, 0x7

    .line 167
    invoke-direct {v0, p1, p1, v1}, La/nq8;-><init>(Landroid/view/View;Landroid/view/View;B)V

    .line 168
    .line 169
    .line 170
    iget-object p0, p0, La/fk5;->i:La/gi5;

    .line 171
    .line 172
    invoke-direct {p2, v0, p0}, La/hxn;-><init>(La/nq8;La/gi5;)V

    .line 173
    .line 174
    .line 175
    return-object p2

    .line 176
    :cond_7
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    return-object v0

    .line 180
    :cond_8
    const/4 p0, -0x1

    .line 181
    if-ne p2, p0, :cond_9

    .line 182
    .line 183
    new-instance p0, La/gw3;

    .line 184
    .line 185
    new-instance p2, Landroid/view/View;

    .line 186
    .line 187
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-direct {p2, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 192
    .line 193
    .line 194
    invoke-direct {p0, p2}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 195
    .line 196
    .line 197
    return-object p0

    .line 198
    :cond_9
    new-instance p0, La/fvn;

    .line 199
    .line 200
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    const v1, 0x7f0d0358

    .line 209
    .line 210
    .line 211
    invoke-virtual {p2, v1, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    if-eqz p1, :cond_a

    .line 216
    .line 217
    check-cast p1, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 218
    .line 219
    invoke-direct {p0, p1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 220
    .line 221
    .line 222
    return-object p0

    .line 223
    :cond_a
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    return-object v0
.end method
