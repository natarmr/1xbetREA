.class public final La/tn50;
.super La/q4;
.source "SourceFile"


# instance fields
.field public final f:La/p0z;

.field public final g:La/b530;


# direct methods
.method public constructor <init>(La/p0z;La/b530;)V
    .locals 2

    .line 1
    new-instance v0, La/pn20;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, La/pn20;-><init>(B)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, La/q4;-><init>(La/dtb;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/tn50;->f:La/p0z;

    .line 11
    .line 12
    iput-object p2, p0, La/tn50;->g:La/b530;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final f(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/q4;->A(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/qn50;

    .line 6
    .line 7
    invoke-virtual {p0}, La/qn50;->a()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final n(La/xhe0;I)V
    .locals 0

    .line 1
    check-cast p1, La/v46;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, La/q4;->A(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p0}, La/v46;->t(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :cond_0
    const v0, 0x7f0d037c

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, La/tn50;->f:La/p0z;

    .line 20
    .line 21
    if-ne p2, v0, :cond_1

    .line 22
    .line 23
    new-instance p0, La/v70;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p1, v1}, La/v70;-><init>(Landroid/view/View;La/p0z;)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_1
    const v0, 0x7f0d037b

    .line 33
    .line 34
    .line 35
    if-ne p2, v0, :cond_2

    .line 36
    .line 37
    new-instance p2, La/zr50;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, La/tn50;->g:La/b530;

    .line 43
    .line 44
    invoke-direct {p2, p1, v1, p0}, La/zr50;-><init>(Landroid/view/View;La/p0z;La/b530;)V

    .line 45
    .line 46
    .line 47
    return-object p2

    .line 48
    :cond_2
    new-instance p0, La/gw3;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, p1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    return-object p0
.end method
