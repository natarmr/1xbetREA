.class public final La/evz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ub00;
.implements La/wlu0;
.implements La/ept0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static c(I)La/d270;
    .locals 3

    .line 1
    sget-object v0, La/d270;->l:La/c0o;

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
    check-cast v2, La/d270;

    .line 19
    .line 20
    iget v2, v2, La/d270;->a:I

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
    check-cast v1, La/d270;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    sget-object p0, La/d270;->j:La/d270;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    return-object v1
.end method

.method public static f(J)La/r760;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p0, La/r760;->b:La/r760;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-wide/16 v0, 0x1

    .line 11
    .line 12
    cmp-long v0, p0, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    sget-object p0, La/r760;->c:La/r760;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    const-wide/16 v0, 0x2

    .line 20
    .line 21
    cmp-long v0, p0, v0

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    sget-object p0, La/r760;->d:La/r760;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    const-wide/16 v0, 0x3

    .line 29
    .line 30
    cmp-long v0, p0, v0

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    sget-object p0, La/r760;->e:La/r760;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    const-wide/16 v0, 0x5

    .line 38
    .line 39
    cmp-long v0, p0, v0

    .line 40
    .line 41
    if-eqz v0, :cond_b

    .line 42
    .line 43
    const-wide/16 v0, 0xd

    .line 44
    .line 45
    cmp-long v0, p0, v0

    .line 46
    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    const-wide/16 v0, 0x6

    .line 51
    .line 52
    cmp-long v0, p0, v0

    .line 53
    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    sget-object p0, La/r760;->g:La/r760;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_5
    const-wide/16 v0, 0x7

    .line 60
    .line 61
    cmp-long v0, p0, v0

    .line 62
    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    sget-object p0, La/r760;->h:La/r760;

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_6
    const-wide/16 v0, 0x8

    .line 69
    .line 70
    cmp-long v0, p0, v0

    .line 71
    .line 72
    if-nez v0, :cond_7

    .line 73
    .line 74
    sget-object p0, La/r760;->i:La/r760;

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_7
    const-wide/16 v0, 0x9

    .line 78
    .line 79
    cmp-long v0, p0, v0

    .line 80
    .line 81
    if-nez v0, :cond_8

    .line 82
    .line 83
    sget-object p0, La/r760;->j:La/r760;

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_8
    const-wide/16 v0, 0xa

    .line 87
    .line 88
    cmp-long v0, p0, v0

    .line 89
    .line 90
    if-nez v0, :cond_9

    .line 91
    .line 92
    sget-object p0, La/r760;->k:La/r760;

    .line 93
    .line 94
    return-object p0

    .line 95
    :cond_9
    const-wide/16 v0, 0xb

    .line 96
    .line 97
    cmp-long p0, p0, v0

    .line 98
    .line 99
    if-nez p0, :cond_a

    .line 100
    .line 101
    sget-object p0, La/r760;->l:La/r760;

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_a
    sget-object p0, La/r760;->m:La/r760;

    .line 105
    .line 106
    return-object p0

    .line 107
    :cond_b
    :goto_0
    sget-object p0, La/r760;->f:La/r760;

    .line 108
    .line 109
    return-object p0
.end method

.method public static g(Lorg/xplatform/uikit/components/dialog/DialogFields;ZZZ)La/tx00;
    .locals 4

    .line 1
    new-instance v0, La/tx00;

    .line 2
    .line 3
    invoke-direct {v0}, La/tx00;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, La/u0i;->R0(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lorg/xplatform/uikit/components/dialog/DialogFields;->f:Ljava/lang/String;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const-string p0, ""

    .line 14
    .line 15
    :cond_0
    sget-object v1, La/tx00;->m2:[La/iiy;

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    aget-object v2, v1, v2

    .line 19
    .line 20
    iget-object v3, v0, La/tx00;->k2:La/phf0;

    .line 21
    .line 22
    invoke-virtual {v3, v0, v2, p0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    aget-object p0, v1, p0

    .line 27
    .line 28
    iget-object v2, v0, La/tx00;->h2:La/cgx0;

    .line 29
    .line 30
    invoke-virtual {v2, v0, p0, p1}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    aget-object p0, v1, p0

    .line 35
    .line 36
    iget-object p1, v0, La/tx00;->i2:La/cgx0;

    .line 37
    .line 38
    invoke-virtual {p1, v0, p0, p2}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x2

    .line 42
    aget-object p0, v1, p0

    .line 43
    .line 44
    iget-object p1, v0, La/tx00;->j2:La/cgx0;

    .line 45
    .line 46
    invoke-virtual {p1, v0, p0, p3}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 0

    .line 1
    const p0, 0x7f0a1427

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public b()La/wy40;
    .locals 0

    .line 1
    invoke-static {}, La/wy40;->l()La/wy40;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public d(Landroid/view/View;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v0, "https"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v0, Landroid/content/Intent;

    .line 34
    .line 35
    const-string v1, "android.intent.action.VIEW"

    .line 36
    .line 37
    invoke-direct {v0, v1, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 38
    .line 39
    .line 40
    const-string p0, "com.android.browser.application_id"

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 47
    .line 48
    .line 49
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :catch_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string p1, "Actvity was not found for the link: \'"

    .line 56
    .line 57
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p1, "\'"

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const-string p1, "LinkResolverDef"

    .line 73
    .line 74
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public e()La/fpt0;
    .locals 0

    .line 1
    new-instance p0, La/zd40;

    .line 2
    .line 3
    invoke-direct {p0}, La/zd40;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
