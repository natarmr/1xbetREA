.class public final Lorg/xplatform/client1/features/appactivity/ApplicationActivity;
.super La/yc3;
.source "SourceFile"

# interfaces
.implements La/jhg0;
.implements La/rn;
.implements La/da50;
.implements La/evv0;
.implements La/jkf0;
.implements La/wjk;
.implements La/wfx;


# static fields
.field public static final synthetic F1:I


# instance fields
.field public A1:La/ndk0;

.field public B:La/hsv0;

.field public B1:La/ndk0;

.field public C1:La/ndk0;

.field public D1:La/ndk0;

.field public E1:Ljava/lang/Integer;

.field public Y:La/fwv0;

.field public Z:La/ba50;

.field public f1:La/vfx;

.field public g1:La/fwk;

.field public h1:La/z7z;

.field public i1:La/z7z;

.field public j1:La/z7z;

.field public k1:La/z7z;

.field public l1:La/z7z;

.field public m1:La/z7z;

.field public n1:La/z7z;

.field public o1:La/z7z;

.field public p1:La/z7z;

.field public q1:La/z7z;

.field public r1:La/z7z;

.field public s1:La/z7z;

.field public t1:La/z7z;

.field public final u1:La/a8z;

.field public v1:La/gku0;

.field public final w1:La/kiu0;

.field public final x1:La/a8z;

.field public y1:Ljava/lang/Integer;

.field public z1:La/md3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/hd3;->a:La/gd3;

    .line 2
    .line 3
    sget v0, La/o4u0;->a:I

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    invoke-direct {p0}, La/yc3;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/wez;->b:La/wez;

    .line 5
    .line 6
    new-instance v1, La/xr3;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, p0, v2}, La/xr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->u1:La/a8z;

    .line 17
    .line 18
    new-instance v1, La/kr3;

    .line 19
    .line 20
    const/16 v3, 0x8

    .line 21
    .line 22
    invoke-direct {v1, p0, v3}, La/kr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V

    .line 23
    .line 24
    .line 25
    new-instance v3, La/kiu0;

    .line 26
    .line 27
    const-class v4, La/zu3;

    .line 28
    .line 29
    sget-object v5, La/sre0;->a:La/tre0;

    .line 30
    .line 31
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    new-instance v5, La/xr3;

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    invoke-direct {v5, p0, v6}, La/xr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V

    .line 39
    .line 40
    .line 41
    new-instance v6, La/xr3;

    .line 42
    .line 43
    const/4 v7, 0x2

    .line 44
    invoke-direct {v6, p0, v7}, La/xr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v3, v4, v5, v1, v6}, La/kiu0;-><init>(La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 48
    .line 49
    .line 50
    iput-object v3, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->w1:La/kiu0;

    .line 51
    .line 52
    new-instance v1, La/kr3;

    .line 53
    .line 54
    invoke-direct {v1, p0, v2}, La/kr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->x1:La/a8z;

    .line 62
    .line 63
    return-void
.end method

.method public static D(Landroidx/fragment/app/Fragment;)Landroid/view/View;
    .locals 2

    .line 1
    instance-of v0, p0, La/sik;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p0, La/sik;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p0, v1

    .line 10
    :goto_0
    if-eqz p0, :cond_3

    .line 11
    .line 12
    instance-of v0, p0, La/by5;

    .line 13
    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    instance-of v0, p0, La/i620;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object p0, v1

    .line 22
    :cond_2
    :goto_1
    if-eqz p0, :cond_3

    .line 23
    .line 24
    invoke-virtual {p0}, La/sik;->A0()Landroid/app/Dialog;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eqz p0, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_3
    return-object v1
.end method

.method public static final y(Landroid/view/View;La/jie0;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;)V
    .locals 3

    .line 1
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-static {p0}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, v0, La/xiv0;->a:La/uiv0;

    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    invoke-virtual {v0, v1}, La/uiv0;->u(I)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {v0, v1}, La/uiv0;->i(I)La/pfx;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget v0, v0, La/pfx;->d:I

    .line 23
    .line 24
    int-to-float v0, v0

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    cmpl-float v1, v0, v1

    .line 29
    .line 30
    if-lez v1, :cond_1

    .line 31
    .line 32
    iput v0, p1, La/jie0;->a:F

    .line 33
    .line 34
    :cond_1
    invoke-static {p0, p1, p2, v2, v0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->z(Landroid/view/View;La/jie0;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;ZF)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static final z(Landroid/view/View;La/jie0;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;ZF)V
    .locals 7

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    new-instance v5, La/sly;

    .line 13
    .line 14
    iget p1, p1, La/jie0;->a:F

    .line 15
    .line 16
    invoke-direct {v5, p4, p1, p0}, La/sly;-><init>(FFZ)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B()La/fwk;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-object p0, p0, La/fwk;->a:La/shk;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, La/shk;->a:La/p7m0;

    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    move-object v0, p1

    .line 35
    check-cast v0, La/ahk;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    const/16 v6, 0x2f

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-static/range {v0 .. v6}, La/ahk;->a(La/ahk;Landroid/content/res/Configuration;La/z6k;La/erq;La/t9o0;La/sly;I)La/ahk;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p0, p1, p2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_1

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 10

    .line 1
    iget-object v0, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->A1:La/ndk0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->E1:Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->E()La/z7z;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-object v1, v0

    .line 30
    check-cast v1, La/wdk0;

    .line 31
    .line 32
    new-instance v2, La/xdk0;

    .line 33
    .line 34
    sget-object v3, La/pek0;->a:La/pek0;

    .line 35
    .line 36
    const v0, 0x7f130e13

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    const v0, 0x7f130e11

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    sget-object v7, La/rv00;->B:La/rv00;

    .line 57
    .line 58
    const/4 v8, 0x0

    .line 59
    const/16 v9, 0x68

    .line 60
    .line 61
    const/4 v6, 0x0

    .line 62
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 63
    .line 64
    .line 65
    const/16 v9, 0x6c

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    const/4 v5, 0x0

    .line 69
    const/4 v6, 0x0

    .line 70
    const/4 v7, 0x0

    .line 71
    move-object v3, p0

    .line 72
    invoke-static/range {v1 .. v9}, La/wdk0;->j(La/wdk0;La/xdk0;La/kxq;Landroid/view/View;Lkotlin/jvm/functions/Function0;ZZLjava/lang/Integer;I)La/ndk0;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    iput-object p0, v3, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->A1:La/ndk0;

    .line 77
    .line 78
    return-void
.end method

.method public final B()La/fwk;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->g1:La/fwk;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "displayStateTracker"

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

.method public final C()La/sn;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->u1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/sn;

    .line 8
    .line 9
    return-object p0
.end method

.method public final E()La/z7z;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->k1:La/z7z;

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

.method public final F()La/zu3;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->w1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/zu3;

    .line 8
    .line 9
    return-object p0
.end method

.method public final G()La/hsv0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B:La/hsv0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "xBottomSheetBackStack"

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

.method public final H(La/ndk0;)La/ndk0;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->E()La/z7z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, La/wdk0;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, La/ndk0;->b()Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-interface {p1}, La/ndk0;->c()La/rrm;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, La/g46;->b()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-nez v1, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, La/ndk0;

    .line 43
    .line 44
    iget-object v0, v0, La/wdk0;->e:Ljava/util/Set;

    .line 45
    .line 46
    invoke-interface {p1}, La/ndk0;->c()La/rrm;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    invoke-interface {p1}, La/ndk0;->dismiss()V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_2
    :goto_1
    return-object p1
.end method

.method public final I(Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->A1:La/ndk0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, La/ndk0;->c()La/rrm;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, La/g46;->b()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ne v0, v2, :cond_0

    .line 16
    .line 17
    move v0, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v1

    .line 20
    :goto_0
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object v4, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->E1:Ljava/lang/Integer;

    .line 25
    .line 26
    if-nez v4, :cond_1

    .line 27
    .line 28
    :goto_1
    move p0, v2

    .line 29
    goto :goto_3

    .line 30
    :cond_1
    if-nez p1, :cond_3

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eq v4, p0, :cond_3

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    :goto_2
    move p0, v1

    .line 47
    :goto_3
    iget-object v4, v3, La/zu3;->h0:La/ol60;

    .line 48
    .line 49
    iget-object v5, v3, La/zu3;->J:La/z7z;

    .line 50
    .line 51
    invoke-interface {v5}, La/z7z;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    check-cast v5, La/pru;

    .line 56
    .line 57
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    iget-boolean v5, v5, La/sff0;->G1:Z

    .line 62
    .line 63
    if-eqz v5, :cond_4

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_4
    if-eqz v0, :cond_5

    .line 67
    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    move v1, v2

    .line 71
    :cond_5
    iget-object p1, v3, La/zu3;->v:La/z7z;

    .line 72
    .line 73
    invoke-interface {p1}, La/z7z;->get()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, La/m1e;

    .line 78
    .line 79
    invoke-interface {p1}, La/m1e;->c()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_6

    .line 84
    .line 85
    sget-object p0, La/ct3;->a:La/ct3;

    .line 86
    .line 87
    invoke-virtual {v4, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_6
    if-eqz v1, :cond_8

    .line 92
    .line 93
    if-eqz p0, :cond_7

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_7
    :goto_4
    return-void

    .line 97
    :cond_8
    :goto_5
    sget-object p0, La/lt3;->a:La/lt3;

    .line 98
    .line 99
    invoke-virtual {v4, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final getRouter()La/i1w0;
    .locals 0

    .line 1
    sget-object p0, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 2
    .line 3
    invoke-static {}, La/xf0;->N()Lorg/platform/app/ApplicationLoader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Lorg/platform/app/ApplicationLoader;->z:La/ejc;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, La/ejc;->a:La/i1w0;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "cicerone"

    .line 15
    .line 16
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-super {p0, p1}, La/yc3;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1, p1, v2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B()La/fwk;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1, p1}, La/fwk;->a(Landroid/content/res/Configuration;)V

    .line 44
    .line 45
    .line 46
    if-nez v0, :cond_0

    .line 47
    .line 48
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v0}, La/u7x;->u(Landroid/content/Context;Ljava/util/Locale;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 21

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, La/blx;->d(Landroid/content/Intent;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v2}, Lcom/appsflyer/AppsFlyerLib;->collectDataFromLauncherActivity(Landroid/app/Activity;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v8, 0x0

    .line 25
    invoke-static {v0, v8}, La/bcm0;->x(Landroid/view/Window;Z)V

    .line 26
    .line 27
    .line 28
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 29
    .line 30
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 31
    .line 32
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    invoke-static {v3, v4}, La/fbc;->U(J)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    invoke-static {v3, v4}, La/fbc;->U(J)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    new-instance v3, La/or3;

    .line 49
    .line 50
    invoke-direct {v3, v8}, La/or3;-><init>(B)V

    .line 51
    .line 52
    .line 53
    new-instance v4, La/c9o0;

    .line 54
    .line 55
    invoke-direct {v4, v1, v0, v3}, La/c9o0;-><init>(IILkotlin/jvm/functions/Function1;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v4, v4}, La/mjn;->a(La/agd;La/c9o0;La/c9o0;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const/4 v9, 0x0

    .line 69
    const v1, 0x7f040b20

    .line 70
    .line 71
    .line 72
    const/4 v10, 0x1

    .line 73
    invoke-static {v0, v9, v1, v1, v10}, La/ofm0;->z(Landroid/view/Window;Landroid/content/Context;III)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    instance-of v3, v0, La/af3;

    .line 84
    .line 85
    if-eqz v3, :cond_0

    .line 86
    .line 87
    check-cast v0, La/af3;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    move-object v0, v9

    .line 91
    :goto_0
    const-class v3, La/yr3;

    .line 92
    .line 93
    if-eqz v0, :cond_1b

    .line 94
    .line 95
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, La/o5d0;

    .line 104
    .line 105
    if-eqz v0, :cond_1

    .line 106
    .line 107
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, La/ze3;

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    move-object v0, v9

    .line 115
    :goto_1
    instance-of v4, v0, La/yr3;

    .line 116
    .line 117
    if-nez v4, :cond_2

    .line 118
    .line 119
    move-object v0, v9

    .line 120
    :cond_2
    check-cast v0, La/yr3;

    .line 121
    .line 122
    if-eqz v0, :cond_1b

    .line 123
    .line 124
    sget-object v3, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 125
    .line 126
    invoke-static {}, La/xf0;->N()Lorg/platform/app/ApplicationLoader;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    iget-object v3, v3, Lorg/platform/app/ApplicationLoader;->z:La/ejc;

    .line 131
    .line 132
    if-eqz v3, :cond_1a

    .line 133
    .line 134
    iget-object v3, v3, La/ejc;->a:La/i1w0;

    .line 135
    .line 136
    invoke-virtual {v0, v3}, La/yr3;->a(La/i1w0;)La/s8i;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    new-instance v3, La/hsv0;

    .line 141
    .line 142
    iget-object v4, v0, La/s8i;->a:La/fwv0;

    .line 143
    .line 144
    iget-object v5, v0, La/s8i;->b:La/jvv0;

    .line 145
    .line 146
    invoke-direct {v3, v4, v5}, La/hsv0;-><init>(La/fwv0;La/jvv0;)V

    .line 147
    .line 148
    .line 149
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B:La/hsv0;

    .line 150
    .line 151
    iget-object v3, v0, La/s8i;->c:La/fwv0;

    .line 152
    .line 153
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->Y:La/fwv0;

    .line 154
    .line 155
    iget-object v3, v0, La/s8i;->d:La/ba50;

    .line 156
    .line 157
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->Z:La/ba50;

    .line 158
    .line 159
    iget-object v3, v0, La/s8i;->e:La/vfx;

    .line 160
    .line 161
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->f1:La/vfx;

    .line 162
    .line 163
    iget-object v3, v0, La/s8i;->f:La/fwk;

    .line 164
    .line 165
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->g1:La/fwk;

    .line 166
    .line 167
    iget-object v3, v0, La/s8i;->M0:La/r5i;

    .line 168
    .line 169
    invoke-static {v3}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->h1:La/z7z;

    .line 174
    .line 175
    iget-object v3, v0, La/s8i;->N0:La/zix;

    .line 176
    .line 177
    invoke-static {v3}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->i1:La/z7z;

    .line 182
    .line 183
    iget-object v3, v0, La/s8i;->O0:La/r5i;

    .line 184
    .line 185
    invoke-static {v3}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->j1:La/z7z;

    .line 190
    .line 191
    iget-object v3, v0, La/s8i;->P0:La/zix;

    .line 192
    .line 193
    invoke-static {v3}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->k1:La/z7z;

    .line 198
    .line 199
    iget-object v3, v0, La/s8i;->Q0:La/zix;

    .line 200
    .line 201
    invoke-static {v3}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->l1:La/z7z;

    .line 206
    .line 207
    iget-object v3, v0, La/s8i;->R0:La/zix;

    .line 208
    .line 209
    invoke-static {v3}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->m1:La/z7z;

    .line 214
    .line 215
    iget-object v3, v0, La/s8i;->S0:La/zix;

    .line 216
    .line 217
    invoke-static {v3}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->n1:La/z7z;

    .line 222
    .line 223
    iget-object v3, v0, La/s8i;->T0:La/zix;

    .line 224
    .line 225
    invoke-static {v3}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->o1:La/z7z;

    .line 230
    .line 231
    iget-object v3, v0, La/s8i;->U0:La/zix;

    .line 232
    .line 233
    invoke-static {v3}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->p1:La/z7z;

    .line 238
    .line 239
    iget-object v3, v0, La/s8i;->V0:La/zix;

    .line 240
    .line 241
    invoke-static {v3}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->q1:La/z7z;

    .line 246
    .line 247
    iget-object v3, v0, La/s8i;->W0:La/zix;

    .line 248
    .line 249
    invoke-static {v3}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->r1:La/z7z;

    .line 254
    .line 255
    iget-object v3, v0, La/s8i;->X0:La/zix;

    .line 256
    .line 257
    invoke-static {v3}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->s1:La/z7z;

    .line 262
    .line 263
    iget-object v0, v0, La/s8i;->Y0:La/zix;

    .line 264
    .line 265
    invoke-static {v0}, La/mbl;->a(La/n5d0;)La/z7z;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    iput-object v0, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->t1:La/z7z;

    .line 270
    .line 271
    invoke-virtual {v2}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    iget-object v3, v0, La/zu3;->V:La/z7z;

    .line 276
    .line 277
    invoke-interface {v3}, La/z7z;->get()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    check-cast v3, La/rgu;

    .line 282
    .line 283
    iget-object v3, v3, La/rgu;->a:La/yox;

    .line 284
    .line 285
    iget-object v3, v3, La/yox;->a:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v3, La/kuy;

    .line 288
    .line 289
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    new-instance v4, La/juy;

    .line 293
    .line 294
    invoke-direct {v4, v3, v9, v8}, La/juy;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 295
    .line 296
    .line 297
    invoke-static {v4}, La/nkb;->z(Lkotlin/jvm/functions/Function2;)La/ltb;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    new-instance v4, La/c00;

    .line 302
    .line 303
    const/16 v5, 0xc

    .line 304
    .line 305
    invoke-direct {v4, v3, v0, v5}, La/c00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 306
    .line 307
    .line 308
    sget-object v0, La/lkz;->a:La/lkz;

    .line 309
    .line 310
    new-instance v0, La/wr3;

    .line 311
    .line 312
    invoke-direct {v0, v2, v9, v10}, La/wr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/yje;B)V

    .line 313
    .line 314
    .line 315
    iget-object v11, v2, La/zfd;->a:La/glz;

    .line 316
    .line 317
    invoke-static {v11}, La/x0x;->Q(La/glz;)La/tkz;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    new-instance v5, La/tg3;

    .line 322
    .line 323
    invoke-direct {v5, v4, v2, v0, v9}, La/tg3;-><init>(La/c00;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/wr3;La/yje;)V

    .line 324
    .line 325
    .line 326
    const/4 v12, 0x3

    .line 327
    invoke-static {v3, v9, v9, v5, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 328
    .line 329
    .line 330
    invoke-static {v2}, La/qem0;->p(Landroid/content/Context;)I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    invoke-virtual {v2, v0}, La/yc3;->setTheme(I)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    if-eqz v0, :cond_3

    .line 342
    .line 343
    const-string v3, "android.intent.category.DEFAULT"

    .line 344
    .line 345
    invoke-virtual {v0, v3}, Landroid/content/Intent;->hasCategory(Ljava/lang/String;)Z

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    if-ne v0, v10, :cond_3

    .line 350
    .line 351
    goto :goto_2

    .line 352
    :cond_3
    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    if-eqz v0, :cond_5

    .line 357
    .line 358
    const-string v3, "android.intent.category.LAUNCHER"

    .line 359
    .line 360
    invoke-virtual {v0, v3}, Landroid/content/Intent;->hasCategory(Ljava/lang/String;)Z

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    if-ne v0, v10, :cond_5

    .line 365
    .line 366
    :goto_2
    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    if-eqz v0, :cond_4

    .line 371
    .line 372
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    goto :goto_3

    .line 377
    :cond_4
    move-object v0, v9

    .line 378
    :goto_3
    const-string v3, "android.intent.action.MAIN"

    .line 379
    .line 380
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    if-eqz v0, :cond_5

    .line 385
    .line 386
    move v0, v10

    .line 387
    goto :goto_4

    .line 388
    :cond_5
    move v0, v8

    .line 389
    :goto_4
    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 390
    .line 391
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 395
    .line 396
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    const-string v4, "samsung"

    .line 407
    .line 408
    invoke-static {v3, v4, v8}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    sget-boolean v4, La/ahb;->a:Z

    .line 413
    .line 414
    if-eqz v0, :cond_6

    .line 415
    .line 416
    if-eqz v3, :cond_6

    .line 417
    .line 418
    if-nez v4, :cond_6

    .line 419
    .line 420
    move v0, v10

    .line 421
    goto :goto_5

    .line 422
    :cond_6
    move v0, v8

    .line 423
    :goto_5
    if-eqz v0, :cond_7

    .line 424
    .line 425
    invoke-super {v2, v9}, La/kxq;->onCreate(Landroid/os/Bundle;)V

    .line 426
    .line 427
    .line 428
    goto :goto_6

    .line 429
    :cond_7
    invoke-super/range {p0 .. p1}, La/kxq;->onCreate(Landroid/os/Bundle;)V

    .line 430
    .line 431
    .line 432
    :goto_6
    invoke-virtual {v2}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->t()La/hd3;

    .line 433
    .line 434
    .line 435
    move-result-object v3

    .line 436
    invoke-virtual {v3}, La/hd3;->l()La/qhv0;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    const/16 v4, 0x8

    .line 441
    .line 442
    const-string v5, ""

    .line 443
    .line 444
    if-eqz v3, :cond_8

    .line 445
    .line 446
    iget-object v3, v3, La/qhv0;->e:La/blj;

    .line 447
    .line 448
    check-cast v3, La/rwq0;

    .line 449
    .line 450
    iput-boolean v10, v3, La/rwq0;->g:Z

    .line 451
    .line 452
    iget-object v6, v3, La/rwq0;->a:Landroidx/appcompat/widget/Toolbar;

    .line 453
    .line 454
    iput-object v5, v3, La/rwq0;->h:Ljava/lang/CharSequence;

    .line 455
    .line 456
    iget v7, v3, La/rwq0;->b:I

    .line 457
    .line 458
    and-int/2addr v7, v4

    .line 459
    if-eqz v7, :cond_8

    .line 460
    .line 461
    invoke-virtual {v6, v5}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 462
    .line 463
    .line 464
    iget-boolean v3, v3, La/rwq0;->g:Z

    .line 465
    .line 466
    if-eqz v3, :cond_8

    .line 467
    .line 468
    invoke-virtual {v6}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    invoke-static {v3, v5}, La/rgu0;->p(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 473
    .line 474
    .line 475
    :cond_8
    sput-boolean v10, La/ahb;->a:Z

    .line 476
    .line 477
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    invoke-static {v5}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 482
    .line 483
    .line 484
    move-result v6

    .line 485
    const/4 v13, 0x2

    .line 486
    if-eqz v6, :cond_9

    .line 487
    .line 488
    goto :goto_7

    .line 489
    :cond_9
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v3

    .line 493
    if-eqz v3, :cond_a

    .line 494
    .line 495
    goto :goto_7

    .line 496
    :cond_a
    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    invoke-virtual {v3, v5, v8}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    new-instance v5, Landroid/content/ComponentName;

    .line 508
    .line 509
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v6

    .line 513
    const-string v7, "org.xplatform.client1.LauncherAliasColor"

    .line 514
    .line 515
    invoke-direct {v5, v6, v7}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v3, v5, v13, v10}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 519
    .line 520
    .line 521
    new-instance v5, Landroid/content/ComponentName;

    .line 522
    .line 523
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v6

    .line 527
    const-string v7, "org.xplatform.client1.LauncherAliasLegacy"

    .line 528
    .line 529
    invoke-direct {v5, v6, v7}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v3, v5, v10, v10}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 533
    .line 534
    .line 535
    :catch_0
    :goto_7
    new-instance v3, La/md3;

    .line 536
    .line 537
    new-instance v5, La/kr3;

    .line 538
    .line 539
    const/4 v6, 0x7

    .line 540
    invoke-direct {v5, v2, v6}, La/kr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V

    .line 541
    .line 542
    .line 543
    invoke-direct {v3, v5, v4, v8}, La/md3;-><init>(Ljava/lang/Object;BZ)V

    .line 544
    .line 545
    .line 546
    iput-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->z1:La/md3;

    .line 547
    .line 548
    new-instance v3, Landroid/content/IntentFilter;

    .line 549
    .line 550
    invoke-direct {v3}, Landroid/content/IntentFilter;-><init>()V

    .line 551
    .line 552
    .line 553
    const-string v4, "android.intent.action.PACKAGE_ADDED"

    .line 554
    .line 555
    invoke-virtual {v3, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    const-string v4, "android.intent.action.PACKAGE_REPLACED"

    .line 559
    .line 560
    invoke-virtual {v3, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    const-string v4, "package"

    .line 564
    .line 565
    invoke-virtual {v3, v4}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    iget-object v4, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->z1:La/md3;

    .line 569
    .line 570
    invoke-virtual {v2, v4, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 571
    .line 572
    .line 573
    if-nez p1, :cond_b

    .line 574
    .line 575
    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 576
    .line 577
    .line 578
    move-result-object v3

    .line 579
    goto :goto_8

    .line 580
    :cond_b
    new-instance v3, Landroid/content/Intent;

    .line 581
    .line 582
    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 583
    .line 584
    .line 585
    :goto_8
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    invoke-static {v2, v3}, La/j120;->f0(La/yc3;Landroid/content/Intent;)Z

    .line 589
    .line 590
    .line 591
    move-result v3

    .line 592
    if-eqz v3, :cond_c

    .line 593
    .line 594
    return-void

    .line 595
    :cond_c
    iget-object v3, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->i1:La/z7z;

    .line 596
    .line 597
    if-eqz v3, :cond_19

    .line 598
    .line 599
    invoke-interface {v3}, La/z7z;->get()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    check-cast v3, La/wyu;

    .line 604
    .line 605
    invoke-virtual {v3}, La/wyu;->a()La/uaq0;

    .line 606
    .line 607
    .line 608
    move-result-object v3

    .line 609
    sget-object v4, La/s6t0;->a:La/pz40;

    .line 610
    .line 611
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 612
    .line 613
    .line 614
    move-result v4

    .line 615
    packed-switch v4, :pswitch_data_0

    .line 616
    .line 617
    .line 618
    invoke-static {}, La/t9f;->b()V

    .line 619
    .line 620
    .line 621
    return-void

    .line 622
    :pswitch_0
    sget-object v4, La/lkd;->c:La/yk5;

    .line 623
    .line 624
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    .line 626
    .line 627
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 628
    .line 629
    .line 630
    move-result-object v4

    .line 631
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 632
    .line 633
    iget-object v4, v4, La/bbq0;->e:La/taq0;

    .line 634
    .line 635
    if-nez v4, :cond_d

    .line 636
    .line 637
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 638
    .line 639
    .line 640
    move-result-object v4

    .line 641
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 642
    .line 643
    iget-object v4, v4, La/bbq0;->d:La/taq0;

    .line 644
    .line 645
    if-nez v4, :cond_d

    .line 646
    .line 647
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 652
    .line 653
    iget-object v4, v4, La/bbq0;->a:La/taq0;

    .line 654
    .line 655
    goto/16 :goto_9

    .line 656
    .line 657
    :pswitch_1
    sget-object v4, La/lkd;->c:La/yk5;

    .line 658
    .line 659
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 663
    .line 664
    .line 665
    move-result-object v4

    .line 666
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 667
    .line 668
    iget-object v4, v4, La/bbq0;->d:La/taq0;

    .line 669
    .line 670
    if-nez v4, :cond_d

    .line 671
    .line 672
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 673
    .line 674
    .line 675
    move-result-object v4

    .line 676
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 677
    .line 678
    iget-object v4, v4, La/bbq0;->a:La/taq0;

    .line 679
    .line 680
    goto/16 :goto_9

    .line 681
    .line 682
    :pswitch_2
    sget-object v4, La/lkd;->c:La/yk5;

    .line 683
    .line 684
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 688
    .line 689
    .line 690
    move-result-object v4

    .line 691
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 692
    .line 693
    iget-object v4, v4, La/bbq0;->g:La/taq0;

    .line 694
    .line 695
    if-nez v4, :cond_d

    .line 696
    .line 697
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 698
    .line 699
    .line 700
    move-result-object v4

    .line 701
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 702
    .line 703
    iget-object v4, v4, La/bbq0;->f:La/taq0;

    .line 704
    .line 705
    if-nez v4, :cond_d

    .line 706
    .line 707
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 708
    .line 709
    .line 710
    move-result-object v4

    .line 711
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 712
    .line 713
    iget-object v4, v4, La/bbq0;->a:La/taq0;

    .line 714
    .line 715
    goto/16 :goto_9

    .line 716
    .line 717
    :pswitch_3
    sget-object v4, La/lkd;->c:La/yk5;

    .line 718
    .line 719
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 720
    .line 721
    .line 722
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 723
    .line 724
    .line 725
    move-result-object v4

    .line 726
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 727
    .line 728
    iget-object v4, v4, La/bbq0;->f:La/taq0;

    .line 729
    .line 730
    if-nez v4, :cond_d

    .line 731
    .line 732
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 733
    .line 734
    .line 735
    move-result-object v4

    .line 736
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 737
    .line 738
    iget-object v4, v4, La/bbq0;->a:La/taq0;

    .line 739
    .line 740
    goto/16 :goto_9

    .line 741
    .line 742
    :pswitch_4
    sget-object v4, La/lkd;->c:La/yk5;

    .line 743
    .line 744
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 748
    .line 749
    .line 750
    move-result-object v4

    .line 751
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 752
    .line 753
    iget-object v4, v4, La/bbq0;->i:La/taq0;

    .line 754
    .line 755
    if-nez v4, :cond_d

    .line 756
    .line 757
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 758
    .line 759
    .line 760
    move-result-object v4

    .line 761
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 762
    .line 763
    iget-object v4, v4, La/bbq0;->h:La/taq0;

    .line 764
    .line 765
    if-nez v4, :cond_d

    .line 766
    .line 767
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 768
    .line 769
    .line 770
    move-result-object v4

    .line 771
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 772
    .line 773
    iget-object v4, v4, La/bbq0;->a:La/taq0;

    .line 774
    .line 775
    goto/16 :goto_9

    .line 776
    .line 777
    :pswitch_5
    sget-object v4, La/lkd;->c:La/yk5;

    .line 778
    .line 779
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 780
    .line 781
    .line 782
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 783
    .line 784
    .line 785
    move-result-object v4

    .line 786
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 787
    .line 788
    iget-object v4, v4, La/bbq0;->h:La/taq0;

    .line 789
    .line 790
    if-nez v4, :cond_d

    .line 791
    .line 792
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 793
    .line 794
    .line 795
    move-result-object v4

    .line 796
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 797
    .line 798
    iget-object v4, v4, La/bbq0;->a:La/taq0;

    .line 799
    .line 800
    goto/16 :goto_9

    .line 801
    .line 802
    :pswitch_6
    sget-object v4, La/lkd;->c:La/yk5;

    .line 803
    .line 804
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 805
    .line 806
    .line 807
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 808
    .line 809
    .line 810
    move-result-object v4

    .line 811
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 812
    .line 813
    iget-object v4, v4, La/bbq0;->k:La/taq0;

    .line 814
    .line 815
    if-nez v4, :cond_d

    .line 816
    .line 817
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 818
    .line 819
    .line 820
    move-result-object v4

    .line 821
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 822
    .line 823
    iget-object v4, v4, La/bbq0;->j:La/taq0;

    .line 824
    .line 825
    if-nez v4, :cond_d

    .line 826
    .line 827
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 828
    .line 829
    .line 830
    move-result-object v4

    .line 831
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 832
    .line 833
    iget-object v4, v4, La/bbq0;->a:La/taq0;

    .line 834
    .line 835
    goto :goto_9

    .line 836
    :pswitch_7
    sget-object v4, La/lkd;->c:La/yk5;

    .line 837
    .line 838
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 839
    .line 840
    .line 841
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 842
    .line 843
    .line 844
    move-result-object v4

    .line 845
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 846
    .line 847
    iget-object v4, v4, La/bbq0;->j:La/taq0;

    .line 848
    .line 849
    if-nez v4, :cond_d

    .line 850
    .line 851
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 852
    .line 853
    .line 854
    move-result-object v4

    .line 855
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 856
    .line 857
    iget-object v4, v4, La/bbq0;->a:La/taq0;

    .line 858
    .line 859
    goto :goto_9

    .line 860
    :pswitch_8
    sget-object v4, La/lkd;->c:La/yk5;

    .line 861
    .line 862
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 863
    .line 864
    .line 865
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 866
    .line 867
    .line 868
    move-result-object v4

    .line 869
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 870
    .line 871
    iget-object v4, v4, La/bbq0;->c:La/taq0;

    .line 872
    .line 873
    if-nez v4, :cond_d

    .line 874
    .line 875
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 876
    .line 877
    .line 878
    move-result-object v4

    .line 879
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 880
    .line 881
    iget-object v4, v4, La/bbq0;->a:La/taq0;

    .line 882
    .line 883
    goto :goto_9

    .line 884
    :pswitch_9
    sget-object v4, La/lkd;->c:La/yk5;

    .line 885
    .line 886
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 887
    .line 888
    .line 889
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 890
    .line 891
    .line 892
    move-result-object v4

    .line 893
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 894
    .line 895
    iget-object v4, v4, La/bbq0;->b:La/taq0;

    .line 896
    .line 897
    if-nez v4, :cond_d

    .line 898
    .line 899
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 900
    .line 901
    .line 902
    move-result-object v4

    .line 903
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 904
    .line 905
    iget-object v4, v4, La/bbq0;->a:La/taq0;

    .line 906
    .line 907
    goto :goto_9

    .line 908
    :pswitch_a
    sget-object v4, La/lkd;->c:La/yk5;

    .line 909
    .line 910
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    invoke-static {}, La/yk5;->a()La/lkd;

    .line 914
    .line 915
    .line 916
    move-result-object v4

    .line 917
    iget-object v4, v4, La/lkd;->b:La/bbq0;

    .line 918
    .line 919
    iget-object v4, v4, La/bbq0;->a:La/taq0;

    .line 920
    .line 921
    :cond_d
    :goto_9
    sget-object v5, La/uaq0;->a:La/s9m0;

    .line 922
    .line 923
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 924
    .line 925
    .line 926
    invoke-static {v3}, La/s9m0;->j(La/uaq0;)Z

    .line 927
    .line 928
    .line 929
    move-result v3

    .line 930
    xor-int/2addr v3, v10

    .line 931
    invoke-static {v4, v3}, La/s6t0;->d(La/taq0;Z)V

    .line 932
    .line 933
    .line 934
    invoke-virtual {v2}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C()La/sn;

    .line 935
    .line 936
    .line 937
    move-result-object v3

    .line 938
    iget-object v3, v3, La/sn;->c:Landroid/widget/FrameLayout;

    .line 939
    .line 940
    invoke-virtual {v2, v3}, La/yc3;->setContentView(Landroid/view/View;)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v2}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->G()La/hsv0;

    .line 944
    .line 945
    .line 946
    move-result-object v3

    .line 947
    iget-object v4, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->s1:La/z7z;

    .line 948
    .line 949
    if-eqz v4, :cond_18

    .line 950
    .line 951
    invoke-interface {v4}, La/z7z;->get()Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v4

    .line 955
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 956
    .line 957
    .line 958
    check-cast v4, La/ib50;

    .line 959
    .line 960
    new-instance v5, La/mvv0;

    .line 961
    .line 962
    iget-object v6, v3, La/hsv0;->b:La/jvv0;

    .line 963
    .line 964
    invoke-direct {v5, v2, v6}, La/mvv0;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/jvv0;)V

    .line 965
    .line 966
    .line 967
    invoke-virtual {v2}, La/kxq;->r()La/v1r;

    .line 968
    .line 969
    .line 970
    move-result-object v6

    .line 971
    invoke-virtual {v6, v5, v10}, Landroidx/fragment/app/e;->k0(La/q1r;Z)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v11, v5}, La/glz;->a(La/blz;)V

    .line 975
    .line 976
    .line 977
    new-instance v5, Landroidx/compose/ui/platform/ComposeView;

    .line 978
    .line 979
    const/4 v6, 0x6

    .line 980
    invoke-direct {v5, v2, v9, v6}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 981
    .line 982
    .line 983
    new-instance v6, La/owp0;

    .line 984
    .line 985
    invoke-direct {v6, v2}, La/owp0;-><init>(La/clz;)V

    .line 986
    .line 987
    .line 988
    new-instance v7, La/sjs;

    .line 989
    .line 990
    const/16 v14, 0x16

    .line 991
    .line 992
    invoke-direct {v7, v3, v4, v14}, La/sjs;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 993
    .line 994
    .line 995
    new-instance v3, La/ugd;

    .line 996
    .line 997
    const v4, 0x69457511

    .line 998
    .line 999
    .line 1000
    invoke-direct {v3, v4, v10, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1001
    .line 1002
    .line 1003
    invoke-static {v5, v6, v9, v3}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 1004
    .line 1005
    .line 1006
    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    .line 1007
    .line 1008
    const/4 v4, -0x1

    .line 1009
    invoke-direct {v3, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v2, v5, v3}, La/yc3;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1013
    .line 1014
    .line 1015
    if-eqz p1, :cond_f

    .line 1016
    .line 1017
    if-eqz v0, :cond_e

    .line 1018
    .line 1019
    goto :goto_a

    .line 1020
    :cond_e
    move v0, v8

    .line 1021
    goto :goto_b

    .line 1022
    :cond_f
    :goto_a
    move v0, v10

    .line 1023
    :goto_b
    const/4 v14, 0x5

    .line 1024
    const/4 v3, 0x4

    .line 1025
    if-eqz v0, :cond_11

    .line 1026
    .line 1027
    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v4

    .line 1031
    if-eqz v4, :cond_10

    .line 1032
    .line 1033
    invoke-virtual {v2}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v5

    .line 1037
    iget-object v5, v5, La/zu3;->e:La/z7z;

    .line 1038
    .line 1039
    invoke-interface {v5}, La/z7z;->get()Ljava/lang/Object;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v5

    .line 1043
    check-cast v5, La/jlx;

    .line 1044
    .line 1045
    invoke-virtual {v5, v4}, La/jlx;->a(Landroid/content/Intent;)V

    .line 1046
    .line 1047
    .line 1048
    :cond_10
    invoke-virtual {v2}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v4

    .line 1052
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v15

    .line 1056
    sget-object v16, La/pu3;->a:La/pu3;

    .line 1057
    .line 1058
    new-instance v5, La/xs3;

    .line 1059
    .line 1060
    invoke-direct {v5, v4, v10}, La/xs3;-><init>(La/zu3;B)V

    .line 1061
    .line 1062
    .line 1063
    new-instance v6, La/qu3;

    .line 1064
    .line 1065
    invoke-direct {v6, v4, v9, v8}, La/qu3;-><init>(La/zu3;La/yje;B)V

    .line 1066
    .line 1067
    .line 1068
    const/16 v20, 0xc

    .line 1069
    .line 1070
    const/16 v18, 0x0

    .line 1071
    .line 1072
    move-object/from16 v17, v5

    .line 1073
    .line 1074
    move-object/from16 v19, v6

    .line 1075
    .line 1076
    invoke-static/range {v15 .. v20}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1077
    .line 1078
    .line 1079
    iget-object v5, v4, La/zu3;->v:La/z7z;

    .line 1080
    .line 1081
    invoke-interface {v5}, La/z7z;->get()Ljava/lang/Object;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v5

    .line 1085
    check-cast v5, La/m1e;

    .line 1086
    .line 1087
    invoke-interface {v5}, La/m1e;->b()La/gmq;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v5

    .line 1091
    new-instance v6, La/zo1;

    .line 1092
    .line 1093
    invoke-direct {v6, v9, v4, v14}, La/zo1;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 1094
    .line 1095
    .line 1096
    invoke-static {v5, v6}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v5

    .line 1100
    new-instance v6, La/cu3;

    .line 1101
    .line 1102
    invoke-direct {v6, v4, v9, v3}, La/cu3;-><init>(La/zu3;La/yje;B)V

    .line 1103
    .line 1104
    .line 1105
    new-instance v7, La/fnq;

    .line 1106
    .line 1107
    invoke-direct {v7, v5, v6, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 1108
    .line 1109
    .line 1110
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v5

    .line 1114
    iget-object v4, v4, La/zu3;->g:La/mne;

    .line 1115
    .line 1116
    iget-object v4, v4, La/mne;->a:La/rwj;

    .line 1117
    .line 1118
    invoke-static {v5, v4}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v4

    .line 1122
    sget-object v5, La/ru3;->h:La/ru3;

    .line 1123
    .line 1124
    invoke-static {v7, v4, v5}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 1125
    .line 1126
    .line 1127
    :cond_11
    invoke-virtual {v2}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v4

    .line 1131
    iget-object v5, v4, La/zu3;->g:La/mne;

    .line 1132
    .line 1133
    iget-object v6, v4, La/zu3;->z:La/z7z;

    .line 1134
    .line 1135
    invoke-interface {v6}, La/z7z;->get()Ljava/lang/Object;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v6

    .line 1139
    check-cast v6, La/iqt;

    .line 1140
    .line 1141
    iget-object v6, v6, La/iqt;->a:La/gst0;

    .line 1142
    .line 1143
    invoke-virtual {v6}, La/gst0;->a()Z

    .line 1144
    .line 1145
    .line 1146
    move-result v6

    .line 1147
    if-nez v6, :cond_12

    .line 1148
    .line 1149
    iget-object v6, v4, La/zu3;->k:La/z7z;

    .line 1150
    .line 1151
    invoke-interface {v6}, La/z7z;->get()Ljava/lang/Object;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v6

    .line 1155
    check-cast v6, La/g860;

    .line 1156
    .line 1157
    iget-object v6, v6, La/g860;->a:La/gst0;

    .line 1158
    .line 1159
    iget-object v6, v6, La/gst0;->a:La/rrt0;

    .line 1160
    .line 1161
    invoke-virtual {v6, v8}, La/rrt0;->b(Z)V

    .line 1162
    .line 1163
    .line 1164
    goto :goto_c

    .line 1165
    :cond_12
    const-wide/16 v6, 0x0

    .line 1166
    .line 1167
    invoke-virtual {v4, v6, v7}, La/zu3;->A(J)V

    .line 1168
    .line 1169
    .line 1170
    :goto_c
    iget-object v6, v4, La/zu3;->P:La/z7z;

    .line 1171
    .line 1172
    invoke-interface {v6}, La/z7z;->get()Ljava/lang/Object;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v6

    .line 1176
    check-cast v6, La/hs00;

    .line 1177
    .line 1178
    invoke-virtual {v6}, La/hs00;->a()La/qoj0;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v6

    .line 1182
    new-instance v7, La/yg1;

    .line 1183
    .line 1184
    invoke-direct {v7, v4, v9, v13}, La/yg1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 1185
    .line 1186
    .line 1187
    new-instance v15, La/fnq;

    .line 1188
    .line 1189
    invoke-direct {v15, v6, v7, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 1190
    .line 1191
    .line 1192
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v6

    .line 1196
    iget-object v7, v5, La/mne;->b:La/dvj;

    .line 1197
    .line 1198
    invoke-static {v6, v7}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v6

    .line 1202
    new-instance v7, La/pd;

    .line 1203
    .line 1204
    const/16 v1, 0x11

    .line 1205
    .line 1206
    invoke-direct {v7, v13, v9, v1}, La/pd;-><init>(ILa/yje;B)V

    .line 1207
    .line 1208
    .line 1209
    invoke-static {v15, v6, v7}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 1210
    .line 1211
    .line 1212
    iget-object v1, v4, La/zu3;->f:La/z7z;

    .line 1213
    .line 1214
    invoke-interface {v1}, La/z7z;->get()Ljava/lang/Object;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v1

    .line 1218
    check-cast v1, La/c1d0;

    .line 1219
    .line 1220
    invoke-interface {v1}, La/c1d0;->f()La/orc;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v1

    .line 1224
    invoke-virtual {v1}, La/orc;->a()La/p7m0;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v1

    .line 1228
    new-instance v6, La/or3;

    .line 1229
    .line 1230
    invoke-direct {v6, v13}, La/or3;-><init>(B)V

    .line 1231
    .line 1232
    .line 1233
    sget-object v7, La/i120;->g:La/jbp;

    .line 1234
    .line 1235
    invoke-static {v1, v6, v7}, La/i120;->X(La/gmq;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/rwk;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v1

    .line 1239
    new-instance v6, La/cu3;

    .line 1240
    .line 1241
    invoke-direct {v6, v4, v9, v12}, La/cu3;-><init>(La/zu3;La/yje;B)V

    .line 1242
    .line 1243
    .line 1244
    new-instance v7, La/fnq;

    .line 1245
    .line 1246
    invoke-direct {v7, v1, v6, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 1247
    .line 1248
    .line 1249
    new-instance v1, La/lo3;

    .line 1250
    .line 1251
    invoke-direct {v1, v12, v9, v10}, La/lo3;-><init>(ILa/yje;B)V

    .line 1252
    .line 1253
    .line 1254
    new-instance v3, La/dnq;

    .line 1255
    .line 1256
    invoke-direct {v3, v7, v1, v10}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 1257
    .line 1258
    .line 1259
    iget-object v1, v5, La/mne;->b:La/dvj;

    .line 1260
    .line 1261
    invoke-static {v3, v1}, La/ulb;->L(La/gmq;Lkotlin/coroutines/CoroutineContext;)La/gmq;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v1

    .line 1265
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v3

    .line 1269
    invoke-static {v1, v3}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 1270
    .line 1271
    .line 1272
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 1273
    .line 1274
    if-eqz v0, :cond_13

    .line 1275
    .line 1276
    const v1, 0x7f040b20

    .line 1277
    .line 1278
    .line 1279
    goto :goto_d

    .line 1280
    :cond_13
    const v1, 0x7f040ae3

    .line 1281
    .line 1282
    .line 1283
    :goto_d
    invoke-static {v2, v1, v8}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 1284
    .line 1285
    .line 1286
    move-result v0

    .line 1287
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    iput-object v0, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->y1:Ljava/lang/Integer;

    .line 1292
    .line 1293
    iget-object v0, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->j1:La/z7z;

    .line 1294
    .line 1295
    if-eqz v0, :cond_17

    .line 1296
    .line 1297
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v0

    .line 1301
    check-cast v0, La/ldj;

    .line 1302
    .line 1303
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1304
    .line 1305
    .line 1306
    iget-object v1, v0, La/ldj;->b:La/tvj;

    .line 1307
    .line 1308
    if-eqz v1, :cond_14

    .line 1309
    .line 1310
    invoke-virtual {v11, v1}, La/glz;->f(La/blz;)V

    .line 1311
    .line 1312
    .line 1313
    :cond_14
    iput-object v9, v0, La/ldj;->b:La/tvj;

    .line 1314
    .line 1315
    new-instance v1, La/tvj;

    .line 1316
    .line 1317
    new-instance v3, La/coh;

    .line 1318
    .line 1319
    invoke-direct {v3, v0, v2, v11}, La/coh;-><init>(La/ldj;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/glz;)V

    .line 1320
    .line 1321
    .line 1322
    const/16 v4, 0x1f

    .line 1323
    .line 1324
    invoke-direct {v1, v9, v9, v3, v4}, La/tvj;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;I)V

    .line 1325
    .line 1326
    .line 1327
    iput-object v1, v0, La/ldj;->b:La/tvj;

    .line 1328
    .line 1329
    invoke-virtual {v11, v1}, La/glz;->a(La/blz;)V

    .line 1330
    .line 1331
    .line 1332
    new-instance v1, La/q7x0;

    .line 1333
    .line 1334
    invoke-direct {v1, v10}, La/q7x0;-><init>(B)V

    .line 1335
    .line 1336
    .line 1337
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1338
    .line 1339
    const/16 v4, 0x21

    .line 1340
    .line 1341
    const-string v5, "android.intent.action.DATE_CHANGED"

    .line 1342
    .line 1343
    const-string v6, "android.intent.action.TIME_SET"

    .line 1344
    .line 1345
    if-lt v3, v4, :cond_15

    .line 1346
    .line 1347
    new-instance v3, Landroid/content/IntentFilter;

    .line 1348
    .line 1349
    invoke-direct {v3}, Landroid/content/IntentFilter;-><init>()V

    .line 1350
    .line 1351
    .line 1352
    invoke-virtual {v3, v6}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v3, v5}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1356
    .line 1357
    .line 1358
    invoke-static {v2, v1, v3}, La/c0g;->A(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/q7x0;Landroid/content/IntentFilter;)V

    .line 1359
    .line 1360
    .line 1361
    goto :goto_e

    .line 1362
    :cond_15
    new-instance v3, Landroid/content/IntentFilter;

    .line 1363
    .line 1364
    invoke-direct {v3}, Landroid/content/IntentFilter;-><init>()V

    .line 1365
    .line 1366
    .line 1367
    invoke-virtual {v3, v6}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1368
    .line 1369
    .line 1370
    invoke-virtual {v3, v5}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1371
    .line 1372
    .line 1373
    invoke-virtual {v2, v1, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1374
    .line 1375
    .line 1376
    :goto_e
    iput-object v1, v0, La/ldj;->a:La/q7x0;

    .line 1377
    .line 1378
    invoke-virtual {v2}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v0

    .line 1382
    iget-object v15, v0, La/zu3;->h0:La/ol60;

    .line 1383
    .line 1384
    new-instance v0, La/vp3;

    .line 1385
    .line 1386
    const/4 v6, 0x4

    .line 1387
    const/4 v7, 0x3

    .line 1388
    const/4 v1, 0x2

    .line 1389
    const-class v3, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 1390
    .line 1391
    const-string v4, "handleViewAction"

    .line 1392
    .line 1393
    const-string v5, "handleViewAction(Lorg/xplatform/client1/features/appactivity/ApplicationViewModel$ViewAction;)V"

    .line 1394
    .line 1395
    invoke-direct/range {v0 .. v7}, La/vp3;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1396
    .line 1397
    .line 1398
    move-object v6, v3

    .line 1399
    sget-object v1, La/lkz;->a:La/lkz;

    .line 1400
    .line 1401
    invoke-static {v11}, La/x0x;->Q(La/glz;)La/tkz;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v7

    .line 1405
    move-object v3, v0

    .line 1406
    new-instance v0, La/tg3;

    .line 1407
    .line 1408
    const/4 v5, 0x0

    .line 1409
    move-object/from16 v2, p0

    .line 1410
    .line 1411
    move-object v4, v9

    .line 1412
    move-object v1, v15

    .line 1413
    invoke-direct/range {v0 .. v5}, La/tg3;-><init>(La/gmq;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/vp3;La/yje;I)V

    .line 1414
    .line 1415
    .line 1416
    invoke-static {v7, v9, v9, v0, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 1417
    .line 1418
    .line 1419
    invoke-virtual/range {p0 .. p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v0

    .line 1423
    iget-object v0, v0, La/zu3;->v:La/z7z;

    .line 1424
    .line 1425
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v0

    .line 1429
    check-cast v0, La/m1e;

    .line 1430
    .line 1431
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v15

    .line 1435
    new-instance v0, La/vp3;

    .line 1436
    .line 1437
    move-object v3, v6

    .line 1438
    const/4 v6, 0x4

    .line 1439
    const/4 v7, 0x4

    .line 1440
    const/4 v1, 0x2

    .line 1441
    const-string v4, "showDisableNetworkView"

    .line 1442
    .line 1443
    const-string v5, "showDisableNetworkView(Z)V"

    .line 1444
    .line 1445
    invoke-direct/range {v0 .. v7}, La/vp3;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1446
    .line 1447
    .line 1448
    sget-object v1, La/lkz;->a:La/lkz;

    .line 1449
    .line 1450
    invoke-static {v11}, La/x0x;->Q(La/glz;)La/tkz;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v1

    .line 1454
    new-instance v4, La/tg3;

    .line 1455
    .line 1456
    invoke-direct {v4, v15, v2, v0, v9}, La/tg3;-><init>(La/gmq;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/vp3;La/yje;)V

    .line 1457
    .line 1458
    .line 1459
    invoke-static {v1, v9, v9, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 1460
    .line 1461
    .line 1462
    invoke-virtual {v2}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v0

    .line 1466
    iget-object v15, v0, La/zu3;->k0:La/xae0;

    .line 1467
    .line 1468
    sget-object v0, La/lkz;->a:La/lkz;

    .line 1469
    .line 1470
    new-instance v0, La/vp3;

    .line 1471
    .line 1472
    const/4 v7, 0x5

    .line 1473
    const/4 v1, 0x2

    .line 1474
    const-string v4, "initInternetEmulationButton"

    .line 1475
    .line 1476
    const-string v5, "initInternetEmulationButton(Z)V"

    .line 1477
    .line 1478
    invoke-direct/range {v0 .. v7}, La/vp3;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1479
    .line 1480
    .line 1481
    move-object v6, v3

    .line 1482
    invoke-static {v11}, La/x0x;->Q(La/glz;)La/tkz;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v7

    .line 1486
    move-object v3, v0

    .line 1487
    new-instance v0, La/tg3;

    .line 1488
    .line 1489
    const/4 v5, 0x0

    .line 1490
    move-object v4, v9

    .line 1491
    move-object v1, v15

    .line 1492
    invoke-direct/range {v0 .. v5}, La/tg3;-><init>(La/gmq;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/vp3;La/yje;B)V

    .line 1493
    .line 1494
    .line 1495
    invoke-static {v7, v9, v9, v0, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 1496
    .line 1497
    .line 1498
    invoke-virtual/range {p0 .. p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v0

    .line 1502
    iget-object v15, v0, La/zu3;->l0:La/xae0;

    .line 1503
    .line 1504
    new-instance v0, La/vp3;

    .line 1505
    .line 1506
    move-object v3, v6

    .line 1507
    const/4 v6, 0x4

    .line 1508
    const/4 v7, 0x6

    .line 1509
    const/4 v1, 0x2

    .line 1510
    const-string v4, "initDebugConsoleView"

    .line 1511
    .line 1512
    const-string v5, "initDebugConsoleView(Lorg/xplatform/onexcore/domain/models/DebugConsoleState;)V"

    .line 1513
    .line 1514
    invoke-direct/range {v0 .. v7}, La/vp3;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1515
    .line 1516
    .line 1517
    invoke-static {v11}, La/x0x;->Q(La/glz;)La/tkz;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v6

    .line 1521
    move-object v3, v0

    .line 1522
    new-instance v0, La/tg3;

    .line 1523
    .line 1524
    const/4 v5, 0x0

    .line 1525
    move-object v4, v9

    .line 1526
    move-object v1, v15

    .line 1527
    invoke-direct/range {v0 .. v5}, La/tg3;-><init>(La/gmq;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/vp3;La/yje;C)V

    .line 1528
    .line 1529
    .line 1530
    invoke-static {v6, v9, v9, v0, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 1531
    .line 1532
    .line 1533
    invoke-static {v11}, La/x0x;->Q(La/glz;)La/tkz;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v0

    .line 1537
    sget-object v1, La/tvk;->a:La/rwj;

    .line 1538
    .line 1539
    sget-object v1, La/ys10;->a:La/vs10;

    .line 1540
    .line 1541
    new-instance v3, La/sr3;

    .line 1542
    .line 1543
    invoke-direct {v3, v2, v9, v10}, La/sr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/yje;B)V

    .line 1544
    .line 1545
    .line 1546
    invoke-static {v0, v1, v9, v3, v13}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 1547
    .line 1548
    .line 1549
    invoke-virtual {v2}, La/kxq;->r()La/v1r;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v0

    .line 1553
    new-instance v1, La/nr3;

    .line 1554
    .line 1555
    invoke-direct {v1, v2}, La/nr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;)V

    .line 1556
    .line 1557
    .line 1558
    iget-object v0, v0, Landroidx/fragment/app/e;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1559
    .line 1560
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1561
    .line 1562
    .line 1563
    iget-object v0, v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->Z:La/ba50;

    .line 1564
    .line 1565
    if-eqz v0, :cond_16

    .line 1566
    .line 1567
    iget-object v0, v0, La/ba50;->a:La/p7m0;

    .line 1568
    .line 1569
    new-instance v1, La/wr3;

    .line 1570
    .line 1571
    invoke-direct {v1, v2, v9, v8}, La/wr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/yje;B)V

    .line 1572
    .line 1573
    .line 1574
    invoke-static {v11}, La/x0x;->Q(La/glz;)La/tkz;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v3

    .line 1578
    new-instance v4, La/tg3;

    .line 1579
    .line 1580
    invoke-direct {v4, v0, v2, v1, v9}, La/tg3;-><init>(La/p7m0;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/wr3;La/yje;)V

    .line 1581
    .line 1582
    .line 1583
    invoke-static {v3, v9, v9, v4, v12}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 1584
    .line 1585
    .line 1586
    sget-object v0, La/ujk;->a:Ljava/util/ArrayList;

    .line 1587
    .line 1588
    new-instance v0, La/f8;

    .line 1589
    .line 1590
    const/4 v6, 0x0

    .line 1591
    const/16 v7, 0xb

    .line 1592
    .line 1593
    const/4 v1, 0x0

    .line 1594
    const-class v3, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 1595
    .line 1596
    const-string v4, "recreateSnackbars"

    .line 1597
    .line 1598
    const-string v5, "recreateSnackbars()V"

    .line 1599
    .line 1600
    invoke-direct/range {v0 .. v7}, La/f8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1601
    .line 1602
    .line 1603
    sget-object v1, La/ujk;->b:Ljava/util/ArrayList;

    .line 1604
    .line 1605
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1606
    .line 1607
    .line 1608
    new-instance v1, La/r58;

    .line 1609
    .line 1610
    invoke-direct {v1, v0}, La/r58;-><init>(La/f8;)V

    .line 1611
    .line 1612
    .line 1613
    invoke-virtual {v11, v1}, La/glz;->a(La/blz;)V

    .line 1614
    .line 1615
    .line 1616
    invoke-virtual {v2}, La/kxq;->r()La/v1r;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v0

    .line 1620
    new-instance v1, La/ur3;

    .line 1621
    .line 1622
    invoke-direct {v1, v2, v8}, La/ur3;-><init>(Ljava/lang/Object;B)V

    .line 1623
    .line 1624
    .line 1625
    invoke-virtual {v0, v1, v10}, Landroidx/fragment/app/e;->k0(La/q1r;Z)V

    .line 1626
    .line 1627
    .line 1628
    invoke-virtual {v2}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C()La/sn;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v0

    .line 1632
    iget-object v0, v0, La/sn;->b:Landroid/widget/FrameLayout;

    .line 1633
    .line 1634
    new-instance v1, La/gne;

    .line 1635
    .line 1636
    const/16 v3, 0xa

    .line 1637
    .line 1638
    invoke-direct {v1, v2, v3}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 1639
    .line 1640
    .line 1641
    sget-object v3, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 1642
    .line 1643
    invoke-static {v0, v1}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 1644
    .line 1645
    .line 1646
    invoke-virtual {v2}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B()La/fwk;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v0

    .line 1650
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v1

    .line 1654
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v1

    .line 1658
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1659
    .line 1660
    .line 1661
    invoke-virtual {v0, v1}, La/fwk;->a(Landroid/content/res/Configuration;)V

    .line 1662
    .line 1663
    .line 1664
    invoke-virtual {v2}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C()La/sn;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v0

    .line 1668
    iget-object v0, v0, La/sn;->d:Landroidx/compose/ui/platform/ComposeView;

    .line 1669
    .line 1670
    new-instance v1, La/lr3;

    .line 1671
    .line 1672
    invoke-direct {v1, v2, v14}, La/lr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V

    .line 1673
    .line 1674
    .line 1675
    new-instance v3, La/ugd;

    .line 1676
    .line 1677
    const v4, -0x56a49a3c

    .line 1678
    .line 1679
    .line 1680
    invoke-direct {v3, v4, v10, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1681
    .line 1682
    .line 1683
    invoke-static {v0, v9, v3}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 1684
    .line 1685
    .line 1686
    invoke-virtual {v2}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C()La/sn;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v0

    .line 1690
    iget-object v0, v0, La/sn;->e:Landroidx/compose/ui/platform/ComposeView;

    .line 1691
    .line 1692
    new-instance v1, La/sr1;

    .line 1693
    .line 1694
    const/16 v3, 0xe

    .line 1695
    .line 1696
    invoke-direct {v1, v2, v0, v3}, La/sr1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1697
    .line 1698
    .line 1699
    new-instance v2, La/ugd;

    .line 1700
    .line 1701
    const v3, -0x7821051e

    .line 1702
    .line 1703
    .line 1704
    invoke-direct {v2, v3, v10, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1705
    .line 1706
    .line 1707
    invoke-static {v0, v9, v2}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 1708
    .line 1709
    .line 1710
    return-void

    .line 1711
    :cond_16
    const-string v0, "navBarHolder"

    .line 1712
    .line 1713
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1714
    .line 1715
    .line 1716
    throw v9

    .line 1717
    :cond_17
    const-string v0, "dateChangeBroadcastReceiverDelegate"

    .line 1718
    .line 1719
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1720
    .line 1721
    .line 1722
    throw v9

    .line 1723
    :cond_18
    const-string v0, "navDestinations"

    .line 1724
    .line 1725
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1726
    .line 1727
    .line 1728
    throw v9

    .line 1729
    :cond_19
    const-string v0, "getThemeUseCase"

    .line 1730
    .line 1731
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1732
    .line 1733
    .line 1734
    throw v9

    .line 1735
    :cond_1a
    const-string v0, "cicerone"

    .line 1736
    .line 1737
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1738
    .line 1739
    .line 1740
    throw v9

    .line 1741
    :cond_1b
    const-string v0, "Cannot create dependency "

    .line 1742
    .line 1743
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v0

    .line 1747
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 1748
    .line 1749
    .line 1750
    return-void

    .line 1751
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onDestroy()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v1, v0, La/zu3;->E:La/z7z;

    .line 12
    .line 13
    invoke-interface {v1}, La/z7z;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, La/wpx;

    .line 18
    .line 19
    iget-object v1, v1, La/wpx;->a:La/uuy;

    .line 20
    .line 21
    iget-object v1, v1, La/uuy;->a:La/tuy;

    .line 22
    .line 23
    iget-object v1, v1, La/tuy;->c:La/p7m0;

    .line 24
    .line 25
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, La/suy;

    .line 30
    .line 31
    iget-object v1, v1, La/suy;->a:La/wuy;

    .line 32
    .line 33
    sget-object v2, La/wuy;->d:La/wuy;

    .line 34
    .line 35
    if-ne v1, v2, :cond_0

    .line 36
    .line 37
    iget-object v0, v0, La/zu3;->D:La/z7z;

    .line 38
    .line 39
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, La/iyg0;

    .line 44
    .line 45
    invoke-virtual {v0}, La/iyg0;->a()V

    .line 46
    .line 47
    .line 48
    :cond_0
    iget-object v0, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->j1:La/z7z;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    if-eqz v0, :cond_5

    .line 52
    .line 53
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, La/ldj;

    .line 58
    .line 59
    iget-object v2, v0, La/ldj;->a:La/q7x0;

    .line 60
    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-virtual {p0, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    iput-object v1, v0, La/ldj;->a:La/q7x0;

    .line 67
    .line 68
    iget-object v0, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->z1:La/md3;

    .line 69
    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 73
    .line 74
    .line 75
    iput-object v1, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->z1:La/md3;

    .line 76
    .line 77
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    iget-object v0, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->m1:La/z7z;

    .line 84
    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, La/zsr;

    .line 92
    .line 93
    invoke-virtual {v0}, La/zsr;->a()V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    const-string p0, "gameBroadcastingServiceFactory"

    .line 98
    .line 99
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v1

    .line 103
    :cond_4
    :goto_0
    invoke-super {p0}, La/yc3;->onDestroy()V

    .line 104
    .line 105
    .line 106
    iput-object v1, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->v1:La/gku0;

    .line 107
    .line 108
    return-void

    .line 109
    :cond_5
    const-string p0, "dateChangeBroadcastReceiverDelegate"

    .line 110
    .line 111
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v1
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, La/agd;->onNewIntent(Landroid/content/Intent;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/j120;->f0(La/yc3;Landroid/content/Intent;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-static {p1}, La/blx;->d(Landroid/content/Intent;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object p0, p0, La/zu3;->e:La/z7z;

    .line 22
    .line 23
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/jlx;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/jlx;->a(Landroid/content/Intent;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onPause()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, La/nu3;->a:La/nu3;

    .line 10
    .line 11
    new-instance v5, La/wt3;

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    const/4 v10, 0x0

    .line 15
    invoke-direct {v5, v0, v10, v3}, La/wt3;-><init>(La/zu3;La/yje;B)V

    .line 16
    .line 17
    .line 18
    const/16 v6, 0xe

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 23
    .line 24
    .line 25
    iget-object v1, v0, La/zu3;->y:La/z7z;

    .line 26
    .line 27
    invoke-interface {v1}, La/z7z;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, La/g390;

    .line 32
    .line 33
    iget-object v1, v1, La/g390;->a:La/pmi0;

    .line 34
    .line 35
    iget-object v1, v1, La/pmi0;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, La/lmi0;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    iput-boolean v2, v1, La/lmi0;->i:Z

    .line 41
    .line 42
    iget-object v2, v1, La/lmi0;->g:La/bby;

    .line 43
    .line 44
    invoke-static {v2}, La/v3c;->N(La/bby;)V

    .line 45
    .line 46
    .line 47
    const-wide/16 v2, 0x0

    .line 48
    .line 49
    iput-wide v2, v1, La/lmi0;->d:J

    .line 50
    .line 51
    iget-object v2, v1, La/lmi0;->b:La/vwb0;

    .line 52
    .line 53
    iget-object v1, v1, La/lmi0;->c:La/a8z;

    .line 54
    .line 55
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, La/qz40;

    .line 60
    .line 61
    check-cast v1, La/p7m0;

    .line 62
    .line 63
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/Number;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 70
    .line 71
    .line 72
    move-result-wide v3

    .line 73
    const-string v1, "SAVED_TIMER_VALUE_KEY"

    .line 74
    .line 75
    invoke-virtual {v2, v1, v3, v4}, La/vwb0;->g(Ljava/lang/String;J)V

    .line 76
    .line 77
    .line 78
    iget-object v1, v0, La/zu3;->p0:La/bby;

    .line 79
    .line 80
    if-eqz v1, :cond_0

    .line 81
    .line 82
    invoke-interface {v1, v10}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 83
    .line 84
    .line 85
    :cond_0
    iget-object v1, v0, La/zu3;->o0:La/bby;

    .line 86
    .line 87
    if-eqz v1, :cond_1

    .line 88
    .line 89
    invoke-interface {v1, v10}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 90
    .line 91
    .line 92
    :cond_1
    iget-object v0, v0, La/zu3;->n0:La/bby;

    .line 93
    .line 94
    if-eqz v0, :cond_2

    .line 95
    .line 96
    invoke-interface {v0, v10}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    sget-object v0, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 100
    .line 101
    invoke-static {}, La/xf0;->N()Lorg/platform/app/ApplicationLoader;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v0, v0, Lorg/platform/app/ApplicationLoader;->z:La/ejc;

    .line 106
    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    iget-object v0, v0, La/ejc;->a:La/i1w0;

    .line 110
    .line 111
    iget-object v0, v0, La/i1w0;->a:La/cu;

    .line 112
    .line 113
    iput-object v10, v0, La/cu;->b:Ljava/lang/Object;

    .line 114
    .line 115
    iget-object v0, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->l1:La/z7z;

    .line 116
    .line 117
    if-eqz v0, :cond_3

    .line 118
    .line 119
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, La/oeg0;

    .line 124
    .line 125
    sget-object v1, La/dhg0;->a:La/dhg0;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object v0, v0, La/oeg0;->a:Ljava/util/LinkedHashMap;

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    invoke-super {p0}, La/kxq;->onPause()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    invoke-virtual {p0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iget-object p0, v8, La/zu3;->g:La/mne;

    .line 155
    .line 156
    iget-object v3, p0, La/mne;->b:La/dvj;

    .line 157
    .line 158
    sget-object v1, La/yu3;->a:La/yu3;

    .line 159
    .line 160
    new-instance v4, La/wz0;

    .line 161
    .line 162
    const/4 v11, 0x1

    .line 163
    move-object v6, v4

    .line 164
    invoke-direct/range {v6 .. v11}, La/wz0;-><init>(ZLa/diu0;ZLa/yje;B)V

    .line 165
    .line 166
    .line 167
    const/16 v5, 0xa

    .line 168
    .line 169
    const/4 v2, 0x0

    .line 170
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_3
    const-string p0, "rootRouterHolder"

    .line 175
    .line 176
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v10

    .line 180
    :cond_4
    const-string p0, "cicerone"

    .line 181
    .line 182
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v10
.end method

.method public final onResume()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super {v0}, La/kxq;->onResume()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->I(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->l1:La/z7z;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_8

    .line 14
    .line 15
    invoke-interface {v2}, La/z7z;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, La/oeg0;

    .line 20
    .line 21
    sget-object v4, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 22
    .line 23
    invoke-static {}, La/xf0;->N()Lorg/platform/app/ApplicationLoader;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-object v4, v4, Lorg/platform/app/ApplicationLoader;->z:La/ejc;

    .line 28
    .line 29
    const-string v5, "cicerone"

    .line 30
    .line 31
    if-eqz v4, :cond_7

    .line 32
    .line 33
    iget-object v4, v4, La/ejc;->a:La/i1w0;

    .line 34
    .line 35
    sget-object v6, La/dhg0;->a:La/dhg0;

    .line 36
    .line 37
    invoke-virtual {v2, v6, v4}, La/oeg0;->a(La/ihg0;La/i1w0;)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, La/xf0;->N()Lorg/platform/app/ApplicationLoader;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v2, v2, Lorg/platform/app/ApplicationLoader;->z:La/ejc;

    .line 45
    .line 46
    if-eqz v2, :cond_6

    .line 47
    .line 48
    iget-object v2, v2, La/ejc;->a:La/i1w0;

    .line 49
    .line 50
    iget-object v2, v2, La/i1w0;->a:La/cu;

    .line 51
    .line 52
    iget-object v4, v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->x1:La/a8z;

    .line 53
    .line 54
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, La/rs3;

    .line 59
    .line 60
    invoke-virtual {v2, v4}, La/cu;->q(La/rs3;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->y1:Ljava/lang/Integer;

    .line 64
    .line 65
    if-eqz v2, :cond_0

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-virtual {v0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C()La/sn;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    iget-object v4, v4, La/sn;->b:Landroid/widget/FrameLayout;

    .line 76
    .line 77
    new-instance v5, Landroid/graphics/drawable/ColorDrawable;

    .line 78
    .line 79
    invoke-direct {v5, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    new-instance v5, Landroid/graphics/drawable/ColorDrawable;

    .line 90
    .line 91
    invoke-direct {v5, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v5}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 95
    .line 96
    .line 97
    :cond_0
    sget-object v2, La/rdj;->a:La/rdj;

    .line 98
    .line 99
    iget-object v2, v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->t1:La/z7z;

    .line 100
    .line 101
    if-eqz v2, :cond_5

    .line 102
    .line 103
    invoke-interface {v2}, La/z7z;->get()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, La/ctf0;

    .line 108
    .line 109
    invoke-virtual {v2}, La/ctf0;->h()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    invoke-static {v2}, La/rdj;->l(Z)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget-object v2, v0, La/zu3;->i:La/z7z;

    .line 121
    .line 122
    invoke-interface {v2}, La/z7z;->get()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    check-cast v2, La/zgk;

    .line 127
    .line 128
    iget-object v4, v2, La/zgk;->a:La/kt2;

    .line 129
    .line 130
    iget-object v2, v2, La/zgk;->b:La/tgk;

    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    new-instance v5, Landroid/content/res/Configuration;

    .line 136
    .line 137
    iget-object v2, v2, La/tgk;->a:La/us00;

    .line 138
    .line 139
    invoke-virtual {v2}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    if-eqz v2, :cond_1

    .line 144
    .line 145
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    goto :goto_0

    .line 150
    :cond_1
    move-object v2, v3

    .line 151
    :goto_0
    invoke-direct {v5, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 152
    .line 153
    .line 154
    iget v2, v5, Landroid/content/res/Configuration;->fontScale:F

    .line 155
    .line 156
    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    const-string v5, "setting_font_size"

    .line 161
    .line 162
    invoke-interface {v4, v5, v2}, La/kt2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 166
    .line 167
    .line 168
    move-result-wide v4

    .line 169
    sget-wide v6, La/zu3;->r0:J

    .line 170
    .line 171
    sub-long/2addr v4, v6

    .line 172
    sget-wide v6, La/zu3;->q0:J

    .line 173
    .line 174
    invoke-static {v6, v7}, La/wen;->e(J)J

    .line 175
    .line 176
    .line 177
    move-result-wide v8

    .line 178
    cmp-long v2, v4, v8

    .line 179
    .line 180
    const/4 v8, 0x3

    .line 181
    if-ltz v2, :cond_2

    .line 182
    .line 183
    const-wide/16 v1, 0x0

    .line 184
    .line 185
    invoke-virtual {v0, v1, v2}, La/zu3;->A(J)V

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_2
    iget-object v2, v0, La/zu3;->o0:La/bby;

    .line 190
    .line 191
    if-eqz v2, :cond_3

    .line 192
    .line 193
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    const/4 v9, 0x1

    .line 198
    if-ne v2, v9, :cond_3

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_3
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    invoke-static {v6, v7}, La/wen;->e(J)J

    .line 206
    .line 207
    .line 208
    move-result-wide v6

    .line 209
    sub-long v11, v6, v4

    .line 210
    .line 211
    new-instance v15, La/or3;

    .line 212
    .line 213
    invoke-direct {v15, v8}, La/or3;-><init>(B)V

    .line 214
    .line 215
    .line 216
    new-instance v2, La/wt3;

    .line 217
    .line 218
    invoke-direct {v2, v0, v3, v1}, La/wt3;-><init>(La/zu3;La/yje;B)V

    .line 219
    .line 220
    .line 221
    const/16 v17, 0x24

    .line 222
    .line 223
    sget-object v13, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 224
    .line 225
    const/4 v14, 0x0

    .line 226
    move-object/from16 v16, v2

    .line 227
    .line 228
    invoke-static/range {v10 .. v17}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    iput-object v1, v0, La/zu3;->o0:La/bby;

    .line 233
    .line 234
    :goto_1
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    sget-object v10, La/ou3;->a:La/ou3;

    .line 239
    .line 240
    new-instance v13, La/wt3;

    .line 241
    .line 242
    invoke-direct {v13, v0, v3, v8}, La/wt3;-><init>(La/zu3;La/yje;B)V

    .line 243
    .line 244
    .line 245
    const/16 v14, 0xe

    .line 246
    .line 247
    const/4 v11, 0x0

    .line 248
    const/4 v12, 0x0

    .line 249
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 250
    .line 251
    .line 252
    iget-object v1, v0, La/zu3;->z:La/z7z;

    .line 253
    .line 254
    invoke-interface {v1}, La/z7z;->get()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    check-cast v1, La/iqt;

    .line 259
    .line 260
    iget-object v1, v1, La/iqt;->a:La/gst0;

    .line 261
    .line 262
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-eqz v1, :cond_4

    .line 267
    .line 268
    iget-object v1, v0, La/zu3;->x:La/z7z;

    .line 269
    .line 270
    invoke-interface {v1}, La/z7z;->get()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    check-cast v1, La/imt0;

    .line 275
    .line 276
    iget-object v1, v1, La/imt0;->a:La/pmi0;

    .line 277
    .line 278
    iget-object v1, v1, La/pmi0;->a:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v1, La/lmi0;

    .line 281
    .line 282
    invoke-virtual {v1}, La/lmi0;->c()V

    .line 283
    .line 284
    .line 285
    goto :goto_2

    .line 286
    :cond_4
    iget-object v1, v0, La/zu3;->w:La/z7z;

    .line 287
    .line 288
    invoke-interface {v1}, La/z7z;->get()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    check-cast v1, La/xrc;

    .line 293
    .line 294
    invoke-virtual {v1}, La/xrc;->a()V

    .line 295
    .line 296
    .line 297
    :goto_2
    iget-object v0, v0, La/zu3;->j:La/z7z;

    .line 298
    .line 299
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    check-cast v0, La/sqx;

    .line 304
    .line 305
    invoke-virtual {v0}, La/sqx;->a()V

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :cond_5
    const-string v0, "resourceManager"

    .line 310
    .line 311
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw v3

    .line 315
    :cond_6
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw v3

    .line 319
    :cond_7
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    throw v3

    .line 323
    :cond_8
    const-string v0, "rootRouterHolder"

    .line 324
    .line 325
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    throw v3
.end method

.method public final onStart()V
    .locals 8

    .line 1
    invoke-super {p0}, La/yc3;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, v0, La/zu3;->g:La/mne;

    .line 13
    .line 14
    iget-object v4, v2, La/mne;->b:La/dvj;

    .line 15
    .line 16
    sget-object v2, La/gu3;->a:La/gu3;

    .line 17
    .line 18
    new-instance v5, La/hu3;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    invoke-direct {v5, v0, v7, v3}, La/hu3;-><init>(La/diu0;La/yje;B)V

    .line 23
    .line 24
    .line 25
    const/16 v6, 0xa

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v1, p0, La/zu3;->g:La/mne;

    .line 40
    .line 41
    iget-object v3, v1, La/mne;->b:La/dvj;

    .line 42
    .line 43
    sget-object v1, La/fu3;->a:La/fu3;

    .line 44
    .line 45
    new-instance v4, La/wt3;

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    invoke-direct {v4, p0, v7, v2}, La/wt3;-><init>(La/zu3;La/yje;B)V

    .line 49
    .line 50
    .line 51
    const/16 v5, 0xa

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final t()La/hd3;
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->v1:La/gku0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-super {p0}, La/yc3;->t()La/hd3;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v1, La/gku0;

    .line 14
    .line 15
    new-instance v2, La/hny;

    .line 16
    .line 17
    const/4 v3, 0x7

    .line 18
    invoke-direct {v2, v3}, La/hny;-><init>(B)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v0, p0, v2}, La/gku0;-><init>(La/hd3;Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/hny;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->v1:La/gku0;

    .line 25
    .line 26
    return-object v1
.end method

.method public final u(ILa/fet;)V
    .locals 5

    .line 1
    const v0, 0x3b43f29b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    or-int/2addr v0, p1

    .line 18
    and-int/lit8 v2, v0, 0x3

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    if-eq v2, v1, :cond_1

    .line 23
    .line 24
    move v1, v4

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v1, v3

    .line 27
    :goto_1
    and-int/2addr v0, v4

    .line 28
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    invoke-virtual {p2, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    sget-object v1, La/ukd;->a:La/cl5;

    .line 47
    .line 48
    if-ne v2, v1, :cond_3

    .line 49
    .line 50
    :cond_2
    new-instance v2, La/sr3;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-direct {v2, p0, v1, v3}, La/sr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;La/yje;B)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 60
    .line 61
    invoke-static {p2, v0, v2}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    invoke-virtual {p2}, La/fet;->X()V

    .line 66
    .line 67
    .line 68
    :goto_2
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    if-eqz p2, :cond_5

    .line 73
    .line 74
    new-instance v0, La/lr3;

    .line 75
    .line 76
    const/4 v1, 0x3

    .line 77
    invoke-direct {v0, p0, p1, v1}, La/lr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;IB)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 81
    .line 82
    :cond_5
    return-void
.end method

.method public final v(ILa/fet;)V
    .locals 12

    .line 1
    const v0, 0x5212fa7a

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    or-int/2addr v0, p1

    .line 18
    and-int/lit8 v2, v0, 0x3

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    if-eq v2, v1, :cond_1

    .line 22
    .line 23
    move v1, v3

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    :goto_1
    and-int/2addr v0, v3

    .line 27
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    sget-object v0, La/bmd;->h:La/zfn;

    .line 34
    .line 35
    invoke-virtual {p2, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    move-object v5, v0

    .line 40
    check-cast v5, La/w6k;

    .line 41
    .line 42
    sget-object v0, La/djv0;->w:Ljava/util/WeakHashMap;

    .line 43
    .line 44
    invoke-static {p2}, La/zcm0;->i(La/fet;)La/djv0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v6, v0, La/djv0;->f:La/q33;

    .line 49
    .line 50
    invoke-static {p2}, La/zcm0;->i(La/fet;)La/djv0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v7, v0, La/djv0;->e:La/q33;

    .line 55
    .line 56
    invoke-static {p2}, La/zcm0;->i(La/fet;)La/djv0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v8, v0, La/djv0;->b:La/q33;

    .line 61
    .line 62
    invoke-virtual {p2, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-virtual {p2, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    or-int/2addr v0, v1

    .line 71
    invoke-virtual {p2, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    or-int/2addr v0, v1

    .line 76
    invoke-virtual {p2, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    or-int/2addr v0, v1

    .line 81
    invoke-virtual {p2, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    or-int/2addr v0, v1

    .line 86
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-nez v0, :cond_3

    .line 91
    .line 92
    sget-object v0, La/ukd;->a:La/cl5;

    .line 93
    .line 94
    if-ne v1, v0, :cond_2

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_2
    move-object v9, p0

    .line 98
    goto :goto_3

    .line 99
    :cond_3
    :goto_2
    new-instance v4, La/wn2;

    .line 100
    .line 101
    const/4 v10, 0x0

    .line 102
    const/4 v11, 0x3

    .line 103
    move-object v9, p0

    .line 104
    invoke-direct/range {v4 .. v11}, La/wn2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    move-object v1, v4

    .line 111
    :goto_3
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 112
    .line 113
    invoke-static {p2, v5, v1}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_4
    move-object v9, p0

    .line 118
    invoke-virtual {p2}, La/fet;->X()V

    .line 119
    .line 120
    .line 121
    :goto_4
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    if-eqz p0, :cond_5

    .line 126
    .line 127
    new-instance p2, La/lr3;

    .line 128
    .line 129
    invoke-direct {p2, v9, p1, v3}, La/lr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;IB)V

    .line 130
    .line 131
    .line 132
    iput-object p2, p0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 133
    .line 134
    :cond_5
    return-void
.end method

.method public final w(ILa/fet;)V
    .locals 5

    .line 1
    const v0, 0xe770ade

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    or-int/2addr v0, p1

    .line 18
    and-int/lit8 v2, v0, 0x3

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    if-eq v2, v1, :cond_1

    .line 23
    .line 24
    move v1, v4

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v1, v3

    .line 27
    :goto_1
    and-int/2addr v0, v4

    .line 28
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    sget-object v0, La/dy2;->f:La/zfn;

    .line 35
    .line 36
    invoke-virtual {p2, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Landroid/view/View;

    .line 41
    .line 42
    invoke-virtual {p2, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-virtual {p2, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    or-int/2addr v1, v2

    .line 51
    const/16 v2, 0x8

    .line 52
    .line 53
    invoke-virtual {p2, v2}, La/fet;->e(I)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    or-int/2addr v1, v2

    .line 58
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-nez v1, :cond_2

    .line 63
    .line 64
    sget-object v1, La/ukd;->a:La/cl5;

    .line 65
    .line 66
    if-ne v2, v1, :cond_3

    .line 67
    .line 68
    :cond_2
    new-instance v2, La/df1;

    .line 69
    .line 70
    const/16 v1, 0x1d

    .line 71
    .line 72
    invoke-direct {v2, v0, p0, v1}, La/df1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 79
    .line 80
    invoke-static {v0, v2, p2}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    invoke-virtual {p2}, La/fet;->X()V

    .line 85
    .line 86
    .line 87
    :goto_2
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    if-eqz p2, :cond_5

    .line 92
    .line 93
    new-instance v0, La/lr3;

    .line 94
    .line 95
    invoke-direct {v0, p0, p1, v3}, La/lr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;IB)V

    .line 96
    .line 97
    .line 98
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 99
    .line 100
    :cond_5
    return-void
.end method
