.class public final La/s5p;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/s5p;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/nek",
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
.field public static final P1:La/nek;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:Z

.field public final L1:La/s0r;

.field public final M1:La/a8z;

.field public final N1:La/kiu0;

.field public final O1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/s5p;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/favorites/impl/databinding/FragmentFavoriteChampsBinding;"

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
    sput-object v1, La/s5p;->Q1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/nek;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/s5p;->P1:La/nek;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d0233

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/s5p;->K1:Z

    .line 9
    .line 10
    sget-object v1, La/q5p;->a:La/q5p;

    .line 11
    .line 12
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, La/s5p;->L1:La/s0r;

    .line 17
    .line 18
    new-instance v1, La/p5p;

    .line 19
    .line 20
    invoke-direct {v1, p0, v0}, La/p5p;-><init>(La/s5p;B)V

    .line 21
    .line 22
    .line 23
    sget-object v0, La/wez;->b:La/wez;

    .line 24
    .line 25
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, p0, La/s5p;->M1:La/a8z;

    .line 30
    .line 31
    new-instance v1, La/p5p;

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    invoke-direct {v1, p0, v2}, La/p5p;-><init>(La/s5p;B)V

    .line 35
    .line 36
    .line 37
    new-instance v2, La/jfl;

    .line 38
    .line 39
    const/16 v3, 0xa

    .line 40
    .line 41
    invoke-direct {v2, v1, v3}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    new-instance v1, La/jfl;

    .line 45
    .line 46
    const/16 v3, 0xb

    .line 47
    .line 48
    invoke-direct {v1, p0, v3}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    new-instance v3, La/jfl;

    .line 52
    .line 53
    const/16 v4, 0xc

    .line 54
    .line 55
    invoke-direct {v3, v1, v4}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const-class v3, La/k6p;

    .line 63
    .line 64
    sget-object v4, La/sre0;->a:La/tre0;

    .line 65
    .line 66
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    new-instance v4, La/b9k;

    .line 71
    .line 72
    const/16 v5, 0x1c

    .line 73
    .line 74
    invoke-direct {v4, v1, v5}, La/b9k;-><init>(La/a8z;B)V

    .line 75
    .line 76
    .line 77
    new-instance v5, La/b9k;

    .line 78
    .line 79
    const/16 v6, 0x1d

    .line 80
    .line 81
    invoke-direct {v5, v1, v6}, La/b9k;-><init>(La/a8z;B)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0, v3, v4, v5, v2}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, p0, La/s5p;->N1:La/kiu0;

    .line 89
    .line 90
    new-instance v1, La/p5p;

    .line 91
    .line 92
    const/4 v2, 0x3

    .line 93
    invoke-direct {v1, p0, v2}, La/p5p;-><init>(La/s5p;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iput-object v0, p0, La/s5p;->O1:La/a8z;

    .line 101
    .line 102
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/cad;

    .line 6
    .line 7
    const/16 v1, 0x15

    .line 8
    .line 9
    invoke-direct {v0, p0, v1}, La/cad;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    sget-object v1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-static {p1, v0}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/s5p;->G0()La/xzq;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p1, p1, La/xzq;->c:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 22
    .line 23
    new-instance v0, La/p5p;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p0, v1}, La/p5p;-><init>(La/s5p;B)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, La/s5p;->G0()La/xzq;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p1, p1, La/xzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, La/s5p;->G0()La/xzq;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object p1, p1, La/xzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 55
    .line 56
    iget-object v0, p0, La/s5p;->O1:La/a8z;

    .line 57
    .line 58
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, La/o5p;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, La/s5p;->G0()La/xzq;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object p1, p1, La/xzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 72
    .line 73
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const v1, 0x7f07072d

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const v1, 0x7f0706f8

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const v1, 0x7f070712

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const v1, 0x7f0704be

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    new-instance v2, La/qmk0;

    .line 126
    .line 127
    const/4 v10, 0x0

    .line 128
    const/16 v11, 0x1c0

    .line 129
    .line 130
    const/4 v8, 0x1

    .line 131
    const/4 v9, 0x0

    .line 132
    invoke-direct/range {v2 .. v11}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public final C0()V
    .locals 0

    .line 1
    iget-object p0, p0, La/s5p;->M1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/igi;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    iget-object v0, p0, La/s5p;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/k6p;

    .line 8
    .line 9
    iget-object v2, v1, La/k6p;->u:La/p7m0;

    .line 10
    .line 11
    new-instance v3, La/g6p;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    invoke-direct {v3, v1, v4, v5}, La/g6p;-><init>(La/k6p;La/yje;B)V

    .line 16
    .line 17
    .line 18
    new-instance v6, La/fnq;

    .line 19
    .line 20
    invoke-direct {v6, v2, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, La/e00;

    .line 24
    .line 25
    const/16 v3, 0x1c

    .line 26
    .line 27
    invoke-direct {v2, v1, v4, v3}, La/e00;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 28
    .line 29
    .line 30
    new-instance v1, La/dnq;

    .line 31
    .line 32
    invoke-direct {v1, v6, v2, v5}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 33
    .line 34
    .line 35
    new-instance v2, La/r5p;

    .line 36
    .line 37
    invoke-direct {v2, p0, v4, v5}, La/r5p;-><init>(La/s5p;La/yje;B)V

    .line 38
    .line 39
    .line 40
    sget-object v3, La/lkz;->a:La/lkz;

    .line 41
    .line 42
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    new-instance v6, La/ofl;

    .line 55
    .line 56
    invoke-direct {v6, v1, v3, v2, v4}, La/ofl;-><init>(La/dnq;La/clz;La/r5p;La/yje;)V

    .line 57
    .line 58
    .line 59
    const/4 v1, 0x3

    .line 60
    invoke-static {v5, v4, v4, v6, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, La/k6p;

    .line 68
    .line 69
    iget-object v0, v0, La/k6p;->t:La/ol60;

    .line 70
    .line 71
    new-instance v2, La/r5p;

    .line 72
    .line 73
    const/4 v3, 0x1

    .line 74
    invoke-direct {v2, p0, v4, v3}, La/r5p;-><init>(La/s5p;La/yje;B)V

    .line 75
    .line 76
    .line 77
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    new-instance v5, La/ofl;

    .line 90
    .line 91
    invoke-direct {v5, v0, p0, v2, v4}, La/ofl;-><init>(La/gmq;La/clz;La/r5p;La/yje;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v3, v4, v4, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public final G0()La/xzq;
    .locals 2

    .line 1
    sget-object v0, La/s5p;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/s5p;->L1:La/s0r;

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
    check-cast p0, La/xzq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/s5p;->K1:Z

    .line 2
    .line 3
    return p0
.end method
