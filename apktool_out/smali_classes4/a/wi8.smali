.class public final La/wi8;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/wi8;",
        "La/iw5;",
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
.field public static final synthetic m2:I


# instance fields
.field public k2:La/fiu0;

.field public final l2:La/a8z;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, La/gj8;

    .line 5
    .line 6
    sget-object v1, La/sre0;->a:La/tre0;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/vi8;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {v1, p0, v2}, La/vi8;-><init>(La/wi8;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/wi8;->l2:La/a8z;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 14

    .line 1
    const v0, -0x4c313c32

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/wi8;->l2:La/a8z;

    .line 8
    .line 9
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/k3t0;

    .line 14
    .line 15
    check-cast v0, La/i3t0;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v3, 0x0

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    sget-object v1, La/ukd;->a:La/cl5;

    .line 33
    .line 34
    if-ne v2, v1, :cond_1

    .line 35
    .line 36
    :cond_0
    new-instance v2, La/vi8;

    .line 37
    .line 38
    invoke-direct {v2, p0, v3}, La/vi8;-><init>(La/wi8;B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    move-object v4, v2

    .line 45
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    const/4 v9, 0x6

    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    move-object v7, p1

    .line 52
    invoke-static/range {v4 .. v9}, La/v3c;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 53
    .line 54
    .line 55
    new-instance v8, La/bw5;

    .line 56
    .line 57
    invoke-static {v3, v7}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    sget-object v10, La/j47;->a:La/ugd;

    .line 62
    .line 63
    new-instance p0, La/v7i0;

    .line 64
    .line 65
    const/16 p1, 0xd

    .line 66
    .line 67
    invoke-direct {p0, v0, p1}, La/v7i0;-><init>(La/l7m0;B)V

    .line 68
    .line 69
    .line 70
    const p1, -0x77ac39c1

    .line 71
    .line 72
    .line 73
    invoke-static {p1, p0, v7}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 74
    .line 75
    .line 76
    move-result-object v12

    .line 77
    const/16 v13, 0xa

    .line 78
    .line 79
    const/4 v11, 0x0

    .line 80
    invoke-direct/range {v8 .. v13}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7, v3}, La/fet;->r(Z)V

    .line 84
    .line 85
    .line 86
    return-object v8
.end method

.method public final V(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/af3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, La/af3;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v1

    .line 24
    :goto_0
    const-class v0, La/hj8;

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/o5d0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, La/ze3;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object p1, v1

    .line 48
    :goto_1
    instance-of v2, p1, La/hj8;

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v1, p1

    .line 54
    :goto_2
    check-cast v1, La/hj8;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v1, p1}, La/hj8;->a(La/i1w0;)La/daf;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, La/daf;->e0()La/fiu0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, La/wi8;->k2:La/fiu0;

    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 74
    .line 75
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final e0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/iw5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 10
    .line 11
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v2, 0x3

    .line 16
    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 20
    .line 21
    if-eqz p0, :cond_3

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_3

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v2, La/ani0;

    .line 34
    .line 35
    invoke-direct {v2, v0}, La/ani0;-><init>(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 39
    .line 40
    const/16 v3, 0x23

    .line 41
    .line 42
    if-lt v0, v3, :cond_0

    .line 43
    .line 44
    new-instance v0, La/bjv0;

    .line 45
    .line 46
    invoke-direct {v0, p0, v2}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/16 v3, 0x1e

    .line 51
    .line 52
    if-lt v0, v3, :cond_1

    .line 53
    .line 54
    new-instance v0, La/ajv0;

    .line 55
    .line 56
    invoke-direct {v0, p0, v2}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    const/16 v3, 0x1a

    .line 61
    .line 62
    if-lt v0, v3, :cond_2

    .line 63
    .line 64
    new-instance v0, La/ziv0;

    .line 65
    .line 66
    invoke-direct {v0, p0, v2}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    new-instance v0, La/yiv0;

    .line 71
    .line 72
    invoke-direct {v0, p0, v2}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 73
    .line 74
    .line 75
    :goto_0
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 76
    .line 77
    invoke-static {}, La/s6t0;->c()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    xor-int/2addr v1, v2

    .line 82
    invoke-virtual {v0, v1}, La/ycm0;->v(Z)V

    .line 83
    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    invoke-virtual {p0, v0}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 87
    .line 88
    .line 89
    :cond_3
    return-void
.end method
