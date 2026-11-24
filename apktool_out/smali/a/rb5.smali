.class public final La/rb5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ye50;

.field public final b:La/jg60;


# direct methods
.method public constructor <init>(La/ye50;La/jg60;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rb5;->a:La/ye50;

    .line 5
    .line 6
    iput-object p2, p0, La/rb5;->b:La/jg60;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    move-object p1, p2

    .line 11
    :cond_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    const-string p0, "At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null."

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0
.end method


# virtual methods
.method public final a(La/c2;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/rb5;->a:La/ye50;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p1, La/c2;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/qb5;

    .line 8
    .line 9
    invoke-static {v0, p0}, La/ye50;->a(La/ye50;La/af50;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p0, p0, La/rb5;->b:La/jg60;

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    iget-object p1, p1, La/c2;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, La/v62;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/jg60;->b(La/eg60;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    const-string p0, "Unreachable"

    .line 26
    .line 27
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final b(La/c2;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/rb5;->a:La/ye50;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p1, La/c2;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/qb5;

    .line 8
    .line 9
    invoke-virtual {p0}, La/af50;->h()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p0, p0, La/rb5;->b:La/jg60;

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    iget-object p0, p1, La/c2;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/v62;

    .line 20
    .line 21
    invoke-virtual {p0}, La/eg60;->e()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    const-string p0, "Unreachable"

    .line 26
    .line 27
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
