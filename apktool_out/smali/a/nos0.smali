.class public final La/nos0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/mos0;


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:La/q55;

.field public final c:La/eps0;


# direct methods
.method public constructor <init>(Ljava/util/Set;La/q55;La/eps0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/nos0;->a:Ljava/util/Set;

    .line 5
    .line 6
    iput-object p2, p0, La/nos0;->b:La/q55;

    .line 7
    .line 8
    iput-object p3, p0, La/nos0;->c:La/eps0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;La/gwn;La/ols0;)La/vkr0;
    .locals 9

    .line 1
    iget-object v0, p0, La/nos0;->a:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, La/vkr0;

    .line 10
    .line 11
    iget-object v7, p0, La/nos0;->c:La/eps0;

    .line 12
    .line 13
    const/4 v8, 0x2

    .line 14
    iget-object v3, p0, La/nos0;->b:La/q55;

    .line 15
    .line 16
    move-object v4, p1

    .line 17
    move-object v5, p2

    .line 18
    move-object v6, p3

    .line 19
    invoke-direct/range {v2 .. v8}, La/vkr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_0
    move-object v5, p2

    .line 24
    const-string p0, "%s is not supported byt this factory. Supported encodings are: %s."

    .line 25
    .line 26
    filled-new-array {v5, v0}, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p0, p1}, La/jf4;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method
