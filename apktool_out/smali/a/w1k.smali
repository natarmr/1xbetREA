.class public final La/w1k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n5d0;


# instance fields
.field public a:La/n5d0;


# direct methods
.method public static a(La/n5d0;La/n5d0;)V
    .locals 1

    .line 1
    check-cast p0, La/w1k;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/w1k;->a:La/n5d0;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, La/w1k;->a:La/n5d0;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {}, La/v4i0;->e()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/w1k;->a:La/n5d0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-static {}, La/v4i0;->e()V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method
