.class public final La/uia0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/uia0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/rl70",
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
.field public static final n2:La/rl70;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public k2:La/fiu0;

.field public final l2:La/kiu0;

.field public final m2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/uia0;

    .line 4
    .line 5
    const-string v2, "teamId"

    .line 6
    .line 7
    const-string v3, "getTeamId()Ljava/lang/String;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/uia0;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/rl70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/uia0;->n2:La/rl70;

    .line 26
    .line 27
    return-void
.end method

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
    const/16 v1, 0x14

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, La/l3a0;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance v2, La/wz80;

    .line 12
    .line 13
    const/16 v3, 0x13

    .line 14
    .line 15
    invoke-direct {v2, p0, v3}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    sget-object v4, La/wez;->b:La/wez;

    .line 19
    .line 20
    new-instance v5, La/wz80;

    .line 21
    .line 22
    invoke-direct {v5, v2, v1}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {v4, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-class v2, La/zia0;

    .line 30
    .line 31
    sget-object v4, La/sre0;->a:La/tre0;

    .line 32
    .line 33
    invoke-virtual {v4, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v4, La/a190;

    .line 38
    .line 39
    const/16 v5, 0x12

    .line 40
    .line 41
    invoke-direct {v4, v1, v5}, La/a190;-><init>(La/a8z;B)V

    .line 42
    .line 43
    .line 44
    new-instance v5, La/a190;

    .line 45
    .line 46
    invoke-direct {v5, v1, v3}, La/a190;-><init>(La/a8z;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0, v2, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, La/uia0;->l2:La/kiu0;

    .line 54
    .line 55
    new-instance v0, La/phf0;

    .line 56
    .line 57
    const-string v1, "TEAM_ID_KEY"

    .line 58
    .line 59
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, La/uia0;->m2:La/phf0;

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 6

    .line 1
    const v0, -0x351d53d7    # -7427604.5f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/uia0;->l2:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, La/zia0;

    .line 14
    .line 15
    sget v0, La/zia0;->r:I

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
    sget-object v2, La/ro4;->f:La/ugd;

    .line 29
    .line 30
    new-instance v3, La/tft;

    .line 31
    .line 32
    const/16 v4, 0xa

    .line 33
    .line 34
    invoke-direct {v3, p0, v4}, La/tft;-><init>(La/l7m0;B)V

    .line 35
    .line 36
    .line 37
    const p0, -0x7169b3e8

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
    .locals 8

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
    const-class v0, La/fma0;

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
    instance-of v2, p1, La/fma0;

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
    move-object v2, v1

    .line 55
    check-cast v2, La/fma0;

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    sget-object p1, La/uia0;->o2:[La/iiy;

    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    aget-object p1, p1, v0

    .line 67
    .line 68
    iget-object v0, p0, La/uia0;->m2:La/phf0;

    .line 69
    .line 70
    invoke-virtual {v0, p0, p1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    const-wide/16 v3, 0x0

    .line 75
    .line 76
    const-string v6, ""

    .line 77
    .line 78
    invoke-virtual/range {v2 .. v7}, La/fma0;->a(JLa/i1w0;Ljava/lang/String;Ljava/lang/String;)La/f6i;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, La/f6i;->i()La/fiu0;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, La/uia0;->k2:La/fiu0;

    .line 87
    .line 88
    return-void

    .line 89
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 90
    .line 91
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method
