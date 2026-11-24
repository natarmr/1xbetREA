.class public final La/qsq0;
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
    iput-object p1, p0, La/qsq0;->u:La/dsx;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge synthetic t(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, La/lfs0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/qsq0;->u(La/lfs0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final u(La/lfs0;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/qsq0;->u:La/dsx;

    .line 5
    .line 6
    iget-object p1, p0, La/dsx;->c:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 7
    .line 8
    new-instance v0, La/nrv;

    .line 9
    .line 10
    iget-object p0, p0, La/dsx;->b:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const v1, 0x7f131681

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    const/16 v8, 0xfe

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    invoke-direct/range {v0 .. v8}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
