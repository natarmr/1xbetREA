.class public final La/imx;
.super La/p4;
.source "SourceFile"


# instance fields
.field public final synthetic c:B

.field public final d:Ljava/lang/String;

.field public final e:La/kvq0;

.field public final f:La/n0o0;

.field public final g:La/p4;


# direct methods
.method public constructor <init>(La/vkr0;Ljava/lang/String;La/kvq0;La/imx;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/imx;->c:B

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p0, p1, v0}, La/p4;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, La/imx;->d:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p3, p0, La/imx;->e:La/kvq0;

    .line 17
    .line 18
    iput-object p4, p0, La/imx;->g:La/p4;

    .line 19
    .line 20
    new-instance p1, La/sz2;

    .line 21
    .line 22
    const/16 p2, 0xd

    .line 23
    .line 24
    invoke-direct {p1, p0, p2}, La/sz2;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, La/imx;->f:La/n0o0;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(La/vkr0;Ljava/lang/String;La/kvq0;La/v2e0;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/imx;->c:B

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x3

    .line 34
    invoke-direct {p0, p1, v0}, La/p4;-><init>(Ljava/lang/Object;B)V

    .line 35
    iput-object p2, p0, La/imx;->d:Ljava/lang/String;

    .line 36
    iput-object p3, p0, La/imx;->e:La/kvq0;

    .line 37
    iput-object p4, p0, La/imx;->g:La/p4;

    .line 38
    new-instance p1, La/sz2;

    const/16 p2, 0x13

    invoke-direct {p1, p0, p2}, La/sz2;-><init>(Ljava/lang/Object;B)V

    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    iput-object p1, p0, La/imx;->f:La/n0o0;

    return-void
.end method


# virtual methods
.method public final q0(La/td9;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/imx;->c:B

    .line 2
    .line 3
    iget-object v1, p0, La/imx;->g:La/p4;

    .line 4
    .line 5
    iget-object v2, p0, La/imx;->e:La/kvq0;

    .line 6
    .line 7
    iget-object v3, p0, La/imx;->f:La/n0o0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v6, p0, La/imx;->d:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v2, v6}, La/kvq0;->c(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    :try_start_0
    check-cast v1, La/v2e0;

    .line 21
    .line 22
    invoke-virtual {v1, p1}, La/v2e0;->q0(La/td9;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v2, v6}, La/kvq0;->b(Ljava/lang/String;)V
    :try_end_0
    .catch La/yut0; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :catch_0
    move-exception v0

    .line 31
    move-object p1, v0

    .line 32
    iget v0, p1, La/yut0;->b:I

    .line 33
    .line 34
    const/16 v1, 0x2b

    .line 35
    .line 36
    if-ne v0, v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v2, v6}, La/kvq0;->a(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {p0, v0, p1}, La/p4;->E0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    throw p1

    .line 51
    :cond_1
    new-instance v4, La/w2e0;

    .line 52
    .line 53
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    move-object v7, p0

    .line 58
    check-cast v7, Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const/4 v10, 0x0

    .line 64
    const/16 v11, 0x3f0

    .line 65
    .line 66
    const/16 v5, 0x2b

    .line 67
    .line 68
    const/4 v8, 0x0

    .line 69
    const/4 v9, 0x0

    .line 70
    invoke-direct/range {v4 .. v11}, La/yut0;-><init>(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;I)V

    .line 71
    .line 72
    .line 73
    throw v4

    .line 74
    :pswitch_0
    iget-object v4, p0, La/imx;->d:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v2, v4}, La/kvq0;->c(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_2

    .line 81
    .line 82
    :try_start_1
    check-cast v1, La/imx;

    .line 83
    .line 84
    invoke-virtual {v1, p1}, La/imx;->q0(La/td9;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {v2, v4}, La/kvq0;->b(Ljava/lang/String;)V
    :try_end_1
    .catch La/ovt0; {:try_start_1 .. :try_end_1} :catch_1

    .line 89
    .line 90
    .line 91
    return-object p1

    .line 92
    :catch_1
    move-exception v0

    .line 93
    move-object p1, v0

    .line 94
    invoke-virtual {v2, v4}, La/kvq0;->a(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {p0, v0, p1}, La/p4;->E0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :cond_2
    new-instance p0, La/pmx;

    .line 108
    .line 109
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    const/16 v0, 0xf

    .line 119
    .line 120
    invoke-direct {p0, p1, v0}, La/c44;-><init>(Ljava/lang/String;B)V

    .line 121
    .line 122
    .line 123
    throw p0

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
