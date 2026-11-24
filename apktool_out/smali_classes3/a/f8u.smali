.class public final La/f8u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mii0;


# direct methods
.method public synthetic constructor <init>(La/mii0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/f8u;->a:La/mii0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/bop0;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    iget-byte p1, p1, La/bop0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/f8u;->a:La/mii0;

    .line 4
    .line 5
    iget-object p0, p0, La/mii0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/gs6;

    .line 8
    .line 9
    iget-object p0, p0, La/gs6;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, La/mms;

    .line 31
    .line 32
    iget-object v2, v1, La/mms;->i:La/d9a0;

    .line 33
    .line 34
    iget v3, v2, La/d9a0;->f:I

    .line 35
    .line 36
    if-ne v3, p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object v1, v1, La/mms;->j:La/d9a0;

    .line 42
    .line 43
    iget v2, v1, La/d9a0;->f:I

    .line 44
    .line 45
    if-ne v2, p1, :cond_0

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-object v0
.end method
