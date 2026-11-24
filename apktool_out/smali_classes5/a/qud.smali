.class public final La/qud;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;
.implements La/u1j0;


# direct methods
.method public static b(La/j6m0;)La/lwi0;
    .locals 10

    .line 1
    new-instance v3, La/x860;

    .line 2
    .line 3
    const/16 p0, 0x8

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-direct {v3, p0, v0}, La/x860;-><init>(IZ)V

    .line 7
    .line 8
    .line 9
    new-instance v4, La/c34;

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    invoke-direct {v4, p0, v0, v0}, La/c34;-><init>(ZZZ)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    const-wide/32 v5, 0x36ee80

    .line 20
    .line 21
    .line 22
    add-long v1, v0, v5

    .line 23
    .line 24
    new-instance v0, La/lwi0;

    .line 25
    .line 26
    const-wide/high16 v5, 0x4024000000000000L    # 10.0

    .line 27
    .line 28
    const-wide v7, 0x3ff3333333333333L    # 1.2

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    const/16 v9, 0x3c

    .line 34
    .line 35
    invoke-direct/range {v0 .. v9}, La/lwi0;-><init>(JLa/x860;La/c34;DDI)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public static c(Ljava/lang/Integer;)La/boh;
    .locals 4

    .line 1
    sget-object v0, La/boh;->f:La/c0o;

    .line 2
    .line 3
    invoke-static {v0, v0}, La/ohs0;->h(La/c0o;La/c0o;)La/y2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-virtual {v0}, La/y2;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_2

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
    check-cast v2, La/boh;

    .line 19
    .line 20
    iget v2, v2, La/boh;->a:I

    .line 21
    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-ne v2, v3, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const/4 v1, 0x0

    .line 33
    :goto_1
    check-cast v1, La/boh;

    .line 34
    .line 35
    if-nez v1, :cond_3

    .line 36
    .line 37
    sget-object p0, La/boh;->c:La/boh;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_3
    return-object v1
.end method

.method public static d(Ljava/lang/Integer;Ljava/lang/Boolean;)La/boh;
    .locals 4

    .line 1
    sget-object v0, La/boh;->f:La/c0o;

    .line 2
    .line 3
    invoke-static {v0, v0}, La/ohs0;->h(La/c0o;La/c0o;)La/y2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-virtual {v0}, La/y2;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_2

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
    check-cast v2, La/boh;

    .line 19
    .line 20
    iget v2, v2, La/boh;->a:I

    .line 21
    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-ne v2, v3, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const/4 v1, 0x0

    .line 33
    :goto_1
    check-cast v1, La/boh;

    .line 34
    .line 35
    if-nez v1, :cond_4

    .line 36
    .line 37
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_3

    .line 44
    .line 45
    sget-object p0, La/boh;->d:La/boh;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_3
    sget-object p0, La/boh;->c:La/boh;

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_4
    return-object v1
.end method

.method public static e(I)La/e4f;
    .locals 0

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    sget-object p0, La/e4f;->b:La/e4f;

    .line 5
    .line 6
    return-object p0

    .line 7
    :pswitch_0
    sget-object p0, La/e4f;->j:La/e4f;

    .line 8
    .line 9
    return-object p0

    .line 10
    :pswitch_1
    sget-object p0, La/e4f;->i:La/e4f;

    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_2
    sget-object p0, La/e4f;->h:La/e4f;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_3
    sget-object p0, La/e4f;->g:La/e4f;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_4
    sget-object p0, La/e4f;->f:La/e4f;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_5
    sget-object p0, La/e4f;->e:La/e4f;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_6
    sget-object p0, La/e4f;->d:La/e4f;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_7
    sget-object p0, La/e4f;->c:La/e4f;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_data_0
    .packed-switch 0x1
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

.method public static f(La/anq0;)La/gmq;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/anq0;->h:La/znq0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, La/anq0;->i:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, La/eu4;

    .line 14
    .line 15
    const/16 v1, 0xc

    .line 16
    .line 17
    invoke-direct {v0, p0, v1}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    :goto_0
    new-instance v0, La/yg1;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x7

    .line 25
    invoke-direct {v0, p0, v1, v2}, La/yg1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 26
    .line 27
    .line 28
    const-wide/16 v1, 0x1

    .line 29
    .line 30
    sget-object p0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 31
    .line 32
    invoke-static {v1, v2, p0, v0}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public static g(ILa/we50;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance v0, La/pud;

    .line 23
    .line 24
    move v1, p0

    .line 25
    move-object v2, p1

    .line 26
    move-object v3, p2

    .line 27
    move-object v4, p3

    .line 28
    move-object v5, p4

    .line 29
    move-object v6, p5

    .line 30
    move-object v7, p6

    .line 31
    move-object/from16 v8, p7

    .line 32
    .line 33
    invoke-direct/range {v0 .. v8}, La/pud;-><init>(ILa/we50;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    new-instance p0, Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    const/4 p2, 0x1

    .line 40
    invoke-direct {p0, p1, v0, p2}, Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;-><init>(Ljava/lang/String;La/xbf;Z)V

    .line 41
    .line 42
    .line 43
    return-object p0
.end method

.method public static h(La/qud;Landroidx/fragment/app/e;La/xdr;Ljava/util/Calendar;IJLa/gvb0;I)V
    .locals 12

    .line 1
    and-int/lit8 v1, p8, 0x40

    .line 2
    .line 3
    if-eqz v1, :cond_0

    .line 4
    .line 5
    new-instance v1, La/bmh;

    .line 6
    .line 7
    const/16 v2, 0x18

    .line 8
    .line 9
    invoke-direct {v1, v2}, La/bmh;-><init>(B)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object/from16 v1, p7

    .line 14
    .line 15
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    invoke-virtual {p3, p0}, Ljava/util/Calendar;->get(I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x2

    .line 30
    invoke-virtual {p3, v3}, Ljava/util/Calendar;->get(I)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const/4 v5, 0x5

    .line 35
    invoke-virtual {p3, v5}, Ljava/util/Calendar;->get(I)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const-string v6, "DATE_PICKER_DIALOG_FRAGMENT"

    .line 40
    .line 41
    invoke-virtual {p1, v6}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    if-nez v7, :cond_1

    .line 46
    .line 47
    new-instance v7, La/bej;

    .line 48
    .line 49
    invoke-direct {v7}, La/bej;-><init>()V

    .line 50
    .line 51
    .line 52
    sget-object v8, La/bej;->j2:[La/iiy;

    .line 53
    .line 54
    aget-object v3, v8, v3

    .line 55
    .line 56
    iget-object v9, v7, La/bej;->d2:La/r34;

    .line 57
    .line 58
    const-wide/16 v10, 0x0

    .line 59
    .line 60
    invoke-virtual {v9, v7, v3, v10, v11}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 61
    .line 62
    .line 63
    const/4 v3, 0x3

    .line 64
    aget-object v3, v8, v3

    .line 65
    .line 66
    iget-object v9, v7, La/bej;->e2:La/r34;

    .line 67
    .line 68
    move-wide/from16 v10, p5

    .line 69
    .line 70
    invoke-virtual {v9, v7, v3, v10, v11}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 71
    .line 72
    .line 73
    iget-object v3, v7, La/bej;->f2:La/zz2;

    .line 74
    .line 75
    const/4 v9, 0x4

    .line 76
    aget-object v9, v8, v9

    .line 77
    .line 78
    invoke-virtual {v3, v7, v9, v0}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 79
    .line 80
    .line 81
    iget-object v0, v7, La/bej;->g2:La/zz2;

    .line 82
    .line 83
    aget-object v3, v8, v5

    .line 84
    .line 85
    invoke-virtual {v0, v7, v3, v4}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 86
    .line 87
    .line 88
    const/4 v0, 0x6

    .line 89
    aget-object v0, v8, v0

    .line 90
    .line 91
    iget-object v3, v7, La/bej;->h2:La/zz2;

    .line 92
    .line 93
    invoke-virtual {v3, v7, v0, v2}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 94
    .line 95
    .line 96
    iget-object v0, v7, La/bej;->b2:La/zz2;

    .line 97
    .line 98
    const/4 v2, 0x0

    .line 99
    aget-object v2, v8, v2

    .line 100
    .line 101
    move/from16 v3, p4

    .line 102
    .line 103
    invoke-virtual {v0, v7, v2, v3}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 104
    .line 105
    .line 106
    iget-object v0, v7, La/bej;->c2:La/phf0;

    .line 107
    .line 108
    aget-object p0, v8, p0

    .line 109
    .line 110
    const-string v2, ""

    .line 111
    .line 112
    invoke-virtual {v0, v7, p0, v2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iput-object p2, v7, La/bej;->Z1:La/xdr;

    .line 116
    .line 117
    iput-object v1, v7, La/bej;->a2:Lkotlin/jvm/functions/Function0;

    .line 118
    .line 119
    invoke-virtual {v7, p1, v6}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_1
    return-void
.end method


# virtual methods
.method public a(La/j6m0;Lorg/json/JSONObject;)La/lwi0;
    .locals 0

    .line 1
    invoke-static {p1}, La/qud;->b(La/j6m0;)La/lwi0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
