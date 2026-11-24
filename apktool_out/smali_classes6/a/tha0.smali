.class public final La/tha0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/tha0;",
        "La/iw5;",
        "<init>",
        "()V",
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
    new-instance v0, La/l3a0;

    .line 5
    .line 6
    const/16 v1, 0xf

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, La/l3a0;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance v2, La/wz80;

    .line 12
    .line 13
    invoke-direct {v2, p0, v1}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    sget-object v3, La/wez;->b:La/wez;

    .line 17
    .line 18
    new-instance v4, La/wz80;

    .line 19
    .line 20
    const/16 v5, 0x10

    .line 21
    .line 22
    invoke-direct {v4, v2, v5}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-class v3, La/yha0;

    .line 30
    .line 31
    sget-object v4, La/sre0;->a:La/tre0;

    .line 32
    .line 33
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    new-instance v4, La/a190;

    .line 38
    .line 39
    const/16 v5, 0xe

    .line 40
    .line 41
    invoke-direct {v4, v2, v5}, La/a190;-><init>(La/a8z;B)V

    .line 42
    .line 43
    .line 44
    new-instance v5, La/a190;

    .line 45
    .line 46
    invoke-direct {v5, v2, v1}, La/a190;-><init>(La/a8z;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, La/tha0;->l2:La/kiu0;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 6

    .line 1
    const v0, -0x28e49383

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/tha0;->l2:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, La/yha0;

    .line 14
    .line 15
    sget v0, La/yha0;->p:I

    .line 16
    .line 17
    invoke-virtual {p0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance v0, La/bw5;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-static {v1, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sget-object v2, La/oja0;->c:La/ugd;

    .line 29
    .line 30
    new-instance v3, La/tft;

    .line 31
    .line 32
    const/16 v4, 0x9

    .line 33
    .line 34
    invoke-direct {v3, p0, v4}, La/tft;-><init>(La/l7m0;B)V

    .line 35
    .line 36
    .line 37
    const p0, 0x6d24efac

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v3, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/16 v5, 0xa

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-direct/range {v0 .. v5}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method public final V(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/af3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, La/af3;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v1

    .line 24
    :goto_0
    const-class v0, La/wka0;

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/o5d0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, La/ze3;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object p1, v1

    .line 48
    :goto_1
    instance-of v2, p1, La/wka0;

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v1, p1

    .line 54
    :goto_2
    check-cast v1, La/wka0;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string v0, ""

    .line 63
    .line 64
    const-wide/16 v2, 0x0

    .line 65
    .line 66
    invoke-virtual {v1, p1, v0, v2, v3}, La/wka0;->a(La/i1w0;Ljava/lang/String;J)La/f6i;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, La/f6i;->i()La/fiu0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, p0, La/tha0;->k2:La/fiu0;

    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 78
    .line 79
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method
