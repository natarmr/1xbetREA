.class public final La/std;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ub00;
.implements La/giu0;
.implements La/qbw;


# direct methods
.method public constructor <init>(La/epi0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static e(I)La/j1g;
    .locals 3

    .line 1
    sget-object v0, La/j1g;->h:La/c0o;

    .line 2
    .line 3
    invoke-static {v0, v0}, La/ohs0;->h(La/c0o;La/c0o;)La/y2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, La/y2;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, La/y2;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, La/j1g;

    .line 19
    .line 20
    iget v2, v2, La/j1g;->a:I

    .line 21
    .line 22
    if-ne v2, p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    :goto_0
    check-cast v1, La/j1g;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    sget-object p0, La/j1g;->f:La/j1g;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    return-object v1
.end method

.method public static f(Landroid/content/res/TypedArray;)La/b5i;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/b5i;->b:La/b5i;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/16 v2, 0x23

    .line 8
    .line 9
    invoke-virtual {p0, v2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    sget-object v0, La/b5i;->c:La/b5i;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    if-ne p0, v1, :cond_1

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    sget-object v0, La/b5i;->d:La/b5i;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-ne p0, v1, :cond_2

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_2
    sget-object v0, La/b5i;->e:La/b5i;

    .line 29
    .line 30
    const/4 v1, 0x3

    .line 31
    if-ne p0, v1, :cond_3

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_3
    sget-object v0, La/b5i;->f:La/b5i;

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    if-ne p0, v1, :cond_4

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_4
    sget-object v0, La/b5i;->g:La/b5i;

    .line 41
    .line 42
    const/4 v1, 0x5

    .line 43
    if-ne p0, v1, :cond_5

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_5
    const-string v0, "Unknown style value: "

    .line 47
    .line 48
    invoke-static {p0, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method

.method public static g(II)La/vkq0;
    .locals 3

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, La/uhq0;->a:La/uhq0;

    .line 10
    .line 11
    new-instance v0, Lkotlin/Pair;

    .line 12
    .line 13
    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    if-ne p0, v0, :cond_1

    .line 18
    .line 19
    sget-object p0, La/uhq0;->b:La/uhq0;

    .line 20
    .line 21
    new-instance v0, Lkotlin/Pair;

    .line 22
    .line 23
    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v2, 0x1

    .line 28
    if-gt v2, p0, :cond_2

    .line 29
    .line 30
    const/16 v2, 0xd

    .line 31
    .line 32
    if-ge p0, v2, :cond_2

    .line 33
    .line 34
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    sget-object v0, La/uhq0;->a:La/uhq0;

    .line 39
    .line 40
    new-instance v1, Lkotlin/Pair;

    .line 41
    .line 42
    invoke-direct {v1, p0, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    move-object v0, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    if-gt v0, p0, :cond_3

    .line 48
    .line 49
    const/16 v2, 0x18

    .line 50
    .line 51
    if-ge p0, v2, :cond_3

    .line 52
    .line 53
    sub-int/2addr p0, v0

    .line 54
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    sget-object v0, La/uhq0;->b:La/uhq0;

    .line 59
    .line 60
    new-instance v1, Lkotlin/Pair;

    .line 61
    .line 62
    invoke-direct {v1, p0, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    sget-object p0, La/uhq0;->a:La/uhq0;

    .line 67
    .line 68
    new-instance v0, Lkotlin/Pair;

    .line 69
    .line 70
    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :goto_1
    iget-object p0, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, Ljava/lang/Number;

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, La/uhq0;

    .line 84
    .line 85
    new-instance v1, La/vkq0;

    .line 86
    .line 87
    invoke-direct {v1, p0, p1, v0}, La/vkq0;-><init>(IILa/uhq0;)V

    .line 88
    .line 89
    .line 90
    return-object v1
.end method

.method public static h(Landroidx/fragment/app/e;La/n3w;D)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/oyd;

    .line 5
    .line 6
    invoke-direct {v0}, La/oyd;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v1, La/oyd;->l2:[La/iiy;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    aget-object v2, v1, v2

    .line 13
    .line 14
    iget-object v3, v0, La/oyd;->e2:La/yzn0;

    .line 15
    .line 16
    invoke-virtual {v3, v0, v2, p1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    aget-object p1, v1, p1

    .line 21
    .line 22
    iget-object v2, v0, La/oyd;->f2:La/chf0;

    .line 23
    .line 24
    invoke-virtual {v2, v0, p1, p2, p3}, La/chf0;->f0(Landroidx/fragment/app/Fragment;La/iiy;D)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x2

    .line 28
    aget-object p1, v1, p1

    .line 29
    .line 30
    iget-object p2, v0, La/oyd;->g2:La/phf0;

    .line 31
    .line 32
    const-string p3, "REQUEST_CONFIRM_SALE_DIALOG_KEY"

    .line 33
    .line 34
    invoke-virtual {p2, v0, p1, p3}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string p1, "ConfirmSaleDialog"

    .line 38
    .line 39
    invoke-virtual {v0, p0, p1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public a()La/lq80;
    .locals 2

    .line 1
    new-instance p0, La/pbw;

    .line 2
    .line 3
    sget-object v0, La/mbw;->o:La/mbw;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, v0, v1}, La/pbw;-><init>(La/mbw;La/ibw;)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public b(La/mbw;La/ibw;)La/lq80;
    .locals 0

    .line 1
    new-instance p0, La/pbw;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, La/pbw;-><init>(La/mbw;La/ibw;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public c(Ljava/lang/Object;)La/diu0;
    .locals 0

    .line 1
    check-cast p1, La/i1w0;

    .line 2
    .line 3
    new-instance p0, La/q890;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, La/w46;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public d(Landroid/view/View;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const v1, 0x310888    # 4.503E-39f

    .line 29
    .line 30
    .line 31
    if-eq v0, v1, :cond_1

    .line 32
    .line 33
    const v1, 0x5f008eb

    .line 34
    .line 35
    .line 36
    if-eq v0, v1, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const-string v0, "https"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const-string v0, "http"

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    :goto_0
    invoke-static {p0, p2}, La/vic;->C(Landroid/content/Context;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    :goto_1
    const-string p1, "ConsultantLinkResolver"

    .line 62
    .line 63
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 64
    .line 65
    const-string v1, "android.intent.action.VIEW"

    .line 66
    .line 67
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :catch_0
    move-exception p0

    .line 82
    goto :goto_2

    .line 83
    :catch_1
    move-exception p0

    .line 84
    goto :goto_3

    .line 85
    :goto_2
    const-string v0, "Access denied to handle link: "

    .line 86
    .line 87
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-static {p1, p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 92
    .line 93
    .line 94
    goto :goto_4

    .line 95
    :goto_3
    const-string v0, "No activity to handle link: "

    .line 96
    .line 97
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-static {p1, p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 102
    .line 103
    .line 104
    :goto_4
    return-void
.end method
