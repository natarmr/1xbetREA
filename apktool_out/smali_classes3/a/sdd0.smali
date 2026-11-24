.class public final La/sdd0;
.super La/by5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/by5<",
        "La/hjk;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/sdd0;",
        "La/by5;",
        "La/hjk;",
        "<init>",
        "()V",
        "a/xi70",
        "captcha"
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
.field public static final i2:La/xi70;

.field public static final synthetic j2:[La/iiy;


# instance fields
.field public b2:La/hqi;

.field public final c2:La/kiu0;

.field public final d2:La/nae0;

.field public final e2:La/phf0;

.field public final f2:La/phf0;

.field public final g2:La/yzn0;

.field public final h2:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/sdd0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/captcha/databinding/DialogPushCaptchaBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "requestKey"

    .line 16
    .line 17
    const-string v5, "getRequestKey()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "pendingPushId"

    .line 25
    .line 26
    const-string v6, "getPendingPushId()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "captchaTask"

    .line 34
    .line 35
    const-string v7, "getCaptchaTask()Lorg/xplatform/captcha/api/domain/model/CaptchaTask;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    new-array v1, v1, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v1, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v1, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v1, v0

    .line 53
    .line 54
    sput-object v1, La/sdd0;->j2:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/xi70;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/sdd0;->i2:La/xi70;

    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/by5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/p7d0;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, p0, v1}, La/p7d0;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, La/f1d0;

    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    invoke-direct {v1, p0, v2}, La/f1d0;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    sget-object v2, La/wez;->b:La/wez;

    .line 17
    .line 18
    new-instance v3, La/f1d0;

    .line 19
    .line 20
    const/4 v4, 0x4

    .line 21
    invoke-direct {v3, v1, v4}, La/f1d0;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-class v2, La/udd0;

    .line 29
    .line 30
    sget-object v3, La/sre0;->a:La/tre0;

    .line 31
    .line 32
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v3, La/ync0;

    .line 37
    .line 38
    const/4 v4, 0x6

    .line 39
    invoke-direct {v3, v1, v4}, La/ync0;-><init>(La/a8z;B)V

    .line 40
    .line 41
    .line 42
    new-instance v4, La/ync0;

    .line 43
    .line 44
    const/4 v5, 0x7

    .line 45
    invoke-direct {v4, v1, v5}, La/ync0;-><init>(La/a8z;B)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, La/sdd0;->c2:La/kiu0;

    .line 53
    .line 54
    sget-object v0, La/rdd0;->a:La/rdd0;

    .line 55
    .line 56
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, La/sdd0;->d2:La/nae0;

    .line 61
    .line 62
    new-instance v0, La/phf0;

    .line 63
    .line 64
    const-string v1, "BUNDLE_REQUEST_KEY"

    .line 65
    .line 66
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, La/sdd0;->e2:La/phf0;

    .line 70
    .line 71
    new-instance v0, La/phf0;

    .line 72
    .line 73
    const-string v1, "BUNDLE_PENDING_PUSH_ID"

    .line 74
    .line 75
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, La/sdd0;->f2:La/phf0;

    .line 79
    .line 80
    new-instance v0, La/yzn0;

    .line 81
    .line 82
    const-string v1, "KEY_BUNDLE_CAPTCHA_REQUIRED"

    .line 83
    .line 84
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, La/sdd0;->g2:La/yzn0;

    .line 88
    .line 89
    const v0, 0x7f040ae3

    .line 90
    .line 91
    .line 92
    iput v0, p0, La/sdd0;->h2:I

    .line 93
    .line 94
    return-void
.end method


# virtual methods
.method public final A0()Landroid/app/Dialog;
    .locals 1

    .line 1
    iget-object p0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 7
    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final I0()La/yfu0;
    .locals 2

    .line 1
    sget-object v0, La/sdd0;->j2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/sdd0;->d2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/hjk;

    .line 16
    .line 17
    return-object p0
.end method

.method public final J0()I
    .locals 0

    .line 1
    iget p0, p0, La/sdd0;->h2:I

    .line 2
    .line 3
    return p0
.end method

.method public final K0()V
    .locals 10

    .line 1
    iget-object v0, p0, La/sdd0;->c2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/udd0;

    .line 8
    .line 9
    iget-object v0, v0, La/udd0;->c:La/qoj0;

    .line 10
    .line 11
    sget-object v1, La/lkz;->a:La/lkz;

    .line 12
    .line 13
    new-instance v2, La/jjc0;

    .line 14
    .line 15
    const/4 v8, 0x4

    .line 16
    const/4 v9, 0x6

    .line 17
    const/4 v3, 0x2

    .line 18
    const-class v5, La/sdd0;

    .line 19
    .line 20
    const-string v6, "onPushToken"

    .line 21
    .line 22
    const-string v7, "onPushToken(Ljava/lang/String;)V"

    .line 23
    .line 24
    move-object v4, p0

    .line 25
    invoke-direct/range {v2 .. v9}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 26
    .line 27
    .line 28
    invoke-static {v4}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v3, La/fxc0;

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    invoke-direct {v3, v0, p0, v2, v4}, La/fxc0;-><init>(La/gmq;La/clz;La/jjc0;La/yje;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x3

    .line 47
    invoke-static {v1, v4, v4, v3, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final L0()V
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
    const-class v1, La/tdd0;

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
    instance-of v3, v0, La/tdd0;

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
    check-cast v2, La/tdd0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    iget-object v0, v2, La/tdd0;->a:La/l6a;

    .line 56
    .line 57
    iget-object v1, v2, La/tdd0;->b:La/n4u;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v0, La/iqi;

    .line 63
    .line 64
    invoke-direct {v0, v1}, La/iqi;-><init>(La/n4u;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v0, La/iqi;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, La/n5d0;

    .line 70
    .line 71
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, La/hqi;

    .line 76
    .line 77
    iput-object v0, p0, La/sdd0;->b2:La/hqi;

    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 81
    .line 82
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final g0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/sik;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/16 v1, 0x15e

    .line 9
    .line 10
    invoke-static {v1}, La/sj3;->X(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 33
    .line 34
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const v2, 0x7f070712

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v2, 0x2

    .line 54
    mul-int/2addr v0, v2

    .line 55
    sub-int/2addr v1, v0

    .line 56
    invoke-virtual {p0}, La/sdd0;->A0()Landroid/app/Dialog;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-nez v0, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {v0, v2}, Landroid/view/Window;->addFlags(I)V

    .line 70
    .line 71
    .line 72
    const/high16 v2, 0x3f000000    # 0.5f

    .line 73
    .line 74
    invoke-virtual {v0, v2}, Landroid/view/Window;->setDimAmount(F)V

    .line 75
    .line 76
    .line 77
    const/4 v2, -0x2

    .line 78
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const v1, 0x7f08024e

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {v0, p0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 93
    .line 94
    .line 95
    :cond_1
    :goto_0
    return-void
.end method
