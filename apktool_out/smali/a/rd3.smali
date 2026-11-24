.class public La/rd3;
.super La/hgd;
.source "SourceFile"

# interfaces
.implements La/bd3;


# instance fields
.field public e:La/pd3;

.field public final f:La/qd3;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const v1, 0x7f0402a4

    .line 3
    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    new-instance v2, Landroid/util/TypedValue;

    .line 8
    .line 9
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3, v1, v2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 17
    .line 18
    .line 19
    iget v2, v2, Landroid/util/TypedValue;->resourceId:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, p2

    .line 23
    :goto_0
    invoke-direct {p0, p1, v2}, La/hgd;-><init>(Landroid/content/Context;I)V

    .line 24
    .line 25
    .line 26
    new-instance v2, La/qd3;

    .line 27
    .line 28
    invoke-direct {v2, p0}, La/qd3;-><init>(La/rd3;)V

    .line 29
    .line 30
    .line 31
    iput-object v2, p0, La/rd3;->f:La/qd3;

    .line 32
    .line 33
    invoke-virtual {p0}, La/rd3;->e()La/hd3;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-nez p2, :cond_1

    .line 38
    .line 39
    new-instance p2, Landroid/util/TypedValue;

    .line 40
    .line 41
    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1, v1, p2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 49
    .line 50
    .line 51
    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    .line 52
    .line 53
    :cond_1
    move-object p1, p0

    .line 54
    check-cast p1, La/pd3;

    .line 55
    .line 56
    iput p2, p1, La/pd3;->s1:I

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    invoke-virtual {p0, p1}, La/hd3;->q(Landroid/os/Bundle;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/hgd;->c()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/rd3;->e()La/hd3;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1, p2}, La/hd3;->c(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final dismiss()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/rd3;->e()La/hd3;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, La/hd3;->r()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, La/rd3;->f:La/qd3;

    .line 10
    .line 11
    invoke-static {v1, v0, p0, p1}, La/m7x;->C(La/hky;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final e()La/hd3;
    .locals 3

    .line 1
    iget-object v0, p0, La/rd3;->e:La/pd3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, La/hd3;->a:La/gd3;

    .line 6
    .line 7
    new-instance v0, La/pd3;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v0, v1, v2, p0, p0}, La/pd3;-><init>(Landroid/content/Context;Landroid/view/Window;La/bd3;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/rd3;->e:La/pd3;

    .line 21
    .line 22
    :cond_0
    return-object v0
.end method

.method public final f(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/rd3;->e()La/hd3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, La/hd3;->h(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final invalidateOptionsMenu()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/rd3;->e()La/hd3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/hd3;->n()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/rd3;->e()La/hd3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/hd3;->m()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, La/hgd;->onCreate(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La/rd3;->e()La/hd3;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0, p1}, La/hd3;->q(Landroid/os/Bundle;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onStop()V
    .locals 0

    .line 1
    invoke-super {p0}, La/hgd;->onStop()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/rd3;->e()La/hd3;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, La/hd3;->w()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/hgd;->c()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/rd3;->e()La/hd3;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, La/hd3;->z(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 12
    invoke-virtual {p0}, La/hgd;->c()V

    .line 13
    invoke-virtual {p0}, La/rd3;->e()La/hd3;

    move-result-object p0

    invoke-virtual {p0, p1}, La/hd3;->A(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 14
    invoke-virtual {p0}, La/hgd;->c()V

    .line 15
    invoke-virtual {p0}, La/rd3;->e()La/hd3;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, La/hd3;->B(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/rd3;->e()La/hd3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, La/hd3;->D(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 20
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 21
    invoke-virtual {p0}, La/rd3;->e()La/hd3;

    move-result-object p0

    invoke-virtual {p0, p1}, La/hd3;->D(Ljava/lang/CharSequence;)V

    return-void
.end method
