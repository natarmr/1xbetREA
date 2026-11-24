.class public final La/nt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mii0;


# direct methods
.method public synthetic constructor <init>(La/mii0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/nt;->a:La/mii0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 5

    .line 1
    iget-object p0, p0, La/nt;->a:La/mii0;

    .line 2
    .line 3
    iget-object p0, p0, La/mii0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/gs6;

    .line 6
    .line 7
    iget-object p0, p0, La/gs6;->a:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/mms;

    .line 26
    .line 27
    iget-object v3, v1, La/mms;->i:La/d9a0;

    .line 28
    .line 29
    iget v3, v3, La/d9a0;->f:I

    .line 30
    .line 31
    sget-object v4, La/bop0;->b:La/m6m0;

    .line 32
    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    iget-object v1, v1, La/mms;->j:La/d9a0;

    .line 36
    .line 37
    iget v1, v1, La/d9a0;->f:I

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    :cond_1
    move v0, v2

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    xor-int/lit8 p0, v0, 0x1

    .line 44
    .line 45
    return p0
.end method
