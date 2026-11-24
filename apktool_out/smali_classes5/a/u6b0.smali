.class public final La/u6b0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/u6b0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/xi70",
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
.field public static final e2:La/xi70;

.field public static final synthetic f2:[La/iiy;

.field public static final g2:Ljava/lang/String;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/poq0;

.field public M1:La/lme0;

.field public N1:La/r46;

.field public O1:La/ddk;

.field public P1:La/nh70;

.field public Q1:La/jdk0;

.field public R1:La/kud;

.field public S1:La/ii;

.field public U1:La/wdk0;

.field public final V1:Z

.field public final W1:La/n0o0;

.field public final X1:La/kiu0;

.field public final Y1:La/s0r;

.field public final Z1:La/a8z;

.field public final a2:La/a8z;

.field public final b2:La/d930;

.field public final c2:La/a8z;

.field public final d2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/u6b0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/popular_classic/impl/databinding/PopularClassicScreenFragmentBinding;"

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
    sput-object v2, La/u6b0;->f2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/xi70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/u6b0;->e2:La/xi70;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, La/u6b0;->g2:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const v0, 0x7f0d051d

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/u6b0;->K1:La/hnm0;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, La/u6b0;->V1:Z

    .line 13
    .line 14
    new-instance v1, La/k6b0;

    .line 15
    .line 16
    const/16 v2, 0x9

    .line 17
    .line 18
    invoke-direct {v1, p0, v2}, La/k6b0;-><init>(La/u6b0;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iput-object v1, p0, La/u6b0;->W1:La/n0o0;

    .line 26
    .line 27
    new-instance v1, La/k6b0;

    .line 28
    .line 29
    const/16 v2, 0xa

    .line 30
    .line 31
    invoke-direct {v1, p0, v2}, La/k6b0;-><init>(La/u6b0;B)V

    .line 32
    .line 33
    .line 34
    new-instance v2, La/r6b0;

    .line 35
    .line 36
    invoke-direct {v2, p0, v0}, La/r6b0;-><init>(La/u6b0;B)V

    .line 37
    .line 38
    .line 39
    sget-object v3, La/wez;->b:La/wez;

    .line 40
    .line 41
    new-instance v4, La/wz80;

    .line 42
    .line 43
    const/16 v5, 0x1b

    .line 44
    .line 45
    invoke-direct {v4, v2, v5}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const-class v4, La/sbb0;

    .line 53
    .line 54
    sget-object v5, La/sre0;->a:La/tre0;

    .line 55
    .line 56
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    new-instance v5, La/a190;

    .line 61
    .line 62
    const/16 v6, 0x1c

    .line 63
    .line 64
    invoke-direct {v5, v2, v6}, La/a190;-><init>(La/a8z;B)V

    .line 65
    .line 66
    .line 67
    new-instance v6, La/a190;

    .line 68
    .line 69
    const/16 v7, 0x1d

    .line 70
    .line 71
    invoke-direct {v6, v2, v7}, La/a190;-><init>(La/a8z;B)V

    .line 72
    .line 73
    .line 74
    invoke-static {p0, v4, v5, v6, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iput-object v1, p0, La/u6b0;->X1:La/kiu0;

    .line 79
    .line 80
    sget-object v1, La/t6b0;->a:La/t6b0;

    .line 81
    .line 82
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iput-object v1, p0, La/u6b0;->Y1:La/s0r;

    .line 87
    .line 88
    new-instance v1, La/k6b0;

    .line 89
    .line 90
    const/16 v2, 0xb

    .line 91
    .line 92
    invoke-direct {v1, p0, v2}, La/k6b0;-><init>(La/u6b0;B)V

    .line 93
    .line 94
    .line 95
    invoke-static {v3, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iput-object v1, p0, La/u6b0;->Z1:La/a8z;

    .line 100
    .line 101
    new-instance v1, La/k6b0;

    .line 102
    .line 103
    const/16 v2, 0xc

    .line 104
    .line 105
    invoke-direct {v1, p0, v2}, La/k6b0;-><init>(La/u6b0;B)V

    .line 106
    .line 107
    .line 108
    invoke-static {v3, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    iput-object v1, p0, La/u6b0;->a2:La/a8z;

    .line 113
    .line 114
    new-instance v1, La/d930;

    .line 115
    .line 116
    invoke-direct {v1, v0}, La/d930;-><init>(B)V

    .line 117
    .line 118
    .line 119
    iput-object v1, p0, La/u6b0;->b2:La/d930;

    .line 120
    .line 121
    new-instance v1, La/k6b0;

    .line 122
    .line 123
    invoke-direct {v1, p0, v0}, La/k6b0;-><init>(La/u6b0;B)V

    .line 124
    .line 125
    .line 126
    invoke-static {v3, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iput-object v0, p0, La/u6b0;->c2:La/a8z;

    .line 131
    .line 132
    new-instance v0, La/k6b0;

    .line 133
    .line 134
    const/4 v1, 0x2

    .line 135
    invoke-direct {v0, p0, v1}, La/k6b0;-><init>(La/u6b0;B)V

    .line 136
    .line 137
    .line 138
    invoke-static {v3, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iput-object v0, p0, La/u6b0;->d2:La/a8z;

    .line 143
    .line 144
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 5

    .line 1
    iget-object v0, p0, La/u6b0;->W1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/cpi;

    .line 8
    .line 9
    iget-object v1, v0, La/cpi;->a:La/poq0;

    .line 10
    .line 11
    iput-object v1, p0, La/u6b0;->L1:La/poq0;

    .line 12
    .line 13
    new-instance v1, La/lme0;

    .line 14
    .line 15
    const/4 v2, 0x7

    .line 16
    invoke-direct {v1, v2}, La/lme0;-><init>(B)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, La/u6b0;->M1:La/lme0;

    .line 20
    .line 21
    iget-object v1, v0, La/cpi;->c:La/nr00;

    .line 22
    .line 23
    iget-object v1, v1, La/nr00;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, La/ru;

    .line 26
    .line 27
    new-instance v2, La/r46;

    .line 28
    .line 29
    iget-object v3, v1, La/ru;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, La/z8i;

    .line 32
    .line 33
    iget-object v3, v3, La/z8i;->I:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, La/r9u;

    .line 36
    .line 37
    invoke-static {v3}, La/x1x;->y(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const/4 v4, 0x2

    .line 41
    invoke-direct {v2, v3, v4}, La/r46;-><init>(La/r9u;B)V

    .line 42
    .line 43
    .line 44
    iput-object v2, p0, La/u6b0;->N1:La/r46;

    .line 45
    .line 46
    iget-object v2, v0, La/cpi;->d:La/mct;

    .line 47
    .line 48
    invoke-interface {v2}, La/mct;->b()La/ddk;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object v2, p0, La/u6b0;->O1:La/ddk;

    .line 56
    .line 57
    new-instance v2, La/nh70;

    .line 58
    .line 59
    iget-object v1, v1, La/ru;->a:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, La/z8i;

    .line 62
    .line 63
    iget-object v1, v1, La/z8i;->s:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, La/wdk0;

    .line 66
    .line 67
    invoke-static {v1}, La/x1x;->y(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object v2, p0, La/u6b0;->P1:La/nh70;

    .line 74
    .line 75
    new-instance v1, La/jdk0;

    .line 76
    .line 77
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v1, p0, La/u6b0;->Q1:La/jdk0;

    .line 81
    .line 82
    iget-object v1, v0, La/cpi;->e:La/pyg;

    .line 83
    .line 84
    invoke-interface {v1}, La/pyg;->n()La/kud;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, p0, La/u6b0;->R1:La/kud;

    .line 89
    .line 90
    iget-object v1, v0, La/cpi;->f:La/ii;

    .line 91
    .line 92
    iput-object v1, p0, La/u6b0;->S1:La/ii;

    .line 93
    .line 94
    iget-object v0, v0, La/cpi;->g:La/wdk0;

    .line 95
    .line 96
    iput-object v0, p0, La/u6b0;->U1:La/wdk0;

    .line 97
    .line 98
    return-void
.end method

.method public final D0()V
    .locals 14

    .line 1
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/sbb0;->B0:La/p7m0;

    .line 6
    .line 7
    new-instance v2, La/m430;

    .line 8
    .line 9
    const/16 v3, 0x18

    .line 10
    .line 11
    invoke-direct {v2, v1, v0, v3}, La/m430;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    new-instance v1, La/xab0;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v11, 0x0

    .line 18
    invoke-direct {v1, v0, v8, v11}, La/xab0;-><init>(La/sbb0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    new-instance v4, La/fnq;

    .line 22
    .line 23
    invoke-direct {v4, v2, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, La/gbv;

    .line 27
    .line 28
    invoke-direct {v1, v0, v8, v3}, La/gbv;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 29
    .line 30
    .line 31
    new-instance v9, La/dnq;

    .line 32
    .line 33
    invoke-direct {v9, v4, v1, v11}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 34
    .line 35
    .line 36
    new-instance v0, La/p6b0;

    .line 37
    .line 38
    const/4 v6, 0x4

    .line 39
    const/4 v7, 0x7

    .line 40
    const/4 v1, 0x2

    .line 41
    const-class v3, La/u6b0;

    .line 42
    .line 43
    const-string v4, "handlePopularUiState"

    .line 44
    .line 45
    const-string v5, "handlePopularUiState(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/PopularClassicUiModel;)V"

    .line 46
    .line 47
    move-object v2, p0

    .line 48
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 49
    .line 50
    .line 51
    sget-object v1, La/lkz;->a:La/lkz;

    .line 52
    .line 53
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    new-instance v4, La/fra0;

    .line 66
    .line 67
    invoke-direct {v4, v9, v1, v0, v8}, La/fra0;-><init>(La/dnq;La/clz;La/p6b0;La/yje;)V

    .line 68
    .line 69
    .line 70
    const/4 v12, 0x3

    .line 71
    invoke-static {v2, v8, v8, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-object v0, v0, La/sbb0;->s:La/alv;

    .line 79
    .line 80
    iget-object v1, v0, La/alv;->p:La/p7m0;

    .line 81
    .line 82
    new-instance v2, La/u5u;

    .line 83
    .line 84
    const/16 v4, 0xa

    .line 85
    .line 86
    invoke-direct {v2, v0, v8, v4}, La/u5u;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 87
    .line 88
    .line 89
    new-instance v0, La/fnq;

    .line 90
    .line 91
    invoke-direct {v0, v1, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 92
    .line 93
    .line 94
    new-instance v9, La/i89;

    .line 95
    .line 96
    const/16 v13, 0x16

    .line 97
    .line 98
    invoke-direct {v9, v0, v13}, La/i89;-><init>(La/gmq;B)V

    .line 99
    .line 100
    .line 101
    sget-object v0, La/lkz;->a:La/lkz;

    .line 102
    .line 103
    new-instance v0, La/p6b0;

    .line 104
    .line 105
    const/16 v7, 0x8

    .line 106
    .line 107
    const/4 v1, 0x2

    .line 108
    const-string v4, "handleHandShakeEnable"

    .line 109
    .line 110
    const-string v5, "handleHandShakeEnable(Z)V"

    .line 111
    .line 112
    move-object v2, p0

    .line 113
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 114
    .line 115
    .line 116
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    new-instance v4, La/fra0;

    .line 129
    .line 130
    invoke-direct {v4, v9, v1, v0, v8}, La/fra0;-><init>(La/i89;La/clz;La/p6b0;La/yje;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v2, v8, v8, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iget-object v0, v0, La/sbb0;->C0:La/p7m0;

    .line 141
    .line 142
    new-instance v1, La/wk30;

    .line 143
    .line 144
    const/16 v2, 0x15

    .line 145
    .line 146
    invoke-direct {v1, v0, v2}, La/wk30;-><init>(La/gmq;B)V

    .line 147
    .line 148
    .line 149
    new-instance v9, La/eu4;

    .line 150
    .line 151
    const/16 v0, 0x1a

    .line 152
    .line 153
    invoke-direct {v9, v1, v0}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 154
    .line 155
    .line 156
    new-instance v0, La/p6b0;

    .line 157
    .line 158
    const/16 v7, 0x9

    .line 159
    .line 160
    const/4 v1, 0x2

    .line 161
    const-string v4, "handlePopularMainInfoStateModel"

    .line 162
    .line 163
    const-string v5, "handlePopularMainInfoStateModel(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/PopularClassicMainInfoUiModel;)V"

    .line 164
    .line 165
    move-object v2, p0

    .line 166
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 167
    .line 168
    .line 169
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    new-instance v4, La/fra0;

    .line 182
    .line 183
    invoke-direct {v4, v9, v1, v0, v8}, La/fra0;-><init>(La/eu4;La/clz;La/p6b0;La/yje;)V

    .line 184
    .line 185
    .line 186
    invoke-static {v2, v8, v8, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    iget-object v0, v0, La/sbb0;->D:La/x4u;

    .line 194
    .line 195
    iget-object v0, v0, La/x4u;->a:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v0, La/cad;

    .line 198
    .line 199
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, La/bad;

    .line 202
    .line 203
    iget-object v9, v0, La/bad;->a:La/p7m0;

    .line 204
    .line 205
    new-instance v0, La/p6b0;

    .line 206
    .line 207
    const/16 v7, 0xa

    .line 208
    .line 209
    const/4 v1, 0x2

    .line 210
    const-string v4, "handleInnerTabsError"

    .line 211
    .line 212
    const-string v5, "handleInnerTabsError(Z)V"

    .line 213
    .line 214
    move-object v2, p0

    .line 215
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 216
    .line 217
    .line 218
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    new-instance v4, La/fra0;

    .line 231
    .line 232
    move-object v5, v9

    .line 233
    const/4 v9, 0x0

    .line 234
    move-object v7, v0

    .line 235
    invoke-direct/range {v4 .. v9}, La/fra0;-><init>(La/gmq;La/clz;La/p6b0;La/yje;S)V

    .line 236
    .line 237
    .line 238
    invoke-static {v1, v8, v8, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    iget-object v0, v0, La/sbb0;->s:La/alv;

    .line 246
    .line 247
    iget-object v9, v0, La/alv;->q:La/p7m0;

    .line 248
    .line 249
    new-instance v0, La/p6b0;

    .line 250
    .line 251
    const/4 v6, 0x4

    .line 252
    const/16 v7, 0xb

    .line 253
    .line 254
    const/4 v1, 0x2

    .line 255
    const-string v4, "handleHandShakeEvent"

    .line 256
    .line 257
    const-string v5, "handleHandShakeEvent(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/hand_shake/HandShakeEvent;)V"

    .line 258
    .line 259
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 260
    .line 261
    .line 262
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    new-instance v4, La/fra0;

    .line 275
    .line 276
    invoke-direct {v4, v9, v1, v0, v8}, La/fra0;-><init>(La/p7m0;La/clz;La/p6b0;La/yje;)V

    .line 277
    .line 278
    .line 279
    invoke-static {v2, v8, v8, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 280
    .line 281
    .line 282
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    iget-object v9, v0, La/sbb0;->G0:La/p7m0;

    .line 287
    .line 288
    new-instance v0, La/p6b0;

    .line 289
    .line 290
    const/16 v7, 0xc

    .line 291
    .line 292
    const/4 v1, 0x2

    .line 293
    const-string v4, "handlePopularEvent"

    .line 294
    .line 295
    const-string v5, "handlePopularEvent(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/events/PopularClassicEvent;)V"

    .line 296
    .line 297
    move-object v2, p0

    .line 298
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 299
    .line 300
    .line 301
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    new-instance v4, La/fra0;

    .line 314
    .line 315
    move-object v5, v9

    .line 316
    const/4 v9, 0x0

    .line 317
    const/4 v10, 0x0

    .line 318
    move-object v7, v0

    .line 319
    invoke-direct/range {v4 .. v10}, La/fra0;-><init>(La/gmq;La/clz;La/p6b0;La/yje;BZ)V

    .line 320
    .line 321
    .line 322
    invoke-static {v1, v8, v8, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 323
    .line 324
    .line 325
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    iget-object v5, v0, La/sbb0;->H0:La/p7m0;

    .line 330
    .line 331
    new-instance v7, La/q6b0;

    .line 332
    .line 333
    const/4 v0, 0x1

    .line 334
    invoke-direct {v7, p0, v8, v0}, La/q6b0;-><init>(La/u6b0;La/yje;B)V

    .line 335
    .line 336
    .line 337
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    new-instance v4, La/fra0;

    .line 350
    .line 351
    invoke-direct/range {v4 .. v9}, La/fra0;-><init>(La/gmq;La/clz;La/q6b0;La/yje;B)V

    .line 352
    .line 353
    .line 354
    invoke-static {v0, v8, v8, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 355
    .line 356
    .line 357
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    iget-object v9, v0, La/sbb0;->J0:La/p7m0;

    .line 362
    .line 363
    new-instance v0, La/p6b0;

    .line 364
    .line 365
    const/4 v6, 0x4

    .line 366
    const/16 v7, 0xd

    .line 367
    .line 368
    const/4 v1, 0x2

    .line 369
    const-string v4, "handlePopularEditCouponHistoryEvent"

    .line 370
    .line 371
    const-string v5, "handlePopularEditCouponHistoryEvent(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/events/PopularClassicEditCouponHistoryEvent;)V"

    .line 372
    .line 373
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 374
    .line 375
    .line 376
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    new-instance v4, La/fra0;

    .line 389
    .line 390
    invoke-direct {v4, v9, v1, v0, v8}, La/fra0;-><init>(La/gmq;La/clz;La/p6b0;La/yje;)V

    .line 391
    .line 392
    .line 393
    invoke-static {v2, v8, v8, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 394
    .line 395
    .line 396
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    iget-object v9, v0, La/sbb0;->E0:La/ol60;

    .line 401
    .line 402
    new-instance v0, La/p6b0;

    .line 403
    .line 404
    const/16 v7, 0xe

    .line 405
    .line 406
    const/4 v1, 0x2

    .line 407
    const-string v4, "handleEvent"

    .line 408
    .line 409
    const-string v5, "handleEvent(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/PopularClassicViewModel$PopularClassicUiAction;)V"

    .line 410
    .line 411
    move-object v2, p0

    .line 412
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 413
    .line 414
    .line 415
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 416
    .line 417
    .line 418
    move-result-object v6

    .line 419
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    new-instance v4, La/fra0;

    .line 428
    .line 429
    move-object v5, v9

    .line 430
    const/4 v9, 0x0

    .line 431
    move v10, v9

    .line 432
    move-object v7, v0

    .line 433
    invoke-direct/range {v4 .. v10}, La/fra0;-><init>(La/gmq;La/clz;La/p6b0;La/yje;BB)V

    .line 434
    .line 435
    .line 436
    invoke-static {v1, v8, v8, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 437
    .line 438
    .line 439
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    iget-object v0, v0, La/sbb0;->K0:La/p7m0;

    .line 444
    .line 445
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 446
    .line 447
    .line 448
    move-result-object v9

    .line 449
    new-instance v0, La/hi70;

    .line 450
    .line 451
    const/4 v6, 0x4

    .line 452
    const/16 v7, 0x1d

    .line 453
    .line 454
    const/4 v1, 0x2

    .line 455
    const-string v4, "handleMinAgeAlertState"

    .line 456
    .line 457
    const-string v5, "handleMinAgeAlertState(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/events/PopularClassicMinAgeAlertEvent;)V"

    .line 458
    .line 459
    invoke-direct/range {v0 .. v7}, La/hi70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 460
    .line 461
    .line 462
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    new-instance v4, La/fra0;

    .line 475
    .line 476
    invoke-direct {v4, v9, v1, v0, v8}, La/fra0;-><init>(La/xae0;La/clz;La/hi70;La/yje;)V

    .line 477
    .line 478
    .line 479
    invoke-static {v2, v8, v8, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 480
    .line 481
    .line 482
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    iget-object v0, v0, La/sbb0;->I0:La/p7m0;

    .line 487
    .line 488
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 489
    .line 490
    .line 491
    move-result-object v9

    .line 492
    new-instance v0, La/p6b0;

    .line 493
    .line 494
    const/4 v7, 0x0

    .line 495
    const/4 v1, 0x2

    .line 496
    const-string v4, "handleScrollState"

    .line 497
    .line 498
    const-string v5, "handleScrollState(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/events/PopularClassicScrollEvent;)V"

    .line 499
    .line 500
    move-object v2, p0

    .line 501
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 502
    .line 503
    .line 504
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    new-instance v4, La/fra0;

    .line 517
    .line 518
    invoke-direct {v4, v9, v1, v0, v8}, La/fra0;-><init>(La/xae0;La/clz;La/p6b0;La/yje;)V

    .line 519
    .line 520
    .line 521
    invoke-static {v2, v8, v8, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 522
    .line 523
    .line 524
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    iget-object v0, v0, La/sbb0;->D0:La/p7m0;

    .line 529
    .line 530
    new-instance v1, La/wk30;

    .line 531
    .line 532
    const/16 v2, 0x17

    .line 533
    .line 534
    invoke-direct {v1, v0, v2}, La/wk30;-><init>(La/gmq;B)V

    .line 535
    .line 536
    .line 537
    invoke-static {v1}, La/i120;->W(La/gmq;)La/gmq;

    .line 538
    .line 539
    .line 540
    move-result-object v9

    .line 541
    new-instance v0, La/p6b0;

    .line 542
    .line 543
    const/4 v7, 0x1

    .line 544
    const/4 v1, 0x2

    .line 545
    const-string v4, "handleSportFilterCommonState"

    .line 546
    .line 547
    const-string v5, "handleSportFilterCommonState(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/SportFilterState;)V"

    .line 548
    .line 549
    move-object v2, p0

    .line 550
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 551
    .line 552
    .line 553
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 554
    .line 555
    .line 556
    move-result-object v6

    .line 557
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    new-instance v4, La/fra0;

    .line 566
    .line 567
    move-object v5, v9

    .line 568
    const/4 v9, 0x0

    .line 569
    const/4 v10, 0x0

    .line 570
    move-object v7, v0

    .line 571
    invoke-direct/range {v4 .. v10}, La/fra0;-><init>(La/gmq;La/clz;La/p6b0;La/yje;BC)V

    .line 572
    .line 573
    .line 574
    invoke-static {v1, v8, v8, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 575
    .line 576
    .line 577
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    iget-object v0, v0, La/sbb0;->D0:La/p7m0;

    .line 582
    .line 583
    new-instance v1, La/wk30;

    .line 584
    .line 585
    const/16 v2, 0x13

    .line 586
    .line 587
    invoke-direct {v1, v0, v2}, La/wk30;-><init>(La/gmq;B)V

    .line 588
    .line 589
    .line 590
    invoke-static {v1}, La/i120;->W(La/gmq;)La/gmq;

    .line 591
    .line 592
    .line 593
    move-result-object v9

    .line 594
    new-instance v0, La/p6b0;

    .line 595
    .line 596
    const/4 v6, 0x4

    .line 597
    const/4 v7, 0x2

    .line 598
    const/4 v1, 0x2

    .line 599
    const-string v4, "handleBannersState"

    .line 600
    .line 601
    const-string v5, "handleBannersState(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/BannerItemState;)V"

    .line 602
    .line 603
    move-object v2, p0

    .line 604
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 605
    .line 606
    .line 607
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 608
    .line 609
    .line 610
    move-result-object v6

    .line 611
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    new-instance v4, La/fra0;

    .line 620
    .line 621
    move-object v5, v9

    .line 622
    const/4 v9, 0x0

    .line 623
    move-object v7, v0

    .line 624
    invoke-direct/range {v4 .. v10}, La/fra0;-><init>(La/gmq;La/clz;La/p6b0;La/yje;BI)V

    .line 625
    .line 626
    .line 627
    invoke-static {v1, v8, v8, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 628
    .line 629
    .line 630
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    iget-object v0, v0, La/sbb0;->D0:La/p7m0;

    .line 635
    .line 636
    new-instance v1, La/wk30;

    .line 637
    .line 638
    const/16 v2, 0x14

    .line 639
    .line 640
    invoke-direct {v1, v0, v2}, La/wk30;-><init>(La/gmq;B)V

    .line 641
    .line 642
    .line 643
    invoke-static {v1}, La/i120;->W(La/gmq;)La/gmq;

    .line 644
    .line 645
    .line 646
    move-result-object v9

    .line 647
    new-instance v0, La/p6b0;

    .line 648
    .line 649
    const/4 v6, 0x4

    .line 650
    const/4 v7, 0x3

    .line 651
    const/4 v1, 0x2

    .line 652
    const-string v4, "handleOneXGamesState"

    .line 653
    .line 654
    const-string v5, "handleOneXGamesState(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/OneXGamesPopularClassicState;)V"

    .line 655
    .line 656
    move-object v2, p0

    .line 657
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 658
    .line 659
    .line 660
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 661
    .line 662
    .line 663
    move-result-object v6

    .line 664
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 669
    .line 670
    .line 671
    move-result-object v1

    .line 672
    new-instance v4, La/fra0;

    .line 673
    .line 674
    move-object v5, v9

    .line 675
    const/4 v9, 0x0

    .line 676
    move-object v7, v0

    .line 677
    invoke-direct/range {v4 .. v9}, La/fra0;-><init>(La/gmq;La/clz;La/p6b0;La/yje;C)V

    .line 678
    .line 679
    .line 680
    invoke-static {v1, v8, v8, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 681
    .line 682
    .line 683
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    iget-object v0, v0, La/sbb0;->D0:La/p7m0;

    .line 688
    .line 689
    new-instance v1, La/wk30;

    .line 690
    .line 691
    invoke-direct {v1, v0, v13}, La/wk30;-><init>(La/gmq;B)V

    .line 692
    .line 693
    .line 694
    invoke-static {v1}, La/i120;->W(La/gmq;)La/gmq;

    .line 695
    .line 696
    .line 697
    move-result-object v9

    .line 698
    new-instance v0, La/p6b0;

    .line 699
    .line 700
    const/4 v6, 0x4

    .line 701
    const/4 v7, 0x4

    .line 702
    const/4 v1, 0x2

    .line 703
    const-string v4, "handleSpecialEventsState"

    .line 704
    .line 705
    const-string v5, "handleSpecialEventsState(Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/models/ListItemState;)V"

    .line 706
    .line 707
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 708
    .line 709
    .line 710
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 711
    .line 712
    .line 713
    move-result-object v6

    .line 714
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 715
    .line 716
    .line 717
    move-result-object v1

    .line 718
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    new-instance v4, La/fra0;

    .line 723
    .line 724
    move-object v5, v9

    .line 725
    const/4 v9, 0x0

    .line 726
    move-object v7, v0

    .line 727
    invoke-direct/range {v4 .. v9}, La/fra0;-><init>(La/gmq;La/clz;La/p6b0;La/yje;I)V

    .line 728
    .line 729
    .line 730
    invoke-static {v1, v8, v8, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 731
    .line 732
    .line 733
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    iget-object v0, v0, La/sbb0;->R:La/yfu;

    .line 738
    .line 739
    invoke-virtual {v0}, La/yfu;->e()La/omi0;

    .line 740
    .line 741
    .line 742
    move-result-object v9

    .line 743
    new-instance v0, La/p6b0;

    .line 744
    .line 745
    const/4 v6, 0x4

    .line 746
    const/4 v7, 0x5

    .line 747
    const/4 v1, 0x2

    .line 748
    const-string v4, "handleSessionTimer"

    .line 749
    .line 750
    const-string v5, "handleSessionTimer(Ljava/lang/String;)V"

    .line 751
    .line 752
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 753
    .line 754
    .line 755
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 756
    .line 757
    .line 758
    move-result-object v1

    .line 759
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 760
    .line 761
    .line 762
    move-result-object v4

    .line 763
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 764
    .line 765
    .line 766
    move-result-object v4

    .line 767
    new-instance v5, La/fra0;

    .line 768
    .line 769
    invoke-direct {v5, v9, v1, v0, v8}, La/fra0;-><init>(La/omi0;La/clz;La/p6b0;La/yje;)V

    .line 770
    .line 771
    .line 772
    invoke-static {v4, v8, v8, v5, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 773
    .line 774
    .line 775
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    iget-object v0, v0, La/sbb0;->y0:La/ol60;

    .line 780
    .line 781
    new-instance v1, La/q6b0;

    .line 782
    .line 783
    invoke-direct {v1, p0, v8, v11}, La/q6b0;-><init>(La/u6b0;La/yje;B)V

    .line 784
    .line 785
    .line 786
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 787
    .line 788
    .line 789
    move-result-object v4

    .line 790
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 791
    .line 792
    .line 793
    move-result-object v5

    .line 794
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 795
    .line 796
    .line 797
    move-result-object v5

    .line 798
    new-instance v6, La/fra0;

    .line 799
    .line 800
    invoke-direct {v6, v0, v4, v1, v8}, La/fra0;-><init>(La/gmq;La/clz;La/q6b0;La/yje;)V

    .line 801
    .line 802
    .line 803
    invoke-static {v5, v8, v8, v6, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 804
    .line 805
    .line 806
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    iget-object v9, v0, La/sbb0;->z0:La/p7m0;

    .line 811
    .line 812
    new-instance v0, La/p6b0;

    .line 813
    .line 814
    const/4 v6, 0x4

    .line 815
    const/4 v7, 0x6

    .line 816
    const/4 v1, 0x2

    .line 817
    const-string v4, "handlePopularAlert2FaState"

    .line 818
    .line 819
    const-string v5, "handlePopularAlert2FaState(Z)V"

    .line 820
    .line 821
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 822
    .line 823
    .line 824
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 825
    .line 826
    .line 827
    move-result-object v6

    .line 828
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 829
    .line 830
    .line 831
    move-result-object v1

    .line 832
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    new-instance v4, La/fra0;

    .line 837
    .line 838
    move-object v5, v9

    .line 839
    const/4 v9, 0x0

    .line 840
    move-object v7, v0

    .line 841
    invoke-direct/range {v4 .. v9}, La/fra0;-><init>(La/gmq;La/clz;La/p6b0;La/yje;B)V

    .line 842
    .line 843
    .line 844
    invoke-static {v1, v8, v8, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 845
    .line 846
    .line 847
    return-void
.end method

.method public final G0()La/r46;
    .locals 0

    .line 1
    iget-object p0, p0, La/u6b0;->N1:La/r46;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "feedsPopularFragmentFactory"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final H0()La/wdk0;
    .locals 0

    .line 1
    iget-object p0, p0, La/u6b0;->U1:La/wdk0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "snackbarManager"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final I0()La/m9b0;
    .locals 2

    .line 1
    sget-object v0, La/u6b0;->f2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/u6b0;->Y1:La/s0r;

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
    check-cast p0, La/m9b0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final J0()La/sbb0;
    .locals 0

    .line 1
    iget-object p0, p0, La/u6b0;->X1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/sbb0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final K0(La/bab0;La/yx5;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 17
    .line 18
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    move-object v3, v2

    .line 41
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 42
    .line 43
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->O()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-nez v4, :cond_0

    .line 48
    .line 49
    iget-object v3, v3, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_0

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    const/4 v3, 0x1

    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->S()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-ne v2, v3, :cond_2

    .line 79
    .line 80
    return-void

    .line 81
    :cond_2
    new-instance v2, La/zb5;

    .line 82
    .line 83
    invoke-direct {v2, p0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 84
    .line 85
    .line 86
    const/4 p0, 0x0

    .line 87
    invoke-virtual {v2, p0, p0, p0, p0}, La/zb5;->p(IIII)V

    .line 88
    .line 89
    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->S()Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_3

    .line 97
    .line 98
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->O()Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-eqz p0, :cond_5

    .line 103
    .line 104
    :cond_3
    sget-object p0, La/lkz;->e:La/lkz;

    .line 105
    .line 106
    invoke-virtual {v2, v0, p0}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v0}, La/zb5;->r(Landroidx/fragment/app/Fragment;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_4
    const p0, 0x7f0a060f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, p0, p2, p1, v3}, La/zb5;->k(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 117
    .line 118
    .line 119
    :cond_5
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_6

    .line 128
    .line 129
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 134
    .line 135
    sget-object p2, La/lkz;->d:La/lkz;

    .line 136
    .line 137
    invoke-virtual {v2, p1, p2}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, p1}, La/zb5;->m(Landroidx/fragment/app/Fragment;)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_6
    invoke-virtual {v2}, La/zb5;->h()V

    .line 145
    .line 146
    .line 147
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, La/k6b0;

    .line 5
    .line 6
    const/4 v0, 0x6

    .line 7
    invoke-direct {p1, p0, v0}, La/k6b0;-><init>(La/u6b0;B)V

    .line 8
    .line 9
    .line 10
    const-string v0, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY"

    .line 11
    .line 12
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, La/ex60;

    .line 20
    .line 21
    const/16 v1, 0xc

    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    const-string v1, "RESET_HASH_SECRET_KEY"

    .line 27
    .line 28
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, La/sj3;->L(Landroid/content/Context;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    iget-object v0, p1, La/sbb0;->E:La/rrc;

    .line 44
    .line 45
    invoke-virtual {v0}, La/rrc;->H()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/16 v1, 0x21

    .line 50
    .line 51
    if-lt v0, v1, :cond_0

    .line 52
    .line 53
    if-nez p0, :cond_0

    .line 54
    .line 55
    iget-object p0, p1, La/sbb0;->H0:La/p7m0;

    .line 56
    .line 57
    new-instance p1, La/i9b0;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_0
    invoke-virtual {p1}, La/sbb0;->I()V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final Z()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/u6b0;->I0()La/m9b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/m9b0;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 6
    .line 7
    iget-object v1, p0, La/u6b0;->c2:La/a8z;

    .line 8
    .line 9
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/ub3;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/google/android/material/appbar/AppBarLayout;->f(La/ub3;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/u6b0;->I0()La/m9b0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, La/m9b0;->j:Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;

    .line 23
    .line 24
    invoke-virtual {v0}, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v1, p0, La/u6b0;->b2:La/d930;

    .line 31
    .line 32
    const-string v2, "SPORTS_FILTER_KEY_STATE"

    .line 33
    .line 34
    invoke-virtual {v1, v2, v0}, La/d930;->c(Ljava/lang/String;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-super {p0}, La/yx5;->Z()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, La/o2t;->a(Landroidx/fragment/app/e;)V

    .line 45
    .line 46
    .line 47
    const-string v0, "FROM_EDIT_COUPON"

    .line 48
    .line 49
    invoke-static {p0, v0}, La/vcc;->C(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object v0, p0, La/u6b0;->a2:La/a8z;

    .line 5
    .line 6
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/hardware/SensorManager;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, La/u6b0;->Z1:La/a8z;

    .line 15
    .line 16
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, La/gkv;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final e0()V
    .locals 15

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, v0, La/sbb0;->y:La/c8c;

    .line 9
    .line 10
    invoke-virtual {v1}, La/c8c;->a()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v1, v0, La/sbb0;->w:La/exu;

    .line 20
    .line 21
    iget-object v1, v1, La/exu;->a:La/dq00;

    .line 22
    .line 23
    iget-object v1, v1, La/dq00;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, La/nw20;

    .line 26
    .line 27
    iget-object v1, v1, La/nw20;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, La/q7d0;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v5, "PUSH_TRACKING"

    .line 39
    .line 40
    invoke-interface {v1, v5}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-object v1, v0, La/sbb0;->x:La/upt;

    .line 48
    .line 49
    invoke-virtual {v1, v4}, La/upt;->a(Z)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    iget-object v1, v0, La/sbb0;->q:La/mne;

    .line 57
    .line 58
    iget-object v8, v1, La/mne;->a:La/rwj;

    .line 59
    .line 60
    new-instance v9, La/mab0;

    .line 61
    .line 62
    invoke-direct {v9, v0, v3, v2}, La/mab0;-><init>(La/sbb0;La/yje;B)V

    .line 63
    .line 64
    .line 65
    const/16 v10, 0xb

    .line 66
    .line 67
    const/4 v6, 0x0

    .line 68
    const/4 v7, 0x0

    .line 69
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 70
    .line 71
    .line 72
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v1, p0, La/u6b0;->M1:La/lme0;

    .line 77
    .line 78
    if-eqz v1, :cond_a

    .line 79
    .line 80
    sget-object v1, La/zuf0;->e2:La/gne0;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    sget-object v1, La/zuf0;->g2:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    const-string v5, "AUTH_OFFER_DIALOG_TAG"

    .line 96
    .line 97
    invoke-virtual {v1, v5}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    const-string v6, "GREETING_KZ_DIALOG_TAG"

    .line 106
    .line 107
    invoke-virtual {v5, v6}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    iget-object v7, p0, La/u6b0;->L1:La/poq0;

    .line 116
    .line 117
    if-eqz v7, :cond_9

    .line 118
    .line 119
    const-string v7, "TipsDialogTag"

    .line 120
    .line 121
    invoke-virtual {v6, v7}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    if-nez v0, :cond_2

    .line 130
    .line 131
    if-nez v1, :cond_2

    .line 132
    .line 133
    if-nez v5, :cond_2

    .line 134
    .line 135
    if-nez v6, :cond_2

    .line 136
    .line 137
    move v13, v4

    .line 138
    goto :goto_1

    .line 139
    :cond_2
    move v13, v2

    .line 140
    :goto_1
    iget-object v0, v7, La/sbb0;->C0:La/p7m0;

    .line 141
    .line 142
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    move-object v8, v1

    .line 147
    check-cast v8, La/jdb0;

    .line 148
    .line 149
    const/4 v12, 0x0

    .line 150
    const/16 v14, 0xf

    .line 151
    .line 152
    const/4 v9, 0x0

    .line 153
    const/4 v10, 0x0

    .line 154
    const/4 v11, 0x0

    .line 155
    invoke-static/range {v8 .. v14}, La/jdb0;->a(La/jdb0;ZZZZZI)La/jdb0;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-virtual {v0, v1, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_3

    .line 164
    .line 165
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    if-eqz v1, :cond_5

    .line 178
    .line 179
    const-string v5, "REQUEST_SECTION_FROM_WIDGET"

    .line 180
    .line 181
    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    if-nez v5, :cond_4

    .line 186
    .line 187
    const-string v5, "af_consumed"

    .line 188
    .line 189
    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-nez v5, :cond_4

    .line 194
    .line 195
    const-string v5, "REQUEST_WIDGET_SETTINGS"

    .line 196
    .line 197
    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_5

    .line 202
    .line 203
    :cond_4
    move v1, v4

    .line 204
    goto :goto_2

    .line 205
    :cond_5
    move v1, v2

    .line 206
    :goto_2
    sget-object v5, La/csj0;->h:La/c0o;

    .line 207
    .line 208
    invoke-virtual {v5}, La/b3;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    if-eqz v6, :cond_7

    .line 217
    .line 218
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    check-cast v6, La/csj0;

    .line 223
    .line 224
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    invoke-virtual {v6}, La/csj0;->a()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v6

    .line 236
    if-eqz v6, :cond_6

    .line 237
    .line 238
    move v2, v4

    .line 239
    :cond_7
    const-string v4, "PUSH_INTENT"

    .line 240
    .line 241
    invoke-virtual {v0, v4}, Landroid/content/Intent;->hasCategory(Ljava/lang/String;)Z

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    const-string v5, "CUSTOM_INTENT"

    .line 246
    .line 247
    invoke-virtual {v0, v5}, Landroid/content/Intent;->hasCategory(Ljava/lang/String;)Z

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    if-nez v5, :cond_8

    .line 252
    .line 253
    if-nez v1, :cond_8

    .line 254
    .line 255
    if-nez v2, :cond_8

    .line 256
    .line 257
    if-nez v4, :cond_8

    .line 258
    .line 259
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    if-nez v0, :cond_8

    .line 264
    .line 265
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    iget-object v0, p0, La/sbb0;->c:La/vzg0;

    .line 270
    .line 271
    iget-object v1, p0, La/sbb0;->m0:La/sff0;

    .line 272
    .line 273
    iget-object v2, v1, La/sff0;->a:La/gx7;

    .line 274
    .line 275
    iget-boolean v2, v2, La/gx7;->m:Z

    .line 276
    .line 277
    if-eqz v2, :cond_8

    .line 278
    .line 279
    const-string v2, "MIN_AGE_DIALOG_SHOWED"

    .line 280
    .line 281
    invoke-virtual {v0, v2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 286
    .line 287
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-nez v4, :cond_8

    .line 292
    .line 293
    iget-object p0, p0, La/sbb0;->K0:La/p7m0;

    .line 294
    .line 295
    new-instance v4, La/a8b0;

    .line 296
    .line 297
    iget-object v6, v1, La/sff0;->N:La/co4;

    .line 298
    .line 299
    iget v6, v6, La/co4;->n:I

    .line 300
    .line 301
    iget-object v1, v1, La/sff0;->b:La/hl1;

    .line 302
    .line 303
    iget-boolean v1, v1, La/hl1;->b:Z

    .line 304
    .line 305
    invoke-direct {v4, v6, v1}, La/a8b0;-><init>(IZ)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-virtual {p0, v3, v4}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0, v2, v5}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    :cond_8
    return-void

    .line 318
    :cond_9
    const-string p0, "tipsDialogFeature"

    .line 319
    .line 320
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    throw v3

    .line 324
    :cond_a
    const-string p0, "responsibleGameDialogFactory"

    .line 325
    .line 326
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    throw v3
.end method

.method public final g0()V
    .locals 6

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, v0, La/sbb0;->m0:La/sff0;

    .line 9
    .line 10
    iget-boolean v1, v1, La/sff0;->Z0:Z

    .line 11
    .line 12
    const/4 v2, 0x4

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object v1, v0, La/sbb0;->B0:La/p7m0;

    .line 17
    .line 18
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, La/r9b0;

    .line 23
    .line 24
    iget-boolean v1, v1, La/r9b0;->j:Z

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v1, v0, La/sbb0;->k:La/ort;

    .line 30
    .line 31
    invoke-virtual {v1}, La/ort;->a()La/p7m0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v4, La/ebb0;

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    invoke-direct {v4, v0, v3, v5}, La/ebb0;-><init>(La/sbb0;La/yje;B)V

    .line 39
    .line 40
    .line 41
    new-instance v5, La/fnq;

    .line 42
    .line 43
    invoke-direct {v5, v1, v4, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v0, v0, La/sbb0;->q:La/mne;

    .line 51
    .line 52
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 53
    .line 54
    invoke-static {v1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v5, v0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 59
    .line 60
    .line 61
    :cond_1
    :goto_0
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iget-object v0, p0, La/sbb0;->k:La/ort;

    .line 66
    .line 67
    invoke-virtual {v0}, La/ort;->a()La/p7m0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v1, La/ebb0;

    .line 72
    .line 73
    const/4 v4, 0x0

    .line 74
    invoke-direct {v1, p0, v3, v4}, La/ebb0;-><init>(La/sbb0;La/yje;B)V

    .line 75
    .line 76
    .line 77
    new-instance v4, La/fnq;

    .line 78
    .line 79
    invoke-direct {v4, v0, v1, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object v1, p0, La/sbb0;->q:La/mne;

    .line 87
    .line 88
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 89
    .line 90
    invoke-static {v0, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v1, La/ebb0;

    .line 95
    .line 96
    const/4 v2, 0x1

    .line 97
    invoke-direct {v1, p0, v3, v2}, La/ebb0;-><init>(La/sbb0;La/yje;B)V

    .line 98
    .line 99
    .line 100
    invoke-static {v4, v0, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    const-string v0, "ADD_ADDITIONAL_EVENTS_TO_COUPON_DIALOG_REQUEST__KEY"

    .line 5
    .line 6
    invoke-static {p0, v0}, La/vcc;->C(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, La/u6b0;->H0()La/wdk0;

    .line 10
    .line 11
    .line 12
    const-string v0, "request_key_notification_updated"

    .line 13
    .line 14
    invoke-static {p0, v0}, La/vcc;->C(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 21

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super/range {p0 .. p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, La/wma0;

    .line 12
    .line 13
    invoke-virtual/range {p0 .. p0}, La/u6b0;->J0()La/sbb0;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/4 v7, 0x0

    .line 18
    const/16 v8, 0x18

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    const-class v4, La/sbb0;

    .line 22
    .line 23
    const-string v5, "onOneXGamesGameUMResultReceive"

    .line 24
    .line 25
    const-string v6, "onOneXGamesGameUMResultReceive$impl(J)V"

    .line 26
    .line 27
    invoke-direct/range {v1 .. v8}, La/wma0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 28
    .line 29
    .line 30
    new-instance v3, La/cz60;

    .line 31
    .line 32
    invoke-virtual/range {p0 .. p0}, La/u6b0;->J0()La/sbb0;

    .line 33
    .line 34
    .line 35
    move-result-object v11

    .line 36
    const/4 v15, 0x0

    .line 37
    const/16 v16, 0x19

    .line 38
    .line 39
    const/4 v10, 0x0

    .line 40
    const-string v13, "onOneXGamesUMResultReceive"

    .line 41
    .line 42
    const-string v14, "onOneXGamesUMResultReceive$impl()V"

    .line 43
    .line 44
    move-object v9, v3

    .line 45
    move-object v12, v4

    .line 46
    invoke-direct/range {v9 .. v16}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 47
    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    const/16 v5, 0x12

    .line 51
    .line 52
    move-object v2, v1

    .line 53
    move-object/from16 v1, p0

    .line 54
    .line 55
    invoke-static/range {v0 .. v5}, La/o2t;->e(Landroidx/fragment/app/e;La/clz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/bm60;I)V

    .line 56
    .line 57
    .line 58
    new-instance v0, La/lma0;

    .line 59
    .line 60
    const/16 v2, 0x9

    .line 61
    .line 62
    invoke-direct {v0, v1, v2}, La/lma0;-><init>(Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    const-string v2, "FROM_EDIT_COUPON"

    .line 66
    .line 67
    invoke-static {v1, v2, v0}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 68
    .line 69
    .line 70
    iget-object v0, v1, La/u6b0;->P1:La/nh70;

    .line 71
    .line 72
    const/4 v8, 0x0

    .line 73
    if-eqz v0, :cond_1

    .line 74
    .line 75
    invoke-virtual {v1}, La/u6b0;->J0()La/sbb0;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    iget-object v2, v2, La/sbb0;->N:La/iij;

    .line 80
    .line 81
    iget-object v2, v2, La/iij;->i:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, La/ol60;

    .line 84
    .line 85
    new-instance v3, La/qkb0;

    .line 86
    .line 87
    const/4 v9, 0x0

    .line 88
    invoke-direct {v3, v0, v1, v8, v9}, La/qkb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 89
    .line 90
    .line 91
    sget-object v0, La/lkz;->a:La/lkz;

    .line 92
    .line 93
    invoke-static {v1}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    new-instance v5, La/f8b0;

    .line 106
    .line 107
    invoke-direct {v5, v2, v0, v3, v8}, La/f8b0;-><init>(La/gmq;La/clz;La/qkb0;La/yje;)V

    .line 108
    .line 109
    .line 110
    const/4 v10, 0x3

    .line 111
    invoke-static {v4, v8, v8, v5, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, La/u6b0;->I0()La/m9b0;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-object v11, v0, La/m9b0;->j:Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;

    .line 119
    .line 120
    new-instance v0, La/kx2;

    .line 121
    .line 122
    const/4 v6, 0x0

    .line 123
    const/4 v7, 0x5

    .line 124
    const/4 v1, 0x3

    .line 125
    const-class v3, La/u6b0;

    .line 126
    .line 127
    const-string v4, "onSportFilterClick"

    .line 128
    .line 129
    const-string v5, "onSportFilterClick(Lorg/xplatform/uikit_sport/sport_collection/ButtonClickType;Ljava/lang/Long;Ljava/lang/String;)V"

    .line 130
    .line 131
    move-object/from16 v2, p0

    .line 132
    .line 133
    invoke-direct/range {v0 .. v7}, La/kx2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 134
    .line 135
    .line 136
    move-object v1, v2

    .line 137
    invoke-virtual {v11, v0}, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->setOnButtonClickTypeListener(La/xdr;)V

    .line 138
    .line 139
    .line 140
    sget-object v0, La/uql0;->c:La/uql0;

    .line 141
    .line 142
    invoke-virtual {v11, v0}, Lorg/xplatform/uikit_sport/sport_collection/SportsCollectionMain;->setType(La/uql0;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, La/u6b0;->I0()La/m9b0;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    iget-object v0, v0, La/m9b0;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 150
    .line 151
    const/4 v2, 0x1

    .line 152
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 153
    .line 154
    .line 155
    new-instance v2, Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/adapters/special_events/SpecialEventLinearLayoutManager;

    .line 156
    .line 157
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-direct {v2, v3}, Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/adapters/special_events/SpecialEventLinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 165
    .line 166
    .line 167
    iget-object v2, v1, La/u6b0;->d2:La/a8z;

    .line 168
    .line 169
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    check-cast v2, La/rwk0;

    .line 174
    .line 175
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    const v3, 0x7f07072d

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 190
    .line 191
    .line 192
    move-result v12

    .line 193
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 202
    .line 203
    .line 204
    move-result v14

    .line 205
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 214
    .line 215
    .line 216
    move-result v16

    .line 217
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    const v3, 0x7f0704be

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 229
    .line 230
    .line 231
    move-result v13

    .line 232
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 241
    .line 242
    .line 243
    move-result v15

    .line 244
    new-instance v11, La/qmk0;

    .line 245
    .line 246
    const/16 v19, 0x0

    .line 247
    .line 248
    const/16 v20, 0x1c0

    .line 249
    .line 250
    const/16 v17, 0x0

    .line 251
    .line 252
    const/16 v18, 0x0

    .line 253
    .line 254
    invoke-direct/range {v11 .. v20}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1}, La/u6b0;->I0()La/m9b0;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    iget-object v0, v0, La/m9b0;->m:Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;

    .line 265
    .line 266
    new-instance v2, La/k6b0;

    .line 267
    .line 268
    invoke-direct {v2, v1, v9}, La/k6b0;-><init>(La/u6b0;B)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->setOnSearchIconClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1}, La/u6b0;->I0()La/m9b0;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    iget-object v0, v0, La/m9b0;->m:Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;

    .line 279
    .line 280
    new-instance v2, La/k6b0;

    .line 281
    .line 282
    const/4 v3, 0x5

    .line 283
    invoke-direct {v2, v1, v3}, La/k6b0;-><init>(La/u6b0;B)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/popular_navigation_bar/DsNavigationBarPopular;->setOnAmountClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1}, La/u6b0;->I0()La/m9b0;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    iget-object v0, v0, La/m9b0;->d:Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;

    .line 294
    .line 295
    new-instance v2, La/m6b0;

    .line 296
    .line 297
    invoke-direct {v2, v1}, La/m6b0;-><init>(La/u6b0;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->setOnItemClickListener(La/xdr;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1}, La/u6b0;->I0()La/m9b0;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    iget-object v0, v0, La/m9b0;->c:Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;

    .line 308
    .line 309
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;->getAuthorizationButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    sget-object v2, La/ymx;->e:La/ymx;

    .line 314
    .line 315
    new-instance v3, La/l6b0;

    .line 316
    .line 317
    const/4 v4, 0x2

    .line 318
    invoke-direct {v3, v1, v4}, La/l6b0;-><init>(La/u6b0;B)V

    .line 319
    .line 320
    .line 321
    invoke-static {v0, v2, v3}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1}, La/u6b0;->I0()La/m9b0;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    iget-object v0, v0, La/m9b0;->c:Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;

    .line 329
    .line 330
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;->getRegistrationButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    new-instance v3, La/l6b0;

    .line 335
    .line 336
    invoke-direct {v3, v1, v10}, La/l6b0;-><init>(La/u6b0;B)V

    .line 337
    .line 338
    .line 339
    invoke-static {v0, v2, v3}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1}, La/u6b0;->I0()La/m9b0;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    iget-object v0, v0, La/m9b0;->l:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 347
    .line 348
    const v2, 0x7f040ae3

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/tabs/DsTabs;->setBackgroundBubbleIndicatorColor(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1}, La/u6b0;->I0()La/m9b0;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    iget-object v0, v0, La/m9b0;->l:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 359
    .line 360
    new-instance v2, La/l6b0;

    .line 361
    .line 362
    const/4 v3, 0x4

    .line 363
    invoke-direct {v2, v1, v3}, La/l6b0;-><init>(La/u6b0;B)V

    .line 364
    .line 365
    .line 366
    iput-object v2, v0, Lorg/xplatform/uikit/components/tabs/DsTabs;->v:Lkotlin/jvm/functions/Function1;

    .line 367
    .line 368
    invoke-virtual {v1}, La/u6b0;->H0()La/wdk0;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    iget-boolean v2, v1, La/u6b0;->V1:Z

    .line 373
    .line 374
    invoke-static {v0, v1, v2}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 375
    .line 376
    .line 377
    new-instance v0, La/k6b0;

    .line 378
    .line 379
    const/16 v2, 0x8

    .line 380
    .line 381
    invoke-direct {v0, v1, v2}, La/k6b0;-><init>(La/u6b0;B)V

    .line 382
    .line 383
    .line 384
    const-string v3, "ADD_ADDITIONAL_EVENTS_TO_COUPON_DIALOG_REQUEST__KEY"

    .line 385
    .line 386
    invoke-static {v1, v3, v0}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 387
    .line 388
    .line 389
    new-instance v0, La/k6b0;

    .line 390
    .line 391
    const/4 v3, 0x7

    .line 392
    invoke-direct {v0, v1, v3}, La/k6b0;-><init>(La/u6b0;B)V

    .line 393
    .line 394
    .line 395
    const-string v3, "KEY_2FA_ALERT"

    .line 396
    .line 397
    invoke-static {v1, v3, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v1}, La/u6b0;->I0()La/m9b0;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    iget-object v0, v0, La/m9b0;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 405
    .line 406
    iget-object v3, v1, La/u6b0;->c2:La/a8z;

    .line 407
    .line 408
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    check-cast v3, La/ub3;

    .line 413
    .line 414
    invoke-virtual {v0, v3}, Lcom/google/android/material/appbar/AppBarLayout;->a(La/ub3;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v1}, La/u6b0;->J0()La/sbb0;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    iget-object v1, v0, La/sbb0;->f0:La/iqt;

    .line 422
    .line 423
    iget-object v1, v1, La/iqt;->a:La/gst0;

    .line 424
    .line 425
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    if-eqz v1, :cond_0

    .line 430
    .line 431
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 432
    .line 433
    .line 434
    move-result-object v9

    .line 435
    iget-object v1, v0, La/sbb0;->q:La/mne;

    .line 436
    .line 437
    iget-object v12, v1, La/mne;->b:La/dvj;

    .line 438
    .line 439
    new-instance v10, La/gab0;

    .line 440
    .line 441
    const/4 v1, 0x6

    .line 442
    invoke-direct {v10, v0, v1}, La/gab0;-><init>(La/sbb0;B)V

    .line 443
    .line 444
    .line 445
    new-instance v13, La/mab0;

    .line 446
    .line 447
    invoke-direct {v13, v0, v8, v2}, La/mab0;-><init>(La/sbb0;La/yje;B)V

    .line 448
    .line 449
    .line 450
    const/16 v14, 0xa

    .line 451
    .line 452
    const/4 v11, 0x0

    .line 453
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 454
    .line 455
    .line 456
    :cond_0
    return-void

    .line 457
    :cond_1
    const-string v0, "popularSportTabFragmentDelegate"

    .line 458
    .line 459
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    throw v8
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/u6b0;->V1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/u6b0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
