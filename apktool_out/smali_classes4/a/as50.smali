.class public final La/as50;
.super La/q4;
.source "SourceFile"


# instance fields
.field public final f:La/ba30;


# direct methods
.method public constructor <init>(La/ba30;)V
    .locals 2

    .line 1
    new-instance v0, La/pn20;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, La/pn20;-><init>(B)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, La/q4;-><init>(La/dtb;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/as50;->f:La/ba30;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final n(La/xhe0;I)V
    .locals 3

    .line 1
    check-cast p1, La/v46;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, La/q4;->A(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, La/ct5;

    .line 8
    .line 9
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v1, La/jl40;

    .line 15
    .line 16
    const/4 v2, 0x7

    .line 17
    invoke-direct {v1, p0, p2, p1, v2}, La/jl40;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, La/v46;->t(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const v0, 0x7f0d0379

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    int-to-double v1, p1

    .line 24
    const-wide v3, 0x3feccccccccccccdL    # 0.9

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    mul-double/2addr v1, v3

    .line 30
    double-to-int p1, v1

    .line 31
    const/4 v1, -0x1

    .line 32
    invoke-direct {v0, p1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 36
    .line 37
    .line 38
    new-instance p1, La/cs50;

    .line 39
    .line 40
    iget-object p0, p0, La/as50;->f:La/ba30;

    .line 41
    .line 42
    invoke-direct {p1, p2, p0}, La/cs50;-><init>(Landroid/view/View;La/ba30;)V

    .line 43
    .line 44
    .line 45
    return-object p1
.end method
