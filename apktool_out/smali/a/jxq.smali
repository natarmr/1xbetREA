.class public final La/jxq;
.super La/vbc;
.source "SourceFile"

# interfaces
.implements La/zg60;
.implements La/riu0;
.implements La/kg60;
.implements La/i0h0;
.implements La/h2r;


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:Landroid/content/Context;

.field public final c:Landroid/os/Handler;

.field public final d:La/v1r;

.field public final synthetic e:La/kxq;


# direct methods
.method public constructor <init>(La/kxq;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jxq;->e:La/kxq;

    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La/jxq;->a:Landroid/app/Activity;

    .line 12
    .line 13
    iput-object p1, p0, La/jxq;->b:Landroid/content/Context;

    .line 14
    .line 15
    iput-object v0, p0, La/jxq;->c:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance p1, La/v1r;

    .line 18
    .line 19
    invoke-direct {p1}, Landroidx/fragment/app/e;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/jxq;->d:La/v1r;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/e;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b0(I)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, La/jxq;->e:La/kxq;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final c0()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/jxq;->e:La/kxq;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final e(La/sbe;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/jxq;->e:La/kxq;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/agd;->e(La/sbe;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g()La/piu0;
    .locals 0

    .line 1
    iget-object p0, p0, La/jxq;->e:La/kxq;

    .line 2
    .line 3
    invoke-virtual {p0}, La/agd;->g()La/piu0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final h()La/kd30;
    .locals 0

    .line 1
    iget-object p0, p0, La/jxq;->e:La/kxq;

    .line 2
    .line 3
    iget-object p0, p0, La/agd;->d:La/nw20;

    .line 4
    .line 5
    iget-object p0, p0, La/nw20;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/kd30;

    .line 8
    .line 9
    return-object p0
.end method

.method public final i(La/sbe;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/jxq;->e:La/kxq;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/agd;->i(La/sbe;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final k()La/jg60;
    .locals 0

    .line 1
    iget-object p0, p0, La/jxq;->e:La/kxq;

    .line 2
    .line 3
    invoke-virtual {p0}, La/agd;->k()La/jg60;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final x()La/glz;
    .locals 0

    .line 1
    iget-object p0, p0, La/jxq;->e:La/kxq;

    .line 2
    .line 3
    iget-object p0, p0, La/kxq;->w:La/glz;

    .line 4
    .line 5
    return-object p0
.end method
