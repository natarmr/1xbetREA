.class public final La/gdu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mii0;


# direct methods
.method public synthetic constructor <init>(La/mii0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/gdu;->a:La/mii0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Ljava/util/List;
    .locals 6

    .line 1
    iget-object p0, p0, La/gdu;->a:La/mii0;

    .line 2
    .line 3
    iget-object p0, p0, La/mii0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/gs6;

    .line 6
    .line 7
    iget-object v0, p0, La/gs6;->b:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v2, v1

    .line 24
    check-cast v2, La/vil0;

    .line 25
    .line 26
    iget v2, v2, La/vil0;->a:I

    .line 27
    .line 28
    if-ne v2, p1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    :goto_0
    check-cast v1, La/vil0;

    .line 33
    .line 34
    if-eqz v1, :cond_4

    .line 35
    .line 36
    iget-object p0, p0, La/gs6;->a:Ljava/util/ArrayList;

    .line 37
    .line 38
    new-instance p1, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    move-object v2, v0

    .line 58
    check-cast v2, La/mms;

    .line 59
    .line 60
    iget-wide v2, v2, La/mms;->b:J

    .line 61
    .line 62
    iget-wide v4, v1, La/vil0;->b:J

    .line 63
    .line 64
    cmp-long v2, v2, v4

    .line 65
    .line 66
    if-nez v2, :cond_2

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    return-object p1

    .line 73
    :cond_4
    sget-object p0, La/iun;->a:La/iun;

    .line 74
    .line 75
    return-object p0
.end method
