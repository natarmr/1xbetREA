.class public final La/tgs0;
.super La/v46;
.source "SourceFile"

# interfaces
.implements La/czx;


# instance fields
.field public final u:La/nq8;


# direct methods
.method public constructor <init>(La/nq8;)V
    .locals 1

    .line 1
    iget-object v0, p1, La/nq8;->b:Landroid/view/View;

    .line 2
    .line 3
    check-cast v0, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;

    .line 4
    .line 5
    invoke-direct {p0, v0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, La/tgs0;->u:La/nq8;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(ZZ)V
    .locals 2

    .line 1
    iget-object p0, p0, La/tgs0;->u:La/nq8;

    .line 2
    .line 3
    iget-object p0, p0, La/nq8;->c:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;

    .line 6
    .line 7
    iget-object v0, p0, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;->a:La/uk5;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    const p1, 0x7f080ef3

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-eqz p1, :cond_1

    .line 18
    .line 19
    if-nez p2, :cond_1

    .line 20
    .line 21
    const p1, 0x7f080532

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    if-nez p1, :cond_2

    .line 26
    .line 27
    if-eqz p2, :cond_2

    .line 28
    .line 29
    const p1, 0x7f080d32

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const p1, 0x7f080eab

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v1, v0, La/uk5;->b:Landroid/view/ViewGroup;

    .line 37
    .line 38
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p1, p0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {v1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, v0, La/uk5;->f:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 54
    .line 55
    if-nez p2, :cond_3

    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    const/16 p1, 0x8

    .line 60
    .line 61
    :goto_1
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final bridge synthetic t(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, La/ogs0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/tgs0;->u(La/ogs0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final u(La/ogs0;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/tgs0;->u:La/nq8;

    .line 5
    .line 6
    iget-object p0, p0, La/nq8;->c:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;

    .line 9
    .line 10
    sget-object v0, La/rdj;->a:La/rdj;

    .line 11
    .line 12
    iget-boolean v0, p1, La/ogs0;->l:Z

    .line 13
    .line 14
    iget-wide v1, p1, La/ogs0;->b:J

    .line 15
    .line 16
    sget-object v3, La/ykq0;->c:La/ykq0;

    .line 17
    .line 18
    new-instance v4, La/znq0;

    .line 19
    .line 20
    invoke-direct {v4, v1, v2}, La/znq0;-><init>(J)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v1, 0x0

    .line 28
    const/16 v2, 0xf8

    .line 29
    .line 30
    invoke-static {v4, v3, v0, v1, v2}, La/rdj;->h(La/aoq0;La/ykq0;Ljava/lang/Boolean;Ljava/util/TimeZone;I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0, v0}, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;->setTransactionDate(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget v0, p1, La/ogs0;->d:I

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;->setTransactionIcon(I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p1, La/ogs0;->f:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;->setTransactionDescription(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p1, La/ogs0;->e:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;->setAmountText(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget p1, p1, La/ogs0;->c:I

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionCell;->setAmountColor(I)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
