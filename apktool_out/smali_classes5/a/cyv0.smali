.class public final La/cyv0;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/tah0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/cyv0;",
        "La/yx5;",
        "La/tah0;",
        "<init>",
        "()V",
        "a/sxs0",
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
.field public static final O1:La/sxs0;

.field public static final synthetic P1:[La/iiy;


# instance fields
.field public final K1:Z

.field public final L1:La/s0r;

.field public final M1:La/kiu0;

.field public final N1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/cyv0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentXGamesGridSectionMenuBinding;"

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
    sput-object v1, La/cyv0;->P1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/sxs0;

    .line 21
    .line 22
    const/16 v1, 0x12

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/sxs0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/cyv0;->O1:La/sxs0;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const v0, 0x7f0d0309

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/cyv0;->K1:Z

    .line 9
    .line 10
    sget-object v0, La/byv0;->a:La/byv0;

    .line 11
    .line 12
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, La/cyv0;->L1:La/s0r;

    .line 17
    .line 18
    new-instance v1, La/avs0;

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    const/16 v8, 0xd

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const-class v4, La/cyv0;

    .line 25
    .line 26
    const-string v5, "requireParentFragment"

    .line 27
    .line 28
    const-string v6, "requireParentFragment()Landroidx/fragment/app/Fragment;"

    .line 29
    .line 30
    move-object v3, p0

    .line 31
    invoke-direct/range {v1 .. v8}, La/avs0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 32
    .line 33
    .line 34
    sget-object p0, La/wez;->b:La/wez;

    .line 35
    .line 36
    new-instance v0, La/cvs0;

    .line 37
    .line 38
    const/16 v2, 0x1d

    .line 39
    .line 40
    invoke-direct {v0, v1, v2}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-class v1, La/fho0;

    .line 48
    .line 49
    sget-object v4, La/sre0;->a:La/tre0;

    .line 50
    .line 51
    invoke-virtual {v4, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    new-instance v4, La/w6u0;

    .line 56
    .line 57
    const/16 v5, 0x16

    .line 58
    .line 59
    invoke-direct {v4, v0, v5}, La/w6u0;-><init>(La/a8z;B)V

    .line 60
    .line 61
    .line 62
    new-instance v5, La/w6u0;

    .line 63
    .line 64
    const/16 v6, 0x17

    .line 65
    .line 66
    invoke-direct {v5, v0, v6}, La/w6u0;-><init>(La/a8z;B)V

    .line 67
    .line 68
    .line 69
    new-instance v6, La/ywm0;

    .line 70
    .line 71
    invoke-direct {v6, v3, v0, v2}, La/ywm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v1, v4, v5, v6}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, v3, La/cyv0;->M1:La/kiu0;

    .line 79
    .line 80
    new-instance v0, La/jmv0;

    .line 81
    .line 82
    const/16 v1, 0xd

    .line 83
    .line 84
    invoke-direct {v0, v3, v1}, La/jmv0;-><init>(Ljava/lang/Object;B)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    iput-object p0, v3, La/cyv0;->N1:La/a8z;

    .line 92
    .line 93
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/cyv0;->G0()La/r6r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/r6r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La/cyv0;->G0()La/r6r;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p1, p1, La/r6r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, La/cyv0;->G0()La/r6r;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p1, p1, La/r6r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 26
    .line 27
    invoke-static {p1, v0}, La/knm0;->i(Landroid/view/View;Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, La/cyv0;->G0()La/r6r;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p1, p1, La/r6r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const v1, 0x7f07072d

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const v1, 0x7f0701bb

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-static {}, La/cy7;->c()Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    sget-object v9, La/iun;->a:La/iun;

    .line 63
    .line 64
    new-instance v2, La/fvl;

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    move v5, v4

    .line 68
    move v7, v3

    .line 69
    invoke-direct/range {v2 .. v9}, La/fvl;-><init>(IIIIIZLjava/util/List;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, La/cyv0;->G0()La/r6r;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object p1, p1, La/r6r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 80
    .line 81
    iget-object v0, p0, La/cyv0;->N1:La/a8z;

    .line 82
    .line 83
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, La/ayv0;

    .line 88
    .line 89
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, La/cyv0;->G0()La/r6r;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    iget-object p0, p0, La/r6r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 97
    .line 98
    const-class p1, La/w140;

    .line 99
    .line 100
    sget-object v1, La/sre0;->a:La/tre0;

    .line 101
    .line 102
    invoke-virtual {v1, p1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, La/ayv0;

    .line 115
    .line 116
    invoke-static {p0, p1, v0}, La/dtb;->u(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;La/qv5;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public final D0()V
    .locals 10

    .line 1
    iget-object v0, p0, La/cyv0;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/fho0;

    .line 8
    .line 9
    sget-object v1, La/r040;->g:La/r040;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, La/fho0;->y(La/r040;)La/gmq;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, La/lkz;->a:La/lkz;

    .line 16
    .line 17
    new-instance v2, La/k5r0;

    .line 18
    .line 19
    iget-object v1, p0, La/cyv0;->N1:La/a8z;

    .line 20
    .line 21
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    move-object v4, v1

    .line 26
    check-cast v4, La/ayv0;

    .line 27
    .line 28
    const/4 v8, 0x4

    .line 29
    const/16 v9, 0x17

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const-class v5, La/ayv0;

    .line 33
    .line 34
    const-string v6, "setItems"

    .line 35
    .line 36
    const-string v7, "setItems(Ljava/util/List;)V"

    .line 37
    .line 38
    invoke-direct/range {v2 .. v9}, La/k5r0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 42
    .line 43
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v3, La/npu0;

    .line 48
    .line 49
    check-cast v0, La/utb;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-direct {v3, v0, p0, v2, v4}, La/npu0;-><init>(La/utb;La/cyv0;La/k5r0;La/yje;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x3

    .line 56
    invoke-static {v1, v4, v4, v3, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final G0()La/r6r;
    .locals 2

    .line 1
    sget-object v0, La/cyv0;->P1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/cyv0;->L1:La/s0r;

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
    check-cast p0, La/r6r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/cyv0;->G0()La/r6r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/r6r;->b:Landroidx/recyclerview/widget/RecyclerView;

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

.method public final p()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, La/cyv0;->G0()La/r6r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/r6r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->canScrollVertically(I)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final w()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/cyv0;->G0()La/r6r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/r6r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {p0, v0}, La/kcx;->G(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/cyv0;->K1:Z

    .line 2
    .line 3
    return p0
.end method
