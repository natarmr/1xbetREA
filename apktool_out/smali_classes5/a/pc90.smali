.class public final La/pc90;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p7m0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, La/pc90;->a:La/p7m0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(La/cd90;)V
    .locals 9

    .line 1
    iget-object v2, p1, La/cd90;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    :cond_0
    iget-object v7, p0, La/pc90;->a:La/p7m0;

    .line 4
    .line 5
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v8

    .line 9
    move-object v0, v8

    .line 10
    check-cast v0, La/ui9;

    .line 11
    .line 12
    iget-object v1, p1, La/cd90;->c:Ljava/util/ArrayList;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget v3, p1, La/cd90;->a:I

    .line 17
    .line 18
    iget v4, p1, La/cd90;->b:I

    .line 19
    .line 20
    iget v5, v0, La/ui9;->c:I

    .line 21
    .line 22
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    iget v0, v0, La/ui9;->d:I

    .line 27
    .line 28
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    new-instance v0, La/ui9;

    .line 33
    .line 34
    invoke-direct/range {v0 .. v6}, La/ui9;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;IILjava/lang/Integer;Ljava/lang/Integer;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    new-instance v0, La/ui9;

    .line 39
    .line 40
    iget v3, p1, La/cd90;->a:I

    .line 41
    .line 42
    iget v4, p1, La/cd90;->b:I

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v6, 0x0

    .line 46
    invoke-direct/range {v0 .. v6}, La/ui9;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;IILjava/lang/Integer;Ljava/lang/Integer;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-virtual {v7, v8, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    return-void
.end method
