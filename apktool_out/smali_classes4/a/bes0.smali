.class public final La/bes0;
.super La/v46;
.source "SourceFile"


# instance fields
.field public final u:La/dsx;


# direct methods
.method public constructor <init>(La/dsx;)V
    .locals 1

    .line 1
    iget-object v0, p1, La/dsx;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 2
    .line 3
    invoke-direct {p0, v0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/bes0;->u:La/dsx;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final t(Ljava/lang/Object;)V
    .locals 9

    .line 1
    check-cast p1, La/aes0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/bes0;->u:La/dsx;

    .line 7
    .line 8
    iget-object p0, p0, La/dsx;->c:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 9
    .line 10
    new-instance v0, La/nrv;

    .line 11
    .line 12
    iget-object v1, p1, La/aes0;->a:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    const/16 v8, 0xfe

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    invoke-direct/range {v0 .. v8}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
