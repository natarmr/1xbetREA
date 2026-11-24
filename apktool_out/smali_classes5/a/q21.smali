.class public final La/q21;
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
        "La/q21;",
        "La/yx5;",
        "La/tah0;",
        "<init>",
        "()V",
        "a/rek0",
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
.field public static final O1:La/rek0;

.field public static final synthetic P1:[La/iiy;


# instance fields
.field public final K1:Z

.field public final L1:La/s0r;

.field public final M1:La/kiu0;

.field public final N1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/q21;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentGridAggregatorSectionBinding;"

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
    sput-object v1, La/q21;->P1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/rek0;

    .line 21
    .line 22
    const/16 v1, 0xf

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/rek0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/q21;->O1:La/rek0;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const v0, 0x7f0d024a

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/q21;->K1:Z

    .line 9
    .line 10
    sget-object v0, La/p21;->a:La/p21;

    .line 11
    .line 12
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, La/q21;->L1:La/s0r;

    .line 17
    .line 18
    new-instance v1, La/f8;

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x6

    .line 22
    const/4 v2, 0x0

    .line 23
    const-class v4, La/q21;

    .line 24
    .line 25
    const-string v5, "requireParentFragment"

    .line 26
    .line 27
    const-string v6, "requireParentFragment()Landroidx/fragment/app/Fragment;"

    .line 28
    .line 29
    move-object v3, p0

    .line 30
    invoke-direct/range {v1 .. v8}, La/f8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 31
    .line 32
    .line 33
    sget-object p0, La/wez;->b:La/wez;

    .line 34
    .line 35
    new-instance v0, La/f80;

    .line 36
    .line 37
    const/4 v2, 0x5

    .line 38
    invoke-direct {v0, v1, v2}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-class v0, La/fho0;

    .line 46
    .line 47
    sget-object v1, La/sre0;->a:La/tre0;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v1, La/k8;

    .line 54
    .line 55
    const/16 v2, 0x1a

    .line 56
    .line 57
    invoke-direct {v1, p0, v2}, La/k8;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    new-instance v2, La/k8;

    .line 61
    .line 62
    const/16 v4, 0x1b

    .line 63
    .line 64
    invoke-direct {v2, p0, v4}, La/k8;-><init>(La/a8z;B)V

    .line 65
    .line 66
    .line 67
    new-instance v4, La/h5;

    .line 68
    .line 69
    const/4 v5, 0x3

    .line 70
    invoke-direct {v4, v3, p0, v5}, La/h5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    invoke-static {v3, v0, v1, v2, v4}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    iput-object p0, v3, La/q21;->M1:La/kiu0;

    .line 78
    .line 79
    new-instance p0, La/nc;

    .line 80
    .line 81
    const/16 v0, 0xf

    .line 82
    .line 83
    invoke-direct {p0, v3, v0}, La/nc;-><init>(Ljava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    invoke-static {p0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    iput-object p0, v3, La/q21;->N1:La/n0o0;

    .line 91
    .line 92
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, La/q21;->G0()La/o0r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/o0r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v0, p0, La/q21;->N1:La/n0o0;

    .line 8
    .line 9
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/o21;

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/q21;->G0()La/o0r;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p1, p1, La/o0r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const v2, 0x7f07072d

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const v2, 0x7f0701bb

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    invoke-static {}, La/cy7;->c()Z

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    sget-object v10, La/iun;->a:La/iun;

    .line 51
    .line 52
    new-instance v3, La/fvl;

    .line 53
    .line 54
    const/4 v7, 0x0

    .line 55
    move v6, v5

    .line 56
    move v8, v4

    .line 57
    invoke-direct/range {v3 .. v10}, La/fvl;-><init>(IIIIIZLjava/util/List;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, La/q21;->G0()La/o0r;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget-object p1, p1, La/o0r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 68
    .line 69
    const/4 v1, 0x1

    .line 70
    invoke-static {p1, v1}, La/knm0;->i(Landroid/view/View;Z)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, La/q21;->G0()La/o0r;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    iget-object p0, p0, La/o0r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 78
    .line 79
    sget-object p1, La/sre0;->a:La/tre0;

    .line 80
    .line 81
    const-class v2, La/w140;

    .line 82
    .line 83
    invoke-virtual {p1, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    const-class v3, La/h140;

    .line 88
    .line 89
    invoke-virtual {p1, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const/4 v3, 0x2

    .line 94
    new-array v3, v3, [La/sgy;

    .line 95
    .line 96
    const/4 v4, 0x0

    .line 97
    aput-object v2, v3, v4

    .line 98
    .line 99
    aput-object p1, v3, v1

    .line 100
    .line 101
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, La/o21;

    .line 110
    .line 111
    invoke-static {p0, p1, v0}, La/dtb;->u(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;La/qv5;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public final D0()V
    .locals 10

    .line 1
    iget-object v0, p0, La/q21;->M1:La/kiu0;

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
    sget-object v1, La/r040;->e:La/r040;

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
    new-instance v2, La/i8;

    .line 18
    .line 19
    iget-object v1, p0, La/q21;->N1:La/n0o0;

    .line 20
    .line 21
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    move-object v4, v1

    .line 26
    check-cast v4, La/o21;

    .line 27
    .line 28
    const/4 v8, 0x4

    .line 29
    const/16 v9, 0xb

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const-class v5, La/o21;

    .line 33
    .line 34
    const-string v6, "setItems"

    .line 35
    .line 36
    const-string v7, "setItems(Ljava/util/List;)V"

    .line 37
    .line 38
    invoke-direct/range {v2 .. v9}, La/i8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

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
    new-instance v3, La/kz;

    .line 48
    .line 49
    check-cast v0, La/utb;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-direct {v3, v0, p0, v2, v4}, La/kz;-><init>(La/utb;La/q21;La/i8;La/yje;)V

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

.method public final G0()La/o0r;
    .locals 2

    .line 1
    sget-object v0, La/q21;->P1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/q21;->L1:La/s0r;

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
    check-cast p0, La/o0r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final p()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, La/q21;->G0()La/o0r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/o0r;->b:Landroidx/recyclerview/widget/RecyclerView;

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
    invoke-virtual {p0}, La/q21;->G0()La/o0r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/o0r;->b:Landroidx/recyclerview/widget/RecyclerView;

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
    iget-boolean p0, p0, La/q21;->K1:Z

    .line 2
    .line 3
    return p0
.end method
