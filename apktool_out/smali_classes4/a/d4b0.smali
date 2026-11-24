.class public final La/d4b0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/d4b0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/jh70",
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
.field public static final S1:La/jh70;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public K1:La/wdk0;

.field public final L1:La/a8z;

.field public final M1:La/s0r;

.field public final N1:La/kiu0;

.field public final O1:La/a8z;

.field public P1:La/y3b0;

.field public final Q1:La/yzn0;

.field public final R1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/d4b0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/feed/impl/databinding/FragmentPopularClassicChampsBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "screenType"

    .line 16
    .line 17
    const-string v5, "getScreenType()Lorg/xplatform/feed/presentation/models/PopularClassicChampsScreenType;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/d4b0;->U1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/jh70;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/d4b0;->S1:La/jh70;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const v0, 0x7f0d0288

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/b4b0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/b4b0;-><init>(La/d4b0;B)V

    .line 11
    .line 12
    .line 13
    sget-object v1, La/wez;->b:La/wez;

    .line 14
    .line 15
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, La/d4b0;->L1:La/a8z;

    .line 20
    .line 21
    sget-object v0, La/c4b0;->a:La/c4b0;

    .line 22
    .line 23
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, La/d4b0;->M1:La/s0r;

    .line 28
    .line 29
    new-instance v0, La/b4b0;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {v0, p0, v2}, La/b4b0;-><init>(La/d4b0;B)V

    .line 33
    .line 34
    .line 35
    new-instance v3, La/wz80;

    .line 36
    .line 37
    const/16 v4, 0x17

    .line 38
    .line 39
    invoke-direct {v3, p0, v4}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    new-instance v5, La/wz80;

    .line 43
    .line 44
    const/16 v6, 0x18

    .line 45
    .line 46
    invoke-direct {v5, v3, v6}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const-class v5, La/r4b0;

    .line 54
    .line 55
    sget-object v6, La/sre0;->a:La/tre0;

    .line 56
    .line 57
    invoke-virtual {v6, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    new-instance v6, La/a190;

    .line 62
    .line 63
    const/16 v7, 0x16

    .line 64
    .line 65
    invoke-direct {v6, v3, v7}, La/a190;-><init>(La/a8z;B)V

    .line 66
    .line 67
    .line 68
    new-instance v7, La/a190;

    .line 69
    .line 70
    invoke-direct {v7, v3, v4}, La/a190;-><init>(La/a8z;B)V

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v5, v6, v7, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, La/d4b0;->N1:La/kiu0;

    .line 78
    .line 79
    new-instance v0, La/b4b0;

    .line 80
    .line 81
    const/4 v3, 0x2

    .line 82
    invoke-direct {v0, p0, v3}, La/b4b0;-><init>(La/d4b0;B)V

    .line 83
    .line 84
    .line 85
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p0, La/d4b0;->O1:La/a8z;

    .line 90
    .line 91
    new-instance v0, La/yzn0;

    .line 92
    .line 93
    const-string v1, "SCREEN_TYPE_KEY"

    .line 94
    .line 95
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, La/d4b0;->Q1:La/yzn0;

    .line 99
    .line 100
    iput-boolean v2, p0, La/d4b0;->R1:Z

    .line 101
    .line 102
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, La/d4b0;->I0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p0}, La/d4b0;->H0()La/v2r;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/v2r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {p0 .. p0}, La/d4b0;->G0()La/a4b0;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const v4, 0x7f0706e0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const v4, 0x7f070717

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    const v5, 0x7f07072d

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    const v9, 0x7f05000f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-eqz v8, :cond_0

    .line 86
    .line 87
    const v5, 0x7f070712

    .line 88
    .line 89
    .line 90
    :cond_0
    invoke-virtual {v7, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    const v8, 0x7f0700a8

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    int-to-float v15, v5

    .line 106
    new-instance v5, La/qmk0;

    .line 107
    .line 108
    const/4 v13, 0x0

    .line 109
    const/16 v14, 0x1d4

    .line 110
    .line 111
    const/4 v8, 0x0

    .line 112
    const/4 v10, 0x0

    .line 113
    const/4 v11, 0x1

    .line 114
    const/4 v12, 0x0

    .line 115
    move v9, v7

    .line 116
    invoke-direct/range {v5 .. v14}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 120
    .line 121
    .line 122
    sget-object v5, La/j5d;->a:Landroid/util/TypedValue;

    .line 123
    .line 124
    const v5, 0x7f040ae6

    .line 125
    .line 126
    .line 127
    const/4 v6, 0x0

    .line 128
    invoke-static {v2, v5, v6}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    new-instance v7, La/y3b0;

    .line 133
    .line 134
    move v9, v15

    .line 135
    new-instance v15, La/kma0;

    .line 136
    .line 137
    const/16 v2, 0xb

    .line 138
    .line 139
    invoke-direct {v15, v2}, La/kma0;-><init>(B)V

    .line 140
    .line 141
    .line 142
    new-instance v2, La/kma0;

    .line 143
    .line 144
    const/16 v5, 0xc

    .line 145
    .line 146
    invoke-direct {v2, v5}, La/kma0;-><init>(B)V

    .line 147
    .line 148
    .line 149
    move v12, v3

    .line 150
    move v13, v3

    .line 151
    move v14, v4

    .line 152
    move-object/from16 v16, v2

    .line 153
    .line 154
    move v11, v3

    .line 155
    move v10, v4

    .line 156
    invoke-direct/range {v7 .. v16}, La/y3b0;-><init>(IFIIIIILa/kma0;La/kma0;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 160
    .line 161
    .line 162
    move-object/from16 v2, p0

    .line 163
    .line 164
    iput-object v7, v2, La/d4b0;->P1:La/y3b0;

    .line 165
    .line 166
    invoke-static {v0, v1, v1}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method public final C0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/d4b0;->L1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/toi;

    .line 8
    .line 9
    iget-object v0, v0, La/toi;->a:La/wdk0;

    .line 10
    .line 11
    iput-object v0, p0, La/d4b0;->K1:La/wdk0;

    .line 12
    .line 13
    return-void
.end method

.method public final D0()V
    .locals 11

    .line 1
    iget-object v8, p0, La/d4b0;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v8}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/r4b0;

    .line 8
    .line 9
    iget-object v1, v0, La/r4b0;->u:La/p7m0;

    .line 10
    .line 11
    new-instance v3, La/o4b0;

    .line 12
    .line 13
    const/4 v9, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-direct {v3, v0, v9, v4}, La/o4b0;-><init>(La/r4b0;La/yje;B)V

    .line 16
    .line 17
    .line 18
    new-instance v5, La/fnq;

    .line 19
    .line 20
    const/4 v6, 0x4

    .line 21
    invoke-direct {v5, v1, v3, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 22
    .line 23
    .line 24
    new-instance v1, La/d7a0;

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    invoke-direct {v1, v0, v9, v3}, La/d7a0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 28
    .line 29
    .line 30
    new-instance v3, La/fnq;

    .line 31
    .line 32
    invoke-direct {v3, v5, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, La/gbv;

    .line 36
    .line 37
    const/16 v5, 0x14

    .line 38
    .line 39
    invoke-direct {v1, v0, v9, v5}, La/gbv;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 40
    .line 41
    .line 42
    new-instance v10, La/dnq;

    .line 43
    .line 44
    invoke-direct {v10, v3, v1, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 45
    .line 46
    .line 47
    sget-object v0, La/lkz;->a:La/lkz;

    .line 48
    .line 49
    new-instance v0, La/hi70;

    .line 50
    .line 51
    const/16 v7, 0x1a

    .line 52
    .line 53
    const/4 v1, 0x2

    .line 54
    const-class v3, La/d4b0;

    .line 55
    .line 56
    const-string v4, "handleScreenUiState"

    .line 57
    .line 58
    const-string v5, "handleScreenUiState(Lorg/xplatform/feed/popularclassic/champs/PopularClassicChampsViewModel$ScreenUiState;)V"

    .line 59
    .line 60
    move-object v2, p0

    .line 61
    invoke-direct/range {v0 .. v7}, La/hi70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    new-instance v4, La/fra0;

    .line 77
    .line 78
    invoke-direct {v4, v10, v1, v0, v9}, La/fra0;-><init>(La/dnq;La/clz;La/hi70;La/yje;)V

    .line 79
    .line 80
    .line 81
    const/4 v10, 0x3

    .line 82
    invoke-static {v2, v9, v9, v4, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v8}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, La/r4b0;

    .line 90
    .line 91
    iget-object v8, v0, La/r4b0;->t:La/ol60;

    .line 92
    .line 93
    new-instance v0, La/hi70;

    .line 94
    .line 95
    const/16 v7, 0x1b

    .line 96
    .line 97
    const/4 v1, 0x2

    .line 98
    const-string v4, "handleActionUiState"

    .line 99
    .line 100
    const-string v5, "handleActionUiState(Lorg/xplatform/feed/popularclassic/champs/PopularClassicChampsViewModel$ActionUiState;)V"

    .line 101
    .line 102
    move-object v2, p0

    .line 103
    invoke-direct/range {v0 .. v7}, La/hi70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 104
    .line 105
    .line 106
    sget-object v1, La/lkz;->a:La/lkz;

    .line 107
    .line 108
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    new-instance v3, La/fra0;

    .line 121
    .line 122
    invoke-direct {v3, v8, v1, v0, v9}, La/fra0;-><init>(La/gmq;La/clz;La/hi70;La/yje;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v2, v9, v9, v3, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public final G0()La/a4b0;
    .locals 0

    .line 1
    iget-object p0, p0, La/d4b0;->O1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/a4b0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final H0()La/v2r;
    .locals 2

    .line 1
    sget-object v0, La/d4b0;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/d4b0;->M1:La/s0r;

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
    check-cast p0, La/v2r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/d4b0;->H0()La/v2r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/v2r;->d:La/ewe;

    .line 6
    .line 7
    iget-object p0, p0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 8
    .line 9
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 10
    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/d4b0;->H0()La/v2r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/v2r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, La/yx5;->Z()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/d4b0;->R1:Z

    .line 2
    .line 3
    return p0
.end method
