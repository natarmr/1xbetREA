.class public final La/jj8;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/ajk;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "La/jj8;",
        "La/nw5;",
        "La/ajk;",
        "<init>",
        "()V",
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
.field public static final synthetic i2:[La/iiy;


# instance fields
.field public e2:La/fiu0;

.field public final f2:La/nae0;

.field public final g2:La/kiu0;

.field public final h2:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/jj8;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/games_section/feature/bonuses_info/impl/databinding/DialogOneXGamesBonusesInfoBinding;"

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
    sput-object v1, La/jj8;->i2:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/ij8;->a:La/ij8;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/jj8;->f2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/vb8;

    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    invoke-direct {v0, p0, v1}, La/vb8;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/p46;

    .line 19
    .line 20
    const/16 v2, 0x1a

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v3, La/p46;

    .line 28
    .line 29
    const/16 v4, 0x1b

    .line 30
    .line 31
    invoke-direct {v3, v1, v4}, La/p46;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-class v2, La/yj8;

    .line 39
    .line 40
    sget-object v3, La/sre0;->a:La/tre0;

    .line 41
    .line 42
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, La/rt6;

    .line 47
    .line 48
    const/16 v4, 0xc

    .line 49
    .line 50
    invoke-direct {v3, v1, v4}, La/rt6;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    new-instance v4, La/rt6;

    .line 54
    .line 55
    const/16 v5, 0xd

    .line 56
    .line 57
    invoke-direct {v4, v1, v5}, La/rt6;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/jj8;->g2:La/kiu0;

    .line 65
    .line 66
    new-instance v0, La/ej8;

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    invoke-direct {v0, v1}, La/ej8;-><init>(B)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, La/jj8;->h2:La/n0o0;

    .line 77
    .line 78
    return-void
.end method


# virtual methods
.method public final B0()I
    .locals 0

    .line 1
    const p0, 0x7f1405a1

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040ae3

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final bridge synthetic L0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/jj8;->T0()La/ajk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final O0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/jj8;->T0()La/ajk;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/ajk;->a:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f08048a

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, La/jj8;->T0()La/ajk;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v1, v1, La/ajk;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    new-instance v2, La/wn8;

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    invoke-direct {v2, v0, v3}, La/wn8;-><init>(Landroid/graphics/drawable/Drawable;B)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, La/jj8;->T0()La/ajk;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v0, v0, La/ajk;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 38
    .line 39
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, La/jj8;->T0()La/ajk;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v0, v0, La/ajk;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 56
    .line 57
    iget-object p0, p0, La/jj8;->h2:La/n0o0;

    .line 58
    .line 59
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, La/ls60;

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public final P0()V
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
    const-class v1, La/hj8;

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
    instance-of v3, v0, La/hj8;

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
    check-cast v2, La/hj8;

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
    invoke-virtual {v2, v0}, La/hj8;->a(La/i1w0;)La/daf;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, La/daf;->e0()La/fiu0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/jj8;->e2:La/fiu0;

    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 71
    .line 72
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0443

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final T0()La/ajk;
    .locals 2

    .line 1
    sget-object v0, La/jj8;->i2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/jj8;->f2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/ajk;

    .line 16
    .line 17
    return-object p0
.end method

.method public final g0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/sik;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/nw5;->M0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, La/nw5;->J0()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/nw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/jj8;->g2:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, La/yj8;

    .line 14
    .line 15
    iget-object v1, p1, La/yj8;->i:La/p7m0;

    .line 16
    .line 17
    new-instance v3, La/yp6;

    .line 18
    .line 19
    const/16 p1, 0xf

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v3, p0, v4, p1}, La/yp6;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 23
    .line 24
    .line 25
    sget-object p1, La/lkz;->a:La/lkz;

    .line 26
    .line 27
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance v0, La/u47;

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    invoke-direct/range {v0 .. v5}, La/u47;-><init>(La/gmq;La/clz;La/yp6;La/yje;B)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x3

    .line 46
    invoke-static {p0, v4, v4, v0, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 47
    .line 48
    .line 49
    return-void
.end method
