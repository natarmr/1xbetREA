.class public La/mi70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/coroutines/f;
.implements La/ylx;


# direct methods
.method public static c(La/i7a;Ljava/lang/String;Landroidx/fragment/app/e;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "PictureCaptchaDialogFragment"

    .line 5
    .line 6
    invoke-virtual {p2, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, La/et90;

    .line 13
    .line 14
    invoke-direct {v1}, La/et90;-><init>()V

    .line 15
    .line 16
    .line 17
    sget-object v2, La/et90;->k2:[La/iiy;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    aget-object v4, v2, v3

    .line 21
    .line 22
    iget-object v5, v1, La/et90;->g2:La/yzn0;

    .line 23
    .line 24
    invoke-virtual {v5, v1, v4, p0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    aget-object p0, v2, p0

    .line 29
    .line 30
    iget-object v2, v1, La/et90;->h2:La/phf0;

    .line 31
    .line 32
    invoke-virtual {v2, v1, p0, p1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v3}, La/sik;->E0(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p2, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Rect;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p2, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 10
    .line 11
    iget p0, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, v0, v0, p2, p0}, Landroid/graphics/Rect;->set(IIII)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public b(La/rmb0;II)V
    .locals 0

    .line 1
    return-void
.end method
