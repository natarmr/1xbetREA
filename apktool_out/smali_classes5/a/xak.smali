.class public final La/xak;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vde0;
.implements La/w3n;
.implements La/tyn;
.implements La/egp;
.implements La/d3h0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/xak;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static p(I)La/urs;
    .locals 3

    .line 1
    sget-object v0, La/urs;->g:La/c0o;

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
    check-cast v2, La/urs;

    .line 19
    .line 20
    iget-byte v2, v2, La/urs;->c:B

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
    check-cast v1, La/urs;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    sget-object p0, La/urs;->e:La/urs;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    return-object v1
.end method

.method public static q(Ljava/lang/Integer;)La/pll;
    .locals 3

    .line 1
    sget-object v0, La/pll;->c:La/pll;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ne v2, v1, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    sget-object v0, La/pll;->d:La/pll;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-ne v2, v1, :cond_1

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    sget-object v0, La/pll;->e:La/pll;

    .line 22
    .line 23
    const/4 v1, 0x3

    .line 24
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-ne p0, v1, :cond_2

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_2
    sget-object p0, La/pll;->f:La/pll;

    .line 32
    .line 33
    return-object p0
.end method

.method public static r(Ljava/lang/Integer;)La/tho;
    .locals 4

    .line 1
    sget-object v0, La/tho;->j:La/c0o;

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
    check-cast v2, La/tho;

    .line 19
    .line 20
    iget v2, v2, La/tho;->a:I

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
    check-cast v1, La/tho;

    .line 34
    .line 35
    if-nez v1, :cond_3

    .line 36
    .line 37
    sget-object p0, La/tho;->h:La/tho;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_3
    return-object v1
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

.method public c(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p0, p0, La/xak;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p1, p2}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/Signature;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    return-object p0

    .line 18
    :pswitch_0
    if-nez p2, :cond_1

    .line 19
    .line 20
    invoke-static {p1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-static {p1, p2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :goto_1
    return-object p0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public e()La/d4d;
    .locals 0

    .line 1
    sget-object p0, La/d4d;->Q1:La/d4d;

    .line 2
    .line 3
    return-object p0
.end method

.method public f(La/fet;)J
    .locals 2

    .line 1
    const p0, -0xbfcfb13

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    sget-object p0, La/m8m0;->a:La/zfn;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 14
    .line 15
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    const/4 p0, 0x0

    .line 20
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 21
    .line 22
    .line 23
    return-wide v0
.end method

.method public g(La/fet;)J
    .locals 2

    .line 1
    const p0, 0x6181bf63

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    sget-object p0, La/m8m0;->a:La/zfn;

    .line 8
    .line 9
    invoke-virtual {p1, p0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 14
    .line 15
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    const/4 p0, 0x0

    .line 20
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 21
    .line 22
    .line 23
    return-wide v0
.end method

.method public getType()La/wsy;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "This method should not be called"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public h(La/fet;)La/y9q0;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const v1, 0x630d366f

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 7
    .line 8
    .line 9
    sget-object v8, La/j1t0;->b:La/qrq;

    .line 10
    .line 11
    sget-wide v5, La/qmk;->p:J

    .line 12
    .line 13
    sget-wide v14, La/qmk;->C:J

    .line 14
    .line 15
    new-instance v2, La/y9q0;

    .line 16
    .line 17
    const/4 v13, 0x0

    .line 18
    const v16, 0xfdffdd

    .line 19
    .line 20
    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const-wide/16 v9, 0x0

    .line 25
    .line 26
    const/4 v11, 0x0

    .line 27
    const/4 v12, 0x0

    .line 28
    invoke-direct/range {v2 .. v16}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v0}, La/ibm0;->s(La/y9q0;La/fet;)La/y9q0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 37
    .line 38
    .line 39
    return-object v1
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

.method public k(La/fet;)La/y9q0;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const v1, -0x2eeb7b00

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 7
    .line 8
    .line 9
    sget-object v8, La/j1t0;->b:La/qrq;

    .line 10
    .line 11
    sget-wide v5, La/qmk;->r:J

    .line 12
    .line 13
    sget-wide v14, La/qmk;->F:J

    .line 14
    .line 15
    new-instance v2, La/y9q0;

    .line 16
    .line 17
    const/4 v13, 0x0

    .line 18
    const v16, 0xfdffdd

    .line 19
    .line 20
    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const-wide/16 v9, 0x0

    .line 25
    .line 26
    const/4 v11, 0x0

    .line 27
    const/4 v12, 0x0

    .line 28
    invoke-direct/range {v2 .. v16}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v0}, La/ibm0;->s(La/y9q0;La/fet;)La/y9q0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method

.method public l(La/xii0;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public m(La/fet;)La/y9q0;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const v1, -0x2274f93e

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 7
    .line 8
    .line 9
    sget-object v8, La/j1t0;->b:La/qrq;

    .line 10
    .line 11
    sget-wide v5, La/qmk;->p:J

    .line 12
    .line 13
    sget-wide v14, La/qmk;->C:J

    .line 14
    .line 15
    new-instance v2, La/y9q0;

    .line 16
    .line 17
    const/4 v13, 0x0

    .line 18
    const v16, 0xfdffdd

    .line 19
    .line 20
    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const-wide/16 v9, 0x0

    .line 25
    .line 26
    const/4 v11, 0x0

    .line 27
    const/4 v12, 0x0

    .line 28
    invoke-direct/range {v2 .. v16}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v0}, La/ibm0;->s(La/y9q0;La/fet;)La/y9q0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method

.method public o(La/mm40;Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;La/fet;I)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, -0x7ac429ac

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3, v0}, La/fet;->g0(I)La/fet;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3, p2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0x10

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/16 v0, 0x20

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v1

    .line 22
    :goto_0
    or-int/2addr v0, p4

    .line 23
    and-int/lit8 v2, v0, 0x11

    .line 24
    .line 25
    if-eq v2, v1, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_1
    and-int/lit8 v2, v0, 0x1

    .line 31
    .line 32
    invoke-virtual {p3, v2, v1}, La/fet;->U(IZ)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    shr-int/lit8 v0, v0, 0x3

    .line 39
    .line 40
    and-int/lit8 v0, v0, 0xe

    .line 41
    .line 42
    const/16 v1, 0x8

    .line 43
    .line 44
    or-int/2addr v0, v1

    .line 45
    invoke-static {p2, p3, v0}, La/rsr0;->O(Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;La/fet;I)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    invoke-virtual {p3}, La/fet;->X()V

    .line 50
    .line 51
    .line 52
    :goto_2
    invoke-virtual {p3}, La/fet;->u()La/yfe0;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    if-eqz p3, :cond_3

    .line 57
    .line 58
    new-instance v0, La/hpr;

    .line 59
    .line 60
    const/4 v5, 0x5

    .line 61
    move-object v1, p0

    .line 62
    move-object v2, p1

    .line 63
    move-object v3, p2

    .line 64
    move v4, p4

    .line 65
    invoke-direct/range {v0 .. v5}, La/hpr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p3, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 69
    .line 70
    :cond_3
    return-void
.end method
