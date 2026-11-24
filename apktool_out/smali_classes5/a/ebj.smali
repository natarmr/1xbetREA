.class public final La/ebj;
.super La/stl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/lik;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/ebj;",
        "La/stl;",
        "La/lik;",
        "<init>",
        "()V",
        "a/usd",
        "core"
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
.field public static final i2:La/usd;

.field public static final synthetic j2:[La/iiy;


# instance fields
.field public final g2:La/nae0;

.field public final h2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ebj;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/registration/core/databinding/DialogDataRetrievalErrorBinding;"

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
    const-string v3, "errorMessage"

    .line 16
    .line 17
    const-string v5, "getErrorMessage()Ljava/lang/String;"

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
    sput-object v1, La/ebj;->j2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/usd;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/ebj;->i2:La/usd;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/stl;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/dbj;->a:La/dbj;

    .line 5
    .line 6
    new-instance v1, La/pmi;

    .line 7
    .line 8
    invoke-direct {v1, p0, v0}, La/pmi;-><init>(La/stl;Lkotlin/jvm/functions/Function1;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, La/ebj;->g2:La/nae0;

    .line 12
    .line 13
    new-instance v0, La/phf0;

    .line 14
    .line 15
    const-string v1, "ERROR_MESSAGE_KEY"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/ebj;->h2:La/phf0;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final Q0()La/yfu0;
    .locals 2

    .line 1
    sget-object v0, La/ebj;->j2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ebj;->g2:La/nae0;

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
    check-cast p0, La/lik;

    .line 16
    .line 17
    return-object p0
.end method

.method public final S0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, La/ebj;->j2:[La/iiy;

    .line 3
    .line 4
    aget-object v0, v1, v0

    .line 5
    .line 6
    iget-object v2, p0, La/ebj;->g2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v2, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v0, La/lik;

    .line 16
    .line 17
    iget-object v0, v0, La/lik;->b:Landroid/widget/TextView;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    aget-object v1, v1, v2

    .line 21
    .line 22
    iget-object v2, p0, La/ebj;->h2:La/phf0;

    .line 23
    .line 24
    invoke-virtual {v2, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
