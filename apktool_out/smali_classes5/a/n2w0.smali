.class public final La/n2w0;
.super La/by5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/by5<",
        "La/eun;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/n2w0;",
        "La/by5;",
        "La/eun;",
        "<init>",
        "()V",
        "a/bzs0",
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
.field public static final h2:La/bzs0;

.field public static final synthetic i2:[La/iiy;


# instance fields
.field public final b2:La/nae0;

.field public c2:La/sje;

.field public d2:Z

.field public final e2:La/ywq;

.field public f2:La/afm0;

.field public g2:La/mne;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/n2w0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/ui_core/databinding/EmptyFrameLayoutBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/n2w0;->i2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/bzs0;

    .line 21
    .line 22
    const/16 v1, 0x12

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/bzs0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/n2w0;->h2:La/bzs0;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/by5;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/l2w0;->a:La/l2w0;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/n2w0;->b2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/gvt0;

    .line 13
    .line 14
    invoke-direct {v0}, La/gvt0;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/yl3;

    .line 18
    .line 19
    const/16 v2, 0xe

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, La/yl3;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/n2w0;->e2:La/ywq;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final I0()La/yfu0;
    .locals 2

    .line 1
    sget-object v0, La/n2w0;->i2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/n2w0;->b2:La/nae0;

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
    check-cast p0, La/eun;

    .line 16
    .line 17
    return-object p0
.end method

.method public final K0()V
    .locals 1

    .line 1
    iget-object p0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
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
    const-class v1, La/hhk0;

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
    instance-of v3, v0, La/hhk0;

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
    check-cast v2, La/hhk0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-virtual {v2}, La/hhk0;->a()La/khf0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v1, La/afm0;

    .line 60
    .line 61
    iget-object v2, v0, La/khf0;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, La/azj0;

    .line 64
    .line 65
    invoke-direct {v1, v2}, La/afm0;-><init>(La/azj0;)V

    .line 66
    .line 67
    .line 68
    iput-object v1, p0, La/n2w0;->f2:La/afm0;

    .line 69
    .line 70
    iget-object v0, v0, La/khf0;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, La/mne;

    .line 73
    .line 74
    iput-object v0, p0, La/n2w0;->g2:La/mne;

    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 78
    .line 79
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

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

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/by5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const-string v0, "HAS_BEEN_CREATED"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p1, p0, La/n2w0;->e2:La/ywq;

    .line 16
    .line 17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, La/ywq;->a(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, La/n2w0;->d2:Z

    .line 24
    .line 25
    return-void
.end method

.method public final Y()V
    .locals 2

    .line 1
    iget-object v0, p0, La/n2w0;->c2:La/sje;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-static {v0, v1}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, La/n2w0;->c2:La/sje;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 13
    .line 14
    return-void
.end method

.method public final f0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "HAS_BEEN_CREATED"

    .line 2
    .line 3
    iget-boolean v1, p0, La/n2w0;->d2:Z

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, La/sik;->f0(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
