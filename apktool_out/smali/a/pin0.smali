.class public final La/pin0;
.super Landroid/view/ActionMode;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:La/xj;


# direct methods
.method public constructor <init>(Landroid/content/Context;La/xj;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/pin0;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, La/pin0;->b:La/xj;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 0

    .line 1
    iget-object p0, p0, La/pin0;->b:La/xj;

    .line 2
    .line 3
    invoke-virtual {p0}, La/xj;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getCustomView()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, La/pin0;->b:La/xj;

    .line 2
    .line 3
    invoke-virtual {p0}, La/xj;->d()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getMenu()Landroid/view/Menu;
    .locals 2

    .line 1
    new-instance v0, La/k340;

    .line 2
    .line 3
    iget-object v1, p0, La/pin0;->b:La/xj;

    .line 4
    .line 5
    invoke-virtual {v1}, La/xj;->g()La/ox30;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object p0, p0, La/pin0;->a:Landroid/content/Context;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, La/k340;-><init>(Landroid/content/Context;La/ox30;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 0

    .line 1
    iget-object p0, p0, La/pin0;->b:La/xj;

    .line 2
    .line 3
    invoke-virtual {p0}, La/xj;->h()Landroid/view/MenuInflater;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getSubtitle()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, La/pin0;->b:La/xj;

    .line 2
    .line 3
    invoke-virtual {p0}, La/xj;->i()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getTag()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/pin0;->b:La/xj;

    .line 2
    .line 3
    iget-object p0, p0, La/xj;->c:Ljava/lang/Object;

    .line 4
    .line 5
    return-object p0
.end method

.method public final getTitle()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, La/pin0;->b:La/xj;

    .line 2
    .line 3
    invoke-virtual {p0}, La/xj;->j()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getTitleOptionalHint()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/pin0;->b:La/xj;

    .line 2
    .line 3
    iget-boolean p0, p0, La/xj;->b:Z

    .line 4
    .line 5
    return p0
.end method

.method public final invalidate()V
    .locals 0

    .line 1
    iget-object p0, p0, La/pin0;->b:La/xj;

    .line 2
    .line 3
    invoke-virtual {p0}, La/xj;->k()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final isTitleOptional()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/pin0;->b:La/xj;

    .line 2
    .line 3
    invoke-virtual {p0}, La/xj;->l()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final setCustomView(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/pin0;->b:La/xj;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/xj;->n(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setSubtitle(I)V
    .locals 0

    .line 7
    iget-object p0, p0, La/pin0;->b:La/xj;

    invoke-virtual {p0, p1}, La/xj;->o(I)V

    return-void
.end method

.method public final setSubtitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/pin0;->b:La/xj;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/xj;->p(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setTag(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/pin0;->b:La/xj;

    .line 2
    .line 3
    iput-object p1, p0, La/xj;->c:Ljava/lang/Object;

    .line 4
    .line 5
    return-void
.end method

.method public final setTitle(I)V
    .locals 0

    .line 7
    iget-object p0, p0, La/pin0;->b:La/xj;

    invoke-virtual {p0, p1}, La/xj;->q(I)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/pin0;->b:La/xj;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/xj;->r(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setTitleOptionalHint(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/pin0;->b:La/xj;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/xj;->s(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
