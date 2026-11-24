.class public final La/w7u0;
.super La/qw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/qw5<",
        "La/x7u0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/w7u0;",
        "La/qw5;",
        "La/x7u0;",
        "<init>",
        "()V",
        "a/svs0",
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
.field public static final e2:La/svs0;

.field public static final synthetic f2:[La/iiy;


# instance fields
.field public final b2:La/nae0;

.field public c2:La/vyi;

.field public final d2:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/w7u0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/verification/status/impl/databinding/VerificationNotifyDialogBinding;"

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
    sput-object v1, La/w7u0;->f2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/svs0;

    .line 21
    .line 22
    const/4 v1, 0x7

    .line 23
    invoke-direct {v0, v1}, La/svs0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/w7u0;->e2:La/svs0;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/qw5;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/v7u0;->a:La/v7u0;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/w7u0;->b2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/rbt0;

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    invoke-direct {v0, p0, v1}, La/rbt0;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    new-instance v1, La/cvs0;

    .line 20
    .line 21
    const/16 v2, 0xb

    .line 22
    .line 23
    invoke-direct {v1, p0, v2}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    sget-object v2, La/wez;->b:La/wez;

    .line 27
    .line 28
    new-instance v3, La/cvs0;

    .line 29
    .line 30
    const/16 v4, 0xc

    .line 31
    .line 32
    invoke-direct {v3, v1, v4}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-class v2, La/z7u0;

    .line 40
    .line 41
    sget-object v3, La/sre0;->a:La/tre0;

    .line 42
    .line 43
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    new-instance v3, La/w6u0;

    .line 48
    .line 49
    const/4 v4, 0x2

    .line 50
    invoke-direct {v3, v1, v4}, La/w6u0;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    new-instance v4, La/w6u0;

    .line 54
    .line 55
    const/4 v5, 0x3

    .line 56
    invoke-direct {v4, v1, v5}, La/w6u0;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/w7u0;->d2:La/kiu0;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040ae3

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final bridge synthetic J0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/w7u0;->Q0()La/x7u0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final M0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/w7u0;->Q0()La/x7u0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/x7u0;->d:Lcom/google/android/material/button/MaterialButton;

    .line 6
    .line 7
    new-instance v1, La/u7u0;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, v2}, La/u7u0;-><init>(La/w7u0;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/w7u0;->Q0()La/x7u0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v0, v0, La/x7u0;->c:Lcom/google/android/material/button/MaterialButton;

    .line 21
    .line 22
    new-instance v1, La/u7u0;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v1, p0, v2}, La/u7u0;-><init>(La/w7u0;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final N0()V
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
    const-class v1, La/y7u0;

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
    instance-of v3, v0, La/y7u0;

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
    check-cast v2, La/y7u0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    iget-object v0, v2, La/y7u0;->a:La/r9u;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance v1, La/iqi;

    .line 61
    .line 62
    invoke-direct {v1, v0}, La/iqi;-><init>(La/r9u;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, v1, La/iqi;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, La/n5d0;

    .line 68
    .line 69
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, La/vyi;

    .line 74
    .line 75
    iput-object v0, p0, La/w7u0;->c2:La/vyi;

    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 79
    .line 80
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final O0()I
    .locals 0

    .line 1
    invoke-virtual {p0}, La/w7u0;->Q0()La/x7u0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/x7u0;->b:Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final P0()Ljava/lang/String;
    .locals 1

    .line 1
    const v0, 0x7f131767

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final Q0()La/x7u0;
    .locals 2

    .line 1
    sget-object v0, La/w7u0;->f2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/w7u0;->b2:La/nae0;

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
    check-cast p0, La/x7u0;

    .line 16
    .line 17
    return-object p0
.end method
