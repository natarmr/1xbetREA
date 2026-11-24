.class public abstract La/bcm0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final A(La/qbs0;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/qbs0;->a:La/bcs0;

    .line 5
    .line 6
    iget-wide v0, v0, La/bcs0;->a:J

    .line 7
    .line 8
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object p0, p0, La/qbs0;->b:La/mbs0;

    .line 13
    .line 14
    iget-wide v0, p0, La/mbs0;->i:J

    .line 15
    .line 16
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-wide v0, p0, La/mbs0;->h:J

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-wide v0, p0, La/mbs0;->f:J

    .line 27
    .line 28
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget-object v6, p0, La/mbs0;->j:Ljava/lang/String;

    .line 33
    .line 34
    iget-wide v0, p0, La/mbs0;->k:D

    .line 35
    .line 36
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    filled-new-array/range {v2 .. v7}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const/4 v4, 0x0

    .line 49
    const/16 v5, 0x3e

    .line 50
    .line 51
    const-string v1, "_"

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-static/range {v0 .. v5}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method public static B(Landroid/content/Context;ILjava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p0}, La/grv0;->a(Landroid/content/Context;)La/o58;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :try_start_0
    iget-object p0, p0, La/o58;->a:Landroid/content/Context;

    .line 6
    .line 7
    const-string v0, "appops"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Landroid/app/AppOpsManager;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p1, p2}, Landroid/app/AppOpsManager;->checkPackage(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 23
    .line 24
    const-string p1, "context.getSystemService(Context.APP_OPS_SERVICE) is null"

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    :catch_0
    const/4 p0, 0x0

    .line 31
    return p0
.end method

.method public static C(La/hbb;)I
    .locals 2

    .line 1
    sget-object v0, La/hbb;->i:La/hbb;

    .line 2
    .line 3
    if-eq p0, v0, :cond_4

    .line 4
    .line 5
    sget-object v0, La/hbb;->j:La/hbb;

    .line 6
    .line 7
    if-eq p0, v0, :cond_3

    .line 8
    .line 9
    sget-object v0, La/hbb;->k:La/hbb;

    .line 10
    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    sget-object v0, La/hbb;->l:La/hbb;

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    sget-object v0, La/hbb;->m:La/hbb;

    .line 18
    .line 19
    if-ne p0, v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x5

    .line 22
    return p0

    .line 23
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 24
    .line 25
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v1, "Unknown KeyMaterialType: "

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0

    .line 39
    :cond_1
    const/4 p0, 0x4

    .line 40
    return p0

    .line 41
    :cond_2
    const/4 p0, 0x3

    .line 42
    return p0

    .line 43
    :cond_3
    const/4 p0, 0x2

    .line 44
    return p0

    .line 45
    :cond_4
    const/4 p0, 0x1

    .line 46
    return p0
.end method

.method public static D(La/lpw0;)I
    .locals 2

    .line 1
    sget-object v0, La/lpw0;->b:La/lpw0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    sget-object v0, La/lpw0;->c:La/lpw0;

    .line 12
    .line 13
    if-eq p0, v0, :cond_5

    .line 14
    .line 15
    sget-object v0, La/lpw0;->d:La/lpw0;

    .line 16
    .line 17
    if-eq p0, v0, :cond_4

    .line 18
    .line 19
    sget-object v0, La/lpw0;->e:La/lpw0;

    .line 20
    .line 21
    if-eq p0, v0, :cond_3

    .line 22
    .line 23
    sget-object v0, La/lpw0;->f:La/lpw0;

    .line 24
    .line 25
    if-eq p0, v0, :cond_2

    .line 26
    .line 27
    sget-object v0, La/lpw0;->g:La/lpw0;

    .line 28
    .line 29
    if-ne p0, v0, :cond_1

    .line 30
    .line 31
    const/4 p0, 0x6

    .line 32
    return p0

    .line 33
    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 34
    .line 35
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string v1, "Unknown OutputPrefixType: "

    .line 40
    .line 41
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_2
    const/4 p0, 0x5

    .line 50
    return p0

    .line 51
    :cond_3
    const/4 p0, 0x4

    .line 52
    return p0

    .line 53
    :cond_4
    const/4 p0, 0x3

    .line 54
    return p0

    .line 55
    :cond_5
    const/4 p0, 0x2

    .line 56
    return p0
.end method

.method public static E(I)La/hbb;
    .locals 2

    .line 1
    sget-object v0, La/p7x0;->a:[I

    .line 2
    .line 3
    invoke-static {p0}, La/hne;->E(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const-string v1, "Unknown KeyMaterialType: "

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 15
    .line 16
    invoke-static {p0}, La/esw0;->n(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :pswitch_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 29
    .line 30
    invoke-static {p0}, La/esw0;->n(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :pswitch_1
    sget-object p0, La/hbb;->m:La/hbb;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_2
    sget-object p0, La/hbb;->l:La/hbb;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_3
    sget-object p0, La/hbb;->k:La/hbb;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_4
    sget-object p0, La/hbb;->j:La/hbb;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_5
    sget-object p0, La/hbb;->i:La/hbb;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static F(La/lpw0;Ljava/lang/Integer;)La/icw0;
    .locals 2

    .line 1
    sget-object v0, La/lpw0;->e:La/lpw0;

    .line 2
    .line 3
    if-ne p0, v0, :cond_1

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    sget-object p0, La/q6x0;->a:La/icw0;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "RAW output prefix type cannot have an id requirement"

    .line 11
    .line 12
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_1
    if-eqz p1, :cond_5

    .line 18
    .line 19
    sget-object v0, La/lpw0;->c:La/lpw0;

    .line 20
    .line 21
    if-ne p0, v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-static {p0}, La/q6x0;->b(I)La/icw0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_2
    sget-object v0, La/lpw0;->d:La/lpw0;

    .line 33
    .line 34
    if-eq p0, v0, :cond_4

    .line 35
    .line 36
    sget-object v0, La/lpw0;->f:La/lpw0;

    .line 37
    .line 38
    if-ne p0, v0, :cond_3

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 42
    .line 43
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string v0, "Unknown OutputPrefixType: "

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_4
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    invoke-static {p0}, La/q6x0;->a(I)La/icw0;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 67
    .line 68
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const-string v0, "idRequirement must be non-null for "

    .line 73
    .line 74
    const-string v1, " type"

    .line 75
    .line 76
    invoke-static {v0, p0, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1
.end method

.method public static G(I)La/lpw0;
    .locals 2

    .line 1
    sget-object v0, La/p7x0;->b:[I

    .line 2
    .line 3
    invoke-static {p0}, La/hne;->E(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const-string v1, "Unknown OutputPrefixType: "

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 15
    .line 16
    invoke-static {p0}, La/esw0;->o(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :pswitch_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 29
    .line 30
    invoke-static {p0}, La/esw0;->o(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :pswitch_1
    sget-object p0, La/lpw0;->g:La/lpw0;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_2
    sget-object p0, La/lpw0;->f:La/lpw0;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_3
    sget-object p0, La/lpw0;->e:La/lpw0;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_4
    sget-object p0, La/lpw0;->d:La/lpw0;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_5
    sget-object p0, La/lpw0;->c:La/lpw0;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_6
    sget-object p0, La/lpw0;->b:La/lpw0;

    .line 58
    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final a(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v11, p2

    .line 6
    .line 7
    move/from16 v14, p3

    .line 8
    .line 9
    const v2, 0x184d731e

    .line 10
    .line 11
    .line 12
    invoke-virtual {v11, v2}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v11, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x4

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    move v2, v3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v2, 0x2

    .line 25
    :goto_0
    or-int/2addr v2, v14

    .line 26
    invoke-virtual {v11, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/16 v5, 0x20

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    move v4, v5

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v4, 0x10

    .line 37
    .line 38
    :goto_1
    or-int/2addr v2, v4

    .line 39
    and-int/lit8 v4, v2, 0x13

    .line 40
    .line 41
    const/16 v6, 0x12

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    const/4 v15, 0x1

    .line 45
    if-eq v4, v6, :cond_2

    .line 46
    .line 47
    move v4, v15

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move v4, v7

    .line 50
    :goto_2
    and-int/lit8 v6, v2, 0x1

    .line 51
    .line 52
    invoke-virtual {v11, v6, v4}, La/fet;->U(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_7

    .line 57
    .line 58
    sget-object v4, La/qmk;->a:La/zcl;

    .line 59
    .line 60
    const/high16 v4, 0x41400000    # 12.0f

    .line 61
    .line 62
    const/16 v6, 0xd

    .line 63
    .line 64
    const/4 v8, 0x0

    .line 65
    invoke-static {v8, v4, v8, v8, v6}, La/s5x0;->u(FFFFI)La/lh80;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    and-int/lit8 v6, v2, 0xe

    .line 70
    .line 71
    if-eq v6, v3, :cond_3

    .line 72
    .line 73
    move v3, v7

    .line 74
    goto :goto_3

    .line 75
    :cond_3
    move v3, v15

    .line 76
    :goto_3
    and-int/lit8 v2, v2, 0x70

    .line 77
    .line 78
    if-ne v2, v5, :cond_4

    .line 79
    .line 80
    move v7, v15

    .line 81
    :cond_4
    or-int v2, v3, v7

    .line 82
    .line 83
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-nez v2, :cond_5

    .line 88
    .line 89
    sget-object v2, La/ukd;->a:La/cl5;

    .line 90
    .line 91
    if-ne v3, v2, :cond_6

    .line 92
    .line 93
    :cond_5
    new-instance v3, La/td8;

    .line 94
    .line 95
    const/4 v2, 0x5

    .line 96
    invoke-direct {v3, v0, v1, v2}, La/td8;-><init>(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;B)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v11, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_6
    move-object v10, v3

    .line 103
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 104
    .line 105
    const/4 v12, 0x0

    .line 106
    const/16 v13, 0x1fb

    .line 107
    .line 108
    const/4 v2, 0x0

    .line 109
    const/4 v3, 0x0

    .line 110
    const/4 v5, 0x0

    .line 111
    const/4 v6, 0x0

    .line 112
    const/4 v7, 0x0

    .line 113
    const/4 v8, 0x0

    .line 114
    const/4 v9, 0x0

    .line 115
    invoke-static/range {v2 .. v13}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 116
    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_7
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 120
    .line 121
    .line 122
    :goto_4
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    if-eqz v2, :cond_8

    .line 127
    .line 128
    new-instance v3, La/qpc0;

    .line 129
    .line 130
    invoke-direct {v3, v0, v1, v14, v15}, La/qpc0;-><init>(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;IB)V

    .line 131
    .line 132
    .line 133
    iput-object v3, v2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 134
    .line 135
    :cond_8
    return-void
.end method

.method public static final b(ILa/fet;La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;)V
    .locals 25

    .line 1
    move-object/from16 v9, p1

    .line 2
    .line 3
    move-object/from16 v12, p3

    .line 4
    .line 5
    move-object/from16 v13, p4

    .line 6
    .line 7
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const v0, -0x5619d03

    .line 14
    .line 15
    .line 16
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 17
    .line 18
    .line 19
    or-int/lit8 v0, p0, 0x6

    .line 20
    .line 21
    invoke-virtual {v9, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/16 v1, 0x20

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/16 v1, 0x10

    .line 31
    .line 32
    :goto_0
    or-int/2addr v0, v1

    .line 33
    invoke-virtual {v9, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/16 v2, 0x100

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    move v1, v2

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/16 v1, 0x80

    .line 44
    .line 45
    :goto_1
    or-int/2addr v0, v1

    .line 46
    and-int/lit16 v1, v0, 0x93

    .line 47
    .line 48
    const/16 v3, 0x92

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    const/4 v5, 0x1

    .line 52
    if-eq v1, v3, :cond_2

    .line 53
    .line 54
    move v1, v5

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move v1, v4

    .line 57
    :goto_2
    and-int/lit8 v3, v0, 0x1

    .line 58
    .line 59
    invoke-virtual {v9, v3, v1}, La/fet;->U(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_6

    .line 64
    .line 65
    new-instance v14, La/f9m0;

    .line 66
    .line 67
    const/16 v23, 0x0

    .line 68
    .line 69
    const/16 v24, 0xfc

    .line 70
    .line 71
    const v15, 0x7f1313a7

    .line 72
    .line 73
    .line 74
    sget-object v16, La/fmm;->a:La/fmm;

    .line 75
    .line 76
    const-wide/16 v17, 0x0

    .line 77
    .line 78
    const/16 v19, 0x0

    .line 79
    .line 80
    const/16 v20, 0x0

    .line 81
    .line 82
    const/16 v21, 0x0

    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    invoke-direct/range {v14 .. v24}, La/f9m0;-><init>(ILa/gmm;JZZLjava/lang/String;Ljava/lang/String;ZI)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, La/jcm0;

    .line 94
    .line 95
    invoke-interface {v1}, La/jcm0;->c()La/zdm0;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    check-cast v3, La/jcm0;

    .line 104
    .line 105
    invoke-interface {v3}, La/jcm0;->d()La/j9m0;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    check-cast v6, La/jcm0;

    .line 114
    .line 115
    invoke-interface {v6}, La/jcm0;->a()Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    and-int/lit16 v0, v0, 0x380

    .line 120
    .line 121
    if-ne v0, v2, :cond_3

    .line 122
    .line 123
    move v4, v5

    .line 124
    :cond_3
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-nez v4, :cond_4

    .line 129
    .line 130
    sget-object v2, La/ukd;->a:La/cl5;

    .line 131
    .line 132
    if-ne v0, v2, :cond_5

    .line 133
    .line 134
    :cond_4
    new-instance v0, La/yhl0;

    .line 135
    .line 136
    const/16 v2, 0x1a

    .line 137
    .line 138
    invoke-direct {v0, v13, v2}, La/yhl0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_5
    move-object v5, v0

    .line 145
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 146
    .line 147
    new-instance v0, La/dqz;

    .line 148
    .line 149
    invoke-direct {v0, v12, v13}, La/dqz;-><init>(La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 150
    .line 151
    .line 152
    const v2, -0x64227ff5

    .line 153
    .line 154
    .line 155
    invoke-static {v2, v0, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    const/high16 v10, 0x6000000

    .line 160
    .line 161
    const/16 v11, 0xc1

    .line 162
    .line 163
    const/4 v0, 0x0

    .line 164
    move v4, v6

    .line 165
    const/4 v6, 0x0

    .line 166
    const/4 v7, 0x0

    .line 167
    move-object v2, v1

    .line 168
    move-object v1, v14

    .line 169
    invoke-static/range {v0 .. v11}, La/ffb0;->D(La/mm40;La/f9m0;La/zdm0;La/j9m0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/ugd;La/fet;II)V

    .line 170
    .line 171
    .line 172
    sget-object v0, La/jm40;->b:La/jm40;

    .line 173
    .line 174
    move-object v1, v0

    .line 175
    goto :goto_3

    .line 176
    :cond_6
    invoke-virtual/range {p1 .. p1}, La/fet;->X()V

    .line 177
    .line 178
    .line 179
    move-object/from16 v1, p2

    .line 180
    .line 181
    :goto_3
    invoke-virtual/range {p1 .. p1}, La/fet;->u()La/yfe0;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    if-eqz v6, :cond_7

    .line 186
    .line 187
    new-instance v0, La/mpb0;

    .line 188
    .line 189
    const/16 v5, 0x8

    .line 190
    .line 191
    move/from16 v4, p0

    .line 192
    .line 193
    move-object v2, v12

    .line 194
    move-object v3, v13

    .line 195
    invoke-direct/range {v0 .. v5}, La/mpb0;-><init>(La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;IB)V

    .line 196
    .line 197
    .line 198
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 199
    .line 200
    :cond_7
    return-void
.end method

.method public static final c(Ljava/lang/String;Ljava/lang/String;La/mm40;La/xdr;La/fet;I)V
    .locals 32

    .line 1
    move-object/from16 v4, p1

    .line 2
    .line 3
    move-object/from16 v6, p3

    .line 4
    .line 5
    move-object/from16 v0, p4

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const v1, -0x155a2d6b

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, La/fet;->g0(I)La/fet;

    .line 14
    .line 15
    .line 16
    move-object/from16 v3, p0

    .line 17
    .line 18
    invoke-virtual {v0, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x2

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v1, v2

    .line 28
    :goto_0
    or-int v1, p5, v1

    .line 29
    .line 30
    invoke-virtual {v0, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    const/16 v5, 0x20

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/16 v5, 0x10

    .line 40
    .line 41
    :goto_1
    or-int/2addr v1, v5

    .line 42
    or-int/lit16 v1, v1, 0x180

    .line 43
    .line 44
    and-int/lit16 v5, v1, 0x493

    .line 45
    .line 46
    const/16 v7, 0x492

    .line 47
    .line 48
    const/4 v8, 0x1

    .line 49
    const/4 v9, 0x0

    .line 50
    if-eq v5, v7, :cond_2

    .line 51
    .line 52
    move v5, v8

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    move v5, v9

    .line 55
    :goto_2
    and-int/lit8 v7, v1, 0x1

    .line 56
    .line 57
    invoke-virtual {v0, v7, v5}, La/fet;->U(IZ)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_5

    .line 62
    .line 63
    sget-object v5, La/qmk;->a:La/zcl;

    .line 64
    .line 65
    const/high16 v5, 0x42300000    # 44.0f

    .line 66
    .line 67
    sget-object v7, La/jm40;->b:La/jm40;

    .line 68
    .line 69
    invoke-static {v7, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    const/4 v10, 0x0

    .line 74
    const/4 v11, 0x3

    .line 75
    invoke-static {v5, v10, v11}, La/o7k0;->A(La/mm40;La/xx7;I)La/mm40;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    sget-object v12, La/gqw0;->k:La/yx7;

    .line 80
    .line 81
    sget-object v13, La/uc9;->a:La/lw3;

    .line 82
    .line 83
    const/16 v14, 0x30

    .line 84
    .line 85
    invoke-static {v13, v12, v0, v14}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 86
    .line 87
    .line 88
    move-result-object v12

    .line 89
    iget-wide v13, v0, La/fet;->T:J

    .line 90
    .line 91
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 92
    .line 93
    .line 94
    move-result v13

    .line 95
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 96
    .line 97
    .line 98
    move-result-object v14

    .line 99
    invoke-static {v0, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    sget-object v15, La/mkd;->c0:La/gqw0;

    .line 104
    .line 105
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, La/fet;->i0()V

    .line 109
    .line 110
    .line 111
    iget-boolean v15, v0, La/fet;->S:Z

    .line 112
    .line 113
    if-eqz v15, :cond_3

    .line 114
    .line 115
    sget-object v15, La/e7z;->u1:La/pcy;

    .line 116
    .line 117
    invoke-virtual {v0, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_3
    invoke-virtual {v0}, La/fet;->r0()V

    .line 122
    .line 123
    .line 124
    :goto_3
    sget-object v15, La/gqw0;->x:La/shd;

    .line 125
    .line 126
    invoke-static {v0, v12, v15}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 127
    .line 128
    .line 129
    sget-object v12, La/gqw0;->w:La/shd;

    .line 130
    .line 131
    invoke-static {v0, v14, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    sget-object v13, La/gqw0;->y:La/shd;

    .line 139
    .line 140
    invoke-static {v0, v12, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v0}, La/jpm0;->n(La/fet;)V

    .line 144
    .line 145
    .line 146
    sget-object v12, La/gqw0;->v:La/shd;

    .line 147
    .line 148
    invoke-static {v0, v5, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 149
    .line 150
    .line 151
    const/high16 v5, 0x41c00000    # 24.0f

    .line 152
    .line 153
    invoke-static {v7, v5}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    shr-int/lit8 v12, v1, 0x3

    .line 158
    .line 159
    and-int/lit8 v12, v12, 0xe

    .line 160
    .line 161
    invoke-static {v12, v0, v5, v4}, La/rsm0;->g(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    if-nez v6, :cond_4

    .line 165
    .line 166
    const v5, -0x67124564

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v5}, La/fet;->e0(I)V

    .line 170
    .line 171
    .line 172
    :goto_4
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 173
    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_4
    const v5, 0x15730605

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v5}, La/fet;->e0(I)V

    .line 180
    .line 181
    .line 182
    const/16 v5, 0x36

    .line 183
    .line 184
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    sget-object v12, La/zhg0;->a:La/zhg0;

    .line 189
    .line 190
    invoke-interface {v6, v12, v0, v5}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :goto_5
    invoke-static {v7, v10, v11}, La/o7k0;->y(La/mm40;La/zx7;I)La/mm40;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    const/high16 v9, 0x40c00000    # 6.0f

    .line 199
    .line 200
    const/4 v10, 0x0

    .line 201
    invoke-static {v5, v9, v10, v2}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    invoke-static {v5, v0}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 210
    .line 211
    .line 212
    move-result-object v27

    .line 213
    sget-wide v10, La/qmk;->q:J

    .line 214
    .line 215
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    iget-object v5, v5, La/y9q0;->a:La/smk0;

    .line 220
    .line 221
    iget-wide v12, v5, La/smk0;->b:J

    .line 222
    .line 223
    sget-wide v14, La/qmk;->n:J

    .line 224
    .line 225
    new-instance v9, La/n05;

    .line 226
    .line 227
    invoke-direct/range {v9 .. v15}, La/n05;-><init>(JJJ)V

    .line 228
    .line 229
    .line 230
    move-object v11, v9

    .line 231
    new-instance v5, La/f2q0;

    .line 232
    .line 233
    const/4 v9, 0x5

    .line 234
    invoke-direct {v5, v9}, La/f2q0;-><init>(I)V

    .line 235
    .line 236
    .line 237
    and-int/lit8 v29, v1, 0xe

    .line 238
    .line 239
    const/16 v30, 0x6180

    .line 240
    .line 241
    const v31, 0x1abf4

    .line 242
    .line 243
    .line 244
    const-wide/16 v9, 0x0

    .line 245
    .line 246
    const-wide/16 v12, 0x0

    .line 247
    .line 248
    const/4 v14, 0x0

    .line 249
    const/4 v15, 0x0

    .line 250
    const/16 v16, 0x0

    .line 251
    .line 252
    const-wide/16 v17, 0x0

    .line 253
    .line 254
    const-wide/16 v20, 0x0

    .line 255
    .line 256
    const/16 v22, 0x2

    .line 257
    .line 258
    const/16 v23, 0x0

    .line 259
    .line 260
    const/16 v24, 0x2

    .line 261
    .line 262
    const/16 v25, 0x0

    .line 263
    .line 264
    const/16 v26, 0x0

    .line 265
    .line 266
    move-object/from16 v28, v0

    .line 267
    .line 268
    move-object/from16 v19, v5

    .line 269
    .line 270
    move-object v1, v7

    .line 271
    move v0, v8

    .line 272
    move-object v8, v2

    .line 273
    move-object v7, v3

    .line 274
    invoke-static/range {v7 .. v31}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 275
    .line 276
    .line 277
    move-object/from16 v2, v28

    .line 278
    .line 279
    invoke-virtual {v2, v0}, La/fet;->r(Z)V

    .line 280
    .line 281
    .line 282
    move-object v5, v1

    .line 283
    goto :goto_6

    .line 284
    :cond_5
    move-object v2, v0

    .line 285
    invoke-virtual {v2}, La/fet;->X()V

    .line 286
    .line 287
    .line 288
    move-object/from16 v5, p2

    .line 289
    .line 290
    :goto_6
    invoke-virtual {v2}, La/fet;->u()La/yfe0;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    if-eqz v7, :cond_6

    .line 295
    .line 296
    new-instance v0, La/stl0;

    .line 297
    .line 298
    const/16 v1, 0xd

    .line 299
    .line 300
    move-object/from16 v3, p0

    .line 301
    .line 302
    move/from16 v2, p5

    .line 303
    .line 304
    invoke-direct/range {v0 .. v6}, La/stl0;-><init>(BILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    iput-object v0, v7, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 308
    .line 309
    :cond_6
    return-void
.end method

.method public static final d(La/mm40;La/d280;Ljava/lang/String;La/j83;La/fet;II)V
    .locals 30

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    const v1, -0x48b88ffc

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v1, p6, 0x1

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    or-int/lit8 v3, p5, 0x6

    .line 16
    .line 17
    move v4, v3

    .line 18
    move-object/from16 v3, p0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move-object/from16 v3, p0

    .line 22
    .line 23
    invoke-virtual {v0, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    const/4 v4, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v4, 0x2

    .line 32
    :goto_0
    or-int v4, p5, v4

    .line 33
    .line 34
    :goto_1
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    const/16 v6, 0x20

    .line 39
    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    move v5, v6

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/16 v5, 0x10

    .line 45
    .line 46
    :goto_2
    or-int/2addr v4, v5

    .line 47
    move-object/from16 v5, p2

    .line 48
    .line 49
    invoke-virtual {v0, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_3

    .line 54
    .line 55
    const/16 v7, 0x100

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    const/16 v7, 0x80

    .line 59
    .line 60
    :goto_3
    or-int/2addr v4, v7

    .line 61
    move-object/from16 v7, p3

    .line 62
    .line 63
    invoke-virtual {v0, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    if-eqz v8, :cond_4

    .line 68
    .line 69
    const/16 v8, 0x800

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_4
    const/16 v8, 0x400

    .line 73
    .line 74
    :goto_4
    or-int/2addr v4, v8

    .line 75
    and-int/lit16 v8, v4, 0x493

    .line 76
    .line 77
    const/16 v9, 0x492

    .line 78
    .line 79
    const/4 v10, 0x0

    .line 80
    const/4 v11, 0x1

    .line 81
    if-eq v8, v9, :cond_5

    .line 82
    .line 83
    move v8, v11

    .line 84
    goto :goto_5

    .line 85
    :cond_5
    move v8, v10

    .line 86
    :goto_5
    and-int/lit8 v9, v4, 0x1

    .line 87
    .line 88
    invoke-virtual {v0, v9, v8}, La/fet;->U(IZ)Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_d

    .line 93
    .line 94
    sget-object v12, La/jm40;->b:La/jm40;

    .line 95
    .line 96
    if-eqz v1, :cond_6

    .line 97
    .line 98
    move-object v1, v12

    .line 99
    goto :goto_6

    .line 100
    :cond_6
    move-object v1, v3

    .line 101
    :goto_6
    sget-object v3, La/gqw0;->k:La/yx7;

    .line 102
    .line 103
    sget-object v8, La/qmk;->a:La/zcl;

    .line 104
    .line 105
    const/high16 v8, 0x41800000    # 16.0f

    .line 106
    .line 107
    invoke-static {v1, v8}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    sget-object v9, La/uc9;->a:La/lw3;

    .line 112
    .line 113
    const/16 v13, 0x30

    .line 114
    .line 115
    invoke-static {v9, v3, v0, v13}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    iget-wide v13, v0, La/fet;->T:J

    .line 120
    .line 121
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    invoke-static {v0, v8}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    sget-object v14, La/mkd;->c0:La/gqw0;

    .line 134
    .line 135
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, La/fet;->i0()V

    .line 139
    .line 140
    .line 141
    iget-boolean v14, v0, La/fet;->S:Z

    .line 142
    .line 143
    if-eqz v14, :cond_7

    .line 144
    .line 145
    sget-object v14, La/e7z;->u1:La/pcy;

    .line 146
    .line 147
    invoke-virtual {v0, v14}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 148
    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_7
    invoke-virtual {v0}, La/fet;->r0()V

    .line 152
    .line 153
    .line 154
    :goto_7
    sget-object v14, La/gqw0;->x:La/shd;

    .line 155
    .line 156
    invoke-static {v0, v3, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 157
    .line 158
    .line 159
    sget-object v3, La/gqw0;->w:La/shd;

    .line 160
    .line 161
    invoke-static {v0, v13, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    sget-object v9, La/gqw0;->y:La/shd;

    .line 169
    .line 170
    invoke-static {v0, v3, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 171
    .line 172
    .line 173
    invoke-static {v0}, La/jpm0;->n(La/fet;)V

    .line 174
    .line 175
    .line 176
    sget-object v3, La/gqw0;->v:La/shd;

    .line 177
    .line 178
    invoke-static {v0, v8, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 179
    .line 180
    .line 181
    and-int/lit8 v3, v4, 0x70

    .line 182
    .line 183
    if-ne v3, v6, :cond_8

    .line 184
    .line 185
    move v10, v11

    .line 186
    :cond_8
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    sget-object v6, La/ukd;->a:La/cl5;

    .line 191
    .line 192
    if-nez v10, :cond_9

    .line 193
    .line 194
    if-ne v3, v6, :cond_a

    .line 195
    .line 196
    :cond_9
    new-instance v3, La/u6n;

    .line 197
    .line 198
    sget-object v8, La/d4d;->t:La/d4d;

    .line 199
    .line 200
    sget-object v9, La/w6n;->l:La/w6n;

    .line 201
    .line 202
    invoke-direct {v3, v8, v9, v2}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_a
    check-cast v3, La/u6n;

    .line 209
    .line 210
    invoke-virtual {v0, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    if-nez v8, :cond_b

    .line 219
    .line 220
    if-ne v9, v6, :cond_c

    .line 221
    .line 222
    :cond_b
    new-instance v9, La/d1n;

    .line 223
    .line 224
    invoke-direct {v9, v3, v11}, La/d1n;-><init>(La/u6n;B)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    :cond_c
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 231
    .line 232
    const/4 v3, 0x0

    .line 233
    invoke-static {v11, v0, v3, v9}, La/kkb;->p(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 234
    .line 235
    .line 236
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 237
    .line 238
    .line 239
    move-result-object v23

    .line 240
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 241
    .line 242
    invoke-virtual {v0, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 247
    .line 248
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 249
    .line 250
    .line 251
    move-result-wide v8

    .line 252
    const/16 v16, 0x0

    .line 253
    .line 254
    const/16 v17, 0xe

    .line 255
    .line 256
    const/high16 v13, 0x40c00000    # 6.0f

    .line 257
    .line 258
    const/4 v14, 0x0

    .line 259
    const/4 v15, 0x0

    .line 260
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    move-object/from16 v28, v12

    .line 265
    .line 266
    const/high16 v10, 0x3f800000    # 1.0f

    .line 267
    .line 268
    invoke-static {v10, v6, v11}, La/dw9;->h(FLa/mm40;Z)La/mm40;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    shr-int/lit8 v10, v4, 0x6

    .line 273
    .line 274
    and-int/lit8 v25, v10, 0xe

    .line 275
    .line 276
    const/16 v26, 0x6180

    .line 277
    .line 278
    const v27, 0x1aff8

    .line 279
    .line 280
    .line 281
    const/4 v7, 0x0

    .line 282
    move v10, v4

    .line 283
    move-object v4, v6

    .line 284
    move-wide v5, v8

    .line 285
    const-wide/16 v8, 0x0

    .line 286
    .line 287
    move v12, v10

    .line 288
    const/4 v10, 0x0

    .line 289
    move v13, v11

    .line 290
    const/4 v11, 0x0

    .line 291
    move v14, v12

    .line 292
    const/4 v12, 0x0

    .line 293
    move/from16 v16, v13

    .line 294
    .line 295
    move v15, v14

    .line 296
    const-wide/16 v13, 0x0

    .line 297
    .line 298
    move/from16 v17, v15

    .line 299
    .line 300
    const/4 v15, 0x0

    .line 301
    move/from16 v19, v16

    .line 302
    .line 303
    move/from16 v18, v17

    .line 304
    .line 305
    const-wide/16 v16, 0x0

    .line 306
    .line 307
    move/from16 v20, v18

    .line 308
    .line 309
    const/16 v18, 0x2

    .line 310
    .line 311
    move/from16 v21, v19

    .line 312
    .line 313
    const/16 v19, 0x0

    .line 314
    .line 315
    move/from16 v22, v20

    .line 316
    .line 317
    const/16 v20, 0x1

    .line 318
    .line 319
    move/from16 v24, v21

    .line 320
    .line 321
    const/16 v21, 0x0

    .line 322
    .line 323
    move/from16 v29, v22

    .line 324
    .line 325
    const/16 v22, 0x0

    .line 326
    .line 327
    move-object/from16 p0, v1

    .line 328
    .line 329
    move/from16 v1, v24

    .line 330
    .line 331
    move-object/from16 v24, v0

    .line 332
    .line 333
    move-object v0, v3

    .line 334
    move-object/from16 v3, p2

    .line 335
    .line 336
    invoke-static/range {v3 .. v27}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 337
    .line 338
    .line 339
    move-object/from16 v3, v24

    .line 340
    .line 341
    invoke-virtual {v3, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 346
    .line 347
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 348
    .line 349
    .line 350
    move-result-wide v5

    .line 351
    invoke-static {}, La/g1t0;->a()La/y9q0;

    .line 352
    .line 353
    .line 354
    move-result-object v22

    .line 355
    const/16 v16, 0x0

    .line 356
    .line 357
    const/16 v17, 0xe

    .line 358
    .line 359
    const/high16 v13, 0x41000000    # 8.0f

    .line 360
    .line 361
    const/4 v14, 0x0

    .line 362
    const/4 v15, 0x0

    .line 363
    move-object/from16 v12, v28

    .line 364
    .line 365
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    shr-int/lit8 v0, v29, 0x9

    .line 370
    .line 371
    and-int/lit8 v24, v0, 0xe

    .line 372
    .line 373
    const/16 v25, 0x6180

    .line 374
    .line 375
    const v26, 0x3aff8

    .line 376
    .line 377
    .line 378
    const-wide/16 v11, 0x0

    .line 379
    .line 380
    const/4 v13, 0x0

    .line 381
    const-wide/16 v14, 0x0

    .line 382
    .line 383
    const/16 v16, 0x2

    .line 384
    .line 385
    const/16 v17, 0x0

    .line 386
    .line 387
    const/16 v18, 0x1

    .line 388
    .line 389
    const/16 v20, 0x0

    .line 390
    .line 391
    const/16 v21, 0x0

    .line 392
    .line 393
    move-object/from16 v23, v3

    .line 394
    .line 395
    move-object/from16 v3, p3

    .line 396
    .line 397
    invoke-static/range {v3 .. v26}, La/v8q0;->b(La/j83;La/mm40;JLa/n05;JLa/nrq;JLa/f2q0;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 398
    .line 399
    .line 400
    move-object/from16 v0, v23

    .line 401
    .line 402
    invoke-virtual {v0, v1}, La/fet;->r(Z)V

    .line 403
    .line 404
    .line 405
    move-object/from16 v1, p0

    .line 406
    .line 407
    goto :goto_8

    .line 408
    :cond_d
    invoke-virtual {v0}, La/fet;->X()V

    .line 409
    .line 410
    .line 411
    move-object v1, v3

    .line 412
    :goto_8
    invoke-virtual {v0}, La/fet;->u()La/yfe0;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    if-eqz v8, :cond_e

    .line 417
    .line 418
    new-instance v0, La/brc0;

    .line 419
    .line 420
    const/4 v7, 0x5

    .line 421
    move-object/from16 v3, p2

    .line 422
    .line 423
    move-object/from16 v4, p3

    .line 424
    .line 425
    move/from16 v5, p5

    .line 426
    .line 427
    move/from16 v6, p6

    .line 428
    .line 429
    invoke-direct/range {v0 .. v7}, La/brc0;-><init>(La/mm40;La/d280;Ljava/lang/Object;Ljava/lang/CharSequence;IIB)V

    .line 430
    .line 431
    .line 432
    iput-object v0, v8, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 433
    .line 434
    :cond_e
    return-void
.end method

.method public static final e(Ljava/lang/String;La/fet;I)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const v2, -0x2bcf8877

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, La/fet;->g0(I)La/fet;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v2, v3

    .line 24
    :goto_0
    or-int v2, p2, v2

    .line 25
    .line 26
    and-int/lit8 v4, v2, 0x3

    .line 27
    .line 28
    if-eq v4, v3, :cond_1

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 v3, 0x0

    .line 33
    :goto_1
    and-int/lit8 v4, v2, 0x1

    .line 34
    .line 35
    invoke-virtual {v1, v4, v3}, La/fet;->U(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    sget-object v3, La/jm40;->b:La/jm40;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    const/4 v5, 0x3

    .line 45
    invoke-static {v3, v4, v5}, La/o7k0;->y(La/mm40;La/zx7;I)La/mm40;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    sget-object v12, La/j1t0;->a:La/qrq;

    .line 50
    .line 51
    sget-wide v9, La/qmk;->o:J

    .line 52
    .line 53
    sget-wide v18, La/qmk;->B:J

    .line 54
    .line 55
    new-instance v6, La/y9q0;

    .line 56
    .line 57
    const/16 v17, 0x0

    .line 58
    .line 59
    const v20, 0xfdffdd

    .line 60
    .line 61
    .line 62
    const-wide/16 v7, 0x0

    .line 63
    .line 64
    const/4 v11, 0x0

    .line 65
    const-wide/16 v13, 0x0

    .line 66
    .line 67
    const/4 v15, 0x0

    .line 68
    const/16 v16, 0x0

    .line 69
    .line 70
    invoke-direct/range {v6 .. v20}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 71
    .line 72
    .line 73
    invoke-static {v6, v1}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 74
    .line 75
    .line 76
    move-result-object v20

    .line 77
    new-instance v12, La/f2q0;

    .line 78
    .line 79
    invoke-direct {v12, v5}, La/f2q0;-><init>(I)V

    .line 80
    .line 81
    .line 82
    and-int/lit8 v2, v2, 0xe

    .line 83
    .line 84
    or-int/lit8 v22, v2, 0x30

    .line 85
    .line 86
    const/16 v23, 0x6180

    .line 87
    .line 88
    const v24, 0x1abfc

    .line 89
    .line 90
    .line 91
    move-object v1, v3

    .line 92
    const-wide/16 v2, 0x0

    .line 93
    .line 94
    const-wide/16 v5, 0x0

    .line 95
    .line 96
    const/4 v7, 0x0

    .line 97
    const/4 v8, 0x0

    .line 98
    const/4 v9, 0x0

    .line 99
    const-wide/16 v10, 0x0

    .line 100
    .line 101
    const/4 v15, 0x2

    .line 102
    const/16 v17, 0x1

    .line 103
    .line 104
    const/16 v18, 0x0

    .line 105
    .line 106
    const/16 v19, 0x0

    .line 107
    .line 108
    move-object/from16 v21, p1

    .line 109
    .line 110
    invoke-static/range {v0 .. v24}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_2
    invoke-virtual/range {p1 .. p1}, La/fet;->X()V

    .line 115
    .line 116
    .line 117
    :goto_2
    invoke-virtual/range {p1 .. p1}, La/fet;->u()La/yfe0;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    if-eqz v1, :cond_3

    .line 122
    .line 123
    new-instance v2, La/f5n0;

    .line 124
    .line 125
    const/4 v3, 0x6

    .line 126
    move/from16 v4, p2

    .line 127
    .line 128
    invoke-direct {v2, v3, v4, v0}, La/f5n0;-><init>(BILjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    iput-object v2, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 132
    .line 133
    :cond_3
    return-void
.end method

.method public static final f(La/mm40;La/nws0;La/fet;I)V
    .locals 27

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v5, p2

    .line 4
    .line 5
    const v1, -0x6f83c612

    .line 6
    .line 7
    .line 8
    invoke-virtual {v5, v1}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    or-int/lit8 v1, p3, 0x6

    .line 12
    .line 13
    invoke-virtual {v5, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    const/16 v2, 0x20

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v2, 0x10

    .line 23
    .line 24
    :goto_0
    or-int/2addr v1, v2

    .line 25
    and-int/lit8 v2, v1, 0x13

    .line 26
    .line 27
    const/16 v3, 0x12

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v8, 0x1

    .line 31
    if-eq v2, v3, :cond_1

    .line 32
    .line 33
    move v2, v8

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v2, v4

    .line 36
    :goto_1
    and-int/2addr v1, v8

    .line 37
    invoke-virtual {v5, v1, v2}, La/fet;->U(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    const/high16 v1, 0x3f800000    # 1.0f

    .line 44
    .line 45
    sget-object v9, La/jm40;->b:La/jm40;

    .line 46
    .line 47
    invoke-static {v9, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    sget-object v2, La/qmk;->a:La/zcl;

    .line 52
    .line 53
    const/high16 v2, 0x41000000    # 8.0f

    .line 54
    .line 55
    invoke-static {v1, v2}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    sget-object v2, La/uc9;->c:La/mw3;

    .line 60
    .line 61
    sget-object v3, La/gqw0;->m:La/xx7;

    .line 62
    .line 63
    invoke-static {v2, v3, v5, v4}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    iget-wide v3, v5, La/fet;->T:J

    .line 68
    .line 69
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-static {v5, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5}, La/fet;->i0()V

    .line 87
    .line 88
    .line 89
    iget-boolean v6, v5, La/fet;->S:Z

    .line 90
    .line 91
    if-eqz v6, :cond_2

    .line 92
    .line 93
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 94
    .line 95
    invoke-virtual {v5, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    invoke-virtual {v5}, La/fet;->r0()V

    .line 100
    .line 101
    .line 102
    :goto_2
    sget-object v6, La/gqw0;->x:La/shd;

    .line 103
    .line 104
    invoke-static {v5, v2, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 105
    .line 106
    .line 107
    sget-object v2, La/gqw0;->w:La/shd;

    .line 108
    .line 109
    invoke-static {v5, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    sget-object v3, La/gqw0;->y:La/shd;

    .line 117
    .line 118
    invoke-static {v5, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v5}, La/jpm0;->n(La/fet;)V

    .line 122
    .line 123
    .line 124
    sget-object v2, La/gqw0;->v:La/shd;

    .line 125
    .line 126
    invoke-static {v5, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 127
    .line 128
    .line 129
    iget-object v2, v0, La/nws0;->d:La/d280;

    .line 130
    .line 131
    iget-object v3, v0, La/nws0;->a:Ljava/lang/String;

    .line 132
    .line 133
    iget-object v4, v0, La/nws0;->b:La/j83;

    .line 134
    .line 135
    const/4 v6, 0x0

    .line 136
    const/4 v7, 0x1

    .line 137
    const/4 v1, 0x0

    .line 138
    invoke-static/range {v1 .. v7}, La/bcm0;->d(La/mm40;La/d280;Ljava/lang/String;La/j83;La/fet;II)V

    .line 139
    .line 140
    .line 141
    iget-object v2, v0, La/nws0;->e:La/d280;

    .line 142
    .line 143
    iget-object v3, v0, La/nws0;->f:Ljava/lang/String;

    .line 144
    .line 145
    iget-object v4, v0, La/nws0;->c:La/j83;

    .line 146
    .line 147
    const/4 v13, 0x0

    .line 148
    const/16 v14, 0xd

    .line 149
    .line 150
    const/4 v10, 0x0

    .line 151
    const/high16 v11, 0x40800000    # 4.0f

    .line 152
    .line 153
    const/4 v12, 0x0

    .line 154
    invoke-static/range {v9 .. v14}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    const/4 v7, 0x0

    .line 159
    move-object/from16 v5, p2

    .line 160
    .line 161
    invoke-static/range {v1 .. v7}, La/bcm0;->d(La/mm40;La/d280;Ljava/lang/String;La/j83;La/fet;II)V

    .line 162
    .line 163
    .line 164
    const/high16 v11, 0x41000000    # 8.0f

    .line 165
    .line 166
    invoke-static/range {v9 .. v14}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    move-object/from16 v26, v9

    .line 171
    .line 172
    iget-object v1, v0, La/nws0;->g:Ljava/lang/String;

    .line 173
    .line 174
    sget-object v15, La/j1t0;->c:La/qrq;

    .line 175
    .line 176
    sget-wide v12, La/qmk;->p:J

    .line 177
    .line 178
    sget-wide v21, La/qmk;->C:J

    .line 179
    .line 180
    new-instance v9, La/y9q0;

    .line 181
    .line 182
    const/16 v20, 0x0

    .line 183
    .line 184
    const v23, 0xfdffdd

    .line 185
    .line 186
    .line 187
    const-wide/16 v10, 0x0

    .line 188
    .line 189
    const/4 v14, 0x0

    .line 190
    const-wide/16 v16, 0x0

    .line 191
    .line 192
    const/16 v18, 0x0

    .line 193
    .line 194
    const/16 v19, 0x0

    .line 195
    .line 196
    invoke-direct/range {v9 .. v23}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 197
    .line 198
    .line 199
    invoke-static {v9, v5}, La/ibm0;->n(La/y9q0;La/fet;)La/y9q0;

    .line 200
    .line 201
    .line 202
    move-result-object v21

    .line 203
    const/16 v24, 0x6180

    .line 204
    .line 205
    const v25, 0x1affc

    .line 206
    .line 207
    .line 208
    const-wide/16 v3, 0x0

    .line 209
    .line 210
    const/4 v5, 0x0

    .line 211
    const-wide/16 v6, 0x0

    .line 212
    .line 213
    move v9, v8

    .line 214
    const/4 v8, 0x0

    .line 215
    move v10, v9

    .line 216
    const/4 v9, 0x0

    .line 217
    move v11, v10

    .line 218
    const/4 v10, 0x0

    .line 219
    move v13, v11

    .line 220
    const-wide/16 v11, 0x0

    .line 221
    .line 222
    move v14, v13

    .line 223
    const/4 v13, 0x0

    .line 224
    move/from16 v16, v14

    .line 225
    .line 226
    const-wide/16 v14, 0x0

    .line 227
    .line 228
    move/from16 v17, v16

    .line 229
    .line 230
    const/16 v16, 0x2

    .line 231
    .line 232
    move/from16 v18, v17

    .line 233
    .line 234
    const/16 v17, 0x0

    .line 235
    .line 236
    move/from16 v19, v18

    .line 237
    .line 238
    const/16 v18, 0x1

    .line 239
    .line 240
    move/from16 v20, v19

    .line 241
    .line 242
    const/16 v19, 0x0

    .line 243
    .line 244
    move/from16 v22, v20

    .line 245
    .line 246
    const/16 v20, 0x0

    .line 247
    .line 248
    const/16 v23, 0x0

    .line 249
    .line 250
    move/from16 v0, v22

    .line 251
    .line 252
    move-object/from16 v22, p2

    .line 253
    .line 254
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 255
    .line 256
    .line 257
    move-object/from16 v5, v22

    .line 258
    .line 259
    invoke-virtual {v5, v0}, La/fet;->r(Z)V

    .line 260
    .line 261
    .line 262
    move-object/from16 v0, v26

    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_3
    invoke-virtual {v5}, La/fet;->X()V

    .line 266
    .line 267
    .line 268
    move-object/from16 v0, p0

    .line 269
    .line 270
    :goto_3
    invoke-virtual {v5}, La/fet;->u()La/yfe0;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    if-eqz v1, :cond_4

    .line 275
    .line 276
    new-instance v2, La/htr0;

    .line 277
    .line 278
    const/16 v3, 0xf

    .line 279
    .line 280
    move-object/from16 v4, p1

    .line 281
    .line 282
    move/from16 v5, p3

    .line 283
    .line 284
    invoke-direct {v2, v0, v4, v5, v3}, La/htr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 285
    .line 286
    .line 287
    iput-object v2, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 288
    .line 289
    :cond_4
    return-void
.end method

.method public static final g(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, La/k6w0;

    .line 21
    .line 22
    new-instance v2, Landroid/os/Bundle;

    .line 23
    .line 24
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-byte v3, v1, La/k6w0;->a:B

    .line 28
    .line 29
    const-string v4, "event_type"

    .line 30
    .line 31
    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    iget-wide v3, v1, La/k6w0;->b:J

    .line 35
    .line 36
    const-string v1, "event_timestamp"

    .line 37
    .line 38
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-object v0
.end method

.method public static final h(La/lc00;La/ljg;ILa/ctf0;ZZ)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, La/ljg;->e:Ljava/util/List;

    .line 8
    .line 9
    iget-object v1, p1, La/ljg;->c:La/f2h;

    .line 10
    .line 11
    iget-object p1, p1, La/ljg;->b:La/f2h;

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, La/le90;

    .line 18
    .line 19
    if-eqz p2, :cond_a

    .line 20
    .line 21
    invoke-static {p2}, La/idm0;->u(La/le90;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_a

    .line 26
    .line 27
    iget-object v0, p1, La/f2h;->c:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    goto/16 :goto_7

    .line 36
    .line 37
    :cond_0
    iget-object v0, v1, La/f2h;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    goto/16 :goto_7

    .line 46
    .line 47
    :cond_1
    new-instance v2, La/wls;

    .line 48
    .line 49
    new-instance v3, La/fp20;

    .line 50
    .line 51
    iget-object v0, p1, La/f2h;->d:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v0}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    iget-object v7, p1, La/f2h;->c:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v8, p2, La/le90;->a:Ljava/lang/String;

    .line 60
    .line 61
    iget-object p1, p2, La/le90;->h:La/zf90;

    .line 62
    .line 63
    sget-object v0, La/zf90;->a:La/zf90;

    .line 64
    .line 65
    if-ne p1, v0, :cond_2

    .line 66
    .line 67
    sget-wide v4, La/ijg;->U:J

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 71
    .line 72
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 73
    .line 74
    .line 75
    move-result-wide v4

    .line 76
    :goto_0
    invoke-direct/range {v3 .. v8}, La/fp20;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance v4, La/fp20;

    .line 80
    .line 81
    iget-object v0, v1, La/f2h;->d:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v0}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    iget-object v8, v1, La/f2h;->c:Ljava/lang/String;

    .line 88
    .line 89
    iget-object v9, p2, La/le90;->b:Ljava/lang/String;

    .line 90
    .line 91
    sget-object v0, La/zf90;->b:La/zf90;

    .line 92
    .line 93
    if-ne p1, v0, :cond_3

    .line 94
    .line 95
    sget-wide v0, La/ijg;->U:J

    .line 96
    .line 97
    :goto_1
    move-wide v5, v0

    .line 98
    goto :goto_2

    .line 99
    :cond_3
    sget-object p1, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 100
    .line 101
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 102
    .line 103
    .line 104
    move-result-wide v0

    .line 105
    goto :goto_1

    .line 106
    :goto_2
    invoke-direct/range {v4 .. v9}, La/fp20;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-object v5, p2, La/le90;->g:Ljava/lang/String;

    .line 110
    .line 111
    if-eqz p4, :cond_4

    .line 112
    .line 113
    const-string p1, "tablet"

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    const-string p1, "mob"

    .line 117
    .line 118
    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    sget-object v0, La/ujn;->h:Ljava/lang/String;

    .line 121
    .line 122
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const-string v0, "/static/img/ImgDefault/Esports/Valorant/Last/"

    .line 126
    .line 127
    const-string v1, ".png"

    .line 128
    .line 129
    const-string v6, "/"

    .line 130
    .line 131
    invoke-static {v0, p1, v6, v5, v1}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    const/4 v1, 0x0

    .line 140
    if-nez v0, :cond_5

    .line 141
    .line 142
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 143
    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_5
    sget-object v0, La/ujn;->h:Ljava/lang/String;

    .line 147
    .line 148
    invoke-static {p1, v0, v1}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-nez v0, :cond_8

    .line 153
    .line 154
    const-string v0, "https://"

    .line 155
    .line 156
    invoke-static {p1, v0, v1}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_6

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_6
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    const/16 v7, 0x2f

    .line 168
    .line 169
    if-lez v0, :cond_7

    .line 170
    .line 171
    invoke-static {p2, v6}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-nez v0, :cond_7

    .line 176
    .line 177
    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    :cond_7
    const/4 v0, 0x1

    .line 181
    new-array v0, v0, [C

    .line 182
    .line 183
    aput-char v7, v0, v1

    .line 184
    .line 185
    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_8
    :goto_4
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    :goto_5
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    new-array p1, v1, [Ljava/lang/Object;

    .line 204
    .line 205
    iget-object p2, p3, La/ctf0;->b:La/lsm0;

    .line 206
    .line 207
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    const v0, 0x7f13059e

    .line 212
    .line 213
    .line 214
    invoke-virtual {p2, v0, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    if-eqz p4, :cond_9

    .line 219
    .line 220
    const p1, 0x7f080f80

    .line 221
    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_9
    const p1, 0x7f080f7f

    .line 225
    .line 226
    .line 227
    :goto_6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    const/4 v8, 0x0

    .line 232
    move/from16 v10, p5

    .line 233
    .line 234
    invoke-direct/range {v2 .. v10}, La/wls;-><init>(La/fp20;La/fp20;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Z)V

    .line 235
    .line 236
    .line 237
    new-instance p1, La/psv;

    .line 238
    .line 239
    const-string p2, "ABOUT_MAP"

    .line 240
    .line 241
    const v0, 0x7f1305c5

    .line 242
    .line 243
    .line 244
    invoke-direct {p1, p2, v0}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0, p1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    new-instance p1, La/tnb0;

    .line 251
    .line 252
    filled-new-array {v2}, [La/wls;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    invoke-static {p2}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 257
    .line 258
    .line 259
    move-result-object p2

    .line 260
    invoke-direct {p1, p2}, La/tnb0;-><init>(La/i4;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p0, p1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    :cond_a
    :goto_7
    return-void
.end method

.method public static i(Z)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, La/bzu;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/bzu;-><init>(B)V

    .line 6
    .line 7
    .line 8
    const-string v1, "static"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, La/bzu;->g(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "img"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/bzu;->g(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "android"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, La/bzu;->g(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v1, "BottomBet"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, La/bzu;->g(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v1, "backgrounds"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, La/bzu;->g(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v1, "toto"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, La/bzu;->g(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v1, "en"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, La/bzu;->g(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    const-string p0, "l"

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const-string p0, "d"

    .line 49
    .line 50
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v2, "01-"

    .line 53
    .line 54
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p0, ".png"

    .line 61
    .line 62
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {v0, p0}, La/bzu;->g(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object p0, v0, La/bzu;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method

.method public static final j(La/v310;Ljava/util/List;La/ctf0;ZZ)La/ylp0;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    iget-object v3, v0, La/v310;->b:La/n410;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v3, v0, La/v310;->a:La/n410;

    .line 19
    .line 20
    :goto_0
    iget-object v0, v0, La/v310;->h:Ljava/util/List;

    .line 21
    .line 22
    new-instance v4, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_2

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    move-object v6, v5

    .line 42
    check-cast v6, La/w310;

    .line 43
    .line 44
    iget-wide v7, v6, La/w310;->a:J

    .line 45
    .line 46
    iget-wide v9, v3, La/n410;->a:J

    .line 47
    .line 48
    cmp-long v7, v7, v9

    .line 49
    .line 50
    if-nez v7, :cond_1

    .line 51
    .line 52
    iget-object v6, v6, La/w310;->b:La/a410;

    .line 53
    .line 54
    sget-object v7, La/a410;->b:La/a410;

    .line 55
    .line 56
    if-ne v6, v7, :cond_1

    .line 57
    .line 58
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    new-instance v8, La/ylp0;

    .line 63
    .line 64
    iget-object v0, v3, La/n410;->f:Ljava/lang/String;

    .line 65
    .line 66
    const-string v5, "TEAM_STAT"

    .line 67
    .line 68
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    new-instance v10, La/rep0;

    .line 73
    .line 74
    move-object/from16 v0, p1

    .line 75
    .line 76
    invoke-static {v3, v0}, La/tfx;->D(La/n410;Ljava/util/List;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sget-object v5, La/ujn;->h:Ljava/lang/String;

    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    invoke-static {v0, v5, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    const-string v7, ""

    .line 88
    .line 89
    const/4 v11, 0x2

    .line 90
    const/4 v12, 0x1

    .line 91
    if-eqz v5, :cond_3

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-nez v5, :cond_4

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    sget-object v5, La/u0d;->a:Ljava/util/List;

    .line 102
    .line 103
    invoke-static {v0}, La/u0d;->c(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_5

    .line 108
    .line 109
    :goto_2
    move-object v0, v7

    .line 110
    goto :goto_4

    .line 111
    :cond_5
    const-string v5, "playerlogo/"

    .line 112
    .line 113
    invoke-static {v0, v5, v12}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_6

    .line 118
    .line 119
    const-string v5, "%s/%s"

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_6
    const-string v5, "%s/playerlogo/%s"

    .line 123
    .line 124
    :goto_3
    sget-object v13, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 125
    .line 126
    sget-object v14, La/ujn;->h:Ljava/lang/String;

    .line 127
    .line 128
    filled-new-array {v14, v0}, [Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v13, v5, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    :goto_4
    iget-object v5, v3, La/n410;->c:Ljava/lang/String;

    .line 141
    .line 142
    if-eqz p3, :cond_7

    .line 143
    .line 144
    const v13, 0x7f130b9e

    .line 145
    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_7
    const v13, 0x7f130b9d

    .line 149
    .line 150
    .line 151
    :goto_5
    new-array v14, v6, [Ljava/lang/Object;

    .line 152
    .line 153
    iget-object v15, v1, La/ctf0;->b:La/lsm0;

    .line 154
    .line 155
    invoke-static {v14, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v14

    .line 159
    invoke-virtual {v15, v13, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v13

    .line 163
    if-eqz p3, :cond_8

    .line 164
    .line 165
    const v14, 0x7f080743

    .line 166
    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_8
    const v14, 0x7f080739

    .line 170
    .line 171
    .line 172
    :goto_6
    invoke-direct {v10, v0, v5, v13, v14}, La/rep0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 173
    .line 174
    .line 175
    iget-object v0, v3, La/n410;->r:Ljava/util/List;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    new-instance v13, Lkotlin/ranges/IntRange;

    .line 185
    .line 186
    const/4 v14, 0x4

    .line 187
    invoke-direct {v13, v6, v14, v12}, Lkotlin/ranges/a;-><init>(III)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v13}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v13

    .line 194
    :goto_7
    move-object v15, v13

    .line 195
    check-cast v15, La/kkx;

    .line 196
    .line 197
    iget-boolean v15, v15, La/kkx;->c:Z

    .line 198
    .line 199
    if-eqz v15, :cond_c

    .line 200
    .line 201
    move-object v15, v13

    .line 202
    check-cast v15, La/bkx;

    .line 203
    .line 204
    invoke-virtual {v15}, La/bkx;->nextInt()I

    .line 205
    .line 206
    .line 207
    move-result v15

    .line 208
    invoke-static {v15, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v15

    .line 212
    check-cast v15, La/s410;

    .line 213
    .line 214
    new-instance v14, La/uvv;

    .line 215
    .line 216
    const/16 v16, 0x0

    .line 217
    .line 218
    if-eqz v15, :cond_9

    .line 219
    .line 220
    iget-object v11, v15, La/s410;->e:Ljava/lang/String;

    .line 221
    .line 222
    goto :goto_8

    .line 223
    :cond_9
    move-object/from16 v11, v16

    .line 224
    .line 225
    :goto_8
    if-nez v11, :cond_a

    .line 226
    .line 227
    move-object v11, v7

    .line 228
    :cond_a
    if-eqz v15, :cond_b

    .line 229
    .line 230
    iget-object v15, v15, La/s410;->f:Ljava/lang/String;

    .line 231
    .line 232
    move-object/from16 v16, v15

    .line 233
    .line 234
    :cond_b
    invoke-static/range {v16 .. v16}, La/fbc;->c0(Ljava/lang/String;)I

    .line 235
    .line 236
    .line 237
    move-result v15

    .line 238
    move-object/from16 v17, v7

    .line 239
    .line 240
    const-wide/16 v6, 0x0

    .line 241
    .line 242
    invoke-direct {v14, v11, v6, v7, v15}, La/uvv;-><init>(Ljava/lang/String;JI)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5, v14}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-object/from16 v7, v17

    .line 249
    .line 250
    const/4 v6, 0x0

    .line 251
    const/4 v11, 0x2

    .line 252
    const/4 v14, 0x4

    .line 253
    goto :goto_7

    .line 254
    :cond_c
    invoke-static {v5}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 259
    .line 260
    .line 261
    move-result-object v11

    .line 262
    iget v0, v3, La/n410;->p:I

    .line 263
    .line 264
    if-gez v0, :cond_e

    .line 265
    .line 266
    if-eqz v2, :cond_d

    .line 267
    .line 268
    goto :goto_9

    .line 269
    :cond_d
    const/16 v18, 0x0

    .line 270
    .line 271
    goto :goto_a

    .line 272
    :cond_e
    :goto_9
    move/from16 v18, v12

    .line 273
    .line 274
    :goto_a
    if-gez v0, :cond_f

    .line 275
    .line 276
    if-eqz v2, :cond_f

    .line 277
    .line 278
    move v5, v12

    .line 279
    goto :goto_b

    .line 280
    :cond_f
    const/4 v5, 0x0

    .line 281
    :goto_b
    new-instance v17, La/dep0;

    .line 282
    .line 283
    int-to-float v0, v0

    .line 284
    const/high16 v6, 0x447a0000    # 1000.0f

    .line 285
    .line 286
    div-float/2addr v0, v6

    .line 287
    invoke-static {v0, v1}, La/msm0;->l(FLa/ctf0;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v19

    .line 291
    if-eqz v5, :cond_10

    .line 292
    .line 293
    const v0, 0x3f19999a    # 0.6f

    .line 294
    .line 295
    .line 296
    :goto_c
    move/from16 v20, v0

    .line 297
    .line 298
    goto :goto_d

    .line 299
    :cond_10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 300
    .line 301
    goto :goto_c

    .line 302
    :goto_d
    if-eqz v5, :cond_11

    .line 303
    .line 304
    sget-wide v0, La/kkg;->g:J

    .line 305
    .line 306
    :goto_e
    move-wide/from16 v21, v0

    .line 307
    .line 308
    goto :goto_f

    .line 309
    :cond_11
    sget-wide v0, La/kkg;->f:J

    .line 310
    .line 311
    goto :goto_e

    .line 312
    :goto_f
    if-eqz p3, :cond_12

    .line 313
    .line 314
    sget-wide v0, La/kkg;->a:J

    .line 315
    .line 316
    :goto_10
    move-wide/from16 v23, v0

    .line 317
    .line 318
    goto :goto_11

    .line 319
    :cond_12
    sget-wide v0, La/kkg;->b:J

    .line 320
    .line 321
    goto :goto_10

    .line 322
    :goto_11
    invoke-direct/range {v17 .. v24}, La/dep0;-><init>(ZLjava/lang/String;FJJ)V

    .line 323
    .line 324
    .line 325
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    new-instance v1, Lkotlin/ranges/IntRange;

    .line 330
    .line 331
    const/4 v5, 0x3

    .line 332
    const/4 v6, 0x0

    .line 333
    invoke-direct {v1, v6, v5, v12}, Lkotlin/ranges/a;-><init>(III)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v1}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    :goto_12
    move-object v6, v1

    .line 341
    check-cast v6, La/kkx;

    .line 342
    .line 343
    iget-boolean v6, v6, La/kkx;->c:Z

    .line 344
    .line 345
    const v7, 0x7f08073c

    .line 346
    .line 347
    .line 348
    if-eqz v6, :cond_1a

    .line 349
    .line 350
    move-object v6, v1

    .line 351
    check-cast v6, La/bkx;

    .line 352
    .line 353
    invoke-virtual {v6}, La/bkx;->nextInt()I

    .line 354
    .line 355
    .line 356
    move-result v6

    .line 357
    invoke-static {v6, v4}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    check-cast v6, La/w310;

    .line 362
    .line 363
    if-eqz v6, :cond_19

    .line 364
    .line 365
    iget-object v6, v6, La/w310;->c:La/x310;

    .line 366
    .line 367
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    if-eqz v6, :cond_18

    .line 372
    .line 373
    if-eq v6, v12, :cond_17

    .line 374
    .line 375
    const/4 v13, 0x2

    .line 376
    if-eq v6, v13, :cond_16

    .line 377
    .line 378
    if-eq v6, v5, :cond_15

    .line 379
    .line 380
    const/4 v14, 0x4

    .line 381
    if-eq v6, v14, :cond_14

    .line 382
    .line 383
    const/4 v15, 0x5

    .line 384
    if-eq v6, v15, :cond_13

    .line 385
    .line 386
    goto :goto_13

    .line 387
    :cond_13
    const v7, 0x7f080ab7

    .line 388
    .line 389
    .line 390
    goto :goto_13

    .line 391
    :cond_14
    const v7, 0x7f080ab6

    .line 392
    .line 393
    .line 394
    goto :goto_13

    .line 395
    :cond_15
    const/4 v14, 0x4

    .line 396
    const v7, 0x7f080aba

    .line 397
    .line 398
    .line 399
    goto :goto_13

    .line 400
    :cond_16
    const/4 v14, 0x4

    .line 401
    const v7, 0x7f080ab9

    .line 402
    .line 403
    .line 404
    goto :goto_13

    .line 405
    :cond_17
    const/4 v13, 0x2

    .line 406
    const/4 v14, 0x4

    .line 407
    const v7, 0x7f080ab8

    .line 408
    .line 409
    .line 410
    goto :goto_13

    .line 411
    :cond_18
    const/4 v13, 0x2

    .line 412
    const/4 v14, 0x4

    .line 413
    const v7, 0x7f080ab5

    .line 414
    .line 415
    .line 416
    goto :goto_13

    .line 417
    :cond_19
    const/4 v13, 0x2

    .line 418
    const/4 v14, 0x4

    .line 419
    :goto_13
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 420
    .line 421
    .line 422
    move-result-object v6

    .line 423
    invoke-virtual {v0, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    goto :goto_12

    .line 427
    :cond_1a
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    new-instance v1, La/tgo0;

    .line 432
    .line 433
    const/16 v4, 0xe

    .line 434
    .line 435
    invoke-direct {v1, v4}, La/tgo0;-><init>(B)V

    .line 436
    .line 437
    .line 438
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    if-eqz v0, :cond_1b

    .line 447
    .line 448
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 449
    .line 450
    .line 451
    move-result v1

    .line 452
    if-eqz v1, :cond_1b

    .line 453
    .line 454
    move v1, v12

    .line 455
    const/4 v6, 0x0

    .line 456
    goto :goto_15

    .line 457
    :cond_1b
    const/4 v6, 0x0

    .line 458
    invoke-virtual {v0, v6}, La/b3;->listIterator(I)Ljava/util/ListIterator;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 463
    .line 464
    .line 465
    move-result v4

    .line 466
    if-eqz v4, :cond_1d

    .line 467
    .line 468
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    check-cast v4, Ljava/lang/Number;

    .line 473
    .line 474
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 475
    .line 476
    .line 477
    move-result v4

    .line 478
    if-ne v4, v7, :cond_1c

    .line 479
    .line 480
    goto :goto_14

    .line 481
    :cond_1c
    move v1, v6

    .line 482
    goto :goto_15

    .line 483
    :cond_1d
    move v1, v12

    .line 484
    :goto_15
    new-instance v13, La/ybp0;

    .line 485
    .line 486
    if-eqz v1, :cond_1e

    .line 487
    .line 488
    if-eqz v2, :cond_1f

    .line 489
    .line 490
    :cond_1e
    move v6, v12

    .line 491
    :cond_1f
    if-eqz v2, :cond_20

    .line 492
    .line 493
    if-eqz v1, :cond_20

    .line 494
    .line 495
    sget-object v0, La/lak0;->c:La/lak0;

    .line 496
    .line 497
    :cond_20
    invoke-direct {v13, v0, v6}, La/ybp0;-><init>(La/i4;Z)V

    .line 498
    .line 499
    .line 500
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    const v1, 0x7f080746

    .line 505
    .line 506
    .line 507
    iget v4, v3, La/n410;->k:I

    .line 508
    .line 509
    invoke-static {v0, v1, v4, v2}, La/ibm0;->f(La/lc00;IIZ)V

    .line 510
    .line 511
    .line 512
    const v1, 0x7f080747

    .line 513
    .line 514
    .line 515
    const/4 v4, -0x1

    .line 516
    invoke-static {v0, v1, v4, v2}, La/ibm0;->f(La/lc00;IIZ)V

    .line 517
    .line 518
    .line 519
    const v1, 0x7f080738

    .line 520
    .line 521
    .line 522
    iget v5, v3, La/n410;->n:I

    .line 523
    .line 524
    invoke-static {v0, v1, v5, v2}, La/ibm0;->f(La/lc00;IIZ)V

    .line 525
    .line 526
    .line 527
    const v1, 0x7f08073d

    .line 528
    .line 529
    .line 530
    invoke-static {v0, v1, v4, v2}, La/ibm0;->f(La/lc00;IIZ)V

    .line 531
    .line 532
    .line 533
    const v1, 0x7f08073f

    .line 534
    .line 535
    .line 536
    iget v4, v3, La/n410;->l:I

    .line 537
    .line 538
    invoke-static {v0, v1, v4, v2}, La/ibm0;->f(La/lc00;IIZ)V

    .line 539
    .line 540
    .line 541
    const v1, 0x7f08073b

    .line 542
    .line 543
    .line 544
    iget v3, v3, La/n410;->j:I

    .line 545
    .line 546
    invoke-static {v0, v1, v3, v2}, La/ibm0;->f(La/lc00;IIZ)V

    .line 547
    .line 548
    .line 549
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    new-instance v14, La/llp0;

    .line 558
    .line 559
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 560
    .line 561
    .line 562
    move-result v1

    .line 563
    xor-int/2addr v1, v12

    .line 564
    invoke-direct {v14, v0, v1}, La/llp0;-><init>(La/i4;Z)V

    .line 565
    .line 566
    .line 567
    move-object/from16 v12, v17

    .line 568
    .line 569
    invoke-direct/range {v8 .. v14}, La/ylp0;-><init>(Ljava/lang/String;La/rep0;La/i4;La/dep0;La/ybp0;La/llp0;)V

    .line 570
    .line 571
    .line 572
    return-object v8
.end method

.method public static final k(La/o310;La/y3h;La/m9s;La/ctf0;ZZ)La/ylp0;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    move/from16 v5, p5

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    iget-object v6, v0, La/o310;->f:La/a610;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v6, v0, La/o310;->g:La/a610;

    .line 28
    .line 29
    :goto_0
    new-instance v7, La/ylp0;

    .line 30
    .line 31
    iget-object v8, v6, La/a610;->g:La/d310;

    .line 32
    .line 33
    new-instance v9, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v10, "TEAM_STAT"

    .line 36
    .line 37
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    move-object v10, v8

    .line 51
    move-object v8, v9

    .line 52
    new-instance v9, La/rep0;

    .line 53
    .line 54
    const-string v11, ""

    .line 55
    .line 56
    if-eqz v4, :cond_1

    .line 57
    .line 58
    iget-object v12, v2, La/m9s;->m:Ljava/util/List;

    .line 59
    .line 60
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    check-cast v12, Ljava/lang/String;

    .line 65
    .line 66
    if-nez v12, :cond_2

    .line 67
    .line 68
    :goto_1
    move-object v12, v11

    .line 69
    goto :goto_2

    .line 70
    :cond_1
    iget-object v12, v2, La/m9s;->n:Ljava/util/List;

    .line 71
    .line 72
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    check-cast v12, Ljava/lang/String;

    .line 77
    .line 78
    if-nez v12, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    :goto_2
    sget-object v13, La/ujn;->h:Ljava/lang/String;

    .line 82
    .line 83
    const/4 v14, 0x0

    .line 84
    invoke-static {v12, v13, v14}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 85
    .line 86
    .line 87
    move-result v13

    .line 88
    const/4 v15, 0x2

    .line 89
    const/4 v14, 0x1

    .line 90
    if-eqz v13, :cond_3

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_3
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result v13

    .line 97
    if-nez v13, :cond_4

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_4
    sget-object v13, La/u0d;->a:Ljava/util/List;

    .line 101
    .line 102
    invoke-static {v12}, La/u0d;->c(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    if-eqz v13, :cond_5

    .line 107
    .line 108
    :goto_3
    move-object v12, v11

    .line 109
    goto :goto_5

    .line 110
    :cond_5
    const-string v13, "playerlogo/"

    .line 111
    .line 112
    invoke-static {v12, v13, v14}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    if-eqz v13, :cond_6

    .line 117
    .line 118
    const-string v13, "%s/%s"

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_6
    const-string v13, "%s/playerlogo/%s"

    .line 122
    .line 123
    :goto_4
    sget-object v14, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 124
    .line 125
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 126
    .line 127
    filled-new-array {v4, v12}, [Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-static {v4, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-static {v14, v13, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v12

    .line 139
    :goto_5
    if-eqz p4, :cond_7

    .line 140
    .line 141
    iget-object v2, v2, La/m9s;->i:Ljava/lang/String;

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_7
    iget-object v2, v2, La/m9s;->j:Ljava/lang/String;

    .line 145
    .line 146
    :goto_6
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    const/4 v13, 0x0

    .line 151
    if-eqz v4, :cond_a

    .line 152
    .line 153
    const/4 v14, 0x1

    .line 154
    if-eq v4, v14, :cond_9

    .line 155
    .line 156
    if-ne v4, v15, :cond_8

    .line 157
    .line 158
    move-object/from16 p2, v13

    .line 159
    .line 160
    move-object v13, v11

    .line 161
    goto :goto_7

    .line 162
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 163
    .line 164
    .line 165
    return-object v13

    .line 166
    :cond_9
    const/4 v4, 0x0

    .line 167
    new-array v14, v4, [Ljava/lang/Object;

    .line 168
    .line 169
    move-object/from16 p2, v13

    .line 170
    .line 171
    iget-object v13, v3, La/ctf0;->b:La/lsm0;

    .line 172
    .line 173
    invoke-static {v14, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v14

    .line 177
    const v15, 0x7f130b9e

    .line 178
    .line 179
    .line 180
    invoke-virtual {v13, v15, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v13

    .line 184
    goto :goto_7

    .line 185
    :cond_a
    move-object/from16 p2, v13

    .line 186
    .line 187
    const/4 v4, 0x0

    .line 188
    new-array v13, v4, [Ljava/lang/Object;

    .line 189
    .line 190
    iget-object v14, v3, La/ctf0;->b:La/lsm0;

    .line 191
    .line 192
    invoke-static {v13, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v13

    .line 196
    const v4, 0x7f130b9d

    .line 197
    .line 198
    .line 199
    invoke-virtual {v14, v4, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v13

    .line 203
    :goto_7
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    if-eqz v4, :cond_d

    .line 208
    .line 209
    const/4 v15, 0x1

    .line 210
    if-eq v4, v15, :cond_c

    .line 211
    .line 212
    const/4 v15, 0x2

    .line 213
    if-ne v4, v15, :cond_b

    .line 214
    .line 215
    const v4, 0x7f080742

    .line 216
    .line 217
    .line 218
    goto :goto_8

    .line 219
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 220
    .line 221
    .line 222
    return-object p2

    .line 223
    :cond_c
    const v4, 0x7f080743

    .line 224
    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_d
    const v4, 0x7f080739

    .line 228
    .line 229
    .line 230
    :goto_8
    invoke-direct {v9, v12, v2, v13, v4}, La/rep0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 231
    .line 232
    .line 233
    if-eqz p4, :cond_e

    .line 234
    .line 235
    iget-object v0, v0, La/o310;->h:Ljava/util/List;

    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_e
    iget-object v0, v0, La/o310;->i:Ljava/util/List;

    .line 239
    .line 240
    :goto_9
    iget-object v2, v1, La/y3h;->c:Ljava/util/List;

    .line 241
    .line 242
    iget-object v1, v1, La/y3h;->g:Ljava/util/List;

    .line 243
    .line 244
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    new-instance v4, Lkotlin/ranges/IntRange;

    .line 256
    .line 257
    const/4 v12, 0x4

    .line 258
    const/4 v13, 0x0

    .line 259
    const/4 v15, 0x1

    .line 260
    invoke-direct {v4, v13, v12, v15}, Lkotlin/ranges/a;-><init>(III)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v4}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    :goto_a
    move-object v13, v4

    .line 268
    check-cast v13, La/kkx;

    .line 269
    .line 270
    iget-boolean v13, v13, La/kkx;->c:Z

    .line 271
    .line 272
    if-eqz v13, :cond_13

    .line 273
    .line 274
    move-object v13, v4

    .line 275
    check-cast v13, La/bkx;

    .line 276
    .line 277
    invoke-virtual {v13}, La/bkx;->nextInt()I

    .line 278
    .line 279
    .line 280
    move-result v13

    .line 281
    invoke-static {v13, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v13

    .line 285
    check-cast v13, La/r010;

    .line 286
    .line 287
    if-eqz v13, :cond_12

    .line 288
    .line 289
    iget-object v15, v13, La/r010;->d:Ljava/lang/String;

    .line 290
    .line 291
    move-object/from16 p0, v15

    .line 292
    .line 293
    iget-wide v14, v13, La/r010;->f:J

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 296
    .line 297
    .line 298
    move-result-object v18

    .line 299
    :goto_b
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 300
    .line 301
    .line 302
    move-result v19

    .line 303
    if-eqz v19, :cond_10

    .line 304
    .line 305
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v19

    .line 309
    move-object/from16 v12, v19

    .line 310
    .line 311
    check-cast v12, La/c4h;

    .line 312
    .line 313
    iget-object v12, v12, La/c4h;->b:Ljava/lang/String;

    .line 314
    .line 315
    move-object/from16 p4, v0

    .line 316
    .line 317
    iget-object v0, v13, La/r010;->e:Ljava/lang/String;

    .line 318
    .line 319
    invoke-virtual {v12, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    if-eqz v0, :cond_f

    .line 324
    .line 325
    goto :goto_c

    .line 326
    :cond_f
    move-object/from16 v0, p4

    .line 327
    .line 328
    const/4 v12, 0x4

    .line 329
    goto :goto_b

    .line 330
    :cond_10
    move-object/from16 p4, v0

    .line 331
    .line 332
    move-object/from16 v19, p2

    .line 333
    .line 334
    :goto_c
    move-object/from16 v0, v19

    .line 335
    .line 336
    check-cast v0, La/c4h;

    .line 337
    .line 338
    if-eqz v0, :cond_11

    .line 339
    .line 340
    iget-object v0, v0, La/c4h;->d:Ljava/lang/String;

    .line 341
    .line 342
    goto :goto_d

    .line 343
    :cond_11
    move-object/from16 v0, p2

    .line 344
    .line 345
    :goto_d
    invoke-static {v0}, La/fbc;->c0(Ljava/lang/String;)I

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    new-instance v12, La/uvv;

    .line 350
    .line 351
    move-object/from16 v13, p0

    .line 352
    .line 353
    invoke-direct {v12, v13, v14, v15, v0}, La/uvv;-><init>(Ljava/lang/String;JI)V

    .line 354
    .line 355
    .line 356
    const v0, 0x7f080742

    .line 357
    .line 358
    .line 359
    goto :goto_e

    .line 360
    :cond_12
    move-object/from16 p4, v0

    .line 361
    .line 362
    new-instance v12, La/uvv;

    .line 363
    .line 364
    const-wide/16 v13, 0x0

    .line 365
    .line 366
    const v0, 0x7f080742

    .line 367
    .line 368
    .line 369
    invoke-direct {v12, v11, v13, v14, v0}, La/uvv;-><init>(Ljava/lang/String;JI)V

    .line 370
    .line 371
    .line 372
    :goto_e
    invoke-virtual {v2, v12}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-object/from16 v0, p4

    .line 376
    .line 377
    const/4 v12, 0x4

    .line 378
    goto :goto_a

    .line 379
    :cond_13
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    iget v1, v6, La/a610;->h:F

    .line 388
    .line 389
    const/4 v2, 0x0

    .line 390
    cmpl-float v4, v1, v2

    .line 391
    .line 392
    if-gez v4, :cond_15

    .line 393
    .line 394
    if-eqz v5, :cond_14

    .line 395
    .line 396
    goto :goto_f

    .line 397
    :cond_14
    const/16 v18, 0x0

    .line 398
    .line 399
    goto :goto_10

    .line 400
    :cond_15
    :goto_f
    const/16 v18, 0x1

    .line 401
    .line 402
    :goto_10
    cmpg-float v2, v1, v2

    .line 403
    .line 404
    if-gez v2, :cond_16

    .line 405
    .line 406
    if-eqz v5, :cond_16

    .line 407
    .line 408
    const/4 v2, 0x1

    .line 409
    goto :goto_11

    .line 410
    :cond_16
    const/4 v2, 0x0

    .line 411
    :goto_11
    new-instance v11, La/dep0;

    .line 412
    .line 413
    invoke-static {v1, v3}, La/msm0;->l(FLa/ctf0;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v19

    .line 417
    if-eqz v2, :cond_17

    .line 418
    .line 419
    const v1, 0x3f19999a    # 0.6f

    .line 420
    .line 421
    .line 422
    :goto_12
    move/from16 v20, v1

    .line 423
    .line 424
    goto :goto_13

    .line 425
    :cond_17
    const/high16 v1, 0x3f800000    # 1.0f

    .line 426
    .line 427
    goto :goto_12

    .line 428
    :goto_13
    if-eqz v2, :cond_18

    .line 429
    .line 430
    sget-wide v1, La/kkg;->g:J

    .line 431
    .line 432
    :goto_14
    move-wide/from16 v21, v1

    .line 433
    .line 434
    goto :goto_15

    .line 435
    :cond_18
    sget-wide v1, La/kkg;->f:J

    .line 436
    .line 437
    goto :goto_14

    .line 438
    :goto_15
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    if-eqz v1, :cond_1b

    .line 443
    .line 444
    const/4 v15, 0x1

    .line 445
    if-eq v1, v15, :cond_1a

    .line 446
    .line 447
    const/4 v15, 0x2

    .line 448
    if-ne v1, v15, :cond_19

    .line 449
    .line 450
    sget-wide v1, La/kkg;->c:J

    .line 451
    .line 452
    :goto_16
    move-wide/from16 v23, v1

    .line 453
    .line 454
    move-object/from16 v17, v11

    .line 455
    .line 456
    goto :goto_17

    .line 457
    :cond_19
    invoke-static {}, La/t9f;->b()V

    .line 458
    .line 459
    .line 460
    return-object p2

    .line 461
    :cond_1a
    sget-wide v1, La/kkg;->a:J

    .line 462
    .line 463
    goto :goto_16

    .line 464
    :cond_1b
    sget-wide v1, La/kkg;->b:J

    .line 465
    .line 466
    goto :goto_16

    .line 467
    :goto_17
    invoke-direct/range {v17 .. v24}, La/dep0;-><init>(ZLjava/lang/String;FJJ)V

    .line 468
    .line 469
    .line 470
    move-object/from16 v11, v17

    .line 471
    .line 472
    new-instance v12, La/ybp0;

    .line 473
    .line 474
    iget-object v1, v6, La/a610;->f:Ljava/util/List;

    .line 475
    .line 476
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    new-instance v3, Lkotlin/ranges/IntRange;

    .line 481
    .line 482
    const/4 v4, 0x3

    .line 483
    const/4 v13, 0x0

    .line 484
    const/4 v15, 0x1

    .line 485
    invoke-direct {v3, v13, v4, v15}, Lkotlin/ranges/a;-><init>(III)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v3}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 489
    .line 490
    .line 491
    move-result-object v3

    .line 492
    :goto_18
    move-object v10, v3

    .line 493
    check-cast v10, La/kkx;

    .line 494
    .line 495
    iget-boolean v10, v10, La/kkx;->c:Z

    .line 496
    .line 497
    if-eqz v10, :cond_23

    .line 498
    .line 499
    move-object v10, v3

    .line 500
    check-cast v10, La/bkx;

    .line 501
    .line 502
    invoke-virtual {v10}, La/bkx;->nextInt()I

    .line 503
    .line 504
    .line 505
    move-result v10

    .line 506
    invoke-static {v10, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v10

    .line 510
    check-cast v10, La/nz00;

    .line 511
    .line 512
    const v13, 0x7f08073c

    .line 513
    .line 514
    .line 515
    if-eqz v10, :cond_22

    .line 516
    .line 517
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 518
    .line 519
    .line 520
    move-result v10

    .line 521
    if-eqz v10, :cond_21

    .line 522
    .line 523
    const/4 v15, 0x1

    .line 524
    if-eq v10, v15, :cond_20

    .line 525
    .line 526
    const/4 v15, 0x2

    .line 527
    if-eq v10, v15, :cond_1f

    .line 528
    .line 529
    if-eq v10, v4, :cond_1e

    .line 530
    .line 531
    const/4 v14, 0x4

    .line 532
    if-eq v10, v14, :cond_1d

    .line 533
    .line 534
    const/4 v4, 0x5

    .line 535
    if-eq v10, v4, :cond_1c

    .line 536
    .line 537
    goto :goto_19

    .line 538
    :cond_1c
    const v13, 0x7f080ab7

    .line 539
    .line 540
    .line 541
    goto :goto_19

    .line 542
    :cond_1d
    const v13, 0x7f080ab5

    .line 543
    .line 544
    .line 545
    goto :goto_19

    .line 546
    :cond_1e
    const/4 v14, 0x4

    .line 547
    const v13, 0x7f080ab9

    .line 548
    .line 549
    .line 550
    goto :goto_19

    .line 551
    :cond_1f
    const/4 v14, 0x4

    .line 552
    const v13, 0x7f080aba

    .line 553
    .line 554
    .line 555
    goto :goto_19

    .line 556
    :cond_20
    const/4 v14, 0x4

    .line 557
    const/4 v15, 0x2

    .line 558
    const v13, 0x7f080ab6

    .line 559
    .line 560
    .line 561
    goto :goto_19

    .line 562
    :cond_21
    const/4 v14, 0x4

    .line 563
    const/4 v15, 0x2

    .line 564
    const v13, 0x7f080ab8

    .line 565
    .line 566
    .line 567
    goto :goto_19

    .line 568
    :cond_22
    const/4 v14, 0x4

    .line 569
    const/4 v15, 0x2

    .line 570
    :goto_19
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 571
    .line 572
    .line 573
    move-result-object v4

    .line 574
    invoke-virtual {v2, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    const/4 v4, 0x3

    .line 578
    goto :goto_18

    .line 579
    :cond_23
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    new-instance v2, La/tgo0;

    .line 584
    .line 585
    const/16 v3, 0xd

    .line 586
    .line 587
    invoke-direct {v2, v3}, La/tgo0;-><init>(B)V

    .line 588
    .line 589
    .line 590
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    const/4 v15, 0x1

    .line 599
    invoke-direct {v12, v1, v15}, La/ybp0;-><init>(La/i4;Z)V

    .line 600
    .line 601
    .line 602
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    const v2, 0x7f080746

    .line 607
    .line 608
    .line 609
    iget v3, v6, La/a610;->b:I

    .line 610
    .line 611
    invoke-static {v1, v2, v3, v5}, La/ibm0;->f(La/lc00;IIZ)V

    .line 612
    .line 613
    .line 614
    const v2, 0x7f080747

    .line 615
    .line 616
    .line 617
    const/4 v3, -0x1

    .line 618
    invoke-static {v1, v2, v3, v5}, La/ibm0;->f(La/lc00;IIZ)V

    .line 619
    .line 620
    .line 621
    const v2, 0x7f080738

    .line 622
    .line 623
    .line 624
    iget v4, v6, La/a610;->d:I

    .line 625
    .line 626
    invoke-static {v1, v2, v4, v5}, La/ibm0;->f(La/lc00;IIZ)V

    .line 627
    .line 628
    .line 629
    const v2, 0x7f08073d

    .line 630
    .line 631
    .line 632
    invoke-static {v1, v2, v3, v5}, La/ibm0;->f(La/lc00;IIZ)V

    .line 633
    .line 634
    .line 635
    const v2, 0x7f08073f

    .line 636
    .line 637
    .line 638
    iget v3, v6, La/a610;->c:I

    .line 639
    .line 640
    invoke-static {v1, v2, v3, v5}, La/ibm0;->f(La/lc00;IIZ)V

    .line 641
    .line 642
    .line 643
    const v2, 0x7f08073b

    .line 644
    .line 645
    .line 646
    iget v3, v6, La/a610;->e:I

    .line 647
    .line 648
    invoke-static {v1, v2, v3, v5}, La/ibm0;->f(La/lc00;IIZ)V

    .line 649
    .line 650
    .line 651
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    new-instance v13, La/llp0;

    .line 660
    .line 661
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 662
    .line 663
    .line 664
    move-result v2

    .line 665
    const/16 v16, 0x1

    .line 666
    .line 667
    xor-int/lit8 v2, v2, 0x1

    .line 668
    .line 669
    invoke-direct {v13, v1, v2}, La/llp0;-><init>(La/i4;Z)V

    .line 670
    .line 671
    .line 672
    move-object v10, v0

    .line 673
    invoke-direct/range {v7 .. v13}, La/ylp0;-><init>(Ljava/lang/String;La/rep0;La/i4;La/dep0;La/ybp0;La/llp0;)V

    .line 674
    .line 675
    .line 676
    return-object v7
.end method

.method public static final l(La/ctf0;La/bcs0;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, La/rdj;->a:La/rdj;

    .line 2
    .line 3
    invoke-virtual {p0}, La/ctf0;->h()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    iget-wide v0, p1, La/bcs0;->i:J

    .line 8
    .line 9
    sget-object p1, La/efj;->c:La/efj;

    .line 10
    .line 11
    new-instance v2, La/znq0;

    .line 12
    .line 13
    invoke-direct {v2, v0, v1}, La/znq0;-><init>(J)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 v0, 0x0

    .line 21
    const/16 v1, 0x38

    .line 22
    .line 23
    invoke-static {v2, p1, p0, v0, v1}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static final m(La/ctf0;La/bcs0;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p1, La/bcs0;->h:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p1, La/bcs0;->u:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-lez v1, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-lez p1, :cond_1

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    new-array v0, p1, [Ljava/lang/Object;

    .line 27
    .line 28
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 29
    .line 30
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const v0, 0x7f130c89

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public static final n(La/qbs0;La/wcb;)La/n0x;
    .locals 5

    .line 1
    new-instance v0, La/n0x;

    .line 2
    .line 3
    iget-object p0, p0, La/qbs0;->a:La/bcs0;

    .line 4
    .line 5
    iget-wide v1, p0, La/bcs0;->b:J

    .line 6
    .line 7
    iget-wide v3, p0, La/bcs0;->c:J

    .line 8
    .line 9
    invoke-virtual {p1, v1, v2, v3, v4}, La/wcb;->a(JJ)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static final o(La/qbs0;)La/chl0;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, La/chl0;

    .line 4
    .line 5
    iget-object v2, v0, La/qbs0;->b:La/mbs0;

    .line 6
    .line 7
    iget-object v3, v2, La/mbs0;->p:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, v2, La/mbs0;->o:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v4, ": "

    .line 19
    .line 20
    invoke-static {v3, v4, v2}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :goto_0
    iget-object v3, v0, La/qbs0;->b:La/mbs0;

    .line 25
    .line 26
    move-object v4, v1

    .line 27
    move-object v1, v2

    .line 28
    iget-object v2, v3, La/mbs0;->n:Ljava/lang/String;

    .line 29
    .line 30
    iget-boolean v5, v3, La/mbs0;->d:Z

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    sget-object v5, La/k0d;->b:La/k0d;

    .line 35
    .line 36
    :goto_1
    move-object v6, v4

    .line 37
    goto :goto_2

    .line 38
    :cond_1
    iget-object v5, v3, La/mbs0;->c:La/izc;

    .line 39
    .line 40
    sget-object v6, La/izc;->d:La/izc;

    .line 41
    .line 42
    if-ne v5, v6, :cond_2

    .line 43
    .line 44
    sget-object v5, La/k0d;->a:La/k0d;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    sget-object v6, La/izc;->b:La/izc;

    .line 48
    .line 49
    if-ne v5, v6, :cond_3

    .line 50
    .line 51
    sget-object v5, La/k0d;->c:La/k0d;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    sget-object v6, La/izc;->c:La/izc;

    .line 55
    .line 56
    if-ne v5, v6, :cond_4

    .line 57
    .line 58
    sget-object v5, La/k0d;->d:La/k0d;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    sget-object v5, La/k0d;->a:La/k0d;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :goto_2
    sget-object v4, La/a65;->a:La/a65;

    .line 65
    .line 66
    move-object v7, v6

    .line 67
    iget-boolean v6, v3, La/mbs0;->r:Z

    .line 68
    .line 69
    iget-wide v8, v3, La/mbs0;->i:J

    .line 70
    .line 71
    iget-object v3, v3, La/mbs0;->b:La/uoy;

    .line 72
    .line 73
    iget-byte v3, v3, La/uoy;->a:B

    .line 74
    .line 75
    iget-object v0, v0, La/qbs0;->a:La/bcs0;

    .line 76
    .line 77
    iget-wide v10, v0, La/bcs0;->a:J

    .line 78
    .line 79
    move-wide/from16 v17, v8

    .line 80
    .line 81
    new-instance v8, La/xgl0;

    .line 82
    .line 83
    const/16 v16, 0x1

    .line 84
    .line 85
    const/16 v22, 0x0

    .line 86
    .line 87
    move-wide/from16 v20, v10

    .line 88
    .line 89
    const-wide/16 v9, -0x1

    .line 90
    .line 91
    const-wide/16 v11, 0x0

    .line 92
    .line 93
    const-wide/16 v13, 0x0

    .line 94
    .line 95
    const-string v15, ""

    .line 96
    .line 97
    move/from16 v19, v3

    .line 98
    .line 99
    invoke-direct/range {v8 .. v22}, La/xgl0;-><init>(JDDLjava/lang/String;IJIJZ)V

    .line 100
    .line 101
    .line 102
    move-object v3, v5

    .line 103
    const/4 v5, 0x0

    .line 104
    move-object v0, v7

    .line 105
    const/4 v7, 0x0

    .line 106
    move-object v9, v8

    .line 107
    const/4 v8, 0x0

    .line 108
    invoke-direct/range {v0 .. v9}, La/chl0;-><init>(Ljava/lang/String;Ljava/lang/String;La/k0d;La/a65;ZZZZLa/xgl0;)V

    .line 109
    .line 110
    .line 111
    return-object v0
.end method

.method public static final p(La/fho;La/ctf0;)La/zia;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eq p0, v0, :cond_2

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    if-eq p0, v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x3

    .line 15
    if-ne p0, v0, :cond_0

    .line 16
    .line 17
    new-instance p0, La/yia;

    .line 18
    .line 19
    new-array v0, v1, [Ljava/lang/Object;

    .line 20
    .line 21
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const v1, 0x7f130757

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {p0, p1}, La/yia;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return-object p0

    .line 43
    :cond_1
    new-instance p0, La/xia;

    .line 44
    .line 45
    new-array v0, v1, [Ljava/lang/Object;

    .line 46
    .line 47
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 48
    .line 49
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const v1, 0x7f130ed7

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {p0, p1}, La/xia;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_2
    new-instance p0, La/via;

    .line 65
    .line 66
    new-array v0, v1, [Ljava/lang/Object;

    .line 67
    .line 68
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 69
    .line 70
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const v1, 0x7f1301ad

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-direct {p0, p1}, La/via;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_3
    sget-object p0, La/wia;->a:La/wia;

    .line 86
    .line 87
    return-object p0
.end method

.method public static q(ILandroid/content/Context;)Z
    .locals 3

    .line 1
    const-string v0, "com.google.android.gms"

    .line 2
    .line 3
    invoke-static {p1, p0, v0}, La/bcm0;->B(Landroid/content/Context;ILjava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/16 v2, 0x40

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {p0, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    invoke-static {p1}, La/fbv;->b(Landroid/content/Context;)La/fbv;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p0, v1}, La/fbv;->f(Landroid/content/pm/PackageInfo;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v2, 0x1

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-static {p0, v2}, La/fbv;->f(Landroid/content/pm/PackageInfo;Z)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_4

    .line 41
    .line 42
    iget-object p0, p1, La/fbv;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Landroid/content/Context;

    .line 45
    .line 46
    invoke-static {p0}, La/bbv;->a(Landroid/content/Context;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_3

    .line 51
    .line 52
    :goto_0
    return v2

    .line 53
    :cond_3
    const-string p0, "GoogleSignatureVerifier"

    .line 54
    .line 55
    const-string p1, "Test-keys aren\'t accepted on this build."

    .line 56
    .line 57
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    return v1

    .line 61
    :catch_0
    const/4 p0, 0x3

    .line 62
    const-string p1, "UidVerifier"

    .line 63
    .line 64
    invoke-static {p1, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_4

    .line 69
    .line 70
    const-string p0, "Package manager can\'t find google play services package, defaulting to false"

    .line 71
    .line 72
    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    :cond_4
    :goto_1
    return v1
.end method

.method public static final r(La/f0r0;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, La/f0r0;->a()La/j1r0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, La/i1r0;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, La/f0r0;->a()La/j1r0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v0, v0, La/d1r0;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, La/f0r0;->a()La/j1r0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v0, v0, La/e1r0;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-interface {p0}, La/f0r0;->a()La/j1r0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    instance-of p0, p0, La/c1r0;

    .line 30
    .line 31
    if-nez p0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public static final s(Landroid/view/View;II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    add-int/2addr v0, p1

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, p2

    .line 14
    invoke-virtual {p0, p1, p2, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final t(Landroid/view/View;II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x40000000    # 2.0f

    .line 5
    .line 6
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final u(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->measure(II)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static v(La/btf;)V
    .locals 5

    .line 1
    const v0, -0x800001

    .line 2
    .line 3
    .line 4
    iput v0, p0, La/btf;->k:F

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    .line 8
    iput v0, p0, La/btf;->j:I

    .line 9
    .line 10
    iget-object v0, p0, La/btf;->a:Ljava/lang/CharSequence;

    .line 11
    .line 12
    instance-of v1, v0, Landroid/text/Spanned;

    .line 13
    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    instance-of v1, v0, Landroid/text/Spannable;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-static {v0}, Landroid/text/SpannableString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableString;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, La/btf;->a:Ljava/lang/CharSequence;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput-object v1, p0, La/btf;->b:Landroid/graphics/Bitmap;

    .line 28
    .line 29
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    check-cast v0, Landroid/text/Spannable;

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    const-class v1, Ljava/lang/Object;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-interface {v0, v2, p0, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    array-length v1, p0

    .line 46
    :goto_0
    if-ge v2, v1, :cond_3

    .line 47
    .line 48
    aget-object v3, p0, v2

    .line 49
    .line 50
    instance-of v4, v3, Landroid/text/style/AbsoluteSizeSpan;

    .line 51
    .line 52
    if-nez v4, :cond_1

    .line 53
    .line 54
    instance-of v4, v3, Landroid/text/style/RelativeSizeSpan;

    .line 55
    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    :cond_1
    invoke-interface {v0, v3}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    return-void
.end method

.method public static w(FIII)F
    .locals 2

    .line 1
    const v0, -0x800001

    .line 2
    .line 3
    .line 4
    cmpl-float v1, p0, v0

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    if-eqz p1, :cond_3

    .line 10
    .line 11
    const/4 p3, 0x1

    .line 12
    if-eq p1, p3, :cond_2

    .line 13
    .line 14
    const/4 p2, 0x2

    .line 15
    if-eq p1, p2, :cond_1

    .line 16
    .line 17
    return v0

    .line 18
    :cond_1
    return p0

    .line 19
    :cond_2
    int-to-float p1, p2

    .line 20
    :goto_0
    mul-float/2addr p0, p1

    .line 21
    return p0

    .line 22
    :cond_3
    int-to-float p1, p3

    .line 23
    goto :goto_0
.end method

.method public static x(Landroid/view/Window;Z)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, La/e7;->l(Landroid/view/Window;Z)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/16 v1, 0x1e

    .line 12
    .line 13
    if-lt v0, v1, :cond_1

    .line 14
    .line 15
    invoke-static {p0, p1}, La/e7;->k(Landroid/view/Window;Z)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    and-int/lit16 p1, v0, -0x701

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    or-int/lit16 p1, v0, 0x700

    .line 33
    .line 34
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static final y(La/a5w;La/ctf0;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;ZZZZZZZZI)La/qp30;
    .locals 58

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-object/from16 v2, p2

    move-object/from16 v1, p4

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    sget-object v6, La/i7u;->b:La/i7u;

    sget-object v7, La/i7u;->c:La/i7u;

    sget-object v8, La/pn40;->a:La/pn40;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    instance-of v8, v0, La/kzv;

    const-string v15, "\u200e"

    const-string v13, "BET_SUM_ID"

    const-wide/16 v20, 0x0

    move/from16 v22, v8

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const-string v8, " \u00b7 \u200e"

    const-string v0, ""

    if-eqz v22, :cond_23

    sget-object v14, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->f:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    if-ne v2, v14, :cond_23

    move-object/from16 v14, p0

    check-cast v14, La/kzv;

    iget-object v10, v14, La/kzv;->a:Ljava/lang/String;

    move-object/from16 v22, v10

    iget-wide v10, v14, La/kzv;->f:D

    .line 2
    invoke-static/range {v22 .. v22}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v28

    if-eqz v28, :cond_0

    invoke-virtual/range {v28 .. v28}, Ljava/lang/Long;->longValue()J

    move-result-wide v24

    :cond_0
    move-object/from16 v35, v0

    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    .line 3
    sget-object v1, La/kvg0;->a:Ljava/util/Set;

    .line 4
    invoke-interface/range {p6 .. p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v24

    if-eqz v24, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v24

    move-object/from16 p0, v1

    move-object/from16 v1, v24

    check-cast v1, La/xco;

    move-wide/from16 p13, v10

    .line 5
    iget-wide v10, v1, La/xco;->a:J

    move-wide/from16 v28, v10

    .line 6
    iget-wide v10, v14, La/kzv;->T:J

    cmp-long v1, v28, v10

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v1, p0

    move-wide/from16 v10, p13

    goto :goto_0

    :cond_2
    move-wide/from16 p13, v10

    move-object/from16 v24, v23

    .line 7
    :goto_1
    move-object/from16 v1, v24

    check-cast v1, La/xco;

    .line 8
    iget-object v10, v14, La/kzv;->g:La/i0w;

    iget-wide v11, v14, La/kzv;->m:D

    move-object/from16 v36, v15

    iget-object v15, v14, La/kzv;->O:La/hxu;

    move-wide/from16 v24, v11

    iget-wide v11, v14, La/kzv;->h:J

    move-object/from16 v37, v13

    iget v13, v14, La/kzv;->t:I

    iget-object v9, v14, La/kzv;->b:La/q4f;

    move-object/from16 p0, v15

    iget-object v15, v14, La/kzv;->Y:Ljava/util/List;

    .line 9
    invoke-static {v2, v10, v4}, La/hew0;->G(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/i0w;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v2

    .line 10
    new-instance v4, Ljava/util/ArrayList;

    move-object/from16 v28, v14

    const/16 v14, 0xa

    invoke-static {v2, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v4, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 12
    check-cast v14, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 13
    invoke-static {v14, v0}, La/eeq;->X(Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;Z)La/so30;

    move-result-object v14

    .line 14
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 15
    :cond_3
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, La/ueo;

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v26

    move-object/from16 p2, v0

    move-object/from16 v0, v26

    check-cast v0, La/z0w;

    if-eqz v0, :cond_4

    .line 16
    iget v0, v0, La/z0w;->v:I

    move-wide/from16 v38, v11

    .line 17
    iget-wide v11, v14, La/ueo;->a:J

    move-wide/from16 v29, v11

    int-to-long v11, v0

    cmp-long v0, v29, v11

    if-nez v0, :cond_5

    goto :goto_4

    :cond_4
    move-wide/from16 v38, v11

    :cond_5
    move-object/from16 v0, p2

    move-wide/from16 v11, v38

    goto :goto_3

    :cond_6
    move-wide/from16 v38, v11

    move-object/from16 v2, v23

    .line 18
    :goto_4
    move-object/from16 v31, v2

    check-cast v31, La/ueo;

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, La/ueo;

    .line 21
    iget v12, v12, La/ueo;->d:I

    const/4 v14, 0x2

    if-ne v12, v14, :cond_7

    .line 22
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 23
    :cond_8
    invoke-virtual {v7, v15, v0}, La/i7u;->a(Ljava/util/List;Ljava/util/List;)Z

    move-result v7

    .line 24
    invoke-virtual {v6, v15, v5}, La/i7u;->a(Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    .line 25
    sget-object v2, La/q4f;->d:La/q4f;

    if-ne v9, v2, :cond_a

    move-object/from16 v11, v28

    :cond_9
    move-object/from16 v12, v35

    goto :goto_9

    .line 26
    :cond_a
    sget-object v2, La/i0w;->i:La/i0w;

    if-eq v10, v2, :cond_d

    if-eqz p11, :cond_d

    if-eqz v1, :cond_b

    .line 27
    iget-object v1, v1, La/xco;->b:Ljava/lang/String;

    goto :goto_6

    :cond_b
    move-object/from16 v1, v23

    :goto_6
    if-nez v1, :cond_c

    move-object/from16 v32, v35

    :goto_7
    move/from16 v29, p10

    move/from16 v30, p12

    move/from16 v33, p15

    move/from16 v34, p17

    goto :goto_8

    :cond_c
    move-object/from16 v32, v1

    goto :goto_7

    .line 28
    :goto_8
    invoke-static/range {v28 .. v34}, La/f7k;->R(La/kzv;ZZLa/ueo;Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v11, v28

    move-object v12, v1

    goto :goto_9

    :cond_d
    move-object/from16 v11, v28

    if-ne v10, v2, :cond_9

    if-eqz p11, :cond_9

    const/4 v1, 0x0

    .line 29
    new-array v2, v1, [Ljava/lang/Object;

    .line 30
    iget-object v5, v3, La/ctf0;->b:La/lsm0;

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    const v1, 0x7f13125b

    invoke-virtual {v5, v1, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    move-object v12, v2

    .line 31
    :goto_9
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    invoke-interface/range {p6 .. p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_e
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, La/xco;

    .line 33
    iget-boolean v6, v6, La/xco;->e:Z

    if-eqz v6, :cond_e

    .line 34
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 35
    :cond_f
    invoke-static {v1, v15}, La/lmc;->K(Ljava/util/ArrayList;Ljava/util/List;)Z

    move-result v2

    .line 36
    iget-wide v5, v11, La/kzv;->d:J

    .line 37
    invoke-static {v5, v6, v3}, La/bfb;->R(JLa/ctf0;)Ljava/lang/String;

    move-result-object v1

    filled-new-array/range {v22 .. v22}, [Ljava/lang/Object;

    move-result-object v5

    iget-object v14, v3, La/ctf0;->b:La/lsm0;

    const/4 v6, 0x1

    .line 38
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    const v6, 0x7f1309d9

    invoke-virtual {v14, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 39
    invoke-static {v1, v8, v5}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    .line 40
    new-instance v1, La/nom0;

    .line 41
    invoke-static {v10, v3}, La/aac;->Z(La/i0w;La/ctf0;)Ljava/lang/String;

    move-result-object v5

    .line 42
    invoke-static {v10}, La/iom0;->n(La/i0w;)La/hom0;

    move-result-object v6

    .line 43
    invoke-direct {v1, v5, v6}, La/nom0;-><init>(Ljava/lang/String;La/hom0;)V

    move v8, v0

    .line 44
    iget-boolean v0, v11, La/kzv;->G:Z

    move-object v5, v1

    .line 45
    iget-boolean v1, v11, La/kzv;->x:Z

    move-object/from16 v6, p5

    .line 46
    invoke-static {v11, v3, v6}, La/jwb;->J(La/kzv;La/ctf0;Ljava/util/List;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v27, v4

    move-object/from16 v26, v5

    move-object v4, v6

    .line 47
    iget-wide v5, v11, La/kzv;->V:D

    move-object/from16 p2, v12

    move-object/from16 v12, v27

    move-object/from16 v28, v35

    .line 48
    invoke-static/range {v0 .. v8}, La/idx;->t(ZZZLa/ctf0;Ljava/lang/String;DZZ)La/i4;

    move-result-object v0

    .line 49
    iget-object v1, v11, La/kzv;->B:Ljava/lang/String;

    const/4 v2, 0x0

    .line 50
    invoke-static {v2, v12}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/so30;

    const/4 v6, 0x1

    .line 51
    invoke-static {v6, v12}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/so30;

    move-wide/from16 v5, v38

    .line 52
    invoke-static {v13, v5, v6, v9}, La/uvw;->v(IJLa/q4f;)La/tvw;

    move-result-object v7

    .line 53
    iget-boolean v8, v11, La/kzv;->q:Z

    .line 54
    iget-object v12, v11, La/kzv;->i:Ljava/lang/String;

    move-object/from16 p7, v0

    .line 55
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    move-result-object v0

    move-object/from16 p5, v1

    move-object/from16 p18, v2

    .line 56
    iget-wide v1, v11, La/kzv;->L:D

    move-wide/from16 v29, v1

    .line 57
    iget v1, v11, La/kzv;->v:I

    .line 58
    invoke-static {v13, v1, v3}, La/ahy;->Z(IILa/ctf0;)La/x680;

    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    if-nez p11, :cond_11

    .line 60
    new-instance v1, La/x680;

    .line 61
    sget-object v2, La/j0w;->a:[I

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-ne v2, v3, :cond_10

    const v2, 0x7f13125b

    :goto_b
    const/4 v3, 0x0

    goto :goto_c

    :cond_10
    const v2, 0x7f130494

    goto :goto_b

    .line 62
    :goto_c
    new-array v13, v3, [Ljava/lang/Object;

    .line 63
    invoke-static {v13, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v14, v2, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 64
    iget-object v3, v11, La/kzv;->i:Ljava/lang/String;

    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    new-instance v13, La/auy;

    invoke-direct {v13, v3}, La/auy;-><init>(Ljava/lang/String;)V

    .line 67
    const-string v3, "COEF_ID"

    invoke-direct {v1, v3, v2, v13}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    .line 68
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    :cond_11
    cmpg-double v1, v29, p13

    if-gez v1, :cond_12

    const/4 v2, 0x1

    goto :goto_d

    :cond_12
    const/4 v2, 0x0

    .line 69
    :goto_d
    sget-object v3, La/i0w;->i:La/i0w;

    if-ne v10, v3, :cond_13

    move/from16 p1, v1

    move/from16 p4, v2

    .line 70
    iget-wide v1, v11, La/kzv;->M:D

    move/from16 p6, v8

    move-wide/from16 v56, v1

    move-object/from16 v1, p0

    move-object/from16 p0, v7

    move-wide/from16 v7, v56

    goto :goto_e

    :cond_13
    move/from16 p1, v1

    move/from16 p4, v2

    move-object/from16 v1, p0

    .line 71
    iget-object v2, v1, La/hxu;->f:La/ivo0;

    move-object/from16 p0, v7

    move/from16 p6, v8

    .line 72
    iget-wide v7, v2, La/ivo0;->b:D

    cmpg-double v2, v7, v20

    if-nez v2, :cond_16

    .line 73
    invoke-static {v10}, La/plc;->H(La/i0w;)Z

    move-result v2

    if-eqz v2, :cond_14

    .line 74
    iget-wide v7, v11, La/kzv;->r:D

    goto :goto_e

    .line 75
    :cond_14
    sget-object v2, La/i0w;->d:La/i0w;

    if-ne v10, v2, :cond_15

    .line 76
    iget-wide v7, v11, La/kzv;->c:D

    goto :goto_e

    .line 77
    :cond_15
    iget-wide v7, v11, La/kzv;->o:D

    :cond_16
    :goto_e
    if-eqz p4, :cond_17

    .line 78
    new-instance v2, La/x680;

    move-object/from16 p17, v4

    const/4 v13, 0x1

    .line 79
    invoke-static {v10, v13}, La/plc;->I(La/i0w;Z)I

    move-result v4

    move-object/from16 p12, v12

    const/4 v13, 0x0

    new-array v12, v13, [Ljava/lang/Object;

    .line 80
    invoke-static {v12, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v14, v4, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 81
    new-instance v12, La/m60;

    move-object/from16 v13, p3

    move-object/from16 v16, v15

    const/4 v15, 0x4

    invoke-direct {v12, v13, v15}, La/m60;-><init>(Ljava/lang/String;B)V

    .line 82
    sget-object v15, La/pn40;->a:La/pn40;

    .line 83
    sget-object v15, La/p3u0;->c:La/p3u0;

    move-object/from16 p4, v3

    move-wide/from16 v38, v5

    move-wide/from16 v5, p13

    invoke-static {v5, v6, v15}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    move-result-object v3

    .line 84
    invoke-virtual {v12, v11, v7, v8, v3}, La/m60;->a(La/kzv;DLjava/lang/String;)La/yty;

    move-result-object v3

    move-object/from16 v12, v37

    .line 85
    invoke-direct {v2, v12, v4, v3}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    goto :goto_f

    :cond_17
    move-object/from16 v13, p3

    move-object/from16 p4, v3

    move-object/from16 p17, v4

    move-wide/from16 v38, v5

    move-object/from16 p12, v12

    move-object/from16 v16, v15

    move-object/from16 v12, v37

    move-wide/from16 v5, p13

    .line 86
    new-instance v2, La/x680;

    const/4 v3, 0x0

    .line 87
    new-array v4, v3, [Ljava/lang/Object;

    .line 88
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const v3, 0x7f130f4a

    invoke-virtual {v14, v3, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 89
    new-instance v4, La/wty;

    .line 90
    sget-object v7, La/pn40;->a:La/pn40;

    .line 91
    sget-object v15, La/p3u0;->c:La/p3u0;

    invoke-static {v5, v6, v15}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    move-result-object v7

    .line 92
    sget-object v8, La/s6t0;->a:La/pz40;

    .line 93
    invoke-static {}, La/s6t0;->b()La/taq0;

    move-result-object v8

    .line 94
    iget-object v8, v8, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 95
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v5

    .line 96
    invoke-direct {v4, v7, v13, v5, v6}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 97
    invoke-direct {v2, v12, v3, v4}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    .line 98
    :goto_f
    invoke-virtual {v0, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 99
    iget-boolean v2, v11, La/kzv;->x:Z

    if-eqz v2, :cond_18

    .line 100
    new-instance v2, La/x680;

    const/4 v3, 0x0

    .line 101
    new-array v4, v3, [Ljava/lang/Object;

    .line 102
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const v3, 0x7f1309c7

    invoke-virtual {v14, v3, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 103
    new-instance v4, La/wty;

    .line 104
    iget-wide v5, v11, La/kzv;->y:D

    .line 105
    invoke-static {v5, v6, v15}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    move-result-object v5

    .line 106
    sget-object v6, La/s6t0;->a:La/pz40;

    .line 107
    invoke-static {}, La/s6t0;->b()La/taq0;

    move-result-object v6

    .line 108
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 109
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v6

    .line 110
    invoke-direct {v4, v5, v13, v6, v7}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 111
    const-string v5, "AUTO_SALE_ID"

    invoke-direct {v2, v5, v3, v4}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    goto :goto_10

    :cond_18
    move-object/from16 v2, v23

    .line 112
    :goto_10
    invoke-virtual {v0, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    if-gez p1, :cond_19

    move-object/from16 v5, v23

    goto :goto_12

    .line 113
    :cond_19
    new-instance v2, Ljava/math/BigDecimal;

    invoke-static/range {p13 .. p14}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/math/BigDecimal;

    .line 114
    iget-wide v4, v11, La/kzv;->E:D

    .line 115
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    new-instance v3, Ljava/math/BigDecimal;

    invoke-static/range {v24 .. v25}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v2

    .line 117
    invoke-static {v13, v2, v3}, La/ntb;->O(Ljava/lang/String;D)Ljava/lang/String;

    move-result-object v4

    cmpl-double v5, v2, v20

    if-lez v5, :cond_1a

    .line 118
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 119
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 120
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getGreen-0d7_KjU()J

    move-result-wide v2

    goto :goto_11

    :cond_1a
    cmpg-double v2, v2, v20

    if-gez v2, :cond_1b

    .line 121
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 122
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 123
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getRed-0d7_KjU()J

    move-result-wide v2

    goto :goto_11

    .line 124
    :cond_1b
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 125
    invoke-static {}, La/s6t0;->b()La/taq0;

    move-result-object v2

    .line 126
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 127
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v2

    .line 128
    :goto_11
    new-instance v5, La/x680;

    const/4 v6, 0x0

    .line 129
    new-array v7, v6, [Ljava/lang/Object;

    .line 130
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    const v6, 0x7f1309f4

    invoke-virtual {v14, v6, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 131
    new-instance v7, La/wty;

    .line 132
    invoke-direct {v7, v4, v13, v2, v3}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 133
    const-string v2, "PROFIT_ID"

    invoke-direct {v5, v2, v6, v7}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    .line 134
    :goto_12
    invoke-virtual {v0, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 135
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    move-result-object v0

    .line 136
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->S(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    move-result-object v0

    move-wide/from16 v2, v24

    .line 137
    invoke-static {v2, v3, v13, v15}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    move-result-object v2

    .line 138
    invoke-static {}, La/cy7;->c()Z

    move-result v3

    const v4, 0x7f1309ef

    if-eqz v3, :cond_1c

    .line 139
    filled-new-array/range {v28 .. v28}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v6, 0x1

    .line 140
    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v14, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 141
    invoke-static {v3}, Lkotlin/text/StringsKt;->v0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, " "

    move-object/from16 v14, v36

    .line 142
    invoke-static {v14, v2, v4, v3}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_13

    :cond_1c
    const/4 v6, 0x1

    .line 143
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    .line 144
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v14, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 145
    :goto_13
    new-instance v3, La/ec;

    .line 146
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v4

    if-eq v4, v6, :cond_1e

    .line 147
    sget-object v4, La/hxu;->h:La/hxu;

    .line 148
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    sget-object v1, La/kvg0;->a:Ljava/util/Set;

    invoke-interface {v1, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    goto :goto_15

    :cond_1d
    const/4 v14, 0x0

    :goto_14
    move/from16 v15, p11

    goto :goto_16

    :cond_1e
    :goto_15
    const/4 v14, 0x1

    goto :goto_14

    .line 149
    :goto_16
    invoke-direct {v3, v15, v14}, La/ec;-><init>(ZZ)V

    move-wide/from16 v5, v38

    .line 150
    invoke-static {v11, v15, v5, v6}, La/zvw;->A(La/a5w;ZJ)La/kb30;

    move-result-object v1

    .line 151
    sget-object v4, La/q4f;->d:La/q4f;

    if-ne v9, v4, :cond_20

    :cond_1f
    move-object/from16 v4, v28

    goto :goto_17

    :cond_20
    move-object/from16 v4, p4

    if-eq v10, v4, :cond_1f

    if-eqz v15, :cond_1f

    move-object/from16 v10, p9

    .line 152
    invoke-static {v11, v10}, La/wvb;->T(La/kzv;Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;)Ljava/lang/String;

    move-result-object v4

    .line 153
    :goto_17
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_21

    move-object/from16 v23, v4

    :cond_21
    if-nez v23, :cond_22

    goto :goto_18

    :cond_22
    move-object/from16 v28, v23

    .line 154
    :goto_18
    new-instance v4, La/qp30;

    const/4 v5, 0x0

    move-object/from16 v6, v22

    move-object/from16 p4, p0

    move-object/from16 p11, p2

    move-object/from16 p13, v0

    move-object/from16 p9, v1

    move-object/from16 p16, v2

    move-object/from16 p8, v3

    move-object/from16 p0, v4

    move-object/from16 p14, v5

    move-object/from16 p2, v6

    move-object/from16 p3, v19

    move-object/from16 p1, v22

    move-object/from16 p15, v26

    move-object/from16 p10, v28

    invoke-direct/range {p0 .. p18}, La/qp30;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/tvw;Ljava/lang/String;ZLa/a4x;La/ec;La/kb30;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/a4x;La/l3w;La/nom0;Ljava/lang/String;La/so30;La/so30;)V

    move-object/from16 v0, p0

    return-object v0

    :cond_23
    move-object/from16 v10, p9

    move-object/from16 v28, v0

    move-object v12, v13

    move-object v14, v15

    move-object/from16 v13, p3

    move-object/from16 v0, p5

    move/from16 v15, p11

    .line 155
    const-string v9, "POSSIBLE_PAYOUT_ID"

    if-eqz v22, :cond_60

    move-object/from16 v11, p0

    check-cast v11, La/kzv;

    iget v15, v11, La/kzv;->v:I

    move-object/from16 v37, v9

    iget-object v9, v11, La/kzv;->a:Ljava/lang/String;

    move-object/from16 v17, v9

    iget v9, v11, La/kzv;->t:I

    .line 156
    invoke-static/range {v17 .. v17}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v19

    if-eqz v19, :cond_24

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Long;->longValue()J

    move-result-wide v24

    :cond_24
    move-object/from16 v38, v12

    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-interface {v1, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    .line 157
    sget-object v12, La/nzv;->a:Ljava/util/Set;

    .line 158
    invoke-interface/range {p6 .. p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_19
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_26

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 p0, v12

    move-object/from16 v12, v19

    check-cast v12, La/xco;

    .line 159
    iget-wide v12, v12, La/xco;->a:J

    move-wide/from16 v24, v12

    .line 160
    iget-wide v12, v11, La/kzv;->T:J

    cmp-long v12, v24, v12

    if-nez v12, :cond_25

    goto :goto_1a

    :cond_25
    move-object/from16 v12, p0

    move-object/from16 v13, p3

    goto :goto_19

    :cond_26
    move-object/from16 v19, v23

    .line 161
    :goto_1a
    move-object/from16 v12, v19

    check-cast v12, La/xco;

    .line 162
    iget-object v13, v11, La/kzv;->g:La/i0w;

    move-object/from16 v39, v14

    move/from16 v19, v15

    iget-wide v14, v11, La/kzv;->o:D

    move-wide/from16 v24, v14

    iget-wide v14, v11, La/kzv;->c:D

    move-wide/from16 v40, v14

    iget-wide v14, v11, La/kzv;->r:D

    move-wide/from16 v42, v14

    iget-wide v14, v11, La/kzv;->L:D

    move-wide/from16 v44, v14

    iget-wide v14, v11, La/kzv;->E:D

    move-wide/from16 v46, v14

    iget-wide v14, v11, La/kzv;->M:D

    move-wide/from16 v48, v14

    iget-wide v14, v11, La/kzv;->C:D

    move-wide/from16 v50, v14

    iget-wide v14, v11, La/kzv;->f:D

    move-wide/from16 v52, v14

    iget-wide v14, v11, La/kzv;->h:J

    move/from16 p0, v9

    iget-object v9, v11, La/kzv;->O:La/hxu;

    move-object/from16 p4, v9

    iget-object v9, v11, La/kzv;->b:La/q4f;

    move-wide/from16 v54, v14

    iget-object v14, v11, La/kzv;->Y:Ljava/util/List;

    .line 163
    invoke-static {v2, v13, v4}, La/hew0;->G(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/i0w;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v2

    .line 164
    new-instance v15, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v15, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 165
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_27

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 166
    check-cast v4, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 167
    invoke-static {v4, v1}, La/eeq;->X(Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;Z)La/so30;

    move-result-object v4

    .line 168
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1b

    .line 169
    :cond_27
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, La/ueo;

    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v26

    move-object/from16 p2, v1

    move-object/from16 v1, v26

    check-cast v1, La/z0w;

    if-eqz v1, :cond_28

    .line 170
    iget v1, v1, La/z0w;->v:I

    move-object/from16 v29, v11

    .line 171
    iget-wide v10, v4, La/ueo;->a:J

    move-object/from16 p7, v2

    int-to-long v1, v1

    cmp-long v1, v10, v1

    if-nez v1, :cond_29

    move-object/from16 v2, p7

    goto :goto_1d

    :cond_28
    move-object/from16 v29, v11

    :cond_29
    move-object/from16 v1, p2

    move-object/from16 v10, p9

    move-object/from16 v11, v29

    goto :goto_1c

    :cond_2a
    move-object/from16 v29, v11

    move-object/from16 v2, v23

    .line 172
    :goto_1d
    move-object/from16 v32, v2

    check-cast v32, La/ueo;

    .line 173
    invoke-virtual {v7, v14, v5}, La/i7u;->a(Ljava/util/List;Ljava/util/List;)Z

    move-result v7

    .line 174
    invoke-virtual {v6, v14, v5}, La/i7u;->a(Ljava/util/List;Ljava/util/List;)Z

    move-result v1

    .line 175
    sget-object v2, La/q4f;->d:La/q4f;

    if-ne v9, v2, :cond_2b

    move-object/from16 v11, v28

    move-object/from16 v10, v29

    goto :goto_22

    .line 176
    :cond_2b
    sget-object v2, La/i0w;->i:La/i0w;

    if-eq v13, v2, :cond_2e

    if-eqz p11, :cond_2e

    if-eqz v12, :cond_2c

    .line 177
    iget-object v2, v12, La/xco;->b:Ljava/lang/String;

    goto :goto_1e

    :cond_2c
    move-object/from16 v2, v23

    :goto_1e
    if-nez v2, :cond_2d

    move-object/from16 v33, v28

    :goto_1f
    move/from16 v30, p10

    move/from16 v31, p12

    move/from16 v34, p15

    move/from16 v35, p17

    goto :goto_20

    :cond_2d
    move-object/from16 v33, v2

    goto :goto_1f

    .line 178
    :goto_20
    invoke-static/range {v29 .. v35}, La/f7k;->R(La/kzv;ZZLa/ueo;Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v10, v29

    :goto_21
    move-object v11, v2

    goto :goto_22

    :cond_2e
    move-object/from16 v10, v29

    if-ne v13, v2, :cond_2f

    if-eqz p11, :cond_2f

    const/4 v2, 0x0

    .line 179
    new-array v4, v2, [Ljava/lang/Object;

    .line 180
    iget-object v5, v3, La/ctf0;->b:La/lsm0;

    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const v2, 0x7f13125b

    invoke-virtual {v5, v2, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_21

    :cond_2f
    move-object/from16 v11, v28

    .line 181
    :goto_22
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 182
    invoke-interface/range {p6 .. p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_30
    :goto_23
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_31

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, La/xco;

    .line 183
    iget-boolean v6, v6, La/xco;->e:Z

    if-eqz v6, :cond_30

    .line 184
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_23

    .line 185
    :cond_31
    invoke-static {v2, v14}, La/lmc;->K(Ljava/util/ArrayList;Ljava/util/List;)Z

    move-result v2

    .line 186
    sget-object v4, La/q4f;->d:La/q4f;

    if-ne v9, v4, :cond_33

    :cond_32
    move-object/from16 v4, v28

    goto :goto_24

    .line 187
    :cond_33
    sget-object v4, La/i0w;->i:La/i0w;

    if-eq v13, v4, :cond_32

    if-eqz p11, :cond_32

    move-object/from16 v6, p9

    invoke-static {v10, v6}, La/wvb;->T(La/kzv;Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;)Ljava/lang/String;

    move-result-object v4

    .line 188
    :goto_24
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_34

    goto :goto_25

    :cond_34
    move-object/from16 v4, v23

    :goto_25
    if-nez v4, :cond_35

    goto :goto_26

    :cond_35
    move-object/from16 v28, v4

    .line 189
    :goto_26
    iget-wide v4, v10, La/kzv;->d:J

    .line 190
    invoke-static {v4, v5, v3}, La/bfb;->R(JLa/ctf0;)Ljava/lang/String;

    move-result-object v4

    .line 191
    filled-new-array/range {v17 .. v17}, [Ljava/lang/Object;

    move-result-object v5

    iget-object v12, v3, La/ctf0;->b:La/lsm0;

    const/4 v6, 0x1

    .line 192
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    const v6, 0x7f1309d9

    invoke-virtual {v12, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 193
    invoke-static {v4, v8, v5}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 194
    new-instance v4, La/nom0;

    .line 195
    invoke-static {v13, v3}, La/aac;->Z(La/i0w;La/ctf0;)Ljava/lang/String;

    move-result-object v5

    .line 196
    invoke-static {v13}, La/iom0;->n(La/i0w;)La/hom0;

    move-result-object v6

    .line 197
    invoke-direct {v4, v5, v6}, La/nom0;-><init>(Ljava/lang/String;La/hom0;)V

    .line 198
    iget-boolean v5, v10, La/kzv;->G:Z

    move v8, v1

    .line 199
    iget-boolean v1, v10, La/kzv;->x:Z

    move-object v6, v4

    .line 200
    invoke-static {v10, v3, v0}, La/jwb;->J(La/kzv;La/ctf0;Ljava/util/List;)Ljava/lang/String;

    move-result-object v4

    move/from16 v26, v5

    move-object v0, v6

    .line 201
    iget-wide v5, v10, La/kzv;->V:D

    move/from16 v56, v26

    move-object/from16 v26, v0

    move/from16 v0, v56

    .line 202
    invoke-static/range {v0 .. v8}, La/idx;->t(ZZZLa/ctf0;Ljava/lang/String;DZZ)La/i4;

    move-result-object v0

    .line 203
    iget-object v1, v10, La/kzv;->B:Ljava/lang/String;

    const/4 v2, 0x0

    .line 204
    invoke-static {v2, v15}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/so30;

    const/4 v6, 0x1

    .line 205
    invoke-static {v6, v15}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/so30;

    move/from16 v5, p0

    move-object/from16 p7, v0

    move-object/from16 p5, v1

    move-wide/from16 v0, v54

    .line 206
    invoke-static {v5, v0, v1, v9}, La/uvw;->v(IJLa/q4f;)La/tvw;

    move-result-object v6

    .line 207
    iget-boolean v8, v10, La/kzv;->q:Z

    .line 208
    invoke-static {v10}, La/sj3;->b0(La/kzv;)Ljava/lang/String;

    move-result-object v15

    move-object/from16 p0, v6

    move-object/from16 v6, v39

    .line 209
    invoke-static {v6, v15}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 210
    new-instance v15, La/xex;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 212
    iput-object v3, v15, La/xex;->a:Ljava/lang/Object;

    move-object/from16 p2, v11

    move-object/from16 v11, p3

    .line 213
    iput-object v11, v15, La/xex;->b:Ljava/lang/Object;

    .line 214
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v27

    if-lez v27, :cond_36

    const/16 v27, 0x1

    :goto_27
    move-object/from16 p18, v2

    goto :goto_28

    :cond_36
    const/16 v27, 0x0

    goto :goto_27

    :goto_28
    if-eqz p11, :cond_4d

    .line 215
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    move-result-object v2

    move-object/from16 p17, v4

    move/from16 v4, v19

    .line 216
    invoke-static {v5, v4, v3}, La/ahy;->Z(IILa/ctf0;)La/x680;

    move-result-object v4

    .line 217
    invoke-virtual {v2, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    if-nez v27, :cond_37

    .line 218
    invoke-virtual {v15, v10, v7}, La/xex;->B(La/kzv;Z)La/x680;

    move-result-object v4

    invoke-virtual {v2, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 219
    :cond_37
    invoke-virtual {v15, v10, v7}, La/xex;->E(La/kzv;Z)La/x680;

    move-result-object v4

    invoke-virtual {v2, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    move/from16 v4, p16

    .line 220
    invoke-static {v10, v3, v4}, La/xex;->G(La/kzv;La/ctf0;Z)La/x680;

    move-result-object v4

    invoke-virtual {v2, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 221
    sget-object v4, La/q4f;->h:La/q4f;

    if-ne v9, v4, :cond_38

    move-wide/from16 v54, v0

    move-object/from16 p12, v6

    move/from16 v19, v8

    move-object/from16 v5, v23

    goto :goto_2b

    .line 222
    :cond_38
    sget-object v4, La/pn40;->a:La/pn40;

    cmpl-double v4, v50, v20

    if-lez v4, :cond_39

    move-wide/from16 v4, v50

    goto :goto_29

    .line 223
    :cond_39
    sget-object v4, La/i0w;->i:La/i0w;

    if-ne v13, v4, :cond_3a

    move-wide/from16 v4, v48

    goto :goto_29

    :cond_3a
    sub-double v4, v52, v46

    .line 224
    :goto_29
    sget-object v7, La/p3u0;->c:La/p3u0;

    invoke-static {v4, v5, v7}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    move-result-object v4

    .line 225
    new-instance v5, La/x680;

    cmpg-double v7, v44, v52

    if-gez v7, :cond_3b

    const/4 v7, 0x1

    goto :goto_2a

    :cond_3b
    const/4 v7, 0x0

    .line 226
    :goto_2a
    invoke-static {v13, v7}, La/plc;->I(La/i0w;Z)I

    move-result v7

    move-object/from16 p12, v6

    move/from16 v19, v8

    const/4 v6, 0x0

    new-array v8, v6, [Ljava/lang/Object;

    .line 227
    invoke-static {v8, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v12, v7, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 228
    new-instance v7, La/wty;

    sget-object v8, La/s6t0;->a:La/pz40;

    .line 229
    invoke-static {}, La/s6t0;->b()La/taq0;

    move-result-object v8

    .line 230
    iget-object v8, v8, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    move-wide/from16 v54, v0

    .line 231
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v0

    .line 232
    invoke-direct {v7, v4, v11, v0, v1}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    move-object/from16 v1, v38

    .line 233
    invoke-direct {v5, v1, v6, v7}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    .line 234
    :goto_2b
    invoke-virtual {v2, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 235
    invoke-virtual {v15, v10}, La/xex;->w(La/kzv;)La/x680;

    move-result-object v0

    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 236
    invoke-virtual {v15, v10}, La/xex;->x(La/kzv;)La/x680;

    move-result-object v0

    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 237
    invoke-virtual {v15, v10}, La/xex;->y(La/kzv;)La/x680;

    move-result-object v0

    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 238
    invoke-virtual {v15, v10}, La/xex;->z(La/kzv;)La/x680;

    move-result-object v0

    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 239
    sget-object v0, La/i0w;->b:La/i0w;

    if-eq v13, v0, :cond_3c

    .line 240
    sget-object v1, La/i0w;->d:La/i0w;

    if-eq v13, v1, :cond_3c

    .line 241
    sget-object v1, La/i0w;->e:La/i0w;

    if-ne v13, v1, :cond_3d

    :cond_3c
    move-object/from16 v6, p4

    goto :goto_2c

    :cond_3d
    move-object/from16 v6, p4

    goto :goto_2d

    .line 242
    :goto_2c
    invoke-static {v6, v13, v11}, La/bdx;->i0(La/hxu;La/i0w;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 243
    :goto_2d
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_3f

    const/4 v4, 0x1

    if-eq v1, v4, :cond_3f

    const/4 v4, 0x3

    if-eq v1, v4, :cond_3e

    const/4 v15, 0x4

    if-eq v1, v15, :cond_3e

    move-object/from16 v1, v23

    goto :goto_2e

    .line 244
    :cond_3e
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 245
    sget-object v1, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 246
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getGreen-0d7_KjU()J

    move-result-wide v4

    .line 247
    new-instance v1, La/y3d;

    invoke-direct {v1, v4, v5}, La/y3d;-><init>(J)V

    goto :goto_2e

    .line 248
    :cond_3f
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 249
    invoke-static {}, La/s6t0;->b()La/taq0;

    move-result-object v1

    .line 250
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 251
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v4

    .line 252
    new-instance v1, La/y3d;

    invoke-direct {v1, v4, v5}, La/y3d;-><init>(J)V

    .line 253
    :goto_2e
    iget-object v4, v6, La/hxu;->f:La/ivo0;

    .line 254
    iget-object v5, v4, La/ivo0;->a:Ljava/lang/String;

    iget-wide v7, v4, La/ivo0;->b:D

    .line 255
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_40

    if-ne v13, v0, :cond_40

    .line 256
    iget-object v4, v4, La/ivo0;->a:Ljava/lang/String;

    goto :goto_31

    .line 257
    :cond_40
    sget-object v4, La/q4f;->e:La/q4f;

    sget-object v5, La/q4f;->g:La/q4f;

    filled-new-array {v4, v5}, [La/q4f;

    move-result-object v4

    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_41

    .line 258
    sget-object v4, La/i0w;->e:La/i0w;

    if-eq v13, v4, :cond_41

    const/4 v4, 0x0

    .line 259
    new-array v5, v4, [Ljava/lang/Object;

    .line 260
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    const v4, 0x7f1309e5

    invoke-virtual {v12, v4, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_31

    .line 261
    :cond_41
    iget-wide v4, v10, La/kzv;->e:D

    cmpg-double v4, v4, v20

    if-nez v4, :cond_42

    move-object/from16 v4, v23

    goto :goto_31

    .line 262
    :cond_42
    invoke-static {v13}, La/plc;->H(La/i0w;)Z

    move-result v4

    if-eqz v4, :cond_44

    .line 263
    iget-boolean v4, v10, La/kzv;->s:Z

    if-eqz v4, :cond_43

    const v4, 0x7f130cda

    :goto_2f
    const/4 v5, 0x0

    goto :goto_30

    :cond_43
    const v4, 0x7f13025a

    goto :goto_2f

    .line 264
    :goto_30
    new-array v9, v5, [Ljava/lang/Object;

    .line 265
    invoke-static {v9, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v12, v4, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_31

    :cond_44
    const/4 v5, 0x0

    .line 266
    new-array v4, v5, [Ljava/lang/Object;

    .line 267
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const v5, 0x7f1309f5

    invoke-virtual {v12, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    :goto_31
    cmpg-double v5, v7, v20

    if-nez v5, :cond_45

    goto :goto_32

    :cond_45
    if-eq v13, v0, :cond_49

    .line 268
    sget-object v0, La/i0w;->d:La/i0w;

    if-eq v13, v0, :cond_49

    .line 269
    sget-object v0, La/i0w;->e:La/i0w;

    if-ne v13, v0, :cond_46

    goto :goto_33

    .line 270
    :cond_46
    :goto_32
    invoke-static {v13}, La/plc;->H(La/i0w;)Z

    move-result v0

    if-eqz v0, :cond_47

    move-wide/from16 v7, v42

    goto :goto_33

    .line 271
    :cond_47
    sget-object v0, La/i0w;->d:La/i0w;

    if-ne v13, v0, :cond_48

    move-wide/from16 v7, v40

    goto :goto_33

    :cond_48
    move-wide/from16 v7, v24

    :cond_49
    :goto_33
    if-eqz p13, :cond_4c

    if-eqz v4, :cond_4c

    cmpg-double v0, v7, v20

    if-nez v0, :cond_4a

    goto :goto_34

    :cond_4a
    if-nez v1, :cond_4b

    goto :goto_34

    .line 272
    :cond_4b
    new-instance v0, La/x680;

    .line 273
    new-instance v5, La/wty;

    sget-object v9, La/pn40;->a:La/pn40;

    .line 274
    sget-object v9, La/p3u0;->c:La/p3u0;

    invoke-static {v7, v8, v9}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    move-result-object v7

    .line 275
    iget-wide v8, v1, La/y3d;->a:J

    .line 276
    invoke-direct {v5, v7, v11, v8, v9}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 277
    const-string v1, "WIN_ID"

    invoke-direct {v0, v1, v4, v5}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    goto :goto_35

    :cond_4c
    :goto_34
    move-object/from16 v0, v23

    .line 278
    :goto_35
    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 279
    new-instance v0, La/g090;

    invoke-direct {v0, v3, v11}, La/g090;-><init>(La/ctf0;Ljava/lang/String;)V

    move/from16 v8, p14

    invoke-virtual {v0, v10, v8}, La/g090;->d(La/kzv;Z)La/x680;

    move-result-object v0

    .line 280
    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 281
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    move-result-object v0

    move-object/from16 v27, v14

    goto/16 :goto_42

    :cond_4d
    move-wide/from16 v54, v0

    move-object/from16 p17, v4

    move-object/from16 p12, v6

    move/from16 v4, v19

    move-object/from16 v1, v38

    move-object/from16 v6, p4

    move/from16 v0, p16

    move/from16 v19, v8

    move/from16 v8, p14

    .line 282
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    move-result-object v2

    .line 283
    invoke-static {v5, v4, v3}, La/ahy;->Z(IILa/ctf0;)La/x680;

    move-result-object v4

    .line 284
    invoke-virtual {v2, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 285
    invoke-virtual {v15, v10, v7}, La/xex;->B(La/kzv;Z)La/x680;

    move-result-object v4

    invoke-virtual {v2, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 286
    invoke-static {v10, v3, v0}, La/xex;->G(La/kzv;La/ctf0;Z)La/x680;

    move-result-object v0

    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 287
    iget-object v0, v10, La/kzv;->k:Ljava/lang/String;

    .line 288
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_4e

    if-eqz v7, :cond_4e

    sget-object v4, La/q4f;->c:La/q4f;

    if-ne v9, v4, :cond_4e

    .line 289
    new-instance v4, La/x680;

    move-object/from16 v27, v14

    const/4 v5, 0x0

    .line 290
    new-array v14, v5, [Ljava/lang/Object;

    .line 291
    invoke-static {v14, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v14

    const v5, 0x7f130cdc

    invoke-virtual {v12, v5, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 292
    new-instance v14, La/auy;

    invoke-direct {v14, v0}, La/auy;-><init>(Ljava/lang/String;)V

    .line 293
    const-string v0, "MAX_OPTION_COEF_ID"

    invoke-direct {v4, v0, v5, v14}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    goto :goto_36

    :cond_4e
    move-object/from16 v27, v14

    move-object/from16 v4, v23

    .line 294
    :goto_36
    invoke-virtual {v2, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 295
    invoke-virtual {v15, v10, v7}, La/xex;->E(La/kzv;Z)La/x680;

    move-result-object v0

    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 296
    sget-object v0, La/q4f;->h:La/q4f;

    if-ne v9, v0, :cond_54

    .line 297
    invoke-static {v13}, La/plc;->H(La/i0w;)Z

    move-result v0

    if-nez v0, :cond_4f

    .line 298
    sget-object v0, La/i0w;->d:La/i0w;

    if-eq v13, v0, :cond_4f

    .line 299
    sget-object v0, La/i0w;->e:La/i0w;

    if-eq v13, v0, :cond_4f

    move-object/from16 p4, v15

    move-object/from16 v5, v23

    goto/16 :goto_3e

    .line 300
    :cond_4f
    iget-object v0, v6, La/hxu;->f:La/ivo0;

    .line 301
    iget-wide v0, v0, La/ivo0;->b:D

    cmpg-double v4, v0, v20

    if-nez v4, :cond_51

    .line 302
    invoke-static {v13}, La/plc;->H(La/i0w;)Z

    move-result v0

    if-eqz v0, :cond_50

    .line 303
    iget-wide v0, v10, La/kzv;->p:D

    goto :goto_37

    :cond_50
    move-wide/from16 v0, v24

    .line 304
    :cond_51
    :goto_37
    invoke-static {v13}, La/plc;->H(La/i0w;)Z

    move-result v4

    if-eqz v4, :cond_52

    const/4 v5, 0x0

    .line 305
    new-array v4, v5, [Ljava/lang/Object;

    .line 306
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const v7, 0x7f13025a

    invoke-virtual {v12, v7, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_38

    :cond_52
    const/4 v5, 0x0

    .line 307
    new-array v4, v5, [Ljava/lang/Object;

    const v5, 0x7f1309f5

    invoke-virtual {v3, v5, v4}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 308
    :goto_38
    new-instance v5, La/x680;

    .line 309
    new-instance v7, La/wty;

    .line 310
    sget-object v12, La/pn40;->a:La/pn40;

    invoke-static {v0, v1}, La/pn40;->e(D)Ljava/lang/String;

    move-result-object v0

    .line 311
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v12, 0x3

    if-eq v1, v12, :cond_53

    const/4 v12, 0x4

    if-eq v1, v12, :cond_53

    .line 312
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 313
    invoke-static {}, La/s6t0;->b()La/taq0;

    move-result-object v1

    .line 314
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 315
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    move-result-wide v24

    :goto_39
    move-object/from16 p4, v15

    move-wide/from16 v14, v24

    goto :goto_3a

    .line 316
    :cond_53
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 317
    sget-object v1, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 318
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getGreen-0d7_KjU()J

    move-result-wide v24

    goto :goto_39

    .line 319
    :goto_3a
    invoke-direct {v7, v0, v11, v14, v15}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    move-object/from16 v12, v37

    .line 320
    invoke-direct {v5, v12, v4, v7}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    goto :goto_3e

    :cond_54
    move-object/from16 p4, v15

    .line 321
    sget-object v0, La/i0w;->i:La/i0w;

    if-ne v13, v0, :cond_55

    move-wide/from16 v14, v48

    goto :goto_3b

    .line 322
    :cond_55
    iget-object v0, v6, La/hxu;->f:La/ivo0;

    .line 323
    iget-wide v4, v0, La/ivo0;->b:D

    cmpg-double v0, v4, v20

    if-nez v0, :cond_58

    .line 324
    invoke-static {v13}, La/plc;->H(La/i0w;)Z

    move-result v0

    if-eqz v0, :cond_56

    move-wide/from16 v14, v42

    goto :goto_3b

    .line 325
    :cond_56
    sget-object v0, La/i0w;->d:La/i0w;

    if-ne v13, v0, :cond_57

    move-wide/from16 v14, v40

    goto :goto_3b

    :cond_57
    move-wide/from16 v14, v24

    goto :goto_3b

    :cond_58
    move-wide v14, v4

    .line 326
    :goto_3b
    sget-object v0, La/pn40;->a:La/pn40;

    cmpl-double v0, v50, v20

    if-lez v0, :cond_59

    goto :goto_3c

    :cond_59
    sub-double v4, v52, v46

    move-wide/from16 v50, v4

    :goto_3c
    invoke-static/range {v50 .. v51}, La/pn40;->e(D)Ljava/lang/String;

    move-result-object v0

    .line 327
    new-instance v5, La/x680;

    cmpg-double v4, v44, v52

    if-gez v4, :cond_5a

    const/4 v4, 0x1

    goto :goto_3d

    :cond_5a
    const/4 v4, 0x0

    .line 328
    :goto_3d
    invoke-static {v13, v4}, La/plc;->I(La/i0w;Z)I

    move-result v4

    const/4 v7, 0x0

    new-array v12, v7, [Ljava/lang/Object;

    .line 329
    invoke-virtual {v3, v4, v12}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 330
    new-instance v7, La/m60;

    const/4 v12, 0x4

    invoke-direct {v7, v11, v12}, La/m60;-><init>(Ljava/lang/String;B)V

    invoke-virtual {v7, v10, v14, v15, v0}, La/m60;->a(La/kzv;DLjava/lang/String;)La/yty;

    move-result-object v0

    .line 331
    invoke-direct {v5, v1, v4, v0}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    .line 332
    :goto_3e
    invoke-virtual {v2, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 333
    sget-object v0, La/i0w;->b:La/i0w;

    if-ne v13, v0, :cond_5d

    .line 334
    sget-object v0, La/q4f;->e:La/q4f;

    sget-object v1, La/q4f;->g:La/q4f;

    filled-new-array {v0, v1}, [La/q4f;

    move-result-object v0

    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5d

    .line 335
    iget-object v0, v6, La/hxu;->f:La/ivo0;

    .line 336
    iget-wide v4, v0, La/ivo0;->b:D

    cmpg-double v1, v4, v20

    if-nez v1, :cond_5b

    move-wide/from16 v14, v42

    goto :goto_3f

    :cond_5b
    move-wide v14, v4

    .line 337
    :goto_3f
    iget-object v0, v0, La/ivo0;->a:Ljava/lang/String;

    .line 338
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_5c

    .line 339
    iget-object v0, v6, La/hxu;->f:La/ivo0;

    .line 340
    iget-object v0, v0, La/ivo0;->a:Ljava/lang/String;

    goto :goto_40

    :cond_5c
    const/4 v5, 0x0

    .line 341
    new-array v0, v5, [Ljava/lang/Object;

    const v4, 0x7f1309e5

    invoke-virtual {v3, v4, v0}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 342
    :goto_40
    new-instance v1, La/x680;

    .line 343
    new-instance v4, La/wty;

    .line 344
    sget-object v5, La/pn40;->a:La/pn40;

    invoke-static {v14, v15}, La/pn40;->e(D)Ljava/lang/String;

    move-result-object v5

    .line 345
    sget-object v7, La/s6t0;->a:La/pz40;

    .line 346
    invoke-static {}, La/s6t0;->b()La/taq0;

    move-result-object v7

    .line 347
    iget-object v7, v7, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 348
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v14

    .line 349
    invoke-direct {v4, v5, v11, v14, v15}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 350
    const-string v5, "MINIMUM_BET_ID"

    invoke-direct {v1, v5, v0, v4}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    goto :goto_41

    :cond_5d
    move-object/from16 v1, v23

    .line 351
    :goto_41
    invoke-virtual {v2, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p4

    .line 352
    invoke-virtual {v0, v10}, La/xex;->w(La/kzv;)La/x680;

    move-result-object v1

    invoke-virtual {v2, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 353
    invoke-virtual {v0, v10}, La/xex;->x(La/kzv;)La/x680;

    move-result-object v1

    invoke-virtual {v2, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 354
    invoke-virtual {v0, v10}, La/xex;->y(La/kzv;)La/x680;

    move-result-object v1

    invoke-virtual {v2, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 355
    new-instance v1, La/g090;

    invoke-direct {v1, v3, v11}, La/g090;-><init>(La/ctf0;Ljava/lang/String;)V

    invoke-virtual {v1, v10, v8}, La/g090;->d(La/kzv;Z)La/x680;

    move-result-object v1

    .line 356
    invoke-virtual {v2, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 357
    invoke-virtual {v0, v10}, La/xex;->z(La/kzv;)La/x680;

    move-result-object v0

    invoke-virtual {v2, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 358
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    move-result-object v0

    .line 359
    :goto_42
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->S(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    move-result-object v0

    .line 360
    new-instance v1, La/ec;

    .line 361
    invoke-interface/range {v27 .. v27}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_5f

    .line 362
    sget-object v2, La/hxu;->h:La/hxu;

    .line 363
    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5e

    sget-object v2, La/nzv;->a:Ljava/util/Set;

    invoke-interface {v2, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5e

    goto :goto_44

    :cond_5e
    const/4 v14, 0x0

    :goto_43
    move/from16 v15, p11

    goto :goto_45

    :cond_5f
    :goto_44
    const/4 v14, 0x1

    goto :goto_43

    .line 364
    :goto_45
    invoke-direct {v1, v15, v14}, La/ec;-><init>(ZZ)V

    move-wide/from16 v2, v54

    .line 365
    invoke-static {v10, v15, v2, v3}, La/zvw;->A(La/a5w;ZJ)La/kb30;

    move-result-object v2

    .line 366
    new-instance v3, La/qp30;

    const/4 v4, 0x0

    .line 367
    const-string v5, ""

    move-object/from16 v6, v17

    move-object/from16 p4, p0

    move-object/from16 p11, p2

    move-object/from16 p13, v0

    move-object/from16 p8, v1

    move-object/from16 p9, v2

    move-object/from16 p0, v3

    move-object/from16 p14, v4

    move-object/from16 p16, v5

    move-object/from16 p2, v6

    move-object/from16 p1, v17

    move-object/from16 p3, v18

    move/from16 p6, v19

    move-object/from16 p15, v26

    move-object/from16 p10, v28

    .line 368
    invoke-direct/range {p0 .. p18}, La/qp30;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/tvw;Ljava/lang/String;ZLa/a4x;La/ec;La/kb30;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/a4x;La/l3w;La/nom0;Ljava/lang/String;La/so30;La/so30;)V

    move-object/from16 v0, p0

    return-object v0

    :cond_60
    move-object/from16 v7, p0

    move-object v1, v12

    move-object v11, v13

    move-object v6, v14

    move-object v12, v9

    .line 369
    instance-of v9, v7, La/for0;

    sget-object v10, La/hb30;->a:La/hb30;

    if-eqz v9, :cond_74

    move-object v0, v7

    check-cast v0, La/for0;

    iget-wide v13, v0, La/for0;->c:D

    move-object/from16 p4, v10

    iget-wide v9, v0, La/for0;->f:D

    sget-object v5, La/uor0;->a:Ljava/util/List;

    .line 370
    iget-object v5, v0, La/for0;->a:Ljava/lang/String;

    iget-object v7, v0, La/for0;->b:La/q4f;

    move-object/from16 v18, v5

    iget-boolean v5, v0, La/for0;->j:Z

    move/from16 v19, v5

    iget-object v5, v0, La/for0;->l:La/hxu;

    move-wide/from16 v29, v9

    .line 371
    filled-new-array/range {v18 .. v18}, [Ljava/lang/Object;

    move-result-object v9

    const v10, 0x7f1309d9

    invoke-virtual {v3, v10, v9}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 372
    iget-object v10, v0, La/for0;->g:La/i0w;

    .line 373
    invoke-static {v2, v10, v4}, La/hew0;->G(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/i0w;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v2

    .line 374
    new-instance v4, Ljava/util/ArrayList;

    move-wide/from16 v31, v13

    const/16 v13, 0xa

    invoke-static {v2, v13}, La/r3d;->q(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v4, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 375
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_46
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_61

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 376
    check-cast v13, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    const/4 v14, 0x0

    .line 377
    invoke-static {v13, v14}, La/eeq;->X(Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;Z)La/so30;

    move-result-object v13

    .line 378
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_46

    .line 379
    :cond_61
    iget-object v2, v0, La/for0;->o:La/a6w;

    .line 380
    sget-object v13, La/a6w;->b:La/a6w;

    if-ne v2, v13, :cond_62

    const/4 v2, 0x1

    goto :goto_47

    :cond_62
    const/4 v2, 0x0

    .line 381
    :goto_47
    iget-object v13, v0, La/for0;->a:Ljava/lang/String;

    move-object/from16 v18, v13

    .line 382
    iget-wide v13, v0, La/for0;->d:J

    .line 383
    invoke-static {v13, v14, v3}, La/bfb;->R(JLa/ctf0;)Ljava/lang/String;

    move-result-object v13

    .line 384
    invoke-static {v13, v8, v9}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 385
    invoke-static {v10, v3}, La/aac;->Z(La/i0w;La/ctf0;)Ljava/lang/String;

    move-result-object v9

    .line 386
    const-string v13, ")"

    const-string v14, "("

    if-eqz v19, :cond_63

    move/from16 p0, v2

    const v2, 0x7f1304de

    move-object/from16 p2, v8

    const/4 v8, 0x0

    .line 387
    new-array v15, v8, [Ljava/lang/Object;

    invoke-virtual {v3, v2, v15}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 388
    invoke-static {v14, v2, v13}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_48

    :cond_63
    move/from16 p0, v2

    move-object/from16 p2, v8

    const/4 v8, 0x0

    const v2, 0x7f130e2a

    .line 389
    new-array v15, v8, [Ljava/lang/Object;

    invoke-virtual {v3, v2, v15}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 390
    invoke-static {v14, v2, v13}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 391
    :goto_48
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    move-result-object v8

    .line 392
    invoke-virtual {v8, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    if-eqz p0, :cond_64

    .line 393
    invoke-virtual {v8, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 394
    :cond_64
    invoke-static {v8}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    move-result-object v2

    const/4 v8, 0x0

    const/16 v9, 0x3e

    .line 395
    const-string v13, " "

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 p5, v2

    move-object/from16 p9, v8

    move/from16 p10, v9

    move-object/from16 p6, v13

    move-object/from16 p7, v14

    move-object/from16 p8, v15

    invoke-static/range {p5 .. p10}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v2

    .line 396
    new-instance v8, La/nom0;

    .line 397
    invoke-static {v10}, La/iom0;->n(La/i0w;)La/hom0;

    move-result-object v9

    .line 398
    invoke-direct {v8, v2, v9}, La/nom0;-><init>(Ljava/lang/String;La/hom0;)V

    .line 399
    iget-boolean v2, v0, La/for0;->k:Z

    .line 400
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    move-result-object v9

    if-eqz v2, :cond_65

    .line 401
    new-instance v2, La/tso0;

    const v13, 0x7f131011

    const/4 v14, 0x0

    .line 402
    new-array v15, v14, [Ljava/lang/Object;

    invoke-virtual {v3, v13, v15}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 403
    sget-object v15, La/tqo0;->a:La/tqo0;

    .line 404
    const-string v14, "PROMO_ID"

    invoke-direct {v2, v14, v13, v15}, La/tso0;-><init>(Ljava/lang/String;Ljava/lang/String;La/sso0;)V

    .line 405
    invoke-virtual {v9, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    :cond_65
    if-eqz p0, :cond_66

    .line 406
    new-instance v2, La/tso0;

    const v13, 0x7f13161f

    const/4 v14, 0x0

    .line 407
    new-array v15, v14, [Ljava/lang/Object;

    invoke-virtual {v3, v13, v15}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 408
    sget-object v15, La/dqo0;->a:La/dqo0;

    .line 409
    const-string v14, "FREE_BET_ID"

    invoke-direct {v2, v14, v13, v15}, La/tso0;-><init>(Ljava/lang/String;Ljava/lang/String;La/sso0;)V

    .line 410
    invoke-virtual {v9, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 411
    :cond_66
    invoke-static {v9}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    move-result-object v2

    .line 412
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    move-result-object v2

    const/4 v14, 0x0

    .line 413
    invoke-static {v14, v4}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/so30;

    const/4 v13, 0x1

    .line 414
    invoke-static {v13, v4}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/so30;

    .line 415
    invoke-static {v7}, La/lgb;->Y(La/q4f;)I

    move-result v13

    .line 416
    iget-object v14, v0, La/for0;->i:Ljava/lang/String;

    .line 417
    iget-object v15, v0, La/for0;->h:Ljava/lang/String;

    .line 418
    invoke-virtual {v6, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 419
    sget-object v15, La/uor0;->a:Ljava/util/List;

    move-object/from16 p7, v2

    if-eqz p11, :cond_69

    .line 420
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    move-result-object v7

    .line 421
    invoke-static {v0, v3}, La/uor0;->a(La/for0;La/ctf0;)La/x680;

    move-result-object v2

    .line 422
    invoke-virtual {v7, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 423
    new-instance v2, La/x680;

    move-object/from16 p18, v4

    move-object/from16 p12, v6

    const/4 v4, 0x0

    .line 424
    new-array v6, v4, [Ljava/lang/Object;

    const v4, 0x7f130f4a

    invoke-virtual {v3, v4, v6}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 425
    new-instance v6, La/wty;

    .line 426
    sget-object v16, La/pn40;->a:La/pn40;

    move-object/from16 p15, v8

    invoke-static/range {v29 .. v30}, La/pn40;->e(D)Ljava/lang/String;

    move-result-object v8

    if-eqz p0, :cond_67

    move-object/from16 p17, v9

    move-object/from16 v26, v14

    const/4 v9, 0x0

    .line 427
    new-array v14, v9, [Ljava/lang/Object;

    const v9, 0x7f13107d

    invoke-virtual {v3, v9, v14}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto :goto_49

    :cond_67
    move-object/from16 p17, v9

    move-object/from16 v26, v14

    move-object v9, v11

    .line 428
    :goto_49
    sget-object v14, La/s6t0;->a:La/pz40;

    .line 429
    invoke-static {}, La/s6t0;->b()La/taq0;

    move-result-object v14

    .line 430
    iget-object v14, v14, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    move/from16 p6, v13

    .line 431
    invoke-virtual {v14}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v13

    .line 432
    invoke-direct {v6, v8, v9, v13, v14}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 433
    invoke-direct {v2, v1, v4, v6}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    .line 434
    invoke-virtual {v7, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 435
    invoke-interface {v15, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_68

    .line 436
    invoke-static {v5, v10, v11}, La/bdx;->i0(La/hxu;La/i0w;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 437
    invoke-virtual {v7, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 438
    new-instance v1, La/x680;

    const/4 v14, 0x0

    .line 439
    new-array v2, v14, [Ljava/lang/Object;

    const v4, 0x7f1309f5

    invoke-virtual {v3, v4, v2}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 440
    new-instance v4, La/wty;

    .line 441
    iget-object v6, v5, La/hxu;->f:La/ivo0;

    .line 442
    iget-wide v8, v6, La/ivo0;->b:D

    .line 443
    invoke-static {v8, v9}, La/pn40;->e(D)Ljava/lang/String;

    move-result-object v6

    .line 444
    sget-object v8, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 445
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/StaticColors;->getGreen-0d7_KjU()J

    move-result-wide v8

    .line 446
    invoke-direct {v4, v6, v11, v8, v9}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 447
    invoke-direct {v1, v12, v2, v4}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    .line 448
    invoke-virtual {v7, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 449
    :cond_68
    invoke-static {v7}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    move-result-object v1

    goto/16 :goto_51

    :cond_69
    move-object/from16 p18, v4

    move-object/from16 p12, v6

    move-object/from16 p15, v8

    move-object/from16 p17, v9

    move/from16 p6, v13

    move-object/from16 v26, v14

    .line 450
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    move-result-object v1

    .line 451
    invoke-static {v0, v3}, La/uor0;->a(La/for0;La/ctf0;)La/x680;

    move-result-object v2

    .line 452
    invoke-virtual {v1, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    if-eqz p0, :cond_6a

    const/4 v14, 0x0

    .line 453
    new-array v2, v14, [Ljava/lang/Object;

    const v9, 0x7f13107d

    invoke-virtual {v3, v9, v2}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_4a

    :cond_6a
    move-object v2, v11

    .line 454
    :goto_4a
    sget-object v4, La/q4f;->u:La/q4f;

    if-eq v7, v4, :cond_6b

    if-eqz p0, :cond_6b

    :goto_4b
    move-object/from16 v4, v23

    goto/16 :goto_50

    :cond_6b
    if-ne v7, v4, :cond_6c

    .line 455
    invoke-interface {v15, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6c

    goto :goto_4b

    :cond_6c
    if-ne v7, v4, :cond_6e

    .line 456
    invoke-interface {v15, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6e

    .line 457
    new-instance v4, La/x680;

    .line 458
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    const/4 v7, 0x3

    if-eq v6, v7, :cond_6d

    const/4 v7, 0x4

    if-eq v6, v7, :cond_6d

    const/4 v14, 0x0

    .line 459
    new-array v6, v14, [Ljava/lang/Object;

    const v7, 0x7f130f4a

    invoke-virtual {v3, v7, v6}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    goto :goto_4c

    :cond_6d
    const/4 v14, 0x0

    .line 460
    new-array v6, v14, [Ljava/lang/Object;

    const v7, 0x7f1309f5

    invoke-virtual {v3, v7, v6}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 461
    :goto_4c
    new-instance v7, La/wty;

    .line 462
    sget-object v8, La/pn40;->a:La/pn40;

    invoke-static/range {v31 .. v32}, La/pn40;->e(D)Ljava/lang/String;

    move-result-object v8

    .line 463
    sget-object v9, La/s6t0;->a:La/pz40;

    .line 464
    invoke-static {}, La/s6t0;->b()La/taq0;

    move-result-object v9

    .line 465
    iget-object v9, v9, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 466
    invoke-virtual {v9}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getCommerce-0d7_KjU()J

    move-result-wide v13

    .line 467
    invoke-direct {v7, v8, v2, v13, v14}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 468
    invoke-direct {v4, v12, v6, v7}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    goto/16 :goto_50

    .line 469
    :cond_6e
    sget-object v4, La/pn40;->a:La/pn40;

    .line 470
    iget-object v4, v5, La/hxu;->f:La/ivo0;

    .line 471
    iget-wide v6, v4, La/ivo0;->b:D

    cmpg-double v4, v6, v20

    if-nez v4, :cond_6f

    move-wide/from16 v13, v31

    goto :goto_4d

    :cond_6f
    move-wide v13, v6

    .line 472
    :goto_4d
    invoke-static {v13, v14}, La/pn40;->e(D)Ljava/lang/String;

    move-result-object v40

    .line 473
    invoke-static/range {v29 .. v30}, La/pn40;->e(D)Ljava/lang/String;

    move-result-object v41

    .line 474
    new-instance v4, La/x680;

    .line 475
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    const/4 v7, 0x3

    if-eq v6, v7, :cond_70

    const/4 v7, 0x4

    if-eq v6, v7, :cond_70

    const/4 v14, 0x0

    .line 476
    new-array v6, v14, [Ljava/lang/Object;

    const v7, 0x7f130f4a

    invoke-virtual {v3, v7, v6}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    goto :goto_4e

    :cond_70
    const/4 v14, 0x0

    .line 477
    new-array v6, v14, [Ljava/lang/Object;

    const v7, 0x7f1309f5

    invoke-virtual {v3, v7, v6}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 478
    :goto_4e
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    packed-switch v7, :pswitch_data_0

    invoke-static {}, La/t9f;->b()V

    return-object v23

    .line 479
    :pswitch_0
    new-instance v37, La/xty;

    .line 480
    sget-object v7, La/s6t0;->a:La/pz40;

    .line 481
    sget-object v7, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 482
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getGreen-0d7_KjU()J

    move-result-wide v38

    move-object/from16 v42, v2

    .line 483
    invoke-direct/range {v37 .. v42}, La/xty;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v7, v37

    goto :goto_4f

    .line 484
    :pswitch_1
    new-instance v7, La/wty;

    .line 485
    invoke-static/range {v29 .. v30}, La/pn40;->e(D)Ljava/lang/String;

    move-result-object v8

    .line 486
    sget-object v9, La/s6t0;->a:La/pz40;

    .line 487
    invoke-static {}, La/s6t0;->b()La/taq0;

    move-result-object v9

    .line 488
    iget-object v9, v9, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 489
    invoke-virtual {v9}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v13

    .line 490
    invoke-direct {v7, v8, v2, v13, v14}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    goto :goto_4f

    :pswitch_2
    move-object/from16 v7, v41

    .line 491
    new-instance v8, La/wty;

    .line 492
    sget-object v9, La/s6t0;->a:La/pz40;

    .line 493
    invoke-static {}, La/s6t0;->b()La/taq0;

    move-result-object v9

    .line 494
    iget-object v9, v9, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 495
    invoke-virtual {v9}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v13

    .line 496
    invoke-direct {v8, v7, v2, v13, v14}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    move-object v7, v8

    .line 497
    :goto_4f
    invoke-direct {v4, v12, v6, v7}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    .line 498
    :goto_50
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 499
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    move-result-object v1

    .line 500
    :goto_51
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->S(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    move-result-object v1

    .line 501
    new-instance v2, La/ec;

    .line 502
    sget-object v4, La/hxu;->h:La/hxu;

    .line 503
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_71

    invoke-interface {v15, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_71

    const/4 v14, 0x1

    :goto_52
    move/from16 v15, p11

    goto :goto_53

    :cond_71
    const/4 v14, 0x0

    goto :goto_52

    .line 504
    :goto_53
    invoke-direct {v2, v15, v14}, La/ec;-><init>(ZZ)V

    .line 505
    iget-wide v4, v0, La/for0;->n:J

    if-nez v19, :cond_72

    cmp-long v0, v4, v24

    if-lez v0, :cond_73

    .line 506
    :cond_72
    new-instance v0, La/l3w;

    .line 507
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const v5, 0x7f13024e

    .line 508
    invoke-virtual {v3, v5, v4}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 509
    sget-object v4, La/i8x;->a:La/i8x;

    move-object/from16 v6, v28

    .line 510
    invoke-direct {v0, v3, v6, v4}, La/l3w;-><init>(Ljava/lang/String;Ljava/lang/String;La/k8x;)V

    move-object/from16 v23, v0

    .line 511
    :cond_73
    new-instance v0, La/qp30;

    .line 512
    new-instance v3, La/svw;

    move/from16 v4, p6

    invoke-direct {v3, v4}, La/svw;-><init>(I)V

    .line 513
    const-string v4, ""

    .line 514
    const-string v5, ""

    const/4 v6, 0x0

    .line 515
    const-string v7, ""

    move-object/from16 v8, v18

    move-object/from16 p3, p2

    move-object/from16 p9, p4

    move-object/from16 p0, v0

    move-object/from16 p13, v1

    move-object/from16 p8, v2

    move-object/from16 p4, v3

    move-object/from16 p11, v4

    move-object/from16 p16, v5

    move/from16 p6, v6

    move-object/from16 p10, v7

    move-object/from16 p2, v8

    move-object/from16 p1, v18

    move-object/from16 p14, v23

    move-object/from16 p5, v26

    invoke-direct/range {p0 .. p18}, La/qp30;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/tvw;Ljava/lang/String;ZLa/a4x;La/ec;La/kb30;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/a4x;La/l3w;La/nom0;Ljava/lang/String;La/so30;La/so30;)V

    return-object v0

    :cond_74
    move-object v1, v10

    move-object/from16 v6, v28

    .line 516
    instance-of v9, v7, La/vw4;

    if-eqz v9, :cond_75

    move-object v0, v7

    check-cast v0, La/vw4;

    move-object/from16 v12, p5

    move-object/from16 v4, p6

    move-object/from16 v6, p9

    move/from16 v7, p10

    move/from16 v8, p12

    move/from16 v10, p15

    move-object v1, v3

    move-object v9, v5

    move-object v3, v11

    move v5, v15

    move/from16 v11, p17

    invoke-static/range {v0 .. v12}, La/xf0;->R(La/vw4;La/ctf0;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;Ljava/lang/String;Ljava/util/List;ZLorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;ZZLjava/util/List;ZZLjava/util/List;)La/qp30;

    move-result-object v0

    return-object v0

    :cond_75
    move-object v13, v11

    .line 517
    instance-of v0, v7, La/z7y;

    if-eqz v0, :cond_76

    move-object v0, v7

    check-cast v0, La/z7y;

    invoke-static {v0, v3, v13, v4, v2}, La/a8y;->a(La/z7y;La/ctf0;Ljava/lang/String;Ljava/util/List;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)La/qp30;

    move-result-object v0

    return-object v0

    .line 518
    :cond_76
    instance-of v0, v7, La/nc10;

    if-eqz v0, :cond_7a

    move-object v0, v7

    check-cast v0, La/nc10;

    iget-object v2, v0, La/nc10;->d:Ljava/lang/String;

    .line 519
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v4

    const v6, 0x7f1309d9

    invoke-virtual {v3, v6, v4}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 520
    new-instance v5, La/qp30;

    move/from16 v6, p18

    .line 521
    invoke-static {v6, v2}, La/rz4;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 522
    iget-object v6, v0, La/nc10;->d:Ljava/lang/String;

    .line 523
    iget-wide v9, v0, La/nc10;->e:J

    .line 524
    invoke-static {v9, v10, v3}, La/bfb;->R(JLa/ctf0;)Ljava/lang/String;

    move-result-object v7

    .line 525
    invoke-static {v7, v8, v4}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 526
    new-instance v7, La/svw;

    const v8, 0x7f0805cd

    invoke-direct {v7, v8}, La/svw;-><init>(I)V

    .line 527
    iget-object v8, v0, La/nc10;->b:Ljava/lang/String;

    .line 528
    sget-object v9, La/lak0;->c:La/lak0;

    .line 529
    new-instance v10, La/ec;

    const/4 v14, 0x0

    invoke-direct {v10, v14, v14}, La/ec;-><init>(ZZ)V

    .line 530
    invoke-static {v0, v3, v13, v14}, La/pzw;->U(La/nc10;La/ctf0;Ljava/lang/String;Z)La/x680;

    move-result-object v11

    filled-new-array {v11}, [La/x680;

    move-result-object v11

    .line 531
    invoke-static {v11}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    move-result-object v11

    .line 532
    new-instance v12, La/nom0;

    .line 533
    iget-object v0, v0, La/nc10;->c:La/rc10;

    .line 534
    invoke-static {v0}, La/pzw;->e0(La/rc10;)I

    move-result v13

    new-array v14, v14, [Ljava/lang/Object;

    invoke-virtual {v3, v13, v14}, La/ctf0;->k(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 535
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_79

    const/4 v13, 0x1

    if-eq v0, v13, :cond_78

    const/4 v14, 0x2

    if-ne v0, v14, :cond_77

    .line 536
    sget-object v0, La/hom0;->d:La/hom0;

    goto :goto_54

    .line 537
    :cond_77
    invoke-static {}, La/t9f;->b()V

    return-object v23

    .line 538
    :cond_78
    sget-object v0, La/hom0;->b:La/hom0;

    goto :goto_54

    .line 539
    :cond_79
    sget-object v0, La/hom0;->a:La/hom0;

    .line 540
    :goto_54
    invoke-direct {v12, v3, v0}, La/nom0;-><init>(Ljava/lang/String;La/hom0;)V

    .line 541
    sget-object v0, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;->c:Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 542
    sget-object v3, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {v0}, La/kkb;->N(Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;)I

    move-result v3

    .line 543
    new-instance v13, La/so30;

    invoke-direct {v13, v3, v0}, La/so30;-><init>(ILorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;)V

    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 544
    const-string v14, ""

    const-string v15, ""

    const-string v16, ""

    const/16 v17, 0x0

    const-string v18, ""

    move-object/from16 p18, v0

    move-object/from16 p9, v1

    move-object/from16 p1, v2

    move/from16 p6, v3

    move-object/from16 p3, v4

    move-object/from16 p0, v5

    move-object/from16 p2, v6

    move-object/from16 p4, v7

    move-object/from16 p5, v8

    move-object/from16 p7, v9

    move-object/from16 p8, v10

    move-object/from16 p13, v11

    move-object/from16 p15, v12

    move-object/from16 p17, v13

    move-object/from16 p10, v14

    move-object/from16 p11, v15

    move-object/from16 p12, v16

    move-object/from16 p14, v17

    move-object/from16 p16, v18

    invoke-direct/range {p0 .. p18}, La/qp30;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/tvw;Ljava/lang/String;ZLa/a4x;La/ec;La/kb30;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/a4x;La/l3w;La/nom0;Ljava/lang/String;La/so30;La/so30;)V

    move-object/from16 v0, p0

    return-object v0

    .line 545
    :cond_7a
    new-instance v0, La/qp30;

    .line 546
    invoke-interface {v7}, La/a5w;->d()Ljava/lang/String;

    move-result-object v2

    .line 547
    invoke-interface {v7}, La/a5w;->d()Ljava/lang/String;

    move-result-object v3

    .line 548
    sget-object v4, La/lak0;->c:La/lak0;

    .line 549
    new-instance v5, La/ec;

    const/4 v14, 0x0

    invoke-direct {v5, v14, v14}, La/ec;-><init>(ZZ)V

    .line 550
    new-instance v7, La/nom0;

    .line 551
    sget-object v8, La/hom0;->b:La/hom0;

    .line 552
    invoke-direct {v7, v6, v8}, La/nom0;-><init>(Ljava/lang/String;La/hom0;)V

    const/4 v6, 0x0

    const/4 v8, 0x0

    .line 553
    const-string v9, ""

    sget-object v10, La/qvw;->a:La/qvw;

    const-string v11, ""

    const/4 v12, 0x0

    const-string v13, ""

    const-string v14, ""

    const-string v15, ""

    const/16 v16, 0x0

    const-string v17, ""

    move-object/from16 v18, v4

    move-object/from16 p0, v0

    move-object/from16 p9, v1

    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move-object/from16 p17, v6

    move-object/from16 p15, v7

    move-object/from16 p18, v8

    move-object/from16 p3, v9

    move-object/from16 p4, v10

    move-object/from16 p5, v11

    move/from16 p6, v12

    move-object/from16 p10, v13

    move-object/from16 p11, v14

    move-object/from16 p12, v15

    move-object/from16 p14, v16

    move-object/from16 p16, v17

    move-object/from16 p13, v18

    invoke-direct/range {p0 .. p18}, La/qp30;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/tvw;Ljava/lang/String;ZLa/a4x;La/ec;La/kb30;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/a4x;La/l3w;La/nom0;Ljava/lang/String;La/so30;La/so30;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public static final z(La/qbs0;Ljava/util/Map;La/wcb;La/ctf0;La/xte;Z)La/sbs0;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, La/bcm0;->A(La/qbs0;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-object v4, v0, La/qbs0;->b:La/mbs0;

    .line 27
    .line 28
    iget-object v5, v0, La/qbs0;->a:La/bcs0;

    .line 29
    .line 30
    iget-object v6, v5, La/bcs0;->l:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v7, v5, La/bcs0;->p:Ljava/lang/String;

    .line 33
    .line 34
    iget-wide v8, v4, La/mbs0;->h:J

    .line 35
    .line 36
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    sget-object v9, La/fho;->a:La/fho;

    .line 41
    .line 42
    move-object/from16 v10, p1

    .line 43
    .line 44
    invoke-interface {v10, v8, v9}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    check-cast v8, La/fho;

    .line 49
    .line 50
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Enum;->ordinal()I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    const/4 v10, 0x0

    .line 55
    const/4 v11, 0x3

    .line 56
    const/4 v12, 0x2

    .line 57
    const/4 v13, 0x1

    .line 58
    const/4 v14, 0x0

    .line 59
    if-eqz v9, :cond_7

    .line 60
    .line 61
    if-eq v9, v13, :cond_6

    .line 62
    .line 63
    if-eq v9, v12, :cond_6

    .line 64
    .line 65
    if-eq v9, v11, :cond_7

    .line 66
    .line 67
    const/4 v11, 0x4

    .line 68
    if-ne v9, v11, :cond_5

    .line 69
    .line 70
    new-instance v15, La/q7p;

    .line 71
    .line 72
    iget-object v9, v5, La/bcs0;->f:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v0, v1}, La/bcm0;->n(La/qbs0;La/wcb;)La/n0x;

    .line 75
    .line 76
    .line 77
    move-result-object v17

    .line 78
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_0

    .line 83
    .line 84
    new-instance v1, La/v7p;

    .line 85
    .line 86
    invoke-direct {v1, v6}, La/v7p;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :goto_0
    move-object/from16 v18, v1

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_0
    const-string v1, "/"

    .line 93
    .line 94
    filled-new-array {v1}, [Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    const/4 v11, 0x6

    .line 99
    invoke-static {v6, v10, v14, v11}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    if-eq v10, v12, :cond_4

    .line 108
    .line 109
    filled-new-array {v1}, [Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    invoke-static {v7, v10, v14, v11}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-ne v10, v12, :cond_1

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_1
    filled-new-array {v1}, [Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-static {v6, v10, v14, v11}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    if-gt v10, v12, :cond_3

    .line 137
    .line 138
    filled-new-array {v1}, [Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-static {v7, v1, v14, v11}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-le v1, v12, :cond_2

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_2
    new-instance v1, La/x7p;

    .line 154
    .line 155
    iget-object v10, v5, La/bcs0;->m:Ljava/lang/String;

    .line 156
    .line 157
    invoke-static {v5, v10, v13}, La/feb;->Y(La/bcs0;Ljava/lang/String;Z)La/d280;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    iget-object v11, v5, La/bcs0;->q:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v5, v11, v14}, La/feb;->Y(La/bcs0;Ljava/lang/String;Z)La/d280;

    .line 164
    .line 165
    .line 166
    move-result-object v11

    .line 167
    invoke-direct {v1, v6, v7, v10, v11}, La/x7p;-><init>(Ljava/lang/String;Ljava/lang/String;La/d280;La/d280;)V

    .line 168
    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_3
    :goto_1
    new-instance v1, La/u7p;

    .line 172
    .line 173
    invoke-direct {v1, v6, v7}, La/u7p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_4
    :goto_2
    new-instance v1, La/w7p;

    .line 178
    .line 179
    invoke-direct {v1, v6, v7}, La/w7p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto :goto_0

    .line 183
    :goto_3
    invoke-static {v2, v5}, La/bcm0;->l(La/ctf0;La/bcs0;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v19

    .line 187
    invoke-static {v2, v5}, La/bcm0;->m(La/ctf0;La/bcs0;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v20

    .line 191
    invoke-static {v0}, La/bcm0;->o(La/qbs0;)La/chl0;

    .line 192
    .line 193
    .line 194
    move-result-object v21

    .line 195
    iget-boolean v1, v4, La/mbs0;->d:Z

    .line 196
    .line 197
    invoke-static {v8, v2}, La/bcm0;->p(La/fho;La/ctf0;)La/zia;

    .line 198
    .line 199
    .line 200
    move-result-object v23

    .line 201
    move/from16 v22, v1

    .line 202
    .line 203
    move-object/from16 v16, v9

    .line 204
    .line 205
    invoke-direct/range {v15 .. v23}, La/q7p;-><init>(Ljava/lang/String;La/n0x;La/y7p;Ljava/lang/String;Ljava/lang/String;La/chl0;ZLa/zia;)V

    .line 206
    .line 207
    .line 208
    goto/16 :goto_7

    .line 209
    .line 210
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 211
    .line 212
    .line 213
    return-object v10

    .line 214
    :cond_6
    new-instance v6, La/o7p;

    .line 215
    .line 216
    iget-object v7, v5, La/bcs0;->f:Ljava/lang/String;

    .line 217
    .line 218
    move-object v9, v6

    .line 219
    invoke-static {v0, v1}, La/bcm0;->n(La/qbs0;La/wcb;)La/n0x;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    move-object v1, v7

    .line 224
    iget-object v7, v5, La/bcs0;->g:Ljava/lang/String;

    .line 225
    .line 226
    invoke-static {v2, v5}, La/bcm0;->l(La/ctf0;La/bcs0;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    move-object v11, v9

    .line 231
    invoke-static {v2, v5}, La/bcm0;->m(La/ctf0;La/bcs0;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    move-object v5, v10

    .line 236
    invoke-static {v0}, La/bcm0;->o(La/qbs0;)La/chl0;

    .line 237
    .line 238
    .line 239
    move-result-object v10

    .line 240
    move-object v12, v11

    .line 241
    iget-boolean v11, v4, La/mbs0;->d:Z

    .line 242
    .line 243
    move-object v4, v12

    .line 244
    invoke-static {v8, v2}, La/bcm0;->p(La/fho;La/ctf0;)La/zia;

    .line 245
    .line 246
    .line 247
    move-result-object v12

    .line 248
    move-object v8, v5

    .line 249
    move-object v5, v1

    .line 250
    invoke-direct/range {v4 .. v12}, La/o7p;-><init>(Ljava/lang/String;La/n0x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/chl0;ZLa/zia;)V

    .line 251
    .line 252
    .line 253
    move-object v15, v4

    .line 254
    goto/16 :goto_7

    .line 255
    .line 256
    :cond_7
    iget-object v6, v5, La/bcs0;->f:Ljava/lang/String;

    .line 257
    .line 258
    invoke-static {v0, v1}, La/bcm0;->n(La/qbs0;La/wcb;)La/n0x;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    move-object v1, v8

    .line 263
    iget-object v8, v5, La/bcs0;->g:Ljava/lang/String;

    .line 264
    .line 265
    sget-object v9, La/rdj;->a:La/rdj;

    .line 266
    .line 267
    iget-object v9, v2, La/ctf0;->b:La/lsm0;

    .line 268
    .line 269
    invoke-virtual {v2}, La/ctf0;->h()Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    move-object/from16 p4, v10

    .line 274
    .line 275
    iget-wide v10, v5, La/bcs0;->i:J

    .line 276
    .line 277
    iget-object v15, v5, La/bcs0;->u:Ljava/lang/String;

    .line 278
    .line 279
    sget-object v12, La/efj;->c:La/efj;

    .line 280
    .line 281
    new-instance v13, La/znq0;

    .line 282
    .line 283
    invoke-direct {v13, v10, v11}, La/znq0;-><init>(J)V

    .line 284
    .line 285
    .line 286
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    const/16 v10, 0x38

    .line 291
    .line 292
    invoke-static {v13, v12, v2, v14, v10}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    new-instance v10, Ljava/lang/StringBuilder;

    .line 297
    .line 298
    const-string v11, " "

    .line 299
    .line 300
    invoke-static {v2, v11}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    invoke-direct {v10, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    iget-object v2, v5, La/bcs0;->h:Ljava/lang/String;

    .line 308
    .line 309
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    if-nez v5, :cond_8

    .line 314
    .line 315
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    if-lez v5, :cond_8

    .line 320
    .line 321
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    if-lez v5, :cond_9

    .line 330
    .line 331
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    goto :goto_4

    .line 335
    :cond_9
    new-array v2, v14, [Ljava/lang/Object;

    .line 336
    .line 337
    invoke-static {v2, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    const v5, 0x7f130c89

    .line 342
    .line 343
    .line 344
    invoke-virtual {v9, v5, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    :goto_4
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    if-eqz v1, :cond_d

    .line 360
    .line 361
    const/4 v5, 0x1

    .line 362
    if-eq v1, v5, :cond_c

    .line 363
    .line 364
    const/4 v5, 0x2

    .line 365
    if-eq v1, v5, :cond_b

    .line 366
    .line 367
    const/4 v5, 0x3

    .line 368
    if-ne v1, v5, :cond_a

    .line 369
    .line 370
    new-instance v1, La/yia;

    .line 371
    .line 372
    new-array v5, v14, [Ljava/lang/Object;

    .line 373
    .line 374
    invoke-static {v5, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    const v10, 0x7f130757

    .line 379
    .line 380
    .line 381
    invoke-virtual {v9, v10, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    invoke-direct {v1, v5}, La/yia;-><init>(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    goto :goto_5

    .line 389
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 390
    .line 391
    .line 392
    return-object p4

    .line 393
    :cond_b
    new-instance v1, La/xia;

    .line 394
    .line 395
    new-array v5, v14, [Ljava/lang/Object;

    .line 396
    .line 397
    invoke-static {v5, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v5

    .line 401
    const v10, 0x7f130ed7

    .line 402
    .line 403
    .line 404
    invoke-virtual {v9, v10, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v5

    .line 408
    invoke-direct {v1, v5}, La/xia;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    goto :goto_5

    .line 412
    :cond_c
    new-instance v1, La/via;

    .line 413
    .line 414
    new-array v5, v14, [Ljava/lang/Object;

    .line 415
    .line 416
    invoke-static {v5, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v5

    .line 420
    const v10, 0x7f1301ae

    .line 421
    .line 422
    .line 423
    invoke-virtual {v9, v10, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v5

    .line 427
    invoke-direct {v1, v5}, La/via;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    goto :goto_5

    .line 431
    :cond_d
    sget-object v1, La/wia;->a:La/wia;

    .line 432
    .line 433
    :goto_5
    iget-boolean v12, v4, La/mbs0;->d:Z

    .line 434
    .line 435
    if-eqz p5, :cond_e

    .line 436
    .line 437
    move v13, v14

    .line 438
    goto :goto_6

    .line 439
    :cond_e
    move v13, v12

    .line 440
    :goto_6
    invoke-static {v0}, La/bcm0;->o(La/qbs0;)La/chl0;

    .line 441
    .line 442
    .line 443
    move-result-object v10

    .line 444
    new-instance v5, La/p7p;

    .line 445
    .line 446
    const/4 v11, 0x0

    .line 447
    move-object v14, v1

    .line 448
    move-object v9, v2

    .line 449
    invoke-direct/range {v5 .. v14}, La/p7p;-><init>(Ljava/lang/String;La/o0x;Ljava/lang/String;Ljava/lang/String;La/chl0;ZZZLa/zia;)V

    .line 450
    .line 451
    .line 452
    move-object v15, v5

    .line 453
    :goto_7
    new-instance v1, La/sbs0;

    .line 454
    .line 455
    invoke-direct {v1, v0, v3, v15}, La/sbs0;-><init>(La/qbs0;Ljava/lang/String;La/r7p;)V

    .line 456
    .line 457
    .line 458
    return-object v1
.end method
