.class public final La/yqv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/mld;
.implements La/zkz;


# instance fields
.field public final a:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final b:La/tld;

.field public c:Z

.field public d:La/glz;

.field public e:La/ugd;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;La/tld;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/yqv0;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 5
    .line 6
    iput-object p2, p0, La/yqv0;->b:La/tld;

    .line 7
    .line 8
    sget-object p1, La/wb;->j:La/ugd;

    .line 9
    .line 10
    iput-object p1, p0, La/yqv0;->e:La/ugd;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-boolean v0, p0, La/yqv0;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, La/yqv0;->c:Z

    .line 7
    .line 8
    iget-object v0, p0, La/yqv0;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v2, 0x7f0a1462

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v1, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, La/yqv0;->d:La/glz;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1, p0}, La/glz;->f(La/blz;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iput-object v3, p0, La/yqv0;->d:La/glz;

    .line 29
    .line 30
    iget-object v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->g:La/owk;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v1, v1, La/owk;->b:La/lf2;

    .line 35
    .line 36
    invoke-virtual {v1}, La/lf2;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_1
    iput-object v3, v0, Landroidx/compose/ui/platform/AndroidComposeView;->g:La/owk;

    .line 40
    .line 41
    :cond_2
    iget-object p0, p0, La/yqv0;->b:La/tld;

    .line 42
    .line 43
    invoke-virtual {p0}, La/tld;->a()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/yqv0;->b:La/tld;

    .line 2
    .line 3
    invoke-virtual {p0}, La/tld;->c()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final d(Lkotlin/jvm/functions/Function2;)V
    .locals 2

    .line 1
    new-instance v0, La/zfv0;

    .line 2
    .line 3
    check-cast p1, La/ugd;

    .line 4
    .line 5
    const/16 v1, 0xc

    .line 6
    .line 7
    invoke-direct {v0, p0, p1, v1}, La/zfv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/yqv0;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->setOnReadyForComposition(Lkotlin/jvm/functions/Function1;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final l(La/clz;La/kkz;)V
    .locals 0

    .line 1
    sget-object p1, La/kkz;->ON_DESTROY:La/kkz;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La/yqv0;->a()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object p1, La/kkz;->ON_CREATE:La/kkz;

    .line 10
    .line 11
    if-ne p2, p1, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p0, La/yqv0;->c:Z

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, La/yqv0;->e:La/ugd;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, La/yqv0;->d(Lkotlin/jvm/functions/Function2;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method
