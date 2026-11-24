.class public final La/a6d0;
.super La/ix5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/a6d0;",
        "La/ix5;",
        "<init>",
        "()V",
        "a/jh70",
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
.field public static final f2:La/jh70;

.field public static final synthetic g2:[La/iiy;


# instance fields
.field public final d2:La/nae0;

.field public final e2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/a6d0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/proxy/impl/databinding/DialogProxyCheckingBinding;"

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
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/a6d0;->g2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/jh70;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/a6d0;->f2:La/jh70;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/ix5;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/z5d0;->a:La/z5d0;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/a6d0;->d2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/phf0;

    .line 13
    .line 14
    const-string v1, "REQUEST_KEY"

    .line 15
    .line 16
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, La/a6d0;->e2:La/phf0;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final J0()La/yfu0;
    .locals 2

    .line 1
    sget-object v0, La/a6d0;->g2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/a6d0;->d2:La/nae0;

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
    check-cast p0, La/gjk;

    .line 16
    .line 17
    return-object p0
.end method

.method public final L0()I
    .locals 0

    .line 1
    const p0, 0x7f1405ad

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final M0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, La/sik;->E0(Z)V

    .line 3
    .line 4
    .line 5
    sget-object v1, La/a6d0;->g2:[La/iiy;

    .line 6
    .line 7
    aget-object v0, v1, v0

    .line 8
    .line 9
    iget-object v1, p0, La/a6d0;->d2:La/nae0;

    .line 10
    .line 11
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast v0, La/gjk;

    .line 19
    .line 20
    iget-object v0, v0, La/gjk;->b:Lcom/google/android/material/button/MaterialButton;

    .line 21
    .line 22
    new-instance v1, La/l910;

    .line 23
    .line 24
    const/16 v2, 0x19

    .line 25
    .line 26
    invoke-direct {v1, p0, v2}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final S0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/a6d0;->g2:[La/iiy;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    iget-object v1, p0, La/a6d0;->e2:La/phf0;

    .line 10
    .line 11
    invoke-virtual {v1, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-super {p0, p1}, La/ix5;->onDismiss(Landroid/content/DialogInterface;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
