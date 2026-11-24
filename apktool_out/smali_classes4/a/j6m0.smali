.class public final La/j6m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/lpj0;
.implements Lkotlin/coroutines/f;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 12
    iput-byte p1, p0, La/j6m0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/y2m0;La/s2m0;La/us3;)V
    .locals 0

    .line 1
    const/16 p1, 0x12

    .line 2
    .line 3
    iput-byte p1, p0, La/j6m0;->a:B

    .line 4
    .line 5
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static a(I)La/ygq0;
    .locals 3

    .line 1
    sget-object v0, La/ygq0;->s:La/c0o;

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
    check-cast v2, La/ygq0;

    .line 19
    .line 20
    iget-byte v2, v2, La/ygq0;->a:B

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
    check-cast v1, La/ygq0;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    sget-object p0, La/ygq0;->c:La/ygq0;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    return-object v1
.end method

.method public static c(Z)Ljava/util/List;
    .locals 10

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object v0, La/ygq0;->c:La/ygq0;

    .line 4
    .line 5
    sget-object v1, La/ygq0;->k:La/ygq0;

    .line 6
    .line 7
    sget-object v2, La/ygq0;->l:La/ygq0;

    .line 8
    .line 9
    sget-object v3, La/ygq0;->m:La/ygq0;

    .line 10
    .line 11
    sget-object v4, La/ygq0;->n:La/ygq0;

    .line 12
    .line 13
    sget-object v5, La/ygq0;->o:La/ygq0;

    .line 14
    .line 15
    sget-object v6, La/ygq0;->p:La/ygq0;

    .line 16
    .line 17
    filled-new-array/range {v0 .. v6}, [La/ygq0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    sget-object v0, La/ygq0;->c:La/ygq0;

    .line 27
    .line 28
    sget-object v1, La/ygq0;->q:La/ygq0;

    .line 29
    .line 30
    sget-object v2, La/ygq0;->d:La/ygq0;

    .line 31
    .line 32
    sget-object v3, La/ygq0;->e:La/ygq0;

    .line 33
    .line 34
    sget-object v4, La/ygq0;->f:La/ygq0;

    .line 35
    .line 36
    sget-object v5, La/ygq0;->g:La/ygq0;

    .line 37
    .line 38
    sget-object v6, La/ygq0;->h:La/ygq0;

    .line 39
    .line 40
    sget-object v7, La/ygq0;->i:La/ygq0;

    .line 41
    .line 42
    sget-object v8, La/ygq0;->j:La/ygq0;

    .line 43
    .line 44
    sget-object v9, La/ygq0;->p:La/ygq0;

    .line 45
    .line 46
    filled-new-array/range {v0 .. v9}, [La/ygq0;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public static d()Ljava/util/List;
    .locals 8

    .line 1
    sget-object v0, La/ygq0;->c:La/ygq0;

    .line 2
    .line 3
    sget-object v1, La/ygq0;->q:La/ygq0;

    .line 4
    .line 5
    sget-object v2, La/ygq0;->d:La/ygq0;

    .line 6
    .line 7
    sget-object v3, La/ygq0;->e:La/ygq0;

    .line 8
    .line 9
    sget-object v4, La/ygq0;->f:La/ygq0;

    .line 10
    .line 11
    sget-object v5, La/ygq0;->g:La/ygq0;

    .line 12
    .line 13
    sget-object v6, La/ygq0;->h:La/ygq0;

    .line 14
    .line 15
    sget-object v7, La/ygq0;->i:La/ygq0;

    .line 16
    .line 17
    filled-new-array/range {v0 .. v7}, [La/ygq0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public static e(Landroidx/fragment/app/e;Ljava/lang/String;Z)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "SupportAppBottomSheetDialog"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v1, La/sin0;

    .line 14
    .line 15
    invoke-direct {v1}, La/sin0;-><init>()V

    .line 16
    .line 17
    .line 18
    sget-object v2, La/sin0;->k2:[La/iiy;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    aget-object v3, v2, v3

    .line 22
    .line 23
    iget-object v4, v1, La/sin0;->g2:La/cgx0;

    .line 24
    .line 25
    invoke-virtual {v4, v1, v3, p2}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 26
    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    aget-object p2, v2, p2

    .line 30
    .line 31
    iget-object v2, v1, La/sin0;->h2:La/phf0;

    .line 32
    .line 33
    invoke-virtual {v2, v1, p2, p1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p0, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static f(Landroidx/fragment/app/e;Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/b5r0;->v2:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, La/b5r0;

    .line 13
    .line 14
    invoke-direct {v1}, La/b5r0;-><init>()V

    .line 15
    .line 16
    .line 17
    sget-object v2, La/b5r0;->u2:[La/iiy;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    aget-object v2, v2, v3

    .line 21
    .line 22
    iget-object v3, v1, La/b5r0;->k2:La/khf0;

    .line 23
    .line 24
    invoke-virtual {v3, v1, v2, p1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1, p0, v0}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method


# virtual methods
.method public b(La/w6n0;)La/gmq;
    .locals 1

    .line 1
    sget-object p0, La/jpj0;->a:La/jpj0;

    .line 2
    .line 3
    new-instance p1, La/eu4;

    .line 4
    .line 5
    const/16 v0, 0xc

    .line 6
    .line 7
    invoke-direct {p1, p0, v0}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte v0, p0, La/j6m0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    const-string p0, "SharingStarted.Eagerly"

    .line 12
    .line 13
    return-object p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
