.class public final La/cl5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jg9;
.implements La/cy9;
.implements Lkotlin/coroutines/f;
.implements La/uw00;
.implements La/d3h0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/cl5;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static q(DDDZ)D
    .locals 2

    .line 1
    if-eqz p6, :cond_0

    .line 2
    .line 3
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 4
    .line 5
    sub-double p2, v0, p2

    .line 6
    .line 7
    div-double p2, v0, p2

    .line 8
    .line 9
    invoke-static {p2, p3}, Ljava/lang/Math;->abs(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    add-double/2addr p2, v0

    .line 14
    mul-double/2addr p2, p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p0, p1, p2, p3}, La/m7x;->q(DD)D

    .line 17
    .line 18
    .line 19
    move-result-wide p2

    .line 20
    :goto_0
    cmpl-double p0, p4, p2

    .line 21
    .line 22
    if-gez p0, :cond_2

    .line 23
    .line 24
    const-wide/16 p0, 0x0

    .line 25
    .line 26
    cmpg-double p0, p4, p0

    .line 27
    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    return-wide p4

    .line 32
    :cond_2
    :goto_1
    return-wide p2
.end method

.method public static r(Ljava/lang/String;)La/mvc;
    .locals 3

    .line 1
    sget-object v0, La/mvc;->B:La/c0o;

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
    check-cast v2, La/mvc;

    .line 19
    .line 20
    iget-object v2, v2, La/mvc;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_0
    check-cast v1, La/mvc;

    .line 31
    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    sget-object p0, La/mvc;->c:La/mvc;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_2
    return-object v1
.end method

.method public static s(La/mcy;)La/ipb;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p0, La/jdy;

    .line 5
    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    check-cast p0, La/jdy;

    .line 9
    .line 10
    invoke-virtual {p0}, La/jdy;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-object p0, La/ipb;->e:La/ipb;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    sget-object v0, La/ncy;->a:La/scx;

    .line 20
    .line 21
    invoke-virtual {p0}, La/jdy;->b()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, La/wsm0;->b(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object p0, La/ipb;->b:La/ipb;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    invoke-static {p0}, La/ncy;->g(La/jdy;)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_3

    .line 39
    .line 40
    sget-object p0, La/ipb;->d:La/ipb;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_3
    sget-object p0, La/ipb;->e:La/ipb;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_4
    instance-of v0, p0, La/yby;

    .line 47
    .line 48
    if-eqz v0, :cond_5

    .line 49
    .line 50
    sget-object p0, La/ipb;->c:La/ipb;

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_5
    instance-of v0, p0, La/edy;

    .line 54
    .line 55
    if-eqz v0, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    instance-of p0, p0, La/bdy;

    .line 59
    .line 60
    if-eqz p0, :cond_7

    .line 61
    .line 62
    :goto_0
    sget-object p0, La/ipb;->e:La/ipb;

    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    return-object p0
.end method

.method public static t(DDDZILa/q4f;)D
    .locals 7

    .line 1
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p8}, Ljava/lang/Enum;->ordinal()I

    .line 5
    .line 6
    .line 7
    move-result p8

    .line 8
    const/4 v0, 0x1

    .line 9
    if-eq p8, v0, :cond_2

    .line 10
    .line 11
    const/4 p6, 0x3

    .line 12
    if-eq p8, p6, :cond_0

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    move-wide v0, p0

    .line 16
    move-wide v2, p2

    .line 17
    move-wide v4, p4

    .line 18
    invoke-static/range {v0 .. v6}, La/cl5;->q(DDDZ)D

    .line 19
    .line 20
    .line 21
    move-result-wide p0

    .line 22
    return-wide p0

    .line 23
    :cond_0
    move-wide p4, p2

    .line 24
    move-wide p2, p0

    .line 25
    if-nez p7, :cond_1

    .line 26
    .line 27
    const-wide/16 p0, 0x0

    .line 28
    .line 29
    return-wide p0

    .line 30
    :cond_1
    invoke-static {p2, p3, p4, p5}, La/m7x;->q(DD)D

    .line 31
    .line 32
    .line 33
    move-result-wide p0

    .line 34
    invoke-static {p0, p1, p7}, La/m7x;->p(DI)D

    .line 35
    .line 36
    .line 37
    move-result-wide p0

    .line 38
    return-wide p0

    .line 39
    :cond_2
    move p8, p6

    .line 40
    move-wide p6, p4

    .line 41
    move-wide p4, p2

    .line 42
    move-wide p2, p0

    .line 43
    invoke-static/range {p2 .. p8}, La/cl5;->q(DDDZ)D

    .line 44
    .line 45
    .line 46
    move-result-wide p0

    .line 47
    return-wide p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "0"

    .line 2
    .line 3
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "0"

    .line 2
    .line 3
    return-object p0
.end method

.method public c()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public e([BII)[B
    .locals 0

    .line 1
    add-int/2addr p3, p2

    .line 2
    invoke-static {p1, p2, p3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public f()La/eoo0;
    .locals 0

    .line 1
    sget-object p0, La/eoo0;->b:La/eoo0;

    .line 2
    .line 3
    return-object p0
.end method

.method public h()J
    .locals 2

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    return-wide v0
.end method

.method public i()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public j()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public k(Landroid/content/Intent;)Lcom/yandex/authsdk/YandexAuthToken;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string p0, "com.yandex.authsdk.EXTRA_TOKEN"

    .line 5
    .line 6
    const-class v0, Lcom/yandex/authsdk/YandexAuthToken;

    .line 7
    .line 8
    invoke-static {p1, p0, v0}, La/x2x;->U(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lcom/yandex/authsdk/YandexAuthToken;

    .line 13
    .line 14
    return-object p0
.end method

.method public l(Landroid/content/Intent;)La/d2w0;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, La/x2x;->V(Landroid/content/Intent;)Ljava/io/Serializable;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, La/d2w0;

    .line 9
    .line 10
    return-object p0
.end method

.method public m()La/zx9;
    .locals 0

    .line 1
    sget-object p0, La/zx9;->a:La/zx9;

    .line 2
    .line 3
    return-object p0
.end method

.method public o()La/ay9;
    .locals 0

    .line 1
    sget-object p0, La/ay9;->a:La/ay9;

    .line 2
    .line 3
    return-object p0
.end method

.method public p()La/yx9;
    .locals 0

    .line 1
    sget-object p0, La/yx9;->a:La/yx9;

    .line 2
    .line 3
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-byte v0, p0, La/cl5;->a:B

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
    const-string p0, "Empty"

    .line 12
    .line 13
    return-object p0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x1d
        :pswitch_0
    .end packed-switch
.end method
