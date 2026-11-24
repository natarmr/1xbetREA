.class public final La/ci30;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# instance fields
.field public final synthetic g1:I

.field public final synthetic h1:Lcom/google/android/material/datepicker/e;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/e;Landroid/content/Context;II)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ci30;->h1:Lcom/google/android/material/datepicker/e;

    .line 2
    .line 3
    iput p4, p0, La/ci30;->g1:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p2, p3, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final R0(Landroidx/recyclerview/widget/RecyclerView;La/the0;I)V
    .locals 1

    .line 1
    new-instance p2, La/jva;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p2, p1, v0}, La/jva;-><init>(Landroid/content/Context;B)V

    .line 9
    .line 10
    .line 11
    iput p3, p2, La/she0;->a:I

    .line 12
    .line 13
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/b;->S0(La/she0;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final U0(La/the0;[I)V
    .locals 3

    .line 1
    iget-object p1, p0, La/ci30;->h1:Lcom/google/android/material/datepicker/e;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/google/android/material/datepicker/e;->O1:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    iget p0, p0, La/ci30;->g1:I

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    aput p0, p2, v2

    .line 16
    .line 17
    iget-object p0, p1, Lcom/google/android/material/datepicker/e;->O1:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    aput p0, p2, v1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    aput p0, p2, v2

    .line 31
    .line 32
    iget-object p0, p1, Lcom/google/android/material/datepicker/e;->O1:Landroidx/recyclerview/widget/RecyclerView;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    aput p0, p2, v1

    .line 39
    .line 40
    return-void
.end method
