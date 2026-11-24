.class public final La/ce00;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ce00;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/wsz",
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
.field public static final P1:La/wsz;

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
    const-class v1, La/ce00;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentListLineItemsBinding;"

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
    sput-object v1, La/ce00;->Q1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/wsz;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/ce00;->P1:La/wsz;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const v0, 0x7f0d025b

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/ce00;->K1:Z

    .line 9
    .line 10
    sget-object v1, La/yd00;->a:La/yd00;

    .line 11
    .line 12
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, La/ce00;->L1:La/s0r;

    .line 17
    .line 18
    new-instance v1, La/xd00;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, p0, v2}, La/xd00;-><init>(La/ce00;B)V

    .line 22
    .line 23
    .line 24
    sget-object v3, La/wez;->b:La/wez;

    .line 25
    .line 26
    invoke-static {v3, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput-object v1, p0, La/ce00;->M1:La/a8z;

    .line 31
    .line 32
    new-instance v1, La/xd00;

    .line 33
    .line 34
    invoke-direct {v1, p0, v0}, La/xd00;-><init>(La/ce00;B)V

    .line 35
    .line 36
    .line 37
    new-instance v4, La/be00;

    .line 38
    .line 39
    invoke-direct {v4, v1, v2}, La/be00;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    new-instance v1, La/be00;

    .line 43
    .line 44
    invoke-direct {v1, p0, v0}, La/be00;-><init>(Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    new-instance v0, La/be00;

    .line 48
    .line 49
    const/4 v2, 0x2

    .line 50
    invoke-direct {v0, v1, v2}, La/be00;-><init>(Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {v3, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-class v1, La/ef00;

    .line 58
    .line 59
    sget-object v5, La/sre0;->a:La/tre0;

    .line 60
    .line 61
    invoke-virtual {v5, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    new-instance v5, La/qwv;

    .line 66
    .line 67
    const/16 v6, 0x18

    .line 68
    .line 69
    invoke-direct {v5, v0, v6}, La/qwv;-><init>(La/a8z;B)V

    .line 70
    .line 71
    .line 72
    new-instance v6, La/qwv;

    .line 73
    .line 74
    const/16 v7, 0x19

    .line 75
    .line 76
    invoke-direct {v6, v0, v7}, La/qwv;-><init>(La/a8z;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0, v1, v5, v6, v4}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, La/ce00;->N1:La/kiu0;

    .line 84
    .line 85
    new-instance v0, La/xd00;

    .line 86
    .line 87
    invoke-direct {v0, p0, v2}, La/xd00;-><init>(La/ce00;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {v3, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iput-object v0, p0, La/ce00;->O1:La/a8z;

    .line 95
    .line 96
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/wd00;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, La/wd00;-><init>(La/ce00;B)V

    .line 9
    .line 10
    .line 11
    const-string v1, ""

    .line 12
    .line 13
    invoke-static {p1, p0, v1, v0}, La/o2t;->d(Landroidx/fragment/app/e;La/clz;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/ce00;->G0()La/d1r;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/d1r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, La/ce00;->G0()La/d1r;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object p1, p1, La/d1r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, La/ce00;->G0()La/d1r;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object p1, p1, La/d1r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const v2, 0x7f07072d

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const v3, 0x7f0701bb

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    new-instance v3, La/gvl;

    .line 65
    .line 66
    const/4 v4, 0x2

    .line 67
    invoke-direct {v3, v1, v2, v2, v4}, La/gvl;-><init>(IIIB)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, La/ce00;->G0()La/d1r;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object p1, p1, La/d1r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 78
    .line 79
    invoke-static {p1, v0}, La/knm0;->i(Landroid/view/View;Z)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, La/ce00;->G0()La/d1r;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iget-object p1, p1, La/d1r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 87
    .line 88
    iget-object p0, p0, La/ce00;->O1:La/a8z;

    .line 89
    .line 90
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, La/vd00;

    .line 95
    .line 96
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/ce00;->H0()La/ef00;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/ef00;->v0:La/p7m0;

    .line 6
    .line 7
    iget-object v2, v0, La/ef00;->d0:La/hqx;

    .line 8
    .line 9
    invoke-virtual {v2}, La/hqx;->a()La/p7m0;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, v0, La/ef00;->e0:La/pzt;

    .line 14
    .line 15
    invoke-virtual {v3}, La/pzt;->a()La/h2c;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    new-instance v4, La/xo1;

    .line 20
    .line 21
    const/4 v5, 0x4

    .line 22
    const/4 v6, 0x0

    .line 23
    invoke-direct {v4, v0, v6, v5}, La/xo1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2, v3, v4}, La/dub;->f0(La/gmq;La/gmq;La/gmq;La/ydr;)La/a1g;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, La/ae00;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v1, p0, v6, v2}, La/ae00;-><init>(La/ce00;La/yje;B)V

    .line 34
    .line 35
    .line 36
    sget-object v2, La/lkz;->a:La/lkz;

    .line 37
    .line 38
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    new-instance v4, La/c6y;

    .line 51
    .line 52
    invoke-direct {v4, v0, v2, v1, v6}, La/c6y;-><init>(La/a1g;La/clz;La/ae00;La/yje;)V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x3

    .line 56
    invoke-static {v3, v6, v6, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, La/ce00;->H0()La/ef00;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget-object v1, v1, La/ef00;->w0:La/p7m0;

    .line 64
    .line 65
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    new-instance v2, La/ae00;

    .line 70
    .line 71
    const/4 v3, 0x1

    .line 72
    invoke-direct {v2, p0, v6, v3}, La/ae00;-><init>(La/ce00;La/yje;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    new-instance v5, La/zd00;

    .line 88
    .line 89
    invoke-direct {v5, v1, v3, v2, v6}, La/zd00;-><init>(La/xae0;La/clz;La/ae00;La/yje;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v4, v6, v6, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, La/ce00;->H0()La/ef00;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget-object v1, v1, La/ef00;->x0:La/ol60;

    .line 100
    .line 101
    new-instance v2, La/ae00;

    .line 102
    .line 103
    const/4 v3, 0x2

    .line 104
    invoke-direct {v2, p0, v6, v3}, La/ae00;-><init>(La/ce00;La/yje;B)V

    .line 105
    .line 106
    .line 107
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    new-instance v4, La/zd00;

    .line 120
    .line 121
    invoke-direct {v4, v1, p0, v2, v6}, La/zd00;-><init>(La/gmq;La/clz;La/ae00;La/yje;)V

    .line 122
    .line 123
    .line 124
    invoke-static {v3, v6, v6, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final G0()La/d1r;
    .locals 2

    .line 1
    sget-object v0, La/ce00;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ce00;->L1:La/s0r;

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
    check-cast p0, La/d1r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/ef00;
    .locals 0

    .line 1
    iget-object p0, p0, La/ce00;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ef00;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, La/viq;

    .line 9
    .line 10
    const/16 v1, 0x10

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, La/viq;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    const-string v1, "UPDATED_BALANCE_KEY"

    .line 16
    .line 17
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final Z()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, La/o2t;->a(Landroidx/fragment/app/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final e0()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ce00;->H0()La/ef00;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, La/ef00;->y()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/ce00;->K1:Z

    .line 2
    .line 3
    return p0
.end method
