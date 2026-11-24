.class public final La/ise0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/n7m0;


# instance fields
.field public final synthetic a:La/xae0;

.field public final synthetic b:La/g090;


# direct methods
.method public constructor <init>(La/xae0;La/g090;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/ise0;->b:La/g090;

    .line 5
    .line 6
    iput-object p1, p0, La/ise0;->a:La/xae0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/ise0;->a:La/xae0;

    .line 2
    .line 3
    iget-object p0, p0, La/xae0;->a:La/n7m0;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final d()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/ise0;->a:La/xae0;

    .line 2
    .line 3
    iget-object p0, p0, La/xae0;->a:La/n7m0;

    .line 4
    .line 5
    invoke-interface {p0}, La/noj0;->d()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object p0, p0, La/ise0;->b:La/g090;

    .line 2
    .line 3
    iget-object p0, p0, La/g090;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/qoj0;

    .line 6
    .line 7
    sget-object v0, La/jpj0;->c:La/jpj0;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    sget-object v0, La/jpj0;->a:La/jpj0;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/ise0;->a:La/xae0;

    .line 2
    .line 3
    iget-object p0, p0, La/xae0;->a:La/n7m0;

    .line 4
    .line 5
    invoke-interface {p0}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
