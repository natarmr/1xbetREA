.class public final La/n80;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/n80;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/jdk0",
        "african_roulette"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final U1:La/jdk0;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/j6i;

.field public M1:La/wdk0;

.field public final N1:La/kiu0;

.field public final O1:La/s0r;

.field public P1:La/u70;

.field public Q1:La/ndk0;

.field public R1:Z

.field public final S1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/n80;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/african_roulette/databinding/FragmentAfricanRouletteBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/n80;->V1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/jdk0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/n80;->U1:La/jdk0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d01e3

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/n80;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/h80;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, La/h80;-><init>(La/n80;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/f80;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v1, p0, v2}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    sget-object v3, La/wez;->b:La/wez;

    .line 24
    .line 25
    new-instance v4, La/f80;

    .line 26
    .line 27
    const/4 v5, 0x2

    .line 28
    invoke-direct {v4, v1, v5}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-class v3, La/u90;

    .line 36
    .line 37
    sget-object v4, La/sre0;->a:La/tre0;

    .line 38
    .line 39
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-instance v4, La/k8;

    .line 44
    .line 45
    const/16 v5, 0x16

    .line 46
    .line 47
    invoke-direct {v4, v1, v5}, La/k8;-><init>(La/a8z;B)V

    .line 48
    .line 49
    .line 50
    new-instance v5, La/k8;

    .line 51
    .line 52
    const/16 v6, 0x17

    .line 53
    .line 54
    invoke-direct {v5, v1, v6}, La/k8;-><init>(La/a8z;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, La/n80;->N1:La/kiu0;

    .line 62
    .line 63
    sget-object v0, La/m80;->a:La/m80;

    .line 64
    .line 65
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, La/n80;->O1:La/s0r;

    .line 70
    .line 71
    new-instance v0, La/h80;

    .line 72
    .line 73
    invoke-direct {v0, p0, v2}, La/h80;-><init>(La/n80;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, La/n80;->S1:La/n0o0;

    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, La/n80;->G0()La/oxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/oxq;->c:Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteGameField;

    .line 6
    .line 7
    new-instance v0, La/i80;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, p0, v1}, La/i80;-><init>(La/n80;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteGameField;->setCellClickListeners$african_roulette(Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, La/u70;

    .line 17
    .line 18
    new-instance v0, La/i80;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, p0, v2}, La/i80;-><init>(La/n80;B)V

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-direct {p1, v0, v3}, La/u70;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/n80;->P1:La/u70;

    .line 29
    .line 30
    invoke-virtual {p0}, La/n80;->G0()La/oxq;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p1, p1, La/oxq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 35
    .line 36
    iget-object v0, p0, La/n80;->P1:La/u70;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, La/n80;->H0()La/u90;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object v0, p1, La/u90;->e:La/vcu;

    .line 46
    .line 47
    iget-object v4, p1, La/u90;->b:La/p80;

    .line 48
    .line 49
    iget-object v5, p1, La/u90;->r:La/c4m0;

    .line 50
    .line 51
    if-eqz v5, :cond_0

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    invoke-virtual {v5, v6}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-virtual {p1}, La/u90;->z()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, La/vcu;->a()La/vrs;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    sget-object v6, La/vrs;->a:La/vrs;

    .line 65
    .line 66
    if-ne v5, v6, :cond_4

    .line 67
    .line 68
    new-instance v5, La/g90;

    .line 69
    .line 70
    invoke-direct {v5, v1}, La/g90;-><init>(Z)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v5}, La/u90;->G(La/h90;)V

    .line 74
    .line 75
    .line 76
    iget-object v5, v4, La/p80;->d:La/r80;

    .line 77
    .line 78
    iget-object v5, v5, La/r80;->c:La/d80;

    .line 79
    .line 80
    iget-object v6, v5, La/d80;->b:La/z70;

    .line 81
    .line 82
    sget-object v7, La/z70;->v:La/z70;

    .line 83
    .line 84
    if-eq v6, v7, :cond_4

    .line 85
    .line 86
    invoke-virtual {v5}, La/d80;->a()Ljava/util/ArrayList;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-eqz v7, :cond_1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-eqz v7, :cond_3

    .line 106
    .line 107
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    check-cast v7, La/t70;

    .line 112
    .line 113
    iget-object v7, v7, La/t70;->b:La/z70;

    .line 114
    .line 115
    if-ne v7, v6, :cond_2

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    :goto_0
    invoke-virtual {p1, v6}, La/u90;->A(La/z70;)V

    .line 119
    .line 120
    .line 121
    iget-object v5, v4, La/p80;->d:La/r80;

    .line 122
    .line 123
    iget-object v5, v5, La/r80;->c:La/d80;

    .line 124
    .line 125
    invoke-virtual {v5}, La/d80;->a()Ljava/util/ArrayList;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-virtual {p1, v5}, La/u90;->E(Ljava/util/List;)V

    .line 130
    .line 131
    .line 132
    :cond_4
    :goto_1
    invoke-virtual {v0}, La/vcu;->a()La/vrs;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    sget-object v5, La/vrs;->a:La/vrs;

    .line 137
    .line 138
    if-ne v0, v5, :cond_7

    .line 139
    .line 140
    iget-object v0, p1, La/u90;->f:La/ztt;

    .line 141
    .line 142
    invoke-virtual {v0}, La/ztt;->a()La/csr;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iget-object v0, v0, La/csr;->a:La/bsr;

    .line 147
    .line 148
    iget-object v0, v0, La/bsr;->a:La/esr;

    .line 149
    .line 150
    invoke-virtual {v0}, La/esr;->a()Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    iget-object v4, v4, La/p80;->d:La/r80;

    .line 155
    .line 156
    iget-object v4, v4, La/r80;->c:La/d80;

    .line 157
    .line 158
    invoke-virtual {v4}, La/d80;->a()Ljava/util/ArrayList;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-nez v4, :cond_5

    .line 167
    .line 168
    if-nez v0, :cond_5

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_5
    move v1, v3

    .line 172
    :goto_2
    iget-object p1, p1, La/u90;->w:La/p7m0;

    .line 173
    .line 174
    :cond_6
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    move-object v4, v0

    .line 179
    check-cast v4, La/m90;

    .line 180
    .line 181
    invoke-static {v4, v1, v3, v2}, La/m90;->a(La/m90;ZZI)La/m90;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    invoke-virtual {p1, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_6

    .line 190
    .line 191
    :cond_7
    invoke-virtual {p0}, La/n80;->G0()La/oxq;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    iget-object p1, p1, La/oxq;->b:Landroidx/appcompat/widget/AppCompatButton;

    .line 196
    .line 197
    new-instance v0, La/i80;

    .line 198
    .line 199
    invoke-direct {v0, p0, v3}, La/i80;-><init>(La/n80;B)V

    .line 200
    .line 201
    .line 202
    invoke-static {p1, v0}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 203
    .line 204
    .line 205
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v1, v0, La/g80;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, La/g80;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, La/g80;->W1:La/n0o0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/k6i;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v1, v0, La/k6i;->m0:La/n5d0;

    .line 24
    .line 25
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, La/j6i;

    .line 30
    .line 31
    iput-object v1, p0, La/n80;->L1:La/j6i;

    .line 32
    .line 33
    iget-object v0, v0, La/k6i;->a:La/g8i;

    .line 34
    .line 35
    invoke-virtual {v0}, La/g8i;->I9()La/wdk0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, La/n80;->M1:La/wdk0;

    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public final D0()V
    .locals 12

    .line 1
    invoke-virtual {p0}, La/n80;->H0()La/u90;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v2, v0, La/u90;->z:La/qoj0;

    .line 6
    .line 7
    new-instance v4, La/k80;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v9, 0x0

    .line 11
    invoke-direct {v4, p0, v9, v0}, La/k80;-><init>(La/n80;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v0, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, La/kz;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    move-object v5, v9

    .line 32
    invoke-direct/range {v1 .. v6}, La/kz;-><init>(La/gmq;La/clz;La/k80;La/yje;B)V

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-static {v0, v9, v9, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, La/n80;->H0()La/u90;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v6, v0, La/u90;->y:La/qoj0;

    .line 44
    .line 45
    new-instance v8, La/k80;

    .line 46
    .line 47
    const/4 v0, 0x2

    .line 48
    invoke-direct {v8, p0, v9, v0}, La/k80;-><init>(La/n80;La/yje;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v5, La/kz;

    .line 64
    .line 65
    const/4 v10, 0x0

    .line 66
    invoke-direct/range {v5 .. v10}, La/kz;-><init>(La/gmq;La/clz;La/k80;La/yje;C)V

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v9, v9, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, La/n80;->H0()La/u90;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v6, v0, La/u90;->x:La/qoj0;

    .line 77
    .line 78
    new-instance v8, La/k80;

    .line 79
    .line 80
    invoke-direct {v8, p0, v9, v2}, La/k80;-><init>(La/n80;La/yje;B)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    new-instance v5, La/kz;

    .line 96
    .line 97
    invoke-direct/range {v5 .. v10}, La/kz;-><init>(La/gmq;La/clz;La/k80;La/yje;I)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v9, v9, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, La/n80;->H0()La/u90;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget-object v6, v0, La/u90;->w:La/p7m0;

    .line 108
    .line 109
    new-instance v8, La/k80;

    .line 110
    .line 111
    const/4 v0, 0x4

    .line 112
    invoke-direct {v8, p0, v9, v0}, La/k80;-><init>(La/n80;La/yje;B)V

    .line 113
    .line 114
    .line 115
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    new-instance v5, La/kz;

    .line 128
    .line 129
    invoke-direct/range {v5 .. v10}, La/kz;-><init>(La/gmq;La/clz;La/k80;La/yje;S)V

    .line 130
    .line 131
    .line 132
    invoke-static {v0, v9, v9, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, La/n80;->H0()La/u90;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iget-object v6, v0, La/u90;->A:La/qoj0;

    .line 140
    .line 141
    new-instance v8, La/k80;

    .line 142
    .line 143
    const/4 v0, 0x5

    .line 144
    invoke-direct {v8, p0, v9, v0}, La/k80;-><init>(La/n80;La/yje;B)V

    .line 145
    .line 146
    .line 147
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    new-instance v5, La/kz;

    .line 160
    .line 161
    const/4 v11, 0x0

    .line 162
    invoke-direct/range {v5 .. v11}, La/kz;-><init>(La/gmq;La/clz;La/k80;La/yje;BZ)V

    .line 163
    .line 164
    .line 165
    invoke-static {p0, v9, v9, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method public final G0()La/oxq;
    .locals 2

    .line 1
    sget-object v0, La/n80;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/n80;->O1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/oxq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/u90;
    .locals 0

    .line 1
    iget-object p0, p0, La/n80;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/u90;

    .line 8
    .line 9
    return-object p0
.end method

.method public final X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/n80;->H0()La/u90;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/u90;->B:La/qoj0;

    .line 9
    .line 10
    new-instance v1, La/k80;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, p0, v3, v2}, La/k80;-><init>(La/n80;La/yje;B)V

    .line 15
    .line 16
    .line 17
    sget-object v2, La/lkz;->a:La/lkz;

    .line 18
    .line 19
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    new-instance v5, La/kz;

    .line 32
    .line 33
    invoke-direct {v5, v0, v2, v1, v3}, La/kz;-><init>(La/gmq;La/clz;La/k80;La/yje;)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x3

    .line 37
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 38
    .line 39
    .line 40
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, La/n80;->P1:La/u70;

    .line 6
    .line 7
    invoke-virtual {p0}, La/n80;->G0()La/oxq;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v1, v1, La/oxq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/n80;->G0()La/oxq;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v0, v0, La/oxq;->f:Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;

    .line 21
    .line 22
    iget-object v1, v0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->c:Landroid/animation/AnimatorSet;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/animation/Animator;->removeAllListeners()V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v1, v0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->c:Landroid/animation/AnimatorSet;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->cancel()V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object v0, v0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->d:Landroid/animation/ObjectAnimator;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {p0}, La/n80;->H0()La/u90;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const/4 v0, 0x0

    .line 48
    iput-boolean v0, p0, La/u90;->v:Z

    .line 49
    .line 50
    return-void
.end method

.method public final d0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/n80;->H0()La/u90;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, La/u90;->v:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, La/n80;->G0()La/oxq;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La/oxq;->f:Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, La/n80;->S1:La/n0o0;

    .line 20
    .line 21
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/j80;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 32
    .line 33
    invoke-virtual {p0}, La/n80;->G0()La/oxq;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget-object p0, p0, La/oxq;->f:Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;

    .line 38
    .line 39
    iget-object v0, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->c:Landroid/animation/AnimatorSet;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->pause()V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object p0, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->d:Landroid/animation/ObjectAnimator;

    .line 47
    .line 48
    if-eqz p0, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/animation/Animator;->pause()V

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void
.end method

.method public final e0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/n80;->H0()La/u90;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-boolean v0, v0, La/u90;->v:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, La/n80;->G0()La/oxq;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v0, v0, La/oxq;->f:Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, La/n80;->S1:La/n0o0;

    .line 23
    .line 24
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, La/j80;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, La/n80;->G0()La/oxq;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget-object p0, p0, La/oxq;->f:Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;

    .line 38
    .line 39
    iget-object v0, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->c:Landroid/animation/AnimatorSet;

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/animation/Animator;->isPaused()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-ne v0, v1, :cond_1

    .line 49
    .line 50
    iget-object v0, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->c:Landroid/animation/AnimatorSet;

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->resume()V

    .line 55
    .line 56
    .line 57
    :cond_1
    iget-object v0, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->d:Landroid/animation/ObjectAnimator;

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/animation/Animator;->isPaused()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-ne v0, v1, :cond_2

    .line 66
    .line 67
    iget-object p0, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->d:Landroid/animation/ObjectAnimator;

    .line 68
    .line 69
    if-eqz p0, :cond_2

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/animation/Animator;->resume()V

    .line 72
    .line 73
    .line 74
    :cond_2
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/n80;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
