.class public final La/vg3;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/vg3;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/hfk0",
        "impl"
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
.field public static final R1:La/hfk0;

.field public static final synthetic S1:[La/iiy;

.field public static final U1:Ljava/lang/String;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/j8i;

.field public M1:La/wdk0;

.field public N1:La/zav;

.field public final O1:La/s0r;

.field public final P1:La/kiu0;

.field public Q1:La/ndk0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/vg3;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/app_start/impl/databinding/FragmentAppStartBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    new-array v2, v2, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v2, v4

    .line 17
    .line 18
    sput-object v2, La/vg3;->S1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/hfk0;

    .line 21
    .line 22
    const/16 v2, 0x16

    .line 23
    .line 24
    invoke-direct {v0, v2}, La/hfk0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/vg3;->R1:La/hfk0;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, La/vg3;->U1:Ljava/lang/String;

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d01f2

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    const v1, 0x7f040b5d

    .line 10
    .line 11
    .line 12
    sget-object v2, La/bp3;->b:La/bp3;

    .line 13
    .line 14
    invoke-direct {v0, v1, v1, v2, v2}, La/e9o0;-><init>(IILa/bp3;La/bp3;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/vg3;->K1:La/e9o0;

    .line 18
    .line 19
    sget-object v0, La/ug3;->a:La/ug3;

    .line 20
    .line 21
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La/vg3;->O1:La/s0r;

    .line 26
    .line 27
    new-instance v0, La/qg3;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-direct {v0, p0, v1}, La/qg3;-><init>(La/vg3;B)V

    .line 31
    .line 32
    .line 33
    new-instance v1, La/f80;

    .line 34
    .line 35
    const/16 v2, 0xe

    .line 36
    .line 37
    invoke-direct {v1, p0, v2}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    sget-object v2, La/wez;->b:La/wez;

    .line 41
    .line 42
    new-instance v3, La/f80;

    .line 43
    .line 44
    const/16 v4, 0xf

    .line 45
    .line 46
    invoke-direct {v3, v1, v4}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-class v2, La/ij3;

    .line 54
    .line 55
    sget-object v3, La/sre0;->a:La/tre0;

    .line 56
    .line 57
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    new-instance v3, La/t51;

    .line 62
    .line 63
    const/4 v4, 0x6

    .line 64
    invoke-direct {v3, v1, v4}, La/t51;-><init>(La/a8z;B)V

    .line 65
    .line 66
    .line 67
    new-instance v4, La/t51;

    .line 68
    .line 69
    const/4 v5, 0x7

    .line 70
    invoke-direct {v4, v1, v5}, La/t51;-><init>(La/a8z;B)V

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, La/vg3;->P1:La/kiu0;

    .line 78
    .line 79
    new-instance v0, La/xn;

    .line 80
    .line 81
    const/4 v1, 0x5

    .line 82
    invoke-direct {v0, v1}, La/xn;-><init>(B)V

    .line 83
    .line 84
    .line 85
    new-instance v1, La/rg3;

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    invoke-direct {v1, v2}, La/rg3;-><init>(B)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 92
    .line 93
    .line 94
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/fg3;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/fg3;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/fg3;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v1, La/vg3;->U1:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v2, v0, v1}, La/fg3;->a(La/i1w0;Ljava/lang/String;)La/l8i;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v1, v0, La/l8i;->k1:La/n5d0;

    .line 66
    .line 67
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, La/j8i;

    .line 72
    .line 73
    iput-object v1, p0, La/vg3;->L1:La/j8i;

    .line 74
    .line 75
    iget-object v1, v0, La/l8i;->L0:La/wdk0;

    .line 76
    .line 77
    iput-object v1, p0, La/vg3;->M1:La/wdk0;

    .line 78
    .line 79
    iget-object v0, v0, La/l8i;->X:La/ok50;

    .line 80
    .line 81
    iget-object v0, v0, La/ok50;->a:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, La/vqc;

    .line 84
    .line 85
    invoke-virtual {v0}, La/vqc;->f()La/zav;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, La/vg3;->N1:La/zav;

    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 96
    .line 97
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final D0()V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/vg3;->H0()La/ij3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/ij3;->j0:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/lr;

    .line 8
    .line 9
    const/16 v2, 0xe

    .line 10
    .line 11
    invoke-direct {v1, v0, v2}, La/lr;-><init>(La/gmq;B)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, La/i120;->W(La/gmq;)La/gmq;

    .line 15
    .line 16
    .line 17
    move-result-object v8

    .line 18
    sget-object v0, La/lkz;->a:La/lkz;

    .line 19
    .line 20
    new-instance v0, La/i8;

    .line 21
    .line 22
    const/4 v6, 0x4

    .line 23
    const/16 v7, 0x15

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    const-class v3, La/vg3;

    .line 27
    .line 28
    const-string v4, "onHandleUiState"

    .line 29
    .line 30
    const-string v5, "onHandleUiState-rtpOjow(I)V"

    .line 31
    .line 32
    move-object v2, p0

    .line 33
    invoke-direct/range {v0 .. v7}, La/i8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    new-instance v5, La/y51;

    .line 49
    .line 50
    const/4 v9, 0x0

    .line 51
    invoke-direct {v5, v8, v1, v0, v9}, La/y51;-><init>(La/gmq;La/clz;La/i8;La/yje;)V

    .line 52
    .line 53
    .line 54
    const/4 v8, 0x3

    .line 55
    invoke-static {v4, v9, v9, v5, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, La/vg3;->H0()La/ij3;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v1, v0, La/ij3;->j0:La/p7m0;

    .line 63
    .line 64
    new-instance v4, La/sy2;

    .line 65
    .line 66
    const/16 v5, 0x17

    .line 67
    .line 68
    invoke-direct {v4, v5}, La/sy2;-><init>(B)V

    .line 69
    .line 70
    .line 71
    sget-object v10, La/i120;->g:La/jbp;

    .line 72
    .line 73
    invoke-static {v1, v4, v10}, La/i120;->X(La/gmq;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/rwk;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    new-instance v4, La/zh3;

    .line 78
    .line 79
    const/4 v11, 0x1

    .line 80
    invoke-direct {v4, v1, v0, v11}, La/zh3;-><init>(La/rwk;La/ij3;B)V

    .line 81
    .line 82
    .line 83
    sget-object v0, La/lkz;->a:La/lkz;

    .line 84
    .line 85
    new-instance v0, La/sg3;

    .line 86
    .line 87
    invoke-direct {v0, p0, v9, v11}, La/sg3;-><init>(La/vg3;La/yje;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    new-instance v6, La/y51;

    .line 103
    .line 104
    invoke-direct {v6, v4, v1, v0, v9}, La/y51;-><init>(La/zh3;La/clz;La/sg3;La/yje;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v5, v9, v9, v6, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, La/vg3;->H0()La/ij3;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v0, v0, La/ij3;->f0:La/p7m0;

    .line 115
    .line 116
    new-instance v12, La/lr;

    .line 117
    .line 118
    const/16 v1, 0xd

    .line 119
    .line 120
    invoke-direct {v12, v0, v1}, La/lr;-><init>(La/gmq;B)V

    .line 121
    .line 122
    .line 123
    new-instance v0, La/i8;

    .line 124
    .line 125
    const/4 v6, 0x4

    .line 126
    const/16 v7, 0x16

    .line 127
    .line 128
    const/4 v1, 0x2

    .line 129
    const-string v4, "onHandleEvent"

    .line 130
    .line 131
    const-string v5, "onHandleEvent(Lorg/xplatform/app_start/impl/presentation/AppStartEvent;)V"

    .line 132
    .line 133
    invoke-direct/range {v0 .. v7}, La/i8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 134
    .line 135
    .line 136
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    new-instance v5, La/tg3;

    .line 149
    .line 150
    invoke-direct {v5, v12, v1, v0, v9}, La/tg3;-><init>(La/lr;La/clz;La/i8;La/yje;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v4, v9, v9, v5, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, La/vg3;->H0()La/ij3;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    iget-object v1, v0, La/ij3;->j0:La/p7m0;

    .line 161
    .line 162
    new-instance v4, La/sy2;

    .line 163
    .line 164
    const/16 v5, 0x18

    .line 165
    .line 166
    invoke-direct {v4, v5}, La/sy2;-><init>(B)V

    .line 167
    .line 168
    .line 169
    invoke-static {v1, v4, v10}, La/i120;->X(La/gmq;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/rwk;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    new-instance v4, La/zh3;

    .line 174
    .line 175
    const/4 v5, 0x2

    .line 176
    invoke-direct {v4, v1, v0, v5}, La/zh3;-><init>(La/rwk;La/ij3;B)V

    .line 177
    .line 178
    .line 179
    new-instance v0, La/sg3;

    .line 180
    .line 181
    invoke-direct {v0, p0, v9, v5}, La/sg3;-><init>(La/vg3;La/yje;B)V

    .line 182
    .line 183
    .line 184
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    new-instance v6, La/tg3;

    .line 197
    .line 198
    invoke-direct {v6, v4, v1, v0, v9}, La/tg3;-><init>(La/zh3;La/clz;La/sg3;La/yje;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v5, v9, v9, v6, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0}, La/vg3;->H0()La/ij3;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    iget-object v0, v0, La/ij3;->j0:La/p7m0;

    .line 209
    .line 210
    new-instance v1, La/sy2;

    .line 211
    .line 212
    const/16 v4, 0x15

    .line 213
    .line 214
    invoke-direct {v1, v4}, La/sy2;-><init>(B)V

    .line 215
    .line 216
    .line 217
    invoke-static {v0, v1, v10}, La/i120;->X(La/gmq;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/rwk;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    new-instance v1, La/ji3;

    .line 222
    .line 223
    invoke-direct {v1, v0, v11}, La/ji3;-><init>(La/rwk;B)V

    .line 224
    .line 225
    .line 226
    new-instance v0, La/sg3;

    .line 227
    .line 228
    invoke-direct {v0, p0, v9, v8}, La/sg3;-><init>(La/vg3;La/yje;B)V

    .line 229
    .line 230
    .line 231
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    new-instance v6, La/tg3;

    .line 244
    .line 245
    invoke-direct {v6, v1, v4, v0, v9}, La/tg3;-><init>(La/ji3;La/clz;La/sg3;La/yje;)V

    .line 246
    .line 247
    .line 248
    invoke-static {v5, v9, v9, v6, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0}, La/vg3;->H0()La/ij3;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    iget-object v0, v0, La/ij3;->j0:La/p7m0;

    .line 256
    .line 257
    new-instance v1, La/sy2;

    .line 258
    .line 259
    const/16 v4, 0x16

    .line 260
    .line 261
    invoke-direct {v1, v4}, La/sy2;-><init>(B)V

    .line 262
    .line 263
    .line 264
    invoke-static {v0, v1, v10}, La/i120;->X(La/gmq;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/rwk;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    new-instance v1, La/ji3;

    .line 269
    .line 270
    const/4 v4, 0x0

    .line 271
    invoke-direct {v1, v0, v4}, La/ji3;-><init>(La/rwk;B)V

    .line 272
    .line 273
    .line 274
    new-instance v0, La/pa;

    .line 275
    .line 276
    const/16 v5, 0x1c

    .line 277
    .line 278
    invoke-direct {v0, p0, v9, v5}, La/pa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 279
    .line 280
    .line 281
    sget-object v5, La/lkz;->a:La/lkz;

    .line 282
    .line 283
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    invoke-static {v6}, La/x0x;->Q(La/glz;)La/tkz;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    new-instance v7, La/tg3;

    .line 296
    .line 297
    invoke-direct {v7, v1, v5, v0, v9}, La/tg3;-><init>(La/ji3;La/clz;La/pa;La/yje;)V

    .line 298
    .line 299
    .line 300
    invoke-static {v6, v9, v9, v7, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 301
    .line 302
    .line 303
    invoke-virtual {p0}, La/vg3;->H0()La/ij3;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    iget-object v1, v0, La/ij3;->j0:La/p7m0;

    .line 308
    .line 309
    sget-object v5, La/ai3;->b:La/ai3;

    .line 310
    .line 311
    invoke-static {v1, v5, v10}, La/i120;->X(La/gmq;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/rwk;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    new-instance v10, La/zh3;

    .line 316
    .line 317
    invoke-direct {v10, v1, v0, v4}, La/zh3;-><init>(La/rwk;La/ij3;B)V

    .line 318
    .line 319
    .line 320
    new-instance v0, La/i8;

    .line 321
    .line 322
    const/4 v6, 0x4

    .line 323
    const/16 v7, 0x17

    .line 324
    .line 325
    const/4 v1, 0x2

    .line 326
    const-string v4, "onHandleAppBlockState"

    .line 327
    .line 328
    const-string v5, "onHandleAppBlockState(Lorg/xplatform/app_start/impl/presentation/model/AppBlockUiState;)V"

    .line 329
    .line 330
    invoke-direct/range {v0 .. v7}, La/i8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 331
    .line 332
    .line 333
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    new-instance v4, La/tg3;

    .line 346
    .line 347
    invoke-direct {v4, v10, v1, v0, v9}, La/tg3;-><init>(La/zh3;La/clz;La/i8;La/yje;)V

    .line 348
    .line 349
    .line 350
    invoke-static {v2, v9, v9, v4, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 351
    .line 352
    .line 353
    invoke-virtual {p0}, La/vg3;->H0()La/ij3;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    iget-object v10, v0, La/ij3;->l0:La/p7m0;

    .line 358
    .line 359
    new-instance v0, La/i8;

    .line 360
    .line 361
    const/16 v7, 0x18

    .line 362
    .line 363
    const/4 v1, 0x2

    .line 364
    const-string v4, "onHandleGoogleUpdate"

    .line 365
    .line 366
    const-string v5, "onHandleGoogleUpdate(Lorg/xplatform/app_start/impl/presentation/model/GoogleUpdateState;)V"

    .line 367
    .line 368
    move-object v2, p0

    .line 369
    invoke-direct/range {v0 .. v7}, La/i8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 370
    .line 371
    .line 372
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    new-instance v3, La/tg3;

    .line 385
    .line 386
    invoke-direct {v3, v10, v1, v0, v9}, La/tg3;-><init>(La/gmq;La/clz;La/i8;La/yje;)V

    .line 387
    .line 388
    .line 389
    invoke-static {v2, v9, v9, v3, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 390
    .line 391
    .line 392
    return-void
.end method

.method public final G0()La/zxq;
    .locals 2

    .line 1
    sget-object v0, La/vg3;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/vg3;->O1:La/s0r;

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
    check-cast p0, La/zxq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/ij3;
    .locals 0

    .line 1
    iget-object p0, p0, La/vg3;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ij3;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/vg3;->H0()La/ij3;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p1, La/ij3;->Q:La/ag3;

    .line 9
    .line 10
    iget-object v0, v0, La/ag3;->a:La/kt2;

    .line 11
    .line 12
    const-string v1, "app_loading"

    .line 13
    .line 14
    invoke-interface {v0, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p1, La/ij3;->S:La/x20;

    .line 18
    .line 19
    iget-object p1, p1, La/ij3;->T:La/cmt;

    .line 20
    .line 21
    invoke-virtual {p1}, La/cmt;->g()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, v0, La/x20;->a:La/s1p;

    .line 26
    .line 27
    new-instance v1, La/j1p;

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    invoke-direct {v1, p1, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-wide/16 v1, 0x2c36

    .line 38
    .line 39
    invoke-virtual {v0, p1, v1, v2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const/4 p1, 0x0

    .line 51
    invoke-static {p0, p1}, La/bcm0;->x(Landroid/view/Window;Z)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final Z()V
    .locals 15

    .line 1
    invoke-virtual {p0}, La/vg3;->H0()La/ij3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/ij3;->j0:La/p7m0;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/jh3;

    .line 13
    .line 14
    const/4 v13, 0x0

    .line 15
    const/16 v14, 0xbff

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v12, 0x0

    .line 26
    invoke-static/range {v3 .. v14}, La/jh3;->a(La/jh3;La/iy3;Ljava/util/ArrayList;La/ph3;La/oc5;La/oc5;Ljava/lang/String;La/yfw;Ljava/util/Set;ZZI)La/jh3;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    iget-object v0, v0, La/ij3;->c0:La/ljf0;

    .line 37
    .line 38
    iget-object v0, v0, La/ljf0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, La/g6m0;

    .line 41
    .line 42
    iget-object v0, v0, La/g6m0;->a:La/f6m0;

    .line 43
    .line 44
    iget-object v1, v0, La/f6m0;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 45
    .line 46
    const-wide/16 v2, -0x1

    .line 47
    .line 48
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 49
    .line 50
    .line 51
    iget-object v0, v0, La/f6m0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, La/vg3;->G0()La/zxq;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v0, v0, La/zxq;->b:Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;

    .line 62
    .line 63
    const v1, 0x7f0a0e28

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/smart_background/c;

    .line 71
    .line 72
    iget-object v2, v0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->u:La/hbk0;

    .line 73
    .line 74
    instance-of v2, v2, La/cbk0;

    .line 75
    .line 76
    if-eqz v2, :cond_1

    .line 77
    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/smart_background/c;->a()V

    .line 81
    .line 82
    .line 83
    :cond_1
    const v1, 0x7f0a0e2a

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;

    .line 91
    .line 92
    iget-object v0, v0, Lorg/xplatform/app_start/impl/presentation/view/AppStartScreenLayout;->u:La/hbk0;

    .line 93
    .line 94
    instance-of v0, v0, La/gbk0;

    .line 95
    .line 96
    if-eqz v0, :cond_2

    .line 97
    .line 98
    if-eqz v1, :cond_2

    .line 99
    .line 100
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/smart_background/e;->a()V

    .line 101
    .line 102
    .line 103
    :cond_2
    invoke-super {p0}, La/yx5;->Z()V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final d0()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/vg3;->H0()La/ij3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/ij3;->h0:La/c4m0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, La/vg3;->H0()La/ij3;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, La/ij3;->i0:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/bby;

    .line 36
    .line 37
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final e0()V
    .locals 5

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/vg3;->H0()La/ij3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, v0, La/ij3;->h0:La/c4m0;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, La/pby;->isActive()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v1, v0, La/ij3;->R:La/m1e;

    .line 21
    .line 22
    invoke-interface {v1}, La/m1e;->a()La/gmq;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, La/vh3;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x2

    .line 30
    invoke-direct {v2, v0, v3, v4}, La/vh3;-><init>(La/ij3;La/yje;B)V

    .line 31
    .line 32
    .line 33
    new-instance v3, La/fnq;

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    invoke-direct {v3, v1, v2, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sget-object v2, La/cj3;->h:La/cj3;

    .line 44
    .line 45
    invoke-static {v3, v1, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iput-object v1, v0, La/ij3;->h0:La/c4m0;

    .line 50
    .line 51
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    check-cast v0, La/rn;

    .line 59
    .line 60
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const v1, 0x7f040ae3

    .line 67
    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    invoke-static {p0, v1, v2}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    check-cast v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 75
    .line 76
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iput-object v1, v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->y1:Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-virtual {v0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C()La/sn;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget-object v1, v1, La/sn;->b:Landroid/widget/FrameLayout;

    .line 87
    .line 88
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 89
    .line 90
    invoke-direct {v2, p0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    .line 101
    .line 102
    invoke-direct {v1, p0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final g0()V
    .locals 5

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/vg3;->H0()La/ij3;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/ij3;->k0:La/p7m0;

    .line 9
    .line 10
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, La/sf50;

    .line 15
    .line 16
    sget-object v2, La/nf50;->a:La/nf50;

    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object v3, La/rf50;->a:La/rf50;

    .line 26
    .line 27
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/4 v4, 0x0

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    iget-object v1, p0, La/ij3;->m0:La/jo20;

    .line 35
    .line 36
    sget-object v3, La/kh3;->c:La/kh3;

    .line 37
    .line 38
    invoke-virtual {v1, v3}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, La/g8d;

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    iget-object p0, p0, La/ij3;->e:La/mne;

    .line 47
    .line 48
    invoke-virtual {v1, p0}, La/g8d;->a(La/mne;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v4, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    invoke-static {}, La/itt0;->a()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    instance-of v3, v1, La/pf50;

    .line 60
    .line 61
    if-eqz v3, :cond_3

    .line 62
    .line 63
    iget-object p0, p0, La/ij3;->q:La/i9c;

    .line 64
    .line 65
    invoke-virtual {p0}, La/vw5;->g()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v4, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    instance-of v3, v1, La/qf50;

    .line 73
    .line 74
    if-eqz v3, :cond_6

    .line 75
    .line 76
    check-cast v1, La/qf50;

    .line 77
    .line 78
    iget-boolean p0, v1, La/qf50;->a:Z

    .line 79
    .line 80
    if-eqz p0, :cond_4

    .line 81
    .line 82
    const/4 p0, 0x2

    .line 83
    invoke-static {v1, p0}, La/qf50;->a(La/qf50;I)La/qf50;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {v0, v4, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_4
    iget-boolean p0, v1, La/qf50;->b:Z

    .line 92
    .line 93
    if-eqz p0, :cond_5

    .line 94
    .line 95
    const/4 p0, 0x1

    .line 96
    invoke-static {v1, p0}, La/qf50;->a(La/qf50;I)La/qf50;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {v0, v4, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    :cond_5
    :goto_0
    return-void

    .line 104
    :cond_6
    instance-of v1, v1, La/of50;

    .line 105
    .line 106
    if-eqz v1, :cond_7

    .line 107
    .line 108
    invoke-virtual {p0}, La/ij3;->x()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v4, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/vg3;->H0()La/ij3;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, La/ij3;->a0:La/o470;

    .line 12
    .line 13
    iget-object p1, p1, La/o470;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, La/g6m0;

    .line 16
    .line 17
    iget-object p1, p1, La/g6m0;->a:La/f6m0;

    .line 18
    .line 19
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iget-object p1, p1, La/f6m0;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 24
    .line 25
    const-wide/16 v2, -0x1

    .line 26
    .line 27
    invoke-virtual {p1, v2, v3, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 31
    .line 32
    invoke-static {p1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget-object p1, La/tvk;->a:La/rwj;

    .line 37
    .line 38
    sget-object p1, La/ys10;->a:La/vs10;

    .line 39
    .line 40
    invoke-virtual {p1}, La/vs10;->x()La/vs10;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    new-instance v4, La/sg3;

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    const/4 p2, 0x0

    .line 48
    invoke-direct {v4, p0, p1, p2}, La/sg3;-><init>(La/vg3;La/yje;B)V

    .line 49
    .line 50
    .line 51
    const/16 v5, 0xb

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/vg3;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
