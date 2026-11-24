.class public final La/s2m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ff60;


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

.method public static a(I)La/t2m0;
    .locals 3

    .line 1
    sget-object v0, La/t2m0;->l:La/c0o;

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
    check-cast v2, La/t2m0;

    .line 19
    .line 20
    iget-byte v2, v2, La/t2m0;->a:B

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
    check-cast v1, La/t2m0;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    sget-object p0, La/t2m0;->c:La/t2m0;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    return-object v1
.end method

.method public static b(La/goo0;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    :pswitch_0
    const p0, 0x7f14080e

    .line 12
    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_1
    const p0, 0x7f140812

    .line 16
    .line 17
    .line 18
    return p0

    .line 19
    :pswitch_2
    const p0, 0x7f140804

    .line 20
    .line 21
    .line 22
    return p0

    .line 23
    :pswitch_3
    const p0, 0x7f140807

    .line 24
    .line 25
    .line 26
    return p0

    .line 27
    :pswitch_4
    const p0, 0x7f140806

    .line 28
    .line 29
    .line 30
    return p0

    .line 31
    :pswitch_5
    const p0, 0x7f14080b

    .line 32
    .line 33
    .line 34
    return p0

    .line 35
    :pswitch_6
    const p0, 0x7f140805

    .line 36
    .line 37
    .line 38
    return p0

    .line 39
    :pswitch_7
    const p0, 0x7f14080a

    .line 40
    .line 41
    .line 42
    return p0

    .line 43
    :pswitch_8
    const p0, 0x7f140813

    .line 44
    .line 45
    .line 46
    return p0

    .line 47
    :pswitch_9
    const p0, 0x7f140810

    .line 48
    .line 49
    .line 50
    return p0

    .line 51
    :pswitch_a
    const p0, 0x7f140803

    .line 52
    .line 53
    .line 54
    return p0

    .line 55
    :pswitch_b
    const p0, 0x7f14080d

    .line 56
    .line 57
    .line 58
    return p0

    .line 59
    :pswitch_c
    const p0, 0x7f140811

    .line 60
    .line 61
    .line 62
    return p0

    .line 63
    :pswitch_d
    const p0, 0x7f140808

    .line 64
    .line 65
    .line 66
    return p0

    .line 67
    :pswitch_e
    const p0, 0x7f140809

    .line 68
    .line 69
    .line 70
    return p0

    .line 71
    :pswitch_f
    const p0, 0x7f14080f

    .line 72
    .line 73
    .line 74
    return p0

    .line 75
    :pswitch_10
    const p0, 0x7f14080c

    .line 76
    .line 77
    .line 78
    return p0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
    .end packed-switch
.end method

.method public static c(Landroidx/fragment/app/e;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const-class v0, La/ilq0;

    .line 8
    .line 9
    sget-object v1, La/sre0;->a:La/tre0;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, La/sgy;->J()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance v1, La/ilq0;

    .line 27
    .line 28
    invoke-direct {v1}, La/ilq0;-><init>()V

    .line 29
    .line 30
    .line 31
    sget-object v2, La/ilq0;->m2:[La/iiy;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    aget-object v3, v2, v3

    .line 35
    .line 36
    iget-object v4, v1, La/ilq0;->j2:La/phf0;

    .line 37
    .line 38
    invoke-virtual {v4, v1, v3, p1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x2

    .line 42
    aget-object p1, v2, p1

    .line 43
    .line 44
    iget-object v2, v1, La/ilq0;->k2:La/phf0;

    .line 45
    .line 46
    invoke-virtual {v2, v1, p1, p2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p0, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static e(Landroidx/fragment/app/e;Ljava/util/List;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-class v0, La/gbq0;

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
    invoke-interface {v0}, La/sgy;->J()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    new-instance v1, La/gbq0;

    .line 23
    .line 24
    invoke-direct {v1}, La/gbq0;-><init>()V

    .line 25
    .line 26
    .line 27
    sget-object v2, La/gbq0;->n2:[La/iiy;

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    aget-object v3, v2, v3

    .line 31
    .line 32
    iget-object v4, v1, La/gbq0;->j2:La/es;

    .line 33
    .line 34
    invoke-virtual {v4, v1, v3, p1}, La/es;->D(Landroidx/fragment/app/Fragment;La/iiy;Ljava/util/List;)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x2

    .line 38
    aget-object p1, v2, p1

    .line 39
    .line 40
    iget-object v2, v1, La/gbq0;->k2:La/phf0;

    .line 41
    .line 42
    const-string v3, "REQUEST_SELECT_THEME_DIALOG_KEY"

    .line 43
    .line 44
    invoke-virtual {v2, v1, p1, v3}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, p0, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
.end method


# virtual methods
.method public d(La/guo;)J
    .locals 0

    .line 1
    const-wide/16 p0, -0x1

    .line 2
    .line 3
    return-wide p0
.end method

.method public i()La/fvh0;
    .locals 2

    .line 1
    new-instance p0, La/ca5;

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0, v1}, La/ca5;-><init>(J)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public j(J)V
    .locals 0

    .line 1
    return-void
.end method
