.class public final La/ag8;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(La/csr;)La/bg8;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/csr;->a:La/bsr;

    .line 5
    .line 6
    iget-object v0, p0, La/bsr;->a:La/esr;

    .line 7
    .line 8
    sget-object v1, La/esr;->c:La/esr;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return-object v2

    .line 14
    :cond_0
    new-instance v1, La/bg8;

    .line 15
    .line 16
    sget-object v3, La/uk10;->Companion:La/tk10;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v3, La/sk10;->a:[I

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    aget v0, v3, v0

    .line 28
    .line 29
    packed-switch v0, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    sget-object v0, La/uk10;->b:La/uk10;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :pswitch_0
    sget-object v0, La/uk10;->g:La/uk10;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_1
    sget-object v0, La/uk10;->h:La/uk10;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_2
    sget-object v0, La/uk10;->f:La/uk10;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_3
    sget-object v0, La/uk10;->e:La/uk10;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_4
    sget-object v0, La/uk10;->d:La/uk10;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_5
    sget-object v0, La/uk10;->c:La/uk10;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_6
    sget-object v0, La/uk10;->b:La/uk10;

    .line 54
    .line 55
    :goto_0
    iget-wide v3, p0, La/bsr;->c:D

    .line 56
    .line 57
    const-wide/16 v5, 0x0

    .line 58
    .line 59
    cmpl-double p0, v3, v5

    .line 60
    .line 61
    if-lez p0, :cond_1

    .line 62
    .line 63
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    :cond_1
    invoke-direct {v1, v0, v2}, La/bg8;-><init>(La/uk10;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v1

    .line 71
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


# virtual methods
.method public final serializer()La/jiy;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/jiy;"
        }
    .end annotation

    .line 1
    sget-object p0, La/zf8;->a:La/zf8;

    .line 2
    .line 3
    return-object p0
.end method
