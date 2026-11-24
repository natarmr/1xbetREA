.class public final La/al10;
.super La/bn70;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/al10;",
        "La/bn70;",
        "<init>",
        "()V",
        "lucky_wheel"
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
.field public static final Z1:[I


# instance fields
.field public final U1:La/e9o0;

.field public final V1:La/inm0;

.field public W1:La/i6i;

.field public final X1:La/kiu0;

.field public final Y1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const v0, 0x7f0a0ad6

    .line 2
    .line 3
    .line 4
    const v1, 0x7f0a0ad5

    .line 5
    .line 6
    .line 7
    const v2, 0x7f0a064e

    .line 8
    .line 9
    .line 10
    filled-new-array {v2, v0, v1}, [I

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, La/al10;->Z1:[I

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/bn70;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/e9o0;

    .line 5
    .line 6
    const v1, 0x7f040b22

    .line 7
    .line 8
    .line 9
    sget-object v2, La/bp3;->b:La/bp3;

    .line 10
    .line 11
    const v3, 0x7f040b5d

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v3, v1, v2, v2}, La/e9o0;-><init>(IILa/bp3;La/bp3;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/al10;->U1:La/e9o0;

    .line 18
    .line 19
    sget-object v0, La/inm0;->a:La/inm0;

    .line 20
    .line 21
    iput-object v0, p0, La/al10;->V1:La/inm0;

    .line 22
    .line 23
    new-instance v0, La/zk10;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p0, v1}, La/zk10;-><init>(La/al10;B)V

    .line 27
    .line 28
    .line 29
    new-instance v1, La/be00;

    .line 30
    .line 31
    const/16 v2, 0x12

    .line 32
    .line 33
    invoke-direct {v1, p0, v2}, La/be00;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    sget-object v2, La/wez;->b:La/wez;

    .line 37
    .line 38
    new-instance v3, La/be00;

    .line 39
    .line 40
    const/16 v4, 0x13

    .line 41
    .line 42
    invoke-direct {v3, v1, v4}, La/be00;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-class v2, La/to70;

    .line 50
    .line 51
    sget-object v3, La/sre0;->a:La/tre0;

    .line 52
    .line 53
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    new-instance v3, La/j210;

    .line 58
    .line 59
    const/16 v4, 0xa

    .line 60
    .line 61
    invoke-direct {v3, v1, v4}, La/j210;-><init>(La/a8z;B)V

    .line 62
    .line 63
    .line 64
    new-instance v4, La/j210;

    .line 65
    .line 66
    const/16 v5, 0xb

    .line 67
    .line 68
    invoke-direct {v4, v1, v5}, La/j210;-><init>(La/a8z;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/al10;->X1:La/kiu0;

    .line 76
    .line 77
    new-instance v0, La/zk10;

    .line 78
    .line 79
    const/4 v1, 0x1

    .line 80
    invoke-direct {v0, p0, v1}, La/zk10;-><init>(La/al10;B)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iput-object v0, p0, La/al10;->Y1:La/n0o0;

    .line 88
    .line 89
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/al10;->Y1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/pki;

    .line 8
    .line 9
    iget-object v2, v1, La/pki;->a:La/g8i;

    .line 10
    .line 11
    invoke-virtual {v2}, La/g8i;->j()La/ii;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iput-object v2, p0, La/bn70;->N1:La/ii;

    .line 16
    .line 17
    iget-object v1, v1, La/pki;->c0:La/n5d0;

    .line 18
    .line 19
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, La/i6i;

    .line 24
    .line 25
    iput-object v1, p0, La/al10;->W1:La/i6i;

    .line 26
    .line 27
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/pki;

    .line 32
    .line 33
    iget-object v0, v0, La/pki;->e:La/pki;

    .line 34
    .line 35
    new-instance v1, La/mki;

    .line 36
    .line 37
    invoke-direct {v1, v0}, La/mki;-><init>(La/pki;)V

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, La/bn70;->L1:La/h5t;

    .line 41
    .line 42
    return-void
.end method

.method public final G0(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final H0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final J0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final M0()Landroidx/fragment/app/Fragment;
    .locals 0

    .line 1
    new-instance p0, La/fm10;

    .line 2
    .line 3
    invoke-direct {p0}, La/fm10;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final N0(Landroidx/appcompat/widget/AppCompatImageView;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final O0(Landroidx/appcompat/widget/AppCompatImageView;La/km60;)V
    .locals 11

    .line 1
    if-eqz p2, :cond_4

    .line 2
    .line 3
    iget-boolean p2, p2, La/km60;->a:Z

    .line 4
    .line 5
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    const-string v0, "/NewYear"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, ""

    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v2, 0x1e

    .line 21
    .line 22
    if-lt v1, v2, :cond_1

    .line 23
    .line 24
    const-class v1, Landroid/view/WindowManager;

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Landroid/view/WindowManager;

    .line 31
    .line 32
    invoke-static {p0}, La/zhv0;->g(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {p0}, La/tmb0;->h(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    iget p0, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 57
    .line 58
    :goto_1
    const/16 v1, 0x438

    .line 59
    .line 60
    if-ge p0, v1, :cond_2

    .line 61
    .line 62
    const-string p0, "/small"

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    const-string p0, "/large"

    .line 66
    .line 67
    :goto_2
    const-string v1, "/static/img/android/games/resforgames/luckywheel"

    .line 68
    .line 69
    const-string v2, "/background.webp"

    .line 70
    .line 71
    invoke-static {v1, v0, p0, v2}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    if-eqz p2, :cond_3

    .line 76
    .line 77
    const p0, 0x7f080596

    .line 78
    .line 79
    .line 80
    :goto_3
    move v5, p0

    .line 81
    goto :goto_4

    .line 82
    :cond_3
    const p0, 0x7f080597

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :goto_4
    const/4 v9, 0x0

    .line 87
    const/16 v10, 0x1fc

    .line 88
    .line 89
    const/4 v6, 0x0

    .line 90
    const/4 v7, 0x0

    .line 91
    const/4 v8, 0x0

    .line 92
    move-object v3, p1

    .line 93
    invoke-static/range {v3 .. v10}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 94
    .line 95
    .line 96
    :cond_4
    return-void
.end method

.method public final P0()La/e9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/al10;->U1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Q0()La/to70;
    .locals 0

    .line 1
    iget-object p0, p0, La/al10;->X1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/to70;

    .line 8
    .line 9
    return-object p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/bn70;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    new-instance p0, La/hny;

    .line 8
    .line 9
    const/16 p2, 0x8

    .line 10
    .line 11
    invoke-direct {p0, p2}, La/hny;-><init>(B)V

    .line 12
    .line 13
    .line 14
    sget-object p2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 15
    .line 16
    invoke-static {p1, p0}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/al10;->V1:La/inm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/al10;->U1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
