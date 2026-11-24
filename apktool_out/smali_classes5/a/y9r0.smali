.class public final La/y9r0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/y9r0;",
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
.field public static final m2:Ljava/lang/String;


# instance fields
.field public k2:La/fiu0;

.field public final l2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, La/v9r0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, La/y9r0;->m2:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, La/lar0;

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
    new-instance v1, La/x9r0;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, v2}, La/x9r0;-><init>(La/y9r0;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/y9r0;->l2:La/a8z;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    const v1, -0x38b30bc7

    .line 6
    .line 7
    .line 8
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, La/y9r0;->l2:La/a8z;

    .line 12
    .line 13
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, La/k3t0;

    .line 18
    .line 19
    check-cast v1, La/i3t0;

    .line 20
    .line 21
    invoke-virtual {v1, v3}, La/i3t0;->y(La/fet;)La/pz40;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-virtual {v3, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const/4 v7, 0x1

    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    sget-object v1, La/ukd;->a:La/cl5;

    .line 37
    .line 38
    if-ne v2, v1, :cond_1

    .line 39
    .line 40
    :cond_0
    new-instance v2, La/x9r0;

    .line 41
    .line 42
    invoke-direct {v2, v0, v7}, La/x9r0;-><init>(La/y9r0;B)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    move-object v0, v2

    .line 49
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    const/4 v5, 0x6

    .line 53
    const/4 v1, 0x0

    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-static/range {v0 .. v5}, La/v3c;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 56
    .line 57
    .line 58
    new-instance v8, La/bw5;

    .line 59
    .line 60
    invoke-static {v7, v3}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    const-wide/16 v14, 0x0

    .line 65
    .line 66
    const/16 v16, 0x3e

    .line 67
    .line 68
    const/4 v10, 0x0

    .line 69
    const/4 v11, 0x0

    .line 70
    const/4 v12, 0x0

    .line 71
    const/4 v13, 0x0

    .line 72
    invoke-static/range {v9 .. v16}, La/cw5;->a(La/cw5;ZZZLa/lel;JI)La/cw5;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    sget-object v10, La/cwr0;->f:La/ugd;

    .line 77
    .line 78
    new-instance v0, La/tft;

    .line 79
    .line 80
    const/16 v1, 0x1d

    .line 81
    .line 82
    invoke-direct {v0, v6, v1}, La/tft;-><init>(La/l7m0;B)V

    .line 83
    .line 84
    .line 85
    const v1, -0x7164e196

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v0, v3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 89
    .line 90
    .line 91
    move-result-object v12

    .line 92
    const/16 v13, 0xa

    .line 93
    .line 94
    const/4 v11, 0x0

    .line 95
    invoke-direct/range {v8 .. v13}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 96
    .line 97
    .line 98
    const/4 v0, 0x0

    .line 99
    invoke-virtual {v3, v0}, La/fet;->r(Z)V

    .line 100
    .line 101
    .line 102
    return-object v8
.end method

.method public final V(Landroid/content/Context;)V
    .locals 3

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
    const-class v0, La/z9r0;

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
    instance-of v2, p1, La/z9r0;

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
    check-cast v1, La/z9r0;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    iget-object p1, v1, La/z9r0;->a:La/cad;

    .line 59
    .line 60
    iget-object v0, v1, La/z9r0;->b:La/k3r0;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v1, La/nr;

    .line 66
    .line 67
    invoke-direct {v1, p1, v0}, La/nr;-><init>(La/cad;La/k3r0;)V

    .line 68
    .line 69
    .line 70
    new-instance p1, La/fiu0;

    .line 71
    .line 72
    iget-object v0, v1, La/nr;->d:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, La/xvi;

    .line 75
    .line 76
    const-class v1, La/lar0;

    .line 77
    .line 78
    invoke-static {v1, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-direct {p1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, La/y9r0;->k2:La/fiu0;

    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 89
    .line 90
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public final e0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/iw5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 10
    .line 11
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v0, 0x3

    .line 16
    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
