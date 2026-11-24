.class public final La/amr0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/amr0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/cvm0",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic m2:I


# instance fields
.field public k2:La/fiu0;

.field public final l2:La/kiu0;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/qir0;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, p0, v1}, La/qir0;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, La/moq0;

    .line 11
    .line 12
    const/16 v2, 0xe

    .line 13
    .line 14
    invoke-direct {v1, p0, v2}, La/moq0;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    sget-object v2, La/wez;->b:La/wez;

    .line 18
    .line 19
    new-instance v3, La/moq0;

    .line 20
    .line 21
    const/16 v4, 0xf

    .line 22
    .line 23
    invoke-direct {v3, v1, v4}, La/moq0;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-class v2, La/gmr0;

    .line 31
    .line 32
    sget-object v3, La/sre0;->a:La/tre0;

    .line 33
    .line 34
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    new-instance v3, La/p7r0;

    .line 39
    .line 40
    const/16 v4, 0x8

    .line 41
    .line 42
    invoke-direct {v3, v1, v4}, La/p7r0;-><init>(La/a8z;B)V

    .line 43
    .line 44
    .line 45
    new-instance v4, La/p7r0;

    .line 46
    .line 47
    const/16 v5, 0x9

    .line 48
    .line 49
    invoke-direct {v4, v1, v5}, La/p7r0;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, La/amr0;->l2:La/kiu0;

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 10

    .line 1
    const v0, -0x7ad93ca5

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/amr0;->l2:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/gmr0;

    .line 14
    .line 15
    iget-object v1, v0, La/gmr0;->c:La/hru;

    .line 16
    .line 17
    iget-object v1, v1, La/hru;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La/g090;

    .line 20
    .line 21
    iget-object v1, v1, La/g090;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, La/gkr0;

    .line 24
    .line 25
    iget-object v1, v1, La/gkr0;->a:La/p7m0;

    .line 26
    .line 27
    new-instance v2, La/i89;

    .line 28
    .line 29
    const/16 v3, 0x16

    .line 30
    .line 31
    invoke-direct {v2, v1, v3}, La/i89;-><init>(La/gmq;B)V

    .line 32
    .line 33
    .line 34
    new-instance v1, La/omi0;

    .line 35
    .line 36
    const/16 v3, 0xc

    .line 37
    .line 38
    invoke-direct {v1, v2, v0, v3}, La/omi0;-><init>(La/gmq;Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v2, La/jq8;

    .line 46
    .line 47
    const-string v3, ""

    .line 48
    .line 49
    sget-object v4, La/iun;->a:La/iun;

    .line 50
    .line 51
    invoke-direct {v2, v3, v4}, La/jq8;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    sget-object v3, La/kpj0;->b:La/m6m0;

    .line 55
    .line 56
    invoke-static {v1, v0, v3, v2}, La/vtb;->h0(La/gmq;La/vne;La/lpj0;Ljava/lang/Object;)La/xae0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const/4 v1, 0x7

    .line 61
    const/4 v2, 0x0

    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-static {v0, v2, p1, v3, v1}, La/gkb;->Q(La/n7m0;La/clz;La/fet;II)La/pz40;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v4, La/bw5;

    .line 68
    .line 69
    const/4 v1, 0x1

    .line 70
    invoke-static {v1, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    new-instance v1, La/qjr0;

    .line 75
    .line 76
    const/4 v2, 0x2

    .line 77
    invoke-direct {v1, v0, v2}, La/qjr0;-><init>(La/l7m0;B)V

    .line 78
    .line 79
    .line 80
    const v2, 0x36f0a0a

    .line 81
    .line 82
    .line 83
    invoke-static {v2, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    new-instance v1, La/nhl0;

    .line 88
    .line 89
    const/16 v2, 0x1b

    .line 90
    .line 91
    invoke-direct {v1, v0, p0, v2}, La/nhl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 92
    .line 93
    .line 94
    const p0, -0x27895174

    .line 95
    .line 96
    .line 97
    invoke-static {p0, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    const/16 v9, 0xa

    .line 102
    .line 103
    const/4 v7, 0x0

    .line 104
    invoke-direct/range {v4 .. v9}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v3}, La/fet;->r(Z)V

    .line 108
    .line 109
    .line 110
    return-object v4
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/vlr0;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/vlr0;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/vlr0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-virtual {v2}, La/vlr0;->a()La/ywq0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, La/ywq0;->I()La/fiu0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/amr0;->k2:La/fiu0;

    .line 64
    .line 65
    invoke-super {p0, p1}, La/sik;->W(Landroid/os/Bundle;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 70
    .line 71
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method
