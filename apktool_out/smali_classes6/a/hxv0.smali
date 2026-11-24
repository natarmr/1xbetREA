.class public abstract La/hxv0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/WeakHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/hxv0;->a:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Landroid/view/Window;)V
    .locals 11

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    if-ge v0, v1, :cond_4

    .line 6
    .line 7
    sget-object v1, La/hxv0;->a:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/16 v3, 0x1d

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    if-nez v2, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 26
    .line 27
    and-int/2addr v2, v5

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    move v2, v6

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v2, v4

    .line 33
    :goto_0
    new-instance v7, La/gxv0;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/Window;->getStatusBarColor()I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    invoke-virtual {p0}, Landroid/view/Window;->getNavigationBarColor()I

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    if-lt v0, v3, :cond_1

    .line 44
    .line 45
    invoke-static {p0}, La/crv0;->f(Landroid/view/Window;)Z

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const/4 v10, 0x0

    .line 55
    :goto_1
    xor-int/2addr v2, v6

    .line 56
    invoke-direct {v7, v8, v9, v10, v2}, La/gxv0;-><init>(IILjava/lang/Boolean;Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p0, v7}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-object v2, v7

    .line 63
    :cond_2
    check-cast v2, La/gxv0;

    .line 64
    .line 65
    iget v1, v2, La/gxv0;->e:I

    .line 66
    .line 67
    add-int/2addr v1, v6

    .line 68
    iput v1, v2, La/gxv0;->e:I

    .line 69
    .line 70
    iget-boolean v1, v2, La/gxv0;->d:Z

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-virtual {p0, v5}, Landroid/view/Window;->addFlags(I)V

    .line 75
    .line 76
    .line 77
    :cond_3
    invoke-virtual {p0, v4}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v4}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 81
    .line 82
    .line 83
    if-lt v0, v3, :cond_4

    .line 84
    .line 85
    invoke-static {p0}, La/y5a;->r(Landroid/view/Window;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    return-void
.end method

.method public static b(Landroid/view/Window;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x23

    .line 7
    .line 8
    if-ge v0, v1, :cond_3

    .line 9
    .line 10
    sget-object v1, La/hxv0;->a:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, La/gxv0;

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget v3, v2, La/gxv0;->e:I

    .line 22
    .line 23
    add-int/lit8 v3, v3, -0x1

    .line 24
    .line 25
    iput v3, v2, La/gxv0;->e:I

    .line 26
    .line 27
    if-gtz v3, :cond_3

    .line 28
    .line 29
    iget v3, v2, La/gxv0;->a:I

    .line 30
    .line 31
    invoke-virtual {p0, v3}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 32
    .line 33
    .line 34
    iget v3, v2, La/gxv0;->b:I

    .line 35
    .line 36
    invoke-virtual {p0, v3}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 37
    .line 38
    .line 39
    const/16 v3, 0x1d

    .line 40
    .line 41
    if-lt v0, v3, :cond_1

    .line 42
    .line 43
    iget-object v0, v2, La/gxv0;->c:Ljava/lang/Boolean;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-static {p0, v0}, La/crv0;->d(Landroid/view/Window;Z)V

    .line 52
    .line 53
    .line 54
    :cond_1
    iget-boolean v0, v2, La/gxv0;->d:Z

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    const/high16 v0, -0x80000000

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :cond_3
    :goto_0
    return-void
.end method
